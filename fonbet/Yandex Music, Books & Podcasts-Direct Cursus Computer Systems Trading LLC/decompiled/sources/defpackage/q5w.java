package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.ranges.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class q5w extends y0a implements sq1 {
    public static final /* synthetic */ s9f[] z;
    public int c;
    public final q13 d;
    public final q13 e;
    public final q13 f;
    public final q13 g;
    public boolean h;
    public final ArrayList i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final x0a w;
    public int x;
    public final q13 y;

    static {
        opi opiVar = new opi(q5w.class, "showSeparators", "getShowSeparators()I", 0);
        ern.a.getClass();
        z = new s9f[]{opiVar, new opi(q5w.class, "showLineSeparators", "getShowLineSeparators()I", 0), new opi(q5w.class, "separatorDrawable", "getSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0), new opi(q5w.class, "lineSeparatorDrawable", "getLineSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0), new opi(q5w.class, "aspectRatio", "getAspectRatio()F", 0)};
    }

    public q5w(@NotNull Context context) {
        super(context, null, 0, 6, null);
        this.d = tyf.r(0);
        this.e = tyf.r(0);
        this.f = tyf.r(null);
        this.g = tyf.r(null);
        this.h = true;
        this.i = new ArrayList();
        this.w = new x0a();
        this.y = new q13(Float.valueOf(0.0f), rq1.s);
    }

    private final int getBetweenItemsSpacing() {
        return v(getShowSeparators()) ? getSeparatorLength() : this.o;
    }

    private final int getBetweenLinesSpacing() {
        return v(getShowLineSeparators()) ? getLineSeparatorLength() : this.p;
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (t(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (t(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final p5w getFirstVisibleLine() {
        boolean z2 = this.h;
        Object obj = null;
        ArrayList arrayList = this.i;
        if (z2 || !wyf.N(this)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((p5w) next).a() > 0) {
                    obj = next;
                    break;
                }
            }
            return (p5w) obj;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((p5w) previous).a() > 0) {
                obj = previous;
                break;
            }
        }
        return (p5w) obj;
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator it = this.i.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((p5w) it.next()).b);
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((p5w) it.next()).b);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getLineSeparatorLength() {
        int intrinsicWidth;
        int i;
        if (this.h) {
            Drawable lineSeparatorDrawable = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable != null ? lineSeparatorDrawable.getIntrinsicHeight() : 0) + this.q;
            i = this.r;
        } else {
            Drawable lineSeparatorDrawable2 = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable2 != null ? lineSeparatorDrawable2.getIntrinsicWidth() : 0) + this.s;
            i = this.t;
        }
        return intrinsicWidth + i;
    }

    private final int getMiddleLineSeparatorLength() {
        if (v(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (v(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getSeparatorLength() {
        int intrinsicHeight;
        int i;
        if (this.h) {
            Drawable separatorDrawable = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable != null ? separatorDrawable.getIntrinsicWidth() : 0) + this.m;
            i = this.n;
        } else {
            Drawable separatorDrawable2 = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable2 != null ? separatorDrawable2.getIntrinsicHeight() : 0) + this.k;
            i = this.l;
        }
        return intrinsicHeight + i;
    }

    private final int getStartLineSeparatorLength() {
        if (u(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (u(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getSumOfCrossSize() {
        Iterator it = this.i.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((p5w) it.next()).d;
        }
        return ((getVisibleLinesCount() - 1) * getBetweenLinesSpacing()) + i + getEdgeLineSeparatorsLength();
    }

    private final int getVisibleLinesCount() {
        int i = 0;
        ArrayList arrayList = this.i;
        if (arrayList != null && arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((p5w) it.next()).a() > 0 && (i = i + 1) < 0) {
                u75.m();
                throw null;
            }
        }
        return i;
    }

    public static void n(Drawable drawable, Canvas canvas, int i, int i2, int i3, int i4) {
        if (drawable != null) {
            float f = (i + i3) / 2.0f;
            float f2 = (i2 + i4) / 2.0f;
            float intrinsicWidth = drawable.getIntrinsicWidth() / 2.0f;
            float intrinsicHeight = drawable.getIntrinsicHeight() / 2.0f;
            drawable.setBounds((int) (f - intrinsicWidth), (int) (f2 - intrinsicHeight), (int) (f + intrinsicWidth), (int) (f2 + intrinsicHeight));
            drawable.draw(canvas);
        }
    }

    public static final void o(q5w q5wVar, Canvas canvas, int i) {
        n(q5wVar.getLineSeparatorDrawable(), canvas, q5wVar.getPaddingLeft() + q5wVar.s, (i - q5wVar.getLineSeparatorLength()) - q5wVar.q, (q5wVar.getWidth() - q5wVar.getPaddingRight()) - q5wVar.t, i + q5wVar.r);
    }

    public static final void p(q5w q5wVar, Canvas canvas, int i) {
        n(q5wVar.getLineSeparatorDrawable(), canvas, (i - q5wVar.getLineSeparatorLength()) + q5wVar.s, q5wVar.getPaddingTop() - q5wVar.q, i - q5wVar.t, (q5wVar.getHeight() - q5wVar.getPaddingBottom()) + q5wVar.r);
    }

    public static boolean t(int i) {
        return (i & 4) != 0;
    }

    public static boolean u(int i) {
        return (i & 1) != 0;
    }

    public static boolean v(int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        if (getSeparatorDrawable() == null && getLineSeparatorDrawable() == null) {
            return;
        }
        if (getShowSeparators() == 0 && getShowLineSeparators() == 0) {
            return;
        }
        boolean z2 = this.h;
        int i4 = 0;
        ArrayList arrayList = this.i;
        if (!z2) {
            vqn vqnVar = new vqn();
            vqn vqnVar2 = new vqn();
            if (arrayList.size() > 0) {
                int showLineSeparators = getShowLineSeparators();
                if (wyf.N(this) ? t(showLineSeparators) : u(showLineSeparators)) {
                    p5w firstVisibleLine = getFirstVisibleLine();
                    int i5 = firstVisibleLine != null ? firstVisibleLine.g - firstVisibleLine.d : 0;
                    vqnVar.a = i5;
                    p(this, canvas2, i5 - this.v);
                }
            }
            Iterator it = wyf.H(this, 0, arrayList.size()).iterator();
            int i6 = 0;
            while (it.hasNext()) {
                p5w p5wVar = (p5w) arrayList.get(((rpe) it).nextInt());
                if (p5wVar.a() != 0) {
                    int i7 = p5wVar.g;
                    vqnVar2.a = i7;
                    vqnVar.a = i7 - p5wVar.d;
                    if (i6 != 0 && v(getShowLineSeparators())) {
                        p(this, canvas2, vqnVar.a - this.u);
                    }
                    int i8 = getLineSeparatorDrawable() != null ? 1 : i4;
                    int i9 = p5wVar.c;
                    int i10 = i4;
                    int i11 = i10;
                    boolean z3 = true;
                    while (i10 < i9) {
                        View childAt = getChildAt(p5wVar.a + i10);
                        if (childAt == null || s(childAt)) {
                            i = i10;
                        } else {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            layoutParams.getClass();
                            u79 u79Var = (u79) layoutParams;
                            int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) u79Var).topMargin;
                            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) u79Var).bottomMargin;
                            if (z3) {
                                if (u(getShowSeparators())) {
                                    int i12 = top - p5wVar.j;
                                    i = i10;
                                    n(getSeparatorDrawable(), canvas2, vqnVar.a + this.m, (i12 - getSeparatorLength()) - this.k, vqnVar2.a - this.n, i12 + this.l);
                                } else {
                                    i = i10;
                                }
                                i11 = bottom;
                                z3 = false;
                            } else {
                                i = i10;
                                if (v(getShowSeparators())) {
                                    int i13 = top - ((int) (p5wVar.k / 2));
                                    n(getSeparatorDrawable(), canvas, vqnVar.a + this.m, (i13 - getSeparatorLength()) - this.k, vqnVar2.a - this.n, this.l + i13);
                                }
                                i11 = bottom;
                            }
                        }
                        i10 = i + 1;
                        canvas2 = canvas;
                    }
                    if (i11 <= 0 || !t(getShowSeparators())) {
                        canvas2 = canvas;
                    } else {
                        int separatorLength = i11 + getSeparatorLength() + p5wVar.j;
                        canvas2 = canvas;
                        n(getSeparatorDrawable(), canvas2, vqnVar.a + this.m, (separatorLength - getSeparatorLength()) - this.k, vqnVar2.a - this.n, this.l + separatorLength);
                    }
                    i6 = i8;
                }
                i4 = 0;
            }
            if (vqnVar2.a > 0) {
                int showLineSeparators2 = getShowLineSeparators();
                if (wyf.N(this) ? u(showLineSeparators2) : t(showLineSeparators2)) {
                    p(this, canvas2, vqnVar2.a + getLineSeparatorLength() + this.v);
                    return;
                }
                return;
            }
            return;
        }
        vqn vqnVar3 = new vqn();
        vqn vqnVar4 = new vqn();
        if (arrayList.size() > 0 && u(getShowLineSeparators())) {
            p5w firstVisibleLine2 = getFirstVisibleLine();
            int i14 = firstVisibleLine2 != null ? firstVisibleLine2.h - firstVisibleLine2.d : 0;
            vqnVar3.a = i14;
            o(this, canvas2, i14 - this.v);
        }
        Iterator it2 = arrayList.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            p5w p5wVar2 = (p5w) it2.next();
            if (p5wVar2.a() != 0) {
                int i15 = p5wVar2.h;
                vqnVar4.a = i15;
                vqnVar3.a = i15 - p5wVar2.d;
                if (z4 && v(getShowLineSeparators())) {
                    o(this, canvas2, vqnVar3.a - this.u);
                }
                a H = wyf.H(this, p5wVar2.a, p5wVar2.c);
                int i16 = H.a;
                int i17 = H.b;
                int i18 = H.c;
                if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                    int i19 = i16;
                    i2 = 0;
                    boolean z5 = true;
                    while (true) {
                        View childAt2 = getChildAt(i19);
                        if (childAt2 == null || s(childAt2)) {
                            i3 = i19;
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                            layoutParams2.getClass();
                            u79 u79Var2 = (u79) layoutParams2;
                            int left = childAt2.getLeft() - ((ViewGroup.MarginLayoutParams) u79Var2).leftMargin;
                            int right = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) u79Var2).rightMargin;
                            if (z5) {
                                int showSeparators = getShowSeparators();
                                if (wyf.N(this) ? t(showSeparators) : u(showSeparators)) {
                                    int i20 = left - p5wVar2.j;
                                    i3 = i19;
                                    n(getSeparatorDrawable(), canvas2, (i20 - getSeparatorLength()) + this.m, vqnVar3.a - this.k, i20 - this.n, vqnVar4.a + this.l);
                                } else {
                                    i3 = i19;
                                }
                                z5 = false;
                            } else {
                                i3 = i19;
                                if (v(getShowSeparators())) {
                                    int i21 = left - ((int) (p5wVar2.k / 2));
                                    n(getSeparatorDrawable(), canvas, (i21 - getSeparatorLength()) + this.m, vqnVar3.a - this.k, i21 - this.n, this.l + vqnVar4.a);
                                }
                            }
                            i2 = right;
                        }
                        if (i3 == i17) {
                            break;
                        }
                        i19 = i3 + i18;
                        canvas2 = canvas;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    int showSeparators2 = getShowSeparators();
                    if (wyf.N(this) ? u(showSeparators2) : t(showSeparators2)) {
                        int separatorLength2 = i2 + getSeparatorLength() + p5wVar2.j;
                        canvas2 = canvas;
                        n(getSeparatorDrawable(), canvas2, (separatorLength2 - getSeparatorLength()) + this.m, vqnVar3.a - this.k, separatorLength2 - this.n, this.l + vqnVar4.a);
                        z4 = true;
                    }
                }
                canvas2 = canvas;
                z4 = true;
            }
        }
        if (vqnVar4.a <= 0 || !t(getShowLineSeparators())) {
            return;
        }
        o(this, canvas2, vqnVar4.a + getLineSeparatorLength() + this.v);
    }

    public final void f(p5w p5wVar) {
        this.i.add(p5wVar);
        int i = p5wVar.e;
        if (i > 0) {
            p5wVar.d = Math.max(p5wVar.d, i + p5wVar.f);
        }
        this.x += p5wVar.d;
    }

    public float getAspectRatio() {
        s9f s9fVar = z[4];
        q13 q13Var = this.y;
        q13Var.getClass();
        return ((Number) q13Var.a).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        p5w firstVisibleLine = getFirstVisibleLine();
        if (firstVisibleLine == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + firstVisibleLine.e;
    }

    public final Drawable getLineSeparatorDrawable() {
        s9f s9fVar = z[3];
        q13 q13Var = this.g;
        q13Var.getClass();
        return (Drawable) q13Var.a;
    }

    public final Drawable getSeparatorDrawable() {
        s9f s9fVar = z[2];
        q13 q13Var = this.f;
        q13Var.getClass();
        return (Drawable) q13Var.a;
    }

    public final int getShowLineSeparators() {
        s9f s9fVar = z[1];
        q13 q13Var = this.e;
        q13Var.getClass();
        return ((Number) q13Var.a).intValue();
    }

    public final int getShowSeparators() {
        s9f s9fVar = z[0];
        q13 q13Var = this.d;
        q13Var.getClass();
        return ((Number) q13Var.a).intValue();
    }

    public final int getWrapDirection() {
        return this.c;
    }

    public final void j(int i, int i2, int i3) {
        this.u = 0;
        this.v = 0;
        ArrayList arrayList = this.i;
        if (arrayList.size() != 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = 1;
            if (arrayList.size() == 1) {
                ((p5w) arrayList.get(0)).d = size - i3;
                return;
            }
            int sumOfCrossSize = (size - getSumOfCrossSize()) + i3;
            if (i2 != 1) {
                if (i2 != 5) {
                    if (i2 != 16) {
                        if (i2 != 80) {
                            if (i2 != 16777216) {
                                if (i2 != 33554432) {
                                    if (i2 != 67108864) {
                                        if (i2 != 268435456) {
                                            if (i2 != 536870912) {
                                                if (i2 != 1073741824) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    p5w p5wVar = new p5w(0, 7);
                                    int b = eeh.b(sumOfCrossSize / (arrayList.size() + 1));
                                    p5wVar.d = b;
                                    int i5 = b / 2;
                                    this.u = i5;
                                    this.v = i5;
                                    while (i4 < arrayList.size()) {
                                        arrayList.add(i4, p5wVar);
                                        i4 += 2;
                                    }
                                    arrayList.add(0, p5wVar);
                                    arrayList.add(p5wVar);
                                    return;
                                }
                                p5w p5wVar2 = new p5w(0, 7);
                                float f = sumOfCrossSize;
                                int b2 = eeh.b(arrayList.size() == 1 ? 0.0f : f / (r8 - 1));
                                p5wVar2.d = b2;
                                this.u = b2 / 2;
                                while (i4 < arrayList.size()) {
                                    arrayList.add(i4, p5wVar2);
                                    i4 += 2;
                                }
                                return;
                            }
                            p5w p5wVar3 = new p5w(0, 7);
                            int b3 = eeh.b(sumOfCrossSize / (arrayList.size() * 2));
                            p5wVar3.d = b3;
                            this.u = b3;
                            this.v = b3 / 2;
                            for (int i6 = 0; i6 < arrayList.size(); i6 += 3) {
                                arrayList.add(i6, p5wVar3);
                                arrayList.add(i6 + 2, p5wVar3);
                            }
                            return;
                        }
                    }
                }
                p5w p5wVar4 = new p5w(0, 7);
                p5wVar4.d = sumOfCrossSize;
                arrayList.add(0, p5wVar4);
                return;
            }
            p5w p5wVar5 = new p5w(0, 7);
            p5wVar5.d = sumOfCrossSize / 2;
            arrayList.add(0, p5wVar5);
            arrayList.add(p5wVar5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        boolean z3 = this.h;
        x0a x0aVar = this.w;
        ArrayList arrayList = this.i;
        if (!z3) {
            int paddingLeft = getPaddingLeft() + (wyf.N(this) ? getEndLineSeparatorLength() : getStartLineSeparatorLength());
            Iterator it = wyf.H(this, 0, arrayList.size()).iterator();
            int i6 = paddingLeft;
            boolean z4 = false;
            while (it.hasNext()) {
                p5w p5wVar = (p5w) arrayList.get(((rpe) it).nextInt());
                x0aVar.a(getVerticalGravity$div_release(), (i4 - i2) - p5wVar.b, p5wVar.a());
                float paddingTop = getPaddingTop() + getStartSeparatorLength() + x0aVar.a;
                p5wVar.k = x0aVar.b;
                p5wVar.j = x0aVar.c;
                if (p5wVar.a() > 0) {
                    if (z4) {
                        i6 += getBetweenLinesSpacing();
                    }
                    z4 = true;
                }
                int i7 = p5wVar.c;
                float f = paddingTop;
                boolean z5 = false;
                for (int i8 = 0; i8 < i7; i8++) {
                    View childAt = getChildAt(p5wVar.a + i8);
                    if (childAt != null && !s(childAt)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        layoutParams.getClass();
                        u79 u79Var = (u79) layoutParams;
                        float f2 = f + ((ViewGroup.MarginLayoutParams) u79Var).topMargin;
                        if (z5) {
                            f2 += getBetweenItemsSpacing();
                        }
                        int i9 = p5wVar.d;
                        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                        layoutParams2.getClass();
                        u79 u79Var2 = (u79) layoutParams2;
                        WeakHashMap weakHashMap = wdu.a;
                        int absoluteGravity = Gravity.getAbsoluteGravity(u79Var2.a & 125829127, getLayoutDirection());
                        int measuredWidth = (absoluteGravity != 1 ? absoluteGravity != 5 ? ((ViewGroup.MarginLayoutParams) u79Var2).leftMargin : (i9 - childAt.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) u79Var2).rightMargin : (((i9 - childAt.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) u79Var2).leftMargin) - ((ViewGroup.MarginLayoutParams) u79Var2).rightMargin) / 2) + i6;
                        childAt.layout(measuredWidth, eeh.b(f2), childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + eeh.b(f2));
                        f = childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u79Var).bottomMargin + p5wVar.k + f2;
                        z5 = true;
                    } else if (q(childAt)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                }
                i6 += p5wVar.d;
                p5wVar.g = i6;
                p5wVar.h = eeh.b(f);
            }
            return;
        }
        int paddingTop2 = getPaddingTop() + getStartLineSeparatorLength();
        WeakHashMap weakHashMap2 = wdu.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(getHorizontalGravity$div_release(), getLayoutDirection());
        Iterator it2 = arrayList.iterator();
        boolean z6 = false;
        while (it2.hasNext()) {
            p5w p5wVar2 = (p5w) it2.next();
            x0aVar.a(absoluteGravity2, (i3 - i) - p5wVar2.b, p5wVar2.a());
            float paddingLeft2 = getPaddingLeft() + (wyf.N(this) ? getEndSeparatorLength() : getStartSeparatorLength()) + x0aVar.a;
            p5wVar2.k = x0aVar.b;
            p5wVar2.j = x0aVar.c;
            if (p5wVar2.a() > 0) {
                if (z6) {
                    paddingTop2 += getBetweenLinesSpacing();
                }
                z6 = true;
            }
            a H = wyf.H(this, p5wVar2.a, p5wVar2.c);
            int i10 = H.a;
            int i11 = H.b;
            int i12 = H.c;
            if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
                i5 = paddingTop2;
            } else {
                boolean z7 = false;
                while (true) {
                    View childAt2 = getChildAt(i10);
                    if (childAt2 == null || s(childAt2)) {
                        i5 = paddingTop2;
                        if (q(childAt2)) {
                            childAt2.layout(0, 0, 0, 0);
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                        layoutParams3.getClass();
                        u79 u79Var3 = (u79) layoutParams3;
                        float f3 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) u79Var3).leftMargin;
                        if (z7) {
                            f3 += getBetweenItemsSpacing();
                        }
                        ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                        layoutParams4.getClass();
                        u79 u79Var4 = (u79) layoutParams4;
                        int i13 = u79Var4.a & 1879048304;
                        int max = (i13 != 16 ? i13 != 80 ? u79Var4.b ? Math.max(p5wVar2.e - childAt2.getBaseline(), ((ViewGroup.MarginLayoutParams) u79Var4).topMargin) : ((ViewGroup.MarginLayoutParams) u79Var4).topMargin : (p5wVar2.d - childAt2.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) u79Var4).bottomMargin : (((p5wVar2.d - childAt2.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) u79Var4).topMargin) - ((ViewGroup.MarginLayoutParams) u79Var4).bottomMargin) / 2) + paddingTop2;
                        i5 = paddingTop2;
                        childAt2.layout(eeh.b(f3), max, childAt2.getMeasuredWidth() + eeh.b(f3), childAt2.getMeasuredHeight() + max);
                        paddingLeft2 = childAt2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) u79Var3).rightMargin + p5wVar2.k + f3;
                        z7 = true;
                    }
                    if (i10 != i11) {
                        i10 += i12;
                        paddingTop2 = i5;
                    }
                }
            }
            paddingTop2 = i5 + p5wVar2.d;
            p5wVar2.g = eeh.b(paddingLeft2);
            p5wVar2.h = paddingTop2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode;
        int size;
        int i3;
        int i4;
        int i5;
        int i6;
        int edgeSeparatorsLength;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        this.i.clear();
        int i12 = 0;
        this.j = 0;
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (getAspectRatio() != 0.0f && mode2 == 1073741824) {
            int b = eeh.b(size2 / getAspectRatio());
            i3 = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
            size = b;
            mode = 1073741824;
        } else {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            i3 = i2;
        }
        this.x = getEdgeLineSeparatorsLength();
        int i13 = this.h ? i : i3;
        int mode3 = View.MeasureSpec.getMode(i13);
        int size3 = View.MeasureSpec.getSize(i13);
        int edgeSeparatorsLength2 = getEdgeSeparatorsLength() + (this.h ? getHorizontalPaddings$div_release() : getVerticalPaddings$div_release());
        p5w p5wVar = new p5w(edgeSeparatorsLength2, 5);
        int i14 = 0;
        int i15 = Integer.MIN_VALUE;
        while (i12 < getChildCount()) {
            int i16 = i12 + 1;
            View childAt = getChildAt(i12);
            if (childAt == null) {
                rj7.m();
                return;
            }
            int i17 = i14 + 1;
            if (i14 < 0) {
                u75.n();
                throw null;
            }
            if (s(childAt)) {
                p5wVar.i++;
                p5wVar.c++;
                if (i14 == getChildCount() - 1 && p5wVar.a() != 0) {
                    f(p5wVar);
                }
                i7 = mode;
                i8 = i16;
                i9 = size;
                i10 = mode3;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                u79 u79Var = (u79) layoutParams;
                int b2 = u79Var.b() + getHorizontalPaddings$div_release();
                int d = u79Var.d() + getVerticalPaddings$div_release();
                if (this.h) {
                    i6 = b2 + getEdgeSeparatorsLength();
                    edgeSeparatorsLength = this.x;
                } else {
                    i6 = b2 + this.x;
                    edgeSeparatorsLength = getEdgeSeparatorsLength();
                }
                int i18 = d + edgeSeparatorsLength;
                int i19 = i6;
                i7 = mode;
                i8 = i16;
                i9 = size;
                i10 = mode3;
                childAt.measure(xp3.O(i, i19, ((ViewGroup.MarginLayoutParams) u79Var).width, childAt.getMinimumWidth(), u79Var.h), xp3.O(i3, i18, ((ViewGroup.MarginLayoutParams) u79Var).height, childAt.getMinimumHeight(), u79Var.g));
                this.j = View.combineMeasuredStates(this.j, childAt.getMeasuredState());
                int b3 = u79Var.b() + childAt.getMeasuredWidth();
                int d2 = u79Var.d() + childAt.getMeasuredHeight();
                if (!this.h) {
                    d2 = b3;
                    b3 = d2;
                }
                int betweenItemsSpacing = p5wVar.b + b3 + (p5wVar.c != 0 ? getBetweenItemsSpacing() : 0);
                if (i10 == 0 || size3 >= betweenItemsSpacing) {
                    if (p5wVar.c > 0) {
                        p5wVar.b += getBetweenItemsSpacing();
                    }
                    p5wVar.c++;
                    i11 = i15;
                } else {
                    if (p5wVar.a() > 0) {
                        f(p5wVar);
                    }
                    p5wVar = new p5w(i14, edgeSeparatorsLength2, 1);
                    i11 = Integer.MIN_VALUE;
                }
                if (this.h && u79Var.b) {
                    p5wVar.e = Math.max(p5wVar.e, childAt.getBaseline() + ((ViewGroup.MarginLayoutParams) u79Var).topMargin);
                    p5wVar.f = Math.max(p5wVar.f, (childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u79Var).bottomMargin) - childAt.getBaseline());
                }
                p5wVar.b += b3;
                int max = Math.max(i11, d2);
                p5wVar.d = Math.max(p5wVar.d, max);
                if (i14 == getChildCount() - 1 && p5wVar.a() != 0) {
                    f(p5wVar);
                }
                i15 = max;
            }
            i14 = i17;
            mode = i7;
            i12 = i8;
            size = i9;
            mode3 = i10;
        }
        int i20 = mode;
        int i21 = size;
        if (this.h) {
            j(i3, getVerticalGravity$div_release(), getVerticalPaddings$div_release());
        } else {
            j(i, getHorizontalGravity$div_release(), getHorizontalPaddings$div_release());
        }
        int largestMainSize = this.h ? getLargestMainSize() : getSumOfCrossSize() + getHorizontalPaddings$div_release();
        int verticalPaddings$div_release = this.h ? getVerticalPaddings$div_release() + getSumOfCrossSize() : getLargestMainSize();
        int i22 = this.j;
        if (mode2 != 0 && size2 < largestMainSize) {
            i22 = View.combineMeasuredStates(i22, 16777216);
        }
        this.j = i22;
        int resolveSizeAndState = View.resolveSizeAndState(r(mode2, size2, largestMainSize, !this.h), i, this.j);
        if (!this.h || getAspectRatio() == 0.0f || mode2 == 1073741824) {
            i4 = i20;
            i5 = i21;
        } else {
            i5 = eeh.b((16777215 & resolveSizeAndState) / getAspectRatio());
            i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            i4 = 1073741824;
        }
        int i23 = this.j;
        if (i4 != 0 && i5 < verticalPaddings$div_release) {
            i23 = View.combineMeasuredStates(i23, 256);
        }
        this.j = i23;
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(r(i4, i5, verticalPaddings$div_release, this.h), i3, this.j));
    }

    public final boolean q(View view) {
        Integer valueOf;
        if (this.h) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            valueOf = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
            return valueOf != null && valueOf.intValue() == -1;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        valueOf = layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null;
        return valueOf != null && valueOf.intValue() == -1;
    }

    public final int r(int i, int i2, int i3, boolean z2) {
        if (i == Integer.MIN_VALUE) {
            return z2 ? Math.min(i2, i3) : (i3 <= i2 && getVisibleLinesCount() <= 1) ? i3 : i2;
        }
        if (i != 0) {
            if (i != 1073741824) {
                xq0.q(k5r.i(i, "Unknown size mode is set: "));
                return 0;
            }
        }
    }

    public final boolean s(View view) {
        return view.getVisibility() == 8 || q(view);
    }

    @Override // defpackage.sq1
    public void setAspectRatio(float f) {
        this.y.setValue(this, z[4], Float.valueOf(f));
    }

    public final void setItemSpacing(int i) {
        if (this.o != i) {
            this.o = i;
            requestLayout();
        }
    }

    public final void setLineSeparatorDrawable(Drawable drawable) {
        this.g.setValue(this, z[3], drawable);
    }

    public final void setLineSpacing(int i) {
        if (this.p != i) {
            this.p = i;
            requestLayout();
        }
    }

    public final void setSeparatorDrawable(Drawable drawable) {
        this.f.setValue(this, z[2], drawable);
    }

    public final void setShowLineSeparators(int i) {
        this.e.setValue(this, z[1], Integer.valueOf(i));
    }

    public final void setShowSeparators(int i) {
        this.d.setValue(this, z[0], Integer.valueOf(i));
    }

    public final void setWrapDirection(int i) {
        if (this.c != i) {
            this.c = i;
            boolean z2 = true;
            if (i != 0) {
                if (i != 1) {
                    dlh.d(this.c, "Invalid value for the wrap direction is set: ");
                    return;
                }
                z2 = false;
            }
            this.h = z2;
            requestLayout();
        }
    }

    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }
}
