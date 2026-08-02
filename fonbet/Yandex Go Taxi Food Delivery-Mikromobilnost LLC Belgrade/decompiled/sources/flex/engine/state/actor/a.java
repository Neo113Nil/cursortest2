package flex.engine.state.actor;

import defpackage.a3m;
import defpackage.b2m;
import defpackage.b3m;
import defpackage.bvf0;
import defpackage.bzl;
import defpackage.c3m;
import defpackage.cjg0;
import defpackage.cvw;
import defpackage.d1m;
import defpackage.d3m;
import defpackage.dez;
import defpackage.dsg;
import defpackage.dyi0;
import defpackage.e3m;
import defpackage.ffx;
import defpackage.h0m;
import defpackage.i0m;
import defpackage.i3y;
import defpackage.i7x0;
import defpackage.ike;
import defpackage.j400;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jse;
import defpackage.kn2;
import defpackage.kq90;
import defpackage.l1o;
import defpackage.m0m;
import defpackage.me7;
import defpackage.n1m;
import defpackage.ny61;
import defpackage.o1m;
import defpackage.oju0;
import defpackage.ow50;
import defpackage.peo;
import defpackage.q370;
import defpackage.qje;
import defpackage.s0j0;
import defpackage.s7s0;
import defpackage.sjh;
import defpackage.t1m;
import defpackage.tje;
import defpackage.tjr;
import defpackage.tls;
import defpackage.tww0;
import defpackage.txl;
import defpackage.tzl;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.uzl;
import defpackage.vbe0;
import defpackage.vzl;
import defpackage.w511;
import defpackage.wbe0;
import defpackage.wls;
import defpackage.wzl;
import defpackage.xfz;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.z2m;
import defpackage.zjr;
import defpackage.zse;
import defpackage.zy11;
import flex.logger.FlexLogLevel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class a implements tww0, dez {
    public final bzl A;
    public long B;
    public final ConcurrentHashMap C;
    public final n0 D;
    public final zjr E;
    public final l1o a;
    public final m0m b;
    public final i7x0 c;
    public final jse w;
    public final List x;
    public final ow50 y;
    public final me7 z;

    public a(l1o l1oVar, m0m m0mVar, i7x0 i7x0Var, ike ikeVar, jse jseVar, List list, ow50 ow50Var, me7 me7Var, bzl bzlVar) {
        this.a = l1oVar;
        this.b = m0mVar;
        this.c = i7x0Var;
        this.w = jseVar;
        this.x = list;
        this.y = ow50Var;
        this.z = me7Var;
        this.A = bzlVar;
        sjh sjhVar = uyj.a;
        ike M = bvf0.M(ikeVar, (jse) zse.a.c);
        this.C = new ConcurrentHashMap();
        n0 c = ffx.c(0, 0, null, 7);
        this.D = c;
        e.H(M, new jqr(c, new DocumentLoadingActor$1(this, null), 3));
        this.E = new zjr(xfz.b(a.class.getSimpleName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, s0j0 s0j0Var, kq90 kq90Var, wbe0 wbe0Var, oju0 oju0Var, u1m u1mVar, ContinuationImpl continuationImpl) {
        DocumentLoadingActor$onPortionLoaded$1 documentLoadingActor$onPortionLoaded$1;
        DocumentLoadingActor$onPortionLoaded$1 documentLoadingActor$onPortionLoaded$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        ywl ywlVar;
        wbe0 wbe0Var2;
        ywl ywlVar2;
        oju0 oju0Var2;
        u1m u1mVar2;
        wzl wzlVar;
        int i2;
        j400 j400Var;
        DocumentLoadingActor$onPortionLoaded$2$1 documentLoadingActor$onPortionLoaded$2$1;
        aVar.getClass();
        if (continuationImpl instanceof DocumentLoadingActor$onPortionLoaded$1) {
            documentLoadingActor$onPortionLoaded$1 = (DocumentLoadingActor$onPortionLoaded$1) continuationImpl;
            int i3 = documentLoadingActor$onPortionLoaded$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                documentLoadingActor$onPortionLoaded$1.label = i3 - Integer.MIN_VALUE;
                documentLoadingActor$onPortionLoaded$12 = documentLoadingActor$onPortionLoaded$1;
                Object obj = documentLoadingActor$onPortionLoaded$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentLoadingActor$onPortionLoaded$12.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    xzl b = ((e3m) oju0Var.a).b();
                    aVar.h(u1mVar, s0j0Var, false);
                    wzl wzlVar2 = (wzl) s0j0Var.a;
                    if (!(wzlVar2 instanceof xzl)) {
                        if (!(wzlVar2 instanceof vzl)) {
                            if (wzlVar2 instanceof tzl) {
                                sjh sjhVar = uyj.a;
                                j400 j400Var2 = (j400) zse.a.b;
                                DocumentLoadingActor$onPortionLoaded$3 documentLoadingActor$onPortionLoaded$3 = new DocumentLoadingActor$onPortionLoaded$3(oju0Var, u1mVar, wbe0Var, wzlVar2, null);
                                documentLoadingActor$onPortionLoaded$12.L$0 = null;
                                documentLoadingActor$onPortionLoaded$12.L$1 = null;
                                documentLoadingActor$onPortionLoaded$12.L$2 = null;
                                documentLoadingActor$onPortionLoaded$12.L$3 = null;
                                documentLoadingActor$onPortionLoaded$12.L$4 = null;
                                documentLoadingActor$onPortionLoaded$12.L$5 = null;
                                documentLoadingActor$onPortionLoaded$12.L$6 = null;
                                documentLoadingActor$onPortionLoaded$12.label = 3;
                                if (tje.k0(j400Var2, documentLoadingActor$onPortionLoaded$3, documentLoadingActor$onPortionLoaded$12) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (!(wzlVar2 instanceof uzl)) {
                                w511.b();
                                return null;
                            }
                        }
                        return zy11Var;
                    }
                    if (b != null && (ywlVar = b.a) != null) {
                        ywl ywlVar3 = ((xzl) wzlVar2).a;
                        List list = aVar.x;
                        List singletonList = Collections.singletonList(kq90Var);
                        jse jseVar = aVar.w;
                        txl txlVar = aVar.a.b;
                        documentLoadingActor$onPortionLoaded$12.L$0 = null;
                        documentLoadingActor$onPortionLoaded$12.L$1 = null;
                        documentLoadingActor$onPortionLoaded$12.L$2 = wbe0Var;
                        documentLoadingActor$onPortionLoaded$12.L$3 = oju0Var;
                        documentLoadingActor$onPortionLoaded$12.L$4 = u1mVar;
                        documentLoadingActor$onPortionLoaded$12.L$5 = null;
                        documentLoadingActor$onPortionLoaded$12.L$6 = wzlVar2;
                        documentLoadingActor$onPortionLoaded$12.L$7 = ywlVar;
                        documentLoadingActor$onPortionLoaded$12.L$8 = null;
                        documentLoadingActor$onPortionLoaded$12.I$0 = 0;
                        documentLoadingActor$onPortionLoaded$12.label = 1;
                        obj = flex.engine.state.actor.internal.a.a(ywlVar, ywlVar3, ywlVar, list, singletonList, jseVar, txlVar, aVar, documentLoadingActor$onPortionLoaded$12);
                        if (obj != coroutineSingletons) {
                            wbe0Var2 = wbe0Var;
                            ywlVar2 = ywlVar;
                            oju0Var2 = oju0Var;
                            u1mVar2 = u1mVar;
                            wzlVar = wzlVar2;
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i == 2) {
                    } else if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                i2 = documentLoadingActor$onPortionLoaded$12.I$0;
                ywlVar2 = (ywl) documentLoadingActor$onPortionLoaded$12.L$7;
                wzl wzlVar3 = (wzl) documentLoadingActor$onPortionLoaded$12.L$6;
                u1m u1mVar3 = (u1m) documentLoadingActor$onPortionLoaded$12.L$4;
                oju0 oju0Var3 = (oju0) documentLoadingActor$onPortionLoaded$12.L$3;
                wbe0 wbe0Var3 = (wbe0) documentLoadingActor$onPortionLoaded$12.L$2;
                b.b(obj);
                wzlVar = wzlVar3;
                u1mVar2 = u1mVar3;
                oju0Var2 = oju0Var3;
                wbe0Var2 = wbe0Var3;
                ywl ywlVar4 = (ywl) obj;
                sjh sjhVar2 = uyj.a;
                j400Var = (j400) zse.a.b;
                documentLoadingActor$onPortionLoaded$2$1 = new DocumentLoadingActor$onPortionLoaded$2$1(oju0Var2, u1mVar2, wbe0Var2, wzlVar, ywlVar4, null);
                documentLoadingActor$onPortionLoaded$12.L$0 = null;
                documentLoadingActor$onPortionLoaded$12.L$1 = null;
                documentLoadingActor$onPortionLoaded$12.L$2 = null;
                documentLoadingActor$onPortionLoaded$12.L$3 = null;
                documentLoadingActor$onPortionLoaded$12.L$4 = null;
                documentLoadingActor$onPortionLoaded$12.L$5 = null;
                documentLoadingActor$onPortionLoaded$12.L$6 = null;
                documentLoadingActor$onPortionLoaded$12.L$7 = ywlVar2;
                documentLoadingActor$onPortionLoaded$12.L$8 = null;
                documentLoadingActor$onPortionLoaded$12.L$9 = null;
                documentLoadingActor$onPortionLoaded$12.I$0 = i2;
                documentLoadingActor$onPortionLoaded$12.label = 2;
                if (tje.k0(j400Var, documentLoadingActor$onPortionLoaded$2$1, documentLoadingActor$onPortionLoaded$12) == coroutineSingletons) {
                    return zy11Var;
                }
            }
        }
        documentLoadingActor$onPortionLoaded$1 = new DocumentLoadingActor$onPortionLoaded$1(aVar, continuationImpl);
        documentLoadingActor$onPortionLoaded$12 = documentLoadingActor$onPortionLoaded$1;
        Object obj2 = documentLoadingActor$onPortionLoaded$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentLoadingActor$onPortionLoaded$12.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        ywl ywlVar42 = (ywl) obj2;
        sjh sjhVar22 = uyj.a;
        j400Var = (j400) zse.a.b;
        documentLoadingActor$onPortionLoaded$2$1 = new DocumentLoadingActor$onPortionLoaded$2$1(oju0Var2, u1mVar2, wbe0Var2, wzlVar, ywlVar42, null);
        documentLoadingActor$onPortionLoaded$12.L$0 = null;
        documentLoadingActor$onPortionLoaded$12.L$1 = null;
        documentLoadingActor$onPortionLoaded$12.L$2 = null;
        documentLoadingActor$onPortionLoaded$12.L$3 = null;
        documentLoadingActor$onPortionLoaded$12.L$4 = null;
        documentLoadingActor$onPortionLoaded$12.L$5 = null;
        documentLoadingActor$onPortionLoaded$12.L$6 = null;
        documentLoadingActor$onPortionLoaded$12.L$7 = ywlVar2;
        documentLoadingActor$onPortionLoaded$12.L$8 = null;
        documentLoadingActor$onPortionLoaded$12.L$9 = null;
        documentLoadingActor$onPortionLoaded$12.I$0 = i2;
        documentLoadingActor$onPortionLoaded$12.label = 2;
        if (tje.k0(j400Var, documentLoadingActor$onPortionLoaded$2$1, documentLoadingActor$onPortionLoaded$12) == coroutineSingletons) {
        }
    }

    public static i3y f(u1m u1mVar, ywl ywlVar, Boolean bool) {
        return xfz.a(xfz.d(u1mVar != null ? u1mVar.a : null, "targetQueryPath"), xfz.d(u1mVar != null ? u1mVar.b : null, "targetQueryParams"), xfz.d(bool, "isLoadingRequired"), new Pair("hasPreviewDocument", Boolean.valueOf(ywlVar != null)));
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (defpackage.jl40.l(((defpackage.c3m) r3).c, ((defpackage.cjg0) r2).a) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b9, code lost:
    
        if (defpackage.jl40.l(((defpackage.b3m) r3).c, ((defpackage.cjg0) r2).a) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    @Override // defpackage.tww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oju0 oju0Var, peo peoVar, Continuation continuation) {
        boolean z;
        cjg0 cjg0Var;
        Object d;
        StackTraceElement stackTraceElement;
        String str;
        Integer num;
        String num2;
        StackTraceElement stackTraceElement2;
        String num3;
        boolean z2 = peoVar instanceof o1m;
        zy11 zy11Var = zy11.a;
        if (z2) {
            n1m n1mVar = ((o1m) peoVar).a;
            boolean z3 = n1mVar instanceof dyi0;
            String str2 = "No line info";
            EmptyList emptyList = EmptyList.a;
            zjr zjrVar = this.E;
            tjr tjrVar = tjr.d;
            if (z3) {
                dyi0 dyi0Var = (dyi0) n1mVar;
                i3y f = f(dyi0Var.b, dyi0Var.a.a, null);
                s7s0 s7s0Var = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement2.getFileName();
                    str = fileName != null ? fileName : "No file info";
                    String methodName = stackTraceElement2.getMethodName();
                    Integer num4 = new Integer(stackTraceElement2.getLineNumber());
                    num = num4.intValue() > 0 ? num4 : null;
                    if (num != null && (num3 = num.toString()) != null) {
                        str2 = num3;
                    }
                    tjrVar = new tjr(str, methodName, str2);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "Handled Rendered origin changed event", f, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            } else {
                if (!(n1mVar instanceof cjg0)) {
                    w511.b();
                    return null;
                }
                e3m e3mVar = (e3m) oju0Var.a;
                if (!(e3mVar instanceof a3m) && !(e3mVar instanceof z2m)) {
                    if (!(e3mVar instanceof c3m)) {
                        if (!(e3mVar instanceof b3m)) {
                            if (!(e3mVar instanceof d3m)) {
                                w511.b();
                                return null;
                            }
                        }
                    }
                    cjg0Var = (cjg0) n1mVar;
                    ywl ywlVar = cjg0Var.b;
                    i3y f2 = f(cjg0Var.a, ywlVar, Boolean.valueOf(z));
                    s7s0 s7s0Var2 = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName2 = stackTraceElement.getFileName();
                        str = fileName2 != null ? fileName2 : "No file info";
                        String methodName2 = stackTraceElement.getMethodName();
                        Integer num5 = new Integer(stackTraceElement.getLineNumber());
                        num = num5.intValue() > 0 ? num5 : null;
                        if (num != null && (num2 = num.toString()) != null) {
                            str2 = num2;
                        }
                        tjrVar = new tjr(str, methodName2, str2);
                    }
                    zjrVar.d(FlexLogLevel.DEBUG, "Handled Queried origin changed event", f2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                    if (!z || cjg0Var.c) {
                        u1m u1mVar = cjg0Var.a;
                        oju0Var.b(new d1m(ywlVar, u1mVar));
                        d = d(oju0Var, u1mVar, cjg0Var.d, false, cjg0Var.c, false, (ContinuationImpl) continuation);
                    }
                }
                z = true;
                cjg0Var = (cjg0) n1mVar;
                ywl ywlVar2 = cjg0Var.b;
                i3y f22 = f(cjg0Var.a, ywlVar2, Boolean.valueOf(z));
                s7s0 s7s0Var22 = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue()) {
                    String fileName22 = stackTraceElement.getFileName();
                    if (fileName22 != null) {
                    }
                    String methodName22 = stackTraceElement.getMethodName();
                    Integer num52 = new Integer(stackTraceElement.getLineNumber());
                    if (num52.intValue() > 0) {
                    }
                    if (num != null) {
                        str2 = num2;
                    }
                    tjrVar = new tjr(str, methodName22, str2);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "Handled Queried origin changed event", f22, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                if (!z) {
                }
                u1m u1mVar2 = cjg0Var.a;
                oju0Var.b(new d1m(ywlVar2, u1mVar2));
                d = d(oju0Var, u1mVar2, cjg0Var.d, false, cjg0Var.c, false, (ContinuationImpl) continuation);
            }
            d = zy11Var;
            if (d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return d;
            }
        } else if (peoVar instanceof b2m) {
            Object i = i(oju0Var, (b2m) peoVar, (ContinuationImpl) continuation);
            if (i == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return i;
            }
        } else if (peoVar instanceof i0m) {
            i0m i0mVar = (i0m) peoVar;
            Object e = e(i0mVar.a, oju0Var, i0mVar.b, i0mVar.c, i0mVar.d, (ContinuationImpl) continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (e != coroutineSingletons) {
                e = zy11Var;
            }
            if (e == coroutineSingletons) {
                return e;
            }
        } else if (peoVar instanceof t1m) {
            throw null;
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oju0 oju0Var, u1m u1mVar, List list, boolean z, boolean z2, boolean z3, ContinuationImpl continuationImpl) {
        DocumentLoadingActor$fetchDocument$1 documentLoadingActor$fetchDocument$1;
        int i;
        boolean z4;
        boolean z5;
        wls wlsVar;
        u1m u1mVar2;
        boolean z6;
        ywl ywlVar;
        tls tlsVar;
        a aVar = this;
        if (continuationImpl instanceof DocumentLoadingActor$fetchDocument$1) {
            documentLoadingActor$fetchDocument$1 = (DocumentLoadingActor$fetchDocument$1) continuationImpl;
            int i2 = documentLoadingActor$fetchDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentLoadingActor$fetchDocument$1.label = i2 - Integer.MIN_VALUE;
                DocumentLoadingActor$fetchDocument$1 documentLoadingActor$fetchDocument$12 = documentLoadingActor$fetchDocument$1;
                Object obj = documentLoadingActor$fetchDocument$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentLoadingActor$fetchDocument$12.label;
                zy11 zy11Var = zy11.a;
                Map map = null;
                if (i != 0) {
                    b.b(obj);
                    xzl b = ((e3m) oju0Var.a).b();
                    ywl ywlVar2 = b != null ? b.a : null;
                    if (ywlVar2 != null) {
                        ywl ywlVar3 = !z3 ? ywlVar2 : null;
                        if (ywlVar3 != null) {
                            ywlVar2 = ywl.a(ywlVar3, null, null, null, null, 47);
                        }
                    }
                    ywl ywlVar4 = ywlVar2;
                    DocumentLoadingActor$fetchDocument$modifyFetchOutput$1 documentLoadingActor$fetchDocument$modifyFetchOutput$1 = new DocumentLoadingActor$fetchDocument$modifyFetchOutput$1(ywlVar4, this, u1mVar, list, null);
                    kn2 kn2Var = new kn2(8, oju0Var, u1mVar);
                    aVar = this;
                    z4 = z;
                    DocumentLoadingActor$fetchDocument$onDocumentFetchSuccess$1 documentLoadingActor$fetchDocument$onDocumentFetchSuccess$1 = new DocumentLoadingActor$fetchDocument$onDocumentFetchSuccess$1(aVar, u1mVar, z4, oju0Var, documentLoadingActor$fetchDocument$modifyFetchOutput$1, null);
                    documentLoadingActor$fetchDocument$12.L$0 = null;
                    documentLoadingActor$fetchDocument$12.L$1 = u1mVar;
                    documentLoadingActor$fetchDocument$12.L$2 = null;
                    documentLoadingActor$fetchDocument$12.L$3 = ywlVar4;
                    documentLoadingActor$fetchDocument$12.L$4 = null;
                    documentLoadingActor$fetchDocument$12.L$5 = kn2Var;
                    documentLoadingActor$fetchDocument$12.L$6 = documentLoadingActor$fetchDocument$onDocumentFetchSuccess$1;
                    documentLoadingActor$fetchDocument$12.Z$0 = z4;
                    z5 = z2;
                    documentLoadingActor$fetchDocument$12.Z$1 = z5;
                    documentLoadingActor$fetchDocument$12.Z$2 = z3;
                    documentLoadingActor$fetchDocument$12.label = 1;
                    Object g = aVar.g(u1mVar, new wbe0(3, map, map), documentLoadingActor$fetchDocument$12);
                    if (g != coroutineSingletons) {
                        wlsVar = documentLoadingActor$fetchDocument$onDocumentFetchSuccess$1;
                        obj = g;
                        u1mVar2 = u1mVar;
                        z6 = z3;
                        ywlVar = ywlVar4;
                        tlsVar = kn2Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                z6 = documentLoadingActor$fetchDocument$12.Z$2;
                boolean z7 = documentLoadingActor$fetchDocument$12.Z$1;
                boolean z8 = documentLoadingActor$fetchDocument$12.Z$0;
                wlsVar = (wls) documentLoadingActor$fetchDocument$12.L$6;
                tlsVar = (tls) documentLoadingActor$fetchDocument$12.L$5;
                ywlVar = (ywl) documentLoadingActor$fetchDocument$12.L$3;
                u1mVar2 = (u1m) documentLoadingActor$fetchDocument$12.L$1;
                b.b(obj);
                z5 = z7;
                z4 = z8;
                DocumentLoadingActor$fetchDocument$2 documentLoadingActor$fetchDocument$2 = new DocumentLoadingActor$fetchDocument$2(aVar, u1mVar2, ywlVar, z4, z5, null);
                dsg dsgVar = new dsg(14);
                DocumentLoadingActor$fetchDocument$4 documentLoadingActor$fetchDocument$4 = new DocumentLoadingActor$fetchDocument$4(aVar, u1mVar2, null);
                DocumentLoadingActor$fetchDocument$5 documentLoadingActor$fetchDocument$5 = new DocumentLoadingActor$fetchDocument$5(2, tlsVar, cvw.class, "suspendConversion0", "fetchDocument$suspendConversion0(Lkotlin/jvm/functions/Function1;Lflex/utils/kotlin/RepeatableTaskResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                documentLoadingActor$fetchDocument$12.L$0 = null;
                documentLoadingActor$fetchDocument$12.L$1 = null;
                documentLoadingActor$fetchDocument$12.L$2 = null;
                documentLoadingActor$fetchDocument$12.L$3 = null;
                documentLoadingActor$fetchDocument$12.L$4 = null;
                documentLoadingActor$fetchDocument$12.L$5 = null;
                documentLoadingActor$fetchDocument$12.L$6 = null;
                documentLoadingActor$fetchDocument$12.Z$0 = z4;
                documentLoadingActor$fetchDocument$12.Z$1 = z5;
                documentLoadingActor$fetchDocument$12.Z$2 = z6;
                documentLoadingActor$fetchDocument$12.label = 2;
                ((flex.utils.kotlin.a) obj).b(documentLoadingActor$fetchDocument$2, dsgVar, wlsVar, documentLoadingActor$fetchDocument$4, documentLoadingActor$fetchDocument$5);
                return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        documentLoadingActor$fetchDocument$1 = new DocumentLoadingActor$fetchDocument$1(aVar, continuationImpl);
        DocumentLoadingActor$fetchDocument$1 documentLoadingActor$fetchDocument$122 = documentLoadingActor$fetchDocument$1;
        Object obj2 = documentLoadingActor$fetchDocument$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentLoadingActor$fetchDocument$122.label;
        zy11 zy11Var2 = zy11.a;
        Map map2 = null;
        if (i != 0) {
        }
        DocumentLoadingActor$fetchDocument$2 documentLoadingActor$fetchDocument$22 = new DocumentLoadingActor$fetchDocument$2(aVar, u1mVar2, ywlVar, z4, z5, null);
        dsg dsgVar2 = new dsg(14);
        DocumentLoadingActor$fetchDocument$4 documentLoadingActor$fetchDocument$42 = new DocumentLoadingActor$fetchDocument$4(aVar, u1mVar2, null);
        DocumentLoadingActor$fetchDocument$5 documentLoadingActor$fetchDocument$52 = new DocumentLoadingActor$fetchDocument$5(2, tlsVar, cvw.class, "suspendConversion0", "fetchDocument$suspendConversion0(Lkotlin/jvm/functions/Function1;Lflex/utils/kotlin/RepeatableTaskResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        documentLoadingActor$fetchDocument$122.L$0 = null;
        documentLoadingActor$fetchDocument$122.L$1 = null;
        documentLoadingActor$fetchDocument$122.L$2 = null;
        documentLoadingActor$fetchDocument$122.L$3 = null;
        documentLoadingActor$fetchDocument$122.L$4 = null;
        documentLoadingActor$fetchDocument$122.L$5 = null;
        documentLoadingActor$fetchDocument$122.L$6 = null;
        documentLoadingActor$fetchDocument$122.Z$0 = z4;
        documentLoadingActor$fetchDocument$122.Z$1 = z5;
        documentLoadingActor$fetchDocument$122.Z$2 = z6;
        documentLoadingActor$fetchDocument$122.label = 2;
        ((flex.utils.kotlin.a) obj2).b(documentLoadingActor$fetchDocument$22, dsgVar2, wlsVar, documentLoadingActor$fetchDocument$42, documentLoadingActor$fetchDocument$52);
        if (zy11Var2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r1v5, types: [wls] */
    /* JADX WARN: Type inference failed for: r2v8, types: [wls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kq90 kq90Var, oju0 oju0Var, u1m u1mVar, wbe0 wbe0Var, q370 q370Var, ContinuationImpl continuationImpl) {
        DocumentLoadingActor$fetchPortion$1 documentLoadingActor$fetchPortion$1;
        int i;
        wbe0 wbe0Var2;
        q370 q370Var2;
        kq90 kq90Var2;
        DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1 documentLoadingActor$fetchPortion$onPortionFetchSuccess$1;
        DocumentLoadingActor$fetchPortion$onRepeatFailed$1 documentLoadingActor$fetchPortion$onRepeatFailed$1;
        u1m u1mVar2;
        a aVar = this;
        if (continuationImpl instanceof DocumentLoadingActor$fetchPortion$1) {
            documentLoadingActor$fetchPortion$1 = (DocumentLoadingActor$fetchPortion$1) continuationImpl;
            int i2 = documentLoadingActor$fetchPortion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentLoadingActor$fetchPortion$1.label = i2 - Integer.MIN_VALUE;
                DocumentLoadingActor$fetchPortion$1 documentLoadingActor$fetchPortion$12 = documentLoadingActor$fetchPortion$1;
                Object obj = documentLoadingActor$fetchPortion$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentLoadingActor$fetchPortion$12.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    oju0Var.b(new vbe0(u1mVar, wbe0Var));
                    DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1 documentLoadingActor$fetchPortion$onPortionFetchSuccess$12 = new DocumentLoadingActor$fetchPortion$onPortionFetchSuccess$1(u1mVar, kq90Var, wbe0Var, oju0Var, aVar, null);
                    aVar = this;
                    wbe0Var2 = wbe0Var;
                    DocumentLoadingActor$fetchPortion$onRepeatFailed$1 documentLoadingActor$fetchPortion$onRepeatFailed$12 = new DocumentLoadingActor$fetchPortion$onRepeatFailed$1(u1mVar, kq90Var, wbe0Var2, oju0Var, aVar, null);
                    documentLoadingActor$fetchPortion$12.L$0 = kq90Var;
                    documentLoadingActor$fetchPortion$12.L$1 = null;
                    documentLoadingActor$fetchPortion$12.L$2 = u1mVar;
                    documentLoadingActor$fetchPortion$12.L$3 = wbe0Var2;
                    q370Var2 = q370Var;
                    documentLoadingActor$fetchPortion$12.L$4 = q370Var2;
                    documentLoadingActor$fetchPortion$12.L$5 = documentLoadingActor$fetchPortion$onPortionFetchSuccess$12;
                    documentLoadingActor$fetchPortion$12.L$6 = documentLoadingActor$fetchPortion$onRepeatFailed$12;
                    documentLoadingActor$fetchPortion$12.label = 1;
                    Object g = aVar.g(u1mVar, wbe0Var2, documentLoadingActor$fetchPortion$12);
                    if (g != coroutineSingletons) {
                        kq90Var2 = kq90Var;
                        documentLoadingActor$fetchPortion$onPortionFetchSuccess$1 = documentLoadingActor$fetchPortion$onPortionFetchSuccess$12;
                        documentLoadingActor$fetchPortion$onRepeatFailed$1 = documentLoadingActor$fetchPortion$onRepeatFailed$12;
                        u1mVar2 = u1mVar;
                        obj = g;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                ?? r1 = (wls) documentLoadingActor$fetchPortion$12.L$6;
                ?? r2 = (wls) documentLoadingActor$fetchPortion$12.L$5;
                q370 q370Var3 = (q370) documentLoadingActor$fetchPortion$12.L$4;
                wbe0 wbe0Var3 = (wbe0) documentLoadingActor$fetchPortion$12.L$3;
                u1m u1mVar3 = (u1m) documentLoadingActor$fetchPortion$12.L$2;
                kq90Var2 = (kq90) documentLoadingActor$fetchPortion$12.L$0;
                b.b(obj);
                q370Var2 = q370Var3;
                wbe0Var2 = wbe0Var3;
                documentLoadingActor$fetchPortion$onRepeatFailed$1 = r1;
                documentLoadingActor$fetchPortion$onPortionFetchSuccess$1 = r2;
                u1mVar2 = u1mVar3;
                flex.utils.kotlin.a aVar2 = (flex.utils.kotlin.a) obj;
                a aVar3 = aVar;
                DocumentLoadingActor$fetchPortion$2 documentLoadingActor$fetchPortion$2 = new DocumentLoadingActor$fetchPortion$2(aVar3, u1mVar2, wbe0Var2, q370Var2, kq90Var2, null);
                dsg dsgVar = new dsg(15);
                DocumentLoadingActor$fetchPortion$4 documentLoadingActor$fetchPortion$4 = new DocumentLoadingActor$fetchPortion$4(aVar3, u1mVar2, null);
                documentLoadingActor$fetchPortion$12.L$0 = null;
                documentLoadingActor$fetchPortion$12.L$1 = null;
                documentLoadingActor$fetchPortion$12.L$2 = null;
                documentLoadingActor$fetchPortion$12.L$3 = null;
                documentLoadingActor$fetchPortion$12.L$4 = null;
                documentLoadingActor$fetchPortion$12.L$5 = null;
                documentLoadingActor$fetchPortion$12.L$6 = null;
                documentLoadingActor$fetchPortion$12.label = 2;
                aVar2.b(documentLoadingActor$fetchPortion$2, dsgVar, documentLoadingActor$fetchPortion$onPortionFetchSuccess$1, documentLoadingActor$fetchPortion$4, documentLoadingActor$fetchPortion$onRepeatFailed$1);
                return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        documentLoadingActor$fetchPortion$1 = new DocumentLoadingActor$fetchPortion$1(aVar, continuationImpl);
        DocumentLoadingActor$fetchPortion$1 documentLoadingActor$fetchPortion$122 = documentLoadingActor$fetchPortion$1;
        Object obj2 = documentLoadingActor$fetchPortion$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentLoadingActor$fetchPortion$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        flex.utils.kotlin.a aVar22 = (flex.utils.kotlin.a) obj2;
        a aVar32 = aVar;
        DocumentLoadingActor$fetchPortion$2 documentLoadingActor$fetchPortion$22 = new DocumentLoadingActor$fetchPortion$2(aVar32, u1mVar2, wbe0Var2, q370Var2, kq90Var2, null);
        dsg dsgVar2 = new dsg(15);
        DocumentLoadingActor$fetchPortion$4 documentLoadingActor$fetchPortion$42 = new DocumentLoadingActor$fetchPortion$4(aVar32, u1mVar2, null);
        documentLoadingActor$fetchPortion$122.L$0 = null;
        documentLoadingActor$fetchPortion$122.L$1 = null;
        documentLoadingActor$fetchPortion$122.L$2 = null;
        documentLoadingActor$fetchPortion$122.L$3 = null;
        documentLoadingActor$fetchPortion$122.L$4 = null;
        documentLoadingActor$fetchPortion$122.L$5 = null;
        documentLoadingActor$fetchPortion$122.L$6 = null;
        documentLoadingActor$fetchPortion$122.label = 2;
        aVar22.b(documentLoadingActor$fetchPortion$22, dsgVar2, documentLoadingActor$fetchPortion$onPortionFetchSuccess$1, documentLoadingActor$fetchPortion$42, documentLoadingActor$fetchPortion$onRepeatFailed$1);
        if (zy11Var2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(u1m u1mVar, wbe0 wbe0Var, ContinuationImpl continuationImpl) {
        DocumentLoadingActor$getDocumentReloadRepeatableTask$1 documentLoadingActor$getDocumentReloadRepeatableTask$1;
        int i;
        h0m h0mVar;
        if (continuationImpl instanceof DocumentLoadingActor$getDocumentReloadRepeatableTask$1) {
            documentLoadingActor$getDocumentReloadRepeatableTask$1 = (DocumentLoadingActor$getDocumentReloadRepeatableTask$1) continuationImpl;
            int i2 = documentLoadingActor$getDocumentReloadRepeatableTask$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentLoadingActor$getDocumentReloadRepeatableTask$1.label = i2 - Integer.MIN_VALUE;
                Object obj = documentLoadingActor$getDocumentReloadRepeatableTask$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentLoadingActor$getDocumentReloadRepeatableTask$1.label;
                if (i != 0) {
                    b.b(obj);
                    h0m h0mVar2 = new h0m(u1mVar, wbe0Var);
                    flex.utils.kotlin.a aVar = (flex.utils.kotlin.a) this.C.get(h0mVar2);
                    if (aVar != null) {
                        return aVar;
                    }
                    documentLoadingActor$getDocumentReloadRepeatableTask$1.L$0 = null;
                    documentLoadingActor$getDocumentReloadRepeatableTask$1.L$1 = null;
                    documentLoadingActor$getDocumentReloadRepeatableTask$1.L$2 = h0mVar2;
                    documentLoadingActor$getDocumentReloadRepeatableTask$1.L$3 = this;
                    documentLoadingActor$getDocumentReloadRepeatableTask$1.I$0 = 0;
                    documentLoadingActor$getDocumentReloadRepeatableTask$1.label = 1;
                    this.y.getClass();
                    Pair pair = new Pair(new Integer(1), new Long(0L));
                    flex.utils.kotlin.a aVar2 = new flex.utils.kotlin.a(bvf0.a(documentLoadingActor$getDocumentReloadRepeatableTask$1.get_context().plus(jl40.a())), ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).longValue());
                    if (aVar2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h0mVar = h0mVar2;
                    obj = aVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) documentLoadingActor$getDocumentReloadRepeatableTask$1.L$3;
                    h0mVar = (h0m) documentLoadingActor$getDocumentReloadRepeatableTask$1.L$2;
                    b.b(obj);
                }
                flex.utils.kotlin.a aVar3 = (flex.utils.kotlin.a) obj;
                this.C.put(h0mVar, aVar3);
                return aVar3;
            }
        }
        documentLoadingActor$getDocumentReloadRepeatableTask$1 = new DocumentLoadingActor$getDocumentReloadRepeatableTask$1(this, continuationImpl);
        Object obj2 = documentLoadingActor$getDocumentReloadRepeatableTask$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentLoadingActor$getDocumentReloadRepeatableTask$1.label;
        if (i != 0) {
        }
        flex.utils.kotlin.a aVar32 = (flex.utils.kotlin.a) obj2;
        this.C.put(h0mVar, aVar32);
        return aVar32;
    }

    public final void h(u1m u1mVar, s0j0 s0j0Var, boolean z) {
        StackTraceElement stackTraceElement;
        String str;
        Integer valueOf;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        boolean z2 = s0j0Var.c;
        int i = s0j0Var.b;
        if (!z2 || z) {
            wzl wzlVar = (wzl) s0j0Var.a;
            boolean z3 = wzlVar instanceof xzl;
            String str2 = "No line info";
            EmptyList emptyList = EmptyList.a;
            zjr zjrVar = this.E;
            bzl bzlVar = this.A;
            tjr tjrVar = tjr.d;
            if (z3 || (wzlVar instanceof vzl)) {
                if (bzlVar != null) {
                    bzlVar.a.d(u1mVar);
                }
                i3y a = xfz.a(new Pair("query", u1mVar), new Pair("retryIteration", Integer.valueOf(i)));
                s7s0 s7s0Var = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    str = fileName != null ? fileName : "No file info";
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf != null && (num = valueOf.toString()) != null) {
                        str2 = num;
                    }
                    tjrVar = new tjr(str, methodName, str2);
                }
                zjrVar.d(FlexLogLevel.INFO, "Request retry succeeded", a, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                return;
            }
            boolean z4 = wzlVar instanceof uzl;
            if (!z4 && !(wzlVar instanceof tzl)) {
                w511.b();
                return;
            }
            Throwable a2 = z4 ? ((uzl) wzlVar).a : wzlVar instanceof tzl ? ((tzl) wzlVar).a() : new Throwable();
            if (bzlVar != null) {
                bzlVar.a.q(u1mVar, a2);
            }
            i3y a3 = xfz.a(new Pair("query", u1mVar), new Pair("cause", a2), new Pair("retryIteration", Integer.valueOf(i)));
            s7s0 s7s0Var2 = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName2 = stackTraceElement2.getFileName();
                str = fileName2 != null ? fileName2 : "No file info";
                String methodName2 = stackTraceElement2.getMethodName();
                int lineNumber2 = stackTraceElement2.getLineNumber();
                valueOf = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                if (valueOf != null && (num2 = valueOf.toString()) != null) {
                    str2 = num2;
                }
                tjrVar = new tjr(str, methodName2, str2);
            }
            zjrVar.d(FlexLogLevel.INFO, "Request retry failed", a3, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r1.d(r12, r14, r4, r5, true, true, r8) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r8) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(oju0 oju0Var, b2m b2mVar, ContinuationImpl continuationImpl) {
        DocumentLoadingActor$onReloadDocument$1 documentLoadingActor$onReloadDocument$1;
        int i;
        u1m V;
        a aVar;
        if (continuationImpl instanceof DocumentLoadingActor$onReloadDocument$1) {
            documentLoadingActor$onReloadDocument$1 = (DocumentLoadingActor$onReloadDocument$1) continuationImpl;
            int i2 = documentLoadingActor$onReloadDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentLoadingActor$onReloadDocument$1.label = i2 - Integer.MIN_VALUE;
                DocumentLoadingActor$onReloadDocument$1 documentLoadingActor$onReloadDocument$12 = documentLoadingActor$onReloadDocument$1;
                Object obj = documentLoadingActor$onReloadDocument$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentLoadingActor$onReloadDocument$12.label;
                if (i != 0) {
                    b.b(obj);
                    V = qje.V((e3m) oju0Var.a);
                    if (V != null) {
                        oju0Var.b(new d1m(null, V));
                        i7x0 i7x0Var = this.c;
                        i7x0Var.a.remove("isPreload");
                        i7x0Var.d();
                        if (b2mVar.a) {
                            long currentTimeMillis = (this.B + 2000) - System.currentTimeMillis();
                            documentLoadingActor$onReloadDocument$12.L$0 = oju0Var;
                            documentLoadingActor$onReloadDocument$12.L$1 = b2mVar;
                            documentLoadingActor$onReloadDocument$12.L$2 = V;
                            documentLoadingActor$onReloadDocument$12.label = 1;
                        }
                        List list = b2mVar.b;
                        boolean z = b2mVar.a;
                        documentLoadingActor$onReloadDocument$12.L$0 = null;
                        documentLoadingActor$onReloadDocument$12.L$1 = null;
                        documentLoadingActor$onReloadDocument$12.L$2 = null;
                        documentLoadingActor$onReloadDocument$12.label = 2;
                        aVar = this;
                    }
                    aVar = this;
                    aVar.B = System.currentTimeMillis();
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    aVar = this;
                    aVar.B = System.currentTimeMillis();
                    return zy11.a;
                }
                u1m u1mVar = (u1m) documentLoadingActor$onReloadDocument$12.L$2;
                b2mVar = (b2m) documentLoadingActor$onReloadDocument$12.L$1;
                oju0 oju0Var2 = (oju0) documentLoadingActor$onReloadDocument$12.L$0;
                b.b(obj);
                V = u1mVar;
                oju0Var = oju0Var2;
                List list2 = b2mVar.b;
                boolean z2 = b2mVar.a;
                documentLoadingActor$onReloadDocument$12.L$0 = null;
                documentLoadingActor$onReloadDocument$12.L$1 = null;
                documentLoadingActor$onReloadDocument$12.L$2 = null;
                documentLoadingActor$onReloadDocument$12.label = 2;
                aVar = this;
            }
        }
        documentLoadingActor$onReloadDocument$1 = new DocumentLoadingActor$onReloadDocument$1(this, continuationImpl);
        DocumentLoadingActor$onReloadDocument$1 documentLoadingActor$onReloadDocument$122 = documentLoadingActor$onReloadDocument$1;
        Object obj2 = documentLoadingActor$onReloadDocument$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentLoadingActor$onReloadDocument$122.label;
        if (i != 0) {
        }
    }
}
