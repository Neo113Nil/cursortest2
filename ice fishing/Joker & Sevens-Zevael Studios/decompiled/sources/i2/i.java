package i2;

import android.text.Layout;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f3130a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f3131b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (pc.j.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (pc.j.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f3130a = alignment;
        f3131b = alignment2;
    }
}
