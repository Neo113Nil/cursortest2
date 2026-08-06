package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class y71 {
    public static final Layout.Alignment GWasM1elztuh;
    public static final Layout.Alignment Yi7zF1RB1;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (o30.rQPn8YBR(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (o30.rQPn8YBR(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        GWasM1elztuh = alignment;
        Yi7zF1RB1 = alignment2;
    }
}
