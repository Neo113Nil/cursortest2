package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PauseOnQueueEndCommand;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$SetQueuePosition;
import com.yandex.passport.api.exception.c;
import com.yandex.passport.api.n;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.y1;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.common.url.b;
import com.yandex.passport.internal.entities.k;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.e;
import com.yandex.passport.internal.report.x9;
import com.yandex.passport.internal.ui.bouncer.model.b1;
import com.yandex.passport.internal.ui.bouncer.model.c0;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import com.yandex.passport.internal.ui.bouncer.model.f1;
import com.yandex.passport.internal.ui.bouncer.model.g0;
import com.yandex.passport.internal.ui.bouncer.model.h0;
import com.yandex.passport.internal.ui.bouncer.model.h1;
import com.yandex.passport.internal.ui.bouncer.model.i0;
import com.yandex.passport.internal.ui.bouncer.model.j1;
import com.yandex.passport.internal.ui.bouncer.model.l0;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.m0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.a0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.n0;
import com.yandex.passport.internal.ui.bouncer.model.p0;
import com.yandex.passport.internal.ui.bouncer.model.q;
import com.yandex.passport.internal.ui.bouncer.model.q0;
import com.yandex.passport.internal.ui.bouncer.model.r0;
import com.yandex.passport.internal.ui.bouncer.model.s;
import com.yandex.passport.internal.ui.bouncer.model.s0;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t;
import com.yandex.passport.internal.ui.bouncer.model.t0;
import com.yandex.passport.internal.ui.bouncer.model.u0;
import com.yandex.passport.internal.ui.bouncer.model.v;
import com.yandex.passport.internal.ui.bouncer.model.v0;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.x;
import com.yandex.passport.internal.ui.bouncer.model.y0;
import com.yandex.passport.internal.ui.domik.p;
import com.yandex.passport.internal.ui.domik.w;
import com.yandex.passport.internal.upgrader.m;
import com.yandex.passport.internal.usecase.ui.f0;
import com.yandex.passport.internal.y;
import com.yandex.passport.sloth.data.e0;
import com.yandex.passport.sloth.data.o;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.data.u;
import com.yandex.passport.sloth.data.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gv6 extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gv6(Continuation continuation, uyc uycVar) {
        super(3, continuation);
        this.j = 2;
        this.n = (aur) uycVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (defpackage.zsd.e0(r1, (defpackage.pjc) r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r7 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        rjc rjcVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            rjcVar = (rjc) this.l;
            orw orwVar = (orw) this.m;
            jsw jswVar = (jsw) this.n;
            this.l = null;
            this.m = null;
            this.o = rjcVar;
            this.k = 1;
            obj = jswVar.a(orwVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rjcVar = (rjc) this.o;
            qgg.h0(obj);
        }
        this.l = null;
        this.m = null;
        this.o = null;
        this.k = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        if (defpackage.zsd.e0(r2, r0, r7) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r8 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        rjc rjcVar;
        fs fsVar;
        qfw qfwVar = (qfw) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Object obj2 = null;
        if (i == 0) {
            qgg.h0(obj);
            rjcVar = (rjc) this.l;
            orw orwVar = (orw) this.m;
            String str = qfw.H;
            akw akwVar = (akw) qfwVar.e.getValue();
            this.l = null;
            this.m = null;
            this.o = rjcVar;
            this.k = 1;
            obj = akwVar.j(orwVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rjcVar = (rjc) this.o;
            qgg.h0(obj);
        }
        jjw jjwVar = (jjw) obj;
        int i2 = 15;
        if (jjwVar instanceof ijw) {
            fsVar = new fs(i2, ((ijw) jjwVar).a);
        } else if (jjwVar instanceof fjw) {
            fsVar = new fs(i2, obj2);
        } else {
            if (!(jjwVar instanceof hjw)) {
                b6e.s();
                return null;
            }
            String str2 = qfw.H;
            ((ndw) qfwVar.q.getValue()).getClass();
            nmb nmbVar = w64.a;
            gjw gjwVar = gjw.a;
            w64.b(ulb.Logic, w64.a("YnisonLoaderException", "reason: ".concat("NO_DEVICES")));
            fsVar = new fs(i2, obj2);
        }
        this.l = null;
        this.m = null;
        this.o = null;
        this.k = 2;
    }

    private final Object n(Object obj) {
        l lVar;
        k kVar;
        y1 y1Var;
        a0 a0Var = (a0) this.o;
        q qVar = (q) this.m;
        l1 l1Var = (l1) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Boolean bool = null;
        if (i == 0) {
            qgg.h0(obj);
            l lVar2 = qVar.a.a;
            m mVar = a0Var.a;
            f fVar = lVar2.b;
            this.m = qVar;
            this.n = l1Var;
            this.l = lVar2;
            this.k = 1;
            Object g = mVar.g(fVar, this);
            if (g == nm6Var) {
                return nm6Var;
            }
            lVar = lVar2;
            obj = g;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = (l) this.l;
            qgg.h0(obj);
        }
        Object obj2 = ((z7o) obj).a;
        Throwable a = z7o.a(obj2);
        if (a != null) {
            e eVar = a0Var.b;
            f fVar2 = lVar.b;
            eVar.getClass();
            fVar2.getClass();
            eVar.n(com.yandex.passport.internal.report.q.d, new ff(fVar2), new ff(a));
            j1 j1Var = qVar.a;
            j1Var.f.addAll(u75.h(w.d, w.c, w.b));
            return new i0(j1Var);
        }
        String str = ((b) obj2).a;
        if (a.a.isEnabled()) {
            a.c(com.yandex.passport.common.logger.b.b, null, "Start show account upgrade", 8);
        }
        f fVar3 = lVar.b;
        com.yandex.passport.internal.properties.l lVar3 = l1Var.c;
        o S = (lVar3 == null || (y1Var = lVar3.e) == null) ? o.c : com.yandex.plus.core.network.api.utils.a.S(y1Var);
        com.yandex.passport.internal.properties.l lVar4 = l1Var.c;
        n f = qVar.a.a.f();
        if (lVar4 != null && (kVar = lVar4.d) != null) {
            bool = Boolean.valueOf(kVar.j().contains(f));
        }
        return new g0(new com.yandex.passport.sloth.data.m(new u(str, fVar3, S, !(bool != null ? bool.booleanValue() : false)), lVar.b.a, new com.yandex.passport.common.properties.a(14, false, false), 4));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [aur, uyc] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, vyc] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                gv6 gv6Var = new gv6((Continuation) obj3, (ExoPlayer) this.n, (Long) this.o, 0);
                gv6Var.l = (rjc) obj;
                gv6Var.m = obj2;
                return gv6Var.invokeSuspend(Unit.a);
            case 1:
                gv6 gv6Var2 = new gv6((kr7) this.o, (Continuation) obj3, 1);
                gv6Var2.m = (mwu) obj;
                gv6Var2.n = (noh) obj2;
                return gv6Var2.invokeSuspend(Unit.a);
            case 2:
                gv6 gv6Var3 = new gv6((Continuation) obj3, (uyc) this.n);
                gv6Var3.l = (rjc) obj;
                gv6Var3.m = (Object[]) obj2;
                return gv6Var3.invokeSuspend(Unit.a);
            case 3:
                gv6 gv6Var4 = new gv6((Continuation) obj3, (vyc) this.m);
                gv6Var4.l = (rjc) obj;
                gv6Var4.n = (Object[]) obj2;
                return gv6Var4.invokeSuspend(Unit.a);
            case 4:
                gv6 gv6Var5 = new gv6((Continuation) obj3, this.n, 4);
                gv6Var5.l = (rjc) obj;
                gv6Var5.m = (Object[]) obj2;
                return gv6Var5.invokeSuspend(Unit.a);
            case 5:
                gv6 gv6Var6 = new gv6((Continuation) obj3, this.n, 5);
                gv6Var6.l = (rjc) obj;
                gv6Var6.m = (Object[]) obj2;
                return gv6Var6.invokeSuspend(Unit.a);
            case 6:
                gv6 gv6Var7 = new gv6((Continuation) obj3, this.n, 6);
                gv6Var7.l = (rjc) obj;
                gv6Var7.m = (Object[]) obj2;
                return gv6Var7.invokeSuspend(Unit.a);
            case 7:
                gv6 gv6Var8 = new gv6((Continuation) obj3, (qke) this.n, (mm6) this.o, 7);
                gv6Var8.l = (rjc) obj;
                gv6Var8.m = obj2;
                return gv6Var8.invokeSuspend(Unit.a);
            case 8:
                gv6 gv6Var9 = new gv6((Continuation) obj3, (pjc) this.n, (toh) this.o, 8);
                gv6Var9.l = (rjc) obj;
                gv6Var9.m = obj2;
                return gv6Var9.invokeSuspend(Unit.a);
            case 9:
                gv6 gv6Var10 = new gv6((Continuation) obj3, (dn9) this.n, (mwk) this.o, 9);
                gv6Var10.l = (rjc) obj;
                gv6Var10.m = obj2;
                return gv6Var10.invokeSuspend(Unit.a);
            case 10:
                gv6 gv6Var11 = new gv6((Continuation) obj3, (nsl) this.n, (cvl) this.o, 10);
                gv6Var11.l = (rjc) obj;
                gv6Var11.m = obj2;
                return gv6Var11.invokeSuspend(Unit.a);
            case 11:
                gv6 gv6Var12 = new gv6((Continuation) obj3, (mm6) this.n, (pyp) this.o, 11);
                gv6Var12.l = (rjc) obj;
                gv6Var12.m = obj2;
                return gv6Var12.invokeSuspend(Unit.a);
            case 12:
                gv6 gv6Var13 = new gv6((Continuation) obj3, (ArrayList) this.n, (Context) this.o, 12);
                gv6Var13.l = (rjc) obj;
                gv6Var13.m = (Object[]) obj2;
                return gv6Var13.invokeSuspend(Unit.a);
            case 13:
                gv6 gv6Var14 = new gv6((Continuation) obj3, (u21) this.n, (jyr) this.o, 13);
                gv6Var14.l = (rjc) obj;
                gv6Var14.m = obj2;
                return gv6Var14.invokeSuspend(Unit.a);
            case 14:
                gv6 gv6Var15 = new gv6((Continuation) obj3, (brl) this.n, 14);
                gv6Var15.l = (rjc) obj;
                gv6Var15.m = (Object[]) obj2;
                return gv6Var15.invokeSuspend(Unit.a);
            case 15:
                gv6 gv6Var16 = new gv6((Continuation) obj3, (w5u) this.n, (x1u) this.o, 15);
                gv6Var16.l = (rjc) obj;
                gv6Var16.m = obj2;
                return gv6Var16.invokeSuspend(Unit.a);
            case 16:
                gv6 gv6Var17 = new gv6((Continuation) obj3, (jsw) this.n, 16);
                gv6Var17.l = (rjc) obj;
                gv6Var17.m = obj2;
                return gv6Var17.invokeSuspend(Unit.a);
            case 17:
                gv6 gv6Var18 = new gv6((Continuation) obj3, (qfw) this.n, 17);
                gv6Var18.l = (rjc) obj;
                gv6Var18.m = obj2;
                return gv6Var18.invokeSuspend(Unit.a);
            case 18:
                gv6 gv6Var19 = new gv6((a0) this.o, (Continuation) obj3, 18);
                gv6Var19.m = (q) obj;
                gv6Var19.n = (l1) obj2;
                return gv6Var19.invokeSuspend(Unit.a);
            default:
                gv6 gv6Var20 = new gv6((n0) this.o, (Continuation) obj3, 19);
                gv6Var20.m = (t) obj;
                gv6Var20.n = (l1) obj2;
                return gv6Var20.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f0, code lost:
    
        if (r0 == r3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x036b, code lost:
    
        if (r9.emit(r1, r6) == r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x035c, code lost:
    
        if (r1 == r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0725, code lost:
    
        if (r9.emit(r1, r6) == r0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0716, code lost:
    
        if (r1 == r0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0790, code lost:
    
        if (r14.emit(r0, r6) == r13) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0781, code lost:
    
        if (r0 == r13) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0818, code lost:
    
        if (r1.emit(r2, r6) == r0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0809, code lost:
    
        if (r2 == r0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x087e, code lost:
    
        if (r9.emit(r0, r6) == r13) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x086f, code lost:
    
        if (r0 == r13) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08dc, code lost:
    
        if (r9.emit(r0, r6) == r13) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x08cd, code lost:
    
        if (r0 == r13) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x09a9, code lost:
    
        if (defpackage.r1l.c(r9, r12.e) == false) goto L355;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0a04  */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, vyc] */
    /* JADX WARN: Type inference failed for: r1v100, types: [com.yandex.passport.internal.ui.bouncer.model.m0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [aur, uyc] */
    /* JADX WARN: Type inference failed for: r1v73, types: [com.yandex.passport.internal.ui.bouncer.model.w0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        e5q e5qVar;
        tyu tyuVar;
        nyn nynVar;
        long j;
        xys xysVar;
        noh nohVar;
        t0q t0qVar;
        h4q h4qVar;
        b3l b3lVar;
        boolean z;
        Object b;
        jzs jzsVar;
        Long l;
        t0q t0qVar2;
        k7q k7qVar;
        yku ykuVar;
        rjc rjcVar;
        Object b2;
        rjc rjcVar2;
        Object f;
        rjc rjcVar3;
        Object invokeSuspend;
        rjc rjcVar4;
        Object i;
        rjc rjcVar5;
        Object invokeSuspend2;
        eno b3;
        pjc mpqVar;
        rjc rjcVar6;
        Object ujcVar;
        Object obj2;
        Object g;
        com.yandex.passport.internal.ui.bouncer.model.o oVar;
        gv6 gv6Var = this;
        int i2 = 7;
        int i3 = 5;
        int i4 = 4;
        int i5 = 2;
        int i6 = 0;
        int i7 = 1;
        Continuation continuation = null;
        switch (gv6Var.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i8 = gv6Var.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar7 = (rjc) gv6Var.l;
                    ExoPlayer exoPlayer = (ExoPlayer) gv6Var.n;
                    Long l2 = (Long) gv6Var.o;
                    exoPlayer.getClass();
                    ss3 I = zsd.I(new fpq(exoPlayer, l2, (Continuation) null, 28));
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    if (zsd.e0(rjcVar7, I, gv6Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                kr7 kr7Var = (kr7) gv6Var.o;
                xdr xdrVar = kr7Var.o;
                mzu mzuVar = kr7Var.g;
                mwu mwuVar = (mwu) gv6Var.m;
                noh nohVar2 = (noh) gv6Var.n;
                nm6 nm6Var2 = nm6.a;
                int i9 = gv6Var.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    if (!(mwuVar instanceof fwu)) {
                        if (!(mwuVar instanceof bwu)) {
                            if (mwuVar instanceof gwu) {
                                s7q s7qVar = new s7q(kr7Var);
                                xdrVar.getClass();
                                xdrVar.m(null, s7qVar);
                                gld.L(kr7Var.n, null);
                            } else if (!Intrinsics.d(mwuVar, yvu.a)) {
                                b6e.s();
                                return null;
                            }
                            return Unit.a;
                        }
                        awu awuVar = ((bwu) mwuVar).c;
                        int i10 = awuVar == null ? -1 : qq7.a[awuVar.ordinal()];
                        if (i10 == -1) {
                            do {
                                value = xdrVar.getValue();
                                q7q q = pcg.q((t7q) value);
                                if (q == null) {
                                    return Unit.a;
                                }
                                szu szuVar = (szu) q.a;
                                e5qVar = szuVar.a;
                                tyuVar = szuVar.b;
                                nynVar = szuVar.c;
                                j = szuVar.d;
                                xysVar = szuVar.e;
                                nohVar = szuVar.f;
                                t0qVar = szuVar.h;
                                h4qVar = szuVar.i;
                                b3lVar = szuVar.j;
                                z = szuVar.k;
                                xysVar.getClass();
                                nohVar.getClass();
                            } while (!xdrVar.k(value, new q7q(new szu(e5qVar, tyuVar, nynVar, j, xysVar, nohVar, true, t0qVar, h4qVar, b3lVar, z))));
                        } else {
                            if (i10 != 1) {
                                b6e.s();
                                return null;
                            }
                            k1l k1lVar = kr7Var.l;
                            boolean z2 = mzuVar.d;
                            AwaitPlayerConvergedCommand awaitPlayerConvergedCommand = new AwaitPlayerConvergedCommand(z2);
                            j9q j9qVar = j9q.a;
                            k1lVar.b(new eyk(u75.h(PauseOnQueueEndCommand.INSTANCE, awaitPlayerConvergedCommand, new WaveQueueCommandsFactory$SetQueuePosition(0, z2))), a3t.a);
                        }
                        return Unit.a;
                    }
                    jzs jzsVar2 = (jzs) ((fwu) mwuVar).a.a.b();
                    t5l t5lVar = kr7Var.m;
                    gv6Var.m = mwuVar;
                    gv6Var.n = nohVar2;
                    gv6Var.l = jzsVar2;
                    gv6Var.k = 1;
                    b = t5lVar.b(jzsVar2, gv6Var);
                    if (b == nm6Var2) {
                        return nm6Var2;
                    }
                    jzsVar = jzsVar2;
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzsVar = (jzs) gv6Var.l;
                    qgg.h0(obj);
                    b = obj;
                }
                j5l j5lVar = (j5l) b;
                fwu fwuVar = (fwu) mwuVar;
                e5q e5qVar2 = fwuVar.b;
                tyu tyuVar2 = fwuVar.a;
                nyn O = u7g.O(tyuVar2.b);
                r0o r0oVar = kr7Var.h;
                Long u = ngg.u(mzuVar.a);
                long j2 = 0;
                long longValue = u != null ? u.longValue() : 0L;
                ryu ryuVar = (ryu) r0oVar.c;
                jzsVar.getClass();
                mqs mqsVar = jzsVar.a;
                if (((jzs) r0oVar.d) == null) {
                    r0oVar.d = jzsVar;
                }
                if (!Intrinsics.d((jzs) r0oVar.d, jzsVar)) {
                    r0oVar.b = true;
                }
                if (longValue <= 0 || r0oVar.b) {
                    if (mqsVar.l) {
                        ryuVar.getClass();
                        e2l e2lVar = ryuVar.a;
                        String str = (String) dag.p(jzsVar, kjn.f);
                        str.getClass();
                        Long a = e2lVar.a.a(str);
                        long longValue2 = a != null ? a.longValue() : 0L;
                        l = Long.valueOf(longValue2);
                        break;
                    }
                    l = null;
                    if (l != null) {
                        j2 = l.longValue();
                    }
                } else {
                    j2 = longValue;
                }
                xys xysVar2 = mzuVar.e;
                h4q h4qVar2 = new h4q(j5lVar.a);
                b3l b3lVar2 = fwuVar.c;
                lu6 lu6Var = kr7Var.i;
                t0q t0qVar3 = mzuVar.g;
                t0qVar3.getClass();
                q0q q0qVar = q0q.a;
                if (!t0qVar3.equals(q0qVar)) {
                    if (t0qVar3 instanceof r0q) {
                        if (!lu6Var.b) {
                            lu6Var.b = true;
                        }
                        t0qVar2 = q0qVar;
                    } else {
                        if (!(t0qVar3 instanceof s0q)) {
                            b6e.s();
                            return null;
                        }
                        if (!lu6Var.a) {
                            lu6Var.a = true;
                        }
                        t0qVar2 = q0qVar;
                    }
                    szu szuVar2 = new szu(e5qVar2, tyuVar2, O, j2, xysVar2, nohVar2, false, t0qVar2, h4qVar2, b3lVar2, mzuVar.h);
                    k7qVar = kr7Var.e;
                    if (k7qVar instanceof igr) {
                        igr igrVar = (igr) k7qVar;
                        if (e5qVar2 instanceof u4q) {
                            u4q u4qVar = (u4q) e5qVar2;
                            s9p s9pVar = u4qVar.a.a;
                            String str2 = u4qVar.b.b;
                            s4v s4vVar = u4qVar.c;
                            ykuVar = new yku(s9pVar, str2, s4vVar.a, s4vVar.b, hdg.l0(u4qVar.e));
                        } else if (e5qVar2 instanceof s4q) {
                            s4q s4qVar = (s4q) e5qVar2;
                            ykuVar = new yku(s4qVar.a.a, s4qVar.b.b, s7g.r(szuVar2), s4qVar.c.b, hdg.l0(s4qVar.e));
                        } else if (e5qVar2 instanceof w4q) {
                            w4q w4qVar = (w4q) e5qVar2;
                            s9p s9pVar2 = w4qVar.a.a;
                            String str3 = w4qVar.b.b;
                            s4v s4vVar2 = w4qVar.c;
                            ykuVar = new yku(s9pVar2, str3, s4vVar2.a, s4vVar2.b, hdg.l0(w4qVar.e));
                        } else if (e5qVar2 instanceof y4q) {
                            ykuVar = new yku(((y4q) e5qVar2).a.e(), "default", s7g.r(szuVar2), null, xku.b);
                        } else {
                            if (!(e5qVar2 instanceof b5q)) {
                                b6e.s();
                                return null;
                            }
                            ykuVar = new yku(new s9p(t75.c(r9p.a)), "default", s7g.r(szuVar2), null, xku.b);
                        }
                        igrVar.d(ykuVar);
                    }
                    q7q q7qVar = new q7q(szuVar2);
                    xdrVar.getClass();
                    xdrVar.m(null, q7qVar);
                    kr7Var.q.set(true);
                    return Unit.a;
                }
                t0qVar2 = t0qVar3;
                szu szuVar22 = new szu(e5qVar2, tyuVar2, O, j2, xysVar2, nohVar2, false, t0qVar2, h4qVar2, b3lVar2, mzuVar.h);
                k7qVar = kr7Var.e;
                if (k7qVar instanceof igr) {
                }
                q7q q7qVar2 = new q7q(szuVar22);
                xdrVar.getClass();
                xdrVar.m(null, q7qVar2);
                kr7Var.q.set(true);
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i11 = gv6Var.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    rjcVar = (rjc) gv6Var.l;
                    Object[] objArr = (Object[]) gv6Var.m;
                    ?? r1 = (aur) gv6Var.n;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    Object obj6 = objArr[3];
                    Object obj7 = objArr[4];
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.o = rjcVar;
                    gv6Var.k = 1;
                    b2 = r1.b(obj3, obj4, obj5, obj6, obj7, gv6Var);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjc rjcVar8 = (rjc) gv6Var.o;
                    qgg.h0(obj);
                    rjcVar = rjcVar8;
                    b2 = obj;
                }
                gv6Var.l = null;
                gv6Var.m = null;
                gv6Var.o = null;
                gv6Var.k = 2;
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i12 = gv6Var.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    rjcVar2 = (rjc) gv6Var.l;
                    Object[] objArr2 = (Object[]) gv6Var.n;
                    ?? r0 = gv6Var.m;
                    Object obj8 = objArr2[0];
                    Object obj9 = objArr2[1];
                    Object obj10 = objArr2[2];
                    Object obj11 = objArr2[3];
                    Object obj12 = objArr2[4];
                    Object obj13 = objArr2[5];
                    gv6Var.l = null;
                    gv6Var.n = null;
                    gv6Var.o = rjcVar2;
                    gv6Var.k = 1;
                    f = r0.f(obj8, obj9, obj10, obj11, obj12, obj13, gv6Var);
                    gv6Var = gv6Var;
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjc rjcVar9 = (rjc) gv6Var.o;
                    qgg.h0(obj);
                    rjcVar2 = rjcVar9;
                    f = obj;
                }
                gv6Var.l = null;
                gv6Var.n = null;
                gv6Var.o = null;
                gv6Var.k = 2;
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i13 = gv6Var.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    rjcVar3 = (rjc) gv6Var.l;
                    Object[] objArr3 = (Object[]) gv6Var.m;
                    gqp gqpVar = (gqp) gv6Var.n;
                    Object obj14 = objArr3[0];
                    Object obj15 = objArr3[1];
                    Object obj16 = objArr3[2];
                    Object obj17 = objArr3[3];
                    Object obj18 = objArr3[4];
                    Object obj19 = objArr3[5];
                    Object obj20 = objArr3[6];
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.o = rjcVar3;
                    gv6Var.k = 1;
                    gqpVar.getClass();
                    gqp gqpVar2 = new gqp(gv6Var);
                    gqpVar2.j = (o53) obj14;
                    gqpVar2.k = (r53) obj15;
                    gqpVar2.l = (l53) obj16;
                    gqpVar2.m = (u53) obj17;
                    gqpVar2.n = (y53) obj18;
                    gqpVar2.o = (e53) obj19;
                    gqpVar2.p = (i53) obj20;
                    invokeSuspend = gqpVar2.invokeSuspend(Unit.a);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar3 = (rjc) gv6Var.o;
                    qgg.h0(obj);
                    invokeSuspend = obj;
                }
                gv6Var.l = null;
                gv6Var.m = null;
                gv6Var.o = null;
                gv6Var.k = 2;
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i14 = gv6Var.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    rjcVar4 = (rjc) gv6Var.l;
                    Object[] objArr4 = (Object[]) gv6Var.m;
                    j8v j8vVar = (j8v) gv6Var.n;
                    Object obj21 = objArr4[0];
                    Object obj22 = objArr4[1];
                    Object obj23 = objArr4[2];
                    Object obj24 = objArr4[3];
                    Object obj25 = objArr4[4];
                    Object obj26 = objArr4[5];
                    Object obj27 = objArr4[6];
                    Object obj28 = objArr4[7];
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.o = rjcVar4;
                    gv6Var.k = 1;
                    i = j8vVar.i(obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, gv6Var);
                    gv6Var = gv6Var;
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjc rjcVar10 = (rjc) gv6Var.o;
                    qgg.h0(obj);
                    rjcVar4 = rjcVar10;
                    i = obj;
                }
                gv6Var.l = null;
                gv6Var.m = null;
                gv6Var.o = null;
                gv6Var.k = 2;
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i15 = gv6Var.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    rjcVar5 = (rjc) gv6Var.l;
                    Object[] objArr5 = (Object[]) gv6Var.m;
                    hrw hrwVar = (hrw) gv6Var.n;
                    Object obj29 = objArr5[0];
                    Object obj30 = objArr5[1];
                    Object obj31 = objArr5[2];
                    Object obj32 = objArr5[3];
                    Object obj33 = objArr5[4];
                    Object obj34 = objArr5[5];
                    Object obj35 = objArr5[6];
                    Object obj36 = objArr5[7];
                    Object obj37 = objArr5[8];
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.o = rjcVar5;
                    gv6Var.k = 1;
                    hrwVar.getClass();
                    boolean booleanValue = ((Boolean) obj29).booleanValue();
                    boolean booleanValue2 = ((Boolean) obj30).booleanValue();
                    boolean booleanValue3 = ((Boolean) obj31).booleanValue();
                    boolean booleanValue4 = ((Boolean) obj32).booleanValue();
                    boolean booleanValue5 = ((Boolean) obj33).booleanValue();
                    boolean booleanValue6 = ((Boolean) obj34).booleanValue();
                    boolean booleanValue7 = ((Boolean) obj35).booleanValue();
                    boolean booleanValue8 = ((Boolean) obj36).booleanValue();
                    boolean booleanValue9 = ((Boolean) obj37).booleanValue();
                    hrw hrwVar2 = new hrw(gv6Var);
                    hrwVar2.j = booleanValue;
                    hrwVar2.k = booleanValue2;
                    hrwVar2.l = booleanValue3;
                    hrwVar2.m = booleanValue4;
                    hrwVar2.n = booleanValue5;
                    hrwVar2.o = booleanValue6;
                    hrwVar2.p = booleanValue7;
                    hrwVar2.q = booleanValue8;
                    hrwVar2.r = booleanValue9;
                    invokeSuspend2 = hrwVar2.invokeSuspend(Unit.a);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjc rjcVar11 = (rjc) gv6Var.o;
                    qgg.h0(obj);
                    rjcVar5 = rjcVar11;
                    invokeSuspend2 = obj;
                }
                gv6Var.l = null;
                gv6Var.m = null;
                gv6Var.o = null;
                gv6Var.k = 2;
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i16 = gv6Var.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar12 = (rjc) gv6Var.l;
                    fkn a2 = ((tke) ((qke) gv6Var.n).b.getValue()).a((mm6) gv6Var.o, (kle) gv6Var.m);
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    if (zsd.e0(rjcVar12, a2, gv6Var) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i17 = gv6Var.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar13 = (rjc) gv6Var.l;
                    hxc hxcVar = (hxc) gv6Var.m;
                    pjc b0 = hxcVar.a == s84.b ? zsd.b0(new qm((pjc) gv6Var.n, new tqn(), hxcVar, (toh) gv6Var.o, 3)) : new fs(15, hxcVar);
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    if (zsd.e0(rjcVar13, b0, gv6Var) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                dn9 dn9Var = (dn9) gv6Var.n;
                nm6 nm6Var10 = nm6.a;
                int i18 = gv6Var.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar14 = (rjc) gv6Var.l;
                    boolean booleanValue10 = ((Boolean) gv6Var.m).booleanValue();
                    pjc v = ((t3g) dn9Var.b).v((mwk) gv6Var.o);
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    zsd.f0(rjcVar14);
                    Object collect = v.collect(new iv6(new j7l(rjcVar14, 10), dn9Var, booleanValue10, 1), gv6Var);
                    if (collect != nm6Var10) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var10) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var10) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                l18 l18Var = l18.b;
                cvl cvlVar = (cvl) gv6Var.o;
                nm6 nm6Var11 = nm6.a;
                int i19 = gv6Var.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar15 = (rjc) gv6Var.l;
                    u0j u0jVar = ((x66) gv6Var.m).b;
                    u0j u0jVar2 = u0j.a;
                    nsl nslVar = (nsl) gv6Var.n;
                    if (u0jVar == u0jVar2) {
                        klg a3 = nslVar.a();
                        a3.getClass();
                        jyr jyrVar = i2q.e;
                        if (lsq.v()) {
                            bdt I2 = hag.I(frt.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            ((frt) qdcVar.C(I2)).c().a.getClass();
                            xlg a4 = a3.a();
                            a4.getClass();
                            b3 = a4.g(new nlg(a4, cvlVar, continuation, i7));
                        } else {
                            b3 = klg.b(new hlg(a3, cvlVar, continuation, i7));
                        }
                    } else {
                        klg a5 = nslVar.a();
                        a5.getClass();
                        jyr jyrVar2 = i2q.e;
                        if (lsq.v()) {
                            bdt I3 = hag.I(frt.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            ((frt) qdcVar2.C(I3)).c().a.getClass();
                            xlg a6 = a5.a();
                            a6.getClass();
                            b3 = a6.g(new nlg(a6, cvlVar, continuation, i6));
                        } else {
                            b3 = klg.b(new hlg(a5, cvlVar, continuation, i6));
                        }
                    }
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    if (zsd.e0(rjcVar15, b3, gv6Var) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                pjc pjcVar = z4b.a;
                nm6 nm6Var12 = nm6.a;
                int i20 = gv6Var.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar16 = (rjc) gv6Var.l;
                    Pair pair = (Pair) gv6Var.m;
                    String str4 = (String) pair.a;
                    xys xysVar3 = (xys) pair.b;
                    if (str4 == null) {
                        ssg.a(3, "SharedAlbumTrackOrderOperationsAdapter", "no album. do not subscribe on trackOrderChanges", null);
                    } else if (xysVar3 == null) {
                        ssg.a(3, "SharedAlbumTrackOrderOperationsAdapter", "no queue or queue is not Ready. do not subscribe on trackOrderChanges", null);
                    } else {
                        ssg.a(3, "SharedAlbumTrackOrderOperationsAdapter", "albumId: " + str4 + ", subscribing on trackOrderChanges, initialTrackOrder: " + xysVar3, null);
                        ms msVar = (ms) ((pyp) gv6Var.o).c.getValue();
                        msVar.getClass();
                        pjcVar = new ail(25, new fs(i6, new ds(msVar.c, str4, 0)), xysVar3);
                    }
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    if (zsd.e0(rjcVar16, pjcVar, gv6Var) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i21 = gv6Var.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar17 = (rjc) gv6Var.l;
                    Boolean[] boolArr = (Boolean[]) ((Object[]) gv6Var.m);
                    n8g b4 = t75.b();
                    int length = boolArr.length;
                    int i22 = 0;
                    while (i6 < length) {
                        int i23 = i22 + 1;
                        if (boolArr[i6].booleanValue()) {
                            b4.add(((ndq) ((ArrayList) gv6Var.n).get(i22)).a((Context) gv6Var.o));
                        }
                        i6++;
                        i22 = i23;
                    }
                    n8g a7 = t75.a(b4);
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    if (rjcVar17.emit(a7, gv6Var) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i24 = gv6Var.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar18 = (rjc) gv6Var.l;
                    e6l e6lVar = (e6l) gv6Var.m;
                    if (p6g.z(e6lVar) == l7l.a) {
                        mpqVar = z4b.a;
                    } else {
                        jyr jyrVar3 = p6m.f;
                        mpqVar = !o6m.e() ? new mpq(i4, new kp2(v3g.D((frt) ((jyr) gv6Var.o).getValue()), i7), e6lVar) : new mpq(i3, new em((u21) gv6Var.n, i2), e6lVar);
                    }
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    if (zsd.e0(rjcVar18, mpqVar, gv6Var) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i25 = gv6Var.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    rjcVar6 = (rjc) gv6Var.l;
                    Object[] objArr6 = (Object[]) gv6Var.m;
                    brl brlVar = (brl) gv6Var.n;
                    Object obj38 = objArr6[0];
                    Object obj39 = objArr6[1];
                    Object obj40 = objArr6[2];
                    Object obj41 = objArr6[3];
                    Object obj42 = objArr6[4];
                    Object obj43 = objArr6[5];
                    Object obj44 = objArr6[6];
                    Object obj45 = objArr6[7];
                    Object obj46 = objArr6[8];
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.o = rjcVar6;
                    gv6Var.k = 1;
                    brlVar.getClass();
                    boolean booleanValue11 = ((Boolean) obj46).booleanValue();
                    ((grl) brlVar.receiver).getClass();
                    ujcVar = new ujc((lql) obj38, ((Boolean) obj39).booleanValue(), (j1g) obj40, (p5n) obj41, (qpl) obj42, (h4q) obj43, (uz7) obj44, (o3h) obj45, booleanValue11);
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjc rjcVar19 = (rjc) gv6Var.o;
                    qgg.h0(obj);
                    rjcVar6 = rjcVar19;
                    ujcVar = obj;
                }
                gv6Var.l = null;
                gv6Var.m = null;
                gv6Var.o = null;
                gv6Var.k = 2;
                break;
            case 15:
                x1u x1uVar = (x1u) gv6Var.o;
                w5u w5uVar = (w5u) gv6Var.n;
                nm6 nm6Var16 = nm6.a;
                int i26 = gv6Var.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar20 = (rjc) gv6Var.l;
                    clc clcVar = new clc(new mpq(22, new tnc(w5uVar.d.x(x1uVar), w5uVar, x1uVar, ((Boolean) gv6Var.m).booleanValue()), x1uVar), new k5u(i5, i6, continuation));
                    gv6Var.l = null;
                    gv6Var.m = null;
                    gv6Var.k = 1;
                    if (zsd.e0(rjcVar20, clcVar, gv6Var) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                return k(obj);
            case 17:
                return l(obj);
            case 18:
                return n(obj);
            default:
                n0 n0Var = (n0) gv6Var.o;
                t tVar = (t) gv6Var.m;
                l1 l1Var = (l1) gv6Var.n;
                Object obj47 = nm6.a;
                int i27 = gv6Var.k;
                try {
                    if (i27 == 0) {
                        qgg.h0(obj);
                        ?? r12 = tVar.a;
                        if (Intrinsics.d(r12, l0.a)) {
                            return new s(d1.a);
                        }
                        if (Intrinsics.d(r12, l0.b)) {
                            Object obj48 = n0.c;
                            v1 v1Var = l1Var.a;
                            b1 b1Var = l1Var.d;
                            if (v1Var instanceof s1) {
                                o0 o0Var = ((s1) v1Var).a.a;
                                if ((o0Var instanceof z) && b1Var != null) {
                                    return new x(b1.a(b1Var, com.yandex.passport.internal.properties.l.a(b1Var.a, null, null, com.yandex.plus.pay.ui.core.b.J(((z) o0Var).c), 1073737727), null, 62));
                                }
                            }
                            return com.yandex.passport.internal.ui.bouncer.model.w.a;
                        }
                        if (r12 instanceof r0) {
                            return new v(((r0) r12).a);
                        }
                        if (Intrinsics.d(r12, l0.c)) {
                            return new s(new f1(new c()));
                        }
                        if (r12 instanceof q0) {
                            q0 q0Var = (q0) r12;
                            l lVar = q0Var.a;
                            w0 w0Var = q0Var.c;
                            String str5 = q0Var.d;
                            String str6 = str5 != null ? str5 : null;
                            String str7 = l1Var.f;
                            if (str7 == null) {
                                str7 = q0Var.e;
                            }
                            i0 i0Var = new i0(new j1(lVar, null, w0Var, str6, str7, null, 32));
                            v1 v1Var2 = l1Var.a;
                            if (!(v1Var2 instanceof s1) || !(((s1) v1Var2).a.a instanceof e0)) {
                                return i0Var;
                            }
                            com.yandex.passport.internal.report.reporters.l lVar2 = n0Var.a;
                            String valueOf = String.valueOf(q0Var.b.b);
                            lVar2.getClass();
                            valueOf.getClass();
                            lVar2.n(x9.d, new com.yandex.passport.internal.report.c(valueOf, 3));
                            return i0Var;
                        }
                        if (r12 instanceof t0) {
                            return n0.b(n0Var, l1Var, new p(((t0) r12).a));
                        }
                        if (r12 instanceof u0) {
                            String str8 = ((u0) r12).a;
                            w1 w1Var = (w1) n0.c.get(str8);
                            com.yandex.passport.internal.a0 a8 = w1Var != null ? y.a(w1Var) : null;
                            if (a8 != null) {
                                return n0.b(n0Var, l1Var, new com.yandex.passport.internal.ui.domik.q(a8));
                            }
                            oVar = new com.yandex.passport.internal.ui.bouncer.model.o("ProcessEventActor", f1d.g("Unknown social config ", str8), null);
                        } else {
                            if (r12 instanceof s0) {
                                com.yandex.passport.api.exception.n nVar = com.yandex.passport.api.exception.o.Companion;
                                List list = ((s0) r12).a;
                                nVar.getClass();
                                return new s(new f1(com.yandex.passport.api.exception.n.a(list)));
                            }
                            if (r12 instanceof v0) {
                                return new h0(((v0) r12).a);
                            }
                            if (r12 instanceof p0) {
                                p0 p0Var = (p0) r12;
                                return new s(new h1(p0Var.a, p0Var.b));
                            }
                            if (r12 instanceof com.yandex.passport.internal.ui.bouncer.model.n0) {
                                return new com.yandex.passport.internal.ui.bouncer.model.n(((com.yandex.passport.internal.ui.bouncer.model.n0) r12).a);
                            }
                            if (r12 instanceof com.yandex.passport.internal.ui.bouncer.model.o0) {
                                com.yandex.passport.internal.ui.bouncer.model.o0 o0Var2 = (com.yandex.passport.internal.ui.bouncer.model.o0) r12;
                                Throwable th = o0Var2.a;
                                return new com.yandex.passport.internal.ui.bouncer.model.o(o0Var2.b, String.valueOf(th.getMessage()), th);
                            }
                            if (!(r12 instanceof m0)) {
                                b6e.s();
                                return null;
                            }
                            com.yandex.passport.internal.properties.l lVar3 = l1Var.c;
                            if (lVar3 != null) {
                                com.yandex.passport.internal.usecase.ui.h0 h0Var = n0Var.b;
                                f0 f0Var = new f0(lVar3.d);
                                gv6Var.m = null;
                                gv6Var.n = l1Var;
                                gv6Var.l = (m0) r12;
                                gv6Var.k = 1;
                                g = h0Var.g(f0Var, gv6Var);
                                tVar = r12;
                                break;
                            } else {
                                oVar = new com.yandex.passport.internal.ui.bouncer.model.o("ProcessEventActor", "No login properties on CreateNewProfile", null);
                            }
                        }
                        return oVar;
                    }
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r13 = (m0) gv6Var.l;
                    qgg.h0(obj);
                    g = obj;
                    tVar = r13;
                    List<l> list2 = ((com.yandex.passport.internal.usecase.ui.e0) g).b.a;
                    ArrayList arrayList = new ArrayList();
                    for (l lVar4 : list2) {
                        f fVar = lVar4.c;
                        String str9 = lVar4.e.L;
                        y0 y0Var = (str9 == null || fVar == null) ? null : new y0(fVar, str9);
                        if (y0Var != null) {
                            arrayList.add(y0Var);
                        }
                    }
                    List w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList));
                    obj2 = tVar;
                    if (!w0.isEmpty()) {
                        obj47 = new com.yandex.passport.internal.ui.bouncer.model.k(w0);
                        return obj47;
                    }
                } catch (Throwable th2) {
                    d dVar = a.a;
                    obj2 = tVar;
                    if (a.a.isEnabled()) {
                        a.b(com.yandex.passport.common.logger.b.e, null, "No master accounts to create profile with.", th2);
                        obj2 = tVar;
                    }
                }
                return new c0(com.yandex.passport.internal.properties.l.a(l1Var.c, null, null, null, 1073741567), null, null, null, false, false, null, ((m0) obj2).a, 126);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv6(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv6(Continuation continuation, vyc vycVar) {
        super(3, continuation);
        this.j = 3;
        this.m = vycVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv6(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv6(Continuation continuation, Object obj, Object obj2, int i) {
        super(3, continuation);
        this.j = i;
        this.n = obj;
        this.o = obj2;
    }
}
