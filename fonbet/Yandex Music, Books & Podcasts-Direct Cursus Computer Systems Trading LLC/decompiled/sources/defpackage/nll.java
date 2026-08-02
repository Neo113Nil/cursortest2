package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class nll extends aur implements Function2 {
    public r2f j;
    public tll k;
    public mqs l;
    public r2h m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ tll t;
    public final /* synthetic */ mqs u;
    public final /* synthetic */ r2h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nll(tll tllVar, mqs mqsVar, r2h r2hVar, Continuation continuation) {
        super(2, continuation);
        this.t = tllVar;
        this.u = mqsVar;
        this.v = r2hVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        nll nllVar = new nll(this.t, this.u, this.v, continuation);
        nllVar.s = obj;
        return nllVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nll) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x014f, code lost:
    
        if (r1.d.m(r3, r17) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018a, code lost:
    
        if (r1.d.m(defpackage.xll.a, r17) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r3.d.m(defpackage.ull.a, r17) == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0118 -> B:19:0x011e). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r2f r2fVar;
        tll tllVar;
        mqs mqsVar;
        r2h r2hVar;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        r2f r2fVar2;
        mqs mqsVar2;
        int i7;
        int i8;
        r2h r2hVar2;
        char c;
        Object a;
        ltm ltmVar = (ltm) this.s;
        nm6 nm6Var = nm6.a;
        int i9 = this.r;
        int i10 = 0;
        char c2 = 2;
        boolean z2 = true;
        Continuation continuation = null;
        if (i9 == 0) {
            qgg.h0(obj);
            ktm ktmVar = (ktm) ltmVar;
            ktmVar.getClass();
            this.s = ltmVar;
            this.r = 1;
        } else if (i9 == 1) {
            qgg.h0(obj);
        } else {
            if (i9 == 2) {
                int i11 = this.q;
                int i12 = this.p;
                int i13 = this.o;
                i2 = this.n;
                r2hVar = this.m;
                mqsVar = this.l;
                tllVar = this.k;
                r2fVar = this.j;
                qgg.h0(obj);
                i5 = i11;
                i3 = i13;
                i4 = i12;
                z = true;
                int i14 = i2;
                i6 = i4;
                r2fVar2 = r2fVar;
                mqsVar2 = mqsVar;
                i7 = i14;
                r2h r2hVar3 = r2hVar;
                i8 = i3;
                r2hVar2 = r2hVar3;
                n3h n3hVar = tllVar.a;
                String str = mqsVar2.a;
                Long l = new Long(mqsVar2.e);
                this.s = ltmVar;
                this.j = r2fVar2;
                this.k = tllVar;
                this.l = mqsVar2;
                this.m = r2hVar2;
                this.n = i7;
                this.o = i8;
                this.p = i6;
                this.q = i5;
                c = 3;
                this.r = 3;
                a = n3hVar.a(str, r2hVar2, l, this);
                if (a != nm6Var) {
                }
                return nm6Var;
            }
            if (i9 != 3) {
                if (i9 == 4) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i9 == 5) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i15 = this.q;
            i6 = this.p;
            i8 = this.o;
            i7 = this.n;
            r2h r2hVar4 = this.m;
            mqsVar2 = this.l;
            tll tllVar2 = this.k;
            r2f r2fVar3 = this.j;
            qgg.h0(obj);
            a = obj;
            r2f r2fVar4 = r2fVar3;
            z = true;
            tll tllVar3 = tllVar2;
            i5 = i15;
            c = 3;
            rj6 rj6Var = (rj6) a;
            if (rj6Var instanceof qj6) {
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                z2 = z;
                i = i8 + 1;
                i2 = i7;
                r2hVar = r2hVar4;
                mqsVar = mqsVar2;
                i10 = 0;
                tllVar = tllVar3;
                r2fVar = r2fVar4;
                c2 = 2;
                if (i >= i2) {
                    ktm ktmVar2 = (ktm) ltmVar;
                    ktmVar2.getClass();
                    this.s = null;
                    this.j = null;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.r = 5;
                } else if (i == 0) {
                    r2fVar.start();
                    z = z2;
                    r2hVar2 = r2hVar;
                    r2fVar2 = r2fVar;
                    i8 = i;
                    mqsVar2 = mqsVar;
                    i5 = i10;
                    i7 = i2;
                    i6 = i8;
                    n3h n3hVar2 = tllVar.a;
                    String str2 = mqsVar2.a;
                    Long l2 = new Long(mqsVar2.e);
                    this.s = ltmVar;
                    this.j = r2fVar2;
                    this.k = tllVar;
                    this.l = mqsVar2;
                    this.m = r2hVar2;
                    this.n = i7;
                    this.o = i8;
                    this.p = i6;
                    this.q = i5;
                    c = 3;
                    this.r = 3;
                    a = n3hVar2.a(str2, r2hVar2, l2, this);
                    if (a != nm6Var) {
                        r2h r2hVar5 = r2hVar2;
                        r2fVar4 = r2fVar2;
                        tllVar3 = tllVar;
                        r2hVar4 = r2hVar5;
                        rj6 rj6Var2 = (rj6) a;
                        if (rj6Var2 instanceof qj6) {
                            r2fVar4.g(null);
                            ktm ktmVar3 = (ktm) ltmVar;
                            ktmVar3.getClass();
                            wll wllVar = new wll((g1h) ((qj6) rj6Var2).a);
                            this.s = null;
                            this.j = null;
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = i6;
                            this.o = i5;
                            this.r = 4;
                        }
                    }
                } else {
                    z = z2;
                    long pow = ((long) Math.pow(2.0f, i)) * 2000;
                    this.s = ltmVar;
                    this.j = r2fVar;
                    this.k = tllVar;
                    this.l = mqsVar;
                    this.m = r2hVar;
                    this.n = i2;
                    this.o = i;
                    this.p = i;
                    this.q = i10;
                    this.r = 2;
                    if (y2x.o(pow, this) != nm6Var) {
                        i4 = i;
                        i3 = i4;
                        i5 = i10;
                        int i142 = i2;
                        i6 = i4;
                        r2fVar2 = r2fVar;
                        mqsVar2 = mqsVar;
                        i7 = i142;
                        r2h r2hVar32 = r2hVar;
                        i8 = i3;
                        r2hVar2 = r2hVar32;
                        n3h n3hVar22 = tllVar.a;
                        String str22 = mqsVar2.a;
                        Long l22 = new Long(mqsVar2.e);
                        this.s = ltmVar;
                        this.j = r2fVar2;
                        this.k = tllVar;
                        this.l = mqsVar2;
                        this.m = r2hVar2;
                        this.n = i7;
                        this.o = i8;
                        this.p = i6;
                        this.q = i5;
                        c = 3;
                        this.r = 3;
                        a = n3hVar22.a(str22, r2hVar2, l22, this);
                        if (a != nm6Var) {
                        }
                    }
                }
                return nm6Var;
            }
        }
        rar y = x97.y(ltmVar, null, pm6.b, new g2l(ltmVar, continuation, 3), 1);
        r2fVar = y;
        tllVar = this.t;
        mqsVar = this.u;
        r2hVar = this.v;
        i = 0;
        i2 = 3;
        if (i >= i2) {
        }
        return nm6Var;
    }
}
