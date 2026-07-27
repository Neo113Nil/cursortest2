package z;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import u.AbstractC5049e;
import w.C5138c;
import w.C5139d;
import w.C5140e;
import x.C5164b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f42082a;

    /* renamed from: b, reason: collision with root package name */
    public int f42083b;

    /* renamed from: c, reason: collision with root package name */
    public int f42084c;

    /* renamed from: d, reason: collision with root package name */
    public int f42085d;

    /* renamed from: e, reason: collision with root package name */
    public int f42086e;

    /* renamed from: f, reason: collision with root package name */
    public int f42087f;

    /* renamed from: g, reason: collision with root package name */
    public int f42088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f42089h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f42089h = constraintLayout;
        this.f42082a = constraintLayout2;
    }

    public static boolean a(int i, int i6, int i9) {
        if (i == i6) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
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
    public final void b(C5139d c5139d, C5164b c5164b) {
        int makeMeasureSpec;
        int i;
        int d2;
        int makeMeasureSpec2;
        C5140e c5140e;
        int baseline;
        int max;
        int max2;
        boolean z3;
        int i6;
        if (c5139d == null) {
            return;
        }
        if (c5139d.f41513g0 == 8) {
            c5164b.f41699e = 0;
            c5164b.f41700f = 0;
            c5164b.f41701g = 0;
            return;
        }
        if (c5139d.f41494T == null) {
            return;
        }
        s sVar = ConstraintLayout.f4643I;
        ConstraintLayout constraintLayout = this.f42089h;
        int i9 = c5164b.f41695a;
        int i10 = c5164b.f41696b;
        int i11 = c5164b.f41697c;
        int i12 = c5164b.f41698d;
        int i13 = this.f42083b + this.f42084c;
        int i14 = this.f42085d;
        View view = c5139d.f41511f0;
        int d9 = AbstractC5049e.d(i9);
        C5138c c5138c = c5139d.f41485K;
        C5138c c5138c2 = c5139d.f41484I;
        if (d9 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else if (d9 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f42087f, i14, -2);
        } else {
            if (d9 != 2) {
                if (d9 != 3) {
                    i = 0;
                } else {
                    int i15 = this.f42087f;
                    int i16 = c5138c2 != null ? c5138c2.f41474g : 0;
                    if (c5138c != null) {
                        i16 += c5138c.f41474g;
                    }
                    i = ViewGroup.getChildMeasureSpec(i15, i14 + i16, -1);
                }
                d2 = AbstractC5049e.d(i10);
                if (d2 != 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else if (d2 == 1) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f42088g, i13, -2);
                } else if (d2 == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f42088g, i13, -2);
                    boolean z6 = c5139d.f41532s == 1;
                    int i17 = c5164b.f41703j;
                    if (i17 == 1 || i17 == 2) {
                        boolean z9 = view.getMeasuredWidth() == c5139d.q();
                        if (c5164b.f41703j == 2 || !z6 || ((z6 && z9) || c5139d.B())) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c5139d.k(), 1073741824);
                        }
                    }
                } else if (d2 != 3) {
                    makeMeasureSpec2 = 0;
                } else {
                    int i18 = this.f42088g;
                    int i19 = c5138c2 != null ? c5139d.J.f41474g : 0;
                    if (c5138c != null) {
                        i19 += c5139d.f41486L.f41474g;
                    }
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i13 + i19, -1);
                }
                c5140e = (C5140e) c5139d.f41494T;
                if (c5140e == null && w.j.c(constraintLayout.f4645B, 256) && view.getMeasuredWidth() == c5139d.q() && view.getMeasuredWidth() < c5140e.q() && view.getMeasuredHeight() == c5139d.k() && view.getMeasuredHeight() < c5140e.k() && view.getBaseline() == c5139d.f41501a0 && !c5139d.z() && a(c5139d.f41482G, i, c5139d.q()) && a(c5139d.f41483H, makeMeasureSpec2, c5139d.k())) {
                    c5164b.f41699e = c5139d.q();
                    c5164b.f41700f = c5139d.k();
                    c5164b.f41701g = c5139d.f41501a0;
                    return;
                }
                boolean z10 = i9 != 3;
                boolean z11 = i10 != 3;
                boolean z12 = i10 != 4 || i10 == 1;
                boolean z13 = i9 != 4 || i9 == 1;
                boolean z14 = !z10 && c5139d.f41497W > 0.0f;
                boolean z15 = !z11 && c5139d.f41497W > 0.0f;
                if (view != null) {
                    return;
                }
                e eVar = (e) view.getLayoutParams();
                int i20 = c5164b.f41703j;
                if (i20 != 1 && i20 != 2 && z10 && c5139d.f41531r == 0 && z11 && c5139d.f41532s == 0) {
                    max2 = 0;
                    i6 = -1;
                    z3 = false;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof t) && (c5139d instanceof w.g)) {
                        ((t) view).j((w.g) c5139d, i, makeMeasureSpec2);
                    } else {
                        view.measure(i, makeMeasureSpec2);
                    }
                    c5139d.f41482G = i;
                    c5139d.f41483H = makeMeasureSpec2;
                    c5139d.f41512g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i21 = c5139d.f41534u;
                    max = i21 > 0 ? Math.max(i21, measuredWidth) : measuredWidth;
                    int i22 = c5139d.f41535v;
                    if (i22 > 0) {
                        max = Math.min(i22, max);
                    }
                    int i23 = c5139d.f41537x;
                    max2 = i23 > 0 ? Math.max(i23, measuredHeight) : measuredHeight;
                    boolean z16 = z15;
                    int i24 = c5139d.f41538y;
                    if (i24 > 0) {
                        max2 = Math.min(i24, max2);
                    }
                    if (!w.j.c(constraintLayout.f4645B, 1)) {
                        if (z14 && z12) {
                            max = (int) ((max2 * c5139d.f41497W) + 0.5f);
                        } else if (z16 && z13) {
                            max2 = (int) ((max / c5139d.f41497W) + 0.5f);
                        }
                    }
                    if (measuredWidth == max && measuredHeight == max2) {
                        i6 = -1;
                        z3 = false;
                    } else {
                        if (measuredWidth != max) {
                            i = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        if (measuredHeight != max2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                        }
                        view.measure(i, makeMeasureSpec2);
                        c5139d.f41482G = i;
                        c5139d.f41483H = makeMeasureSpec2;
                        z3 = false;
                        c5139d.f41512g = false;
                        max = view.getMeasuredWidth();
                        max2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i6 = -1;
                    }
                }
                boolean z17 = baseline != i6 ? true : z3;
                c5164b.i = (max == c5164b.f41697c && max2 == c5164b.f41698d) ? z3 : true;
                if (eVar.f42047c0) {
                    z17 = true;
                }
                if (z17 && baseline != -1 && c5139d.f41501a0 != baseline) {
                    c5164b.i = true;
                }
                c5164b.f41699e = max;
                c5164b.f41700f = max2;
                c5164b.f41702h = z17;
                c5164b.f41701g = baseline;
                return;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f42087f, i14, -2);
            boolean z18 = c5139d.f41531r == 1;
            int i25 = c5164b.f41703j;
            if (i25 == 1 || i25 == 2) {
                boolean z19 = view.getMeasuredHeight() == c5139d.k();
                if (c5164b.f41703j == 2 || !z18 || ((z18 && z19) || c5139d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c5139d.q(), 1073741824);
                }
            }
        }
        i = makeMeasureSpec;
        d2 = AbstractC5049e.d(i10);
        if (d2 != 0) {
        }
        c5140e = (C5140e) c5139d.f41494T;
        if (c5140e == null) {
        }
        if (i9 != 3) {
        }
        if (i10 != 3) {
        }
        if (i10 != 4) {
        }
        if (i9 != 4) {
        }
        if (z10) {
        }
        if (z11) {
        }
        if (view != null) {
        }
    }
}
