package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qna extends h7o implements Function2 {
    public final /* synthetic */ int k = 0;
    public int l;
    public /* synthetic */ Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ syc p;
    public final /* synthetic */ syc q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qna(mm6 mm6Var, pyc pycVar, Function1 function1, pqm pqmVar, Continuation continuation) {
        super(2, continuation);
        this.o = mm6Var;
        this.p = (aur) pycVar;
        this.q = (uif) function1;
        this.r = pqmVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                qna qnaVar = new qna((kzp) this.o, (f5r) this.p, (fvr) this.q, (eyq) this.r, continuation);
                qnaVar.m = obj;
                return qnaVar;
            default:
                qna qnaVar2 = new qna((mm6) this.o, (pyc) this.p, (Function1) this.q, (pqm) this.r, continuation);
                qnaVar2.m = obj;
                return qnaVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hur hurVar = (hur) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.k) {
        }
        return ((qna) create(hurVar, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
    
        if (r0 == r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
    
        if (r1 == r13) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Type inference failed for: r1v13, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hur hurVar;
        Object c;
        Object obj2;
        Object c2;
        hur hurVar2;
        uqn uqnVar;
        lfm lfmVar;
        Object j;
        Object c3;
        hur hurVar3;
        rar rarVar;
        Object i;
        r2f r2fVar;
        lfm lfmVar2;
        int i2 = this.k;
        syc sycVar = this.q;
        syc sycVar2 = this.p;
        Object obj3 = this.r;
        Object obj4 = this.o;
        switch (i2) {
            case 0:
                f5r f5rVar = (f5r) sycVar2;
                nm6 nm6Var = nm6.a;
                int i3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    hurVar = (hur) this.m;
                    this.m = hurVar;
                    this.l = 1;
                    c = g6s.c(hurVar, false, this, 2);
                    break;
                } else if (i3 == 1) {
                    hurVar = (hur) this.m;
                    qgg.h0(obj);
                    c = obj;
                } else if (i3 == 2) {
                    uqnVar = (uqn) this.n;
                    hur hurVar4 = (hur) this.m;
                    qgg.h0(obj);
                    hurVar2 = hurVar4;
                    obj2 = obj3;
                    c2 = obj;
                    lfmVar = (lfm) c2;
                    if (lfmVar != null) {
                        ((uqn) ((kzp) obj4).b).a = 0.0f;
                        f5rVar.invoke(lfmVar, new Float(uqnVar.a));
                        long j2 = lfmVar.a;
                        kma kmaVar = new kma(1, f5rVar);
                        this.m = null;
                        this.n = null;
                        this.l = 3;
                        j = wna.j(hurVar2, j2, kmaVar, this);
                        break;
                    }
                } else if (i3 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    j = obj;
                    obj2 = obj3;
                    if (((Boolean) j).booleanValue()) {
                        ((fvr) sycVar).invoke();
                    } else {
                        ((eyq) obj2).invoke();
                    }
                    break;
                }
                lfm lfmVar3 = (lfm) c;
                uqn uqnVar2 = new uqn();
                obj2 = obj3;
                long j3 = lfmVar3.a;
                int i4 = lfmVar3.i;
                pna pnaVar = new pna(uqnVar2, 0);
                this.m = hurVar;
                this.n = uqnVar2;
                this.l = 2;
                c2 = wna.c(hurVar, j3, i4, pnaVar, this);
                if (c2 != nm6Var) {
                    hurVar2 = hurVar;
                    uqnVar = uqnVar2;
                    lfmVar = (lfm) c2;
                    if (lfmVar != null) {
                    }
                }
                break;
            default:
                mm6 mm6Var = (mm6) obj4;
                pqm pqmVar = (pqm) obj3;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    hur hurVar5 = (hur) this.m;
                    kr3 kr3Var = g6s.a;
                    rar y = x97.y(mm6Var, null, pm6.d, new b6s(pqmVar, null, 0), 1);
                    this.m = hurVar5;
                    this.n = y;
                    this.l = 1;
                    c3 = g6s.c(hurVar5, false, this, 3);
                    if (c3 != nm6Var2) {
                        hurVar3 = hurVar5;
                        rarVar = y;
                    }
                    break;
                } else if (i5 == 1) {
                    rarVar = (rar) this.n;
                    hur hurVar6 = (hur) this.m;
                    qgg.h0(obj);
                    hurVar3 = hurVar6;
                    c3 = obj;
                } else if (i5 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    r2fVar = (r2f) this.m;
                    qgg.h0(obj);
                    i = obj;
                    lfmVar2 = (lfm) i;
                    if (lfmVar2 != null) {
                        g6s.g(mm6Var, r2fVar, new a6s(pqmVar, null, 0));
                    } else {
                        lfmVar2.a();
                        g6s.g(mm6Var, r2fVar, new a6s(pqmVar, null, 1));
                        ((uif) sycVar).invoke(new enj(lfmVar2.c));
                    }
                    break;
                }
                lfm lfmVar4 = (lfm) c3;
                lfmVar4.a();
                ?? r1 = (aur) sycVar2;
                if (r1 != g6s.a) {
                    g6s.g(mm6Var, rarVar, new fpq((pyc) r1, pqmVar, lfmVar4, (Continuation) null));
                }
                this.m = rarVar;
                this.n = null;
                this.l = 2;
                i = g6s.i(hurVar3, gfm.b, this);
                if (i != nm6Var2) {
                    r2fVar = rarVar;
                    lfmVar2 = (lfm) i;
                    if (lfmVar2 != null) {
                    }
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qna(kzp kzpVar, f5r f5rVar, fvr fvrVar, eyq eyqVar, Continuation continuation) {
        super(2, continuation);
        this.o = kzpVar;
        this.p = f5rVar;
        this.q = fvrVar;
        this.r = eyqVar;
    }
}
