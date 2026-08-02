package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.h4z0;
import defpackage.pzt0;
import defpackage.q8j0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class n implements vpr {
    public final /* synthetic */ t a;

    public n(t tVar) {
        this.a = tVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        q8j0 q8j0Var = ((h4z0) obj).b;
        String str = q8j0Var.b;
        String str2 = q8j0Var.d;
        String str3 = q8j0Var.e;
        Object obj2 = q8j0Var.f;
        t tVar = this.a;
        pzt0 pzt0Var = tVar.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tVar.T = tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$requestCheckout$1(tVar, str, str2, str3, true, obj2, null), 3);
        return zy11.a;
    }
}
