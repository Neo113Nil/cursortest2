package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class q71 extends defpackage.mi1 implements defpackage.d20 {
    public /* synthetic */ defpackage.dh1 GE9mJIPrb8gP;
    public /* synthetic */ java.util.List e6mdH7fiFuta;

    @Override // defpackage.d20
    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.q71 q71Var = new defpackage.q71(3, (defpackage.kl) obj3);
        q71Var.e6mdH7fiFuta = (java.util.List) obj;
        q71Var.GE9mJIPrb8gP = (defpackage.dh1) obj2;
        return q71Var.s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        java.util.List list = this.e6mdH7fiFuta;
        defpackage.dh1 dh1Var = this.GE9mJIPrb8gP;
        defpackage.b80.KrtOTfE6jiS2(obj);
        if (dh1Var == null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((com.ice.fishing.wolberta.data.local.Item) obj2).getStyle() == dh1Var) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
