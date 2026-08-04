package com.gamericefishpro.space.li;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, com.gamericefishpro.space.fi.a {
    public final Iterator e;
    public Object v;
    public final /* synthetic */ Sequence w;
    public final /* synthetic */ int d = 0;
    public int i = -1;

    public c(d dVar) {
        this.w = dVar;
        this.e = new o((n) dVar.b);
    }

    public void a() {
        Object next;
        d dVar = (d) this.w;
        do {
            Iterator it = this.e;
            if (!it.hasNext()) {
                this.i = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((com.gamericefishpro.space.j7.c) dVar.c).invoke(next)).booleanValue());
        this.v = next;
        this.i = 1;
    }

    public void b() {
        Iterator it = this.e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((n) this.w).c.invoke(next)).booleanValue()) {
                this.i = 1;
                this.v = next;
                return;
            }
        }
        this.i = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.i == -1) {
                    a();
                }
                return this.i == 1;
            default:
                if (this.i == -1) {
                    b();
                }
                return this.i == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.i == -1) {
                    a();
                }
                if (this.i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.v;
                this.v = null;
                this.i = -1;
                return obj;
            default:
                if (this.i == -1) {
                    b();
                }
                if (this.i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.v;
                this.v = null;
                this.i = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(n nVar) {
        this.w = nVar;
        this.e = nVar.b.iterator();
    }
}
