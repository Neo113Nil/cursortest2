package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes6.dex */
public final class qgo extends ViewOutlineProvider {
    public final float a;
    public final int b;
    public final int c;

    public qgo(float f, pgo pgoVar) {
        int i;
        f = pgoVar == pgo.c ? 0.0f : f;
        this.a = f;
        int ordinal = pgoVar.ordinal();
        int i2 = 0;
        if (ordinal == 0 || ordinal == 1) {
            i = 0;
        } else {
            if (ordinal != 2 && ordinal != 3) {
                b6e.s();
                throw null;
            }
            i = (int) f;
        }
        this.b = i;
        int ordinal2 = pgoVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1 || ordinal2 == 2) {
                i2 = (int) f;
            } else if (ordinal2 != 3) {
                b6e.s();
                throw null;
            }
        }
        this.c = i2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        outline.setRoundRect(0, 0 - this.b, view.getWidth(), view.getHeight() + this.c, this.a);
    }
}
