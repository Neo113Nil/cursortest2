package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class k6g extends y0a implements sq1 {
    public static final /* synthetic */ s9f[] E;
    public static final Pair F;
    public final ArrayList A;
    public final LinkedHashSet B;
    public float C;
    public final ArrayList D;
    public int c;
    public int d;
    public final q13 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final q13 k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final x0a s;
    public int t;
    public int u;
    public Drawable v;
    public final q13 w;
    public final ArrayList x;
    public final LinkedHashSet y;
    public int z;

    static {
        opi opiVar = new opi(k6g.class, "orientation", "getOrientation()I", 0);
        ern.a.getClass();
        E = new s9f[]{opiVar, new opi(k6g.class, "aspectRatio", "getAspectRatio()F", 0), new opi(k6g.class, "showDividers", "getShowDividers()I", 0)};
        F = new Pair(0, 0);
    }

    public k6g(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1;
        this.d = -1;
        this.e = tyf.r(0);
        this.k = new q13(Float.valueOf(0.0f), rq1.s);
        this.s = new x0a();
        this.t = -1;
        this.u = -1;
        this.w = tyf.r(0);
        this.x = new ArrayList();
        this.y = new LinkedHashSet();
        this.A = new ArrayList();
        this.B = new LinkedHashSet();
        this.D = new ArrayList();
    }

    private final int getDividerHeightWithMargins() {
        return this.m + this.n + this.o;
    }

    private final int getDividerWidthWithMargins() {
        return this.l + this.q + this.p;
    }

    private final int getVisibleChildCount() {
        c7 c7Var = new c7(8, this);
        int i = 0;
        while (c7Var.hasNext()) {
            if (!(((View) c7Var.next()).getVisibility() == 8) && (i = i + 1) < 0) {
                u75.m();
                throw null;
            }
        }
        return i;
    }

    public static float o(int i, float f) {
        return f > 0.0f ? f : i == -1 ? 1.0f : 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if (r3 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (r3 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        r0 = r17;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        r2 = r7;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        r12.set(defpackage.u75.g(r12), new kotlin.Pair(java.lang.Integer.valueOf(((java.lang.Number) r8.a).intValue() + r3), java.lang.Integer.valueOf(((java.lang.Number) r8.b).intValue() + r3)));
        r1 = 0;
        r0 = r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, boolean z) {
        float f;
        float o;
        k6g k6gVar = this;
        int i2 = i + k6gVar.i;
        float f2 = k6gVar.C;
        Pair pair = F;
        while (i2 != 0) {
            float f3 = 0.0f;
            if (f2 <= 0.0f) {
                return;
            }
            Iterator it = k6gVar.A.iterator();
            float f4 = f2;
            Pair pair2 = pair;
            float f5 = 0.0f;
            int i3 = 0;
            int i4 = i2;
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList = k6gVar.D;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                int i5 = i3 + 1;
                if (i3 < 0) {
                    u75.n();
                    throw null;
                }
                View view = (View) next;
                Pair pair3 = (Pair) arrayList.get(i3);
                int intValue = ((Number) pair3.a).intValue();
                int intValue2 = ((Number) pair3.b).intValue();
                if (intValue == intValue2) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.getClass();
                    u79 u79Var = (u79) layoutParams;
                    if (z) {
                        f = f3;
                        o = o(((ViewGroup.MarginLayoutParams) u79Var).width, u79Var.d);
                    } else {
                        f = f3;
                        o = o(((ViewGroup.MarginLayoutParams) u79Var).height, u79Var.c);
                    }
                    float f6 = (i2 * o) / f2;
                    int b = eeh.b(f6);
                    float f7 = b - f6;
                    f5 += f7;
                    int i6 = b + intValue2;
                    if (Math.abs(f5) >= 1.0f && f7 != f) {
                        float signum = Math.signum(f7);
                        i6 -= (int) signum;
                        f5 -= signum;
                    }
                    int min = Math.min(Math.max(i6, z ? view.getMinimumWidth() : view.getMinimumHeight()), z ? u79Var.h : u79Var.g);
                    i4 -= min - intValue2;
                    if (i6 != min) {
                        f4 -= o;
                    }
                    pair2 = new Pair(Integer.valueOf(i6), Integer.valueOf(min));
                    arrayList.set(i3, pair2);
                } else {
                    f = f3;
                }
                k6gVar = this;
                f3 = f;
                i3 = i5;
            }
        }
    }

    @Override // defpackage.y0a, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return r() ? new u79(-1, -2) : new u79(-2, -2);
    }

    public float getAspectRatio() {
        s9f s9fVar = E[1];
        q13 q13Var = this.k;
        q13Var.getClass();
        return ((Number) q13Var.a).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (!r()) {
            int i = this.c;
            return i != -1 ? getPaddingTop() + i : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        int baseline = childAt.getBaseline();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.getClass();
        return getPaddingTop() + baseline + ((ViewGroup.MarginLayoutParams) ((u79) layoutParams)).topMargin;
    }

    public final Drawable getDividerDrawable() {
        return this.v;
    }

    public final int getOrientation() {
        s9f s9fVar = E[0];
        q13 q13Var = this.e;
        q13Var.getClass();
        return ((Number) q13Var.a).intValue();
    }

    public final int getShowDividers() {
        s9f s9fVar = E[2];
        q13 q13Var = this.w;
        q13Var.getClass();
        return ((Number) q13Var.a).intValue();
    }

    public final Unit j(Canvas canvas, int i, int i2, int i3, int i4) {
        Drawable drawable = this.v;
        if (drawable == null) {
            return null;
        }
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float f3 = this.l / 2.0f;
        float f4 = this.m / 2.0f;
        drawable.setBounds(Math.max((int) (f - f3), i), Math.max((int) (f2 - f4), i2), Math.min((int) (f + f3), i3), Math.min((int) (f2 + f4), i4));
        drawable.draw(canvas);
        return Unit.a;
    }

    public final int n(int i) {
        int dividerHeightWithMargins = r() ? getDividerHeightWithMargins() : getDividerWidthWithMargins();
        if (q(i)) {
            return dividerHeightWithMargins;
        }
        if (i != this.t && i <= this.u) {
            return this.r;
        }
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int height;
        if (this.v == null) {
            return;
        }
        boolean r = r();
        x0a x0aVar = this.s;
        if (r) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && q(i3)) {
                    int top = childAt.getTop();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.getClass();
                    int i4 = (((top - ((ViewGroup.MarginLayoutParams) ((u79) layoutParams)).topMargin) - this.m) - this.o) - (i3 == this.t ? x0aVar.c : (int) (x0aVar.b / 2));
                    j(canvas, this.p + getPaddingLeft(), i4, (getWidth() - getPaddingRight()) - this.q, i4 + this.m);
                }
                i3++;
            }
            if (q(getChildCount())) {
                View childAt2 = getChildAt(getChildCount() - 1);
                if (childAt2 != null) {
                    int bottom = childAt2.getBottom();
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    layoutParams2.getClass();
                    height = bottom + ((ViewGroup.MarginLayoutParams) ((u79) layoutParams2)).bottomMargin + this.n + x0aVar.c;
                } else {
                    height = (((getHeight() - getPaddingBottom()) - this.m) - this.o) - x0aVar.c;
                }
                int i5 = height;
                j(canvas, this.p + getPaddingLeft(), i5, (getWidth() - getPaddingRight()) - this.q, i5 + this.m);
                return;
            }
            return;
        }
        boolean N = wyf.N(this);
        int childCount2 = getChildCount();
        int i6 = 0;
        while (i6 < childCount2) {
            View childAt3 = getChildAt(i6);
            if (childAt3.getVisibility() != 8 && q(i6)) {
                int i7 = i6 == this.t ? x0aVar.c : (int) (x0aVar.b / 2);
                if (N) {
                    int right = childAt3.getRight();
                    ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                    layoutParams3.getClass();
                    i2 = right + ((ViewGroup.MarginLayoutParams) ((u79) layoutParams3)).rightMargin + this.p + i7;
                } else {
                    int left = childAt3.getLeft();
                    ViewGroup.LayoutParams layoutParams4 = childAt3.getLayoutParams();
                    layoutParams4.getClass();
                    i2 = (((left - ((ViewGroup.MarginLayoutParams) ((u79) layoutParams4)).leftMargin) - this.l) - this.q) - i7;
                }
                int i8 = i2;
                j(canvas, i8, this.n + getPaddingTop(), i8 + this.l, (getHeight() - getPaddingBottom()) - this.o);
            }
            i6++;
        }
        if (q(getChildCount())) {
            View childAt4 = getChildAt(getChildCount() - 1);
            if (childAt4 == null && N) {
                i = getPaddingLeft() + this.p + x0aVar.c;
            } else if (childAt4 == null) {
                i = (((getWidth() - getPaddingRight()) - this.l) - this.q) - x0aVar.c;
            } else if (N) {
                int left2 = childAt4.getLeft();
                ViewGroup.LayoutParams layoutParams5 = childAt4.getLayoutParams();
                layoutParams5.getClass();
                i = (((left2 - ((ViewGroup.MarginLayoutParams) ((u79) layoutParams5)).leftMargin) - this.l) - this.q) - x0aVar.c;
            } else {
                int right2 = childAt4.getRight();
                ViewGroup.LayoutParams layoutParams6 = childAt4.getLayoutParams();
                layoutParams6.getClass();
                i = x0aVar.c + right2 + ((ViewGroup.MarginLayoutParams) ((u79) layoutParams6)).rightMargin + this.p;
            }
            int i9 = i;
            j(canvas, i9, this.n + getPaddingTop(), i9 + this.l, (getHeight() - getPaddingBottom()) - this.o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int baseline;
        boolean r = r();
        x0a x0aVar = this.s;
        if (r) {
            int horizontalPaddings$div_release = (i3 - i) - getHorizontalPaddings$div_release();
            float f = (i4 - i2) - this.f;
            float paddingTop = getPaddingTop();
            x0aVar.a(getVerticalGravity$div_release(), f, getVisibleChildCount());
            float f2 = paddingTop + x0aVar.a;
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.getClass();
                    u79 u79Var = (u79) layoutParams;
                    int i8 = u79Var.a & 125829127;
                    if (i8 < 0) {
                        i8 = getHorizontalGravity$div_release();
                    }
                    int layoutDirection = getLayoutDirection();
                    int paddingLeft = getPaddingLeft();
                    int absoluteGravity = Gravity.getAbsoluteGravity(i8, layoutDirection);
                    int i9 = paddingLeft + (absoluteGravity != 1 ? absoluteGravity != 3 ? absoluteGravity != 5 ? ((ViewGroup.MarginLayoutParams) u79Var).leftMargin : (horizontalPaddings$div_release - measuredWidth) - ((ViewGroup.MarginLayoutParams) u79Var).rightMargin : ((ViewGroup.MarginLayoutParams) u79Var).leftMargin : (((horizontalPaddings$div_release - measuredWidth) + ((ViewGroup.MarginLayoutParams) u79Var).leftMargin) - ((ViewGroup.MarginLayoutParams) u79Var).rightMargin) / 2);
                    float n = f2 + n(i7) + ((ViewGroup.MarginLayoutParams) u79Var).topMargin;
                    int b = eeh.b(n);
                    childAt.layout(i9, b, measuredWidth + i9, b + measuredHeight);
                    f2 = measuredHeight + ((ViewGroup.MarginLayoutParams) u79Var).bottomMargin + x0aVar.b + n;
                }
            }
            return;
        }
        int verticalPaddings$div_release = (i4 - i2) - getVerticalPaddings$div_release();
        int layoutDirection2 = getLayoutDirection();
        float f3 = (i3 - i) - this.f;
        float paddingLeft2 = getPaddingLeft();
        x0aVar.a(Gravity.getAbsoluteGravity(getHorizontalGravity$div_release(), layoutDirection2), f3, getVisibleChildCount());
        float f4 = paddingLeft2 + x0aVar.a;
        a H = wyf.H(this, 0, getChildCount());
        int i10 = H.a;
        int i11 = H.b;
        int i12 = H.c;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            View childAt2 = getChildAt(i10);
            if (childAt2 != null && childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                layoutParams2.getClass();
                u79 u79Var2 = (u79) layoutParams2;
                int i13 = u79Var2.a & 1879048304;
                if (i13 < 0) {
                    i13 = getVerticalGravity$div_release();
                }
                int paddingTop2 = getPaddingTop();
                if (i13 == 16) {
                    i5 = (((verticalPaddings$div_release - measuredHeight2) + ((ViewGroup.MarginLayoutParams) u79Var2).topMargin) - ((ViewGroup.MarginLayoutParams) u79Var2).bottomMargin) / 2;
                } else if (i13 != 48) {
                    if (i13 != 80) {
                        i5 = 0;
                    } else {
                        i6 = verticalPaddings$div_release - measuredHeight2;
                        baseline = ((ViewGroup.MarginLayoutParams) u79Var2).bottomMargin;
                        i5 = i6 - baseline;
                    }
                } else if (!u79Var2.b || ((ViewGroup.MarginLayoutParams) u79Var2).height == -1 || childAt2.getBaseline() == -1) {
                    i5 = ((ViewGroup.MarginLayoutParams) u79Var2).topMargin;
                } else {
                    i6 = this.c;
                    baseline = childAt2.getBaseline();
                    i5 = i6 - baseline;
                }
                int i14 = paddingTop2 + i5;
                float n2 = f4 + n(wyf.N(this) ? i10 + 1 : i10) + ((ViewGroup.MarginLayoutParams) u79Var2).leftMargin;
                int b2 = eeh.b(n2);
                childAt2.layout(b2, i14, b2 + measuredWidth2, measuredHeight2 + i14);
                f4 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) u79Var2).rightMargin + x0aVar.b + n2;
            }
            if (i10 == i11) {
                return;
            } else {
                i10 += i12;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0235, code lost:
    
        r0.f = r0.n(r0.getChildCount()) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0240, code lost:
    
        r0.f = r0.getVerticalPaddings$div_release() + r0.f;
        r1 = android.view.View.MeasureSpec.getSize(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0253, code lost:
    
        if (r0.getAspectRatio() != r17) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0256, code lost:
    
        if (r16 != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0258, code lost:
    
        r1 = defpackage.eeh.b((android.view.View.resolveSizeAndState(r0.z, r27, r0.j) & 16777215) / r0.getAspectRatio());
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r1, 1073741824);
        r0.w(r27, r1, r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a1, code lost:
    
        r0.setMeasuredDimension(android.view.View.resolveSizeAndState(r0.z, r27, r0.j), android.view.View.resolveSizeAndState(r1, r5, r0.j << 16));
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0767, code lost:
    
        r11.clear();
        r15.clear();
        r24.clear();
        r10.clear();
        r14.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0776, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x027c, code lost:
    
        if (r0.getAspectRatio() != r17) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0282, code lost:
    
        if (defpackage.tyf.A(r3) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0284, code lost:
    
        r0.w(r27, java.lang.Math.max(r0.f, r0.getSuggestedMinimumHeight()), r3, r7);
        r1 = java.lang.Math.max(r0.f, r0.getSuggestedMinimumHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x029b, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x029d, code lost:
    
        r0.w(r27, r1, r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x019f, code lost:
    
        if (r0.z == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a1, code lost:
    
        r1 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a9, code lost:
    
        if (r1.hasNext() == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ab, code lost:
    
        r4 = (android.view.View) r1.next();
        r5 = r0.z;
        r8 = r4.getMinimumWidth();
        r4 = r4.getLayoutParams();
        r4.getClass();
        r0.z = java.lang.Math.max(r5, ((defpackage.u79) r4).b() + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cc, code lost:
    
        r8 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d4, code lost:
    
        if (r8.hasNext() == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d6, code lost:
    
        r1 = (android.view.View) r8.next();
        r0.s(r1, r27, r3, true, false);
        r6.remove(r1);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00cb, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00b9, code lost:
    
        r17 = 0.0f;
        r1 = java.lang.Math.max(r0.getSuggestedMinimumWidth(), r0.getHorizontalPaddings$div_release());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x009e, code lost:
    
        if (r16 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00a0, code lost:
    
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(defpackage.eeh.b(r1 / r0.getAspectRatio()), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00b0, code lost:
    
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0091, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b8, code lost:
    
        r12 = r27;
        r6 = r2;
        r14 = r3;
        r10 = r4;
        r0.c = -1;
        r0.d = -1;
        r7 = defpackage.tyf.A(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d0, code lost:
    
        if (r0.getAspectRatio() != 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d2, code lost:
    
        r4 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02f5, code lost:
    
        r8 = android.view.View.MeasureSpec.getSize(r4);
        r16 = defpackage.tyf.A(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02fd, code lost:
    
        if (r16 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ff, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x030d, code lost:
    
        if (r1 >= 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x030f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0310, code lost:
    
        r2 = r0.getChildCount();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0315, code lost:
    
        if (r3 >= r2) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0317, code lost:
    
        r19 = r1;
        r1 = r0.getChildAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0323, code lost:
    
        if (r1.getVisibility() == 8) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0325, code lost:
    
        r0.f = r0.n(r3) + r0.f;
        r5 = r0.C;
        r9 = r1.getLayoutParams();
        r9.getClass();
        r9 = (defpackage.u79) r9;
        r22 = r2;
        r0.C = o(((android.view.ViewGroup.MarginLayoutParams) r9).width, r9.d) + r5;
        r2 = r1.getLayoutParams();
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0352, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) ((defpackage.u79) r2)).width != (-1)) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0354, code lost:
    
        r10.add(r1);
        r14.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x035a, code lost:
    
        r2 = r1.getLayoutParams();
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0365, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) ((defpackage.u79) r2)).width != (-1)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r0.t = r1;
        r2 = 0;
        r3 = 0;
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x036b, code lost:
    
        if (defpackage.tyf.A(r12) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x036e, code lost:
    
        r2 = r1.getLayoutParams();
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0379, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) ((defpackage.u79) r2)).width != (-1)) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x037b, code lost:
    
        r0.i = r1.getMinimumWidth() + r0.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0455, code lost:
    
        r24 = r6;
        r23 = r7;
        r21 = r8;
        r2 = r12;
        r12 = r19;
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0460, code lost:
    
        r3 = r19 + 1;
        r1 = r12;
        r8 = r21;
        r7 = r23;
        r6 = r24;
        r12 = r2;
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0386, code lost:
    
        r2 = r1.getLayoutParams();
        r2.getClass();
        r9 = (defpackage.u79) r2;
        r2 = ((android.view.ViewGroup.MarginLayoutParams) r9).width;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0393, code lost:
    
        if (r2 == (-3)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0396, code lost:
    
        if (r2 == (-1)) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0398, code lost:
    
        r19 = r3;
        r2 = r12;
        r12 = r19;
        r0.measureChildWithMargins(r1, r2, 0, r4, 0);
        r0 = r26;
        r2 = r27;
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03ab, code lost:
    
        r23 = r7;
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0425, code lost:
    
        r0.j = android.view.View.combineMeasuredStates(r0.j, r1.getMeasuredState());
        r0.y(r4, r9.d() + r1.getMeasuredHeight());
        r0.x(r1);
        r3 = r0.f;
        r0.f = java.lang.Math.max(r3, (r9.b() + r1.getMeasuredWidth()) + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03b1, code lost:
    
        r12 = r19;
        r19 = r3;
        r0 = r1.getLayoutParams();
        r0.getClass();
        r0 = (defpackage.u79) r0;
        ((android.view.ViewGroup.MarginLayoutParams) r0).width = -2;
        r24 = r6;
        r0 = r26;
        r0.measureChildWithMargins(r1, r27, 0, r4, 0);
        ((android.view.ViewGroup.MarginLayoutParams) r0).width = -1;
        r2 = r0.h;
        r0.h = java.lang.Math.max(r2, (r0.b() + r1.getMeasuredWidth()) + r2);
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03e5, code lost:
    
        r24 = r6;
        r12 = r19;
        r19 = r3;
        r2 = r1.getLayoutParams();
        r2.getClass();
        r6 = (defpackage.u79) r2;
        r2 = r6.h;
        ((android.view.ViewGroup.MarginLayoutParams) r6).width = -2;
        r6.h = Integer.MAX_VALUE;
        r23 = r7;
        r21 = r8;
        r2 = r27;
        r0.measureChildWithMargins(r1, r2, 0, r4, 0);
        ((android.view.ViewGroup.MarginLayoutParams) r6).width = -3;
        r6.h = r2;
        r3 = r0.g;
        r0.g = java.lang.Math.max(r3, (r6.b() + r1.getMeasuredWidth()) + r3);
        r11.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0453, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r3 >= r0.getChildCount()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x046f, code lost:
    
        r24 = r6;
        r23 = r7;
        r21 = r8;
        r2 = r12;
        r12 = r1;
        r1 = r0.getChildCount();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x047d, code lost:
    
        if (r3 >= r1) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x047f, code lost:
    
        r5 = r0.getChildAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0489, code lost:
    
        if (r5.getVisibility() == 8) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x048b, code lost:
    
        r6 = r5.getLayoutParams();
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0497, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) ((defpackage.u79) r6)).width != (-1)) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x049d, code lost:
    
        if (defpackage.tyf.A(r2) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04a0, code lost:
    
        r6 = r0.f;
        r5 = r5.getLayoutParams();
        r5.getClass();
        r0.f = java.lang.Math.max(r6, ((defpackage.u79) r5).b() + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04b6, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04b9, code lost:
    
        r1 = r0.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04bb, code lost:
    
        if (r1 <= 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04bd, code lost:
    
        r0.f = r0.n(r0.getChildCount()) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04c8, code lost:
    
        r0.f = r0.getHorizontalPaddings$div_release() + r0.f;
        r1 = android.view.View.resolveSizeAndState(java.lang.Math.max(r0.getSuggestedMinimumWidth(), r0.f), r2, r0.j) & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04e3, code lost:
    
        if (r23 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r5 == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04eb, code lost:
    
        if (r0.getAspectRatio() != 0.0f) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04ee, code lost:
    
        r3 = defpackage.eeh.b(r1 / r0.getAspectRatio());
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0502, code lost:
    
        r1 = (r1 - r0.f) - r0.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0508, code lost:
    
        if (r11 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x050e, code lost:
    
        if (r11.isEmpty() == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0537, code lost:
    
        if (r0.t(r1, r2) == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0691, code lost:
    
        r28 = r3;
        r7 = 1;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r5 = r3 + 1;
        r3 = r0.getChildAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0695, code lost:
    
        if (r16 != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x069d, code lost:
    
        if (r0.getAspectRatio() != 0.0f) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x069f, code lost:
    
        r1 = r0.getChildCount();
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x06a4, code lost:
    
        if (r3 >= r1) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x06a6, code lost:
    
        r5 = r0.getChildAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x06b0, code lost:
    
        if (r5.getVisibility() == 8) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x06b4, code lost:
    
        if (r0.z != 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x06b6, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r3 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x06b9, code lost:
    
        r8 = r5.getLayoutParams();
        r8.getClass();
        r8 = (defpackage.u79) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x06c5, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r8).height == (-1)) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x06c8, code lost:
    
        if (r6 == 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x06ca, code lost:
    
        r0.z = java.lang.Math.max(r0.z, r8.d() + r5.getMinimumHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x06ef, code lost:
    
        r3 = r3 + 1;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x06dc, code lost:
    
        r0.u(r5, r4, r5.getMeasuredWidth());
        r0.y(r4, r8.d() + r5.getMeasuredHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x06b8, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r2 < 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x06f3, code lost:
    
        r0.z = java.lang.Math.max(r12, r0.getVerticalPaddings$div_release() + r0.z);
        r1 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0703, code lost:
    
        if (r1 == (-1)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0705, code lost:
    
        r0.y(r4, r1 + r0.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x070b, code lost:
    
        r3 = android.view.View.resolveSize(r0.z, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0714, code lost:
    
        r1 = r0.getChildCount();
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0719, code lost:
    
        if (r6 >= r1) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x071b, code lost:
    
        r5 = r0.getChildAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0725, code lost:
    
        if (r5.getVisibility() == 8) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0727, code lost:
    
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r3, 1073741824);
        r12 = r5.getLayoutParams();
        r12.getClass();
        r12 = ((android.view.ViewGroup.MarginLayoutParams) ((defpackage.u79) r12)).height;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x073a, code lost:
    
        if (r12 == (-1)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x073c, code lost:
    
        if (r12 == (-3)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0749, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x073f, code lost:
    
        r0.u(r5, r8, r5.getMeasuredWidth());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r3.getVisibility() != 8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x074c, code lost:
    
        r0.setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(r0.getSuggestedMinimumWidth(), r0.f), r2, r0.j), android.view.View.resolveSizeAndState(r3, r4, r0.j << 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0712, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x053a, code lost:
    
        r0.f = 0;
        r5 = r0.p(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0540, code lost:
    
        if (r5 < 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0542, code lost:
    
        r5 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x054a, code lost:
    
        if (r5.hasNext() == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x054c, code lost:
    
        r6 = (android.view.View) r5.next();
        r7 = r6.getLayoutParams();
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0560, code lost:
    
        if (((defpackage.u79) r7).h == Integer.MAX_VALUE) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0562, code lost:
    
        r7 = r6.getMeasuredWidth();
        r13 = r6.getLayoutParams();
        r13.getClass();
        r0.u(r6, r4, java.lang.Math.min(r7, ((defpackage.u79) r13).h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0579, code lost:
    
        r28 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05f4, code lost:
    
        r1 = r0.p(r1, r2);
        r0.z = 0;
        r0.c = -1;
        r0.d = -1;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0601, code lost:
    
        if (r1 <= 0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0603, code lost:
    
        r0.f(r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0606, code lost:
    
        r3 = r0.getChildCount();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x060b, code lost:
    
        if (r5 >= r3) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x060d, code lost:
    
        r6 = r0.getChildAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0617, code lost:
    
        if (r6.getVisibility() == 8) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0619, code lost:
    
        r8 = r6.getLayoutParams();
        r8.getClass();
        r8 = (defpackage.u79) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0625, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r8).width != (-1)) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0627, code lost:
    
        if (r1 <= 0) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0629, code lost:
    
        r0.u(r6, r4, ((java.lang.Number) ((kotlin.Pair) r14.get(r10.indexOf(r6))).b).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0640, code lost:
    
        r0.u(r6, r4, java.lang.Math.max(r6.getMinimumWidth(), 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x064c, code lost:
    
        r0.y(r4, r8.d() + r6.getMeasuredHeight());
        r9 = r0.f;
        r8 = java.lang.Math.max(r9, (r8.b() + r6.getMeasuredWidth()) + r9);
        r0.f = r8;
        r0.f = r0.n(r5) + r8;
        r0.x(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r2 = r2 + 1;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0678, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x067b, code lost:
    
        r13 = 0;
        r3 = r0.n(r0.getChildCount()) + r0.f;
        r0.f = r3;
        r0.f = r0.getHorizontalPaddings$div_release() + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0582, code lost:
    
        if (r11.size() <= 1) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0584, code lost:
    
        defpackage.y75.s(r11, new defpackage.ehf(5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x058d, code lost:
    
        r6 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0595, code lost:
    
        if (r6.hasNext() == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0597, code lost:
    
        r7 = (android.view.View) r6.next();
        r9 = r7.getLayoutParams();
        r9.getClass();
        r9 = (defpackage.u79) r9;
        r13 = r7.getMeasuredWidth();
        r8 = r9.b() + r13;
        r28 = r3;
        r3 = defpackage.eeh.b(r5 * (r8 / r0.g)) + r13;
        r18 = r5;
        r5 = r7.getMinimumWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05ca, code lost:
    
        if (r3 >= r5) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05cc, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x05cd, code lost:
    
        r5 = r9.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05cf, code lost:
    
        if (r3 <= r5) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05d1, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x05d2, code lost:
    
        r0.u(r7, r4, r3);
        r0.j = android.view.View.combineMeasuredStates(r0.j, r7.getMeasuredState() & 16777216);
        r0.g -= r8;
        r5 = r18 - (r7.getMeasuredWidth() - r13);
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0511, code lost:
    
        r5 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0519, code lost:
    
        if (r5.hasNext() == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x051b, code lost:
    
        r6 = ((android.view.View) r5.next()).getLayoutParams();
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x052f, code lost:
    
        if (((defpackage.u79) r6).h == Integer.MAX_VALUE) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        defpackage.u75.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0500, code lost:
    
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0301, code lost:
    
        r1 = java.lang.Math.max(r0.getSuggestedMinimumHeight(), r0.getVerticalPaddings$div_release());
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x02d5, code lost:
    
        if (r7 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x02d7, code lost:
    
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(defpackage.eeh.b(android.view.View.MeasureSpec.getSize(r12) / r0.getAspectRatio()), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x02ed, code lost:
    
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x004d, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        defpackage.rj7.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        r0.u = r1;
        r1 = r0.r();
        r11 = r0.x;
        r13 = defpackage.k6g.F;
        r15 = r0.B;
        r2 = r0.y;
        r3 = r0.D;
        r4 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r1 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        r1 = android.view.View.MeasureSpec.getSize(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (android.view.View.MeasureSpec.getMode(r27) != 1073741824) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r0.getAspectRatio() != 0.0f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r16 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        r17 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        if (r1 >= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        r1 = r0.getChildCount();
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r12 >= r1) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        r19 = r1;
        r1 = r0.getChildAt(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        if (r1.getVisibility() == r10) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
    
        r0.f = r0.n(r12) + r0.f;
        r8 = r0.C;
        r20 = r1.getLayoutParams();
        r20.getClass();
        r10 = (defpackage.u79) r20;
        r0.C = o(((android.view.ViewGroup.MarginLayoutParams) r10).height, r10.c) + r8;
        r6 = r1.getLayoutParams();
        r6.getClass();
        r6 = (defpackage.u79) r6;
        r8 = defpackage.tyf.A(r27);
        r10 = r1.getLayoutParams();
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) ((defpackage.u79) r10)).height != (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (defpackage.tyf.A(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0125, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
    
        if (r8 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
    
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r6).height != (-1)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        r4.add(r1);
        r3.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
    
        if (r14 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
    
        r8 = r3;
        r3 = r5;
        r14 = r8;
        r6 = r2;
        r0.s(r1, r27, r3, true, true);
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0180, code lost:
    
        r12 = r12 + 1;
        r4 = r2;
        r5 = r3;
        r2 = r6;
        r3 = r14;
        r1 = r19;
        r10 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014e, code lost:
    
        r6 = r2;
        r14 = r3;
        r2 = r4;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (r8 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0154, code lost:
    
        r15.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        if (r10 != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0159, code lost:
    
        r6.add(r1);
        r4 = r0.f;
        r5 = r1.getLayoutParams();
        r5.getClass();
        r0.f = java.lang.Math.max(r4, ((defpackage.u79) r5).d() + r4);
        r0.i = r1.getMinimumHeight() + r0.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r6).width == (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0130, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0132, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0127, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017c, code lost:
    
        r6 = r2;
        r14 = r3;
        r2 = r4;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018f, code lost:
    
        r6 = r2;
        r14 = r3;
        r2 = r4;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0197, code lost:
    
        if (defpackage.tyf.A(r27) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0199, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ea, code lost:
    
        r0.z = java.lang.Math.max(r7, r0.getHorizontalPaddings$div_release() + r0.z);
        r8 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ff, code lost:
    
        if (r8.hasNext() == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0201, code lost:
    
        r1 = (android.view.View) r8.next();
        r2 = r1.getLayoutParams();
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0212, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) ((defpackage.u79) r2)).height != (-1)) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0218, code lost:
    
        if (defpackage.tyf.A(r3) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021a, code lost:
    
        r0.s(r1, android.view.View.MeasureSpec.makeMeasureSpec(r0.getHorizontalPaddings$div_release() + r0.z, 1073741824), r3, false, true);
        r6.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0231, code lost:
    
        r1 = r0.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0233, code lost:
    
        if (r1 <= 0) goto L109;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        k6g k6gVar = this;
        k6gVar.f = 0;
        k6gVar.z = 0;
        k6gVar.g = 0;
        k6gVar.h = 0;
        k6gVar.i = 0;
        k6gVar.C = 0.0f;
        k6gVar.j = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 8;
            if (!(i4 < k6gVar.getChildCount())) {
                i3 = -1;
                break;
            }
            int i6 = i4 + 1;
            View childAt = k6gVar.getChildAt(i4);
            if (childAt == null) {
                rj7.m();
                return;
            } else {
                if (i3 < 0) {
                    u75.n();
                    throw null;
                }
                if (childAt.getVisibility() != 8) {
                    break;
                }
                i3++;
                i4 = i6;
            }
        }
    }

    public final int p(int i, int i2) {
        int i3;
        if (i >= 0 || (i3 = this.h) <= 0) {
            return (i < 0 || !tyf.A(i2)) ? i : i + this.h;
        }
        int i4 = i + i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public final boolean q(int i) {
        if (i == this.t) {
            return (getShowDividers() & 1) != 0;
        }
        if (i > this.u) {
            return (getShowDividers() & 4) != 0;
        }
        if ((getShowDividers() & 2) != 0) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r() {
        return getOrientation() == 1;
    }

    public final void s(View view, int i, int i2, boolean z, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        u79 u79Var = (u79) layoutParams;
        int i3 = ((ViewGroup.MarginLayoutParams) u79Var).height;
        if (i3 == -3) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.getClass();
            u79 u79Var2 = (u79) layoutParams2;
            int i4 = u79Var2.g;
            ((ViewGroup.MarginLayoutParams) u79Var2).height = -2;
            u79Var2.g = Integer.MAX_VALUE;
            measureChildWithMargins(view, i, 0, i2, 0);
            ((ViewGroup.MarginLayoutParams) u79Var2).height = -3;
            u79Var2.g = i4;
            if (z2) {
                int i5 = this.g;
                this.g = Math.max(i5, u79Var2.d() + view.getMeasuredHeight() + i5);
                ArrayList arrayList = this.x;
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                }
            }
        } else if (i3 != -1) {
            measureChildWithMargins(view, i, 0, i2, 0);
        } else if (tyf.A(i2)) {
            measureChildWithMargins(view, i, 0, View.MeasureSpec.makeMeasureSpec(0, 1073741824), 0);
            if (z2) {
                int i6 = this.h;
                this.h = Math.max(i6, view.getMeasuredHeight() + i6);
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            layoutParams3.getClass();
            u79 u79Var3 = (u79) layoutParams3;
            ((ViewGroup.MarginLayoutParams) u79Var3).height = -2;
            measureChildWithMargins(view, i, 0, i2, 0);
            ((ViewGroup.MarginLayoutParams) u79Var3).height = -1;
            if (z2) {
                int i7 = this.h;
                this.h = Math.max(i7, view.getMeasuredHeight() + i7);
            }
        }
        this.j = View.combineMeasuredStates(this.j, view.getMeasuredState());
        if (z) {
            y(i, u79Var.b() + view.getMeasuredWidth());
        }
        if (z2) {
            int i8 = this.f;
            this.f = Math.max(i8, u79Var.d() + view.getMeasuredHeight() + i8);
        }
    }

    @Override // defpackage.sq1
    public void setAspectRatio(float f) {
        this.k.setValue(this, E[1], Float.valueOf(f));
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (Intrinsics.d(this.v, drawable)) {
            return;
        }
        this.v = drawable;
        this.l = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.m = drawable != null ? drawable.getIntrinsicHeight() : 0;
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setItemSpacing(int i) {
        if (this.r != i) {
            this.r = i;
            requestLayout();
        }
    }

    public final void setOrientation(int i) {
        this.e.setValue(this, E[0], Integer.valueOf(i));
    }

    public final void setShowDividers(int i) {
        this.w.setValue(this, E[2], Integer.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(int i, int i2) {
        if (!this.y.isEmpty()) {
            return true;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            return false;
        }
        if (i < 0) {
            if (this.g > 0 || this.C > 0.0f) {
                return true;
            }
        } else if (tyf.A(i2) && i > 0 && this.C > 0.0f) {
            return true;
        }
        return false;
    }

    public final void u(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        u79 u79Var = (u79) layoutParams;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), xp3.O(i, u79Var.d() + getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) u79Var).height, view.getMinimumHeight(), u79Var.g));
        View.combineMeasuredStates(this.j, view.getMeasuredState() & (-16777216));
    }

    public final void v(int i, int i2, int i3, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        u79 u79Var = (u79) layoutParams;
        int i4 = ((ViewGroup.MarginLayoutParams) u79Var).width;
        if (i4 == -1) {
            if (i2 == 0) {
                ((ViewGroup.MarginLayoutParams) u79Var).width = -3;
            } else {
                i = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
        }
        int O = xp3.O(i, u79Var.b() + getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) u79Var).width, view.getMinimumWidth(), u79Var.h);
        ((ViewGroup.MarginLayoutParams) u79Var).width = i4;
        view.measure(O, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        this.j = View.combineMeasuredStates(this.j, view.getMeasuredState() & (-256));
    }

    public final void w(int i, int i2, int i3, int i4) {
        int i5 = (i2 - this.f) - this.i;
        ArrayList arrayList = this.x;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ViewGroup.LayoutParams layoutParams = ((View) it.next()).getLayoutParams();
                layoutParams.getClass();
                if (((u79) layoutParams).g != Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!t(i5, i3)) {
            return;
        }
        this.f = 0;
        int p = p(i5, i3);
        if (p >= 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.getClass();
                if (((u79) layoutParams2).g != Integer.MAX_VALUE) {
                    int i6 = this.z;
                    int measuredHeight = view.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    layoutParams3.getClass();
                    v(i, i6, Math.min(measuredHeight, ((u79) layoutParams3).g), view);
                }
            }
        } else {
            if (arrayList.size() > 1) {
                y75.s(arrayList, new ehf(4));
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                View view2 = (View) it3.next();
                ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                layoutParams4.getClass();
                u79 u79Var = (u79) layoutParams4;
                int measuredHeight2 = view2.getMeasuredHeight();
                int d = u79Var.d() + measuredHeight2;
                int b = eeh.b((d / this.g) * p) + measuredHeight2;
                int minimumHeight = view2.getMinimumHeight();
                if (b < minimumHeight) {
                    b = minimumHeight;
                }
                int i7 = u79Var.g;
                if (b > i7) {
                    b = i7;
                }
                v(i, this.z, b, view2);
                this.j = View.combineMeasuredStates(this.j, view2.getMeasuredState() & 16777216);
                this.g -= d;
                p -= view2.getMeasuredHeight() - measuredHeight2;
            }
        }
        int i8 = this.z;
        this.z = 0;
        int p2 = p(i5, i3);
        if (p2 > 0) {
            f(p2, false);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
                layoutParams5.getClass();
                u79 u79Var2 = (u79) layoutParams5;
                if (((ViewGroup.MarginLayoutParams) u79Var2).height == -1) {
                    if (p2 > 0) {
                        v(i, i8, ((Number) ((Pair) this.D.get(this.A.indexOf(childAt))).b).intValue(), childAt);
                    } else if (this.y.contains(childAt)) {
                        v(i, i8, Math.max(childAt.getMinimumHeight(), 0), childAt);
                    }
                }
                y(i, u79Var2.b() + childAt.getMeasuredWidth());
                int i10 = this.f;
                int max = Math.max(i10, u79Var2.d() + childAt.getMeasuredHeight() + i10);
                this.f = max;
                this.f = n(i9) + max;
            }
        }
        this.z = Math.max(i4, getHorizontalPaddings$div_release() + this.z);
        ghh.l("Width of vertical container changed after remeasuring", Integer.valueOf(i8), Integer.valueOf(this.z));
        int n = n(getChildCount()) + this.f;
        this.f = n;
        this.f = getVerticalPaddings$div_release() + n;
    }

    public final void x(View view) {
        int baseline;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        u79 u79Var = (u79) layoutParams;
        if (u79Var.b && (baseline = view.getBaseline()) != -1) {
            this.c = Math.max(this.c, ((ViewGroup.MarginLayoutParams) u79Var).topMargin + baseline);
            this.d = Math.max(this.d, (view.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) u79Var).topMargin);
        }
    }

    public final void y(int i, int i2) {
        if (tyf.A(i)) {
            return;
        }
        this.z = Math.max(this.z, i2);
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static /* synthetic */ void getShowDividers$annotations() {
    }

    public k6g(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ k6g(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public k6g(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
