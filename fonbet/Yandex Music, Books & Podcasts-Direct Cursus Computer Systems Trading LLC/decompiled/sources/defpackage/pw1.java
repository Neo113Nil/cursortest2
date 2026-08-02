package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class pw1 extends aur implements Function2 {
    public n4c j;
    public rdk k;
    public n4c l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ n4c r;
    public final /* synthetic */ rdk s;
    public final /* synthetic */ ExoPlayer t;
    public final /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(n4c n4cVar, rdk rdkVar, ExoPlayer exoPlayer, long j, Continuation continuation) {
        super(2, continuation);
        this.r = n4cVar;
        this.s = rdkVar;
        this.t = exoPlayer;
        this.u = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        pw1 pw1Var = new pw1(this.r, this.s, this.t, this.u, continuation);
        pw1Var.q = obj;
        return pw1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pw1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        n4c n4cVar;
        rdk rdkVar;
        int i;
        int i2;
        long j;
        n4c n4cVar2;
        n4c n4cVar3;
        Throwable th;
        mm6 mm6Var = (mm6) this.q;
        nm6 nm6Var = nm6.a;
        int i3 = this.p;
        if (i3 != 0) {
            if (i3 == 1) {
                i = this.o;
                i2 = this.n;
                j = this.m;
                n4cVar2 = this.l;
                rdkVar = this.k;
                n4c n4cVar4 = this.j;
                try {
                    qgg.h0(obj);
                    n4cVar = n4cVar4;
                } catch (Throwable th2) {
                    th = th2;
                    n4cVar3 = n4cVar4;
                }
            } else {
                if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n4cVar3 = this.j;
                try {
                    qgg.h0(obj);
                    n4cVar3.k = null;
                    return Unit.a;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            n4cVar3.k = null;
            throw th;
        }
        qgg.h0(obj);
        n4cVar = this.r;
        h4c h4cVar = h4c.QUEUE_LAUNCHER;
        rdkVar = this.s;
        ExoPlayer exoPlayer = this.t;
        long j2 = this.u;
        h4c h4cVar2 = n4cVar.k;
        if (h4cVar2 == null || 10 >= h4cVar2.a) {
            n4cVar.k = h4cVar;
            try {
                this.q = mm6Var;
                this.j = n4cVar;
                this.k = rdkVar;
                this.l = n4cVar;
                this.m = j2;
                i = 0;
                this.n = 0;
                this.o = 0;
                this.p = 1;
                if (rdk.h(rdkVar, exoPlayer, this) == nm6Var) {
                    return nm6Var;
                }
                i2 = 0;
                j = j2;
                n4cVar2 = n4cVar;
            } catch (Throwable th4) {
                n4cVar3 = n4cVar;
                th = th4;
            }
        }
        return Unit.a;
        ssg.a(3, "AudioFadeLauncherImpl", "launching autoplay fade-in with duration=" + j + " ms", null);
        alc alcVar = new alc(((efo) rdkVar.c).c(new a4c(j)).x(), new ow1(n4cVar2, (Continuation) null, 0));
        mw1 mw1Var = new mw1(mm6Var, n4cVar2, 1);
        this.q = null;
        this.j = n4cVar;
        this.k = null;
        this.l = null;
        this.n = i2;
        this.o = i;
        this.p = 2;
        if (alcVar.collect(mw1Var, this) != nm6Var) {
            n4cVar3 = n4cVar;
            n4cVar3.k = null;
            return Unit.a;
        }
        return nm6Var;
    }
}
