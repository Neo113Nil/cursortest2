package com.gamericefishpro.space.t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements com.gamericefishpro.space.g1.d, Iterable, com.gamericefishpro.space.fi.a {
    public int A;
    public HashMap C;
    public com.gamericefishpro.space.t.w D;
    public int e;
    public int v;
    public int w;
    public boolean z;
    public int[] d = new int[0];
    public Object[] i = new Object[0];
    public final Object y = new Object();
    public ArrayList B = new ArrayList();

    public final int b(a aVar) {
        if (this.z) {
            s.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            m1.a("Anchor refers to a group that was removed");
        }
        return aVar.a;
    }

    public final void c() {
        this.C = new HashMap();
    }

    public final d2 d() {
        if (this.z) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.w++;
        return new d2(this);
    }

    public final h2 f() {
        if (this.z) {
            s.a("Cannot start a writer when another writer is pending");
        }
        if (this.w > 0) {
            s.a("Cannot start a writer when a reader is pending");
        }
        this.z = true;
        this.A++;
        return new h2(this);
    }

    public final boolean h(a aVar) {
        int iE;
        return aVar.a() && (iE = g2.e(this.B, aVar.a, this.e)) >= 0 && Intrinsics.a(this.B.get(iE), aVar);
    }

    public final l0 i(int i) {
        int i2;
        ArrayList arrayList;
        int iE;
        HashMap map = this.C;
        if (map != null) {
            if (this.z) {
                s.a("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i < 0 || i >= (i2 = this.e) || (iE = g2.e((arrayList = this.B), i, i2)) < 0) ? null : (a) arrayList.get(iE);
            if (aVar != null) {
                return (l0) map.get(aVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k0(this, 0, this.e);
    }
}
