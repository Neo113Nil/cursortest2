package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class rpd extends y0a {
    public final rd2 c;
    public int d;
    public final boolean e;

    public rpd(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new rd2(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xdn.c, i, 0);
            try {
                setColumnCount(obtainStyledAttributes.getInt(1, 1));
                setGravity(obtainStyledAttributes.getInt(0, 8388659));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.e = true;
    }

    private final int getPaddingHorizontal() {
        return getPaddingRight() + getPaddingLeft();
    }

    private final int getPaddingVertical() {
        return getPaddingBottom() + getPaddingTop();
    }

    public static void n(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        int O;
        int O2;
        if (i3 == -1) {
            O = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else {
            int minimumWidth = view.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            O = xp3.O(i, 0, i3, minimumWidth, ((u79) layoutParams).h);
        }
        if (i4 == -1) {
            O2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            int minimumHeight = view.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.getClass();
            O2 = xp3.O(i2, 0, i4, minimumHeight, ((u79) layoutParams2).g);
        }
        view.measure(O, O2);
    }

    public final void f() {
        int i = this.d;
        if (i != 0) {
            if (i != j()) {
                this.d = 0;
                rd2 rd2Var = this.c;
                ((j6e) rd2Var.c).b = null;
                ((j6e) rd2Var.d).b = null;
                ((j6e) rd2Var.e).b = null;
                f();
                return;
            }
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i2).getLayoutParams();
            layoutParams.getClass();
            u79 u79Var = (u79) layoutParams;
            if (u79Var.a() < 0 || u79Var.c() < 0) {
                xq0.q("Negative spans are not supported.");
                return;
            } else {
                if (u79Var.d < 0.0f || u79Var.c < 0.0f) {
                    xq0.q("Negative weights are not supported.");
                    return;
                }
            }
        }
        this.d = j();
    }

    public final int getColumnCount() {
        return this.c.b;
    }

    public final int getRowCount() {
        return ((npd) ((j6e) this.c.c).a()).b;
    }

    public final int j() {
        int childCount = getChildCount();
        int i = 223;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                i = ((u79) layoutParams).hashCode() + (i * 31);
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        char c;
        char c2;
        rpd rpdVar = this;
        SystemClock.elapsedRealtime();
        rpdVar.f();
        rd2 rd2Var = rpdVar.c;
        List list = (List) ((j6e) rd2Var.d).a();
        j6e j6eVar = (j6e) rd2Var.e;
        List list2 = (List) j6eVar.a();
        List list3 = (List) ((j6e) rd2Var.c).a();
        int gravity = rpdVar.getGravity() & 7;
        j6e j6eVar2 = (j6e) rd2Var.d;
        int i7 = 0;
        int j = j6eVar2.b != null ? rd2.j((List) j6eVar2.a()) : 0;
        int measuredWidth = (rpdVar.getMeasuredWidth() - rpdVar.getPaddingLeft()) - rpdVar.getPaddingRight();
        int i8 = 2;
        int i9 = 1;
        int paddingLeft = gravity != 1 ? gravity != 5 ? rpdVar.getPaddingLeft() : (rpdVar.getPaddingLeft() + measuredWidth) - j : ouj.b(measuredWidth, j, 2, rpdVar.getPaddingLeft());
        int gravity2 = rpdVar.getGravity() & 112;
        int j2 = j6eVar.b != null ? rd2.j((List) j6eVar.a()) : 0;
        int measuredHeight = (rpdVar.getMeasuredHeight() - rpdVar.getPaddingTop()) - rpdVar.getPaddingBottom();
        char c3 = 16;
        int paddingTop = gravity2 != 16 ? gravity2 != 80 ? rpdVar.getPaddingTop() : (rpdVar.getPaddingTop() + measuredHeight) - j2 : ouj.b(measuredHeight, j2, 2, rpdVar.getPaddingTop());
        int childCount = rpdVar.getChildCount();
        int i10 = 0;
        while (i7 < childCount) {
            View childAt = rpdVar.getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                u79 u79Var = (u79) layoutParams;
                mpd mpdVar = (mpd) list3.get(i10);
                int i11 = mpdVar.b;
                int i12 = mpdVar.c;
                int i13 = ((qpd) list.get(i11)).a + ((ViewGroup.MarginLayoutParams) u79Var).leftMargin;
                int i14 = i9;
                int i15 = ((qpd) list2.get(i12)).a + ((ViewGroup.MarginLayoutParams) u79Var).topMargin;
                qpd qpdVar = (qpd) list.get((mpdVar.b + mpdVar.d) - 1);
                int i16 = ((qpdVar.a + qpdVar.c) - i13) - ((ViewGroup.MarginLayoutParams) u79Var).rightMargin;
                qpd qpdVar2 = (qpd) list2.get((i12 + mpdVar.e) - 1);
                int i17 = ((qpdVar2.a + qpdVar2.c) - i15) - ((ViewGroup.MarginLayoutParams) u79Var).bottomMargin;
                int measuredWidth2 = childAt.getMeasuredWidth();
                int i18 = u79Var.a & 7;
                i5 = paddingLeft;
                if (i18 != i14) {
                    if (i18 == 5) {
                        i13 = (i13 + i16) - measuredWidth2;
                    }
                    i6 = 2;
                } else {
                    i6 = 2;
                    i13 = ouj.b(i16, measuredWidth2, 2, i13);
                }
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i19 = u79Var.a & 112;
                c = 16;
                c2 = 'P';
                if (i19 == 16) {
                    i15 = ouj.b(i17, measuredHeight2, i6, i15);
                } else if (i19 == 80) {
                    i15 = (i15 + i17) - measuredHeight2;
                }
                int i20 = i13 + i5;
                int i21 = i15 + paddingTop;
                childAt.layout(i20, i21, childAt.getMeasuredWidth() + i20, childAt.getMeasuredHeight() + i21);
                i10++;
            } else {
                i5 = paddingLeft;
                i6 = i8;
                c = c3;
                c2 = 'P';
            }
            i7++;
            rpdVar = this;
            c3 = c;
            i8 = i6;
            i9 = 1;
            paddingLeft = i5;
        }
        SystemClock.elapsedRealtime();
        int i22 = i9f.a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        char c;
        int i4;
        List list;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        List list2;
        List list3;
        int i10;
        int i11;
        char c2;
        SystemClock.elapsedRealtime();
        f();
        rd2 rd2Var = this.c;
        ((j6e) rd2Var.d).b = null;
        ((j6e) rd2Var.e).b = null;
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - paddingHorizontal), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 - paddingVertical), View.MeasureSpec.getMode(i2));
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i3 = 8;
            c = 65535;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                u79 u79Var = (u79) layoutParams;
                int i14 = ((ViewGroup.MarginLayoutParams) u79Var).width;
                if (i14 == -1) {
                    i14 = 0;
                }
                int i15 = ((ViewGroup.MarginLayoutParams) u79Var).height;
                if (i15 == -1) {
                    i15 = 0;
                }
                int minimumWidth = childAt.getMinimumWidth();
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                layoutParams2.getClass();
                int O = xp3.O(makeMeasureSpec, 0, i14, minimumWidth, ((u79) layoutParams2).h);
                int minimumHeight = childAt.getMinimumHeight();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                layoutParams3.getClass();
                childAt.measure(O, xp3.O(makeMeasureSpec2, 0, i15, minimumHeight, ((u79) layoutParams3).g));
            }
            i13++;
        }
        c9n c9nVar = (c9n) rd2Var.f;
        j6e j6eVar = (j6e) rd2Var.e;
        j6e j6eVar2 = (j6e) rd2Var.c;
        j6e j6eVar3 = (j6e) rd2Var.d;
        c9nVar.f(makeMeasureSpec);
        int max = Math.max(c9nVar.b, Math.min(rd2.j((List) j6eVar3.a()), c9nVar.c));
        List list4 = (List) j6eVar2.a();
        List list5 = (List) j6eVar3.a();
        int childCount2 = getChildCount();
        int i16 = 0;
        while (i16 < childCount2) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != i3) {
                ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                layoutParams4.getClass();
                u79 u79Var2 = (u79) layoutParams4;
                i8 = paddingHorizontal;
                c2 = 65535;
                if (((ViewGroup.MarginLayoutParams) u79Var2).width != -1) {
                    i12++;
                    i9 = paddingVertical;
                    list2 = list4;
                    list3 = list5;
                    i10 = childCount2;
                    i11 = i16;
                } else {
                    mpd mpdVar = (mpd) list4.get(i12);
                    qpd qpdVar = (qpd) list5.get((mpdVar.b + mpdVar.d) - 1);
                    i9 = paddingVertical;
                    int b = ((qpdVar.a + qpdVar.c) - ((qpd) list5.get(mpdVar.b)).a) - u79Var2.b();
                    list2 = list4;
                    i11 = i16;
                    i10 = childCount2;
                    list3 = list5;
                    c2 = 65535;
                    n(childAt2, makeMeasureSpec, makeMeasureSpec2, ((ViewGroup.MarginLayoutParams) u79Var2).width, ((ViewGroup.MarginLayoutParams) u79Var2).height, b, 0);
                    i12++;
                }
            } else {
                i8 = paddingHorizontal;
                i9 = paddingVertical;
                list2 = list4;
                list3 = list5;
                i10 = childCount2;
                i11 = i16;
                c2 = 65535;
            }
            i16 = i11 + 1;
            c = c2;
            list5 = list3;
            childCount2 = i10;
            list4 = list2;
            paddingHorizontal = i8;
            paddingVertical = i9;
            i3 = 8;
        }
        int i17 = paddingHorizontal;
        int i18 = paddingVertical;
        c9n c9nVar2 = (c9n) rd2Var.g;
        c9nVar2.f(makeMeasureSpec2);
        int max2 = Math.max(c9nVar2.b, Math.min(rd2.j((List) j6eVar.a()), c9nVar2.c));
        List list6 = (List) j6eVar2.a();
        List list7 = (List) j6eVar3.a();
        List list8 = (List) j6eVar.a();
        int childCount3 = getChildCount();
        int i19 = 0;
        int i20 = 0;
        while (i19 < childCount3) {
            int i21 = childCount3;
            View childAt3 = getChildAt(i19);
            if (childAt3.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams5 = childAt3.getLayoutParams();
                layoutParams5.getClass();
                u79 u79Var3 = (u79) layoutParams5;
                i4 = max2;
                if (((ViewGroup.MarginLayoutParams) u79Var3).height != -1) {
                    i20++;
                    list = list6;
                    i5 = max;
                    i6 = i19;
                } else {
                    mpd mpdVar2 = (mpd) list6.get(i20);
                    int i22 = mpdVar2.b;
                    int i23 = mpdVar2.c;
                    list = list6;
                    qpd qpdVar2 = (qpd) list7.get((i22 + mpdVar2.d) - 1);
                    i5 = max;
                    int b2 = ((qpdVar2.a + qpdVar2.c) - ((qpd) list7.get(mpdVar2.b)).a) - u79Var3.b();
                    qpd qpdVar3 = (qpd) list8.get((mpdVar2.e + i23) - 1);
                    int d = ((qpdVar3.a + qpdVar3.c) - ((qpd) list8.get(i23)).a) - u79Var3.d();
                    i6 = i19;
                    i7 = i21;
                    n(childAt3, makeMeasureSpec, makeMeasureSpec2, ((ViewGroup.MarginLayoutParams) u79Var3).width, ((ViewGroup.MarginLayoutParams) u79Var3).height, b2, d);
                    i20++;
                    i19 = i6 + 1;
                    childCount3 = i7;
                    max2 = i4;
                    max = i5;
                    list6 = list;
                }
            } else {
                i4 = max2;
                list = list6;
                i5 = max;
                i6 = i19;
            }
            i7 = i21;
            i19 = i6 + 1;
            childCount3 = i7;
            max2 = i4;
            max = i5;
            list6 = list;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max + i17, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(max2 + i18, getSuggestedMinimumHeight()), i2, 0));
        SystemClock.elapsedRealtime();
        int i24 = i9f.a;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.d = 0;
        rd2 rd2Var = this.c;
        ((j6e) rd2Var.c).b = null;
        ((j6e) rd2Var.d).b = null;
        ((j6e) rd2Var.e).b = null;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.d = 0;
        rd2 rd2Var = this.c;
        ((j6e) rd2Var.c).b = null;
        ((j6e) rd2Var.d).b = null;
        ((j6e) rd2Var.e).b = null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        if (this.e) {
            rd2 rd2Var = this.c;
            ((j6e) rd2Var.d).b = null;
            ((j6e) rd2Var.e).b = null;
        }
    }

    public final void setColumnCount(int i) {
        rd2 rd2Var = this.c;
        if (i <= 0) {
            rd2Var.getClass();
        } else if (rd2Var.b != i) {
            rd2Var.b = i;
            ((j6e) rd2Var.c).b = null;
            ((j6e) rd2Var.d).b = null;
            ((j6e) rd2Var.e).b = null;
        }
        this.d = 0;
        ((j6e) rd2Var.c).b = null;
        ((j6e) rd2Var.d).b = null;
        ((j6e) rd2Var.e).b = null;
        requestLayout();
    }

    public rpd(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ rpd(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public rpd(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
