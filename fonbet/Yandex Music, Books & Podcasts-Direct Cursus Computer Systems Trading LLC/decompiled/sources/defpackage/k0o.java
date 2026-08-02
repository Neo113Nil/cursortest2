package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class k0o extends dt2 {
    public k0o A;
    public k0o B;
    public final boolean C = true;
    public boolean D;
    public boolean E;
    public final Context t;
    public final b1o u;
    public final Class v;
    public final jld w;
    public x5d x;
    public Object y;
    public ArrayList z;

    static {
    }

    public k0o(a aVar, b1o b1oVar, Class cls, Context context) {
        g1o g1oVar;
        this.u = b1oVar;
        this.v = cls;
        this.t = context;
        xy0 xy0Var = b1oVar.a.c.f;
        x5d x5dVar = (x5d) xy0Var.get(cls);
        if (x5dVar == null) {
            Iterator it = ((sy0) xy0Var.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    x5dVar = (x5d) entry.getValue();
                }
            }
        }
        this.x = x5dVar == null ? jld.k : x5dVar;
        this.w = aVar.c;
        Iterator it2 = b1oVar.i.iterator();
        while (it2.hasNext()) {
            y((vbp) it2.next());
        }
        synchronized (b1oVar) {
            g1oVar = b1oVar.j;
        }
        b(g1oVar);
    }

    @Override // defpackage.dt2
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final k0o b(dt2 dt2Var) {
        w1g.r(dt2Var);
        return (k0o) super.b(dt2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e0o B(Object obj, j6s j6sVar, p0o p0oVar, x5d x5dVar, nsm nsmVar, int i, int i2, dt2 dt2Var) {
        p0o p0oVar2;
        p0o p0oVar3;
        dt2 dt2Var2;
        jlq jlqVar;
        nsm nsmVar2;
        if (this.B != null) {
            p0oVar3 = new ogb(obj, p0oVar);
            p0oVar2 = p0oVar3;
        } else {
            p0oVar2 = null;
            p0oVar3 = p0oVar;
        }
        k0o k0oVar = this.A;
        if (k0oVar == null) {
            Context context = this.t;
            jld jldVar = this.w;
            dt2Var2 = dt2Var;
            jlqVar = new jlq(context, jldVar, obj, this.y, this.v, dt2Var2, i, i2, nsmVar, j6sVar, this.z, p0oVar3, jldVar.g, x5dVar.a);
        } else {
            if (this.E) {
                xq0.q("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            x5d x5dVar2 = k0oVar.C ? x5dVar : k0oVar.x;
            if (dt2.i(k0oVar.a, 8)) {
                nsmVar2 = this.A.c;
            } else {
                int ordinal = nsmVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    nsmVar2 = nsm.a;
                } else if (ordinal == 2) {
                    nsmVar2 = nsm.b;
                } else {
                    if (ordinal != 3) {
                        kac.l(this.c, "unknown priority: ");
                        return null;
                    }
                    nsmVar2 = nsm.c;
                }
            }
            nsm nsmVar3 = nsmVar2;
            k0o k0oVar2 = this.A;
            int i3 = k0oVar2.i;
            int i4 = k0oVar2.h;
            if (xut.j(i, i2)) {
                k0o k0oVar3 = this.A;
                if (!xut.j(k0oVar3.i, k0oVar3.h)) {
                    i3 = dt2Var.i;
                    i4 = dt2Var.h;
                }
            }
            int i5 = i4;
            jgs jgsVar = new jgs(obj, p0oVar3);
            Context context2 = this.t;
            jgs jgsVar2 = jgsVar;
            jld jldVar2 = this.w;
            jlq jlqVar2 = new jlq(context2, jldVar2, obj, this.y, this.v, dt2Var, i, i2, nsmVar, j6sVar, this.z, jgsVar2, jldVar2.g, x5dVar.a);
            this.E = true;
            k0o k0oVar4 = this.A;
            e0o B = k0oVar4.B(obj, j6sVar, jgsVar2, x5dVar2, nsmVar3, i3, i5, k0oVar4);
            this.E = false;
            jgsVar2.c = jlqVar2;
            jgsVar2.d = B;
            dt2Var2 = dt2Var;
            jlqVar = jgsVar2;
        }
        if (p0oVar2 == null) {
            return jlqVar;
        }
        k0o k0oVar5 = this.B;
        int i6 = k0oVar5.i;
        int i7 = k0oVar5.h;
        if (xut.j(i, i2)) {
            k0o k0oVar6 = this.B;
            if (!xut.j(k0oVar6.i, k0oVar6.h)) {
                i6 = dt2Var2.i;
                i7 = dt2Var2.h;
            }
        }
        int i8 = i7;
        k0o k0oVar7 = this.B;
        ogb ogbVar = p0oVar2;
        e0o B2 = k0oVar7.B(obj, j6sVar, ogbVar, k0oVar7.x, k0oVar7.c, i6, i8, k0oVar7);
        ogbVar.c = jlqVar;
        ogbVar.d = B2;
        return ogbVar;
    }

    @Override // defpackage.dt2
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final k0o clone() {
        k0o k0oVar = (k0o) super.clone();
        k0oVar.x = k0oVar.x.clone();
        if (k0oVar.z != null) {
            k0oVar.z = new ArrayList(k0oVar.z);
        }
        k0o k0oVar2 = k0oVar.A;
        if (k0oVar2 != null) {
            k0oVar.A = k0oVar2.clone();
        }
        k0o k0oVar3 = k0oVar.B;
        if (k0oVar3 != null) {
            k0oVar.B = k0oVar3.clone();
        }
        return k0oVar;
    }

    public final void E(j6s j6sVar, dt2 dt2Var) {
        w1g.r(j6sVar);
        if (!this.D) {
            xq0.x("You must call #load() before calling #into()");
            return;
        }
        e0o B = B(new Object(), j6sVar, null, this.x, dt2Var.c, dt2Var.i, dt2Var.h, dt2Var);
        e0o f = j6sVar.f();
        if (B.f(f) && (dt2Var.g || !f.e())) {
            w1g.s(f, "Argument must not be null");
            if (f.isRunning()) {
                return;
            }
            f.k();
            return;
        }
        this.u.j(j6sVar);
        j6sVar.h(B);
        b1o b1oVar = this.u;
        synchronized (b1oVar) {
            b1oVar.f.a.add(j6sVar);
            fmq fmqVar = b1oVar.d;
            ((Set) fmqVar.c).add(B);
            if (fmqVar.b) {
                B.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) fmqVar.d).add(B);
            } else {
                B.k();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(ImageView imageView) {
        dt2 dt2Var;
        Class cls;
        o33 o33Var;
        xut.a();
        w1g.r(imageView);
        if (!dt2.i(this.a, 2048) && imageView.getScaleType() != null) {
            switch (i0o.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    dt2Var = clone().j(wla.d, new aa4());
                    break;
                case 2:
                    dt2Var = clone().j(wla.c, new ba4());
                    dt2Var.r = true;
                    break;
                case 3:
                case 4:
                case 5:
                    dt2Var = clone().j(wla.b, new hfc());
                    dt2Var.r = true;
                    break;
                case 6:
                    dt2Var = clone().j(wla.c, new ba4());
                    dt2Var.r = true;
                    break;
            }
            this.w.c.getClass();
            cls = this.v;
            if (!Bitmap.class.equals(cls)) {
                o33Var = new o33(imageView, 0);
            } else {
                if (!Drawable.class.isAssignableFrom(cls)) {
                    wvs.g(cls, ", try .as*(Class).transcode(ResourceTranscoder)", "Unhandled class: ");
                    return;
                }
                o33Var = new o33(imageView, 1);
            }
            E(o33Var, dt2Var);
        }
        dt2Var = this;
        this.w.c.getClass();
        cls = this.v;
        if (!Bitmap.class.equals(cls)) {
        }
        E(o33Var, dt2Var);
    }

    public final k0o G(vbp vbpVar) {
        if (this.q) {
            return clone().G(vbpVar);
        }
        this.z = null;
        return y(vbpVar);
    }

    public final k0o H(Uri uri) {
        PackageInfo packageInfo;
        k0o I = I(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return I;
        }
        Context context = this.t;
        k0o k0oVar = (k0o) I.u(context.getTheme());
        ConcurrentHashMap concurrentHashMap = lw0.a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = lw0.a;
        daf dafVar = (daf) concurrentHashMap2.get(packageName);
        if (dafVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            vhj vhjVar = new vhj(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            daf dafVar2 = (daf) concurrentHashMap2.putIfAbsent(packageName, vhjVar);
            dafVar = dafVar2 == null ? vhjVar : dafVar2;
        }
        return (k0o) k0oVar.s(new hi0(context.getResources().getConfiguration().uiMode & 48, dafVar));
    }

    public final k0o I(Object obj) {
        if (this.q) {
            return clone().I(obj);
        }
        this.y = obj;
        this.D = true;
        q();
        return this;
    }

    @Override // defpackage.dt2
    public final boolean equals(Object obj) {
        if (!(obj instanceof k0o)) {
            return false;
        }
        k0o k0oVar = (k0o) obj;
        return super.equals(k0oVar) && Objects.equals(this.v, k0oVar.v) && this.x.equals(k0oVar.x) && Objects.equals(this.y, k0oVar.y) && Objects.equals(this.z, k0oVar.z) && Objects.equals(this.A, k0oVar.A) && Objects.equals(this.B, k0oVar.B) && this.C == k0oVar.C && this.D == k0oVar.D;
    }

    @Override // defpackage.dt2
    public final int hashCode() {
        return xut.g(this.D ? 1 : 0, xut.g(this.C ? 1 : 0, xut.h(xut.h(xut.h(xut.h(xut.h(xut.h(xut.h(super.hashCode(), this.v), this.x), this.y), this.z), this.A), this.B), null)));
    }

    public final k0o y(vbp vbpVar) {
        if (this.q) {
            return clone().y(vbpVar);
        }
        if (vbpVar != null) {
            if (this.z == null) {
                this.z = new ArrayList();
            }
            this.z.add(vbpVar);
        }
        q();
        return this;
    }
}
