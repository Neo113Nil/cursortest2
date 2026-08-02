package com.squareup.cash.maps.presenter;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CashMapPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $hasLocationPermission$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CashMapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashMapPresenter$models$1$1(CashMapPresenter cashMapPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cashMapPresenter;
        this.$hasLocationPermission$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$hasLocationPermission$delegate;
        CashMapPresenter cashMapPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CashMapPresenter$models$1$1(cashMapPresenter, mutableState, continuation, 0);
            default:
                return new CashMapPresenter$models$1$1(cashMapPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashMapPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object collectGpsLocation;
        int i = this.$r8$classId;
        MutableState mutableState = this.$hasLocationPermission$delegate;
        CashMapPresenter cashMapPresenter = this.this$0;
        switch (i) {
            case 0:
                String str = cashMapPresenter.trigger;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        String str2 = str + "_" + UUID.randomUUID();
                        RealGpsLocationManager realGpsLocationManager = cashMapPresenter.gpsLocationManager;
                        this.label = 1;
                        collectGpsLocation = realGpsLocationManager.collectGpsLocation(str, str2, (r13 & 4) == 0, (r13 & 8) == 0, this);
                        if (collectGpsLocation == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    obj = CashMapPresenter.access$centerOnUserLocation(cashMapPresenter, this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                LocationViewModel locationViewModel = (LocationViewModel) obj;
                if (locationViewModel != null) {
                    mutableState.setValue(locationViewModel);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
