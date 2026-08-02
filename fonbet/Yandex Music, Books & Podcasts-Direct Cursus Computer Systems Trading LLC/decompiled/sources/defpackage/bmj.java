package defpackage;

import com.yandex.music.shared.smart.downloading.data.network.DownloadIntervalDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bmj extends aur implements Function2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ cmj F;
    public final /* synthetic */ boolean G;
    public gzq j;
    public String k;
    public kvu l;
    public lvu m;
    public Object n;
    public gzq o;
    public cmj p;
    public cmj q;
    public Collection r;
    public Object s;
    public Object t;
    public Iterator u;
    public mqs v;
    public long w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmj(cmj cmjVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.F = cmjVar;
        this.G = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        bmj bmjVar = new bmj(this.F, this.G, continuation);
        bmjVar.E = obj;
        return bmjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bmj) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x07e1, code lost:
    
        if (r0.b() == true) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0703, code lost:
    
        if (r1 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x047f, code lost:
    
        if (r5 != r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03d3, code lost:
    
        if (r1 == r11) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0c9f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0c88  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0d21  */
    /* JADX WARN: Type inference failed for: r1v119, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v152, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v171, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v224, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x07c8 -> B:95:0x07d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0c1a -> B:10:0x0c29). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object b;
        gzq gzqVar;
        String str2;
        Object f;
        long j;
        String str3;
        int i;
        boolean z;
        e6q e6qVar;
        String str4;
        hzq hzqVar;
        raa raaVar;
        String str5;
        String str6;
        q3t q3tVar;
        String str7;
        Object g0;
        kvu kvuVar;
        lvu a;
        Object a2;
        long j2;
        String str8;
        gzq gzqVar2;
        int i2;
        q3t q3tVar2;
        Object g02;
        gzq gzqVar3;
        lvu lvuVar;
        kvu kvuVar2;
        String str9;
        int i3;
        int i4;
        long j3;
        int i5;
        int q;
        q3t q3tVar3;
        int i6;
        int i7;
        Long l;
        String str10;
        Object a3;
        nm6 nm6Var;
        int i8;
        String str11;
        int i9;
        gzq gzqVar4;
        long j4;
        int i10;
        int i11;
        lvu lvuVar2;
        int i12;
        nm6 nm6Var2;
        long j5;
        int i13;
        ozq ozqVar;
        gzq gzqVar5;
        lvu lvuVar3;
        int i14;
        int i15;
        gzq gzqVar6;
        cmj cmjVar;
        gzq gzqVar7;
        List list;
        Iterator it;
        int i16;
        int i17;
        int i18;
        int i19;
        lvu lvuVar4;
        cmj cmjVar2;
        ArrayList arrayList;
        String str12;
        int i20;
        cmj cmjVar3;
        int i21;
        String str13;
        cmj cmjVar4;
        Object d;
        int i22;
        lvu lvuVar5;
        int i23;
        int i24;
        cmj cmjVar5;
        int i25;
        Object V;
        Object obj2;
        int i26;
        ArrayList arrayList2;
        iss issVar;
        int i27;
        rj6 rj6Var;
        String str14;
        ArrayList arrayList3;
        q3t q3tVar4;
        vqn vqnVar;
        mm6 mm6Var;
        Iterator it2;
        ArrayList arrayList4;
        int i28;
        int i29;
        vqn vqnVar2;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        cmj cmjVar6;
        q3t q3tVar5;
        mqs mqsVar;
        String str15;
        mm6 mm6Var2;
        Object obj3;
        int i35;
        int i36;
        cmj cmjVar7;
        int i37;
        q3t q3tVar6;
        int i38;
        String str16;
        int i39;
        nm6 nm6Var3;
        vqn vqnVar3;
        vqn vqnVar4;
        mm6 mm6Var3;
        ArrayList arrayList5;
        String str17;
        ArrayList arrayList6;
        nm6 nm6Var4;
        int i40;
        mm6 mm6Var4;
        int i41;
        int i42;
        vqn vqnVar5;
        int i43;
        int i44;
        mqs mqsVar2;
        String str18;
        nm6 nm6Var5;
        vqn vqnVar6;
        int i45;
        ArrayList arrayList7;
        int i46;
        int i47;
        int i48;
        ArrayList arrayList8;
        int i49;
        int i50;
        cmj cmjVar8;
        ArrayList arrayList9;
        int i51;
        int i52;
        nm6 nm6Var6;
        ArrayList arrayList10;
        cmj cmjVar9;
        int i53;
        int i54;
        Object remove;
        eca ecaVar;
        cmj cmjVar10 = this.F;
        hzq hzqVar2 = cmjVar10.i;
        raa raaVar2 = cmjVar10.e;
        q3t q3tVar7 = cmjVar10.h;
        mm6 mm6Var5 = (mm6) this.E;
        nm6 nm6Var7 = nm6.a;
        int i55 = this.D;
        qyq qyqVar = qyq.a;
        boolean z2 = this.G;
        int i56 = 0;
        String str19 = "OfflineRecommenderSmartDownloadCenter";
        switch (i55) {
            case 0:
                str = " [occupiedMb=";
                qgg.h0(obj);
                this.E = mm6Var5;
                this.D = 1;
                b = ((nzq) hzqVar2).b(this);
                break;
            case 1:
                str = " [occupiedMb=";
                qgg.h0(obj);
                b = obj;
                gzqVar = (gzq) b;
                long j6 = gzqVar != null ? gzqVar.e : 0L;
                str2 = ", name=";
                frt frtVar = cmjVar10.c;
                this.E = mm6Var5;
                this.j = gzqVar;
                this.w = j6;
                long j7 = j6;
                this.D = 2;
                f = frtVar.f(this);
                if (f != nm6Var7) {
                    j = j7;
                    String str20 = ((xxq) f).a;
                    str3 = " tracks=";
                    if (!z2) {
                        if (Intrinsics.d(str20, gzqVar != null ? gzqVar.a : null)) {
                            i = 0;
                            z = z2;
                            e6qVar = cmjVar10.d;
                            this.E = mm6Var5;
                            this.j = gzqVar;
                            this.k = str20;
                            this.w = j;
                            this.x = i;
                            this.D = 3;
                            if (e6qVar.a(this) != nm6Var7) {
                                str4 = str20;
                                mvu mvuVar = cmjVar10.j;
                                hzqVar = hzqVar2;
                                yx4 yx4Var = mvuVar.a;
                                raaVar = raaVar2;
                                str5 = "]";
                                str6 = " totalMb=";
                                q3tVar = q3tVar7;
                                str7 = "OfflineRecommenderSmartDownloadCenter";
                                Continuation continuation = null;
                                u21 u21Var = new u21(10, yx4.y(new pjc[]{((e6q) yx4Var.a).e}, new sx4(yx4Var, true, continuation, i56)), ((ezb) mvuVar.b).d, new laq(3, 6, continuation));
                                this.E = mm6Var5;
                                this.j = gzqVar;
                                this.k = str4;
                                this.w = j;
                                this.x = i;
                                this.D = 4;
                                g0 = zsd.g0(u21Var, this);
                                break;
                            }
                        }
                    }
                    i = 1;
                    z = z2;
                    e6qVar = cmjVar10.d;
                    this.E = mm6Var5;
                    this.j = gzqVar;
                    this.k = str20;
                    this.w = j;
                    this.x = i;
                    this.D = 3;
                    if (e6qVar.a(this) != nm6Var7) {
                    }
                }
                return nm6Var7;
            case 2:
                str = " [occupiedMb=";
                long j8 = this.w;
                gzqVar = this.j;
                qgg.h0(obj);
                str2 = ", name=";
                j = j8;
                f = obj;
                String str202 = ((xxq) f).a;
                str3 = " tracks=";
                if (!z2) {
                }
                i = 1;
                z = z2;
                e6qVar = cmjVar10.d;
                this.E = mm6Var5;
                this.j = gzqVar;
                this.k = str202;
                this.w = j;
                this.x = i;
                this.D = 3;
                if (e6qVar.a(this) != nm6Var7) {
                }
                return nm6Var7;
            case 3:
                str = " [occupiedMb=";
                int i57 = this.x;
                long j9 = this.w;
                str4 = this.k;
                gzq gzqVar8 = this.j;
                qgg.h0(obj);
                z = z2;
                gzqVar = gzqVar8;
                str2 = ", name=";
                str3 = " tracks=";
                i = i57;
                j = j9;
                mvu mvuVar2 = cmjVar10.j;
                hzqVar = hzqVar2;
                yx4 yx4Var2 = mvuVar2.a;
                raaVar = raaVar2;
                str5 = "]";
                str6 = " totalMb=";
                q3tVar = q3tVar7;
                str7 = "OfflineRecommenderSmartDownloadCenter";
                Continuation continuation2 = null;
                u21 u21Var2 = new u21(10, yx4.y(new pjc[]{((e6q) yx4Var2.a).e}, new sx4(yx4Var2, true, continuation2, i56)), ((ezb) mvuVar2.b).d, new laq(3, 6, continuation2));
                this.E = mm6Var5;
                this.j = gzqVar;
                this.k = str4;
                this.w = j;
                this.x = i;
                this.D = 4;
                g0 = zsd.g0(u21Var2, this);
                break;
            case 4:
                str = " [occupiedMb=";
                int i58 = this.x;
                long j10 = this.w;
                str4 = this.k;
                gzq gzqVar9 = this.j;
                qgg.h0(obj);
                z = z2;
                hzqVar = hzqVar2;
                raaVar = raaVar2;
                q3tVar = q3tVar7;
                str7 = "OfflineRecommenderSmartDownloadCenter";
                str5 = "]";
                str6 = " totalMb=";
                g0 = obj;
                gzqVar = gzqVar9;
                str2 = ", name=";
                str3 = " tracks=";
                i = i58;
                j = j10;
                kvuVar = (kvu) g0;
                a = kvuVar.a();
                yyq yyqVar = cmjVar10.a;
                this.E = mm6Var5;
                this.j = gzqVar;
                this.k = str4;
                this.l = kvuVar;
                this.m = a;
                this.w = j;
                this.x = i;
                this.D = 5;
                a2 = yyqVar.a(this);
                if (a2 != nm6Var7) {
                    j2 = j;
                    str8 = str4;
                    gzqVar2 = gzqVar;
                    i2 = i;
                    long j11 = j2;
                    int intValue = ((Number) a2).intValue();
                    q3tVar2 = q3tVar;
                    int q2 = ocg.q(q3tVar2.d(css.h));
                    bca b2 = cmjVar10.k.b();
                    this.E = mm6Var5;
                    this.j = gzqVar2;
                    this.k = str8;
                    this.l = kvuVar;
                    this.m = a;
                    this.w = j11;
                    this.x = i2;
                    this.y = intValue;
                    this.z = q2;
                    this.D = 6;
                    g02 = zsd.g0(b2, this);
                    if (g02 != nm6Var7) {
                        lvu lvuVar6 = a;
                        gzqVar3 = gzqVar2;
                        lvuVar = lvuVar6;
                        kvuVar2 = kvuVar;
                        int i59 = i2;
                        str9 = str8;
                        i3 = intValue;
                        i4 = q2;
                        j3 = j11;
                        i5 = i59;
                        q = ocg.q(((Number) g02).longValue());
                        String T = vnj.T(cmjVar10.l.a());
                        q3tVar3 = q3tVar2;
                        syq syqVar = cmjVar10.m;
                        syqVar.j = new Integer(lvuVar.a.size());
                        syqVar.k = new Integer(lvuVar.b.size());
                        syqVar.l = new Integer(lvuVar.c.size());
                        syqVar.m = new Integer(i3);
                        syqVar.n = new Integer(i4);
                        syqVar.o = new Integer(q);
                        syqVar.p = T;
                        i6 = i3;
                        if (gzqVar3 == null) {
                            i7 = i4;
                            l = new Long(gzqVar3.f);
                        } else {
                            i7 = i4;
                            l = null;
                        }
                        syqVar.e = l;
                        if (i5 == 0 || System.currentTimeMillis() > j3) {
                            str19 = str7;
                            this.E = mm6Var5;
                            this.j = gzqVar3;
                            this.k = str9;
                            this.l = kvuVar2;
                            this.m = lvuVar;
                            this.w = j3;
                            this.x = i5;
                            this.y = i6;
                            int i60 = i7;
                            this.z = i60;
                            this.A = q;
                            this.D = 7;
                            int i61 = i5;
                            gzq gzqVar10 = gzqVar3;
                            String str21 = str;
                            String str22 = str2;
                            cmjVar10 = cmjVar10;
                            long j12 = j3;
                            str10 = str3;
                            a3 = cmj.a(cmjVar10, lvuVar, i6, i60, q, T, this);
                            lvu lvuVar7 = lvuVar;
                            nm6Var = nm6Var7;
                            if (a3 != nm6Var) {
                                i8 = q;
                                str11 = str9;
                                i9 = i6;
                                gzqVar4 = gzqVar10;
                                obj = a3;
                                j4 = j12;
                                str2 = str22;
                                i10 = i61;
                                str = str21;
                                i11 = i60;
                                lvuVar2 = lvuVar7;
                                ozqVar = (ozq) obj;
                                if (ozqVar == null) {
                                    ozqVar.getClass();
                                    str11.getClass();
                                    str3 = str10;
                                    List list2 = ozqVar.c;
                                    str7 = str19;
                                    nm6 nm6Var8 = nm6Var;
                                    int i62 = i8;
                                    ArrayList arrayList11 = new ArrayList(v75.o(list2, 10));
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        e5w e5wVar = (e5w) it3.next();
                                        arrayList11.add(new DownloadIntervalDto(e5wVar.a, e5wVar.b, e5wVar.e.getID()));
                                        it3 = it3;
                                        i11 = i11;
                                    }
                                    gzq gzqVar11 = new gzq(str11, arrayList11, ozqVar.a, ozqVar.b, ozqVar.d, System.currentTimeMillis());
                                    this.E = mm6Var5;
                                    this.j = gzqVar4;
                                    this.k = null;
                                    this.l = kvuVar2;
                                    this.m = lvuVar2;
                                    this.n = ozqVar;
                                    this.o = gzqVar11;
                                    this.p = cmjVar10;
                                    this.w = j4;
                                    this.x = i10;
                                    this.y = i9;
                                    i13 = i11;
                                    this.z = i13;
                                    i8 = i62;
                                    this.A = i8;
                                    this.B = 0;
                                    this.D = 8;
                                    nzq nzqVar = (nzq) hzqVar;
                                    gzqVar5 = gzqVar4;
                                    lvuVar3 = lvuVar2;
                                    Object a4 = lmm.a((wb7) nzqVar.b.getValue(), new mzq(gzqVar11, nzqVar, null), this);
                                    nm6Var2 = nm6Var8;
                                    if (a4 != nm6Var2) {
                                        a4 = Unit.a;
                                    }
                                    if (a4 == nm6Var2) {
                                        return nm6Var2;
                                    }
                                    int i63 = i9;
                                    i14 = i10;
                                    i15 = i63;
                                    gzqVar6 = gzqVar11;
                                    cmjVar = cmjVar10;
                                    cmjVar.m.a = ozqVar.c;
                                    if (gzqVar6 == null) {
                                        int i64 = i15;
                                        gzqVar3 = gzqVar6;
                                        i12 = i64;
                                        j5 = j4;
                                        q = i8;
                                        i5 = i14;
                                        gzqVar7 = gzqVar5;
                                        lvuVar = lvuVar3;
                                        if (gzqVar3 != null) {
                                            ssg.a(6, str7, "performSmartDownloading: the update batch is invalid", null);
                                            pyq pyqVar = new pyq("Invalid update batch");
                                            cmjVar10.m.q = "Invalid update batch";
                                            return pyqVar;
                                        }
                                        String str23 = str7;
                                        Set set = gzqVar3.c;
                                        lvu lvuVar8 = lvuVar;
                                        syq syqVar2 = cmjVar10.m;
                                        int i65 = i12;
                                        int i66 = i5;
                                        syqVar2.b = new Integer(set.size());
                                        syqVar2.c = new Integer(gzqVar3.d.size());
                                        int i67 = q;
                                        syqVar2.f = new Long(gzqVar3.e);
                                        if (gzqVar7 != null && (list = gzqVar7.b) != null) {
                                            if (gzqVar7 == gzqVar3) {
                                                list = null;
                                                break;
                                            }
                                        }
                                        list = c5b.a;
                                        ArrayList P = wxf.P(CollectionsKt.g0(gzqVar3.b, list));
                                        if (!z && rzf.N(P) == null) {
                                            ssg.a(6, str23, "performSmartDownloading: skip downloading, not in intervals: ".concat(rzf.y(P)), null);
                                            pyq pyqVar2 = new pyq("Not in intervals after batch update");
                                            cmjVar10.m.q = "Not in intervals after batch update";
                                            return pyqVar2;
                                        }
                                        ArrayList arrayList12 = new ArrayList();
                                        it = set.iterator();
                                        i16 = i13;
                                        i17 = i65;
                                        i18 = i66;
                                        i19 = i67;
                                        lvuVar4 = lvuVar8;
                                        cmjVar2 = cmjVar10;
                                        arrayList = arrayList12;
                                        str12 = str23;
                                        i20 = 0;
                                        cmjVar3 = cmjVar2;
                                        i21 = 0;
                                        if (it.hasNext()) {
                                            nm6 nm6Var9 = nm6Var2;
                                            Object next = it.next();
                                            int i68 = i20;
                                            int i69 = i21;
                                            raa raaVar3 = cmjVar3.e;
                                            zvs zvsVar = new zvs((String) next);
                                            this.E = mm6Var5;
                                            this.j = null;
                                            this.k = null;
                                            this.l = kvuVar2;
                                            this.m = lvuVar4;
                                            this.n = gzqVar3;
                                            this.o = null;
                                            this.p = null;
                                            this.q = cmjVar3;
                                            this.r = arrayList;
                                            this.s = it;
                                            this.t = next;
                                            this.u = null;
                                            this.w = j5;
                                            this.x = i18;
                                            this.y = i17;
                                            this.z = i16;
                                            this.A = i19;
                                            this.B = i69;
                                            cmjVar5 = cmjVar3;
                                            this.C = i68;
                                            this.D = 9;
                                            Iterator it4 = it;
                                            i25 = i69;
                                            V = x97.V(dm6.b, new f98((taa) raaVar3, zvsVar, (Continuation) null, 6), this);
                                            nm6Var = nm6Var9;
                                            if (V != nm6Var) {
                                                i20 = i68;
                                                obj2 = next;
                                                it = it4;
                                                i26 = i18;
                                                arrayList2 = arrayList;
                                                issVar = (iss) V;
                                                if (issVar == null && (r0 = issVar.f) != null) {
                                                    i27 = i19;
                                                    break;
                                                } else {
                                                    i27 = i19;
                                                }
                                                arrayList2.add(obj2);
                                                i19 = i27;
                                                nm6Var2 = nm6Var;
                                                arrayList = arrayList2;
                                                i18 = i26;
                                                cmjVar3 = cmjVar5;
                                                i21 = i25;
                                                if (it.hasNext()) {
                                                    nm6 nm6Var10 = nm6Var2;
                                                    ArrayList arrayList13 = arrayList;
                                                    int size = arrayList13.size();
                                                    str13 = str12;
                                                    v3w.k("filter out already downloaded tracks: tracksToDownload count=", size, 3, str13, null);
                                                    if (arrayList13.isEmpty()) {
                                                        cmjVar2.m.q = "tracksToDownload is empty";
                                                        return qyqVar;
                                                    }
                                                    cmjVar4 = cmjVar2;
                                                    int i70 = i19;
                                                    v3w.k("fetch track info by ids: tracksToDownload=", arrayList13.size(), 3, str13, null);
                                                    psd psdVar = new psd(2);
                                                    psdVar.b = "SmartDownloading";
                                                    this.E = mm6Var5;
                                                    this.j = null;
                                                    this.k = null;
                                                    this.l = kvuVar2;
                                                    this.m = lvuVar4;
                                                    this.n = gzqVar3;
                                                    this.o = null;
                                                    this.p = null;
                                                    this.q = null;
                                                    this.r = null;
                                                    this.s = null;
                                                    this.t = null;
                                                    this.u = null;
                                                    this.w = j5;
                                                    this.x = i18;
                                                    this.y = i17;
                                                    this.z = i16;
                                                    this.A = i70;
                                                    this.D = 10;
                                                    d = cmjVar4.g.d(arrayList13, false, psdVar, this);
                                                    nm6Var = nm6Var10;
                                                    if (d != nm6Var) {
                                                        i22 = i18;
                                                        lvuVar5 = lvuVar4;
                                                        i23 = i16;
                                                        i24 = i70;
                                                        rj6Var = (rj6) d;
                                                        if (rj6Var instanceof qj6) {
                                                            cmj cmjVar11 = cmjVar4;
                                                            if (!(rj6Var instanceof pj6)) {
                                                                b6e.s();
                                                                return null;
                                                            }
                                                            pj6 pj6Var = (pj6) rj6Var;
                                                            ssg.a(6, str13, "failed to get trackInfoList", pj6Var.a());
                                                            cmjVar11.m.r = pj6Var.a().getMessage();
                                                            pyq pyqVar3 = new pyq("Failed to get trackInfoList");
                                                            cmjVar11.m.q = "Failed to get trackInfoList";
                                                            return pyqVar3;
                                                        }
                                                        List list3 = (List) ((qj6) rj6Var).a;
                                                        ArrayList arrayList14 = new ArrayList();
                                                        Iterator it5 = list3.iterator();
                                                        while (it5.hasNext()) {
                                                            Object next2 = it5.next();
                                                            mqs mqsVar3 = (mqs) next2;
                                                            Iterator it6 = it5;
                                                            if (kvuVar2.b || mqsVar3.i() == null) {
                                                                arrayList14.add(next2);
                                                            }
                                                            it5 = it6;
                                                        }
                                                        cmjVar4.m.g = new Integer(arrayList14.size());
                                                        List list4 = lvuVar5.c;
                                                        ArrayList arrayList15 = new ArrayList();
                                                        Iterator it7 = list4.iterator();
                                                        while (it7.hasNext()) {
                                                            mqs mqsVar4 = ((jja) it7.next()).a;
                                                            if (!gzqVar3.d.contains(mqsVar4.a)) {
                                                                mqsVar4 = null;
                                                            }
                                                            if (mqsVar4 != null) {
                                                                arrayList15.add(mqsVar4);
                                                            }
                                                        }
                                                        ArrayList arrayList16 = new ArrayList(arrayList15);
                                                        if (((czq) dzq.h.getValue()).c) {
                                                            str14 = str3;
                                                            ssg.a(3, str13, hrg.p("irrelevant tracks to delete: count=", arrayList16.size(), str14, CollectionsKt.X(arrayList16, null, null, null, h01.q, 31)), null);
                                                            cmjVar4.m.i = new Integer(0);
                                                            arrayList3 = arrayList16;
                                                        } else {
                                                            str14 = str3;
                                                            arrayList3 = arrayList16;
                                                            ssg.a(3, str13, hrg.p("delete irrelevant tracks: count=", arrayList16.size(), str14, CollectionsKt.X(arrayList16, null, null, null, h01.o, 31)), null);
                                                            if (!arrayList3.isEmpty()) {
                                                                eca ecaVar2 = eca.d;
                                                                ((taa) raaVar).c(new eca(arrayList3, null, null));
                                                            }
                                                            cmjVar4.m.i = new Integer(arrayList3.size());
                                                        }
                                                        ssg.a(3, str13, f1d.e(gzqVar3.c.size(), arrayList14.size(), "start tracks downloading: allTracks=", " tracksToDownload="), null);
                                                        vqn vqnVar7 = new vqn();
                                                        q3tVar4 = q3tVar3;
                                                        vqnVar7.a = ocg.q(q3tVar4.d(css.h));
                                                        vqn vqnVar8 = new vqn();
                                                        cmjVar4.m.h = new Integer(0);
                                                        vqnVar = vqnVar7;
                                                        mm6Var = mm6Var5;
                                                        it2 = arrayList14.iterator();
                                                        int i71 = i24;
                                                        arrayList4 = arrayList3;
                                                        i28 = i17;
                                                        i29 = i71;
                                                        vqnVar2 = vqnVar8;
                                                        i30 = i23;
                                                        i31 = 0;
                                                        if (it2.hasNext()) {
                                                            str15 = str14;
                                                            mqsVar = (mqs) it2.next();
                                                            if (gld.T(mm6Var)) {
                                                                if (z) {
                                                                    q3tVar5 = q3tVar4;
                                                                    ArrayList arrayList17 = arrayList4;
                                                                    i40 = i31;
                                                                    arrayList8 = arrayList17;
                                                                    nm6Var4 = nm6Var;
                                                                    i49 = i28;
                                                                    vqnVar3 = vqnVar2;
                                                                    mm6Var3 = mm6Var;
                                                                    if (vqnVar.a >= i49) {
                                                                    }
                                                                } else {
                                                                    q3tVar5 = q3tVar4;
                                                                    z66 z66Var = cmjVar4.b;
                                                                    cmjVar6 = cmjVar4;
                                                                    mm6 mm6Var6 = mm6Var;
                                                                    this.E = mm6Var6;
                                                                    mm6Var2 = mm6Var6;
                                                                    this.j = null;
                                                                    this.k = null;
                                                                    this.l = null;
                                                                    this.m = null;
                                                                    this.n = null;
                                                                    this.o = null;
                                                                    this.p = null;
                                                                    this.q = null;
                                                                    this.r = arrayList4;
                                                                    this.s = vqnVar;
                                                                    this.t = vqnVar2;
                                                                    this.u = it2;
                                                                    this.v = mqsVar;
                                                                    this.w = j5;
                                                                    this.x = i22;
                                                                    this.y = i28;
                                                                    this.z = i30;
                                                                    this.A = i29;
                                                                    this.B = i31;
                                                                    this.D = 11;
                                                                    obj3 = fxf.H(z66Var, this);
                                                                    if (obj3 != nm6Var) {
                                                                        i34 = i22;
                                                                        i32 = i30;
                                                                        i33 = i28;
                                                                        if (((Boolean) obj3).booleanValue()) {
                                                                            ssg.a(3, str13, "Wi-Fi lost during smart downloading, stopping", null);
                                                                            cmj cmjVar12 = cmjVar6;
                                                                            cmjVar12.m.q = "no connection while downloading";
                                                                            nm6Var6 = nm6Var;
                                                                            cmjVar9 = cmjVar12;
                                                                            i54 = i32;
                                                                            arrayList10 = arrayList4;
                                                                            i53 = i34;
                                                                            if (((czq) dzq.h.getValue()).c && !arrayList10.isEmpty()) {
                                                                                ssg.a(3, str13, hrg.p("delete remaining irrelevant tracks: count=", arrayList10.size(), str15, CollectionsKt.X(arrayList10, null, null, null, h01.p, 31)), null);
                                                                                cmjVar9.m.i = new Integer(arrayList10.size() + i31);
                                                                                eca ecaVar3 = eca.d;
                                                                                ecaVar = new eca(arrayList10, null, null);
                                                                                this.E = null;
                                                                                this.j = null;
                                                                                this.k = null;
                                                                                this.l = null;
                                                                                this.m = null;
                                                                                this.n = null;
                                                                                this.o = null;
                                                                                this.p = null;
                                                                                this.q = null;
                                                                                this.r = null;
                                                                                this.s = null;
                                                                                this.t = null;
                                                                                this.u = null;
                                                                                this.v = null;
                                                                                this.w = j5;
                                                                                this.x = i53;
                                                                                this.y = i33;
                                                                                this.z = i54;
                                                                                this.A = i29;
                                                                                this.B = i31;
                                                                                this.D = 14;
                                                                                if (((taa) raaVar).b(ecaVar, this) == nm6Var6) {
                                                                                    return nm6Var6;
                                                                                }
                                                                            }
                                                                            ssg.a(3, str13, "finish tracks downloading", null);
                                                                            return qyqVar;
                                                                        }
                                                                        cmjVar4 = cmjVar6;
                                                                        ArrayList arrayList18 = arrayList4;
                                                                        i40 = i31;
                                                                        arrayList8 = arrayList18;
                                                                        nm6Var4 = nm6Var;
                                                                        i30 = i32;
                                                                        i49 = i33;
                                                                        i22 = i34;
                                                                        mm6Var3 = mm6Var2;
                                                                        vqnVar3 = vqnVar2;
                                                                        if (vqnVar.a >= i49) {
                                                                            if (((czq) dzq.h.getValue()).c) {
                                                                                arrayList8.getClass();
                                                                                if (arrayList8.isEmpty()) {
                                                                                    i36 = i29;
                                                                                    remove = null;
                                                                                } else {
                                                                                    i36 = i29;
                                                                                    remove = arrayList8.remove(0);
                                                                                }
                                                                                mqs mqsVar5 = (mqs) remove;
                                                                                if (mqsVar5 == null) {
                                                                                    cmjVar4.m.q = "storage is full";
                                                                                    i50 = i49;
                                                                                    cmjVar8 = cmjVar4;
                                                                                    arrayList9 = arrayList8;
                                                                                    i51 = i22;
                                                                                    i52 = i30;
                                                                                    nm6Var6 = nm6Var4;
                                                                                } else {
                                                                                    String str24 = mqsVar5.a;
                                                                                    ArrayList arrayList19 = arrayList8;
                                                                                    String str25 = mqsVar5.c;
                                                                                    int i72 = vqnVar.a;
                                                                                    cmjVar7 = cmjVar4;
                                                                                    int i73 = i30;
                                                                                    str17 = str;
                                                                                    int i74 = i22;
                                                                                    str16 = str2;
                                                                                    StringBuilder m = f1d.m("deleting irrelevant track: id=", str24, str16, str25, str17);
                                                                                    m.append(i72);
                                                                                    m.append(str6);
                                                                                    m.append(i49);
                                                                                    m.append(str5);
                                                                                    ssg.a(3, str13, m.toString(), null);
                                                                                    q3tVar6 = q3tVar5;
                                                                                    vqnVar.a -= ocg.q(q3tVar6.f(new zvs(str24)));
                                                                                    eca ecaVar4 = eca.d;
                                                                                    eca j13 = d51.j(t75.c(mqsVar5));
                                                                                    this.E = mm6Var3;
                                                                                    this.j = null;
                                                                                    this.k = null;
                                                                                    this.l = null;
                                                                                    this.m = null;
                                                                                    this.n = null;
                                                                                    this.o = null;
                                                                                    this.p = null;
                                                                                    this.q = null;
                                                                                    this.r = arrayList19;
                                                                                    this.s = vqnVar;
                                                                                    this.t = vqnVar3;
                                                                                    this.u = it2;
                                                                                    this.v = mqsVar;
                                                                                    this.w = j5;
                                                                                    this.x = i74;
                                                                                    this.y = i49;
                                                                                    i39 = i73;
                                                                                    this.z = i39;
                                                                                    int i75 = i49;
                                                                                    this.A = i36;
                                                                                    this.B = i40;
                                                                                    this.D = 12;
                                                                                    Object b3 = ((taa) raaVar).b(j13, this);
                                                                                    nm6Var3 = nm6Var4;
                                                                                    if (b3 == nm6Var3) {
                                                                                        return nm6Var3;
                                                                                    }
                                                                                    i37 = i40;
                                                                                    i38 = i75;
                                                                                    i35 = i74;
                                                                                    vqnVar4 = vqnVar;
                                                                                    arrayList5 = arrayList19;
                                                                                    int i76 = i37 + 1;
                                                                                    arrayList6 = arrayList5;
                                                                                    int i77 = i39;
                                                                                    cmjVar7.m.i = new Integer(i76);
                                                                                    nm6Var4 = nm6Var3;
                                                                                    q3tVar5 = q3tVar6;
                                                                                    i42 = i38;
                                                                                    vqnVar5 = vqnVar4;
                                                                                    i43 = i77;
                                                                                    i40 = i76;
                                                                                    mqsVar2 = mqsVar;
                                                                                    i41 = i35;
                                                                                    i44 = i36;
                                                                                    mm6Var4 = mm6Var3;
                                                                                    vqn vqnVar9 = vqnVar3;
                                                                                    Iterator it8 = it2;
                                                                                    String str26 = mqsVar2.a;
                                                                                    int i78 = i44;
                                                                                    String str27 = mqsVar2.c;
                                                                                    int i79 = i43;
                                                                                    int i80 = vqnVar5.a;
                                                                                    int i81 = i41;
                                                                                    StringBuilder m2 = f1d.m("downloading track: id=", str26, str16, str27, str17);
                                                                                    m2.append(i80);
                                                                                    m2.append(str6);
                                                                                    m2.append(i42);
                                                                                    str18 = str5;
                                                                                    m2.append(str18);
                                                                                    ssg.a(3, str13, m2.toString(), null);
                                                                                    this.E = mm6Var4;
                                                                                    this.j = null;
                                                                                    this.k = null;
                                                                                    this.l = null;
                                                                                    this.m = null;
                                                                                    this.n = null;
                                                                                    this.o = null;
                                                                                    this.p = null;
                                                                                    this.q = null;
                                                                                    this.r = arrayList6;
                                                                                    this.s = vqnVar5;
                                                                                    this.t = vqnVar9;
                                                                                    this.u = it8;
                                                                                    this.v = mqsVar2;
                                                                                    this.w = j5;
                                                                                    this.x = i81;
                                                                                    this.y = i42;
                                                                                    this.z = i79;
                                                                                    this.A = i78;
                                                                                    this.B = i40;
                                                                                    this.D = 13;
                                                                                    nm6Var5 = nm6Var4;
                                                                                    if (((taa) raaVar).f(mqsVar2, oss.a, this) == nm6Var5) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i50 = i49;
                                                                                cmjVar8 = cmjVar4;
                                                                                arrayList9 = arrayList8;
                                                                                i51 = i22;
                                                                                i36 = i29;
                                                                                i52 = i30;
                                                                                nm6Var6 = nm6Var4;
                                                                                cmjVar8.m.q = "storage is full";
                                                                            }
                                                                            arrayList10 = arrayList9;
                                                                            cmjVar9 = cmjVar8;
                                                                            i53 = i51;
                                                                            i31 = i40;
                                                                            i29 = i36;
                                                                            i33 = i50;
                                                                            i54 = i52;
                                                                            if (((czq) dzq.h.getValue()).c) {
                                                                                ssg.a(3, str13, hrg.p("delete remaining irrelevant tracks: count=", arrayList10.size(), str15, CollectionsKt.X(arrayList10, null, null, null, h01.p, 31)), null);
                                                                                cmjVar9.m.i = new Integer(arrayList10.size() + i31);
                                                                                eca ecaVar32 = eca.d;
                                                                                ecaVar = new eca(arrayList10, null, null);
                                                                                this.E = null;
                                                                                this.j = null;
                                                                                this.k = null;
                                                                                this.l = null;
                                                                                this.m = null;
                                                                                this.n = null;
                                                                                this.o = null;
                                                                                this.p = null;
                                                                                this.q = null;
                                                                                this.r = null;
                                                                                this.s = null;
                                                                                this.t = null;
                                                                                this.u = null;
                                                                                this.v = null;
                                                                                this.w = j5;
                                                                                this.x = i53;
                                                                                this.y = i33;
                                                                                this.z = i54;
                                                                                this.A = i29;
                                                                                this.B = i31;
                                                                                this.D = 14;
                                                                                if (((taa) raaVar).b(ecaVar, this) == nm6Var6) {
                                                                                }
                                                                            }
                                                                            ssg.a(3, str13, "finish tracks downloading", null);
                                                                            return qyqVar;
                                                                        }
                                                                        int i82 = i49;
                                                                        arrayList6 = arrayList8;
                                                                        int i83 = i22;
                                                                        int i84 = i29;
                                                                        int i85 = i30;
                                                                        str17 = str;
                                                                        str16 = str2;
                                                                        vqnVar5 = vqnVar;
                                                                        mqsVar2 = mqsVar;
                                                                        i41 = i83;
                                                                        cmjVar7 = cmjVar4;
                                                                        i42 = i82;
                                                                        i43 = i85;
                                                                        mm6Var4 = mm6Var3;
                                                                        i44 = i84;
                                                                        vqn vqnVar92 = vqnVar3;
                                                                        Iterator it82 = it2;
                                                                        String str262 = mqsVar2.a;
                                                                        int i782 = i44;
                                                                        String str272 = mqsVar2.c;
                                                                        int i792 = i43;
                                                                        int i802 = vqnVar5.a;
                                                                        int i812 = i41;
                                                                        StringBuilder m22 = f1d.m("downloading track: id=", str262, str16, str272, str17);
                                                                        m22.append(i802);
                                                                        m22.append(str6);
                                                                        m22.append(i42);
                                                                        str18 = str5;
                                                                        m22.append(str18);
                                                                        ssg.a(3, str13, m22.toString(), null);
                                                                        this.E = mm6Var4;
                                                                        this.j = null;
                                                                        this.k = null;
                                                                        this.l = null;
                                                                        this.m = null;
                                                                        this.n = null;
                                                                        this.o = null;
                                                                        this.p = null;
                                                                        this.q = null;
                                                                        this.r = arrayList6;
                                                                        this.s = vqnVar5;
                                                                        this.t = vqnVar92;
                                                                        this.u = it82;
                                                                        this.v = mqsVar2;
                                                                        this.w = j5;
                                                                        this.x = i812;
                                                                        this.y = i42;
                                                                        this.z = i792;
                                                                        this.A = i782;
                                                                        this.B = i40;
                                                                        this.D = 13;
                                                                        nm6Var5 = nm6Var4;
                                                                        if (((taa) raaVar).f(mqsVar2, oss.a, this) == nm6Var5) {
                                                                            return nm6Var5;
                                                                        }
                                                                        i28 = i42;
                                                                        vqnVar6 = vqnVar92;
                                                                        it2 = it82;
                                                                        i45 = i782;
                                                                        arrayList7 = arrayList6;
                                                                        vqnVar = vqnVar5;
                                                                        i46 = i40;
                                                                        i47 = i792;
                                                                        i48 = i812;
                                                                        vqnVar.a = ocg.q(q3tVar5.f(new zvs(mqsVar2.a))) + vqnVar.a;
                                                                        int i86 = vqnVar6.a + 1;
                                                                        vqnVar6.a = i86;
                                                                        vqn vqnVar10 = vqnVar6;
                                                                        cmj cmjVar13 = cmjVar7;
                                                                        syq syqVar3 = cmjVar13.m;
                                                                        syqVar3.h = new Integer(i86);
                                                                        syqVar3.n = new Integer(vqnVar.a);
                                                                        nm6 nm6Var11 = nm6Var5;
                                                                        cmjVar4 = cmjVar13;
                                                                        nm6Var = nm6Var11;
                                                                        i31 = i46;
                                                                        str5 = str18;
                                                                        mm6Var = mm6Var4;
                                                                        vqnVar2 = vqnVar10;
                                                                        i29 = i45;
                                                                        str14 = str15;
                                                                        q3tVar4 = q3tVar5;
                                                                        str2 = str16;
                                                                        str = str17;
                                                                        i30 = i47;
                                                                        arrayList4 = arrayList7;
                                                                        i22 = i48;
                                                                        if (it2.hasNext()) {
                                                                            str15 = str14;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        cmj cmjVar14 = cmjVar4;
                                                        nm6Var6 = nm6Var;
                                                        cmjVar9 = cmjVar14;
                                                        int i87 = i22;
                                                        i54 = i30;
                                                        i33 = i28;
                                                        arrayList10 = arrayList4;
                                                        i53 = i87;
                                                        i29 = i29;
                                                        if (((czq) dzq.h.getValue()).c) {
                                                        }
                                                        ssg.a(3, str13, "finish tracks downloading", null);
                                                        return qyqVar;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        j5 = j4;
                                        i12 = i15;
                                        i5 = i14;
                                        q = i8;
                                        gzqVar3 = gzqVar5;
                                        lvuVar = lvuVar3;
                                        gzqVar7 = gzqVar3;
                                        if (gzqVar3 != null) {
                                        }
                                    }
                                } else {
                                    gzqVar5 = gzqVar4;
                                    lvuVar3 = lvuVar2;
                                    str3 = str10;
                                    i13 = i11;
                                    str7 = str19;
                                    nm6Var2 = nm6Var;
                                    j5 = j4;
                                    i5 = i10;
                                    i12 = i9;
                                    q = i8;
                                    gzqVar3 = gzqVar5;
                                    lvuVar = lvuVar3;
                                    gzqVar7 = gzqVar3;
                                    if (gzqVar3 != null) {
                                    }
                                }
                            }
                            return nm6Var;
                        }
                        ssg.a(3, str7, "fetchTracksForSmartDownloading: skip, tracks is up to date", null);
                        i12 = i6;
                        cmjVar10 = cmjVar10;
                        nm6Var2 = nm6Var7;
                        j5 = j3;
                        i13 = i7;
                        gzqVar7 = gzqVar3;
                        if (gzqVar3 != null) {
                        }
                    }
                }
                return nm6Var7;
            case 5:
                str = " [occupiedMb=";
                i2 = this.x;
                long j14 = this.w;
                lvu lvuVar9 = this.m;
                kvu kvuVar3 = this.l;
                String str28 = this.k;
                gzqVar2 = this.j;
                qgg.h0(obj);
                kvuVar = kvuVar3;
                str8 = str28;
                hzqVar = hzqVar2;
                a = lvuVar9;
                z = z2;
                raaVar = raaVar2;
                q3tVar = q3tVar7;
                str7 = "OfflineRecommenderSmartDownloadCenter";
                str5 = "]";
                str6 = " totalMb=";
                a2 = obj;
                j2 = j14;
                str2 = ", name=";
                str3 = " tracks=";
                long j112 = j2;
                int intValue2 = ((Number) a2).intValue();
                q3tVar2 = q3tVar;
                int q22 = ocg.q(q3tVar2.d(css.h));
                bca b22 = cmjVar10.k.b();
                this.E = mm6Var5;
                this.j = gzqVar2;
                this.k = str8;
                this.l = kvuVar;
                this.m = a;
                this.w = j112;
                this.x = i2;
                this.y = intValue2;
                this.z = q22;
                this.D = 6;
                g02 = zsd.g0(b22, this);
                if (g02 != nm6Var7) {
                }
                return nm6Var7;
            case 6:
                str = " [occupiedMb=";
                int i88 = this.z;
                int i89 = this.y;
                int i90 = this.x;
                long j15 = this.w;
                lvu lvuVar10 = this.m;
                kvu kvuVar4 = this.l;
                String str29 = this.k;
                gzq gzqVar12 = this.j;
                qgg.h0(obj);
                kvuVar2 = kvuVar4;
                i3 = i89;
                str3 = " tracks=";
                i5 = i90;
                str9 = str29;
                str6 = " totalMb=";
                str2 = ", name=";
                i4 = i88;
                str7 = "OfflineRecommenderSmartDownloadCenter";
                str5 = "]";
                g02 = obj;
                q3tVar2 = q3tVar7;
                gzqVar3 = gzqVar12;
                lvuVar = lvuVar10;
                raaVar = raaVar2;
                j3 = j15;
                z = z2;
                hzqVar = hzqVar2;
                q = ocg.q(((Number) g02).longValue());
                String T2 = vnj.T(cmjVar10.l.a());
                q3tVar3 = q3tVar2;
                syq syqVar4 = cmjVar10.m;
                syqVar4.j = new Integer(lvuVar.a.size());
                syqVar4.k = new Integer(lvuVar.b.size());
                syqVar4.l = new Integer(lvuVar.c.size());
                syqVar4.m = new Integer(i3);
                syqVar4.n = new Integer(i4);
                syqVar4.o = new Integer(q);
                syqVar4.p = T2;
                i6 = i3;
                if (gzqVar3 == null) {
                }
                syqVar4.e = l;
                if (i5 == 0) {
                    break;
                }
                str19 = str7;
                this.E = mm6Var5;
                this.j = gzqVar3;
                this.k = str9;
                this.l = kvuVar2;
                this.m = lvuVar;
                this.w = j3;
                this.x = i5;
                this.y = i6;
                int i602 = i7;
                this.z = i602;
                this.A = q;
                this.D = 7;
                int i612 = i5;
                gzq gzqVar102 = gzqVar3;
                String str212 = str;
                String str222 = str2;
                cmjVar10 = cmjVar10;
                long j122 = j3;
                str10 = str3;
                a3 = cmj.a(cmjVar10, lvuVar, i6, i602, q, T2, this);
                lvu lvuVar72 = lvuVar;
                nm6Var = nm6Var7;
                if (a3 != nm6Var) {
                }
                return nm6Var;
            case 7:
                str = " [occupiedMb=";
                int i91 = this.A;
                int i92 = this.z;
                i9 = this.y;
                int i93 = this.x;
                long j16 = this.w;
                lvu lvuVar11 = this.m;
                kvu kvuVar5 = this.l;
                String str30 = this.k;
                gzq gzqVar13 = this.j;
                qgg.h0(obj);
                q3tVar3 = q3tVar7;
                i8 = i91;
                str11 = str30;
                str2 = ", name=";
                str5 = "]";
                lvuVar2 = lvuVar11;
                str6 = " totalMb=";
                kvuVar2 = kvuVar5;
                gzqVar4 = gzqVar13;
                nm6Var = nm6Var7;
                i11 = i92;
                str10 = " tracks=";
                z = z2;
                j4 = j16;
                hzqVar = hzqVar2;
                raaVar = raaVar2;
                i10 = i93;
                ozqVar = (ozq) obj;
                if (ozqVar == null) {
                }
                break;
            case 8:
                str = " [occupiedMb=";
                int i94 = this.A;
                int i95 = this.z;
                i15 = this.y;
                i14 = this.x;
                long j17 = this.w;
                cmj cmjVar15 = this.p;
                gzqVar6 = this.o;
                ozq ozqVar2 = (ozq) this.n;
                lvu lvuVar12 = this.m;
                kvu kvuVar6 = this.l;
                gzq gzqVar14 = this.j;
                qgg.h0(obj);
                q3tVar3 = q3tVar7;
                i8 = i94;
                lvuVar3 = lvuVar12;
                str2 = ", name=";
                nm6Var2 = nm6Var7;
                str5 = "]";
                ozqVar = ozqVar2;
                str6 = " totalMb=";
                kvuVar2 = kvuVar6;
                str7 = "OfflineRecommenderSmartDownloadCenter";
                gzqVar5 = gzqVar14;
                z = z2;
                cmjVar = cmjVar15;
                raaVar = raaVar2;
                i13 = i95;
                str3 = " tracks=";
                j4 = j17;
                cmjVar.m.a = ozqVar.c;
                if (gzqVar6 == null) {
                }
                break;
            case 9:
                str = " [occupiedMb=";
                int i96 = this.C;
                int i97 = this.B;
                int i98 = this.A;
                int i99 = this.z;
                int i100 = this.y;
                i26 = this.x;
                long j18 = this.w;
                Object obj4 = this.t;
                Iterator it9 = (Iterator) this.s;
                Collection collection = this.r;
                cmj cmjVar16 = this.q;
                gzq gzqVar15 = (gzq) this.n;
                lvu lvuVar13 = this.m;
                kvu kvuVar7 = this.l;
                qgg.h0(obj);
                i25 = i97;
                cmjVar5 = cmjVar16;
                z = z2;
                q3tVar3 = q3tVar7;
                i16 = i99;
                i20 = i96;
                it = it9;
                str2 = ", name=";
                obj2 = obj4;
                arrayList2 = collection;
                str12 = "OfflineRecommenderSmartDownloadCenter";
                str5 = "]";
                i17 = i100;
                str3 = " tracks=";
                i19 = i98;
                gzqVar3 = gzqVar15;
                cmjVar2 = cmjVar10;
                V = obj;
                kvuVar2 = kvuVar7;
                nm6Var = nm6Var7;
                j5 = j18;
                raaVar = raaVar2;
                str6 = " totalMb=";
                lvuVar4 = lvuVar13;
                issVar = (iss) V;
                if (issVar == null) {
                    break;
                }
                i27 = i19;
                arrayList2.add(obj2);
                i19 = i27;
                nm6Var2 = nm6Var;
                arrayList = arrayList2;
                i18 = i26;
                cmjVar3 = cmjVar5;
                i21 = i25;
                if (it.hasNext()) {
                }
                return nm6Var;
            case 10:
                str = " [occupiedMb=";
                int i101 = this.A;
                int i102 = this.z;
                int i103 = this.y;
                i22 = this.x;
                i24 = i101;
                i23 = i102;
                long j19 = this.w;
                gzq gzqVar16 = (gzq) this.n;
                lvuVar5 = this.m;
                kvu kvuVar8 = this.l;
                qgg.h0(obj);
                raaVar = raaVar2;
                q3tVar3 = q3tVar7;
                str5 = "]";
                str6 = " totalMb=";
                kvuVar2 = kvuVar8;
                i17 = i103;
                nm6Var = nm6Var7;
                gzqVar3 = gzqVar16;
                z = z2;
                d = obj;
                cmjVar4 = cmjVar10;
                str13 = "OfflineRecommenderSmartDownloadCenter";
                j5 = j19;
                str2 = ", name=";
                str3 = " tracks=";
                rj6Var = (rj6) d;
                if (rj6Var instanceof qj6) {
                }
                break;
            case 11:
                str = " [occupiedMb=";
                int i104 = this.B;
                int i105 = this.A;
                i32 = this.z;
                i33 = this.y;
                i34 = this.x;
                long j20 = this.w;
                mqs mqsVar6 = this.v;
                Iterator it10 = this.u;
                vqn vqnVar11 = (vqn) this.t;
                vqn vqnVar12 = (vqn) this.s;
                ?? r1 = (List) this.r;
                qgg.h0(obj);
                cmjVar6 = cmjVar10;
                q3tVar5 = q3tVar7;
                nm6Var = nm6Var7;
                str13 = "OfflineRecommenderSmartDownloadCenter";
                str5 = "]";
                i29 = i105;
                j5 = j20;
                mqsVar = mqsVar6;
                str2 = ", name=";
                str15 = " tracks=";
                z = z2;
                mm6Var2 = mm6Var5;
                i31 = i104;
                vqnVar2 = vqnVar11;
                arrayList4 = r1;
                obj3 = obj;
                it2 = it10;
                str6 = " totalMb=";
                vqnVar = vqnVar12;
                raaVar = raaVar2;
                if (((Boolean) obj3).booleanValue()) {
                }
                break;
            case 12:
                int i106 = this.B;
                int i107 = this.A;
                int i108 = this.z;
                int i109 = this.y;
                i35 = this.x;
                i36 = i107;
                long j21 = this.w;
                mqs mqsVar7 = this.v;
                Iterator it11 = this.u;
                vqn vqnVar13 = (vqn) this.t;
                vqn vqnVar14 = (vqn) this.s;
                ?? r12 = (List) this.r;
                qgg.h0(obj);
                cmjVar7 = cmjVar10;
                str13 = "OfflineRecommenderSmartDownloadCenter";
                str5 = "]";
                i37 = i106;
                q3tVar6 = q3tVar7;
                i38 = i109;
                mqsVar = mqsVar7;
                str16 = ", name=";
                z = z2;
                i39 = i108;
                nm6Var3 = nm6Var7;
                j5 = j21;
                vqnVar3 = vqnVar13;
                str15 = " tracks=";
                vqnVar4 = vqnVar14;
                raaVar = raaVar2;
                mm6Var3 = mm6Var5;
                it2 = it11;
                arrayList5 = r12;
                str6 = " totalMb=";
                str17 = " [occupiedMb=";
                int i762 = i37 + 1;
                arrayList6 = arrayList5;
                int i772 = i39;
                cmjVar7.m.i = new Integer(i762);
                nm6Var4 = nm6Var3;
                q3tVar5 = q3tVar6;
                i42 = i38;
                vqnVar5 = vqnVar4;
                i43 = i772;
                i40 = i762;
                mqsVar2 = mqsVar;
                i41 = i35;
                i44 = i36;
                mm6Var4 = mm6Var3;
                vqn vqnVar922 = vqnVar3;
                Iterator it822 = it2;
                String str2622 = mqsVar2.a;
                int i7822 = i44;
                String str2722 = mqsVar2.c;
                int i7922 = i43;
                int i8022 = vqnVar5.a;
                int i8122 = i41;
                StringBuilder m222 = f1d.m("downloading track: id=", str2622, str16, str2722, str17);
                m222.append(i8022);
                m222.append(str6);
                m222.append(i42);
                str18 = str5;
                m222.append(str18);
                ssg.a(3, str13, m222.toString(), null);
                this.E = mm6Var4;
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = arrayList6;
                this.s = vqnVar5;
                this.t = vqnVar922;
                this.u = it822;
                this.v = mqsVar2;
                this.w = j5;
                this.x = i8122;
                this.y = i42;
                this.z = i7922;
                this.A = i7822;
                this.B = i40;
                this.D = 13;
                nm6Var5 = nm6Var4;
                if (((taa) raaVar).f(mqsVar2, oss.a, this) == nm6Var5) {
                }
                break;
            case 13:
                int i110 = this.B;
                i45 = this.A;
                int i111 = this.z;
                int i112 = this.y;
                i48 = this.x;
                long j22 = this.w;
                mqs mqsVar8 = this.v;
                Iterator it12 = this.u;
                vqn vqnVar15 = (vqn) this.t;
                vqn vqnVar16 = (vqn) this.s;
                ?? r13 = (List) this.r;
                qgg.h0(obj);
                cmjVar7 = cmjVar10;
                q3tVar5 = q3tVar7;
                str13 = "OfflineRecommenderSmartDownloadCenter";
                str18 = "]";
                i46 = i110;
                mqsVar2 = mqsVar8;
                z = z2;
                mm6Var4 = mm6Var5;
                i47 = i111;
                vqnVar6 = vqnVar15;
                it2 = it12;
                str16 = ", name=";
                nm6Var5 = nm6Var7;
                j5 = j22;
                vqnVar = vqnVar16;
                str15 = " tracks=";
                raaVar = raaVar2;
                i28 = i112;
                arrayList7 = r13;
                str6 = " totalMb=";
                str17 = " [occupiedMb=";
                vqnVar.a = ocg.q(q3tVar5.f(new zvs(mqsVar2.a))) + vqnVar.a;
                int i862 = vqnVar6.a + 1;
                vqnVar6.a = i862;
                vqn vqnVar102 = vqnVar6;
                cmj cmjVar132 = cmjVar7;
                syq syqVar32 = cmjVar132.m;
                syqVar32.h = new Integer(i862);
                syqVar32.n = new Integer(vqnVar.a);
                nm6 nm6Var112 = nm6Var5;
                cmjVar4 = cmjVar132;
                nm6Var = nm6Var112;
                i31 = i46;
                str5 = str18;
                mm6Var = mm6Var4;
                vqnVar2 = vqnVar102;
                i29 = i45;
                str14 = str15;
                q3tVar4 = q3tVar5;
                str2 = str16;
                str = str17;
                i30 = i47;
                arrayList4 = arrayList7;
                i22 = i48;
                if (it2.hasNext()) {
                }
                cmj cmjVar142 = cmjVar4;
                nm6Var6 = nm6Var;
                cmjVar9 = cmjVar142;
                int i872 = i22;
                i54 = i30;
                i33 = i28;
                arrayList10 = arrayList4;
                i53 = i872;
                i29 = i29;
                if (((czq) dzq.h.getValue()).c) {
                }
                ssg.a(3, str13, "finish tracks downloading", null);
                return qyqVar;
            case 14:
                qgg.h0(obj);
                str13 = "OfflineRecommenderSmartDownloadCenter";
                ssg.a(3, str13, "finish tracks downloading", null);
                return qyqVar;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
