package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.mapper;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.afu0;
import defpackage.b221;
import defpackage.bfu0;
import defpackage.boj0;
import defpackage.ccu;
import defpackage.ddf;
import defpackage.ds4;
import defpackage.e100;
import defpackage.eoj;
import defpackage.flg;
import defpackage.foj;
import defpackage.g191;
import defpackage.g2q0;
import defpackage.goj;
import defpackage.gs4;
import defpackage.h5v;
import defpackage.hhg;
import defpackage.hoj;
import defpackage.hqf0;
import defpackage.hs4;
import defpackage.i500;
import defpackage.iof0;
import defpackage.j500;
import defpackage.kc1;
import defpackage.kmt0;
import defpackage.ky;
import defpackage.ldc;
import defpackage.lrb1;
import defpackage.mkt0;
import defpackage.n351;
import defpackage.nn1;
import defpackage.ny61;
import defpackage.o;
import defpackage.oh4;
import defpackage.oig;
import defpackage.ome;
import defpackage.on1;
import defpackage.p;
import defpackage.pau;
import defpackage.pkp0;
import defpackage.q4g;
import defpackage.q8s;
import defpackage.qc1;
import defpackage.qfc;
import defpackage.qkg;
import defpackage.qqn;
import defpackage.r0b1;
import defpackage.r1s;
import defpackage.ra90;
import defpackage.rc1;
import defpackage.rry0;
import defpackage.s151;
import defpackage.s2v0;
import defpackage.sc1;
import defpackage.scc;
import defpackage.soj;
import defpackage.tc1;
import defpackage.tcc;
import defpackage.toj;
import defpackage.u1n;
import defpackage.u3b1;
import defpackage.uc1;
import defpackage.uq0;
import defpackage.v0q0;
import defpackage.v4v;
import defpackage.v920;
import defpackage.w3b1;
import defpackage.w4v;
import defpackage.w511;
import defpackage.wc1;
import defpackage.wsy0;
import defpackage.xc1;
import defpackage.xk4;
import defpackage.yeu0;
import defpackage.yfa;
import defpackage.zau;
import defpackage.zeu0;
import defpackage.zgg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.dashboard.core.SectionStyle;
import ru.yandex.taxi.logistics.sdk.dashboard.model.widget.SpacerModel;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.b;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.SpacerState;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.state.CouponSize;

/* loaded from: classes5.dex */
public final class a {
    public final b a;
    public final flg b;
    public final ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.a c;
    public final q4g d;
    public final ddf e;
    public final q4g f;
    public final boj0 g;
    public final r1s h;
    public final mkt0 i;
    public final ds4 j;
    public final q8s k;
    public final g191 l;
    public final oh4 m;
    public final kc1 n;

