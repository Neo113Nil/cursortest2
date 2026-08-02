package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;

/* loaded from: classes9.dex */
public final class s3r extends RecyclerView.g {
    public final /* synthetic */ t3r a;

    public s3r(t3r t3rVar) {
        this.a = t3rVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        t3r t3rVar;
        d0 a;
        int l;
        aul aulVar;
        u3r u3rVar;
        int i3;
        View view;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (a = (t3rVar = this.a).a(layoutManager)) == null || (l = a.l()) == 0) {
            return;
        }
        int d0 = layoutManager.d0();
        Integer num = null;
        for (int i4 = 0; i4 < d0; i4++) {
            View c0 = layoutManager.c0(i4);
            if (c0 != null && (aulVar = (aul) t3rVar.a.invoke(c0)) != null && (u3rVar = aulVar.j) != null) {
                int measuredWidth = layoutManager.I() ? c0.getMeasuredWidth() : c0.getMeasuredHeight();
                if (measuredWidth != 0 && (i3 = l - measuredWidth) > 0) {
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                    int t = i3 - rzo.t(u3rVar.getA(), c0.getContext());
                    int itemCount = layoutManager.getItemCount() - 1;
                    if (viewLayoutPosition != itemCount) {
                        do {
                            viewLayoutPosition++;
                            if (t <= 0) {
                                break;
                            }
                            int d02 = layoutManager.d0();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= d02) {
                                    view = null;
                                    break;
                                }
                                view = layoutManager.c0(i5);
                                if (view != null && ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() == viewLayoutPosition) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            if (view == null) {
                                break;
                            } else {
                                t -= layoutManager.I() ? view.getMeasuredWidth() : view.getMeasuredHeight();
                            }
                        } while (viewLayoutPosition != itemCount);
                        if (t > 0 && viewLayoutPosition == itemCount && (num == null || t > num.intValue())) {
                            num = Integer.valueOf(t);
                        }
                    } else if (num == null || t > num.intValue()) {
                        num = Integer.valueOf(t);
                    }
                }
            }
        }
        if (num == null || jl40.l(t3rVar.d, num)) {
            return;
        }
        t3rVar.d = num;
        if (recyclerView.isComputingLayout() || recyclerView.getScrollState() != 0) {
            recyclerView.post(new z50(t3rVar, recyclerView, 0, 7));
        } else {
            recyclerView.invalidateItemDecorations();
        }
    }
}
