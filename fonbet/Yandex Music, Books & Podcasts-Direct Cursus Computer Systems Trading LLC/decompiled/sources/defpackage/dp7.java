package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dp7 implements wxi {
    public final o3k a;
    public final bxj b;

    public dp7(o3k o3kVar, bxj bxjVar) {
        this.a = o3kVar;
        this.b = bxjVar;
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.b == bxj.b ? j2 >> 32 : 4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.wxi
    public final Object k(long j, long j2, Continuation continuation) {
        return new yzt(this.b == bxj.a ? yzt.a(0.0f, 0.0f, 2, j2) : yzt.a(0.0f, 0.0f, 1, j2));
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        o3k o3kVar = this.a;
        if (Math.abs(o3kVar.k()) <= 1.0E-6d) {
            return 0L;
        }
        float k = o3kVar.k() * o3kVar.o();
        float f = ((o3kVar.l().b + o3kVar.l().c) * (-Math.signum(o3kVar.k()))) + k;
        if (o3kVar.k() > 0.0f) {
            f = k;
            k = f;
        }
        bxj bxjVar = bxj.b;
        bxj bxjVar2 = this.b;
        float f2 = -o3kVar.k.e(-yhn.c(Float.intBitsToFloat((int) (bxjVar2 == bxjVar ? j >> 32 : j & 4294967295L)), k, f));
        float intBitsToFloat = bxjVar2 == bxjVar ? f2 : Float.intBitsToFloat((int) (j >> 32));
        if (bxjVar2 != bxj.a) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }
}
