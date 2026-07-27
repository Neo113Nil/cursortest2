package D0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import u.AbstractC5049e;

/* renamed from: D0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300a extends o {

    /* renamed from: T, reason: collision with root package name */
    public ArrayList f541T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f542U;

    /* renamed from: V, reason: collision with root package name */
    public int f543V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f544W;

    /* renamed from: X, reason: collision with root package name */
    public int f545X;

    @Override // D0.o
    public final void B(ViewGroup viewGroup) {
        super.B(viewGroup);
        int size = this.f541T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f541T.get(i)).B(viewGroup);
        }
    }

    @Override // D0.o
    public final o C(m mVar) {
        super.C(mVar);
        return this;
    }

    @Override // D0.o
    public final void D(FrameLayout frameLayout) {
        super.D(frameLayout);
        int size = this.f541T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f541T.get(i)).D(frameLayout);
        }
    }

    @Override // D0.o
    public final void E() {
        if (this.f541T.isEmpty()) {
            L();
            r();
            return;
        }
        t tVar = new t();
        tVar.f614b = this;
        Iterator it = this.f541T.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(tVar);
        }
        this.f543V = this.f541T.size();
        if (this.f542U) {
            Iterator it2 = this.f541T.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).E();
            }
            return;
        }
        for (int i = 1; i < this.f541T.size(); i++) {
            ((o) this.f541T.get(i - 1)).a(new t((o) this.f541T.get(i)));
        }
        o oVar = (o) this.f541T.get(0);
        if (oVar != null) {
            oVar.E();
        }
    }

    @Override // D0.o
    public final void F(long j6) {
        ArrayList arrayList;
        this.f601v = j6;
        if (j6 < 0 || (arrayList = this.f541T) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f541T.get(i)).F(j6);
        }
    }

    @Override // D0.o
    public final void G(com.bumptech.glide.f fVar) {
        this.f545X |= 8;
        int size = this.f541T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f541T.get(i)).G(fVar);
        }
    }

    @Override // D0.o
    public final void H(TimeInterpolator timeInterpolator) {
        this.f545X |= 1;
        ArrayList arrayList = this.f541T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o) this.f541T.get(i)).H(timeInterpolator);
            }
        }
        this.f602w = timeInterpolator;
    }

    @Override // D0.o
    public final void I(a4.e eVar) {
        super.I(eVar);
        this.f545X |= 4;
        if (this.f541T != null) {
            for (int i = 0; i < this.f541T.size(); i++) {
                ((o) this.f541T.get(i)).I(eVar);
            }
        }
    }

    @Override // D0.o
    public final void J() {
        this.f545X |= 2;
        int size = this.f541T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f541T.get(i)).J();
        }
    }

    @Override // D0.o
    public final void K(long j6) {
        this.f600u = j6;
    }

    @Override // D0.o
    public final String M(String str) {
        String M8 = super.M(str);
        for (int i = 0; i < this.f541T.size(); i++) {
            StringBuilder c9 = AbstractC5049e.c(M8, "\n");
            c9.append(((o) this.f541T.get(i)).M(str + "  "));
            M8 = c9.toString();
        }
        return M8;
    }

    public final void N(o oVar) {
        this.f541T.add(oVar);
        oVar.f586B = this;
        long j6 = this.f601v;
        if (j6 >= 0) {
            oVar.F(j6);
        }
        if ((this.f545X & 1) != 0) {
            oVar.H(this.f602w);
        }
        if ((this.f545X & 2) != 0) {
            oVar.J();
        }
        if ((this.f545X & 4) != 0) {
            oVar.I(this.f598O);
        }
        if ((this.f545X & 8) != 0) {
            oVar.G(null);
        }
    }

    @Override // D0.o
    public final void h() {
        super.h();
        int size = this.f541T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f541T.get(i)).h();
        }
    }

    @Override // D0.o
    public final void i(w wVar) {
        if (y(wVar.f617b)) {
            Iterator it = this.f541T.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.y(wVar.f617b)) {
                    oVar.i(wVar);
                    wVar.f618c.add(oVar);
                }
            }
        }
    }

    @Override // D0.o
    public final void k(w wVar) {
        int size = this.f541T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f541T.get(i)).k(wVar);
        }
    }

    @Override // D0.o
    public final void l(w wVar) {
        if (y(wVar.f617b)) {
            Iterator it = this.f541T.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.y(wVar.f617b)) {
                    oVar.l(wVar);
                    wVar.f618c.add(oVar);
                }
            }
        }
    }

    @Override // D0.o
    /* renamed from: o */
    public final o clone() {
        C0300a c0300a = (C0300a) super.clone();
        c0300a.f541T = new ArrayList();
        int size = this.f541T.size();
        for (int i = 0; i < size; i++) {
            o clone = ((o) this.f541T.get(i)).clone();
            c0300a.f541T.add(clone);
            clone.f586B = c0300a;
        }
        return c0300a;
    }

    @Override // D0.o
    public final void q(FrameLayout frameLayout, S0.n nVar, S0.n nVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j6 = this.f600u;
        int size = this.f541T.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) this.f541T.get(i);
            if (j6 > 0 && (this.f542U || i == 0)) {
                long j9 = oVar.f600u;
                if (j9 > 0) {
                    oVar.K(j9 + j6);
                } else {
                    oVar.K(j6);
                }
            }
            oVar.q(frameLayout, nVar, nVar2, arrayList, arrayList2);
        }
    }
}
