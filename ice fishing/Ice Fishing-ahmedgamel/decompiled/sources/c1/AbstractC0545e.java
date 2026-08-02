package c1;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.LP;
import java.util.ArrayList;
import java.util.List;
import m1.C4739a;

/* renamed from: c1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0545e {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0542b f5650c;

    /* renamed from: e, reason: collision with root package name */
    public LP f5652e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5648a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f5649b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f5651d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f5653f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f5654g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f5655h = -1.0f;

    public AbstractC0545e(List list) {
        InterfaceC0542b c0544d;
        if (list.isEmpty()) {
            c0544d = new c4.e();
        } else {
            c0544d = list.size() == 1 ? new C0544d(list) : new C0543c(list);
        }
        this.f5650c = c0544d;
    }

    public final void a(InterfaceC0541a interfaceC0541a) {
        this.f5648a.add(interfaceC0541a);
    }

    public float b() {
        if (this.f5655h == -1.0f) {
            this.f5655h = this.f5650c.j();
        }
        return this.f5655h;
    }

    public final float c() {
        Interpolator interpolator;
        C4739a f2 = this.f5650c.f();
        if (f2 == null || f2.c() || (interpolator = f2.f39343d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.f5649b) {
            return 0.0f;
        }
        C4739a f2 = this.f5650c.f();
        if (f2.c()) {
            return 0.0f;
        }
        return (this.f5651d - f2.b()) / (f2.a() - f2.b());
    }

    public Object e() {
        Interpolator interpolator;
        float d9 = d();
        LP lp = this.f5652e;
        InterfaceC0542b interfaceC0542b = this.f5650c;
        if (lp == null && interfaceC0542b.d(d9) && !k()) {
            return this.f5653f;
        }
        C4739a f2 = interfaceC0542b.f();
        Interpolator interpolator2 = f2.f39344e;
        Object f9 = (interpolator2 == null || (interpolator = f2.f39345f) == null) ? f(f2, c()) : g(f2, d9, interpolator2.getInterpolation(d9), interpolator.getInterpolation(d9));
        this.f5653f = f9;
        return f9;
    }

    public abstract Object f(C4739a c4739a, float f2);

    public Object g(C4739a c4739a, float f2, float f9, float f10) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5648a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0541a) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f2) {
        InterfaceC0542b interfaceC0542b = this.f5650c;
        if (interfaceC0542b.isEmpty()) {
            return;
        }
        if (this.f5654g == -1.0f) {
            this.f5654g = interfaceC0542b.k();
        }
        float f9 = this.f5654g;
        if (f2 < f9) {
            if (f9 == -1.0f) {
                this.f5654g = interfaceC0542b.k();
            }
            f2 = this.f5654g;
        } else if (f2 > b()) {
            f2 = b();
        }
        if (f2 == this.f5651d) {
            return;
        }
        this.f5651d = f2;
        if (interfaceC0542b.g(f2)) {
            h();
        }
    }

    public final void j(LP lp) {
        LP lp2 = this.f5652e;
        if (lp2 != null) {
            lp2.getClass();
        }
        this.f5652e = lp;
    }

    public boolean k() {
        return false;
    }
}
