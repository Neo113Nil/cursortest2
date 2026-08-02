package ru.yandex.taxi.masstransit.main.ui.overlay;

import com.yandex.go.address.models.Address;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.vpr;
import defpackage.yo30;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ yo30 a;

    public d(yo30 yo30Var) {
        this.a = yo30Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Address address = (Address) obj;
        yo30 yo30Var = this.a;
        boolean l = jl40.l(address, yo30Var.K);
        zy11 zy11Var = zy11.a;
        if (!l) {
            yo30Var.K = address;
            zzs B = address != null ? address.B() : null;
            yo30Var.getClass();
            Object n = bvf0.n(new MtMainOverlayPresenter$updateZoom$2(yo30Var, B, null), continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (n != coroutineSingletons) {
                n = zy11Var;
            }
            if (n == coroutineSingletons) {
                return n;
            }
        }
        return zy11Var;
    }
}
