package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class cvu {
    public final mmo a;
    public final rsh b;
    public final jyr c;
    public final jyr d;
    public final tf6 e;
    public final jyr f;
    public final jyr g;
    public final xdr h;

    public cvu(a aVar, jyr jyrVar, pv9 pv9Var, mmo mmoVar, rsh rshVar) {
        aVar.getClass();
        pv9Var.getClass();
        this.a = mmoVar;
        this.b = rshVar;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: xuu
            public final /* synthetic */ cvu b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                llj lljVar;
                int i2 = i;
                cvu cvuVar = this.b;
                switch (i2) {
                    case 0:
                        if (cvuVar.b == null) {
                            return null;
                        }
                        jyr jyrVar2 = dvu.e;
                        return kwl.c();
                    default:
                        rsh rshVar2 = cvuVar.b;
                        if (rshVar2 == null || (lljVar = (llj) rshVar2.a.getValue()) == null) {
                            return null;
                        }
                        tf6 tf6Var = lljVar.c;
                        int ordinal = ((plj) lljVar.a.c).ordinal();
                        if (ordinal == 0) {
                            return null;
                        }
                        if (ordinal == 1) {
                            return new qeq(tf6Var, lljVar);
                        }
                        if (ordinal == 2) {
                            return new aks(tf6Var, lljVar);
                        }
                        b6e.s();
                        return null;
                }
            }
        });
        this.d = btf.b(new wfs(29, pv9Var));
        tf6 e = gld.e(e.c(a4g.n(), aVar).plus(new im6("WaveOfflineEngine")));
        this.e = e;
        this.f = jyrVar;
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: xuu
            public final /* synthetic */ cvu b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                llj lljVar;
                int i22 = i2;
                cvu cvuVar = this.b;
                switch (i22) {
                    case 0:
                        if (cvuVar.b == null) {
                            return null;
                        }
                        jyr jyrVar2 = dvu.e;
                        return kwl.c();
                    default:
                        rsh rshVar2 = cvuVar.b;
                        if (rshVar2 == null || (lljVar = (llj) rshVar2.a.getValue()) == null) {
                            return null;
                        }
                        tf6 tf6Var = lljVar.c;
                        int ordinal = ((plj) lljVar.a.c).ordinal();
                        if (ordinal == 0) {
                            return null;
                        }
                        if (ordinal == 1) {
                            return new qeq(tf6Var, lljVar);
                        }
                        if (ordinal == 2) {
                            return new aks(tf6Var, lljVar);
                        }
                        b6e.s();
                        return null;
                }
            }
        });
        this.h = ydr.a(Boolean.FALSE);
        x97.y(e, null, null, new npt(this, null, 20), 3);
    }

    public static Object f(dlj dljVar, eu7 eu7Var, s9p s9pVar, String str, cg6 cg6Var) {
        List f = eu7Var.a.a.f();
        ArrayList arrayList = new ArrayList(v75.o(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(((jzs) it.next()).a);
        }
        return dljVar.b(arrayList, s9pVar, str, cg6Var);
    }

    public final ouu a() {
        return (ouu) this.d.getValue();
    }

    public final vuu b() {
        return (vuu) this.c.getValue();
    }

    public final dlj c() {
        return (dlj) this.g.getValue();
    }

    public final boolean d() {
        if (this.b == null) {
            return false;
        }
        bdt I = hag.I(byb.class);
        l18 l18Var = l18.b;
        return Intrinsics.d(((s5v) ((byb) l18Var.c(I)).b(s5v.class)).b(), "on") || Intrinsics.d(((s5v) ((byb) l18Var.c(hag.I(byb.class))).b(s5v.class)).b(), "on1");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(eu7 eu7Var, vnu vnuVar, cg6 cg6Var) {
        zuu zuuVar;
        int i;
        s9p s9pVar;
        ulj uljVar;
        if (cg6Var instanceof zuu) {
            zuuVar = (zuu) cg6Var;
            int i2 = zuuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zuuVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zuuVar.j;
                nm6 nm6Var = nm6.a;
                i = zuuVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dlj c = c();
                    if (c != null) {
                        if (vnuVar instanceof wnu) {
                            s9pVar = ((wnu) vnuVar).e();
                        } else if (vnuVar instanceof tnu) {
                            s9pVar = ((tnu) vnuVar).a;
                        } else {
                            if (!(vnuVar instanceof unu)) {
                                b6e.s();
                                return null;
                            }
                            s9pVar = ((unu) vnuVar).a;
                        }
                        zuuVar.l = 1;
                        obj = f(c, eu7Var, s9pVar, null, zuuVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return new slj("newSessionTracks", null, null, null, null, 30);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                uljVar = (ulj) obj;
                if (uljVar != null) {
                    return uljVar;
                }
                return new slj("newSessionTracks", null, null, null, null, 30);
            }
        }
        zuuVar = new zuu(this, cg6Var);
        Object obj2 = zuuVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zuuVar.l;
        if (i != 0) {
        }
        uljVar = (ulj) obj2;
        if (uljVar != null) {
        }
        return new slj("newSessionTracks", null, null, null, null, 30);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0117, code lost:
    
        if (r3 == r5) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x032e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0356 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168 A[LOOP:0: B:92:0x0162->B:94:0x0168, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0186  */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(eu7 eu7Var, tnu tnuVar, cg6 cg6Var) {
        avu avuVar;
        Object obj;
        nm6 nm6Var;
        int i;
        jzs jzsVar;
        jzs jzsVar2;
        izs izsVar;
        izs izsVar2;
        int i2;
        jzs jzsVar3;
        jzs jzsVar4;
        cvu cvuVar;
        tnu tnuVar2;
        int i3;
        int i4;
        izs izsVar3;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        int i5;
        String str;
        int i6;
        ArrayList arrayList2;
        jzs jzsVar5;
        int i7;
        String str2;
        int i8;
        Object bnjVar;
        jzs jzsVar6;
        wlj wljVar;
        ArrayList arrayList3;
        mqs mqsVar;
        dlj c;
        mqs mqsVar2;
        jzs jzsVar7;
        tnu tnuVar3;
        ArrayList arrayList4;
        xlj xljVar;
        wlj wljVar2;
        wlj wljVar3;
        mqs mqsVar3;
        mqs mqsVar4;
        mqs mqsVar5;
        xlj xljVar2;
        if (cg6Var instanceof avu) {
            avuVar = (avu) cg6Var;
            int i9 = avuVar.u;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                avuVar.u = i9 - Integer.MIN_VALUE;
                obj = avuVar.s;
                nm6Var = nm6.a;
                i = avuVar.u;
                String str3 = "WaveOfflineEngine";
                Object obj2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    du7 du7Var = eu7Var.b;
                    cu7 cu7Var = eu7Var.a;
                    int i10 = du7Var.a;
                    jzsVar = eu7Var.f() ? (jzs) eu7Var.b() : null;
                    jzs jzsVar8 = eu7Var.g() ? (jzs) cu7Var.d(eu7Var.e()) : null;
                    if (!eu7Var.f()) {
                        int i11 = i10 - 2;
                        if (cu7Var.f(i11)) {
                            jzsVar2 = (jzs) cu7Var.d(i11);
                            i2 = ((jzsVar != null || (izsVar3 = jzsVar.g) == null || swf.R(izsVar3)) && (jzsVar != null || jzsVar8 == null || (izsVar2 = jzsVar8.g) == null || swf.R(izsVar2)) && (!(jzsVar == null && jzsVar8 == null) && (jzsVar2 == null || (izsVar = jzsVar2.g) == null || swf.R(izsVar)))) ? 0 : 1;
                            if (i2 == 0) {
                                ssg.a(3, "WaveOfflineEngine", "nextTracks: create new state", null);
                                dlj c2 = c();
                                if (c2 != null) {
                                    s9p s9pVar = tnuVar.a;
                                    String str4 = tnuVar.b;
                                    avuVar.j = null;
                                    avuVar.k = null;
                                    avuVar.l = null;
                                    avuVar.m = null;
                                    avuVar.q = i10;
                                    avuVar.r = i2;
                                    avuVar.u = 1;
                                    obj = f(c2, eu7Var, s9pVar, str4, avuVar);
                                }
                                return new slj("nextTracks: newState", null, null, null, null, 30);
                            }
                            String str5 = tnuVar.b;
                            avuVar.j = tnuVar;
                            avuVar.k = jzsVar;
                            avuVar.l = jzsVar8;
                            avuVar.m = jzsVar2;
                            avuVar.n = this;
                            avuVar.q = i10;
                            avuVar.r = i2;
                            avuVar.u = 2;
                            Object d0 = this.a.d0(str5, null, avuVar);
                            if (d0 != nm6Var) {
                                jzsVar3 = jzsVar2;
                                jzsVar4 = jzsVar8;
                                cvuVar = this;
                                tnuVar2 = tnuVar;
                                i3 = i10;
                                obj = d0;
                                i4 = i2;
                                Iterable iterable = (Iterable) obj;
                                ArrayList arrayList5 = new ArrayList(v75.o(iterable, 10));
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                }
                                cvuVar.getClass();
                                arrayList = new ArrayList();
                                it2 = arrayList5.iterator();
                                while (it2.hasNext()) {
                                }
                                i5 = i4;
                                str = str3;
                                if (jzsVar3 != null) {
                                }
                                i6 = i3;
                                arrayList2 = arrayList;
                                jzsVar5 = jzsVar4;
                                i7 = i5;
                                jzsVar6 = jzsVar;
                                wljVar = null;
                            }
                            return nm6Var;
                        }
                    }
                    jzsVar2 = null;
                    if (jzsVar != null) {
                    }
                    if (i2 == 0) {
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    ulj uljVar = (ulj) obj;
                    if (uljVar != null) {
                        return uljVar;
                    }
                    return new slj("nextTracks: newState", null, null, null, null, 30);
                }
                if (i == 2) {
                    i4 = avuVar.r;
                    i3 = avuVar.q;
                    cvuVar = (cvu) avuVar.n;
                    jzsVar3 = avuVar.m;
                    jzsVar4 = avuVar.l;
                    jzsVar = avuVar.k;
                    tnuVar2 = avuVar.j;
                    qgg.h0(obj);
                    Iterable iterable2 = (Iterable) obj;
                    ArrayList arrayList52 = new ArrayList(v75.o(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList52.add(((bpu) it.next()).b);
                    }
                    cvuVar.getClass();
                    arrayList = new ArrayList();
                    it2 = arrayList52.iterator();
                    while (it2.hasNext()) {
                        r7c r7cVar = (r7c) it2.next();
                        if (r7cVar instanceof wmp) {
                            str2 = str3;
                            bnjVar = obj2;
                        } else {
                            if (r7cVar instanceof p1t) {
                                p1t p1tVar = (p1t) r7cVar;
                                bnjVar = new zmj(p1tVar.c, p1tVar.a);
                                i8 = i4;
                                str2 = str3;
                            } else if (r7cVar instanceof svs) {
                                svs svsVar = (svs) r7cVar;
                                str2 = str3;
                                bnjVar = new wmj(svsVar.a, svsVar.c, svsVar.d);
                            } else {
                                str2 = str3;
                                if (r7cVar instanceof crq) {
                                    crq crqVar = (crq) r7cVar;
                                    i8 = i4;
                                    bnjVar = new ymj(crqVar.a, crqVar.c, crqVar.d);
                                } else {
                                    i8 = i4;
                                    if (r7cVar instanceof k88) {
                                        k88 k88Var = (k88) r7cVar;
                                        bnjVar = new vmj(k88Var.a, k88Var.c, k88Var.d);
                                    } else if (r7cVar instanceof xzf) {
                                        xzf xzfVar = (xzf) r7cVar;
                                        bnjVar = new xmj(xzfVar.c, xzfVar.a);
                                    } else if (r7cVar instanceof jit) {
                                        jit jitVar = (jit) r7cVar;
                                        bnjVar = new anj(jitVar.c, jitVar.a);
                                    } else {
                                        if (!(r7cVar instanceof vkt)) {
                                            b6e.s();
                                            return null;
                                        }
                                        vkt vktVar = (vkt) r7cVar;
                                        bnjVar = new bnj(vktVar.c, vktVar.a);
                                    }
                                }
                            }
                            if (bnjVar == null) {
                                arrayList.add(bnjVar);
                            }
                            i4 = i8;
                            str3 = str2;
                            obj2 = null;
                        }
                        i8 = i4;
                        if (bnjVar == null) {
                        }
                        i4 = i8;
                        str3 = str2;
                        obj2 = null;
                    }
                    i5 = i4;
                    str = str3;
                    if (jzsVar3 != null || jzsVar4 == null) {
                        i6 = i3;
                        arrayList2 = arrayList;
                        jzsVar5 = jzsVar4;
                        i7 = i5;
                        jzsVar6 = jzsVar;
                        wljVar = null;
                    } else {
                        dlj c3 = c();
                        if (c3 != null) {
                            mqs mqsVar6 = jzsVar3.a;
                            mqs mqsVar7 = jzsVar4.a;
                            avuVar.j = tnuVar2;
                            avuVar.k = jzsVar;
                            avuVar.l = jzsVar4;
                            avuVar.m = jzsVar3;
                            avuVar.n = arrayList;
                            avuVar.q = i3;
                            avuVar.r = i5;
                            avuVar.u = 3;
                            obj = c3.c(mqsVar6, arrayList, mqsVar7, avuVar);
                            if (obj != nm6Var) {
                                i7 = i5;
                                arrayList4 = arrayList;
                                xljVar = (xlj) obj;
                                arrayList3 = arrayList4;
                                if (xljVar != null) {
                                }
                                i6 = i3;
                                arrayList2 = arrayList3;
                                jzsVar5 = jzsVar4;
                                jzsVar6 = jzsVar;
                                wljVar = null;
                            }
                            return nm6Var;
                        }
                        i7 = i5;
                        arrayList3 = arrayList;
                        i6 = i3;
                        arrayList2 = arrayList3;
                        jzsVar5 = jzsVar4;
                        jzsVar6 = jzsVar;
                        wljVar = null;
                    }
                } else if (i == 3) {
                    i7 = avuVar.r;
                    i3 = avuVar.q;
                    ?? r6 = (List) avuVar.n;
                    jzsVar3 = avuVar.m;
                    jzsVar4 = avuVar.l;
                    jzsVar = avuVar.k;
                    tnuVar2 = avuVar.j;
                    qgg.h0(obj);
                    str = "WaveOfflineEngine";
                    arrayList4 = r6;
                    xljVar = (xlj) obj;
                    arrayList3 = arrayList4;
                    if (xljVar != null) {
                        if (xljVar instanceof wlj) {
                            wljVar2 = (wlj) xljVar;
                        } else {
                            if (!(xljVar instanceof vlj)) {
                                b6e.s();
                                return null;
                            }
                            wljVar2 = null;
                        }
                        int i12 = i3;
                        wljVar = wljVar2;
                        i6 = i12;
                        arrayList2 = arrayList4;
                        jzsVar5 = jzsVar4;
                        jzsVar6 = jzsVar;
                    }
                    i6 = i3;
                    arrayList2 = arrayList3;
                    jzsVar5 = jzsVar4;
                    jzsVar6 = jzsVar;
                    wljVar = null;
                } else {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqsVar2 = avuVar.p;
                    wljVar = avuVar.o;
                    jzsVar7 = avuVar.m;
                    jzsVar5 = avuVar.l;
                    jzsVar6 = avuVar.k;
                    tnuVar3 = avuVar.j;
                    qgg.h0(obj);
                    str = "WaveOfflineEngine";
                    xljVar2 = (xlj) obj;
                    if (xljVar2 == null) {
                        if (xljVar2 instanceof wlj) {
                            wljVar3 = (wlj) xljVar2;
                        } else {
                            if (!(xljVar2 instanceof vlj)) {
                                b6e.s();
                                return null;
                            }
                            wljVar3 = null;
                        }
                        mqsVar = mqsVar2;
                        tnuVar2 = tnuVar3;
                        jzsVar3 = jzsVar7;
                        String o = (jzsVar3 != null || (mqsVar5 = jzsVar3.a) == null) ? null : ouj.o(mqsVar5.a, StringUtils.PROCESS_POSTFIX_DELIMITER, mqsVar5.c);
                        String o2 = (jzsVar5 != null || (mqsVar4 = jzsVar5.a) == null) ? null : ouj.o(mqsVar4.a, StringUtils.PROCESS_POSTFIX_DELIMITER, mqsVar4.c);
                        String o3 = (jzsVar6 != null || (mqsVar3 = jzsVar6.a) == null) ? null : ouj.o(mqsVar3.a, StringUtils.PROCESS_POSTFIX_DELIMITER, mqsVar3.c);
                        String str6 = mqsVar == null ? mqsVar.a : null;
                        String str7 = mqsVar == null ? mqsVar.c : null;
                        StringBuilder m = f1d.m("nextTracks: prevPrev=[", o, "] prev=[", o2, "] current=[");
                        su4.v(m, o3, "] queued=[", str6, StringUtils.PROCESS_POSTFIX_DELIMITER);
                        ssg.a(3, str, su4.o(m, str7, "]"), null);
                        return (wljVar != null || wljVar3 == null) ? wljVar == null ? wljVar : wljVar3 != null ? wljVar3 : new vlj("nextTracks", null, null, null, null, 30) : new tlj(wljVar3.a, tnuVar2.b, wljVar3.b, u75.h(wljVar.c, wljVar3.c), wljVar3.d, true);
                    }
                    mqsVar = mqsVar2;
                    tnuVar2 = tnuVar3;
                    jzsVar3 = jzsVar7;
                    wljVar3 = null;
                    if (jzsVar3 != null) {
                    }
                    if (jzsVar5 != null) {
                    }
                    if (jzsVar6 != null) {
                    }
                    if (mqsVar == null) {
                    }
                    if (mqsVar == null) {
                    }
                    StringBuilder m2 = f1d.m("nextTracks: prevPrev=[", o, "] prev=[", o2, "] current=[");
                    su4.v(m2, o3, "] queued=[", str6, StringUtils.PROCESS_POSTFIX_DELIMITER);
                    ssg.a(3, str, su4.o(m2, str7, "]"), null);
                    if (wljVar != null) {
                    }
                }
                if (jzsVar6 != null || (mqsVar = jzsVar6.a) == null) {
                    mqsVar = wljVar == null ? wljVar.c : null;
                }
                if (jzsVar5 != null && mqsVar != null && (c = c()) != null) {
                    mqs mqsVar8 = jzsVar5.a;
                    avuVar.j = tnuVar2;
                    avuVar.k = jzsVar6;
                    avuVar.l = jzsVar5;
                    avuVar.m = jzsVar3;
                    avuVar.n = null;
                    avuVar.o = wljVar;
                    avuVar.p = mqsVar;
                    avuVar.q = i6;
                    avuVar.r = i7;
                    avuVar.u = 4;
                    obj = c.c(mqsVar8, arrayList2, mqsVar, avuVar);
                    if (obj != nm6Var) {
                        mqsVar2 = mqsVar;
                        jzsVar7 = jzsVar3;
                        tnuVar3 = tnuVar2;
                        xljVar2 = (xlj) obj;
                        if (xljVar2 == null) {
                        }
                    }
                    return nm6Var;
                }
                wljVar3 = null;
                if (jzsVar3 != null) {
                }
                if (jzsVar5 != null) {
                }
                if (jzsVar6 != null) {
                }
                if (mqsVar == null) {
                }
                if (mqsVar == null) {
                }
                StringBuilder m22 = f1d.m("nextTracks: prevPrev=[", o, "] prev=[", o2, "] current=[");
                su4.v(m22, o3, "] queued=[", str6, StringUtils.PROCESS_POSTFIX_DELIMITER);
                ssg.a(3, str, su4.o(m22, str7, "]"), null);
                if (wljVar != null) {
                }
            }
        }
        avuVar = new avu(this, cg6Var);
        obj = avuVar.s;
        nm6Var = nm6.a;
        i = avuVar.u;
        String str32 = "WaveOfflineEngine";
        Object obj22 = null;
        if (i != 0) {
        }
        if (jzsVar6 != null) {
        }
        if (wljVar == null) {
        }
        if (jzsVar5 != null) {
            mqs mqsVar82 = jzsVar5.a;
            avuVar.j = tnuVar2;
            avuVar.k = jzsVar6;
            avuVar.l = jzsVar5;
            avuVar.m = jzsVar3;
            avuVar.n = null;
            avuVar.o = wljVar;
            avuVar.p = mqsVar;
            avuVar.q = i6;
            avuVar.r = i7;
            avuVar.u = 4;
            obj = c.c(mqsVar82, arrayList2, mqsVar, avuVar);
            if (obj != nm6Var) {
            }
            return nm6Var;
        }
        wljVar3 = null;
        if (jzsVar3 != null) {
        }
        if (jzsVar5 != null) {
        }
        if (jzsVar6 != null) {
        }
        if (mqsVar == null) {
        }
        if (mqsVar == null) {
        }
        StringBuilder m222 = f1d.m("nextTracks: prevPrev=[", o, "] prev=[", o2, "] current=[");
        su4.v(m222, o3, "] queued=[", str6, StringUtils.PROCESS_POSTFIX_DELIMITER);
        ssg.a(3, str, su4.o(m222, str7, "]"), null);
        if (wljVar != null) {
        }
    }

    public final void h(boolean z) {
        dlj c;
        vuu b = b();
        if (b != null ? b.a : false) {
            xdr xdrVar = this.h;
            boolean booleanValue = ((Boolean) xdrVar.getValue()).booleanValue();
            Boolean valueOf = Boolean.valueOf(z);
            xdrVar.getClass();
            xdrVar.m(null, valueOf);
            ssg.a(3, "WaveOfflineEngine", "onOfflineStatusChanged: current=" + booleanValue + ", next=" + z, null);
            if (!booleanValue || z || (c = c()) == null) {
                return;
            }
            c.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(cg6 cg6Var) {
        bvu bvuVar;
        int i;
        if (cg6Var instanceof bvu) {
            bvuVar = (bvu) cg6Var;
            int i2 = bvuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bvuVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bvuVar.j;
                nm6 nm6Var = nm6.a;
                i = bvuVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveOfflineEngine", "release", null);
                    dlj c = c();
                    if (c != null) {
                        bvuVar.l = 1;
                        if (c.d(bvuVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                gld.L(this.e, null);
                return Unit.a;
            }
        }
        bvuVar = new bvu(this, cg6Var);
        Object obj2 = bvuVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bvuVar.l;
        if (i != 0) {
        }
        gld.L(this.e, null);
        return Unit.a;
    }

    public final void j(String str, sml smlVar) {
        rsh rshVar;
        llj lljVar;
        str.getClass();
        vuu b = b();
        if (!(b != null ? b.a : false) || smlVar == null || (rshVar = this.b) == null || (lljVar = (llj) rshVar.a.getValue()) == null) {
            return;
        }
        lljVar.j = new aqd(str, (int[]) smlVar.a);
    }
}
