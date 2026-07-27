package a1;

import B2.N;
import android.graphics.Color;
import android.graphics.Matrix;
import d1.C4455a;
import d1.C4456b;
import f1.AbstractC4490a;
import j1.C4589b;

/* loaded from: classes.dex */
public final class h implements InterfaceC0417a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4490a f4311a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4490a f4312b;

    /* renamed from: c, reason: collision with root package name */
    public final f f4313c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4314d;

    /* renamed from: e, reason: collision with root package name */
    public final i f4315e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4316f;

    /* renamed from: g, reason: collision with root package name */
    public final i f4317g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f4318h;

    public h(AbstractC4490a abstractC4490a, AbstractC4490a abstractC4490a2, N n9) {
        this.f4312b = abstractC4490a;
        this.f4311a = abstractC4490a2;
        AbstractC0421e a9 = ((C4455a) n9.f196u).a();
        this.f4313c = (f) a9;
        a9.a(this);
        abstractC4490a2.e(a9);
        i a10 = ((C4456b) n9.f197v).a();
        this.f4314d = a10;
        a10.a(this);
        abstractC4490a2.e(a10);
        i a11 = ((C4456b) n9.f198w).a();
        this.f4315e = a11;
        a11.a(this);
        abstractC4490a2.e(a11);
        i a12 = ((C4456b) n9.f199x).a();
        this.f4316f = a12;
        a12.a(this);
        abstractC4490a2.e(a12);
        i a13 = ((C4456b) n9.f200y).a();
        this.f4317g = a13;
        a13.a(this);
        abstractC4490a2.e(a13);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4312b.a();
    }

    public final C4589b b(Matrix matrix, int i) {
        float l9 = this.f4315e.l() * 0.017453292f;
        float floatValue = ((Float) this.f4316f.e()).floatValue();
        double d2 = l9;
        float sin = ((float) Math.sin(d2)) * floatValue;
        float cos = ((float) Math.cos(d2 + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.f4317g.e()).floatValue();
        int intValue = ((Integer) this.f4313c.e()).intValue();
        int argb = Color.argb(Math.round((((Float) this.f4314d.e()).floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        C4589b c4589b = new C4589b();
        c4589b.f38479a = floatValue2 * 0.33f;
        c4589b.f38480b = sin;
        c4589b.f38481c = cos;
        c4589b.f38482d = argb;
        c4589b.f38483e = null;
        c4589b.c(matrix);
        if (this.f4318h == null) {
            this.f4318h = new Matrix();
        }
        this.f4311a.f37576w.e().invert(this.f4318h);
        c4589b.c(this.f4318h);
        return c4589b;
    }

    public final void c(S0.s sVar) {
        this.f4314d.j(new g(sVar));
    }
}
