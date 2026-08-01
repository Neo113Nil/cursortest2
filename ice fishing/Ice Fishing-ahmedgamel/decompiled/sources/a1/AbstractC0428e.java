package a1;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.C2991bm;
import java.util.ArrayList;
import java.util.List;
import k1.C4629a;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0428e {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0425b f4255c;

    /* renamed from: e, reason: collision with root package name */
    public C2991bm f4257e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4253a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f4254b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f4256d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f4258f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f4259g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f4260h = -1.0f;

    public AbstractC0428e(List list) {
        InterfaceC0425b c0427d;
        if (list.isEmpty()) {
            c0427d = new E3.e();
        } else {
            c0427d = list.size() == 1 ? new C0427d(list) : new C0426c(list);
        }
        this.f4255c = c0427d;
    }

    public final void a(InterfaceC0424a interfaceC0424a) {
        this.f4253a.add(interfaceC0424a);
    }

    public float b() {
        if (this.f4260h == -1.0f) {
            this.f4260h = this.f4255c.q();
        }
        return this.f4260h;
    }

    public final float c() {
        Interpolator interpolator;
        C4629a i = this.f4255c.i();
        if (i == null || i.c() || (interpolator = i.f38554d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.f4254b) {
            return 0.0f;
        }
        C4629a i = this.f4255c.i();
        if (i.c()) {
            return 0.0f;
        }
        return (this.f4256d - i.b()) / (i.a() - i.b());
    }

    public Object e() {
        Interpolator interpolator;
        float d2 = d();
        C2991bm c2991bm = this.f4257e;
        InterfaceC0425b interfaceC0425b = this.f4255c;
        if (c2991bm == null && interfaceC0425b.h(d2) && !k()) {
            return this.f4258f;
        }
        C4629a i = interfaceC0425b.i();
        Interpolator interpolator2 = i.f38555e;
        Object f3 = (interpolator2 == null || (interpolator = i.f38556f) == null) ? f(i, c()) : g(i, d2, interpolator2.getInterpolation(d2), interpolator.getInterpolation(d2));
        this.f4258f = f3;
        return f3;
    }

    public abstract Object f(C4629a c4629a, float f3);

    public Object g(C4629a c4629a, float f3, float f9, float f10) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4253a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0424a) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f3) {
        InterfaceC0425b interfaceC0425b = this.f4255c;
        if (interfaceC0425b.isEmpty()) {
            return;
        }
        if (this.f4259g == -1.0f) {
            this.f4259g = interfaceC0425b.r();
        }
        float f9 = this.f4259g;
        if (f3 < f9) {
            if (f9 == -1.0f) {
                this.f4259g = interfaceC0425b.r();
            }
            f3 = this.f4259g;
        } else if (f3 > b()) {
            f3 = b();
        }
        if (f3 == this.f4256d) {
            return;
        }
        this.f4256d = f3;
        if (interfaceC0425b.k(f3)) {
            h();
        }
    }

    public final void j(C2991bm c2991bm) {
        C2991bm c2991bm2 = this.f4257e;
        if (c2991bm2 != null) {
            c2991bm2.getClass();
        }
        this.f4257e = c2991bm;
    }

    public boolean k() {
        return false;
    }
}
