package yads;

import com.yandex.mobile.ads.common.AdActivity;
import defpackage.av71;
import defpackage.b281;
import defpackage.sj71;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public enum o8 {
    BROWSER_CONTROL_PANEL_HEIGHT,
    BROWSER_CONTROL_PANEL_BUTTON_PADDING,
    BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE;

    public static final av71 c;
    public static final Map d;
    public final b281 b = new b281();

    static {
        o8 o8Var = BROWSER_CONTROL_PANEL_HEIGHT;
        o8 o8Var2 = BROWSER_CONTROL_PANEL_BUTTON_PADDING;
        o8 o8Var3 = BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE;
        c = new av71();
        d = b.l(new Pair(av71.a("values_dimen_%s", o8Var.name()), 48), new Pair(av71.a("values_dimen_%s_sw600dp", o8Var.name()), 56), new Pair(av71.a("values_dimen_%s", o8Var2.name()), 15), new Pair(av71.a("values_dimen_%s_sw600dp", o8Var2.name()), 17), new Pair(av71.a("values_dimen_%s", o8Var3.name()), 19), new Pair(av71.a("values_dimen_%s_sw600dp", o8Var3.name()), 23));
    }

    o8() {
    }

    public final int a(AdActivity adActivity) {
        try {
            av71 av71Var = c;
            StringBuilder sb = new StringBuilder(name());
            int g = sj71.g(adActivity);
            int d2 = sj71.d(adActivity);
            if (g > d2) {
                g = d2;
            }
            if (g >= 600) {
                sb.append("_sw600dp");
            }
            String sb2 = sb.toString();
            av71Var.getClass();
            Integer num = (Integer) d.get(av71.a("values_dimen_%s", sb2));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            av71 av71Var2 = c;
            String name = this.name();
            av71Var2.getClass();
            Integer num2 = (Integer) d.get(av71.a("values_dimen_%s", name));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
