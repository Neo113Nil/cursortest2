package com.gamericefishpro.space.y0;

import com.gamericefishpro.space.ei.e0;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {
    public final com.gamericefishpro.space.b1.k v;
    public Object w;
    public boolean y;
    public int z;

    public d(com.gamericefishpro.space.b1.k kVar, j[] jVarArr) {
        super(kVar.e, jVarArr);
        this.v = kVar;
        this.z = kVar.v;
    }

    public final void c(int i, i iVar, Object obj, int i2) {
        int i3 = i2 * 5;
        j[] jVarArr = this.d;
        if (i3 <= 30) {
            int iE = 1 << com.gamericefishpro.space.u6.f.E(i, i3);
            if (iVar.h(iE)) {
                jVarArr[i2].a(iVar.d, Integer.bitCount(iVar.a) * 2, iVar.f(iE));
                this.e = i2;
                return;
            } else {
                int iT = iVar.t(iE);
                i iVarS = iVar.s(iT);
                jVarArr[i2].a(iVar.d, Integer.bitCount(iVar.a) * 2, iT);
                c(i, iVarS, obj, i2 + 1);
                return;
            }
        }
        j jVar = jVarArr[i2];
        Object[] objArr = iVar.d;
        jVar.a(objArr, objArr.length, 0);
        while (true) {
            j jVar2 = jVarArr[i2];
            if (Intrinsics.a(jVar2.d[jVar2.i], obj)) {
                this.e = i2;
                return;
            } else {
                jVarArr[i2].i += 2;
            }
        }
    }

    @Override // com.gamericefishpro.space.y0.c, java.util.Iterator
    public final Object next() {
        if (this.v.v != this.z) {
            throw new ConcurrentModificationException();
        }
        if (!this.i) {
            throw new NoSuchElementException();
        }
        j jVar = this.d[this.e];
        this.w = jVar.d[jVar.i];
        this.y = true;
        return super.next();
    }

    @Override // com.gamericefishpro.space.y0.c, java.util.Iterator
    public final void remove() {
        if (!this.y) {
            throw new IllegalStateException();
        }
        boolean z = this.i;
        com.gamericefishpro.space.b1.k kVar = this.v;
        if (!z) {
            e0.b(kVar).remove(this.w);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            j jVar = this.d[this.e];
            Object obj = jVar.d[jVar.i];
            e0.b(kVar).remove(this.w);
            c(obj != null ? obj.hashCode() : 0, kVar.e, obj, 0);
        }
        this.w = null;
        this.y = false;
        this.z = kVar.v;
    }
}
