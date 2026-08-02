package androidx.appcompat.widget;

import O.C0335e0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import h.LayoutInflaterFactory2C4537A;
import l.m;
import m.C4700g;
import m.C4708k;
import m.InterfaceC4701g0;
import m.InterfaceC4703h0;
import m.Y0;
import n4.c;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4701g0 f4542A;

    /* renamed from: n, reason: collision with root package name */
    public TypedValue f4543n;

    /* renamed from: u, reason: collision with root package name */
    public TypedValue f4544u;

    /* renamed from: v, reason: collision with root package name */
    public TypedValue f4545v;

    /* renamed from: w, reason: collision with root package name */
    public TypedValue f4546w;

    /* renamed from: x, reason: collision with root package name */
    public TypedValue f4547x;

    /* renamed from: y, reason: collision with root package name */
    public TypedValue f4548y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f4549z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4549z = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4547x == null) {
            this.f4547x = new TypedValue();
        }
        return this.f4547x;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4548y == null) {
            this.f4548y = new TypedValue();
        }
        return this.f4548y;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4545v == null) {
            this.f4545v = new TypedValue();
        }
        return this.f4545v;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4546w == null) {
            this.f4546w = new TypedValue();
        }
        return this.f4546w;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4543n == null) {
            this.f4543n = new TypedValue();
        }
        return this.f4543n;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4544u == null) {
            this.f4544u = new TypedValue();
        }
        return this.f4544u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC4701g0 interfaceC4701g0 = this.f4542A;
        if (interfaceC4701g0 != null) {
            interfaceC4701g0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C4708k c4708k;
        super.onDetachedFromWindow();
        InterfaceC4701g0 interfaceC4701g0 = this.f4542A;
        if (interfaceC4701g0 != null) {
            LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) ((c) interfaceC4701g0).f39658u;
            InterfaceC4703h0 interfaceC4703h0 = layoutInflaterFactory2C4537A.f37797K;
            if (interfaceC4703h0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4703h0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f4524x).f39151a.f4579n;
                if (actionMenuView != null && (c4708k = actionMenuView.f4530M) != null) {
                    c4708k.f();
                    C4700g c4700g = c4708k.f39237M;
                    if (c4700g != null && c4700g.b()) {
                        c4700g.i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C4537A.f37802P != null) {
                layoutInflaterFactory2C4537A.f37788E.getDecorView().removeCallbacks(layoutInflaterFactory2C4537A.f37803Q);
                if (layoutInflaterFactory2C4537A.f37802P.isShowing()) {
                    try {
                        layoutInflaterFactory2C4537A.f37802P.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C4537A.f37802P = null;
            }
            C0335e0 c0335e0 = layoutInflaterFactory2C4537A.f37804R;
            if (c0335e0 != null) {
                c0335e0.b();
            }
            m mVar = layoutInflaterFactory2C4537A.B(0).f37960h;
            if (mVar != null) {
                mVar.c(true);
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
        int i6;
        boolean z6;
        int i9;
        int measuredWidth;
        TypedValue typedValue;
        int i10;
        int i11;
        float fraction;
        int i12;
        int i13;
        float fraction2;
        int i14;
        int i15;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z9 = true;
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f4549z;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z10 ? this.f4546w : this.f4545v;
            if (typedValue2 != null && (i14 = typedValue2.type) != 0) {
                if (i14 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i14 == 6) {
                    int i16 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i16, i16);
                } else {
                    i15 = 0;
                    if (i15 > 0) {
                        i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z6 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z10 ? this.f4547x : this.f4548y;
                            if (typedValue3 != null && (i12 = typedValue3.type) != 0) {
                                if (i12 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i12 == 6) {
                                    int i17 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i17, i17);
                                } else {
                                    i13 = 0;
                                    if (i13 > 0) {
                                        i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                                        super.onMeasure(i6, i9);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z6 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z10 ? this.f4544u : this.f4543n;
                                            if (typedValue != null && (i10 = typedValue.type) != 0) {
                                                if (i10 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i10 == 6) {
                                                    int i18 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i18, i18);
                                                } else {
                                                    i11 = 0;
                                                    if (i11 > 0) {
                                                        i11 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i11) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                                                        if (z9) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i9);
                                                        return;
                                                    }
                                                }
                                                i11 = (int) fraction;
                                                if (i11 > 0) {
                                                }
                                                if (measuredWidth < i11) {
                                                }
                                            }
                                        }
                                        z9 = false;
                                        if (z9) {
                                        }
                                    }
                                }
                                i13 = (int) fraction2;
                                if (i13 > 0) {
                                }
                            }
                        }
                        i9 = i4;
                        super.onMeasure(i6, i9);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z6) {
                            if (!z10) {
                            }
                            if (typedValue != null) {
                                if (i10 != 5) {
                                }
                                i11 = (int) fraction;
                                if (i11 > 0) {
                                }
                                if (measuredWidth < i11) {
                                }
                            }
                        }
                        z9 = false;
                        if (z9) {
                        }
                    }
                }
                i15 = (int) fraction3;
                if (i15 > 0) {
                }
            }
        }
        i6 = i;
        z6 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i9 = i4;
        super.onMeasure(i6, i9);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z6) {
        }
        z9 = false;
        if (z9) {
        }
    }

    public void setAttachListener(InterfaceC4701g0 interfaceC4701g0) {
        this.f4542A = interfaceC4701g0;
    }
}
