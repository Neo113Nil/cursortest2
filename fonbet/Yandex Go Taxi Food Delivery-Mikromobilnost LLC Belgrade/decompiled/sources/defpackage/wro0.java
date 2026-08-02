package defpackage;

import android.content.Context;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;

/* loaded from: classes6.dex */
public final class wro0 {
    public final Context a;

    public wro0(Context context) {
        this.a = context;
    }

    public final String a(ScootersCardV2.ChargeConfig.ValueOption valueOption, q7p0 q7p0Var) {
        try {
            int i = vro0.a[valueOption.ordinal()];
            Context context = this.a;
            if (i == 1) {
                return ita1.b(context, q7p0Var.b);
            }
            if (i == 2) {
                double d = q7p0Var.c;
                int i2 = kyh0.scooters_remain_distance_on_item_kilometers_template;
                if (d < 1.0d) {
                    d = 0.0d;
                }
                return ita1.d(i2, (long) Math.rint(d), context);
            }
            if (i == 3) {
                return context.getString(kyh0.scooters_percent_template, Integer.valueOf(q7p0Var.a));
            }
            if (i == 4) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            zgz.a(null, e);
            return "";
        }
    }

    public final String b(ScootersCardV2.ChargeConfig.ValueOption valueOption, String str) {
        try {
            int i = vro0.a[valueOption.ordinal()];
            Context context = this.a;
            if (i == 1) {
                return context.getString(kyh0.scooters_offer_card_v2_a11y_charge_remaining_time, Arrays.copyOf(new Object[]{str}, 1));
            }
            if (i == 2) {
                return context.getString(kyh0.scooters_offer_card_v2_a11y_charge_remaining_distance, Arrays.copyOf(new Object[]{str}, 1));
            }
            if (i == 3) {
                return context.getString(kyh0.scooters_offer_card_v2_a11y_battery_charge, Arrays.copyOf(new Object[]{str}, 1));
            }
            if (i == 4) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            zgz.a(null, e);
            return "";
        }
    }
}
