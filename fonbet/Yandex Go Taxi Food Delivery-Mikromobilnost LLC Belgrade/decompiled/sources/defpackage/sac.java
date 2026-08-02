package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class sac implements q7v {
    public final w06 a;
    public final ebv b;

    public sac(w06 w06Var, ebv ebvVar) {
        this.a = w06Var;
        this.b = ebvVar;
    }

    @Override // defpackage.q7v
    public final boolean a() {
        this.a.getClass();
        return true;
    }

    @Override // defpackage.q7v
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // defpackage.q7v
    public final int getHeight() {
        return this.a.a.getHeight();
    }

    @Override // defpackage.q7v
    public final long getSize() {
        return this.a.getSize();
    }

    @Override // defpackage.q7v
    public final int getWidth() {
        return this.a.a.getWidth();
    }
}
