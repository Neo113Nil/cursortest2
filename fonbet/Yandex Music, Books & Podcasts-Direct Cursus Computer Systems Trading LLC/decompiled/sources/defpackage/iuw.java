package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class iuw extends h7o implements Function2 {
    public final /* synthetic */ jv A;
    public lfm k;
    public xqn l;
    public tqn m;
    public tqn n;
    public lfm o;
    public tqn p;
    public xqn q;
    public int r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dxv v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ itv x;
    public final /* synthetic */ hav y;
    public final /* synthetic */ r0w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuw(dxv dxvVar, Function1 function1, itv itvVar, hav havVar, r0w r0wVar, jv jvVar, Continuation continuation) {
        super(2, continuation);
        this.v = dxvVar;
        this.w = function1;
        this.x = itvVar;
        this.y = havVar;
        this.z = r0wVar;
        this.A = jvVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        iuw iuwVar = new iuw(this.v, this.w, this.x, this.y, this.z, this.A, continuation);
        iuwVar.u = obj;
        return iuwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((iuw) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0061, code lost:
    
        if (r3 == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.coroutines.Continuation, lfm, tqn] */
    /* JADX WARN: Type inference failed for: r11v3, types: [lfm, tqn, xqn] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        xqn xqnVar;
        ?? r11;
        lfm lfmVar;
        tqn tqnVar;
        tqn tqnVar2;
        int i;
        xqn xqnVar2;
        int i2;
        Object n;
        int i3;
        int i4;
        ?? r112;
        lfm lfmVar2;
        tqn tqnVar3;
        xqn xqnVar3;
        lfm lfmVar3;
        hur hurVar = (hur) this.u;
        nm6 nm6Var = nm6.a;
        int i5 = this.t;
        jv jvVar = this.A;
        r0w r0wVar = this.z;
        if (i5 == 0) {
            qgg.h0(obj);
            this.u = hurVar;
            this.t = 1;
            c = g6s.c(hurVar, false, this, 2);
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    i = this.r;
                    tqnVar2 = this.n;
                    tqn tqnVar4 = this.m;
                    xqnVar = this.l;
                    lfmVar = this.k;
                    qgg.h0(obj);
                    r11 = 0;
                    tqnVar = tqnVar4;
                    xqnVar2 = xqnVar;
                    if (((lfm) xqnVar2.a).b - lfmVar.b > hurVar.c().b()) {
                        i = 1;
                    }
                    i2 = (tqnVar.a && !tqnVar2.a && i == 0) ? 1 : 0;
                    if (i2 != 0) {
                        lfm lfmVar4 = (lfm) xqnVar2.a;
                        this.u = hurVar;
                        this.k = r11;
                        this.l = xqnVar2;
                        this.m = r11;
                        this.n = r11;
                        this.r = i;
                        this.s = i2;
                        this.t = 3;
                        n = hurVar.n(hurVar.c().a(), new y5s(lfmVar4, r11, 1), this);
                        if (n != nm6Var) {
                            i3 = i;
                            i4 = i2;
                            r112 = r11;
                            lfmVar2 = (lfm) n;
                            if (lfmVar2 != null) {
                            }
                        }
                        return nm6Var;
                    }
                    this.y.invoke();
                    return Unit.a;
                }
                if (i5 != 3) {
                    if (i5 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar3 = this.q;
                    tqnVar3 = this.p;
                    lfmVar3 = this.o;
                    qgg.h0(obj);
                    if (((lfm) xqnVar3.a).b - lfmVar3.b > hurVar.c().b()) {
                        tqnVar3.a = false;
                    }
                    if (tqnVar3.a) {
                        this.x.invoke(new enj(((lfm) xqnVar3.a).c));
                    }
                    this.y.invoke();
                    return Unit.a;
                }
                i4 = this.s;
                int i6 = this.r;
                xqnVar2 = this.l;
                qgg.h0(obj);
                r112 = 0;
                i3 = i6;
                n = obj;
                lfmVar2 = (lfm) n;
                if (lfmVar2 != null) {
                    this.w.invoke(new enj(((lfm) xqnVar2.a).c));
                    this.y.invoke();
                    return Unit.a;
                }
                tqn tqnVar5 = new tqn();
                tqnVar5.a = true;
                xqn xqnVar4 = new xqn();
                xqnVar4.a = lfmVar2;
                mqr mqrVar = new mqr(r0wVar, jvVar, tqnVar5, xqnVar4, 15);
                this.u = hurVar;
                this.k = r112;
                this.l = r112;
                this.m = r112;
                this.n = r112;
                this.o = lfmVar2;
                this.p = tqnVar5;
                this.q = xqnVar4;
                this.r = i3;
                this.s = i4;
                this.t = 4;
                if (c9g.o(hurVar, mqrVar, this) != nm6Var) {
                    tqnVar3 = tqnVar5;
                    xqnVar3 = xqnVar4;
                    lfmVar3 = lfmVar2;
                    if (((lfm) xqnVar3.a).b - lfmVar3.b > hurVar.c().b()) {
                    }
                    if (tqnVar3.a) {
                    }
                    this.y.invoke();
                    return Unit.a;
                }
                return nm6Var;
            }
            qgg.h0(obj);
            c = obj;
        }
        lfm lfmVar5 = (lfm) c;
        this.v.invoke();
        xqnVar = new xqn();
        xqnVar.a = lfmVar5;
        tqn tqnVar6 = new tqn();
        tqn tqnVar7 = new tqn();
        r11 = 0;
        huw huwVar = new huw(r0wVar, jvVar, tqnVar6, tqnVar7, xqnVar, 0);
        this.u = hurVar;
        this.k = lfmVar5;
        this.l = xqnVar;
        this.m = tqnVar6;
        this.n = tqnVar7;
        this.r = 0;
        this.t = 2;
        if (c9g.o(hurVar, huwVar, this) != nm6Var) {
            lfmVar = lfmVar5;
            tqnVar = tqnVar6;
            tqnVar2 = tqnVar7;
            i = 0;
            xqnVar2 = xqnVar;
            if (((lfm) xqnVar2.a).b - lfmVar.b > hurVar.c().b()) {
            }
            if (tqnVar.a) {
            }
            if (i2 != 0) {
            }
            this.y.invoke();
            return Unit.a;
        }
        return nm6Var;
    }
}
