package defpackage;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public class vtk implements ttk {
    public final Magnifier a;

    public vtk(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.ttk
    public void a(long j, long j2) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (this.a.getHeight() & 4294967295L) | (this.a.getWidth() << 32);
    }

    public final void d() {
        this.a.update();
    }
}
