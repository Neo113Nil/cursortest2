package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class InviteFriendsPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PoolsListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteFriendsPresenter$models$2$1(PoolsListPresenter poolsListPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = poolsListPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PoolsListPresenter poolsListPresenter = this.this$0;
        switch (i) {
            case 0:
                return new InviteFriendsPresenter$models$2$1(poolsListPresenter, continuation, 0);
            case 1:
                return new InviteFriendsPresenter$models$2$1(poolsListPresenter, continuation, 1);
            case 2:
                return new InviteFriendsPresenter$models$2$1(poolsListPresenter, continuation, 2);
            default:
                return new InviteFriendsPresenter$models$2$1(poolsListPresenter, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InviteFriendsPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PoolsListPresenter poolsListPresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    ((ModifiablePermissions) poolsListPresenter.localeAssetProvider).request();
                    Object emit = ((SharedFlowImpl) poolsListPresenter.flowToken).emit(new Long(((AndroidClock) poolsListPresenter.args).millis()), this);
                    if (emit != coroutineSingletons) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (PoolsListPresenter.access$onContactsPermissionGranted(poolsListPresenter, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (PoolsListPresenter.access$onContactsPermissionDenied(poolsListPresenter, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ModifiablePermissions modifiablePermissions = (ModifiablePermissions) poolsListPresenter.localeAssetProvider;
                    this.label = 1;
                    obj = PoolsListPresenter.access$shouldContinueEmitting(poolsListPresenter, modifiablePermissions, this);
                    break;
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.first).booleanValue();
                boolean booleanValue2 = ((Boolean) pair.second).booleanValue();
                if (!booleanValue && !booleanValue2) {
                    this.label = 2;
                    Object withContext = JobKt.withContext((CoroutineContext) poolsListPresenter.repository, new MLKitTitleGenerator$1(poolsListPresenter, continuation, 28), this);
                    if (withContext != coroutineSingletons4) {
                        withContext = Unit.INSTANCE;
                        break;
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
