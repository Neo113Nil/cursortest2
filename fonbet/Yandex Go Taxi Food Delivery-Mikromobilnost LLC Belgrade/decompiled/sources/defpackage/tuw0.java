package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import defpackage.tje;
import defpackage.wuw0;
import ru.yandex.taxi.surge.dialog.price_complain.SurgePriceComplainModalView;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

/* loaded from: classes6.dex */
public final class tuw0 implements vuw0 {
    public final /* synthetic */ SurgePriceComplainModalView a;

    public tuw0(SurgePriceComplainModalView surgePriceComplainModalView) {
        this.a = surgePriceComplainModalView;
    }

    @Override // defpackage.vuw0
    public final void R7(gze0 gze0Var) {
        apw0 binding;
        apw0 binding2;
        cvw0 cvw0Var;
        apw0 binding3;
        apw0 binding4;
        apw0 binding5;
        apw0 binding6;
        apw0 binding7;
        apw0 binding8;
        apw0 binding9;
        apw0 binding10;
        apw0 binding11;
        apw0 binding12;
        apw0 binding13;
        apw0 binding14;
        c57 c57Var;
        q47 q47Var = gze0Var.c;
        String str = gze0Var.a;
        final SurgePriceComplainModalView surgePriceComplainModalView = this.a;
        if (q47Var != null) {
            binding14 = surgePriceComplainModalView.getBinding();
            binding14.b.setVisibility(0);
            c57Var = surgePriceComplainModalView.actionButtons;
            ((pm5) c57Var).d(gze0Var.c);
        } else {
            binding = surgePriceComplainModalView.getBinding();
            binding.b.setVisibility(8);
        }
        if (str == null || str.length() == 0) {
            binding2 = surgePriceComplainModalView.getBinding();
            binding2.e.setVisibility(8);
        } else {
            binding12 = surgePriceComplainModalView.getBinding();
            binding12.e.setVisibility(0);
            binding13 = surgePriceComplainModalView.getBinding();
            binding13.e.setText(str);
        }
        cvw0Var = surgePriceComplainModalView.feedBackOptionsAdapter;
        cvw0Var.submitList(gze0Var.b, null);
        fze0 fze0Var = gze0Var.d;
        if (fze0Var.equals(bze0.a)) {
            binding10 = surgePriceComplainModalView.getBinding();
            binding10.c.setEnabled(false);
            binding11 = surgePriceComplainModalView.getBinding();
            binding11.c.setAlpha(0.5f);
            return;
        }
        if (!(fze0Var instanceof cze0)) {
            if (fze0Var.equals(dze0.a)) {
                binding3 = surgePriceComplainModalView.getBinding();
                binding3.c.setVisibility(8);
                return;
            } else {
                if (fze0Var.equals(eze0.a)) {
                    return;
                }
                w511.b();
                return;
            }
        }
        binding4 = surgePriceComplainModalView.getBinding();
        binding4.c.setVisibility(0);
        binding5 = surgePriceComplainModalView.getBinding();
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = binding5.c;
        hmc hmcVar = ((cze0) fze0Var).a;
        keyboardAwareRobotoEditText.setHint(hmcVar.a);
        binding6 = surgePriceComplainModalView.getBinding();
        binding6.c.setTextKeepState(hmcVar.b);
        binding7 = surgePriceComplainModalView.getBinding();
        binding7.c.setEnabled(true);
        binding8 = surgePriceComplainModalView.getBinding();
        binding8.c.setAlpha(1.0f);
        binding9 = surgePriceComplainModalView.getBinding();
        binding9.c.addTextChangedListener(new TextWatcher() { // from class: ru.yandex.taxi.surge.dialog.price_complain.SurgePriceComplainModalView$MvpView$render$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                wuw0 wuw0Var;
                wuw0Var = SurgePriceComplainModalView.this.presenter;
                tje.N(wuw0Var.Jg(), null, null, new SurgePriceComplainPresenter$changeCommentItem$1(wuw0Var, String.valueOf(charSequence), null), 3);
            }
        });
    }
}
