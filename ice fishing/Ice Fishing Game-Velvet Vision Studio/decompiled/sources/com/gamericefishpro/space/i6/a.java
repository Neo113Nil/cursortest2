package com.gamericefishpro.space.i6;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    public ArrayList V;
    public boolean W;
    public int X;
    public boolean Y;
    public int Z;
    public o[] a0;

    @Override // com.gamericefishpro.space.i6.o
    public final void A(View view) {
        super.A(view);
        o[] oVarArr = this.a0;
        this.a0 = null;
        if (oVarArr == null) {
            oVarArr = new o[this.V.size()];
        }
        o[] oVarArr2 = (o[]) this.V.toArray(oVarArr);
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            oVarArr2[i].A(view);
        }
        Arrays.fill(oVarArr2, (Object) null);
        this.a0 = oVarArr2;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void B() {
        if (this.V.isEmpty()) {
            J();
            m();
            return;
        }
        t tVar = new t();
        tVar.b = this;
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o) obj).a(tVar);
        }
        this.X = this.V.size();
        if (this.W) {
            ArrayList arrayList2 = this.V;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((o) obj2).B();
            }
            return;
        }
        for (int i3 = 1; i3 < this.V.size(); i3++) {
            ((o) this.V.get(i3 - 1)).a(new t((o) this.V.get(i3), 2));
        }
        o oVar = (o) this.V.get(0);
        if (oVar != null) {
            oVar.B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // com.gamericefishpro.space.i6.o
    public final void C(long j, long j2) {
        long j3;
        long j4 = this.P;
        long j5 = 0;
        if (this.B != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.K = false;
            w(this, n.b, z);
        }
        if (!this.W) {
            int size = 1;
            while (true) {
                if (size >= this.V.size()) {
                    size = this.V.size();
                    break;
                } else if (((o) this.V.get(size)).Q > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.V.size()) {
                        o oVar = (o) this.V.get(i);
                        long j6 = oVar.Q;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        oVar.C(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    o oVar2 = (o) this.V.get(i);
                    long j8 = oVar2.Q;
                    long j9 = j - j8;
                    oVar2.C(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.B != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.K = true;
                }
                w(this, n.c, z);
            }
        }
        for (int i2 = 0; i2 < this.V.size(); i2++) {
            ((o) this.V.get(i2)).C(j, j2);
        }
        j3 = j5;
        if (this.B != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.K = true;
            }
            w(this, n.c, z);
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void D(long j) {
        ArrayList arrayList;
        this.i = j;
        if (j < 0 || (arrayList = this.V) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o) this.V.get(i)).D(j);
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void E(com.gamericefishpro.space.a.a aVar) {
        this.Z |= 8;
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((o) this.V.get(i)).E(aVar);
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void F(TimeInterpolator timeInterpolator) {
        this.Z |= 1;
        ArrayList arrayList = this.V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o) this.V.get(i)).F(timeInterpolator);
            }
        }
        this.v = timeInterpolator;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void G(com.gamericefishpro.space.lb.e eVar) {
        super.G(eVar);
        this.Z |= 4;
        if (this.V != null) {
            for (int i = 0; i < this.V.size(); i++) {
                ((o) this.V.get(i)).G(eVar);
            }
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void H() {
        this.Z |= 2;
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((o) this.V.get(i)).H();
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void I(long j) {
        this.e = j;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final String K(String str) {
        String strK = super.K(str);
        for (int i = 0; i < this.V.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strK);
            sb.append("\n");
            sb.append(((o) this.V.get(i)).K(str + "  "));
            strK = sb.toString();
        }
        return strK;
    }

    public final void L(o oVar) {
        this.V.add(oVar);
        oVar.B = this;
        long j = this.i;
        if (j >= 0) {
            oVar.D(j);
        }
        if ((this.Z & 1) != 0) {
            oVar.F(this.v);
        }
        if ((this.Z & 2) != 0) {
            oVar.H();
        }
        if ((this.Z & 4) != 0) {
            oVar.G(this.O);
        }
        if ((this.Z & 8) != 0) {
            oVar.E(null);
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void c() {
        super.c();
        o[] oVarArr = this.a0;
        this.a0 = null;
        if (oVarArr == null) {
            oVarArr = new o[this.V.size()];
        }
        o[] oVarArr2 = (o[]) this.V.toArray(oVarArr);
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            oVarArr2[i].c();
        }
        Arrays.fill(oVarArr2, (Object) null);
        this.a0 = oVarArr2;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void d(v vVar) {
        View view = vVar.b;
        if (u(view)) {
            ArrayList arrayList = this.V;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o oVar = (o) obj;
                if (oVar.u(view)) {
                    oVar.d(vVar);
                    vVar.c.add(oVar);
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void f(v vVar) {
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((o) this.V.get(i)).f(vVar);
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void g(v vVar) {
        View view = vVar.b;
        if (u(view)) {
            ArrayList arrayList = this.V;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o oVar = (o) obj;
                if (oVar.u(view)) {
                    oVar.g(vVar);
                    vVar.c.add(oVar);
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    /* JADX INFO: renamed from: j */
    public final o clone() {
        a aVar = (a) super.clone();
        aVar.V = new ArrayList();
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            o oVarClone = ((o) this.V.get(i)).clone();
            aVar.V.add(oVarClone);
            oVarClone.B = aVar;
        }
        return aVar;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void l(ViewGroup viewGroup, com.gamericefishpro.space.u6.i iVar, com.gamericefishpro.space.u6.i iVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.e;
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) this.V.get(i);
            if (j > 0 && (this.W || i == 0)) {
                long j2 = oVar.e;
                if (j2 > 0) {
                    oVar.I(j2 + j);
                } else {
                    oVar.I(j);
                }
            }
            oVar.l(viewGroup, iVar, iVar2, arrayList, arrayList2);
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final boolean s() {
        for (int i = 0; i < this.V.size(); i++) {
            if (((o) this.V.get(i)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void x(View view) {
        super.x(view);
        int size = this.V.size();
        for (int i = 0; i < size; i++) {
            ((o) this.V.get(i)).x(view);
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final void y() {
        this.P = 0L;
        int i = 0;
        t tVar = new t(this, i);
        while (i < this.V.size()) {
            o oVar = (o) this.V.get(i);
            oVar.a(tVar);
            oVar.y();
            long j = oVar.P;
            if (this.W) {
                this.P = Math.max(this.P, j);
            } else {
                long j2 = this.P;
                oVar.Q = j2;
                this.P = j2 + j;
            }
            i++;
        }
    }

    @Override // com.gamericefishpro.space.i6.o
    public final o z(m mVar) {
        super.z(mVar);
        return this;
    }
}
