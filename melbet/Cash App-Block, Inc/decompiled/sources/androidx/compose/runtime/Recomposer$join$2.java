package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.session.backend.OnboardedAccountStatus;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.storage.StorageLinkState;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharingCommand;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class Recomposer$join$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Recomposer$join$2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(2, continuation, 0);
                recomposer$join$2.L$0 = obj;
                return recomposer$join$2;
            case 1:
                Recomposer$join$2 recomposer$join$22 = new Recomposer$join$2(2, continuation, 1);
                recomposer$join$22.L$0 = obj;
                return recomposer$join$22;
            case 2:
                Recomposer$join$2 recomposer$join$23 = new Recomposer$join$2(2, continuation, 2);
                recomposer$join$23.L$0 = obj;
                return recomposer$join$23;
            case 3:
                Recomposer$join$2 recomposer$join$24 = new Recomposer$join$2(2, continuation, 3);
                recomposer$join$24.L$0 = obj;
                return recomposer$join$24;
            case 4:
                Recomposer$join$2 recomposer$join$25 = new Recomposer$join$2(2, continuation, 4);
                recomposer$join$25.L$0 = obj;
                return recomposer$join$25;
            case 5:
                Recomposer$join$2 recomposer$join$26 = new Recomposer$join$2(2, continuation, 5);
                recomposer$join$26.L$0 = obj;
                return recomposer$join$26;
            case 6:
                Recomposer$join$2 recomposer$join$27 = new Recomposer$join$2(2, continuation, 6);
                recomposer$join$27.L$0 = obj;
                return recomposer$join$27;
            case 7:
                Recomposer$join$2 recomposer$join$28 = new Recomposer$join$2(2, continuation, 7);
                recomposer$join$28.L$0 = obj;
                return recomposer$join$28;
            case 8:
                Recomposer$join$2 recomposer$join$29 = new Recomposer$join$2(2, continuation, 8);
                recomposer$join$29.L$0 = obj;
                return recomposer$join$29;
            case 9:
                Recomposer$join$2 recomposer$join$210 = new Recomposer$join$2(2, continuation, 9);
                recomposer$join$210.L$0 = obj;
                return recomposer$join$210;
            case 10:
                Recomposer$join$2 recomposer$join$211 = new Recomposer$join$2(2, continuation, 10);
                recomposer$join$211.L$0 = obj;
                return recomposer$join$211;
            case 11:
                Recomposer$join$2 recomposer$join$212 = new Recomposer$join$2(2, continuation, 11);
                recomposer$join$212.L$0 = obj;
                return recomposer$join$212;
            case 12:
                Recomposer$join$2 recomposer$join$213 = new Recomposer$join$2(2, continuation, 12);
                recomposer$join$213.L$0 = obj;
                return recomposer$join$213;
            case 13:
                Recomposer$join$2 recomposer$join$214 = new Recomposer$join$2(2, continuation, 13);
                recomposer$join$214.L$0 = obj;
                return recomposer$join$214;
            default:
                Recomposer$join$2 recomposer$join$215 = new Recomposer$join$2(2, continuation, 14);
                recomposer$join$215.L$0 = obj;
                return recomposer$join$215;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((Recomposer$join$2) create((Recomposer.State) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((Recomposer$join$2) create((OnboardedAccountStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((Recomposer$join$2) create((OnboardedAccountStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((Recomposer$join$2) create((OnboardedAccountStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((Recomposer$join$2) create((SessionState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((Recomposer$join$2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((Recomposer$join$2) create((FeatureFlag$EnabledDisabledFeatureFlag$Options) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((Recomposer$join$2) create((FeatureFlag$EnabledDisabledFeatureFlag$Options) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((Recomposer$join$2) create((OnboardedAccountStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((Recomposer$join$2) create((OnboardedAccountStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((Recomposer$join$2) create((AppForegroundState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((Recomposer$join$2) create((StorageLinkState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((Recomposer$join$2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((Recomposer$join$2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((Recomposer$join$2) create((SharingCommand) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(((Recomposer.State) this.L$0) == Recomposer.State.ShutDown);
            case 1:
                OnboardedAccountStatus onboardedAccountStatus = (OnboardedAccountStatus) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(onboardedAccountStatus instanceof OnboardedAccountStatus.Onboarded);
            case 2:
                OnboardedAccountStatus onboardedAccountStatus2 = (OnboardedAccountStatus) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(onboardedAccountStatus2 instanceof OnboardedAccountStatus.Onboarded);
            case 3:
                OnboardedAccountStatus onboardedAccountStatus3 = (OnboardedAccountStatus) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(onboardedAccountStatus3 instanceof OnboardedAccountStatus.Onboarded);
            case 4:
                SessionState sessionState = (SessionState) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(sessionState instanceof SessionState.Initiated);
            case 5:
                List list = (List) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return list == null ? EmptyList.INSTANCE : list;
            case 6:
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(featureFlag$EnabledDisabledFeatureFlag$Options.enabled());
            case 7:
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options2 = (FeatureFlag$EnabledDisabledFeatureFlag$Options) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(featureFlag$EnabledDisabledFeatureFlag$Options2.enabled());
            case 8:
                OnboardedAccountStatus onboardedAccountStatus4 = (OnboardedAccountStatus) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(onboardedAccountStatus4 instanceof OnboardedAccountStatus.Onboarded);
            case 9:
                OnboardedAccountStatus onboardedAccountStatus5 = (OnboardedAccountStatus) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(onboardedAccountStatus5 instanceof OnboardedAccountStatus.Onboarded);
            case 10:
                AppForegroundState appForegroundState = (AppForegroundState) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(appForegroundState == AppForegroundState.FOREGROUND);
            case 11:
                StorageLinkState storageLinkState = (StorageLinkState) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Timber.Forest.i("StorageLinkStateMachine: StateFlow emitted: " + storageLinkState.link, new Object[0]);
                return Unit.INSTANCE;
            case 12:
                List list2 = (List) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return CollectionsKt.firstOrNull(list2);
            case 13:
                List list3 = (List) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return CollectionsKt.firstOrNull(list3);
            default:
                SharingCommand sharingCommand = (SharingCommand) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(sharingCommand != SharingCommand.START);
        }
    }
}
