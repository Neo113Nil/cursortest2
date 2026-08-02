package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dgn extends aur implements Function2 {
    public oqi j;
    public cr k;
    public w5j l;
    public long m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public final /* synthetic */ cr r;
    public final /* synthetic */ w5j s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgn(cr crVar, w5j w5jVar, long j, Continuation continuation) {
        super(2, continuation);
        this.r = crVar;
        this.s = w5jVar;
        this.t = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new dgn(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dgn) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x012b, code lost:
    
        if (r15.n(r18) == r9) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x024e A[Catch: all -> 0x0026, TRY_ENTER, TryCatch #0 {all -> 0x0026, blocks: (B:8:0x001f, B:10:0x01f3, B:11:0x0182, B:12:0x0215, B:14:0x024e, B:15:0x0254, B:21:0x002f, B:23:0x0212, B:24:0x01a7, B:26:0x003c, B:28:0x0180, B:30:0x0049, B:32:0x01a5, B:88:0x00ef, B:91:0x0107, B:93:0x010d, B:94:0x0114, B:96:0x0117), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143 A[Catch: all -> 0x0069, TryCatch #1 {all -> 0x0069, blocks: (B:34:0x005e, B:36:0x0135, B:38:0x0143, B:40:0x0157, B:42:0x0164, B:47:0x0188, B:61:0x01b6, B:63:0x01ba, B:65:0x01ce, B:67:0x01d8, B:71:0x01f6, B:74:0x021a, B:76:0x021e, B:78:0x0226, B:81:0x022f, B:82:0x0234, B:83:0x0235, B:86:0x0079), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107 A[Catch: all -> 0x0026, TRY_ENTER, TryCatch #0 {all -> 0x0026, blocks: (B:8:0x001f, B:10:0x01f3, B:11:0x0182, B:12:0x0215, B:14:0x024e, B:15:0x0254, B:21:0x002f, B:23:0x0212, B:24:0x01a7, B:26:0x003c, B:28:0x0180, B:30:0x0049, B:32:0x01a5, B:88:0x00ef, B:91:0x0107, B:93:0x010d, B:94:0x0114, B:96:0x0117), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:8:0x001f, B:10:0x01f3, B:11:0x0182, B:12:0x0215, B:14:0x024e, B:15:0x0254, B:21:0x002f, B:23:0x0212, B:24:0x01a7, B:26:0x003c, B:28:0x0180, B:30:0x0049, B:32:0x01a5, B:88:0x00ef, B:91:0x0107, B:93:0x010d, B:94:0x0114, B:96:0x0117), top: B:2:0x000f }] */
    /* JADX WARN: Type inference failed for: r13v5, types: [oqi] */
    /* JADX WARN: Type inference failed for: r13v9, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v35, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v45 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        cr crVar;
        w5j w5jVar;
        long j;
        int i;
        n3m n3mVar;
        qqi qqiVar2;
        int i2;
        boolean z;
        oqi oqiVar;
        w5j w5jVar2;
        cr crVar2;
        int i3;
        boolean z2;
        rgn rgnVar;
        Boolean bool;
        Object i4;
        oqi oqiVar2;
        Object f;
        oqi oqiVar3;
        Object i5;
        oqi oqiVar4;
        Object f2;
        oqi oqiVar5;
        Boolean bool2;
        Boolean bool3;
        oqi oqiVar6;
        boolean booleanValue;
        oqi oqiVar7;
        oqi oqiVar8;
        ?? r1 = "Next ";
        nm6 nm6Var = nm6.a;
        try {
            try {
                switch (this.q) {
                    case 0:
                        qgg.h0(obj);
                        cr crVar3 = this.r;
                        qqiVar = (qqi) crVar3.i;
                        this.j = qqiVar;
                        this.k = crVar3;
                        w5j w5jVar3 = this.s;
                        this.l = w5jVar3;
                        long j2 = this.t;
                        this.m = j2;
                        this.n = 0;
                        this.q = 1;
                        if (qqiVar.a(this) != nm6Var) {
                            crVar = crVar3;
                            w5jVar = w5jVar3;
                            j = j2;
                            i = 0;
                            try {
                                ssg.a(3, "RadioPlaybackImpl", "Next " + w5jVar, null);
                                n3mVar = (n3m) crVar.e;
                                this.j = qqiVar;
                                this.k = crVar;
                                this.l = w5jVar;
                                this.m = j;
                                this.n = i;
                                this.o = 0;
                                this.q = 2;
                                if (n3mVar.O0(this) != nm6Var) {
                                    qqiVar2 = qqiVar;
                                    i2 = 0;
                                    z = ((u9u) ((ae) crVar.h).b.getValue()).a.get();
                                    bjt bjtVar = (bjt) crVar.d;
                                    if (z) {
                                        this.j = qqiVar2;
                                        this.k = crVar;
                                        this.l = w5jVar;
                                        this.m = j;
                                        this.n = i;
                                        this.o = i2;
                                        this.p = z;
                                        this.q = 3;
                                        break;
                                    } else {
                                        cr crVar4 = (cr) bjtVar.d;
                                        if (crVar4 != null) {
                                            gld.L((tf6) crVar4.f, null);
                                        }
                                        bjtVar.d = null;
                                    }
                                    cr crVar5 = crVar;
                                    oqiVar = qqiVar2;
                                    w5jVar2 = w5jVar;
                                    crVar2 = crVar5;
                                    i3 = i;
                                    z2 = z;
                                    rgnVar = (rgn) ((xdr) crVar2.b).getValue();
                                    if (rgnVar instanceof ogn) {
                                        f7u f7uVar = ((ogn) rgnVar).b;
                                        String str = ((ogn) rgnVar).a;
                                        c0t c0tVar = ((ogn) rgnVar).c;
                                        e7u e7uVar = f7uVar.c;
                                        if (e7uVar.c || e7uVar.d) {
                                            long j3 = j;
                                            cr crVar6 = crVar2;
                                            this.j = oqiVar;
                                            this.k = null;
                                            this.l = null;
                                            this.n = i3;
                                            this.o = i2;
                                            this.p = z2;
                                            this.q = 4;
                                            try {
                                                i5 = cr.i(crVar6, w5jVar2, f7uVar, str, j3, z2, c0tVar, this);
                                                if (i5 != nm6Var) {
                                                    oqiVar4 = oqiVar;
                                                    bool2 = (Boolean) i5;
                                                    oqiVar6 = oqiVar4;
                                                    booleanValue = bool2.booleanValue();
                                                    oqiVar7 = oqiVar6;
                                                    bool = Boolean.valueOf(booleanValue);
                                                    r1 = oqiVar7;
                                                    Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                    r1.b(null);
                                                    return valueOf;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                r1 = oqiVar;
                                                r1.b(null);
                                                throw th;
                                            }
                                        } else {
                                            this.j = oqiVar;
                                            this.k = null;
                                            this.l = null;
                                            this.n = i3;
                                            this.o = i2;
                                            this.p = z2;
                                            this.q = 5;
                                            f2 = cr.f(crVar2, w5jVar2, f7uVar, str, c0tVar, this);
                                            if (f2 != nm6Var) {
                                                oqiVar5 = oqiVar;
                                                bool3 = (Boolean) f2;
                                                oqiVar8 = oqiVar5;
                                                booleanValue = bool3.booleanValue();
                                                oqiVar7 = oqiVar8;
                                                bool = Boolean.valueOf(booleanValue);
                                                r1 = oqiVar7;
                                                Boolean valueOf2 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                r1.b(null);
                                                return valueOf2;
                                            }
                                        }
                                    } else {
                                        long j4 = j;
                                        boolean z3 = z2;
                                        if (!(rgnVar instanceof pgn)) {
                                            if (!(rgnVar instanceof mgn) && !Intrinsics.d(rgnVar, ngn.a) && !Intrinsics.d(rgnVar, qgn.a)) {
                                                throw new x7j();
                                            }
                                            ssg.a(6, "RadioPlaybackImpl", "Inappropriate state for next (" + rgnVar + "). Call skipped", null);
                                            bool = null;
                                            r1 = oqiVar;
                                            Boolean valueOf22 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                            r1.b(null);
                                            return valueOf22;
                                        }
                                        f7u f7uVar2 = ((pgn) rgnVar).b;
                                        String str2 = ((pgn) rgnVar).a;
                                        c0t c0tVar2 = ((pgn) rgnVar).c;
                                        e7u e7uVar2 = f7uVar2.c;
                                        if (e7uVar2.c || e7uVar2.d) {
                                            cr crVar7 = crVar2;
                                            this.j = oqiVar;
                                            this.k = null;
                                            this.l = null;
                                            this.n = i3;
                                            this.o = i2;
                                            this.p = z3;
                                            this.q = 6;
                                            i4 = cr.i(crVar7, w5jVar2, f7uVar2, str2, j4, z3, c0tVar2, this);
                                            if (i4 != nm6Var) {
                                                oqiVar2 = oqiVar;
                                                bool2 = (Boolean) i4;
                                                oqiVar6 = oqiVar2;
                                                booleanValue = bool2.booleanValue();
                                                oqiVar7 = oqiVar6;
                                                bool = Boolean.valueOf(booleanValue);
                                                r1 = oqiVar7;
                                                Boolean valueOf222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                r1.b(null);
                                                return valueOf222;
                                            }
                                        } else {
                                            this.j = oqiVar;
                                            this.k = null;
                                            this.l = null;
                                            this.n = i3;
                                            this.o = i2;
                                            this.p = z3;
                                            this.q = 7;
                                            f = cr.f(crVar2, w5jVar2, f7uVar2, str2, c0tVar2, this);
                                            if (f != nm6Var) {
                                                oqiVar3 = oqiVar;
                                                bool3 = (Boolean) f;
                                                oqiVar8 = oqiVar3;
                                                booleanValue = bool3.booleanValue();
                                                oqiVar7 = oqiVar8;
                                                bool = Boolean.valueOf(booleanValue);
                                                r1 = oqiVar7;
                                                Boolean valueOf2222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                                r1.b(null);
                                                return valueOf2222;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r1 = qqiVar;
                                r1.b(null);
                                throw th;
                            }
                        }
                        return nm6Var;
                    case 1:
                        int i6 = this.n;
                        long j5 = this.m;
                        w5j w5jVar4 = this.l;
                        cr crVar8 = this.k;
                        ?? r13 = this.j;
                        qgg.h0(obj);
                        i = i6;
                        qqiVar = r13;
                        crVar = crVar8;
                        w5jVar = w5jVar4;
                        j = j5;
                        ssg.a(3, "RadioPlaybackImpl", "Next " + w5jVar, null);
                        n3mVar = (n3m) crVar.e;
                        this.j = qqiVar;
                        this.k = crVar;
                        this.l = w5jVar;
                        this.m = j;
                        this.n = i;
                        this.o = 0;
                        this.q = 2;
                        if (n3mVar.O0(this) != nm6Var) {
                        }
                        return nm6Var;
                    case 2:
                        int i7 = this.o;
                        int i8 = this.n;
                        long j6 = this.m;
                        w5j w5jVar5 = this.l;
                        cr crVar9 = this.k;
                        ?? r132 = this.j;
                        qgg.h0(obj);
                        i2 = i7;
                        qqiVar2 = r132;
                        crVar = crVar9;
                        w5jVar = w5jVar5;
                        j = j6;
                        i = i8;
                        z = ((u9u) ((ae) crVar.h).b.getValue()).a.get();
                        bjt bjtVar2 = (bjt) crVar.d;
                        if (z) {
                        }
                        cr crVar52 = crVar;
                        oqiVar = qqiVar2;
                        w5jVar2 = w5jVar;
                        crVar2 = crVar52;
                        i3 = i;
                        z2 = z;
                        rgnVar = (rgn) ((xdr) crVar2.b).getValue();
                        if (rgnVar instanceof ogn) {
                        }
                        return nm6Var;
                    case 3:
                        boolean z4 = this.p;
                        i2 = this.o;
                        i3 = this.n;
                        long j7 = this.m;
                        w5j w5jVar6 = this.l;
                        crVar2 = this.k;
                        oqiVar = this.j;
                        qgg.h0(obj);
                        z2 = z4;
                        w5jVar2 = w5jVar6;
                        j = j7;
                        rgnVar = (rgn) ((xdr) crVar2.b).getValue();
                        if (rgnVar instanceof ogn) {
                        }
                        return nm6Var;
                    case 4:
                        oqi oqiVar9 = this.j;
                        qgg.h0(obj);
                        i5 = obj;
                        oqiVar4 = oqiVar9;
                        bool2 = (Boolean) i5;
                        oqiVar6 = oqiVar4;
                        booleanValue = bool2.booleanValue();
                        oqiVar7 = oqiVar6;
                        bool = Boolean.valueOf(booleanValue);
                        r1 = oqiVar7;
                        Boolean valueOf22222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        r1.b(null);
                        return valueOf22222;
                    case 5:
                        oqi oqiVar10 = this.j;
                        qgg.h0(obj);
                        f2 = obj;
                        oqiVar5 = oqiVar10;
                        bool3 = (Boolean) f2;
                        oqiVar8 = oqiVar5;
                        booleanValue = bool3.booleanValue();
                        oqiVar7 = oqiVar8;
                        bool = Boolean.valueOf(booleanValue);
                        r1 = oqiVar7;
                        Boolean valueOf222222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        r1.b(null);
                        return valueOf222222;
                    case 6:
                        oqi oqiVar11 = this.j;
                        qgg.h0(obj);
                        i4 = obj;
                        oqiVar2 = oqiVar11;
                        bool2 = (Boolean) i4;
                        oqiVar6 = oqiVar2;
                        booleanValue = bool2.booleanValue();
                        oqiVar7 = oqiVar6;
                        bool = Boolean.valueOf(booleanValue);
                        r1 = oqiVar7;
                        Boolean valueOf2222222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        r1.b(null);
                        return valueOf2222222;
                    case 7:
                        oqi oqiVar12 = this.j;
                        qgg.h0(obj);
                        f = obj;
                        oqiVar3 = oqiVar12;
                        bool3 = (Boolean) f;
                        oqiVar8 = oqiVar3;
                        booleanValue = bool3.booleanValue();
                        oqiVar7 = oqiVar8;
                        bool = Boolean.valueOf(booleanValue);
                        r1 = oqiVar7;
                        Boolean valueOf22222222 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        r1.b(null);
                        return valueOf22222222;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
