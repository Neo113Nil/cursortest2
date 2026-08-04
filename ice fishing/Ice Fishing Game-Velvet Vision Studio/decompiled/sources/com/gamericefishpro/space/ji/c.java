package com.gamericefishpro.space.ji;

import com.gamericefishpro.space.ph.j0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j0 {
    public final int d;
    public final int e;
    public boolean i;
    public int v;

    public c(int i, int i2, int i3) {
        this.d = i3;
        this.e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.i = z;
        this.v = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.ph.j0
    public final int nextInt() {
        int i = this.v;
        if (i != this.e) {
            this.v = this.d + i;
            return i;
        }
        if (!this.i) {
            throw new NoSuchElementException();
        }
        this.i = false;
        return i;
    }
}
