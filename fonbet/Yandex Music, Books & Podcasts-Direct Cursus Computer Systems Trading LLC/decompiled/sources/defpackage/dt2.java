package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public abstract class dt2 implements Cloneable {
    public int a;
    public int d;
    public Drawable e;
    public int f;
    public boolean k;
    public boolean o;
    public Resources.Theme p;
    public boolean q;
    public boolean s;
    public x68 b = x68.d;
    public nsm c = nsm.c;
    public boolean g = true;
    public int h = -1;
    public int i = -1;
    public daf j = r5b.b;
    public pwj l = new pwj();
    public er3 m = new er3(0);
    public Class n = Object.class;
    public boolean r = true;

    public static boolean i(int i, int i2) {
        return (i & i2) != 0;
    }

    public dt2 b(dt2 dt2Var) {
        if (this.q) {
            return clone().b(dt2Var);
        }
        int i = dt2Var.a;
        if (i(dt2Var.a, 1048576)) {
            this.s = dt2Var.s;
        }
        if (i(dt2Var.a, 4)) {
            this.b = dt2Var.b;
        }
        if (i(dt2Var.a, 8)) {
            this.c = dt2Var.c;
        }
        if (i(dt2Var.a, 16)) {
            this.d = 0;
            this.a &= -33;
        }
        if (i(dt2Var.a, 32)) {
            this.d = dt2Var.d;
            this.a &= -17;
        }
        if (i(dt2Var.a, 64)) {
            this.e = dt2Var.e;
            this.f = 0;
            this.a &= -129;
        }
        if (i(dt2Var.a, 128)) {
            this.f = dt2Var.f;
            this.e = null;
            this.a &= -65;
        }
        if (i(dt2Var.a, 256)) {
            this.g = dt2Var.g;
        }
        if (i(dt2Var.a, RemoteCameraConfig.Mic.BUFFER_SIZE)) {
            this.i = dt2Var.i;
            this.h = dt2Var.h;
        }
        if (i(dt2Var.a, 1024)) {
            this.j = dt2Var.j;
        }
        if (i(dt2Var.a, 4096)) {
            this.n = dt2Var.n;
        }
        if (i(dt2Var.a, RemoteCameraConfig.Notification.ID)) {
            this.a &= -16385;
        }
        if (i(dt2Var.a, 16384)) {
            this.a &= -8193;
        }
        if (i(dt2Var.a, SQLiteDatabase.OPEN_NOMUTEX)) {
            this.p = dt2Var.p;
        }
        if (i(dt2Var.a, SQLiteDatabase.OPEN_SHAREDCACHE)) {
            this.k = dt2Var.k;
        }
        if (i(dt2Var.a, 2048)) {
            this.m.putAll(dt2Var.m);
            this.r = dt2Var.r;
        }
        this.a |= dt2Var.a;
        this.l.b.g(dt2Var.l.b);
        q();
        return this;
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public dt2 clone() {
        try {
            dt2 dt2Var = (dt2) super.clone();
            pwj pwjVar = new pwj();
            dt2Var.l = pwjVar;
            pwjVar.b.g(this.l.b);
            er3 er3Var = new er3(0);
            dt2Var.m = er3Var;
            er3Var.putAll(this.m);
            dt2Var.o = false;
            dt2Var.q = false;
            return dt2Var;
        } catch (CloneNotSupportedException e) {
            b6e.q(e);
            return null;
        }
    }

    public final dt2 d(Class cls) {
        if (this.q) {
            return clone().d(cls);
        }
        this.n = cls;
        this.a |= 4096;
        q();
        return this;
    }

    public final dt2 e(x68 x68Var) {
        if (this.q) {
            return clone().e(x68Var);
        }
        this.b = x68Var;
        this.a |= 4;
        q();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dt2)) {
            return false;
        }
        dt2 dt2Var = (dt2) obj;
        if (Float.compare(1.0f, 1.0f) != 0 || this.d != dt2Var.d) {
            return false;
        }
        char[] cArr = xut.a;
        return this.f == dt2Var.f && xut.b(this.e, dt2Var.e) && this.g == dt2Var.g && this.h == dt2Var.h && this.i == dt2Var.i && this.k == dt2Var.k && this.b.equals(dt2Var.b) && this.c == dt2Var.c && this.l.equals(dt2Var.l) && this.m.equals(dt2Var.m) && this.n.equals(dt2Var.n) && this.j.equals(dt2Var.j) && xut.b(this.p, dt2Var.p);
    }

    public final dt2 f() {
        if (this.q) {
            return clone().f();
        }
        int i = this.a | 16;
        this.d = 0;
        this.a = i & (-33);
        q();
        return this;
    }

    public final dt2 g() {
        if (this.q) {
            return clone().g();
        }
        this.d = 2131232476;
        this.a = (this.a | 32) & (-17);
        q();
        return this;
    }

    public final dt2 h() {
        if (this.q) {
            return clone().h();
        }
        this.a = (this.a | RemoteCameraConfig.Notification.ID) & (-16385);
        q();
        return this;
    }

    public int hashCode() {
        char[] cArr = xut.a;
        return xut.h(xut.h(xut.h(xut.h(xut.h(xut.h(xut.h(xut.g(0, xut.g(0, xut.g(1, xut.g(this.k ? 1 : 0, xut.g(this.i, xut.g(this.h, xut.g(this.g ? 1 : 0, xut.h(xut.g(0, xut.h(xut.g(this.f, xut.h(xut.g(this.d, xut.g(Float.floatToIntBits(1.0f), 17)), null)), this.e)), null)))))))), this.b), this.c), this.l), this.m), this.n), this.j), this.p);
    }

    public final dt2 j(wla wlaVar, u33 u33Var) {
        if (this.q) {
            return clone().j(wlaVar, u33Var);
        }
        r(wla.g, wlaVar);
        return v(u33Var, false);
    }

    public final dt2 k(int i, int i2) {
        if (this.q) {
            return clone().k(i, i2);
        }
        this.i = i;
        this.h = i2;
        this.a |= RemoteCameraConfig.Mic.BUFFER_SIZE;
        q();
        return this;
    }

    public final dt2 l(int i) {
        if (this.q) {
            return clone().l(i);
        }
        this.f = i;
        int i2 = this.a | 128;
        this.e = null;
        this.a = i2 & (-65);
        q();
        return this;
    }

    public final dt2 m(Drawable drawable) {
        if (this.q) {
            return clone().m(drawable);
        }
        this.e = drawable;
        int i = this.a | 64;
        this.f = 0;
        this.a = i & (-129);
        q();
        return this;
    }

    public final dt2 n() {
        if (this.q) {
            return clone().n();
        }
        this.c = nsm.d;
        this.a |= 8;
        q();
        return this;
    }

    public final dt2 p(cvj cvjVar) {
        if (this.q) {
            return clone().p(cvjVar);
        }
        this.l.b.remove(cvjVar);
        q();
        return this;
    }

    public final void q() {
        if (this.o) {
            xq0.q("You cannot modify locked T, consider clone()");
        }
    }

    public final dt2 r(cvj cvjVar, Object obj) {
        if (this.q) {
            return clone().r(cvjVar, obj);
        }
        w1g.r(cvjVar);
        w1g.r(obj);
        this.l.b.put(cvjVar, obj);
        q();
        return this;
    }

    public final dt2 s(daf dafVar) {
        if (this.q) {
            return clone().s(dafVar);
        }
        this.j = dafVar;
        this.a |= 1024;
        q();
        return this;
    }

    public final dt2 t() {
        if (this.q) {
            return clone().t();
        }
        this.g = false;
        this.a |= 256;
        q();
        return this;
    }

    public final dt2 u(Resources.Theme theme) {
        if (this.q) {
            return clone().u(theme);
        }
        this.p = theme;
        int i = this.a;
        if (theme != null) {
            this.a = i | SQLiteDatabase.OPEN_NOMUTEX;
            return r(q2o.b, theme);
        }
        this.a = (-32769) & i;
        return p(q2o.b);
    }

    public final dt2 v(d7t d7tVar, boolean z) {
        if (this.q) {
            return clone().v(d7tVar, z);
        }
        spa spaVar = new spa(d7tVar, z);
        w(Bitmap.class, d7tVar, z);
        w(Drawable.class, spaVar, z);
        w(BitmapDrawable.class, spaVar, z);
        w(pcd.class, new rcd(d7tVar), z);
        q();
        return this;
    }

    public final dt2 w(Class cls, d7t d7tVar, boolean z) {
        if (this.q) {
            return clone().w(cls, d7tVar, z);
        }
        w1g.r(d7tVar);
        this.m.put(cls, d7tVar);
        int i = this.a;
        this.a = 67584 | i;
        this.r = false;
        if (z) {
            this.a = i | 198656;
            this.k = true;
        }
        q();
        return this;
    }

    public final dt2 x() {
        if (this.q) {
            return clone().x();
        }
        this.s = true;
        this.a |= 1048576;
        q();
        return this;
    }
}
