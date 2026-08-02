package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes.dex */
public final class c28 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ c28(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 3:
                if ((view instanceof yeu) && (outline2 = ((yeu) view).e) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            case 4:
                view.getClass();
                Outline b = ((xeu) view).e.b();
                b.getClass();
                outline.set(b);
                break;
            case 5:
                view.getClass();
                outline.getClass();
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 0.0f);
                break;
            default:
                view.getClass();
                outline.getClass();
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 0.0f);
                break;
        }
    }
}
