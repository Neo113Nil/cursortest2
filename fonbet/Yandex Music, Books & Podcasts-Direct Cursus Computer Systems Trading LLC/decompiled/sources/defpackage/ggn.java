package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class ggn extends aur implements Function2 {
    public oqi j;
    public cr k;
    public ybu l;
    public Object m;
    public Object n;
    public gxc o;
    public List p;
    public w7u q;
    public w7u r;
    public int s;
    public int t;
    public int u;
    public final /* synthetic */ cr v;
    public final /* synthetic */ ybu w;
    public final /* synthetic */ qfn x;
    public final /* synthetic */ gxc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggn(cr crVar, ybu ybuVar, qfn qfnVar, gxc gxcVar, Continuation continuation) {
        super(2, continuation);
        this.v = crVar;
        this.w = ybuVar;
        this.x = qfnVar;
        this.y = gxcVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new ggn(this.v, this.w, this.x, this.y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ggn) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(1:2)|(1:(3:(1:(1:(1:(6:9|10|11|12|13|14)(2:16|17))(5:18|19|20|21|22))(6:23|24|25|26|27|(6:29|30|(2:41|(4:43|(1:45)(1:48)|(4:47|20|21|22)|39)(1:49))(1:36)|37|(5:40|11|12|13|14)|39)(2:50|(4:52|53|13|14)(2:54|55))))(6:61|62|63|64|65|(2:67|(2:69|(2:71|39)(3:72|27|(0)(0)))(5:73|30|(1:32)|41|(0)(0)))(2:74|(4:76|53|13|14)(2:77|78)))|59|60)(1:81))(3:91|(1:93)|39)|82|83|(3:85|13|14)(3:86|(3:88|65|(0)(0))|39)) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012e, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a0 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:27:0x019a, B:29:0x01a0, B:30:0x01ce, B:32:0x01d8, B:34:0x01de, B:36:0x01e6, B:37:0x0241, B:41:0x01f7, B:43:0x0201, B:48:0x0234, B:50:0x01ad, B:52:0x01b1, B:54:0x01c2, B:55:0x01c7, B:63:0x00a2, B:65:0x0164, B:67:0x016a, B:69:0x0174, B:74:0x0294, B:76:0x0298, B:77:0x02ae, B:78:0x02b3), top: B:62:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0201 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:27:0x019a, B:29:0x01a0, B:30:0x01ce, B:32:0x01d8, B:34:0x01de, B:36:0x01e6, B:37:0x0241, B:41:0x01f7, B:43:0x0201, B:48:0x0234, B:50:0x01ad, B:52:0x01b1, B:54:0x01c2, B:55:0x01c7, B:63:0x00a2, B:65:0x0164, B:67:0x016a, B:69:0x0174, B:74:0x0294, B:76:0x0298, B:77:0x02ae, B:78:0x02b3), top: B:62:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:27:0x019a, B:29:0x01a0, B:30:0x01ce, B:32:0x01d8, B:34:0x01de, B:36:0x01e6, B:37:0x0241, B:41:0x01f7, B:43:0x0201, B:48:0x0234, B:50:0x01ad, B:52:0x01b1, B:54:0x01c2, B:55:0x01c7, B:63:0x00a2, B:65:0x0164, B:67:0x016a, B:69:0x0174, B:74:0x0294, B:76:0x0298, B:77:0x02ae, B:78:0x02b3), top: B:62:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:27:0x019a, B:29:0x01a0, B:30:0x01ce, B:32:0x01d8, B:34:0x01de, B:36:0x01e6, B:37:0x0241, B:41:0x01f7, B:43:0x0201, B:48:0x0234, B:50:0x01ad, B:52:0x01b1, B:54:0x01c2, B:55:0x01c7, B:63:0x00a2, B:65:0x0164, B:67:0x016a, B:69:0x0174, B:74:0x0294, B:76:0x0298, B:77:0x02ae, B:78:0x02b3), top: B:62:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0294 A[Catch: all -> 0x00ae, TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:27:0x019a, B:29:0x01a0, B:30:0x01ce, B:32:0x01d8, B:34:0x01de, B:36:0x01e6, B:37:0x0241, B:41:0x01f7, B:43:0x0201, B:48:0x0234, B:50:0x01ad, B:52:0x01b1, B:54:0x01c2, B:55:0x01c7, B:63:0x00a2, B:65:0x0164, B:67:0x016a, B:69:0x0174, B:74:0x0294, B:76:0x0298, B:77:0x02ae, B:78:0x02b3), top: B:62:0x00a2 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cr crVar;
        ybu ybuVar;
        pfn pfnVar;
        gxc gxcVar;
        oqi oqiVar;
        int i;
        String str;
        List list;
        Object b;
        oqi oqiVar2;
        ybu ybuVar2;
        int i2;
        pfn pfnVar2;
        cr crVar2;
        rj6 rj6Var;
        w7u w7uVar;
        int i3;
        int i4;
        gxc gxcVar2;
        pfn pfnVar3;
        cr crVar3;
        Object b2;
        int i5;
        cr crVar4;
        w7u w7uVar2;
        oqi oqiVar3;
        gxc gxcVar3;
        ybu ybuVar3;
        w7u w7uVar3;
        oqi oqiVar4;
        ArrayList D;
        rj6 rj6Var2;
        nm6 nm6Var = nm6.a;
        int i6 = this.u;
        ?? r6 = 5;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i6 == 0) {
            qgg.h0(obj);
            crVar = this.v;
            qqi qqiVar = (qqi) crVar.i;
            this.j = qqiVar;
            this.k = crVar;
            ybuVar = this.w;
            this.l = ybuVar;
            this.m = null;
            pfnVar = this.x;
            this.n = pfnVar;
            gxcVar = this.y;
            this.o = gxcVar;
            this.s = 0;
            this.u = 1;
            if (qqiVar.a(this) != nm6Var) {
                oqiVar = qqiVar;
                i = 0;
                str = null;
            }
            return nm6Var;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                int i7 = this.t;
                int i8 = this.s;
                list = this.p;
                gxc gxcVar4 = this.o;
                pfn pfnVar4 = (pfn) this.n;
                ybu ybuVar4 = this.l;
                crVar2 = this.k;
                oqiVar2 = this.j;
                try {
                    qgg.h0(obj);
                    i2 = i7;
                    pfnVar2 = pfnVar4;
                    ybuVar2 = ybuVar4;
                    gxcVar = gxcVar4;
                    i = i8;
                    b = obj;
                    rj6Var = (rj6) b;
                    if (rj6Var instanceof qj6) {
                        if (!(rj6Var instanceof pj6)) {
                            throw new x7j();
                        }
                        ((xdr) crVar2.b).m(null, new mgn((pj6) rj6Var));
                        oqiVar = oqiVar2;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    w7u w7uVar4 = (w7u) ((qj6) rj6Var).a;
                    if (w7uVar4.d) {
                        vw5 vw5Var = (vw5) crVar2.c;
                        this.j = oqiVar2;
                        this.k = crVar2;
                        this.l = ybuVar2;
                        this.m = pfnVar2;
                        this.n = gxcVar;
                        this.o = null;
                        this.p = null;
                        this.q = null;
                        this.s = i;
                        this.t = i2;
                        this.u = 3;
                        b2 = vw5Var.b(list, true, this);
                        if (b2 == nm6Var) {
                            return nm6Var;
                        }
                        i5 = i;
                        gxcVar2 = gxcVar;
                        crVar4 = crVar2;
                        rj6Var2 = (rj6) b2;
                        if (rj6Var2 instanceof qj6) {
                        }
                    } else {
                        w7uVar = w7uVar4;
                        i3 = i;
                        i4 = i2;
                        gxcVar2 = gxcVar;
                        pfnVar3 = pfnVar2;
                        crVar3 = crVar2;
                        if (!((ae) crVar3.h).a()) {
                        }
                        if (!((ae) crVar3.h).a()) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r6 = oqiVar2;
                }
            } else {
                if (i6 != 3) {
                    if (i6 == 4) {
                        oqiVar3 = this.j;
                        qgg.h0(obj);
                        Unit unit = Unit.a;
                        oqiVar3.b(null);
                        return unit;
                    }
                    if (i6 != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w7uVar3 = this.r;
                    w7uVar = this.q;
                    gxcVar3 = (gxc) this.m;
                    ybuVar3 = this.l;
                    crVar3 = this.k;
                    oqiVar4 = this.j;
                    qgg.h0(obj);
                    ((xdr) crVar3.b).m(null, new pgn(w7uVar.a, p6g.u(w7uVar3, gdg.D(ybuVar3), ybuVar3.b), new c0t(gxcVar3), z2l.a));
                    oqiVar = oqiVar4;
                    oqiVar.b(null);
                    return Unit.a;
                }
                int i9 = this.t;
                i5 = this.s;
                gxcVar2 = (gxc) this.n;
                pfnVar2 = (pfn) this.m;
                ybuVar2 = this.l;
                crVar4 = this.k;
                oqi oqiVar5 = this.j;
                try {
                    qgg.h0(obj);
                    i2 = i9;
                    oqiVar2 = oqiVar5;
                    b2 = obj;
                    rj6Var2 = (rj6) b2;
                    if (rj6Var2 instanceof qj6) {
                        if (!(rj6Var2 instanceof pj6)) {
                            throw new x7j();
                        }
                        ((xdr) crVar4.b).m(null, new mgn((pj6) rj6Var2));
                        oqiVar = oqiVar2;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    int i10 = i5;
                    w7uVar = (w7u) ((qj6) rj6Var2).a;
                    i3 = i10;
                    i4 = i2;
                    pfnVar3 = pfnVar2;
                    crVar3 = crVar4;
                    if (!((ae) crVar3.h).a() && (D = gdg.D(ybuVar2)) != null && (!D.isEmpty())) {
                        c5b c5bVar = c5b.a;
                        String str2 = w7uVar.a;
                        String str3 = w7uVar.b;
                        boolean z = w7uVar.d;
                        c5bVar.getClass();
                        w7uVar2 = new w7u(str2, str3, c5bVar, z);
                    } else {
                        if (!((ae) crVar3.h).a()) {
                            Assertions.throwOrSkip("RadioPlaybackImpl", new FailedAssertionException("Unable to start wave playback with useOnlyInitialPlayables=true. Initial playables are empty or do not contain current element. Stopping."));
                            this.j = oqiVar2;
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = null;
                            this.o = null;
                            this.p = null;
                            this.q = null;
                            this.s = i3;
                            this.t = i4;
                            this.u = 4;
                            Object V = x97.V((a) crVar3.g, new kgn(crVar3, 0L, null), this);
                            if (V != nm6Var) {
                                V = Unit.a;
                            }
                            if (V != nm6Var) {
                                oqiVar3 = oqiVar2;
                                Unit unit2 = Unit.a;
                                oqiVar3.b(null);
                                return unit2;
                            }
                            return nm6Var;
                        }
                        w7uVar2 = w7uVar;
                    }
                    yks yksVar = (yks) crVar3.f;
                    String a = pfnVar3.a("");
                    String str4 = w7uVar.a;
                    String str5 = w7uVar.b;
                    this.j = oqiVar2;
                    this.k = crVar3;
                    this.l = ybuVar2;
                    this.m = gxcVar2;
                    this.n = null;
                    this.o = null;
                    this.p = null;
                    this.q = w7uVar;
                    this.r = w7uVar2;
                    this.s = i3;
                    this.t = i4;
                    this.u = 5;
                    if (yksVar.p(a, str4, str5, this) != nm6Var) {
                        gxcVar3 = gxcVar2;
                        ybuVar3 = ybuVar2;
                        w7uVar3 = w7uVar2;
                        oqiVar4 = oqiVar2;
                        ((xdr) crVar3.b).m(null, new pgn(w7uVar.a, p6g.u(w7uVar3, gdg.D(ybuVar3), ybuVar3.b), new c0t(gxcVar3), z2l.a));
                        oqiVar = oqiVar4;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                } catch (Throwable th3) {
                    th = th3;
                    r6 = oqiVar5;
                }
            }
            r6.b(null);
            throw th;
        }
        i = this.s;
        gxcVar = this.o;
        pfnVar = (pfn) this.n;
        str = (String) this.m;
        ybuVar = this.l;
        crVar = this.k;
        oqiVar = this.j;
        qgg.h0(obj);
        ssg.a(3, "RadioPlaybackImpl", "Starting radio { startSession=" + str + " }", null);
        if (!(((xdr) crVar.b).getValue() instanceof ngn)) {
            ssg.a(6, "RadioPlaybackImpl", "Inappropriate state for station start (" + ((xdr) crVar.b) + "). Call skipped", null);
            oqiVar.b(null);
            return Unit.a;
        }
        list = (List) gdg.C(ybuVar).a;
        vw5 vw5Var2 = (vw5) crVar.c;
        this.j = oqiVar;
        this.k = crVar;
        this.l = ybuVar;
        this.m = str;
        this.n = pfnVar;
        this.o = gxcVar;
        this.p = list;
        this.s = i;
        this.t = 0;
        this.u = 2;
        b = vw5Var2.b(list, true, this);
        if (b != nm6Var) {
            oqiVar2 = oqiVar;
            ybuVar2 = ybuVar;
            i2 = 0;
            pfnVar2 = pfnVar;
            crVar2 = crVar;
            rj6Var = (rj6) b;
            if (rj6Var instanceof qj6) {
            }
        }
        return nm6Var;
    }
}
