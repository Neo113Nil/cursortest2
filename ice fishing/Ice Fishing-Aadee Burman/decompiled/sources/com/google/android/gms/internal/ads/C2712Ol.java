package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import g.AbstractC4518a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.AbstractC4694j0;
import m.C4710s;

/* renamed from: com.google.android.gms.internal.ads.Ol, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2712Ol {

    /* renamed from: a, reason: collision with root package name */
    public int f26650a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26651b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26652c;

    /* renamed from: d, reason: collision with root package name */
    public Object f26653d;

    /* renamed from: e, reason: collision with root package name */
    public Object f26654e;

    /* renamed from: f, reason: collision with root package name */
    public Object f26655f;

    public C2712Ol(Looper looper, Looper looper2, V2 v22, MN mn) {
        this.f26651b = v22.x(looper, null);
        this.f26652c = v22.x(looper2, null);
        this.f26654e = 0;
        this.f26655f = 0;
        this.f26653d = mn;
    }

    public void a() {
        View view = (View) this.f26651b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((i8.h) this.f26653d) != null) {
                if (((i8.h) this.f26655f) == null) {
                    this.f26655f = new i8.h();
                }
                i8.h hVar = (i8.h) this.f26655f;
                hVar.f38124c = null;
                hVar.f38123b = false;
                hVar.f38125d = null;
                hVar.f38122a = false;
                WeakHashMap weakHashMap = O.X.f2054a;
                ColorStateList g4 = O.L.g(view);
                if (g4 != null) {
                    hVar.f38123b = true;
                    hVar.f38124c = g4;
                }
                PorterDuff.Mode h9 = O.L.h(view);
                if (h9 != null) {
                    hVar.f38122a = true;
                    hVar.f38125d = h9;
                }
                if (hVar.f38123b || hVar.f38122a) {
                    C4710s.e(background, hVar, view.getDrawableState());
                    return;
                }
            }
            i8.h hVar2 = (i8.h) this.f26654e;
            if (hVar2 != null) {
                C4710s.e(background, hVar2, view.getDrawableState());
                return;
            }
            i8.h hVar3 = (i8.h) this.f26653d;
            if (hVar3 != null) {
                C4710s.e(background, hVar3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        i8.h hVar = (i8.h) this.f26654e;
        if (hVar != null) {
            return (ColorStateList) hVar.f38124c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        i8.h hVar = (i8.h) this.f26654e;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f38125d;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList f3;
        View view = (View) this.f26651b;
        Context context = view.getContext();
        int[] iArr = AbstractC4518a.f37612z;
        j4.g s9 = j4.g.s(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) s9.f38405v;
        View view2 = (View) this.f26651b;
        O.X.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) s9.f38405v, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f26650a = typedArray.getResourceId(0, -1);
                C4710s c4710s = (C4710s) this.f26652c;
                Context context2 = view.getContext();
                int i6 = this.f26650a;
                synchronized (c4710s) {
                    f3 = c4710s.f39223a.f(context2, i6);
                }
                if (f3 != null) {
                    g(f3);
                }
            }
            if (typedArray.hasValue(1)) {
                O.L.q(view, s9.h(1));
            }
            if (typedArray.hasValue(2)) {
                O.L.r(view, AbstractC4694j0.b(typedArray.getInt(2, -1), null));
            }
            s9.t();
        } catch (Throwable th) {
            s9.t();
            throw th;
        }
    }

    public void e() {
        this.f26650a = -1;
        g(null);
        a();
    }

    public void f(int i) {
        ColorStateList colorStateList;
        this.f26650a = i;
        C4710s c4710s = (C4710s) this.f26652c;
        if (c4710s != null) {
            Context context = ((View) this.f26651b).getContext();
            synchronized (c4710s) {
                colorStateList = c4710s.f39223a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((i8.h) this.f26653d) == null) {
                this.f26653d = new i8.h();
            }
            i8.h hVar = (i8.h) this.f26653d;
            hVar.f38124c = colorStateList;
            hVar.f38123b = true;
        } else {
            this.f26653d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (((i8.h) this.f26654e) == null) {
            this.f26654e = new i8.h();
        }
        i8.h hVar = (i8.h) this.f26654e;
        hVar.f38124c = colorStateList;
        hVar.f38123b = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (((i8.h) this.f26654e) == null) {
            this.f26654e = new i8.h();
        }
        i8.h hVar = (i8.h) this.f26654e;
        hVar.f38125d = mode;
        hVar.f38122a = true;
        a();
    }

    public void j(int i) {
        AbstractC2772Sd.H(i >= 0);
        this.f26650a = i;
        l(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r8 < r0.f35132u) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(long j6, Cr cr) {
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            int i = this.f26650a;
            if (i != 0) {
                PriorityQueue priorityQueue = (PriorityQueue) this.f26654e;
                if (i != -1 && priorityQueue.size() >= this.f26650a) {
                    C4201yC c4201yC = (C4201yC) priorityQueue.peek();
                    String str = AbstractC3159eu.f29993a;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f26652c;
                Cr cr2 = arrayDeque.isEmpty() ? new Cr() : (Cr) arrayDeque.pop();
                cr2.y(cr.B());
                System.arraycopy(cr.f24252a, cr.f24253b, cr2.f24252a, 0, cr2.B());
                C4201yC c4201yC2 = (C4201yC) this.f26655f;
                if (c4201yC2 != null && j6 == c4201yC2.f35132u) {
                    c4201yC2.f35131n.add(cr2);
                    return;
                }
                ArrayDeque arrayDeque2 = (ArrayDeque) this.f26653d;
                C4201yC c4201yC3 = arrayDeque2.isEmpty() ? new C4201yC() : (C4201yC) arrayDeque2.pop();
                ArrayList arrayList = c4201yC3.f35131n;
                AbstractC2772Sd.H(arrayList.isEmpty());
                c4201yC3.f35132u = j6;
                arrayList.add(cr2);
                priorityQueue.add(c4201yC3);
                this.f26655f = c4201yC3;
                int i6 = this.f26650a;
                if (i6 != -1) {
                    l(i6);
                    return;
                }
                return;
            }
        } else {
            j6 = -9223372036854775807L;
        }
        ((OC) this.f26651b).g(j6, cr);
    }

    public void l(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f26654e;
            if (priorityQueue.size() <= i) {
                return;
            }
            C4201yC c4201yC = (C4201yC) priorityQueue.poll();
            String str = AbstractC3159eu.f29993a;
            int i6 = 0;
            while (true) {
                arrayList = c4201yC.f35131n;
                if (i6 >= arrayList.size()) {
                    break;
                }
                ((OC) this.f26651b).g(c4201yC.f35132u, (Cr) arrayList.get(i6));
                ((ArrayDeque) this.f26652c).push((Cr) arrayList.get(i6));
                i6++;
            }
            arrayList.clear();
            C4201yC c4201yC2 = (C4201yC) this.f26655f;
            if (c4201yC2 != null && c4201yC2.f35132u == c4201yC.f35132u) {
                this.f26655f = null;
            }
            ((ArrayDeque) this.f26653d).push(c4201yC);
        }
    }

    public void m(Object obj) {
        Object obj2 = this.f26654e;
        this.f26654e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        MN mn = (MN) this.f26653d;
        mn.getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        PN pn = mn.f26292n;
        pn.P0();
        pn.h2(1, 10, num);
        pn.h2(2, 10, num);
        XJ xj = new XJ(intValue);
        C3530lp c3530lp = pn.f26776G;
        c3530lp.c(21, xj);
        c3530lp.d();
    }

    public C2712Ol(OC oc) {
        this.f26651b = oc;
        this.f26652c = new ArrayDeque();
        this.f26653d = new ArrayDeque();
        this.f26654e = new PriorityQueue();
        this.f26650a = -1;
    }

    public C2712Ol(View view) {
        this.f26650a = -1;
        this.f26651b = view;
        this.f26652c = C4710s.a();
    }
}
