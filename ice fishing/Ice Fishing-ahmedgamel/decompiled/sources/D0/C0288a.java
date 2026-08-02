package D0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import u.AbstractC5050e;

/* renamed from: D0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288a extends o {

    /* renamed from: T, reason: collision with root package name */
    public ArrayList f436T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f437U;

    /* renamed from: V, reason: collision with root package name */
    public int f438V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f439W;

    /* renamed from: X, reason: collision with root package name */
    public int f440X;

    @Override // D0.o
    public final void B(ViewGroup viewGroup) {
        super.B(viewGroup);
        int size = this.f436T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f436T.get(i)).B(viewGroup);
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
        int size = this.f436T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f436T.get(i)).D(frameLayout);
        }
    }

    @Override // D0.o
    public final void E() {
        if (this.f436T.isEmpty()) {
            L();
            r();
            return;
        }
        t tVar = new t();
        tVar.f510b = this;
        Iterator it = this.f436T.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(tVar);
        }
        this.f438V = this.f436T.size();
        if (this.f437U) {
            Iterator it2 = this.f436T.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).E();
            }
            return;
        }
        for (int i = 1; i < this.f436T.size(); i++) {
            ((o) this.f436T.get(i - 1)).a(new t((o) this.f436T.get(i)));
        }
        o oVar = (o) this.f436T.get(0);
        if (oVar != null) {
            oVar.E();
        }
    }

    @Override // D0.o
    public final void F(long j6) {
        ArrayList arrayList;
        this.f497v = j6;
        if (j6 < 0 || (arrayList = this.f436T) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f436T.get(i)).F(j6);
        }
    }

    @Override // D0.o
    public final void G(Z2.d dVar) {
        this.f440X |= 8;
        int size = this.f436T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f436T.get(i)).G(dVar);
        }
    }

    @Override // D0.o
    public final void H(TimeInterpolator timeInterpolator) {
        this.f440X |= 1;
        ArrayList arrayList = this.f436T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o) this.f436T.get(i)).H(timeInterpolator);
            }
        }
        this.f498w = timeInterpolator;
    }

    @Override // D0.o
    public final void I(O2.i iVar) {
        super.I(iVar);
        this.f440X |= 4;
        if (this.f436T != null) {
            for (int i = 0; i < this.f436T.size(); i++) {
                ((o) this.f436T.get(i)).I(iVar);
            }
        }
    }

    @Override // D0.o
    public final void J() {
        this.f440X |= 2;
        int size = this.f436T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f436T.get(i)).J();
        }
    }

    @Override // D0.o
    public final void K(long j6) {
        this.f496u = j6;
    }

    @Override // D0.o
    public final String M(String str) {
        String M8 = super.M(str);
        for (int i = 0; i < this.f436T.size(); i++) {
            StringBuilder c9 = AbstractC5050e.c(M8, "\n");
            c9.append(((o) this.f436T.get(i)).M(str + "  "));
            M8 = c9.toString();
        }
        return M8;
    }

    public final void N(o oVar) {
        this.f436T.add(oVar);
        oVar.f482B = this;
        long j6 = this.f497v;
        if (j6 >= 0) {
            oVar.F(j6);
        }
        if ((this.f440X & 1) != 0) {
            oVar.H(this.f498w);
        }
        if ((this.f440X & 2) != 0) {
            oVar.J();
        }
        if ((this.f440X & 4) != 0) {
            oVar.I(this.f494O);
        }
        if ((this.f440X & 8) != 0) {
            oVar.G(null);
        }
    }

    @Override // D0.o
    public final void h() {
        super.h();
        int size = this.f436T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f436T.get(i)).h();
        }
    }

    @Override // D0.o
    public final void i(w wVar) {
        if (y(wVar.f513b)) {
            Iterator it = this.f436T.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.y(wVar.f513b)) {
                    oVar.i(wVar);
                    wVar.f514c.add(oVar);
                }
            }
        }
    }

    @Override // D0.o
    public final void k(w wVar) {
        int size = this.f436T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f436T.get(i)).k(wVar);
        }
    }

    @Override // D0.o
    public final void l(w wVar) {
        if (y(wVar.f513b)) {
            Iterator it = this.f436T.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.y(wVar.f513b)) {
                    oVar.l(wVar);
                    wVar.f514c.add(oVar);
                }
            }
        }
    }

    @Override // D0.o
    /* renamed from: o */
    public final o clone() {
        C0288a c0288a = (C0288a) super.clone();
        c0288a.f436T = new ArrayList();
        int size = this.f436T.size();
        for (int i = 0; i < size; i++) {
            o clone = ((o) this.f436T.get(i)).clone();
            c0288a.f436T.add(clone);
            clone.f482B = c0288a;
        }
        return c0288a;
    }

    @Override // D0.o
    public final void q(FrameLayout frameLayout, S0.n nVar, S0.n nVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j6 = this.f496u;
        int size = this.f436T.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) this.f436T.get(i);
            if (j6 > 0 && (this.f437U || i == 0)) {
                long j9 = oVar.f496u;
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
