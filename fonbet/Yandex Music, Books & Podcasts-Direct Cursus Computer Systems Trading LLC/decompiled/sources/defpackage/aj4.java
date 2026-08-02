package defpackage;

import com.connectsdk.service.DeviceService;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class aj4 extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public boolean k;
    public int l;
    public final /* synthetic */ boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj4(sdr sdrVar, boolean z, boolean z2, sbu sbuVar, aqi aqiVar, aqi aqiVar2, Continuation continuation) {
        super(2, continuation);
        this.n = sdrVar;
        this.k = z;
        this.m = z2;
        this.o = sbuVar;
        this.p = aqiVar;
        this.q = aqiVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                aj4 aj4Var = new aj4((rfk) this.o, (bm2) this.p, this.k, (osh) this.q, this.m, continuation);
                aj4Var.n = obj;
                return aj4Var;
            case 1:
                return new aj4((nq7) this.n, (e4d) this.o, (String) this.p, this.m, (b3l) this.q, continuation);
            default:
                return new aj4((sdr) this.n, this.k, this.m, (sbu) this.o, (aqi) this.p, (aqi) this.q, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((aj4) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r1.emit(r4, r19) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        if (r2 == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        if (r6 == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014b, code lost:
    
        if (r2 == r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ae, code lost:
    
        if (r2 == r6) goto L78;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object V;
        Object a;
        Object a2;
        boolean booleanValue;
        Object b;
        int i = this.j;
        int i2 = 0;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        boolean z = this.m;
        switch (i) {
            case 0:
                bm2 bm2Var = (bm2) obj3;
                rfk rfkVar = (rfk) obj4;
                osh oshVar = (osh) obj2;
                g0c g0cVar = (g0c) oshVar.b;
                nm6 nm6Var = nm6.a;
                int i3 = this.l;
                xi4 xi4Var = xi4.a;
                Continuation continuation = null;
                if (i3 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var = (mm6) this.n;
                    if (o8g.B(rfkVar)) {
                        e8w e8wVar = e8w.a;
                        if (((Boolean) e8w.c.getValue()).booleanValue()) {
                            if (!this.k) {
                                if (z) {
                                    qdc qdcVar = (qdc) oshVar.a;
                                    this.l = 3;
                                    V = x97.V((a) qdcVar.c, new n71((Object) continuation, (Object) bm2Var, (Object) qdcVar, continuation, 13), this);
                                    break;
                                }
                            } else {
                                qne p = gut.p();
                                x60 x60Var = (x60) g0cVar;
                                x60Var.getClass();
                                x60Var.a(p);
                                o8g.w(rfkVar);
                                this.n = mm6Var;
                                this.l = 1;
                                a = e8wVar.a(this);
                                break;
                            }
                            break;
                        }
                    }
                } else if (i3 == 1) {
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                    r7o r7oVar = z7o.b;
                    if (a instanceof t7o) {
                        a = null;
                    }
                    if (((si4) a) == null) {
                        qne m = qne.m(gut.p(), null, 3);
                        x60 x60Var2 = (x60) g0cVar;
                        x60Var2.getClass();
                        x60Var2.a(m);
                        break;
                    } else {
                        qne A = gut.p().A(null);
                        x60 x60Var3 = (x60) g0cVar;
                        x60Var3.getClass();
                        x60Var3.a(A);
                        Object obj5 = ri4.m;
                        if (!obj5.equals(ri4.l) && !obj5.equals(obj5)) {
                            b6e.s();
                        }
                    }
                } else if (i3 == 2) {
                    qgg.h0(obj);
                    break;
                } else if (i3 == 3) {
                    qgg.h0(obj);
                    V = obj;
                    sqr sqrVar = (sqr) V;
                    if (!Intrinsics.d(sqrVar.a, BigDecimal.ZERO)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        r1f r1fVar = r1f.a;
                        linkedHashMap.put("from_check_payment", new mc3(false));
                        linkedHashMap.put(DeviceService.KEY_DESC, new jkr("Началось пополнение при совершении платежа"));
                        vtm vtmVar = new vtm((Map) linkedHashMap);
                        ci0 ci0Var = qjb.a;
                        ci0Var.a = su4.g(1, ci0Var.a);
                        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                        qne j = su4.j(vtmVar, "event_name", "top_up_started", "top_up_started", vtmVar);
                        x60 x60Var4 = (x60) g0cVar;
                        x60Var4.getClass();
                        x60Var4.a(j);
                        break;
                    }
                } else {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            case 1:
                nq7 nq7Var = (nq7) this.n;
                d5d d5dVar = nq7Var.r;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.l = 1;
                    a2 = nq7Var.k.a((e4d) obj4, d5dVar, (String) obj3, this);
                    break;
                } else if (i4 == 1) {
                    qgg.h0(obj);
                    a2 = obj;
                } else if (i4 == 2) {
                    boolean z2 = this.k;
                    qgg.h0(obj);
                    booleanValue = z2;
                    b = obj;
                    rj6 rj6Var = (rj6) b;
                    if (!(rj6Var instanceof qj6)) {
                        if (!(rj6Var instanceof pj6)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        x0q x0qVar = nq7Var.s;
                        Pair pair = new Pair(((qj6) rj6Var).a, (b3l) obj2);
                        this.k = booleanValue;
                        this.l = 3;
                        break;
                    }
                } else if (i4 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                booleanValue = ((Boolean) a2).booleanValue();
                if (booleanValue && z) {
                    b5d b5dVar = nq7Var.l;
                    n5n a3 = nq7Var.i.a();
                    this.k = booleanValue;
                    this.l = 2;
                    b = b5dVar.b(d5dVar, a3, this);
                    break;
                }
            default:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new ncu(i2, (sdr) this.n, this.k, z));
                    v24 v24Var = new v24((sbu) obj4, (aqi) obj3, (aqi) obj2, null);
                    this.l = 1;
                    if (zsd.O(s0, v24Var, this) == nm6Var3) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj4(rfk rfkVar, bm2 bm2Var, boolean z, osh oshVar, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.o = rfkVar;
        this.p = bm2Var;
        this.k = z;
        this.q = oshVar;
        this.m = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj4(nq7 nq7Var, e4d e4dVar, String str, boolean z, b3l b3lVar, Continuation continuation) {
        super(2, continuation);
        this.n = nq7Var;
        this.o = e4dVar;
        this.p = str;
        this.m = z;
        this.q = b3lVar;
    }
}
