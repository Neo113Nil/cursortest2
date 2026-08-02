package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class gbu {
    public final mj3 a;
    public final ebu b;
    public final fbu c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public gbu(Context context) {
        DisplayManager displayManager;
        mj3 mj3Var = new mj3();
        mj3Var.d = new vfc();
        mj3Var.e = new vfc();
        mj3Var.b = -9223372036854775807L;
        this.a = mj3Var;
        ebu ebuVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new ebu(this, displayManager);
        this.b = ebuVar;
        this.c = ebuVar != null ? fbu.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(gbu gbuVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            gbuVar.k = refreshRate;
            gbuVar.l = (refreshRate * 80) / 100;
        } else {
            vq1.n0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            gbuVar.k = -9223372036854775807L;
            gbuVar.l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (dvt.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        qdq.Q(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        float f;
        float f2;
        if (dvt.a < 30 || this.e == null) {
            return;
        }
        mj3 mj3Var = this.a;
        if (!((vfc) mj3Var.d).a()) {
            f = this.f;
        } else if (((vfc) mj3Var.d).a()) {
            f = (float) (1.0E9d / (((vfc) mj3Var.d).e != 0 ? r2.f / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (((vfc) mj3Var.d).a()) {
                if ((((vfc) mj3Var.d).a() ? ((vfc) mj3Var.d).f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                    if (Math.abs(f - this.g) < f2) {
                        return;
                    }
                }
            }
            f2 = 1.0f;
            if (Math.abs(f - this.g) < f2) {
            }
        } else if (f == -1.0f && mj3Var.c < 30) {
            return;
        }
        this.g = f;
        d(false);
    }

    public final void d(boolean z) {
        Surface surface;
        float f;
        if (dvt.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                qdq.Q(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
        qdq.Q(surface, f);
    }
}
