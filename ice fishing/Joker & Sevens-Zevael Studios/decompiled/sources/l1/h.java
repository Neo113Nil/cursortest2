package l1;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public f1.d0 f4015b;

    /* renamed from: c, reason: collision with root package name */
    public float f4016c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f4017d;

    /* renamed from: e, reason: collision with root package name */
    public float f4018e;

    /* renamed from: f, reason: collision with root package name */
    public float f4019f;

    /* renamed from: g, reason: collision with root package name */
    public f1.d0 f4020g;

    /* renamed from: h, reason: collision with root package name */
    public int f4021h;

    /* renamed from: i, reason: collision with root package name */
    public int f4022i;

    /* renamed from: j, reason: collision with root package name */
    public float f4023j;

    /* renamed from: k, reason: collision with root package name */
    public float f4024k;

    /* renamed from: l, reason: collision with root package name */
    public float f4025l;

    /* renamed from: m, reason: collision with root package name */
    public float f4026m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4027n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4028o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4029p;

    /* renamed from: q, reason: collision with root package name */
    public h1.g f4030q;

    /* renamed from: r, reason: collision with root package name */
    public final f1.i f4031r;

    /* renamed from: s, reason: collision with root package name */
    public f1.i f4032s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f4033t;

    public h() {
        int i10 = h0.f4034a;
        this.f4017d = bc.v.f1067g;
        this.f4018e = 1.0f;
        this.f4021h = 0;
        this.f4022i = 0;
        this.f4023j = 4.0f;
        this.f4025l = 1.0f;
        this.f4027n = true;
        this.f4028o = true;
        f1.i a6 = f1.k.a();
        this.f4031r = a6;
        this.f4032s = a6;
        this.f4033t = bc.a0.x(g.f4002h);
    }

    @Override // l1.c0
    public final void a(h1.d dVar) {
        h1.d dVar2;
        h1.g gVar;
        if (this.f4027n) {
            b.d(this.f4017d, this.f4031r);
            e();
        } else if (this.f4029p) {
            e();
        }
        this.f4027n = false;
        this.f4029p = false;
        f1.d0 d0Var = this.f4015b;
        if (d0Var != null) {
            dVar2 = dVar;
            h1.d.o(dVar2, this.f4032s, d0Var, this.f4016c, null, 56);
        } else {
            dVar2 = dVar;
        }
        f1.d0 d0Var2 = this.f4020g;
        if (d0Var2 != null) {
            h1.g gVar2 = this.f4030q;
            if (this.f4028o || gVar2 == null) {
                h1.g gVar3 = new h1.g(this.f4019f, this.f4023j, this.f4021h, this.f4022i, 16);
                this.f4030q = gVar3;
                this.f4028o = false;
                gVar = gVar3;
            } else {
                gVar = gVar2;
            }
            h1.d.o(dVar2, this.f4032s, d0Var2, this.f4018e, gVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ac.f, java.lang.Object] */
    public final void e() {
        float f10 = this.f4024k;
        f1.i iVar = this.f4031r;
        if (f10 == 0.0f && this.f4025l == 1.0f) {
            this.f4032s = iVar;
            return;
        }
        if (pc.j.a(this.f4032s, iVar)) {
            this.f4032s = f1.k.a();
        } else {
            Path.FillType fillType = this.f4032s.f2261a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z10 = fillType == fillType2;
            this.f4032s.f2261a.rewind();
            Path path = this.f4032s.f2261a;
            if (!z10) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f4033t;
        ((f1.j) r02.getValue()).f2265a.setPath(iVar != null ? iVar.f2261a : null, false);
        float length = ((f1.j) r02.getValue()).f2265a.getLength();
        float f11 = this.f4024k;
        float f12 = this.f4026m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f4025l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((f1.j) r02.getValue()).a(f13, f14, this.f4032s);
        } else {
            ((f1.j) r02.getValue()).a(f13, length, this.f4032s);
            ((f1.j) r02.getValue()).a(0.0f, f14, this.f4032s);
        }
    }

    public final String toString() {
        return this.f4031r.toString();
    }
}
