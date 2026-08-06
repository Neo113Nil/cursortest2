package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0119t f2314b = new C0119t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2315a;

    public F(C0113m c0113m) {
        AbstractC0124y.a(c0113m, "output");
        this.f2315a = c0113m;
        c0113m.f2423a = this;
    }

    public void a(int i2, boolean z2) {
        ((C0113m) this.f2315a).o0(i2, z2);
    }

    public void b(int i2, C0107g c0107g) {
        ((C0113m) this.f2315a).p0(i2, c0107g);
    }

    public void c(int i2, double d2) {
        C0113m c0113m = (C0113m) this.f2315a;
        c0113m.getClass();
        c0113m.t0(i2, Double.doubleToRawLongBits(d2));
    }

    public void d(int i2, int i3) {
        ((C0113m) this.f2315a).v0(i2, i3);
    }

    public void e(int i2, int i3) {
        ((C0113m) this.f2315a).r0(i2, i3);
    }

    public void f(int i2, long j2) {
        ((C0113m) this.f2315a).t0(i2, j2);
    }

    public void g(int i2, float f2) {
        C0113m c0113m = (C0113m) this.f2315a;
        c0113m.getClass();
        c0113m.r0(i2, Float.floatToRawIntBits(f2));
    }

    public void h(int i2, Object obj, W w2) {
        C0113m c0113m = (C0113m) this.f2315a;
        c0113m.z0(i2, 3);
        w2.d((AbstractC0101a) obj, c0113m.f2423a);
        c0113m.z0(i2, 4);
    }

    public void i(int i2, int i3) {
        ((C0113m) this.f2315a).v0(i2, i3);
    }

    public void j(int i2, long j2) {
        ((C0113m) this.f2315a).C0(i2, j2);
    }

    public void k(int i2, Object obj, W w2) {
        C0113m c0113m = (C0113m) this.f2315a;
        AbstractC0101a abstractC0101a = (AbstractC0101a) obj;
        c0113m.z0(i2, 2);
        c0113m.B0(abstractC0101a.a(w2));
        w2.d(abstractC0101a, c0113m.f2423a);
    }

    public void l(int i2, int i3) {
        ((C0113m) this.f2315a).r0(i2, i3);
    }

    public void m(int i2, long j2) {
        ((C0113m) this.f2315a).t0(i2, j2);
    }

    public void n(int i2, int i3) {
        ((C0113m) this.f2315a).A0(i2, (i3 >> 31) ^ (i3 << 1));
    }

    public void o(int i2, long j2) {
        ((C0113m) this.f2315a).C0(i2, (j2 >> 63) ^ (j2 << 1));
    }

    public void p(int i2, int i3) {
        ((C0113m) this.f2315a).A0(i2, i3);
    }

    public void q(int i2, long j2) {
        ((C0113m) this.f2315a).C0(i2, j2);
    }

    public F() {
        T t = T.f2345c;
        Object obj = f2314b;
        try {
            obj = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        L[] lArr = {C0119t.f2458b, obj};
        E e2 = new E();
        e2.f2313a = lArr;
        Charset charset = AbstractC0124y.f2462a;
        this.f2315a = e2;
    }
}
