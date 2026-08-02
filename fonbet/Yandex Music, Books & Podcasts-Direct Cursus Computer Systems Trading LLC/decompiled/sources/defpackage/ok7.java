package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import kotlin.ranges.a;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class ok7 extends gw3 {
    public final /* synthetic */ int a;

    public /* synthetic */ ok7(int i) {
        this.a = i;
    }

    @Override // defpackage.gw3
    public final yx3 b(c3x c3xVar) {
        Integer q0;
        switch (this.a) {
            case 0:
                String str = ((aw3) c3xVar).j;
                if (str.length() != 0 && StringsKt.q0(str) == null) {
                    return yx3.b;
                }
                return null;
            case 1:
                if (StringsKt.r0(10, ((bx3) c3xVar).j) == null) {
                    return yx3.b;
                }
                return null;
            case 2:
                ew3 ew3Var = (ew3) c3xVar;
                String str2 = ew3Var.k;
                if (str2.length() == 2 && (q0 = StringsKt.q0(str2)) != null && q0.intValue() >= 12) {
                    Integer q02 = StringsKt.q0(ew3Var.j);
                    int intValue = q02 != null ? q02.intValue() : 0;
                    if (intValue <= 12 && intValue >= 1) {
                        return null;
                    }
                }
                return yx3.b;
            case 3:
                String str3 = ((bx3) c3xVar).j;
                int i = 0;
                a l = yhn.l(1, yhn.m(0, str3.length()));
                int i2 = l.a;
                int i3 = l.b;
                int i4 = l.c;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    while (true) {
                        Integer q03 = StringsKt.q0(up6.R(i2, 1, str3));
                        if (q03 != null) {
                            int intValue2 = q03.intValue();
                            if ((str3.length() - i2) % 2 == 0 && (intValue2 = intValue2 * 2) > 9) {
                                intValue2 -= 9;
                            }
                            i += intValue2;
                            if (i2 != i3) {
                                i2 += i4;
                            }
                        }
                    }
                }
                if (i % 10 == 0) {
                    return null;
                }
                return yx3.b;
            case 4:
                String str4 = ((dw3) c3xVar).j;
                Locale locale = Locale.US;
                if (new Regex("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])").e(ouj.s(locale, str4, locale))) {
                    return null;
                }
                return yx3.b;
            case 5:
                ((kx3) c3xVar).getClass();
                Locale locale2 = Locale.US;
                if (new Regex("^((\\+7|7|8)+([0-9]){10})$").e(ouj.s(locale2, null, locale2))) {
                    return null;
                }
                return yx3.b;
            default:
                String str5 = ((bx3) c3xVar).j;
                if (str5.equals("") || !up6.S(0, 1, str5).equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                    return null;
                }
                return new edr(null, false);
        }
    }
}
