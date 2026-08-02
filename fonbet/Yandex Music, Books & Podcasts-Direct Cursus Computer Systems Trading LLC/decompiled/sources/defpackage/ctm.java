package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class ctm implements dzf {
    public static final ctm i = new ctm();
    public int a;
    public int b;
    public Handler e;
    public final dyg g;
    public final cib h;
    public boolean c = true;
    public boolean d = true;
    public final gzf f = new gzf(this);

    public ctm() {
        int i2 = 23;
        this.g = new dyg(i2, this);
        this.h = new cib(i2, this);
    }

    public final void a() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.g(kyf.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.g);
            }
        }
    }

    @Override // defpackage.dzf
    public final nyf getLifecycle() {
        return this.f;
    }
}
