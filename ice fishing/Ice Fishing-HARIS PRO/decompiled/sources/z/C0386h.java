package z;

import java.util.Arrays;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4859a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4860b;

    /* renamed from: c, reason: collision with root package name */
    public int f4861c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4862d;
    public float[] e;

    /* renamed from: f, reason: collision with root package name */
    public int f4863f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4864g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f4865h;
    public int i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4866k;

    /* renamed from: l, reason: collision with root package name */
    public int f4867l;

    public final void a(int i, float f2) {
        int i2 = this.f4863f;
        int[] iArr = this.f4862d;
        if (i2 >= iArr.length) {
            this.f4862d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4862d;
        int i3 = this.f4863f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f4863f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4861c;
        int[] iArr = this.f4859a;
        if (i3 >= iArr.length) {
            this.f4859a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4860b;
            this.f4860b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4859a;
        int i4 = this.f4861c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4860b;
        this.f4861c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4867l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4866k;
            this.f4866k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.f4867l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4866k;
        this.f4867l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4864g;
        if (i2 >= iArr.length) {
            this.f4864g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4865h;
            this.f4865h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4864g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.f4865h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
