package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class t10 {
    public final q50 MdtA4re8;
    public RecyclerView NCTxEWno;
    public int OnDfzHZD;
    public boolean P7K7Inc8;
    public final boolean Qr9iLBAD;
    public boolean VgvYg0wo;
    public final boolean b2ZJblxo;
    public boolean eVhOlqcC;
    public int jb9XjC4I;
    public int k3x7lurq;
    public int ow5vqvCr;
    public f0 qoPGr6Ce;
    public final q50 wxUZMvaN;
    public int ygLcUYwZ;

    public t10() {
        r10 r10Var = new r10(this, 0);
        r10 r10Var2 = new r10(this, 1);
        this.MdtA4re8 = new q50(r10Var);
        this.wxUZMvaN = new q50(r10Var2);
        this.VgvYg0wo = false;
        this.P7K7Inc8 = false;
        this.b2ZJblxo = true;
        this.Qr9iLBAD = true;
    }

    public static int DK9slbsy(View view) {
        Rect rect = ((u10) view.getLayoutParams()).NCTxEWno;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int P7K7Inc8(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int RXQxj5Oe(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i4 = max;
                            i2 = Integer.MIN_VALUE;
                        } else {
                            i4 = max;
                            i2 = 0;
                        }
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int WYNAV5pd(View view) {
        Rect rect = ((u10) view.getLayoutParams()).NCTxEWno;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static boolean Xkz7p5xa(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static s10 eIA6dogk(Context context, AttributeSet attributeSet, int i, int i2) {
        s10 s10Var = new s10();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x00.qoPGr6Ce, i, i2);
        s10Var.qoPGr6Ce = obtainStyledAttributes.getInt(0, 1);
        s10Var.NCTxEWno = obtainStyledAttributes.getInt(10, 1);
        s10Var.MdtA4re8 = obtainStyledAttributes.getBoolean(9, false);
        s10Var.wxUZMvaN = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return s10Var;
    }

    public static void fVMzMhyS(View view, int i, int i2, int i3, int i4) {
        u10 u10Var = (u10) view.getLayoutParams();
        Rect rect = u10Var.NCTxEWno;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) u10Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) u10Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) u10Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) u10Var).bottomMargin);
    }

    public static int ytu5o6f4(View view) {
        return ((u10) view.getLayoutParams()).qoPGr6Ce.NCTxEWno();
    }

    public boolean AxnhUDtd() {
        return false;
    }

    public final void B1cjorwa(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.NCTxEWno = null;
            this.qoPGr6Ce = null;
            this.OnDfzHZD = 0;
            this.ygLcUYwZ = 0;
        } else {
            this.NCTxEWno = recyclerView;
            this.qoPGr6Ce = recyclerView.P7K7Inc8;
            this.OnDfzHZD = recyclerView.getWidth();
            this.ygLcUYwZ = recyclerView.getHeight();
        }
        this.k3x7lurq = 1073741824;
        this.ow5vqvCr = 1073741824;
    }

    public final void CTE3lpUp(int i, int i2) {
        int I5GHvsYW = I5GHvsYW();
        if (I5GHvsYW == 0) {
            this.NCTxEWno.k3x7lurq(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < I5GHvsYW; i7++) {
            View Ey6iv0m0 = Ey6iv0m0(i7);
            Rect rect = this.NCTxEWno.eVhOlqcC;
            gjV1z5T1(Ey6iv0m0, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.NCTxEWno.eVhOlqcC.set(i6, i4, i3, i5);
        S7WAX0X5(this.NCTxEWno.eVhOlqcC, i, i2);
    }

    public boolean D4B4MtvK() {
        return false;
    }

    public final View Ey6iv0m0(int i) {
        f0 f0Var = this.qoPGr6Ce;
        if (f0Var != null) {
            return f0Var.ygLcUYwZ(i);
        }
        return null;
    }

    public int FySoLYna(z10 z10Var, d20 d20Var) {
        return -1;
    }

    public abstract View HdOGZAzC(View view, int i, z10 z10Var, d20 d20Var);

    public final int I5GHvsYW() {
        f0 f0Var = this.qoPGr6Ce;
        if (f0Var != null) {
            return f0Var.lDXGDhIF();
        }
        return 0;
    }

    public final void KRabZ4CU(View view, nSmgoSB5 nsmgosb5) {
        g20 euDDoUNr = RecyclerView.euDDoUNr(view);
        if (euDDoUNr == null || euDDoUNr.b2ZJblxo()) {
            return;
        }
        f0 f0Var = this.qoPGr6Ce;
        if (((ArrayList) f0Var.VgvYg0wo).contains(euDDoUNr.qoPGr6Ce)) {
            return;
        }
        RecyclerView recyclerView = this.NCTxEWno;
        bvfAo0eO(recyclerView.MdtA4re8, recyclerView.pP9Y2m6O, view, nsmgosb5);
    }

    public u10 KlHjfFWx(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u10 ? new u10((u10) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new u10((ViewGroup.MarginLayoutParams) layoutParams) : new u10(layoutParams);
    }

    public abstract void LfKQckgD(z10 z10Var, d20 d20Var);

    public abstract boolean MdtA4re8();

    public final int Mq3SeTnW() {
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void N2kLh4D5(RecyclerView recyclerView) {
        SMax8wMR(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract void N8VPGzVC(RecyclerView recyclerView);

    public void NCTxEWno(String str) {
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            recyclerView.P7K7Inc8(str);
        }
    }

    public abstract int OnDfzHZD(d20 d20Var);

    public abstract u10 OxcuoDLp();

    public final void QT4Tf9Dt(View view, z10 z10Var) {
        f0 f0Var = this.qoPGr6Ce;
        l10 l10Var = (l10) f0Var.MdtA4re8;
        int indexOfChild = l10Var.qoPGr6Ce.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((a5) f0Var.wxUZMvaN).P7K7Inc8(indexOfChild)) {
                f0Var.eIA6dogk(view);
            }
            l10Var.Qr9iLBAD(indexOfChild);
        }
        z10Var.b2ZJblxo(view);
    }

    public void S7WAX0X5(Rect rect, int i, int i2) {
        int euDDoUNr = euDDoUNr() + Mq3SeTnW() + rect.width();
        int i7xS8jrb = i7xS8jrb() + SgZGMMPL() + rect.height();
        RecyclerView recyclerView = this.NCTxEWno;
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        this.NCTxEWno.setMeasuredDimension(P7K7Inc8(i, euDDoUNr, recyclerView.getMinimumWidth()), P7K7Inc8(i2, i7xS8jrb, this.NCTxEWno.getMinimumHeight()));
    }

    public final void SMax8wMR(int i, int i2) {
        this.OnDfzHZD = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.k3x7lurq = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.yzvmSy3z;
        }
        this.ygLcUYwZ = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.ow5vqvCr = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.yzvmSy3z;
        }
    }

    public final int SgZGMMPL() {
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public Parcelable Sjrx9cEN() {
        return null;
    }

    public final int U0LaHZX7() {
        RecyclerView recyclerView = this.NCTxEWno;
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        return recyclerView.getLayoutDirection();
    }

    public boolean VgvYg0wo(u10 u10Var) {
        return true;
    }

    public final void VhgXwMj9(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((u10) view.getLayoutParams()).NCTxEWno;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.NCTxEWno != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.NCTxEWno.ow5vqvCr;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void Wi7iiXC4(z10 z10Var) {
        ArrayList arrayList;
        int size = z10Var.qoPGr6Ce.size();
        int i = size - 1;
        while (true) {
            arrayList = z10Var.qoPGr6Ce;
            if (i < 0) {
                break;
            }
            View view = ((g20) arrayList.get(i)).qoPGr6Ce;
            g20 euDDoUNr = RecyclerView.euDDoUNr(view);
            if (!euDDoUNr.ygLcUYwZ()) {
                euDDoUNr.OnDfzHZD(false);
                if (euDDoUNr.jb9XjC4I()) {
                    this.NCTxEWno.removeDetachedView(view, false);
                }
                q10 q10Var = this.NCTxEWno.Xkz7p5xa;
                if (q10Var != null) {
                    q10Var.wxUZMvaN(euDDoUNr);
                }
                euDDoUNr.OnDfzHZD(true);
                g20 euDDoUNr2 = RecyclerView.euDDoUNr(view);
                euDDoUNr2.OnDfzHZD = null;
                euDDoUNr2.ygLcUYwZ = false;
                euDDoUNr2.jb9XjC4I &= -33;
                z10Var.Qr9iLBAD(euDDoUNr2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = z10Var.NCTxEWno;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.NCTxEWno.invalidate();
        }
    }

    public final boolean X1t0wlBd(View view, int i, int i2, u10 u10Var) {
        return (!view.isLayoutRequested() && this.b2ZJblxo && Xkz7p5xa(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) u10Var).width) && Xkz7p5xa(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) u10Var).height)) ? false : true;
    }

    public abstract int XrPeKzBk(int i, z10 z10Var, d20 d20Var);

    public void ZyZthT5G(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.NCTxEWno;
        z10 z10Var = recyclerView.MdtA4re8;
        d20 d20Var = recyclerView.pP9Y2m6O;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.NCTxEWno.canScrollVertically(-1) && !this.NCTxEWno.canScrollHorizontally(-1) && !this.NCTxEWno.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        m10 m10Var = this.NCTxEWno.OnDfzHZD;
        if (m10Var != null) {
            accessibilityEvent.setItemCount(m10Var.qoPGr6Ce());
        }
    }

    public abstract boolean aZz0PFXp();

    public u10 amk52bBQ(Context context, AttributeSet attributeSet) {
        return new u10(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dHozS53r(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int Mq3SeTnW = Mq3SeTnW();
        int SgZGMMPL = SgZGMMPL();
        int euDDoUNr = this.OnDfzHZD - euDDoUNr();
        int i7xS8jrb = this.ygLcUYwZ - i7xS8jrb();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - Mq3SeTnW;
        int min = Math.min(0, i);
        int i2 = top - SgZGMMPL;
        int min2 = Math.min(0, i2);
        int i3 = width - euDDoUNr;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - i7xS8jrb);
        if (U0LaHZX7() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i3);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        int[] iArr = {max, min2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int Mq3SeTnW2 = Mq3SeTnW();
                int SgZGMMPL2 = SgZGMMPL();
                int euDDoUNr2 = this.OnDfzHZD - euDDoUNr();
                int i7xS8jrb2 = this.ygLcUYwZ - i7xS8jrb();
                Rect rect2 = this.NCTxEWno.eVhOlqcC;
                gjV1z5T1(focusedChild, rect2);
                if (rect2.left - i4 < euDDoUNr2) {
                    if (rect2.right - i4 > Mq3SeTnW2) {
                        if (rect2.top - i5 < i7xS8jrb2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.bvfAo0eO(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract int eVhOlqcC(d20 d20Var);

    public final int euDDoUNr() {
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final void f7oeun2L() {
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void gjV1z5T1(View view, Rect rect) {
        int[] iArr = RecyclerView.yzvmSy3z;
        u10 u10Var = (u10) view.getLayoutParams();
        Rect rect2 = u10Var.NCTxEWno;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) u10Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) u10Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) u10Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) u10Var).bottomMargin);
    }

    public final void hGvurcGl(z10 z10Var) {
        for (int I5GHvsYW = I5GHvsYW() - 1; I5GHvsYW >= 0; I5GHvsYW--) {
            if (!RecyclerView.euDDoUNr(Ey6iv0m0(I5GHvsYW)).ygLcUYwZ()) {
                View Ey6iv0m0 = Ey6iv0m0(I5GHvsYW);
                orhfF2Ya(I5GHvsYW);
                z10Var.b2ZJblxo(Ey6iv0m0);
            }
        }
    }

    public void hzgxAD8d(int i) {
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            int lDXGDhIF = recyclerView.P7K7Inc8.lDXGDhIF();
            for (int i2 = 0; i2 < lDXGDhIF; i2++) {
                recyclerView.P7K7Inc8.ygLcUYwZ(i2).offsetLeftAndRight(i);
            }
        }
    }

    public final int i7xS8jrb() {
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract int jb9XjC4I(d20 d20Var);

    public abstract int k3x7lurq(d20 d20Var);

    public final void lDXGDhIF(z10 z10Var) {
        for (int I5GHvsYW = I5GHvsYW() - 1; I5GHvsYW >= 0; I5GHvsYW--) {
            View Ey6iv0m0 = Ey6iv0m0(I5GHvsYW);
            g20 euDDoUNr = RecyclerView.euDDoUNr(Ey6iv0m0);
            if (!euDDoUNr.ygLcUYwZ()) {
                if (!euDDoUNr.VgvYg0wo() || euDDoUNr.b2ZJblxo()) {
                    Ey6iv0m0(I5GHvsYW);
                    this.qoPGr6Ce.k3x7lurq(I5GHvsYW);
                    z10Var.jb9XjC4I(Ey6iv0m0);
                    this.NCTxEWno.b2ZJblxo.ow5vqvCr(euDDoUNr);
                } else {
                    this.NCTxEWno.OnDfzHZD.getClass();
                    orhfF2Ya(I5GHvsYW);
                    z10Var.Qr9iLBAD(euDDoUNr);
                }
            }
        }
    }

    public final int lwWCatUu() {
        RecyclerView recyclerView = this.NCTxEWno;
        m10 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.qoPGr6Ce();
        }
        return 0;
    }

    public final void orhfF2Ya(int i) {
        if (Ey6iv0m0(i) != null) {
            f0 f0Var = this.qoPGr6Ce;
            int I5GHvsYW = f0Var.I5GHvsYW(i);
            l10 l10Var = (l10) f0Var.MdtA4re8;
            View childAt = l10Var.qoPGr6Ce.getChildAt(I5GHvsYW);
            if (childAt == null) {
                return;
            }
            if (((a5) f0Var.wxUZMvaN).P7K7Inc8(I5GHvsYW)) {
                f0Var.eIA6dogk(childAt);
            }
            l10Var.Qr9iLBAD(I5GHvsYW);
        }
    }

    public abstract int ow5vqvCr(d20 d20Var);

    public abstract void pP9Y2m6O(d20 d20Var);

    public int pRiPUEwG(z10 z10Var, d20 d20Var) {
        return -1;
    }

    public final void qoPGr6Ce(View view, int i, boolean z) {
        g20 euDDoUNr = RecyclerView.euDDoUNr(view);
        if (z || euDDoUNr.b2ZJblxo()) {
            p70 p70Var = (p70) this.NCTxEWno.b2ZJblxo.qoPGr6Ce;
            mg0 mg0Var = (mg0) p70Var.get(euDDoUNr);
            if (mg0Var == null) {
                mg0Var = mg0.qoPGr6Ce();
                p70Var.put(euDDoUNr, mg0Var);
            }
            mg0Var.qoPGr6Ce |= 1;
        } else {
            this.NCTxEWno.b2ZJblxo.ow5vqvCr(euDDoUNr);
        }
        u10 u10Var = (u10) view.getLayoutParams();
        if (euDDoUNr.lDXGDhIF() || euDDoUNr.Qr9iLBAD()) {
            if (euDDoUNr.Qr9iLBAD()) {
                euDDoUNr.OnDfzHZD.k3x7lurq(euDDoUNr);
            } else {
                euDDoUNr.jb9XjC4I &= -33;
            }
            this.qoPGr6Ce.jb9XjC4I(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.NCTxEWno;
            f0 f0Var = this.qoPGr6Ce;
            if (parent == recyclerView) {
                a5 a5Var = (a5) f0Var.wxUZMvaN;
                int indexOfChild = ((l10) f0Var.MdtA4re8).qoPGr6Ce.indexOfChild(view);
                int NCTxEWno = (indexOfChild == -1 || a5Var.wxUZMvaN(indexOfChild)) ? -1 : indexOfChild - a5Var.NCTxEWno(indexOfChild);
                if (i == -1) {
                    i = this.qoPGr6Ce.lDXGDhIF();
                }
                if (NCTxEWno == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.NCTxEWno.indexOfChild(view) + this.NCTxEWno.RXQxj5Oe());
                }
                if (NCTxEWno != i) {
                    t10 t10Var = this.NCTxEWno.ygLcUYwZ;
                    View Ey6iv0m0 = t10Var.Ey6iv0m0(NCTxEWno);
                    if (Ey6iv0m0 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + NCTxEWno + t10Var.NCTxEWno.toString());
                    }
                    t10Var.Ey6iv0m0(NCTxEWno);
                    t10Var.qoPGr6Ce.k3x7lurq(NCTxEWno);
                    u10 u10Var2 = (u10) Ey6iv0m0.getLayoutParams();
                    g20 euDDoUNr2 = RecyclerView.euDDoUNr(Ey6iv0m0);
                    boolean b2ZJblxo = euDDoUNr2.b2ZJblxo();
                    RecyclerView recyclerView2 = t10Var.NCTxEWno;
                    if (b2ZJblxo) {
                        p70 p70Var2 = (p70) recyclerView2.b2ZJblxo.qoPGr6Ce;
                        mg0 mg0Var2 = (mg0) p70Var2.get(euDDoUNr2);
                        if (mg0Var2 == null) {
                            mg0Var2 = mg0.qoPGr6Ce();
                            p70Var2.put(euDDoUNr2, mg0Var2);
                        }
                        mg0Var2.qoPGr6Ce = 1 | mg0Var2.qoPGr6Ce;
                    } else {
                        recyclerView2.b2ZJblxo.ow5vqvCr(euDDoUNr2);
                    }
                    t10Var.qoPGr6Ce.jb9XjC4I(Ey6iv0m0, i, u10Var2, euDDoUNr2.b2ZJblxo());
                }
            } else {
                f0Var.Qr9iLBAD(view, i, false);
                u10Var.MdtA4re8 = true;
            }
        }
        if (u10Var.wxUZMvaN) {
            euDDoUNr.qoPGr6Ce.invalidate();
            u10Var.wxUZMvaN = false;
        }
    }

    public View sjUBp5pO(int i) {
        int I5GHvsYW = I5GHvsYW();
        for (int i2 = 0; i2 < I5GHvsYW; i2++) {
            View Ey6iv0m0 = Ey6iv0m0(i2);
            g20 euDDoUNr = RecyclerView.euDDoUNr(Ey6iv0m0);
            if (euDDoUNr != null && euDDoUNr.NCTxEWno() == i && !euDDoUNr.ygLcUYwZ() && (this.NCTxEWno.pP9Y2m6O.P7K7Inc8 || !euDDoUNr.b2ZJblxo())) {
                return Ey6iv0m0;
            }
        }
        return null;
    }

    public abstract int uQ3KJUK5(int i, z10 z10Var, d20 d20Var);

    public abstract boolean wxUZMvaN();

    public abstract int ygLcUYwZ(d20 d20Var);

    public final boolean yzvmSy3z(View view, int i, int i2, u10 u10Var) {
        return (this.b2ZJblxo && Xkz7p5xa(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) u10Var).width) && Xkz7p5xa(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) u10Var).height)) ? false : true;
    }

    public void zCflySGU(int i) {
        RecyclerView recyclerView = this.NCTxEWno;
        if (recyclerView != null) {
            int lDXGDhIF = recyclerView.P7K7Inc8.lDXGDhIF();
            for (int i2 = 0; i2 < lDXGDhIF; i2++) {
                recyclerView.P7K7Inc8.ygLcUYwZ(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void LvHlPNBd(int i) {
    }

    public void nSmgoSB5(RecyclerView recyclerView) {
    }

    public void tef3qNMP(Parcelable parcelable) {
    }

    public void FXJmAAN1() {
    }

    public void TrssYQ34() {
    }

    public void ESscZ9M1(int i, int i2) {
    }

    public void Qr9iLBAD(int i, pl plVar) {
    }

    public void VGmz0ccI(int i, int i2) {
    }

    public void g2aRJUAd(int i, int i2) {
    }

    public void gmkaJpmS(int i, int i2) {
    }

    public void b2ZJblxo(int i, int i2, d20 d20Var, pl plVar) {
    }

    public void bvfAo0eO(z10 z10Var, d20 d20Var, View view, nSmgoSB5 nsmgosb5) {
    }
}
