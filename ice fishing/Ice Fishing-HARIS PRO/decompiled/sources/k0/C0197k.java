package k0;

import O.C0038n;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: k0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197k extends G {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f3524s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3525g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3526h;
    public ArrayList i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3527k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3528l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3529m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3530n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3531o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f3532p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3533q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f3534r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b0) arrayList.get(size)).f3449a.animate().cancel();
        }
    }

    @Override // k0.G
    public final boolean a(b0 b0Var, b0 b0Var2, C0038n c0038n, C0038n c0038n2) {
        int i;
        int i2;
        int i3 = c0038n.f825a;
        int i4 = c0038n.f826b;
        if (b0Var2.q()) {
            int i5 = c0038n.f825a;
            i2 = c0038n.f826b;
            i = i5;
        } else {
            i = c0038n2.f825a;
            i2 = c0038n2.f826b;
        }
        if (b0Var == b0Var2) {
            return g(b0Var, i3, i4, i, i2);
        }
        View view = b0Var.f3449a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(b0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(b0Var2);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = b0Var2.f3449a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(RecyclerView.f2111C0);
        ArrayList arrayList = this.f3527k;
        C0195i c0195i = new C0195i();
        c0195i.f3502a = b0Var;
        c0195i.f3503b = b0Var2;
        c0195i.f3504c = i3;
        c0195i.f3505d = i4;
        c0195i.e = i;
        c0195i.f3506f = i2;
        arrayList.add(c0195i);
        return true;
    }

    @Override // k0.G
    public final void d(b0 b0Var) {
        View view = b0Var.f3449a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0196j) arrayList.get(size)).f3514a == b0Var) {
                view.setTranslationY(RecyclerView.f2111C0);
                view.setTranslationX(RecyclerView.f2111C0);
                c(b0Var);
                arrayList.remove(size);
            }
        }
        j(this.f3527k, b0Var);
        if (this.f3526h.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        if (this.i.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        ArrayList arrayList2 = this.f3530n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, b0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3529m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0196j) arrayList5.get(size4)).f3514a == b0Var) {
                    view.setTranslationY(RecyclerView.f2111C0);
                    view.setTranslationX(RecyclerView.f2111C0);
                    c(b0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3528l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(b0Var)) {
                view.setAlpha(1.0f);
                c(b0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3533q.remove(b0Var);
        this.f3531o.remove(b0Var);
        this.f3534r.remove(b0Var);
        this.f3532p.remove(b0Var);
        i();
    }

    @Override // k0.G
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0196j c0196j = (C0196j) arrayList.get(size);
            View view = c0196j.f3514a.f3449a;
            view.setTranslationY(RecyclerView.f2111C0);
            view.setTranslationX(RecyclerView.f2111C0);
            c(c0196j.f3514a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3526h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((b0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            b0 b0Var = (b0) arrayList3.get(size3);
            b0Var.f3449a.setAlpha(1.0f);
            c(b0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3527k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0195i c0195i = (C0195i) arrayList4.get(size4);
            b0 b0Var2 = c0195i.f3502a;
            if (b0Var2 != null) {
                k(c0195i, b0Var2);
            }
            b0 b0Var3 = c0195i.f3503b;
            if (b0Var3 != null) {
                k(c0195i, b0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f3529m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0196j c0196j2 = (C0196j) arrayList6.get(size6);
                    View view2 = c0196j2.f3514a.f3449a;
                    view2.setTranslationY(RecyclerView.f2111C0);
                    view2.setTranslationX(RecyclerView.f2111C0);
                    c(c0196j2.f3514a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3528l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    b0 b0Var4 = (b0) arrayList8.get(size8);
                    b0Var4.f3449a.setAlpha(1.0f);
                    c(b0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3530n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0195i c0195i2 = (C0195i) arrayList10.get(size10);
                    b0 b0Var5 = c0195i2.f3502a;
                    if (b0Var5 != null) {
                        k(c0195i2, b0Var5);
                    }
                    b0 b0Var6 = c0195i2.f3503b;
                    if (b0Var6 != null) {
                        k(c0195i2, b0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f3533q);
            h(this.f3532p);
            h(this.f3531o);
            h(this.f3534r);
            ArrayList arrayList11 = this.f3374b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // k0.G
    public final boolean f() {
        return (this.i.isEmpty() && this.f3527k.isEmpty() && this.j.isEmpty() && this.f3526h.isEmpty() && this.f3532p.isEmpty() && this.f3533q.isEmpty() && this.f3531o.isEmpty() && this.f3534r.isEmpty() && this.f3529m.isEmpty() && this.f3528l.isEmpty() && this.f3530n.isEmpty()) ? false : true;
    }

    public final boolean g(b0 b0Var, int i, int i2, int i3, int i4) {
        View view = b0Var.f3449a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) b0Var.f3449a.getTranslationY());
        l(b0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(b0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        C0196j c0196j = new C0196j();
        c0196j.f3514a = b0Var;
        c0196j.f3515b = translationX;
        c0196j.f3516c = translationY;
        c0196j.f3517d = i3;
        c0196j.e = i4;
        arrayList.add(c0196j);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f3374b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, b0 b0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0195i c0195i = (C0195i) arrayList.get(size);
            if (k(c0195i, b0Var) && c0195i.f3502a == null && c0195i.f3503b == null) {
                arrayList.remove(c0195i);
            }
        }
    }

    public final boolean k(C0195i c0195i, b0 b0Var) {
        if (c0195i.f3503b == b0Var) {
            c0195i.f3503b = null;
        } else {
            if (c0195i.f3502a != b0Var) {
                return false;
            }
            c0195i.f3502a = null;
        }
        b0Var.f3449a.setAlpha(1.0f);
        View view = b0Var.f3449a;
        view.setTranslationX(RecyclerView.f2111C0);
        view.setTranslationY(RecyclerView.f2111C0);
        c(b0Var);
        return true;
    }

    public final void l(b0 b0Var) {
        if (f3524s == null) {
            f3524s = new ValueAnimator().getInterpolator();
        }
        b0Var.f3449a.animate().setInterpolator(f3524s);
        d(b0Var);
    }
}
