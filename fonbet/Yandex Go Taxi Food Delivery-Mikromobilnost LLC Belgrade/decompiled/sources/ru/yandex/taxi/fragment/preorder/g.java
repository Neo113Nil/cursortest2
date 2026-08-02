package ru.yandex.taxi.fragment.preorder;

import com.yandex.go.address.models.Address;
import defpackage.ik31;
import defpackage.ny61;
import defpackage.qq60;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qq60 b;

    public g(vpr vprVar, qq60 qq60Var) {
        this.a = vprVar;
        this.b = qq60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ObserverForCurrentTariff$special$$inlined$filter$1$2$1 observerForCurrentTariff$special$$inlined$filter$1$2$1;
        int i;
        boolean z;
        zzs B;
        if (continuation instanceof ObserverForCurrentTariff$special$$inlined$filter$1$2$1) {
            observerForCurrentTariff$special$$inlined$filter$1$2$1 = (ObserverForCurrentTariff$special$$inlined$filter$1$2$1) continuation;
            int i2 = observerForCurrentTariff$special$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                observerForCurrentTariff$special$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = observerForCurrentTariff$special$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observerForCurrentTariff$special$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    qq60 qq60Var = this.b;
                    if (((ik31) obj).c == PriceUpdate$PriceLoadingState.LOADED) {
                        Address address = qq60Var.d;
                        if (address == null || (B = address.B()) == null) {
                            z = true;
                        } else {
                            Address b = qq60Var.a.a.G.b();
                            if (b != null) {
                                z = B.equals(b.B());
                            }
                        }
                        if (z) {
                            observerForCurrentTariff$special$$inlined$filter$1$2$1.L$0 = null;
                            observerForCurrentTariff$special$$inlined$filter$1$2$1.L$1 = null;
                            observerForCurrentTariff$special$$inlined$filter$1$2$1.L$2 = null;
                            observerForCurrentTariff$special$$inlined$filter$1$2$1.L$3 = null;
                            observerForCurrentTariff$special$$inlined$filter$1$2$1.label = 1;
                            if (vprVar.emit(obj, observerForCurrentTariff$special$$inlined$filter$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        observerForCurrentTariff$special$$inlined$filter$1$2$1 = new ObserverForCurrentTariff$special$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = observerForCurrentTariff$special$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observerForCurrentTariff$special$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
