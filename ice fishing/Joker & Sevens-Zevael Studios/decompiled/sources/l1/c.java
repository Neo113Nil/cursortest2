package l1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f3934b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3935c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f3936d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f3937e = f1.q.f2283h;

    /* renamed from: f, reason: collision with root package name */
    public List f3938f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3939g;

    /* renamed from: h, reason: collision with root package name */
    public f1.i f3940h;

    /* renamed from: i, reason: collision with root package name */
    public oc.c f3941i;

    /* renamed from: j, reason: collision with root package name */
    public final a0.a0 f3942j;

    /* renamed from: k, reason: collision with root package name */
    public String f3943k;

    /* renamed from: l, reason: collision with root package name */
    public float f3944l;

    /* renamed from: m, reason: collision with root package name */
    public float f3945m;

    /* renamed from: n, reason: collision with root package name */
    public float f3946n;

    /* renamed from: o, reason: collision with root package name */
    public float f3947o;

    /* renamed from: p, reason: collision with root package name */
    public float f3948p;

    /* renamed from: q, reason: collision with root package name */
    public float f3949q;

    /* renamed from: r, reason: collision with root package name */
    public float f3950r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3951s;

    public c() {
        int i10 = h0.f4034a;
        this.f3938f = bc.v.f1067g;
        this.f3939g = true;
        this.f3942j = new a0.a0(14, this);
        this.f3943k = "";
        this.f3947o = 1.0f;
        this.f3948p = 1.0f;
        this.f3951s = true;
    }

    @Override // l1.c0
    public final void a(h1.d dVar) {
        if (this.f3951s) {
            float[] fArr = this.f3934b;
            if (fArr == null) {
                fArr = f1.d0.i();
                this.f3934b = fArr;
            } else {
                f1.d0.o(fArr);
            }
            f1.d0.x(fArr, this.f3949q + this.f3945m, this.f3950r + this.f3946n);
            float f10 = this.f3944l;
            if (fArr.length >= 16) {
                double d10 = f10 * 0.017453292519943295d;
                float sin = (float) Math.sin(d10);
                float cos = (float) Math.cos(d10);
                float f11 = fArr[0];
                float f12 = fArr[4];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = -sin;
                float f15 = (f12 * cos) + (f11 * f14);
                float f16 = fArr[1];
                float f17 = fArr[5];
                float f18 = (sin * f17) + (cos * f16);
                float f19 = (f17 * cos) + (f16 * f14);
                float f20 = fArr[2];
                float f21 = fArr[6];
                float f22 = (sin * f21) + (cos * f20);
                float f23 = (f21 * cos) + (f20 * f14);
                float f24 = fArr[3];
                float f25 = fArr[7];
                fArr[0] = f13;
                fArr[1] = f18;
                fArr[2] = f22;
                fArr[3] = (sin * f25) + (cos * f24);
                fArr[4] = f15;
                fArr[5] = f19;
                fArr[6] = f23;
                fArr[7] = (cos * f25) + (f14 * f24);
            }
            float f26 = this.f3947o;
            float f27 = this.f3948p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f26;
                fArr[1] = fArr[1] * f26;
                fArr[2] = fArr[2] * f26;
                fArr[3] = fArr[3] * f26;
                fArr[4] = fArr[4] * f27;
                fArr[5] = fArr[5] * f27;
                fArr[6] = fArr[6] * f27;
                fArr[7] = fArr[7] * f27;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            f1.d0.x(fArr, -this.f3945m, -this.f3946n);
            this.f3951s = false;
        }
        if (this.f3939g) {
            if (!this.f3938f.isEmpty()) {
                f1.i iVar = this.f3940h;
                if (iVar == null) {
                    iVar = f1.k.a();
                    this.f3940h = iVar;
                }
                b.d(this.f3938f, iVar);
            }
            this.f3939g = false;
        }
        a5.c A = dVar.A();
        long x10 = A.x();
        A.t().k();
        try {
            a5.c cVar = (a5.c) ((f8.c) A.f262h).f2340h;
            float[] fArr2 = this.f3934b;
            if (fArr2 != null) {
                cVar.t().o(fArr2);
            }
            f1.i iVar2 = this.f3940h;
            if (!this.f3938f.isEmpty() && iVar2 != null) {
                cVar.t().i(iVar2);
            }
            ArrayList arrayList = this.f3935c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c0) arrayList.get(i10)).a(dVar);
            }
        } finally {
            A.t().g();
            A.Q(x10);
        }
    }

    @Override // l1.c0
    public final oc.c b() {
        return this.f3941i;
    }

    @Override // l1.c0
    public final void d(a0.a0 a0Var) {
        this.f3941i = a0Var;
    }

    public final void e(int i10, c0 c0Var) {
        ArrayList arrayList = this.f3935c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.f3942j);
        c();
    }

    public final void f(long j3) {
        if (this.f3936d && j3 != 16) {
            long j6 = this.f3937e;
            if (j6 == 16) {
                this.f3937e = j3;
                return;
            }
            int i10 = h0.f4034a;
            if (f1.q.h(j6) == f1.q.h(j3) && f1.q.g(j6) == f1.q.g(j3) && f1.q.e(j6) == f1.q.e(j3)) {
                return;
            }
            this.f3936d = false;
            this.f3937e = f1.q.f2283h;
        }
    }

    public final void g(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof c) {
                c cVar = (c) c0Var;
                if (cVar.f3936d && this.f3936d) {
                    f(cVar.f3937e);
                    return;
                } else {
                    this.f3936d = false;
                    this.f3937e = f1.q.f2283h;
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        f1.d0 d0Var = hVar.f4015b;
        if (this.f3936d && d0Var != null) {
            if (d0Var instanceof f1.i0) {
                f(((f1.i0) d0Var).f2264e);
            } else {
                this.f3936d = false;
                this.f3937e = f1.q.f2283h;
            }
        }
        f1.d0 d0Var2 = hVar.f4020g;
        if (this.f3936d && d0Var2 != null) {
            if (d0Var2 instanceof f1.i0) {
                f(((f1.i0) d0Var2).f2264e);
            } else {
                this.f3936d = false;
                this.f3937e = f1.q.f2283h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f3943k);
        ArrayList arrayList = this.f3935c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) arrayList.get(i10);
            sb.append("\t");
            sb.append(c0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
