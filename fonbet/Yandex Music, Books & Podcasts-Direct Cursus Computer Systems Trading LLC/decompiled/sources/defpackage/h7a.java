package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h7a implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;
    public final /* synthetic */ int c;

    public /* synthetic */ h7a(pjc pjcVar, int i, int i2) {
        this.a = i2;
        this.b = pjcVar;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        llc llcVar;
        int i;
        p2 e;
        Object obj;
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new mh2(rjcVar, this.c, 2), continuation);
                return collect == nm6.a ? collect : Unit.a;
            case 1:
                Object collect2 = this.b.collect(new wy1(new vqn(), this.c, rjcVar), continuation);
                return collect2 == nm6.a ? collect2 : Unit.a;
            default:
                if (continuation instanceof llc) {
                    llcVar = (llc) continuation;
                    int i2 = llcVar.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        llcVar.k = i2 - Integer.MIN_VALUE;
                        Object obj2 = llcVar.j;
                        nm6 nm6Var = nm6.a;
                        i = llcVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Object obj3 = new Object();
                            vqn vqnVar = new vqn();
                            try {
                                pjc pjcVar = this.b;
                                nlc nlcVar = new nlc(vqnVar, this.c, rjcVar, obj3);
                                llcVar.m = obj3;
                                llcVar.k = 1;
                                if (pjcVar.collect(nlcVar, llcVar) == nm6Var) {
                                    return nm6Var;
                                }
                            } catch (p2 e2) {
                                e = e2;
                                obj = obj3;
                                if (e.a != obj) {
                                    throw e;
                                }
                                return Unit.a;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = llcVar.m;
                            try {
                                qgg.h0(obj2);
                            } catch (p2 e3) {
                                e = e3;
                                if (e.a != obj) {
                                }
                                return Unit.a;
                            }
                        }
                        return Unit.a;
                    }
                }
                llcVar = new llc(this, continuation);
                Object obj22 = llcVar.j;
                nm6 nm6Var2 = nm6.a;
                i = llcVar.k;
                if (i != 0) {
                }
                return Unit.a;
        }
    }
}
