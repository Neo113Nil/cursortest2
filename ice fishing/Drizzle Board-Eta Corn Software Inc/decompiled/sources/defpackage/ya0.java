package defpackage;

import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ya0 implements xg, rw {
    public Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public ya0(re reVar, dh0 dh0Var) {
        this.NCTxEWno = 4;
        this.MdtA4re8 = dh0Var;
    }

    @Override // defpackage.rw
    public wi0 MdtA4re8(View view, wi0 wi0Var) {
        dh0 dh0Var = (dh0) this.MdtA4re8;
        int i = dh0Var.qoPGr6Ce;
        int i2 = dh0Var.NCTxEWno;
        int i3 = dh0Var.MdtA4re8;
        int i4 = wi0Var.qoPGr6Ce.ow5vqvCr().wxUZMvaN + dh0Var.wxUZMvaN;
        boolean z = view.getLayoutDirection() == 1;
        int qoPGr6Ce = wi0Var.qoPGr6Ce();
        int NCTxEWno = wi0Var.NCTxEWno();
        int i5 = i + (z ? NCTxEWno : qoPGr6Ce);
        if (!z) {
            qoPGr6Ce = NCTxEWno;
        }
        view.setPaddingRelative(i5, i2, i3 + qoPGr6Ce, i4);
        return wi0Var;
    }

    @Override // defpackage.xg
    public Object NCTxEWno(yg ygVar, g9 g9Var) {
        int i = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        switch (i) {
            case 1:
                Object NCTxEWno = ((bt) this.MdtA4re8).NCTxEWno(new at(ygVar, 10), g9Var);
                return NCTxEWno == u9Var ? NCTxEWno : xe0Var;
            default:
                Object NCTxEWno2 = ((bt) this.MdtA4re8).NCTxEWno(new at(ygVar, 11), g9Var);
                return NCTxEWno2 == u9Var ? NCTxEWno2 : xe0Var;
        }
    }

    public /* synthetic */ ya0(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    public /* synthetic */ ya0() {
        this.NCTxEWno = 3;
    }
}
