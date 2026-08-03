package m0;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p0 implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4704g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final j2 f4705h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4706i;

    /* renamed from: j, reason: collision with root package name */
    public int f4707j;

    /* renamed from: k, reason: collision with root package name */
    public int f4708k;

    public p0(j2 j2Var, int i10, int i11) {
        this.f4705h = j2Var;
        this.f4706i = i11;
        this.f4707j = i10;
        this.f4708k = j2Var.f4638n;
        if (j2Var.f4637m) {
            l2.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4704g) {
            case 0:
                return this.f4707j < this.f4706i;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4704g) {
            case 0:
                j2 j2Var = this.f4705h;
                int i10 = j2Var.f4638n;
                int i11 = this.f4708k;
                if (i10 != i11) {
                    l2.f();
                }
                int i12 = this.f4707j;
                this.f4707j = l2.a(j2Var.f4631g, i12) + i12;
                return new k2(j2Var, i12, i11);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4704g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p0(j2 j2Var, int i10, q0 q0Var, z zVar) {
        this.f4705h = j2Var;
        this.f4706i = i10;
        this.f4707j = j2Var.f4638n;
    }
}
