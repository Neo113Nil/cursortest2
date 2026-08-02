package Q6;

import N6.k;
import N6.l;
import N6.o;
import P6.m;
import l6.i;
import n6.C4779e;

/* loaded from: classes2.dex */
public final class b extends l {

    /* renamed from: b, reason: collision with root package name */
    public final long f2683b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2684c;

    /* renamed from: d, reason: collision with root package name */
    public final N6.a f2685d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2686e;

    /* renamed from: f, reason: collision with root package name */
    public final l f2687f;

    /* renamed from: g, reason: collision with root package name */
    public final m[] f2688g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2689h;
    public final C4779e i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2690j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2691k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f2692l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(long j6, long j9, N6.a aVar, byte[] bArr, l lVar, m[] mVarArr, int i, C4779e c4779e, String str, String str2, byte[] bArr2) {
        super(k.b(V6.a.f3417k, bArr2) + (str2 != null ? V6.a.f3416j.f2043c + k.f2077b : 0) + (str == null ? 0 : V6.a.i.f2043c + k.f2076a) + r8 + r16);
        int i4;
        int i6;
        int i9;
        int c9 = k.c(V6.a.f3409b, j9) + k.c(V6.a.f3408a, j6);
        N6.b bVar = V6.a.f3410c;
        int i10 = aVar.f2039a;
        if (i10 == 0) {
            i6 = 0;
        } else {
            int i11 = bVar.f2043c;
            if (i10 >= 0) {
                i4 = N6.d.b(i10);
            } else {
                int i12 = N6.d.f2049e;
                i4 = 10;
            }
            i6 = i11 + i4;
        }
        int b9 = k.b(V6.a.f3411d, bArr) + i6 + c9;
        int b10 = (i == 0 ? 0 : N6.d.b(i) + V6.a.f3414g.f2043c) + k.e(V6.a.f3413f, mVarArr) + (lVar != null ? b9 + k.d(V6.a.f3412e, lVar) : b9);
        N6.b bVar2 = V6.a.f3415h;
        if ((c4779e.f39665b & 255) == 0) {
            i9 = 0;
        } else {
            int i13 = bVar2.f2043c;
            int i14 = N6.d.f2049e;
            i9 = i13 + 4;
        }
        this.f2683b = j6;
        this.f2684c = j9;
        this.f2690j = str;
        this.f2691k = str2;
        this.i = c4779e;
        this.f2685d = aVar;
        this.f2686e = bArr;
        this.f2687f = lVar;
        this.f2688g = mVarArr;
        this.f2689h = i;
        this.f2692l = bArr2;
    }

    public static N6.a d(i iVar) {
        switch (iVar) {
            case UNDEFINED_SEVERITY_NUMBER:
                return V6.d.f3424a;
            case TRACE:
                return V6.d.f3425b;
            case TRACE2:
                return V6.d.f3426c;
            case TRACE3:
                return V6.d.f3427d;
            case TRACE4:
                return V6.d.f3428e;
            case DEBUG:
                return V6.d.f3429f;
            case DEBUG2:
                return V6.d.f3430g;
            case DEBUG3:
                return V6.d.f3431h;
            case DEBUG4:
                return V6.d.i;
            case INFO:
                return V6.d.f3432j;
            case INFO2:
                return V6.d.f3433k;
            case INFO3:
                return V6.d.f3434l;
            case INFO4:
                return V6.d.f3435m;
            case WARN:
                return V6.d.f3436n;
            case WARN2:
                return V6.d.f3437o;
            case ERROR3:
                return V6.d.f3438p;
            case ERROR4:
                return V6.d.f3439q;
            case ERROR:
                return V6.d.f3440r;
            case ERROR4:
                return V6.d.f3441s;
            case ERROR3:
                return V6.d.f3442t;
            case ERROR4:
                return V6.d.f3443u;
            case FATAL:
                return V6.d.f3444v;
            case FATAL2:
                return V6.d.f3445w;
            case FATAL3:
                return V6.d.f3446x;
            case FATAL4:
                return V6.d.f3447y;
            default:
                return V6.d.f3424a;
        }
    }

    @Override // N6.f
    public final void c(o oVar) {
        N6.b bVar = V6.a.f3408a;
        long j6 = this.f2683b;
        if (j6 != 0) {
            oVar.F(bVar, j6);
        }
        N6.b bVar2 = V6.a.f3409b;
        long j9 = this.f2684c;
        if (j9 != 0) {
            oVar.F(bVar2, j9);
        }
        N6.b bVar3 = V6.a.f3410c;
        N6.a aVar = this.f2685d;
        if (aVar.f2039a != 0) {
            oVar.D(bVar3, aVar);
        }
        oVar.n(V6.a.f3411d, this.f2686e);
        l lVar = this.f2687f;
        if (lVar != null) {
            oVar.a(V6.a.f3412e, lVar);
        }
        oVar.k(V6.a.f3413f, this.f2688g);
        N6.b bVar4 = V6.a.f3414g;
        int i = this.f2689h;
        if (i != 0) {
            oVar.b0(bVar4, i);
        }
        N6.b bVar5 = V6.a.f3415h;
        int i4 = this.i.f39665b & 255;
        if (i4 != 0) {
            oVar.E(bVar5, i4);
        }
        N6.b bVar6 = V6.a.i;
        String str = this.f2690j;
        if (str != null) {
            oVar.Z(bVar6, str);
        }
        N6.b bVar7 = V6.a.f3416j;
        String str2 = this.f2691k;
        if (str2 != null) {
            oVar.I(bVar7, str2);
        }
        oVar.n(V6.a.f3417k, this.f2692l);
    }
}
