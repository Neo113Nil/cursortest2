package u;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4421a;
    public float e;

    /* renamed from: l, reason: collision with root package name */
    public int f4429l;

    /* renamed from: b, reason: collision with root package name */
    public int f4422b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f4423c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4424d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4425f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4426g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f4427h = new float[9];
    public C0354b[] i = new C0354b[16];
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4428k = 0;

    public f(int i) {
        this.f4429l = i;
    }

    public final void a(C0354b c0354b) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            if (i >= i2) {
                C0354b[] c0354bArr = this.i;
                if (i2 >= c0354bArr.length) {
                    this.i = (C0354b[]) Arrays.copyOf(c0354bArr, c0354bArr.length * 2);
                }
                C0354b[] c0354bArr2 = this.i;
                int i3 = this.j;
                c0354bArr2[i3] = c0354b;
                this.j = i3 + 1;
                return;
            }
            if (this.i[i] == c0354b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0354b c0354b) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0354b) {
                while (i2 < i - 1) {
                    C0354b[] c0354bArr = this.i;
                    int i3 = i2 + 1;
                    c0354bArr[i2] = c0354bArr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f4429l = 5;
        this.f4424d = 0;
        this.f4422b = -1;
        this.f4423c = -1;
        this.e = RecyclerView.f2111C0;
        this.f4425f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.f4428k = 0;
        this.f4421a = false;
        Arrays.fill(this.f4427h, RecyclerView.f2111C0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4422b - ((f) obj).f4422b;
    }

    public final void d(C0355c c0355c, float f2) {
        this.e = f2;
        this.f4425f = true;
        int i = this.j;
        this.f4423c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0355c, this, false);
        }
        this.j = 0;
    }

    public final void e(C0355c c0355c, C0354b c0354b) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0355c, c0354b, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.f4422b;
    }
}
