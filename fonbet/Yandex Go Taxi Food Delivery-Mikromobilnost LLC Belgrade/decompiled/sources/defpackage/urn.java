package defpackage;

import android.widget.FrameLayout;
import com.yandex.go.settings.email.EmailModalView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes13.dex */
public final class urn implements xrn {
    public final /* synthetic */ EmailModalView a;

    public urn(EmailModalView emailModalView) {
        this.a = emailModalView;
    }

    @Override // defpackage.xrn
    public final void Dd(String str) {
        vrn binding;
        vrn binding2;
        vrn binding3;
        EmailModalView emailModalView = this.a;
        binding = emailModalView.getBinding();
        binding.d.setValue(str);
        binding2 = emailModalView.getBinding();
        AnimatedListItemInputComponent animatedListItemInputComponent = binding2.d;
        binding3 = emailModalView.getBinding();
        animatedListItemInputComponent.setSelection(binding3.d.value().length());
    }

    @Override // defpackage.xrn
    public final void Mc(boolean z) {
        vrn binding;
        binding = this.a.getBinding();
        binding.f.setToolbarItemVisibility(z);
    }

    @Override // defpackage.xrn
    public final void N1(int i, boolean z) {
        vrn binding;
        vrn binding2;
        EmailModalView emailModalView = this.a;
        binding = emailModalView.getBinding();
        binding.e.setText(i);
        binding2 = emailModalView.getBinding();
        binding2.e.setEnabled(z);
    }

    @Override // defpackage.xrn
    public final void Re() {
        vrn binding;
        vrn binding2;
        EmailModalView emailModalView = this.a;
        binding = emailModalView.getBinding();
        binding.d.requestFocus();
        binding2 = emailModalView.getBinding();
        AnimatedListItemInputComponent animatedListItemInputComponent = binding2.d;
        animatedListItemInputComponent.post(new xd2(animatedListItemInputComponent, 1));
    }

    @Override // defpackage.xrn
    public final void T4(String str) {
        vrn binding;
        binding = this.a.getBinding();
        binding.c.setText(str);
    }

    @Override // defpackage.xrn
    public final void dismiss() {
        this.a.processGoBack();
    }

    @Override // defpackage.xrn
    public final void hideKeyboard() {
        vrn binding;
        binding = this.a.getBinding();
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.d;
        animatedListItemInputComponent.post(new ce0(animatedListItemInputComponent, 15));
    }

    @Override // defpackage.xrn
    public final void setProgressing(boolean z) {
        vrn binding;
        vrn binding2;
        EmailModalView emailModalView = this.a;
        emailModalView.isProgressing = z;
        if (z) {
            yes0 yes0Var = SimpleSpinnerModalView.Companion;
            binding2 = emailModalView.getBinding();
            FrameLayout frameLayout = binding2.b;
            yes0Var.getClass();
            yes0.c(frameLayout, false, false);
            return;
        }
        yes0 yes0Var2 = SimpleSpinnerModalView.Companion;
        binding = emailModalView.getBinding();
        FrameLayout frameLayout2 = binding.b;
        yes0Var2.getClass();
        yes0.b(frameLayout2);
    }
}
