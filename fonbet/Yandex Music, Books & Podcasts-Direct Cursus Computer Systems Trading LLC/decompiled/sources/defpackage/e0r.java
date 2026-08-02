package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class e0r extends zwf {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;

    public e0r(long j, long j2, long j3, long j4, long j5, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = j2;
                this.d = j3;
                this.e = j4;
                this.f = j5;
                long j6 = j3 - j2;
                this.g = j6;
                this.h = j5 - j4;
                long j7 = j3 - j5;
                this.i = j7;
                msa msaVar = nsa.b;
                this.j = yd5.N(j6, ssa.MILLISECONDS);
                this.k = Math.min(j7, j2);
                break;
            default:
                this.b = j;
                this.c = j2;
                this.d = j3;
                this.e = j4;
                this.f = j5;
                long j8 = j3 - j2;
                this.g = j8;
                long j9 = j5 - j4;
                this.h = j9;
                this.i = j2;
                msa msaVar2 = nsa.b;
                this.j = yd5.N(j8, ssa.MILLISECONDS);
                this.k = j4 - (j8 - j9);
                break;
        }
    }

    @Override // defpackage.zwf
    public final long E() {
        switch (this.a) {
        }
        return this.j;
    }

    @Override // defpackage.zwf
    public final long F() {
        switch (this.a) {
        }
        return this.e;
    }

    @Override // defpackage.zwf
    public final long L() {
        switch (this.a) {
        }
        return this.i;
    }

    @Override // defpackage.zwf
    public final long M() {
        switch (this.a) {
            case 0:
                return this.k;
            default:
                return 0L;
        }
    }

    @Override // defpackage.zwf
    public final void e0(tf6 tf6Var, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, xdr xdrVar, xdr xdrVar2) {
        int i = this.a;
        tf6Var.getClass();
        exoPlayer.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        switch (i) {
            case 0:
                exoPlayer.j0(new a0r(new xqn(), tf6Var, exoPlayer, this, xdrVar, 0));
                x97.y(tf6Var, null, null, new st7(exoPlayer2, xdrVar2, this, null, 3), 3);
                break;
            default:
                exoPlayer.j0(new a0r(new xqn(), tf6Var, exoPlayer, this, xdrVar, 1));
                x97.y(tf6Var, null, null, new st7(exoPlayer2, xdrVar2, this, null, 4), 3);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Type inference failed for: r14v4, types: [bqi] */
    /* JADX WARN: Type inference failed for: r14v9, types: [bqi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:12:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e3 -> B:36:0x00e6). Please report as a decompilation issue!!! */
    @Override // defpackage.zwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(ExoPlayer exoPlayer, xdr xdrVar, Continuation continuation) {
        b0r b0rVar;
        int i;
        xdr xdrVar2;
        f0r f0rVar;
        int i2;
        xdr xdrVar3;
        switch (this.a) {
            case 0:
                if (continuation instanceof b0r) {
                    b0rVar = (b0r) continuation;
                    int i3 = b0rVar.n;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b0rVar.n = i3 - Integer.MIN_VALUE;
                        Object obj = b0rVar.l;
                        nm6 nm6Var = nm6.a;
                        i = b0rVar.n;
                        long j = this.i;
                        if (i != 0) {
                            qgg.h0(obj);
                            if (j > this.c) {
                                xdrVar2 = xdrVar;
                                if (exoPlayer.J0() < j) {
                                }
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            ?? r14 = b0rVar.k;
                            ExoPlayer exoPlayer2 = b0rVar.j;
                            qgg.h0(obj);
                            xdrVar2 = r14;
                            exoPlayer = exoPlayer2;
                            Float f = new Float(1 - zwf.w(this.d, exoPlayer.J0(), this.g));
                            xdr xdrVar4 = xdrVar2;
                            xdrVar4.getClass();
                            xdrVar4.m(null, f);
                            if (exoPlayer.J0() < j && exoPlayer.e()) {
                                b0rVar.j = exoPlayer;
                                b0rVar.k = xdrVar2;
                                b0rVar.n = 1;
                                if (y2x.o(this.b, b0rVar) == nm6Var) {
                                }
                                Float f2 = new Float(1 - zwf.w(this.d, exoPlayer.J0(), this.g));
                                xdr xdrVar42 = xdrVar2;
                                xdrVar42.getClass();
                                xdrVar42.m(null, f2);
                                if (exoPlayer.J0() < j) {
                                    b0rVar.j = exoPlayer;
                                    b0rVar.k = xdrVar2;
                                    b0rVar.n = 1;
                                    if (y2x.o(this.b, b0rVar) == nm6Var) {
                                    }
                                    Float f22 = new Float(1 - zwf.w(this.d, exoPlayer.J0(), this.g));
                                    xdr xdrVar422 = xdrVar2;
                                    xdrVar422.getClass();
                                    xdrVar422.m(null, f22);
                                    if (exoPlayer.J0() < j) {
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                b0rVar = new b0r(this, (cg6) continuation);
                Object obj2 = b0rVar.l;
                nm6 nm6Var2 = nm6.a;
                i = b0rVar.n;
                long j2 = this.i;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof f0r) {
                    f0rVar = (f0r) continuation;
                    int i4 = f0rVar.n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        f0rVar.n = i4 - Integer.MIN_VALUE;
                        Object obj3 = f0rVar.l;
                        nm6 nm6Var3 = nm6.a;
                        i2 = f0rVar.n;
                        long j3 = this.i;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            if (j3 > this.c) {
                                xdrVar3 = xdrVar;
                                if (exoPlayer.J0() < j3) {
                                }
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            ?? r142 = f0rVar.k;
                            ExoPlayer exoPlayer3 = f0rVar.j;
                            qgg.h0(obj3);
                            xdrVar3 = r142;
                            exoPlayer = exoPlayer3;
                            Float f3 = new Float(1 - zwf.w(this.d, exoPlayer.J0(), this.g));
                            xdr xdrVar5 = xdrVar3;
                            xdrVar5.getClass();
                            xdrVar5.m(null, f3);
                            if (exoPlayer.J0() < j3 && exoPlayer.e()) {
                                f0rVar.j = exoPlayer;
                                f0rVar.k = xdrVar3;
                                f0rVar.n = 1;
                                if (y2x.o(this.b, f0rVar) == nm6Var3) {
                                }
                                Float f32 = new Float(1 - zwf.w(this.d, exoPlayer.J0(), this.g));
                                xdr xdrVar52 = xdrVar3;
                                xdrVar52.getClass();
                                xdrVar52.m(null, f32);
                                if (exoPlayer.J0() < j3) {
                                    f0rVar.j = exoPlayer;
                                    f0rVar.k = xdrVar3;
                                    f0rVar.n = 1;
                                    if (y2x.o(this.b, f0rVar) == nm6Var3) {
                                    }
                                    Float f322 = new Float(1 - zwf.w(this.d, exoPlayer.J0(), this.g));
                                    xdr xdrVar522 = xdrVar3;
                                    xdrVar522.getClass();
                                    xdrVar522.m(null, f322);
                                    if (exoPlayer.J0() < j3) {
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                f0rVar = new f0r(this, (cg6) continuation);
                Object obj32 = f0rVar.l;
                nm6 nm6Var32 = nm6.a;
                i2 = f0rVar.n;
                long j32 = this.i;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Type inference failed for: r14v6, types: [bqi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0078 -> B:16:0x007b). Please report as a decompilation issue!!! */
    @Override // defpackage.zwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(ExoPlayer exoPlayer, xdr xdrVar, Continuation continuation) {
        c0r c0rVar;
        int i;
        xdr xdrVar2;
        ExoPlayer exoPlayer2;
        bqi bqiVar;
        switch (this.a) {
            case 0:
                if (continuation instanceof c0r) {
                    c0rVar = (c0r) continuation;
                    int i2 = c0rVar.n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0rVar.n = i2 - Integer.MIN_VALUE;
                        Object obj = c0rVar.l;
                        nm6 nm6Var = nm6.a;
                        i = c0rVar.n;
                        if (i != 0) {
                            qgg.h0(obj);
                            c0rVar.j = exoPlayer;
                            c0rVar.k = xdrVar;
                            c0rVar.n = 1;
                            xdrVar2 = xdrVar;
                            if (hdg.M(exoPlayer, c0rVar) == nm6Var) {
                            }
                        } else if (i == 1) {
                            ?? r14 = c0rVar.k;
                            exoPlayer = c0rVar.j;
                            qgg.h0(obj);
                            xdrVar2 = r14;
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            bqiVar = c0rVar.k;
                            exoPlayer2 = c0rVar.j;
                            qgg.h0(obj);
                            long J0 = exoPlayer2.J0();
                            long j = this.f;
                            if (J0 <= j && this.e <= J0) {
                                Float f = new Float(zwf.w(j, J0, this.h));
                                xdr xdrVar3 = (xdr) bqiVar;
                                xdrVar3.getClass();
                                xdrVar3.m(null, f);
                            }
                            if (exoPlayer2.J0() < this.f || !exoPlayer2.e()) {
                                Float f2 = new Float(1.0f);
                                xdr xdrVar4 = (xdr) bqiVar;
                                xdrVar4.getClass();
                                xdrVar4.m(null, f2);
                                break;
                            } else {
                                c0rVar.j = exoPlayer2;
                                c0rVar.k = bqiVar;
                                c0rVar.n = 2;
                                if (y2x.o(this.b, c0rVar) == nm6Var) {
                                }
                                long J02 = exoPlayer2.J0();
                                long j2 = this.f;
                                if (J02 <= j2) {
                                    Float f3 = new Float(zwf.w(j2, J02, this.h));
                                    xdr xdrVar32 = (xdr) bqiVar;
                                    xdrVar32.getClass();
                                    xdrVar32.m(null, f3);
                                }
                                if (exoPlayer2.J0() < this.f) {
                                }
                                Float f22 = new Float(1.0f);
                                xdr xdrVar42 = (xdr) bqiVar;
                                xdrVar42.getClass();
                                xdrVar42.m(null, f22);
                            }
                        }
                        xdr xdrVar5 = xdrVar2;
                        exoPlayer2 = exoPlayer;
                        bqiVar = xdrVar5;
                        if (exoPlayer2.J0() < this.f) {
                        }
                        Float f222 = new Float(1.0f);
                        xdr xdrVar422 = (xdr) bqiVar;
                        xdrVar422.getClass();
                        xdrVar422.m(null, f222);
                    }
                }
                c0rVar = new c0r(this, (cg6) continuation);
                Object obj2 = c0rVar.l;
                nm6 nm6Var2 = nm6.a;
                i = c0rVar.n;
                if (i != 0) {
                }
                xdr xdrVar52 = xdrVar2;
                exoPlayer2 = exoPlayer;
                bqiVar = xdrVar52;
                if (exoPlayer2.J0() < this.f) {
                }
                Float f2222 = new Float(1.0f);
                xdr xdrVar4222 = (xdr) bqiVar;
                xdrVar4222.getClass();
                xdrVar4222.m(null, f2222);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8 A[SYNTHETIC] */
    @Override // defpackage.zwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(ExoPlayer exoPlayer, cg6 cg6Var) {
        d0r d0rVar;
        nm6 nm6Var;
        int i;
        long J0;
        long j;
        long J02;
        g0r g0rVar;
        nm6 nm6Var2;
        int i2;
        long J03;
        long j2;
        long J04;
        switch (this.a) {
            case 0:
                if (cg6Var instanceof d0r) {
                    d0rVar = (d0r) cg6Var;
                    int i3 = d0rVar.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        d0rVar.m = i3 - Integer.MIN_VALUE;
                        Object obj = d0rVar.k;
                        nm6Var = nm6.a;
                        i = d0rVar.m;
                        if (i != 0) {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                exoPlayer = d0rVar.j;
                            }
                        }
                        qgg.h0(obj);
                        do {
                            J0 = exoPlayer.J0();
                            j = this.c;
                            if (J0 >= j) {
                                J02 = j - exoPlayer.J0();
                                if (J02 > 500) {
                                    d0rVar.j = exoPlayer;
                                    d0rVar.m = 1;
                                }
                            }
                            break;
                        } while (y2x.o(J02, d0rVar) != nm6Var);
                    }
                }
                d0rVar = new d0r(this, cg6Var);
                Object obj2 = d0rVar.k;
                nm6Var = nm6.a;
                i = d0rVar.m;
                if (i != 0) {
                }
                qgg.h0(obj2);
                do {
                    J0 = exoPlayer.J0();
                    j = this.c;
                    if (J0 >= j) {
                    }
                } while (y2x.o(J02, d0rVar) != nm6Var);
            default:
                if (cg6Var instanceof g0r) {
                    g0rVar = (g0r) cg6Var;
                    int i4 = g0rVar.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        g0rVar.m = i4 - Integer.MIN_VALUE;
                        Object obj3 = g0rVar.k;
                        nm6Var2 = nm6.a;
                        i2 = g0rVar.m;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                exoPlayer = g0rVar.j;
                            }
                        }
                        qgg.h0(obj3);
                        do {
                            J03 = exoPlayer.J0();
                            j2 = this.k;
                            if (J03 >= j2) {
                                J04 = j2 - exoPlayer.J0();
                                if (J04 > 500) {
                                    g0rVar.j = exoPlayer;
                                    g0rVar.m = 1;
                                }
                            }
                            break;
                        } while (y2x.o(J04, g0rVar) != nm6Var2);
                    }
                }
                g0rVar = new g0r(this, cg6Var);
                Object obj32 = g0rVar.k;
                nm6Var2 = nm6.a;
                i2 = g0rVar.m;
                if (i2 != 0) {
                }
                qgg.h0(obj32);
                do {
                    J03 = exoPlayer.J0();
                    j2 = this.k;
                    if (J03 >= j2) {
                    }
                } while (y2x.o(J04, g0rVar) != nm6Var2);
        }
        return Unit.a;
    }

    @Override // defpackage.zwf
    public final boolean z(long j) {
        switch (this.a) {
            case 0:
                if (this.i - j <= 0) {
                }
                break;
            default:
                if (this.k - j <= 0) {
                }
                break;
        }
        return false;
    }
}
