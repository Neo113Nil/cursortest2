package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ajp implements rjc {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ qqi b;
    public final /* synthetic */ jtc c;
    public final /* synthetic */ xip d;

    public ajp(AtomicBoolean atomicBoolean, qqi qqiVar, jtc jtcVar, xip xipVar) {
        this.a = atomicBoolean;
        this.b = qqiVar;
        this.c = jtcVar;
        this.d = xipVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        if (r10.E(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        zip zipVar;
        int i;
        ajp ajpVar;
        oqi oqiVar;
        ajp ajpVar2;
        Object obj2;
        xip xipVar;
        Object obj3;
        oqi oqiVar2;
        xip xipVar2;
        try {
            if (continuation instanceof zip) {
                zipVar = (zip) continuation;
                int i2 = zipVar.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zipVar.p = i2 - Integer.MIN_VALUE;
                    Object obj4 = zipVar.n;
                    nm6 nm6Var = nm6.a;
                    i = zipVar.p;
                    if (i != 0) {
                        qgg.h0(obj4);
                        if (this.a.compareAndSet(false, true)) {
                            zipVar.j = this;
                            zipVar.k = obj;
                            oqiVar = this.b;
                            zipVar.l = oqiVar;
                            xip xipVar3 = this.d;
                            zipVar.m = xipVar3;
                            zipVar.p = 1;
                            if (oqiVar.a(zipVar) != nm6Var) {
                                ajpVar2 = this;
                                obj2 = obj;
                                xipVar = xipVar3;
                            }
                            return nm6Var;
                        }
                        ajpVar = this;
                        jtc jtcVar = ajpVar.c;
                        zipVar.j = ajpVar;
                        zipVar.k = obj;
                        zipVar.l = null;
                        zipVar.m = null;
                        zipVar.p = 2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                xipVar2 = (xip) zipVar.l;
                                oqiVar2 = (oqi) zipVar.k;
                                obj3 = zipVar.j;
                                qgg.h0(obj4);
                                try {
                                    xipVar2.getClass();
                                    jkk.c();
                                    try {
                                        jkk.a();
                                        xipVar2.g(obj3);
                                        jkk.a.getClass();
                                        oqiVar.b(null);
                                        return Unit.a;
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            obj = zipVar.k;
                            ajpVar = (ajp) zipVar.j;
                            qgg.h0(obj4);
                            qqi qqiVar = ajpVar.b;
                            xip xipVar4 = ajpVar.d;
                            zipVar.j = obj;
                            zipVar.k = qqiVar;
                            zipVar.l = xipVar4;
                            zipVar.p = 3;
                            if (qqiVar.a(zipVar) != nm6Var) {
                                obj3 = obj;
                                oqiVar2 = qqiVar;
                                xipVar2 = xipVar4;
                                xipVar2.getClass();
                                jkk.c();
                                jkk.a();
                                xipVar2.g(obj3);
                                jkk.a.getClass();
                                oqiVar.b(null);
                                return Unit.a;
                            }
                            return nm6Var;
                        }
                        xipVar = zipVar.m;
                        oqiVar = (oqi) zipVar.l;
                        obj2 = zipVar.k;
                        ajpVar2 = (ajp) zipVar.j;
                        qgg.h0(obj4);
                    }
                    xipVar.e(new s2i());
                    oqiVar.b(null);
                    obj = obj2;
                    ajpVar = ajpVar2;
                    jtc jtcVar2 = ajpVar.c;
                    zipVar.j = ajpVar;
                    zipVar.k = obj;
                    zipVar.l = null;
                    zipVar.m = null;
                    zipVar.p = 2;
                }
            }
            xipVar.e(new s2i());
            oqiVar.b(null);
            obj = obj2;
            ajpVar = ajpVar2;
            jtc jtcVar22 = ajpVar.c;
            zipVar.j = ajpVar;
            zipVar.k = obj;
            zipVar.l = null;
            zipVar.m = null;
            zipVar.p = 2;
        } finally {
        }
        zipVar = new zip(this, continuation);
        Object obj42 = zipVar.n;
        nm6 nm6Var2 = nm6.a;
        i = zipVar.p;
        if (i != 0) {
        }
    }
}
