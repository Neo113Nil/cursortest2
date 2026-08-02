package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.AbstractC0341z0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.C0309v4;
import com.plaid.internal.D6;
import com.plaid.internal.N2;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.JsonImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0289t2 implements InterfaceC0298u2 {
    public final G2 a;
    public final Z2 b;
    public final Y2 c;
    public final y8 d;
    public final C8 e;
    public final x8 f;
    public final B8 g;
    public final A8 h;
    public final A0 i;

    public C0289t2(G2 g2, Z2 z2, Y2 y2, y8 y8Var, C8 c8, x8 x8Var, B8 b8, A8 a8, A0 a0) {
        g2.getClass();
        z2.getClass();
        y2.getClass();
        y8Var.getClass();
        c8.getClass();
        x8Var.getClass();
        b8.getClass();
        a8.getClass();
        a0.getClass();
        this.a = g2;
        this.b = z2;
        this.c = y2;
        this.d = y8Var;
        this.e = c8;
        this.f = x8Var;
        this.g = b8;
        this.h = a8;
        this.i = a0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        if (r2.a(r8, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (r8.a(r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r2.a(r8, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (r2.a(r8, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
    
        if (r8.a(r2, r0) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N2 n2, ContinuationImpl continuationImpl) {
        C0280s2 c0280s2;
        C0289t2 c0289t2;
        N2 n22;
        A a;
        Unit unit;
        N2.k kVar;
        Z2 z2;
        C0289t2 c0289t22;
        N2 n23;
        Object a2;
        G2 g2;
        if (continuationImpl instanceof C0280s2) {
            c0280s2 = (C0280s2) continuationImpl;
            int i = c0280s2.e;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                c0280s2.e = i - PKIFailureInfo.systemUnavail;
                Object obj = c0280s2.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (c0280s2.e) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        if (n2 instanceof N2.k) {
                            C8 c8 = this.e;
                            String str = ((N2.k) n2).f;
                            c0280s2.a = this;
                            c0280s2.b = n2;
                            c0280s2.e = 1;
                            break;
                        }
                        z2 = this.b;
                        c0280s2.a = this;
                        c0280s2.b = n2;
                        c0280s2.e = 6;
                        if (z2.a(n2, c0280s2) != coroutineSingletons) {
                            N2 n24 = n2;
                            c0289t22 = this;
                            n23 = n24;
                            G2 g22 = c0289t22.a;
                            A0 a0 = c0289t22.i;
                            c0280s2.a = g22;
                            c0280s2.b = null;
                            c0280s2.e = 7;
                            a2 = a0.a(n23, c0280s2);
                            if (a2 != coroutineSingletons) {
                                obj = a2;
                                g2 = g22;
                                AbstractC0341z0 abstractC0341z0 = (AbstractC0341z0) obj;
                                g2.getClass();
                                abstractC0341z0.getClass();
                                g2.a.postValue(abstractC0341z0);
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        n2 = c0280s2.b;
                        this = (C0289t2) c0280s2.a;
                        SafeTrace.throwOnFailure(obj);
                        N2.k kVar2 = (N2.k) n2;
                        if (kVar2.g.length() > 0) {
                            B8 b8 = this.g;
                            String str2 = kVar2.g;
                            c0280s2.a = this;
                            c0280s2.b = n2;
                            c0280s2.e = 2;
                            break;
                        }
                        N2 n25 = n2;
                        c0289t2 = this;
                        n22 = n25;
                        a = ((N2.k) n22).h;
                        if (a != null) {
                            unit = null;
                            if (unit == null) {
                                x8 x8Var = c0289t2.f;
                                c0280s2.a = c0289t2;
                                c0280s2.b = n22;
                                c0280s2.e = 4;
                                break;
                            }
                            C0289t2 c0289t23 = c0289t2;
                            n2 = n22;
                            this = c0289t23;
                            kVar = (N2.k) n2;
                            if (!kVar.j) {
                                A8 a8 = this.h;
                                boolean z = kVar.i;
                                c0280s2.a = this;
                                c0280s2.b = n2;
                                c0280s2.e = 5;
                                break;
                            }
                            z2 = this.b;
                            c0280s2.a = this;
                            c0280s2.b = n2;
                            c0280s2.e = 6;
                            if (z2.a(n2, c0280s2) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        x8 x8Var2 = c0289t2.f;
                        c0280s2.a = c0289t2;
                        c0280s2.b = n22;
                        c0280s2.e = 3;
                        break;
                        break;
                    case 2:
                        n22 = c0280s2.b;
                        c0289t2 = (C0289t2) c0280s2.a;
                        SafeTrace.throwOnFailure(obj);
                        a = ((N2.k) n22).h;
                        if (a != null) {
                        }
                        break;
                    case 3:
                        n22 = c0280s2.b;
                        c0289t2 = (C0289t2) c0280s2.a;
                        SafeTrace.throwOnFailure(obj);
                        unit = Unit.INSTANCE;
                        if (unit == null) {
                        }
                        C0289t2 c0289t232 = c0289t2;
                        n2 = n22;
                        this = c0289t232;
                        kVar = (N2.k) n2;
                        if (!kVar.j) {
                        }
                        z2 = this.b;
                        c0280s2.a = this;
                        c0280s2.b = n2;
                        c0280s2.e = 6;
                        if (z2.a(n2, c0280s2) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        n22 = c0280s2.b;
                        c0289t2 = (C0289t2) c0280s2.a;
                        SafeTrace.throwOnFailure(obj);
                        C0289t2 c0289t2322 = c0289t2;
                        n2 = n22;
                        this = c0289t2322;
                        kVar = (N2.k) n2;
                        if (!kVar.j) {
                        }
                        z2 = this.b;
                        c0280s2.a = this;
                        c0280s2.b = n2;
                        c0280s2.e = 6;
                        if (z2.a(n2, c0280s2) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        n2 = c0280s2.b;
                        this = (C0289t2) c0280s2.a;
                        SafeTrace.throwOnFailure(obj);
                        z2 = this.b;
                        c0280s2.a = this;
                        c0280s2.b = n2;
                        c0280s2.e = 6;
                        if (z2.a(n2, c0280s2) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 6:
                        n23 = c0280s2.b;
                        c0289t22 = (C0289t2) c0280s2.a;
                        SafeTrace.throwOnFailure(obj);
                        G2 g222 = c0289t22.a;
                        A0 a02 = c0289t22.i;
                        c0280s2.a = g222;
                        c0280s2.b = null;
                        c0280s2.e = 7;
                        a2 = a02.a(n23, c0280s2);
                        if (a2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 7:
                        g2 = (G2) c0280s2.a;
                        SafeTrace.throwOnFailure(obj);
                        AbstractC0341z0 abstractC0341z02 = (AbstractC0341z0) obj;
                        g2.getClass();
                        abstractC0341z02.getClass();
                        g2.a.postValue(abstractC0341z02);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        c0280s2 = new C0280s2(this, continuationImpl);
        Object obj2 = c0280s2.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (c0280s2.e) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (r8.a(r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.plaid.internal.InterfaceC0298u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C0271r2 c0271r2;
        int i;
        if (continuationImpl instanceof C0271r2) {
            c0271r2 = (C0271r2) continuationImpl;
            int i2 = c0271r2.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0271r2.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0271r2.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0271r2.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Z2 z2 = this.b;
                    c0271r2.a = this;
                    c0271r2.d = 1;
                    obj = z2.a(c0271r2);
                } else if (i == 1) {
                    this = c0271r2.a;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = c0271r2.a;
                    SafeTrace.throwOnFailure(obj);
                    N2 n2 = (N2) obj;
                    C0095a6.a.a(C0095a6.a, "Start next " + n2);
                    c0271r2.a = null;
                    c0271r2.d = 3;
                }
                N2 n22 = (N2) obj;
                C0095a6.a.a(C0095a6.a, "Start from " + n22);
                Y2 y2 = this.c;
                c0271r2.a = this;
                c0271r2.d = 2;
                obj = y2.a(n22, false, (ContinuationImpl) c0271r2);
            }
        }
        c0271r2 = new C0271r2(this, continuationImpl);
        Object obj2 = c0271r2.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0271r2.d;
        if (i != 0) {
        }
        N2 n222 = (N2) obj2;
        C0095a6.a.a(C0095a6.a, "Start from " + n222);
        Y2 y22 = this.c;
        c0271r2.a = this;
        c0271r2.d = 2;
        obj2 = y22.a(n222, false, (ContinuationImpl) c0271r2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c6, code lost:
    
        if (r9.a(r11, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (r11 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (r11 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.plaid.internal.InterfaceC0298u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(D6 d6, ContinuationImpl continuationImpl) {
        C0263q2 c0263q2;
        int i;
        N2 n2;
        C0289t2 c0289t2;
        N2 n22;
        if (continuationImpl instanceof C0263q2) {
            c0263q2 = (C0263q2) continuationImpl;
            int i2 = c0263q2.f;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0263q2.f = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0263q2.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0263q2.f;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Z2 z2 = this.b;
                    c0263q2.a = this;
                    c0263q2.b = d6;
                    c0263q2.f = 1;
                    obj = z2.a(c0263q2);
                } else if (i == 1) {
                    d6 = c0263q2.b;
                    this = c0263q2.a;
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    n22 = c0263q2.c;
                    d6 = c0263q2.b;
                    c0289t2 = c0263q2.a;
                    SafeTrace.throwOnFailure(obj);
                    n2 = n22;
                    this = c0289t2;
                    Y2 y2 = this.c;
                    c0263q2.a = this;
                    c0263q2.b = null;
                    c0263q2.c = null;
                    c0263q2.f = 3;
                    obj = y2.a(n2, d6, c0263q2);
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = c0263q2.a;
                    SafeTrace.throwOnFailure(obj);
                    N2 n23 = (N2) obj;
                    C0095a6.a.a(C0095a6.a, "Resume next " + n23);
                    c0263q2.a = null;
                    c0263q2.f = 4;
                }
                n2 = (N2) obj;
                C0095a6.a.a(C0095a6.a, "Resume from " + n2);
                if (d6 instanceof D6.a) {
                    y8 y8Var = this.d;
                    String a = ((D6.a) d6).a();
                    c0263q2.a = this;
                    c0263q2.b = d6;
                    c0263q2.c = n2;
                    c0263q2.f = 2;
                    if (y8Var.a(a, c0263q2) != coroutineSingletons) {
                        c0289t2 = this;
                        n22 = n2;
                        n2 = n22;
                        this = c0289t2;
                    }
                    return coroutineSingletons;
                }
                Y2 y22 = this.c;
                c0263q2.a = this;
                c0263q2.b = null;
                c0263q2.c = null;
                c0263q2.f = 3;
                obj = y22.a(n2, d6, c0263q2);
            }
        }
        c0263q2 = new C0263q2(this, continuationImpl);
        Object obj2 = c0263q2.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0263q2.f;
        if (i != 0) {
        }
        n2 = (N2) obj2;
        C0095a6.a.a(C0095a6.a, "Resume from " + n2);
        if (d6 instanceof D6.a) {
        }
        Y2 y222 = this.c;
        c0263q2.a = this;
        c0263q2.b = null;
        c0263q2.c = null;
        c0263q2.f = 3;
        obj2 = y222.a(n2, d6, c0263q2);
    }

    @Override // com.plaid.internal.InterfaceC0298u2
    public final void a(LinkResult linkResult) {
        Object dVar;
        linkResult.getClass();
        G2 g2 = this.a;
        if (linkResult instanceof LinkSuccess) {
            dVar = new AbstractC0341z0.j((LinkSuccess) linkResult);
        } else {
            if (!(linkResult instanceof LinkExit)) {
                a$$ExternalSyntheticBUOutline0.m$3("Link result is not a valid result of LinkSuccess or LinkExit");
                return;
            }
            dVar = new AbstractC0341z0.d((LinkExit) linkResult);
        }
        g2.getClass();
        g2.a.postValue(dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(5:18|19|(1:21)|22|(1:24))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        com.plaid.internal.L2.b(new com.plaid.internal.C0090a1("Failed to parse webview json"), null);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.plaid.internal.InterfaceC0298u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        C0227m2 c0227m2;
        int i;
        if (continuationImpl instanceof C0227m2) {
            c0227m2 = (C0227m2) continuationImpl;
            int i2 = c0227m2.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0227m2.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0227m2.a;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0227m2.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    JsonImpl Json$default = AppUpdateData.Json$default(C0236n2.a);
                    String str = (String) linkedHashMap.get(BreadcrumbHelper.Category.WEBVIEW);
                    if (str == null) {
                        str = "";
                    }
                    C0309v4 c0309v4 = (C0309v4) Json$default.decodeFromString(str, C0309v4.a.a);
                    String str2 = "";
                    String str3 = "";
                    String str4 = "";
                    String str5 = "";
                    N2 kVar = new N2.k(str2, str3, str4, str5, c0309v4.b, c0309v4.c, c0309v4.d, false, null, 1152);
                    c0227m2.c = 1;
                    if (a(kVar, c0227m2) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        c0227m2 = new C0227m2(this, continuationImpl);
        Object obj3 = c0227m2.a;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0227m2.c;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (r8.a(r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.plaid.internal.InterfaceC0298u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0254p2 c0254p2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        C0289t2 c0289t2;
        Y2 y2;
        C0289t2 c0289t22;
        if (continuationImpl instanceof C0254p2) {
            c0254p2 = (C0254p2) continuationImpl;
            int i2 = c0254p2.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0254p2.e = i2 - PKIFailureInfo.systemUnavail;
                obj = c0254p2.c;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0254p2.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Y2 y22 = this.c;
                    Z2 z2 = this.b;
                    c0254p2.a = this;
                    c0254p2.b = y22;
                    c0254p2.e = 1;
                    Object a = z2.a(c0254p2);
                    if (a != coroutineSingletons) {
                        c0289t2 = this;
                        y2 = y22;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    y2 = c0254p2.b;
                    c0289t2 = c0254p2.a;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0289t22 = c0254p2.a;
                    SafeTrace.throwOnFailure(obj);
                    N2 n2 = (N2) obj;
                    C0095a6.a.a(C0095a6.a, "Previous " + n2);
                    c0254p2.a = null;
                    c0254p2.e = 3;
                }
                c0254p2.a = c0289t2;
                c0254p2.b = null;
                c0254p2.e = 2;
                obj = y2.b((N2) obj, c0254p2);
                if (obj != coroutineSingletons) {
                    c0289t22 = c0289t2;
                    N2 n22 = (N2) obj;
                    C0095a6.a.a(C0095a6.a, "Previous " + n22);
                    c0254p2.a = null;
                    c0254p2.e = 3;
                }
                return coroutineSingletons;
            }
        }
        c0254p2 = new C0254p2(this, continuationImpl);
        obj = c0254p2.c;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0254p2.e;
        if (i != 0) {
        }
        c0254p2.a = c0289t2;
        c0254p2.b = null;
        c0254p2.e = 2;
        obj = y2.b((N2) obj, c0254p2);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r8.a(r10, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.plaid.internal.InterfaceC0298u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Pane$PaneOutput[] pane$PaneOutputArr, ContinuationImpl continuationImpl) {
        C0245o2 c0245o2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        C0289t2 c0289t2;
        Y2 y2;
        C0289t2 c0289t22;
        if (continuationImpl instanceof C0245o2) {
            c0245o2 = (C0245o2) continuationImpl;
            int i2 = c0245o2.f;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0245o2.f = i2 - PKIFailureInfo.systemUnavail;
                obj = c0245o2.d;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0245o2.f;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Y2 y22 = this.c;
                    Z2 z2 = this.b;
                    c0245o2.a = this;
                    c0245o2.b = pane$PaneOutputArr;
                    c0245o2.c = y22;
                    c0245o2.f = 1;
                    Object a = z2.a(c0245o2);
                    if (a != coroutineSingletons) {
                        c0289t2 = this;
                        y2 = y22;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    y2 = c0245o2.c;
                    pane$PaneOutputArr = c0245o2.b;
                    c0289t2 = c0245o2.a;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0289t22 = c0245o2.a;
                    SafeTrace.throwOnFailure(obj);
                    N2 n2 = (N2) obj;
                    C0095a6.a.a(C0095a6.a, "Next " + n2);
                    c0245o2.a = null;
                    c0245o2.f = 3;
                }
                List list = ArraysKt___ArraysKt.toList(pane$PaneOutputArr);
                c0245o2.a = c0289t2;
                c0245o2.b = null;
                c0245o2.c = null;
                c0245o2.f = 2;
                obj = y2.a((N2) obj, list, c0245o2);
                if (obj != coroutineSingletons) {
                    c0289t22 = c0289t2;
                    N2 n22 = (N2) obj;
                    C0095a6.a.a(C0095a6.a, "Next " + n22);
                    c0245o2.a = null;
                    c0245o2.f = 3;
                }
                return coroutineSingletons;
            }
        }
        c0245o2 = new C0245o2(this, continuationImpl);
        obj = c0245o2.d;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0245o2.f;
        if (i != 0) {
        }
        List list2 = ArraysKt___ArraysKt.toList(pane$PaneOutputArr);
        c0245o2.a = c0289t2;
        c0245o2.b = null;
        c0245o2.c = null;
        c0245o2.f = 2;
        obj = y2.a((N2) obj, list2, c0245o2);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // com.plaid.internal.InterfaceC0298u2
    public final void a(String str) {
        str.getClass();
        G2 g2 = this.a;
        AbstractC0341z0.f fVar = new AbstractC0341z0.f(str);
        g2.getClass();
        g2.a.postValue(fVar);
    }

    @Override // com.plaid.internal.InterfaceC0298u2
    public final void a(AbstractC0282s4 abstractC0282s4) {
        abstractC0282s4.getClass();
        G2 g2 = this.a;
        AbstractC0341z0.g gVar = new AbstractC0341z0.g(abstractC0282s4);
        g2.getClass();
        g2.a.postValue(gVar);
    }
}
