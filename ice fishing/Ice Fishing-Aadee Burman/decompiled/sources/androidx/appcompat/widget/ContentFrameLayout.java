package androidx.appcompat.widget;

import I0.j;
import O.C0330e0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import h.LayoutInflaterFactory2C4533A;
import l.m;
import m.C4687g;
import m.C4695k;
import m.InterfaceC4688g0;
import m.InterfaceC4690h0;
import m.X0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4688g0 f4574A;

    /* renamed from: n, reason: collision with root package name */
    public TypedValue f4575n;

    /* renamed from: u, reason: collision with root package name */
    public TypedValue f4576u;

    /* renamed from: v, reason: collision with root package name */
    public TypedValue f4577v;

    /* renamed from: w, reason: collision with root package name */
    public TypedValue f4578w;

    /* renamed from: x, reason: collision with root package name */
    public TypedValue f4579x;

    /* renamed from: y, reason: collision with root package name */
    public TypedValue f4580y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f4581z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4581z = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4579x == null) {
            this.f4579x = new TypedValue();
        }
        return this.f4579x;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4580y == null) {
            this.f4580y = new TypedValue();
        }
        return this.f4580y;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4577v == null) {
            this.f4577v = new TypedValue();
        }
        return this.f4577v;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4578w == null) {
            this.f4578w = new TypedValue();
        }
        return this.f4578w;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4575n == null) {
            this.f4575n = new TypedValue();
        }
        return this.f4575n;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4576u == null) {
            this.f4576u = new TypedValue();
        }
        return this.f4576u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC4688g0 interfaceC4688g0 = this.f4574A;
        if (interfaceC4688g0 != null) {
            interfaceC4688g0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C4695k c4695k;
        super.onDetachedFromWindow();
        InterfaceC4688g0 interfaceC4688g0 = this.f4574A;
        if (interfaceC4688g0 != null) {
            LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) ((j) interfaceC4688g0).f1264u;
            InterfaceC4690h0 interfaceC4690h0 = layoutInflaterFactory2C4533A.f37773K;
            if (interfaceC4690h0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4690h0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((X0) actionBarOverlayLayout.f4556x).f39081a.f4609n;
                if (actionMenuView != null && (c4695k = actionMenuView.f4562M) != null) {
                    c4695k.f();
                    C4687g c4687g = c4695k.f39168M;
                    if (c4687g != null && c4687g.b()) {
                        c4687g.i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C4533A.f37781P != null) {
                layoutInflaterFactory2C4533A.f37762E.getDecorView().removeCallbacks(layoutInflaterFactory2C4533A.f37782Q);
                if (layoutInflaterFactory2C4533A.f37781P.isShowing()) {
                    try {
                        layoutInflaterFactory2C4533A.f37781P.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C4533A.f37781P = null;
            }
            C0330e0 c0330e0 = layoutInflaterFactory2C4533A.f37783R;
            if (c0330e0 != null) {
                c0330e0.b();
            }
            m mVar = layoutInflaterFactory2C4533A.B(0).f37934h;
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
    public final void onMeasure(int i, int i6) {
        int i9;
        boolean z3;
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
        boolean z6 = true;
        boolean z9 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i6);
        Rect rect = this.f4581z;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z9 ? this.f4578w : this.f4577v;
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
                        z3 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z9 ? this.f4579x : this.f4580y;
                            if (typedValue3 != null && (i13 = typedValue3.type) != 0) {
                                if (i13 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i13 == 6) {
                                    int i18 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i18, i18);
                                } else {
                                    i14 = 0;
                                    if (i14 > 0) {
                                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i6)), 1073741824);
                                        super.onMeasure(i9, i10);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z3 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z9 ? this.f4576u : this.f4575n;
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
                                                        if (z6) {
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
                                        z6 = false;
                                        if (z6) {
                                        }
                                    }
                                }
                                i14 = (int) fraction2;
                                if (i14 > 0) {
                                }
                            }
                        }
                        i10 = i6;
                        super.onMeasure(i9, i10);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z3) {
                            if (!z9) {
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
                        z6 = false;
                        if (z6) {
                        }
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                }
            }
        }
        i9 = i;
        z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i10 = i6;
        super.onMeasure(i9, i10);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z3) {
        }
        z6 = false;
        if (z6) {
        }
    }

    public void setAttachListener(InterfaceC4688g0 interfaceC4688g0) {
        this.f4574A = interfaceC4688g0;
    }
}
