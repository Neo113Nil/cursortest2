package com.anythink.basead.exoplayer.h;

/* loaded from: classes.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    protected final z[] f7790a;

    public g(z[] zVarArr) {
        this.f7790a = zVarArr;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final void a_(long j9) {
        for (z zVar : this.f7790a) {
            zVar.a_(j9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final boolean c(long j9) {
        boolean z8;
        boolean z9 = false;
        do {
            long e6 = e();
            if (e6 == Long.MIN_VALUE) {
                return z9;
            }
            z8 = false;
            for (z zVar : this.f7790a) {
                long e9 = zVar.e();
                boolean z10 = e9 != Long.MIN_VALUE && e9 <= j9;
                if (e9 == e6 || z10) {
                    z8 |= zVar.c(j9);
                }
            }
            z9 |= z8;
        } while (z8);
        return z9;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long d() {
        long j9 = Long.MAX_VALUE;
        for (z zVar : this.f7790a) {
            long d2 = zVar.d();
            if (d2 != Long.MIN_VALUE) {
                j9 = Math.min(j9, d2);
            }
        }
        if (j9 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j9;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long e() {
        long j9 = Long.MAX_VALUE;
        for (z zVar : this.f7790a) {
            long e6 = zVar.e();
            if (e6 != Long.MIN_VALUE) {
                j9 = Math.min(j9, e6);
            }
        }
        if (j9 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j9;
    }
}
