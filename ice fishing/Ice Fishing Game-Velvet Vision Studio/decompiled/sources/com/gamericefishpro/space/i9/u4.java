package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 implements Iterator {
    public final /* synthetic */ int d = 0;
    public int e = 0;
    public final int i;
    public final /* synthetic */ Object v;

    public u4(w4 w4Var) {
        this.v = w4Var;
        this.i = w4Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e < this.i;
            default:
                return this.e < this.i;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.e;
                if (i >= this.i) {
                    throw new NoSuchElementException();
                }
                this.e = i + 1;
                return Byte.valueOf(((w4) this.v).c(i));
            default:
                int i2 = this.e;
                if (i2 >= this.i) {
                    throw new NoSuchElementException();
                }
                this.e = i2 + 1;
                return Byte.valueOf(((com.gamericefishpro.space.q4.f) this.v).i(i2));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public u4(com.gamericefishpro.space.q4.f fVar) {
        this.v = fVar;
        this.i = fVar.size();
    }
}
