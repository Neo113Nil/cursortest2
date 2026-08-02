package defpackage;

import com.yandex.go.intercity.flex.dashboard.point_selection.IntercityPointSelectionModalView;

/* loaded from: classes12.dex */
public final class wow implements zmw {
    public final /* synthetic */ IntercityPointSelectionModalView a;

    public wow(IntercityPointSelectionModalView intercityPointSelectionModalView) {
        this.a = intercityPointSelectionModalView;
    }

    @Override // defpackage.zmw
    public final void Vd() {
        xkr binding;
        binding = this.a.getBinding();
        binding.d.setVisibility(8);
    }

    @Override // defpackage.zmw
    public final void j8(ga0 ga0Var) {
        xkr binding;
        xkr binding2;
        IntercityPointSelectionModalView intercityPointSelectionModalView = this.a;
        binding = intercityPointSelectionModalView.getBinding();
        binding.c.setTitle(ga0Var.a);
        binding2 = intercityPointSelectionModalView.getBinding();
        binding2.b.setText(ga0Var.b);
    }

    @Override // defpackage.zmw
    public final void zf(rg7 rg7Var) {
        xkr binding;
        xkr binding2;
        xkr binding3;
        xkr binding4;
        xkr binding5;
        pav pavVar;
        xkr binding6;
        IntercityPointSelectionModalView intercityPointSelectionModalView = this.a;
        binding = intercityPointSelectionModalView.getBinding();
        binding.d.setVisibility(0);
        String str = rg7Var.c;
        if (str == null || str.length() == 0) {
            binding2 = intercityPointSelectionModalView.getBinding();
            binding2.d.getLeadImageView().setVisibility(8);
        } else {
            binding5 = intercityPointSelectionModalView.getBinding();
            binding5.d.getLeadImageView().setVisibility(0);
            pavVar = intercityPointSelectionModalView.imageLoader;
            binding6 = intercityPointSelectionModalView.getBinding();
            ((nac) pavVar.a(binding6.d.getLeadImageView())).c(str);
        }
        binding3 = intercityPointSelectionModalView.getBinding();
        binding3.d.setTitle(rg7Var.a);
        binding4 = intercityPointSelectionModalView.getBinding();
        binding4.d.setSubtitle(rg7Var.b);
    }
}
