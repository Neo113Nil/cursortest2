package defpackage;

import com.yandex.go.chargers.station.presentation.tariff.ChargersTariffModalView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class vxa implements sxa {
    public final /* synthetic */ ChargersTariffModalView a;

    public vxa(ChargersTariffModalView chargersTariffModalView) {
        this.a = chargersTariffModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        wxa binding;
        wxa binding2;
        CharSequence string;
        wxa binding3;
        wxa binding4;
        wxa binding5;
        wxa binding6;
        wxa binding7;
        kdc kdcVar;
        wxa binding8;
        wxa binding9;
        rxa rxaVar = (rxa) obj;
        ChargersTariffModalView chargersTariffModalView = this.a;
        binding = chargersTariffModalView.getBinding();
        binding.c.success(rxaVar.a);
        binding2 = chargersTariffModalView.getBinding();
        ButtonComponent buttonComponent = binding2.b;
        uo9 uo9Var = rxaVar.b;
        if (uo9Var == null || (string = uo9Var.a) == null) {
            string = chargersTariffModalView.getResources().getString(mzh0.common_got_it);
        }
        buttonComponent.setText(string);
        binding3 = chargersTariffModalView.getBinding();
        binding3.b.setEnabled(uo9Var != null ? uo9Var.c : true);
        binding4 = chargersTariffModalView.getBinding();
        binding4.b.setAccent(uo9Var != null ? uo9Var.e : true);
        if (uo9Var != null && (kdcVar = uo9Var.f) != null) {
            binding8 = chargersTariffModalView.getBinding();
            binding8.b.setButtonBackground(kdcVar);
            binding9 = chargersTariffModalView.getBinding();
            binding9.b.setDisabledButtonBackground(kdcVar);
        }
        binding5 = chargersTariffModalView.getBinding();
        binding5.b.setOutline(0, null);
        binding6 = chargersTariffModalView.getBinding();
        binding6.b.setDebounceClickListener(new l7a(3, chargersTariffModalView, rxaVar));
        binding7 = chargersTariffModalView.getBinding();
        binding7.b.setAlpha((uo9Var == null || !uo9Var.c) ? 0.5f : 1.0f);
    }
}
