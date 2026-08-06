package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sx extends android.view.ActionMode.Callback2 implements android.view.ActionMode.Callback {
    public final defpackage.a4 ZpBGe2uQfcn8;

    public sx(defpackage.a4 a4Var) {
        this.ZpBGe2uQfcn8 = a4Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        this.ZpBGe2uQfcn8.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.ZpBGe2uQfcn8.ZpBGe2uQfcn8.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        defpackage.s31 s31Var = (defpackage.s31) this.ZpBGe2uQfcn8.fWTAfUmVKrZq.ZpBGe2uQfcn8();
        rect.set(java.lang.Math.round(s31Var.ZpBGe2uQfcn8), java.lang.Math.round(s31Var.giKS3J6vZuNy), java.lang.Math.round(s31Var.fWTAfUmVKrZq), java.lang.Math.round(s31Var.JhCgjQRTAOCT));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(menu);
    }
}
