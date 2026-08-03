package m0;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4747a;

    /* renamed from: b, reason: collision with root package name */
    public int f4748b;

    public r0() {
        this.f4747a = new int[10];
    }

    public int a(int i10) {
        int i11 = this.f4748b - 1;
        return i11 >= 0 ? this.f4747a[i11] : i10;
    }

    public int b() {
        int[] iArr = this.f4747a;
        int i10 = this.f4748b - 1;
        this.f4748b = i10;
        return iArr[i10];
    }

    public void c(int i10) {
        int[] iArr = this.f4747a;
        if (this.f4748b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            pc.j.d(iArr, "copyOf(...)");
            this.f4747a = iArr;
        }
        int i11 = this.f4748b;
        this.f4748b = i11 + 1;
        iArr[i11] = i10;
    }

    public void d(int i10, int i11, int i12) {
        int i13 = this.f4748b;
        int[] iArr = this.f4747a;
        int i14 = i13 + 3;
        if (i14 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            pc.j.d(iArr, "copyOf(...)");
            this.f4747a = iArr;
        }
        iArr[i13] = i10 + i12;
        iArr[i13 + 1] = i11 + i12;
        iArr[i13 + 2] = i12;
        this.f4748b = i14;
    }

    public void e(int i10, int i11, int i12, int i13) {
        int i14 = this.f4748b;
        int[] iArr = this.f4747a;
        int i15 = i14 + 4;
        if (i15 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            pc.j.d(iArr, "copyOf(...)");
            this.f4747a = iArr;
        }
        iArr[i14] = i10;
        iArr[i14 + 1] = i11;
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = i13;
        this.f4748b = i15;
    }

    public void f(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f4747a;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    g(i12, i13);
                }
            }
            g(i12 + 3, i11);
            f(i10, i12);
            f(i12 + 6, i11);
        }
    }

    public void g(int i10, int i11) {
        int[] iArr = this.f4747a;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public r0(int i10) {
        this.f4747a = new int[i10];
    }
}
