package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class lj implements zk {
    public final /* synthetic */ li MdtA4re8;
    public final /* synthetic */ nj NCTxEWno;
    public final /* synthetic */ ut wxUZMvaN;

    public /* synthetic */ lj(nj njVar, li liVar, ut utVar) {
        this.NCTxEWno = njVar;
        this.MdtA4re8 = liVar;
        this.wxUZMvaN = utVar;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        vo voVar = (vo) obj;
        nj njVar = this.NCTxEWno;
        ArrayList arrayList = njVar.b2ZJblxo;
        boolean isEmpty = arrayList.isEmpty();
        li liVar = this.MdtA4re8;
        boolean z = false;
        if (!isEmpty) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                if (fn.qoPGr6Ce(((hx) obj2).NCTxEWno, liVar.DK9slbsy)) {
                    z = true;
                    break;
                }
            }
        }
        if (voVar != null && !z) {
            bk lDXGDhIF = liVar.lDXGDhIF();
            lDXGDhIF.MdtA4re8();
            xo xoVar = lDXGDhIF.P7K7Inc8;
            if (xoVar.MdtA4re8.compareTo(po.wxUZMvaN) >= 0) {
                xoVar.qoPGr6Ce((uo) njVar.jb9XjC4I.ow5vqvCr(this.wxUZMvaN));
            }
        }
        return xe0.qoPGr6Ce;
    }
}
