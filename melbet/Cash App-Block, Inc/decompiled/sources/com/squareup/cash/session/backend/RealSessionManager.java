package com.squareup.cash.session.backend;

import android.content.SharedPreferences;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.cdf.session.SessionChangeStateChanged;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SessionStatus;
import com.squareup.util.coroutines.FlowExtensionsKt$doWhile$3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSessionManager implements SessionManager {
    public final StateFlowImpl _onboardedAccountStatus;
    public final StateFlowImpl _sessionState;
    public final SharedPreferencesKeyValue activeAccountToken;
    public final Analytics analytics;
    public final SharedPreferencesKeyValue appToken;
    public final ErrorReporter errorReporter;
    public final SharedPreferencesKeyValue onboarded;
    public final StateFlowImpl onboardedAccountStatus;
    public final RealOnboardingFlowTokenManager onboardingFlowTokenManager;
    public final SharedPreferencesKeyValue session;
    public final MutexImpl sessionStateLock;
    public final SharedPreferencesKeyValue targetAccountToken;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class StateChangeReason {
        public static final /* synthetic */ StateChangeReason[] $VALUES;
        public static final StateChangeReason ACCOUNT_SWITCH_FINISHED;
        public static final StateChangeReason ACCOUNT_SWITCH_STARTED;
        public static final StateChangeReason ACTIVE_ACCOUNT_TOKEN_UPDATED;
        public static final StateChangeReason APP_TOKEN_UPDATED;
        public static final StateChangeReason DATA_DELETION;
        public static final StateChangeReason ONBOARDED_STATE_UPDATED;
        public static final StateChangeReason RESPONSE_CONTEXT;
        public static final StateChangeReason SESSION_UPDATED;

        static {
            StateChangeReason stateChangeReason = new StateChangeReason("APP_TOKEN_UPDATED", 0);
            APP_TOKEN_UPDATED = stateChangeReason;
            StateChangeReason stateChangeReason2 = new StateChangeReason("SESSION_UPDATED", 1);
            SESSION_UPDATED = stateChangeReason2;
            StateChangeReason stateChangeReason3 = new StateChangeReason("ACTIVE_ACCOUNT_TOKEN_UPDATED", 2);
            ACTIVE_ACCOUNT_TOKEN_UPDATED = stateChangeReason3;
            StateChangeReason stateChangeReason4 = new StateChangeReason("ONBOARDED_STATE_UPDATED", 3);
            ONBOARDED_STATE_UPDATED = stateChangeReason4;
            StateChangeReason stateChangeReason5 = new StateChangeReason("RESPONSE_CONTEXT", 4);
            RESPONSE_CONTEXT = stateChangeReason5;
            StateChangeReason stateChangeReason6 = new StateChangeReason("ACCOUNT_SWITCH_STARTED", 5);
            ACCOUNT_SWITCH_STARTED = stateChangeReason6;
            StateChangeReason stateChangeReason7 = new StateChangeReason("ACCOUNT_SWITCH_FINISHED", 6);
            ACCOUNT_SWITCH_FINISHED = stateChangeReason7;
            StateChangeReason stateChangeReason8 = new StateChangeReason("DATA_DELETION", 7);
            DATA_DELETION = stateChangeReason8;
            $VALUES = new StateChangeReason[]{stateChangeReason, stateChangeReason2, stateChangeReason3, stateChangeReason4, stateChangeReason5, stateChangeReason6, stateChangeReason7, stateChangeReason8};
        }

        public static StateChangeReason valueOf(String str) {
            return (StateChangeReason) Enum.valueOf(StateChangeReason.class, str);
        }

        public static StateChangeReason[] values() {
            return (StateChangeReason[]) $VALUES.clone();
        }
    }

    public interface Update {

        public final class None implements Update {
            public static final None INSTANCE = new None();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return -481774008;
            }

            public final String toString() {
                return "None";
            }
        }

        public final class Some implements Update {
            public final Object value;

            public Some(Object obj) {
                this.value = obj;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Some) && Intrinsics.areEqual(this.value, ((Some) obj).value);
            }

            public final int hashCode() {
                Object obj = this.value;
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Some(value=", ")", this.value);
            }
        }
    }

    public RealSessionManager(SharedPreferences sharedPreferences, Moshi moshi, RealOnboardingFlowTokenManager realOnboardingFlowTokenManager, ErrorReporter errorReporter, Analytics analytics) {
        this.onboardingFlowTokenManager = realOnboardingFlowTokenManager;
        this.errorReporter = errorReporter;
        this.analytics = analytics;
        SharedPreferencesKeyValue StringKeyValue = Room.StringKeyValue(sharedPreferences, "app-token", null, true);
        this.appToken = StringKeyValue;
        SharedPreferencesKeyValue sessionPref = DimensionKt.sessionPref(sharedPreferences, moshi);
        this.session = sessionPref;
        SharedPreferencesKeyValue BooleanKeyValue = Room.BooleanKeyValue(sharedPreferences, "onboarded", false, true);
        this.onboarded = BooleanKeyValue;
        SharedPreferencesKeyValue StringKeyValue2 = Room.StringKeyValue(sharedPreferences, "customer-token", null, true);
        this.activeAccountToken = StringKeyValue2;
        SharedPreferencesKeyValue StringKeyValue3 = Room.StringKeyValue(sharedPreferences, "target-account-token", null, true);
        this.targetAccountToken = StringKeyValue3;
        this.sessionStateLock = new MutexImpl();
        String str = (String) StringKeyValue.reader.read(StringKeyValue);
        Session session = (Session) sessionPref.reader.read(sessionPref);
        SharedPreferencesKeyValue.Reader reader = StringKeyValue2.reader;
        this._sessionState = FlowKt.MutableStateFlow(calculateSessionState(str, session, (String) reader.read(StringKeyValue2), (String) StringKeyValue3.reader.read(StringKeyValue3)));
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(DimensionKt.onboardedAccountStatus((String) reader.read(StringKeyValue2), ((Boolean) BooleanKeyValue.reader.read(BooleanKeyValue)).booleanValue()));
        this._onboardedAccountStatus = MutableStateFlow;
        this.onboardedAccountStatus = MutableStateFlow;
    }

    public static SessionState calculateSessionState(String str, Session session, String str2, String str3) {
        if (str == null || session == null) {
            return new NotInitiatedState(str);
        }
        String str4 = session.token;
        return (session.status != SessionStatus.FULL || str2 == null) ? new InitiatedState(str, str4) : str3 != null ? new SwitchingState(str, str4, str3) : new AuthenticatedState(str, str4, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.squareup.cash.session.backend.RealSessionManager$Update$None] */
    public static /* synthetic */ Object updateSessionState$default(RealSessionManager realSessionManager, Update.Some some, Update.Some some2, Update.Some some3, Update update, Update update2, StateChangeReason stateChangeReason, ContinuationImpl continuationImpl, int i) {
        int i2 = i & 1;
        ?? r1 = Update.None.INSTANCE;
        if (i2 != 0) {
            some = r1;
        }
        if ((i & 2) != 0) {
            some2 = r1;
        }
        if ((i & 4) != 0) {
            some3 = r1;
        }
        if ((i & 8) != 0) {
            update = r1;
        }
        if ((i & 16) != 0) {
            update2 = r1;
        }
        return realSessionManager.updateSessionState(some, some2, some3, update, update2, stateChangeReason, continuationImpl);
    }

    public static Object valueOr(Update update, Function1 function1, RealSessionManager$updateSessionState$1 realSessionManager$updateSessionState$1) {
        if (update instanceof Update.Some) {
            return ((Update.Some) update).value;
        }
        if (update instanceof Update.None) {
            return function1.invoke(realSessionManager$updateSessionState$1);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089 A[Catch: all -> 0x008f, TRY_ENTER, TryCatch #2 {all -> 0x008f, blocks: (B:30:0x00d5, B:42:0x0083, B:45:0x0089, B:46:0x0095, B:49:0x00a1, B:53:0x009b), top: B:41:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.squareup.cash.session.backend.RealSessionManager] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.squareup.cash.session.backend.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delete(SessionManager.DeletionMode deletionMode, ContinuationImpl continuationImpl) {
        RealSessionManager$delete$1 realSessionManager$delete$1;
        RealSessionManager$delete$1 realSessionManager$delete$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Update update;
        Update some;
        RealOnboardingFlowTokenManager realOnboardingFlowTokenManager;
        Update.Some some2;
        Update.Some some3;
        int i3;
        int i4;
        Update update2;
        Update.Some some4;
        Throwable th;
        Mutex mutex;
        StateChangeReason stateChangeReason;
        try {
            if (continuationImpl instanceof RealSessionManager$delete$1) {
                realSessionManager$delete$1 = (RealSessionManager$delete$1) continuationImpl;
                int i5 = realSessionManager$delete$1.label;
                if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                    realSessionManager$delete$1.label = i5 - PKIFailureInfo.systemUnavail;
                    realSessionManager$delete$12 = realSessionManager$delete$1;
                    Object obj = realSessionManager$delete$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSessionManager$delete$12.label;
                    int i6 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realSessionManager$delete$12.L$0 = deletionMode;
                        mutexImpl = this.sessionStateLock;
                        realSessionManager$delete$12.L$1 = mutexImpl;
                        realSessionManager$delete$12.I$0 = 0;
                        realSessionManager$delete$12.label = 1;
                        if (mutexImpl.lock(realSessionManager$delete$12) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realSessionManager$delete$12.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        i6 = realSessionManager$delete$12.I$1;
                        i3 = realSessionManager$delete$12.I$0;
                        Update.Some some5 = realSessionManager$delete$12.L$6;
                        Update.Some some6 = realSessionManager$delete$12.L$5;
                        Update.Some some7 = realSessionManager$delete$12.L$4;
                        Update update3 = realSessionManager$delete$12.L$3;
                        some = realSessionManager$delete$12.L$2;
                        ?? r10 = realSessionManager$delete$12.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            some4 = some5;
                            i4 = 3;
                            update2 = update3;
                            some3 = some6;
                            some2 = some7;
                            mutexImpl = r10;
                            stateChangeReason = StateChangeReason.DATA_DELETION;
                            realSessionManager$delete$12.L$0 = null;
                            realSessionManager$delete$12.L$1 = mutexImpl;
                            realSessionManager$delete$12.L$2 = null;
                            realSessionManager$delete$12.L$3 = null;
                            realSessionManager$delete$12.L$4 = null;
                            realSessionManager$delete$12.L$5 = null;
                            realSessionManager$delete$12.L$6 = null;
                            realSessionManager$delete$12.I$0 = i3;
                            realSessionManager$delete$12.I$1 = i6;
                            realSessionManager$delete$12.label = i4;
                            if (updateSessionState(some, update2, some2, some3, some4, stateChangeReason, realSessionManager$delete$12) != coroutineSingletons) {
                                mutex = mutexImpl;
                                Unit unit2 = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit2;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th3) {
                            th = th3;
                            mutex = r10;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    int i7 = realSessionManager$delete$12.I$0;
                    ?? r1 = realSessionManager$delete$12.L$1;
                    SessionManager.DeletionMode deletionMode2 = realSessionManager$delete$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutexImpl = r1;
                    i2 = i7;
                    deletionMode = deletionMode2;
                    SessionManager.DeletionMode deletionMode3 = SessionManager.DeletionMode.WIPEOUT;
                    update = Update.None.INSTANCE;
                    some = deletionMode != deletionMode3 ? new Update.Some(null) : update;
                    if (deletionMode != SessionManager.DeletionMode.ALL || deletionMode == deletionMode3) {
                        update = new Update.Some(null);
                    }
                    Update.Some some8 = new Update.Some(Boolean.FALSE);
                    Update.Some some9 = new Update.Some(null);
                    Update.Some some10 = new Update.Some(null);
                    realOnboardingFlowTokenManager = this.onboardingFlowTokenManager;
                    realSessionManager$delete$12.L$0 = null;
                    realSessionManager$delete$12.L$1 = mutexImpl;
                    realSessionManager$delete$12.L$2 = some;
                    realSessionManager$delete$12.L$3 = update;
                    realSessionManager$delete$12.L$4 = some8;
                    realSessionManager$delete$12.L$5 = some9;
                    realSessionManager$delete$12.L$6 = some10;
                    realSessionManager$delete$12.I$0 = i2;
                    realSessionManager$delete$12.I$1 = 0;
                    realSessionManager$delete$12.label = 2;
                    if (realOnboardingFlowTokenManager.delete(realSessionManager$delete$12) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    some2 = some8;
                    some3 = some9;
                    i3 = i2;
                    i4 = 3;
                    update2 = update;
                    some4 = some10;
                    stateChangeReason = StateChangeReason.DATA_DELETION;
                    realSessionManager$delete$12.L$0 = null;
                    realSessionManager$delete$12.L$1 = mutexImpl;
                    realSessionManager$delete$12.L$2 = null;
                    realSessionManager$delete$12.L$3 = null;
                    realSessionManager$delete$12.L$4 = null;
                    realSessionManager$delete$12.L$5 = null;
                    realSessionManager$delete$12.L$6 = null;
                    realSessionManager$delete$12.I$0 = i3;
                    realSessionManager$delete$12.I$1 = i6;
                    realSessionManager$delete$12.label = i4;
                    if (updateSessionState(some, update2, some2, some3, some4, stateChangeReason, realSessionManager$delete$12) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            SessionManager.DeletionMode deletionMode32 = SessionManager.DeletionMode.WIPEOUT;
            update = Update.None.INSTANCE;
            if (deletionMode != deletionMode32) {
            }
            if (deletionMode != SessionManager.DeletionMode.ALL) {
            }
            update = new Update.Some(null);
            Update.Some some82 = new Update.Some(Boolean.FALSE);
            Update.Some some92 = new Update.Some(null);
            Update.Some some102 = new Update.Some(null);
            realOnboardingFlowTokenManager = this.onboardingFlowTokenManager;
            realSessionManager$delete$12.L$0 = null;
            realSessionManager$delete$12.L$1 = mutexImpl;
            realSessionManager$delete$12.L$2 = some;
            realSessionManager$delete$12.L$3 = update;
            realSessionManager$delete$12.L$4 = some82;
            realSessionManager$delete$12.L$5 = some92;
            realSessionManager$delete$12.L$6 = some102;
            realSessionManager$delete$12.I$0 = i2;
            realSessionManager$delete$12.I$1 = 0;
            realSessionManager$delete$12.label = 2;
            if (realOnboardingFlowTokenManager.delete(realSessionManager$delete$12) != coroutineSingletons) {
            }
        } catch (Throwable th4) {
            th = th4;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realSessionManager$delete$1 = new RealSessionManager$delete$1(this, continuationImpl);
        realSessionManager$delete$12 = realSessionManager$delete$1;
        Object obj2 = realSessionManager$delete$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$delete$12.label;
        int i62 = 0;
        if (i != 0) {
        }
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final StateFlow getOnboardedAccountStatus() {
        return this.onboardedAccountStatus;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final StateFlow getSessionState() {
        return this._sessionState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ifUpdated(Update update, Function2 function2, ContinuationImpl continuationImpl) {
        RealSessionManager$ifUpdated$1 realSessionManager$ifUpdated$1;
        int i;
        if (continuationImpl instanceof RealSessionManager$ifUpdated$1) {
            realSessionManager$ifUpdated$1 = (RealSessionManager$ifUpdated$1) continuationImpl;
            int i2 = realSessionManager$ifUpdated$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSessionManager$ifUpdated$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSessionManager$ifUpdated$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSessionManager$ifUpdated$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Update.Some some = update instanceof Update.Some ? (Update.Some) update : null;
                    if (some != null) {
                        Object obj3 = some.value;
                        realSessionManager$ifUpdated$1.label = 1;
                        if (function2.invoke(obj3, realSessionManager$ifUpdated$1) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        realSessionManager$ifUpdated$1 = new RealSessionManager$ifUpdated$1(this, continuationImpl);
        Object obj4 = realSessionManager$ifUpdated$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$ifUpdated$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r13.lock(r8) == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.squareup.cash.session.backend.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateActiveAccountToken(String str, ContinuationImpl continuationImpl) {
        RealSessionManager$updateActiveAccountToken$1 realSessionManager$updateActiveAccountToken$1;
        RealSessionManager$updateActiveAccountToken$1 realSessionManager$updateActiveAccountToken$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Throwable th;
        Mutex mutex;
        Update.Some some;
        StateChangeReason stateChangeReason;
        try {
            if (continuationImpl instanceof RealSessionManager$updateActiveAccountToken$1) {
                realSessionManager$updateActiveAccountToken$1 = (RealSessionManager$updateActiveAccountToken$1) continuationImpl;
                int i3 = realSessionManager$updateActiveAccountToken$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realSessionManager$updateActiveAccountToken$1.label = i3 - PKIFailureInfo.systemUnavail;
                    realSessionManager$updateActiveAccountToken$12 = realSessionManager$updateActiveAccountToken$1;
                    Object obj = realSessionManager$updateActiveAccountToken$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSessionManager$updateActiveAccountToken$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realSessionManager$updateActiveAccountToken$12.L$0 = str;
                        mutexImpl = this.sessionStateLock;
                        realSessionManager$updateActiveAccountToken$12.L$1 = mutexImpl;
                        i2 = 0;
                        realSessionManager$updateActiveAccountToken$12.I$0 = 0;
                        realSessionManager$updateActiveAccountToken$12.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realSessionManager$updateActiveAccountToken$12.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        int i4 = realSessionManager$updateActiveAccountToken$12.I$0;
                        ?? r1 = realSessionManager$updateActiveAccountToken$12.L$1;
                        String str2 = realSessionManager$updateActiveAccountToken$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r1;
                        i2 = i4;
                        str = str2;
                    }
                    some = new Update.Some(str);
                    stateChangeReason = StateChangeReason.ACTIVE_ACCOUNT_TOKEN_UPDATED;
                    realSessionManager$updateActiveAccountToken$12.L$0 = null;
                    realSessionManager$updateActiveAccountToken$12.L$1 = mutexImpl;
                    realSessionManager$updateActiveAccountToken$12.I$0 = i2;
                    realSessionManager$updateActiveAccountToken$12.label = 2;
                    if (updateSessionState$default(this, null, null, null, some, null, stateChangeReason, realSessionManager$updateActiveAccountToken$12, 23) != coroutineSingletons) {
                        mutex = mutexImpl;
                        Unit unit2 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    return coroutineSingletons;
                }
            }
            some = new Update.Some(str);
            stateChangeReason = StateChangeReason.ACTIVE_ACCOUNT_TOKEN_UPDATED;
            realSessionManager$updateActiveAccountToken$12.L$0 = null;
            realSessionManager$updateActiveAccountToken$12.L$1 = mutexImpl;
            realSessionManager$updateActiveAccountToken$12.I$0 = i2;
            realSessionManager$updateActiveAccountToken$12.label = 2;
            if (updateSessionState$default(this, null, null, null, some, null, stateChangeReason, realSessionManager$updateActiveAccountToken$12, 23) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realSessionManager$updateActiveAccountToken$1 = new RealSessionManager$updateActiveAccountToken$1(this, continuationImpl);
        realSessionManager$updateActiveAccountToken$12 = realSessionManager$updateActiveAccountToken$1;
        Object obj2 = realSessionManager$updateActiveAccountToken$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$updateActiveAccountToken$12.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if (r13.lock(r8) == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.squareup.cash.session.backend.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateAppToken(String str, ContinuationImpl continuationImpl) {
        RealSessionManager$updateAppToken$1 realSessionManager$updateAppToken$1;
        RealSessionManager$updateAppToken$1 realSessionManager$updateAppToken$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Throwable th;
        Mutex mutex;
        Update.Some some;
        StateChangeReason stateChangeReason;
        try {
            if (continuationImpl instanceof RealSessionManager$updateAppToken$1) {
                realSessionManager$updateAppToken$1 = (RealSessionManager$updateAppToken$1) continuationImpl;
                int i3 = realSessionManager$updateAppToken$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realSessionManager$updateAppToken$1.label = i3 - PKIFailureInfo.systemUnavail;
                    realSessionManager$updateAppToken$12 = realSessionManager$updateAppToken$1;
                    Object obj = realSessionManager$updateAppToken$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSessionManager$updateAppToken$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realSessionManager$updateAppToken$12.L$0 = str;
                        mutexImpl = this.sessionStateLock;
                        realSessionManager$updateAppToken$12.L$1 = mutexImpl;
                        i2 = 0;
                        realSessionManager$updateAppToken$12.I$0 = 0;
                        realSessionManager$updateAppToken$12.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realSessionManager$updateAppToken$12.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        int i4 = realSessionManager$updateAppToken$12.I$0;
                        ?? r1 = realSessionManager$updateAppToken$12.L$1;
                        String str2 = realSessionManager$updateAppToken$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r1;
                        i2 = i4;
                        str = str2;
                    }
                    some = new Update.Some(str);
                    stateChangeReason = StateChangeReason.APP_TOKEN_UPDATED;
                    realSessionManager$updateAppToken$12.L$0 = null;
                    realSessionManager$updateAppToken$12.L$1 = mutexImpl;
                    realSessionManager$updateAppToken$12.I$0 = i2;
                    realSessionManager$updateAppToken$12.label = 2;
                    if (updateSessionState$default(this, some, null, null, null, null, stateChangeReason, realSessionManager$updateAppToken$12, 30) != coroutineSingletons) {
                        mutex = mutexImpl;
                        Unit unit2 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    return coroutineSingletons;
                }
            }
            some = new Update.Some(str);
            stateChangeReason = StateChangeReason.APP_TOKEN_UPDATED;
            realSessionManager$updateAppToken$12.L$0 = null;
            realSessionManager$updateAppToken$12.L$1 = mutexImpl;
            realSessionManager$updateAppToken$12.I$0 = i2;
            realSessionManager$updateAppToken$12.label = 2;
            if (updateSessionState$default(this, some, null, null, null, null, stateChangeReason, realSessionManager$updateAppToken$12, 30) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realSessionManager$updateAppToken$1 = new RealSessionManager$updateAppToken$1(this, continuationImpl);
        realSessionManager$updateAppToken$12 = realSessionManager$updateAppToken$1;
        Object obj2 = realSessionManager$updateAppToken$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$updateAppToken$12.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:30:0x008c, B:32:0x0090, B:34:0x009a, B:36:0x009e, B:43:0x00af, B:56:0x0076), top: B:55:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r4v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v11, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.squareup.cash.session.backend.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateOnboardedState(boolean z, ContinuationImpl continuationImpl) {
        RealSessionManager$updateOnboardedState$1 realSessionManager$updateOnboardedState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Object obj;
        boolean z2;
        int i3;
        Throwable th;
        Mutex mutex;
        SessionStatus sessionStatus;
        Update.Some some;
        StateChangeReason stateChangeReason;
        try {
            if (continuationImpl instanceof RealSessionManager$updateOnboardedState$1) {
                realSessionManager$updateOnboardedState$1 = (RealSessionManager$updateOnboardedState$1) continuationImpl;
                int i4 = realSessionManager$updateOnboardedState$1.label;
                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                    realSessionManager$updateOnboardedState$1.label = i4 - PKIFailureInfo.systemUnavail;
                    RealSessionManager$updateOnboardedState$1 realSessionManager$updateOnboardedState$12 = realSessionManager$updateOnboardedState$1;
                    Object obj2 = realSessionManager$updateOnboardedState$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSessionManager$updateOnboardedState$12.label;
                    int i5 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        mutexImpl = this.sessionStateLock;
                        realSessionManager$updateOnboardedState$12.L$0 = mutexImpl;
                        realSessionManager$updateOnboardedState$12.Z$0 = z;
                        realSessionManager$updateOnboardedState$12.I$0 = 0;
                        realSessionManager$updateOnboardedState$12.label = 1;
                        if (mutexImpl.lock(realSessionManager$updateOnboardedState$12) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realSessionManager$updateOnboardedState$12.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                Unit unit = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        i5 = realSessionManager$updateOnboardedState$12.I$1;
                        i3 = realSessionManager$updateOnboardedState$12.I$0;
                        z2 = realSessionManager$updateOnboardedState$12.Z$0;
                        ?? r4 = realSessionManager$updateOnboardedState$12.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            obj = obj2;
                            mutexImpl = r4;
                            Session session = (Session) obj;
                            sessionStatus = session == null ? session.status : null;
                            if (z2 && sessionStatus != SessionStatus.FULL) {
                                try {
                                    this.errorReporter.report(new OnboardedWithoutFullSession(sessionStatus), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                } catch (Throwable th3) {
                                    th = th3;
                                    mutex = mutexImpl;
                                    mutex.unlock(null);
                                    throw th;
                                }
                            }
                            some = new Update.Some(Boolean.valueOf(z2));
                            stateChangeReason = StateChangeReason.ONBOARDED_STATE_UPDATED;
                            realSessionManager$updateOnboardedState$12.L$0 = mutexImpl;
                            realSessionManager$updateOnboardedState$12.Z$0 = z2;
                            realSessionManager$updateOnboardedState$12.I$0 = i3;
                            realSessionManager$updateOnboardedState$12.I$1 = i5;
                            realSessionManager$updateOnboardedState$12.label = 3;
                            if (updateSessionState$default(this, null, null, some, null, null, stateChangeReason, realSessionManager$updateOnboardedState$12, 27) != coroutineSingletons) {
                                mutex = mutexImpl;
                                Unit unit2 = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit2;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th4) {
                            th = th4;
                            mutex = r4;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    int i6 = realSessionManager$updateOnboardedState$12.I$0;
                    boolean z3 = realSessionManager$updateOnboardedState$12.Z$0;
                    ?? r42 = realSessionManager$updateOnboardedState$12.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    i2 = i6;
                    z = z3;
                    mutexImpl = r42;
                    SharedPreferencesKeyValue sharedPreferencesKeyValue = this.session;
                    realSessionManager$updateOnboardedState$12.L$0 = mutexImpl;
                    realSessionManager$updateOnboardedState$12.Z$0 = z;
                    realSessionManager$updateOnboardedState$12.I$0 = i2;
                    realSessionManager$updateOnboardedState$12.I$1 = 0;
                    realSessionManager$updateOnboardedState$12.label = 2;
                    obj = sharedPreferencesKeyValue.get(realSessionManager$updateOnboardedState$12);
                    if (obj != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i7 = i2;
                    z2 = z;
                    i3 = i7;
                    Session session2 = (Session) obj;
                    if (session2 == null) {
                    }
                    if (z2) {
                        this.errorReporter.report(new OnboardedWithoutFullSession(sessionStatus), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                    some = new Update.Some(Boolean.valueOf(z2));
                    stateChangeReason = StateChangeReason.ONBOARDED_STATE_UPDATED;
                    realSessionManager$updateOnboardedState$12.L$0 = mutexImpl;
                    realSessionManager$updateOnboardedState$12.Z$0 = z2;
                    realSessionManager$updateOnboardedState$12.I$0 = i3;
                    realSessionManager$updateOnboardedState$12.I$1 = i5;
                    realSessionManager$updateOnboardedState$12.label = 3;
                    if (updateSessionState$default(this, null, null, some, null, null, stateChangeReason, realSessionManager$updateOnboardedState$12, 27) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            SharedPreferencesKeyValue sharedPreferencesKeyValue2 = this.session;
            realSessionManager$updateOnboardedState$12.L$0 = mutexImpl;
            realSessionManager$updateOnboardedState$12.Z$0 = z;
            realSessionManager$updateOnboardedState$12.I$0 = i2;
            realSessionManager$updateOnboardedState$12.I$1 = 0;
            realSessionManager$updateOnboardedState$12.label = 2;
            obj = sharedPreferencesKeyValue2.get(realSessionManager$updateOnboardedState$12);
            if (obj != coroutineSingletons) {
            }
        } catch (Throwable th5) {
            th = th5;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realSessionManager$updateOnboardedState$1 = new RealSessionManager$updateOnboardedState$1(this, continuationImpl);
        RealSessionManager$updateOnboardedState$1 realSessionManager$updateOnboardedState$122 = realSessionManager$updateOnboardedState$1;
        Object obj22 = realSessionManager$updateOnboardedState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$updateOnboardedState$122.label;
        int i52 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(4:(1:(1:(6:13|14|15|16|17|18)(2:28|29))(10:30|31|32|33|34|35|(1:37)(1:48)|38|(6:40|(1:42)|43|16|17|18)|44))(9:54|55|56|57|58|(13:60|61|(1:85)(2:65|66)|(1:70)|71|(1:73)|74|(1:76)(1:84)|(1:78)(1:83)|79|80|(7:82|34|35|(0)(0)|38|(0)|44)|46)|16|17|18)|27|23|24)(1:89))(3:95|(1:97)|46)|90|91|(2:93|46)(6:94|58|(0)|16|17|18)))|98|6|7|(0)(0)|90|91|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019f, code lost:
    
        if (updateSessionState$default(r19, null, r1, null, r8, r5, r6, r7, 5) != r9) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:35:0x014e, B:37:0x0154, B:38:0x0161, B:40:0x0169, B:44:0x0170), top: B:34:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:35:0x014e, B:37:0x0154, B:38:0x0161, B:40:0x0169, B:44:0x0170), top: B:34:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #3 {all -> 0x00f9, blocks: (B:16:0x01a2, B:58:0x00d6, B:60:0x00da, B:66:0x00f0, B:70:0x0105, B:71:0x010d, B:73:0x0111, B:78:0x011b, B:79:0x0123, B:91:0x00b7), top: B:90:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.squareup.cash.session.backend.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSession(ResponseContext responseContext, String str, Exception exc, Continuation continuation) {
        RealSessionManager$updateSession$1 realSessionManager$updateSession$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Exception exc2;
        String str2;
        Mutex mutex;
        ResponseContext responseContext2;
        int i2;
        Object obj;
        int i3;
        int i4;
        Exception exc3;
        String str3;
        ResponseContext responseContext3;
        Session session;
        Update update;
        CoroutineSingletons coroutineSingletons2;
        String str4;
        SessionStatus sessionStatus;
        Session session2;
        Mutex mutex2;
        int i5;
        String str5;
        Update update2;
        Object obj2;
        if (continuation instanceof RealSessionManager$updateSession$1) {
            realSessionManager$updateSession$1 = (RealSessionManager$updateSession$1) continuation;
            int i6 = realSessionManager$updateSession$1.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                realSessionManager$updateSession$1.label = i6 - PKIFailureInfo.systemUnavail;
                RealSessionManager$updateSession$1 realSessionManager$updateSession$12 = realSessionManager$updateSession$1;
                Object obj3 = realSessionManager$updateSession$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSessionManager$updateSession$12.label;
                Update update3 = Update.None.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    realSessionManager$updateSession$12.L$0 = responseContext;
                    realSessionManager$updateSession$12.L$1 = str;
                    exc2 = exc;
                    realSessionManager$updateSession$12.L$2 = exc2;
                    MutexImpl mutexImpl = this.sessionStateLock;
                    realSessionManager$updateSession$12.L$3 = mutexImpl;
                    realSessionManager$updateSession$12.I$0 = 0;
                    realSessionManager$updateSession$12.label = 1;
                    if (mutexImpl.lock(realSessionManager$updateSession$12) != coroutineSingletons) {
                        str2 = str;
                        mutex = mutexImpl;
                        responseContext2 = responseContext;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        int i7 = realSessionManager$updateSession$12.I$1;
                        int i8 = realSessionManager$updateSession$12.I$0;
                        Mutex mutex3 = realSessionManager$updateSession$12.L$3;
                        exc3 = realSessionManager$updateSession$12.L$2;
                        str3 = realSessionManager$updateSession$12.L$1;
                        responseContext3 = realSessionManager$updateSession$12.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            i3 = i8;
                            mutex = mutex3;
                            i4 = i7;
                            session = (Session) obj3;
                            if (session != null) {
                                SessionStatus sessionStatus2 = session.status;
                                String str6 = responseContext3.session_account_token;
                                SessionStatus sessionStatus3 = responseContext3.session_status;
                                SessionStatus sessionStatus4 = SessionStatus.FULL;
                                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                                update = update3;
                                ErrorReporter errorReporter = this.errorReporter;
                                if (sessionStatus3 == sessionStatus4 && str6 == null && sessionStatus2 != sessionStatus4) {
                                    coroutineSingletons2 = coroutineSingletons;
                                    errorReporter.report(new FullSessionWithoutAccountTokenError(exc3), defaultSamplingStrategy);
                                } else {
                                    coroutineSingletons2 = coroutineSingletons;
                                }
                                if (sessionStatus2 == sessionStatus4 && sessionStatus3 != null && sessionStatus3 != sessionStatus4) {
                                    errorReporter.report(new UnexpectedSessionStatusDowngradeError(sessionStatus3, str3, exc3), defaultSamplingStrategy);
                                }
                                String str7 = responseContext3.session_token;
                                if (str7 == null) {
                                    str7 = session.token;
                                }
                                str4 = str7;
                                sessionStatus = sessionStatus3 == null ? sessionStatus2 : sessionStatus3;
                                Update some = str6 != null ? new Update.Some(str6) : update;
                                SharedPreferencesKeyValue sharedPreferencesKeyValue = this.targetAccountToken;
                                realSessionManager$updateSession$12.L$0 = null;
                                realSessionManager$updateSession$12.L$1 = null;
                                realSessionManager$updateSession$12.L$2 = null;
                                realSessionManager$updateSession$12.L$3 = mutex;
                                realSessionManager$updateSession$12.L$4 = session;
                                realSessionManager$updateSession$12.L$6 = sessionStatus;
                                realSessionManager$updateSession$12.L$7 = str4;
                                realSessionManager$updateSession$12.L$8 = some;
                                realSessionManager$updateSession$12.L$9 = str6;
                                realSessionManager$updateSession$12.I$0 = i3;
                                realSessionManager$updateSession$12.I$1 = i4;
                                realSessionManager$updateSession$12.label = 3;
                                Object obj4 = sharedPreferencesKeyValue.get(realSessionManager$updateSession$12);
                                coroutineSingletons = coroutineSingletons2;
                                if (obj4 != coroutineSingletons) {
                                    session2 = session;
                                    mutex2 = mutex;
                                    obj3 = obj4;
                                    i5 = i4;
                                    str5 = str6;
                                    update2 = some;
                                    if (!Intrinsics.areEqual(str5, obj3)) {
                                    }
                                    if (Intrinsics.areEqual(str4, session2.token)) {
                                    }
                                    Update.Some some2 = new Update.Some(new Session(str4, sessionStatus));
                                    StateChangeReason stateChangeReason = StateChangeReason.RESPONSE_CONTEXT;
                                    realSessionManager$updateSession$12.L$0 = null;
                                    realSessionManager$updateSession$12.L$1 = null;
                                    realSessionManager$updateSession$12.L$2 = null;
                                    realSessionManager$updateSession$12.L$3 = mutex2;
                                    realSessionManager$updateSession$12.L$4 = null;
                                    realSessionManager$updateSession$12.L$6 = null;
                                    realSessionManager$updateSession$12.L$7 = null;
                                    realSessionManager$updateSession$12.L$8 = null;
                                    realSessionManager$updateSession$12.L$9 = null;
                                    realSessionManager$updateSession$12.I$0 = i3;
                                    realSessionManager$updateSession$12.I$1 = i5;
                                    realSessionManager$updateSession$12.label = 4;
                                }
                                return coroutineSingletons;
                            }
                            Unit unit = Unit.INSTANCE;
                            mutex.unlock(null);
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            mutex = mutex3;
                        }
                    } else if (i == 3) {
                        i5 = realSessionManager$updateSession$12.I$1;
                        i3 = realSessionManager$updateSession$12.I$0;
                        str5 = realSessionManager$updateSession$12.L$9;
                        update2 = realSessionManager$updateSession$12.L$8;
                        str4 = realSessionManager$updateSession$12.L$7;
                        sessionStatus = realSessionManager$updateSession$12.L$6;
                        session2 = realSessionManager$updateSession$12.L$4;
                        mutex2 = realSessionManager$updateSession$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            update = update3;
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = null;
                            mutex = mutex2;
                        }
                        try {
                            Update some3 = !Intrinsics.areEqual(str5, obj3) ? new Update.Some(null) : update;
                            if (Intrinsics.areEqual(str4, session2.token)) {
                                if (sessionStatus == session2.status) {
                                }
                                mutex = mutex2;
                                Unit unit2 = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit2;
                            }
                            Update.Some some22 = new Update.Some(new Session(str4, sessionStatus));
                            StateChangeReason stateChangeReason2 = StateChangeReason.RESPONSE_CONTEXT;
                            realSessionManager$updateSession$12.L$0 = null;
                            realSessionManager$updateSession$12.L$1 = null;
                            realSessionManager$updateSession$12.L$2 = null;
                            realSessionManager$updateSession$12.L$3 = mutex2;
                            realSessionManager$updateSession$12.L$4 = null;
                            realSessionManager$updateSession$12.L$6 = null;
                            realSessionManager$updateSession$12.L$7 = null;
                            realSessionManager$updateSession$12.L$8 = null;
                            realSessionManager$updateSession$12.L$9 = null;
                            realSessionManager$updateSession$12.I$0 = i3;
                            realSessionManager$updateSession$12.I$1 = i5;
                            realSessionManager$updateSession$12.label = 4;
                        } catch (Throwable th3) {
                            th = th3;
                            mutex = mutex2;
                            obj2 = null;
                            mutex.unlock(obj2);
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = realSessionManager$updateSession$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            Unit unit22 = Unit.INSTANCE;
                            mutex.unlock(null);
                            return unit22;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    obj2 = null;
                    mutex.unlock(obj2);
                    throw th;
                }
                int i9 = realSessionManager$updateSession$12.I$0;
                Mutex mutex4 = realSessionManager$updateSession$12.L$3;
                exc2 = realSessionManager$updateSession$12.L$2;
                str2 = realSessionManager$updateSession$12.L$1;
                responseContext2 = realSessionManager$updateSession$12.L$0;
                SafeTrace.throwOnFailure(obj3);
                i2 = i9;
                mutex = mutex4;
                SharedPreferencesKeyValue sharedPreferencesKeyValue2 = this.session;
                realSessionManager$updateSession$12.L$0 = responseContext2;
                realSessionManager$updateSession$12.L$1 = str2;
                realSessionManager$updateSession$12.L$2 = exc2;
                realSessionManager$updateSession$12.L$3 = mutex;
                realSessionManager$updateSession$12.I$0 = i2;
                realSessionManager$updateSession$12.I$1 = 0;
                realSessionManager$updateSession$12.label = 2;
                obj = sharedPreferencesKeyValue2.get(realSessionManager$updateSession$12);
                if (obj != coroutineSingletons) {
                    return coroutineSingletons;
                }
                i3 = i2;
                obj3 = obj;
                i4 = 0;
                exc3 = exc2;
                str3 = str2;
                responseContext3 = responseContext2;
                session = (Session) obj3;
                if (session != null) {
                }
                Unit unit222 = Unit.INSTANCE;
                mutex.unlock(null);
                return unit222;
            }
        }
        realSessionManager$updateSession$1 = new RealSessionManager$updateSession$1(this, (ContinuationImpl) continuation);
        RealSessionManager$updateSession$1 realSessionManager$updateSession$122 = realSessionManager$updateSession$1;
        Object obj32 = realSessionManager$updateSession$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$updateSession$122.label;
        Update update32 = Update.None.INSTANCE;
        if (i != 0) {
        }
        SharedPreferencesKeyValue sharedPreferencesKeyValue22 = this.session;
        realSessionManager$updateSession$122.L$0 = responseContext2;
        realSessionManager$updateSession$122.L$1 = str2;
        realSessionManager$updateSession$122.L$2 = exc2;
        realSessionManager$updateSession$122.L$3 = mutex;
        realSessionManager$updateSession$122.I$0 = i2;
        realSessionManager$updateSession$122.I$1 = 0;
        realSessionManager$updateSession$122.label = 2;
        obj = sharedPreferencesKeyValue22.get(realSessionManager$updateSession$122);
        if (obj != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (updateSessionState$default(r12, null, null, null, r5, r6, r7, r8, 7) == r0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:30:0x007c, B:32:0x0080, B:44:0x006b), top: B:43:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.squareup.cash.session.backend.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSessionFinishAccountSwitchCall(ContinuationImpl continuationImpl) {
        RealSessionManager$updateSessionFinishAccountSwitchCall$1 realSessionManager$updateSessionFinishAccountSwitchCall$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Object obj;
        Throwable th;
        Mutex mutex;
        String str;
        try {
            if (continuationImpl instanceof RealSessionManager$updateSessionFinishAccountSwitchCall$1) {
                realSessionManager$updateSessionFinishAccountSwitchCall$1 = (RealSessionManager$updateSessionFinishAccountSwitchCall$1) continuationImpl;
                int i3 = realSessionManager$updateSessionFinishAccountSwitchCall$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realSessionManager$updateSessionFinishAccountSwitchCall$1.label = i3 - PKIFailureInfo.systemUnavail;
                    RealSessionManager$updateSessionFinishAccountSwitchCall$1 realSessionManager$updateSessionFinishAccountSwitchCall$12 = realSessionManager$updateSessionFinishAccountSwitchCall$1;
                    Object obj2 = realSessionManager$updateSessionFinishAccountSwitchCall$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSessionManager$updateSessionFinishAccountSwitchCall$12.label;
                    int i4 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        mutexImpl = this.sessionStateLock;
                        realSessionManager$updateSessionFinishAccountSwitchCall$12.L$0 = mutexImpl;
                        realSessionManager$updateSessionFinishAccountSwitchCall$12.I$0 = 0;
                        realSessionManager$updateSessionFinishAccountSwitchCall$12.label = 1;
                        if (mutexImpl.lock(realSessionManager$updateSessionFinishAccountSwitchCall$12) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realSessionManager$updateSessionFinishAccountSwitchCall$12.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                Unit unit = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        i4 = realSessionManager$updateSessionFinishAccountSwitchCall$12.I$1;
                        i2 = realSessionManager$updateSessionFinishAccountSwitchCall$12.I$0;
                        ?? r4 = realSessionManager$updateSessionFinishAccountSwitchCall$12.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            obj = obj2;
                            mutexImpl = r4;
                            str = (String) obj;
                            if (str != null) {
                                Update.Some some = new Update.Some(str);
                                Update.Some some2 = new Update.Some(null);
                                StateChangeReason stateChangeReason = StateChangeReason.ACCOUNT_SWITCH_FINISHED;
                                realSessionManager$updateSessionFinishAccountSwitchCall$12.L$0 = mutexImpl;
                                realSessionManager$updateSessionFinishAccountSwitchCall$12.I$0 = i2;
                                realSessionManager$updateSessionFinishAccountSwitchCall$12.I$1 = i4;
                                realSessionManager$updateSessionFinishAccountSwitchCall$12.label = 3;
                            }
                            mutex = mutexImpl;
                            Unit unit2 = Unit.INSTANCE;
                            mutex.unlock(null);
                            return unit2;
                        } catch (Throwable th3) {
                            th = th3;
                            mutex = r4;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    i2 = realSessionManager$updateSessionFinishAccountSwitchCall$12.I$0;
                    ?? r5 = realSessionManager$updateSessionFinishAccountSwitchCall$12.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    mutexImpl = r5;
                    SharedPreferencesKeyValue sharedPreferencesKeyValue = this.targetAccountToken;
                    realSessionManager$updateSessionFinishAccountSwitchCall$12.L$0 = mutexImpl;
                    realSessionManager$updateSessionFinishAccountSwitchCall$12.I$0 = i2;
                    realSessionManager$updateSessionFinishAccountSwitchCall$12.I$1 = 0;
                    realSessionManager$updateSessionFinishAccountSwitchCall$12.label = 2;
                    obj = sharedPreferencesKeyValue.get(realSessionManager$updateSessionFinishAccountSwitchCall$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = (String) obj;
                    if (str != null) {
                    }
                    mutex = mutexImpl;
                    Unit unit22 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit22;
                }
            }
            SharedPreferencesKeyValue sharedPreferencesKeyValue2 = this.targetAccountToken;
            realSessionManager$updateSessionFinishAccountSwitchCall$12.L$0 = mutexImpl;
            realSessionManager$updateSessionFinishAccountSwitchCall$12.I$0 = i2;
            realSessionManager$updateSessionFinishAccountSwitchCall$12.I$1 = 0;
            realSessionManager$updateSessionFinishAccountSwitchCall$12.label = 2;
            obj = sharedPreferencesKeyValue2.get(realSessionManager$updateSessionFinishAccountSwitchCall$12);
            if (obj == coroutineSingletons) {
            }
            str = (String) obj;
            if (str != null) {
            }
            mutex = mutexImpl;
            Unit unit222 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit222;
        } catch (Throwable th4) {
            MutexImpl mutexImpl2 = mutexImpl;
            th = th4;
            mutex = mutexImpl2;
            mutex.unlock(null);
            throw th;
        }
        realSessionManager$updateSessionFinishAccountSwitchCall$1 = new RealSessionManager$updateSessionFinishAccountSwitchCall$1(this, continuationImpl);
        RealSessionManager$updateSessionFinishAccountSwitchCall$1 realSessionManager$updateSessionFinishAccountSwitchCall$122 = realSessionManager$updateSessionFinishAccountSwitchCall$1;
        Object obj22 = realSessionManager$updateSessionFinishAccountSwitchCall$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$updateSessionFinishAccountSwitchCall$122.label;
        int i42 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r13.lock(r8) == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.squareup.cash.session.backend.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSessionForAccountSwitchOnboarding(String str, ContinuationImpl continuationImpl) {
        RealSessionManager$updateSessionForAccountSwitchOnboarding$1 realSessionManager$updateSessionForAccountSwitchOnboarding$1;
        RealSessionManager$updateSessionForAccountSwitchOnboarding$1 realSessionManager$updateSessionForAccountSwitchOnboarding$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Throwable th;
        Mutex mutex;
        Update.Some some;
        Update.Some some2;
        StateChangeReason stateChangeReason;
        try {
            if (continuationImpl instanceof RealSessionManager$updateSessionForAccountSwitchOnboarding$1) {
                realSessionManager$updateSessionForAccountSwitchOnboarding$1 = (RealSessionManager$updateSessionForAccountSwitchOnboarding$1) continuationImpl;
                int i3 = realSessionManager$updateSessionForAccountSwitchOnboarding$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realSessionManager$updateSessionForAccountSwitchOnboarding$1.label = i3 - PKIFailureInfo.systemUnavail;
                    realSessionManager$updateSessionForAccountSwitchOnboarding$12 = realSessionManager$updateSessionForAccountSwitchOnboarding$1;
                    Object obj = realSessionManager$updateSessionForAccountSwitchOnboarding$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSessionManager$updateSessionForAccountSwitchOnboarding$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$0 = str;
                        mutexImpl = this.sessionStateLock;
                        realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$1 = mutexImpl;
                        i2 = 0;
                        realSessionManager$updateSessionForAccountSwitchOnboarding$12.I$0 = 0;
                        realSessionManager$updateSessionForAccountSwitchOnboarding$12.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        int i4 = realSessionManager$updateSessionForAccountSwitchOnboarding$12.I$0;
                        ?? r1 = realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$1;
                        String str2 = realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r1;
                        i2 = i4;
                        str = str2;
                    }
                    some = new Update.Some(Boolean.FALSE);
                    some2 = new Update.Some(str);
                    stateChangeReason = StateChangeReason.ACCOUNT_SWITCH_STARTED;
                    realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$0 = null;
                    realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$1 = mutexImpl;
                    realSessionManager$updateSessionForAccountSwitchOnboarding$12.I$0 = i2;
                    realSessionManager$updateSessionForAccountSwitchOnboarding$12.label = 2;
                    if (updateSessionState$default(this, null, null, some, null, some2, stateChangeReason, realSessionManager$updateSessionForAccountSwitchOnboarding$12, 11) != coroutineSingletons) {
                        mutex = mutexImpl;
                        Unit unit2 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    return coroutineSingletons;
                }
            }
            some = new Update.Some(Boolean.FALSE);
            some2 = new Update.Some(str);
            stateChangeReason = StateChangeReason.ACCOUNT_SWITCH_STARTED;
            realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$0 = null;
            realSessionManager$updateSessionForAccountSwitchOnboarding$12.L$1 = mutexImpl;
            realSessionManager$updateSessionForAccountSwitchOnboarding$12.I$0 = i2;
            realSessionManager$updateSessionForAccountSwitchOnboarding$12.label = 2;
            if (updateSessionState$default(this, null, null, some, null, some2, stateChangeReason, realSessionManager$updateSessionForAccountSwitchOnboarding$12, 11) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realSessionManager$updateSessionForAccountSwitchOnboarding$1 = new RealSessionManager$updateSessionForAccountSwitchOnboarding$1(this, continuationImpl);
        realSessionManager$updateSessionForAccountSwitchOnboarding$12 = realSessionManager$updateSessionForAccountSwitchOnboarding$1;
        Object obj2 = realSessionManager$updateSessionForAccountSwitchOnboarding$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$updateSessionForAccountSwitchOnboarding$12.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSessionState(Update update, Update update2, Update update3, Update update4, Update update5, StateChangeReason stateChangeReason, ContinuationImpl continuationImpl) {
        RealSessionManager$updateSessionState$1 realSessionManager$updateSessionState$1;
        int i;
        Update update6;
        Update update7;
        SessionState sessionState;
        Object obj;
        Update update8;
        StateChangeReason stateChangeReason2;
        Update update9;
        Update update10;
        Object obj2;
        String str;
        Object obj3;
        Update update11;
        Update update12;
        Update update13;
        Update update14;
        StateChangeReason stateChangeReason3;
        Object obj4;
        Session session;
        Object obj5;
        Update update15;
        Update update16;
        StateChangeReason stateChangeReason4;
        String str2;
        Update update17;
        SessionState sessionState2;
        Update update18;
        Object obj6;
        String str3;
        Object obj7;
        Update update19;
        Update update20;
        Update update21;
        Update update22;
        Update update23;
        SessionState sessionState3;
        String str4;
        Session session2;
        StateFlowImpl stateFlowImpl;
        Object valueOr;
        Object obj8;
        StateChangeReason stateChangeReason5;
        SessionState sessionState4;
        String str5;
        Session session3;
        String str6;
        String str7;
        Update update24;
        Update update25;
        Update update26;
        Update update27;
        Update update28;
        Object valueOr2;
        CoroutineSingletons coroutineSingletons;
        StateChangeReason stateChangeReason6;
        String str8;
        Object obj9;
        Update update29;
        Update update30;
        Update update31;
        Update update32;
        Object valueOr3;
        CoroutineSingletons coroutineSingletons2;
        Session session4;
        Object obj10;
        StateChangeReason stateChangeReason7;
        String str9;
        String str10;
        String str11;
        Update update33;
        Update update34;
        Update update35;
        SessionState sessionState5;
        Session session5;
        String str12;
        Session session6;
        boolean z;
        Object valueOr4;
        StateChangeReason stateChangeReason8;
        Object obj11;
        Update update36;
        Update update37;
        CoroutineSingletons coroutineSingletons3;
        Object valueOr5;
        boolean z2;
        Object obj12;
        String str13;
        String str14;
        String str15;
        String str16;
        CoroutineSingletons coroutineSingletons4;
        SessionState sessionState6;
        String str17;
        Session session7;
        Session session8;
        Update update38;
        Update update39;
        SessionState calculateSessionState;
        RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$2;
        RealSessionManager realSessionManager;
        String str18;
        CoroutineSingletons coroutineSingletons5;
        boolean z3;
        OnboardedAccountStatus onboardedAccountStatus;
        CoroutineSingletons coroutineSingletons6;
        String str19;
        String str20;
        Update update40;
        Update update41;
        Session session9;
        String str21;
        SessionState sessionState7;
        String str22;
        Session session10;
        String str23;
        Object ifUpdated;
        CoroutineSingletons coroutineSingletons7;
        SessionState sessionState8;
        String str24;
        String str25;
        Update update42;
        Update update43;
        CoroutineSingletons coroutineSingletons8;
        String str26;
        Session session11;
        String str27;
        SessionState sessionState9;
        String str28;
        SessionState sessionState10;
        Object ifUpdated2;
        CoroutineSingletons coroutineSingletons9;
        CoroutineSingletons coroutineSingletons10;
        Update update44;
        Session session12;
        String str29;
        Update update45;
        OnboardedAccountStatus onboardedAccountStatus2;
        String str30;
        Update update46;
        Object ifUpdated3;
        CoroutineSingletons coroutineSingletons11;
        SessionState sessionState11;
        OnboardedAccountStatus onboardedAccountStatus3;
        String str31;
        String str32;
        Session session13;
        Session session14;
        String str33;
        String str34;
        CoroutineSingletons coroutineSingletons12;
        SessionState sessionState12;
        boolean z4;
        String str35;
        Object ifUpdated4;
        CoroutineSingletons coroutineSingletons13;
        OnboardedAccountStatus onboardedAccountStatus4;
        String str36;
        StateChangeReason stateChangeReason9;
        String str37;
        String str38;
        String str39;
        StateFlowImpl stateFlowImpl2;
        SessionState sessionState13;
        String str40;
        Session session15;
        String str41;
        SessionStatus sessionStatus;
        SessionStatus sessionStatus2;
        if (continuationImpl instanceof RealSessionManager$updateSessionState$1) {
            realSessionManager$updateSessionState$1 = (RealSessionManager$updateSessionState$1) continuationImpl;
            int i2 = realSessionManager$updateSessionState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSessionManager$updateSessionState$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj13 = realSessionManager$updateSessionState$1.result;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSessionManager$updateSessionState$1.label;
                StateFlowImpl stateFlowImpl3 = this._sessionState;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj13);
                        if (!this.sessionStateLock.isLocked()) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                        SessionState sessionState14 = (SessionState) stateFlowImpl3.getValue();
                        realSessionManager$updateSessionState$1.L$0 = update;
                        realSessionManager$updateSessionState$1.L$1 = update2;
                        update6 = update3;
                        realSessionManager$updateSessionState$1.L$2 = update6;
                        update7 = update4;
                        realSessionManager$updateSessionState$1.L$3 = update7;
                        realSessionManager$updateSessionState$1.L$4 = update5;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason;
                        realSessionManager$updateSessionState$1.L$6 = sessionState14;
                        realSessionManager$updateSessionState$1.label = 1;
                        Object obj14 = this.appToken.get(realSessionManager$updateSessionState$1);
                        if (obj14 != coroutineSingletons14) {
                            sessionState = sessionState14;
                            obj = obj14;
                            update8 = update;
                            stateChangeReason2 = stateChangeReason;
                            update9 = update2;
                            update10 = update5;
                            String str42 = (String) obj;
                            realSessionManager$updateSessionState$1.L$0 = update8;
                            realSessionManager$updateSessionState$1.L$1 = update9;
                            realSessionManager$updateSessionState$1.L$2 = update6;
                            realSessionManager$updateSessionState$1.L$3 = update7;
                            realSessionManager$updateSessionState$1.L$4 = update10;
                            realSessionManager$updateSessionState$1.L$5 = stateChangeReason2;
                            realSessionManager$updateSessionState$1.L$6 = sessionState;
                            realSessionManager$updateSessionState$1.L$7 = str42;
                            realSessionManager$updateSessionState$1.label = 2;
                            obj2 = this.session.get(realSessionManager$updateSessionState$1);
                            if (obj2 != coroutineSingletons14) {
                                StateChangeReason stateChangeReason10 = stateChangeReason2;
                                str = str42;
                                obj3 = obj2;
                                update11 = update8;
                                update12 = update9;
                                update13 = update6;
                                update14 = update10;
                                stateChangeReason3 = stateChangeReason10;
                                Session session16 = (Session) obj3;
                                realSessionManager$updateSessionState$1.L$0 = update11;
                                realSessionManager$updateSessionState$1.L$1 = update12;
                                realSessionManager$updateSessionState$1.L$2 = update13;
                                realSessionManager$updateSessionState$1.L$3 = update7;
                                realSessionManager$updateSessionState$1.L$4 = update14;
                                realSessionManager$updateSessionState$1.L$5 = stateChangeReason3;
                                realSessionManager$updateSessionState$1.L$6 = sessionState;
                                realSessionManager$updateSessionState$1.L$7 = str;
                                realSessionManager$updateSessionState$1.L$8 = session16;
                                realSessionManager$updateSessionState$1.label = 3;
                                obj4 = this.activeAccountToken.get(realSessionManager$updateSessionState$1);
                                if (obj4 != coroutineSingletons14) {
                                    String str43 = str;
                                    session = session16;
                                    obj5 = obj4;
                                    update15 = update12;
                                    update16 = update13;
                                    stateChangeReason4 = stateChangeReason3;
                                    str2 = str43;
                                    Update update47 = update7;
                                    update17 = update14;
                                    sessionState2 = sessionState;
                                    update18 = update47;
                                    String str44 = (String) obj5;
                                    realSessionManager$updateSessionState$1.L$0 = update11;
                                    realSessionManager$updateSessionState$1.L$1 = update15;
                                    realSessionManager$updateSessionState$1.L$2 = update16;
                                    realSessionManager$updateSessionState$1.L$3 = update18;
                                    realSessionManager$updateSessionState$1.L$4 = update17;
                                    realSessionManager$updateSessionState$1.L$5 = stateChangeReason4;
                                    realSessionManager$updateSessionState$1.L$6 = sessionState2;
                                    realSessionManager$updateSessionState$1.L$7 = str2;
                                    realSessionManager$updateSessionState$1.L$8 = session;
                                    realSessionManager$updateSessionState$1.L$9 = str44;
                                    realSessionManager$updateSessionState$1.label = 4;
                                    obj6 = this.targetAccountToken.get(realSessionManager$updateSessionState$1);
                                    if (obj6 != coroutineSingletons14) {
                                        Session session17 = session;
                                        str3 = str44;
                                        obj7 = obj6;
                                        update19 = update11;
                                        update20 = update15;
                                        update21 = update16;
                                        update22 = update18;
                                        update23 = update17;
                                        sessionState3 = sessionState2;
                                        str4 = str2;
                                        session2 = session17;
                                        String str45 = (String) obj7;
                                        stateFlowImpl = stateFlowImpl3;
                                        RealSessionManager$updateSessionState$newAppToken$1 realSessionManager$updateSessionState$newAppToken$1 = new RealSessionManager$updateSessionState$newAppToken$1(str4, null, 0);
                                        realSessionManager$updateSessionState$1.L$0 = update19;
                                        realSessionManager$updateSessionState$1.L$1 = update20;
                                        realSessionManager$updateSessionState$1.L$2 = update21;
                                        realSessionManager$updateSessionState$1.L$3 = update22;
                                        realSessionManager$updateSessionState$1.L$4 = update23;
                                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason4;
                                        realSessionManager$updateSessionState$1.L$6 = sessionState3;
                                        realSessionManager$updateSessionState$1.L$7 = str4;
                                        realSessionManager$updateSessionState$1.L$8 = session2;
                                        realSessionManager$updateSessionState$1.L$9 = str3;
                                        realSessionManager$updateSessionState$1.L$10 = str45;
                                        realSessionManager$updateSessionState$1.label = 5;
                                        valueOr = valueOr(update19, realSessionManager$updateSessionState$newAppToken$1, realSessionManager$updateSessionState$1);
                                        if (valueOr != coroutineSingletons14) {
                                            obj8 = valueOr;
                                            stateChangeReason5 = stateChangeReason4;
                                            sessionState4 = sessionState3;
                                            str5 = str4;
                                            session3 = session2;
                                            str6 = str3;
                                            str7 = str45;
                                            Update update48 = update23;
                                            update24 = update22;
                                            update25 = update48;
                                            update26 = update19;
                                            update27 = update20;
                                            update28 = update21;
                                            String str46 = (String) obj8;
                                            RealSessionManager$updateSessionState$newSession$1 realSessionManager$updateSessionState$newSession$1 = new RealSessionManager$updateSessionState$newSession$1(session3, null, 0);
                                            realSessionManager$updateSessionState$1.L$0 = update26;
                                            realSessionManager$updateSessionState$1.L$1 = update27;
                                            realSessionManager$updateSessionState$1.L$2 = update28;
                                            realSessionManager$updateSessionState$1.L$3 = update24;
                                            realSessionManager$updateSessionState$1.L$4 = update25;
                                            realSessionManager$updateSessionState$1.L$5 = stateChangeReason5;
                                            realSessionManager$updateSessionState$1.L$6 = sessionState4;
                                            realSessionManager$updateSessionState$1.L$7 = str5;
                                            realSessionManager$updateSessionState$1.L$8 = session3;
                                            realSessionManager$updateSessionState$1.L$9 = str6;
                                            realSessionManager$updateSessionState$1.L$10 = str7;
                                            realSessionManager$updateSessionState$1.L$11 = str46;
                                            realSessionManager$updateSessionState$1.label = 6;
                                            valueOr2 = valueOr(update27, realSessionManager$updateSessionState$newSession$1, realSessionManager$updateSessionState$1);
                                            coroutineSingletons = coroutineSingletons14;
                                            if (valueOr2 != coroutineSingletons) {
                                                Update update49 = update25;
                                                stateChangeReason6 = stateChangeReason5;
                                                str8 = str46;
                                                obj9 = valueOr2;
                                                update29 = update27;
                                                update30 = update28;
                                                update31 = update24;
                                                update32 = update49;
                                                Session session18 = (Session) obj9;
                                                String str47 = str8;
                                                RealSessionManager$updateSessionState$newOnboarded$1 realSessionManager$updateSessionState$newOnboarded$1 = new RealSessionManager$updateSessionState$newOnboarded$1(this, null, 0);
                                                realSessionManager$updateSessionState$1.L$0 = update26;
                                                realSessionManager$updateSessionState$1.L$1 = update29;
                                                realSessionManager$updateSessionState$1.L$2 = update30;
                                                realSessionManager$updateSessionState$1.L$3 = update31;
                                                realSessionManager$updateSessionState$1.L$4 = update32;
                                                realSessionManager$updateSessionState$1.L$5 = stateChangeReason6;
                                                realSessionManager$updateSessionState$1.L$6 = sessionState4;
                                                realSessionManager$updateSessionState$1.L$7 = str5;
                                                realSessionManager$updateSessionState$1.L$8 = session3;
                                                realSessionManager$updateSessionState$1.L$9 = str6;
                                                realSessionManager$updateSessionState$1.L$10 = str7;
                                                realSessionManager$updateSessionState$1.L$11 = str47;
                                                realSessionManager$updateSessionState$1.L$12 = session18;
                                                realSessionManager$updateSessionState$1.label = 7;
                                                valueOr3 = valueOr(update30, realSessionManager$updateSessionState$newOnboarded$1, realSessionManager$updateSessionState$1);
                                                coroutineSingletons2 = coroutineSingletons;
                                                if (valueOr3 != coroutineSingletons2) {
                                                    String str48 = str7;
                                                    session4 = session18;
                                                    obj10 = valueOr3;
                                                    stateChangeReason7 = stateChangeReason6;
                                                    str9 = str5;
                                                    str10 = str6;
                                                    str11 = str47;
                                                    update33 = update30;
                                                    update34 = update31;
                                                    update35 = update32;
                                                    sessionState5 = sessionState4;
                                                    session5 = session3;
                                                    str12 = str48;
                                                    boolean booleanValue = ((Boolean) obj10).booleanValue();
                                                    CoroutineSingletons coroutineSingletons15 = coroutineSingletons2;
                                                    RealSessionManager$updateSessionState$newAppToken$1 realSessionManager$updateSessionState$newAppToken$12 = new RealSessionManager$updateSessionState$newAppToken$1(str10, null, 1);
                                                    realSessionManager$updateSessionState$1.L$0 = update26;
                                                    realSessionManager$updateSessionState$1.L$1 = update29;
                                                    realSessionManager$updateSessionState$1.L$2 = update33;
                                                    realSessionManager$updateSessionState$1.L$3 = update34;
                                                    realSessionManager$updateSessionState$1.L$4 = update35;
                                                    realSessionManager$updateSessionState$1.L$5 = stateChangeReason7;
                                                    realSessionManager$updateSessionState$1.L$6 = sessionState5;
                                                    realSessionManager$updateSessionState$1.L$7 = str9;
                                                    realSessionManager$updateSessionState$1.L$8 = session5;
                                                    realSessionManager$updateSessionState$1.L$9 = str10;
                                                    realSessionManager$updateSessionState$1.L$10 = str12;
                                                    realSessionManager$updateSessionState$1.L$11 = str11;
                                                    session6 = session4;
                                                    realSessionManager$updateSessionState$1.L$12 = session6;
                                                    z = booleanValue;
                                                    realSessionManager$updateSessionState$1.Z$0 = z;
                                                    StateChangeReason stateChangeReason11 = stateChangeReason7;
                                                    realSessionManager$updateSessionState$1.label = 8;
                                                    valueOr4 = valueOr(update34, realSessionManager$updateSessionState$newAppToken$12, realSessionManager$updateSessionState$1);
                                                    coroutineSingletons2 = coroutineSingletons15;
                                                    if (valueOr4 != coroutineSingletons2) {
                                                        Update update50 = update35;
                                                        stateChangeReason8 = stateChangeReason11;
                                                        obj11 = valueOr4;
                                                        update36 = update33;
                                                        update37 = update50;
                                                        coroutineSingletons3 = coroutineSingletons2;
                                                        String str49 = (String) obj11;
                                                        boolean z5 = z;
                                                        Session session19 = session6;
                                                        RealSessionManager$updateSessionState$newAppToken$1 realSessionManager$updateSessionState$newAppToken$13 = new RealSessionManager$updateSessionState$newAppToken$1(str12, null, 2);
                                                        realSessionManager$updateSessionState$1.L$0 = update26;
                                                        realSessionManager$updateSessionState$1.L$1 = update29;
                                                        realSessionManager$updateSessionState$1.L$2 = update36;
                                                        realSessionManager$updateSessionState$1.L$3 = update34;
                                                        realSessionManager$updateSessionState$1.L$4 = update37;
                                                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                                                        realSessionManager$updateSessionState$1.L$6 = sessionState5;
                                                        realSessionManager$updateSessionState$1.L$7 = str9;
                                                        realSessionManager$updateSessionState$1.L$8 = session5;
                                                        realSessionManager$updateSessionState$1.L$9 = str10;
                                                        realSessionManager$updateSessionState$1.L$10 = str12;
                                                        realSessionManager$updateSessionState$1.L$11 = str11;
                                                        realSessionManager$updateSessionState$1.L$12 = session19;
                                                        realSessionManager$updateSessionState$1.L$13 = str49;
                                                        Update update51 = update36;
                                                        realSessionManager$updateSessionState$1.Z$0 = z5;
                                                        realSessionManager$updateSessionState$1.label = 9;
                                                        valueOr5 = valueOr(update37, realSessionManager$updateSessionState$newAppToken$13, realSessionManager$updateSessionState$1);
                                                        coroutineSingletons = coroutineSingletons3;
                                                        if (valueOr5 != coroutineSingletons) {
                                                            z2 = z5;
                                                            obj12 = valueOr5;
                                                            String str50 = str9;
                                                            str13 = str11;
                                                            str14 = str10;
                                                            str15 = str49;
                                                            str16 = str50;
                                                            coroutineSingletons4 = coroutineSingletons;
                                                            sessionState6 = sessionState5;
                                                            str17 = str12;
                                                            session7 = session5;
                                                            session8 = session19;
                                                            update38 = update51;
                                                            update39 = update26;
                                                            String str51 = (String) obj12;
                                                            String str52 = str17;
                                                            calculateSessionState = calculateSessionState(str13, session8, str15, str51);
                                                            OnboardedAccountStatus onboardedAccountStatus5 = DimensionKt.onboardedAccountStatus(str15, z2);
                                                            boolean z6 = z2;
                                                            realSessionManager = this;
                                                            realSessionManager$updateSessionState$2 = new RealSessionManager$updateSessionState$2(realSessionManager, null, 0);
                                                            realSessionManager$updateSessionState$1.L$0 = null;
                                                            realSessionManager$updateSessionState$1.L$1 = update29;
                                                            realSessionManager$updateSessionState$1.L$2 = update38;
                                                            realSessionManager$updateSessionState$1.L$3 = update34;
                                                            realSessionManager$updateSessionState$1.L$4 = update37;
                                                            realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                                                            realSessionManager$updateSessionState$1.L$6 = sessionState6;
                                                            realSessionManager$updateSessionState$1.L$7 = str16;
                                                            realSessionManager$updateSessionState$1.L$8 = session7;
                                                            realSessionManager$updateSessionState$1.L$9 = str14;
                                                            realSessionManager$updateSessionState$1.L$10 = str52;
                                                            realSessionManager$updateSessionState$1.L$11 = str13;
                                                            realSessionManager$updateSessionState$1.L$12 = session8;
                                                            str18 = str15;
                                                            realSessionManager$updateSessionState$1.L$13 = str18;
                                                            Update update52 = update37;
                                                            realSessionManager$updateSessionState$1.L$14 = str51;
                                                            realSessionManager$updateSessionState$1.L$15 = calculateSessionState;
                                                            realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus5;
                                                            realSessionManager$updateSessionState$1.Z$0 = z6;
                                                            realSessionManager$updateSessionState$1.label = 10;
                                                            coroutineSingletons5 = coroutineSingletons4;
                                                            if (realSessionManager.ifUpdated(update39, realSessionManager$updateSessionState$2, realSessionManager$updateSessionState$1) != coroutineSingletons5) {
                                                                return coroutineSingletons5;
                                                            }
                                                            z3 = z6;
                                                            onboardedAccountStatus = onboardedAccountStatus5;
                                                            coroutineSingletons6 = coroutineSingletons5;
                                                            str19 = str14;
                                                            str20 = str16;
                                                            update40 = update52;
                                                            update41 = update29;
                                                            session9 = session7;
                                                            str21 = str52;
                                                            sessionState7 = sessionState6;
                                                            str22 = str13;
                                                            session10 = session8;
                                                            str23 = str51;
                                                            String str53 = str23;
                                                            String str54 = str18;
                                                            RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$22 = new RealSessionManager$updateSessionState$2(realSessionManager, null, 1);
                                                            realSessionManager$updateSessionState$1.L$0 = null;
                                                            realSessionManager$updateSessionState$1.L$1 = null;
                                                            realSessionManager$updateSessionState$1.L$2 = update38;
                                                            realSessionManager$updateSessionState$1.L$3 = update34;
                                                            realSessionManager$updateSessionState$1.L$4 = update40;
                                                            realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                                                            realSessionManager$updateSessionState$1.L$6 = sessionState7;
                                                            realSessionManager$updateSessionState$1.L$7 = str20;
                                                            realSessionManager$updateSessionState$1.L$8 = session9;
                                                            realSessionManager$updateSessionState$1.L$9 = str19;
                                                            realSessionManager$updateSessionState$1.L$10 = str21;
                                                            realSessionManager$updateSessionState$1.L$11 = str22;
                                                            realSessionManager$updateSessionState$1.L$12 = session10;
                                                            realSessionManager$updateSessionState$1.L$13 = str54;
                                                            realSessionManager$updateSessionState$1.L$14 = str53;
                                                            Update update53 = update40;
                                                            realSessionManager$updateSessionState$1.L$15 = calculateSessionState;
                                                            realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus;
                                                            realSessionManager$updateSessionState$1.Z$0 = z3;
                                                            realSessionManager$updateSessionState$1.label = 11;
                                                            ifUpdated = realSessionManager.ifUpdated(update41, realSessionManager$updateSessionState$22, realSessionManager$updateSessionState$1);
                                                            coroutineSingletons7 = coroutineSingletons6;
                                                            if (ifUpdated != coroutineSingletons7) {
                                                                return coroutineSingletons7;
                                                            }
                                                            sessionState8 = sessionState7;
                                                            str24 = str53;
                                                            str25 = str54;
                                                            update42 = update53;
                                                            update43 = update38;
                                                            coroutineSingletons8 = coroutineSingletons7;
                                                            str26 = str19;
                                                            session11 = session9;
                                                            str27 = str20;
                                                            sessionState9 = calculateSessionState;
                                                            FlowExtensionsKt$doWhile$3 flowExtensionsKt$doWhile$3 = new FlowExtensionsKt$doWhile$3(realSessionManager, null, 1);
                                                            realSessionManager$updateSessionState$1.L$0 = null;
                                                            realSessionManager$updateSessionState$1.L$1 = null;
                                                            realSessionManager$updateSessionState$1.L$2 = null;
                                                            realSessionManager$updateSessionState$1.L$3 = update34;
                                                            realSessionManager$updateSessionState$1.L$4 = update42;
                                                            realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                                                            realSessionManager$updateSessionState$1.L$6 = sessionState8;
                                                            realSessionManager$updateSessionState$1.L$7 = str27;
                                                            realSessionManager$updateSessionState$1.L$8 = session11;
                                                            realSessionManager$updateSessionState$1.L$9 = str26;
                                                            realSessionManager$updateSessionState$1.L$10 = str21;
                                                            realSessionManager$updateSessionState$1.L$11 = str22;
                                                            realSessionManager$updateSessionState$1.L$12 = session10;
                                                            realSessionManager$updateSessionState$1.L$13 = str25;
                                                            str28 = str24;
                                                            realSessionManager$updateSessionState$1.L$14 = str28;
                                                            sessionState10 = sessionState9;
                                                            realSessionManager$updateSessionState$1.L$15 = sessionState10;
                                                            Update update54 = update42;
                                                            realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus;
                                                            realSessionManager$updateSessionState$1.Z$0 = z3;
                                                            realSessionManager$updateSessionState$1.label = 12;
                                                            ifUpdated2 = realSessionManager.ifUpdated(update43, flowExtensionsKt$doWhile$3, realSessionManager$updateSessionState$1);
                                                            coroutineSingletons9 = coroutineSingletons8;
                                                            if (ifUpdated2 != coroutineSingletons9) {
                                                                return coroutineSingletons9;
                                                            }
                                                            coroutineSingletons10 = coroutineSingletons9;
                                                            update44 = update54;
                                                            session12 = session11;
                                                            str29 = str27;
                                                            update45 = update34;
                                                            onboardedAccountStatus2 = onboardedAccountStatus;
                                                            str30 = str26;
                                                            boolean z7 = z3;
                                                            String str55 = str28;
                                                            SessionState sessionState15 = sessionState10;
                                                            OnboardedAccountStatus onboardedAccountStatus6 = onboardedAccountStatus2;
                                                            RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$23 = new RealSessionManager$updateSessionState$2(realSessionManager, null, 2);
                                                            realSessionManager$updateSessionState$1.L$0 = null;
                                                            realSessionManager$updateSessionState$1.L$1 = null;
                                                            realSessionManager$updateSessionState$1.L$2 = null;
                                                            realSessionManager$updateSessionState$1.L$3 = null;
                                                            realSessionManager$updateSessionState$1.L$4 = update44;
                                                            realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                                                            realSessionManager$updateSessionState$1.L$6 = sessionState8;
                                                            realSessionManager$updateSessionState$1.L$7 = str29;
                                                            realSessionManager$updateSessionState$1.L$8 = session12;
                                                            realSessionManager$updateSessionState$1.L$9 = str30;
                                                            realSessionManager$updateSessionState$1.L$10 = str21;
                                                            realSessionManager$updateSessionState$1.L$11 = str22;
                                                            realSessionManager$updateSessionState$1.L$12 = session10;
                                                            realSessionManager$updateSessionState$1.L$13 = str25;
                                                            realSessionManager$updateSessionState$1.L$14 = str55;
                                                            realSessionManager$updateSessionState$1.L$15 = sessionState15;
                                                            realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus6;
                                                            update46 = update44;
                                                            realSessionManager$updateSessionState$1.Z$0 = z7;
                                                            realSessionManager$updateSessionState$1.label = 13;
                                                            ifUpdated3 = realSessionManager.ifUpdated(update45, realSessionManager$updateSessionState$23, realSessionManager$updateSessionState$1);
                                                            coroutineSingletons11 = coroutineSingletons10;
                                                            if (ifUpdated3 != coroutineSingletons11) {
                                                                return coroutineSingletons11;
                                                            }
                                                            Session session20 = session12;
                                                            sessionState11 = sessionState15;
                                                            onboardedAccountStatus3 = onboardedAccountStatus6;
                                                            str31 = str25;
                                                            str32 = str55;
                                                            session13 = session10;
                                                            session14 = session20;
                                                            String str56 = str21;
                                                            str33 = str30;
                                                            str34 = str56;
                                                            coroutineSingletons12 = coroutineSingletons11;
                                                            sessionState12 = sessionState8;
                                                            z4 = z7;
                                                            str35 = str29;
                                                            OnboardedAccountStatus onboardedAccountStatus7 = onboardedAccountStatus3;
                                                            RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$24 = new RealSessionManager$updateSessionState$2(realSessionManager, null, 3);
                                                            realSessionManager$updateSessionState$1.L$0 = null;
                                                            realSessionManager$updateSessionState$1.L$1 = null;
                                                            realSessionManager$updateSessionState$1.L$2 = null;
                                                            realSessionManager$updateSessionState$1.L$3 = null;
                                                            realSessionManager$updateSessionState$1.L$4 = null;
                                                            realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                                                            realSessionManager$updateSessionState$1.L$6 = sessionState12;
                                                            realSessionManager$updateSessionState$1.L$7 = str35;
                                                            realSessionManager$updateSessionState$1.L$8 = session14;
                                                            realSessionManager$updateSessionState$1.L$9 = str33;
                                                            realSessionManager$updateSessionState$1.L$10 = str34;
                                                            realSessionManager$updateSessionState$1.L$11 = str22;
                                                            realSessionManager$updateSessionState$1.L$12 = session13;
                                                            realSessionManager$updateSessionState$1.L$13 = str31;
                                                            realSessionManager$updateSessionState$1.L$14 = str32;
                                                            realSessionManager$updateSessionState$1.L$15 = sessionState11;
                                                            realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus7;
                                                            realSessionManager$updateSessionState$1.Z$0 = z4;
                                                            realSessionManager$updateSessionState$1.label = 14;
                                                            ifUpdated4 = realSessionManager.ifUpdated(update46, realSessionManager$updateSessionState$24, realSessionManager$updateSessionState$1);
                                                            coroutineSingletons13 = coroutineSingletons12;
                                                            if (ifUpdated4 != coroutineSingletons13) {
                                                                return coroutineSingletons13;
                                                            }
                                                            onboardedAccountStatus4 = onboardedAccountStatus7;
                                                            str36 = str32;
                                                            stateChangeReason9 = stateChangeReason8;
                                                            str37 = str22;
                                                            str38 = str34;
                                                            str39 = str33;
                                                            stateFlowImpl2 = stateFlowImpl;
                                                            sessionState13 = sessionState12;
                                                            str40 = str35;
                                                            session15 = session14;
                                                            str41 = str31;
                                                            stateFlowImpl2.setValue(sessionState11);
                                                            realSessionManager._onboardedAccountStatus.setValue(onboardedAccountStatus4);
                                                            if (!Intrinsics.areEqual(sessionState11, sessionState13) && !DimensionKt.isStableSignIn(sessionState13, sessionState11)) {
                                                                realSessionManager.analytics.track(new SessionChangeStateChanged(DimensionKt.toCdfSessionState(sessionState13), DimensionKt.toCdfSessionState(sessionState11), DimensionKt.toCdfSessionAttributeChange(str40, str37), DimensionKt.toCdfSessionAttributeChange(session15 == null ? session15.token : null, session13 == null ? session13.token : null), (session15 != null || (sessionStatus2 = session15.status) == null) ? null : DimensionKt.toCdfSessionTokenStatus(sessionStatus2), (session13 != null || (sessionStatus = session13.status) == null) ? null : DimensionKt.toCdfSessionTokenStatus(sessionStatus), str39, str41, str38, str36, stateChangeReason9.toString()), null);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                }
                                                return coroutineSingletons2;
                                            }
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons14;
                    case 1:
                        SessionState sessionState16 = realSessionManager$updateSessionState$1.L$6;
                        stateChangeReason2 = realSessionManager$updateSessionState$1.L$5;
                        update10 = realSessionManager$updateSessionState$1.L$4;
                        Update update55 = realSessionManager$updateSessionState$1.L$3;
                        Update update56 = realSessionManager$updateSessionState$1.L$2;
                        update9 = realSessionManager$updateSessionState$1.L$1;
                        update8 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        update7 = update55;
                        update6 = update56;
                        sessionState = sessionState16;
                        obj = obj13;
                        String str422 = (String) obj;
                        realSessionManager$updateSessionState$1.L$0 = update8;
                        realSessionManager$updateSessionState$1.L$1 = update9;
                        realSessionManager$updateSessionState$1.L$2 = update6;
                        realSessionManager$updateSessionState$1.L$3 = update7;
                        realSessionManager$updateSessionState$1.L$4 = update10;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason2;
                        realSessionManager$updateSessionState$1.L$6 = sessionState;
                        realSessionManager$updateSessionState$1.L$7 = str422;
                        realSessionManager$updateSessionState$1.label = 2;
                        obj2 = this.session.get(realSessionManager$updateSessionState$1);
                        if (obj2 != coroutineSingletons14) {
                        }
                        return coroutineSingletons14;
                    case 2:
                        String str57 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState17 = realSessionManager$updateSessionState$1.L$6;
                        stateChangeReason3 = realSessionManager$updateSessionState$1.L$5;
                        update14 = realSessionManager$updateSessionState$1.L$4;
                        update7 = realSessionManager$updateSessionState$1.L$3;
                        update13 = realSessionManager$updateSessionState$1.L$2;
                        update12 = realSessionManager$updateSessionState$1.L$1;
                        Update update57 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        update11 = update57;
                        sessionState = sessionState17;
                        str = str57;
                        obj3 = obj13;
                        Session session162 = (Session) obj3;
                        realSessionManager$updateSessionState$1.L$0 = update11;
                        realSessionManager$updateSessionState$1.L$1 = update12;
                        realSessionManager$updateSessionState$1.L$2 = update13;
                        realSessionManager$updateSessionState$1.L$3 = update7;
                        realSessionManager$updateSessionState$1.L$4 = update14;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason3;
                        realSessionManager$updateSessionState$1.L$6 = sessionState;
                        realSessionManager$updateSessionState$1.L$7 = str;
                        realSessionManager$updateSessionState$1.L$8 = session162;
                        realSessionManager$updateSessionState$1.label = 3;
                        obj4 = this.activeAccountToken.get(realSessionManager$updateSessionState$1);
                        if (obj4 != coroutineSingletons14) {
                        }
                        return coroutineSingletons14;
                    case 3:
                        Session session21 = realSessionManager$updateSessionState$1.L$8;
                        String str58 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState18 = realSessionManager$updateSessionState$1.L$6;
                        StateChangeReason stateChangeReason12 = realSessionManager$updateSessionState$1.L$5;
                        update17 = realSessionManager$updateSessionState$1.L$4;
                        Update update58 = realSessionManager$updateSessionState$1.L$3;
                        update16 = realSessionManager$updateSessionState$1.L$2;
                        Update update59 = realSessionManager$updateSessionState$1.L$1;
                        update11 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        update15 = update59;
                        update18 = update58;
                        stateChangeReason4 = stateChangeReason12;
                        sessionState2 = sessionState18;
                        str2 = str58;
                        session = session21;
                        obj5 = obj13;
                        String str442 = (String) obj5;
                        realSessionManager$updateSessionState$1.L$0 = update11;
                        realSessionManager$updateSessionState$1.L$1 = update15;
                        realSessionManager$updateSessionState$1.L$2 = update16;
                        realSessionManager$updateSessionState$1.L$3 = update18;
                        realSessionManager$updateSessionState$1.L$4 = update17;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason4;
                        realSessionManager$updateSessionState$1.L$6 = sessionState2;
                        realSessionManager$updateSessionState$1.L$7 = str2;
                        realSessionManager$updateSessionState$1.L$8 = session;
                        realSessionManager$updateSessionState$1.L$9 = str442;
                        realSessionManager$updateSessionState$1.label = 4;
                        obj6 = this.targetAccountToken.get(realSessionManager$updateSessionState$1);
                        if (obj6 != coroutineSingletons14) {
                        }
                        return coroutineSingletons14;
                    case 4:
                        String str59 = realSessionManager$updateSessionState$1.L$9;
                        Session session22 = realSessionManager$updateSessionState$1.L$8;
                        String str60 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState19 = realSessionManager$updateSessionState$1.L$6;
                        StateChangeReason stateChangeReason13 = realSessionManager$updateSessionState$1.L$5;
                        Update update60 = realSessionManager$updateSessionState$1.L$4;
                        update22 = realSessionManager$updateSessionState$1.L$3;
                        Update update61 = realSessionManager$updateSessionState$1.L$2;
                        update20 = realSessionManager$updateSessionState$1.L$1;
                        Update update62 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        update19 = update62;
                        update21 = update61;
                        update23 = update60;
                        stateChangeReason4 = stateChangeReason13;
                        sessionState3 = sessionState19;
                        str4 = str60;
                        session2 = session22;
                        str3 = str59;
                        obj7 = obj13;
                        String str452 = (String) obj7;
                        stateFlowImpl = stateFlowImpl3;
                        RealSessionManager$updateSessionState$newAppToken$1 realSessionManager$updateSessionState$newAppToken$14 = new RealSessionManager$updateSessionState$newAppToken$1(str4, null, 0);
                        realSessionManager$updateSessionState$1.L$0 = update19;
                        realSessionManager$updateSessionState$1.L$1 = update20;
                        realSessionManager$updateSessionState$1.L$2 = update21;
                        realSessionManager$updateSessionState$1.L$3 = update22;
                        realSessionManager$updateSessionState$1.L$4 = update23;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason4;
                        realSessionManager$updateSessionState$1.L$6 = sessionState3;
                        realSessionManager$updateSessionState$1.L$7 = str4;
                        realSessionManager$updateSessionState$1.L$8 = session2;
                        realSessionManager$updateSessionState$1.L$9 = str3;
                        realSessionManager$updateSessionState$1.L$10 = str452;
                        realSessionManager$updateSessionState$1.label = 5;
                        valueOr = valueOr(update19, realSessionManager$updateSessionState$newAppToken$14, realSessionManager$updateSessionState$1);
                        if (valueOr != coroutineSingletons14) {
                        }
                        return coroutineSingletons14;
                    case 5:
                        String str61 = realSessionManager$updateSessionState$1.L$10;
                        String str62 = realSessionManager$updateSessionState$1.L$9;
                        Session session23 = realSessionManager$updateSessionState$1.L$8;
                        String str63 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState20 = realSessionManager$updateSessionState$1.L$6;
                        StateChangeReason stateChangeReason14 = realSessionManager$updateSessionState$1.L$5;
                        update25 = realSessionManager$updateSessionState$1.L$4;
                        update24 = realSessionManager$updateSessionState$1.L$3;
                        update28 = realSessionManager$updateSessionState$1.L$2;
                        Update update63 = realSessionManager$updateSessionState$1.L$1;
                        Update update64 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        stateChangeReason5 = stateChangeReason14;
                        sessionState4 = sessionState20;
                        str5 = str63;
                        session3 = session23;
                        str6 = str62;
                        str7 = str61;
                        obj8 = obj13;
                        stateFlowImpl = stateFlowImpl3;
                        update26 = update64;
                        update27 = update63;
                        String str462 = (String) obj8;
                        RealSessionManager$updateSessionState$newSession$1 realSessionManager$updateSessionState$newSession$12 = new RealSessionManager$updateSessionState$newSession$1(session3, null, 0);
                        realSessionManager$updateSessionState$1.L$0 = update26;
                        realSessionManager$updateSessionState$1.L$1 = update27;
                        realSessionManager$updateSessionState$1.L$2 = update28;
                        realSessionManager$updateSessionState$1.L$3 = update24;
                        realSessionManager$updateSessionState$1.L$4 = update25;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason5;
                        realSessionManager$updateSessionState$1.L$6 = sessionState4;
                        realSessionManager$updateSessionState$1.L$7 = str5;
                        realSessionManager$updateSessionState$1.L$8 = session3;
                        realSessionManager$updateSessionState$1.L$9 = str6;
                        realSessionManager$updateSessionState$1.L$10 = str7;
                        realSessionManager$updateSessionState$1.L$11 = str462;
                        realSessionManager$updateSessionState$1.label = 6;
                        valueOr2 = valueOr(update27, realSessionManager$updateSessionState$newSession$12, realSessionManager$updateSessionState$1);
                        coroutineSingletons = coroutineSingletons14;
                        if (valueOr2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 6:
                        String str64 = realSessionManager$updateSessionState$1.L$11;
                        str7 = realSessionManager$updateSessionState$1.L$10;
                        str6 = realSessionManager$updateSessionState$1.L$9;
                        session3 = realSessionManager$updateSessionState$1.L$8;
                        str5 = realSessionManager$updateSessionState$1.L$7;
                        sessionState4 = realSessionManager$updateSessionState$1.L$6;
                        stateChangeReason6 = realSessionManager$updateSessionState$1.L$5;
                        update32 = realSessionManager$updateSessionState$1.L$4;
                        update31 = realSessionManager$updateSessionState$1.L$3;
                        Update update65 = realSessionManager$updateSessionState$1.L$2;
                        Update update66 = realSessionManager$updateSessionState$1.L$1;
                        Update update67 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        coroutineSingletons = coroutineSingletons14;
                        update29 = update66;
                        update30 = update65;
                        str8 = str64;
                        obj9 = obj13;
                        stateFlowImpl = stateFlowImpl3;
                        update26 = update67;
                        Session session182 = (Session) obj9;
                        String str472 = str8;
                        RealSessionManager$updateSessionState$newOnboarded$1 realSessionManager$updateSessionState$newOnboarded$12 = new RealSessionManager$updateSessionState$newOnboarded$1(this, null, 0);
                        realSessionManager$updateSessionState$1.L$0 = update26;
                        realSessionManager$updateSessionState$1.L$1 = update29;
                        realSessionManager$updateSessionState$1.L$2 = update30;
                        realSessionManager$updateSessionState$1.L$3 = update31;
                        realSessionManager$updateSessionState$1.L$4 = update32;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason6;
                        realSessionManager$updateSessionState$1.L$6 = sessionState4;
                        realSessionManager$updateSessionState$1.L$7 = str5;
                        realSessionManager$updateSessionState$1.L$8 = session3;
                        realSessionManager$updateSessionState$1.L$9 = str6;
                        realSessionManager$updateSessionState$1.L$10 = str7;
                        realSessionManager$updateSessionState$1.L$11 = str472;
                        realSessionManager$updateSessionState$1.L$12 = session182;
                        realSessionManager$updateSessionState$1.label = 7;
                        valueOr3 = valueOr(update30, realSessionManager$updateSessionState$newOnboarded$12, realSessionManager$updateSessionState$1);
                        coroutineSingletons2 = coroutineSingletons;
                        if (valueOr3 != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    case 7:
                        Session session24 = realSessionManager$updateSessionState$1.L$12;
                        String str65 = realSessionManager$updateSessionState$1.L$11;
                        String str66 = realSessionManager$updateSessionState$1.L$10;
                        String str67 = realSessionManager$updateSessionState$1.L$9;
                        Session session25 = realSessionManager$updateSessionState$1.L$8;
                        String str68 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState21 = realSessionManager$updateSessionState$1.L$6;
                        StateChangeReason stateChangeReason15 = realSessionManager$updateSessionState$1.L$5;
                        update35 = realSessionManager$updateSessionState$1.L$4;
                        Update update68 = realSessionManager$updateSessionState$1.L$3;
                        Update update69 = realSessionManager$updateSessionState$1.L$2;
                        Update update70 = realSessionManager$updateSessionState$1.L$1;
                        Update update71 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        session4 = session24;
                        obj10 = obj13;
                        stateFlowImpl = stateFlowImpl3;
                        update26 = update71;
                        update33 = update69;
                        update34 = update68;
                        stateChangeReason7 = stateChangeReason15;
                        sessionState5 = sessionState21;
                        str9 = str68;
                        session5 = session25;
                        str10 = str67;
                        str12 = str66;
                        str11 = str65;
                        coroutineSingletons2 = coroutineSingletons14;
                        update29 = update70;
                        boolean booleanValue2 = ((Boolean) obj10).booleanValue();
                        CoroutineSingletons coroutineSingletons152 = coroutineSingletons2;
                        RealSessionManager$updateSessionState$newAppToken$1 realSessionManager$updateSessionState$newAppToken$122 = new RealSessionManager$updateSessionState$newAppToken$1(str10, null, 1);
                        realSessionManager$updateSessionState$1.L$0 = update26;
                        realSessionManager$updateSessionState$1.L$1 = update29;
                        realSessionManager$updateSessionState$1.L$2 = update33;
                        realSessionManager$updateSessionState$1.L$3 = update34;
                        realSessionManager$updateSessionState$1.L$4 = update35;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason7;
                        realSessionManager$updateSessionState$1.L$6 = sessionState5;
                        realSessionManager$updateSessionState$1.L$7 = str9;
                        realSessionManager$updateSessionState$1.L$8 = session5;
                        realSessionManager$updateSessionState$1.L$9 = str10;
                        realSessionManager$updateSessionState$1.L$10 = str12;
                        realSessionManager$updateSessionState$1.L$11 = str11;
                        session6 = session4;
                        realSessionManager$updateSessionState$1.L$12 = session6;
                        z = booleanValue2;
                        realSessionManager$updateSessionState$1.Z$0 = z;
                        StateChangeReason stateChangeReason112 = stateChangeReason7;
                        realSessionManager$updateSessionState$1.label = 8;
                        valueOr4 = valueOr(update34, realSessionManager$updateSessionState$newAppToken$122, realSessionManager$updateSessionState$1);
                        coroutineSingletons2 = coroutineSingletons152;
                        if (valueOr4 != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    case 8:
                        boolean z8 = realSessionManager$updateSessionState$1.Z$0;
                        session6 = realSessionManager$updateSessionState$1.L$12;
                        str11 = realSessionManager$updateSessionState$1.L$11;
                        str12 = realSessionManager$updateSessionState$1.L$10;
                        str10 = realSessionManager$updateSessionState$1.L$9;
                        session5 = realSessionManager$updateSessionState$1.L$8;
                        str9 = realSessionManager$updateSessionState$1.L$7;
                        sessionState5 = realSessionManager$updateSessionState$1.L$6;
                        stateChangeReason8 = realSessionManager$updateSessionState$1.L$5;
                        Update update72 = realSessionManager$updateSessionState$1.L$4;
                        update34 = realSessionManager$updateSessionState$1.L$3;
                        Update update73 = realSessionManager$updateSessionState$1.L$2;
                        Update update74 = realSessionManager$updateSessionState$1.L$1;
                        Update update75 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        z = z8;
                        obj11 = obj13;
                        stateFlowImpl = stateFlowImpl3;
                        update26 = update75;
                        update37 = update72;
                        coroutineSingletons3 = coroutineSingletons14;
                        update36 = update73;
                        update29 = update74;
                        String str492 = (String) obj11;
                        boolean z52 = z;
                        Session session192 = session6;
                        RealSessionManager$updateSessionState$newAppToken$1 realSessionManager$updateSessionState$newAppToken$132 = new RealSessionManager$updateSessionState$newAppToken$1(str12, null, 2);
                        realSessionManager$updateSessionState$1.L$0 = update26;
                        realSessionManager$updateSessionState$1.L$1 = update29;
                        realSessionManager$updateSessionState$1.L$2 = update36;
                        realSessionManager$updateSessionState$1.L$3 = update34;
                        realSessionManager$updateSessionState$1.L$4 = update37;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                        realSessionManager$updateSessionState$1.L$6 = sessionState5;
                        realSessionManager$updateSessionState$1.L$7 = str9;
                        realSessionManager$updateSessionState$1.L$8 = session5;
                        realSessionManager$updateSessionState$1.L$9 = str10;
                        realSessionManager$updateSessionState$1.L$10 = str12;
                        realSessionManager$updateSessionState$1.L$11 = str11;
                        realSessionManager$updateSessionState$1.L$12 = session192;
                        realSessionManager$updateSessionState$1.L$13 = str492;
                        Update update512 = update36;
                        realSessionManager$updateSessionState$1.Z$0 = z52;
                        realSessionManager$updateSessionState$1.label = 9;
                        valueOr5 = valueOr(update37, realSessionManager$updateSessionState$newAppToken$132, realSessionManager$updateSessionState$1);
                        coroutineSingletons = coroutineSingletons3;
                        if (valueOr5 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 9:
                        boolean z9 = realSessionManager$updateSessionState$1.Z$0;
                        String str69 = realSessionManager$updateSessionState$1.L$13;
                        Session session26 = realSessionManager$updateSessionState$1.L$12;
                        String str70 = realSessionManager$updateSessionState$1.L$11;
                        String str71 = realSessionManager$updateSessionState$1.L$10;
                        String str72 = realSessionManager$updateSessionState$1.L$9;
                        Session session27 = realSessionManager$updateSessionState$1.L$8;
                        String str73 = realSessionManager$updateSessionState$1.L$7;
                        sessionState6 = realSessionManager$updateSessionState$1.L$6;
                        StateChangeReason stateChangeReason16 = realSessionManager$updateSessionState$1.L$5;
                        Update update76 = realSessionManager$updateSessionState$1.L$4;
                        Update update77 = realSessionManager$updateSessionState$1.L$3;
                        Update update78 = realSessionManager$updateSessionState$1.L$2;
                        Update update79 = realSessionManager$updateSessionState$1.L$1;
                        Update update80 = realSessionManager$updateSessionState$1.L$0;
                        SafeTrace.throwOnFailure(obj13);
                        update38 = update78;
                        update39 = update80;
                        update37 = update76;
                        str16 = str73;
                        stateChangeReason8 = stateChangeReason16;
                        update34 = update77;
                        session7 = session27;
                        str17 = str71;
                        session8 = session26;
                        str14 = str72;
                        str13 = str70;
                        str15 = str69;
                        z2 = z9;
                        coroutineSingletons4 = coroutineSingletons14;
                        obj12 = obj13;
                        update29 = update79;
                        stateFlowImpl = stateFlowImpl3;
                        String str512 = (String) obj12;
                        String str522 = str17;
                        calculateSessionState = calculateSessionState(str13, session8, str15, str512);
                        OnboardedAccountStatus onboardedAccountStatus52 = DimensionKt.onboardedAccountStatus(str15, z2);
                        boolean z62 = z2;
                        realSessionManager = this;
                        realSessionManager$updateSessionState$2 = new RealSessionManager$updateSessionState$2(realSessionManager, null, 0);
                        realSessionManager$updateSessionState$1.L$0 = null;
                        realSessionManager$updateSessionState$1.L$1 = update29;
                        realSessionManager$updateSessionState$1.L$2 = update38;
                        realSessionManager$updateSessionState$1.L$3 = update34;
                        realSessionManager$updateSessionState$1.L$4 = update37;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                        realSessionManager$updateSessionState$1.L$6 = sessionState6;
                        realSessionManager$updateSessionState$1.L$7 = str16;
                        realSessionManager$updateSessionState$1.L$8 = session7;
                        realSessionManager$updateSessionState$1.L$9 = str14;
                        realSessionManager$updateSessionState$1.L$10 = str522;
                        realSessionManager$updateSessionState$1.L$11 = str13;
                        realSessionManager$updateSessionState$1.L$12 = session8;
                        str18 = str15;
                        realSessionManager$updateSessionState$1.L$13 = str18;
                        Update update522 = update37;
                        realSessionManager$updateSessionState$1.L$14 = str512;
                        realSessionManager$updateSessionState$1.L$15 = calculateSessionState;
                        realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus52;
                        realSessionManager$updateSessionState$1.Z$0 = z62;
                        realSessionManager$updateSessionState$1.label = 10;
                        coroutineSingletons5 = coroutineSingletons4;
                        if (realSessionManager.ifUpdated(update39, realSessionManager$updateSessionState$2, realSessionManager$updateSessionState$1) != coroutineSingletons5) {
                        }
                        break;
                    case 10:
                        boolean z10 = realSessionManager$updateSessionState$1.Z$0;
                        OnboardedAccountStatus onboardedAccountStatus8 = realSessionManager$updateSessionState$1.L$16;
                        SessionState sessionState22 = realSessionManager$updateSessionState$1.L$15;
                        String str74 = realSessionManager$updateSessionState$1.L$14;
                        String str75 = realSessionManager$updateSessionState$1.L$13;
                        Session session28 = realSessionManager$updateSessionState$1.L$12;
                        String str76 = realSessionManager$updateSessionState$1.L$11;
                        String str77 = realSessionManager$updateSessionState$1.L$10;
                        String str78 = realSessionManager$updateSessionState$1.L$9;
                        Session session29 = realSessionManager$updateSessionState$1.L$8;
                        String str79 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState23 = realSessionManager$updateSessionState$1.L$6;
                        z3 = z10;
                        StateChangeReason stateChangeReason17 = realSessionManager$updateSessionState$1.L$5;
                        Update update81 = realSessionManager$updateSessionState$1.L$4;
                        Update update82 = realSessionManager$updateSessionState$1.L$3;
                        Update update83 = realSessionManager$updateSessionState$1.L$2;
                        Update update84 = realSessionManager$updateSessionState$1.L$1;
                        SafeTrace.throwOnFailure(obj13);
                        update41 = update84;
                        coroutineSingletons6 = coroutineSingletons14;
                        stateFlowImpl = stateFlowImpl3;
                        str19 = str78;
                        session9 = session29;
                        stateChangeReason8 = stateChangeReason17;
                        onboardedAccountStatus = onboardedAccountStatus8;
                        str18 = str75;
                        str22 = str76;
                        update38 = update83;
                        session10 = session28;
                        str23 = str74;
                        sessionState7 = sessionState23;
                        str21 = str77;
                        realSessionManager = this;
                        update40 = update81;
                        calculateSessionState = sessionState22;
                        str20 = str79;
                        update34 = update82;
                        String str532 = str23;
                        String str542 = str18;
                        RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$222 = new RealSessionManager$updateSessionState$2(realSessionManager, null, 1);
                        realSessionManager$updateSessionState$1.L$0 = null;
                        realSessionManager$updateSessionState$1.L$1 = null;
                        realSessionManager$updateSessionState$1.L$2 = update38;
                        realSessionManager$updateSessionState$1.L$3 = update34;
                        realSessionManager$updateSessionState$1.L$4 = update40;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                        realSessionManager$updateSessionState$1.L$6 = sessionState7;
                        realSessionManager$updateSessionState$1.L$7 = str20;
                        realSessionManager$updateSessionState$1.L$8 = session9;
                        realSessionManager$updateSessionState$1.L$9 = str19;
                        realSessionManager$updateSessionState$1.L$10 = str21;
                        realSessionManager$updateSessionState$1.L$11 = str22;
                        realSessionManager$updateSessionState$1.L$12 = session10;
                        realSessionManager$updateSessionState$1.L$13 = str542;
                        realSessionManager$updateSessionState$1.L$14 = str532;
                        Update update532 = update40;
                        realSessionManager$updateSessionState$1.L$15 = calculateSessionState;
                        realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus;
                        realSessionManager$updateSessionState$1.Z$0 = z3;
                        realSessionManager$updateSessionState$1.label = 11;
                        ifUpdated = realSessionManager.ifUpdated(update41, realSessionManager$updateSessionState$222, realSessionManager$updateSessionState$1);
                        coroutineSingletons7 = coroutineSingletons6;
                        if (ifUpdated != coroutineSingletons7) {
                        }
                        break;
                    case 11:
                        boolean z11 = realSessionManager$updateSessionState$1.Z$0;
                        OnboardedAccountStatus onboardedAccountStatus9 = realSessionManager$updateSessionState$1.L$16;
                        sessionState9 = realSessionManager$updateSessionState$1.L$15;
                        str24 = realSessionManager$updateSessionState$1.L$14;
                        str25 = realSessionManager$updateSessionState$1.L$13;
                        session10 = realSessionManager$updateSessionState$1.L$12;
                        String str80 = realSessionManager$updateSessionState$1.L$11;
                        String str81 = realSessionManager$updateSessionState$1.L$10;
                        String str82 = realSessionManager$updateSessionState$1.L$9;
                        Session session30 = realSessionManager$updateSessionState$1.L$8;
                        String str83 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState24 = realSessionManager$updateSessionState$1.L$6;
                        z3 = z11;
                        StateChangeReason stateChangeReason18 = realSessionManager$updateSessionState$1.L$5;
                        Update update85 = realSessionManager$updateSessionState$1.L$4;
                        Update update86 = realSessionManager$updateSessionState$1.L$3;
                        Update update87 = realSessionManager$updateSessionState$1.L$2;
                        SafeTrace.throwOnFailure(obj13);
                        update43 = update87;
                        coroutineSingletons8 = coroutineSingletons14;
                        stateFlowImpl = stateFlowImpl3;
                        session11 = session30;
                        str27 = str83;
                        update34 = update86;
                        sessionState8 = sessionState24;
                        str21 = str81;
                        str26 = str82;
                        stateChangeReason8 = stateChangeReason18;
                        onboardedAccountStatus = onboardedAccountStatus9;
                        str22 = str80;
                        realSessionManager = this;
                        update42 = update85;
                        FlowExtensionsKt$doWhile$3 flowExtensionsKt$doWhile$32 = new FlowExtensionsKt$doWhile$3(realSessionManager, null, 1);
                        realSessionManager$updateSessionState$1.L$0 = null;
                        realSessionManager$updateSessionState$1.L$1 = null;
                        realSessionManager$updateSessionState$1.L$2 = null;
                        realSessionManager$updateSessionState$1.L$3 = update34;
                        realSessionManager$updateSessionState$1.L$4 = update42;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                        realSessionManager$updateSessionState$1.L$6 = sessionState8;
                        realSessionManager$updateSessionState$1.L$7 = str27;
                        realSessionManager$updateSessionState$1.L$8 = session11;
                        realSessionManager$updateSessionState$1.L$9 = str26;
                        realSessionManager$updateSessionState$1.L$10 = str21;
                        realSessionManager$updateSessionState$1.L$11 = str22;
                        realSessionManager$updateSessionState$1.L$12 = session10;
                        realSessionManager$updateSessionState$1.L$13 = str25;
                        str28 = str24;
                        realSessionManager$updateSessionState$1.L$14 = str28;
                        sessionState10 = sessionState9;
                        realSessionManager$updateSessionState$1.L$15 = sessionState10;
                        Update update542 = update42;
                        realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus;
                        realSessionManager$updateSessionState$1.Z$0 = z3;
                        realSessionManager$updateSessionState$1.label = 12;
                        ifUpdated2 = realSessionManager.ifUpdated(update43, flowExtensionsKt$doWhile$32, realSessionManager$updateSessionState$1);
                        coroutineSingletons9 = coroutineSingletons8;
                        if (ifUpdated2 != coroutineSingletons9) {
                        }
                        break;
                    case 12:
                        boolean z12 = realSessionManager$updateSessionState$1.Z$0;
                        OnboardedAccountStatus onboardedAccountStatus10 = realSessionManager$updateSessionState$1.L$16;
                        sessionState10 = realSessionManager$updateSessionState$1.L$15;
                        str28 = realSessionManager$updateSessionState$1.L$14;
                        String str84 = realSessionManager$updateSessionState$1.L$13;
                        session10 = realSessionManager$updateSessionState$1.L$12;
                        String str85 = realSessionManager$updateSessionState$1.L$11;
                        String str86 = realSessionManager$updateSessionState$1.L$10;
                        String str87 = realSessionManager$updateSessionState$1.L$9;
                        Session session31 = realSessionManager$updateSessionState$1.L$8;
                        String str88 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState25 = realSessionManager$updateSessionState$1.L$6;
                        z3 = z12;
                        StateChangeReason stateChangeReason19 = realSessionManager$updateSessionState$1.L$5;
                        Update update88 = realSessionManager$updateSessionState$1.L$4;
                        Update update89 = realSessionManager$updateSessionState$1.L$3;
                        SafeTrace.throwOnFailure(obj13);
                        update45 = update89;
                        coroutineSingletons10 = coroutineSingletons14;
                        onboardedAccountStatus2 = onboardedAccountStatus10;
                        stateFlowImpl = stateFlowImpl3;
                        session12 = session31;
                        str29 = str88;
                        sessionState8 = sessionState25;
                        str21 = str86;
                        str30 = str87;
                        stateChangeReason8 = stateChangeReason19;
                        str25 = str84;
                        str22 = str85;
                        realSessionManager = this;
                        update44 = update88;
                        boolean z72 = z3;
                        String str552 = str28;
                        SessionState sessionState152 = sessionState10;
                        OnboardedAccountStatus onboardedAccountStatus62 = onboardedAccountStatus2;
                        RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$232 = new RealSessionManager$updateSessionState$2(realSessionManager, null, 2);
                        realSessionManager$updateSessionState$1.L$0 = null;
                        realSessionManager$updateSessionState$1.L$1 = null;
                        realSessionManager$updateSessionState$1.L$2 = null;
                        realSessionManager$updateSessionState$1.L$3 = null;
                        realSessionManager$updateSessionState$1.L$4 = update44;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                        realSessionManager$updateSessionState$1.L$6 = sessionState8;
                        realSessionManager$updateSessionState$1.L$7 = str29;
                        realSessionManager$updateSessionState$1.L$8 = session12;
                        realSessionManager$updateSessionState$1.L$9 = str30;
                        realSessionManager$updateSessionState$1.L$10 = str21;
                        realSessionManager$updateSessionState$1.L$11 = str22;
                        realSessionManager$updateSessionState$1.L$12 = session10;
                        realSessionManager$updateSessionState$1.L$13 = str25;
                        realSessionManager$updateSessionState$1.L$14 = str552;
                        realSessionManager$updateSessionState$1.L$15 = sessionState152;
                        realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus62;
                        update46 = update44;
                        realSessionManager$updateSessionState$1.Z$0 = z72;
                        realSessionManager$updateSessionState$1.label = 13;
                        ifUpdated3 = realSessionManager.ifUpdated(update45, realSessionManager$updateSessionState$232, realSessionManager$updateSessionState$1);
                        coroutineSingletons11 = coroutineSingletons10;
                        if (ifUpdated3 != coroutineSingletons11) {
                        }
                        break;
                    case 13:
                        boolean z13 = realSessionManager$updateSessionState$1.Z$0;
                        OnboardedAccountStatus onboardedAccountStatus11 = realSessionManager$updateSessionState$1.L$16;
                        SessionState sessionState26 = realSessionManager$updateSessionState$1.L$15;
                        str32 = realSessionManager$updateSessionState$1.L$14;
                        String str89 = realSessionManager$updateSessionState$1.L$13;
                        Session session32 = realSessionManager$updateSessionState$1.L$12;
                        str22 = realSessionManager$updateSessionState$1.L$11;
                        str34 = realSessionManager$updateSessionState$1.L$10;
                        str33 = realSessionManager$updateSessionState$1.L$9;
                        session14 = realSessionManager$updateSessionState$1.L$8;
                        String str90 = realSessionManager$updateSessionState$1.L$7;
                        SessionState sessionState27 = realSessionManager$updateSessionState$1.L$6;
                        StateChangeReason stateChangeReason20 = realSessionManager$updateSessionState$1.L$5;
                        Update update90 = realSessionManager$updateSessionState$1.L$4;
                        SafeTrace.throwOnFailure(obj13);
                        update46 = update90;
                        coroutineSingletons12 = coroutineSingletons14;
                        onboardedAccountStatus3 = onboardedAccountStatus11;
                        stateFlowImpl = stateFlowImpl3;
                        str31 = str89;
                        realSessionManager = this;
                        z4 = z13;
                        str35 = str90;
                        sessionState11 = sessionState26;
                        session13 = session32;
                        sessionState12 = sessionState27;
                        stateChangeReason8 = stateChangeReason20;
                        OnboardedAccountStatus onboardedAccountStatus72 = onboardedAccountStatus3;
                        RealSessionManager$updateSessionState$2 realSessionManager$updateSessionState$242 = new RealSessionManager$updateSessionState$2(realSessionManager, null, 3);
                        realSessionManager$updateSessionState$1.L$0 = null;
                        realSessionManager$updateSessionState$1.L$1 = null;
                        realSessionManager$updateSessionState$1.L$2 = null;
                        realSessionManager$updateSessionState$1.L$3 = null;
                        realSessionManager$updateSessionState$1.L$4 = null;
                        realSessionManager$updateSessionState$1.L$5 = stateChangeReason8;
                        realSessionManager$updateSessionState$1.L$6 = sessionState12;
                        realSessionManager$updateSessionState$1.L$7 = str35;
                        realSessionManager$updateSessionState$1.L$8 = session14;
                        realSessionManager$updateSessionState$1.L$9 = str33;
                        realSessionManager$updateSessionState$1.L$10 = str34;
                        realSessionManager$updateSessionState$1.L$11 = str22;
                        realSessionManager$updateSessionState$1.L$12 = session13;
                        realSessionManager$updateSessionState$1.L$13 = str31;
                        realSessionManager$updateSessionState$1.L$14 = str32;
                        realSessionManager$updateSessionState$1.L$15 = sessionState11;
                        realSessionManager$updateSessionState$1.L$16 = onboardedAccountStatus72;
                        realSessionManager$updateSessionState$1.Z$0 = z4;
                        realSessionManager$updateSessionState$1.label = 14;
                        ifUpdated4 = realSessionManager.ifUpdated(update46, realSessionManager$updateSessionState$242, realSessionManager$updateSessionState$1);
                        coroutineSingletons13 = coroutineSingletons12;
                        if (ifUpdated4 != coroutineSingletons13) {
                        }
                        break;
                    case 14:
                        onboardedAccountStatus4 = realSessionManager$updateSessionState$1.L$16;
                        sessionState11 = realSessionManager$updateSessionState$1.L$15;
                        String str91 = realSessionManager$updateSessionState$1.L$14;
                        str31 = realSessionManager$updateSessionState$1.L$13;
                        session13 = realSessionManager$updateSessionState$1.L$12;
                        str37 = realSessionManager$updateSessionState$1.L$11;
                        String str92 = realSessionManager$updateSessionState$1.L$10;
                        String str93 = realSessionManager$updateSessionState$1.L$9;
                        session15 = realSessionManager$updateSessionState$1.L$8;
                        str40 = realSessionManager$updateSessionState$1.L$7;
                        sessionState13 = realSessionManager$updateSessionState$1.L$6;
                        stateChangeReason9 = realSessionManager$updateSessionState$1.L$5;
                        SafeTrace.throwOnFailure(obj13);
                        str36 = str91;
                        str38 = str92;
                        str39 = str93;
                        realSessionManager = this;
                        stateFlowImpl2 = stateFlowImpl3;
                        str41 = str31;
                        stateFlowImpl2.setValue(sessionState11);
                        realSessionManager._onboardedAccountStatus.setValue(onboardedAccountStatus4);
                        if (!Intrinsics.areEqual(sessionState11, sessionState13)) {
                            if (session15 != null) {
                                break;
                            }
                            if (session13 != null) {
                                break;
                            }
                            realSessionManager.analytics.track(new SessionChangeStateChanged(DimensionKt.toCdfSessionState(sessionState13), DimensionKt.toCdfSessionState(sessionState11), DimensionKt.toCdfSessionAttributeChange(str40, str37), DimensionKt.toCdfSessionAttributeChange(session15 == null ? session15.token : null, session13 == null ? session13.token : null), (session15 != null || (sessionStatus2 = session15.status) == null) ? null : DimensionKt.toCdfSessionTokenStatus(sessionStatus2), (session13 != null || (sessionStatus = session13.status) == null) ? null : DimensionKt.toCdfSessionTokenStatus(sessionStatus), str39, str41, str38, str36, stateChangeReason9.toString()), null);
                            break;
                        }
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realSessionManager$updateSessionState$1 = new RealSessionManager$updateSessionState$1(this, continuationImpl);
        Object obj132 = realSessionManager$updateSessionState$1.result;
        CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$updateSessionState$1.label;
        StateFlowImpl stateFlowImpl32 = this._sessionState;
        switch (i) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #2 {all -> 0x004c, blocks: (B:28:0x0048, B:29:0x0092, B:31:0x0096, B:44:0x00ba, B:50:0x0079), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005f  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r14v6, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // com.squareup.cash.session.backend.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSession(Session session, String str, ContinuationImpl continuationImpl) {
        RealSessionManager$updateSession$3 realSessionManager$updateSession$3;
        CoroutineSingletons coroutineSingletons;
        int i;
        Throwable th;
        Mutex mutex;
        Mutex mutex2;
        String str2;
        MutexImpl mutexImpl;
        int i2;
        Object obj;
        Session session2;
        int i3;
        Session session3;
        Update.Some some;
        StateChangeReason stateChangeReason;
        try {
            if (continuationImpl instanceof RealSessionManager$updateSession$3) {
                realSessionManager$updateSession$3 = (RealSessionManager$updateSession$3) continuationImpl;
                int i4 = realSessionManager$updateSession$3.label;
                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                    realSessionManager$updateSession$3.label = i4 - PKIFailureInfo.systemUnavail;
                    RealSessionManager$updateSession$3 realSessionManager$updateSession$32 = realSessionManager$updateSession$3;
                    Object obj2 = realSessionManager$updateSession$32.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSessionManager$updateSession$32.label;
                    int i5 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        realSessionManager$updateSession$32.L$0 = session;
                        realSessionManager$updateSession$32.L$1 = str;
                        MutexImpl mutexImpl2 = this.sessionStateLock;
                        realSessionManager$updateSession$32.L$2 = mutexImpl2;
                        realSessionManager$updateSession$32.I$0 = 0;
                        realSessionManager$updateSession$32.label = 1;
                        if (mutexImpl2.lock(realSessionManager$updateSession$32) != coroutineSingletons) {
                            str2 = str;
                            mutexImpl = mutexImpl2;
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex2 = realSessionManager$updateSession$32.L$2;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        i5 = realSessionManager$updateSession$32.I$1;
                        i3 = realSessionManager$updateSession$32.I$0;
                        Mutex mutex3 = realSessionManager$updateSession$32.L$2;
                        str2 = realSessionManager$updateSession$32.L$1;
                        session2 = realSessionManager$updateSession$32.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        str = mutex3;
                        session3 = (Session) obj2;
                        if (session3 != null) {
                            SessionStatus sessionStatus = session3.status;
                            SessionStatus sessionStatus2 = session2.status;
                            try {
                                Exception exc = new Exception();
                                SessionStatus sessionStatus3 = SessionStatus.FULL;
                                if (sessionStatus == sessionStatus3 && sessionStatus2 != null && sessionStatus2 != sessionStatus3) {
                                    this.errorReporter.report(new UnexpectedSessionStatusDowngradeError(sessionStatus2, str2, exc), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                mutex = str;
                                mutex2 = mutex;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        some = new Update.Some(session2);
                        stateChangeReason = StateChangeReason.SESSION_UPDATED;
                        realSessionManager$updateSession$32.L$0 = null;
                        realSessionManager$updateSession$32.L$1 = null;
                        realSessionManager$updateSession$32.L$2 = str;
                        realSessionManager$updateSession$32.I$0 = i3;
                        realSessionManager$updateSession$32.I$1 = i5;
                        realSessionManager$updateSession$32.label = 3;
                        if (updateSessionState$default(this, null, some, null, null, null, stateChangeReason, realSessionManager$updateSession$32, 29) != coroutineSingletons) {
                            mutex2 = str;
                            Unit unit2 = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit2;
                        }
                        return coroutineSingletons;
                    }
                    int i6 = realSessionManager$updateSession$32.I$0;
                    ?? r14 = realSessionManager$updateSession$32.L$2;
                    str2 = realSessionManager$updateSession$32.L$1;
                    Session session4 = realSessionManager$updateSession$32.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    i2 = i6;
                    session = session4;
                    mutexImpl = r14;
                    SharedPreferencesKeyValue sharedPreferencesKeyValue = this.session;
                    realSessionManager$updateSession$32.L$0 = session;
                    realSessionManager$updateSession$32.L$1 = str2;
                    realSessionManager$updateSession$32.L$2 = mutexImpl;
                    realSessionManager$updateSession$32.I$0 = i2;
                    realSessionManager$updateSession$32.I$1 = 0;
                    realSessionManager$updateSession$32.label = 2;
                    obj = sharedPreferencesKeyValue.get(realSessionManager$updateSession$32);
                    if (obj != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    session2 = session;
                    i3 = i2;
                    obj2 = obj;
                    str = mutexImpl;
                    session3 = (Session) obj2;
                    if (session3 != null) {
                    }
                    some = new Update.Some(session2);
                    stateChangeReason = StateChangeReason.SESSION_UPDATED;
                    realSessionManager$updateSession$32.L$0 = null;
                    realSessionManager$updateSession$32.L$1 = null;
                    realSessionManager$updateSession$32.L$2 = str;
                    realSessionManager$updateSession$32.I$0 = i3;
                    realSessionManager$updateSession$32.I$1 = i5;
                    realSessionManager$updateSession$32.label = 3;
                    if (updateSessionState$default(this, null, some, null, null, null, stateChangeReason, realSessionManager$updateSession$32, 29) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            SharedPreferencesKeyValue sharedPreferencesKeyValue2 = this.session;
            realSessionManager$updateSession$32.L$0 = session;
            realSessionManager$updateSession$32.L$1 = str2;
            realSessionManager$updateSession$32.L$2 = mutexImpl;
            realSessionManager$updateSession$32.I$0 = i2;
            realSessionManager$updateSession$32.I$1 = 0;
            realSessionManager$updateSession$32.label = 2;
            obj = sharedPreferencesKeyValue2.get(realSessionManager$updateSession$32);
            if (obj != coroutineSingletons) {
            }
        } catch (Throwable th4) {
            th = th4;
            mutex = str;
        }
        realSessionManager$updateSession$3 = new RealSessionManager$updateSession$3(this, continuationImpl);
        RealSessionManager$updateSession$3 realSessionManager$updateSession$322 = realSessionManager$updateSession$3;
        Object obj22 = realSessionManager$updateSession$322.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSessionManager$updateSession$322.label;
        int i52 = 0;
    }
}
