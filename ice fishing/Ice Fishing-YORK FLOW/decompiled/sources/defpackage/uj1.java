package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class uj1 {
    public static final android.text.Layout.Alignment ZpBGe2uQfcn8;
    public static final android.text.Layout.Alignment giKS3J6vZuNy;

    static {
        android.text.Layout.Alignment[] values = android.text.Layout.Alignment.values();
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        android.text.Layout.Alignment alignment2 = alignment;
        for (android.text.Layout.Alignment alignment3 : values) {
            if (defpackage.ma0.QiMR8OkAhezm(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (defpackage.ma0.QiMR8OkAhezm(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        ZpBGe2uQfcn8 = alignment;
        giKS3J6vZuNy = alignment2;
    }
}
