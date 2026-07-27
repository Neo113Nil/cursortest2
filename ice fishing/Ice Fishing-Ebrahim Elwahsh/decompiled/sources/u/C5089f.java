package u;

import java.util.Arrays;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5089f implements Comparable {

    /* renamed from: E, reason: collision with root package name */
    public int f40993E;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40994n;

    /* renamed from: x, reason: collision with root package name */
    public float f40998x;

    /* renamed from: u, reason: collision with root package name */
    public int f40995u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f40996v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f40997w = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40999y = false;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f41000z = new float[9];

    /* renamed from: A, reason: collision with root package name */
    public final float[] f40989A = new float[9];

    /* renamed from: B, reason: collision with root package name */
    public C5085b[] f40990B = new C5085b[16];

    /* renamed from: C, reason: collision with root package name */
    public int f40991C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f40992D = 0;

    public C5089f(int i) {
        this.f40993E = i;
    }

    public final void a(C5085b c5085b) {
        int i = 0;
        while (true) {
            int i4 = this.f40991C;
            if (i >= i4) {
                C5085b[] c5085bArr = this.f40990B;
                if (i4 >= c5085bArr.length) {
                    this.f40990B = (C5085b[]) Arrays.copyOf(c5085bArr, c5085bArr.length * 2);
                }
                C5085b[] c5085bArr2 = this.f40990B;
                int i9 = this.f40991C;
                c5085bArr2[i9] = c5085b;
                this.f40991C = i9 + 1;
                return;
            }
            if (this.f40990B[i] == c5085b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C5085b c5085b) {
        int i = this.f40991C;
        int i4 = 0;
        while (i4 < i) {
            if (this.f40990B[i4] == c5085b) {
                while (i4 < i - 1) {
                    C5085b[] c5085bArr = this.f40990B;
                    int i9 = i4 + 1;
                    c5085bArr[i4] = c5085bArr[i9];
                    i4 = i9;
                }
                this.f40991C--;
                return;
            }
            i4++;
        }
    }

    public final void c() {
        this.f40993E = 5;
        this.f40997w = 0;
        this.f40995u = -1;
        this.f40996v = -1;
        this.f40998x = 0.0f;
        this.f40999y = false;
        int i = this.f40991C;
        for (int i4 = 0; i4 < i; i4++) {
            this.f40990B[i4] = null;
        }
        this.f40991C = 0;
        this.f40992D = 0;
        this.f40994n = false;
        Arrays.fill(this.f40989A, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f40995u - ((C5089f) obj).f40995u;
    }

    public final void d(C5086c c5086c, float f6) {
        this.f40998x = f6;
        this.f40999y = true;
        int i = this.f40991C;
        this.f40996v = -1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f40990B[i4].h(c5086c, this, false);
        }
        this.f40991C = 0;
    }

    public final void e(C5086c c5086c, C5085b c5085b) {
        int i = this.f40991C;
        for (int i4 = 0; i4 < i; i4++) {
            this.f40990B[i4].i(c5086c, c5085b, false);
        }
        this.f40991C = 0;
    }

    public final String toString() {
        return "" + this.f40995u;
    }
}
