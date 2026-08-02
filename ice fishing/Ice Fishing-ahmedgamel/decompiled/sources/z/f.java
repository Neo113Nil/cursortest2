package z;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import u.AbstractC5050e;
import w.C5129d;
import w.C5130e;
import x.C5163b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f42056a;

    /* renamed from: b, reason: collision with root package name */
    public int f42057b;

    /* renamed from: c, reason: collision with root package name */
    public int f42058c;

    /* renamed from: d, reason: collision with root package name */
    public int f42059d;

    /* renamed from: e, reason: collision with root package name */
    public int f42060e;

    /* renamed from: f, reason: collision with root package name */
    public int f42061f;

    /* renamed from: g, reason: collision with root package name */
    public int f42062g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f42063h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f42063h = constraintLayout;
        this.f42056a = constraintLayout2;
    }

    public static boolean a(int i, int i4, int i6) {
        if (i == i4) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i6 == size;
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
    public final void b(C5130e c5130e, C5163b c5163b) {
        int makeMeasureSpec;
        int i;
        int d9;
        int makeMeasureSpec2;
        w.f fVar;
        int baseline;
        int max;
        int max2;
        boolean z6;
        int i4;
        if (c5130e == null) {
            return;
        }
        if (c5130e.f41295g0 == 8) {
            c5163b.f41757e = 0;
            c5163b.f41758f = 0;
            c5163b.f41759g = 0;
            return;
        }
        if (c5130e.f41276T == null) {
            return;
        }
        s sVar = ConstraintLayout.f4611I;
        ConstraintLayout constraintLayout = this.f42063h;
        int i6 = c5163b.f41753a;
        int i9 = c5163b.f41754b;
        int i10 = c5163b.f41755c;
        int i11 = c5163b.f41756d;
        int i12 = this.f42057b + this.f42058c;
        int i13 = this.f42059d;
        View view = c5130e.f41293f0;
        int d10 = AbstractC5050e.d(i6);
        C5129d c5129d = c5130e.f41267K;
        C5129d c5129d2 = c5130e.f41266I;
        if (d10 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else if (d10 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f42061f, i13, -2);
        } else {
            if (d10 != 2) {
                if (d10 != 3) {
                    i = 0;
                } else {
                    int i14 = this.f42061f;
                    int i15 = c5129d2 != null ? c5129d2.f41256g : 0;
                    if (c5129d != null) {
                        i15 += c5129d.f41256g;
                    }
                    i = ViewGroup.getChildMeasureSpec(i14, i13 + i15, -1);
                }
                d9 = AbstractC5050e.d(i9);
                if (d9 != 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                } else if (d9 == 1) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f42062g, i12, -2);
                } else if (d9 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f42062g, i12, -2);
                    boolean z9 = c5130e.f41314s == 1;
                    int i16 = c5163b.f41761j;
                    if (i16 == 1 || i16 == 2) {
                        boolean z10 = view.getMeasuredWidth() == c5130e.q();
                        if (c5163b.f41761j == 2 || !z9 || ((z9 && z10) || c5130e.B())) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c5130e.k(), 1073741824);
                        }
                    }
                } else if (d9 != 3) {
                    makeMeasureSpec2 = 0;
                } else {
                    int i17 = this.f42062g;
                    int i18 = c5129d2 != null ? c5130e.J.f41256g : 0;
                    if (c5129d != null) {
                        i18 += c5130e.f41268L.f41256g;
                    }
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i12 + i18, -1);
                }
                fVar = (w.f) c5130e.f41276T;
                if (fVar == null && w.k.c(constraintLayout.f4613B, 256) && view.getMeasuredWidth() == c5130e.q() && view.getMeasuredWidth() < fVar.q() && view.getMeasuredHeight() == c5130e.k() && view.getMeasuredHeight() < fVar.k() && view.getBaseline() == c5130e.f41283a0 && !c5130e.z() && a(c5130e.f41264G, i, c5130e.q()) && a(c5130e.f41265H, makeMeasureSpec2, c5130e.k())) {
                    c5163b.f41757e = c5130e.q();
                    c5163b.f41758f = c5130e.k();
                    c5163b.f41759g = c5130e.f41283a0;
                    return;
                }
                boolean z11 = i6 != 3;
                boolean z12 = i9 != 3;
                boolean z13 = i9 != 4 || i9 == 1;
                boolean z14 = i6 != 4 || i6 == 1;
                boolean z15 = !z11 && c5130e.f41279W > 0.0f;
                boolean z16 = !z12 && c5130e.f41279W > 0.0f;
                if (view != null) {
                    return;
                }
                e eVar = (e) view.getLayoutParams();
                int i19 = c5163b.f41761j;
                if (i19 != 1 && i19 != 2 && z11 && c5130e.f41313r == 0 && z12 && c5130e.f41314s == 0) {
                    max2 = 0;
                    i4 = -1;
                    z6 = false;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof t) && (c5130e instanceof w.h)) {
                        ((t) view).j((w.h) c5130e, i, makeMeasureSpec2);
                    } else {
                        view.measure(i, makeMeasureSpec2);
                    }
                    c5130e.f41264G = i;
                    c5130e.f41265H = makeMeasureSpec2;
                    c5130e.f41294g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i20 = c5130e.f41316u;
                    max = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                    int i21 = c5130e.f41317v;
                    if (i21 > 0) {
                        max = Math.min(i21, max);
                    }
                    int i22 = c5130e.f41319x;
                    max2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                    boolean z17 = z16;
                    int i23 = c5130e.f41320y;
                    if (i23 > 0) {
                        max2 = Math.min(i23, max2);
                    }
                    if (!w.k.c(constraintLayout.f4613B, 1)) {
                        if (z15 && z13) {
                            max = (int) ((max2 * c5130e.f41279W) + 0.5f);
                        } else if (z17 && z14) {
                            max2 = (int) ((max / c5130e.f41279W) + 0.5f);
                        }
                    }
                    if (measuredWidth == max && measuredHeight == max2) {
                        i4 = -1;
                        z6 = false;
                    } else {
                        if (measuredWidth != max) {
                            i = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        if (measuredHeight != max2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                        }
                        view.measure(i, makeMeasureSpec2);
                        c5130e.f41264G = i;
                        c5130e.f41265H = makeMeasureSpec2;
                        z6 = false;
                        c5130e.f41294g = false;
                        max = view.getMeasuredWidth();
                        max2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i4 = -1;
                    }
                }
                boolean z18 = baseline != i4 ? true : z6;
                c5163b.i = (max == c5163b.f41755c && max2 == c5163b.f41756d) ? z6 : true;
                if (eVar.f42021c0) {
                    z18 = true;
                }
                if (z18 && baseline != -1 && c5130e.f41283a0 != baseline) {
                    c5163b.i = true;
                }
                c5163b.f41757e = max;
                c5163b.f41758f = max2;
                c5163b.f41760h = z18;
                c5163b.f41759g = baseline;
                return;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f42061f, i13, -2);
            boolean z19 = c5130e.f41313r == 1;
            int i24 = c5163b.f41761j;
            if (i24 == 1 || i24 == 2) {
                boolean z20 = view.getMeasuredHeight() == c5130e.k();
                if (c5163b.f41761j == 2 || !z19 || ((z19 && z20) || c5130e.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c5130e.q(), 1073741824);
                }
            }
        }
        i = makeMeasureSpec;
        d9 = AbstractC5050e.d(i9);
        if (d9 != 0) {
        }
        fVar = (w.f) c5130e.f41276T;
        if (fVar == null) {
        }
        if (i6 != 3) {
        }
        if (i9 != 3) {
        }
        if (i9 != 4) {
        }
        if (i6 != 4) {
        }
        if (z11) {
        }
        if (z12) {
        }
        if (view != null) {
        }
    }
}
