package androidx.appcompat.widget;

import O.N;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import h.LayoutInflaterFactory2C0159B;
import h.r;
import l.MenuC0229m;
import m.C0254g;
import m.C0264l;
import m.InterfaceC0259i0;
import m.InterfaceC0261j0;
import m.c1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f1837a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f1838b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1839c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f1840d;
    public TypedValue e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f1841f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1842g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0259i0 f1843h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1842g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1841f == null) {
            this.f1841f = new TypedValue();
        }
        return this.f1841f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1839c == null) {
            this.f1839c = new TypedValue();
        }
        return this.f1839c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1840d == null) {
            this.f1840d = new TypedValue();
        }
        return this.f1840d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1837a == null) {
            this.f1837a = new TypedValue();
        }
        return this.f1837a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1838b == null) {
            this.f1838b = new TypedValue();
        }
        return this.f1838b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0259i0 interfaceC0259i0 = this.f1843h;
        if (interfaceC0259i0 != null) {
            interfaceC0259i0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0264l c0264l;
        super.onDetachedFromWindow();
        InterfaceC0259i0 interfaceC0259i0 = this.f1843h;
        if (interfaceC0259i0 != null) {
            LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = ((r) interfaceC0259i0).f3233b;
            InterfaceC0261j0 interfaceC0261j0 = layoutInflaterFactory2C0159B.f3120r;
            if (interfaceC0261j0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0261j0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.e).f3923a.f1862a;
                if (actionMenuView != null && (c0264l = actionMenuView.f1826t) != null) {
                    c0264l.c();
                    C0254g c0254g = c0264l.f3976u;
                    if (c0254g != null && c0254g.b()) {
                        c0254g.i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0159B.f3125w != null) {
                layoutInflaterFactory2C0159B.f3114l.getDecorView().removeCallbacks(layoutInflaterFactory2C0159B.f3126x);
                if (layoutInflaterFactory2C0159B.f3125w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0159B.f3125w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0159B.f3125w = null;
            }
            N n2 = layoutInflaterFactory2C0159B.f3127y;
            if (n2 != null) {
                n2.b();
            }
            MenuC0229m menuC0229m = layoutInflaterFactory2C0159B.y(0).f3071h;
            if (menuC0229m != null) {
                menuC0229m.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int measuredWidth;
        TypedValue typedValue;
        int i5;
        int i6;
        float fraction;
        int i7;
        int i8;
        float fraction2;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f1842g;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z4 ? this.f1840d : this.f1839c;
            if (typedValue2 != null && (i9 = typedValue2.type) != 0) {
                if (i9 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i9 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i11, i11);
                } else {
                    i10 = 0;
                    if (i10 > 0) {
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z2 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z4 ? this.e : this.f1841f;
                            if (typedValue3 != null && (i7 = typedValue3.type) != 0) {
                                if (i7 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i7 == 6) {
                                    int i12 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i12, i12);
                                } else {
                                    i8 = 0;
                                    if (i8 > 0) {
                                        i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                        super.onMeasure(i3, i4);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z2 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z4 ? this.f1838b : this.f1837a;
                                            if (typedValue != null && (i5 = typedValue.type) != 0) {
                                                if (i5 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i5 == 6) {
                                                    int i13 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i13, i13);
                                                } else {
                                                    i6 = 0;
                                                    if (i6 > 0) {
                                                        i6 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i6) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                                                        if (z3) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i4);
                                                        return;
                                                    }
                                                }
                                                i6 = (int) fraction;
                                                if (i6 > 0) {
                                                }
                                                if (measuredWidth < i6) {
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (z3) {
                                        }
                                    }
                                }
                                i8 = (int) fraction2;
                                if (i8 > 0) {
                                }
                            }
                        }
                        i4 = i2;
                        super.onMeasure(i3, i4);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z2) {
                            if (!z4) {
                            }
                            if (typedValue != null) {
                                if (i5 != 5) {
                                }
                                i6 = (int) fraction;
                                if (i6 > 0) {
                                }
                                if (measuredWidth < i6) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                }
            }
        }
        i3 = i;
        z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i4 = i2;
        super.onMeasure(i3, i4);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z2) {
        }
        z3 = false;
        if (z3) {
        }
    }

    public void setAttachListener(InterfaceC0259i0 interfaceC0259i0) {
        this.f1843h = interfaceC0259i0;
    }
}
