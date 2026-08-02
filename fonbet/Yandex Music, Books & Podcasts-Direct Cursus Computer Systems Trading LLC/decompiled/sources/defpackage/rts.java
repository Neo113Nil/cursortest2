package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class rts extends aur implements Function2 {
    public final /* synthetic */ zvs A;
    public final /* synthetic */ vzg B;
    public final /* synthetic */ gy1 C;
    public final /* synthetic */ String D;
    public final /* synthetic */ be6 E;
    public final /* synthetic */ qbo F;
    public ots j;
    public uts k;
    public Object l;
    public be6 m;
    public zvs n;
    public qbo o;
    public Object p;
    public iss q;
    public String r;
    public iss s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public final /* synthetic */ uts z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rts(uts utsVar, zvs zvsVar, vzg vzgVar, gy1 gy1Var, String str, be6 be6Var, qbo qboVar, Continuation continuation) {
        super(2, continuation);
        this.z = utsVar;
        this.A = zvsVar;
        this.B = vzgVar;
        this.C = gy1Var;
        this.D = str;
        this.E = be6Var;
        this.F = qboVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new rts(this.z, this.A, this.B, this.C, this.D, this.E, this.F, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rts) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02a1 A[Catch: all -> 0x02b5, TryCatch #0 {all -> 0x02b5, blocks: (B:12:0x032f, B:31:0x029d, B:33:0x02a1, B:34:0x02b9, B:36:0x02bd, B:42:0x02fa, B:44:0x02fe, B:48:0x033a, B:50:0x0340, B:52:0x035b, B:53:0x0360), top: B:30:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b9 A[Catch: all -> 0x02b5, TryCatch #0 {all -> 0x02b5, blocks: (B:12:0x032f, B:31:0x029d, B:33:0x02a1, B:34:0x02b9, B:36:0x02bd, B:42:0x02fa, B:44:0x02fe, B:48:0x033a, B:50:0x0340, B:52:0x035b, B:53:0x0360), top: B:30:0x029d }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [nm6] */
    /* JADX WARN: Type inference failed for: r3v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zvs zvsVar;
        be6 be6Var;
        qbo qboVar;
        ots otsVar;
        String str;
        oqi oqiVar;
        int i;
        int i2;
        Object putIfAbsent;
        String a;
        kts h;
        Object obj2;
        iss issVar;
        int i3;
        String str2;
        int i4;
        uts utsVar;
        oqi oqiVar2;
        be6 be6Var2;
        int i5;
        String str3;
        zvs zvsVar2;
        int i6;
        qbo qboVar2;
        int i7;
        Object g;
        be6 be6Var3;
        iss issVar2;
        int i8;
        int i9;
        ots otsVar2;
        int i10;
        Object a2;
        uts utsVar2;
        String str4;
        fts ftsVar;
        Object obj3;
        iss issVar3;
        Object a3;
        uts utsVar3;
        Object a4;
        oqi oqiVar3;
        ots otsVar3;
        uts utsVar4 = this.z;
        uhr uhrVar = utsVar4.e;
        ?? r3 = nm6.a;
        int i11 = this.y;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i11 == 0) {
                qgg.h0(obj);
                List a5 = uhrVar.a();
                xqn xqnVar = new xqn();
                thr c = uhrVar.c();
                xqnVar.a = c;
                if (!a5.contains(c)) {
                    ssg.a(7, "TrackContentSourcesStage", "selected storage " + xqnVar.a + " is not available (available=" + CollectionsKt.X(a5, StringUtils.COMMA, null, null, null, 62) + ")", null);
                    thr thrVar = (thr) CollectionsKt.firstOrNull(a5);
                    if (thrVar == null) {
                        thrVar = thr.c;
                    }
                    xqnVar.a = thrVar;
                }
                ots otsVar4 = new ots(this.A, utsVar4.f.a(), (thr) xqnVar.a, a5, this.B, this.C);
                ssg.a(4, "TrackContentSourcesStage", "fetching for " + otsVar4, null);
                ConcurrentHashMap concurrentHashMap = utsVar4.d.a;
                zvs zvsVar3 = this.A;
                Object obj4 = concurrentHashMap.get(zvsVar3);
                if (obj4 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(zvsVar3, (obj4 = new eys()))) != null) {
                    obj4 = putIfAbsent;
                }
                eys eysVar = (eys) obj4;
                this.j = otsVar4;
                this.k = utsVar4;
                String str5 = this.D;
                this.l = str5;
                be6 be6Var4 = this.E;
                this.m = be6Var4;
                this.n = zvsVar3;
                qbo qboVar3 = this.F;
                this.o = qboVar3;
                this.p = eysVar;
                this.q = null;
                this.t = 0;
                this.u = 0;
                this.y = 1;
                obj3 = r3;
                if (eysVar.a.a(this) != r3) {
                    zvsVar = zvsVar3;
                    be6Var = be6Var4;
                    qboVar = qboVar3;
                    otsVar = otsVar4;
                    str = str5;
                    oqiVar = eysVar;
                    i = 0;
                    i2 = 0;
                }
                return obj3;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    str4 = (String) this.p;
                    oqi oqiVar4 = (oqi) this.l;
                    uts utsVar5 = this.k;
                    ots otsVar5 = this.j;
                    qgg.h0(obj);
                    otsVar = otsVar5;
                    oqiVar = oqiVar4;
                    utsVar2 = utsVar5;
                    a2 = obj;
                    uts.d(utsVar2, str4, (fts) a2, otsVar);
                    ftsVar = (fts) a2;
                    oqiVar.b(null);
                    return ftsVar;
                }
                if (i11 != 3) {
                    if (i11 == 4) {
                        String str6 = (String) this.p;
                        oqiVar3 = (oqi) this.l;
                        uts utsVar6 = this.k;
                        otsVar3 = this.j;
                        qgg.h0(obj);
                        utsVar = utsVar6;
                        str3 = str6;
                        a4 = obj;
                        uts.d(utsVar, str3, (fts) a4, otsVar3);
                        ftsVar = (fts) a4;
                        oqiVar = oqiVar3;
                        oqiVar.b(null);
                        return ftsVar;
                    }
                    if (i11 != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    issVar3 = this.q;
                    str3 = (String) this.p;
                    oqi oqiVar5 = (oqi) this.l;
                    utsVar3 = this.k;
                    qgg.h0(obj);
                    oqiVar2 = oqiVar5;
                    a3 = obj;
                    uts.i(utsVar3, str3, (fts) a3, issVar3);
                    ftsVar = (fts) a3;
                    oqiVar = oqiVar2;
                    oqiVar.b(null);
                    return ftsVar;
                }
                int i12 = this.x;
                i9 = this.w;
                int i13 = this.v;
                int i14 = this.u;
                i8 = this.t;
                issVar2 = this.s;
                String str7 = this.r;
                oqi oqiVar6 = (oqi) this.p;
                qbo qboVar4 = this.o;
                zvs zvsVar4 = this.n;
                be6 be6Var5 = this.m;
                str = (String) this.l;
                utsVar = this.k;
                ots otsVar6 = this.j;
                try {
                    qgg.h0(obj);
                    be6Var3 = be6Var5;
                    zvsVar2 = zvsVar4;
                    qboVar2 = qboVar4;
                    otsVar2 = otsVar6;
                    i10 = i12;
                    i3 = i13;
                    i = i14;
                    oqiVar = oqiVar6;
                    a = str7;
                    g = obj;
                    h = (kts) g;
                    String str8 = a;
                    i6 = i9;
                    be6Var2 = be6Var3;
                    issVar = issVar2;
                    i4 = i8;
                    str2 = str;
                    oqiVar2 = oqiVar;
                    i5 = i;
                    str3 = str8;
                    ots otsVar7 = otsVar2;
                    i7 = i10;
                    otsVar = otsVar7;
                    obj2 = r3;
                    try {
                        if (!(h instanceof hts)) {
                            uts.e(utsVar, new Integer(((hts) h).b), str2, be6Var2, zvsVar2);
                            ftsVar = ((hts) h).a;
                        } else {
                            if (h instanceof gts) {
                                uts.e(utsVar, null, str2, be6Var2, zvsVar2);
                                this.j = otsVar;
                                this.k = utsVar;
                                this.l = oqiVar2;
                                this.m = null;
                                this.n = null;
                                this.o = null;
                                this.p = str3;
                                this.q = null;
                                this.r = null;
                                this.s = null;
                                this.t = i4;
                                this.u = i5;
                                this.v = i3;
                                this.w = i6;
                                this.x = i7;
                                this.y = 4;
                                a4 = uts.a(utsVar, qboVar2, otsVar, this);
                                Object obj5 = obj2;
                                obj3 = obj5;
                                if (a4 != obj5) {
                                    oqiVar3 = oqiVar2;
                                    otsVar3 = otsVar;
                                    uts.d(utsVar, str3, (fts) a4, otsVar3);
                                    ftsVar = (fts) a4;
                                    oqiVar = oqiVar3;
                                    oqiVar.b(null);
                                    return ftsVar;
                                }
                                return obj3;
                            }
                            if (h instanceof jts) {
                                uts.e(utsVar, null, str2, be6Var2, zvsVar2);
                                this.j = null;
                                this.k = utsVar;
                                this.l = oqiVar2;
                                this.m = null;
                                this.n = null;
                                this.o = null;
                                this.p = str3;
                                issVar3 = issVar;
                                this.q = issVar3;
                                this.r = null;
                                this.s = null;
                                this.t = i4;
                                this.u = i5;
                                this.v = i3;
                                this.w = i6;
                                this.x = i7;
                                this.y = 5;
                                a3 = uts.a(utsVar, qboVar2, otsVar, this);
                                Object obj6 = obj2;
                                if (a3 == obj6) {
                                    return obj6;
                                }
                                utsVar3 = utsVar;
                                uts.i(utsVar3, str3, (fts) a3, issVar3);
                                ftsVar = (fts) a3;
                            } else {
                                iss issVar4 = issVar;
                                if (!(h instanceof its)) {
                                    throw new x7j();
                                }
                                uts.e(utsVar, new Integer(((its) h).b), str2, be6Var2, zvsVar2);
                                fts ftsVar2 = ((its) h).a;
                                uts.i(utsVar, str3, ftsVar2, issVar4);
                                ftsVar = ftsVar2;
                            }
                        }
                        oqiVar = oqiVar2;
                        oqiVar.b(null);
                        return ftsVar;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = oqiVar2;
                        r3.b(null);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r3 = oqiVar6;
                    r3.b(null);
                    throw th;
                }
            }
            int i15 = this.u;
            int i16 = this.t;
            oqiVar = (oqi) this.p;
            qbo qboVar5 = this.o;
            zvs zvsVar5 = this.n;
            be6 be6Var6 = this.m;
            String str9 = (String) this.l;
            uts utsVar7 = this.k;
            ots otsVar8 = this.j;
            qgg.h0(obj);
            be6Var = be6Var6;
            otsVar = otsVar8;
            zvsVar = zvsVar5;
            i2 = i16;
            i = i15;
            utsVar4 = utsVar7;
            qboVar = qboVar5;
            str = str9;
            a = utsVar4.i.a();
            a.getClass();
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            iss c2 = uts.c(utsVar4, a, otsVar);
            if (c2 != null) {
                int ordinal = c2.d.ordinal();
                if (ordinal == 0) {
                    h = uts.h(utsVar4, c2, otsVar);
                    obj2 = r3;
                    issVar = c2;
                    i3 = 0;
                    str2 = str;
                    i4 = i2;
                    utsVar = utsVar4;
                    oqiVar2 = oqiVar;
                    be6Var2 = be6Var;
                    i5 = i;
                    str3 = a;
                    zvsVar2 = zvsVar;
                    i6 = 0;
                    qboVar2 = qboVar;
                    i7 = 0;
                } else if (ordinal == 1) {
                    this.j = otsVar;
                    this.k = utsVar4;
                    this.l = str;
                    this.m = be6Var;
                    this.n = zvsVar;
                    this.o = qboVar;
                    this.p = oqiVar;
                    this.q = null;
                    this.r = a;
                    this.s = c2;
                    this.t = i2;
                    this.u = i;
                    this.v = 0;
                    this.w = 0;
                    this.x = 0;
                    this.y = 3;
                    g = uts.g(utsVar4, a, c2, otsVar, this);
                    if (g == r3) {
                        obj3 = r3;
                    } else {
                        i3 = 0;
                        be6Var3 = be6Var;
                        issVar2 = c2;
                        i8 = i2;
                        zvsVar2 = zvsVar;
                        utsVar = utsVar4;
                        i9 = 0;
                        qboVar2 = qboVar;
                        otsVar2 = otsVar;
                        i10 = 0;
                        h = (kts) g;
                        String str82 = a;
                        i6 = i9;
                        be6Var2 = be6Var3;
                        issVar = issVar2;
                        i4 = i8;
                        str2 = str;
                        oqiVar2 = oqiVar;
                        i5 = i;
                        str3 = str82;
                        ots otsVar72 = otsVar2;
                        i7 = i10;
                        otsVar = otsVar72;
                        obj2 = r3;
                    }
                } else {
                    if (ordinal != 2) {
                        throw new x7j();
                    }
                    obj2 = r3;
                    issVar = c2;
                    h = uts.f(utsVar4, a, c2, otsVar);
                    i3 = 0;
                    str2 = str;
                    i4 = i2;
                    utsVar = utsVar4;
                    oqiVar2 = oqiVar;
                    be6Var2 = be6Var;
                    i5 = i;
                    str3 = a;
                    zvsVar2 = zvsVar;
                    i6 = 0;
                    qboVar2 = qboVar;
                    i7 = 0;
                }
                if (!(h instanceof hts)) {
                }
                oqiVar = oqiVar2;
                oqiVar.b(null);
                return ftsVar;
            }
            uts.e(utsVar4, null, str, be6Var, zvsVar);
            this.j = otsVar;
            this.k = utsVar4;
            this.l = oqiVar;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = a;
            this.q = null;
            this.t = i2;
            this.u = i;
            this.v = 0;
            this.w = 0;
            this.x = 0;
            this.y = 2;
            a2 = uts.a(utsVar4, qboVar, otsVar, this);
            if (a2 != r3) {
                utsVar2 = utsVar4;
                str4 = a;
                uts.d(utsVar2, str4, (fts) a2, otsVar);
                ftsVar = (fts) a2;
                oqiVar.b(null);
                return ftsVar;
            }
            obj3 = r3;
            return obj3;
        } catch (Throwable th4) {
            th = th4;
            r3 = oqiVar;
            r3.b(null);
            throw th;
        }
    }
}
