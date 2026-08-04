package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 implements Iterator {
    public final /* synthetic */ int d;
    public int e;
    public boolean i;
    public Iterator v;
    public final /* synthetic */ AbstractMap w;

    public /* synthetic */ m6(k6 k6Var) {
        this.d = 0;
        Objects.requireNonNull(k6Var);
        this.w = k6Var;
        this.e = -1;
    }

    public Iterator a() {
        if (this.v == null) {
            this.v = ((com.gamericefishpro.space.q4.v0) this.w).e.entrySet().iterator();
        }
        return this.v;
    }

    public Iterator b() {
        if (this.v == null) {
            this.v = ((k6) this.w).i.entrySet().iterator();
        }
        return this.v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.e + 1;
                k6 k6Var = (k6) this.w;
                if (i >= k6Var.e) {
                    return !k6Var.i.isEmpty() && b().hasNext();
                }
                return true;
            default:
                int i2 = this.e + 1;
                com.gamericefishpro.space.q4.v0 v0Var = (com.gamericefishpro.space.q4.v0) this.w;
                if (i2 >= v0Var.d.size()) {
                    return !v0Var.e.isEmpty() && a().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.i = true;
                int i = this.e + 1;
                this.e = i;
                k6 k6Var = (k6) this.w;
                return i < k6Var.e ? (l6) k6Var.d[i] : (Map.Entry) b().next();
            default:
                this.i = true;
                int i2 = this.e + 1;
                this.e = i2;
                com.gamericefishpro.space.q4.v0 v0Var = (com.gamericefishpro.space.q4.v0) this.w;
                return i2 < v0Var.d.size() ? (Map.Entry) v0Var.d.get(this.e) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.d;
        AbstractMap abstractMap = this.w;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!this.i) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.i = false;
                k6 k6Var = (k6) abstractMap;
                k6Var.f();
                int i2 = this.e;
                if (i2 >= k6Var.e) {
                    b().remove();
                    return;
                } else {
                    this.e = i2 - 1;
                    k6Var.d(i2);
                    return;
                }
            default:
                com.gamericefishpro.space.q4.v0 v0Var = (com.gamericefishpro.space.q4.v0) abstractMap;
                if (!this.i) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.i = false;
                int i3 = com.gamericefishpro.space.q4.v0.y;
                v0Var.b();
                if (this.e >= v0Var.d.size()) {
                    a().remove();
                    return;
                }
                int i4 = this.e;
                this.e = i4 - 1;
                v0Var.h(i4);
                return;
        }
    }

    public m6(com.gamericefishpro.space.q4.v0 v0Var) {
        this.d = 1;
        this.w = v0Var;
        this.e = -1;
    }
}
