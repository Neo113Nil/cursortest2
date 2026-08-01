package com.anythink.basead.exoplayer.h;

/* loaded from: classes.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    protected final z[] f7633a;

    public g(z[] zVarArr) {
        this.f7633a = zVarArr;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        for (z zVar : this.f7633a) {
            zVar.a_(j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        boolean z3;
        boolean z6 = false;
        do {
            long e9 = e();
            if (e9 == Long.MIN_VALUE) {
                return z6;
            }
            z3 = false;
            for (z zVar : this.f7633a) {
                long e10 = zVar.e();
                boolean z9 = e10 != Long.MIN_VALUE && e10 <= j6;
                if (e10 == e9 || z9) {
                    z3 |= zVar.c(j6);
                }
            }
            z6 |= z3;
        } while (z3);
        return z6;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long d() {
        long j6 = Long.MAX_VALUE;
        for (z zVar : this.f7633a) {
            long d2 = zVar.d();
            if (d2 != Long.MIN_VALUE) {
                j6 = Math.min(j6, d2);
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
        for (z zVar : this.f7633a) {
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
