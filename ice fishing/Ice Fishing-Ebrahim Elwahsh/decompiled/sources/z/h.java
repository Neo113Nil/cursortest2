package z;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f41980a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f41981b;

    /* renamed from: c, reason: collision with root package name */
    public int f41982c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f41983d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f41984e;

    /* renamed from: f, reason: collision with root package name */
    public int f41985f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f41986g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f41987h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f41988j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f41989k;

    /* renamed from: l, reason: collision with root package name */
    public int f41990l;

    public final void a(float f6, int i) {
        int i4 = this.f41985f;
        int[] iArr = this.f41983d;
        if (i4 >= iArr.length) {
            this.f41983d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f41984e;
            this.f41984e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f41983d;
        int i9 = this.f41985f;
        iArr2[i9] = i;
        float[] fArr2 = this.f41984e;
        this.f41985f = i9 + 1;
        fArr2[i9] = f6;
    }

    public final void b(int i, int i4) {
        int i9 = this.f41982c;
        int[] iArr = this.f41980a;
        if (i9 >= iArr.length) {
            this.f41980a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f41981b;
            this.f41981b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f41980a;
        int i10 = this.f41982c;
        iArr3[i10] = i;
        int[] iArr4 = this.f41981b;
        this.f41982c = i10 + 1;
        iArr4[i10] = i4;
    }

    public final void c(int i, String str) {
        int i4 = this.i;
        int[] iArr = this.f41986g;
        if (i4 >= iArr.length) {
            this.f41986g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f41987h;
            this.f41987h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f41986g;
        int i9 = this.i;
        iArr2[i9] = i;
        String[] strArr2 = this.f41987h;
        this.i = i9 + 1;
        strArr2[i9] = str;
    }

    public final void d(int i, boolean z8) {
        int i4 = this.f41990l;
        int[] iArr = this.f41988j;
        if (i4 >= iArr.length) {
            this.f41988j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f41989k;
            this.f41989k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f41988j;
        int i9 = this.f41990l;
        iArr2[i9] = i;
        boolean[] zArr2 = this.f41989k;
        this.f41990l = i9 + 1;
        zArr2[i9] = z8;
    }
}
