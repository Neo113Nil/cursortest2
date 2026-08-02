package defpackage;

import com.yandex.go.scooters.insurance.analytics.InsuranceButton;
import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.insurance.analytics.InsuranceScreen;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;
import com.yandex.go.scooters.insurance.suggest.ScootersInsuranceSuggestModalView;
import defpackage.aun0;
import defpackage.n3o0;
import defpackage.stn0;
import defpackage.tje;
import defpackage.tmm0;
import defpackage.zgz;
import defpackage.zsn0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class vtn0 implements ytn0 {
    public final /* synthetic */ ScootersInsuranceSuggestModalView a;

    public vtn0(ScootersInsuranceSuggestModalView scootersInsuranceSuggestModalView) {
        this.a = scootersInsuranceSuggestModalView;
    }

    @Override // defpackage.ytn0
    public final void e7(Throwable th) {
        tls tlsVar;
        tlsVar = this.a.showErrorDialog;
        tlsVar.invoke(th);
    }

    @Override // defpackage.ytn0
    public final void nc(String str, String str2, final String str3, boolean z) {
        zsn0 zsn0Var;
        wtn0 binding;
        final ScootersInsuranceSuggestModalView scootersInsuranceSuggestModalView = this.a;
        zsn0Var = scootersInsuranceSuggestModalView.scootersInsuranceAnalytics;
        zsn0Var.b(InsuranceOpenReason.BOOK, ScootersInsuranceControl.BUTTON, str3, InsuranceScreen.PRE_BOOK);
        binding = scootersInsuranceSuggestModalView.getBinding();
        RobotoTextView robotoTextView = binding.g;
        ButtonComponent buttonComponent = binding.d;
        robotoTextView.setText(str2);
        binding.f.setTitle(str);
        ListItemComponent listItemComponent = binding.c;
        final int i = 0;
        listItemComponent.setVisibility(z ? 0 : 8);
        buttonComponent.setText(k1b1.a(scootersInsuranceSuggestModalView.getContext(), scootersInsuranceSuggestModalView.getContext().getString(kyh0.scooters_turn_on_insurance_button), str, false));
        binding.e.setDebounceClickListener(new ajl0(26, scootersInsuranceSuggestModalView, str3));
        binding.b.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.insurance.suggest.a
            @Override // java.lang.Runnable
            public final void run() {
                zsn0 zsn0Var2;
                aun0 aun0Var;
                zsn0 zsn0Var3;
                aun0 aun0Var2;
                int i2 = i;
                String str4 = str3;
                ScootersInsuranceSuggestModalView scootersInsuranceSuggestModalView2 = scootersInsuranceSuggestModalView;
                switch (i2) {
                    case 0:
                        zsn0Var2 = scootersInsuranceSuggestModalView2.scootersInsuranceAnalytics;
                        zsn0Var2.c(InsuranceButton.AGREEMENT, ScootersInsuranceControl.BUTTON, str4, InsuranceScreen.PRE_BOOK);
                        aun0Var = scootersInsuranceSuggestModalView2.scootersInsuranceSuggestPresenter;
                        tje.N(aun0Var.Jg(), null, null, new ScootersInsuranceSuggestPresenter$showInsuranceInfo$1(aun0Var, null), 3);
                        break;
                    default:
                        zsn0Var3 = scootersInsuranceSuggestModalView2.scootersInsuranceAnalytics;
                        zsn0Var3.c(InsuranceButton.DETAILS, ScootersInsuranceControl.BUTTON, str4, InsuranceScreen.PRE_BOOK);
                        aun0Var2 = scootersInsuranceSuggestModalView2.scootersInsuranceSuggestPresenter;
                        n3o0 n3o0Var = aun0Var2.A;
                        stn0 stn0Var = n3o0Var != null ? n3o0Var.f : null;
                        if (stn0Var != null) {
                            ((ScootersInsuranceSuggestRouter$provideModalView$4) aun0Var2.B).invoke(stn0Var.a, stn0Var.b);
                            break;
                        } else {
                            zgz.a(null, new IllegalStateException("Insurance provider info is null"));
                            break;
                        }
                }
            }
        });
        final int i2 = 1;
        listItemComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.insurance.suggest.a
            @Override // java.lang.Runnable
            public final void run() {
                zsn0 zsn0Var2;
                aun0 aun0Var;
                zsn0 zsn0Var3;
                aun0 aun0Var2;
                int i22 = i2;
                String str4 = str3;
                ScootersInsuranceSuggestModalView scootersInsuranceSuggestModalView2 = scootersInsuranceSuggestModalView;
                switch (i22) {
                    case 0:
                        zsn0Var2 = scootersInsuranceSuggestModalView2.scootersInsuranceAnalytics;
                        zsn0Var2.c(InsuranceButton.AGREEMENT, ScootersInsuranceControl.BUTTON, str4, InsuranceScreen.PRE_BOOK);
                        aun0Var = scootersInsuranceSuggestModalView2.scootersInsuranceSuggestPresenter;
                        tje.N(aun0Var.Jg(), null, null, new ScootersInsuranceSuggestPresenter$showInsuranceInfo$1(aun0Var, null), 3);
                        break;
                    default:
                        zsn0Var3 = scootersInsuranceSuggestModalView2.scootersInsuranceAnalytics;
                        zsn0Var3.c(InsuranceButton.DETAILS, ScootersInsuranceControl.BUTTON, str4, InsuranceScreen.PRE_BOOK);
                        aun0Var2 = scootersInsuranceSuggestModalView2.scootersInsuranceSuggestPresenter;
                        n3o0 n3o0Var = aun0Var2.A;
                        stn0 stn0Var = n3o0Var != null ? n3o0Var.f : null;
                        if (stn0Var != null) {
                            ((ScootersInsuranceSuggestRouter$provideModalView$4) aun0Var2.B).invoke(stn0Var.a, stn0Var.b);
                            break;
                        } else {
                            zgz.a(null, new IllegalStateException("Insurance provider info is null"));
                            break;
                        }
                }
            }
        });
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.insurance.suggest.b
            @Override // java.lang.Runnable
            public final void run() {
                zsn0 zsn0Var2;
                aun0 aun0Var;
                ScootersInsuranceSuggestModalView scootersInsuranceSuggestModalView2 = ScootersInsuranceSuggestModalView.this;
                zsn0Var2 = scootersInsuranceSuggestModalView2.scootersInsuranceAnalytics;
                InsuranceButton insuranceButton = InsuranceButton.INSURANCE_ON;
                ScootersInsuranceControl scootersInsuranceControl = ScootersInsuranceControl.BUTTON;
                InsuranceScreen insuranceScreen = InsuranceScreen.PRE_BOOK;
                String str4 = str3;
                zsn0Var2.c(insuranceButton, scootersInsuranceControl, str4, insuranceScreen);
                aun0Var = scootersInsuranceSuggestModalView2.scootersInsuranceSuggestPresenter;
                tje.N(aun0Var.Jg(), null, null, new ScootersInsuranceSuggestPresenter$enableFullInsurance$1(aun0Var, new tmm0(20, this, str4), null), 3);
            }
        });
    }

    @Override // defpackage.ytn0
    public final void showLoading() {
        wtn0 binding;
        wtn0 binding2;
        ScootersInsuranceSuggestModalView scootersInsuranceSuggestModalView = this.a;
        binding = scootersInsuranceSuggestModalView.getBinding();
        binding.d.startAnimation();
        binding2 = scootersInsuranceSuggestModalView.getBinding();
        binding2.e.setEnabled(false);
    }
}
