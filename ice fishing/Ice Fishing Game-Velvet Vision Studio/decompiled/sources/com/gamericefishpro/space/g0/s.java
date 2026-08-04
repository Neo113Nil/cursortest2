package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.ph.g0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final g a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public Object h;
    public int i;

    public s(g gVar) {
        this.a = gVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = g0.d;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.i))) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final r b(int i) {
        ?? r0;
        int i2 = this.i;
        int i3 = i * i2;
        int iD = d() - i3;
        if (i2 > iD) {
            i2 = iD;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.h.size()) {
            r0 = this.h;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new b(1));
            }
            this.h = arrayList;
            r0 = arrayList;
        }
        return new r(i3, r0);
    }

    public final int c(int i) {
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            com.gamericefishpro.space.c0.a.a("ItemIndex > total count");
        }
        return i / this.i;
    }

    public final int d() {
        return this.a.c.a;
    }

    public final int e(int i) {
        com.gamericefishpro.space.h0.j jVarD = this.a.c.d(i);
        int i2 = i - jVarD.a;
        return (int) ((b) ((f) jVarD.c).a.invoke(q.a, Integer.valueOf(i2))).a;
    }
}
