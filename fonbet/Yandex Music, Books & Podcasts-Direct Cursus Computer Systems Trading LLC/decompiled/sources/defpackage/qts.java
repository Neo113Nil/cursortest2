package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class qts extends aur implements Function2 {
    public ots j;
    public uts k;
    public Object l;
    public Object m;
    public zvs n;
    public eys o;
    public String p;
    public Object q;
    public int r;
    public int s;
    public int t;
    public final /* synthetic */ zvs u;
    public final /* synthetic */ thr v;
    public final /* synthetic */ uts w;
    public final /* synthetic */ vzg x;
    public final /* synthetic */ gy1 y;
    public final /* synthetic */ qbo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qts(zvs zvsVar, thr thrVar, uts utsVar, vzg vzgVar, gy1 gy1Var, qbo qboVar, Continuation continuation) {
        super(2, continuation);
        this.u = zvsVar;
        this.v = thrVar;
        this.w = utsVar;
        this.x = vzgVar;
        this.y = gy1Var;
        this.z = qboVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new qts(this.u, this.v, this.w, this.x, this.y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qts) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:9:0x0031, B:11:0x01e8, B:19:0x005e, B:21:0x01bb, B:23:0x007f, B:25:0x0166, B:27:0x016d, B:28:0x0170), top: B:2:0x000f }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, nm6] */
    /* JADX WARN: Type inference failed for: r3v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v11, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v13, types: [oqi] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21, types: [oqi] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uts utsVar;
        gy1 gy1Var;
        zvs zvsVar;
        eys eysVar;
        qbo qboVar;
        int i;
        ots otsVar;
        int i2;
        Object putIfAbsent;
        String a;
        iss c;
        fts ftsVar;
        Object a2;
        String str;
        eys eysVar2;
        Object a3;
        uts utsVar2;
        eys eysVar3;
        ots otsVar2;
        Object a4;
        gy1 gy1Var2;
        eys eysVar4;
        eys eysVar5;
        ?? r3 = nm6.a;
        int i3 = this.t;
        try {
            try {
                if (i3 == 0) {
                    qgg.h0(obj);
                    o5n o5nVar = o5n.c;
                    utsVar = this.w;
                    List a5 = utsVar.e.a();
                    vzg vzgVar = this.x;
                    zvs zvsVar2 = this.u;
                    thr thrVar = this.v;
                    gy1 gy1Var3 = this.y;
                    ots otsVar3 = new ots(zvsVar2, o5nVar, thrVar, a5, vzgVar, gy1Var3);
                    gy1Var = gy1Var3;
                    ConcurrentHashMap concurrentHashMap = utsVar.d.a;
                    zvsVar = this.u;
                    Object obj2 = concurrentHashMap.get(zvsVar);
                    if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(zvsVar, (obj2 = new eys()))) != null) {
                        obj2 = putIfAbsent;
                    }
                    eysVar = (eys) obj2;
                    this.j = otsVar3;
                    this.k = utsVar;
                    qboVar = this.z;
                    this.l = qboVar;
                    this.m = gy1Var;
                    this.n = zvsVar;
                    this.o = eysVar;
                    this.p = null;
                    this.r = 0;
                    this.s = 0;
                    this.t = 1;
                    if (eysVar.a.a(this) != r3) {
                        i = 0;
                        otsVar = otsVar3;
                        i2 = 0;
                    }
                    return r3;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        String str2 = (String) this.q;
                        ?? r32 = (oqi) this.m;
                        gy1Var2 = (gy1) this.l;
                        utsVar = this.k;
                        ots otsVar4 = this.j;
                        qgg.h0(obj);
                        otsVar = otsVar4;
                        a = str2;
                        a4 = obj;
                        eysVar4 = r32;
                        fts ftsVar2 = (fts) a4;
                        if (gy1Var2 == gy1.e) {
                            uts.d(utsVar, a, ftsVar2, otsVar);
                        }
                        ftsVar = (fts) a4;
                        eysVar5 = eysVar4;
                        eysVar = eysVar5;
                        eysVar.b(null);
                        return ftsVar;
                    }
                    if (i3 == 3) {
                        String str3 = this.p;
                        ?? r33 = (oqi) this.l;
                        utsVar2 = this.k;
                        otsVar2 = this.j;
                        qgg.h0(obj);
                        a = str3;
                        a3 = obj;
                        eysVar3 = r33;
                        uts.d(utsVar2, a, (fts) a3, otsVar2);
                        ftsVar = (fts) a3;
                        eysVar5 = eysVar3;
                        eysVar = eysVar5;
                        eysVar.b(null);
                        return ftsVar;
                    }
                    if (i3 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iss issVar = (iss) this.q;
                    str = this.p;
                    ?? r34 = (oqi) this.l;
                    utsVar = this.k;
                    qgg.h0(obj);
                    c = issVar;
                    a2 = obj;
                    eysVar2 = r34;
                    uts.i(utsVar, str, (fts) a2, c);
                    ftsVar = (fts) a2;
                    eysVar5 = eysVar2;
                    eysVar = eysVar5;
                    eysVar.b(null);
                    return ftsVar;
                }
                int i4 = this.s;
                int i5 = this.r;
                eys eysVar6 = this.o;
                zvs zvsVar3 = this.n;
                gy1 gy1Var4 = (gy1) this.m;
                qbo qboVar2 = (qbo) this.l;
                uts utsVar3 = this.k;
                otsVar = this.j;
                qgg.h0(obj);
                i = i4;
                utsVar = utsVar3;
                eysVar = eysVar6;
                i2 = i5;
                zvsVar = zvsVar3;
                gy1Var = gy1Var4;
                qboVar = qboVar2;
                a = utsVar.i.a();
                a.getClass();
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                c = uts.c(utsVar, a, otsVar);
                if (c != null) {
                    ssg.a(3, "TrackContentSourcesStage", "Cache row was found for preview of trackId=" + zvsVar, null);
                    kts f = uts.f(utsVar, a, c, otsVar);
                    if (f instanceof hts) {
                        ftsVar = ((hts) f).a;
                    } else if (f instanceof gts) {
                        this.j = otsVar;
                        this.k = utsVar;
                        this.l = eysVar;
                        this.m = null;
                        this.n = null;
                        this.o = null;
                        this.p = a;
                        this.q = null;
                        this.r = i2;
                        this.s = i;
                        this.t = 3;
                        a3 = uts.a(utsVar, qboVar, otsVar, this);
                        if (a3 != r3) {
                            utsVar2 = utsVar;
                            eysVar3 = eysVar;
                            otsVar2 = otsVar;
                            uts.d(utsVar2, a, (fts) a3, otsVar2);
                            ftsVar = (fts) a3;
                            eysVar5 = eysVar3;
                            eysVar = eysVar5;
                        }
                    } else if (f instanceof jts) {
                        this.j = null;
                        this.k = utsVar;
                        this.l = eysVar;
                        this.m = null;
                        this.n = null;
                        this.o = null;
                        this.p = a;
                        this.q = c;
                        this.r = i2;
                        this.s = i;
                        this.t = 4;
                        a2 = uts.a(utsVar, qboVar, otsVar, this);
                        if (a2 != r3) {
                            str = a;
                            eysVar2 = eysVar;
                            uts.i(utsVar, str, (fts) a2, c);
                            ftsVar = (fts) a2;
                            eysVar5 = eysVar2;
                            eysVar = eysVar5;
                        }
                    } else {
                        if (!(f instanceof its)) {
                            throw new x7j();
                        }
                        ftsVar = ((its) f).a;
                        uts.i(utsVar, a, ftsVar, c);
                    }
                    eysVar.b(null);
                    return ftsVar;
                }
                ssg.a(3, "TrackContentSourcesStage", "Fetching audio resource " + gy1Var + " for trackId=" + zvsVar, null);
                this.j = otsVar;
                this.k = utsVar;
                this.l = gy1Var;
                this.m = eysVar;
                this.n = null;
                this.o = null;
                this.p = null;
                this.q = a;
                this.r = i2;
                this.s = i;
                this.t = 2;
                a4 = uts.a(utsVar, qboVar, otsVar, this);
                if (a4 != r3) {
                    gy1Var2 = gy1Var;
                    eysVar4 = eysVar;
                    fts ftsVar22 = (fts) a4;
                    if (gy1Var2 == gy1.e) {
                    }
                    ftsVar = (fts) a4;
                    eysVar5 = eysVar4;
                    eysVar = eysVar5;
                    eysVar.b(null);
                    return ftsVar;
                }
                return r3;
            } catch (Throwable th) {
                th = th;
                r3 = eysVar;
                r3.b(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
