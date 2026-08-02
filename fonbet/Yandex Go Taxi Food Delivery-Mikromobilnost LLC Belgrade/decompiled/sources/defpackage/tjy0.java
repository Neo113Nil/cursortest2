package defpackage;

import android.text.Layout;

/* loaded from: classes10.dex */
public abstract class tjy0 {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (jl40.l(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (jl40.l(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
