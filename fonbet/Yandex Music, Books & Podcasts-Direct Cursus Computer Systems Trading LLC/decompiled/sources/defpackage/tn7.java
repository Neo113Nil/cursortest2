package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tn7 extends von {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((opn) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.von
    public final boolean a(opn opnVar, opn opnVar2, c9n c9nVar, c9n c9nVar2) {
        int i;
        int i2;
        int i3 = c9nVar.b;
        int i4 = c9nVar.c;
        if (opnVar2.r()) {
            int i5 = c9nVar.b;
            i2 = c9nVar.c;
            i = i5;
        } else {
            i = c9nVar2.b;
            i2 = c9nVar2.c;
        }
        if (opnVar == opnVar2) {
            return g(opnVar, i3, i4, i, i2);
        }
        View view = opnVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(opnVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = opnVar2.a;
        l(opnVar2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        rn7 rn7Var = new rn7();
        rn7Var.a = opnVar;
        rn7Var.b = opnVar2;
        rn7Var.c = i3;
        rn7Var.d = i4;
        rn7Var.e = i;
        rn7Var.f = i2;
        arrayList.add(rn7Var);
        return true;
    }

    @Override // defpackage.von
    public final void d(opn opnVar) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = opnVar.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((sn7) arrayList4.get(size)).a == opnVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(opnVar);
                arrayList4.remove(size);
            }
        }
        j(this.k, opnVar);
        if (this.h.remove(opnVar)) {
            view.setAlpha(1.0f);
            c(opnVar);
        }
        if (this.i.remove(opnVar)) {
            view.setAlpha(1.0f);
            c(opnVar);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, opnVar);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((sn7) arrayList6.get(size4)).a == opnVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(opnVar);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(opnVar)) {
                view.setAlpha(1.0f);
                c(opnVar);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(opnVar);
        this.o.remove(opnVar);
        this.r.remove(opnVar);
        this.p.remove(opnVar);
        i();
    }

    @Override // defpackage.von
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            sn7 sn7Var = (sn7) arrayList7.get(size);
            View view = sn7Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(sn7Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((opn) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            opn opnVar = (opn) arrayList5.get(size3);
            opnVar.a.setAlpha(1.0f);
            c(opnVar);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            rn7 rn7Var = (rn7) arrayList.get(size4);
            opn opnVar2 = rn7Var.a;
            if (opnVar2 != null) {
                k(rn7Var, opnVar2);
            }
            opn opnVar3 = rn7Var.b;
            if (opnVar3 != null) {
                k(rn7Var, opnVar3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    sn7 sn7Var2 = (sn7) arrayList8.get(size6);
                    View view2 = sn7Var2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(sn7Var2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    opn opnVar4 = (opn) arrayList9.get(size8);
                    opnVar4.a.setAlpha(1.0f);
                    c(opnVar4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    rn7 rn7Var2 = (rn7) arrayList10.get(size10);
                    opn opnVar5 = rn7Var2.a;
                    if (opnVar5 != null) {
                        k(rn7Var2, opnVar5);
                    }
                    opn opnVar6 = rn7Var2.b;
                    if (opnVar6 != null) {
                        k(rn7Var2, opnVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                l1j.f();
            }
        }
    }

    @Override // defpackage.von
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(opn opnVar, int i, int i2, int i3, int i4) {
        View view = opnVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) opnVar.a.getTranslationY());
        l(opnVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(opnVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        sn7 sn7Var = new sn7();
        sn7Var.a = opnVar;
        sn7Var.b = translationX;
        sn7Var.c = translationY;
        sn7Var.d = i3;
        sn7Var.e = i4;
        arrayList.add(sn7Var);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            l1j.f();
        }
    }

    public final void j(ArrayList arrayList, opn opnVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rn7 rn7Var = (rn7) arrayList.get(size);
            if (k(rn7Var, opnVar) && rn7Var.a == null && rn7Var.b == null) {
                arrayList.remove(rn7Var);
            }
        }
    }

    public final boolean k(rn7 rn7Var, opn opnVar) {
        if (rn7Var.b == opnVar) {
            rn7Var.b = null;
        } else {
            if (rn7Var.a != opnVar) {
                return false;
            }
            rn7Var.a = null;
        }
        View view = opnVar.a;
        View view2 = opnVar.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(opnVar);
        return true;
    }

    public final void l(opn opnVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        opnVar.a.animate().setInterpolator(s);
        d(opnVar);
    }
}
