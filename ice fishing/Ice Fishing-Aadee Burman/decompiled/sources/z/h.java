package z;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f42095a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f42096b;

    /* renamed from: c, reason: collision with root package name */
    public int f42097c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f42098d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f42099e;

    /* renamed from: f, reason: collision with root package name */
    public int f42100f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f42101g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f42102h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f42103j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f42104k;

    /* renamed from: l, reason: collision with root package name */
    public int f42105l;

    public final void a(float f3, int i) {
        int i6 = this.f42100f;
        int[] iArr = this.f42098d;
        if (i6 >= iArr.length) {
            this.f42098d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f42099e;
            this.f42099e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f42098d;
        int i9 = this.f42100f;
        iArr2[i9] = i;
        float[] fArr2 = this.f42099e;
        this.f42100f = i9 + 1;
        fArr2[i9] = f3;
    }

    public final void b(int i, int i6) {
        int i9 = this.f42097c;
        int[] iArr = this.f42095a;
        if (i9 >= iArr.length) {
            this.f42095a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f42096b;
            this.f42096b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f42095a;
        int i10 = this.f42097c;
        iArr3[i10] = i;
        int[] iArr4 = this.f42096b;
        this.f42097c = i10 + 1;
        iArr4[i10] = i6;
    }

    public final void c(int i, String str) {
        int i6 = this.i;
        int[] iArr = this.f42101g;
        if (i6 >= iArr.length) {
            this.f42101g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f42102h;
            this.f42102h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f42101g;
        int i9 = this.i;
        iArr2[i9] = i;
        String[] strArr2 = this.f42102h;
        this.i = i9 + 1;
        strArr2[i9] = str;
    }

    public final void d(int i, boolean z3) {
        int i6 = this.f42105l;
        int[] iArr = this.f42103j;
        if (i6 >= iArr.length) {
            this.f42103j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f42104k;
            this.f42104k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f42103j;
        int i9 = this.f42105l;
        iArr2[i9] = i;
        boolean[] zArr2 = this.f42104k;
        this.f42105l = i9 + 1;
        zArr2[i9] = z3;
    }
}
