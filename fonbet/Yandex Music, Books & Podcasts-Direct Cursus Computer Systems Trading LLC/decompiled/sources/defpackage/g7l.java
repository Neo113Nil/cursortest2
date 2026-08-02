package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g7l extends aur implements tyc {
    public /* synthetic */ e6l j;
    public /* synthetic */ boolean k;
    public /* synthetic */ vat l;
    public /* synthetic */ h4q m;
    public final /* synthetic */ k7l n;
    public final /* synthetic */ gkl o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7l(k7l k7lVar, gkl gklVar, Continuation continuation) {
        super(5, continuation);
        this.n = k7lVar;
        this.o = gklVar;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        g7l g7lVar = new g7l(this.n, this.o, (Continuation) obj5);
        g7lVar.j = (e6l) obj;
        g7lVar.k = booleanValue;
        g7lVar.l = (vat) obj3;
        g7lVar.m = (h4q) obj4;
        return g7lVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        n7q n7qVar;
        gkl gklVar = this.o;
        e6l e6lVar = this.j;
        boolean z = this.k;
        vat vatVar = this.l;
        h4q h4qVar = this.m;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        long longValue = ((Number) vatVar.a).longValue();
        long longValue2 = ((Number) vatVar.b).longValue();
        mwk mwkVar = (mwk) vatVar.c;
        d6l x = p6g.x((e6l) this.n.a.a.c.getValue());
        Long l = null;
        boolean d = Intrinsics.d((x == null || (n7qVar = x.a) == null) ? null : n7qVar.b(), mwkVar);
        boolean z2 = (e6lVar instanceof d6l) && ((d6l) e6lVar).b == w0l.b;
        Long l2 = new Long(longValue2);
        long longValue3 = l2.longValue();
        if (d && longValue3 != 0) {
            l = l2;
        }
        float longValue4 = l != null ? longValue / l.longValue() : 0.0f;
        if (!d) {
            longValue2 = 0;
        }
        if (!d) {
            longValue = 0;
        }
        float f = h4qVar.a;
        gklVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean h = ((y0r) ((byb) qdcVar.C(I)).c(ern.a(y0r.class))).h();
        bdt I2 = hag.I(byb.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        return new u7l(z2, z, longValue4, longValue2, longValue, f, h, ((sap) ((byb) qdcVar2.C(I2)).c(ern.a(sap.class))).h());
    }
}
