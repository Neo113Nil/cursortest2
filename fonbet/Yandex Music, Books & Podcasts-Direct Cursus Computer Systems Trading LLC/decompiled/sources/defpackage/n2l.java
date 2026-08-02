package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class n2l implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ i2l c;
    public final /* synthetic */ t1f d;

    public /* synthetic */ n2l(rjc rjcVar, i2l i2lVar, t1f t1fVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = i2lVar;
        this.d = t1fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        m2l m2lVar;
        Object obj2;
        nm6 nm6Var;
        int i;
        int i2;
        rjc rjcVar;
        o2l o2lVar;
        Object obj3;
        nm6 nm6Var2;
        int i3;
        rjc rjcVar2;
        int i4;
        switch (this.a) {
            case 0:
                if (continuation instanceof m2l) {
                    m2lVar = (m2l) continuation;
                    int i5 = m2lVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        m2lVar.k = i5 - Integer.MIN_VALUE;
                        obj2 = m2lVar.j;
                        nm6Var = nm6.a;
                        i = m2lVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar3 = this.b;
                            m2lVar.m = rjcVar3;
                            i2 = 0;
                            m2lVar.n = 0;
                            m2lVar.k = 1;
                            Object k = ukc.k(this.c, this.d, m2lVar);
                            if (k != nm6Var) {
                                rjcVar = rjcVar3;
                                obj2 = k;
                            }
                        } else if (i == 1) {
                            i2 = m2lVar.n;
                            rjcVar = m2lVar.m;
                            qgg.h0(obj2);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                        m2lVar.m = null;
                        m2lVar.n = i2;
                        m2lVar.k = 2;
                        if (rjcVar.emit(obj2, m2lVar) == nm6Var) {
                        }
                    }
                }
                m2lVar = new m2l(this, continuation);
                obj2 = m2lVar.j;
                nm6Var = nm6.a;
                i = m2lVar.k;
                if (i != 0) {
                }
                m2lVar.m = null;
                m2lVar.n = i2;
                m2lVar.k = 2;
                if (rjcVar.emit(obj2, m2lVar) == nm6Var) {
                }
                break;
            default:
                if (continuation instanceof o2l) {
                    o2lVar = (o2l) continuation;
                    int i6 = o2lVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        o2lVar.k = i6 - Integer.MIN_VALUE;
                        obj3 = o2lVar.j;
                        nm6Var2 = nm6.a;
                        i3 = o2lVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj3);
                            rjcVar2 = this.b;
                            o2lVar.m = rjcVar2;
                            i4 = 0;
                            o2lVar.n = 0;
                            o2lVar.k = 1;
                            obj3 = ukc.k(this.c, this.d, o2lVar);
                            if (obj3 == nm6Var2) {
                            }
                        } else if (i3 == 1) {
                            i4 = o2lVar.n;
                            rjcVar2 = o2lVar.m;
                            qgg.h0(obj3);
                        } else if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                        o2lVar.m = null;
                        o2lVar.n = i4;
                        o2lVar.k = 2;
                        if (rjcVar2.emit(obj3, o2lVar) == nm6Var2) {
                        }
                    }
                }
                o2lVar = new o2l(this, continuation);
                obj3 = o2lVar.j;
                nm6Var2 = nm6.a;
                i3 = o2lVar.k;
                if (i3 != 0) {
                }
                o2lVar.m = null;
                o2lVar.n = i4;
                o2lVar.k = 2;
                if (rjcVar2.emit(obj3, o2lVar) == nm6Var2) {
                }
                break;
        }
        return Unit.a;
    }
}
