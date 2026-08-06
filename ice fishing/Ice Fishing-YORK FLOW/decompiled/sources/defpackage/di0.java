package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class di0 implements android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final defpackage.pw0 ZpBGe2uQfcn8;
    public final defpackage.pw0 giKS3J6vZuNy;

    public di0(defpackage.fi0 fi0Var) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.ZpBGe2uQfcn8 = defpackage.w60.hH0RRJrNssvh(bool);
        this.giKS3J6vZuNy = defpackage.w60.hH0RRJrNssvh(bool);
    }

    public final void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager accessibilityManager) {
        this.ZpBGe2uQfcn8.setValue(java.lang.Boolean.valueOf(defpackage.fi0.ZpBGe2uQfcn8(accessibilityManager)));
        this.giKS3J6vZuNy.setValue(java.lang.Boolean.valueOf(defpackage.fi0.giKS3J6vZuNy(accessibilityManager)));
    }
}
