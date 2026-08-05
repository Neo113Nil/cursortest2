package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xh implements w8 {
    public final /* synthetic */ Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ xh(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    @Override // defpackage.w8
    public final void accept(Object obj) {
        switch (this.qoPGr6Ce) {
            case 0:
                yh yhVar = (yh) obj;
                if (yhVar == null) {
                    yhVar = new yh(-3);
                }
                ((mcXgUFR8) this.NCTxEWno).SgZGMMPL(yhVar);
                return;
            default:
                yh yhVar2 = (yh) obj;
                synchronized (zh.MdtA4re8) {
                    try {
                        p70 p70Var = zh.wxUZMvaN;
                        ArrayList arrayList = (ArrayList) p70Var.get((String) this.NCTxEWno);
                        if (arrayList == null) {
                            return;
                        }
                        p70Var.remove((String) this.NCTxEWno);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((w8) arrayList.get(i)).accept(yhVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
