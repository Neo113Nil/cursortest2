package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import g.AbstractC4528a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.AbstractC4707j0;
import m.C4723s;

/* renamed from: com.google.android.gms.internal.ads.Pl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2749Pl {

    /* renamed from: a, reason: collision with root package name */
    public int f27642a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27643b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27644c;

    /* renamed from: d, reason: collision with root package name */
    public Object f27645d;

    /* renamed from: e, reason: collision with root package name */
    public Object f27646e;

    /* renamed from: f, reason: collision with root package name */
    public Object f27647f;

    public C2749Pl(Looper looper, Looper looper2, V2 v22, MN mn) {
        this.f27643b = v22.x(looper, null);
        this.f27644c = v22.x(looper2, null);
        this.f27646e = 0;
        this.f27647f = 0;
        this.f27645d = mn;
    }

    public void a() {
        View view = (View) this.f27643b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((i8.h) this.f27645d) != null) {
                if (((i8.h) this.f27647f) == null) {
                    this.f27647f = new i8.h();
                }
                i8.h hVar = (i8.h) this.f27647f;
                hVar.f38243c = null;
                hVar.f38242b = false;
                hVar.f38244d = null;
                hVar.f38241a = false;
                WeakHashMap weakHashMap = O.X.f2142a;
                ColorStateList g9 = O.L.g(view);
                if (g9 != null) {
                    hVar.f38242b = true;
                    hVar.f38243c = g9;
                }
                PorterDuff.Mode h3 = O.L.h(view);
                if (h3 != null) {
                    hVar.f38241a = true;
                    hVar.f38244d = h3;
                }
                if (hVar.f38242b || hVar.f38241a) {
                    C4723s.e(background, hVar, view.getDrawableState());
                    return;
                }
            }
            i8.h hVar2 = (i8.h) this.f27646e;
            if (hVar2 != null) {
                C4723s.e(background, hVar2, view.getDrawableState());
                return;
            }
            i8.h hVar3 = (i8.h) this.f27645d;
            if (hVar3 != null) {
                C4723s.e(background, hVar3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        i8.h hVar = (i8.h) this.f27646e;
        if (hVar != null) {
            return (ColorStateList) hVar.f38243c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        i8.h hVar = (i8.h) this.f27646e;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f38244d;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = (View) this.f27643b;
        Context context = view.getContext();
        int[] iArr = AbstractC4528a.f37574z;
        l4.g s9 = l4.g.s(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) s9.f38917v;
        View view2 = (View) this.f27643b;
        O.X.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) s9.f38917v, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f27642a = typedArray.getResourceId(0, -1);
                C4723s c4723s = (C4723s) this.f27644c;
                Context context2 = view.getContext();
                int i4 = this.f27642a;
                synchronized (c4723s) {
                    f2 = c4723s.f39292a.f(context2, i4);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                O.L.q(view, s9.h(1));
            }
            if (typedArray.hasValue(2)) {
                O.L.r(view, AbstractC4707j0.b(typedArray.getInt(2, -1), null));
            }
            s9.t();
        } catch (Throwable th) {
            s9.t();
            throw th;
        }
    }

    public void e() {
        this.f27642a = -1;
        g(null);
        a();
    }

    public void f(int i) {
        ColorStateList colorStateList;
        this.f27642a = i;
        C4723s c4723s = (C4723s) this.f27644c;
        if (c4723s != null) {
            Context context = ((View) this.f27643b).getContext();
            synchronized (c4723s) {
                colorStateList = c4723s.f39292a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((i8.h) this.f27645d) == null) {
                this.f27645d = new i8.h();
            }
            i8.h hVar = (i8.h) this.f27645d;
            hVar.f38243c = colorStateList;
            hVar.f38242b = true;
        } else {
            this.f27645d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (((i8.h) this.f27646e) == null) {
            this.f27646e = new i8.h();
        }
        i8.h hVar = (i8.h) this.f27646e;
        hVar.f38243c = colorStateList;
        hVar.f38242b = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (((i8.h) this.f27646e) == null) {
            this.f27646e = new i8.h();
        }
        i8.h hVar = (i8.h) this.f27646e;
        hVar.f38244d = mode;
        hVar.f38241a = true;
        a();
    }

    public void j(int i) {
        AbstractC2792Sd.H(i >= 0);
        this.f27642a = i;
        l(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r8 < r0.f35918u) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(long j6, Cr cr) {
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            int i = this.f27642a;
            if (i != 0) {
                PriorityQueue priorityQueue = (PriorityQueue) this.f27646e;
                if (i != -1 && priorityQueue.size() >= this.f27642a) {
                    C4224yC c4224yC = (C4224yC) priorityQueue.peek();
                    String str = AbstractC3182eu.f30782a;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f27644c;
                Cr cr2 = arrayDeque.isEmpty() ? new Cr() : (Cr) arrayDeque.pop();
                cr2.y(cr.B());
                System.arraycopy(cr.f24997a, cr.f24998b, cr2.f24997a, 0, cr2.B());
                C4224yC c4224yC2 = (C4224yC) this.f27647f;
                if (c4224yC2 != null && j6 == c4224yC2.f35918u) {
                    c4224yC2.f35917n.add(cr2);
                    return;
                }
                ArrayDeque arrayDeque2 = (ArrayDeque) this.f27645d;
                C4224yC c4224yC3 = arrayDeque2.isEmpty() ? new C4224yC() : (C4224yC) arrayDeque2.pop();
                ArrayList arrayList = c4224yC3.f35917n;
                AbstractC2792Sd.H(arrayList.isEmpty());
                c4224yC3.f35918u = j6;
                arrayList.add(cr2);
                priorityQueue.add(c4224yC3);
                this.f27647f = c4224yC3;
                int i4 = this.f27642a;
                if (i4 != -1) {
                    l(i4);
                    return;
                }
                return;
            }
        } else {
            j6 = -9223372036854775807L;
        }
        ((OC) this.f27643b).g(j6, cr);
    }

    public void l(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f27646e;
            if (priorityQueue.size() <= i) {
                return;
            }
            C4224yC c4224yC = (C4224yC) priorityQueue.poll();
            String str = AbstractC3182eu.f30782a;
            int i4 = 0;
            while (true) {
                arrayList = c4224yC.f35917n;
                if (i4 >= arrayList.size()) {
                    break;
                }
                ((OC) this.f27643b).g(c4224yC.f35918u, (Cr) arrayList.get(i4));
                ((ArrayDeque) this.f27644c).push((Cr) arrayList.get(i4));
                i4++;
            }
            arrayList.clear();
            C4224yC c4224yC2 = (C4224yC) this.f27647f;
            if (c4224yC2 != null && c4224yC2.f35918u == c4224yC.f35918u) {
                this.f27647f = null;
            }
            ((ArrayDeque) this.f27645d).push(c4224yC);
        }
    }

    public void m(Object obj) {
        Object obj2 = this.f27646e;
        this.f27646e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        MN mn = (MN) this.f27645d;
        mn.getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        PN pn = mn.f27083n;
        pn.O0();
        pn.h2(1, 10, num);
        pn.h2(2, 10, num);
        XJ xj = new XJ(intValue);
        C3553lp c3553lp = pn.f27555G;
        c3553lp.c(21, xj);
        c3553lp.d();
    }

    public C2749Pl(OC oc) {
        this.f27643b = oc;
        this.f27644c = new ArrayDeque();
        this.f27645d = new ArrayDeque();
        this.f27646e = new PriorityQueue();
        this.f27642a = -1;
    }

    public C2749Pl(View view) {
        this.f27642a = -1;
        this.f27643b = view;
        this.f27644c = C4723s.a();
    }
}
