package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xzq extends zwf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public xzq(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j5 - j4;
        long j6 = j3 - j2;
        this.e = j6;
        this.f = j4 - j2;
        msa msaVar = nsa.b;
        this.g = yd5.N(j6, ssa.MILLISECONDS);
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
        return 0L;
    }

    @Override // defpackage.zwf
    public final void e0(tf6 tf6Var, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, xdr xdrVar, xdr xdrVar2) {
        tf6Var.getClass();
        exoPlayer.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        exoPlayer.j0(new szq(new xqn(), tf6Var, exoPlayer, this, xdrVar, xdrVar2, 1));
    }

    @Override // defpackage.zwf
    public final Object f0(ExoPlayer exoPlayer, xdr xdrVar, Continuation continuation) {
        return Unit.a;
    }

    @Override // defpackage.zwf
    public final Object g0(ExoPlayer exoPlayer, xdr xdrVar, Continuation continuation) {
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
        wzq wzqVar;
        nm6 nm6Var;
        int i;
        long J0;
        long j;
        long J02;
        if (cg6Var instanceof wzq) {
            wzqVar = (wzq) cg6Var;
            int i2 = wzqVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wzqVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wzqVar.k;
                nm6Var = nm6.a;
                i = wzqVar.m;
                if (i != 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    exoPlayer = wzqVar.j;
                }
                qgg.h0(obj);
                do {
                    J0 = exoPlayer.J0();
                    j = this.f;
                    if (J0 >= j) {
                        J02 = j - exoPlayer.J0();
                        if (J02 > 500) {
                            wzqVar.j = exoPlayer;
                            wzqVar.m = 1;
                        }
                    }
                    return Unit.a;
                } while (y2x.o(J02, wzqVar) != nm6Var);
                return nm6Var;
            }
        }
        wzqVar = new wzq(this, cg6Var);
        Object obj2 = wzqVar.k;
        nm6Var = nm6.a;
        i = wzqVar.m;
        if (i != 0) {
        }
        qgg.h0(obj2);
        do {
            J0 = exoPlayer.J0();
            j = this.f;
            if (J0 >= j) {
            }
            return Unit.a;
        } while (y2x.o(J02, wzqVar) != nm6Var);
        return nm6Var;
    }

    @Override // defpackage.zwf
    public final boolean z(long j) {
        return this.f - j <= 0;
    }
}
