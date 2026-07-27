package z;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import u.AbstractC5088e;
import w.C5143c;
import w.C5144d;
import w.C5145e;
import x.C5185b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41967a;

    /* renamed from: b, reason: collision with root package name */
    public int f41968b;

    /* renamed from: c, reason: collision with root package name */
    public int f41969c;

    /* renamed from: d, reason: collision with root package name */
    public int f41970d;

    /* renamed from: e, reason: collision with root package name */
    public int f41971e;

    /* renamed from: f, reason: collision with root package name */
    public int f41972f;

    /* renamed from: g, reason: collision with root package name */
    public int f41973g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f41974h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f41974h = constraintLayout;
        this.f41967a = constraintLayout2;
    }

    public static boolean a(int i, int i4, int i9) {
        if (i == i4) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i9 == size;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C5144d c5144d, C5185b c5185b) {
        int makeMeasureSpec;
        int i;
        int d2;
        int makeMeasureSpec2;
        C5145e c5145e;
        int baseline;
        int max;
        int max2;
        boolean z8;
        int i4;
        if (c5144d == null) {
            return;
        }
        if (c5144d.f41451g0 == 8) {
            c5185b.f41718e = 0;
            c5185b.f41719f = 0;
            c5185b.f41720g = 0;
            return;
        }
        if (c5144d.f41432T == null) {
            return;
        }
        s sVar = ConstraintLayout.f4758I;
        ConstraintLayout constraintLayout = this.f41974h;
        int i9 = c5185b.f41714a;
        int i10 = c5185b.f41715b;
        int i11 = c5185b.f41716c;
        int i12 = c5185b.f41717d;
        int i13 = this.f41968b + this.f41969c;
        int i14 = this.f41970d;
        View view = c5144d.f41449f0;
        int d3 = AbstractC5088e.d(i9);
        C5143c c5143c = c5144d.f41423K;
        C5143c c5143c2 = c5144d.f41422I;
        if (d3 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else if (d3 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f41972f, i14, -2);
        } else {
            if (d3 != 2) {
                if (d3 != 3) {
                    i = 0;
                } else {
                    int i15 = this.f41972f;
                    int i16 = c5143c2 != null ? c5143c2.f41412g : 0;
                    if (c5143c != null) {
                        i16 += c5143c.f41412g;
                    }
                    i = ViewGroup.getChildMeasureSpec(i15, i14 + i16, -1);
                }
                d2 = AbstractC5088e.d(i10);
                if (d2 != 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else if (d2 == 1) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f41973g, i13, -2);
                } else if (d2 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f41973g, i13, -2);
                    boolean z9 = c5144d.f41470s == 1;
                    int i17 = c5185b.f41722j;
                    if (i17 == 1 || i17 == 2) {
                        boolean z10 = view.getMeasuredWidth() == c5144d.q();
                        if (c5185b.f41722j == 2 || !z9 || ((z9 && z10) || c5144d.B())) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c5144d.k(), 1073741824);
                        }
                    }
                } else if (d2 != 3) {
                    makeMeasureSpec2 = 0;
                } else {
                    int i18 = this.f41973g;
                    int i19 = c5143c2 != null ? c5144d.J.f41412g : 0;
                    if (c5143c != null) {
                        i19 += c5144d.f41424L.f41412g;
                    }
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i13 + i19, -1);
                }
                c5145e = (C5145e) c5144d.f41432T;
                if (c5145e == null && w.j.c(constraintLayout.f4760B, 256) && view.getMeasuredWidth() == c5144d.q() && view.getMeasuredWidth() < c5145e.q() && view.getMeasuredHeight() == c5144d.k() && view.getMeasuredHeight() < c5145e.k() && view.getBaseline() == c5144d.f41439a0 && !c5144d.z() && a(c5144d.f41420G, i, c5144d.q()) && a(c5144d.f41421H, makeMeasureSpec2, c5144d.k())) {
                    c5185b.f41718e = c5144d.q();
                    c5185b.f41719f = c5144d.k();
                    c5185b.f41720g = c5144d.f41439a0;
                    return;
                }
                boolean z11 = i9 != 3;
                boolean z12 = i10 != 3;
                boolean z13 = i10 != 4 || i10 == 1;
                boolean z14 = i9 != 4 || i9 == 1;
                boolean z15 = !z11 && c5144d.f41435W > 0.0f;
                boolean z16 = !z12 && c5144d.f41435W > 0.0f;
                if (view != null) {
                    return;
                }
                e eVar = (e) view.getLayoutParams();
                int i20 = c5185b.f41722j;
                if (i20 != 1 && i20 != 2 && z11 && c5144d.f41469r == 0 && z12 && c5144d.f41470s == 0) {
                    max2 = 0;
                    i4 = -1;
                    z8 = false;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof t) && (c5144d instanceof w.g)) {
                        ((t) view).j((w.g) c5144d, i, makeMeasureSpec2);
                    } else {
                        view.measure(i, makeMeasureSpec2);
                    }
                    c5144d.f41420G = i;
                    c5144d.f41421H = makeMeasureSpec2;
                    c5144d.f41450g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i21 = c5144d.f41472u;
                    max = i21 > 0 ? Math.max(i21, measuredWidth) : measuredWidth;
                    int i22 = c5144d.f41473v;
                    if (i22 > 0) {
                        max = Math.min(i22, max);
                    }
                    int i23 = c5144d.f41475x;
                    max2 = i23 > 0 ? Math.max(i23, measuredHeight) : measuredHeight;
                    boolean z17 = z16;
                    int i24 = c5144d.f41476y;
                    if (i24 > 0) {
                        max2 = Math.min(i24, max2);
                    }
                    if (!w.j.c(constraintLayout.f4760B, 1)) {
                        if (z15 && z13) {
                            max = (int) ((max2 * c5144d.f41435W) + 0.5f);
                        } else if (z17 && z14) {
                            max2 = (int) ((max / c5144d.f41435W) + 0.5f);
                        }
                    }
                    if (measuredWidth == max && measuredHeight == max2) {
                        i4 = -1;
                        z8 = false;
                    } else {
                        if (measuredWidth != max) {
                            i = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        if (measuredHeight != max2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                        }
                        view.measure(i, makeMeasureSpec2);
                        c5144d.f41420G = i;
                        c5144d.f41421H = makeMeasureSpec2;
                        z8 = false;
                        c5144d.f41450g = false;
                        max = view.getMeasuredWidth();
                        max2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i4 = -1;
                    }
                }
                boolean z18 = baseline != i4 ? true : z8;
                c5185b.i = (max == c5185b.f41716c && max2 == c5185b.f41717d) ? z8 : true;
                if (eVar.f41932c0) {
                    z18 = true;
                }
                if (z18 && baseline != -1 && c5144d.f41439a0 != baseline) {
                    c5185b.i = true;
                }
                c5185b.f41718e = max;
                c5185b.f41719f = max2;
                c5185b.f41721h = z18;
                c5185b.f41720g = baseline;
                return;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f41972f, i14, -2);
            boolean z19 = c5144d.f41469r == 1;
            int i25 = c5185b.f41722j;
            if (i25 == 1 || i25 == 2) {
                boolean z20 = view.getMeasuredHeight() == c5144d.k();
                if (c5185b.f41722j == 2 || !z19 || ((z19 && z20) || c5144d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c5144d.q(), 1073741824);
                }
            }
        }
        i = makeMeasureSpec;
        d2 = AbstractC5088e.d(i10);
        if (d2 != 0) {
        }
        c5145e = (C5145e) c5144d.f41432T;
        if (c5145e == null) {
        }
        if (i9 != 3) {
        }
        if (i10 != 3) {
        }
        if (i10 != 4) {
        }
        if (i9 != 4) {
        }
        if (z11) {
        }
        if (z12) {
        }
        if (view != null) {
        }
    }
}
