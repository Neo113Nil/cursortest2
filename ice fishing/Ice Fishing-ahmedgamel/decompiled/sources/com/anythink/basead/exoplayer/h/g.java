package com.anythink.basead.exoplayer.h;

/* loaded from: classes.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    protected final z[] f8419a;

    public g(z[] zVarArr) {
        this.f8419a = zVarArr;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        for (z zVar : this.f8419a) {
            zVar.a_(j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        boolean z6;
        boolean z9 = false;
        do {
            long e9 = e();
            if (e9 == Long.MIN_VALUE) {
                return z9;
            }
            z6 = false;
            for (z zVar : this.f8419a) {
                long e10 = zVar.e();
                boolean z10 = e10 != Long.MIN_VALUE && e10 <= j6;
                if (e10 == e9 || z10) {
                    z6 |= zVar.c(j6);
                }
            }
            z9 |= z6;
        } while (z6);
        return z9;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long d() {
        long j6 = Long.MAX_VALUE;
        for (z zVar : this.f8419a) {
            long d9 = zVar.d();
            if (d9 != Long.MIN_VALUE) {
                j6 = Math.min(j6, d9);
            }
        }
        if (j6 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j6;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long e() {
        long j6 = Long.MAX_VALUE;
        for (z zVar : this.f8419a) {
            long e9 = zVar.e();
            if (e9 != Long.MIN_VALUE) {
                j6 = Math.min(j6, e9);
            }
        }
        if (j6 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j6;
    }
}
