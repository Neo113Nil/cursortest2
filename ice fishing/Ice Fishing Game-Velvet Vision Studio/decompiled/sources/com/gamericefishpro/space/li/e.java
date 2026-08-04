package com.gamericefishpro.space.li;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t.f0;
import com.gamericefishpro.space.t.g0;
import com.gamericefishpro.space.t.j0;
import com.gamericefishpro.space.t.k0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator, com.gamericefishpro.space.fi.a {
    public final /* synthetic */ int d;
    public int e;
    public Object i;
    public final Object v;

    public e(Object obj, Map map) {
        this.d = 3;
        this.i = obj;
        this.v = map;
    }

    public void a() {
        Object objInvoke;
        d dVar = (d) this.v;
        if (this.e == -2) {
            objInvoke = ((Function0) dVar.b).invoke();
        } else {
            Function1 function1 = dVar.c;
            Object obj = this.i;
            Intrinsics.b(obj);
            objInvoke = function1.invoke(obj);
        }
        this.i = objInvoke;
        this.e = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.e < 0) {
                    a();
                }
                return this.e == 1;
            case 1:
                return ((f) this.i).hasNext();
            case 2:
                return ((f) this.i).hasNext();
            default:
                return this.e < ((Map) this.v).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.e < 0) {
                    a();
                }
                if (this.e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.i;
                Intrinsics.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.e = -1;
                return obj;
            case 1:
                return ((f) this.i).next();
            case 2:
                return ((f) this.i).next();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.i;
                this.e++;
                Object obj3 = ((Map) this.v).get(obj2);
                if (obj3 != null) {
                    this.i = ((com.gamericefishpro.space.z0.a) obj3).b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.e;
                if (i != -1) {
                    ((g0) this.v).e.h(i);
                    this.e = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.e;
                if (i2 != -1) {
                    ((k0) this.v).e.m(i2);
                    this.e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(d dVar) {
        this.d = 0;
        this.v = dVar;
        this.e = -2;
    }

    public e(k0 k0Var) {
        this.d = 2;
        this.v = k0Var;
        this.e = -1;
        this.i = h.a(new j0(k0Var, this, null));
    }

    public e(g0 g0Var) {
        this.d = 1;
        this.v = g0Var;
        this.e = -1;
        this.i = h.a(new f0(g0Var, this, null));
    }
}
