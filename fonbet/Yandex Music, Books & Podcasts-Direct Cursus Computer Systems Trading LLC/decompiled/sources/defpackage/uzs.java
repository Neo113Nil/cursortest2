package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class uzs extends aur implements Function2 {
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ExoPlayer m;
    public final /* synthetic */ Long n;
    public final /* synthetic */ tqn o;
    public final /* synthetic */ kvm p;
    public final /* synthetic */ ltm q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzs(ExoPlayer exoPlayer, Long l, tqn tqnVar, kvm kvmVar, ltm ltmVar, Continuation continuation) {
        super(2, continuation);
        this.m = exoPlayer;
        this.n = l;
        this.o = tqnVar;
        this.p = kvmVar;
        this.q = ltmVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        uzs uzsVar = new uzs(this.m, this.n, this.o, this.p, this.q, continuation);
        uzsVar.l = obj;
        return uzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uzs) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        if (defpackage.hdg.M(r10, r18) != r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        if (defpackage.y2x.o(1000, r18) == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        if (defpackage.y2x.o(10000, r18) == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0074, code lost:
    
        if (r3 == r2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00cc -> B:12:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e2 -> B:11:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f5 -> B:11:0x00e5). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        tqn tqnVar;
        char c;
        mm6 mm6Var = (mm6) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        tqn tqnVar2 = this.o;
        Long l = this.n;
        ExoPlayer exoPlayer = this.m;
        if (i == 0) {
            qgg.h0(obj);
            this.l = mm6Var;
            this.k = 1;
            zt3 zt3Var = new zt3(1, qxe.b(this));
            zt3Var.s();
            if (exoPlayer.c() == 3) {
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(Unit.a);
            } else {
                rzs rzsVar = new rzs(zt3Var, exoPlayer);
                exoPlayer.j0(rzsVar);
                zt3Var.u(new kw1(4, exoPlayer, rzsVar));
            }
            Object q = zt3Var.q();
            if (q != nm6Var) {
                q = Unit.a;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    longValue = this.j;
                    qgg.h0(obj);
                    tqnVar = tqnVar2;
                    c = 3;
                    tqnVar2 = tqnVar;
                    if (gld.T(mm6Var) && !tqnVar2.a) {
                        this.l = mm6Var;
                        this.j = longValue;
                        this.k = 2;
                    }
                    return Unit.a;
                }
                longValue = this.j;
                qgg.h0(obj);
                tqnVar = tqnVar2;
                long max = Math.max(longValue - (20 * 1000), longValue / 2) - Math.max(exoPlayer.J0(), 0L);
                if (max <= 0) {
                    if (!lco.u(exoPlayer, l, this.p, tqnVar, this.q)) {
                        tqnVar2 = tqnVar;
                        if (gld.T(mm6Var)) {
                        }
                    }
                    return Unit.a;
                }
                if (max <= 20000) {
                    this.l = mm6Var;
                    this.j = longValue;
                    c = 3;
                    this.k = 3;
                } else {
                    c = 3;
                    this.l = mm6Var;
                    this.j = longValue;
                    this.k = 4;
                }
                if (gld.T(mm6Var)) {
                    this.l = mm6Var;
                    this.j = longValue;
                    this.k = 2;
                }
                return Unit.a;
            }
            qgg.h0(obj);
        }
        if (l != null) {
            longValue = l.longValue();
        } else {
            Long N = ywf.N(exoPlayer);
            if (N == null) {
                return Unit.a;
            }
            longValue = N.longValue();
        }
        if (gld.T(mm6Var)) {
        }
        return Unit.a;
    }
}
