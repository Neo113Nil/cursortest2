package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class f0 {
    public static final defpackage.f0 ZpBGe2uQfcn8 = new defpackage.f0();

    public final void ZpBGe2uQfcn8(android.view.View view, defpackage.a01 a01Var) {
        android.content.Context context = view.getContext();
        android.view.PointerIcon systemIcon = a01Var instanceof defpackage.z2 ? android.view.PointerIcon.getSystemIcon(context, ((defpackage.z2) a01Var).giKS3J6vZuNy) : android.view.PointerIcon.getSystemIcon(context, 1000);
        if (defpackage.ma0.QiMR8OkAhezm(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
