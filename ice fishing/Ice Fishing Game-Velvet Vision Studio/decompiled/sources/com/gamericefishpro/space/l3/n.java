package com.gamericefishpro.space.l3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.e == nVar.b) {
                    c(this.c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(com.gamericefishpro.space.i3.c cVar, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        com.gamericefishpro.space.k3.e eVar = (com.gamericefishpro.space.k3.e) ((com.gamericefishpro.space.k3.d) arrayList.get(0)).S;
        cVar.t();
        eVar.b(cVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((com.gamericefishpro.space.k3.d) arrayList.get(i2)).b(cVar, false);
        }
        if (i == 0 && eVar.y0 > 0) {
            com.gamericefishpro.space.k3.j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.z0 > 0) {
            com.gamericefishpro.space.k3.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            com.gamericefishpro.space.k3.d dVar = (com.gamericefishpro.space.k3.d) arrayList.get(i3);
            com.gamericefishpro.space.lb.e eVar2 = new com.gamericefishpro.space.lb.e(7);
            new WeakReference(dVar);
            com.gamericefishpro.space.i3.c.n(dVar.H);
            com.gamericefishpro.space.i3.c.n(dVar.I);
            com.gamericefishpro.space.i3.c.n(dVar.J);
            com.gamericefishpro.space.i3.c.n(dVar.K);
            com.gamericefishpro.space.i3.c.n(dVar.L);
            this.d.add(eVar2);
        }
        if (i == 0) {
            iN = com.gamericefishpro.space.i3.c.n(eVar.H);
            iN2 = com.gamericefishpro.space.i3.c.n(eVar.J);
            cVar.t();
        } else {
            iN = com.gamericefishpro.space.i3.c.n(eVar.I);
            iN2 = com.gamericefishpro.space.i3.c.n(eVar.K);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, n nVar) {
        int i2 = nVar.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            com.gamericefishpro.space.k3.d dVar = (com.gamericefishpro.space.k3.d) obj;
            ArrayList arrayList2 = nVar.a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i == 0) {
                dVar.m0 = i2;
            } else {
                dVar.n0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.b);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            string = string + " " + ((com.gamericefishpro.space.k3.d) obj).g0;
        }
        return com.gamericefishpro.space.m5.a.h(string, " >");
    }
}
