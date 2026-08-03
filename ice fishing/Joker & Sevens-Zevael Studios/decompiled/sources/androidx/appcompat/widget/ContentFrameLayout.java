package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import m.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f430g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f431h;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f432i;

    /* renamed from: j, reason: collision with root package name */
    public TypedValue f433j;

    /* renamed from: k, reason: collision with root package name */
    public TypedValue f434k;

    /* renamed from: l, reason: collision with root package name */
    public TypedValue f435l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f436m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f436m = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f434k == null) {
            this.f434k = new TypedValue();
        }
        return this.f434k;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f435l == null) {
            this.f435l = new TypedValue();
        }
        return this.f435l;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f432i == null) {
            this.f432i = new TypedValue();
        }
        return this.f432i;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f433j == null) {
            this.f433j = new TypedValue();
        }
        return this.f433j;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f430g == null) {
            this.f430g = new TypedValue();
        }
        return this.f430g;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f431h == null) {
            this.f431h = new TypedValue();
        }
        return this.f431h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int measuredWidth;
        TypedValue typedValue;
        int i14;
        int i15;
        float fraction;
        int i16;
        int i17;
        float fraction2;
        int i18;
        int i19;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f436m;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.f433j : this.f432i;
            if (typedValue2 != null && (i18 = typedValue2.type) != 0) {
                if (i18 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i18 == 6) {
                    int i20 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i20, i20);
                } else {
                    i19 = 0;
                    if (i19 > 0) {
                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i19 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z12 ? this.f434k : this.f435l;
                            if (typedValue3 != null && (i16 = typedValue3.type) != 0) {
                                if (i16 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i16 == 6) {
                                    int i21 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i21, i21);
                                } else {
                                    i17 = 0;
                                    if (i17 > 0) {
                                        i13 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                                        super.onMeasure(i12, i13);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z10 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z12 ? this.f431h : this.f430g;
                                            if (typedValue != null && (i14 = typedValue.type) != 0) {
                                                if (i14 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i14 == 6) {
                                                    int i22 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i22, i22);
                                                } else {
                                                    i15 = 0;
                                                    if (i15 > 0) {
                                                        i15 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i15) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                                                        if (z11) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i13);
                                                        return;
                                                    }
                                                }
                                                i15 = (int) fraction;
                                                if (i15 > 0) {
                                                }
                                                if (measuredWidth < i15) {
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z11) {
                                        }
                                    }
                                }
                                i17 = (int) fraction2;
                                if (i17 > 0) {
                                }
                            }
                        }
                        i13 = i11;
                        super.onMeasure(i12, i13);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z10) {
                            if (!z12) {
                            }
                            if (typedValue != null) {
                                if (i14 != 5) {
                                }
                                i15 = (int) fraction;
                                if (i15 > 0) {
                                }
                                if (measuredWidth < i15) {
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    }
                }
                i19 = (int) fraction3;
                if (i19 > 0) {
                }
            }
        }
        i12 = i10;
        z10 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i13 = i11;
        super.onMeasure(i12, i13);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z10) {
        }
        z11 = false;
        if (z11) {
        }
    }

    public void setAttachListener(a0 a0Var) {
    }
}
