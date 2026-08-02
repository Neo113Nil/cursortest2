package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class xfm extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public long k;
    public int l;
    public /* synthetic */ long m;
    public /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfm(long j, Continuation continuation) {
        super(2, continuation);
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                xfm xfmVar = new xfm(this.m, continuation);
                xfmVar.n = obj;
                return xfmVar;
            default:
                xfm xfmVar2 = new xfm((iyo) this.n, continuation);
                xfmVar2.m = ((yzt) obj).a;
                return xfmVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                ((xfm) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                long j = ((yzt) obj).a;
                xfm xfmVar = new xfm((iyo) this.n, (Continuation) obj2);
                xfmVar.m = j;
                return xfmVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00f2 -> B:33:0x00cf). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        Long l;
        long j2;
        Object b;
        Object b2;
        long j3;
        long j4;
        Object a;
        switch (this.j) {
            case 0:
                rjc rjcVar = (rjc) this.n;
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j = this.k;
                            qgg.h0(obj);
                            long j5 = j + 1;
                            l = new Long(j);
                            this.n = rjcVar;
                            this.k = j5;
                            this.l = 3;
                            if (rjcVar.emit(l, this) != nm6Var) {
                                return nm6Var;
                            }
                            j = j5;
                        } else if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    j = this.k;
                    qgg.h0(obj);
                } else {
                    qgg.h0(obj);
                    Long l2 = new Long(0L);
                    this.n = rjcVar;
                    this.k = 1L;
                    this.l = 1;
                    if (rjcVar.emit(l2, this) == nm6Var) {
                        return nm6Var;
                    }
                    j = 1;
                }
                long j6 = this.m;
                this.n = rjcVar;
                this.k = j;
                this.l = 2;
                if (y2x.p(j6, this) == nm6Var) {
                    return nm6Var;
                }
                long j52 = j + 1;
                l = new Long(j);
                this.n = rjcVar;
                this.k = j52;
                this.l = 3;
                if (rjcVar.emit(l, this) != nm6Var) {
                }
            default:
                iyo iyoVar = (iyo) this.n;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    j2 = this.m;
                    cyi cyiVar = iyoVar.f;
                    this.m = j2;
                    this.l = 1;
                    b = cyiVar.b(j2, this);
                    if (b == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            long j7 = this.k;
                            long j8 = this.m;
                            qgg.h0(obj);
                            j2 = j8;
                            j4 = j7;
                            a = obj;
                            return new yzt(yzt.d(j2, yzt.d(j4, ((yzt) a).a)));
                        }
                        j3 = this.k;
                        j2 = this.m;
                        qgg.h0(obj);
                        b2 = obj;
                        long j9 = ((yzt) b2).a;
                        cyi cyiVar2 = iyoVar.f;
                        long d = yzt.d(j3, j9);
                        this.m = j2;
                        this.k = j9;
                        this.l = 3;
                        j4 = j9;
                        a = cyiVar2.a(d, j4, this);
                        if (a == nm6Var2) {
                            return nm6Var2;
                        }
                        return new yzt(yzt.d(j2, yzt.d(j4, ((yzt) a).a)));
                    }
                    j2 = this.m;
                    qgg.h0(obj);
                    b = obj;
                }
                long d2 = yzt.d(j2, ((yzt) b).a);
                this.m = j2;
                this.k = d2;
                this.l = 2;
                b2 = iyoVar.b(d2, this);
                if (b2 == nm6Var2) {
                    return nm6Var2;
                }
                j3 = d2;
                long j92 = ((yzt) b2).a;
                cyi cyiVar22 = iyoVar.f;
                long d3 = yzt.d(j3, j92);
                this.m = j2;
                this.k = j92;
                this.l = 3;
                j4 = j92;
                a = cyiVar22.a(d3, j4, this);
                if (a == nm6Var2) {
                }
                return new yzt(yzt.d(j2, yzt.d(j4, ((yzt) a).a)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfm(iyo iyoVar, Continuation continuation) {
        super(2, continuation);
        this.n = iyoVar;
    }
}
