package com.yandex.passport.internal.methods.requester;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.common.network.n;
import com.yandex.passport.data.network.k5;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.analytics.v;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.w5;
import defpackage.b6e;
import defpackage.btf;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.i4w;
import defpackage.jyr;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.y2x;
import defpackage.z7o;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class f {
    public static final jyr c = btf.b(new k5(24));
    public final n a;
    public final com.yandex.passport.internal.autologin.ui.a b;

    public f(n nVar, com.yandex.passport.internal.autologin.ui.a aVar) {
        this.a = nVar;
        this.b = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:12|(1:14)(1:90)|15|16|17|(3:19|20|21)(1:86)|22|23|24|25|(2:27|(1:29))(1:55)|30|(1:32)(1:54)|33|(2:49|(1:51)(2:52|53))(2:35|(1:37))|41|(1:43)|44|(2:46|47)(3:48|10|(4:91|(1:93)|94|(3:96|(1:98)|99)(2:100|101))(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        r1 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e0, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e2, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "call " + r2 + " failed", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0103, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0105, code lost:
    
        r3 = r0;
        r0 = android.os.SystemClock.elapsedRealtime() - r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0112, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0114, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, defpackage.dfi.d(r0, "call: time="), 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0122, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a6, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        r1 = android.os.SystemClock.elapsedRealtime() - r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b4, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, defpackage.dfi.d(r1, "call: time="), 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d6, code lost:
    
        r24 = r9;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x018c -> B:10:0x0190). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, w5 w5Var, Bundle bundle, cg6 cg6Var) {
        d dVar;
        int i;
        xqn i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        Bundle bundle2;
        d dVar2;
        w5 w5Var2;
        Object t7oVar;
        int i7;
        Bundle bundle3;
        Bundle bundle4;
        f fVar2 = fVar;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i8 = dVar.t;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.t = i8 - Integer.MIN_VALUE;
                Object obj = dVar.r;
                nm6 nm6Var = nm6.a;
                i = dVar.t;
                if (i != 0) {
                    i2 = hrg.i(obj);
                    iArr = g.a;
                    i3 = 5;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    bundle2 = bundle;
                    dVar2 = dVar;
                    w5Var2 = w5Var;
                    if (i4 < i3) {
                    }
                    return t7oVar;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i9 = dVar.q;
                int i10 = dVar.p;
                int i11 = dVar.o;
                int i12 = dVar.n;
                int[] iArr2 = dVar.m;
                xqn xqnVar = dVar.l;
                Bundle bundle5 = dVar.k;
                w5 w5Var3 = dVar.j;
                qgg.h0(obj);
                d dVar3 = dVar;
                nm6 nm6Var2 = nm6Var;
                boolean z = true;
                w5Var2 = w5Var3;
                i6 = i11;
                i3 = i9;
                bundle2 = bundle5;
                i2 = xqnVar;
                iArr = iArr2;
                i5 = i12;
                i4 = i10 + 1;
                fVar2 = fVar;
                dVar2 = dVar3;
                nm6Var = nm6Var2;
                if (i4 < i3) {
                    int i13 = iArr[i4];
                    int i14 = i6 + 1;
                    long elapsedRealtime = com.yandex.passport.common.logger.a.a.isEnabled() ? SystemClock.elapsedRealtime() : 0L;
                    nm6 nm6Var3 = nm6Var;
                    n nVar = fVar2.a;
                    String name = w5Var2.name();
                    name.getClass();
                    ContentProviderClient acquireUnstableContentProviderClient = ((ContentResolver) nVar.b).acquireUnstableContentProviderClient((Uri) nVar.c);
                    if (acquireUnstableContentProviderClient != null) {
                        i7 = i3;
                        try {
                            bundle3 = acquireUnstableContentProviderClient.call(name, null, bundle2);
                        } finally {
                        }
                    } else {
                        i7 = i3;
                        bundle3 = null;
                    }
                    i4w.w(acquireUnstableContentProviderClient, null);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        bundle4 = bundle3;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, dfi.d(elapsedRealtime2, "call: time="), 8);
                        }
                    } else {
                        bundle4 = bundle3;
                    }
                    Bundle bundle6 = bundle4;
                    Throwable th = null;
                    Object m2bVar = th == null ? new m2b(th) : new l2b(bundle6);
                    if (m2bVar instanceof l2b) {
                        t7oVar = (Bundle) ((l2b) m2bVar).a;
                        if (t7oVar != null) {
                            r7o r7oVar = z7o.b;
                        }
                    } else {
                        if (!(m2bVar instanceof m2b)) {
                            b6e.s();
                            return null;
                        }
                        i2.a = (Throwable) ((m2b) m2bVar).a;
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, f1d.e(i6, i13, "call retry: counter=", " timeout="), 8);
                    }
                    long a = com.yandex.passport.common.time.a.a(0, 0, i13);
                    dVar2.j = w5Var2;
                    dVar2.k = bundle2;
                    dVar2.l = i2;
                    dVar2.m = iArr;
                    dVar2.n = i5;
                    dVar2.o = i14;
                    dVar2.p = i4;
                    int i15 = i7;
                    dVar2.q = i15;
                    z = true;
                    dVar2.t = 1;
                    nm6Var2 = nm6Var3;
                    if (y2x.o(a, dVar2) != nm6Var2) {
                        return nm6Var2;
                    }
                    i3 = i15;
                    i6 = i14;
                    dVar3 = dVar2;
                    i10 = i4;
                    i4 = i10 + 1;
                    fVar2 = fVar;
                    dVar2 = dVar3;
                    nm6Var = nm6Var2;
                    if (i4 < i3) {
                        Throwable th2 = (Throwable) i2.a;
                        IReporterYandex iReporterYandex = fVar.b.a;
                        w5Var2.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("method_name", w5Var2.name());
                        if (th2 != null) {
                            linkedHashMap.put(Constants.KEY_EXCEPTION, th2.getMessage());
                        }
                        iReporterYandex.reportEvent(p.f.b, linkedHashMap);
                        if (th2 == null) {
                            t tVar = new t("Passport content provider unexpectedly returned `null` when trying to process " + w5Var2);
                            r7o r7oVar2 = z7o.b;
                            return new t7o(tVar);
                        }
                        iReporterYandex.reportError(v.a.b, th2);
                        com.yandex.passport.common.logger.d dVar4 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Method " + w5Var2 + " have failed with throwable", th2);
                        }
                        t tVar2 = new t("Method " + w5Var2 + " have failed with throwable", th2);
                        r7o r7oVar3 = z7o.b;
                        t7oVar = new t7o(tVar2);
                    }
                }
                return t7oVar;
            }
        }
        dVar = new d(fVar2, cg6Var);
        Object obj2 = dVar.r;
        nm6 nm6Var4 = nm6.a;
        i = dVar.t;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(v5 v5Var, cg6 cg6Var) {
        e eVar;
        int i;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                Object obj = eVar.j;
                nm6 nm6Var = nm6.a;
                i = eVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    kotlinx.coroutines.a aVar = (kotlinx.coroutines.a) c.getValue();
                    b bVar = new b(this, v5Var, null, 1);
                    eVar.l = 1;
                    obj = x97.V(aVar, bVar, eVar);
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
                return ((z7o) obj).a;
            }
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }
}
