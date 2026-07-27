package t0;

import O.C0344t;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5013h extends AbstractC5031z {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f40675s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40676g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f40677h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f40678j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f40679k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f40680l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f40681m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f40682n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f40683o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f40684p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f40685q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f40686r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC5003S) arrayList.get(size)).f40590a.animate().cancel();
        }
    }

    @Override // t0.AbstractC5031z
    public final boolean a(AbstractC5003S abstractC5003S, AbstractC5003S abstractC5003S2, C0344t c0344t, C0344t c0344t2) {
        int i;
        int i6;
        int i9 = c0344t.f2133a;
        int i10 = c0344t.f2134b;
        if (abstractC5003S2.o()) {
            int i11 = c0344t.f2133a;
            i6 = c0344t.f2134b;
            i = i11;
        } else {
            i = c0344t2.f2133a;
            i6 = c0344t2.f2134b;
        }
        if (abstractC5003S == abstractC5003S2) {
            return g(abstractC5003S, i9, i10, i, i6);
        }
        View view = abstractC5003S.f40590a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(abstractC5003S);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(abstractC5003S2);
        float f3 = -((int) ((i - i9) - translationX));
        View view2 = abstractC5003S2.f40590a;
        view2.setTranslationX(f3);
        view2.setTranslationY(-((int) ((i6 - i10) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f40679k;
        C5011f c5011f = new C5011f();
        c5011f.f40664a = abstractC5003S;
        c5011f.f40665b = abstractC5003S2;
        c5011f.f40666c = i9;
        c5011f.f40667d = i10;
        c5011f.f40668e = i;
        c5011f.f40669f = i6;
        arrayList.add(c5011f);
        return true;
    }

    @Override // t0.AbstractC5031z
    public final void d(AbstractC5003S abstractC5003S) {
        View view = abstractC5003S.f40590a;
        view.animate().cancel();
        ArrayList arrayList = this.f40678j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C5012g) arrayList.get(size)).f40670a == abstractC5003S) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(abstractC5003S);
                arrayList.remove(size);
            }
        }
        j(this.f40679k, abstractC5003S);
        if (this.f40677h.remove(abstractC5003S)) {
            view.setAlpha(1.0f);
            c(abstractC5003S);
        }
        if (this.i.remove(abstractC5003S)) {
            view.setAlpha(1.0f);
            c(abstractC5003S);
        }
        ArrayList arrayList2 = this.f40682n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, abstractC5003S);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f40681m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C5012g) arrayList5.get(size4)).f40670a == abstractC5003S) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(abstractC5003S);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f40680l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC5003S)) {
                view.setAlpha(1.0f);
                c(abstractC5003S);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f40685q.remove(abstractC5003S);
        this.f40683o.remove(abstractC5003S);
        this.f40686r.remove(abstractC5003S);
        this.f40684p.remove(abstractC5003S);
        i();
    }

    @Override // t0.AbstractC5031z
    public final void e() {
        ArrayList arrayList = this.f40678j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C5012g c5012g = (C5012g) arrayList.get(size);
            View view = c5012g.f40670a.f40590a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c5012g.f40670a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f40677h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((AbstractC5003S) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC5003S abstractC5003S = (AbstractC5003S) arrayList3.get(size3);
            abstractC5003S.f40590a.setAlpha(1.0f);
            c(abstractC5003S);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f40679k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C5011f c5011f = (C5011f) arrayList4.get(size4);
            AbstractC5003S abstractC5003S2 = c5011f.f40664a;
            if (abstractC5003S2 != null) {
                k(c5011f, abstractC5003S2);
            }
            AbstractC5003S abstractC5003S3 = c5011f.f40665b;
            if (abstractC5003S3 != null) {
                k(c5011f, abstractC5003S3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f40681m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C5012g c5012g2 = (C5012g) arrayList6.get(size6);
                    View view2 = c5012g2.f40670a.f40590a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c5012g2.f40670a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f40680l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC5003S abstractC5003S4 = (AbstractC5003S) arrayList8.get(size8);
                    abstractC5003S4.f40590a.setAlpha(1.0f);
                    c(abstractC5003S4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f40682n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C5011f c5011f2 = (C5011f) arrayList10.get(size10);
                    AbstractC5003S abstractC5003S5 = c5011f2.f40664a;
                    if (abstractC5003S5 != null) {
                        k(c5011f2, abstractC5003S5);
                    }
                    AbstractC5003S abstractC5003S6 = c5011f2.f40665b;
                    if (abstractC5003S6 != null) {
                        k(c5011f2, abstractC5003S6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f40685q);
            h(this.f40684p);
            h(this.f40683o);
            h(this.f40686r);
            ArrayList arrayList11 = this.f40780b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // t0.AbstractC5031z
    public final boolean f() {
        return (this.i.isEmpty() && this.f40679k.isEmpty() && this.f40678j.isEmpty() && this.f40677h.isEmpty() && this.f40684p.isEmpty() && this.f40685q.isEmpty() && this.f40683o.isEmpty() && this.f40686r.isEmpty() && this.f40681m.isEmpty() && this.f40680l.isEmpty() && this.f40682n.isEmpty()) ? false : true;
    }

    public final boolean g(AbstractC5003S abstractC5003S, int i, int i6, int i9, int i10) {
        View view = abstractC5003S.f40590a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i6 + ((int) abstractC5003S.f40590a.getTranslationY());
        l(abstractC5003S);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            c(abstractC5003S);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        ArrayList arrayList = this.f40678j;
        C5012g c5012g = new C5012g();
        c5012g.f40670a = abstractC5003S;
        c5012g.f40671b = translationX;
        c5012g.f40672c = translationY;
        c5012g.f40673d = i9;
        c5012g.f40674e = i10;
        arrayList.add(c5012g);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f40780b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, AbstractC5003S abstractC5003S) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5011f c5011f = (C5011f) arrayList.get(size);
            if (k(c5011f, abstractC5003S) && c5011f.f40664a == null && c5011f.f40665b == null) {
                arrayList.remove(c5011f);
            }
        }
    }

    public final boolean k(C5011f c5011f, AbstractC5003S abstractC5003S) {
        if (c5011f.f40665b == abstractC5003S) {
            c5011f.f40665b = null;
        } else {
            if (c5011f.f40664a != abstractC5003S) {
                return false;
            }
            c5011f.f40664a = null;
        }
        abstractC5003S.f40590a.setAlpha(1.0f);
        View view = abstractC5003S.f40590a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(abstractC5003S);
        return true;
    }

    public final void l(AbstractC5003S abstractC5003S) {
        if (f40675s == null) {
            f40675s = new ValueAnimator().getInterpolator();
        }
        abstractC5003S.f40590a.animate().setInterpolator(f40675s);
        d(abstractC5003S);
    }
}
