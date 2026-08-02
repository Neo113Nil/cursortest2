package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ona extends h7o implements Function2 {
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ak0 m;
    public final /* synthetic */ woa n;
    public final /* synthetic */ woa o;
    public final /* synthetic */ Function2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ona(ak0 ak0Var, woa woaVar, woa woaVar2, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.m = ak0Var;
        this.n = woaVar;
        this.o = woaVar2;
        this.p = function2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ona onaVar = new ona(this.m, this.n, this.o, this.p, continuation);
        onaVar.l = obj;
        return onaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ona) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0016, B:9:0x00a4, B:11:0x00ac, B:13:0x00bb, B:15:0x00c7, B:17:0x00ca, B:20:0x00cd, B:24:0x00d3, B:28:0x0029, B:29:0x0057, B:31:0x005b, B:36:0x0031, B:37:0x0048, B:41:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3 A[Catch: CancellationException -> 0x001b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0016, B:9:0x00a4, B:11:0x00ac, B:13:0x00bb, B:15:0x00c7, B:17:0x00ca, B:20:0x00cd, B:24:0x00d3, B:28:0x0029, B:29:0x0057, B:31:0x005b, B:36:0x0031, B:37:0x0048, B:41:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0016, B:9:0x00a4, B:11:0x00ac, B:13:0x00bb, B:15:0x00c7, B:17:0x00ca, B:20:0x00cd, B:24:0x00d3, B:28:0x0029, B:29:0x0057, B:31:0x005b, B:36:0x0031, B:37:0x0048, B:41:0x003d), top: B:2:0x000a }] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hur hurVar;
        lfm lfmVar;
        hur hurVar2;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        woa woaVar = this.o;
        try {
            if (i == 0) {
                qgg.h0(obj);
                hurVar = (hur) this.l;
                this.l = hurVar;
                this.k = 1;
                obj = g6s.c(hurVar, false, this, 2);
                if (obj == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hurVar2 = (hur) this.l;
                        qgg.h0(obj);
                        if (((Boolean) obj).booleanValue()) {
                            woaVar.invoke();
                        } else {
                            List list = hurVar2.f.t.a;
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                lfm lfmVar2 = (lfm) list.get(i2);
                                if (swf.A(lfmVar2)) {
                                    lfmVar2.a();
                                }
                            }
                            this.n.invoke();
                        }
                        return Unit.a;
                    }
                    hurVar = (hur) this.l;
                    qgg.h0(obj);
                    lfmVar = (lfm) obj;
                    if (lfmVar != null) {
                        ak0 ak0Var = this.m;
                        long j = lfmVar.c;
                        ((aqi) ak0Var.s).setValue(Boolean.TRUE);
                        aqi aqiVar = (aqi) ak0Var.v;
                        joa joaVar = new joa();
                        x97.y((mm6) ak0Var.t, null, null, new uoa(joaVar, null, 1), 3);
                        aqiVar.setValue(joaVar);
                        ((Function1) ak0Var.u).invoke(new enj(j));
                        long j2 = lfmVar.a;
                        nna nnaVar = new nna(this.p, 0);
                        this.l = hurVar;
                        this.k = 3;
                        obj = wna.i(hurVar, j2, nnaVar, this);
                        if (obj != nm6Var) {
                            hurVar2 = hurVar;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return nm6Var;
                    }
                    return Unit.a;
                }
                hurVar = (hur) this.l;
                qgg.h0(obj);
            }
            long j3 = ((lfm) obj).a;
            this.l = hurVar;
            this.k = 2;
            obj = wna.d(hurVar, j3, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
            lfmVar = (lfm) obj;
            if (lfmVar != null) {
            }
            return Unit.a;
        } catch (CancellationException e) {
            woaVar.invoke();
            throw e;
        }
    }
}
