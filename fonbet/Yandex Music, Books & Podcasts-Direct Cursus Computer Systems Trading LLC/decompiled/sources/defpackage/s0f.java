package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0f extends won implements apn {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final n8n m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public r0f y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public opn c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final dsd s = new dsd(3, this);
    public View w = null;
    public final o0f z = new o0f(this);

    public s0f(n8n n8nVar) {
        this.m = n8nVar;
    }

    public static boolean o(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.apn
    public final void a(View view) {
        if (view == this.w) {
            this.w = null;
        }
        opn a0 = this.r.a0(view);
        if (a0 == null) {
            return;
        }
        opn opnVar = this.c;
        if (opnVar != null && a0 == opnVar) {
            q(null, 0);
            return;
        }
        l(a0, false);
        if (this.a.remove(a0.a)) {
            this.m.d(this.r, a0);
        }
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        rect.setEmpty();
    }

    @Override // defpackage.won
    public final void g(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        opn opnVar = this.c;
        n8n n8nVar = this.m;
        n8nVar.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p0f p0fVar = (p0f) arrayList.get(i);
            opn opnVar2 = p0fVar.e;
            float f4 = p0fVar.a;
            float f5 = p0fVar.c;
            if (f4 == f5) {
                p0fVar.i = opnVar2.a.getTranslationX();
            } else {
                p0fVar.i = su4.e(f5, f4, p0fVar.m, f4);
            }
            float f6 = p0fVar.b;
            float f7 = p0fVar.d;
            if (f6 == f7) {
                p0fVar.j = opnVar2.a.getTranslationY();
            } else {
                p0fVar.j = su4.e(f7, f6, p0fVar.m, f6);
            }
            int save = canvas.save();
            n8nVar.q(canvas, recyclerView, p0fVar.e, p0fVar.i, p0fVar.j, false);
            canvas.restoreToCount(save);
        }
        if (opnVar != null) {
            int save2 = canvas.save();
            n8nVar.q(canvas, recyclerView, opnVar, f2, f, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.won
    public final void h(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        opn opnVar = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p0f p0fVar = (p0f) arrayList.get(i);
            int save = canvas.save();
            View view = p0fVar.e.a;
            canvas.restoreToCount(save);
        }
        if (opnVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            p0f p0fVar2 = (p0f) arrayList.get(i2);
            boolean z2 = p0fVar2.l;
            if (z2 && !p0fVar2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final int i(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        n8n n8nVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            n8nVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.r.getWidth();
        n8nVar.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.h) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void j(int i, int i2, MotionEvent motionEvent) {
        View m;
        if (this.c == null && i == 2 && this.n != 2) {
            n8n n8nVar = this.m;
            p8n p8nVar = (p8n) n8nVar.e;
            if (!p8nVar.g || p8nVar.f.size() <= 1 || this.r.getScrollState() == 1) {
                return;
            }
            yon layoutManager = this.r.getLayoutManager();
            int i3 = this.l;
            opn opnVar = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(findPointerIndex) - this.d;
                float y = motionEvent.getY(findPointerIndex) - this.e;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                float f = this.q;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.x()) && ((abs2 <= abs || !layoutManager.y()) && (m = m(motionEvent)) != null))) {
                    opnVar = this.r.a0(m);
                }
            }
            if (opnVar == null) {
                return;
            }
            RecyclerView recyclerView = this.r;
            n8nVar.getClass();
            int e = (n8n.e(200723, recyclerView.getLayoutDirection()) & 65280) >> 8;
            if (e == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.d;
            float f3 = y2 - this.e;
            float abs3 = Math.abs(f2);
            float abs4 = Math.abs(f3);
            float f4 = this.q;
            if (abs3 >= f4 || abs4 >= f4) {
                if (abs3 > abs4) {
                    if (f2 < 0.0f && (e & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (e & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (e & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (e & 2) == 0) {
                        return;
                    }
                }
                this.i = 0.0f;
                this.h = 0.0f;
                this.l = motionEvent.getPointerId(0);
                q(opnVar, 1);
            }
        }
    }

    public final int k(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        n8n n8nVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            n8nVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.r.getHeight();
        n8nVar.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.i) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void l(opn opnVar, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p0f p0fVar = (p0f) arrayList.get(size);
            if (p0fVar.e == opnVar) {
                p0fVar.k |= z;
                if (!p0fVar.l) {
                    p0fVar.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        opn opnVar = this.c;
        if (opnVar != null) {
            View view = opnVar.a;
            if (o(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p0f p0fVar = (p0f) arrayList.get(size);
            View view2 = p0fVar.e.a;
            if (o(view2, x, y, p0fVar.i, p0fVar.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        for (int l = recyclerView.f.l() - 1; l >= 0; l--) {
            View k = recyclerView.f.k(l);
            float translationX = k.getTranslationX();
            float translationY = k.getTranslationY();
            if (x >= k.getLeft() + translationX && x <= k.getRight() + translationX && y >= k.getTop() + translationY && y <= k.getBottom() + translationY) {
                return k;
            }
        }
        return null;
    }

    public final void n(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void p(opn opnVar) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        int i3;
        if (!this.r.isLayoutRequested() && this.n == 2) {
            n8n n8nVar = this.m;
            n8nVar.getClass();
            int i4 = (int) (this.j + this.h);
            int i5 = (int) (this.k + this.i);
            View view = opnVar.a;
            if (Math.abs(i5 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i4 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList = this.u;
                if (arrayList == null) {
                    this.u = new ArrayList();
                    this.v = new ArrayList();
                } else {
                    arrayList.clear();
                    this.v.clear();
                }
                int round = Math.round(this.j + this.h);
                int round2 = Math.round(this.k + this.i);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                yon layoutManager = this.r.getLayoutManager();
                int Q = layoutManager.Q();
                int i8 = 0;
                while (i8 < Q) {
                    View P = layoutManager.P(i8);
                    if (P == view) {
                        i = i8;
                    } else {
                        i = i8;
                        if (P.getBottom() >= round2 && P.getTop() <= height && P.getRight() >= round && P.getLeft() <= width) {
                            opn a0 = this.r.a0(P);
                            int abs5 = Math.abs(i6 - ((P.getRight() + P.getLeft()) / 2));
                            int abs6 = Math.abs(i7 - ((P.getBottom() + P.getTop()) / 2));
                            int i9 = (abs6 * abs6) + (abs5 * abs5);
                            i2 = i4;
                            int size = this.u.size();
                            i3 = i5;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < size) {
                                int i12 = size;
                                if (i9 <= ((Integer) this.v.get(i10)).intValue()) {
                                    break;
                                }
                                i11++;
                                i10++;
                                size = i12;
                            }
                            this.u.add(i11, a0);
                            this.v.add(i11, Integer.valueOf(i9));
                            i8 = i + 1;
                            i4 = i2;
                            i5 = i3;
                        }
                    }
                    i2 = i4;
                    i3 = i5;
                    i8 = i + 1;
                    i4 = i2;
                    i5 = i3;
                }
                int i13 = i4;
                int i14 = i5;
                ArrayList arrayList2 = this.u;
                if (arrayList2.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i13;
                int height2 = view.getHeight() + i14;
                int left2 = i13 - view.getLeft();
                int top2 = i14 - view.getTop();
                int size2 = arrayList2.size();
                opn opnVar2 = null;
                int i15 = -1;
                for (int i16 = 0; i16 < size2; i16++) {
                    opn opnVar3 = (opn) arrayList2.get(i16);
                    if (left2 > 0 && (right = opnVar3.a.getRight() - width2) < 0 && opnVar3.a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i15) {
                        i15 = abs4;
                        opnVar2 = opnVar3;
                    }
                    if (left2 < 0 && (left = opnVar3.a.getLeft() - i13) > 0 && opnVar3.a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i15) {
                        i15 = abs3;
                        opnVar2 = opnVar3;
                    }
                    if (top2 < 0 && (top = opnVar3.a.getTop() - i14) > 0 && opnVar3.a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i15) {
                        i15 = abs2;
                        opnVar2 = opnVar3;
                    }
                    if (top2 > 0 && (bottom = opnVar3.a.getBottom() - height2) < 0 && opnVar3.a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i15) {
                        i15 = abs;
                        opnVar2 = opnVar3;
                    }
                }
                if (opnVar2 == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                View view2 = opnVar2.a;
                int b = opnVar2.b();
                opnVar.b();
                this.r.getClass();
                p8n p8nVar = (p8n) n8nVar.e;
                p8nVar.h = true;
                int c = opnVar.c();
                int c2 = opnVar2.c();
                if (n8nVar.c == -1) {
                    n8nVar.c = c;
                }
                p8n.v(p8nVar, c, c2);
                n8nVar.d = c2;
                RecyclerView recyclerView = this.r;
                yon layoutManager2 = recyclerView.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    if (layoutManager2.x()) {
                        if (yon.V(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.z0(b);
                        }
                        if (yon.Y(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.z0(b);
                        }
                    }
                    if (layoutManager2.y()) {
                        if (yon.Z(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.z0(b);
                        }
                        if (yon.T(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.z0(b);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                linearLayoutManager.v("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.m1();
                linearLayoutManager.G1();
                int f0 = yon.f0(view);
                int f02 = yon.f0(view2);
                char c3 = f0 < f02 ? (char) 1 : (char) 65535;
                boolean z = linearLayoutManager.u;
                gc9 gc9Var = linearLayoutManager.r;
                if (z) {
                    if (c3 == 1) {
                        linearLayoutManager.I1(f02, gc9Var.g() - (linearLayoutManager.r.c(view) + linearLayoutManager.r.e(view2)));
                        return;
                    } else {
                        linearLayoutManager.I1(f02, gc9Var.g() - linearLayoutManager.r.b(view2));
                        return;
                    }
                }
                if (c3 == 65535) {
                    linearLayoutManager.I1(f02, gc9Var.e(view2));
                } else {
                    linearLayoutManager.I1(f02, gc9Var.b(view2) - linearLayoutManager.r.c(view));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0091, code lost:
    
        if (r0 > 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(opn opnVar, int i) {
        n8n n8nVar;
        boolean z;
        xdr xdrVar;
        xdr xdrVar2;
        opn opnVar2;
        int k;
        int i2;
        float signum;
        if (opnVar == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i3 = this.n;
        l(opnVar, true);
        this.n = i;
        if (i == 2) {
            if (opnVar == null) {
                xq0.x("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = opnVar.a;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        opn opnVar3 = this.c;
        n8n n8nVar2 = this.m;
        boolean z2 = false;
        if (opnVar3 != null) {
            View view = opnVar3.a;
            if (view.getParent() != null) {
                if (i3 == 2) {
                    i2 = 0;
                } else {
                    if (this.n != 2) {
                        n8nVar2.getClass();
                        int e = (n8n.e(200723, this.r.getLayoutDirection()) & 65280) >> 8;
                        if (e != 0) {
                            if (Math.abs(this.h) > Math.abs(this.i)) {
                                k = i(e);
                                if (k <= 0) {
                                    k = k(e);
                                } else if ((16 & k) == 0) {
                                    k = n8n.f(k, this.r.getLayoutDirection());
                                }
                                i2 = k;
                            } else {
                                k = k(e);
                                if (k <= 0) {
                                    k = i(e);
                                    if (k > 0) {
                                        if ((16 & k) == 0) {
                                            k = n8n.f(k, this.r.getLayoutDirection());
                                        }
                                    }
                                }
                                i2 = k;
                            }
                        }
                    }
                    k = 0;
                    i2 = k;
                }
                VelocityTracker velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
                float f = 0.0f;
                if (i2 == 1 || i2 == 2) {
                    signum = Math.signum(this.i) * this.r.getHeight();
                } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                    f = Math.signum(this.h) * this.r.getWidth();
                    signum = 0.0f;
                } else {
                    signum = 0.0f;
                }
                char c = i3 == 2 ? '\b' : i2 > 0 ? (char) 2 : (char) 4;
                float[] fArr = this.b;
                n(fArr);
                char c2 = c;
                z = false;
                p0f p0fVar = new p0f(this, opnVar3, i3, fArr[0], fArr[1], f, signum, i2, opnVar3);
                RecyclerView recyclerView = this.r;
                n8nVar2.getClass();
                von itemAnimator = recyclerView.getItemAnimator();
                long j = itemAnimator == null ? c2 == '\b' ? 200L : 250L : c2 == '\b' ? itemAnimator.e : itemAnimator.d;
                ValueAnimator valueAnimator = p0fVar.g;
                valueAnimator.setDuration(j);
                this.p.add(p0fVar);
                opnVar3.q(false);
                valueAnimator.start();
                n8nVar = n8nVar2;
                opnVar2 = null;
                z2 = true;
            } else {
                z = false;
                if (view == this.w) {
                    opnVar2 = null;
                    this.w = null;
                } else {
                    opnVar2 = null;
                }
                n8nVar = n8nVar2;
                n8nVar.d(this.r, opnVar3);
                z2 = false;
            }
            this.c = opnVar2;
        } else {
            n8nVar = n8nVar2;
            z = false;
        }
        if (opnVar != null) {
            View view2 = opnVar.a;
            RecyclerView recyclerView2 = this.r;
            n8nVar.getClass();
            this.o = (n8n.e(200723, recyclerView2.getLayoutDirection()) & i4) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = opnVar;
            if (i == 2) {
                view2.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.r.getParent();
        if (parent != null) {
            if (this.c != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.r.getLayoutManager().f = true;
        }
        opn opnVar4 = this.c;
        p8n p8nVar = (p8n) n8nVar.e;
        l8n l8nVar = p8nVar.n;
        if (l8nVar != null && (xdrVar2 = l8nVar.v) != null) {
            xdrVar2.m(null, Boolean.FALSE);
        }
        l8n l8nVar2 = opnVar4 instanceof l8n ? (l8n) opnVar4 : null;
        if (l8nVar2 != null && (xdrVar = l8nVar2.v) != null) {
            xdrVar.m(null, Boolean.TRUE);
        }
        p8nVar.n = (l8n) opnVar4;
        this.r.invalidate();
    }

    public final void r(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.h = f;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // defpackage.apn
    public final void b(View view) {
    }
}
