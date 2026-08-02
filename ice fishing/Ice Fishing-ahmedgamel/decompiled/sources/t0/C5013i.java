package t0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5013i extends AbstractC4990F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5015k f40740a;

    public C5013i(C5015k c5015k) {
        this.f40740a = c5015k;
    }

    @Override // t0.AbstractC4990F
    public final void b(RecyclerView recyclerView, int i, int i4) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C5015k c5015k = this.f40740a;
        int computeVerticalScrollRange = c5015k.f40764s.computeVerticalScrollRange();
        int i6 = c5015k.f40763r;
        int i9 = computeVerticalScrollRange - i6;
        int i10 = c5015k.f40747a;
        c5015k.f40765t = i9 > 0 && i6 >= i10;
        int computeHorizontalScrollRange = c5015k.f40764s.computeHorizontalScrollRange();
        int i11 = c5015k.f40762q;
        boolean z6 = computeHorizontalScrollRange - i11 > 0 && i11 >= i10;
        c5015k.f40766u = z6;
        boolean z9 = c5015k.f40765t;
        if (!z9 && !z6) {
            if (c5015k.f40767v != 0) {
                c5015k.f(0);
                return;
            }
            return;
        }
        if (z9) {
            float f2 = i6;
            c5015k.f40757l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c5015k.f40756k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
        }
        if (c5015k.f40766u) {
            float f9 = computeHorizontalScrollOffset;
            float f10 = i11;
            c5015k.f40760o = (int) ((((f10 / 2.0f) + f9) * f10) / computeHorizontalScrollRange);
            c5015k.f40759n = Math.min(i11, (i11 * i11) / computeHorizontalScrollRange);
        }
        int i12 = c5015k.f40767v;
        if (i12 == 0 || i12 == 1) {
            c5015k.f(1);
        }
    }
}
