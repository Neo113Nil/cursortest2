package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class rei extends ConstraintLayout implements nyi {
    public static boolean k1;
    public final HashMap A;
    public int A0;
    public long B;
    public boolean B0;
    public float C;
    public float C0;
    public float D;
    public float D0;
    public float E;
    public long E0;
    public long F;
    public float F0;
    public float G;
    public boolean G0;
    public boolean H;
    public ArrayList H0;
    public boolean I;
    public ArrayList I0;
    public pei J;
    public CopyOnWriteArrayList J0;
    public int K;
    public int K0;
    public nei L;
    public long L0;
    public float M0;
    public int N0;
    public float O0;
    public boolean P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public float W0;
    public final n7b X0;
    public boolean Y0;
    public oei Z0;
    public xlr a1;
    public final Rect b1;
    public boolean c1;
    public qei d1;
    public final eg0 e1;
    public boolean f1;
    public final RectF g1;
    public View h1;
    public Matrix i1;
    public final ArrayList j1;
    public yei q;
    public lei r;
    public Interpolator s;
    public float t;
    public int u;
    public int v;
    public boolean v0;
    public int w;
    public final dhr w0;
    public int x;
    public final mei x0;
    public int y;
    public fz7 y0;
    public boolean z;
    public int z0;

    public rei(@NonNull Context context) {
        super(context);
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.v0 = false;
        this.w0 = new dhr();
        this.x0 = new mei(this);
        this.B0 = false;
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = 0;
        this.L0 = -1L;
        this.M0 = 0.0f;
        this.N0 = 0;
        this.O0 = 0.0f;
        this.P0 = false;
        this.X0 = new n7b(9);
        this.Y0 = false;
        this.a1 = null;
        new HashMap();
        this.b1 = new Rect();
        this.c1 = false;
        this.d1 = qei.a;
        this.e1 = new eg0(this);
        this.f1 = false;
        this.g1 = new RectF();
        this.h1 = null;
        this.i1 = null;
        this.j1 = new ArrayList();
        B(null);
    }

    public static Rect t(rei reiVar, aa6 aa6Var) {
        Rect rect = reiVar.b1;
        rect.top = aa6Var.t();
        rect.left = aa6Var.s();
        rect.right = aa6Var.r() + rect.left;
        rect.bottom = aa6Var.l() + rect.top;
        return rect;
    }

    public final boolean A(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean onTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (A((r3.getLeft() + f) - view.getScrollX(), (r3.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            RectF rectF = this.g1;
            rectF.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f3, f4);
                    if (this.i1 == null) {
                        this.i1 = new Matrix();
                    }
                    matrix.invert(this.i1);
                    obtain.transform(this.i1);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void B(AttributeSet attributeSet) {
        yei yeiVar;
        k1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cen.o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.q = new yei(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.v = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.G = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.I = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.K == 0) {
                        this.K = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.K = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.q == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.q = null;
            }
        }
        if (this.K != 0) {
            yei yeiVar2 = this.q;
            if (yeiVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int g = yeiVar2.g();
                yei yeiVar3 = this.q;
                f96 b = yeiVar3.b(yeiVar3.g());
                String O = irf.O(getContext(), g);
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder u = ouj.u("CHECK: ", O, " ALL VIEWS SHOULD HAVE ID's ");
                        u.append(childAt.getClass().getName());
                        u.append(" does not!");
                        Log.w("MotionLayout", u.toString());
                    }
                    if (b.l(id) == null) {
                        StringBuilder u2 = ouj.u("CHECK: ", O, " NO CONSTRAINTS for ");
                        u2.append(irf.P(childAt));
                        Log.w("MotionLayout", u2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) b.g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = numArr[i3].intValue();
                }
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    String O2 = irf.O(getContext(), i5);
                    if (findViewById(iArr[i4]) == null) {
                        Log.w("MotionLayout", "CHECK: " + O + " NO View matches id " + O2);
                    }
                    if (b.k(i5).e.d == -1) {
                        Log.w("MotionLayout", hrg.s("CHECK: ", O, "(", O2, ") no LAYOUT_HEIGHT"));
                    }
                    if (b.k(i5).e.c == -1) {
                        Log.w("MotionLayout", hrg.s("CHECK: ", O, "(", O2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator it = this.q.d.iterator();
                while (it.hasNext()) {
                    xei xeiVar = (xei) it.next();
                    if (xeiVar == this.q.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (xeiVar.d == xeiVar.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i6 = xeiVar.d;
                    int i7 = xeiVar.c;
                    String O3 = irf.O(getContext(), i6);
                    String O4 = irf.O(getContext(), i7);
                    if (sparseIntArray.get(i6) == i7) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + O3 + "->" + O4);
                    }
                    if (sparseIntArray2.get(i7) == i6) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + O3 + "->" + O4);
                    }
                    sparseIntArray.put(i6, i7);
                    sparseIntArray2.put(i7, i6);
                    if (this.q.b(i6) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + O3);
                    }
                    if (this.q.b(i7) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + O3);
                    }
                }
            }
        }
        if (this.v != -1 || (yeiVar = this.q) == null) {
            return;
        }
        this.v = yeiVar.g();
        this.u = this.q.g();
        xei xeiVar2 = this.q.c;
        this.w = xeiVar2 != null ? xeiVar2.c : -1;
    }

    public final void C() {
        xei xeiVar;
        wps wpsVar;
        View view;
        yei yeiVar = this.q;
        if (yeiVar == null) {
            return;
        }
        if (yeiVar.a(this.v, this)) {
            requestLayout();
            return;
        }
        int i = this.v;
        if (i != -1) {
            yei yeiVar2 = this.q;
            ArrayList arrayList = yeiVar2.f;
            ArrayList arrayList2 = yeiVar2.d;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                xei xeiVar2 = (xei) it.next();
                if (xeiVar2.m.size() > 0) {
                    Iterator it2 = xeiVar2.m.iterator();
                    while (it2.hasNext()) {
                        ((wei) it2.next()).b(this);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                xei xeiVar3 = (xei) it3.next();
                if (xeiVar3.m.size() > 0) {
                    Iterator it4 = xeiVar3.m.iterator();
                    while (it4.hasNext()) {
                        ((wei) it4.next()).b(this);
                    }
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                xei xeiVar4 = (xei) it5.next();
                if (xeiVar4.m.size() > 0) {
                    Iterator it6 = xeiVar4.m.iterator();
                    while (it6.hasNext()) {
                        ((wei) it6.next()).a(this, i, xeiVar4);
                    }
                }
            }
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                xei xeiVar5 = (xei) it7.next();
                if (xeiVar5.m.size() > 0) {
                    Iterator it8 = xeiVar5.m.iterator();
                    while (it8.hasNext()) {
                        ((wei) it8.next()).a(this, i, xeiVar5);
                    }
                }
            }
        }
        if (!this.q.n() || (xeiVar = this.q.c) == null || (wpsVar = xeiVar.l) == null) {
            return;
        }
        rei reiVar = wpsVar.r;
        int i2 = wpsVar.d;
        if (i2 != -1) {
            view = reiVar.findViewById(i2);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + irf.O(reiVar.getContext(), wpsVar.d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new abe(4));
            nestedScrollView.setOnScrollChangeListener(new zfm());
        }
    }

    public final void D() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.J == null && ((copyOnWriteArrayList = this.J0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList arrayList = this.j1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            pei peiVar = this.J;
            if (peiVar != null) {
                num.intValue();
                peiVar.getClass();
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.J0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    pei peiVar2 = (pei) it2.next();
                    num.intValue();
                    peiVar2.getClass();
                }
            }
        }
        arrayList.clear();
    }

    public final void E() {
        this.e1.h();
        invalidate();
    }

    public final void F(int i) {
        setState(qei.b);
        this.v = i;
        this.u = -1;
        this.w = -1;
        ma maVar = this.k;
        if (maVar == null) {
            yei yeiVar = this.q;
            if (yeiVar != null) {
                yeiVar.b(i).b(this);
                return;
            }
            return;
        }
        float f = -1;
        ConstraintLayout constraintLayout = (ConstraintLayout) maVar.c;
        SparseArray sparseArray = (SparseArray) maVar.d;
        int i2 = maVar.a;
        int i3 = 0;
        if (i2 != i) {
            maVar.a = i;
            w86 w86Var = (w86) sparseArray.get(i);
            ArrayList arrayList = w86Var.b;
            while (true) {
                if (i3 >= arrayList.size()) {
                    i3 = -1;
                    break;
                } else if (((x86) arrayList.get(i3)).a(f, f)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList2 = w86Var.b;
            f96 f96Var = i3 == -1 ? w86Var.d : ((x86) arrayList2.get(i3)).f;
            if (i3 != -1) {
                int i4 = ((x86) arrayList2.get(i3)).e;
            }
            if (f96Var != null) {
                maVar.b = i3;
                f96Var.b(constraintLayout);
                return;
            } else {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =-1.0, -1.0");
                return;
            }
        }
        w86 w86Var2 = i == -1 ? (w86) sparseArray.valueAt(0) : (w86) sparseArray.get(i2);
        int i5 = maVar.b;
        if (i5 == -1 || !((x86) w86Var2.b.get(i5)).a(f, f)) {
            ArrayList arrayList3 = w86Var2.b;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    i3 = -1;
                    break;
                } else if (((x86) arrayList3.get(i3)).a(f, f)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList4 = w86Var2.b;
            if (maVar.b == i3) {
                return;
            }
            f96 f96Var2 = i3 == -1 ? null : ((x86) arrayList4.get(i3)).f;
            if (i3 != -1) {
                int i6 = ((x86) arrayList4.get(i3)).e;
            }
            if (f96Var2 == null) {
                return;
            }
            maVar.b = i3;
            f96Var2.b(constraintLayout);
        }
    }

    public final void G(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.Z0 == null) {
                this.Z0 = new oei(this);
            }
            oei oeiVar = this.Z0;
            oeiVar.c = i;
            oeiVar.d = i2;
            return;
        }
        yei yeiVar = this.q;
        if (yeiVar != null) {
            this.u = i;
            this.w = i2;
            yeiVar.m(i, i2);
            this.e1.g(this.q.b(i), this.q.b(i2));
            E();
            this.E = 0.0f;
            u(0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r20 != 7) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0066, code lost:
    
        if ((((r19 * r5) - (((r2 * r5) * r5) / 2.0f)) + r1) > 1.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0088, code lost:
    
        r2 = r17.E;
        r5 = r17.C;
        r6 = r17.q.f();
        r1 = r17.q.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0096, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0098, code lost:
    
        r1 = r1.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009a, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009c, code lost:
    
        r7 = r1.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00a1, code lost:
    
        r17.w0.b(r2, r3, r19, r5, r6, r7);
        r17.t = 0.0f;
        r1 = r17.v;
        r17.G = r3;
        r17.v = r1;
        r17.r = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a0, code lost:
    
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0076, code lost:
    
        r1 = r17.E;
        r2 = r17.q.f();
        r9.a = r19;
        r9.b = r1;
        r9.c = r2;
        r17.r = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0074, code lost:
    
        if ((((((r2 * r5) * r5) / 2.0f) + (r19 * r5)) + r1) < 0.0f) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(float f, float f2, int i) {
        float f3;
        wps wpsVar;
        wps wpsVar2;
        wps wpsVar3;
        wps wpsVar4;
        wps wpsVar5;
        wps wpsVar6;
        wps wpsVar7;
        float f4 = f;
        if (this.q == null || this.E == f4) {
            return;
        }
        this.v0 = true;
        this.B = getNanoTime();
        yei yeiVar = this.q;
        xei xeiVar = yeiVar.c;
        float f5 = (xeiVar != null ? xeiVar.h : yeiVar.j) / 1000.0f;
        this.C = f5;
        this.G = f4;
        this.I = true;
        dhr dhrVar = this.w0;
        float f6 = 0.0f;
        if (i != 0 && i != 1 && i != 2) {
            f3 = 1.0f;
            mei meiVar = this.x0;
            if (i == 4) {
                float f7 = this.E;
                float f8 = yeiVar.f();
                meiVar.a = f2;
                meiVar.b = f7;
                meiVar.c = f8;
                this.r = meiVar;
            } else if (i == 5) {
                float f9 = this.E;
                float f10 = yeiVar.f();
                if (f2 > 0.0f) {
                    float f11 = f2 / f10;
                } else {
                    float f12 = (-f2) / f10;
                }
            } else if (i != 6) {
            }
            this.H = false;
            this.B = getNanoTime();
            invalidate();
        }
        f3 = 1.0f;
        if (i == 1 || i == 7) {
            f4 = 0.0f;
        } else if (i == 2 || i == 6) {
            f4 = f3;
        }
        int i2 = (xeiVar == null || (wpsVar7 = xeiVar.l) == null) ? 0 : wpsVar7.D;
        float f13 = this.E;
        int i3 = i2;
        dhr dhrVar2 = this.w0;
        if (i3 == 0) {
            float f14 = yeiVar.f();
            xei xeiVar2 = this.q.c;
            if (xeiVar2 != null && (wpsVar6 = xeiVar2.l) != null) {
                f6 = wpsVar6.s;
            }
            dhrVar2.b(f13, f4, f2, f5, f14, f6);
        } else {
            float f15 = (xeiVar == null || (wpsVar5 = xeiVar.l) == null) ? 0.0f : wpsVar5.z;
            float f16 = (xeiVar == null || (wpsVar4 = xeiVar.l) == null) ? 0.0f : wpsVar4.A;
            float f17 = (xeiVar == null || (wpsVar3 = xeiVar.l) == null) ? 0.0f : wpsVar3.y;
            float f18 = (xeiVar == null || (wpsVar2 = xeiVar.l) == null) ? 0.0f : wpsVar2.B;
            int i4 = (xeiVar == null || (wpsVar = xeiVar.l) == null) ? 0 : wpsVar.C;
            if (dhrVar2.b == null) {
                c9r c9rVar = new c9r();
                c9rVar.a = 0.5d;
                c9rVar.i = 0;
                dhrVar2.b = c9rVar;
            }
            c9r c9rVar2 = dhrVar2.b;
            dhrVar2.c = c9rVar2;
            c9rVar2.c = f4;
            c9rVar2.a = f17;
            c9rVar2.e = f13;
            c9rVar2.b = f16;
            c9rVar2.g = f15;
            c9rVar2.h = f18;
            c9rVar2.i = i4;
            c9rVar2.d = 0.0f;
        }
        int i5 = this.v;
        this.G = f4;
        this.v = i5;
        this.r = dhrVar;
        this.H = false;
        this.B = getNanoTime();
        invalidate();
    }

    public final void I(int i) {
        j4x j4xVar;
        if (!isAttachedToWindow()) {
            if (this.Z0 == null) {
                this.Z0 = new oei(this);
            }
            this.Z0.d = i;
            return;
        }
        yei yeiVar = this.q;
        if (yeiVar != null && (j4xVar = yeiVar.b) != null) {
            int i2 = this.v;
            float f = -1;
            qer qerVar = (qer) ((SparseArray) j4xVar.c).get(i);
            if (qerVar == null) {
                i2 = i;
            } else {
                ArrayList arrayList = qerVar.b;
                int i3 = qerVar.c;
                if (f != -1.0f && f != -1.0f) {
                    Iterator it = arrayList.iterator();
                    rer rerVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            rer rerVar2 = (rer) it.next();
                            if (rerVar2.a(f, f)) {
                                if (i2 == rerVar2.e) {
                                    break;
                                } else {
                                    rerVar = rerVar2;
                                }
                            }
                        } else if (rerVar != null) {
                            i2 = rerVar.e;
                        }
                    }
                } else if (i3 != i2) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i2 == ((rer) it2.next()).e) {
                            break;
                        }
                    }
                    i2 = i3;
                }
            }
            if (i2 != -1) {
                i = i2;
            }
        }
        int i4 = this.v;
        if (i4 == i) {
            return;
        }
        if (this.u == i) {
            u(0.0f);
            return;
        }
        if (this.w == i) {
            u(1.0f);
            return;
        }
        this.w = i;
        if (i4 != -1) {
            G(i4, i);
            u(1.0f);
            this.E = 0.0f;
            u(1.0f);
            this.a1 = null;
            return;
        }
        this.v0 = false;
        this.G = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = getNanoTime();
        this.B = getNanoTime();
        this.H = false;
        this.r = null;
        yei yeiVar2 = this.q;
        this.C = (yeiVar2.c != null ? r6.h : yeiVar2.j) / 1000.0f;
        this.u = -1;
        yeiVar2.m(-1, this.w);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap hashMap = this.A;
        hashMap.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            hashMap.put(childAt, new gei(childAt));
            sparseArray.put(childAt.getId(), (gei) hashMap.get(childAt));
        }
        this.I = true;
        f96 b = this.q.b(i);
        eg0 eg0Var = this.e1;
        eg0Var.g(null, b);
        E();
        eg0Var.c();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            gei geiVar = (gei) hashMap.get(childAt2);
            if (geiVar != null) {
                sei seiVar = geiVar.f;
                seiVar.c = 0.0f;
                seiVar.d = 0.0f;
                seiVar.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                eei eeiVar = geiVar.h;
                eeiVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                eeiVar.c = childAt2.getVisibility();
                eeiVar.e = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                eeiVar.f = childAt2.getElevation();
                eeiVar.g = childAt2.getRotation();
                eeiVar.h = childAt2.getRotationX();
                eeiVar.a = childAt2.getRotationY();
                eeiVar.i = childAt2.getScaleX();
                eeiVar.j = childAt2.getScaleY();
                eeiVar.k = childAt2.getPivotX();
                eeiVar.l = childAt2.getPivotY();
                eeiVar.m = childAt2.getTranslationX();
                eeiVar.n = childAt2.getTranslationY();
                eeiVar.o = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i7 = 0; i7 < childCount; i7++) {
            gei geiVar2 = (gei) hashMap.get(getChildAt(i7));
            if (geiVar2 != null) {
                this.q.e(geiVar2);
                geiVar2.g(getNanoTime(), width, height);
            }
        }
        xei xeiVar = this.q.c;
        float f2 = xeiVar != null ? xeiVar.i : 0.0f;
        if (f2 != 0.0f) {
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            for (int i8 = 0; i8 < childCount; i8++) {
                sei seiVar2 = ((gei) hashMap.get(getChildAt(i8))).g;
                float f5 = seiVar2.f + seiVar2.e;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                gei geiVar3 = (gei) hashMap.get(getChildAt(i9));
                sei seiVar3 = geiVar3.g;
                float f6 = seiVar3.e;
                float f7 = seiVar3.f;
                geiVar3.n = 1.0f / (1.0f - f2);
                geiVar3.m = f2 - ((((f6 + f7) - f3) * f2) / (f4 - f3));
            }
        }
        this.D = 0.0f;
        this.E = 0.0f;
        this.I = true;
        invalidate();
    }

    public final void J(int i, f96 f96Var) {
        yei yeiVar = this.q;
        if (yeiVar != null) {
            yeiVar.g.put(i, f96Var);
        }
        this.e1.g(this.q.b(this.u), this.q.b(this.w));
        E();
        if (this.v == i) {
            f96Var.b(this);
        }
    }

    public final void K(int i, View... viewArr) {
        yei yeiVar = this.q;
        if (yeiVar == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        rdk rdkVar = yeiVar.q;
        String str = (String) rdkVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) rdkVar.d).iterator();
        vhu vhuVar = null;
        while (it.hasNext()) {
            vhu vhuVar2 = (vhu) it.next();
            if (vhuVar2.a == i) {
                for (View view : viewArr) {
                    if (vhuVar2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    vhuVar = vhuVar2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    rei reiVar = (rei) rdkVar.c;
                    int currentState = reiVar.getCurrentState();
                    if (vhuVar2.e != 2) {
                        if (currentState == -1) {
                            Log.w(str, "No support for ViewTransition within transition yet. Currently: ".concat(reiVar.toString()));
                        } else {
                            yei yeiVar2 = reiVar.q;
                            f96 b = yeiVar2 == null ? null : yeiVar2.b(currentState);
                            if (b != null) {
                                vhuVar = vhuVar2;
                                vhuVar.a(rdkVar, (rei) rdkVar.c, currentState, b, viewArr2);
                            }
                        }
                        vhuVar = vhuVar2;
                    } else {
                        vhuVar = vhuVar2;
                        vhuVar.a(rdkVar, (rei) rdkVar.c, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (vhuVar == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }

    @Override // defpackage.myi
    public final void c(int i, View view) {
        wps wpsVar;
        int i2;
        yei yeiVar = this.q;
        if (yeiVar != null) {
            float f = this.F0;
            if (f == 0.0f) {
                return;
            }
            float f2 = this.C0 / f;
            float f3 = this.D0 / f;
            xei xeiVar = yeiVar.c;
            if (xeiVar == null || (wpsVar = xeiVar.l) == null) {
                return;
            }
            float[] fArr = wpsVar.n;
            wpsVar.m = false;
            rei reiVar = wpsVar.r;
            float progress = reiVar.getProgress();
            wpsVar.r.z(wpsVar.d, progress, wpsVar.h, wpsVar.g, fArr);
            float f4 = wpsVar.k;
            float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * wpsVar.l) / fArr[1];
            if (!Float.isNaN(f5)) {
                progress += f5 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i2 = wpsVar.c) == 3) {
                return;
            }
            reiVar.H(((double) progress) >= 0.5d ? 1.0f : 0.0f, f5, i2);
        }
    }

    @Override // defpackage.myi
    public final void d(View view, View view2, int i, int i2) {
        this.E0 = getNanoTime();
        this.F0 = 0.0f;
        this.C0 = 0.0f;
        this.D0 = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0377  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Iterator it;
        ArrayList arrayList;
        int i;
        nei neiVar;
        int i2;
        int i3;
        Paint paint;
        Paint paint2;
        int i4;
        int i5;
        gei geiVar;
        nei neiVar2;
        int i6;
        Paint paint3;
        jya jyaVar;
        Iterator it2;
        double d;
        ex0 ex0Var;
        Paint paint4;
        String resourceEntryName;
        rdk rdkVar;
        w(false);
        yei yeiVar = this.q;
        if (yeiVar != null && (rdkVar = yeiVar.q) != null) {
            ArrayList arrayList2 = (ArrayList) rdkVar.g;
            ArrayList arrayList3 = (ArrayList) rdkVar.f;
            if (arrayList3 != null) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((uhu) it3.next()).a();
                }
                ((ArrayList) rdkVar.f).removeAll(arrayList2);
                arrayList2.clear();
                if (((ArrayList) rdkVar.f).isEmpty()) {
                    rdkVar.f = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.q == null) {
            return;
        }
        if ((this.K & 1) == 1 && !isInEditMode()) {
            this.K0++;
            long nanoTime = getNanoTime();
            long j = this.L0;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.M0 = ((int) ((this.K0 / (r10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.K0 = 0;
                    this.L0 = nanoTime;
                }
            } else {
                this.L0 = nanoTime;
            }
            Paint paint5 = new Paint();
            paint5.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.M0);
            sb.append(" fps ");
            int i7 = this.u;
            StringBuilder k = dfi.k(su4.o(sb, i7 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i7), " -> "));
            int i8 = this.w;
            k.append(i8 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i8));
            k.append(" (progress: ");
            k.append(progress);
            k.append(" ) state=");
            int i9 = this.v;
            if (i9 == -1) {
                resourceEntryName = StringUtils.UNDEFINED;
            } else {
                resourceEntryName = i9 != -1 ? getContext().getResources().getResourceEntryName(i9) : "UNDEFINED";
            }
            k.append(resourceEntryName);
            String sb2 = k.toString();
            paint5.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint5);
            paint5.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint5);
        }
        if (this.K > 1) {
            if (this.L == null) {
                this.L = new nei(this);
            }
            nei neiVar3 = this.L;
            yei yeiVar2 = this.q;
            xei xeiVar = yeiVar2.c;
            int i10 = xeiVar != null ? xeiVar.h : yeiVar2.j;
            int i11 = this.K;
            Paint paint6 = neiVar3.g;
            Paint paint7 = neiVar3.f;
            Paint paint8 = neiVar3.i;
            int i12 = neiVar3.m;
            Paint paint9 = neiVar3.e;
            rei reiVar = neiVar3.n;
            HashMap hashMap = this.A;
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!reiVar.isInEditMode() && (i11 & 1) == 2) {
                String str = reiVar.getContext().getResources().getResourceName(reiVar.w) + StringUtils.PROCESS_POSTFIX_DELIMITER + reiVar.getProgress();
                canvas.drawText(str, 10.0f, reiVar.getHeight() - 30, neiVar3.h);
                canvas.drawText(str, 11.0f, reiVar.getHeight() - 29, paint9);
            }
            Iterator it4 = hashMap.values().iterator();
            while (it4.hasNext()) {
                gei geiVar2 = (gei) it4.next();
                sei seiVar = geiVar2.f;
                ArrayList arrayList4 = geiVar2.u;
                int i13 = seiVar.b;
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    i13 = Math.max(i13, ((sei) it5.next()).b);
                }
                int max = Math.max(i13, geiVar2.g.b);
                if (i11 > 0 && max == 0) {
                    max = 1;
                }
                if (max != 0) {
                    float[] fArr = neiVar3.c;
                    int[] iArr = neiVar3.b;
                    if (fArr != null) {
                        it = it4;
                        double[] l0 = geiVar2.j[0].l0();
                        if (iArr != null) {
                            Iterator it6 = arrayList4.iterator();
                            int i14 = 0;
                            while (it6.hasNext()) {
                                iArr[i14] = ((sei) it6.next()).o;
                                i14++;
                                arrayList4 = arrayList4;
                            }
                        }
                        arrayList = arrayList4;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < l0.length) {
                            int i17 = i15;
                            float[] fArr2 = fArr;
                            double[] dArr = l0;
                            geiVar2.j[0].i0(l0[i17], geiVar2.p);
                            geiVar2.f.c(dArr[i17], geiVar2.o, geiVar2.p, fArr2, i16);
                            i16 += 2;
                            i15 = i17 + 1;
                            fArr = fArr2;
                            l0 = dArr;
                        }
                        i = i16 / 2;
                    } else {
                        it = it4;
                        arrayList = arrayList4;
                        i = 0;
                    }
                    neiVar3.k = i;
                    if (max >= 1) {
                        int i18 = i10 / 16;
                        float[] fArr3 = neiVar3.a;
                        if (fArr3 == null || fArr3.length != i18 * 2) {
                            neiVar3.a = new float[i18 * 2];
                            neiVar3.d = new Path();
                        }
                        float f = i12;
                        canvas.translate(f, f);
                        paint9.setColor(1996488704);
                        paint8.setColor(1996488704);
                        paint7.setColor(1996488704);
                        paint6.setColor(1996488704);
                        float[] fArr4 = neiVar3.a;
                        float f2 = 1.0f / (i18 - 1);
                        float f3 = 1.0f;
                        HashMap hashMap2 = geiVar2.y;
                        ihu ihuVar = hashMap2 == null ? null : (ihu) hashMap2.get("translationX");
                        HashMap hashMap3 = geiVar2.y;
                        i2 = i10;
                        ihu ihuVar2 = hashMap3 == null ? null : (ihu) hashMap3.get("translationY");
                        i3 = i11;
                        HashMap hashMap4 = geiVar2.z;
                        tfu tfuVar = hashMap4 == null ? null : (tfu) hashMap4.get("translationX");
                        HashMap hashMap5 = geiVar2.z;
                        tfu tfuVar2 = hashMap5 == null ? null : (tfu) hashMap5.get("translationY");
                        int i19 = 0;
                        while (true) {
                            float f4 = Float.NaN;
                            i5 = i12;
                            if (i19 >= i18) {
                                break;
                            }
                            float f5 = i19 * f2;
                            int i20 = i18;
                            float f6 = geiVar2.n;
                            if (f6 != f3) {
                                float f7 = geiVar2.m;
                                if (f5 < f7) {
                                    f5 = 0.0f;
                                }
                                if (f5 > f7) {
                                    i6 = i19;
                                    paint3 = paint6;
                                    if (f5 < 1.0d) {
                                        f5 = Math.min((f5 - f7) * f6, f3);
                                        double d2 = f5;
                                        jyaVar = seiVar.a;
                                        it2 = arrayList.iterator();
                                        float f8 = 0.0f;
                                        while (it2.hasNext()) {
                                            double d3 = d2;
                                            sei seiVar2 = (sei) it2.next();
                                            jya jyaVar2 = seiVar2.a;
                                            if (jyaVar2 != null) {
                                                float f9 = seiVar2.c;
                                                if (f9 < f5) {
                                                    f8 = f9;
                                                    jyaVar = jyaVar2;
                                                } else if (Float.isNaN(f4)) {
                                                    f4 = seiVar2.c;
                                                }
                                            }
                                            d2 = d3;
                                        }
                                        double d4 = d2;
                                        if (jyaVar != null) {
                                            if (Float.isNaN(f4)) {
                                                f4 = 1.0f;
                                            }
                                            d = (((float) jyaVar.a((f5 - f8) / r21)) * (f4 - f8)) + f8;
                                        } else {
                                            d = d4;
                                        }
                                        sei seiVar3 = seiVar;
                                        geiVar2.j[0].i0(d, geiVar2.p);
                                        ex0Var = geiVar2.k;
                                        if (ex0Var != null) {
                                            double[] dArr2 = geiVar2.p;
                                            paint4 = paint8;
                                            if (dArr2.length > 0) {
                                                ex0Var.i0(d, dArr2);
                                            }
                                        } else {
                                            paint4 = paint8;
                                        }
                                        int i21 = i6 * 2;
                                        geiVar2.f.c(d, geiVar2.o, geiVar2.p, fArr4, i21);
                                        if (tfuVar != null) {
                                            fArr4[i21] = tfuVar.a(f5) + fArr4[i21];
                                        } else if (ihuVar != null) {
                                            fArr4[i21] = ihuVar.a(f5) + fArr4[i21];
                                        }
                                        if (tfuVar2 != null) {
                                            int i22 = i21 + 1;
                                            fArr4[i22] = tfuVar2.a(f5) + fArr4[i22];
                                        } else if (ihuVar2 != null) {
                                            int i23 = i21 + 1;
                                            fArr4[i23] = ihuVar2.a(f5) + fArr4[i23];
                                        }
                                        i19 = i6 + 1;
                                        i12 = i5;
                                        i18 = i20;
                                        paint6 = paint3;
                                        seiVar = seiVar3;
                                        paint8 = paint4;
                                        f3 = 1.0f;
                                    }
                                    double d22 = f5;
                                    jyaVar = seiVar.a;
                                    it2 = arrayList.iterator();
                                    float f82 = 0.0f;
                                    while (it2.hasNext()) {
                                    }
                                    double d42 = d22;
                                    if (jyaVar != null) {
                                    }
                                    sei seiVar32 = seiVar;
                                    geiVar2.j[0].i0(d, geiVar2.p);
                                    ex0Var = geiVar2.k;
                                    if (ex0Var != null) {
                                    }
                                    int i212 = i6 * 2;
                                    geiVar2.f.c(d, geiVar2.o, geiVar2.p, fArr4, i212);
                                    if (tfuVar != null) {
                                    }
                                    if (tfuVar2 != null) {
                                    }
                                    i19 = i6 + 1;
                                    i12 = i5;
                                    i18 = i20;
                                    paint6 = paint3;
                                    seiVar = seiVar32;
                                    paint8 = paint4;
                                    f3 = 1.0f;
                                }
                            }
                            i6 = i19;
                            paint3 = paint6;
                            double d222 = f5;
                            jyaVar = seiVar.a;
                            it2 = arrayList.iterator();
                            float f822 = 0.0f;
                            while (it2.hasNext()) {
                            }
                            double d422 = d222;
                            if (jyaVar != null) {
                            }
                            sei seiVar322 = seiVar;
                            geiVar2.j[0].i0(d, geiVar2.p);
                            ex0Var = geiVar2.k;
                            if (ex0Var != null) {
                            }
                            int i2122 = i6 * 2;
                            geiVar2.f.c(d, geiVar2.o, geiVar2.p, fArr4, i2122);
                            if (tfuVar != null) {
                            }
                            if (tfuVar2 != null) {
                            }
                            i19 = i6 + 1;
                            i12 = i5;
                            i18 = i20;
                            paint6 = paint3;
                            seiVar = seiVar322;
                            paint8 = paint4;
                            f3 = 1.0f;
                        }
                        sei seiVar4 = seiVar;
                        neiVar3.a(canvas, max, neiVar3.k, geiVar2);
                        paint9.setColor(-21965);
                        paint7.setColor(-2067046);
                        Paint paint10 = paint8;
                        paint10.setColor(-2067046);
                        paint = paint6;
                        paint.setColor(-13391360);
                        int i24 = i5;
                        float f10 = -i24;
                        canvas.translate(f10, f10);
                        neiVar3.a(canvas, max, neiVar3.k, geiVar2);
                        char c = 5;
                        if (max == 5) {
                            float[] fArr5 = neiVar3.j;
                            neiVar3.d.reset();
                            int i25 = 0;
                            while (i25 <= 50) {
                                char c2 = c;
                                int i26 = i25;
                                geiVar2.j[0].i0(geiVar2.a(i25 / 50, null), geiVar2.p);
                                int[] iArr2 = geiVar2.o;
                                double[] dArr3 = geiVar2.p;
                                sei seiVar5 = seiVar4;
                                float f11 = seiVar5.e;
                                float f12 = seiVar5.f;
                                float f13 = seiVar5.g;
                                float f14 = seiVar5.h;
                                float[] fArr6 = fArr5;
                                int i27 = i24;
                                int i28 = 0;
                                while (true) {
                                    geiVar = geiVar2;
                                    if (i28 >= iArr2.length) {
                                        break;
                                    }
                                    Paint paint11 = paint10;
                                    float f15 = (float) dArr3[i28];
                                    int i29 = iArr2[i28];
                                    if (i29 == 1) {
                                        f11 = f15;
                                    } else if (i29 == 2) {
                                        f12 = f15;
                                    } else if (i29 == 3) {
                                        f13 = f15;
                                    } else if (i29 == 4) {
                                        f14 = f15;
                                    }
                                    i28++;
                                    geiVar2 = geiVar;
                                    paint10 = paint11;
                                }
                                Paint paint12 = paint10;
                                if (seiVar5.m != null) {
                                    double d5 = 0.0f;
                                    double d6 = f11;
                                    neiVar2 = neiVar3;
                                    double d7 = f12;
                                    f11 = (float) (((Math.sin(d7) * d6) + d5) - (f13 / 2.0f));
                                    f12 = (float) ((d5 - (Math.cos(d7) * d6)) - (f14 / 2.0f));
                                } else {
                                    neiVar2 = neiVar3;
                                }
                                float f16 = f13 + f11;
                                float f17 = f14 + f12;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f18 = f11 + 0.0f;
                                float f19 = f12 + 0.0f;
                                float f20 = f16 + 0.0f;
                                float f21 = f17 + 0.0f;
                                fArr6[0] = f18;
                                fArr6[1] = f19;
                                fArr6[2] = f20;
                                fArr6[3] = f19;
                                fArr6[4] = f20;
                                fArr6[c2] = f21;
                                fArr6[6] = f18;
                                fArr6[7] = f21;
                                neiVar2.d.moveTo(f18, f19);
                                neiVar2.d.lineTo(fArr6[2], fArr6[3]);
                                neiVar2.d.lineTo(fArr6[4], fArr6[c2]);
                                neiVar2.d.lineTo(fArr6[6], fArr6[7]);
                                neiVar2.d.close();
                                i25 = i26 + 1;
                                neiVar3 = neiVar2;
                                seiVar4 = seiVar5;
                                c = c2;
                                fArr5 = fArr6;
                                geiVar2 = geiVar;
                                i24 = i27;
                                paint10 = paint12;
                            }
                            i4 = i24;
                            neiVar = neiVar3;
                            paint2 = paint10;
                            paint9.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(neiVar.d, paint9);
                            canvas.translate(-2.0f, -2.0f);
                            paint9.setColor(-65536);
                            canvas.drawPath(neiVar.d, paint9);
                            neiVar3 = neiVar;
                            paint6 = paint;
                            it4 = it;
                            i10 = i2;
                            i11 = i3;
                            i12 = i4;
                            paint8 = paint2;
                        } else {
                            i4 = i24;
                            neiVar = neiVar3;
                            paint2 = paint10;
                        }
                    } else {
                        neiVar = neiVar3;
                        i2 = i10;
                        i3 = i11;
                        paint = paint6;
                        paint2 = paint8;
                        i4 = i12;
                    }
                    neiVar3 = neiVar;
                    paint6 = paint;
                    it4 = it;
                    i10 = i2;
                    i11 = i3;
                    i12 = i4;
                    paint8 = paint2;
                }
            }
            canvas.restore();
        }
    }

    @Override // defpackage.myi
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        xei xeiVar;
        boolean z;
        float f;
        wps wpsVar;
        float f2;
        wps wpsVar2;
        wps wpsVar3;
        wps wpsVar4;
        int i4;
        yei yeiVar = this.q;
        if (yeiVar == null || (xeiVar = yeiVar.c) == null || (z = xeiVar.o)) {
            return;
        }
        int i5 = -1;
        if (z || (wpsVar4 = xeiVar.l) == null || (i4 = wpsVar4.e) == -1 || view.getId() == i4) {
            xei xeiVar2 = yeiVar.c;
            if ((xeiVar2 == null || (wpsVar3 = xeiVar2.l) == null) ? false : wpsVar3.u) {
                wps wpsVar5 = xeiVar.l;
                if (wpsVar5 != null && (wpsVar5.w & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.D;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            wps wpsVar6 = xeiVar.l;
            if (wpsVar6 == null || (wpsVar6.w & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                xei xeiVar3 = yeiVar.c;
                if (xeiVar3 == null || (wpsVar2 = xeiVar3.l) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = wpsVar2.n;
                    f = 0.0f;
                    wpsVar2.r.z(wpsVar2.d, wpsVar2.r.getProgress(), wpsVar2.h, wpsVar2.g, fArr);
                    float f6 = wpsVar2.k;
                    if (f6 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * wpsVar2.l) / fArr[1];
                    }
                }
                float f7 = this.E;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new dsd(16, view));
                    return;
                }
            }
            float f8 = this.D;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.C0 = f9;
            float f10 = i2;
            this.D0 = f10;
            this.F0 = (float) ((nanoTime - this.E0) * 1.0E-9d);
            this.E0 = nanoTime;
            xei xeiVar4 = yeiVar.c;
            if (xeiVar4 != null && (wpsVar = xeiVar4.l) != null) {
                float[] fArr2 = wpsVar.n;
                rei reiVar = wpsVar.r;
                float progress = reiVar.getProgress();
                if (!wpsVar.m) {
                    wpsVar.m = true;
                    reiVar.setProgress(progress);
                }
                wpsVar.r.z(wpsVar.d, progress, wpsVar.h, wpsVar.g, fArr2);
                if (Math.abs((wpsVar.l * fArr2[1]) + (wpsVar.k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = wpsVar.k;
                float max = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * wpsVar.l) / fArr2[1]), 1.0f), f);
                if (max != reiVar.getProgress()) {
                    reiVar.setProgress(max);
                }
            }
            if (f8 != this.D) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            w(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.B0 = true;
        }
    }

    public int[] getConstraintSetIds() {
        yei yeiVar = this.q;
        if (yeiVar == null) {
            return null;
        }
        SparseArray sparseArray = yeiVar.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.v;
    }

    public ArrayList<xei> getDefinedTransitions() {
        yei yeiVar = this.q;
        if (yeiVar == null) {
            return null;
        }
        return yeiVar.d;
    }

    public fz7 getDesignTool() {
        if (this.y0 == null) {
            this.y0 = new fz7();
        }
        return this.y0;
    }

    public int getEndState() {
        return this.w;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.E;
    }

    public yei getScene() {
        return this.q;
    }

    public int getStartState() {
        return this.u;
    }

    public float getTargetPosition() {
        return this.G;
    }

    public Bundle getTransitionState() {
        if (this.Z0 == null) {
            this.Z0 = new oei(this);
        }
        oei oeiVar = this.Z0;
        rei reiVar = oeiVar.e;
        oeiVar.d = reiVar.w;
        oeiVar.c = reiVar.u;
        oeiVar.b = reiVar.getVelocity();
        oeiVar.a = reiVar.getProgress();
        oei oeiVar2 = this.Z0;
        oeiVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", oeiVar2.a);
        bundle.putFloat("motion.velocity", oeiVar2.b);
        bundle.putInt("motion.StartState", oeiVar2.c);
        bundle.putInt("motion.EndState", oeiVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        yei yeiVar = this.q;
        if (yeiVar != null) {
            this.C = (yeiVar.c != null ? r2.h : yeiVar.j) / 1000.0f;
        }
        return (long) (this.C * 1000.0f);
    }

    public float getVelocity() {
        return this.t;
    }

    @Override // defpackage.nyi
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.B0 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.B0 = false;
    }

    @Override // defpackage.myi
    public final boolean o(View view, View view2, int i, int i2) {
        xei xeiVar;
        wps wpsVar;
        yei yeiVar = this.q;
        return (yeiVar == null || (xeiVar = yeiVar.c) == null || (wpsVar = xeiVar.l) == null || (wpsVar.w & 2) != 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        xei xeiVar;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        yei yeiVar = this.q;
        if (yeiVar != null && (i = this.v) != -1) {
            f96 b = yeiVar.b(i);
            yei yeiVar2 = this.q;
            SparseArray sparseArray = yeiVar2.g;
            loop0: for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int keyAt = sparseArray.keyAt(i2);
                SparseIntArray sparseIntArray = yeiVar2.i;
                int i3 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i3 > 0) {
                    if (i3 != keyAt) {
                        int i4 = size - 1;
                        if (size >= 0) {
                            i3 = sparseIntArray.get(i3);
                            size = i4;
                        }
                    }
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break loop0;
                }
                yeiVar2.l(keyAt, this);
            }
            if (b != null) {
                b.b(this);
            }
            this.u = this.v;
        }
        C();
        oei oeiVar = this.Z0;
        if (oeiVar != null) {
            if (this.c1) {
                post(new dsd(17, this));
                return;
            } else {
                oeiVar.a();
                return;
            }
        }
        yei yeiVar3 = this.q;
        if (yeiVar3 == null || (xeiVar = yeiVar3.c) == null || xeiVar.n != 4) {
            return;
        }
        u(1.0f);
        this.a1 = null;
        setState(qei.b);
        setState(qei.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0101  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        xei xeiVar;
        wps wpsVar;
        int i;
        RectF b;
        Iterator it;
        yei yeiVar = this.q;
        if (yeiVar == null || !this.z) {
            return false;
        }
        rdk rdkVar = yeiVar.q;
        if (rdkVar != null) {
            ArrayList arrayList = (ArrayList) rdkVar.d;
            rei reiVar = (rei) rdkVar.c;
            int currentState = reiVar.getCurrentState();
            if (currentState != -1) {
                if (((HashSet) rdkVar.e) == null) {
                    rdkVar.e = new HashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        vhu vhuVar = (vhu) it2.next();
                        int childCount = reiVar.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = reiVar.getChildAt(i2);
                            if (vhuVar.c(childAt)) {
                                childAt.getId();
                                ((HashSet) rdkVar.e).add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) rdkVar.f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator it3 = ((ArrayList) rdkVar.f).iterator();
                    while (it3.hasNext()) {
                        uhu uhuVar = (uhu) it3.next();
                        Rect rect2 = uhuVar.l;
                        if (action != 1) {
                            if (action == 2) {
                                uhuVar.c.b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !uhuVar.h) {
                                    uhuVar.b();
                                }
                            }
                        } else if (!uhuVar.h) {
                            uhuVar.b();
                        }
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    yei yeiVar2 = reiVar.q;
                    f96 b2 = yeiVar2 == null ? null : yeiVar2.b(currentState);
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        vhu vhuVar2 = (vhu) it4.next();
                        int i3 = vhuVar2.b;
                        if (i3 == 1) {
                            if (action == 0) {
                                it = ((HashSet) rdkVar.e).iterator();
                                while (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (vhuVar2.c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            vhuVar2.a(rdkVar, (rei) rdkVar.c, currentState, b2, view);
                                        }
                                    }
                                }
                            }
                        } else if (i3 == 2) {
                            if (action == 1) {
                                it = ((HashSet) rdkVar.e).iterator();
                                while (it.hasNext()) {
                                }
                            }
                        } else if (i3 == 3 && action == 0) {
                            it = ((HashSet) rdkVar.e).iterator();
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                xeiVar = this.q.c;
                if (xeiVar != null || xeiVar.o || (wpsVar = xeiVar.l) == null) {
                    return z;
                }
                if ((motionEvent.getAction() == 0 && (b = wpsVar.b(this, new RectF())) != null && !b.contains(motionEvent.getX(), motionEvent.getY())) || (i = wpsVar.e) == -1) {
                    return z;
                }
                View view2 = this.h1;
                if (view2 == null || view2.getId() != i) {
                    this.h1 = findViewById(i);
                }
                View view3 = this.h1;
                if (view3 == null) {
                    return z;
                }
                float left = view3.getLeft();
                float top = this.h1.getTop();
                float right = this.h1.getRight();
                float bottom = this.h1.getBottom();
                RectF rectF = this.g1;
                rectF.set(left, top, right, bottom);
                return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || A((float) this.h1.getLeft(), (float) this.h1.getTop(), this.h1, motionEvent)) ? z : onTouchEvent(motionEvent);
            }
        }
        z = false;
        xeiVar = this.q.c;
        return xeiVar != null ? z : z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        rei reiVar;
        this.Y0 = true;
        try {
            if (this.q == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.Y0 = false;
                return;
            }
            reiVar = this;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            try {
                if (reiVar.z0 == i5) {
                    if (reiVar.A0 != i6) {
                    }
                    reiVar.z0 = i5;
                    reiVar.A0 = i6;
                    reiVar.Y0 = false;
                }
                E();
                w(true);
                reiVar.z0 = i5;
                reiVar.A0 = i6;
                reiVar.Y0 = false;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                reiVar.Y0 = false;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            reiVar = this;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.q == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.x == i && this.y == i2) ? false : true;
        if (this.f1) {
            this.f1 = false;
            C();
            D();
            z3 = true;
        }
        if (this.h) {
            z3 = true;
        }
        this.x = i;
        this.y = i2;
        int g = this.q.g();
        xei xeiVar = this.q.c;
        int i3 = xeiVar == null ? -1 : xeiVar.c;
        eg0 eg0Var = this.e1;
        if ((!z3 && g == eg0Var.a && i3 == eg0Var.b) || this.u == -1) {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        } else {
            super.onMeasure(i, i2);
            eg0Var.g(this.q.b(g), this.q.b(i3));
            eg0Var.h();
            eg0Var.a = g;
            eg0Var.b = i3;
            z = false;
        }
        if (this.P0 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            ba6 ba6Var = this.c;
            int r = ba6Var.r() + paddingRight;
            int l = ba6Var.l() + paddingBottom;
            int i4 = this.U0;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                r = (int) ((this.W0 * (this.S0 - r2)) + this.Q0);
                requestLayout();
            }
            int i5 = this.V0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                l = (int) ((this.W0 * (this.T0 - r1)) + this.R0);
                requestLayout();
            }
            setMeasuredDimension(r, l);
        }
        float signum = Math.signum(this.G - this.E);
        long nanoTime = getNanoTime();
        lei leiVar = this.r;
        float f = this.E + (!(leiVar instanceof dhr) ? (((nanoTime - this.F) * signum) * 1.0E-9f) / this.C : 0.0f);
        if (this.H) {
            f = this.G;
        }
        if ((signum <= 0.0f || f < this.G) && (signum > 0.0f || f > this.G)) {
            z2 = false;
        } else {
            f = this.G;
        }
        if (leiVar != null && !z2) {
            f = this.v0 ? leiVar.getInterpolation((nanoTime - this.B) * 1.0E-9f) : leiVar.getInterpolation(f);
        }
        if ((signum > 0.0f && f >= this.G) || (signum <= 0.0f && f <= this.G)) {
            f = this.G;
        }
        this.W0 = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.s;
        if (interpolator != null) {
            f = interpolator.getInterpolation(f);
        }
        float f2 = f;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            gei geiVar = (gei) this.A.get(childAt);
            if (geiVar != null) {
                geiVar.d(f2, nanoTime2, this.X0, childAt);
            }
        }
        if (this.P0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        wps wpsVar;
        yei yeiVar = this.q;
        if (yeiVar != null) {
            boolean n = n();
            yeiVar.p = n;
            xei xeiVar = yeiVar.c;
            if (xeiVar == null || (wpsVar = xeiVar.l) == null) {
                return;
            }
            wpsVar.c(n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x07f7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jzi jziVar;
        jzi jziVar2;
        wps wpsVar;
        char c;
        char c2;
        int i;
        char c3;
        char c4;
        float f;
        int top;
        int bottom;
        int i2;
        qei qeiVar;
        float f2;
        int i3;
        float f3;
        int i4;
        boolean z;
        double d;
        int i5;
        ?? r18;
        xei xeiVar;
        MotionEvent motionEvent2;
        xei xeiVar2;
        int i6;
        Iterator it;
        RectF rectF;
        float f4;
        xei xeiVar3;
        yei yeiVar = this.q;
        if (yeiVar == null || !this.z || !yeiVar.n()) {
            return super.onTouchEvent(motionEvent);
        }
        yei yeiVar2 = this.q;
        xei xeiVar4 = yeiVar2.c;
        if (xeiVar4 != null && xeiVar4.o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        rei reiVar = yeiVar2.a;
        RectF rectF2 = new RectF();
        if (yeiVar2.o == null) {
            reiVar.getClass();
            jzi jziVar3 = jzi.b;
            jziVar3.a = VelocityTracker.obtain();
            yeiVar2.o = jziVar3;
        }
        VelocityTracker velocityTracker = (VelocityTracker) yeiVar2.o.a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                yeiVar2.r = motionEvent.getRawX();
                yeiVar2.s = motionEvent.getRawY();
                yeiVar2.l = motionEvent;
                yeiVar2.m = false;
                wps wpsVar2 = yeiVar2.c.l;
                if (wpsVar2 != null) {
                    RectF a = wpsVar2.a(reiVar, rectF2);
                    if (a == null || a.contains(yeiVar2.l.getX(), yeiVar2.l.getY())) {
                        RectF b = yeiVar2.c.l.b(reiVar, rectF2);
                        if (b == null || b.contains(yeiVar2.l.getX(), yeiVar2.l.getY())) {
                            yeiVar2.n = false;
                        } else {
                            yeiVar2.n = true;
                        }
                        wps wpsVar3 = yeiVar2.c.l;
                        float f5 = yeiVar2.r;
                        float f6 = yeiVar2.s;
                        wpsVar3.p = f5;
                        wpsVar3.q = f6;
                    } else {
                        yeiVar2.l = null;
                        yeiVar2.m = true;
                    }
                }
            } else if (action == 2 && !yeiVar2.m) {
                float rawY = motionEvent.getRawY() - yeiVar2.s;
                float rawX = motionEvent.getRawX() - yeiVar2.r;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = yeiVar2.l) != null) {
                    if (currentState != -1) {
                        j4x j4xVar = yeiVar2.b;
                        if (j4xVar == null || (i6 = j4xVar.F(currentState)) == -1) {
                            i6 = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = yeiVar2.d.iterator();
                        while (it2.hasNext()) {
                            xei xeiVar5 = (xei) it2.next();
                            if (xeiVar5.d == i6 || xeiVar5.c == i6) {
                                arrayList.add(xeiVar5);
                            }
                        }
                        RectF rectF3 = new RectF();
                        Iterator it3 = arrayList.iterator();
                        float f7 = 0.0f;
                        xeiVar2 = null;
                        while (it3.hasNext()) {
                            xei xeiVar6 = (xei) it3.next();
                            if (xeiVar6.o) {
                                it = it3;
                            } else {
                                wps wpsVar4 = xeiVar6.l;
                                if (wpsVar4 != null) {
                                    wpsVar4.c(yeiVar2.p);
                                    RectF b2 = xeiVar6.l.b(reiVar, rectF3);
                                    if (b2 != null) {
                                        it = it3;
                                        if (!b2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it3;
                                    }
                                    RectF a2 = xeiVar6.l.a(reiVar, rectF3);
                                    if (a2 == null || a2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        wps wpsVar5 = xeiVar6.l;
                                        float f8 = (wpsVar5.l * rawY) + (wpsVar5.k * rawX);
                                        if (wpsVar5.j) {
                                            float x = motionEvent2.getX();
                                            xeiVar6.l.getClass();
                                            float y = motionEvent2.getY();
                                            xeiVar6.l.getClass();
                                            rectF = rectF3;
                                            f4 = f7;
                                            xeiVar3 = xeiVar2;
                                            f8 = ((float) (Math.atan2(rawY + r11, rawX + r6) - Math.atan2(x - 0.5f, y - 0.5f))) * 10.0f;
                                        } else {
                                            rectF = rectF3;
                                            f4 = f7;
                                            xeiVar3 = xeiVar2;
                                        }
                                        float f9 = f8 * (xeiVar6.c == currentState ? -1.0f : 1.1f);
                                        if (f9 > f4) {
                                            f7 = f9;
                                            xeiVar2 = xeiVar6;
                                            it3 = it;
                                            rectF3 = rectF;
                                        }
                                    }
                                } else {
                                    it = it3;
                                    rectF = rectF3;
                                    f4 = f7;
                                    xeiVar3 = xeiVar2;
                                }
                                f7 = f4;
                                xeiVar2 = xeiVar3;
                                it3 = it;
                                rectF3 = rectF;
                            }
                            it3 = it;
                        }
                    } else {
                        xeiVar2 = yeiVar2.c;
                    }
                    if (xeiVar2 != null) {
                        setTransition(xeiVar2);
                        RectF b3 = yeiVar2.c.l.b(reiVar, rectF2);
                        yeiVar2.n = (b3 == null || b3.contains(yeiVar2.l.getX(), yeiVar2.l.getY())) ? false : true;
                        wps wpsVar6 = yeiVar2.c.l;
                        float f10 = yeiVar2.r;
                        float f11 = yeiVar2.s;
                        wpsVar6.p = f10;
                        wpsVar6.q = f11;
                        wpsVar6.m = false;
                    }
                }
            }
            xeiVar = this.q.c;
            if ((xeiVar.r & 4) == 0) {
                return xeiVar.l.m;
            }
            return true;
        }
        if (!yeiVar2.m) {
            xei xeiVar7 = yeiVar2.c;
            if (xeiVar7 != null && (wpsVar = xeiVar7.l) != null) {
                float[] fArr = wpsVar.n;
                if (!yeiVar2.n) {
                    jzi jziVar4 = yeiVar2.o;
                    rei reiVar2 = wpsVar.r;
                    boolean z2 = wpsVar.j;
                    qei qeiVar2 = qei.d;
                    if (z2) {
                        int[] iArr = wpsVar.o;
                        VelocityTracker velocityTracker2 = (VelocityTracker) jziVar4.a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        int action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            wpsVar.p = motionEvent.getRawX();
                            wpsVar.q = motionEvent.getRawY();
                            wpsVar.m = false;
                        } else if (action2 == 1) {
                            wpsVar.m = false;
                            VelocityTracker velocityTracker3 = (VelocityTracker) jziVar4.a;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker4 = (VelocityTracker) jziVar4.a;
                            float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker5 = (VelocityTracker) jziVar4.a;
                            float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f;
                            float progress = reiVar2.getProgress();
                            float width = reiVar2.getWidth() / 2.0f;
                            float height = reiVar2.getHeight() / 2.0f;
                            int i7 = wpsVar.i;
                            if (i7 != -1) {
                                View findViewById = reiVar2.findViewById(i7);
                                reiVar2.getLocationOnScreen(iArr);
                                width = iArr[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
                                f = iArr[1];
                                top = findViewById.getTop();
                                bottom = findViewById.getBottom();
                            } else {
                                int i8 = wpsVar.d;
                                if (i8 != -1) {
                                    View findViewById2 = reiVar2.findViewById(((gei) reiVar2.A.get(reiVar2.findViewById(i8))).f.k);
                                    reiVar2.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
                                    f = iArr[1];
                                    top = findViewById2.getTop();
                                    bottom = findViewById2.getBottom();
                                }
                                float rawX2 = motionEvent.getRawX() - width;
                                double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height, rawX2));
                                i2 = wpsVar.d;
                                if (i2 == -1) {
                                    qeiVar = qeiVar2;
                                    f2 = xVelocity;
                                    i3 = 6;
                                    wpsVar.r.z(i2, progress, wpsVar.h, wpsVar.g, fArr);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    qeiVar = qeiVar2;
                                    f2 = xVelocity;
                                    i3 = 6;
                                    fArr[1] = 360.0f;
                                }
                                float degrees2 = ((float) (Math.toDegrees(Math.atan2(yVelocity + r13, f2 + rawX2)) - degrees)) * 62.5f;
                                f3 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * wpsVar.v) / fArr[1]) + progress : progress;
                                if (f3 != 0.0f || f3 == 1.0f || (i4 = wpsVar.c) == 3) {
                                    qei qeiVar3 = qeiVar;
                                    if (0.0f < f3 || 1.0f <= f3) {
                                        reiVar2.setState(qeiVar3);
                                    }
                                } else {
                                    float f12 = (degrees2 * wpsVar.v) / fArr[1];
                                    float f13 = ((double) f3) < 0.5d ? 0.0f : 1.0f;
                                    if (i4 == i3) {
                                        if (progress + f12 < 0.0f) {
                                            f12 = Math.abs(f12);
                                        }
                                        f13 = 1.0f;
                                    }
                                    if (wpsVar.c == 7) {
                                        if (progress + f12 > 1.0f) {
                                            f12 = -Math.abs(f12);
                                        }
                                        f13 = 0.0f;
                                    }
                                    reiVar2.H(f13, f12 * 3.0f, wpsVar.c);
                                    if (0.0f >= progress || 1.0f <= progress) {
                                        reiVar2.setState(qeiVar);
                                    }
                                }
                            }
                            height = ((bottom + top) / 2.0f) + f;
                            float rawX22 = motionEvent.getRawX() - width;
                            double degrees3 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height, rawX22));
                            i2 = wpsVar.d;
                            if (i2 == -1) {
                            }
                            float degrees22 = ((float) (Math.toDegrees(Math.atan2(yVelocity + r13, f2 + rawX22)) - degrees3)) * 62.5f;
                            if (Float.isNaN(degrees22)) {
                            }
                            if (f3 != 0.0f) {
                            }
                            qei qeiVar32 = qeiVar;
                            if (0.0f < f3) {
                            }
                            reiVar2.setState(qeiVar32);
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            float width2 = reiVar2.getWidth() / 2.0f;
                            float height2 = reiVar2.getHeight() / 2.0f;
                            int i9 = wpsVar.i;
                            if (i9 != -1) {
                                View findViewById3 = reiVar2.findViewById(i9);
                                reiVar2.getLocationOnScreen(iArr);
                                float right = iArr[0] + ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f);
                                float bottom2 = iArr[1] + ((findViewById3.getBottom() + findViewById3.getTop()) / 2.0f);
                                width2 = right;
                                height2 = bottom2;
                            } else {
                                int i10 = wpsVar.d;
                                if (i10 != -1) {
                                    if (reiVar2.findViewById(((gei) reiVar2.A.get(reiVar2.findViewById(i10))).f.k) == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        reiVar2.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((r8.getRight() + r8.getLeft()) / 2.0f);
                                        height2 = ((r8.getBottom() + r8.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                            }
                            float rawX3 = motionEvent.getRawX() - width2;
                            float rawY2 = motionEvent.getRawY() - height2;
                            double atan2 = Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2);
                            float atan22 = (float) (((atan2 - Math.atan2(wpsVar.q - height2, wpsVar.p - width2)) * 180.0d) / 3.141592653589793d);
                            if (atan22 > 330.0f) {
                                atan22 -= 360.0f;
                            } else if (atan22 < -330.0f) {
                                atan22 += 360.0f;
                            }
                            float f14 = atan22;
                            if (Math.abs(f14) > 0.01d || wpsVar.m) {
                                float progress2 = reiVar2.getProgress();
                                if (wpsVar.m) {
                                    z = true;
                                } else {
                                    z = true;
                                    wpsVar.m = true;
                                    reiVar2.setProgress(progress2);
                                }
                                int i11 = wpsVar.d;
                                if (i11 != -1) {
                                    boolean z3 = z;
                                    d = atan2;
                                    i5 = 1000;
                                    wpsVar.r.z(i11, progress2, wpsVar.h, wpsVar.g, fArr);
                                    fArr[z3 ? 1 : 0] = (float) Math.toDegrees(fArr[z3 ? 1 : 0]);
                                    r18 = z3;
                                } else {
                                    boolean z4 = z;
                                    d = atan2;
                                    i5 = 1000;
                                    fArr[z4 ? 1 : 0] = 360.0f;
                                    r18 = z4;
                                }
                                float max = Math.max(Math.min(((f14 * wpsVar.v) / fArr[r18]) + progress2, 1.0f), 0.0f);
                                float progress3 = reiVar2.getProgress();
                                if (max != progress3) {
                                    if (progress3 == 0.0f || progress3 == 1.0f) {
                                        reiVar2.v(progress3 == 0.0f);
                                    }
                                    reiVar2.setProgress(max);
                                    VelocityTracker velocityTracker6 = (VelocityTracker) jziVar4.a;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(i5);
                                    }
                                    VelocityTracker velocityTracker7 = (VelocityTracker) jziVar4.a;
                                    float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker8 = (VelocityTracker) jziVar4.a;
                                    double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : 0.0f;
                                    double d2 = xVelocity2;
                                    reiVar2.t = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d2) - d) * Math.hypot(yVelocity2, d2)) / Math.hypot(rawX3, rawY2)));
                                } else {
                                    reiVar2.t = 0.0f;
                                }
                                wpsVar.p = motionEvent.getRawX();
                                wpsVar.q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        VelocityTracker velocityTracker9 = (VelocityTracker) jziVar4.a;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        int action3 = motionEvent.getAction();
                        if (action3 == 0) {
                            wpsVar.p = motionEvent.getRawX();
                            wpsVar.q = motionEvent.getRawY();
                            wpsVar.m = false;
                        } else if (action3 == 1) {
                            wpsVar.m = false;
                            VelocityTracker velocityTracker10 = (VelocityTracker) jziVar4.a;
                            if (velocityTracker10 != null) {
                                velocityTracker10.computeCurrentVelocity(1000);
                            }
                            VelocityTracker velocityTracker11 = (VelocityTracker) jziVar4.a;
                            float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker12 = (VelocityTracker) jziVar4.a;
                            float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : 0.0f;
                            float progress4 = reiVar2.getProgress();
                            int i12 = wpsVar.d;
                            rei reiVar3 = wpsVar.r;
                            if (i12 != -1) {
                                reiVar3.z(i12, progress4, wpsVar.h, wpsVar.g, fArr);
                                c = 1;
                                c2 = 0;
                            } else {
                                float min = Math.min(reiVar3.getWidth(), reiVar2.getHeight());
                                c = 1;
                                fArr[1] = wpsVar.l * min;
                                c2 = 0;
                                fArr[0] = min * wpsVar.k;
                            }
                            float f15 = wpsVar.k != 0.0f ? xVelocity3 / fArr[c2] : yVelocity3 / fArr[c];
                            float f16 = !Float.isNaN(f15) ? (f15 / 3.0f) + progress4 : progress4;
                            if (f16 != 0.0f && f16 != 1.0f && (i = wpsVar.c) != 3) {
                                float f17 = ((double) f16) < 0.5d ? 0.0f : 1.0f;
                                if (i == 6) {
                                    if (progress4 + f15 < 0.0f) {
                                        f15 = Math.abs(f15);
                                    }
                                    f17 = 1.0f;
                                }
                                if (wpsVar.c == 7) {
                                    if (progress4 + f15 > 1.0f) {
                                        f15 = -Math.abs(f15);
                                    }
                                    f17 = 0.0f;
                                }
                                reiVar2.H(f17, f15, wpsVar.c);
                                if (0.0f >= progress4 || 1.0f <= progress4) {
                                    reiVar2.setState(qeiVar2);
                                }
                            } else if (0.0f >= f16 || 1.0f <= f16) {
                                reiVar2.setState(qeiVar2);
                            }
                        } else if (action3 == 2) {
                            float rawY3 = motionEvent.getRawY() - wpsVar.q;
                            float rawX4 = motionEvent.getRawX() - wpsVar.p;
                            if (Math.abs((wpsVar.l * rawY3) + (wpsVar.k * rawX4)) > wpsVar.x || wpsVar.m) {
                                float progress5 = reiVar2.getProgress();
                                if (!wpsVar.m) {
                                    wpsVar.m = true;
                                    reiVar2.setProgress(progress5);
                                }
                                int i13 = wpsVar.d;
                                rei reiVar4 = wpsVar.r;
                                if (i13 != -1) {
                                    reiVar4.z(i13, progress5, wpsVar.h, wpsVar.g, fArr);
                                    c3 = 1;
                                    c4 = 0;
                                } else {
                                    float min2 = Math.min(reiVar4.getWidth(), reiVar2.getHeight());
                                    c3 = 1;
                                    fArr[1] = wpsVar.l * min2;
                                    c4 = 0;
                                    fArr[0] = min2 * wpsVar.k;
                                }
                                if (Math.abs(((wpsVar.l * fArr[c3]) + (wpsVar.k * fArr[c4])) * wpsVar.v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c3] = 0.01f;
                                }
                                float max2 = Math.max(Math.min(progress5 + (wpsVar.k != 0.0f ? rawX4 / fArr[0] : rawY3 / fArr[c3]), 1.0f), 0.0f);
                                if (wpsVar.c == 6) {
                                    max2 = Math.max(max2, 0.01f);
                                }
                                if (wpsVar.c == 7) {
                                    max2 = Math.min(max2, 0.99f);
                                }
                                float progress6 = reiVar2.getProgress();
                                if (max2 != progress6) {
                                    if (progress6 == 0.0f || progress6 == 1.0f) {
                                        reiVar2.v(progress6 == 0.0f);
                                    }
                                    reiVar2.setProgress(max2);
                                    VelocityTracker velocityTracker13 = (VelocityTracker) jziVar4.a;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(1000);
                                    }
                                    VelocityTracker velocityTracker14 = (VelocityTracker) jziVar4.a;
                                    float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker15 = (VelocityTracker) jziVar4.a;
                                    reiVar2.t = wpsVar.k != 0.0f ? xVelocity4 / fArr[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : 0.0f) / fArr[1];
                                } else {
                                    reiVar2.t = 0.0f;
                                }
                                wpsVar.p = motionEvent.getRawX();
                                wpsVar.q = motionEvent.getRawY();
                            }
                        }
                    }
                }
            }
            yeiVar2.r = motionEvent.getRawX();
            yeiVar2.s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (jziVar = yeiVar2.o) != null) {
                VelocityTracker velocityTracker16 = (VelocityTracker) jziVar.a;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    jziVar2 = null;
                    jziVar.a = null;
                } else {
                    jziVar2 = null;
                }
                yeiVar2.o = jziVar2;
                int i14 = this.v;
                if (i14 != -1) {
                    yeiVar2.a(i14, this);
                }
            }
        }
        xeiVar = this.q.c;
        if ((xeiVar.r & 4) == 0) {
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof kei) {
            kei keiVar = (kei) view;
            if (this.J0 == null) {
                this.J0 = new CopyOnWriteArrayList();
            }
            this.J0.add(keiVar);
            if (keiVar.i) {
                if (this.H0 == null) {
                    this.H0 = new ArrayList();
                }
                this.H0.add(keiVar);
            }
            if (keiVar.j) {
                if (this.I0 == null) {
                    this.I0 = new ArrayList();
                }
                this.I0.add(keiVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.H0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.I0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void p(int i) {
        this.k = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        yei yeiVar;
        xei xeiVar;
        if (!this.P0 && this.v == -1 && (yeiVar = this.q) != null && (xeiVar = yeiVar.c) != null) {
            int i = xeiVar.q;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((gei) this.A.get(getChildAt(i2))).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.K = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.c1 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.z = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.q != null) {
            setState(qei.c);
            Interpolator d = this.q.d();
            if (d != null) {
                setProgress(d.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList = this.I0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((kei) this.I0.get(i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList = this.H0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((kei) this.H0.get(i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.Z0 == null) {
                this.Z0 = new oei(this);
            }
            this.Z0.a = f;
            return;
        }
        qei qeiVar = qei.d;
        qei qeiVar2 = qei.c;
        if (f <= 0.0f) {
            if (this.E == 1.0f && this.v == this.w) {
                setState(qeiVar2);
            }
            this.v = this.u;
            if (this.E == 0.0f) {
                setState(qeiVar);
            }
        } else if (f >= 1.0f) {
            if (this.E == 0.0f && this.v == this.u) {
                setState(qeiVar2);
            }
            this.v = this.w;
            if (this.E == 1.0f) {
                setState(qeiVar);
            }
        } else {
            this.v = -1;
            setState(qeiVar2);
        }
        if (this.q == null) {
            return;
        }
        this.H = true;
        this.G = f;
        this.D = f;
        this.F = -1L;
        this.B = -1L;
        this.r = null;
        this.I = true;
        invalidate();
    }

    public void setScene(yei yeiVar) {
        wps wpsVar;
        this.q = yeiVar;
        boolean n = n();
        yeiVar.p = n;
        xei xeiVar = yeiVar.c;
        if (xeiVar != null && (wpsVar = xeiVar.l) != null) {
            wpsVar.c(n);
        }
        E();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.v = i;
            return;
        }
        if (this.Z0 == null) {
            this.Z0 = new oei(this);
        }
        oei oeiVar = this.Z0;
        oeiVar.c = i;
        oeiVar.d = i;
    }

    public void setState(qei qeiVar) {
        qei qeiVar2 = qei.d;
        if (qeiVar == qeiVar2 && this.v == -1) {
            return;
        }
        qei qeiVar3 = this.d1;
        this.d1 = qeiVar;
        qei qeiVar4 = qei.c;
        if (qeiVar3 == qeiVar4 && qeiVar == qeiVar4) {
            x();
        }
        int ordinal = qeiVar3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && qeiVar == qeiVar2) {
                y();
                return;
            }
            return;
        }
        if (qeiVar == qeiVar4) {
            x();
        }
        if (qeiVar == qeiVar2) {
            y();
        }
    }

    public void setTransition(int i) {
        xei xeiVar;
        yei yeiVar = this.q;
        if (yeiVar != null) {
            Iterator it = yeiVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    xeiVar = null;
                    break;
                } else {
                    xeiVar = (xei) it.next();
                    if (xeiVar.a == i) {
                        break;
                    }
                }
            }
            this.u = xeiVar.d;
            this.w = xeiVar.c;
            if (!isAttachedToWindow()) {
                if (this.Z0 == null) {
                    this.Z0 = new oei(this);
                }
                oei oeiVar = this.Z0;
                oeiVar.c = this.u;
                oeiVar.d = this.w;
                return;
            }
            int i2 = this.v;
            float f = i2 == this.u ? 0.0f : i2 == this.w ? 1.0f : Float.NaN;
            yei yeiVar2 = this.q;
            yeiVar2.c = xeiVar;
            wps wpsVar = xeiVar.l;
            if (wpsVar != null) {
                wpsVar.c(yeiVar2.p);
            }
            this.e1.g(this.q.b(this.u), this.q.b(this.w));
            E();
            if (this.E != f) {
                if (f == 0.0f) {
                    v(true);
                    this.q.b(this.u).b(this);
                } else if (f == 1.0f) {
                    v(false);
                    this.q.b(this.w).b(this);
                }
            }
            this.E = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
            } else {
                Log.v("MotionLayout", irf.N().concat(" transitionToStart "));
                u(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i) {
        yei yeiVar = this.q;
        if (yeiVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        xei xeiVar = yeiVar.c;
        if (xeiVar != null) {
            xeiVar.h = Math.max(i, 8);
        } else {
            yeiVar.j = i;
        }
    }

    public void setTransitionListener(pei peiVar) {
        this.J = peiVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.Z0 == null) {
            this.Z0 = new oei(this);
        }
        oei oeiVar = this.Z0;
        oeiVar.getClass();
        oeiVar.a = bundle.getFloat("motion.progress");
        oeiVar.b = bundle.getFloat("motion.velocity");
        oeiVar.c = bundle.getInt("motion.StartState");
        oeiVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.Z0.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return irf.O(context, this.u) + "->" + irf.O(context, this.w) + " (pos:" + this.E + " Dpos/Dt:" + this.t;
    }

    public final void u(float f) {
        yei yeiVar = this.q;
        if (yeiVar == null) {
            return;
        }
        float f2 = this.E;
        float f3 = this.D;
        if (f2 != f3 && this.H) {
            this.E = f3;
        }
        float f4 = this.E;
        if (f4 == f) {
            return;
        }
        this.v0 = false;
        this.G = f;
        this.C = (yeiVar.c != null ? r3.h : yeiVar.j) / 1000.0f;
        setProgress(f);
        this.r = null;
        this.s = this.q.d();
        this.H = false;
        this.B = getNanoTime();
        this.I = true;
        this.D = f4;
        this.E = f4;
        invalidate();
    }

    public final void v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            gei geiVar = (gei) this.A.get(getChildAt(i));
            if (geiVar != null && "button".equals(irf.P(geiVar.b)) && geiVar.A != null) {
                int i2 = 0;
                while (true) {
                    lbf[] lbfVarArr = geiVar.A;
                    if (i2 < lbfVarArr.length) {
                        lbfVarArr[i2].g(geiVar.b, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z) {
        boolean z2;
        char c;
        qei qeiVar;
        int childCount;
        Interpolator interpolator;
        int i;
        float f;
        int i2;
        float f2;
        boolean z3;
        if (this.F == -1) {
            this.F = getNanoTime();
        }
        float f3 = this.E;
        float f4 = 0.0f;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.v = -1;
        }
        boolean z4 = false;
        if (this.G0 || (this.I && (z || this.G != f3))) {
            float signum = Math.signum(this.G - f3);
            long nanoTime = getNanoTime();
            lei leiVar = this.r;
            float f5 = leiVar == null ? (((nanoTime - this.F) * signum) * 1.0E-9f) / this.C : 0.0f;
            float f6 = this.E + f5;
            if (this.H) {
                f6 = this.G;
            }
            if ((signum <= 0.0f || f6 < this.G) && (signum > 0.0f || f6 > this.G)) {
                z2 = false;
            } else {
                f6 = this.G;
                this.I = false;
                z2 = true;
            }
            this.E = f6;
            this.D = f6;
            this.F = nanoTime;
            if (leiVar == null || z2) {
                this.t = f5;
            } else if (this.v0) {
                float interpolation = leiVar.getInterpolation((nanoTime - this.B) * 1.0E-9f);
                lei leiVar2 = this.r;
                dhr dhrVar = this.w0;
                c = leiVar2 == dhrVar ? dhrVar.c.b() ? (char) 2 : (char) 1 : (char) 0;
                this.E = interpolation;
                this.F = nanoTime;
                lei leiVar3 = this.r;
                if (leiVar3 != null) {
                    float a = leiVar3.a();
                    this.t = a;
                    if (Math.abs(a) * this.C <= 1.0E-5f && c == 2) {
                        this.I = false;
                    }
                    if (a > 0.0f && interpolation >= 1.0f) {
                        this.E = 1.0f;
                        this.I = false;
                        interpolation = 1.0f;
                    }
                    if (a < 0.0f && interpolation <= 0.0f) {
                        this.E = 0.0f;
                        this.I = false;
                        f6 = 0.0f;
                        if (Math.abs(this.t) > 1.0E-5f) {
                            setState(qei.c);
                        }
                        qeiVar = qei.d;
                        if (c != 1) {
                            if ((signum > 0.0f && f6 >= this.G) || (signum <= 0.0f && f6 <= this.G)) {
                                f6 = this.G;
                                this.I = false;
                            }
                            if (f6 >= 1.0f || f6 <= 0.0f) {
                                this.I = false;
                                setState(qeiVar);
                            }
                        }
                        childCount = getChildCount();
                        this.G0 = false;
                        long nanoTime2 = getNanoTime();
                        this.W0 = f6;
                        Interpolator interpolator2 = this.s;
                        float interpolation2 = interpolator2 == null ? f6 : interpolator2.getInterpolation(f6);
                        interpolator = this.s;
                        if (interpolator != null) {
                            float interpolation3 = interpolator.getInterpolation((signum / this.C) + f6);
                            this.t = interpolation3;
                            this.t = interpolation3 - this.s.getInterpolation(f6);
                        }
                        i = 0;
                        while (i < childCount) {
                            View childAt = getChildAt(i);
                            gei geiVar = (gei) this.A.get(childAt);
                            if (geiVar != null) {
                                f2 = f4;
                                this.G0 = geiVar.d(interpolation2, nanoTime2, this.X0, childAt) | this.G0;
                            } else {
                                f2 = f4;
                            }
                            i++;
                            f4 = f2;
                        }
                        f = f4;
                        boolean z5 = (signum <= 0.0f && f6 >= this.G) || (signum <= f && f6 <= this.G);
                        if (!this.G0 && !this.I && z5) {
                            setState(qeiVar);
                        }
                        if (this.P0) {
                            requestLayout();
                        }
                        this.G0 = (!z5) | this.G0;
                        if (f6 <= f && (i2 = this.u) != -1 && this.v != i2) {
                            this.v = i2;
                            this.q.b(i2).a(this);
                            setState(qeiVar);
                            z4 = true;
                        }
                        if (f6 >= 1.0d) {
                            int i3 = this.v;
                            int i4 = this.w;
                            if (i3 != i4) {
                                this.v = i4;
                                this.q.b(i4).a(this);
                                setState(qeiVar);
                                z4 = true;
                            }
                        }
                        if (!this.G0 || this.I) {
                            invalidate();
                        } else if ((signum > 0.0f && f6 == 1.0f) || (signum < f && f6 == f)) {
                            setState(qeiVar);
                        }
                        if (!this.G0 && !this.I && ((signum > 0.0f && f6 == 1.0f) || (signum < f && f6 == f))) {
                            C();
                        }
                    }
                }
                f6 = interpolation;
                if (Math.abs(this.t) > 1.0E-5f) {
                }
                qeiVar = qei.d;
                if (c != 1) {
                }
                childCount = getChildCount();
                this.G0 = false;
                long nanoTime22 = getNanoTime();
                this.W0 = f6;
                Interpolator interpolator22 = this.s;
                if (interpolator22 == null) {
                }
                interpolator = this.s;
                if (interpolator != null) {
                }
                i = 0;
                while (i < childCount) {
                }
                f = f4;
                if (signum <= 0.0f) {
                }
                if (!this.G0) {
                    setState(qeiVar);
                }
                if (this.P0) {
                }
                this.G0 = (!z5) | this.G0;
                if (f6 <= f) {
                    this.v = i2;
                    this.q.b(i2).a(this);
                    setState(qeiVar);
                    z4 = true;
                }
                if (f6 >= 1.0d) {
                }
                if (this.G0) {
                }
                invalidate();
                if (!this.G0) {
                    C();
                }
            } else {
                float interpolation4 = leiVar.getInterpolation(f6);
                lei leiVar4 = this.r;
                if (leiVar4 != null) {
                    this.t = leiVar4.a();
                } else {
                    this.t = ((leiVar4.getInterpolation(f6 + f5) - interpolation4) * signum) / f5;
                }
                f6 = interpolation4;
            }
            c = 0;
            if (Math.abs(this.t) > 1.0E-5f) {
            }
            qeiVar = qei.d;
            if (c != 1) {
            }
            childCount = getChildCount();
            this.G0 = false;
            long nanoTime222 = getNanoTime();
            this.W0 = f6;
            Interpolator interpolator222 = this.s;
            if (interpolator222 == null) {
            }
            interpolator = this.s;
            if (interpolator != null) {
            }
            i = 0;
            while (i < childCount) {
            }
            f = f4;
            if (signum <= 0.0f) {
            }
            if (!this.G0) {
            }
            if (this.P0) {
            }
            this.G0 = (!z5) | this.G0;
            if (f6 <= f) {
            }
            if (f6 >= 1.0d) {
            }
            if (this.G0) {
            }
            invalidate();
            if (!this.G0) {
            }
        } else {
            f = 0.0f;
        }
        float f7 = this.E;
        if (f7 < 1.0f) {
            if (f7 <= f) {
                int i5 = this.v;
                int i6 = this.u;
                z3 = i5 == i6 ? z4 : true;
                this.v = i6;
            }
            this.f1 |= z4;
            if (z4 && !this.Y0) {
                requestLayout();
            }
            this.D = this.E;
        }
        int i7 = this.v;
        int i8 = this.w;
        z3 = i7 == i8 ? z4 : true;
        this.v = i8;
        z4 = z3;
        this.f1 |= z4;
        if (z4) {
            requestLayout();
        }
        this.D = this.E;
    }

    public final void x() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        if ((this.J == null && ((copyOnWriteArrayList2 = this.J0) == null || copyOnWriteArrayList2.isEmpty())) || this.O0 == this.D) {
            return;
        }
        if (this.N0 != -1 && (copyOnWriteArrayList = this.J0) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((pei) it.next()).getClass();
            }
        }
        this.N0 = -1;
        this.O0 = this.D;
        pei peiVar = this.J;
        if (peiVar != null) {
            peiVar.getClass();
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.J0;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((pei) it2.next()).getClass();
            }
        }
    }

    public final void y() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.J != null || ((copyOnWriteArrayList = this.J0) != null && !copyOnWriteArrayList.isEmpty())) && this.N0 == -1) {
            this.N0 = this.v;
            ArrayList arrayList = this.j1;
            int intValue = !arrayList.isEmpty() ? ((Integer) vz1.m(arrayList, 1)).intValue() : -1;
            int i = this.v;
            if (intValue != i && i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        D();
        xlr xlrVar = this.a1;
        if (xlrVar != null) {
            xlrVar.run();
            this.a1 = null;
        }
    }

    public final void z(int i, float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        View i2 = i(i);
        gei geiVar = (gei) this.A.get(i2);
        if (geiVar == null) {
            Log.w("MotionLayout", "WARNING could not find view id " + (i2 == null ? k5r.i(i, "") : i2.getContext().getResources().getResourceName(i)));
            return;
        }
        sei seiVar = geiVar.f;
        float[] fArr2 = geiVar.v;
        float a = geiVar.a(f, fArr2);
        lg3[] lg3VarArr = geiVar.j;
        int i3 = 0;
        if (lg3VarArr != null) {
            double d = a;
            lg3VarArr[0].k0(d, geiVar.q);
            geiVar.j[0].i0(d, geiVar.p);
            float f4 = fArr2[0];
            while (true) {
                dArr = geiVar.q;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] * f4;
                i3++;
            }
            ex0 ex0Var = geiVar.k;
            if (ex0Var != null) {
                double[] dArr2 = geiVar.p;
                if (dArr2.length > 0) {
                    ex0Var.i0(d, dArr2);
                    geiVar.k.k0(d, geiVar.q);
                    int[] iArr = geiVar.o;
                    double[] dArr3 = geiVar.q;
                    double[] dArr4 = geiVar.p;
                    seiVar.getClass();
                    sei.e(f2, f3, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = geiVar.o;
                double[] dArr5 = geiVar.p;
                seiVar.getClass();
                sei.e(f2, f3, fArr, iArr2, dArr, dArr5);
            }
        } else {
            sei seiVar2 = geiVar.g;
            float f5 = seiVar2.e - seiVar.e;
            float f6 = seiVar2.f - seiVar.f;
            float f7 = seiVar2.g - seiVar.g;
            float f8 = (seiVar2.h - seiVar.h) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
        }
        i2.getY();
    }

    public rei(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.v0 = false;
        this.w0 = new dhr();
        this.x0 = new mei(this);
        this.B0 = false;
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = 0;
        this.L0 = -1L;
        this.M0 = 0.0f;
        this.N0 = 0;
        this.O0 = 0.0f;
        this.P0 = false;
        this.X0 = new n7b(9);
        this.Y0 = false;
        this.a1 = null;
        new HashMap();
        this.b1 = new Rect();
        this.c1 = false;
        this.d1 = qei.a;
        this.e1 = new eg0(this);
        this.f1 = false;
        this.g1 = new RectF();
        this.h1 = null;
        this.i1 = null;
        this.j1 = new ArrayList();
        B(attributeSet);
    }

    public rei(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.C = 1.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.G = 0.0f;
        this.I = false;
        this.K = 0;
        this.v0 = false;
        this.w0 = new dhr();
        this.x0 = new mei(this);
        this.B0 = false;
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = 0;
        this.L0 = -1L;
        this.M0 = 0.0f;
        this.N0 = 0;
        this.O0 = 0.0f;
        this.P0 = false;
        this.X0 = new n7b(9);
        this.Y0 = false;
        this.a1 = null;
        new HashMap();
        this.b1 = new Rect();
        this.c1 = false;
        this.d1 = qei.a;
        this.e1 = new eg0(this);
        this.f1 = false;
        this.g1 = new RectF();
        this.h1 = null;
        this.i1 = null;
        this.j1 = new ArrayList();
        B(attributeSet);
    }

    public void setTransition(xei xeiVar) {
        wps wpsVar;
        yei yeiVar = this.q;
        yeiVar.c = xeiVar;
        if (xeiVar != null && (wpsVar = xeiVar.l) != null) {
            wpsVar.c(yeiVar.p);
        }
        setState(qei.b);
        int i = this.v;
        xei xeiVar2 = this.q.c;
        if (i == (xeiVar2 == null ? -1 : xeiVar2.c)) {
            this.E = 1.0f;
            this.D = 1.0f;
            this.G = 1.0f;
        } else {
            this.E = 0.0f;
            this.D = 0.0f;
            this.G = 0.0f;
        }
        this.F = (xeiVar.r & 1) != 0 ? -1L : getNanoTime();
        int g = this.q.g();
        yei yeiVar2 = this.q;
        xei xeiVar3 = yeiVar2.c;
        int i2 = xeiVar3 != null ? xeiVar3.c : -1;
        if (g == this.u && i2 == this.w) {
            return;
        }
        this.u = g;
        this.w = i2;
        yeiVar2.m(g, i2);
        f96 b = this.q.b(this.u);
        f96 b2 = this.q.b(this.w);
        eg0 eg0Var = this.e1;
        eg0Var.g(b, b2);
        int i3 = this.u;
        int i4 = this.w;
        eg0Var.a = i3;
        eg0Var.b = i4;
        eg0Var.h();
        E();
    }

    @Override // defpackage.myi
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
