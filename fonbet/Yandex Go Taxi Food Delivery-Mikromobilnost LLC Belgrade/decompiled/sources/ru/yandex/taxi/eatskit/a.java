package ru.yandex.taxi.eatskit;

import defpackage.ecn;
import defpackage.fho;
import defpackage.ken;
import defpackage.qq90;
import defpackage.rnc;
import defpackage.w6a0;
import defpackage.wdn;
import defpackage.x3;

/* loaded from: classes5.dex */
public final class a extends x3 implements ken {
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(5, cVar);
        this.c = cVar;
    }

    @Override // defpackage.x3, defpackage.r250
    public final void Bc() {
        super.Bc();
        c cVar = this.c;
        fho m = cVar.o.m();
        if (m != null) {
            m.b(true);
        }
        cVar.x.invoke(Boolean.FALSE);
    }

    public final void Ug(qq90 qq90Var) {
        c cVar = this.c;
        ((rnc) cVar.o.a).a(new wdn(cVar, qq90Var, 0), new EatsKitServiceController$EatsNativeApiCallback$requestAuthorization$2(0, cVar.u, ecn.class, "authorizationCancelled", "authorizationCancelled()V", 0));
    }

    public final void Vg(w6a0 w6a0Var) {
        c cVar = this.c;
        cVar.o.c.a(w6a0Var, new EatsKitServiceController$EatsNativeApiCallback$requestPaymentMethods$1(1, cVar.u, ecn.class, "providePaymentMethods", "providePaymentMethods(Lru/yandex/taxi/eatskit/dto/PaymentMethods;)V", 0));
    }

    @Override // defpackage.x3, defpackage.r250
    public final void a7() {
        super.a7();
        c cVar = this.c;
        fho m = cVar.o.m();
        if (m != null) {
            m.b(false);
        }
        cVar.x.invoke(Boolean.TRUE);
    }
}
