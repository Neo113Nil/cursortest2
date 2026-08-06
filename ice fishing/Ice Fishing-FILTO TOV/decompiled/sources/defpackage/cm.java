package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cm extends ViewOutlineProvider {
    public final /* synthetic */ int GWasM1elztuh;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.GWasM1elztuh) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                if (!(view instanceof ue1) || (outline2 = ((ue1) view).mOu10nynGul) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
