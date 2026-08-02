package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d6s extends h7o implements Function2 {
    public Object k;
    public Object l;
    public lfm m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ mm6 p;
    public final /* synthetic */ pyc q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ pqm u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6s(mm6 mm6Var, pyc pycVar, Function1 function1, Function1 function12, Function1 function13, pqm pqmVar, Continuation continuation) {
        super(2, continuation);
        this.p = mm6Var;
        this.q = pycVar;
        this.r = function1;
        this.s = function12;
        this.t = function13;
        this.u = pqmVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        d6s d6sVar = new d6s(this.p, this.q, this.r, this.s, this.t, this.u, continuation);
        d6sVar.o = obj;
        return d6sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d6s) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0209, code lost:
    
        if (r9 == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019e, code lost:
    
        if (r8 == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0100, code lost:
    
        if (r4 == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0115, code lost:
    
        if (r14 == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00bd, code lost:
    
        if (r6 == r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hur hurVar;
        Object c;
        hur hurVar2;
        r2f y;
        pqm pqmVar;
        Function1 function1;
        lfm lfmVar;
        Object h;
        Object i;
        lfm lfmVar2;
        r2f g;
        Function1 function12;
        Object n;
        r2f r2fVar;
        r2f y2;
        pqm pqmVar2;
        lfm lfmVar3;
        Object h2;
        Object i2;
        lfm lfmVar4;
        lfm lfmVar5;
        r2f r2fVar2;
        nm6 nm6Var = nm6.a;
        int i3 = this.n;
        int i4 = 0;
        mm6 mm6Var = this.p;
        Function1 function13 = this.s;
        dvg dvgVar = dvg.a;
        pyc pycVar = this.q;
        Function1 function14 = this.t;
        Function1 function15 = this.r;
        pqm pqmVar3 = this.u;
        Continuation continuation = null;
        switch (i3) {
            case 0:
                qgg.h0(obj);
                hurVar = (hur) this.o;
                this.o = hurVar;
                this.n = 1;
                c = g6s.c(hurVar, false, this, 3);
                break;
            case 1:
                hurVar = (hur) this.o;
                qgg.h0(obj);
                c = obj;
                hurVar2 = hurVar;
                lfm lfmVar6 = (lfm) c;
                lfmVar6.a();
                kr3 kr3Var = g6s.a;
                y = x97.y(mm6Var, null, pm6.d, new b6s(pqmVar3, null, 1), 1);
                if (pycVar != g6s.a) {
                    function1 = function14;
                    c6s c6sVar = new c6s(pycVar, pqmVar3, lfmVar6, null, 0);
                    pqmVar = pqmVar3;
                    lfmVar = lfmVar6;
                    g6s.g(mm6Var, y, c6sVar);
                } else {
                    pqmVar = pqmVar3;
                    function1 = function14;
                    lfmVar = lfmVar6;
                }
                if (function15 != null) {
                    this.o = hurVar2;
                    this.k = lfmVar;
                    this.l = y;
                    this.n = 3;
                    h = g6s.h(hurVar2, gfm.b, this);
                    break;
                } else {
                    this.o = hurVar2;
                    this.k = y;
                    this.n = 2;
                    i = g6s.i(hurVar2, gfm.b, this);
                    break;
                }
                return nm6Var;
            case 2:
                y = (r2f) this.k;
                hur hurVar3 = (hur) this.o;
                qgg.h0(obj);
                pqmVar = pqmVar3;
                hurVar2 = hurVar3;
                function1 = function14;
                i = obj;
                lfmVar2 = (lfm) i;
                if (lfmVar2 != null) {
                    g = g6s.g(mm6Var, y, new a6s(pqmVar, null, 3));
                } else {
                    lfmVar2.a();
                    g = g6s.g(mm6Var, y, new a6s(pqmVar, null, 4));
                }
                if (lfmVar2 != null) {
                    if (function13 != null) {
                        this.o = hurVar2;
                        this.k = lfmVar2;
                        this.l = g;
                        this.n = 5;
                        function12 = function15;
                        n = hurVar2.n(hurVar2.c().a(), new y5s(lfmVar2, continuation, i4), this);
                        break;
                    } else if (function1 != null) {
                        function1.invoke(new enj(lfmVar2.c));
                    }
                }
                return Unit.a;
            case 3:
                y = (r2f) this.l;
                lfm lfmVar7 = (lfm) this.k;
                hurVar2 = (hur) this.o;
                qgg.h0(obj);
                pqmVar = pqmVar3;
                lfmVar = lfmVar7;
                function1 = function14;
                h = obj;
                evg evgVar = (evg) h;
                if (!Intrinsics.d(evgVar, dvgVar)) {
                    if (evgVar instanceof cvg) {
                        lfmVar2 = ((cvg) evgVar).a;
                    } else {
                        if (!(evgVar instanceof bvg)) {
                            b6e.s();
                            return null;
                        }
                        lfmVar2 = null;
                    }
                    if (lfmVar2 != null) {
                    }
                    if (lfmVar2 != null) {
                    }
                    return Unit.a;
                }
                function15.invoke(new enj(lfmVar.c));
                this.o = y;
                this.k = null;
                this.l = null;
                this.n = 4;
                if (g6s.a(hurVar2, this) != nm6Var) {
                    r2fVar = y;
                    g6s.g(mm6Var, r2fVar, new a6s(pqmVar, null, 2));
                    return Unit.a;
                }
                return nm6Var;
            case 4:
                r2fVar = (r2f) this.o;
                qgg.h0(obj);
                pqmVar = pqmVar3;
                g6s.g(mm6Var, r2fVar, new a6s(pqmVar, null, 2));
                return Unit.a;
            case 5:
                g = (r2f) this.l;
                lfm lfmVar8 = (lfm) this.k;
                hurVar2 = (hur) this.o;
                qgg.h0(obj);
                n = obj;
                pqmVar = pqmVar3;
                lfmVar2 = lfmVar8;
                function12 = function15;
                function1 = function14;
                lfm lfmVar9 = (lfm) n;
                if (lfmVar9 == null) {
                    if (function1 != null) {
                        function1.invoke(new enj(lfmVar2.c));
                    }
                    return Unit.a;
                }
                kr3 kr3Var2 = g6s.a;
                y2 = x97.y(mm6Var, null, pm6.d, new v0r(g, pqmVar, null, 21), 1);
                if (pycVar != g6s.a) {
                    pqm pqmVar4 = pqmVar;
                    pqmVar2 = pqmVar4;
                    lfmVar3 = lfmVar9;
                    g6s.g(mm6Var, y2, new c6s(pycVar, pqmVar4, lfmVar9, null, 1));
                } else {
                    pqmVar2 = pqmVar;
                    lfmVar3 = lfmVar9;
                }
                if (function12 != null) {
                    this.o = hurVar2;
                    this.k = y2;
                    this.l = lfmVar2;
                    this.m = lfmVar3;
                    this.n = 7;
                    h2 = g6s.h(hurVar2, gfm.b, this);
                    break;
                } else {
                    this.o = y2;
                    this.k = lfmVar2;
                    this.l = null;
                    this.n = 6;
                    i2 = g6s.i(hurVar2, gfm.b, this);
                    if (i2 != nm6Var) {
                        lfmVar4 = lfmVar2;
                        lfmVar5 = (lfm) i2;
                        if (lfmVar5 != null) {
                            lfmVar5.a();
                            g6s.g(mm6Var, y2, new a6s(pqmVar2, null, 5));
                            function13.invoke(new enj(lfmVar5.c));
                        } else {
                            g6s.g(mm6Var, y2, new a6s(pqmVar2, null, 6));
                            if (function1 != null) {
                                function1.invoke(new enj(lfmVar4.c));
                            }
                        }
                        return Unit.a;
                    }
                }
                return nm6Var;
            case 6:
                lfmVar4 = (lfm) this.k;
                y2 = (r2f) this.o;
                qgg.h0(obj);
                i2 = obj;
                pqmVar2 = pqmVar3;
                function1 = function14;
                lfmVar5 = (lfm) i2;
                if (lfmVar5 != null) {
                }
                return Unit.a;
            case 7:
                lfm lfmVar10 = this.m;
                lfm lfmVar11 = (lfm) this.l;
                r2f r2fVar3 = (r2f) this.k;
                hurVar2 = (hur) this.o;
                qgg.h0(obj);
                pqmVar2 = pqmVar3;
                function12 = function15;
                h2 = obj;
                lfmVar2 = lfmVar11;
                lfmVar3 = lfmVar10;
                y2 = r2fVar3;
                function1 = function14;
                evg evgVar2 = (evg) h2;
                if (!Intrinsics.d(evgVar2, dvgVar)) {
                    if (evgVar2 instanceof cvg) {
                        lfmVar5 = ((cvg) evgVar2).a;
                        lfmVar4 = lfmVar2;
                    } else {
                        if (!(evgVar2 instanceof bvg)) {
                            b6e.s();
                            return null;
                        }
                        lfmVar4 = lfmVar2;
                        lfmVar5 = null;
                    }
                    if (lfmVar5 != null) {
                    }
                    return Unit.a;
                }
                function12.invoke(new enj(lfmVar3.c));
                this.o = y2;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = 8;
                if (g6s.a(hurVar2, this) != nm6Var) {
                    r2fVar2 = y2;
                    g6s.g(mm6Var, r2fVar2, new a6s(pqmVar2, null, 7));
                    return Unit.a;
                }
                return nm6Var;
            case 8:
                r2fVar2 = (r2f) this.o;
                qgg.h0(obj);
                pqmVar2 = pqmVar3;
                g6s.g(mm6Var, r2fVar2, new a6s(pqmVar2, null, 7));
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
