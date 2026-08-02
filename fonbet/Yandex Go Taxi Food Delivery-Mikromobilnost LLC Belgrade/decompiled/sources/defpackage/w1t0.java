package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import just.adapter.scroll.ScrollDirection;
import just.adapter.snapping.b;
import just.adapter.snapping.c;

/* loaded from: classes9.dex */
public final class w1t0 extends RecyclerView.g {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ c e;

    public w1t0(c cVar) {
        this.e = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r3.c == 1) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z;
        if (this.d == 2) {
            z = true;
        }
        z = false;
        this.d = this.c;
        this.c = i;
        c cVar = this.e;
        if (i != 2) {
            this.b = 0;
            cVar.g = 0;
        }
        if (i == 0) {
            if (this.a) {
                if (!cVar.h) {
                    c.a(cVar);
                }
                if (!cVar.i) {
                    cVar.e.a();
                }
            }
            cVar.h = false;
            cVar.i = false;
            this.a = false;
        }
        if (z) {
            c.a(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.e layoutManager;
        d0 b;
        int i3;
        int intValue;
        int b2;
        int g;
        int intValue2;
        View X;
        o1t0 b3;
        c cVar = this.e;
        q1t0 q1t0Var = cVar.l;
        b bVar = cVar.e;
        if (i != 0 || i2 != 0) {
            this.a = true;
        }
        if (this.c == 1) {
            bVar.b();
        }
        if (this.c == 2 && this.d == 1 && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int i4 = layoutManager.I() ? i : i2;
            this.b += i4;
            ScrollDirection f0 = tje.f0(i4);
            int i5 = this.b;
            int i6 = cVar.g;
            if (i6 == 0) {
                i6 = 0;
            } else {
                RecyclerView.e layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 != 0 && (b = cVar.d.b(layoutManager2)) != null && (i3 = v1t0.a[f0.ordinal()]) != 1) {
                    Integer num = null;
                    if (i3 == 2) {
                        if (layoutManager2 instanceof LinearLayoutManager) {
                            num = Integer.valueOf(((LinearLayoutManager) layoutManager2).M1());
                        } else if (layoutManager2 instanceof gki0) {
                            num = Integer.valueOf(((gki0) layoutManager2).b());
                        }
                        if (num != null && (intValue = num.intValue()) != -1 && intValue == layoutManager2.getItemCount() - 1) {
                            b2 = b.b(layoutManager2.X(intValue)) + i5;
                            g = b.g();
                            i6 = b2 - g;
                        }
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return;
                        }
                        if (layoutManager2 instanceof LinearLayoutManager) {
                            num = Integer.valueOf(((LinearLayoutManager) layoutManager2).K1());
                        } else if (layoutManager2 instanceof gki0) {
                            num = Integer.valueOf(((gki0) layoutManager2).a());
                        }
                        if (num != null && (intValue2 = num.intValue()) != -1 && intValue2 == 0 && (X = layoutManager2.X(intValue2)) != null) {
                            b2 = b.e(X) + i5;
                            g = b.k();
                            i6 = b2 - g;
                        }
                    }
                }
            }
            cVar.g = i6;
            if (i6 == 0 || (b3 = q1t0Var.b(layoutManager, f0, i6 - this.b)) == null) {
                return;
            }
            cVar.i = true;
            recyclerView.stopScroll();
            cVar.h = true;
            int[] a = q1t0Var.a(layoutManager, f0, b3.b());
            if (a[0] == 0 && a[1] == 0) {
                t1t0 e = b3.a().e();
                if (e != null) {
                    bVar.c(e);
                    bVar.a();
                    return;
                }
                return;
            }
            t1t0 e2 = b3.a().e();
            if (e2 != null) {
                bVar.c(e2);
            }
            int i7 = a[0];
            int i8 = a[1];
            recyclerView.smoothScrollBy(i7, cVar.k.a(i8, i8 > 0));
        }
    }
}
