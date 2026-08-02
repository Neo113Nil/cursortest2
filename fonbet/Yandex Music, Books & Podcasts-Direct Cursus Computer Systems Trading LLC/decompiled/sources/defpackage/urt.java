package defpackage;

import com.yandex.music.shared.auth.proto.a;
import com.yandex.music.shared.network.repositories.retrofit.AccountApi;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class urt implements dqi {
    public final fos a;
    public final r3s b;
    public final Function0 c;
    public final osh d;
    public final w4i e;
    public final xdr f;
    public final bca g;
    public final qqi h;
    public final jyr i;

    public urt(fos fosVar, r3s r3sVar, Function0 function0, osh oshVar, w4i w4iVar) {
        function0.getClass();
        this.a = fosVar;
        this.b = r3sVar;
        this.c = function0;
        this.d = oshVar;
        this.e = w4iVar;
        xdr a = ydr.a(null);
        this.f = a;
        this.g = new bca(a, 18);
        this.h = rqi.a();
        this.i = btf.b(new wfs(14, this));
        dq7 dq7Var = ca8.a;
        x97.y(cmd.a, mn7.d, null, new pjt(this, null, 2), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        trt trtVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof trt) {
            trtVar = (trt) cg6Var;
            int i2 = trtVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trtVar.l = i2 - Integer.MIN_VALUE;
                Object obj = trtVar.j;
                Object obj2 = nm6.a;
                i = trtVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    trtVar.l = 1;
                    obj = m(this.a, trtVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        obj.getClass();
                        return new got((yxc) obj);
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return lsq.G((pj6) rj6Var);
                }
                trtVar.l = 2;
                obj = k(trtVar);
            }
        }
        trtVar = new trt(this, cg6Var);
        Object obj3 = trtVar.j;
        Object obj22 = nm6.a;
        i = trtVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (r9.e.invoke(r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        if (r6 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:19:0x003c, B:20:0x0086, B:30:0x0066, B:32:0x006e, B:33:0x0072), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v8, types: [oqi] */
    @Override // defpackage.dqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        ort ortVar;
        nm6 nm6Var;
        ?? r2;
        xqn i;
        int i2;
        qqi qqiVar;
        osh oshVar;
        xqn xqnVar;
        Object obj;
        try {
            if (cg6Var instanceof ort) {
                ortVar = (ort) cg6Var;
                int i3 = ortVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ortVar.o = i3 - Integer.MIN_VALUE;
                    Object obj2 = ortVar.m;
                    nm6Var = nm6.a;
                    r2 = ortVar.o;
                    xdr xdrVar = this.f;
                    if (r2 != 0) {
                        i = hrg.i(obj2);
                        ortVar.j = i;
                        qqi qqiVar2 = this.h;
                        ortVar.k = qqiVar2;
                        i2 = 0;
                        ortVar.l = 0;
                        ortVar.o = 1;
                        Object a = qqiVar2.a(ortVar);
                        qqiVar = qqiVar2;
                    } else if (r2 == 1) {
                        int i4 = ortVar.l;
                        ?? r6 = ortVar.k;
                        xqn xqnVar2 = ortVar.j;
                        qgg.h0(obj2);
                        i = xqnVar2;
                        i2 = i4;
                        qqiVar = r6;
                    } else {
                        if (r2 != 2) {
                            if (r2 == 3) {
                                qgg.h0(obj2);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqi oqiVar = ortVar.k;
                        xqnVar = ortVar.j;
                        qgg.h0(obj2);
                        r2 = oqiVar;
                        xdrVar.l(yrt.a);
                        this.a.b(null);
                        r2.b(null);
                        obj = xqnVar.a;
                        if (obj != null) {
                            return Unit.a;
                        }
                        ortVar.j = null;
                        ortVar.k = null;
                        ortVar.o = 3;
                    }
                    xxq xxqVar = (xxq) xdrVar.getValue();
                    i.a = xxqVar == null ? xxqVar.a : null;
                    oshVar = this.d;
                    ortVar.j = i;
                    ortVar.k = qqiVar;
                    ortVar.l = i2;
                    ortVar.o = 2;
                    if (oshVar.z(ortVar) != nm6Var) {
                        return nm6Var;
                    }
                    xqnVar = i;
                    r2 = qqiVar;
                    xdrVar.l(yrt.a);
                    this.a.b(null);
                    r2.b(null);
                    obj = xqnVar.a;
                    if (obj != null) {
                    }
                }
            }
            if (r2 != 0) {
            }
            xxq xxqVar2 = (xxq) xdrVar.getValue();
            i.a = xxqVar2 == null ? xxqVar2.a : null;
            oshVar = this.d;
            ortVar.j = i;
            ortVar.k = qqiVar;
            ortVar.l = i2;
            ortVar.o = 2;
            if (oshVar.z(ortVar) != nm6Var) {
            }
        } catch (Throwable th) {
            r2.b(null);
            throw th;
        }
        ortVar = new ort(this, cg6Var);
        Object obj22 = ortVar.m;
        nm6Var = nm6.a;
        r2 = ortVar.o;
        xdr xdrVar2 = this.f;
    }

    @Override // defpackage.frt
    public final xxq c() {
        return (xxq) x97.D(g.a, new zts(this, null, 7));
    }

    @Override // defpackage.frt
    public final vdr d() {
        return (vdr) this.i.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        if (r20.d.z(r3) == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (r2 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.dqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, Continuation continuation) {
        srt srtVar;
        int i;
        rj6 rj6Var;
        wc wcVar;
        yxc yxcVar;
        String str2 = str;
        if (continuation instanceof srt) {
            srtVar = (srt) continuation;
            int i2 = srtVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                srtVar.n = i2 - Integer.MIN_VALUE;
                Object obj = srtVar.l;
                Object obj2 = nm6.a;
                i = srtVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    fos fosVar = new fos();
                    fosVar.b(str2);
                    srtVar.j = str2;
                    srtVar.n = 1;
                    obj = m(fosVar, srtVar);
                } else if (i == 1) {
                    str2 = srtVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wcVar = srtVar.k;
                        qgg.h0(obj);
                        int intValue = ((Number) this.c.invoke()).intValue();
                        wcVar.getClass();
                        return new got(new yxc(new drt(wcVar.h(), wcVar.g(), wcVar.b(), true), intValue, wcVar.a(), wcVar.j(), wcVar.c(), wcVar.i(), wcVar.f(), wcVar.d(), wcVar.e()));
                    }
                    wcVar = srtVar.k;
                    qgg.h0(obj);
                    yxcVar = (yxc) obj;
                    if (yxcVar == null) {
                        return new got(yxcVar);
                    }
                    Assertions.throwOrSkip("SharedAuth", new FailedAssertionException("Stored user is null after saving", new IllegalStateException()));
                    srtVar.j = null;
                    srtVar.k = wcVar;
                    srtVar.n = 3;
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return lsq.G((pj6) rj6Var);
                }
                rj6Var.getClass();
                wc wcVar2 = (wc) ((qj6) rj6Var).a;
                if (wcVar2.g().length() == 0) {
                    dfi.r(hrg.s("User without login (", wcVar2.h(), ", ", wcVar2.g(), ")"), "UserCenterImpl");
                }
                this.a.b(str2);
                xxq xxqVar = new xxq(wcVar2.h(), wcVar2.g());
                xdr xdrVar = this.f;
                xdrVar.getClass();
                xdrVar.m(null, xxqVar);
                srtVar.j = null;
                srtVar.k = wcVar2;
                srtVar.n = 2;
                Object k = k(srtVar);
                if (k != obj2) {
                    obj = k;
                    wcVar = wcVar2;
                    yxcVar = (yxc) obj;
                    if (yxcVar == null) {
                    }
                }
                return obj2;
            }
        }
        srtVar = new srt(this, (cg6) continuation);
        Object obj3 = srtVar.l;
        Object obj22 = nm6.a;
        i = srtVar.n;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    @Override // defpackage.frt
    public final Object f(Continuation continuation) {
        return zsd.g0(this.g, continuation);
    }

    @Override // defpackage.frt
    public final pjc g() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.dqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cv0 cv0Var, boolean z, Continuation continuation) {
        prt prtVar;
        Object obj;
        int i;
        Function1 function1;
        yxc yxcVar;
        boolean z2;
        qqi qqiVar;
        yxc yxcVar2;
        Function1 function12;
        if (continuation instanceof prt) {
            prtVar = (prt) continuation;
            int i2 = prtVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                prtVar.q = i2 - Integer.MIN_VALUE;
                Object obj2 = prtVar.o;
                obj = nm6.a;
                i = prtVar.q;
                xdr xdrVar = this.f;
                if (i != 0) {
                    qgg.h0(obj2);
                    prtVar.j = cv0Var;
                    prtVar.k = null;
                    prtVar.n = z;
                    prtVar.q = 1;
                    obj2 = k(prtVar);
                    if (obj2 != obj) {
                        function1 = null;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        z2 = prtVar.n;
                        Function1 function13 = prtVar.k;
                        qgg.h0(obj2);
                        if (z2) {
                            xdrVar.l(yrt.a);
                        }
                        return null;
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qqiVar = prtVar.m;
                    yxcVar2 = prtVar.l;
                    function12 = prtVar.k;
                    qgg.h0(obj2);
                    if (function12 != null) {
                        try {
                            function12.invoke(yxcVar2);
                        } catch (Throwable th) {
                            qqiVar.b(null);
                            throw th;
                        }
                    }
                    xxq d = yxcVar2.d();
                    xdrVar.getClass();
                    xdrVar.m(null, d);
                    qqiVar.b(null);
                    return yxcVar2;
                }
                z = prtVar.n;
                Function1 function14 = prtVar.k;
                cv0 cv0Var2 = prtVar.j;
                qgg.h0(obj2);
                function1 = function14;
                cv0Var = cv0Var2;
                yxcVar = (yxc) obj2;
                if (yxcVar == null && ((Boolean) cv0Var.invoke(yxcVar)).booleanValue()) {
                    prtVar.j = null;
                    prtVar.k = function1;
                    prtVar.l = yxcVar;
                    qqiVar = this.h;
                    prtVar.m = qqiVar;
                    prtVar.n = z;
                    prtVar.q = 3;
                    if (qqiVar.a(prtVar) != obj) {
                        yxcVar2 = yxcVar;
                        function12 = function1;
                        if (function12 != null) {
                        }
                        xxq d2 = yxcVar2.d();
                        xdrVar.getClass();
                        xdrVar.m(null, d2);
                        qqiVar.b(null);
                        return yxcVar2;
                    }
                } else {
                    prtVar.j = null;
                    prtVar.k = null;
                    prtVar.l = null;
                    prtVar.n = z;
                    prtVar.q = 2;
                    if (l(prtVar) != obj) {
                        z2 = z;
                        if (z2) {
                        }
                        return null;
                    }
                }
                return obj;
            }
        }
        prtVar = new prt(this, (cg6) continuation);
        Object obj22 = prtVar.o;
        obj = nm6.a;
        i = prtVar.q;
        xdr xdrVar2 = this.f;
        if (i != 0) {
        }
        yxcVar = (yxc) obj22;
        if (yxcVar == null) {
        }
        prtVar.j = null;
        prtVar.k = null;
        prtVar.l = null;
        prtVar.n = z;
        prtVar.q = 2;
        if (l(prtVar) != obj) {
        }
        return obj;
    }

    @Override // defpackage.dqi
    public final void i(String str) {
        this.a.b(str);
    }

    @Override // defpackage.frt
    public final pjc j() {
        return new z78(new bca((pjc) this.d.c, 18), 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.frt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var) {
        nrt nrtVar;
        Object obj;
        int i;
        a aVar;
        a aVar2;
        String str;
        if (cg6Var instanceof nrt) {
            nrtVar = (nrt) cg6Var;
            int i2 = nrtVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nrtVar.l = i2 - Integer.MIN_VALUE;
                obj = nrtVar.j;
                nm6 nm6Var = nm6.a;
                i = nrtVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.d.c;
                    nrtVar.l = 1;
                    obj = zsd.g0(pjcVar, nrtVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                aVar = (a) obj;
                if (aVar != null || (str = aVar.a) == null || str.length() <= 0) {
                    obj = null;
                }
                aVar2 = (a) obj;
                if (aVar2 == null) {
                    return lsq.F(aVar2);
                }
                return null;
            }
        }
        nrtVar = new nrt(this, cg6Var);
        obj = nrtVar.j;
        nm6 nm6Var2 = nm6.a;
        i = nrtVar.l;
        if (i != 0) {
        }
        aVar = (a) obj;
        if (aVar != null) {
        }
        obj = null;
        aVar2 = (a) obj;
        if (aVar2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(cg6 cg6Var) {
        mrt mrtVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        osh oshVar;
        try {
            if (cg6Var instanceof mrt) {
                mrtVar = (mrt) cg6Var;
                int i3 = mrtVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    mrtVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = mrtVar.l;
                    nm6Var = nm6.a;
                    i = mrtVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.h;
                        mrtVar.j = qqiVar;
                        i2 = 0;
                        mrtVar.k = 0;
                        mrtVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = mrtVar.j;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = mrtVar.k;
                        ?? r4 = mrtVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    oshVar = this.d;
                    mrtVar.j = qqiVar;
                    mrtVar.k = i2;
                    mrtVar.n = 2;
                    if (oshVar.z(mrtVar) != nm6Var) {
                        oqiVar = qqiVar;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            oshVar = this.d;
            mrtVar.j = qqiVar;
            mrtVar.k = i2;
            mrtVar.n = 2;
            if (oshVar.z(mrtVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        mrtVar = new mrt(this, cg6Var);
        Object obj2 = mrtVar.l;
        nm6Var = nm6.a;
        i = mrtVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [fos, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r9v20, types: [oqi] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(fos fosVar, cg6 cg6Var) {
        rrt rrtVar;
        int i;
        rj6 rj6Var;
        oqi oqiVar;
        int i2;
        wc wcVar;
        osh oshVar;
        int intValue;
        rj6 rj6Var2;
        try {
            if (cg6Var instanceof rrt) {
                rrtVar = (rrt) cg6Var;
                int i3 = rrtVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    rrtVar.p = i3 - Integer.MIN_VALUE;
                    Object obj = rrtVar.n;
                    nm6 nm6Var = nm6.a;
                    i = rrtVar.p;
                    if (i != 0) {
                        qgg.h0(obj);
                        tc tcVar = (tc) this.b.invoke(fosVar);
                        rrtVar.p = 1;
                        obj = kg5.k(((AccountApi) tcVar.a.getValue()).a(null), rrtVar);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oqi oqiVar2 = rrtVar.l;
                                rj6Var2 = rrtVar.j;
                                qgg.h0(obj);
                                fosVar = oqiVar2;
                                return rj6Var2;
                            }
                            int i4 = rrtVar.m;
                            oqiVar = rrtVar.l;
                            wcVar = rrtVar.k;
                            rj6 rj6Var3 = rrtVar.j;
                            qgg.h0(obj);
                            rj6Var = rj6Var3;
                            i2 = i4;
                            oqi oqiVar3 = oqiVar;
                            oshVar = this.d;
                            intValue = ((Number) this.c.invoke()).intValue();
                            rrtVar.j = rj6Var;
                            rrtVar.k = null;
                            rrtVar.l = oqiVar3;
                            rrtVar.m = i2;
                            rrtVar.p = 3;
                            if (oshVar.T(wcVar, intValue, rrtVar) != nm6Var) {
                                rj6Var2 = rj6Var;
                                fosVar = oqiVar3;
                                return rj6Var2;
                            }
                            return nm6Var;
                        }
                        qgg.h0(obj);
                    }
                    rj6Var = (rj6) obj;
                    if (!(rj6Var instanceof pj6)) {
                        ssg.a(3, "UserCenterImpl", "account status not received due to " + ((pj6) rj6Var).a(), null);
                        return rj6Var;
                    }
                    if (!(rj6Var instanceof qj6)) {
                        b6e.s();
                        return null;
                    }
                    wc wcVar2 = (wc) ((qj6) rj6Var).a;
                    v3w.l("received account status for user ", wcVar2.h(), 3, "UserCenterImpl", null);
                    rrtVar.j = rj6Var;
                    rrtVar.k = wcVar2;
                    oqiVar = this.h;
                    rrtVar.l = oqiVar;
                    i2 = 0;
                    rrtVar.m = 0;
                    rrtVar.p = 2;
                    if (oqiVar.a(rrtVar) != nm6Var) {
                        wcVar = wcVar2;
                        oqi oqiVar32 = oqiVar;
                        oshVar = this.d;
                        intValue = ((Number) this.c.invoke()).intValue();
                        rrtVar.j = rj6Var;
                        rrtVar.k = null;
                        rrtVar.l = oqiVar32;
                        rrtVar.m = i2;
                        rrtVar.p = 3;
                        if (oshVar.T(wcVar, intValue, rrtVar) != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
            }
            if (i != 0) {
            }
            rj6Var = (rj6) obj;
            if (!(rj6Var instanceof pj6)) {
            }
        } finally {
            fosVar.b(null);
        }
        rrtVar = new rrt(this, cg6Var);
        Object obj2 = rrtVar.n;
        nm6 nm6Var2 = nm6.a;
        i = rrtVar.p;
    }
}
