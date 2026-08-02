package defpackage;

import android.text.Editable;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.sbp.ui.home.SbpHomeModalView;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.ygm0;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class wgm0 implements vgm0 {
    public final nzm a;
    public final qzm b;
    public final /* synthetic */ SbpHomeModalView c;

    public wgm0(SbpHomeModalView sbpHomeModalView) {
        xgm0 binding;
        xgm0 binding2;
        this.c = sbpHomeModalView;
        binding = sbpHomeModalView.getBinding();
        this.a = binding.c;
        binding2 = sbpHomeModalView.getBinding();
        this.b = binding2.b;
    }

    @Override // defpackage.vgm0
    public final void J6(List list) {
        ugm0 ugm0Var;
        xgm0 binding;
        boolean isEmpty = list.isEmpty();
        qzm qzmVar = this.b;
        RobotoTextView robotoTextView = (RobotoTextView) qzmVar.e;
        RobotoTextView robotoTextView2 = (RobotoTextView) qzmVar.e;
        boolean z = robotoTextView.getVisibility() != 0 && isEmpty;
        robotoTextView2.setVisibility(isEmpty ? 0 : 8);
        SbpHomeModalView sbpHomeModalView = this.c;
        ugm0Var = sbpHomeModalView.sbpHomeBanksAdapter;
        ugm0Var.submitList(list, null);
        if (z) {
            robotoTextView2.announceForAccessibility(robotoTextView2.getText());
        }
        binding = sbpHomeModalView.getBinding();
        Editable text = ((ListItemInputComponent) binding.b.g).getText();
        if (text == null || text.length() != 0) {
            return;
        }
        sbpHomeModalView.post(new hxj0(24, sbpHomeModalView));
    }

    @Override // defpackage.vgm0
    public final void h6() {
        qzm qzmVar = this.b;
        RobotoTextView robotoTextView = (RobotoTextView) qzmVar.h;
        final SbpHomeModalView sbpHomeModalView = this.c;
        robotoTextView.setText(sbpHomeModalView.getContext().getString(kyh0.sbp_home_bank_list_loading_failed_title));
        ((RobotoTextView) qzmVar.e).setText(sbpHomeModalView.getContext().getString(kyh0.sbp_home_bank_list_loading_failed_message));
        ((ListItemInputComponent) qzmVar.g).setVisibility(8);
        ButtonComponent buttonComponent = (ButtonComponent) qzmVar.b;
        buttonComponent.setVisibility(0);
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.payments.sbp.ui.home.b
            @Override // java.lang.Runnable
            public final void run() {
                ygm0 ygm0Var;
                ygm0Var = SbpHomeModalView.this.presenter;
                pzt0 pzt0Var = ygm0Var.B;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                ygm0Var.B = tje.N(ygm0Var.Jg(), null, null, new SbpHomePresenter$requestSbpTokenHomeInfo$1(ygm0Var, null), 3);
            }
        });
    }

    @Override // defpackage.vgm0
    public final void setLoadingVisibility(boolean z) {
        nzm nzmVar = this.a;
        qzm qzmVar = this.b;
        if (z) {
            ((LinearLayout) nzmVar.b).setVisibility(0);
            ((ConstraintLayout) qzmVar.c).setVisibility(8);
            return;
        }
        boolean z2 = ((ConstraintLayout) qzmVar.c).getVisibility() == 0;
        ((LinearLayout) nzmVar.b).setVisibility(8);
        ((ConstraintLayout) qzmVar.c).setVisibility(0);
        if (z2) {
            return;
        }
        xw31.w((RobotoTextView) qzmVar.h);
    }

    @Override // defpackage.vgm0
    public final void ya(zgm0 zgm0Var) {
        qzm qzmVar = this.b;
        ((RobotoTextView) qzmVar.h).setText(zgm0Var.a);
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) qzmVar.g;
        listItemInputComponent.setHint(zgm0Var.b);
        ((RobotoTextView) qzmVar.e).setText(zgm0Var.c);
        listItemInputComponent.setVisibility(0);
        ((ButtonComponent) qzmVar.b).setVisibility(8);
    }
}
