package u;

import java.util.Arrays;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5050f implements Comparable {

    /* renamed from: E, reason: collision with root package name */
    public int f40976E;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40977n;

    /* renamed from: x, reason: collision with root package name */
    public float f40981x;

    /* renamed from: u, reason: collision with root package name */
    public int f40978u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f40979v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f40980w = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40982y = false;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f40983z = new float[9];

    /* renamed from: A, reason: collision with root package name */
    public final float[] f40972A = new float[9];

    /* renamed from: B, reason: collision with root package name */
    public C5046b[] f40973B = new C5046b[16];

    /* renamed from: C, reason: collision with root package name */
    public int f40974C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f40975D = 0;

    public C5050f(int i) {
        this.f40976E = i;
    }

    public final void a(C5046b c5046b) {
        int i = 0;
        while (true) {
            int i6 = this.f40974C;
            if (i >= i6) {
                C5046b[] c5046bArr = this.f40973B;
                if (i6 >= c5046bArr.length) {
                    this.f40973B = (C5046b[]) Arrays.copyOf(c5046bArr, c5046bArr.length * 2);
                }
                C5046b[] c5046bArr2 = this.f40973B;
                int i9 = this.f40974C;
                c5046bArr2[i9] = c5046b;
                this.f40974C = i9 + 1;
                return;
            }
            if (this.f40973B[i] == c5046b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C5046b c5046b) {
        int i = this.f40974C;
        int i6 = 0;
        while (i6 < i) {
            if (this.f40973B[i6] == c5046b) {
                while (i6 < i - 1) {
                    C5046b[] c5046bArr = this.f40973B;
                    int i9 = i6 + 1;
                    c5046bArr[i6] = c5046bArr[i9];
                    i6 = i9;
                }
                this.f40974C--;
                return;
            }
            i6++;
        }
    }

    public final void c() {
        this.f40976E = 5;
        this.f40980w = 0;
        this.f40978u = -1;
        this.f40979v = -1;
        this.f40981x = 0.0f;
        this.f40982y = false;
        int i = this.f40974C;
        for (int i6 = 0; i6 < i; i6++) {
            this.f40973B[i6] = null;
        }
        this.f40974C = 0;
        this.f40975D = 0;
        this.f40977n = false;
        Arrays.fill(this.f40972A, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f40978u - ((C5050f) obj).f40978u;
    }

    public final void d(C5047c c5047c, float f3) {
        this.f40981x = f3;
        this.f40982y = true;
        int i = this.f40974C;
        this.f40979v = -1;
        for (int i6 = 0; i6 < i; i6++) {
            this.f40973B[i6].h(c5047c, this, false);
        }
        this.f40974C = 0;
    }

    public final void e(C5047c c5047c, C5046b c5046b) {
        int i = this.f40974C;
        for (int i6 = 0; i6 < i; i6++) {
            this.f40973B[i6].i(c5047c, c5046b, false);
        }
        this.f40974C = 0;
    }

    public final String toString() {
        return "" + this.f40978u;
    }
}
