package com.gamericefishpro.space.t;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, com.gamericefishpro.space.fi.a {
    public int d;
    public int e;
    public boolean i;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;

    public a(int i) {
        this.d = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.e;
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                objF = ((e) this.w).f(i);
                break;
            case 1:
                objF = ((e) this.w).i(i);
                break;
            default:
                objF = ((f) this.w).e[i];
                break;
        }
        this.e++;
        this.i = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.i) {
            Intrinsics.checkNotNullParameter("Call next() before removing an element.", "message");
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.e - 1;
        this.e = i;
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((e) this.w).g(i);
                break;
            case 1:
                ((e) this.w).g(i);
                break;
            default:
                ((f) this.w).b(i);
                break;
        }
        this.d--;
        this.i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.i);
        this.v = 2;
        this.w = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i) {
        this(eVar.i);
        this.v = i;
        switch (i) {
            case 1:
                this.w = eVar;
                this(eVar.i);
                break;
            default:
                this.w = eVar;
                break;
        }
    }
}
