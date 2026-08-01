package Q6;

import N6.k;
import N6.l;
import N6.o;
import P6.m;
import l6.i;
import n6.C4763e;

/* loaded from: classes2.dex */
public final class b extends l {

    /* renamed from: b, reason: collision with root package name */
    public final long f2646b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2647c;

    /* renamed from: d, reason: collision with root package name */
    public final N6.a f2648d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2649e;

    /* renamed from: f, reason: collision with root package name */
    public final l f2650f;

    /* renamed from: g, reason: collision with root package name */
    public final m[] f2651g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2652h;
    public final C4763e i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2653j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2654k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f2655l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(long j6, long j9, N6.a aVar, byte[] bArr, l lVar, m[] mVarArr, int i, C4763e c4763e, String str, String str2, byte[] bArr2) {
        super(k.b(V6.a.f3287k, bArr2) + (str2 != null ? V6.a.f3286j.f1955c + k.f1989b : 0) + (str == null ? 0 : V6.a.i.f1955c + k.f1988a) + r8 + r16);
        int i6;
        int i9;
        int i10;
        int c9 = k.c(V6.a.f3279b, j9) + k.c(V6.a.f3278a, j6);
        N6.b bVar = V6.a.f3280c;
        int i11 = aVar.f1951a;
        if (i11 == 0) {
            i9 = 0;
        } else {
            int i12 = bVar.f1955c;
            if (i11 >= 0) {
                i6 = N6.d.b(i11);
            } else {
                int i13 = N6.d.f1961e;
                i6 = 10;
            }
            i9 = i12 + i6;
        }
        int b9 = k.b(V6.a.f3281d, bArr) + i9 + c9;
        int b10 = (i == 0 ? 0 : N6.d.b(i) + V6.a.f3284g.f1955c) + k.e(V6.a.f3283f, mVarArr) + (lVar != null ? b9 + k.d(V6.a.f3282e, lVar) : b9);
        N6.b bVar2 = V6.a.f3285h;
        if ((c4763e.f39498b & 255) == 0) {
            i10 = 0;
        } else {
            int i14 = bVar2.f1955c;
            int i15 = N6.d.f1961e;
            i10 = i14 + 4;
        }
        this.f2646b = j6;
        this.f2647c = j9;
        this.f2653j = str;
        this.f2654k = str2;
        this.i = c4763e;
        this.f2648d = aVar;
        this.f2649e = bArr;
        this.f2650f = lVar;
        this.f2651g = mVarArr;
        this.f2652h = i;
        this.f2655l = bArr2;
    }

    public static N6.a d(i iVar) {
        switch (iVar) {
            case UNDEFINED_SEVERITY_NUMBER:
                return V6.d.f3294a;
            case TRACE:
                return V6.d.f3295b;
            case TRACE2:
                return V6.d.f3296c;
            case TRACE3:
                return V6.d.f3297d;
            case TRACE4:
                return V6.d.f3298e;
            case DEBUG:
                return V6.d.f3299f;
            case DEBUG2:
                return V6.d.f3300g;
            case DEBUG3:
                return V6.d.f3301h;
            case DEBUG4:
                return V6.d.i;
            case INFO:
                return V6.d.f3302j;
            case INFO2:
                return V6.d.f3303k;
            case INFO3:
                return V6.d.f3304l;
            case INFO4:
                return V6.d.f3305m;
            case WARN:
                return V6.d.f3306n;
            case WARN2:
                return V6.d.f3307o;
            case ERROR3:
                return V6.d.f3308p;
            case ERROR4:
                return V6.d.f3309q;
            case ERROR:
                return V6.d.f3310r;
            case ERROR4:
                return V6.d.f3311s;
            case ERROR3:
                return V6.d.f3312t;
            case ERROR4:
                return V6.d.f3313u;
            case FATAL:
                return V6.d.f3314v;
            case FATAL2:
                return V6.d.f3315w;
            case FATAL3:
                return V6.d.f3316x;
            case FATAL4:
                return V6.d.f3317y;
            default:
                return V6.d.f3294a;
        }
    }

    @Override // N6.f
    public final void c(o oVar) {
        N6.b bVar = V6.a.f3278a;
        long j6 = this.f2646b;
        if (j6 != 0) {
            oVar.F(bVar, j6);
        }
        N6.b bVar2 = V6.a.f3279b;
        long j9 = this.f2647c;
        if (j9 != 0) {
            oVar.F(bVar2, j9);
        }
        N6.b bVar3 = V6.a.f3280c;
        N6.a aVar = this.f2648d;
        if (aVar.f1951a != 0) {
            oVar.D(bVar3, aVar);
        }
        oVar.n(V6.a.f3281d, this.f2649e);
        l lVar = this.f2650f;
        if (lVar != null) {
            oVar.a(V6.a.f3282e, lVar);
        }
        oVar.k(V6.a.f3283f, this.f2651g);
        N6.b bVar4 = V6.a.f3284g;
        int i = this.f2652h;
        if (i != 0) {
            oVar.b0(bVar4, i);
        }
        N6.b bVar5 = V6.a.f3285h;
        int i6 = this.i.f39498b & 255;
        if (i6 != 0) {
            oVar.E(bVar5, i6);
        }
        N6.b bVar6 = V6.a.i;
        String str = this.f2653j;
        if (str != null) {
            oVar.Z(bVar6, str);
        }
        N6.b bVar7 = V6.a.f3286j;
        String str2 = this.f2654k;
        if (str2 != null) {
            oVar.I(bVar7, str2);
        }
        oVar.n(V6.a.f3287k, this.f2655l);
    }
}
