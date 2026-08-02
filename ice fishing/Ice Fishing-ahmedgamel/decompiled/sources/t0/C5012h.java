package t0;

import O.C0349t;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5012h extends AbstractC5030z {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f40728s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40729g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f40730h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f40731j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f40732k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f40733l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f40734m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f40735n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f40736o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f40737p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f40738q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f40739r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC5000P) arrayList.get(size)).f40643a.animate().cancel();
        }
    }

    @Override // t0.AbstractC5030z
    public final boolean a(AbstractC5000P abstractC5000P, AbstractC5000P abstractC5000P2, C0349t c0349t, C0349t c0349t2) {
        int i;
        int i4;
        int i6 = c0349t.f2221a;
        int i9 = c0349t.f2222b;
        if (abstractC5000P2.o()) {
            int i10 = c0349t.f2221a;
            i4 = c0349t.f2222b;
            i = i10;
        } else {
            i = c0349t2.f2221a;
            i4 = c0349t2.f2222b;
        }
        if (abstractC5000P == abstractC5000P2) {
            return g(abstractC5000P, i6, i9, i, i4);
        }
        View view = abstractC5000P.f40643a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(abstractC5000P);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(abstractC5000P2);
        float f2 = -((int) ((i - i6) - translationX));
        View view2 = abstractC5000P2.f40643a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i4 - i9) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f40732k;
        C5010f c5010f = new C5010f();
        c5010f.f40717a = abstractC5000P;
        c5010f.f40718b = abstractC5000P2;
        c5010f.f40719c = i6;
        c5010f.f40720d = i9;
        c5010f.f40721e = i;
        c5010f.f40722f = i4;
        arrayList.add(c5010f);
        return true;
    }

    @Override // t0.AbstractC5030z
    public final void d(AbstractC5000P abstractC5000P) {
        View view = abstractC5000P.f40643a;
        view.animate().cancel();
        ArrayList arrayList = this.f40731j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C5011g) arrayList.get(size)).f40723a == abstractC5000P) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(abstractC5000P);
                arrayList.remove(size);
            }
        }
        j(this.f40732k, abstractC5000P);
        if (this.f40730h.remove(abstractC5000P)) {
            view.setAlpha(1.0f);
            c(abstractC5000P);
        }
        if (this.i.remove(abstractC5000P)) {
            view.setAlpha(1.0f);
            c(abstractC5000P);
        }
        ArrayList arrayList2 = this.f40735n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, abstractC5000P);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f40734m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C5011g) arrayList5.get(size4)).f40723a == abstractC5000P) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(abstractC5000P);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f40733l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC5000P)) {
                view.setAlpha(1.0f);
                c(abstractC5000P);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f40738q.remove(abstractC5000P);
        this.f40736o.remove(abstractC5000P);
        this.f40739r.remove(abstractC5000P);
        this.f40737p.remove(abstractC5000P);
        i();
    }

    @Override // t0.AbstractC5030z
    public final void e() {
        ArrayList arrayList = this.f40731j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C5011g c5011g = (C5011g) arrayList.get(size);
            View view = c5011g.f40723a.f40643a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c5011g.f40723a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f40730h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((AbstractC5000P) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC5000P abstractC5000P = (AbstractC5000P) arrayList3.get(size3);
            abstractC5000P.f40643a.setAlpha(1.0f);
            c(abstractC5000P);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f40732k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C5010f c5010f = (C5010f) arrayList4.get(size4);
            AbstractC5000P abstractC5000P2 = c5010f.f40717a;
            if (abstractC5000P2 != null) {
                k(c5010f, abstractC5000P2);
            }
            AbstractC5000P abstractC5000P3 = c5010f.f40718b;
            if (abstractC5000P3 != null) {
                k(c5010f, abstractC5000P3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f40734m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C5011g c5011g2 = (C5011g) arrayList6.get(size6);
                    View view2 = c5011g2.f40723a.f40643a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c5011g2.f40723a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f40733l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC5000P abstractC5000P4 = (AbstractC5000P) arrayList8.get(size8);
                    abstractC5000P4.f40643a.setAlpha(1.0f);
                    c(abstractC5000P4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f40735n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C5010f c5010f2 = (C5010f) arrayList10.get(size10);
                    AbstractC5000P abstractC5000P5 = c5010f2.f40717a;
                    if (abstractC5000P5 != null) {
                        k(c5010f2, abstractC5000P5);
                    }
                    AbstractC5000P abstractC5000P6 = c5010f2.f40718b;
                    if (abstractC5000P6 != null) {
                        k(c5010f2, abstractC5000P6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f40738q);
            h(this.f40737p);
            h(this.f40736o);
            h(this.f40739r);
            ArrayList arrayList11 = this.f40832b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // t0.AbstractC5030z
    public final boolean f() {
        return (this.i.isEmpty() && this.f40732k.isEmpty() && this.f40731j.isEmpty() && this.f40730h.isEmpty() && this.f40737p.isEmpty() && this.f40738q.isEmpty() && this.f40736o.isEmpty() && this.f40739r.isEmpty() && this.f40734m.isEmpty() && this.f40733l.isEmpty() && this.f40735n.isEmpty()) ? false : true;
    }

    public final boolean g(AbstractC5000P abstractC5000P, int i, int i4, int i6, int i9) {
        View view = abstractC5000P.f40643a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i4 + ((int) abstractC5000P.f40643a.getTranslationY());
        l(abstractC5000P);
        int i10 = i6 - translationX;
        int i11 = i9 - translationY;
        if (i10 == 0 && i11 == 0) {
            c(abstractC5000P);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        ArrayList arrayList = this.f40731j;
        C5011g c5011g = new C5011g();
        c5011g.f40723a = abstractC5000P;
        c5011g.f40724b = translationX;
        c5011g.f40725c = translationY;
        c5011g.f40726d = i6;
        c5011g.f40727e = i9;
        arrayList.add(c5011g);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f40832b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, AbstractC5000P abstractC5000P) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5010f c5010f = (C5010f) arrayList.get(size);
            if (k(c5010f, abstractC5000P) && c5010f.f40717a == null && c5010f.f40718b == null) {
                arrayList.remove(c5010f);
            }
        }
    }

    public final boolean k(C5010f c5010f, AbstractC5000P abstractC5000P) {
        if (c5010f.f40718b == abstractC5000P) {
            c5010f.f40718b = null;
        } else {
            if (c5010f.f40717a != abstractC5000P) {
                return false;
            }
            c5010f.f40717a = null;
        }
        abstractC5000P.f40643a.setAlpha(1.0f);
        View view = abstractC5000P.f40643a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(abstractC5000P);
        return true;
    }

    public final void l(AbstractC5000P abstractC5000P) {
        if (f40728s == null) {
            f40728s = new ValueAnimator().getInterpolator();
        }
        abstractC5000P.f40643a.animate().setInterpolator(f40728s);
        d(abstractC5000P);
    }
}
