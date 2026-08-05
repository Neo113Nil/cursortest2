package defpackage;

import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c50 extends bb0 implements hl {
    public /* synthetic */ n2 P7K7Inc8;
    public /* synthetic */ List Qr9iLBAD;
    public /* synthetic */ List b2ZJblxo;
    public /* synthetic */ xx eVhOlqcC;
    public /* synthetic */ et jb9XjC4I;
    public final /* synthetic */ d50 k3x7lurq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c50(d50 d50Var, eh ehVar) {
        super(6, ehVar);
        this.k3x7lurq = d50Var;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        n2 n2Var = this.P7K7Inc8;
        List list = this.b2ZJblxo;
        List list2 = this.Qr9iLBAD;
        et etVar = this.jb9XjC4I;
        xx xxVar = this.eVhOlqcC;
        fn.SgZGMMPL(obj);
        kb0 kb0Var = etVar.qoPGr6Ce;
        boolean z = false;
        if (xxVar != null && xxVar.KlHjfFWx <= 0 && etVar.MdtA4re8 != xxVar.qoPGr6Ce) {
            z = true;
        }
        return new g2(n2Var, list, list2, kb0Var, xxVar, z);
    }

    @Override // defpackage.hl
    public final Object VgvYg0wo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, eh ehVar) {
        c50 c50Var = new c50(this.k3x7lurq, ehVar);
        c50Var.P7K7Inc8 = (n2) obj;
        c50Var.b2ZJblxo = (List) obj2;
        c50Var.Qr9iLBAD = (List) obj3;
        c50Var.jb9XjC4I = (et) obj4;
        c50Var.eVhOlqcC = (xx) obj5;
        return c50Var.OxcuoDLp(xe0.qoPGr6Ce);
    }
}
