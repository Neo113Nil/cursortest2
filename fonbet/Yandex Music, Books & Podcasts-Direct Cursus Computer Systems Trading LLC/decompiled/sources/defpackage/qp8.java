package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes3.dex */
public final class qp8 extends ViewOutlineProvider {
    public final /* synthetic */ int a = 0;
    public float b;

    public qp8(float f) {
        this.b = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                int width = view.getWidth();
                int height = view.getHeight();
                float f = this.b;
                float width2 = view.getWidth();
                float height2 = view.getHeight();
                float f2 = 0.0f;
                if (height2 > 0.0f && width2 > 0.0f) {
                    float min = Math.min(height2, width2) / 2;
                    if (f > min) {
                        int i = i9f.a;
                    }
                    f2 = Math.min(f, min);
                }
                outline.setRoundRect(0, 0, width, height, f2);
                break;
            default:
                view.getClass();
                outline.getClass();
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.b);
                break;
        }
    }

    public /* synthetic */ qp8() {
    }
}
