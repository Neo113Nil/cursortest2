package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jq extends android.view.ViewOutlineProvider {
    public final /* synthetic */ int ZpBGe2uQfcn8;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.Outline outline2;
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                if (!(view instanceof defpackage.gu1) || (outline2 = ((defpackage.gu1) view).e6mdH7fiFuta) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                view.getClass();
                throw new java.lang.ClassCastException();
        }
    }
}
