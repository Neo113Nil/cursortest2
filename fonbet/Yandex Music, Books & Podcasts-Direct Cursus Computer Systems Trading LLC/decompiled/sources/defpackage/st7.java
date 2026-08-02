package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.plus.pay.api.feature.tarifficator.payment.j;
import com.yandex.plus.pay.api.feature.tarifficator.payment.k;
import com.yandex.plus.pay.api.feature.tarifficator.payment.l;
import com.yandex.plus.pay.api.feature.tarifficator.payment.m;
import com.yandex.plus.pay.api.feature.tarifficator.payment.n;
import com.yandex.plus.pay.api.feature.tarifficator.payment.o;
import com.yandex.plus.pay.api.feature.tarifficator.payment.p;
import com.yandex.plus.pay.api.feature.tarifficator.payment.q;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.i;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.listener.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class st7 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st7(au7 au7Var, Continuation continuation, au7 au7Var2, s9p s9pVar) {
        super(2, continuation);
        this.j = 0;
        this.o = au7Var;
        this.p = au7Var2;
        this.q = s9pVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new st7((au7) this.o, continuation, (au7) this.p, (s9p) this.q);
            case 1:
                st7 st7Var = new st7((q04) this.r, continuation);
                st7Var.m = obj;
                return st7Var;
            case 2:
                return new st7((mm6) this.m, (yrl) this.r, continuation);
            case 3:
                return new st7((ExoPlayer) this.q, (bqi) this.m, (e0r) this.r, continuation, 3);
            case 4:
                return new st7((ExoPlayer) this.q, (bqi) this.m, (e0r) this.r, continuation, 4);
            case 5:
                return new st7((wnr) this.q, (fk0) this.m, (act) this.r, continuation, 5);
            default:
                st7 st7Var2 = new st7((d) this.p, (r0o) this.q, (a) this.r, continuation);
                st7Var2.m = obj;
                return st7Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((st7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((st7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((st7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((st7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((st7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((st7) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((st7) create((p) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x02cf, code lost:
    
        if (r3 == r2) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b8, code lost:
    
        if (r6 == r2) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, oqi] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v14, types: [mu7] */
    /* JADX WARN: Type inference failed for: r5v17, types: [mu7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0187 -> B:58:0x018b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0213 -> B:78:0x0217). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oqi oqiVar;
        int i;
        e5q e5qVar;
        tyu tyuVar;
        gyn gynVar;
        Boolean bool;
        s9p s9pVar;
        e5q h;
        eu7 x;
        Object obj2;
        ou7 p;
        Object s;
        int i2;
        ou7 ou7Var;
        ?? r0;
        drf[] drfVarArr;
        Object H;
        int i3;
        drf[] drfVarArr2;
        ?? r2;
        Object H2;
        drf[] drfVarArr3;
        ?? r3;
        r2f y;
        Object a;
        List list;
        Object a2;
        yrl yrlVar;
        csl cslVar;
        ExoPlayer exoPlayer;
        int i4;
        e0r e0rVar;
        bqi bqiVar;
        ExoPlayer exoPlayer2;
        int i5;
        e0r e0rVar2;
        bqi bqiVar2;
        act actVar;
        int i6;
        Iterator it;
        fk0 fk0Var;
        a aVar;
        Iterator it2;
        int i7;
        int i8 = 3;
        int i9 = 0;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                s9p s9pVar2 = (s9p) this.q;
                au7 au7Var = (au7) this.p;
                nm6 nm6Var = nm6.a;
                ?? r22 = this.l;
                try {
                    if (r22 == 0) {
                        qgg.h0(obj);
                        oqiVar = (qqi) ((au7) this.o).m;
                        this.n = oqiVar;
                        this.k = 0;
                        this.l = 1;
                        if (oqiVar.a(this) != nm6Var) {
                            i = 0;
                        }
                        return nm6Var;
                    }
                    if (r22 != 1) {
                        if (r22 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eu7 eu7Var = (eu7) this.r;
                        obj2 = this.m;
                        oqiVar = (oqi) this.n;
                        qgg.h0(obj);
                        x = eu7Var;
                        au7.g(au7Var, x, (e5q) obj2, false, null, null, (s9p) this.q, 92);
                        bool = Boolean.TRUE;
                        oqiVar.b(null);
                        return bool;
                    }
                    int i10 = this.k;
                    oqi oqiVar2 = (oqi) this.n;
                    qgg.h0(obj);
                    i = i10;
                    oqiVar = oqiVar2;
                    Object value = ((xdr) au7Var.o).getValue();
                    xvu xvuVar = value instanceof xvu ? (xvu) value : null;
                    if (xvuVar == null) {
                        bool = Boolean.FALSE;
                    } else {
                        if (xvuVar instanceof bwu) {
                            e5qVar = ((bwu) xvuVar).b;
                        } else {
                            if (!(xvuVar instanceof fwu)) {
                                throw new x7j();
                            }
                            e5qVar = ((fwu) xvuVar).b;
                        }
                        if (xvuVar instanceof bwu) {
                            tyuVar = ((bwu) xvuVar).a;
                        } else {
                            if (!(xvuVar instanceof fwu)) {
                                throw new x7j();
                            }
                            tyuVar = ((fwu) xvuVar).a;
                        }
                        if (xvuVar instanceof bwu) {
                            gynVar = ((bwu) xvuVar).a.b;
                        } else {
                            if (!(xvuVar instanceof fwu)) {
                                throw new x7j();
                            }
                            gynVar = ((fwu) xvuVar).a.b;
                        }
                        aou id = e5qVar.getId();
                        if (id instanceof tnu) {
                            s9pVar = ((tnu) id).a;
                        } else if (id instanceof unu) {
                            s9pVar = ((unu) id).a;
                        } else {
                            bool = Boolean.FALSE;
                        }
                        if (!Intrinsics.d(s9pVar2, s9pVar)) {
                            if (e5qVar instanceof u4q) {
                                h = u4q.h((u4q) e5qVar, null, s9pVar2, 31);
                            } else if (e5qVar instanceof w4q) {
                                h = w4q.h((w4q) e5qVar, null, s9pVar2, 31);
                            } else {
                                bool = Boolean.FALSE;
                            }
                            e5q e5qVar2 = h;
                            x = i4w.x(tyuVar.a, 0);
                            xdr xdrVar = (xdr) au7Var.o;
                            fwu f = au7Var.f(x, gynVar, e5qVar2, false, a3l.a);
                            xdrVar.getClass();
                            xdrVar.m(null, f);
                            jac jacVar = (jac) au7Var.b;
                            this.n = oqiVar;
                            this.m = e5qVar2;
                            this.r = x;
                            this.k = i;
                            this.l = 2;
                            if (jacVar.c(this) != nm6Var) {
                                obj2 = e5qVar2;
                                au7.g(au7Var, x, (e5q) obj2, false, null, null, (s9p) this.q, 92);
                                bool = Boolean.TRUE;
                            }
                            return nm6Var;
                        }
                        bool = Boolean.TRUE;
                    }
                    oqiVar.b(null);
                    return bool;
                } catch (Throwable th) {
                    r22.b(null);
                    throw th;
                }
            case 1:
                q04 q04Var = (q04) this.r;
                mm6 mm6Var = (mm6) this.m;
                nm6 nm6Var2 = nm6.a;
                int i11 = this.l;
                if (i11 == 0) {
                    qgg.h0(obj);
                    mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
                    r12 r12Var = new r12(new nrf("collection_auto_cache_onboarding_id", "COLLECTION_AUTO_CACHE_ONBOARDING"));
                    ou7 p2 = x97.p(mm6Var, null, null, new f98(q04Var, continuation, 15), 3);
                    p = x97.p(mm6Var, null, null, new j57(q04Var, continuation, 18), 3);
                    ou7 p3 = x97.p(mm6Var, null, null, new f98(q04Var, continuation, 14), 3);
                    drf[] drfVarArr4 = new drf[4];
                    drfVarArr4[0] = r12Var;
                    this.m = null;
                    this.n = p;
                    this.o = p3;
                    this.p = drfVarArr4;
                    this.q = drfVarArr4;
                    this.k = 1;
                    this.l = 1;
                    s = p2.s(this);
                    if (s != nm6Var2) {
                        i2 = 1;
                        ou7Var = p3;
                        r0 = drfVarArr4;
                        drfVarArr = drfVarArr4;
                    }
                    return nm6Var2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i8 = this.k;
                        drf[] drfVarArr5 = (drf[]) ((Object[]) this.q);
                        drfVarArr3 = (drf[]) ((Object[]) this.p);
                        qgg.h0(obj);
                        r3 = drfVarArr5;
                        H2 = obj;
                        r3[i8] = H2;
                        return u75.h(drfVarArr3);
                    }
                    int i12 = this.k;
                    drf[] drfVarArr6 = (drf[]) ((Object[]) this.q);
                    drf[] drfVarArr7 = (drf[]) ((Object[]) this.p);
                    ?? r5 = (mu7) this.o;
                    qgg.h0(obj);
                    ou7Var = r5;
                    i3 = i12;
                    drfVarArr2 = drfVarArr7;
                    r2 = drfVarArr6;
                    H = obj;
                    r2[i3] = H;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.p = drfVarArr2;
                    this.q = drfVarArr2;
                    this.k = 3;
                    this.l = 3;
                    H2 = ou7Var.H(this);
                    if (H2 != nm6Var2) {
                        drfVarArr3 = drfVarArr2;
                        r3 = drfVarArr2;
                        r3[i8] = H2;
                        return u75.h(drfVarArr3);
                    }
                    return nm6Var2;
                }
                int i13 = this.k;
                drf[] drfVarArr8 = (drf[]) ((Object[]) this.q);
                drf[] drfVarArr9 = (drf[]) ((Object[]) this.p);
                ?? r52 = (mu7) this.o;
                ou7 ou7Var2 = (ou7) this.n;
                qgg.h0(obj);
                p = ou7Var2;
                i2 = i13;
                ou7Var = r52;
                s = obj;
                r0 = drfVarArr8;
                drfVarArr = drfVarArr9;
                r0[i2] = s;
                this.m = null;
                this.n = null;
                this.o = ou7Var;
                this.p = drfVarArr;
                this.q = drfVarArr;
                this.k = 2;
                this.l = 2;
                H = p.H(this);
                if (H != nm6Var2) {
                    i3 = 2;
                    drfVarArr2 = drfVarArr;
                    r2 = drfVarArr;
                    r2[i3] = H;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.p = drfVarArr2;
                    this.q = drfVarArr2;
                    this.k = 3;
                    this.l = 3;
                    H2 = ou7Var.H(this);
                    if (H2 != nm6Var2) {
                    }
                }
                return nm6Var2;
            case 2:
                yrl yrlVar2 = (yrl) this.r;
                nm6 nm6Var3 = nm6.a;
                int i14 = this.l;
                if (i14 == 0) {
                    qgg.h0(obj);
                    y = x97.y((mm6) this.m, null, null, new g2l(yrlVar2, continuation, 7), 3);
                    r0m r0mVar = (r0m) yrlVar2.h.getValue();
                    this.n = y;
                    this.l = 1;
                    a = r0mVar.a(this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cslVar = (csl) this.q;
                            yrlVar = (yrl) this.o;
                            qgg.h0(obj);
                            yrlVar.g.l(cslVar);
                            return Unit.a;
                        }
                        i9 = this.k;
                        List list2 = (List) this.p;
                        yrl yrlVar3 = (yrl) this.o;
                        y = (r2f) this.n;
                        qgg.h0(obj);
                        list = list2;
                        yrlVar2 = yrlVar3;
                        a2 = obj;
                        lnu lnuVar = (lnu) a2;
                        vrl vrlVar = yrlVar2.c;
                        cvl cvlVar = yrlVar2.a;
                        wbb wbbVar = (wbb) vrlVar.g.getValue();
                        wbbVar.getClass();
                        cvlVar.getClass();
                        String w = vz1.w(op7.c(cvlVar).a);
                        String J = rzf.J(cvlVar, ((z66) wbbVar.b.getValue()).h());
                        String str = cvlVar.b;
                        xbb xbbVar = new xbb(w, str, J, null, new rab(str, J, null, w, null, false, cvlVar.x), wbb.a(w, lnuVar, elu.b), null, null, qo6.e);
                        String str2 = cvlVar.q;
                        String obj3 = str2 != null ? StringsKt.t0(str2).toString() : null;
                        List list3 = list;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list3) {
                            if (((o0m) obj4).a) {
                                arrayList.add(obj4);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : list3) {
                            if (!((o0m) obj5).a) {
                                arrayList2.add(obj5);
                            }
                        }
                        l18 l18Var = l18.b;
                        bdt I = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        csl cslVar2 = new csl(xbbVar, obj3, lnuVar, arrayList, arrayList2, ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h());
                        this.n = null;
                        this.o = yrlVar2;
                        this.p = null;
                        this.q = cslVar2;
                        this.k = i9;
                        this.l = 3;
                        if (saf.C(y, this) != nm6Var3) {
                            yrlVar = yrlVar2;
                            cslVar = cslVar2;
                            yrlVar.g.l(cslVar);
                            return Unit.a;
                        }
                        return nm6Var3;
                    }
                    y = (r2f) this.n;
                    qgg.h0(obj);
                    a = obj;
                }
                list = (List) a;
                this.n = y;
                this.o = yrlVar2;
                this.p = list;
                this.k = 0;
                this.l = 2;
                a2 = yrl.a(yrlVar2, this);
                break;
            case 3:
                bqi bqiVar3 = (bqi) this.m;
                nm6 nm6Var4 = nm6.a;
                int i15 = this.l;
                if (i15 == 0) {
                    qgg.h0(obj);
                    exoPlayer = (ExoPlayer) this.q;
                    i4 = 0;
                    e0rVar = (e0r) this.r;
                    bqiVar = bqiVar3;
                    if (exoPlayer.J0() < e0rVar.d) {
                    }
                    Float f2 = new Float(1.0f);
                    xdr xdrVar2 = (xdr) bqiVar3;
                    xdrVar2.getClass();
                    xdrVar2.m(null, f2);
                    return Unit.a;
                }
                if (i15 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = this.k;
                bqiVar = (bqi) this.p;
                e0rVar = (e0r) this.o;
                exoPlayer = (ExoPlayer) this.n;
                qgg.h0(obj);
                long J0 = exoPlayer.J0();
                long j = e0rVar.c;
                long j2 = e0rVar.d;
                if (J0 <= j2 && j <= J0) {
                    Float f3 = new Float(zwf.w(j2, J0, e0rVar.g));
                    xdr xdrVar3 = (xdr) bqiVar;
                    xdrVar3.getClass();
                    xdrVar3.m(null, f3);
                }
                if (exoPlayer.J0() < e0rVar.d || !exoPlayer.e()) {
                    Float f22 = new Float(1.0f);
                    xdr xdrVar22 = (xdr) bqiVar3;
                    xdrVar22.getClass();
                    xdrVar22.m(null, f22);
                    return Unit.a;
                }
                long j3 = e0rVar.b;
                this.n = exoPlayer;
                this.o = e0rVar;
                this.p = bqiVar;
                this.k = i4;
                this.l = 1;
                if (y2x.o(j3, this) == nm6Var4) {
                    return nm6Var4;
                }
                long J02 = exoPlayer.J0();
                long j4 = e0rVar.c;
                long j22 = e0rVar.d;
                if (J02 <= j22) {
                    Float f32 = new Float(zwf.w(j22, J02, e0rVar.g));
                    xdr xdrVar32 = (xdr) bqiVar;
                    xdrVar32.getClass();
                    xdrVar32.m(null, f32);
                }
                if (exoPlayer.J0() < e0rVar.d) {
                }
                Float f222 = new Float(1.0f);
                xdr xdrVar222 = (xdr) bqiVar3;
                xdrVar222.getClass();
                xdrVar222.m(null, f222);
                return Unit.a;
            case 4:
                bqi bqiVar4 = (bqi) this.m;
                nm6 nm6Var5 = nm6.a;
                int i16 = this.l;
                if (i16 == 0) {
                    qgg.h0(obj);
                    exoPlayer2 = (ExoPlayer) this.q;
                    i5 = 0;
                    e0rVar2 = (e0r) this.r;
                    bqiVar2 = bqiVar4;
                    if (exoPlayer2.J0() < e0rVar2.d) {
                    }
                    Float f4 = new Float(1.0f);
                    xdr xdrVar4 = (xdr) bqiVar4;
                    xdrVar4.getClass();
                    xdrVar4.m(null, f4);
                    return Unit.a;
                }
                if (i16 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = this.k;
                bqiVar2 = (bqi) this.p;
                e0rVar2 = (e0r) this.o;
                exoPlayer2 = (ExoPlayer) this.n;
                qgg.h0(obj);
                long J03 = exoPlayer2.J0();
                long j5 = e0rVar2.c;
                long j6 = e0rVar2.d;
                if (J03 <= j6 && j5 <= J03) {
                    Float f5 = new Float(zwf.w(j6, J03, e0rVar2.g));
                    xdr xdrVar5 = (xdr) bqiVar2;
                    xdrVar5.getClass();
                    xdrVar5.m(null, f5);
                }
                if (exoPlayer2.J0() < e0rVar2.d || !exoPlayer2.e()) {
                    Float f42 = new Float(1.0f);
                    xdr xdrVar42 = (xdr) bqiVar4;
                    xdrVar42.getClass();
                    xdrVar42.m(null, f42);
                    return Unit.a;
                }
                long j7 = e0rVar2.b;
                this.n = exoPlayer2;
                this.o = e0rVar2;
                this.p = bqiVar2;
                this.k = i5;
                this.l = 1;
                if (y2x.o(j7, this) == nm6Var5) {
                    return nm6Var5;
                }
                long J032 = exoPlayer2.J0();
                long j52 = e0rVar2.c;
                long j62 = e0rVar2.d;
                if (J032 <= j62) {
                    Float f52 = new Float(zwf.w(j62, J032, e0rVar2.g));
                    xdr xdrVar52 = (xdr) bqiVar2;
                    xdrVar52.getClass();
                    xdrVar52.m(null, f52);
                }
                if (exoPlayer2.J0() < e0rVar2.d) {
                }
                Float f422 = new Float(1.0f);
                xdr xdrVar422 = (xdr) bqiVar4;
                xdrVar422.getClass();
                xdrVar422.m(null, f422);
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i17 = this.l;
                if (i17 == 0) {
                    qgg.h0(obj);
                    List list4 = ((wnr) this.q).a;
                    fk0 fk0Var2 = (fk0) this.m;
                    actVar = (act) this.r;
                    i6 = 0;
                    it = list4.iterator();
                    fk0Var = fk0Var2;
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i18 = this.k;
                    Iterator it3 = (Iterator) this.p;
                    actVar = (act) this.o;
                    fk0 fk0Var3 = (fk0) this.n;
                    qgg.h0(obj);
                    i6 = i18;
                    it = it3;
                    fk0Var = fk0Var3;
                }
                while (it.hasNext()) {
                    cma cmaVar = new cma(((Number) it.next()).floatValue());
                    this.n = fk0Var;
                    this.o = actVar;
                    this.p = it;
                    this.k = i6;
                    this.l = 1;
                    if (fk0.c(fk0Var, cmaVar, actVar, null, this, 12) == nm6Var6) {
                        return nm6Var6;
                    }
                }
                return Unit.a;
            default:
                d dVar = (d) this.p;
                p pVar = (p) this.m;
                nm6 nm6Var7 = nm6.a;
                int i19 = this.l;
                if (i19 == 0) {
                    qgg.h0(obj);
                    List list5 = dVar.b;
                    aVar = (a) this.r;
                    it2 = list5.iterator();
                    i7 = 0;
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = this.k;
                    it2 = (Iterator) this.o;
                    aVar = (a) this.n;
                    qgg.h0(obj);
                }
                while (it2.hasNext()) {
                    b bVar = (b) it2.next();
                    this.m = pVar;
                    this.n = aVar;
                    this.o = it2;
                    this.k = i7;
                    this.l = 1;
                    if (bVar.a(aVar, pVar) == nm6Var7) {
                        return nm6Var7;
                    }
                }
                r0o r0oVar = (r0o) this.q;
                if ((pVar instanceof n) || (pVar instanceof m) || (pVar instanceof j)) {
                    if (r0oVar.b) {
                        ((Function0) r0oVar.d).invoke();
                        r0oVar.b = false;
                    }
                } else if (pVar instanceof o) {
                    o oVar = (o) pVar;
                    String str3 = oVar.a;
                    q qVar = oVar.b;
                    i iVar = new i(str3, new q(qVar.a, qVar.b));
                    r0oVar.getClass();
                    if (!r0oVar.b) {
                        r0oVar.b = true;
                        ((Function1) r0oVar.c).invoke(iVar);
                    }
                } else {
                    if (!(pVar instanceof l) && !(pVar instanceof k) && !(pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.i)) {
                        b6e.s();
                        return null;
                    }
                    if (r0oVar.b) {
                        ((Function0) r0oVar.d).invoke();
                        r0oVar.b = false;
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st7(mm6 mm6Var, yrl yrlVar, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.m = mm6Var;
        this.r = yrlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st7(q04 q04Var, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.r = q04Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st7(d dVar, r0o r0oVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.j = 6;
        this.p = dVar;
        this.q = r0oVar;
        this.r = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st7(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.q = obj;
        this.m = obj2;
        this.r = obj3;
    }
}
