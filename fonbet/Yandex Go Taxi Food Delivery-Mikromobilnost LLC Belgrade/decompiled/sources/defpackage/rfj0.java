package defpackage;

import ru.yandex.taxi.ui.RequirementDetailsModalView;

/* loaded from: classes6.dex */
public final class rfj0 implements sfj0 {
    public final /* synthetic */ RequirementDetailsModalView a;

    public rfj0(RequirementDetailsModalView requirementDetailsModalView) {
        this.a = requirementDetailsModalView;
    }

    @Override // defpackage.sfj0
    public final void x4(ola1 ola1Var) {
        p8j binding;
        p8j binding2;
        jfj0 jfj0Var;
        p8j binding3;
        jfj0 jfj0Var2;
        boolean z = ola1Var instanceof jgj0;
        RequirementDetailsModalView requirementDetailsModalView = this.a;
        if (z) {
            binding3 = requirementDetailsModalView.getBinding();
            binding3.b.setVisibility(8);
            jfj0Var2 = requirementDetailsModalView.adapter;
            jfj0Var2.submitList(((jgj0) ola1Var).a, null);
            return;
        }
        if (!(ola1Var instanceof kgj0)) {
            w511.b();
            return;
        }
        kgj0 kgj0Var = (kgj0) ola1Var;
        binding = requirementDetailsModalView.getBinding();
        binding.b.setVisibility(0);
        binding2 = requirementDetailsModalView.getBinding();
        binding2.d.setText(kgj0Var.b);
        jfj0Var = requirementDetailsModalView.adapter;
        jfj0Var.submitList(kgj0Var.a, null);
    }
}
