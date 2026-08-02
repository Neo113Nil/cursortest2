package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class y390 {
    public static final Text.Resource d;
    public static final Text.Resource e;
    public static final ColorModel.Attr f;
    public static final y390 g;
    public final Text a;
    public final Text b;
    public final q6i0 c;

    static {
        Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_common_design_date_interval_selection_start_date);
        d = h;
        Text.Resource resource = new Text.Resource(dzh0.ybsdk_common_design_date_interval_selection_end_date);
        e = resource;
        f = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
        g = new y390(h, resource, q6i0.e);
    }

    public y390(Text text, Text text2, q6i0 q6i0Var) {
        this.a = text;
        this.b = text2;
        this.c = q6i0Var;
    }

    public static y390 a(y390 y390Var, q6i0 q6i0Var) {
        Text text = y390Var.a;
        Text text2 = y390Var.b;
        y390Var.getClass();
        return new y390(text, text2, q6i0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y390)) {
            return false;
        }
        y390 y390Var = (y390) obj;
        return jl40.l(this.a, y390Var.a) && jl40.l(this.b, y390Var.b) && jl40.l(this.c, y390Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = n.p("PfmCalendarState(startDateLabel=", this.a, ", endDateLabel=", this.b, ", rangePickerState=");
        p.append(this.c);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
