package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class dfd extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jfd m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfd(Continuation continuation, jfd jfdVar, boolean z) {
        super(3, continuation);
        this.m = jfdVar;
        this.n = z;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dfd dfdVar = new dfd((Continuation) obj3, this.m, this.n);
        dfdVar.k = (rjc) obj;
        dfdVar.l = obj2;
        return dfdVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pjc enoVar;
        int ordinal;
        Object y;
        Object obj2 = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = this.k;
            bfd bfdVar = (bfd) this.l;
            cfd cfdVar = bfdVar.a;
            cfd cfdVar2 = bfdVar.b;
            int ordinal2 = cfdVar.ordinal();
            jfd jfdVar = this.m;
            pjc pjcVar = z4b.a;
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2 && ordinal2 != 3) {
                        b6e.s();
                        return null;
                    }
                    enoVar = new eno(new z21(2, 20, null));
                    pjc X = zsd.X(zsd.b0(new clc(enoVar, new z21(2, 22, null))), this.n ? 0L : 1000L);
                    ordinal = cfdVar2.ordinal();
                    if (ordinal == 0) {
                        akd akdVar = (akd) jfdVar.d.getValue();
                        pjd pjdVar = (pjd) akdVar.d.i.getValue();
                        if (pjdVar instanceof njd) {
                            pjcVar = new eno(new d57(akdVar, ((njd) pjdVar).a, (Continuation) null));
                        } else {
                            if (!(pjdVar instanceof ojd) && !(pjdVar instanceof jjd) && !(pjdVar instanceof mjd)) {
                                b6e.s();
                                return null;
                            }
                            pjcVar = new eno(new z21(2, 29, null));
                        }
                    } else if (ordinal != 1 && ordinal != 2) {
                        if (ordinal != 3) {
                            b6e.s();
                            return null;
                        }
                        pjcVar = new eno(new z21(2, 21, null));
                    }
                    pjc b0 = zsd.b0(new clc(pjcVar, new z21(2, 23, null)));
                    efd efdVar = efd.a;
                    this.k = null;
                    this.l = null;
                    this.j = 1;
                    zsd.f0(rjcVar);
                    y = tt0.y(rjcVar, new l1(efdVar, (Continuation) null, 25), this, wg.s, new pjc[]{X, b0});
                    if (y != obj2) {
                        y = Unit.a;
                    }
                    if (y != obj2) {
                        y = Unit.a;
                    }
                    if (y == obj2) {
                        return obj2;
                    }
                }
                enoVar = pjcVar;
                pjc X2 = zsd.X(zsd.b0(new clc(enoVar, new z21(2, 22, null))), this.n ? 0L : 1000L);
                ordinal = cfdVar2.ordinal();
                if (ordinal == 0) {
                }
                pjc b02 = zsd.b0(new clc(pjcVar, new z21(2, 23, null)));
                efd efdVar2 = efd.a;
                this.k = null;
                this.l = null;
                this.j = 1;
                zsd.f0(rjcVar);
                y = tt0.y(rjcVar, new l1(efdVar2, (Continuation) null, 25), this, wg.s, new pjc[]{X2, b02});
                if (y != obj2) {
                }
                if (y != obj2) {
                }
                if (y == obj2) {
                }
            } else {
                ohd ohdVar = (ohd) jfdVar.c.getValue();
                ijd ijdVar = (ijd) ohdVar.c.h.getValue();
                if (ijdVar instanceof gjd) {
                    enoVar = new ub7(23, zsd.I(new akc(ohdVar, ((gjd) ijdVar).a, (Continuation) null, 13)), ohdVar);
                } else {
                    if (!(ijdVar instanceof cjd)) {
                        if (ijdVar instanceof hjd) {
                            enoVar = new eno(new z21(2, 27, null));
                        } else {
                            if (!(ijdVar instanceof fjd)) {
                                b6e.s();
                                return null;
                            }
                            enoVar = new eno(new z21(2, 28, null));
                        }
                    }
                    enoVar = pjcVar;
                }
                pjc X22 = zsd.X(zsd.b0(new clc(enoVar, new z21(2, 22, null))), this.n ? 0L : 1000L);
                ordinal = cfdVar2.ordinal();
                if (ordinal == 0) {
                }
                pjc b022 = zsd.b0(new clc(pjcVar, new z21(2, 23, null)));
                efd efdVar22 = efd.a;
                this.k = null;
                this.l = null;
                this.j = 1;
                zsd.f0(rjcVar);
                y = tt0.y(rjcVar, new l1(efdVar22, (Continuation) null, 25), this, wg.s, new pjc[]{X22, b022});
                if (y != obj2) {
                }
                if (y != obj2) {
                }
                if (y == obj2) {
                }
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
