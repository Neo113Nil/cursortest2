package n0;

import java.util.ArrayList;
import m0.r0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final m0.r f4980a;

    /* renamed from: b, reason: collision with root package name */
    public a f4981b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4982c;

    /* renamed from: f, reason: collision with root package name */
    public int f4985f;

    /* renamed from: g, reason: collision with root package name */
    public int f4986g;

    /* renamed from: l, reason: collision with root package name */
    public int f4991l;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f4983d = new r0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4984e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4987h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f4988i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f4989j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f4990k = -1;

    public b(m0.r rVar, a aVar) {
        this.f4980a = rVar;
        this.f4981b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f4987h;
        if (arrayList.isEmpty()) {
            this.f4986g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i10 = this.f4986g;
        if (i10 > 0) {
            l0 l0Var = this.f4981b.f4978d;
            l0Var.N(g0.f5003c);
            l0Var.f5018f[l0Var.f5019g - l0Var.f5016d[l0Var.f5017e - 1].f5007a] = i10;
            this.f4986g = 0;
        }
        ArrayList arrayList = this.f4987h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f4981b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        aVar.getClass();
        if (size != 0) {
            l0 l0Var2 = aVar.f4978d;
            l0Var2.N(k.f5010c);
            a.a.J(l0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i10 = this.f4991l;
        if (i10 > 0) {
            int i11 = this.f4988i;
            if (i11 >= 0) {
                b();
                l0 l0Var = this.f4981b.f4978d;
                l0Var.N(y.f5038c);
                int i12 = l0Var.f5019g - l0Var.f5016d[l0Var.f5017e - 1].f5007a;
                int[] iArr = l0Var.f5018f;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f4988i = -1;
            } else {
                int i13 = this.f4990k;
                int i14 = this.f4989j;
                b();
                l0 l0Var2 = this.f4981b.f4978d;
                l0Var2.N(v.f5035c);
                int i15 = l0Var2.f5019g - l0Var2.f5016d[l0Var2.f5017e - 1].f5007a;
                int[] iArr2 = l0Var2.f5018f;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.f4989j = -1;
                this.f4990k = -1;
            }
            this.f4991l = 0;
        }
    }

    public final void d(boolean z10) {
        m0.r rVar = this.f4980a;
        int i10 = z10 ? rVar.G.f4622i : rVar.G.f4620g;
        int i11 = i10 - this.f4985f;
        if (i11 < 0) {
            m0.t.c("Tried to seek backward");
        }
        if (i11 > 0) {
            l0 l0Var = this.f4981b.f4978d;
            l0Var.N(d.f4996c);
            l0Var.f5018f[l0Var.f5019g - l0Var.f5016d[l0Var.f5017e - 1].f5007a] = i11;
            this.f4985f = i10;
        }
    }

    public final void e(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                m0.t.c("Invalid remove index " + i10);
            }
            if (this.f4988i == i10) {
                this.f4991l += i11;
                return;
            }
            c();
            this.f4988i = i10;
            this.f4991l = i11;
        }
    }
}
