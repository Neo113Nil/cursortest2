package com.gamericefishpro.space.qh;

import com.gamericefishpro.space.n9.y;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public int d;
    public int e;
    public int i;
    public Object v;

    public h() {
        if (y.P == null) {
            y.P = new y(27);
        }
    }

    public int a(int i) {
        if (i < this.i) {
            return ((ByteBuffer) this.v).getShort(this.e + i);
        }
        return 0;
    }

    public void b() {
        if (((i) this.v).A != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.d;
            i iVar = (i) this.v;
            if (i >= iVar.y || iVar.i[i] >= 0) {
                return;
            } else {
                this.d = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.d < ((i) this.v).y;
    }

    public void remove() {
        i iVar = (i) this.v;
        b();
        if (this.e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        iVar.c();
        iVar.n(this.e);
        this.e = -1;
        this.i = iVar.A;
    }
}
