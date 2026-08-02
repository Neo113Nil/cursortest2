package defpackage;

import android.graphics.Bitmap;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class jqp implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public jqp(rjc rjcVar, b5t b5tVar, ybb ybbVar) {
        this.a = 21;
        this.b = rjcVar;
        this.c = ybbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r11.emit(r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object obj, Continuation continuation) {
        byu byuVar;
        Object obj2;
        int i;
        rjc rjcVar;
        int i2;
        xxu xxuVar;
        xxu xxuVar2;
        rjc rjcVar2;
        if (continuation instanceof byu) {
            byuVar = (byu) continuation;
            int i3 = byuVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                byuVar.k = i3 - Integer.MIN_VALUE;
                obj2 = byuVar.j;
                nm6 nm6Var = nm6.a;
                i = byuVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    rjcVar = (rjc) this.b;
                    cuu cuuVar = (cuu) obj;
                    if (cuuVar != null && (xxuVar = cuuVar.b) != null) {
                        cyu cyuVar = (cyu) this.c;
                        String str = xxuVar.b;
                        byuVar.m = rjcVar;
                        byuVar.n = xxuVar;
                        byuVar.o = 0;
                        byuVar.k = 1;
                        Object a = cyu.a(cyuVar, str, byuVar);
                        if (a != nm6Var) {
                            xxuVar2 = xxuVar;
                            i2 = 0;
                            rjcVar2 = rjcVar;
                            obj2 = a;
                        }
                        return nm6Var;
                    }
                    i2 = 0;
                    xxuVar2 = null;
                    byuVar.m = null;
                    byuVar.n = null;
                    byuVar.o = i2;
                    byuVar.k = 2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = byuVar.o;
                    xxuVar2 = byuVar.n;
                    rjcVar2 = byuVar.m;
                    qgg.h0(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    rjcVar = rjcVar2;
                    byuVar.m = null;
                    byuVar.n = null;
                    byuVar.o = i2;
                    byuVar.k = 2;
                } else {
                    rjcVar = rjcVar2;
                    xxuVar2 = null;
                    byuVar.m = null;
                    byuVar.n = null;
                    byuVar.o = i2;
                    byuVar.k = 2;
                }
            }
        }
        byuVar = new byu(this, continuation);
        obj2 = byuVar.j;
        nm6 nm6Var2 = nm6.a;
        i = byuVar.k;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(List list, Continuation continuation) {
        krs krsVar;
        nm6 nm6Var;
        int i;
        ArrayList arrayList;
        List list2;
        ArrayList arrayList2;
        Object a;
        lnu lnuVar;
        List<sbb> list3;
        xbb xbbVar;
        ArrayList arrayList3;
        kcq kcqVar;
        List list4;
        ubb ubbVar;
        rar rarVar;
        rrs rrsVar;
        nrs nrsVar = (nrs) this.b;
        if (continuation instanceof krs) {
            krsVar = (krs) continuation;
            int i2 = krsVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                krsVar.q = i2 - Integer.MIN_VALUE;
                Object obj = krsVar.o;
                nm6Var = nm6.a;
                i = krsVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean n = nrsVar.a.n();
                    if (n) {
                        ArrayList J = xp3.J(nrsVar.a.f, c5b.a);
                        arrayList = new ArrayList(v75.o(J, 10));
                        Iterator it = J.iterator();
                        while (it.hasNext()) {
                            zp2 zp2Var = (zp2) it.next();
                            zp2Var.getClass();
                            u51 O = ghh.O(zp2Var);
                            arrayList.add(new r91(h4a.q(O), O));
                        }
                    } else {
                        if (n) {
                            b6e.s();
                            return null;
                        }
                        arrayList = null;
                    }
                    krsVar.j = list;
                    krsVar.k = arrayList;
                    krsVar.q = 1;
                    obj = nrs.b(nrsVar, krsVar);
                    if (obj != nm6Var) {
                        list2 = list;
                        arrayList2 = arrayList;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rrsVar = (rrs) krsVar.m;
                        List list5 = krsVar.j;
                        qgg.h0(obj);
                        nrsVar.h.l(rrsVar);
                        return Unit.a;
                    }
                    List list6 = krsVar.n;
                    xbb xbbVar2 = (xbb) krsVar.m;
                    lnu lnuVar2 = krsVar.l;
                    list3 = krsVar.j;
                    qgg.h0(obj);
                    xbbVar = xbbVar2;
                    lnuVar = lnuVar2;
                    arrayList3 = list6;
                    ArrayList arrayList4 = arrayList3;
                    List list7 = (List) obj;
                    list3.getClass();
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    for (sbb sbbVar : list3) {
                        if (sbbVar instanceof kcq) {
                            obj2 = sbbVar;
                        } else if (sbbVar instanceof wbq) {
                            obj3 = sbbVar;
                        } else if (sbbVar instanceof cdq) {
                            obj4 = sbbVar;
                        }
                    }
                    kcqVar = (kcq) obj2;
                    if (kcqVar == null) {
                        List list8 = list3;
                        ubbVar = new ubb(kcqVar, (wbq) obj3, (cdq) obj4);
                        list4 = list8;
                    } else {
                        list4 = list3;
                        ubbVar = null;
                    }
                    ArrayList B = bg3.B(list4);
                    ArrayList C = bg3.C(list4);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    rrs rrsVar2 = new rrs(xbbVar, arrayList4, list7, lnuVar, ubbVar, B, C, ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h());
                    rarVar = (rar) this.c;
                    krsVar.j = null;
                    krsVar.k = null;
                    krsVar.l = null;
                    krsVar.m = rrsVar2;
                    krsVar.n = null;
                    krsVar.q = 3;
                    if (saf.C(rarVar, krsVar) != nm6Var) {
                        rrsVar = rrsVar2;
                        nrsVar.h.l(rrsVar);
                        return Unit.a;
                    }
                    return nm6Var;
                }
                ArrayList arrayList5 = krsVar.k;
                list2 = krsVar.j;
                qgg.h0(obj);
                arrayList2 = arrayList5;
                lnu lnuVar3 = (lnu) obj;
                wbb wbbVar = (wbb) nrsVar.b.p.getValue();
                mqs mqsVar = nrsVar.a;
                wbbVar.getClass();
                mqsVar.getClass();
                String w = vz1.w(mqsVar.x0.a);
                long j = mqsVar.e;
                String r = hag.r(j);
                String str = mqsVar.c;
                jzb i3 = mqsVar.i();
                rab rabVar = new rab(mqsVar.c, r, null, w, mqsVar.i(), false, mqsVar.v0);
                klu a2 = wbb.a(w, lnuVar3, elu.c);
                msa msaVar = nsa.b;
                xbb xbbVar3 = new xbb(w, str, r, i3, rabVar, a2, null, xee.O(yd5.N(j, ssa.MILLISECONDS), new nha(8, wbbVar)), qo6.a);
                krsVar.j = list2;
                krsVar.k = null;
                krsVar.l = lnuVar3;
                krsVar.m = xbbVar3;
                krsVar.n = arrayList2;
                krsVar.q = 2;
                a = nrs.a(nrsVar, krsVar);
                if (a != nm6Var) {
                    lnuVar = lnuVar3;
                    obj = a;
                    list3 = list2;
                    xbbVar = xbbVar3;
                    arrayList3 = arrayList2;
                    ArrayList arrayList42 = arrayList3;
                    List list72 = (List) obj;
                    list3.getClass();
                    Object obj22 = null;
                    Object obj32 = null;
                    Object obj42 = null;
                    while (r1.hasNext()) {
                    }
                    kcqVar = (kcq) obj22;
                    if (kcqVar == null) {
                    }
                    ArrayList B2 = bg3.B(list4);
                    ArrayList C2 = bg3.C(list4);
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(byb.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    rrs rrsVar22 = new rrs(xbbVar, arrayList42, list72, lnuVar, ubbVar, B2, C2, ((ulu) ((byb) qdcVar2.C(I2)).c(ern.a(ulu.class))).h());
                    rarVar = (rar) this.c;
                    krsVar.j = null;
                    krsVar.k = null;
                    krsVar.l = null;
                    krsVar.m = rrsVar22;
                    krsVar.n = null;
                    krsVar.q = 3;
                    if (saf.C(rarVar, krsVar) != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        krsVar = new krs(this, continuation);
        Object obj5 = krsVar.o;
        nm6Var = nm6.a;
        i = krsVar.q;
        if (i != 0) {
        }
        lnu lnuVar32 = (lnu) obj5;
        wbb wbbVar2 = (wbb) nrsVar.b.p.getValue();
        mqs mqsVar2 = nrsVar.a;
        wbbVar2.getClass();
        mqsVar2.getClass();
        String w2 = vz1.w(mqsVar2.x0.a);
        long j2 = mqsVar2.e;
        String r2 = hag.r(j2);
        String str2 = mqsVar2.c;
        jzb i32 = mqsVar2.i();
        rab rabVar2 = new rab(mqsVar2.c, r2, null, w2, mqsVar2.i(), false, mqsVar2.v0);
        klu a22 = wbb.a(w2, lnuVar32, elu.c);
        msa msaVar2 = nsa.b;
        xbb xbbVar32 = new xbb(w2, str2, r2, i32, rabVar2, a22, null, xee.O(yd5.N(j2, ssa.MILLISECONDS), new nha(8, wbbVar2)), qo6.a);
        krsVar.j = list2;
        krsVar.k = null;
        krsVar.l = lnuVar32;
        krsVar.m = xbbVar32;
        krsVar.n = arrayList2;
        krsVar.q = 2;
        a = nrs.a(nrsVar, krsVar);
        if (a != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r8.emit(r13, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r8.emit(r13, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017e, code lost:
    
        if (r5.emit(r14, r0) != r1) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.String] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        iqp iqpVar;
        int i;
        xrp xrpVar;
        int i2;
        oyp oypVar;
        int i3;
        Object obj2;
        x1q x1qVar;
        int i4;
        Object xidVar;
        tgq tgqVar;
        int i5;
        Object ygtVar;
        vjq vjqVar;
        int i6;
        hpq hpqVar;
        int i7;
        lpq lpqVar;
        int i8;
        mqq mqqVar;
        int i9;
        gor gorVar;
        int i10;
        Object obj3;
        ror rorVar;
        int i11;
        Object oorVar;
        x3s x3sVar;
        int i12;
        s5s s5sVar;
        int i13;
        o7s o7sVar;
        int i14;
        rss rssVar;
        int i15;
        aus ausVar;
        int i16;
        exs exsVar;
        int i17;
        ozs ozsVar;
        int i18;
        a5t a5tVar;
        int i19;
        n7q n7qVar;
        j3u j3uVar;
        int i20;
        hcu hcuVar;
        int i21;
        mnu mnuVar;
        int i22;
        fou fouVar;
        int i23;
        rjc rjcVar;
        lwu lwuVar;
        int i24;
        s9p y;
        Object c;
        rwu rwuVar;
        int i25;
        wyu wyuVar;
        int i26;
        int i27 = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Continuation continuation2 = null;
        Pair pair = null;
        switch (i27) {
            case 0:
                if (continuation instanceof iqp) {
                    iqpVar = (iqp) continuation;
                    int i28 = iqpVar.k;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        iqpVar.k = i28 - Integer.MIN_VALUE;
                        Object obj6 = iqpVar.j;
                        nm6 nm6Var = nm6.a;
                        i = iqpVar.k;
                        if (i != 0) {
                            qgg.h0(obj6);
                            h53 h53Var = new h53(((Boolean) obj).booleanValue(), (String) ((pqp) obj4).A.getValue());
                            iqpVar.k = 1;
                            if (((rjc) obj5).emit(h53Var, iqpVar) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj6);
                        }
                        return Unit.a;
                    }
                }
                iqpVar = new iqp(this, continuation);
                Object obj62 = iqpVar.j;
                nm6 nm6Var2 = nm6.a;
                i = iqpVar.k;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                yrp yrpVar = (yrp) obj4;
                if (continuation instanceof xrp) {
                    xrpVar = (xrp) continuation;
                    int i29 = xrpVar.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        xrpVar.k = i29 - Integer.MIN_VALUE;
                        Object obj7 = xrpVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = xrpVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj7);
                            prp prpVar = (prp) obj;
                            prpVar.getClass();
                            xdr xdrVar = (xdr) yrpVar.c;
                            xdrVar.getClass();
                            xdrVar.m(null, prpVar);
                            d73 d73Var = new d73(yrpVar.g);
                            xrpVar.k = 1;
                            if (((rjc) obj5).emit(d73Var, xrpVar) == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj7);
                        }
                        return Unit.a;
                    }
                }
                xrpVar = new xrp(this, continuation);
                Object obj72 = xrpVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = xrpVar.k;
                if (i2 != 0) {
                }
                return Unit.a;
            case 2:
                if (continuation instanceof oyp) {
                    oypVar = (oyp) continuation;
                    int i30 = oypVar.k;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        oypVar.k = i30 - Integer.MIN_VALUE;
                        Object obj8 = oypVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = oypVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj8);
                            rjc rjcVar2 = (rjc) obj5;
                            mq mqVar = (mq) obj;
                            mqVar.getClass();
                            int ordinal = mqVar.ordinal();
                            if (ordinal == 0) {
                                obj2 = vys.a;
                            } else {
                                if (ordinal != 1) {
                                    b6e.s();
                                    return null;
                                }
                                obj2 = wys.a;
                            }
                            Boolean valueOf = Boolean.valueOf(!obj2.equals((xys) obj4));
                            oypVar.k = 1;
                            if (rjcVar2.emit(valueOf, oypVar) == nm6Var4) {
                                return nm6Var4;
                            }
                        } else {
                            if (i3 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj8);
                        }
                        return Unit.a;
                    }
                }
                oypVar = new oyp(this, continuation);
                Object obj82 = oypVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = oypVar.k;
                if (i3 != 0) {
                }
                return Unit.a;
            case 3:
                z1q z1qVar = (z1q) obj4;
                uid uidVar = z1qVar.e;
                if (continuation instanceof x1q) {
                    x1qVar = (x1q) continuation;
                    int i31 = x1qVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        x1qVar.k = i31 - Integer.MIN_VALUE;
                        Object obj9 = x1qVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = x1qVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar3 = (rjc) obj5;
                            m1q m1qVar = ((t1q) obj).c;
                            if (m1qVar instanceof j1q) {
                                xidVar = new sid(uidVar.c, z1qVar, 0);
                            } else if (m1qVar instanceof c2q) {
                                xidVar = new sid(uidVar.c, z1qVar, 1);
                            } else {
                                if (!(m1qVar instanceof e2q)) {
                                    b6e.s();
                                    return null;
                                }
                                ced cedVar = uidVar.c;
                                cedVar.getClass();
                                xidVar = new xid(cedVar, z1qVar);
                            }
                            x1qVar.k = 1;
                            if (rjcVar3.emit(xidVar, x1qVar) == nm6Var5) {
                                return nm6Var5;
                            }
                        } else {
                            if (i4 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj9);
                        }
                        return Unit.a;
                    }
                }
                x1qVar = new x1q(this, continuation);
                Object obj92 = x1qVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = x1qVar.k;
                if (i4 != 0) {
                }
                return Unit.a;
            case 4:
                vgq vgqVar = ((ugq) obj4).b;
                if (continuation instanceof tgq) {
                    tgqVar = (tgq) continuation;
                    int i32 = tgqVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        tgqVar.k = i32 - Integer.MIN_VALUE;
                        Object obj10 = tgqVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = tgqVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj10);
                            rjc rjcVar4 = (rjc) obj5;
                            dhq dhqVar = (dhq) obj;
                            if (Intrinsics.d(dhqVar, bhq.a)) {
                                ygtVar = new ygt(vgqVar.e, c5b.a);
                            } else if (Intrinsics.d(dhqVar, chq.a)) {
                                ygtVar = new lgt(vgqVar.e, false);
                            } else {
                                if (!(dhqVar instanceof ahq)) {
                                    b6e.s();
                                    return null;
                                }
                                String str = vgqVar.e;
                                List list = ((ahq) dhqVar).b;
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    c24 a = s14.a((yit) it.next());
                                    if (a != null) {
                                        arrayList.add(a);
                                    }
                                }
                                ygtVar = new ygt(str, arrayList);
                            }
                            tgqVar.k = 1;
                            if (rjcVar4.emit(ygtVar, tgqVar) == nm6Var6) {
                                return nm6Var6;
                            }
                        } else {
                            if (i5 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj10);
                        }
                        return Unit.a;
                    }
                }
                tgqVar = new tgq(this, continuation);
                Object obj102 = tgqVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = tgqVar.k;
                if (i5 != 0) {
                }
                return Unit.a;
            case 5:
                if (continuation instanceof vjq) {
                    vjqVar = (vjq) continuation;
                    int i33 = vjqVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        vjqVar.k = i33 - Integer.MIN_VALUE;
                        Object obj11 = vjqVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = vjqVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj11);
                            Boolean valueOf2 = Boolean.valueOf(((wjq) obj4).d().contains((u0j) obj));
                            vjqVar.k = 1;
                            if (((rjc) obj5).emit(valueOf2, vjqVar) == nm6Var7) {
                                return nm6Var7;
                            }
                        } else {
                            if (i6 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj11);
                        }
                        return Unit.a;
                    }
                }
                vjqVar = new vjq(this, continuation);
                Object obj112 = vjqVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = vjqVar.k;
                if (i6 != 0) {
                }
                return Unit.a;
            case 6:
                if (continuation instanceof hpq) {
                    hpqVar = (hpq) continuation;
                    int i34 = hpqVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        hpqVar.k = i34 - Integer.MIN_VALUE;
                        Object obj12 = hpqVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = hpqVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar5 = (rjc) obj5;
                            if (((xdr) ((xqq) obj4).M()).getValue() instanceof bpq) {
                                hpqVar.k = 1;
                                if (rjcVar5.emit(obj, hpqVar) == nm6Var8) {
                                    return nm6Var8;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj12);
                        }
                        return Unit.a;
                    }
                }
                hpqVar = new hpq(this, continuation);
                Object obj122 = hpqVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = hpqVar.k;
                if (i7 != 0) {
                }
                return Unit.a;
            case 7:
                if (continuation instanceof lpq) {
                    lpqVar = (lpq) continuation;
                    int i35 = lpqVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        lpqVar.k = i35 - Integer.MIN_VALUE;
                        Object obj13 = lpqVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = lpqVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj13);
                            String c2 = ((skr) ((npq) obj4).l.getValue()).c(R.string.skeleton_landing_error_message);
                            lpqVar.k = 1;
                            if (((rjc) obj5).emit(c2, lpqVar) == nm6Var9) {
                                return nm6Var9;
                            }
                        } else {
                            if (i8 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj13);
                        }
                        return Unit.a;
                    }
                }
                lpqVar = new lpq(this, continuation);
                Object obj132 = lpqVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = lpqVar.k;
                if (i8 != 0) {
                }
                return Unit.a;
            case 8:
                if (continuation instanceof mqq) {
                    mqqVar = (mqq) continuation;
                    int i36 = mqqVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        mqqVar.k = i36 - Integer.MIN_VALUE;
                        Object obj14 = mqqVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = mqqVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj14);
                            rjc rjcVar6 = (rjc) obj5;
                            int ordinal2 = ((aqq) obj).a.ordinal();
                            if (ordinal2 == 0) {
                                continuation2 = ((skr) ((nqq) obj4).j.getValue()).c(R.string.skeleton_landing_error_message);
                            } else if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            if (continuation2 != null) {
                                mqqVar.k = 1;
                                if (rjcVar6.emit(continuation2, mqqVar) == nm6Var10) {
                                    return nm6Var10;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj14);
                        }
                        return Unit.a;
                    }
                }
                mqqVar = new mqq(this, continuation);
                Object obj142 = mqqVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = mqqVar.k;
                if (i9 != 0) {
                }
                return Unit.a;
            case 9:
                int intValue = ((Number) obj).intValue();
                ce5 ce5Var = (ce5) obj5;
                m2s a2 = ((v2s) obj4).a.a();
                ce5Var.getClass();
                ssg.a(3, "SkeletonStateHolder", "onTabChanged: index=" + intValue + " tabsBlock=" + a2.a, null);
                ce5Var.q(a2, intValue);
                xdr xdrVar2 = (xdr) ce5Var.e;
                ArrayList d = ce5Var.d();
                xdrVar2.getClass();
                xdrVar2.m(null, d);
                return Unit.a;
            case 10:
                x3n x3nVar = (x3n) obj4;
                if (continuation instanceof gor) {
                    gorVar = (gor) continuation;
                    int i37 = gorVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        gorVar.k = i37 - Integer.MIN_VALUE;
                        Object obj15 = gorVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = gorVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj15);
                            rjc rjcVar7 = (rjc) obj5;
                            exc excVar = (exc) obj;
                            if (excVar instanceof bxc) {
                                obj3 = new dor(x3nVar.g0());
                            } else if (excVar instanceof axc) {
                                obj3 = new aor(x3nVar.g0());
                            } else if (excVar instanceof dxc) {
                                bve bveVar = ((dxc) excVar).a;
                                String str2 = bveVar.g;
                                if (str2 == null) {
                                    str2 = (String) ((jyr) x3nVar.c).getValue();
                                }
                                String str3 = bveVar.h;
                                if (str3 == null) {
                                    str3 = str2;
                                }
                                obj3 = new ynr(new qor(str2, str3, ((skr) x3nVar.a).c(R.string.let_in_default_description), 8));
                            } else if (excVar instanceof ywc) {
                                obj3 = new xnr(x3nVar.g0());
                            } else if (excVar instanceof zwc) {
                                obj3 = new ynr(x3nVar.g0());
                            } else {
                                if (!(excVar instanceof cxc)) {
                                    b6e.s();
                                    return null;
                                }
                                obj3 = bor.a;
                            }
                            gorVar.k = 1;
                            if (rjcVar7.emit(obj3, gorVar) == nm6Var11) {
                                return nm6Var11;
                            }
                        } else {
                            if (i10 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj15);
                        }
                        return Unit.a;
                    }
                }
                gorVar = new gor(this, continuation);
                Object obj152 = gorVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = gorVar.k;
                if (i10 != 0) {
                }
                return Unit.a;
            case 11:
                sor sorVar = (sor) obj4;
                if (continuation instanceof ror) {
                    rorVar = (ror) continuation;
                    int i38 = rorVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        rorVar.k = i38 - Integer.MIN_VALUE;
                        Object obj16 = rorVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = rorVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj16);
                            rjc rjcVar8 = (rjc) obj5;
                            exc excVar2 = (exc) obj;
                            if (excVar2 instanceof axc) {
                                oorVar = mor.a;
                            } else if (excVar2 instanceof cxc) {
                                oorVar = nor.a;
                            } else {
                                boolean z = excVar2 instanceof bxc;
                                lor lorVar = lor.a;
                                if (!z && !(excVar2 instanceof ywc)) {
                                    if (excVar2 instanceof zwc) {
                                        skr skrVar = (skr) sorVar.k.getValue();
                                        oorVar = new oor(new tor(skrVar.c(R.string.freemium_wave_button_fallback_title), skrVar.c(R.string.freemium_wave_button_fallback_subtitle), null));
                                    } else {
                                        if (!(excVar2 instanceof dxc)) {
                                            b6e.s();
                                            return null;
                                        }
                                        bve bveVar2 = ((dxc) excVar2).a;
                                        String str4 = bveVar2.g;
                                        if (str4 != null) {
                                            oorVar = new oor(new tor(str4, bveVar2.i, bveVar2.k));
                                        }
                                    }
                                }
                                oorVar = lorVar;
                            }
                            rorVar.k = 1;
                            if (rjcVar8.emit(oorVar, rorVar) == nm6Var12) {
                                return nm6Var12;
                            }
                        } else {
                            if (i11 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj16);
                        }
                        return Unit.a;
                    }
                }
                rorVar = new ror(this, continuation);
                Object obj162 = rorVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = rorVar.k;
                if (i11 != 0) {
                }
                return Unit.a;
            case 12:
                ((u6k) obj5).i(u7g.D((x3h) obj4, ((Number) obj).longValue()));
                return Unit.a;
            case 13:
                if (continuation instanceof x3s) {
                    x3sVar = (x3s) continuation;
                    int i39 = x3sVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        x3sVar.k = i39 - Integer.MIN_VALUE;
                        Object obj17 = x3sVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = x3sVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj17);
                            v3k E = wxf.E((v3k) obj, new v0r((y3s) obj4, continuation2, 17));
                            x3sVar.k = 1;
                            if (((rjc) obj5).emit(E, x3sVar) == nm6Var13) {
                                return nm6Var13;
                            }
                        } else {
                            if (i12 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj17);
                        }
                        return Unit.a;
                    }
                }
                x3sVar = new x3s(this, continuation);
                Object obj172 = x3sVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = x3sVar.k;
                if (i12 != 0) {
                }
                return Unit.a;
            case 14:
                if (continuation instanceof s5s) {
                    s5sVar = (s5s) continuation;
                    int i40 = s5sVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        s5sVar.k = i40 - Integer.MIN_VALUE;
                        Object obj18 = s5sVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = s5sVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj18);
                            rjc rjcVar9 = (rjc) obj5;
                            Boolean bool = (Boolean) ((hmm) obj).a(((t5s) obj4).c);
                            Boolean valueOf3 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                            s5sVar.k = 1;
                            if (rjcVar9.emit(valueOf3, s5sVar) == nm6Var14) {
                                return nm6Var14;
                            }
                        } else {
                            if (i13 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj18);
                        }
                        return Unit.a;
                    }
                }
                s5sVar = new s5s(this, continuation);
                Object obj182 = s5sVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = s5sVar.k;
                if (i13 != 0) {
                }
                return Unit.a;
            case 15:
                if (continuation instanceof o7s) {
                    o7sVar = (o7s) continuation;
                    int i41 = o7sVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        o7sVar.k = i41 - Integer.MIN_VALUE;
                        Object obj19 = o7sVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = o7sVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj19);
                            k3n a3 = p7s.a((p7s) obj4, (ajk) obj);
                            o7sVar.k = 1;
                            if (((rjc) obj5).emit(a3, o7sVar) == nm6Var15) {
                                return nm6Var15;
                            }
                        } else {
                            if (i14 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj19);
                        }
                        return Unit.a;
                    }
                }
                o7sVar = new o7s(this, continuation);
                Object obj192 = o7sVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = o7sVar.k;
                if (i14 != 0) {
                }
                return Unit.a;
            case 16:
                return b((List) obj, continuation);
            case 17:
                if (continuation instanceof rss) {
                    rssVar = (rss) continuation;
                    int i42 = rssVar.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        rssVar.k = i42 - Integer.MIN_VALUE;
                        Object obj20 = rssVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = rssVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj20);
                            rjc rjcVar10 = (rjc) obj5;
                            if (p6g.x((e6l) ((sss) obj4).c.c.getValue()) != null) {
                                rssVar.k = 1;
                                if (rjcVar10.emit(obj, rssVar) == nm6Var16) {
                                    return nm6Var16;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj20);
                        }
                        return Unit.a;
                    }
                }
                rssVar = new rss(this, continuation);
                Object obj202 = rssVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = rssVar.k;
                if (i15 != 0) {
                }
                return Unit.a;
            case 18:
                if (continuation instanceof aus) {
                    ausVar = (aus) continuation;
                    int i43 = ausVar.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ausVar.k = i43 - Integer.MIN_VALUE;
                        Object obj21 = ausVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = ausVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj21);
                            rjc rjcVar11 = (rjc) obj5;
                            if (((x66) obj).a && (((bus) obj4).m.getValue() instanceof rt6)) {
                                ausVar.k = 1;
                                if (rjcVar11.emit(obj, ausVar) == nm6Var17) {
                                    return nm6Var17;
                                }
                            }
                        } else {
                            if (i16 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj21);
                        }
                        return Unit.a;
                    }
                }
                ausVar = new aus(this, continuation);
                Object obj212 = ausVar.j;
                nm6 nm6Var172 = nm6.a;
                i16 = ausVar.k;
                if (i16 != 0) {
                }
                return Unit.a;
            case 19:
                if (continuation instanceof exs) {
                    exsVar = (exs) continuation;
                    int i44 = exsVar.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        exsVar.k = i44 - Integer.MIN_VALUE;
                        Object obj22 = exsVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = exsVar.k;
                        if (i17 != 0) {
                            qgg.h0(obj22);
                            rjc rjcVar12 = (rjc) obj5;
                            j1g j1gVar = (j1g) ((Map) obj).get(((rr5) obj4).a);
                            if (j1gVar == null) {
                                j1gVar = j1g.b;
                            }
                            exsVar.k = 1;
                            if (rjcVar12.emit(j1gVar, exsVar) == nm6Var18) {
                                return nm6Var18;
                            }
                        } else {
                            if (i17 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj22);
                        }
                        return Unit.a;
                    }
                }
                exsVar = new exs(this, continuation);
                Object obj222 = exsVar.j;
                nm6 nm6Var182 = nm6.a;
                i17 = exsVar.k;
                if (i17 != 0) {
                }
                return Unit.a;
            case 20:
                qzs qzsVar = (qzs) obj4;
                if (continuation instanceof ozs) {
                    ozsVar = (ozs) continuation;
                    int i45 = ozsVar.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        ozsVar.k = i45 - Integer.MIN_VALUE;
                        Object obj23 = ozsVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = ozsVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj23);
                            rjc rjcVar13 = (rjc) obj5;
                            n7q n7qVar2 = (n7q) obj;
                            if (n7qVar2 != null) {
                                mwk b = n7qVar2.b();
                                mwk E2 = gdg.E(n7qVar2);
                                List<mwk> c3 = E2 == null ? t75.c(n7qVar2.b()) : u75.h(n7qVar2.b(), E2);
                                ArrayList arrayList2 = new ArrayList();
                                for (mwk mwkVar : c3) {
                                    qqs qqsVar = qzsVar.b;
                                    u3q g = n7qVar2.g();
                                    mwkVar.getClass();
                                    g.getClass();
                                    mqs mqsVar = (mqs) dag.p(mwkVar, new qdc(qqsVar, g));
                                    if (mqsVar != null) {
                                        arrayList2.add(mqsVar);
                                    }
                                }
                                pair = new Pair(b, arrayList2);
                            }
                            ozsVar.k = 1;
                            if (rjcVar13.emit(pair, ozsVar) == nm6Var19) {
                                return nm6Var19;
                            }
                        } else {
                            if (i18 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj23);
                        }
                        return Unit.a;
                    }
                }
                ozsVar = new ozs(this, continuation);
                Object obj232 = ozsVar.j;
                nm6 nm6Var192 = nm6.a;
                i18 = ozsVar.k;
                if (i18 != 0) {
                }
                return Unit.a;
            case 21:
                if (continuation instanceof a5t) {
                    a5tVar = (a5t) continuation;
                    int i46 = a5tVar.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        a5tVar.k = i46 - Integer.MIN_VALUE;
                        Object obj24 = a5tVar.j;
                        nm6 nm6Var20 = nm6.a;
                        i19 = a5tVar.k;
                        if (i19 != 0) {
                            qgg.h0(obj24);
                            rjc rjcVar14 = (rjc) obj5;
                            e6l e6lVar = (e6l) obj;
                            d6l x = p6g.x(e6lVar);
                            if (x != null && (n7qVar = x.a) != null && b5t.d(n7qVar, (ybb) obj4) && p6g.C(e6lVar)) {
                                r3 = true;
                            }
                            Boolean valueOf4 = Boolean.valueOf(r3);
                            a5tVar.k = 1;
                            if (rjcVar14.emit(valueOf4, a5tVar) == nm6Var20) {
                                return nm6Var20;
                            }
                        } else {
                            if (i19 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj24);
                        }
                        return Unit.a;
                    }
                }
                a5tVar = new a5t(this, continuation);
                Object obj242 = a5tVar.j;
                nm6 nm6Var202 = nm6.a;
                i19 = a5tVar.k;
                if (i19 != 0) {
                }
                return Unit.a;
            case 22:
                ((dsu) obj5).a((t) obj4, (kpu) obj, false);
                return Unit.a;
            case 23:
                if (continuation instanceof j3u) {
                    j3uVar = (j3u) continuation;
                    int i47 = j3uVar.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        j3uVar.k = i47 - Integer.MIN_VALUE;
                        Object obj25 = j3uVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i20 = j3uVar.k;
                        if (i20 != 0) {
                            qgg.h0(obj25);
                            rjc rjcVar15 = (rjc) obj5;
                            if (((x66) obj).a && (((k3u) obj4).m.getValue() instanceof rt6)) {
                                j3uVar.k = 1;
                                if (rjcVar15.emit(obj, j3uVar) == nm6Var21) {
                                    return nm6Var21;
                                }
                            }
                        } else {
                            if (i20 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj25);
                        }
                        return Unit.a;
                    }
                }
                j3uVar = new j3u(this, continuation);
                Object obj252 = j3uVar.j;
                nm6 nm6Var212 = nm6.a;
                i20 = j3uVar.k;
                if (i20 != 0) {
                }
                return Unit.a;
            case 24:
                if (continuation instanceof hcu) {
                    hcuVar = (hcu) continuation;
                    int i48 = hcuVar.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        hcuVar.k = i48 - Integer.MIN_VALUE;
                        Object obj26 = hcuVar.j;
                        nm6 nm6Var22 = nm6.a;
                        i21 = hcuVar.k;
                        if (i21 != 0) {
                            qgg.h0(obj26);
                            Boolean valueOf5 = Boolean.valueOf(((rx1) obj4).a((xxq) obj));
                            hcuVar.k = 1;
                            if (((rjc) obj5).emit(valueOf5, hcuVar) == nm6Var22) {
                                return nm6Var22;
                            }
                        } else {
                            if (i21 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj26);
                        }
                        return Unit.a;
                    }
                }
                hcuVar = new hcu(this, continuation);
                Object obj262 = hcuVar.j;
                nm6 nm6Var222 = nm6.a;
                i21 = hcuVar.k;
                if (i21 != 0) {
                }
                return Unit.a;
            case 25:
                ArrayList arrayList3 = (ArrayList) obj4;
                if (continuation instanceof mnu) {
                    mnuVar = (mnu) continuation;
                    int i49 = mnuVar.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        mnuVar.k = i49 - Integer.MIN_VALUE;
                        Object obj27 = mnuVar.j;
                        nm6 nm6Var23 = nm6.a;
                        i22 = mnuVar.k;
                        if (i22 != 0) {
                            qgg.h0(obj27);
                            rjc rjcVar16 = (rjc) obj5;
                            tre treVar = (tre) obj;
                            if (treVar instanceof rqm) {
                                arrayList3.add(treVar);
                            } else if (treVar instanceof sqm) {
                                arrayList3.remove(((sqm) treVar).a);
                            } else if (treVar instanceof qqm) {
                                arrayList3.remove(((qqm) treVar).a);
                            }
                            Boolean valueOf6 = Boolean.valueOf(!arrayList3.isEmpty());
                            mnuVar.k = 1;
                            if (rjcVar16.emit(valueOf6, mnuVar) == nm6Var23) {
                                return nm6Var23;
                            }
                        } else {
                            if (i22 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj27);
                        }
                        return Unit.a;
                    }
                }
                mnuVar = new mnu(this, continuation);
                Object obj272 = mnuVar.j;
                nm6 nm6Var232 = nm6.a;
                i22 = mnuVar.k;
                if (i22 != 0) {
                }
                return Unit.a;
            case 26:
                if (continuation instanceof fou) {
                    fouVar = (fou) continuation;
                    int i50 = fouVar.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        fouVar.k = i50 - Integer.MIN_VALUE;
                        Object obj28 = fouVar.j;
                        nm6 nm6Var24 = nm6.a;
                        i23 = fouVar.k;
                        if (i23 != 0) {
                            qgg.h0(obj28);
                            rjcVar = (rjc) obj5;
                            lwuVar = (lwu) obj;
                            ssg.a(4, "WidgetRecentlyManagerImpl", "[WaveEntitiesLoader] collected lastWave " + lwuVar, null);
                            co6 co6Var = op7.b;
                            fouVar.m = rjcVar;
                            fouVar.n = lwuVar;
                            fouVar.o = 0;
                            fouVar.k = 1;
                            obj28 = ((gou) obj4).q(co6Var, fouVar);
                            if (obj28 != nm6Var24) {
                                i24 = 0;
                            }
                            return nm6Var24;
                        }
                        if (i23 != 1) {
                            if (i23 == 2) {
                                qgg.h0(obj28);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i24 = fouVar.o;
                        lwuVar = fouVar.n;
                        rjcVar = fouVar.m;
                        qgg.h0(obj28);
                        Bitmap bitmap = (Bitmap) obj28;
                        k5r.v("[WaveEntitiesLoader] bitmap was loaded success = ", bitmap != null, 4, "WidgetRecentlyManagerImpl", null);
                        y = tyf.y(lwuVar);
                        if (y != null) {
                            ssg.a(5, "WidgetRecentlyManagerImpl", "[WaveEntitiesLoader] seeds are null!", null);
                            c = c5b.a;
                        } else {
                            c = t75.c(new wnv(bitmap, new qnv(o8g.R(y))));
                        }
                        fouVar.m = null;
                        fouVar.n = null;
                        fouVar.o = i24;
                        fouVar.k = 2;
                        break;
                    }
                }
                fouVar = new fou(this, continuation);
                Object obj282 = fouVar.j;
                nm6 nm6Var242 = nm6.a;
                i23 = fouVar.k;
                if (i23 != 0) {
                }
                Bitmap bitmap2 = (Bitmap) obj282;
                k5r.v("[WaveEntitiesLoader] bitmap was loaded success = ", bitmap2 != null, 4, "WidgetRecentlyManagerImpl", null);
                y = tyf.y(lwuVar);
                if (y != null) {
                }
                fouVar.m = null;
                fouVar.n = null;
                fouVar.o = i24;
                fouVar.k = 2;
            case 27:
                if (continuation instanceof rwu) {
                    rwuVar = (rwu) continuation;
                    int i51 = rwuVar.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        rwuVar.k = i51 - Integer.MIN_VALUE;
                        Object obj29 = rwuVar.j;
                        nm6 nm6Var25 = nm6.a;
                        i25 = rwuVar.k;
                        if (i25 != 0) {
                            qgg.h0(obj29);
                            rjc rjcVar17 = (rjc) obj5;
                            p4d p4dVar = (p4d) obj;
                            qmu qmuVar = ((p4dVar instanceof n4d) && ((n4d) p4dVar).a.equals((StationId) ((swu) obj4).h)) ? qmu.c : qmu.d;
                            rwuVar.k = 1;
                            if (rjcVar17.emit(qmuVar, rwuVar) == nm6Var25) {
                                return nm6Var25;
                            }
                        } else {
                            if (i25 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj29);
                        }
                        return Unit.a;
                    }
                }
                rwuVar = new rwu(this, continuation);
                Object obj292 = rwuVar.j;
                nm6 nm6Var252 = nm6.a;
                i25 = rwuVar.k;
                if (i25 != 0) {
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return c(obj, continuation);
            default:
                if (continuation instanceof wyu) {
                    wyuVar = (wyu) continuation;
                    int i52 = wyuVar.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        wyuVar.k = i52 - Integer.MIN_VALUE;
                        Object obj30 = wyuVar.j;
                        nm6 nm6Var26 = nm6.a;
                        i26 = wyuVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj30);
                            rjc rjcVar18 = (rjc) obj5;
                            t7q t7qVar = (t7q) obj;
                            if (!(t7qVar instanceof q7q)) {
                                if (!Intrinsics.d(t7qVar, r7q.a) && !(t7qVar instanceof s7q)) {
                                    b6e.s();
                                    return null;
                                }
                                Boolean bool2 = Boolean.FALSE;
                                wyuVar.k = 2;
                                break;
                            } else if (((szu) ((q7q) t7qVar).a).h() == ((gxj) obj4).a) {
                                Boolean bool3 = Boolean.TRUE;
                                wyuVar.k = 1;
                                break;
                            }
                        } else {
                            if (i26 != 1 && i26 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj30);
                        }
                        return Unit.a;
                    }
                }
                wyuVar = new wyu(this, continuation);
                Object obj302 = wyuVar.j;
                nm6 nm6Var262 = nm6.a;
                i26 = wyuVar.k;
                if (i26 != 0) {
                }
                return Unit.a;
        }
    }

    public /* synthetic */ jqp(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
