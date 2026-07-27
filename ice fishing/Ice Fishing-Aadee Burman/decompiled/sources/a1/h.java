package a1;

import C2.N;
import android.graphics.Color;
import android.graphics.Matrix;
import com.google.android.gms.internal.ads.C2991bm;
import d1.C4443a;
import d1.C4444b;
import f1.AbstractC4498a;
import j1.C4597a;

/* loaded from: classes.dex */
public final class h implements InterfaceC0424a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4498a f4262a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4498a f4263b;

    /* renamed from: c, reason: collision with root package name */
    public final f f4264c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4265d;

    /* renamed from: e, reason: collision with root package name */
    public final i f4266e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4267f;

    /* renamed from: g, reason: collision with root package name */
    public final i f4268g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f4269h;

    public h(AbstractC4498a abstractC4498a, AbstractC4498a abstractC4498a2, N n9) {
        this.f4263b = abstractC4498a;
        this.f4262a = abstractC4498a2;
        AbstractC0428e a9 = ((C4443a) n9.f301u).a();
        this.f4264c = (f) a9;
        a9.a(this);
        abstractC4498a2.d(a9);
        i a10 = ((C4444b) n9.f302v).a();
        this.f4265d = a10;
        a10.a(this);
        abstractC4498a2.d(a10);
        i a11 = ((C4444b) n9.f303w).a();
        this.f4266e = a11;
        a11.a(this);
        abstractC4498a2.d(a11);
        i a12 = ((C4444b) n9.f304x).a();
        this.f4267f = a12;
        a12.a(this);
        abstractC4498a2.d(a12);
        i a13 = ((C4444b) n9.f305y).a();
        this.f4268g = a13;
        a13.a(this);
        abstractC4498a2.d(a13);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4263b.a();
    }

    public final C4597a b(Matrix matrix, int i) {
        float l9 = this.f4266e.l() * 0.017453292f;
        float floatValue = ((Float) this.f4267f.e()).floatValue();
        double d2 = l9;
        float sin = ((float) Math.sin(d2)) * floatValue;
        float cos = ((float) Math.cos(d2 + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.f4268g.e()).floatValue();
        int intValue = ((Integer) this.f4264c.e()).intValue();
        int argb = Color.argb(Math.round((((Float) this.f4265d.e()).floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        C4597a c4597a = new C4597a();
        c4597a.f38296a = floatValue2 * 0.33f;
        c4597a.f38297b = sin;
        c4597a.f38298c = cos;
        c4597a.f38299d = argb;
        c4597a.f38300e = null;
        c4597a.c(matrix);
        if (this.f4269h == null) {
            this.f4269h = new Matrix();
        }
        this.f4262a.f37372w.e().invert(this.f4269h);
        c4597a.c(this.f4269h);
        return c4597a;
    }

    public final void c(C2991bm c2991bm) {
        this.f4265d.j(new g(c2991bm));
    }
}
