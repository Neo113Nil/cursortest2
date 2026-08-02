package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class vzq extends zwf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public vzq(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long j6 = j5 - j4;
        this.d = j6;
        long j7 = j3 - j2;
        this.e = j7;
        this.f = j4 - (j7 - j6);
        msa msaVar = nsa.b;
        this.g = yd5.N(j7, ssa.MILLISECONDS);
        this.h = j2;
    }

    @Override // defpackage.zwf
    public final long E() {
        return this.g;
    }

    @Override // defpackage.zwf
    public final long F() {
        return this.b;
    }

    @Override // defpackage.zwf
    public final long L() {
        return this.f;
    }

    @Override // defpackage.zwf
    public final long M() {
        return this.h;
    }

    @Override // defpackage.zwf
    public final void e0(tf6 tf6Var, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, xdr xdrVar, xdr xdrVar2) {
        tf6Var.getClass();
        exoPlayer.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        exoPlayer.j0(new szq(new xqn(), tf6Var, exoPlayer, this, xdrVar, xdrVar2, 0));
    }

    @Override // defpackage.zwf
    public final Object f0(ExoPlayer exoPlayer, xdr xdrVar, Continuation continuation) {
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (defpackage.y2x.o(r12.a, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if (defpackage.hdg.M(r13, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v6, types: [bqi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006f -> B:11:0x0072). Please report as a decompilation issue!!! */
    @Override // defpackage.zwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(ExoPlayer exoPlayer, xdr xdrVar, Continuation continuation) {
        tzq tzqVar;
        int i;
        xdr xdrVar2;
        ExoPlayer exoPlayer2;
        bqi bqiVar;
        if (continuation instanceof tzq) {
            tzqVar = (tzq) continuation;
            int i2 = tzqVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tzqVar.n = i2 - Integer.MIN_VALUE;
                Object obj = tzqVar.l;
                nm6 nm6Var = nm6.a;
                i = tzqVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    tzqVar.j = exoPlayer;
                    tzqVar.k = xdrVar;
                    tzqVar.n = 1;
                    xdrVar2 = xdrVar;
                } else if (i == 1) {
                    ?? r14 = tzqVar.k;
                    exoPlayer = tzqVar.j;
                    qgg.h0(obj);
                    xdrVar2 = r14;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bqiVar = tzqVar.k;
                    exoPlayer2 = tzqVar.j;
                    qgg.h0(obj);
                    long J0 = exoPlayer2.J0();
                    long j = this.c;
                    if (J0 <= j && this.b <= J0) {
                        Float f = new Float(zwf.w(j, J0, this.e));
                        xdr xdrVar3 = (xdr) bqiVar;
                        xdrVar3.getClass();
                        xdrVar3.m(null, f);
                    }
                    if (exoPlayer2.J0() < this.c || !exoPlayer2.e()) {
                        Float f2 = new Float(1.0f);
                        xdr xdrVar4 = (xdr) bqiVar;
                        xdrVar4.getClass();
                        xdrVar4.m(null, f2);
                        return Unit.a;
                    }
                    tzqVar.j = exoPlayer2;
                    tzqVar.k = bqiVar;
                    tzqVar.n = 2;
                }
                xdr xdrVar5 = xdrVar2;
                exoPlayer2 = exoPlayer;
                bqiVar = xdrVar5;
                if (exoPlayer2.J0() < this.c) {
                }
                Float f22 = new Float(1.0f);
                xdr xdrVar42 = (xdr) bqiVar;
                xdrVar42.getClass();
                xdrVar42.m(null, f22);
                return Unit.a;
            }
        }
        tzqVar = new tzq(this, (cg6) continuation);
        Object obj2 = tzqVar.l;
        nm6 nm6Var2 = nm6.a;
        i = tzqVar.n;
        if (i != 0) {
        }
        xdr xdrVar52 = xdrVar2;
        exoPlayer2 = exoPlayer;
        bqiVar = xdrVar52;
        if (exoPlayer2.J0() < this.c) {
        }
        Float f222 = new Float(1.0f);
        xdr xdrVar422 = (xdr) bqiVar;
        xdrVar422.getClass();
        xdrVar422.m(null, f222);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.zwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(ExoPlayer exoPlayer, cg6 cg6Var) {
        uzq uzqVar;
        nm6 nm6Var;
        int i;
        long J0;
        long j;
        long J02;
        if (cg6Var instanceof uzq) {
            uzqVar = (uzq) cg6Var;
            int i2 = uzqVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uzqVar.m = i2 - Integer.MIN_VALUE;
                Object obj = uzqVar.k;
                nm6Var = nm6.a;
                i = uzqVar.m;
                if (i != 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    exoPlayer = uzqVar.j;
                }
                qgg.h0(obj);
                do {
                    J0 = exoPlayer.J0();
                    j = this.f;
                    if (J0 >= j) {
                        J02 = j - exoPlayer.J0();
                        if (J02 > 500) {
                            uzqVar.j = exoPlayer;
                            uzqVar.m = 1;
                        }
                    }
                    return Unit.a;
                } while (y2x.o(J02, uzqVar) != nm6Var);
                return nm6Var;
            }
        }
        uzqVar = new uzq(this, cg6Var);
        Object obj2 = uzqVar.k;
        nm6Var = nm6.a;
        i = uzqVar.m;
        if (i != 0) {
        }
        qgg.h0(obj2);
        do {
            J0 = exoPlayer.J0();
            j = this.f;
            if (J0 >= j) {
            }
            return Unit.a;
        } while (y2x.o(J02, uzqVar) != nm6Var);
        return nm6Var;
    }

    @Override // defpackage.zwf
    public final boolean z(long j) {
        return this.f - j <= 0;
    }
}
