package defpackage;

/* loaded from: classes.dex */
public final class po extends android.view.ViewOutlineProvider {
    public final /* synthetic */ int IHQe1A4L2xu;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.Outline outline2;
        switch (this.IHQe1A4L2xu) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                if (!(view instanceof defpackage.tm1) || (outline2 = ((defpackage.tm1) view).riuEU0zW4) == null) {
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
