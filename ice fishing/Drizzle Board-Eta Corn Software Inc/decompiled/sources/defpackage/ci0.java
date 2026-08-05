package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ci0 extends ii0 {
    public final WindowInsets.Builder MdtA4re8;

    public ci0(wi0 wi0Var) {
        super(wi0Var);
        WindowInsets wxUZMvaN = wi0Var.wxUZMvaN();
        this.MdtA4re8 = wxUZMvaN != null ? bi0.MdtA4re8(wxUZMvaN) : bi0.NCTxEWno();
    }

    @Override // defpackage.ii0
    public wi0 NCTxEWno() {
        WindowInsets build;
        qoPGr6Ce();
        build = this.MdtA4re8.build();
        wi0 VgvYg0wo = wi0.VgvYg0wo(build, null);
        si0 si0Var = VgvYg0wo.qoPGr6Ce;
        si0Var.Ey6iv0m0(null);
        si0Var.KlHjfFWx(null);
        si0Var.gjV1z5T1(this.qoPGr6Ce);
        si0Var.WYNAV5pd(this.NCTxEWno);
        return VgvYg0wo;
    }

    @Override // defpackage.ii0
    public void VgvYg0wo(bn bnVar) {
        this.MdtA4re8.setSystemWindowInsets(bnVar.MdtA4re8());
    }

    @Override // defpackage.ii0
    public void wxUZMvaN(bn bnVar) {
        this.MdtA4re8.setStableInsets(bnVar.MdtA4re8());
    }

    public ci0() {
        this.MdtA4re8 = bi0.NCTxEWno();
    }
}
