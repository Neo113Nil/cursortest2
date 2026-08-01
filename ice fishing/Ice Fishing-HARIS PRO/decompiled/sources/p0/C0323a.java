package p0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323a extends m {

    /* renamed from: C, reason: collision with root package name */
    public int f4149C;

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f4147A = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public boolean f4148B = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4150D = false;

    /* renamed from: E, reason: collision with root package name */
    public int f4151E = 0;

    public C0323a() {
        L(1);
        I(new h(2));
        I(new C0328f());
        I(new h(1));
    }

    @Override // p0.m
    public final void B(h0.f fVar) {
        this.f4151E |= 8;
        int size = this.f4147A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f4147A.get(i)).B(fVar);
        }
    }

    @Override // p0.m
    public final void D(S0.e eVar) {
        super.D(eVar);
        this.f4151E |= 4;
        if (this.f4147A != null) {
            for (int i = 0; i < this.f4147A.size(); i++) {
                ((m) this.f4147A.get(i)).D(eVar);
            }
        }
    }

    @Override // p0.m
    public final void E() {
        this.f4151E |= 2;
        int size = this.f4147A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f4147A.get(i)).E();
        }
    }

    @Override // p0.m
    public final void F(long j) {
        this.f4185b = j;
    }

    @Override // p0.m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f4147A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f4147A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f4147A.add(mVar);
        mVar.i = this;
        long j = this.f4186c;
        if (j >= 0) {
            mVar.A(j);
        }
        if ((this.f4151E & 1) != 0) {
            mVar.C(this.f4187d);
        }
        if ((this.f4151E & 2) != 0) {
            mVar.E();
        }
        if ((this.f4151E & 4) != 0) {
            mVar.D(this.f4202v);
        }
        if ((this.f4151E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // p0.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void A(long j) {
        ArrayList arrayList;
        this.f4186c = j;
        if (j < 0 || (arrayList = this.f4147A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f4147A.get(i)).A(j);
        }
    }

    @Override // p0.m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void C(TimeInterpolator timeInterpolator) {
        this.f4151E |= 1;
        ArrayList arrayList = this.f4147A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f4147A.get(i)).C(timeInterpolator);
            }
        }
        this.f4187d = timeInterpolator;
    }

    public final void L(int i) {
        if (i == 0) {
            this.f4148B = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(D1.h.e("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.f4148B = false;
        }
    }

    @Override // p0.m
    public final void c() {
        super.c();
        int size = this.f4147A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f4147A.get(i)).c();
        }
    }

    @Override // p0.m
    public final void d(u uVar) {
        if (t(uVar.f4214b)) {
            Iterator it = this.f4147A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f4214b)) {
                    mVar.d(uVar);
                    uVar.f4215c.add(mVar);
                }
            }
        }
    }

    @Override // p0.m
    public final void f(u uVar) {
        int size = this.f4147A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f4147A.get(i)).f(uVar);
        }
    }

    @Override // p0.m
    public final void g(u uVar) {
        if (t(uVar.f4214b)) {
            Iterator it = this.f4147A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f4214b)) {
                    mVar.g(uVar);
                    uVar.f4215c.add(mVar);
                }
            }
        }
    }

    @Override // p0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0323a c0323a = (C0323a) super.clone();
        c0323a.f4147A = new ArrayList();
        int size = this.f4147A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f4147A.get(i)).clone();
            c0323a.f4147A.add(clone);
            clone.i = c0323a;
        }
        return c0323a;
    }

    @Override // p0.m
    public final void l(ViewGroup viewGroup, B.k kVar, B.k kVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f4185b;
        int size = this.f4147A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f4147A.get(i);
            if (j > 0 && (this.f4148B || i == 0)) {
                long j2 = mVar.f4185b;
                if (j2 > 0) {
                    mVar.F(j2 + j);
                } else {
                    mVar.F(j);
                }
            }
            mVar.l(viewGroup, kVar, kVar2, arrayList, arrayList2);
        }
    }

    @Override // p0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f4147A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f4147A.get(i)).w(viewGroup);
        }
    }

    @Override // p0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // p0.m
    public final void y(View view) {
        super.y(view);
        int size = this.f4147A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f4147A.get(i)).y(view);
        }
    }

    @Override // p0.m
    public final void z() {
        if (this.f4147A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f4211b = this;
        Iterator it = this.f4147A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f4149C = this.f4147A.size();
        if (this.f4148B) {
            Iterator it2 = this.f4147A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f4147A.size(); i++) {
            ((m) this.f4147A.get(i - 1)).a(new r((m) this.f4147A.get(i)));
        }
        m mVar = (m) this.f4147A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
