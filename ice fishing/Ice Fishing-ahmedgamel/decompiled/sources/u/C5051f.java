package u;

import java.util.Arrays;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5051f implements Comparable {

    /* renamed from: E, reason: collision with root package name */
    public int f40941E;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40942n;

    /* renamed from: x, reason: collision with root package name */
    public float f40946x;

    /* renamed from: u, reason: collision with root package name */
    public int f40943u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f40944v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f40945w = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40947y = false;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f40948z = new float[9];

    /* renamed from: A, reason: collision with root package name */
    public final float[] f40937A = new float[9];

    /* renamed from: B, reason: collision with root package name */
    public C5047b[] f40938B = new C5047b[16];

    /* renamed from: C, reason: collision with root package name */
    public int f40939C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f40940D = 0;

    public C5051f(int i) {
        this.f40941E = i;
    }

    public final void a(C5047b c5047b) {
        int i = 0;
        while (true) {
            int i4 = this.f40939C;
            if (i >= i4) {
                C5047b[] c5047bArr = this.f40938B;
                if (i4 >= c5047bArr.length) {
                    this.f40938B = (C5047b[]) Arrays.copyOf(c5047bArr, c5047bArr.length * 2);
                }
                C5047b[] c5047bArr2 = this.f40938B;
                int i6 = this.f40939C;
                c5047bArr2[i6] = c5047b;
                this.f40939C = i6 + 1;
                return;
            }
            if (this.f40938B[i] == c5047b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C5047b c5047b) {
        int i = this.f40939C;
        int i4 = 0;
        while (i4 < i) {
            if (this.f40938B[i4] == c5047b) {
                while (i4 < i - 1) {
                    C5047b[] c5047bArr = this.f40938B;
                    int i6 = i4 + 1;
                    c5047bArr[i4] = c5047bArr[i6];
                    i4 = i6;
                }
                this.f40939C--;
                return;
            }
            i4++;
        }
    }

    public final void c() {
        this.f40941E = 5;
        this.f40945w = 0;
        this.f40943u = -1;
        this.f40944v = -1;
        this.f40946x = 0.0f;
        this.f40947y = false;
        int i = this.f40939C;
        for (int i4 = 0; i4 < i; i4++) {
            this.f40938B[i4] = null;
        }
        this.f40939C = 0;
        this.f40940D = 0;
        this.f40942n = false;
        Arrays.fill(this.f40937A, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f40943u - ((C5051f) obj).f40943u;
    }

    public final void d(C5048c c5048c, float f2) {
        this.f40946x = f2;
        this.f40947y = true;
        int i = this.f40939C;
        this.f40944v = -1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f40938B[i4].h(c5048c, this, false);
        }
        this.f40939C = 0;
    }

    public final void e(C5048c c5048c, C5047b c5047b) {
        int i = this.f40939C;
        for (int i4 = 0; i4 < i; i4++) {
            this.f40938B[i4].i(c5048c, c5047b, false);
        }
        this.f40939C = 0;
    }

    public final String toString() {
        return "" + this.f40943u;
    }
}
