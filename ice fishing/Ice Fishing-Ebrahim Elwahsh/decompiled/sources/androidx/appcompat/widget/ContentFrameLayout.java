package androidx.appcompat.widget;

import O.C0343e0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import g1.C4524d;
import h.LayoutInflaterFactory2C4535B;
import l.l;
import m.C4735g;
import m.C4743k;
import m.InterfaceC4736g0;
import m.InterfaceC4738h0;
import m.Y0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4736g0 f4689A;

    /* renamed from: n, reason: collision with root package name */
    public TypedValue f4690n;

    /* renamed from: u, reason: collision with root package name */
    public TypedValue f4691u;

    /* renamed from: v, reason: collision with root package name */
    public TypedValue f4692v;

    /* renamed from: w, reason: collision with root package name */
    public TypedValue f4693w;

    /* renamed from: x, reason: collision with root package name */
    public TypedValue f4694x;

    /* renamed from: y, reason: collision with root package name */
    public TypedValue f4695y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f4696z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4696z = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4694x == null) {
            this.f4694x = new TypedValue();
        }
        return this.f4694x;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4695y == null) {
            this.f4695y = new TypedValue();
        }
        return this.f4695y;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4692v == null) {
            this.f4692v = new TypedValue();
        }
        return this.f4692v;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4693w == null) {
            this.f4693w = new TypedValue();
        }
        return this.f4693w;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4690n == null) {
            this.f4690n = new TypedValue();
        }
        return this.f4690n;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4691u == null) {
            this.f4691u = new TypedValue();
        }
        return this.f4691u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC4736g0 interfaceC4736g0 = this.f4689A;
        if (interfaceC4736g0 != null) {
            interfaceC4736g0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C4743k c4743k;
        super.onDetachedFromWindow();
        InterfaceC4736g0 interfaceC4736g0 = this.f4689A;
        if (interfaceC4736g0 != null) {
            LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) ((C4524d) interfaceC4736g0).f37858u;
            InterfaceC4738h0 interfaceC4738h0 = layoutInflaterFactory2C4535B.f37986K;
            if (interfaceC4738h0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4738h0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f4671x).f39353a.f4724n;
                if (actionMenuView != null && (c4743k = actionMenuView.f4677M) != null) {
                    c4743k.f();
                    C4735g c4735g = c4743k.f39439M;
                    if (c4735g != null && c4735g.b()) {
                        c4735g.i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C4535B.f37994P != null) {
                layoutInflaterFactory2C4535B.f37975E.getDecorView().removeCallbacks(layoutInflaterFactory2C4535B.f37995Q);
                if (layoutInflaterFactory2C4535B.f37994P.isShowing()) {
                    try {
                        layoutInflaterFactory2C4535B.f37994P.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C4535B.f37994P = null;
            }
            C0343e0 c0343e0 = layoutInflaterFactory2C4535B.f37996R;
            if (c0343e0 != null) {
                c0343e0.b();
            }
            l lVar = layoutInflaterFactory2C4535B.B(0).f37959h;
            if (lVar != null) {
                lVar.c(true);
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
    public final void onMeasure(int i, int i4) {
        int i9;
        boolean z8;
        int i10;
        int measuredWidth;
        TypedValue typedValue;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z9 = true;
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f4696z;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z10 ? this.f4693w : this.f4692v;
            if (typedValue2 != null && (i15 = typedValue2.type) != 0) {
                if (i15 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i15 == 6) {
                    int i17 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i17, i17);
                } else {
                    i16 = 0;
                    if (i16 > 0) {
                        i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z8 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z10 ? this.f4694x : this.f4695y;
                            if (typedValue3 != null && (i13 = typedValue3.type) != 0) {
                                if (i13 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i13 == 6) {
                                    int i18 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i18, i18);
                                } else {
                                    i14 = 0;
                                    if (i14 > 0) {
                                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                                        super.onMeasure(i9, i10);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z8 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z10 ? this.f4691u : this.f4690n;
                                            if (typedValue != null && (i11 = typedValue.type) != 0) {
                                                if (i11 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i11 == 6) {
                                                    int i19 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i19, i19);
                                                } else {
                                                    i12 = 0;
                                                    if (i12 > 0) {
                                                        i12 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i12) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                                                        if (z9) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i10);
                                                        return;
                                                    }
                                                }
                                                i12 = (int) fraction;
                                                if (i12 > 0) {
                                                }
                                                if (measuredWidth < i12) {
                                                }
                                            }
                                        }
                                        z9 = false;
                                        if (z9) {
                                        }
                                    }
                                }
                                i14 = (int) fraction2;
                                if (i14 > 0) {
                                }
                            }
                        }
                        i10 = i4;
                        super.onMeasure(i9, i10);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z8) {
                            if (!z10) {
                            }
                            if (typedValue != null) {
                                if (i11 != 5) {
                                }
                                i12 = (int) fraction;
                                if (i12 > 0) {
                                }
                                if (measuredWidth < i12) {
                                }
                            }
                        }
                        z9 = false;
                        if (z9) {
                        }
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                }
            }
        }
        i9 = i;
        z8 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i10 = i4;
        super.onMeasure(i9, i10);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z8) {
        }
        z9 = false;
        if (z9) {
        }
    }

    public void setAttachListener(InterfaceC4736g0 interfaceC4736g0) {
        this.f4689A = interfaceC4736g0;
    }
}
