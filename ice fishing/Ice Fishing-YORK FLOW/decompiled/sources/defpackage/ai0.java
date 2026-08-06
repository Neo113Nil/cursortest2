package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ai0 extends defpackage.mi1 implements defpackage.e20 {
    public /* synthetic */ defpackage.mq1 GE9mJIPrb8gP;
    public /* synthetic */ java.lang.String Ns0WNyEWdPsk;
    public /* synthetic */ java.util.List e6mdH7fiFuta;

    @Override // defpackage.e20
    public final java.lang.Object h3m55N1URyyK(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.ai0 ai0Var = new defpackage.ai0(4, (defpackage.kl) obj4);
        ai0Var.e6mdH7fiFuta = (java.util.List) obj;
        ai0Var.GE9mJIPrb8gP = (defpackage.mq1) obj2;
        ai0Var.Ns0WNyEWdPsk = (java.lang.String) obj3;
        return ai0Var.s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        java.util.List list = this.e6mdH7fiFuta;
        defpackage.mq1 mq1Var = this.GE9mJIPrb8gP;
        java.lang.String str = this.Ns0WNyEWdPsk;
        defpackage.b80.KrtOTfE6jiS2(obj);
        if (mq1Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (((com.ice.fishing.wolberta.data.local.Item) obj2).getType() == mq1Var) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        if (str.length() <= 0) {
            return list;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            com.ice.fishing.wolberta.data.local.Item item = (com.ice.fishing.wolberta.data.local.Item) obj3;
            if (defpackage.tg1.Jkfc0NcwyPL8(item.getName(), str, true) || defpackage.tg1.Jkfc0NcwyPL8(item.getType().WDYagTQQm9ns, str, true) || defpackage.tg1.Jkfc0NcwyPL8(item.getStyle().WDYagTQQm9ns, str, true) || defpackage.tg1.Jkfc0NcwyPL8(item.getIcon(), str, false)) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }
}
