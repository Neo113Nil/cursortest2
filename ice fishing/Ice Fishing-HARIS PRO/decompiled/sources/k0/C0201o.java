package k0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: k0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201o {

    /* renamed from: a, reason: collision with root package name */
    public int f3573a;

    /* renamed from: b, reason: collision with root package name */
    public int f3574b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3575c;

    /* renamed from: d, reason: collision with root package name */
    public int f3576d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f3576d;
        int i4 = i3 * 2;
        int[] iArr = this.f3575c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3575c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f3575c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3575c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f3576d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f3576d = 0;
        int[] iArr = this.f3575c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        K k2 = recyclerView.f2162n;
        if (recyclerView.f2160m == null || k2 == null || !k2.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.e.j()) {
                k2.i(recyclerView.f2160m.a(), this);
            }
        } else if (!recyclerView.N()) {
            k2.h(this.f3573a, this.f3574b, recyclerView.f2151g0, this);
        }
        int i = this.f3576d;
        if (i > k2.j) {
            k2.j = i;
            k2.f3391k = z2;
            recyclerView.f2143c.m();
        }
    }
}
