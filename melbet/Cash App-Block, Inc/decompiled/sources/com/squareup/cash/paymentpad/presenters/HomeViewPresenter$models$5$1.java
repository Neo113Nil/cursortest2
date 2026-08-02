package com.squareup.cash.paymentpad.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.paymentpad.screens.LowDiskSpaceAlertDialogScreen;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class HomeViewPresenter$models$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public double D$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeViewPresenter$models$5$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new HomeViewPresenter$models$5$1((HomeViewPresenter) obj2, continuation, 0);
            default:
                return new HomeViewPresenter$models$5$1((RealLowDiskSpaceAlertManager) obj2, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((HomeViewPresenter$models$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        if (r2 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        if (r2 == r7) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        double d;
        Object withContext2;
        Object obj2;
        double d2;
        Double d3;
        int i = this.$r8$classId;
        Object obj3 = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                HomeViewPresenter homeViewPresenter = (HomeViewPresenter) obj3;
                RealLowDiskSpaceAlertManager realLowDiskSpaceAlertManager = homeViewPresenter.lowDiskSpaceAlertManager;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    withContext = JobKt.withContext(realLowDiskSpaceAlertManager.ioDispatcher, new HomeViewPresenter$models$5$1(realLowDiskSpaceAlertManager, continuation, i2), this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d = this.D$0;
                        homeViewPresenter = (HomeViewPresenter) this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        homeViewPresenter.navigator.goTo(new LowDiskSpaceAlertDialogScreen(d));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                Double d4 = (Double) withContext;
                if (d4 != null) {
                    double doubleValue = d4.doubleValue();
                    this.L$1 = homeViewPresenter;
                    this.D$0 = doubleValue;
                    this.label = 2;
                    Object withContext3 = JobKt.withContext(realLowDiskSpaceAlertManager.ioDispatcher, new InviteErrorPresenter$models$1$1(realLowDiskSpaceAlertManager, continuation, 15), this);
                    if (withContext3 != coroutineSingletons) {
                        withContext3 = Unit.INSTANCE;
                    }
                    if (withContext3 != coroutineSingletons) {
                        d = doubleValue;
                        homeViewPresenter.navigator.goTo(new LowDiskSpaceAlertDialogScreen(d));
                    }
                    return coroutineSingletons;
                }
                return Unit.INSTANCE;
            default:
                RealLowDiskSpaceAlertManager realLowDiskSpaceAlertManager2 = (RealLowDiskSpaceAlertManager) obj3;
                KeyValue keyValue = realLowDiskSpaceAlertManager2.lowDiskSpaceAlertShownTimestamp;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Storage storage = realLowDiskSpaceAlertManager2.storage;
                    this.label = 1;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    withContext2 = JobKt.withContext(DefaultIoScheduler.INSTANCE, new CashApp$onCreate$1((RealStorage) storage, continuation, 7), this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Double d5 = (Double) this.L$1;
                            SafeTrace.throwOnFailure(obj);
                            return d5;
                        }
                        d2 = this.D$0;
                        SafeTrace.throwOnFailure(obj);
                        obj2 = obj;
                        long longValue = ((Number) obj2).longValue();
                        long millis = realLowDiskSpaceAlertManager2.clock.millis();
                        double d6 = (millis - longValue) / realLowDiskSpaceAlertManager2.numMillisInHour;
                        d3 = new Double(realLowDiskSpaceAlertManager2.alertThresholdInMegaBytes - d2);
                        if (d3.doubleValue() > 0.0d || !realLowDiskSpaceAlertManager2.enabled || d6 <= realLowDiskSpaceAlertManager2.alertFrequency) {
                            d3 = null;
                        }
                        if (d3 != null) {
                            return null;
                        }
                        Long l = new Long(millis);
                        this.L$1 = d3;
                        this.D$0 = d2;
                        this.label = 3;
                        if (keyValue.set(l, this) != coroutineSingletons2) {
                            return d3;
                        }
                        return coroutineSingletons2;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext2 = obj;
                }
                double doubleValue2 = ((Number) withContext2).doubleValue() / realLowDiskSpaceAlertManager2.numBytesInMegaByte;
                this.D$0 = doubleValue2;
                this.label = 2;
                obj2 = keyValue.get(this);
                if (obj2 != coroutineSingletons2) {
                    d2 = doubleValue2;
                    long longValue2 = ((Number) obj2).longValue();
                    long millis2 = realLowDiskSpaceAlertManager2.clock.millis();
                    double d62 = (millis2 - longValue2) / realLowDiskSpaceAlertManager2.numMillisInHour;
                    d3 = new Double(realLowDiskSpaceAlertManager2.alertThresholdInMegaBytes - d2);
                    if (d3.doubleValue() > 0.0d) {
                    }
                    d3 = null;
                    if (d3 != null) {
                    }
                }
                return coroutineSingletons2;
        }
    }
}
