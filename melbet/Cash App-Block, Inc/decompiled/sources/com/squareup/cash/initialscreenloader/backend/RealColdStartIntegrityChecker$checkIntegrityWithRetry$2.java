package com.squareup.cash.initialscreenloader.backend;

import androidx.room.RoomDatabase$performClear$1;
import app.cash.passcode.backend.RealAppLockState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafb;
import com.squareup.cash.cdf.account.AccountAuthenticateDismissLockSplashScreen;
import com.squareup.cash.cdf.integrity.IntegrityCheckFail;
import com.squareup.cash.cdf.integrity.IntegrityCheckRefreshData;
import com.squareup.cash.cdf.integrity.IntegrityCheckRetry;
import com.squareup.cash.cdf.integrity.IntegrityCheckStart;
import com.squareup.cash.cdf.integrity.IntegrityCheckSucceed;
import com.squareup.cash.cdf.integrity.Trigger;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.initialscreenloader.backend.ColdStartIntegrityChecker$ColdStartIntegrityCheckResult;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import com.squareup.cash.onboarding.check.checkers.RealIntegrityCheckFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.ui.UiAccess;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealColdStartIntegrityChecker$checkIntegrityWithRetry$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $trackSplashScreenVisibility;
    public final /* synthetic */ ColdStartIntegrityChecker$TriggeredBy $triggeredBy;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Set L$1;
    public Trigger L$2;
    public Ref$BooleanRef L$6;
    public StandaloneCoroutine L$7;
    public int label;
    public final /* synthetic */ RealColdStartIntegrityChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealColdStartIntegrityChecker$checkIntegrityWithRetry$2(RealColdStartIntegrityChecker realColdStartIntegrityChecker, ColdStartIntegrityChecker$TriggeredBy coldStartIntegrityChecker$TriggeredBy, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realColdStartIntegrityChecker;
        this.$triggeredBy = coldStartIntegrityChecker$TriggeredBy;
        this.$trackSplashScreenVisibility = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealColdStartIntegrityChecker$checkIntegrityWithRetry$2 realColdStartIntegrityChecker$checkIntegrityWithRetry$2 = new RealColdStartIntegrityChecker$checkIntegrityWithRetry$2(this.this$0, this.$triggeredBy, this.$trackSplashScreenVisibility, continuation);
        realColdStartIntegrityChecker$checkIntegrityWithRetry$2.L$0 = obj;
        return realColdStartIntegrityChecker$checkIntegrityWithRetry$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealColdStartIntegrityChecker$checkIntegrityWithRetry$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023c A[LOOP:4: B:60:0x0236->B:62:0x023c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0271  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Long, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v17 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Trigger trigger;
        Long l;
        Object coroutineScope;
        long j;
        Set set;
        Trigger trigger2;
        ?? r11;
        StandaloneCoroutine standaloneCoroutine;
        Trigger trigger3;
        StandaloneCoroutine standaloneCoroutine2;
        Ref$BooleanRef ref$BooleanRef;
        CancellationException cancellationException;
        Iterator it;
        Object coroutineScope2;
        Ref$BooleanRef ref$BooleanRef2;
        long j2;
        List list;
        Boolean bool;
        RealColdStartIntegrityChecker realColdStartIntegrityChecker = this.this$0;
        AndroidClock androidClock = realColdStartIntegrityChecker.clock;
        RealIntegrityCheckFactory realIntegrityCheckFactory = realColdStartIntegrityChecker.integrityCheckFactory;
        Analytics analytics = realColdStartIntegrityChecker.analytics;
        CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            long elapsedRealtimeDuration = DimensionKt.elapsedRealtimeDuration(androidClock);
            Set set2 = ArraysKt___ArraysKt.toSet(new RealColdStartIntegrityChecker.IntegrityCheckItem[]{new RealColdStartIntegrityChecker.IntegrityCheckItem(realIntegrityCheckFactory.create(IntegrityCheckFactory$Type.PROFILE), true), new RealColdStartIntegrityChecker.IntegrityCheckItem(realIntegrityCheckFactory.create(IntegrityCheckFactory$Type.MARKET_CAPABILITIES), true), new RealColdStartIntegrityChecker.IntegrityCheckItem(realIntegrityCheckFactory.create(IntegrityCheckFactory$Type.APP_LOCK), true), new RealColdStartIntegrityChecker.IntegrityCheckItem(realIntegrityCheckFactory.create(IntegrityCheckFactory$Type.TABS), false)});
            int ordinal = this.$triggeredBy.ordinal();
            if (ordinal == 0) {
                trigger = Trigger.APP_STARTUP_SIGNED_IN;
            } else if (ordinal == 1) {
                trigger = Trigger.END_OF_ONBOARDING;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                trigger = Trigger.SWITCH_PROFILE;
            }
            Set set3 = set2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set3, 10));
            Iterator it2 = set3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((RealColdStartIntegrityChecker.IntegrityCheckItem) it2.next()).integrityCheck);
            }
            analytics.track(new IntegrityCheckStart(trigger, RealColdStartIntegrityChecker.access$toAnalyticsChecksString(realColdStartIntegrityChecker, arrayList), Boolean.FALSE), null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set3, 10));
            Iterator it3 = set3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((RealColdStartIntegrityChecker.IntegrityCheckItem) it3.next()).integrityCheck);
            }
            this.L$0 = coroutineScope3;
            this.L$1 = set2;
            this.L$2 = trigger;
            this.J$0 = elapsedRealtimeDuration;
            this.label = 1;
            l = null;
            coroutineScope = JobKt.coroutineScope(new RoomDatabase$performClear$1.AnonymousClass1((List) arrayList2, false, (Continuation) null), this);
            if (coroutineScope != coroutineSingletons) {
                j = elapsedRealtimeDuration;
                set = set2;
                trigger2 = trigger;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                long j3 = this.J$0;
                StandaloneCoroutine standaloneCoroutine3 = this.L$7;
                ref$BooleanRef = this.L$6;
                trigger3 = this.L$2;
                set = this.L$1;
                SafeTrace.throwOnFailure(obj);
                cancellationException = null;
                j = j3;
                standaloneCoroutine2 = standaloneCoroutine3;
                if (standaloneCoroutine2 != null) {
                    standaloneCoroutine2.cancel(cancellationException);
                }
                Set set4 = set;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set4, 10));
                it = set4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((RealColdStartIntegrityChecker.IntegrityCheckItem) it.next()).integrityCheck);
                }
                analytics.track(new IntegrityCheckRetry(trigger3, RealColdStartIntegrityChecker.access$toAnalyticsChecksString(realColdStartIntegrityChecker, arrayList3)), null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = trigger3;
                this.L$6 = ref$BooleanRef;
                this.L$7 = null;
                this.J$0 = j;
                this.label = 3;
                coroutineScope2 = JobKt.coroutineScope(new AnimationsKt$takeUntil$1$1(set, realColdStartIntegrityChecker, (Continuation) null, 7), this);
                if (coroutineScope2 != coroutineSingletons) {
                    ref$BooleanRef2 = ref$BooleanRef;
                    j2 = j;
                    Pair pair = (Pair) coroutineScope2;
                    list = (List) pair.first;
                    List list2 = (List) pair.second;
                    ArrayList arrayList4 = new ArrayList();
                    while (r0.hasNext()) {
                    }
                    if (zzafb.allSuccess(list)) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = this.J$0;
            ref$BooleanRef2 = this.L$6;
            trigger3 = this.L$2;
            Set set5 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            coroutineScope2 = obj;
            Pair pair2 = (Pair) coroutineScope2;
            list = (List) pair2.first;
            List list22 = (List) pair2.second;
            ArrayList arrayList42 = new ArrayList();
            for (Object obj2 : list22) {
                if (obj2 instanceof IntegrityChecker$Result.Failure) {
                    arrayList42.add(obj2);
                }
            }
            if (zzafb.allSuccess(list)) {
                List list3 = list;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((IntegrityChecker$Result) it4.next()).getIntegrityCheck());
                }
                String access$toAnalyticsChecksString = RealColdStartIntegrityChecker.access$toAnalyticsChecksString(realColdStartIntegrityChecker, arrayList5);
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList42, 10));
                Iterator it5 = arrayList42.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((IntegrityChecker$Result.Failure) it5.next()).integrityCheck);
                }
                analytics.track(new IntegrityCheckFail(trigger3, access$toAnalyticsChecksString, RealColdStartIntegrityChecker.access$toAnalyticsChecksString(realColdStartIntegrityChecker, arrayList6)), null);
                return new ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Failure(zzafb.firstFailure(list), arrayList42);
            }
            ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList42, 10));
            Iterator it6 = arrayList42.iterator();
            while (it6.hasNext()) {
                arrayList7.add(((IntegrityChecker$Result.Failure) it6.next()).integrityCheck);
            }
            analytics.track(new IntegrityCheckSucceed(trigger3, RealColdStartIntegrityChecker.access$toAnalyticsChecksString(realColdStartIntegrityChecker, arrayList7)), null);
            ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Success success = new ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Success(arrayList42);
            if (ref$BooleanRef2.element) {
                long m4172minusLRDsOJo = Duration.m4172minusLRDsOJo(DimensionKt.elapsedRealtimeDuration(androidClock), j2);
                UiAccess uiAccess = (UiAccess) realColdStartIntegrityChecker.accessSyncValue.getValue();
                boolean booleanValue = (uiAccess == null || (bool = uiAccess.app_lock_activated) == null) ? false : bool.booleanValue();
                boolean m1347expiredLRDsOJo = ((RealAppLockState.InternalState) realColdStartIntegrityChecker.appLockState.stateFlow.getValue()).m1347expiredLRDsOJo(DimensionKt.elapsedRealtimeDuration(androidClock));
                long j4 = RealColdStartIntegrityChecker.SYNC_APP_LOCK_ANALYTICS_DELAY;
                DurationUnit durationUnit = DurationUnit.SECONDS;
                analytics.track(new AccountAuthenticateDismissLockSplashScreen(Integer.valueOf((int) Duration.m4176toLongimpl(j4, durationUnit)), Integer.valueOf((int) Duration.m4176toLongimpl(m4172minusLRDsOJo, durationUnit)), !booleanValue ? AccountAuthenticateDismissLockSplashScreen.SecurityCheckpointState.DISABLED : m1347expiredLRDsOJo ? AccountAuthenticateDismissLockSplashScreen.SecurityCheckpointState.LOCKED : AccountAuthenticateDismissLockSplashScreen.SecurityCheckpointState.UNLOCKED), null);
            }
            return success;
        }
        long j5 = this.J$0;
        trigger2 = this.L$2;
        Set set6 = this.L$1;
        SafeTrace.throwOnFailure(obj);
        coroutineScope = obj;
        l = null;
        j = j5;
        set = set6;
        List list4 = (List) coroutineScope;
        if (zzafb.allSuccess(list4)) {
            analytics.track(new IntegrityCheckSucceed(trigger2, ""), l);
            return new ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Success(EmptyList.INSTANCE);
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj3 : list4) {
            if (obj3 instanceof IntegrityChecker$Result.Failure) {
                arrayList8.add(obj3);
            }
        }
        ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10));
        Iterator it7 = arrayList8.iterator();
        while (it7.hasNext()) {
            arrayList9.add(((IntegrityChecker$Result.Failure) it7.next()).integrityCheck);
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj4 : set) {
            RealColdStartIntegrityChecker.IntegrityCheckItem integrityCheckItem = (RealColdStartIntegrityChecker.IntegrityCheckItem) obj4;
            if (integrityCheckItem.retryEnabled && arrayList9.contains(integrityCheckItem.integrityCheck)) {
                arrayList10.add(obj4);
            }
        }
        ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList10, 10));
        Iterator it8 = arrayList10.iterator();
        while (it8.hasNext()) {
            arrayList11.add(((RealColdStartIntegrityChecker.IntegrityCheckItem) it8.next()).integrityCheck);
        }
        Set set7 = CollectionsKt.toSet(arrayList11);
        Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
        if (this.$trackSplashScreenVisibility) {
            r11 = 0;
            standaloneCoroutine = JobKt.launch$default(coroutineScope3, null, null, new CheckStatusPresenter.AnonymousClass1(realColdStartIntegrityChecker, ref$BooleanRef3, false ? 1 : 0, 4), 3);
        } else {
            r11 = 0;
            standaloneCoroutine = null;
        }
        analytics.track(new IntegrityCheckRefreshData(trigger2, RealColdStartIntegrityChecker.access$toAnalyticsChecksString(realColdStartIntegrityChecker, set7)), r11);
        this.L$0 = r11;
        this.L$1 = set;
        this.L$2 = trigger2;
        this.L$6 = ref$BooleanRef3;
        this.L$7 = standaloneCoroutine;
        this.J$0 = j;
        this.label = 2;
        Object coroutineScope4 = JobKt.coroutineScope(new PasscodeDialogPresenter$models$1$1(set7, realColdStartIntegrityChecker, (Continuation) r11, 16), this);
        if (coroutineScope4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            coroutineScope4 = Unit.INSTANCE;
        }
        if (coroutineScope4 != coroutineSingletons) {
            trigger3 = trigger2;
            standaloneCoroutine2 = standaloneCoroutine;
            ref$BooleanRef = ref$BooleanRef3;
            cancellationException = r11;
            if (standaloneCoroutine2 != null) {
            }
            Set set42 = set;
            ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set42, 10));
            it = set42.iterator();
            while (it.hasNext()) {
            }
            analytics.track(new IntegrityCheckRetry(trigger3, RealColdStartIntegrityChecker.access$toAnalyticsChecksString(realColdStartIntegrityChecker, arrayList32)), null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = trigger3;
            this.L$6 = ref$BooleanRef;
            this.L$7 = null;
            this.J$0 = j;
            this.label = 3;
            coroutineScope2 = JobKt.coroutineScope(new AnimationsKt$takeUntil$1$1(set, realColdStartIntegrityChecker, (Continuation) null, 7), this);
            if (coroutineScope2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
