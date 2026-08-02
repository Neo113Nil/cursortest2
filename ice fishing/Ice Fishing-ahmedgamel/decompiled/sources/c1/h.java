package c1;

import E2.M;
import android.graphics.Color;
import android.graphics.Matrix;
import com.google.android.gms.internal.ads.LP;
import f1.C4515a;
import f1.C4516b;
import h1.AbstractC4563a;
import l1.C4666a;

/* loaded from: classes.dex */
public final class h implements InterfaceC0541a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4563a f5657a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4563a f5658b;

    /* renamed from: c, reason: collision with root package name */
    public final f f5659c;

    /* renamed from: d, reason: collision with root package name */
    public final i f5660d;

    /* renamed from: e, reason: collision with root package name */
    public final i f5661e;

    /* renamed from: f, reason: collision with root package name */
    public final i f5662f;

    /* renamed from: g, reason: collision with root package name */
    public final i f5663g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f5664h;

    public h(AbstractC4563a abstractC4563a, AbstractC4563a abstractC4563a2, M m9) {
        this.f5658b = abstractC4563a;
        this.f5657a = abstractC4563a2;
        AbstractC0545e a9 = ((C4515a) m9.f761u).a();
        this.f5659c = (f) a9;
        a9.a(this);
        abstractC4563a2.f(a9);
        i a10 = ((C4516b) m9.f762v).a();
        this.f5660d = a10;
        a10.a(this);
        abstractC4563a2.f(a10);
        i a11 = ((C4516b) m9.f763w).a();
        this.f5661e = a11;
        a11.a(this);
        abstractC4563a2.f(a11);
        i a12 = ((C4516b) m9.f764x).a();
        this.f5662f = a12;
        a12.a(this);
        abstractC4563a2.f(a12);
        i a13 = ((C4516b) m9.f765y).a();
        this.f5663g = a13;
        a13.a(this);
        abstractC4563a2.f(a13);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5658b.a();
    }

    public final C4666a b(Matrix matrix, int i) {
        float l9 = this.f5661e.l() * 0.017453292f;
        float floatValue = ((Float) this.f5662f.e()).floatValue();
        double d9 = l9;
        float sin = ((float) Math.sin(d9)) * floatValue;
        float cos = ((float) Math.cos(d9 + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.f5663g.e()).floatValue();
        int intValue = ((Integer) this.f5659c.e()).intValue();
        int argb = Color.argb(Math.round((((Float) this.f5660d.e()).floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        C4666a c4666a = new C4666a();
        c4666a.f38808a = floatValue2 * 0.33f;
        c4666a.f38809b = sin;
        c4666a.f38810c = cos;
        c4666a.f38811d = argb;
        c4666a.f38812e = null;
        c4666a.c(matrix);
        if (this.f5664h == null) {
            this.f5664h = new Matrix();
        }
        this.f5657a.f37996w.e().invert(this.f5664h);
        c4666a.c(this.f5664h);
        return c4666a;
    }

    public final void c(LP lp) {
        this.f5660d.j(new g(lp));
    }
}
