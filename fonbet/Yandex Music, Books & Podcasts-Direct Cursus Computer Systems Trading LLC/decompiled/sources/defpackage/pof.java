package defpackage;

import android.graphics.Canvas;
import android.graphics.Picture;

/* loaded from: classes.dex */
public final class pof extends Picture {
    public final xod a;

    public pof(xod xodVar) {
        this.a = xodVar;
    }

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i, int i2) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        Canvas canvas2 = vd0.a;
        ud0 ud0Var = new ud0();
        ud0Var.a = canvas;
        this.a.c(ud0Var, null);
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return (int) (this.a.u & 4294967295L);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return (int) (this.a.u >> 32);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }
}
