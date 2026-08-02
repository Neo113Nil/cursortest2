package com.squareup.cash.deposits.physical.presenter.address;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.address.typeahead.backend.real.RealLocationSearchClient;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PhysicalDepositAddressEntryPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PoolsListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhysicalDepositAddressEntryPresenter$models$1$1(PoolsListPresenter poolsListPresenter, Continuation continuation, int i) {
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
                return new PhysicalDepositAddressEntryPresenter$models$1$1(poolsListPresenter, continuation, 0);
            case 1:
                return new PhysicalDepositAddressEntryPresenter$models$1$1(poolsListPresenter, continuation, 1);
            default:
                return new PhysicalDepositAddressEntryPresenter$models$1$1(poolsListPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PhysicalDepositAddressEntryPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PoolsListPresenter poolsListPresenter = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((Analytics) poolsListPresenter.analytics).track(((AddressAnalyticsFactory) poolsListPresenter.moneyFormatter).searchAddressEvent(), null);
                    CoroutineContext coroutineContext = (CoroutineContext) poolsListPresenter.repository;
                    PhysicalDepositAddressEntryPresenter$models$1$1 physicalDepositAddressEntryPresenter$models$1$1 = new PhysicalDepositAddressEntryPresenter$models$1$1(poolsListPresenter, continuation, i2);
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext, physicalDepositAddressEntryPresenter$models$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocationSearchClient realLocationSearchClient = (RealLocationSearchClient) poolsListPresenter.dateFormatManager;
                    this.label = 1;
                    obj = realLocationSearchClient.initialize(this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    Timber.Forest.e("Unable to search for addresses.", new Object[0]);
                }
                break;
            default:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext = JobKt.withContext((CoroutineContext) poolsListPresenter.repository, new RealProfileManager$profileOrNull$2(poolsListPresenter, continuation, 2), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
