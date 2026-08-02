package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class vhb {
    public static final Text a(phb phbVar, CheckType checkType) {
        khb khbVar = khb.d;
        Integer num = phbVar.h;
        ykb1 ykb1Var = phbVar.g;
        Text.Plural plural = null;
        if (ykb1Var instanceof ohb) {
            if (((ohb) ykb1Var).c() instanceof CancellationException) {
                return unr0.h(Text.Companion, dzh0.ybsdk_pin_checking_code);
            }
            if (checkType == CheckType.SET_BIOMETRY || checkType == CheckType.CHANGE_PIN) {
                if (!(ykb1Var instanceof mhb)) {
                    return unr0.h(Text.Companion, dzh0.ybsdk_pin_pin_set_biometric_wrong_input);
                }
                Integer num2 = ((mhb) ykb1Var).b;
                return ((num2 != null && num2.intValue() == 7) || (num2 != null && num2.intValue() == 9)) ? unr0.h(Text.Companion, dzh0.ybsdk_pin_pin_set_biometric_too_many_requests) : unr0.h(Text.Companion, dzh0.ybsdk_common_default_error);
            }
            if (num != null) {
                ykb1Var.equals(khbVar);
                b bVar = Text.Companion;
                int i = gwh0.ybsdk_pin_enter_pin_attempts_remaining;
                int intValue = num.intValue();
                bVar.getClass();
                plural = new Text.Plural(i, intValue);
            }
            return plural == null ? unr0.h(Text.Companion, dzh0.ybsdk_pin_verification_error) : plural;
        }
        if (jl40.l(ykb1Var, khb.b) || jl40.l(ykb1Var, khb.a)) {
            return unr0.h(Text.Companion, dzh0.ybsdk_pin_checking_code);
        }
        if (jl40.l(ykb1Var, khb.c)) {
            int i2 = uhb.a[checkType.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    return unr0.h(Text.Companion, dzh0.ybsdk_pin_biometric_success);
                }
                if (i2 != 5) {
                    w511.b();
                    return null;
                }
            }
            return unr0.h(Text.Companion, dzh0.ybsdk_pin_correct_code);
        }
        if (!jl40.l(ykb1Var, khbVar)) {
            w511.b();
            return null;
        }
        int i3 = uhb.a[checkType.ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            return unr0.h(Text.Companion, dzh0.ybsdk_pin_enter_your_code);
        }
        if (i3 == 4) {
            return unr0.h(Text.Companion, dzh0.ybsdk_pin_enter_your_code);
        }
        if (i3 == 5) {
            return unr0.h(Text.Companion, dzh0.ybsdk_pin_enter_current_pin_code);
        }
        w511.b();
        return null;
    }
}
