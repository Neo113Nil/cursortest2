package defpackage;

/* loaded from: classes.dex */
public abstract class df1 {
    public static final android.text.Layout.Alignment IHQe1A4L2xu;
    public static final android.text.Layout.Alignment oh6vYeIP;

    static {
        android.text.Layout.Alignment[] values = android.text.Layout.Alignment.values();
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        android.text.Layout.Alignment alignment2 = alignment;
        for (android.text.Layout.Alignment alignment3 : values) {
            if (defpackage.x70.QoRHpC4k(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (defpackage.x70.QoRHpC4k(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        IHQe1A4L2xu = alignment;
        oh6vYeIP = alignment2;
    }
}