    public a(b bVar, flg flgVar, ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.a aVar, q4g q4gVar, ddf ddfVar, q4g q4gVar2, boj0 boj0Var, r1s r1sVar, mkt0 mkt0Var, ds4 ds4Var, q8s q8sVar, g191 g191Var, oh4 oh4Var, kc1 kc1Var) {
        this.a = bVar;
        this.b = flgVar;
        this.c = aVar;
        this.d = q4gVar;
        this.e = ddfVar;
        this.f = q4gVar2;
        this.g = boj0Var;
        this.h = r1sVar;
        this.i = mkt0Var;
        this.j = ds4Var;
        this.k = q8sVar;
        this.l = g191Var;
        this.m = oh4Var;
        this.n = kc1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r2 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ed -> B:11:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nn1 nn1Var, boolean z, ContinuationImpl continuationImpl) {
        DashboardStateMapper$map$6 dashboardStateMapper$map$6;
        int i;
        boolean z2;
        CharSequence charSequence;
        List list;
        CharSequence charSequence2;
        boolean z3;
        List list2;
        CharSequence charSequence3;
        boolean z4;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        nn1 nn1Var2;
        nn1 nn1Var3 = nn1Var;
        if (continuationImpl instanceof DashboardStateMapper$map$6) {
            dashboardStateMapper$map$6 = (DashboardStateMapper$map$6) continuationImpl;
            int i4 = dashboardStateMapper$map$6.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dashboardStateMapper$map$6.label = i4 - Integer.MIN_VALUE;
                Object obj = dashboardStateMapper$map$6.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardStateMapper$map$6.label;
                q8s q8sVar = this.k;
                int i5 = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = nn1Var3.a;
                    if (formattedText != null) {
                        dashboardStateMapper$map$6.L$0 = nn1Var3;
                        dashboardStateMapper$map$6.L$1 = null;
                        z2 = z;
                        dashboardStateMapper$map$6.Z$0 = z2;
                        dashboardStateMapper$map$6.I$0 = 0;
                        dashboardStateMapper$map$6.label = 1;
                        obj = q8sVar.a(formattedText, dashboardStateMapper$map$6);
                    } else {
                        z2 = z;
                        charSequence = null;
                        list = nn1Var3.b;
                        if (list == null) {
                            charSequence2 = charSequence;
                            z3 = z2;
                            list2 = null;
                            ky P = this.l.P(nn1Var3.c, null);
                            w4v w4vVar = nn1Var3.w;
                            if (w4vVar == null) {
                            }
                            w4v w4vVar2 = nn1Var3.x;
                            return new on1(charSequence2, list2, P, r11, w4vVar2 != null ? oh4.b(this.m, w4vVar2, null, null, z3, 6) : null, nn1Var3.y, nn1Var3.z);
                        }
                        List list3 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        charSequence3 = charSequence;
                        z4 = z2;
                        it = list3.iterator();
                        collection = arrayList;
                        i2 = 0;
                        i3 = 0;
                        nn1Var2 = nn1Var3;
                        if (it.hasNext()) {
                        }
                    }
                } else if (i == 1) {
                    boolean z5 = dashboardStateMapper$map$6.Z$0;
                    nn1 nn1Var4 = (nn1) dashboardStateMapper$map$6.L$0;
                    kotlin.b.b(obj);
                    z2 = z5;
                    nn1Var3 = nn1Var4;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = dashboardStateMapper$map$6.I$3;
                    i2 = dashboardStateMapper$map$6.I$1;
                    i3 = dashboardStateMapper$map$6.I$0;
                    z4 = dashboardStateMapper$map$6.Z$0;
                    collection = (Collection) dashboardStateMapper$map$6.L$8;
                    CharSequence charSequence4 = (CharSequence) dashboardStateMapper$map$6.L$7;
                    Iterator it2 = (Iterator) dashboardStateMapper$map$6.L$4;
                    Collection collection2 = (Collection) dashboardStateMapper$map$6.L$3;
                    nn1Var2 = (nn1) dashboardStateMapper$map$6.L$0;
                    kotlin.b.b(obj);
                    Iterator it3 = it2;
                    CharSequence charSequence5 = charSequence4;
                    Collection collection3 = collection2;
                    collection.add(new p(i6, (CharSequence) obj));
                    collection = collection3;
                    charSequence3 = charSequence5;
                    it = it3;
                    i5 = 0;
                    if (it.hasNext()) {
                        o oVar = (o) it.next();
                        int i7 = oVar.a;
                        FormattedText formattedText2 = oVar.b;
                        dashboardStateMapper$map$6.L$0 = nn1Var2;
                        dashboardStateMapper$map$6.L$1 = null;
                        dashboardStateMapper$map$6.L$2 = null;
                        dashboardStateMapper$map$6.L$3 = collection;
                        dashboardStateMapper$map$6.L$4 = it;
                        dashboardStateMapper$map$6.L$5 = null;
                        dashboardStateMapper$map$6.L$6 = null;
                        dashboardStateMapper$map$6.L$7 = charSequence3;
                        dashboardStateMapper$map$6.L$8 = collection;
                        dashboardStateMapper$map$6.Z$0 = z4;
                        dashboardStateMapper$map$6.I$0 = i3;
                        dashboardStateMapper$map$6.I$1 = i2;
                        dashboardStateMapper$map$6.I$2 = i5;
                        dashboardStateMapper$map$6.I$3 = i7;
                        dashboardStateMapper$map$6.label = 2;
                        Object a = q8sVar.a(formattedText2, dashboardStateMapper$map$6);
                        if (a != coroutineSingletons) {
                            obj = a;
                            i6 = i7;
                            it3 = it;
                            charSequence5 = charSequence3;
                            collection3 = collection;
                            collection.add(new p(i6, (CharSequence) obj));
                            collection = collection3;
                            charSequence3 = charSequence5;
                            it = it3;
                            i5 = 0;
                            if (it.hasNext()) {
                                list2 = (List) collection;
                                nn1Var3 = nn1Var2;
                                z3 = z4;
                                charSequence2 = charSequence3;
                                ky P2 = this.l.P(nn1Var3.c, null);
                                w4v w4vVar3 = nn1Var3.w;
                                ra90 b = w4vVar3 == null ? oh4.b(this.m, w4vVar3, null, null, z3, 6) : null;
                                w4v w4vVar22 = nn1Var3.x;
                                return new on1(charSequence2, list2, P2, b, w4vVar22 != null ? oh4.b(this.m, w4vVar22, null, null, z3, 6) : null, nn1Var3.y, nn1Var3.z);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                charSequence = (CharSequence) obj;
                list = nn1Var3.b;
                if (list == null) {
                }
            }
        }
        dashboardStateMapper$map$6 = new DashboardStateMapper$map$6(this, continuationImpl);
        Object obj2 = dashboardStateMapper$map$6.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardStateMapper$map$6.label;
        q8s q8sVar2 = this.k;
        int i52 = 0;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        list = nn1Var3.b;
        if (list == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r19v0, types: [ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.mapper.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0147 -> B:11:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e6 -> B:24:0x00ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oig oigVar, boolean z, String str, ContinuationImpl continuationImpl) {
        DashboardStateMapper$map$1 dashboardStateMapper$map$1;
        int i;
        oig oigVar2;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        String str2;
        DashboardStateMapper$map$1 dashboardStateMapper$map$12;
        boolean z2;
        oig oigVar3;
        Iterator it2;
        Collection collection;
        int i4;
        int i5;
        List list;
        boolean z3;
        if (continuationImpl instanceof DashboardStateMapper$map$1) {
            dashboardStateMapper$map$1 = (DashboardStateMapper$map$1) continuationImpl;
            int i6 = dashboardStateMapper$map$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dashboardStateMapper$map$1.label = i6 - Integer.MIN_VALUE;
                Object obj = dashboardStateMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardStateMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    oigVar2 = oigVar;
                    List list2 = oigVar2.a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    arrayList = arrayList2;
                    i2 = 0;
                    i3 = 0;
                    str2 = str;
                    dashboardStateMapper$map$12 = dashboardStateMapper$map$1;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    int i7 = dashboardStateMapper$map$1.I$1;
                    int i8 = dashboardStateMapper$map$1.I$0;
                    boolean z4 = dashboardStateMapper$map$1.Z$0;
                    ?? r12 = (Collection) dashboardStateMapper$map$1.L$8;
                    Iterator it3 = (Iterator) dashboardStateMapper$map$1.L$5;
                    ?? r14 = (Collection) dashboardStateMapper$map$1.L$4;
                    String str3 = (String) dashboardStateMapper$map$1.L$1;
                    oig oigVar4 = (oig) dashboardStateMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    DashboardStateMapper$map$1 dashboardStateMapper$map$13 = dashboardStateMapper$map$1;
                    z2 = z4;
                    int i9 = i7;
                    str2 = str3;
                    Iterator it4 = it3;
                    ArrayList arrayList3 = r12;
                    int i10 = i8;
                    ArrayList arrayList4 = r14;
                    arrayList3.add((g2q0) obj);
                    oigVar2 = oigVar4;
                    dashboardStateMapper$map$12 = dashboardStateMapper$map$13;
                    i2 = i9;
                    i3 = i10;
                    arrayList = arrayList4;
                    it = it4;
                    if (it.hasNext()) {
                        v0q0 v0q0Var = (v0q0) it.next();
                        dashboardStateMapper$map$12.L$0 = oigVar2;
                        dashboardStateMapper$map$12.L$1 = str2;
                        dashboardStateMapper$map$12.L$2 = null;
                        dashboardStateMapper$map$12.L$3 = null;
                        dashboardStateMapper$map$12.L$4 = arrayList;
                        dashboardStateMapper$map$12.L$5 = it;
                        dashboardStateMapper$map$12.L$6 = null;
                        dashboardStateMapper$map$12.L$7 = null;
                        dashboardStateMapper$map$12.L$8 = arrayList;
                        dashboardStateMapper$map$12.Z$0 = z2;
                        dashboardStateMapper$map$12.I$0 = i3;
                        dashboardStateMapper$map$12.I$1 = i2;
                        dashboardStateMapper$map$12.I$2 = 0;
                        dashboardStateMapper$map$12.label = 1;
                        Object c = c(v0q0Var, z2, str2, dashboardStateMapper$map$12);
                        if (c != coroutineSingletons) {
                            it4 = it;
                            arrayList3 = arrayList;
                            i10 = i3;
                            i9 = i2;
                            dashboardStateMapper$map$13 = dashboardStateMapper$map$12;
                            oigVar4 = oigVar2;
                            obj = c;
                            arrayList4 = arrayList3;
                            arrayList3.add((g2q0) obj);
                            oigVar2 = oigVar4;
                            dashboardStateMapper$map$12 = dashboardStateMapper$map$13;
                            i2 = i9;
                            i3 = i10;
                            arrayList = arrayList4;
                            it = it4;
                            if (it.hasNext()) {
                                List list3 = oigVar2.b;
                                ArrayList arrayList5 = new ArrayList(tcc.n(list3, 10));
                                oigVar3 = oigVar2;
                                it2 = list3.iterator();
                                collection = arrayList5;
                                i4 = 0;
                                i5 = 0;
                                list = arrayList;
                                z3 = z2;
                                dashboardStateMapper$map$1 = dashboardStateMapper$map$12;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = dashboardStateMapper$map$1.I$1;
                    i5 = dashboardStateMapper$map$1.I$0;
                    z3 = dashboardStateMapper$map$1.Z$0;
                    collection = (Collection) dashboardStateMapper$map$1.L$9;
                    it2 = (Iterator) dashboardStateMapper$map$1.L$6;
                    Collection collection2 = (Collection) dashboardStateMapper$map$1.L$5;
                    list = (List) dashboardStateMapper$map$1.L$2;
                    oigVar3 = (oig) dashboardStateMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    collection.add((zeu0) obj);
                    collection = collection2;
                    if (it2.hasNext()) {
                        yeu0 yeu0Var = (yeu0) it2.next();
                        dashboardStateMapper$map$1.L$0 = oigVar3;
                        dashboardStateMapper$map$1.L$1 = null;
                        dashboardStateMapper$map$1.L$2 = list;
                        dashboardStateMapper$map$1.L$3 = null;
                        dashboardStateMapper$map$1.L$4 = null;
                        dashboardStateMapper$map$1.L$5 = collection;
                        dashboardStateMapper$map$1.L$6 = it2;
                        dashboardStateMapper$map$1.L$7 = null;
                        dashboardStateMapper$map$1.L$8 = null;
                        dashboardStateMapper$map$1.L$9 = collection;
                        dashboardStateMapper$map$1.Z$0 = z3;
                        dashboardStateMapper$map$1.I$0 = i5;
                        dashboardStateMapper$map$1.I$1 = i4;
                        dashboardStateMapper$map$1.I$2 = 0;
                        dashboardStateMapper$map$1.label = 2;
                        obj = d(yeu0Var, z3, dashboardStateMapper$map$1);
                        if (obj != coroutineSingletons) {
                            collection2 = collection;
                            collection.add((zeu0) obj);
                            collection = collection2;
                            if (it2.hasNext()) {
                                return new qkg(list, (List) collection, oigVar3.c, oigVar3.d, 16);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        dashboardStateMapper$map$1 = new DashboardStateMapper$map$1(this, continuationImpl);
        Object obj2 = dashboardStateMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardStateMapper$map$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v7, types: [v920] */
    /* JADX WARN: Type inference failed for: r11v37, types: [ddf] */
    /* JADX WARN: Type inference failed for: r11v39, types: [v920] */
    /* JADX WARN: Type inference failed for: r12v14, types: [h5v] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [ome] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11, types: [vq0] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r2v31, types: [r1s] */
    /* JADX WARN: Type inference failed for: r3v20, types: [ddf] */
    /* JADX WARN: Type inference failed for: r6v12, types: [ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.b] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.a] */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x04ab -> B:10:0x04b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(v0q0 v0q0Var, boolean z, String str, ContinuationImpl continuationImpl) {
        DashboardStateMapper$map$11 dashboardStateMapper$map$11;
        int i;
        boolean z2;
        boolean z3;
        Iterator it;
        int i2;
        ArrayList arrayList;
        String str2;
        DashboardStateMapper$map$11 dashboardStateMapper$map$112;
        int i3;
        int i4;
        Boolean bool;
        Iterator it2;
        int i5;
        DashboardStateMapper$map$11 dashboardStateMapper$map$113;
        int i6;
        int i7;
        ArrayList arrayList2;
        int i8;
        String str3;
        wc1 wc1Var;
        Object xc1Var;
        String str4;
        Iterator it3;
        eoj eojVar;
        xk4 xk4Var;
        ra90 ra90Var;
        String str5;
        String str6;
        rry0 rry0Var;
        q4g q4gVar;
        Object obj;
        Pair pair;
        int i9;
        ?? r15;
        int i10;
        ?? r17;
        s2v0 s2v0Var;
        s2v0 s2v0Var2;
        int i11;
        DashboardStateMapper$map$11 dashboardStateMapper$map$114;
        ArrayList arrayList3;
        wsy0 a;
        Object a2;
        v0q0 v0q0Var2 = v0q0Var;
        if (continuationImpl instanceof DashboardStateMapper$map$11) {
            dashboardStateMapper$map$11 = (DashboardStateMapper$map$11) continuationImpl;
            int i12 = dashboardStateMapper$map$11.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dashboardStateMapper$map$11.label = i12 - Integer.MIN_VALUE;
                Object obj2 = dashboardStateMapper$map$11.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardStateMapper$map$11.label;
                int i13 = 1;
                String str7 = null;
                int i14 = 0;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str8 = v0q0Var2.d;
                    boolean booleanValue = (str8 == null || (bool = (Boolean) ((Map) this.b.a.getValue()).get(str8)) == null) ? false : bool.booleanValue();
                    List list = v0q0Var2.a;
                    ArrayList arrayList4 = new ArrayList();
                    z2 = z;
                    z3 = booleanValue;
                    it = list.iterator();
                    i2 = 0;
                    arrayList = arrayList4;
                    str2 = str;
                    dashboardStateMapper$map$112 = dashboardStateMapper$map$11;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i15 = dashboardStateMapper$map$11.I$3;
                    int i16 = dashboardStateMapper$map$11.I$2;
                    i4 = dashboardStateMapper$map$11.I$1;
                    int i17 = dashboardStateMapper$map$11.I$0;
                    boolean z4 = dashboardStateMapper$map$11.Z$0;
                    Iterator it4 = (Iterator) dashboardStateMapper$map$11.L$6;
                    ?? r13 = (Collection) dashboardStateMapper$map$11.L$4;
                    String str9 = (String) dashboardStateMapper$map$11.L$1;
                    v0q0 v0q0Var3 = (v0q0) dashboardStateMapper$map$11.L$0;
                    kotlin.b.b(obj2);
                    DashboardStateMapper$map$11 dashboardStateMapper$map$115 = dashboardStateMapper$map$11;
                    i3 = i15;
                    v0q0Var2 = v0q0Var3;
                    i2 = i16;
                    dashboardStateMapper$map$112 = dashboardStateMapper$map$115;
                    z2 = z4;
                    it = it4;
                    arrayList = r13;
                    String str10 = null;
                    int i18 = i17;
                    n351 n351Var = (n351) obj2;
                    if (n351Var != null) {
                        arrayList.add(n351Var);
                    }
                    str2 = str9;
                    str7 = str10;
                    i13 = 1;
                    i14 = 0;
                    z3 = i18;
                    if (it.hasNext()) {
                        s151 s151Var = (s151) it.next();
                        int i19 = z3 != 0 ? i13 : i14;
                        dashboardStateMapper$map$112.L$0 = v0q0Var2;
                        dashboardStateMapper$map$112.L$1 = str2;
                        dashboardStateMapper$map$112.L$2 = str7;
                        dashboardStateMapper$map$112.L$3 = str7;
                        dashboardStateMapper$map$112.L$4 = arrayList;
                        dashboardStateMapper$map$112.L$5 = str7;
                        dashboardStateMapper$map$112.L$6 = it;
                        dashboardStateMapper$map$112.L$7 = str7;
                        dashboardStateMapper$map$112.L$8 = str7;
                        dashboardStateMapper$map$112.L$9 = str7;
                        dashboardStateMapper$map$112.Z$0 = z2;
                        dashboardStateMapper$map$112.I$0 = z3;
                        dashboardStateMapper$map$112.I$1 = i4;
                        dashboardStateMapper$map$112.I$2 = i2;
                        dashboardStateMapper$map$112.I$3 = i3;
                        dashboardStateMapper$map$112.I$4 = i14;
                        dashboardStateMapper$map$112.I$5 = i14;
                        dashboardStateMapper$map$112.label = i13;
                        if (s151Var instanceof kmt0) {
                            a2 = this.a.a((kmt0) s151Var, z2, i19, dashboardStateMapper$map$112);
                            if (a2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                a2 = (n351) a2;
                            }
                        } else {
                            ?? r8 = i19;
                            if (s151Var instanceof pkp0) {
                                a2 = this.c.a((pkp0) s151Var, z2, r8, dashboardStateMapper$map$112);
                                if (a2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    a2 = (n351) a2;
                                }
                            } else {
                                it2 = it;
                                if (s151Var instanceof i500) {
                                    i500 i500Var = (i500) s151Var;
                                    q4g q4gVar2 = this.d;
                                    q4gVar2.getClass();
                                    ArrayList arrayList5 = i500Var.c;
                                    if (arrayList5 == null || arrayList5.isEmpty()) {
                                        str5 = str2;
                                        pau pauVar = i500Var.a;
                                        rry0 rry0Var2 = pauVar.a;
                                        w4v w4vVar = pauVar.c;
                                        str6 = str7;
                                        if (w4vVar != null) {
                                            rry0Var = rry0Var2;
                                            i6 = i4;
                                            i7 = z3;
                                            arrayList2 = arrayList;
                                            q4gVar = q4gVar2;
                                            obj = oh4.b((oh4) q4gVar2.x, w4vVar, null, null, z2, 6);
                                        } else {
                                            i6 = i4;
                                            i7 = z3;
                                            rry0Var = rry0Var2;
                                            arrayList2 = arrayList;
                                            q4gVar = q4gVar2;
                                            obj = str6;
                                        }
                                        pair = new Pair(obj, scc.h(rry0Var));
                                    } else {
                                        str5 = str2;
                                        pair = new Pair(str7, arrayList5);
                                        str6 = str7;
                                        i6 = i4;
                                        i7 = z3;
                                        arrayList2 = arrayList;
                                        q4gVar = q4gVar2;
                                    }
                                    v4v v4vVar = (v4v) pair.getFirst();
                                    List list2 = (List) pair.getSecond();
                                    lrb1 lrb1Var = i500Var.b;
                                    if (lrb1Var != null) {
                                        i9 = i2;
                                        r15 = ((v920) q4gVar.b).i(lrb1Var, z2, r8);
                                    } else {
                                        i9 = i2;
                                        r15 = str6;
                                    }
                                    uq0 uq0Var = i500Var.d;
                                    if (uq0Var != null) {
                                        i10 = i9;
                                        r17 = ((ddf) q4gVar.c).n(uq0Var, r8);
                                    } else {
                                        i10 = i9;
                                        r17 = str6;
                                    }
                                    List<qqn> list3 = list2;
                                    ArrayList arrayList6 = new ArrayList(tcc.n(list3, 10));
                                    for (qqn qqnVar : list3) {
                                        u1n u1nVar = (u1n) q4gVar.w;
                                        if (qqnVar instanceof w4v) {
                                            i11 = i3;
                                            dashboardStateMapper$map$114 = dashboardStateMapper$map$112;
                                            arrayList3 = arrayList6;
                                            a = new h5v(oh4.b((oh4) u1nVar.b, (w4v) qqnVar, null, null, z2, 6));
                                        } else {
                                            i11 = i3;
                                            dashboardStateMapper$map$114 = dashboardStateMapper$map$112;
                                            arrayList3 = arrayList6;
                                            if (!(qqnVar instanceof rry0)) {
                                                u1nVar.getClass();
                                                w511.b();
                                                return str6;
                                            }
                                            a = ((xk4) u1nVar.c).a((rry0) qqnVar, z2);
                                        }
                                        arrayList3.add(a);
                                        i3 = i11;
                                        arrayList6 = arrayList3;
                                        dashboardStateMapper$map$112 = dashboardStateMapper$map$114;
                                    }
                                    i5 = i3;
                                    dashboardStateMapper$map$113 = dashboardStateMapper$map$112;
                                    ArrayList arrayList7 = arrayList6;
                                    r0b1 r0b1Var = i500Var.e;
                                    if (r0b1Var == null) {
                                        s2v0Var = null;
                                    } else {
                                        if ((r0b1Var instanceof ccu) && str5 != null) {
                                            String str11 = str5.length() > 0 ? str5 : str6;
                                            if (str11 != null) {
                                                s2v0Var2 = new s2v0(str11, ((g191) q4gVar.y).P(zgg.a, str6));
                                                s2v0Var = s2v0Var2;
                                            }
                                        }
                                        s2v0Var2 = null;
                                        s2v0Var = s2v0Var2;
                                    }
                                    i8 = i10;
                                    obj2 = new j500(r15, v4vVar, r17, arrayList7, s2v0Var, i500Var.f, r8, str5);
                                    str3 = str5;
                                } else {
                                    i5 = i3;
                                    dashboardStateMapper$map$113 = dashboardStateMapper$map$112;
                                    i6 = i4;
                                    i7 = z3;
                                    arrayList2 = arrayList;
                                    i8 = i2;
                                    if (s151Var instanceof uq0) {
                                        str3 = str2;
                                        obj2 = this.e.n((uq0) s151Var, r8);
                                    } else if (s151Var instanceof soj) {
                                        q4g q4gVar3 = this.f;
                                        q4gVar3.getClass();
                                        ArrayList arrayList8 = ((soj) s151Var).a;
                                        ArrayList arrayList9 = new ArrayList(tcc.n(arrayList8, 10));
                                        Iterator it5 = arrayList8.iterator();
                                        while (it5.hasNext()) {
                                            eoj eojVar2 = (eoj) it5.next();
                                            xk4 xk4Var2 = (xk4) q4gVar3.w;
                                            rry0 rry0Var3 = eojVar2.a;
                                            wsy0 a3 = rry0Var3 != null ? xk4Var2.a(rry0Var3, z2) : null;
                                            rry0 rry0Var4 = eojVar2.b;
                                            wsy0 a4 = rry0Var4 != null ? xk4Var2.a(rry0Var4, z2) : null;
                                            rry0 rry0Var5 = eojVar2.c;
                                            wsy0 a5 = rry0Var5 != null ? xk4Var2.a(rry0Var5, z2) : null;
                                            hhg hhgVar = eojVar2.d;
                                            ky P = hhgVar != null ? ((g191) q4gVar3.b).P(hhgVar, null) : null;
                                            w4v w4vVar2 = eojVar2.e;
                                            if (w4vVar2 != null) {
                                                str4 = str2;
                                                it3 = it5;
                                                eojVar = eojVar2;
                                                xk4Var = xk4Var2;
                                                ra90Var = oh4.b((oh4) q4gVar3.c, w4vVar2, null, null, z2, 6);
                                            } else {
                                                str4 = str2;
                                                it3 = it5;
                                                eojVar = eojVar2;
                                                xk4Var = xk4Var2;
                                                ra90Var = null;
                                            }
                                            rry0 rry0Var6 = eojVar.f;
                                            wsy0 a6 = rry0Var6 != null ? xk4Var.a(rry0Var6, z2) : null;
                                            u3b1 u3b1Var = eojVar.g;
                                            w3b1 a7 = u3b1Var != null ? ((oh4) q4gVar3.x).a(u3b1Var, z2) : null;
                                            CouponSize couponSize = eojVar.h;
                                            boolean z5 = eojVar.i;
                                            goj gojVar = eojVar.j;
                                            arrayList9.add(new foj(a3, a4, a5, P, ra90Var, a6, a7, couponSize, z5, gojVar instanceof goj ? new hoj(((e100) q4gVar3.y).d(gojVar.a, z2)) : null, eojVar.k, eojVar.l));
                                            str2 = str4;
                                            it5 = it3;
                                        }
                                        str3 = str2;
                                        obj2 = new toj(arrayList9, r8);
                                    } else {
                                        str3 = str2;
                                        if (s151Var instanceof iof0) {
                                            iof0 iof0Var = (iof0) s151Var;
                                            boj0 boj0Var = this.g;
                                            yfa yfaVar = (yfa) boj0Var.y;
                                            xk4 xk4Var3 = (xk4) boj0Var.x;
                                            wsy0 a8 = xk4Var3.a(iof0Var.a, z2);
                                            rry0 rry0Var7 = iof0Var.b;
                                            wsy0 a9 = rry0Var7 != null ? xk4Var3.a(rry0Var7, z2) : null;
                                            ky P2 = ((g191) boj0Var.b).P(iof0Var.e, null);
                                            w4v w4vVar3 = iof0Var.g;
                                            ra90 b = w4vVar3 != null ? oh4.b((oh4) boj0Var.w, w4vVar3, null, null, z2, 6) : null;
                                            lrb1 lrb1Var2 = iof0Var.h;
                                            ome i20 = lrb1Var2 != null ? ((v920) boj0Var.c).i(lrb1Var2, z2, r8) : null;
                                            qfc qfcVar = iof0Var.c;
                                            ldc e = qfcVar != null ? yfaVar.e(qfcVar, z2) : null;
                                            qfc qfcVar2 = iof0Var.d;
                                            ldc e2 = qfcVar2 != null ? yfaVar.e(qfcVar2, z2) : null;
                                            u3b1 u3b1Var2 = iof0Var.i;
                                            xc1Var = new hqf0(a8, a9, e, e2, P2, b, u3b1Var2 != null ? ((oh4) boj0Var.z).a(u3b1Var2, z2) : null, i20, iof0Var.j, iof0Var.l, iof0Var.k, r8);
                                        } else if (s151Var instanceof zau) {
                                            obj2 = this.h.f((zau) s151Var, z2, r8);
                                        } else if (s151Var instanceof SpacerModel) {
                                            SpacerModel spacerModel = (SpacerModel) s151Var;
                                            this.i.getClass();
                                            obj2 = new SpacerState(SpacerState.Size.valueOf(spacerModel.a.name()), spacerModel.b, spacerModel.c, r8);
                                        } else if (s151Var instanceof gs4) {
                                            gs4 gs4Var = (gs4) s151Var;
                                            this.j.getClass();
                                            obj2 = new hs4(gs4Var.a, gs4Var.b);
                                        } else if (s151Var instanceof qc1) {
                                            qc1 qc1Var = (qc1) s151Var;
                                            this.n.getClass();
                                            uc1 uc1Var = qc1Var.b;
                                            if (uc1Var instanceof tc1) {
                                                tc1 tc1Var = (tc1) uc1Var;
                                                String str12 = tc1Var.a;
                                                sc1 sc1Var = tc1Var.b;
                                                wc1Var = new wc1(str12, sc1Var != null ? sc1Var.a : null, sc1Var != null ? sc1Var.b : null);
                                            } else {
                                                if (!(uc1Var instanceof rc1)) {
                                                    w511.b();
                                                    return null;
                                                }
                                                wc1Var = null;
                                            }
                                            if (wc1Var == null) {
                                                obj2 = null;
                                            } else {
                                                xc1Var = new xc1(qc1Var.a, r8, wc1Var, qc1Var.d, qc1Var.c);
                                            }
                                        } else {
                                            str10 = null;
                                            obj2 = null;
                                            if (obj2 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            it = it2;
                                            str9 = str3;
                                            i3 = i5;
                                            arrayList = arrayList2;
                                            i2 = i8;
                                            i18 = i7;
                                            i4 = i6;
                                            dashboardStateMapper$map$112 = dashboardStateMapper$map$113;
                                            n351 n351Var2 = (n351) obj2;
                                            if (n351Var2 != null) {
                                            }
                                            str2 = str9;
                                            str7 = str10;
                                            i13 = 1;
                                            i14 = 0;
                                            z3 = i18;
                                            if (it.hasNext()) {
                                                return new g2q0(arrayList, v0q0Var2.b, v0q0Var2.c, v0q0Var2.d, z3, v0q0Var2.f, SectionStyle.valueOf(v0q0Var2.g.name()), null, null, 896);
                                            }
                                        }
                                        obj2 = xc1Var;
                                    }
                                }
                                str10 = null;
                                if (obj2 == coroutineSingletons) {
                                }
                            }
                        }
                        str3 = str2;
                        i5 = i3;
                        dashboardStateMapper$map$113 = dashboardStateMapper$map$112;
                        obj2 = a2;
                        str10 = str7;
                        i6 = i4;
                        i7 = z3;
                        it2 = it;
                        arrayList2 = arrayList;
                        i8 = i2;
                        if (obj2 == coroutineSingletons) {
                        }
                    }
                }
            }
        }
        dashboardStateMapper$map$11 = new DashboardStateMapper$map$11(this, continuationImpl);
        Object obj22 = dashboardStateMapper$map$11.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardStateMapper$map$11.label;
        int i132 = 1;
        String str72 = null;
        int i142 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(yeu0 yeu0Var, boolean z, ContinuationImpl continuationImpl) {
        DashboardStateMapper$map$4 dashboardStateMapper$map$4;
        int i;
        Object obj;
        if (continuationImpl instanceof DashboardStateMapper$map$4) {
            dashboardStateMapper$map$4 = (DashboardStateMapper$map$4) continuationImpl;
            int i2 = dashboardStateMapper$map$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardStateMapper$map$4.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dashboardStateMapper$map$4.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardStateMapper$map$4.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    afu0 afu0Var = yeu0Var.a;
                    dashboardStateMapper$map$4.L$0 = null;
                    dashboardStateMapper$map$4.Z$0 = z;
                    dashboardStateMapper$map$4.label = 1;
                    if (afu0Var instanceof nn1) {
                        obj = a((nn1) afu0Var, z, dashboardStateMapper$map$4);
                        if (obj != obj3) {
                            obj = (bfu0) obj;
                        }
                    } else {
                        obj = b221.a;
                    }
                    obj2 = obj;
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return new zeu0((bfu0) obj2);
            }
        }
        dashboardStateMapper$map$4 = new DashboardStateMapper$map$4(this, continuationImpl);
        Object obj22 = dashboardStateMapper$map$4.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardStateMapper$map$4.label;
        if (i != 0) {
        }
        return new zeu0((bfu0) obj22);
    }
}
