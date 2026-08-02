package com.yandex.passport.data.network.core;

import android.os.Build;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.s7e;
import defpackage.xq0;
import defpackage.xz0;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class l {
    public final com.yandex.passport.common.analytics.f a;
    public final com.yandex.passport.common.a b;
    public final com.yandex.passport.internal.report.d c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public l(com.yandex.passport.common.analytics.f fVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.common.a aVar2, com.yandex.passport.internal.report.d dVar) {
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        dVar.getClass();
        this.a = fVar;
        this.b = aVar2;
        this.c = dVar;
        this.d = Build.MANUFACTURER;
        this.e = Build.MODEL;
        com.yandex.passport.internal.common.d dVar2 = (com.yandex.passport.internal.common.d) aVar;
        this.f = dVar2.a();
        this.g = dVar2.b();
        StringBuilder sb = new StringBuilder("Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (");
        this.h = dfi.i(sb, Build.VERSION.CODENAME, ')');
        this.i = "7.54.1(754014992)";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce A[LOOP:0: B:23:0x00c8->B:25:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.common.network.p pVar, cg6 cg6Var) {
        i iVar;
        int i;
        String str;
        String str2;
        String str3;
        Iterator it;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = iVar.k;
                nm6 nm6Var = nm6.a;
                i = iVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pVar.F("manufacturer", this.d);
                    pVar.F(CommonUrlParts.MODEL, this.e);
                    pVar.F(CommonUrlParts.APP_PLATFORM, this.h);
                    pVar.F("am_version_name", this.i);
                    pVar.F(CommonUrlParts.APP_ID, this.f);
                    pVar.F(CommonUrlParts.APP_VERSION, this.g);
                    pVar.F("am_app", d());
                    iVar.j = pVar;
                    iVar.m = 1;
                    obj = this.a.a(com.yandex.passport.common.time.a.c(0, 5, 0, 11), iVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = iVar.j;
                    qgg.h0(obj);
                }
                com.yandex.passport.common.analytics.b bVar = (com.yandex.passport.common.analytics.b) obj;
                str = bVar.a;
                str2 = bVar.b;
                if (str == null) {
                    str = null;
                }
                pVar.F(CommonUrlParts.DEVICE_ID, str);
                str3 = bVar.a;
                if (str3 == null) {
                    str3 = null;
                }
                pVar.F("device_id", str3);
                pVar.F("uuid", str2 != null ? null : str2);
                StringBuilder sb = new StringBuilder();
                if (str2 == null) {
                    str2 = null;
                }
                sb.append(str2);
                this.b.getClass();
                sb.append(System.currentTimeMillis());
                pVar.F(CommonUrlParts.REQUEST_ID, sb.toString());
                it = this.c.b().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    pVar.F((String) pair.a, (String) pair.b);
                }
                return Unit.a;
            }
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
        if (i != 0) {
        }
        com.yandex.passport.common.analytics.b bVar2 = (com.yandex.passport.common.analytics.b) obj2;
        str = bVar2.a;
        str2 = bVar2.b;
        if (str == null) {
        }
        pVar.F(CommonUrlParts.DEVICE_ID, str);
        str3 = bVar2.a;
        if (str3 == null) {
        }
        pVar.F("device_id", str3);
        pVar.F("uuid", str2 != null ? null : str2);
        StringBuilder sb2 = new StringBuilder();
        if (str2 == null) {
        }
        sb2.append(str2);
        this.b.getClass();
        sb2.append(System.currentTimeMillis());
        pVar.F(CommonUrlParts.REQUEST_ID, sb2.toString());
        it = this.c.b().iterator();
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce A[LOOP:0: B:23:0x00c8->B:25:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.common.network.n nVar, cg6 cg6Var) {
        j jVar;
        int i;
        String str;
        String str2;
        String str3;
        Iterator it;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jVar.k;
                nm6 nm6Var = nm6.a;
                i = jVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    nVar.O("manufacturer", this.d);
                    nVar.O(CommonUrlParts.MODEL, this.e);
                    nVar.O(CommonUrlParts.APP_PLATFORM, this.h);
                    nVar.O("am_version_name", this.i);
                    nVar.O(CommonUrlParts.APP_ID, this.f);
                    nVar.O(CommonUrlParts.APP_VERSION, this.g);
                    nVar.O("am_app", d());
                    jVar.j = nVar;
                    jVar.m = 1;
                    obj = this.a.a(com.yandex.passport.common.time.a.c(0, 5, 0, 11), jVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = jVar.j;
                    qgg.h0(obj);
                }
                com.yandex.passport.common.analytics.b bVar = (com.yandex.passport.common.analytics.b) obj;
                str = bVar.a;
                str2 = bVar.b;
                if (str == null) {
                    str = null;
                }
                nVar.O(CommonUrlParts.DEVICE_ID, str);
                str3 = bVar.a;
                if (str3 == null) {
                    str3 = null;
                }
                nVar.O("device_id", str3);
                nVar.O("uuid", str2 != null ? null : str2);
                StringBuilder sb = new StringBuilder();
                if (str2 == null) {
                    str2 = null;
                }
                sb.append(str2);
                this.b.getClass();
                sb.append(System.currentTimeMillis());
                nVar.O(CommonUrlParts.REQUEST_ID, sb.toString());
                it = this.c.b().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    nVar.O((String) pair.a, (String) pair.b);
                }
                return Unit.a;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jVar.m;
        if (i != 0) {
        }
        com.yandex.passport.common.analytics.b bVar2 = (com.yandex.passport.common.analytics.b) obj2;
        str = bVar2.a;
        str2 = bVar2.b;
        if (str == null) {
        }
        nVar.O(CommonUrlParts.DEVICE_ID, str);
        str3 = bVar2.a;
        if (str3 == null) {
        }
        nVar.O("device_id", str3);
        nVar.O("uuid", str2 != null ? null : str2);
        StringBuilder sb2 = new StringBuilder();
        if (str2 == null) {
        }
        sb2.append(str2);
        this.b.getClass();
        sb2.append(System.currentTimeMillis());
        nVar.O(CommonUrlParts.REQUEST_ID, sb2.toString());
        it = this.c.b().iterator();
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s7e s7eVar, cg6 cg6Var) {
        k kVar;
        int i;
        String str;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.m = i2 - Integer.MIN_VALUE;
                Object obj = kVar.k;
                nm6 nm6Var = nm6.a;
                i = kVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    s7eVar.d("manufacturer", this.d);
                    s7eVar.d(CommonUrlParts.MODEL, this.e);
                    s7eVar.d(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                    s7eVar.d("am_version_name", this.i);
                    s7eVar.d(CommonUrlParts.APP_ID, this.f);
                    s7eVar.d(CommonUrlParts.APP_VERSION, this.g);
                    s7eVar.d("am_app", d());
                    kVar.j = s7eVar;
                    kVar.m = 1;
                    obj = this.a.a(com.yandex.passport.common.time.a.c(0, 5, 0, 11), kVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s7eVar = kVar.j;
                    qgg.h0(obj);
                }
                com.yandex.passport.common.analytics.b bVar = (com.yandex.passport.common.analytics.b) obj;
                str = bVar.a;
                if (str == null) {
                    str = null;
                }
                s7eVar.d("device_id", str);
                String str2 = bVar.b;
                s7eVar.d("uuid", str2 != null ? str2 : null);
                return s7eVar;
            }
        }
        kVar = new k(this, cg6Var);
        Object obj2 = kVar.k;
        nm6 nm6Var2 = nm6.a;
        i = kVar.m;
        if (i != 0) {
        }
        com.yandex.passport.common.analytics.b bVar2 = (com.yandex.passport.common.analytics.b) obj2;
        str = bVar2.a;
        if (str == null) {
        }
        s7eVar.d("device_id", str);
        String str22 = bVar2.b;
        s7eVar.d("uuid", str22 != null ? str22 : null);
        return s7eVar;
    }

    public final String d() {
        String str = this.g;
        if (StringsKt.U(str)) {
            str = null;
        }
        return CollectionsKt.X(xz0.w(new String[]{this.f, str}), StringUtil.SPACE, null, null, null, 62);
    }
}
