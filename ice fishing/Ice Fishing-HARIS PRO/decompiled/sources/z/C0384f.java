package z;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import u.AbstractC0357e;
import x.C0367b;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4848a;

    /* renamed from: b, reason: collision with root package name */
    public int f4849b;

    /* renamed from: c, reason: collision with root package name */
    public int f4850c;

    /* renamed from: d, reason: collision with root package name */
    public int f4851d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f4852f;

    /* renamed from: g, reason: collision with root package name */
    public int f4853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f4854h;

    public C0384f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f4854h = constraintLayout;
        this.f4848a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        return View.MeasureSpec.getMode(i2) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i3 == View.MeasureSpec.getSize(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00ed, code lost:
    
        if (r10 == 2) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(w.d dVar, C0367b c0367b) {
        int makeMeasureSpec;
        int i;
        int a2;
        int makeMeasureSpec2;
        w.e eVar;
        int max;
        int i2;
        int i3;
        boolean z2;
        int baseline;
        int i4;
        if (dVar == null) {
            return;
        }
        if (dVar.f4559g0 == 8) {
            c0367b.e = 0;
            c0367b.f4673f = 0;
            c0367b.f4674g = 0;
            return;
        }
        if (dVar.f4540T == null) {
            return;
        }
        C0397s c0397s = ConstraintLayout.f1889p;
        ConstraintLayout constraintLayout = this.f4854h;
        constraintLayout.getClass();
        int i5 = c0367b.f4669a;
        int i6 = c0367b.f4670b;
        int i7 = c0367b.f4671c;
        int i8 = c0367b.f4672d;
        int i9 = this.f4849b + this.f4850c;
        int i10 = this.f4851d;
        View view = dVar.f4557f0;
        int a3 = AbstractC0357e.a(i5);
        w.c cVar = dVar.f4531K;
        w.c cVar2 = dVar.f4530I;
        if (a3 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4852f, i10, -2);
        } else {
            if (a3 != 2) {
                if (a3 != 3) {
                    i = 0;
                } else {
                    int i11 = this.f4852f;
                    int i12 = cVar2 != null ? cVar2.f4520g : 0;
                    if (cVar != null) {
                        i12 += cVar.f4520g;
                    }
                    i = ViewGroup.getChildMeasureSpec(i11, i10 + i12, -1);
                }
                a2 = AbstractC0357e.a(i6);
                if (a2 != 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else if (a2 == 1) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4853g, i9, -2);
                } else if (a2 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4853g, i9, -2);
                    boolean z3 = dVar.f4578s == 1;
                    int i13 = c0367b.j;
                    int i14 = i13 != 1 ? 2 : 2;
                    boolean z4 = view.getMeasuredWidth() == dVar.q();
                    if (c0367b.j == i14 || !z3 || ((z3 && z4) || dVar.B())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                    }
                } else if (a2 != 3) {
                    makeMeasureSpec2 = 0;
                } else {
                    int i15 = this.f4853g;
                    int i16 = cVar2 != null ? dVar.J.f4520g : 0;
                    if (cVar != null) {
                        i16 += dVar.f4532L.f4520g;
                    }
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, i9 + i16, -1);
                }
                eVar = (w.e) dVar.f4540T;
                if (eVar == null && w.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f4548a0 && !dVar.z() && a(dVar.f4528G, i, dVar.q()) && a(dVar.f4529H, makeMeasureSpec2, dVar.k())) {
                    c0367b.e = dVar.q();
                    c0367b.f4673f = dVar.k();
                    c0367b.f4674g = dVar.f4548a0;
                    return;
                }
                boolean z5 = i5 != 3;
                boolean z6 = i6 != 3;
                boolean z7 = i6 != 4 || i6 == 1;
                boolean z8 = i5 != 4 || i5 == 1;
                boolean z9 = !z5 && dVar.f4543W > RecyclerView.f2111C0;
                boolean z10 = !z6 && dVar.f4543W > RecyclerView.f2111C0;
                if (view != null) {
                    return;
                }
                C0383e c0383e = (C0383e) view.getLayoutParams();
                int i17 = c0367b.j;
                if (i17 != 1 && i17 != 2 && z5 && dVar.f4577r == 0 && z6 && dVar.f4578s == 0) {
                    i3 = 0;
                    i4 = -1;
                    baseline = 0;
                    z2 = false;
                    max = 0;
                } else {
                    if ((view instanceof AbstractC0398t) && (dVar instanceof w.g)) {
                        ((AbstractC0398t) view).j((w.g) dVar, i, makeMeasureSpec2);
                    } else {
                        view.measure(i, makeMeasureSpec2);
                    }
                    dVar.f4528G = i;
                    dVar.f4529H = makeMeasureSpec2;
                    dVar.f4558g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i18 = dVar.f4580u;
                    max = i18 > 0 ? Math.max(i18, measuredWidth) : measuredWidth;
                    int i19 = dVar.f4581v;
                    if (i19 > 0) {
                        max = Math.min(i19, max);
                    }
                    int i20 = dVar.f4583x;
                    if (i20 > 0) {
                        i3 = Math.max(i20, measuredHeight);
                        i2 = makeMeasureSpec2;
                    } else {
                        i2 = makeMeasureSpec2;
                        i3 = measuredHeight;
                    }
                    int i21 = dVar.f4584y;
                    if (i21 > 0) {
                        i3 = Math.min(i21, i3);
                    }
                    if (!w.j.c(constraintLayout.i, 1)) {
                        if (z9 && z7) {
                            max = (int) ((i3 * dVar.f4543W) + 0.5f);
                        } else if (z10 && z8) {
                            i3 = (int) ((max / dVar.f4543W) + 0.5f);
                        }
                    }
                    if (measuredWidth == max && measuredHeight == i3) {
                        baseline = baseline2;
                        i4 = -1;
                        z2 = false;
                    } else {
                        if (measuredWidth != max) {
                            i = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        int makeMeasureSpec3 = measuredHeight != i3 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : i2;
                        view.measure(i, makeMeasureSpec3);
                        dVar.f4528G = i;
                        dVar.f4529H = makeMeasureSpec3;
                        z2 = false;
                        dVar.f4558g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        i3 = view.getMeasuredHeight();
                        max = measuredWidth2;
                        baseline = view.getBaseline();
                        i4 = -1;
                    }
                }
                boolean z11 = baseline != i4 ? true : z2;
                c0367b.i = (max == c0367b.f4671c && i3 == c0367b.f4672d) ? z2 : true;
                boolean z12 = c0383e.f4814c0 ? true : z11;
                if (z12 && baseline != -1 && dVar.f4548a0 != baseline) {
                    c0367b.i = true;
                }
                c0367b.e = max;
                c0367b.f4673f = i3;
                c0367b.f4675h = z12;
                c0367b.f4674g = baseline;
                return;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4852f, i10, -2);
            boolean z13 = dVar.f4577r == 1;
            int i22 = c0367b.j;
            if (i22 == 1 || i22 == 2) {
                boolean z14 = view.getMeasuredHeight() == dVar.k();
                if (c0367b.j == 2 || !z13 || ((z13 && z14) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        }
        i = makeMeasureSpec;
        a2 = AbstractC0357e.a(i6);
        if (a2 != 0) {
        }
        eVar = (w.e) dVar.f4540T;
        if (eVar == null) {
        }
        if (i5 != 3) {
        }
        if (i6 != 3) {
        }
        if (i6 != 4) {
        }
        if (i5 != 4) {
        }
        if (z5) {
        }
        if (z6) {
        }
        if (view != null) {
        }
    }
}
