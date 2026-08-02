package com.yandex.passport.internal.report.diary;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.methods.a7;
import com.yandex.passport.internal.methods.c6;
import com.yandex.passport.internal.methods.g6;
import com.yandex.passport.internal.methods.m6;
import com.yandex.passport.internal.methods.u6;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.v6;
import com.yandex.passport.internal.methods.w6;
import com.yandex.passport.internal.methods.x5;
import com.yandex.passport.internal.methods.z6;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 {
    public final com.yandex.passport.common.a a;
    public final e0 b;

    public b0(com.yandex.passport.common.a aVar, e0 e0Var) {
        aVar.getClass();
        e0Var.getClass();
        this.a = aVar;
        this.b = e0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x013f, code lost:
    
        if (p(r9, r8, r7, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0127, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010b, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ef, code lost:
    
        if (p(r9, r10, r2, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (p(r7, r8, r9, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if (p(r7, r8, "WebAmProperties", r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(String str, String str2, com.yandex.passport.internal.properties.m0 m0Var, cg6 cg6Var) {
        a0 a0Var;
        String str3;
        com.yandex.passport.internal.properties.m0 m0Var2;
        if (cg6Var instanceof a0) {
            a0Var = (a0) cg6Var;
            int i = a0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0Var.o = i - Integer.MIN_VALUE;
                Object obj = a0Var.m;
                Object obj2 = nm6.a;
                switch (a0Var.o) {
                    case 0:
                        qgg.h0(obj);
                        if (m0Var != null) {
                            a0Var.j = str;
                            a0Var.k = str2;
                            a0Var.l = m0Var;
                            a0Var.o = 2;
                            break;
                        } else {
                            a0Var.j = null;
                            a0Var.k = null;
                            a0Var.l = null;
                            a0Var.o = 1;
                            break;
                        }
                        return obj2;
                    case 1:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    case 2:
                        m0Var = a0Var.l;
                        str2 = a0Var.k;
                        str = a0Var.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n = ouj.n(str2, ".ignoreUnsupportedLanguageFallback");
                        Object valueOf = Boolean.valueOf(m0Var.a);
                        a0Var.j = str;
                        a0Var.k = str2;
                        a0Var.l = m0Var;
                        a0Var.o = 3;
                        if (p(str, n, valueOf, a0Var) != obj2) {
                            com.yandex.passport.internal.properties.m0 m0Var3 = m0Var;
                            str3 = str;
                            m0Var2 = m0Var3;
                            String n2 = ouj.n(str2, ".ignoreWebViewCrashFallback");
                            Object valueOf2 = Boolean.valueOf(m0Var2.b);
                            a0Var.j = str3;
                            a0Var.k = str2;
                            a0Var.l = m0Var2;
                            a0Var.o = 4;
                            break;
                        }
                        return obj2;
                    case 3:
                        m0Var2 = a0Var.l;
                        str2 = a0Var.k;
                        str3 = a0Var.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n22 = ouj.n(str2, ".ignoreWebViewCrashFallback");
                        Object valueOf22 = Boolean.valueOf(m0Var2.b);
                        a0Var.j = str3;
                        a0Var.k = str2;
                        a0Var.l = m0Var2;
                        a0Var.o = 4;
                        break;
                    case 4:
                        m0Var2 = a0Var.l;
                        str2 = a0Var.k;
                        str3 = a0Var.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".ignoreExperimentSettingsFallback");
                        Object valueOf3 = Boolean.valueOf(m0Var2.c);
                        a0Var.j = str3;
                        a0Var.k = str2;
                        a0Var.l = m0Var2;
                        a0Var.o = 5;
                        break;
                    case 5:
                        m0Var2 = a0Var.l;
                        str2 = a0Var.k;
                        str3 = a0Var.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".ignoreBackToNativeFallback");
                        Object valueOf4 = Boolean.valueOf(m0Var2.d);
                        a0Var.j = str3;
                        a0Var.k = str2;
                        a0Var.l = m0Var2;
                        a0Var.o = 6;
                        break;
                    case 6:
                        m0Var2 = a0Var.l;
                        str2 = a0Var.k;
                        str3 = a0Var.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n5 = ouj.n(str2, ".testId");
                        Object obj3 = m0Var2.e;
                        a0Var.j = null;
                        a0Var.k = null;
                        a0Var.l = null;
                        a0Var.o = 7;
                        break;
                    case 7:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        a0Var = new a0(this, cg6Var);
        Object obj4 = a0Var.m;
        Object obj22 = nm6.a;
        switch (a0Var.o) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, com.yandex.passport.api.d dVar, cg6 cg6Var) {
        a aVar;
        int i;
        String str3;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                Object obj2 = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(dVar, com.yandex.passport.api.c.a)) {
                        str3 = "Yandex";
                    } else {
                        if (!(dVar instanceof com.yandex.passport.api.b)) {
                            b6e.s();
                            return null;
                        }
                        str3 = "Custom(resource=" + ((Object) com.yandex.passport.common.resources.c.b(((com.yandex.passport.api.b) dVar).a)) + ')';
                    }
                    Object concat = "AccountListBranding.".concat(str3);
                    aVar.l = 1;
                    if (p(str, str2, concat, aVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                return Unit.a;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj3 = aVar.j;
        Object obj22 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f1, code lost:
    
        if (p(r12, r11, r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
    
        if (p(r12, r13, r2, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (a(r12, r13, r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (p(r10, r11, "AccountListProperties", r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, com.yandex.passport.internal.properties.a aVar, cg6 cg6Var) {
        b bVar;
        Object obj;
        int i;
        String n;
        Object obj2;
        String str3;
        com.yandex.passport.internal.properties.a aVar2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = bVar.m;
                obj = nm6.a;
                i = bVar.o;
                if (i != 0) {
                    qgg.h0(obj3);
                    bVar.j = str;
                    bVar.k = str2;
                    bVar.l = aVar;
                    bVar.o = 1;
                } else if (i == 1) {
                    aVar = bVar.l;
                    str2 = bVar.k;
                    str = bVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                } else if (i == 2) {
                    aVar2 = bVar.l;
                    str2 = bVar.k;
                    str3 = bVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                    String n2 = ouj.n(str2, ".branding");
                    com.yandex.passport.api.d dVar = aVar2.b;
                    bVar.j = str3;
                    bVar.k = str2;
                    bVar.l = aVar2;
                    bVar.o = 3;
                } else if (i == 3) {
                    aVar2 = bVar.l;
                    str2 = bVar.k;
                    str3 = bVar.j;
                    qgg.h0(obj3);
                    String n3 = ouj.n(str2, ".showCloseButton");
                    Object valueOf = Boolean.valueOf(aVar2.c);
                    bVar.j = str3;
                    bVar.k = str2;
                    bVar.l = aVar2;
                    bVar.o = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj3);
                        ((z7o) obj3).getClass();
                        return Unit.a;
                    }
                    aVar2 = bVar.l;
                    str2 = bVar.k;
                    str3 = bVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                    String n4 = ouj.n(str2, ".markPlusUsers");
                    Object valueOf2 = Boolean.valueOf(aVar2.d);
                    bVar.j = null;
                    bVar.k = null;
                    bVar.l = null;
                    bVar.o = 5;
                }
                n = ouj.n(str2, ".showMode");
                obj2 = aVar.a;
                bVar.j = str;
                bVar.k = str2;
                bVar.l = aVar;
                bVar.o = 2;
                if (p(str, n, obj2, bVar) != obj) {
                    com.yandex.passport.internal.properties.a aVar3 = aVar;
                    str3 = str;
                    aVar2 = aVar3;
                    String n22 = ouj.n(str2, ".branding");
                    com.yandex.passport.api.d dVar2 = aVar2.b;
                    bVar.j = str3;
                    bVar.k = str2;
                    bVar.l = aVar2;
                    bVar.o = 3;
                }
                return obj;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj32 = bVar.m;
        obj = nm6.a;
        i = bVar.o;
        if (i != 0) {
        }
        n = ouj.n(str2, ".showMode");
        obj2 = aVar.a;
        bVar.j = str;
        bVar.k = str2;
        bVar.l = aVar;
        bVar.o = 2;
        if (p(str, n, obj2, bVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e9, code lost:
    
        if (l(r12, r11, r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
    
        if (p(r12, r13, r2, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (p(r12, r13, r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (p(r10, r11, "AccountNotAuthorizedProperties", r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, com.yandex.passport.internal.properties.b bVar, cg6 cg6Var) {
        c cVar;
        Object obj;
        int i;
        String n;
        Object obj2;
        String str3;
        com.yandex.passport.internal.properties.b bVar2;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = cVar.m;
                obj = nm6.a;
                i = cVar.o;
                if (i != 0) {
                    qgg.h0(obj3);
                    cVar.j = str;
                    cVar.k = str2;
                    cVar.l = bVar;
                    cVar.o = 1;
                } else if (i == 1) {
                    bVar = cVar.l;
                    str2 = cVar.k;
                    str = cVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                } else if (i == 2) {
                    bVar2 = cVar.l;
                    str2 = cVar.k;
                    str3 = cVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                    String n2 = ouj.n(str2, ".theme");
                    Object obj4 = bVar2.b;
                    cVar.j = str3;
                    cVar.k = str2;
                    cVar.l = bVar2;
                    cVar.o = 3;
                } else if (i == 3) {
                    bVar2 = cVar.l;
                    str2 = cVar.k;
                    str3 = cVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                    String n3 = ouj.n(str2, ".message");
                    Object obj5 = bVar2.c;
                    cVar.j = str3;
                    cVar.k = str2;
                    cVar.l = bVar2;
                    cVar.o = 4;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            qgg.h0(obj3);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar2 = cVar.l;
                    str2 = cVar.k;
                    str3 = cVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                    String n4 = ouj.n(str2, ".loginProperties");
                    com.yandex.passport.internal.properties.l lVar = bVar2.d;
                    cVar.j = null;
                    cVar.k = null;
                    cVar.l = null;
                    cVar.o = 5;
                }
                n = ouj.n(str2, ".uid");
                obj2 = bVar.a;
                cVar.j = str;
                cVar.k = str2;
                cVar.l = bVar;
                cVar.o = 2;
                if (p(str, n, obj2, cVar) != obj) {
                    com.yandex.passport.internal.properties.b bVar3 = bVar;
                    str3 = str;
                    bVar2 = bVar3;
                    String n22 = ouj.n(str2, ".theme");
                    Object obj42 = bVar2.b;
                    cVar.j = str3;
                    cVar.k = str2;
                    cVar.l = bVar2;
                    cVar.o = 3;
                }
                return obj;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj32 = cVar.m;
        obj = nm6.a;
        i = cVar.o;
        if (i != 0) {
        }
        n = ouj.n(str2, ".uid");
        obj2 = bVar.a;
        cVar.j = str;
        cVar.k = str2;
        cVar.l = bVar;
        cVar.o = 2;
        if (p(str, n, obj2, cVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01c5, code lost:
    
        if (p(r8, r7, r6, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01ab, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x018e, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0175, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x015d, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0140, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0123, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
    
        if (p(r8, r9, r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
    
        if (p(r6, r7, "AuthByQrProperties", r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, com.yandex.passport.internal.properties.c cVar, cg6 cg6Var) {
        d dVar;
        String str3;
        com.yandex.passport.internal.properties.c cVar2;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i = dVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.o = i - Integer.MIN_VALUE;
                Object obj = dVar.m;
                Object obj2 = nm6.a;
                switch (dVar.o) {
                    case 0:
                        qgg.h0(obj);
                        dVar.j = str;
                        dVar.k = str2;
                        dVar.l = cVar;
                        dVar.o = 1;
                        break;
                    case 1:
                        cVar = dVar.l;
                        str2 = dVar.k;
                        str = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n = ouj.n(str2, ".theme");
                        Object obj3 = cVar.a;
                        dVar.j = str;
                        dVar.k = str2;
                        dVar.l = cVar;
                        dVar.o = 2;
                        if (p(str, n, obj3, dVar) != obj2) {
                            com.yandex.passport.internal.properties.c cVar3 = cVar;
                            str3 = str;
                            cVar2 = cVar3;
                            String n2 = ouj.n(str2, ".environment");
                            Object obj4 = cVar2.b;
                            dVar.j = str3;
                            dVar.k = str2;
                            dVar.l = cVar2;
                            dVar.o = 3;
                            break;
                        }
                        return obj2;
                    case 2:
                        cVar2 = dVar.l;
                        str2 = dVar.k;
                        str3 = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n22 = ouj.n(str2, ".environment");
                        Object obj42 = cVar2.b;
                        dVar.j = str3;
                        dVar.k = str2;
                        dVar.l = cVar2;
                        dVar.o = 3;
                        break;
                    case 3:
                        cVar2 = dVar.l;
                        str2 = dVar.k;
                        str3 = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".isShowSkipButton");
                        Object valueOf = Boolean.valueOf(cVar2.c);
                        dVar.j = str3;
                        dVar.k = str2;
                        dVar.l = cVar2;
                        dVar.o = 4;
                        break;
                    case 4:
                        cVar2 = dVar.l;
                        str2 = dVar.k;
                        str3 = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".isShowSettingsButton");
                        Object valueOf2 = Boolean.valueOf(cVar2.d);
                        dVar.j = str3;
                        dVar.k = str2;
                        dVar.l = cVar2;
                        dVar.o = 5;
                        break;
                    case 5:
                        cVar2 = dVar.l;
                        str2 = dVar.k;
                        str3 = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n5 = ouj.n(str2, ".isFinishWithoutDialogOnError");
                        Object valueOf3 = Boolean.valueOf(cVar2.e);
                        dVar.j = str3;
                        dVar.k = str2;
                        dVar.l = cVar2;
                        dVar.o = 6;
                        break;
                    case 6:
                        cVar2 = dVar.l;
                        str2 = dVar.k;
                        str3 = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n6 = ouj.n(str2, ".lottieSpinnerResId");
                        Object obj5 = cVar2.f;
                        dVar.j = str3;
                        dVar.k = str2;
                        dVar.l = cVar2;
                        dVar.o = 7;
                        break;
                    case 7:
                        cVar2 = dVar.l;
                        str2 = dVar.k;
                        str3 = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n7 = ouj.n(str2, ".backgroundResId");
                        Object obj6 = cVar2.g;
                        dVar.j = str3;
                        dVar.k = str2;
                        dVar.l = cVar2;
                        dVar.o = 8;
                        break;
                    case 8:
                        cVar2 = dVar.l;
                        str2 = dVar.k;
                        str3 = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n8 = ouj.n(str2, ".skipBackButton");
                        Object valueOf4 = Boolean.valueOf(cVar2.h);
                        dVar.j = str3;
                        dVar.k = str2;
                        dVar.l = cVar2;
                        dVar.o = 9;
                        break;
                    case 9:
                        cVar2 = dVar.l;
                        str2 = dVar.k;
                        str3 = dVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n9 = ouj.n(str2, ".origin");
                        Object obj7 = cVar2.i;
                        dVar.j = null;
                        dVar.k = null;
                        dVar.l = null;
                        dVar.o = 10;
                        break;
                    case 10:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dVar = new d(this, cg6Var);
        Object obj8 = dVar.m;
        Object obj22 = nm6.a;
        switch (dVar.o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x010b, code lost:
    
        if (p(r14, r13, r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (p(r14, r15, r2, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        if (p(r14, r15, r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (p(r12, r13, "AuthorizationUrlProperties", r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, com.yandex.passport.internal.properties.e eVar, cg6 cg6Var) {
        e eVar2;
        Object obj;
        int i;
        String n;
        Object z1Var;
        String str3;
        com.yandex.passport.internal.properties.e eVar3;
        if (cg6Var instanceof e) {
            eVar2 = (e) cg6Var;
            int i2 = eVar2.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar2.o = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar2.m;
                obj = nm6.a;
                i = eVar2.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    eVar2.j = str;
                    eVar2.k = str2;
                    eVar2.l = eVar;
                    eVar2.o = 1;
                } else if (i == 1) {
                    eVar = eVar2.l;
                    str2 = eVar2.k;
                    str = eVar2.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                } else if (i == 2) {
                    eVar3 = eVar2.l;
                    str2 = eVar2.k;
                    str3 = eVar2.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n2 = ouj.n(str2, ".returnUrl");
                    Object obj3 = eVar3.b;
                    eVar2.j = str3;
                    eVar2.k = str2;
                    eVar2.l = eVar3;
                    eVar2.o = 3;
                } else if (i == 3) {
                    eVar3 = eVar2.l;
                    str2 = eVar2.k;
                    str3 = eVar2.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n3 = ouj.n(str2, ".tld");
                    Object obj4 = eVar3.c;
                    eVar2.j = str3;
                    eVar2.k = str2;
                    eVar2.l = eVar3;
                    eVar2.o = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        ((z7o) obj2).getClass();
                        return Unit.a;
                    }
                    eVar3 = eVar2.l;
                    str2 = eVar2.k;
                    str3 = eVar2.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n4 = ouj.n(str2, ".analyticsParams");
                    Object X = CollectionsKt.X(eVar3.d.entrySet(), StringUtils.COMMA, null, null, new com.yandex.passport.common.network.r(24), 30);
                    eVar2.j = null;
                    eVar2.k = null;
                    eVar2.l = null;
                    eVar2.o = 5;
                }
                n = ouj.n(str2, ".uid");
                z1Var = eVar.a.toString();
                eVar2.j = str;
                eVar2.k = str2;
                eVar2.l = eVar;
                eVar2.o = 2;
                if (p(str, n, z1Var, eVar2) != obj) {
                    com.yandex.passport.internal.properties.e eVar4 = eVar;
                    str3 = str;
                    eVar3 = eVar4;
                    String n22 = ouj.n(str2, ".returnUrl");
                    Object obj32 = eVar3.b;
                    eVar2.j = str3;
                    eVar2.k = str2;
                    eVar2.l = eVar3;
                    eVar2.o = 3;
                }
                return obj;
            }
        }
        eVar2 = new e(this, cg6Var);
        Object obj22 = eVar2.m;
        obj = nm6.a;
        i = eVar2.o;
        if (i != 0) {
        }
        n = ouj.n(str2, ".uid");
        z1Var = eVar.a.toString();
        eVar2.j = str;
        eVar2.k = str2;
        eVar2.l = eVar;
        eVar2.o = 2;
        if (p(str, n, z1Var, eVar2) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
    
        if (p(r12, r11, r10, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (p(r12, r13, r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (p(r12, r13, r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (p(r10, r11, "AutoLoginProperties", r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, com.yandex.passport.internal.properties.g gVar, cg6 cg6Var) {
        f fVar;
        Object obj;
        int i;
        String n;
        com.yandex.passport.internal.entities.k kVar;
        String str3;
        com.yandex.passport.internal.properties.g gVar2;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = fVar.m;
                obj = nm6.a;
                i = fVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    fVar.j = str;
                    fVar.k = str2;
                    fVar.l = gVar;
                    fVar.o = 1;
                } else if (i == 1) {
                    gVar = fVar.l;
                    str2 = fVar.k;
                    str = fVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                } else if (i == 2) {
                    gVar2 = fVar.l;
                    str2 = fVar.k;
                    str3 = fVar.j;
                    qgg.h0(obj2);
                    String n2 = ouj.n(str2, ".theme");
                    Object obj3 = gVar2.b.toString();
                    fVar.j = str3;
                    fVar.k = str2;
                    fVar.l = gVar2;
                    fVar.o = 3;
                } else if (i == 3) {
                    gVar2 = fVar.l;
                    str2 = fVar.k;
                    str3 = fVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n3 = ouj.n(str2, ".mode");
                    Object obj4 = gVar2.c.toString();
                    fVar.j = str3;
                    fVar.k = str2;
                    fVar.l = gVar2;
                    fVar.o = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        ((z7o) obj2).getClass();
                        return Unit.a;
                    }
                    gVar2 = fVar.l;
                    str2 = fVar.k;
                    str3 = fVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n4 = ouj.n(str2, ".message");
                    Object obj5 = gVar2.d;
                    if (obj5 == null) {
                        obj5 = "null";
                    }
                    fVar.j = null;
                    fVar.k = null;
                    fVar.l = null;
                    fVar.o = 5;
                }
                n = ouj.n(str2, ".Filter");
                kVar = gVar.a;
                fVar.j = str;
                fVar.k = str2;
                fVar.l = gVar;
                fVar.o = 2;
                if (j(str, n, kVar, fVar) != obj) {
                    com.yandex.passport.internal.properties.g gVar3 = gVar;
                    str3 = str;
                    gVar2 = gVar3;
                    String n22 = ouj.n(str2, ".theme");
                    Object obj32 = gVar2.b.toString();
                    fVar.j = str3;
                    fVar.k = str2;
                    fVar.l = gVar2;
                    fVar.o = 3;
                }
                return obj;
            }
        }
        fVar = new f(this, cg6Var);
        Object obj22 = fVar.m;
        obj = nm6.a;
        i = fVar.o;
        if (i != 0) {
        }
        n = ouj.n(str2, ".Filter");
        kVar = gVar.a;
        fVar.j = str;
        fVar.k = str2;
        fVar.l = gVar;
        fVar.o = 2;
        if (j(str, n, kVar, fVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (p(r6, "isErrorTemporary", r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (f(r6, "AutoLoginProperties", r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, Bundle bundle, cg6 cg6Var) {
        g gVar;
        int i;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.n = i2 - Integer.MIN_VALUE;
                Object obj = gVar.l;
                Object obj2 = nm6.a;
                i = gVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    bundle.getClass();
                    bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                    com.yandex.passport.internal.properties.g gVar2 = (com.yandex.passport.internal.properties.g) bundle.getParcelable("passport-auto-login-properties");
                    if (gVar2 == null) {
                        xq0.q("Bundle has no ".concat(com.yandex.passport.internal.properties.g.class.getSimpleName()));
                        return null;
                    }
                    gVar.j = str;
                    gVar.k = bundle;
                    gVar.n = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    }
                    bundle = gVar.k;
                    str = gVar.j;
                    qgg.h0(obj);
                }
                Object valueOf = String.valueOf(bundle.getBoolean("is_error_temporary"));
                gVar.j = null;
                gVar.k = null;
                gVar.n = 2;
            }
        }
        gVar = new g(this, cg6Var);
        Object obj3 = gVar.l;
        Object obj22 = nm6.a;
        i = gVar.n;
        if (i != 0) {
        }
        Object valueOf2 = String.valueOf(bundle.getBoolean("is_error_temporary"));
        gVar.j = null;
        gVar.k = null;
        gVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x012d, code lost:
    
        if (A(r9, r8, r7, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0115, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f9, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (p(r9, r10, r2, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (p(r7, r8, r9, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (p(r7, r8, "BindPhoneProperties", r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, com.yandex.passport.internal.properties.h hVar, cg6 cg6Var) {
        h hVar2;
        String str3;
        com.yandex.passport.internal.properties.h hVar3;
        if (cg6Var instanceof h) {
            hVar2 = (h) cg6Var;
            int i = hVar2.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar2.o = i - Integer.MIN_VALUE;
                Object obj = hVar2.m;
                Object obj2 = nm6.a;
                switch (hVar2.o) {
                    case 0:
                        qgg.h0(obj);
                        if (hVar != null) {
                            hVar2.j = str;
                            hVar2.k = str2;
                            hVar2.l = hVar;
                            hVar2.o = 2;
                            break;
                        } else {
                            hVar2.j = null;
                            hVar2.k = null;
                            hVar2.l = null;
                            hVar2.o = 1;
                            break;
                        }
                        return obj2;
                    case 1:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    case 2:
                        hVar = hVar2.l;
                        str2 = hVar2.k;
                        str = hVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n = ouj.n(str2, ".theme");
                        Object obj3 = hVar.a;
                        hVar2.j = str;
                        hVar2.k = str2;
                        hVar2.l = hVar;
                        hVar2.o = 3;
                        if (p(str, n, obj3, hVar2) != obj2) {
                            com.yandex.passport.internal.properties.h hVar4 = hVar;
                            str3 = str;
                            hVar3 = hVar4;
                            String n2 = ouj.n(str2, ".uid");
                            Object obj4 = hVar3.b;
                            hVar2.j = str3;
                            hVar2.k = str2;
                            hVar2.l = hVar3;
                            hVar2.o = 4;
                            break;
                        }
                        return obj2;
                    case 3:
                        hVar3 = hVar2.l;
                        str2 = hVar2.k;
                        str3 = hVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n22 = ouj.n(str2, ".uid");
                        Object obj42 = hVar3.b;
                        hVar2.j = str3;
                        hVar2.k = str2;
                        hVar2.l = hVar3;
                        hVar2.o = 4;
                        break;
                    case 4:
                        hVar3 = hVar2.l;
                        str2 = hVar2.k;
                        str3 = hVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".phoneNumber");
                        Object obj5 = hVar3.c;
                        hVar2.j = str3;
                        hVar2.k = str2;
                        hVar2.l = hVar3;
                        hVar2.o = 5;
                        break;
                    case 5:
                        hVar3 = hVar2.l;
                        str2 = hVar2.k;
                        str3 = hVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".isPhoneEditable");
                        Object valueOf = Boolean.valueOf(hVar3.d);
                        hVar2.j = str3;
                        hVar2.k = str2;
                        hVar2.l = hVar3;
                        hVar2.o = 6;
                        break;
                    case 6:
                        hVar3 = hVar2.l;
                        str2 = hVar2.k;
                        str3 = hVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n5 = ouj.n(str2, ".webAmProperties");
                        com.yandex.passport.internal.properties.m0 m0Var = hVar3.e;
                        hVar2.j = null;
                        hVar2.k = null;
                        hVar2.l = null;
                        hVar2.o = 7;
                        break;
                    case 7:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        hVar2 = new h(this, cg6Var);
        Object obj6 = hVar2.m;
        Object obj22 = nm6.a;
        switch (hVar2.o) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, com.yandex.passport.common.core.b bVar, String str2, cg6 cg6Var) {
        i iVar;
        int i;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iVar.j;
                Object obj2 = nm6.a;
                i = iVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (str2 == null) {
                    str2 = "Environment";
                }
                Object valueOf = String.valueOf(bVar);
                iVar.l = 1;
                Object p = p(str, str2, valueOf, iVar);
                return p == obj2 ? obj2 : p;
            }
        }
        iVar = new i(this, cg6Var);
        Object obj3 = iVar.j;
        Object obj22 = nm6.a;
        i = iVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0116, code lost:
    
        if (p(r4, r0, r14, r2) == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (p(r4, r1, r7, r2) == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        if (p(r4, r1, r8, r2) != r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, com.yandex.passport.internal.entities.k kVar, cg6 cg6Var) {
        j jVar;
        Object obj;
        int i;
        com.yandex.passport.internal.entities.k kVar2;
        String str3;
        String n;
        com.yandex.passport.common.core.b L;
        String str4;
        com.yandex.passport.internal.entities.k kVar3;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = jVar.m;
                obj = nm6.a;
                i = jVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    jVar.j = str;
                    jVar.k = str2;
                    kVar2 = kVar;
                    jVar.l = kVar2;
                    jVar.o = 1;
                    if (p(str, str2, "Filter", jVar) != obj) {
                        str3 = str2;
                    }
                    return obj;
                }
                if (i == 1) {
                    com.yandex.passport.internal.entities.k kVar4 = jVar.l;
                    str3 = jVar.k;
                    String str5 = jVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    kVar2 = kVar4;
                    str = str5;
                } else if (i == 2) {
                    kVar3 = jVar.l;
                    str3 = jVar.k;
                    str4 = jVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n2 = ouj.n(str3, ".secondaryTeamEnvironment");
                    Object valueOf = String.valueOf(kVar3.b);
                    jVar.j = str4;
                    jVar.k = str3;
                    jVar.l = kVar3;
                    jVar.o = 3;
                } else if (i == 3) {
                    kVar3 = jVar.l;
                    str3 = jVar.k;
                    str4 = jVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n3 = ouj.n(str3, ".supportedAccountTypes");
                    Object X = CollectionsKt.X(kVar3.j(), StringUtils.COMMA, null, null, null, 62);
                    jVar.j = str4;
                    jVar.k = str3;
                    jVar.l = kVar3;
                    jVar.o = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        ((z7o) obj2).getClass();
                        return Unit.a;
                    }
                    kVar3 = jVar.l;
                    str3 = jVar.k;
                    str4 = jVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n4 = ouj.n(str3, ".partitions");
                    Object X2 = CollectionsKt.X(kVar3.d, StringUtils.COMMA, null, null, null, 62);
                    jVar.j = null;
                    jVar.k = null;
                    jVar.l = null;
                    jVar.o = 5;
                }
                n = ouj.n(str3, ".primaryEnvironment");
                L = com.yandex.plus.core.network.api.utils.a.L(kVar2.a);
                jVar.j = str;
                jVar.k = str3;
                jVar.l = kVar2;
                jVar.o = 2;
                if (i(str, L, n, jVar) != obj) {
                    str4 = str;
                    kVar3 = kVar2;
                    String n22 = ouj.n(str3, ".secondaryTeamEnvironment");
                    Object valueOf2 = String.valueOf(kVar3.b);
                    jVar.j = str4;
                    jVar.k = str3;
                    jVar.l = kVar3;
                    jVar.o = 3;
                }
                return obj;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj22 = jVar.m;
        obj = nm6.a;
        i = jVar.o;
        if (i != 0) {
        }
        n = ouj.n(str3, ".primaryEnvironment");
        L = com.yandex.plus.core.network.api.utils.a.L(kVar2.a);
        jVar.j = str;
        jVar.k = str3;
        jVar.l = kVar2;
        jVar.o = 2;
        if (i(str, L, n, jVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x024d, code lost:
    
        if (d(r10, "AuthByQrProperties", r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x027c, code lost:
    
        if (r(r10, "SocialApplicationBindProperties", r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02af, code lost:
    
        if (s(r10, "SocialBindProperties", r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02f1, code lost:
    
        if (l(r10, "LoginProperties", r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x018c, code lost:
    
        if (p(r11, "passportTheme", r10, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015c, code lost:
    
        if (p(r11, "showOverlay", r13, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0138, code lost:
    
        if (p(r11, "WebCaseData", r12, r0) != r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cb, code lost:
    
        if (y(r10, "UserMenuProperties", r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e9, code lost:
    
        if (i(r10, r11, null, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b5, code lost:
    
        if (q(r10, "SetCurrentProperties", r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e8, code lost:
    
        if (m(r10, "LogoutProperties", r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020d, code lost:
    
        if (x(r10, r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022c, code lost:
    
        if (v(r10, "TurboAppAuthProperties", r11, r0) == r1) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, com.yandex.passport.internal.ui.router.c0 c0Var, Bundle bundle, cg6 cg6Var) {
        k kVar;
        com.yandex.passport.internal.properties.l lVar;
        com.yandex.passport.internal.ui.webview.webcases.a0 a0Var;
        String str2;
        Bundle bundle2;
        y1 y1Var;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i = kVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.n = i - Integer.MIN_VALUE;
                Object obj = kVar.l;
                Object obj2 = nm6.a;
                int i2 = 0;
                switch (kVar.n) {
                    case 0:
                        qgg.h0(obj);
                        switch (c0Var) {
                            case LOGIN:
                                bundle.getClass();
                                if (bundle.containsKey("passport-login-properties")) {
                                    lVar = (com.yandex.passport.internal.properties.l) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "passport-login-properties");
                                    if (lVar == null) {
                                        xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.l.class));
                                        return null;
                                    }
                                } else {
                                    lVar = null;
                                }
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 1;
                                break;
                            case SOCIAL_BIND:
                                bundle.getClass();
                                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                                com.yandex.passport.internal.properties.e0 e0Var = (com.yandex.passport.internal.properties.e0) bundle.getParcelable("passport-bind-properties");
                                if (e0Var == null) {
                                    xq0.q("Bundle has no ".concat(com.yandex.passport.internal.properties.e0.class.getSimpleName()));
                                    return null;
                                }
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 2;
                                break;
                            case SOCIAL_APPLICATION_BIND:
                                bundle.getClass();
                                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                                com.yandex.passport.internal.properties.d0 d0Var = (com.yandex.passport.internal.properties.d0) bundle.getParcelable("passport-application-bind-properties");
                                if (d0Var == null) {
                                    xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.d0.class));
                                    return null;
                                }
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 3;
                                break;
                            case AUTHORIZATION_BY_QR:
                                bundle.getClass();
                                com.yandex.passport.internal.properties.c cVar = (com.yandex.passport.internal.properties.c) bundle.getParcelable("auth_by_qr_properties");
                                if (cVar == null) {
                                    xq0.q("No auth_by_qr_properties in bundle");
                                    return null;
                                }
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 4;
                                break;
                            case TURBO_APP_AUTH:
                                bundle.getClass();
                                com.yandex.passport.internal.properties.h0 h0Var = (com.yandex.passport.internal.properties.h0) u6.d.e(bundle);
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 5;
                                break;
                            case CONFIRM_QR_AUTHORIZATION:
                                Uri uri = (Uri) bundle.getParcelable("URI");
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 6;
                                break;
                            case LOGOUT:
                                bundle.getClass();
                                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                                com.yandex.passport.internal.properties.u uVar = (com.yandex.passport.internal.properties.u) bundle.getParcelable("passport-logout-properties");
                                if (uVar == null) {
                                    xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.u.class));
                                    return null;
                                }
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 7;
                                break;
                            case SET_CURRENT_ACCOUNT:
                                bundle.getClass();
                                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                                com.yandex.passport.internal.properties.c0 c0Var2 = (com.yandex.passport.internal.properties.c0) bundle.getParcelable("passport-set-current-account-properties");
                                if (c0Var2 == null) {
                                    xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.c0.class));
                                    return null;
                                }
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 8;
                                break;
                            case WEB_VIEW:
                                com.yandex.passport.common.core.b bVar = (com.yandex.passport.common.core.b) bundle.getParcelable("environment");
                                kVar.j = str;
                                kVar.k = bundle;
                                kVar.n = 9;
                                break;
                            case NOTIFICATION_BUILDER:
                            case DELETE_ACCOUNT:
                                return Unit.a;
                            case SHOW_USER_MENU:
                                bundle.getClass();
                                com.yandex.passport.internal.properties.j0 j0Var = (com.yandex.passport.internal.properties.j0) bundle.getParcelable("passport-show-user-menu-properties");
                                kVar.j = null;
                                kVar.k = null;
                                kVar.n = 14;
                                break;
                            default:
                                b6e.s();
                                return null;
                        }
                    case 1:
                        qgg.h0(obj);
                        return Unit.a;
                    case 2:
                        qgg.h0(obj);
                        return Unit.a;
                    case 3:
                        qgg.h0(obj);
                        return Unit.a;
                    case 4:
                        qgg.h0(obj);
                        return Unit.a;
                    case 5:
                        qgg.h0(obj);
                        return Unit.a;
                    case 6:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    case 7:
                        qgg.h0(obj);
                        return Unit.a;
                    case 8:
                        qgg.h0(obj);
                        return Unit.a;
                    case 9:
                        bundle = kVar.k;
                        str = kVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        int i3 = bundle.getInt("web-case", -1);
                        com.yandex.passport.internal.ui.webview.webcases.a0[] values = com.yandex.passport.internal.ui.webview.webcases.a0.values();
                        int length = values.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                a0Var = values[i4];
                                if (a0Var.ordinal() != i3) {
                                    i4++;
                                }
                            } else {
                                a0Var = null;
                            }
                        }
                        Object valueOf = String.valueOf(a0Var);
                        kVar.j = str;
                        kVar.k = bundle;
                        kVar.n = 10;
                        if (p(str, "WebCaseType", valueOf, kVar) != obj2) {
                            str2 = str;
                            bundle2 = bundle;
                            Object valueOf2 = String.valueOf(bundle2.getBundle("web-case-data"));
                            kVar.j = str2;
                            kVar.k = bundle2;
                            kVar.n = 11;
                            break;
                        }
                        return obj2;
                    case 10:
                        bundle2 = kVar.k;
                        str2 = kVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        Object valueOf22 = String.valueOf(bundle2.getBundle("web-case-data"));
                        kVar.j = str2;
                        kVar.k = bundle2;
                        kVar.n = 11;
                        break;
                    case 11:
                        bundle2 = kVar.k;
                        str2 = kVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        Object valueOf3 = Boolean.valueOf(bundle2.getBoolean("show-debug-overlay"));
                        if (!bundle2.containsKey("show-debug-overlay")) {
                            valueOf3 = null;
                        }
                        kVar.j = str2;
                        kVar.k = bundle2;
                        kVar.n = 12;
                        break;
                    case 12:
                        bundle2 = kVar.k;
                        str2 = kVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        int i5 = bundle2.getInt("passport-theme", -1);
                        y1[] values2 = y1.values();
                        int length2 = values2.length;
                        while (true) {
                            if (i2 < length2) {
                                y1Var = values2[i2];
                                if (y1Var.ordinal() != i5) {
                                    i2++;
                                }
                            } else {
                                y1Var = null;
                            }
                        }
                        Object valueOf4 = String.valueOf(y1Var);
                        kVar.j = null;
                        kVar.k = null;
                        kVar.n = 13;
                        break;
                    case 13:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    case 14:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        kVar = new k(this, cg6Var);
        Object obj3 = kVar.l;
        Object obj22 = nm6.a;
        int i22 = 0;
        switch (kVar.n) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x03c7, code lost:
    
        if (p(r9, r8, r10, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x03a5, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0388, code lost:
    
        if (A(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x036f, code lost:
    
        if (w(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0355, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x033b, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0321, code lost:
    
        if (h(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0307, code lost:
    
        if (z(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02ed, code lost:
    
        if (u(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02d3, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02b5, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029b, code lost:
    
        if (t(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0279, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x025b, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023d, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0223, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020a, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f1, code lost:
    
        if (j(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d8, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bf, code lost:
    
        if (p(r9, r10, r2, r0) != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0181, code lost:
    
        if (p(r7, r8, r10, r0) == r1) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, String str2, com.yandex.passport.internal.properties.l lVar, cg6 cg6Var) {
        l lVar2;
        String str3;
        com.yandex.passport.internal.properties.l lVar3;
        if (cg6Var instanceof l) {
            lVar2 = (l) cg6Var;
            int i = lVar2.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar2.o = i - Integer.MIN_VALUE;
                Object obj = lVar2.m;
                Object obj2 = nm6.a;
                switch (lVar2.o) {
                    case 0:
                        qgg.h0(obj);
                        StringBuilder sb = new StringBuilder("LoginProperties is null ");
                        sb.append(lVar == null);
                        Object sb2 = sb.toString();
                        lVar2.j = str;
                        lVar2.k = str2;
                        lVar2.l = lVar;
                        lVar2.o = 1;
                        break;
                    case 1:
                        lVar = lVar2.l;
                        str2 = lVar2.k;
                        str = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        if (lVar == null) {
                            return Unit.a;
                        }
                        String n = ouj.n(str2, ".applicationPackageName");
                        Object obj3 = lVar.a;
                        lVar2.j = str;
                        lVar2.k = str2;
                        lVar2.l = lVar;
                        lVar2.o = 2;
                        if (p(str, n, obj3, lVar2) != obj2) {
                            com.yandex.passport.internal.properties.l lVar4 = lVar;
                            str3 = str;
                            lVar3 = lVar4;
                            String n2 = ouj.n(str2, ".isWebAmForbidden");
                            Object valueOf = Boolean.valueOf(lVar3.b);
                            lVar2.j = str3;
                            lVar2.k = str2;
                            lVar2.l = lVar3;
                            lVar2.o = 3;
                            break;
                        }
                        return obj2;
                    case 2:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n22 = ouj.n(str2, ".isWebAmForbidden");
                        Object valueOf2 = Boolean.valueOf(lVar3.b);
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 3;
                        break;
                    case 3:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".applicationVersion");
                        Object obj4 = lVar3.c;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 4;
                        break;
                    case 4:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".filter");
                        com.yandex.passport.internal.entities.k kVar = lVar3.d;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 5;
                        break;
                    case 5:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        String n5 = ouj.n(str2, ".theme");
                        Object obj5 = lVar3.e;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 6;
                        break;
                    case 6:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n6 = ouj.n(str2, ".animationTheme");
                        Object obj6 = lVar3.f;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 7;
                        break;
                    case 7:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n7 = ouj.n(str2, ".selectedUid");
                        Object obj7 = lVar3.g;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 8;
                        break;
                    case 8:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n8 = ouj.n(str2, ".isAdditionOnlyRequired");
                        Object valueOf3 = Boolean.valueOf(lVar3.h);
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 9;
                        break;
                    case 9:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n9 = ouj.n(str2, ".isRegistrationOnlyRequired");
                        Object valueOf4 = Boolean.valueOf(lVar3.i);
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 10;
                        break;
                    case 10:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n10 = ouj.n(str2, ".socialConfiguration");
                        w1 w1Var = lVar3.j;
                        com.yandex.passport.internal.a0 a = w1Var != null ? com.yandex.passport.internal.y.a(w1Var) : null;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 11;
                        break;
                    case 11:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        String n11 = ouj.n(str2, ".loginHint");
                        Object obj8 = lVar3.k;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 12;
                        break;
                    case 12:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n12 = ouj.n(str2, ".isFromAuthSdk");
                        Object valueOf5 = Boolean.valueOf(lVar3.l);
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 13;
                        break;
                    case 13:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n13 = ouj.n(str2, ".socialRegistrationProperties");
                        com.yandex.passport.internal.properties.f0 f0Var = lVar3.o;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 14;
                        break;
                    case 14:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        String n14 = ouj.n(str2, ".visualProperties");
                        com.yandex.passport.internal.properties.k0 k0Var = lVar3.p;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 15;
                        break;
                    case 15:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        String n15 = ouj.n(str2, ".bindPhoneProperties");
                        com.yandex.passport.internal.properties.h hVar = lVar3.q;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 16;
                        break;
                    case 16:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        String n16 = ouj.n(str2, ".source");
                        Object obj9 = lVar3.r;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 17;
                        break;
                    case 17:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n17 = ouj.n(str2, ".analyticsParams");
                        Object obj10 = lVar3.s;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 18;
                        break;
                    case 18:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n18 = ouj.n(str2, ".turboAuthParams");
                        com.yandex.passport.internal.entities.v vVar = lVar3.t;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 19;
                        break;
                    case 19:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        String n19 = ouj.n(str2, ".webAmProperties");
                        com.yandex.passport.internal.properties.m0 m0Var = lVar3.u;
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 20;
                        break;
                    case 20:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        String n20 = ouj.n(str2, ".setAsCurrent");
                        Object valueOf6 = Boolean.valueOf(lVar3.v);
                        lVar2.j = str3;
                        lVar2.k = str2;
                        lVar2.l = lVar3;
                        lVar2.o = 21;
                        break;
                    case 21:
                        lVar3 = lVar2.l;
                        str2 = lVar2.k;
                        str3 = lVar2.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n21 = ouj.n(str2, ".additionalActionRequest");
                        String str4 = lVar3.w;
                        Object fVar = str4 != null ? new com.yandex.passport.api.f(str4) : null;
                        lVar2.j = null;
                        lVar2.k = null;
                        lVar2.l = null;
                        lVar2.o = 22;
                        break;
                    case 22:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        lVar2 = new l(this, cg6Var);
        Object obj11 = lVar2.m;
        Object obj22 = nm6.a;
        switch (lVar2.o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e5, code lost:
    
        if (p(r13, r12, r11, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        if (p(r13, r14, r2, r0) != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (p(r11, r12, r13, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (p(r11, r12, "LogoutProperties", r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, com.yandex.passport.internal.properties.u uVar, cg6 cg6Var) {
        m mVar;
        int i;
        String str3;
        com.yandex.passport.internal.properties.u uVar2;
        if (cg6Var instanceof m) {
            mVar = (m) cg6Var;
            int i2 = mVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.o = i2 - Integer.MIN_VALUE;
                Object obj = mVar.m;
                Object obj2 = nm6.a;
                i = mVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (uVar == null) {
                        mVar.j = null;
                        mVar.k = null;
                        mVar.l = null;
                        mVar.o = 1;
                    } else {
                        mVar.j = str;
                        mVar.k = str2;
                        mVar.l = uVar;
                        mVar.o = 2;
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    return Unit.a;
                }
                if (i == 2) {
                    uVar = mVar.l;
                    str2 = mVar.k;
                    str = mVar.j;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    String n = ouj.n(str2, ".uid");
                    Object obj3 = uVar.a;
                    mVar.j = str;
                    mVar.k = str2;
                    mVar.l = uVar;
                    mVar.o = 3;
                    if (p(str, n, obj3, mVar) != obj2) {
                        com.yandex.passport.internal.properties.u uVar3 = uVar;
                        str3 = str;
                        uVar2 = uVar3;
                        String n2 = ouj.n(str2, ".theme");
                        Object obj4 = uVar2.b;
                        mVar.j = str3;
                        mVar.k = str2;
                        mVar.l = uVar2;
                        mVar.o = 4;
                    }
                    return obj2;
                }
                if (i == 3) {
                    uVar2 = mVar.l;
                    str2 = mVar.k;
                    str3 = mVar.j;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    String n22 = ouj.n(str2, ".theme");
                    Object obj42 = uVar2.b;
                    mVar.j = str3;
                    mVar.k = str2;
                    mVar.l = uVar2;
                    mVar.o = 4;
                } else if (i == 4) {
                    uVar2 = mVar.l;
                    str2 = mVar.k;
                    str3 = mVar.j;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    String n3 = ouj.n(str2, ".source");
                    Object obj5 = uVar2.c;
                    mVar.j = null;
                    mVar.k = null;
                    mVar.l = null;
                    mVar.o = 5;
                } else {
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                return Unit.a;
            }
        }
        mVar = new m(this, cg6Var);
        Object obj6 = mVar.m;
        Object obj22 = nm6.a;
        i = mVar.o;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (j(r8, r10, r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (e(r8, r10, r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (f(r8, r10, r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (p(r8, r10, r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, com.yandex.passport.internal.methods.e eVar, cg6 cg6Var) {
        n nVar;
        int i;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.l = i2 - Integer.MIN_VALUE;
                Object obj = nVar.j;
                Object obj2 = nm6.a;
                i = nVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    return Unit.a;
                }
                qgg.h0(obj);
                if (eVar instanceof com.yandex.passport.internal.methods.q) {
                    com.yandex.passport.internal.methods.q qVar = (com.yandex.passport.internal.methods.q) eVar;
                    String str2 = qVar.a;
                    com.yandex.passport.internal.entities.k kVar = (com.yandex.passport.internal.entities.k) qVar.c;
                    nVar.l = 1;
                } else if (eVar instanceof com.yandex.passport.internal.methods.h) {
                    com.yandex.passport.internal.methods.h hVar = (com.yandex.passport.internal.methods.h) eVar;
                    String str3 = hVar.a;
                    com.yandex.passport.internal.properties.e eVar2 = (com.yandex.passport.internal.properties.e) hVar.c;
                    nVar.l = 2;
                } else if (eVar instanceof com.yandex.passport.internal.methods.k) {
                    com.yandex.passport.internal.methods.k kVar2 = (com.yandex.passport.internal.methods.k) eVar;
                    String str4 = kVar2.a;
                    com.yandex.passport.internal.properties.g gVar = (com.yandex.passport.internal.properties.g) kVar2.c;
                    nVar.l = 3;
                } else {
                    String str5 = eVar.a;
                    Object valueOf = String.valueOf(eVar.a());
                    nVar.l = 4;
                }
                return obj2;
            }
        }
        nVar = new n(this, cg6Var);
        Object obj3 = nVar.j;
        Object obj22 = nm6.a;
        i = nVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(v5 v5Var, cg6 cg6Var) {
        o oVar;
        int i;
        Iterator it;
        int i2;
        if (cg6Var instanceof o) {
            oVar = (o) cg6Var;
            int i3 = oVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.o = i3 - Integer.MIN_VALUE;
                Object obj = oVar.m;
                Object obj2 = nm6.a;
                i = oVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    List a = v5Var.a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : a) {
                        com.yandex.passport.internal.methods.e eVar = (com.yandex.passport.internal.methods.e) obj3;
                        if ((eVar instanceof g6) || (eVar instanceof v6) || (eVar instanceof w6) || (eVar instanceof c6) || (eVar instanceof com.yandex.passport.internal.methods.l) || (eVar instanceof com.yandex.passport.internal.methods.q) || (eVar instanceof m6) || (eVar instanceof com.yandex.passport.internal.methods.h) || (eVar instanceof com.yandex.passport.internal.methods.k) || (eVar instanceof com.yandex.passport.internal.methods.j) || (eVar instanceof com.yandex.passport.internal.methods.u) || (eVar instanceof x5) || (eVar instanceof z6) || (eVar instanceof a7) || (eVar instanceof com.yandex.passport.internal.methods.w)) {
                            arrayList.add(obj3);
                        }
                    }
                    it = arrayList.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = oVar.l;
                    Iterator it2 = oVar.k;
                    v5 v5Var2 = oVar.j;
                    qgg.h0(obj);
                    it = it2;
                    i2 = i4;
                    v5Var = v5Var2;
                }
                while (it.hasNext()) {
                    com.yandex.passport.internal.methods.e eVar2 = (com.yandex.passport.internal.methods.e) it.next();
                    String name = v5Var.a.name();
                    oVar.j = v5Var;
                    oVar.k = it;
                    oVar.l = i2;
                    oVar.o = 1;
                    if (n(name, eVar2, oVar) == obj2) {
                        return obj2;
                    }
                }
                return Unit.a;
            }
        }
        oVar = new o(this, cg6Var);
        Object obj4 = oVar.m;
        Object obj22 = nm6.a;
        i = oVar.o;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, String str2, Object obj, cg6 cg6Var) {
        p pVar;
        int i;
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i2 = pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = pVar.j;
                nm6 nm6Var = nm6.a;
                i = pVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj2);
                        return ((z7o) obj2).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj2);
                String valueOf = String.valueOf(obj);
                this.a.getClass();
                com.yandex.passport.internal.database.diary.b bVar = new com.yandex.passport.internal.database.diary.b(str2, str, valueOf, System.currentTimeMillis());
                pVar.l = 1;
                Object b = this.b.b(bVar, pVar);
                return b == nm6Var ? nm6Var : b;
            }
        }
        pVar = new p(this, cg6Var);
        Object obj22 = pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (p(r12, r11, r10, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (p(r10, r11, r12, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (p(r10, r11, "SetCurrentProperties", r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, String str2, com.yandex.passport.internal.properties.c0 c0Var, cg6 cg6Var) {
        q qVar;
        int i;
        String str3;
        com.yandex.passport.internal.properties.c0 c0Var2;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.o = i2 - Integer.MIN_VALUE;
                Object obj = qVar.m;
                Object obj2 = nm6.a;
                i = qVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (c0Var == null) {
                        qVar.j = null;
                        qVar.k = null;
                        qVar.l = null;
                        qVar.o = 1;
                    } else {
                        qVar.j = str;
                        qVar.k = str2;
                        qVar.l = c0Var;
                        qVar.o = 2;
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    return Unit.a;
                }
                if (i == 2) {
                    c0Var = qVar.l;
                    str2 = qVar.k;
                    str = qVar.j;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    String n = ouj.n(str2, ".uid");
                    Object obj3 = c0Var.a;
                    qVar.j = str;
                    qVar.k = str2;
                    qVar.l = c0Var;
                    qVar.o = 3;
                    if (p(str, n, obj3, qVar) != obj2) {
                        com.yandex.passport.internal.properties.c0 c0Var3 = c0Var;
                        str3 = str;
                        c0Var2 = c0Var3;
                        String n2 = ouj.n(str2, ".progressProperties");
                        Object obj4 = c0Var2.b;
                        qVar.j = null;
                        qVar.k = null;
                        qVar.l = null;
                        qVar.o = 4;
                    }
                    return obj2;
                }
                if (i == 3) {
                    c0Var2 = qVar.l;
                    str2 = qVar.k;
                    str3 = qVar.j;
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    String n22 = ouj.n(str2, ".progressProperties");
                    Object obj42 = c0Var2.b;
                    qVar.j = null;
                    qVar.k = null;
                    qVar.l = null;
                    qVar.o = 4;
                } else {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                return Unit.a;
            }
        }
        qVar = new q(this, cg6Var);
        Object obj5 = qVar.m;
        Object obj22 = nm6.a;
        i = qVar.o;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0109, code lost:
    
        if (p(r8, r7, r6, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f0, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (p(r8, r9, r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (p(r6, r7, "SocialApplicationBindProperties", r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(String str, String str2, com.yandex.passport.internal.properties.d0 d0Var, cg6 cg6Var) {
        r rVar;
        String str3;
        com.yandex.passport.internal.properties.d0 d0Var2;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i = rVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.o = i - Integer.MIN_VALUE;
                Object obj = rVar.m;
                Object obj2 = nm6.a;
                switch (rVar.o) {
                    case 0:
                        qgg.h0(obj);
                        rVar.j = str;
                        rVar.k = str2;
                        rVar.l = d0Var;
                        rVar.o = 1;
                        break;
                    case 1:
                        d0Var = rVar.l;
                        str2 = rVar.k;
                        str = rVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n = ouj.n(str2, ".filter");
                        com.yandex.passport.internal.entities.k kVar = d0Var.a;
                        rVar.j = str;
                        rVar.k = str2;
                        rVar.l = d0Var;
                        rVar.o = 2;
                        if (j(str, n, kVar, rVar) != obj2) {
                            com.yandex.passport.internal.properties.d0 d0Var3 = d0Var;
                            str3 = str;
                            d0Var2 = d0Var3;
                            String n2 = ouj.n(str2, ".theme");
                            Object obj3 = d0Var2.b;
                            rVar.j = str3;
                            rVar.k = str2;
                            rVar.l = d0Var2;
                            rVar.o = 3;
                            break;
                        }
                        return obj2;
                    case 2:
                        d0Var2 = rVar.l;
                        str2 = rVar.k;
                        str3 = rVar.j;
                        qgg.h0(obj);
                        String n22 = ouj.n(str2, ".theme");
                        Object obj32 = d0Var2.b;
                        rVar.j = str3;
                        rVar.k = str2;
                        rVar.l = d0Var2;
                        rVar.o = 3;
                        break;
                    case 3:
                        d0Var2 = rVar.l;
                        str2 = rVar.k;
                        str3 = rVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".uid");
                        Object obj4 = d0Var2.c;
                        rVar.j = str3;
                        rVar.k = str2;
                        rVar.l = d0Var2;
                        rVar.o = 4;
                        break;
                    case 4:
                        d0Var2 = rVar.l;
                        str2 = rVar.k;
                        str3 = rVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".applicationName");
                        Object obj5 = d0Var2.d;
                        rVar.j = str3;
                        rVar.k = str2;
                        rVar.l = d0Var2;
                        rVar.o = 5;
                        break;
                    case 5:
                        d0Var2 = rVar.l;
                        str2 = rVar.k;
                        str3 = rVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n5 = ouj.n(str2, ".clientId");
                        Object obj6 = d0Var2.e;
                        rVar.j = null;
                        rVar.k = null;
                        rVar.l = null;
                        rVar.o = 6;
                        break;
                    case 6:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        rVar = new r(this, cg6Var);
        Object obj7 = rVar.m;
        Object obj22 = nm6.a;
        switch (rVar.o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00eb, code lost:
    
        if (t(r12, r11, r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        if (p(r12, r13, r2, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (p(r12, r13, r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (p(r10, r11, "SocialBindProperties", r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(String str, String str2, com.yandex.passport.internal.properties.e0 e0Var, cg6 cg6Var) {
        s sVar;
        Object obj;
        int i;
        String n;
        com.yandex.passport.internal.entities.k kVar;
        String str3;
        com.yandex.passport.internal.properties.e0 e0Var2;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = sVar.m;
                obj = nm6.a;
                i = sVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    sVar.j = str;
                    sVar.k = str2;
                    sVar.l = e0Var;
                    sVar.o = 1;
                } else if (i == 1) {
                    e0Var = sVar.l;
                    str2 = sVar.k;
                    str = sVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                } else if (i == 2) {
                    e0Var2 = sVar.l;
                    str2 = sVar.k;
                    str3 = sVar.j;
                    qgg.h0(obj2);
                    String n2 = ouj.n(str2, ".theme");
                    Object obj3 = e0Var2.b;
                    sVar.j = str3;
                    sVar.k = str2;
                    sVar.l = e0Var2;
                    sVar.o = 3;
                } else if (i == 3) {
                    e0Var2 = sVar.l;
                    str2 = sVar.k;
                    str3 = sVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n3 = ouj.n(str2, ".uid");
                    Object obj4 = e0Var2.c;
                    sVar.j = str3;
                    sVar.k = str2;
                    sVar.l = e0Var2;
                    sVar.o = 4;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e0Var2 = sVar.l;
                    str2 = sVar.k;
                    str3 = sVar.j;
                    qgg.h0(obj2);
                    ((z7o) obj2).getClass();
                    String n4 = ouj.n(str2, ".socialBindingConfiguration");
                    w1 w1Var = e0Var2.d;
                    w1Var.getClass();
                    com.yandex.passport.internal.a0 a = com.yandex.passport.internal.y.a(w1Var);
                    sVar.j = null;
                    sVar.k = null;
                    sVar.l = null;
                    sVar.o = 5;
                }
                n = ouj.n(str2, ".filter");
                kVar = e0Var.a;
                sVar.j = str;
                sVar.k = str2;
                sVar.l = e0Var;
                sVar.o = 2;
                if (j(str, n, kVar, sVar) != obj) {
                    com.yandex.passport.internal.properties.e0 e0Var3 = e0Var;
                    str3 = str;
                    e0Var2 = e0Var3;
                    String n22 = ouj.n(str2, ".theme");
                    Object obj32 = e0Var2.b;
                    sVar.j = str3;
                    sVar.k = str2;
                    sVar.l = e0Var2;
                    sVar.o = 3;
                }
                return obj;
            }
        }
        sVar = new s(this, cg6Var);
        Object obj22 = sVar.m;
        obj = nm6.a;
        i = sVar.o;
        if (i != 0) {
        }
        n = ouj.n(str2, ".filter");
        kVar = e0Var.a;
        sVar.j = str;
        sVar.k = str2;
        sVar.l = e0Var;
        sVar.o = 2;
        if (j(str, n, kVar, sVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0132, code lost:
    
        if (p(r9, r8, r7, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011a, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fe, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (p(r9, r10, r2, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (p(r7, r8, r9, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if (p(r7, r8, "SocialConfiguration", r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, String str2, com.yandex.passport.internal.a0 a0Var, cg6 cg6Var) {
        t tVar;
        String str3;
        com.yandex.passport.internal.a0 a0Var2;
        if (cg6Var instanceof t) {
            tVar = (t) cg6Var;
            int i = tVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.o = i - Integer.MIN_VALUE;
                Object obj = tVar.m;
                Object obj2 = nm6.a;
                switch (tVar.o) {
                    case 0:
                        qgg.h0(obj);
                        if (a0Var != null) {
                            tVar.j = str;
                            tVar.k = str2;
                            tVar.l = a0Var;
                            tVar.o = 2;
                            break;
                        } else {
                            tVar.j = null;
                            tVar.k = null;
                            tVar.l = null;
                            tVar.o = 1;
                            break;
                        }
                        return obj2;
                    case 1:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    case 2:
                        a0Var = tVar.l;
                        str2 = tVar.k;
                        str = tVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n = ouj.n(str2, ".id");
                        Object obj3 = a0Var.a;
                        tVar.j = str;
                        tVar.k = str2;
                        tVar.l = a0Var;
                        tVar.o = 3;
                        if (p(str, n, obj3, tVar) != obj2) {
                            com.yandex.passport.internal.a0 a0Var3 = a0Var;
                            str3 = str;
                            a0Var2 = a0Var3;
                            String n2 = ouj.n(str2, ".type");
                            Object obj4 = a0Var2.b;
                            tVar.j = str3;
                            tVar.k = str2;
                            tVar.l = a0Var2;
                            tVar.o = 4;
                            break;
                        }
                        return obj2;
                    case 3:
                        a0Var2 = tVar.l;
                        str2 = tVar.k;
                        str3 = tVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n22 = ouj.n(str2, ".type");
                        Object obj42 = a0Var2.b;
                        tVar.j = str3;
                        tVar.k = str2;
                        tVar.l = a0Var2;
                        tVar.o = 4;
                        break;
                    case 4:
                        a0Var2 = tVar.l;
                        str2 = tVar.k;
                        str3 = tVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".scope");
                        Object obj5 = a0Var2.c;
                        tVar.j = str3;
                        tVar.k = str2;
                        tVar.l = a0Var2;
                        tVar.o = 5;
                        break;
                    case 5:
                        a0Var2 = tVar.l;
                        str2 = tVar.k;
                        str3 = tVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".isBrowserRequired");
                        Object valueOf = Boolean.valueOf(a0Var2.d);
                        tVar.j = str3;
                        tVar.k = str2;
                        tVar.l = a0Var2;
                        tVar.o = 6;
                        break;
                    case 6:
                        a0Var2 = tVar.l;
                        str2 = tVar.k;
                        str3 = tVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n5 = ouj.n(str2, ".extraQueryParams");
                        Object obj6 = a0Var2.e;
                        tVar.j = null;
                        tVar.k = null;
                        tVar.l = null;
                        tVar.o = 7;
                        break;
                    case 7:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tVar = new t(this, cg6Var);
        Object obj7 = tVar.m;
        Object obj22 = nm6.a;
        switch (tVar.o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (p(r10, r9, r8, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (p(r8, r9, "SocialRegistrationProperties", r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(String str, String str2, com.yandex.passport.internal.properties.f0 f0Var, cg6 cg6Var) {
        u uVar;
        Object obj;
        int i;
        String n;
        Object obj2;
        String str3;
        com.yandex.passport.internal.properties.f0 f0Var2;
        if (cg6Var instanceof u) {
            uVar = (u) cg6Var;
            int i2 = uVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = uVar.m;
                obj = nm6.a;
                i = uVar.o;
                if (i != 0) {
                    qgg.h0(obj3);
                    uVar.j = str;
                    uVar.k = str2;
                    uVar.l = f0Var;
                    uVar.o = 1;
                } else if (i == 1) {
                    f0Var = uVar.l;
                    str2 = uVar.k;
                    str = uVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj3);
                        ((z7o) obj3).getClass();
                        return Unit.a;
                    }
                    f0Var2 = uVar.l;
                    str2 = uVar.k;
                    str3 = uVar.j;
                    qgg.h0(obj3);
                    ((z7o) obj3).getClass();
                    String n2 = ouj.n(str2, ".message");
                    Object obj4 = f0Var2.b;
                    uVar.j = null;
                    uVar.k = null;
                    uVar.l = null;
                    uVar.o = 3;
                }
                n = ouj.n(str2, ".uid");
                obj2 = f0Var.a;
                uVar.j = str;
                uVar.k = str2;
                uVar.l = f0Var;
                uVar.o = 2;
                if (p(str, n, obj2, uVar) != obj) {
                    com.yandex.passport.internal.properties.f0 f0Var3 = f0Var;
                    str3 = str;
                    f0Var2 = f0Var3;
                    String n22 = ouj.n(str2, ".message");
                    Object obj42 = f0Var2.b;
                    uVar.j = null;
                    uVar.k = null;
                    uVar.l = null;
                    uVar.o = 3;
                }
                return obj;
            }
        }
        uVar = new u(this, cg6Var);
        Object obj32 = uVar.m;
        obj = nm6.a;
        i = uVar.o;
        if (i != 0) {
        }
        n = ouj.n(str2, ".uid");
        obj2 = f0Var.a;
        uVar.j = str;
        uVar.k = str2;
        uVar.l = f0Var;
        uVar.o = 2;
        if (p(str, n, obj2, uVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0137, code lost:
    
        if (p(r8, r7, r6, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011e, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0106, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (p(r8, r9, r2, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (p(r6, r7, "TurboAppAuthProperties", r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, String str2, com.yandex.passport.internal.properties.h0 h0Var, cg6 cg6Var) {
        v vVar;
        String str3;
        com.yandex.passport.internal.properties.h0 h0Var2;
        if (cg6Var instanceof v) {
            vVar = (v) cg6Var;
            int i = vVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.o = i - Integer.MIN_VALUE;
                Object obj = vVar.m;
                Object obj2 = nm6.a;
                switch (vVar.o) {
                    case 0:
                        qgg.h0(obj);
                        vVar.j = str;
                        vVar.k = str2;
                        vVar.l = h0Var;
                        vVar.o = 1;
                        break;
                    case 1:
                        h0Var = vVar.l;
                        str2 = vVar.k;
                        str = vVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n = ouj.n(str2, ".theme");
                        Object obj3 = h0Var.a;
                        vVar.j = str;
                        vVar.k = str2;
                        vVar.l = h0Var;
                        vVar.o = 2;
                        if (p(str, n, obj3, vVar) != obj2) {
                            com.yandex.passport.internal.properties.h0 h0Var3 = h0Var;
                            str3 = str;
                            h0Var2 = h0Var3;
                            String n2 = ouj.n(str2, ".environment");
                            Object obj4 = h0Var2.b;
                            vVar.j = str3;
                            vVar.k = str2;
                            vVar.l = h0Var2;
                            vVar.o = 3;
                            break;
                        }
                        return obj2;
                    case 2:
                        h0Var2 = vVar.l;
                        str2 = vVar.k;
                        str3 = vVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n22 = ouj.n(str2, ".environment");
                        Object obj42 = h0Var2.b;
                        vVar.j = str3;
                        vVar.k = str2;
                        vVar.l = h0Var2;
                        vVar.o = 3;
                        break;
                    case 3:
                        h0Var2 = vVar.l;
                        str2 = vVar.k;
                        str3 = vVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".uid");
                        Object obj5 = h0Var2.c;
                        vVar.j = str3;
                        vVar.k = str2;
                        vVar.l = h0Var2;
                        vVar.o = 4;
                        break;
                    case 4:
                        h0Var2 = vVar.l;
                        str2 = vVar.k;
                        str3 = vVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".clientId");
                        Object obj6 = h0Var2.d;
                        vVar.j = str3;
                        vVar.k = str2;
                        vVar.l = h0Var2;
                        vVar.o = 5;
                        break;
                    case 5:
                        h0Var2 = vVar.l;
                        str2 = vVar.k;
                        str3 = vVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n5 = ouj.n(str2, ".turboAppIdentifier");
                        Object obj7 = h0Var2.e;
                        vVar.j = str3;
                        vVar.k = str2;
                        vVar.l = h0Var2;
                        vVar.o = 6;
                        break;
                    case 6:
                        h0Var2 = vVar.l;
                        str2 = vVar.k;
                        str3 = vVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n6 = ouj.n(str2, ".scopes");
                        Object obj8 = h0Var2.f;
                        vVar.j = null;
                        vVar.k = null;
                        vVar.l = null;
                        vVar.o = 7;
                        break;
                    case 7:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        vVar = new v(this, cg6Var);
        Object obj9 = vVar.m;
        Object obj22 = nm6.a;
        switch (vVar.o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0105, code lost:
    
        if (p(r9, r8, r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ed, code lost:
    
        if (p(r9, r10, r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        if (p(r9, r10, r2, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (p(r7, r8, r9, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (p(r7, r8, "TurboAuthParams", r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(String str, String str2, com.yandex.passport.internal.entities.v vVar, cg6 cg6Var) {
        w wVar;
        String str3;
        com.yandex.passport.internal.entities.v vVar2;
        if (cg6Var instanceof w) {
            wVar = (w) cg6Var;
            int i = wVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.o = i - Integer.MIN_VALUE;
                Object obj = wVar.m;
                Object obj2 = nm6.a;
                switch (wVar.o) {
                    case 0:
                        qgg.h0(obj);
                        if (vVar != null) {
                            wVar.j = str;
                            wVar.k = str2;
                            wVar.l = vVar;
                            wVar.o = 2;
                            break;
                        } else {
                            wVar.j = null;
                            wVar.k = null;
                            wVar.l = null;
                            wVar.o = 1;
                            break;
                        }
                        return obj2;
                    case 1:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    case 2:
                        vVar = wVar.l;
                        str2 = wVar.k;
                        str = wVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n = ouj.n(str2, ".phoneNumber");
                        Object obj3 = vVar.a;
                        wVar.j = str;
                        wVar.k = str2;
                        wVar.l = vVar;
                        wVar.o = 3;
                        if (p(str, n, obj3, wVar) != obj2) {
                            com.yandex.passport.internal.entities.v vVar3 = vVar;
                            str3 = str;
                            vVar2 = vVar3;
                            String n2 = ouj.n(str2, ".email");
                            Object obj4 = vVar2.b;
                            wVar.j = str3;
                            wVar.k = str2;
                            wVar.l = vVar2;
                            wVar.o = 4;
                            break;
                        }
                        return obj2;
                    case 3:
                        vVar2 = wVar.l;
                        str2 = wVar.k;
                        str3 = wVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n22 = ouj.n(str2, ".email");
                        Object obj42 = vVar2.b;
                        wVar.j = str3;
                        wVar.k = str2;
                        wVar.l = vVar2;
                        wVar.o = 4;
                        break;
                    case 4:
                        vVar2 = wVar.l;
                        str2 = wVar.k;
                        str3 = wVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".firstName");
                        Object obj5 = vVar2.c;
                        wVar.j = str3;
                        wVar.k = str2;
                        wVar.l = vVar2;
                        wVar.o = 5;
                        break;
                    case 5:
                        vVar2 = wVar.l;
                        str2 = wVar.k;
                        str3 = wVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".lastName");
                        Object obj6 = vVar2.d;
                        wVar.j = null;
                        wVar.k = null;
                        wVar.l = null;
                        wVar.o = 6;
                        break;
                    case 6:
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        wVar = new w(this, cg6Var);
        Object obj7 = wVar.m;
        Object obj22 = nm6.a;
        switch (wVar.o) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(String str, Uri uri, cg6 cg6Var) {
        x xVar;
        int i;
        if (cg6Var instanceof x) {
            xVar = (x) cg6Var;
            int i2 = xVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.l = i2 - Integer.MIN_VALUE;
                Object obj = xVar.j;
                Object obj2 = nm6.a;
                i = xVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Object valueOf = String.valueOf(uri);
                xVar.l = 1;
                Object p = p(str, "Uri", valueOf, xVar);
                return p == obj2 ? obj2 : p;
            }
        }
        xVar = new x(this, cg6Var);
        Object obj3 = xVar.j;
        Object obj22 = nm6.a;
        i = xVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (p(r8, r9, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (p(r8, r9, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (p(r8, r9, "UserMenuProperties", r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(String str, String str2, com.yandex.passport.internal.properties.j0 j0Var, cg6 cg6Var) {
        y yVar;
        int i;
        if (cg6Var instanceof y) {
            yVar = (y) cg6Var;
            int i2 = yVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.o = i2 - Integer.MIN_VALUE;
                Object obj = yVar.m;
                Object obj2 = nm6.a;
                i = yVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j0Var == null) {
                        yVar.j = null;
                        yVar.k = null;
                        yVar.l = null;
                        yVar.o = 1;
                    } else {
                        yVar.j = str;
                        yVar.k = str2;
                        yVar.l = j0Var;
                        yVar.o = 2;
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    return Unit.a;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    return Unit.a;
                }
                j0Var = yVar.l;
                str2 = yVar.k;
                str = yVar.j;
                qgg.h0(obj);
                ((z7o) obj).getClass();
                String n = ouj.n(str2, ".theme");
                Object obj3 = j0Var.a;
                yVar.j = null;
                yVar.k = null;
                yVar.l = null;
                yVar.o = 3;
            }
        }
        yVar = new y(this, cg6Var);
        Object obj4 = yVar.m;
        Object obj22 = nm6.a;
        i = yVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0243, code lost:
    
        if (b(r8, r7, r6, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0229, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0210, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01f3, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d6, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01bc, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a2, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0189, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0153, code lost:
    
        if (p(r8, r9, r2, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
    
        if (p(r8, r9, r2, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fd, code lost:
    
        if (p(r6, r7, "VisualProperties", r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(String str, String str2, com.yandex.passport.internal.properties.k0 k0Var, cg6 cg6Var) {
        z zVar;
        String str3;
        com.yandex.passport.internal.properties.k0 k0Var2;
        if (cg6Var instanceof z) {
            zVar = (z) cg6Var;
            int i = zVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.o = i - Integer.MIN_VALUE;
                Object obj = zVar.m;
                Object obj2 = nm6.a;
                switch (zVar.o) {
                    case 0:
                        qgg.h0(obj);
                        zVar.j = str;
                        zVar.k = str2;
                        zVar.l = k0Var;
                        zVar.o = 1;
                        break;
                    case 1:
                        k0Var = zVar.l;
                        str2 = zVar.k;
                        str = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n = ouj.n(str2, ".isNoReturnToHost");
                        Object valueOf = Boolean.valueOf(k0Var.a);
                        zVar.j = str;
                        zVar.k = str2;
                        zVar.l = k0Var;
                        zVar.o = 2;
                        if (p(str, n, valueOf, zVar) != obj2) {
                            com.yandex.passport.internal.properties.k0 k0Var3 = k0Var;
                            str3 = str;
                            k0Var2 = k0Var3;
                            String n2 = ouj.n(str2, ".isSkipButtonShown");
                            Object valueOf2 = Boolean.valueOf(k0Var2.b);
                            zVar.j = str3;
                            zVar.k = str2;
                            zVar.l = k0Var2;
                            zVar.o = 3;
                            break;
                        }
                        return obj2;
                    case 2:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n22 = ouj.n(str2, ".isSkipButtonShown");
                        Object valueOf22 = Boolean.valueOf(k0Var2.b);
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 3;
                        break;
                    case 3:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n3 = ouj.n(str2, ".identifierHintVariant");
                        Object obj3 = k0Var2.d;
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 4;
                        break;
                    case 4:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n4 = ouj.n(str2, ".isSocialAuthorizationEnabled");
                        Object valueOf3 = Boolean.valueOf(k0Var2.e);
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 5;
                        break;
                    case 5:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n5 = ouj.n(str2, ".authMessage");
                        Object obj4 = k0Var2.f;
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 6;
                        break;
                    case 6:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n6 = ouj.n(str2, ".usernameMessage");
                        Object obj5 = k0Var2.g;
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 7;
                        break;
                    case 7:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n7 = ouj.n(str2, ".registrationMessage");
                        Object obj6 = k0Var2.h;
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 8;
                        break;
                    case 8:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n8 = ouj.n(str2, ".deleteAccountMessage");
                        Object obj7 = k0Var2.i;
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 9;
                        break;
                    case 9:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n9 = ouj.n(str2, ".isPreferPhonishAuth");
                        Object valueOf4 = Boolean.valueOf(k0Var2.j);
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 10;
                        break;
                    case 10:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n10 = ouj.n(str2, ".isChoosingAnotherAccountOnReloginButtonHidden");
                        Object valueOf5 = Boolean.valueOf(k0Var2.k);
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 11;
                        break;
                    case 11:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n11 = ouj.n(str2, ".customLogoText");
                        Object obj8 = k0Var2.l;
                        zVar.j = str3;
                        zVar.k = str2;
                        zVar.l = k0Var2;
                        zVar.o = 12;
                        break;
                    case 12:
                        k0Var2 = zVar.l;
                        str2 = zVar.k;
                        str3 = zVar.j;
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        String n12 = ouj.n(str2, ".accountListProperties");
                        com.yandex.passport.internal.properties.a aVar = k0Var2.m;
                        zVar.j = null;
                        zVar.k = null;
                        zVar.l = null;
                        zVar.o = 13;
                        break;
                    case 13:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        zVar = new z(this, cg6Var);
        Object obj9 = zVar.m;
        Object obj22 = nm6.a;
        switch (zVar.o) {
        }
    }
}
