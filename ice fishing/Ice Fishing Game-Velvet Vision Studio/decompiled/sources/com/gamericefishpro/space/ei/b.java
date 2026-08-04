package com.gamericefishpro.space.ei;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t.s0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterator, com.gamericefishpro.space.fi.a {
    public final /* synthetic */ int d;
    public int e;
    public final Object i;

    public /* synthetic */ b(int i, Object obj) {
        this.d = i;
        this.i = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e < ((Object[]) this.i).length;
            case 1:
                return this.e < ((com.gamericefishpro.space.ph.f) this.i).b();
            default:
                return this.e < ((s0) this.i).f();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    Object[] objArr = (Object[]) this.i;
                    int i = this.e;
                    this.e = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.e--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                com.gamericefishpro.space.ph.f fVar = (com.gamericefishpro.space.ph.f) this.i;
                int i2 = this.e;
                this.e = i2 + 1;
                return fVar.get(i2);
            default:
                s0 s0Var = (s0) this.i;
                int i3 = this.e;
                this.e = i3 + 1;
                return s0Var.g(i3);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Object[] array) {
        this.d = 0;
        Intrinsics.checkNotNullParameter(array, "array");
        this.i = array;
    }
}
