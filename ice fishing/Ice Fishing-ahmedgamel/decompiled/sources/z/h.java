package z;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f42098a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f42099b;

    /* renamed from: c, reason: collision with root package name */
    public int f42100c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f42101d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f42102e;

    /* renamed from: f, reason: collision with root package name */
    public int f42103f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f42104g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f42105h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f42106j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f42107k;

    /* renamed from: l, reason: collision with root package name */
    public int f42108l;

    public final void a(float f3, int i) {
        int i6 = this.f42103f;
        int[] iArr = this.f42101d;
        if (i6 >= iArr.length) {
            this.f42101d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f42102e;
            this.f42102e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f42101d;
        int i9 = this.f42103f;
        iArr2[i9] = i;
        float[] fArr2 = this.f42102e;
        this.f42103f = i9 + 1;
        fArr2[i9] = f3;
    }

    public final void b(int i, int i6) {
        int i9 = this.f42100c;
        int[] iArr = this.f42098a;
        if (i9 >= iArr.length) {
            this.f42098a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f42099b;
            this.f42099b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f42098a;
        int i10 = this.f42100c;
        iArr3[i10] = i;
        int[] iArr4 = this.f42099b;
        this.f42100c = i10 + 1;
        iArr4[i10] = i6;
    }

    public final void c(int i, String str) {
        int i6 = this.i;
        int[] iArr = this.f42104g;
        if (i6 >= iArr.length) {
            this.f42104g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f42105h;
            this.f42105h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f42104g;
        int i9 = this.i;
        iArr2[i9] = i;
        String[] strArr2 = this.f42105h;
        this.i = i9 + 1;
        strArr2[i9] = str;
    }

    public final void d(int i, boolean z3) {
        int i6 = this.f42108l;
        int[] iArr = this.f42106j;
        if (i6 >= iArr.length) {
            this.f42106j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f42107k;
            this.f42107k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f42106j;
        int i9 = this.f42108l;
        iArr2[i9] = i;
        boolean[] zArr2 = this.f42107k;
        this.f42108l = i9 + 1;
        zArr2[i9] = z3;
    }
}
