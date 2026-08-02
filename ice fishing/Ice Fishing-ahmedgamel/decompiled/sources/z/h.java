package z;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f42069a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f42070b;

    /* renamed from: c, reason: collision with root package name */
    public int f42071c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f42072d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f42073e;

    /* renamed from: f, reason: collision with root package name */
    public int f42074f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f42075g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f42076h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f42077j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f42078k;

    /* renamed from: l, reason: collision with root package name */
    public int f42079l;

    public final void a(float f2, int i) {
        int i4 = this.f42074f;
        int[] iArr = this.f42072d;
        if (i4 >= iArr.length) {
            this.f42072d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f42073e;
            this.f42073e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f42072d;
        int i6 = this.f42074f;
        iArr2[i6] = i;
        float[] fArr2 = this.f42073e;
        this.f42074f = i6 + 1;
        fArr2[i6] = f2;
    }

    public final void b(int i, int i4) {
        int i6 = this.f42071c;
        int[] iArr = this.f42069a;
        if (i6 >= iArr.length) {
            this.f42069a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f42070b;
            this.f42070b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f42069a;
        int i9 = this.f42071c;
        iArr3[i9] = i;
        int[] iArr4 = this.f42070b;
        this.f42071c = i9 + 1;
        iArr4[i9] = i4;
    }

    public final void c(int i, String str) {
        int i4 = this.i;
        int[] iArr = this.f42075g;
        if (i4 >= iArr.length) {
            this.f42075g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f42076h;
            this.f42076h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f42075g;
        int i6 = this.i;
        iArr2[i6] = i;
        String[] strArr2 = this.f42076h;
        this.i = i6 + 1;
        strArr2[i6] = str;
    }

    public final void d(int i, boolean z6) {
        int i4 = this.f42079l;
        int[] iArr = this.f42077j;
        if (i4 >= iArr.length) {
            this.f42077j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f42078k;
            this.f42078k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f42077j;
        int i6 = this.f42079l;
        iArr2[i6] = i;
        boolean[] zArr2 = this.f42078k;
        this.f42079l = i6 + 1;
        zArr2[i6] = z6;
    }
}
