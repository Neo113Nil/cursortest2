package t0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5014i extends AbstractC4993H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5016k f40687a;

    public C5014i(C5016k c5016k) {
        this.f40687a = c5016k;
    }

    @Override // t0.AbstractC4993H
    public final void b(RecyclerView recyclerView, int i, int i6) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C5016k c5016k = this.f40687a;
        int computeVerticalScrollRange = c5016k.f40711s.computeVerticalScrollRange();
        int i9 = c5016k.f40710r;
        int i10 = computeVerticalScrollRange - i9;
        int i11 = c5016k.f40694a;
        c5016k.f40712t = i10 > 0 && i9 >= i11;
        int computeHorizontalScrollRange = c5016k.f40711s.computeHorizontalScrollRange();
        int i12 = c5016k.f40709q;
        boolean z3 = computeHorizontalScrollRange - i12 > 0 && i12 >= i11;
        c5016k.f40713u = z3;
        boolean z6 = c5016k.f40712t;
        if (!z6 && !z3) {
            if (c5016k.f40714v != 0) {
                c5016k.f(0);
                return;
            }
            return;
        }
        if (z6) {
            float f3 = i9;
            c5016k.f40704l = (int) ((((f3 / 2.0f) + computeVerticalScrollOffset) * f3) / computeVerticalScrollRange);
            c5016k.f40703k = Math.min(i9, (i9 * i9) / computeVerticalScrollRange);
        }
        if (c5016k.f40713u) {
            float f9 = computeHorizontalScrollOffset;
            float f10 = i12;
            c5016k.f40707o = (int) ((((f10 / 2.0f) + f9) * f10) / computeHorizontalScrollRange);
            c5016k.f40706n = Math.min(i12, (i12 * i12) / computeHorizontalScrollRange);
        }
        int i13 = c5016k.f40714v;
        if (i13 == 0 || i13 == 1) {
            c5016k.f(1);
        }
    }
}
