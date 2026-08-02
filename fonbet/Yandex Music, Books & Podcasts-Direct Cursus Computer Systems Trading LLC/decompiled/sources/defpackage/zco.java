package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zco implements jx7 {
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public long l;
    public dup m;
    public boolean n;
    public int o;
    public long p;
    public jx7 q;
    public xof r;
    public qwn s;
    public ocg t;

    public final void a(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void b(long j) {
        if (d85.c(this.h, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    public final void c(boolean z) {
        if (this.n != z) {
            this.a |= 16384;
            this.n = z;
        }
    }

    public final void d(int i) {
        if (this.o == i) {
            return;
        }
        this.a |= SQLiteDatabase.OPEN_NOMUTEX;
        this.o = i;
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.q.getDensity();
    }

    public final void h(qwn qwnVar) {
        if (Intrinsics.d(this.s, qwnVar)) {
            return;
        }
        this.a |= SQLiteDatabase.OPEN_SHAREDCACHE;
        this.s = qwnVar;
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.q.i0();
    }

    public final void j(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 1024;
        this.j = f;
    }

    public final void k(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void n(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void o(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void r(dup dupVar) {
        if (Intrinsics.d(this.m, dupVar)) {
            return;
        }
        this.a |= RemoteCameraConfig.Notification.ID;
        this.m = dupVar;
    }

    public final void t(long j) {
        if (d85.c(this.i, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public final void v(long j) {
        if (a7t.a(this.l, j)) {
            return;
        }
        this.a |= 4096;
        this.l = j;
    }

    public final void x(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void y(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }
}
