package defpackage;

import android.content.Context;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class wpm0 extends lys {
    public static final /* synthetic */ int U = 0;
    public final pav S;
    public final ScootersCardV2.ChargeConfig T;

    public wpm0(ipm0 ipm0Var, pav pavVar, ScootersCardV2.ChargeConfig chargeConfig) {
        super(ipm0Var);
        this.S = pavVar;
        this.T = chargeConfig;
        GoConstraintLayout goConstraintLayout = ipm0Var.a;
        goConstraintLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(c.d(mrg0.go_design_m_space, goConstraintLayout)));
        goConstraintLayout.setClipToOutline(true);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return true;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        String string;
        String H;
        bpm0 bpm0Var = (bpm0) obj;
        ipm0 ipm0Var = (ipm0) ((zo31) this.R);
        GoConstraintLayout goConstraintLayout = ipm0Var.a;
        GoConstraintLayout goConstraintLayout2 = ipm0Var.a;
        goConstraintLayout.setContentDescription(c.H(goConstraintLayout, kyh0.scooters_offer_card_v2_a11y_scooter_with_number, bpm0Var.a.a));
        ipm0Var.d.setText(bpm0Var.a.a);
        ScootersCardV2.ChargeConfig chargeConfig = this.T;
        ScootersCardV2.ChargeConfig.ValueOption valueOption = chargeConfig.c;
        ScootersCardV2.ChargeConfig.ValueOption valueOption2 = ScootersCardV2.ChargeConfig.ValueOption.NONE;
        RobotoTextView robotoTextView = ipm0Var.b;
        if (valueOption == valueOption2) {
            robotoTextView.setVisibility(8);
        } else {
            robotoTextView.setVisibility(0);
            int i = vpm0.a[chargeConfig.c.ordinal()];
            if (i == 1) {
                string = goConstraintLayout2.getContext().getString(kyh0.scooters_percent_template, Integer.valueOf(bpm0Var.e));
                H = c.H(goConstraintLayout2, kyh0.scooters_offer_card_v2_a11y_battery_charge, string);
            } else if (i == 2) {
                Context context = goConstraintLayout2.getContext();
                double d = bpm0Var.d;
                int i2 = kyh0.scooters_remain_distance_on_item_kilometers_template;
                if (d < 1.0d) {
                    d = 0.0d;
                }
                string = ita1.d(i2, (long) Math.rint(d), context);
                H = c.H(goConstraintLayout2, kyh0.scooters_offer_card_v2_a11y_charge_remaining_distance, string);
            } else if (i == 3) {
                string = ita1.b(goConstraintLayout2.getContext(), bpm0Var.c);
                H = c.H(goConstraintLayout2, kyh0.scooters_offer_card_v2_a11y_charge_remaining_time, string);
            } else if (i != 4) {
                w511.b();
                return;
            } else {
                string = "";
                H = "";
            }
            robotoTextView.setText(string);
            robotoTextView.setContentDescription(H);
        }
        a0(((nac) this.S.a(ipm0Var.c)).c(bpm0Var.b));
    }
}
