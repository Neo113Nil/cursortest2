package k0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198l extends N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0200n f3539a;

    public C0198l(C0200n c0200n) {
        this.f3539a = c0200n;
    }

    @Override // k0.N
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0200n c0200n = this.f3539a;
        int computeVerticalScrollRange = c0200n.f3565s.computeVerticalScrollRange();
        int i3 = c0200n.f3564r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0200n.f3550a;
        c0200n.f3566t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0200n.f3565s.computeHorizontalScrollRange();
        int i6 = c0200n.f3563q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0200n.f3567u = z2;
        boolean z3 = c0200n.f3566t;
        if (!z3 && !z2) {
            if (c0200n.f3568v != 0) {
                c0200n.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0200n.f3558l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0200n.f3557k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0200n.f3567u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0200n.f3561o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0200n.f3560n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0200n.f3568v;
        if (i7 == 0 || i7 == 1) {
            c0200n.f(1);
        }
    }
}
