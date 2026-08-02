package com.yandex.passport.common.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.etn;
import defpackage.inr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uah;
import defpackage.xq0;
import defpackage.z7o;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k {
    public static final long e = com.yandex.passport.common.time.a.c(0, 5, 0, 11);
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final f b;
    public final String c;
    public final String d;

    public k(Context context, f fVar, String str, String str2) {
        this.a = context;
        this.b = fVar;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(k kVar, String str, String str2, cg6 cg6Var) {
        h hVar;
        int i;
        a aVar;
        String str3;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hVar.k;
                nm6 nm6Var = nm6.a;
                i = hVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    a b = kVar.b(str, str2);
                    hVar.j = b;
                    hVar.m = 1;
                    obj = kVar.b.a(e, hVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    aVar = b;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = hVar.j;
                    qgg.h0(obj);
                }
                Pair pair = new Pair(CommonUrlParts.APP_ID, aVar.d);
                Pair pair2 = new Pair(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
                String str4 = Build.MANUFACTURER;
                str4.getClass();
                Pair pair3 = new Pair("manufacturer", str4);
                String str5 = Build.MODEL;
                str5.getClass();
                Pair pair4 = new Pair(CommonUrlParts.MODEL, str5);
                Pair pair5 = new Pair("am_version_name", "7.54.1(754014992)");
                Pair pair6 = new Pair(CommonUrlParts.APP_VERSION, aVar.e);
                str3 = ((b) obj).a;
                if (str3 == null) {
                    str3 = null;
                }
                Map unmodifiableMap = Collections.unmodifiableMap(uah.e(pair, pair2, pair3, pair4, pair5, pair6, new Pair("device_id", str3)));
                unmodifiableMap.getClass();
                return unmodifiableMap;
            }
        }
        hVar = new h(kVar, cg6Var);
        Object obj2 = hVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hVar.m;
        if (i != 0) {
        }
        Pair pair7 = new Pair(CommonUrlParts.APP_ID, aVar.d);
        Pair pair22 = new Pair(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
        String str42 = Build.MANUFACTURER;
        str42.getClass();
        Pair pair32 = new Pair("manufacturer", str42);
        String str52 = Build.MODEL;
        str52.getClass();
        Pair pair42 = new Pair(CommonUrlParts.MODEL, str52);
        Pair pair52 = new Pair("am_version_name", "7.54.1(754014992)");
        Pair pair62 = new Pair(CommonUrlParts.APP_VERSION, aVar.e);
        str3 = ((b) obj2).a;
        if (str3 == null) {
        }
        Map unmodifiableMap2 = Collections.unmodifiableMap(uah.e(pair7, pair22, pair32, pair42, pair52, pair62, new Pair("device_id", str3)));
        unmodifiableMap2.getClass();
        return unmodifiableMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(k kVar, cg6 cg6Var) {
        i iVar;
        int i;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iVar.j;
                nm6 nm6Var = nm6.a;
                i = iVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    iVar.l = 1;
                    obj = kVar.b.a(e, iVar);
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
                return ((b) obj).a;
            }
        }
        iVar = new i(kVar, cg6Var);
        Object obj2 = iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = iVar.l;
        if (i != 0) {
        }
        return ((b) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(k kVar, cg6 cg6Var) {
        j jVar;
        int i;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jVar.j;
                nm6 nm6Var = nm6.a;
                i = jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    jVar.l = 1;
                    obj = kVar.b.a(e, jVar);
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
                return ((b) obj).b;
            }
        }
        jVar = new j(kVar, cg6Var);
        Object obj2 = jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jVar.l;
        if (i != 0) {
        }
        return ((b) obj2).b;
    }

    public final a b(String str, String str2) {
        String str3;
        Context context = this.a;
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        locale.getClass();
        String language = locale.getLanguage();
        language.getClass();
        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.permission.b.b;
        com.yandex.passport.common.permission.a[] aVarArr = com.yandex.passport.common.permission.a.a;
        aVar.getClass();
        String str4 = null;
        if (etn.z(context, "android.permission.READ_PHONE_STATE") == 0) {
            Object systemService = context.getSystemService("phone");
            systemService.getClass();
            str3 = com.yandex.plus.core.network.api.utils.a.z(((TelephonyManager) systemService).getNetworkOperatorName());
        } else {
            str3 = null;
        }
        String z = com.yandex.plus.core.network.api.utils.a.z(str3);
        String z2 = com.yandex.plus.core.network.api.utils.a.z(this.c);
        String z3 = com.yandex.plus.core.network.api.utils.a.z(str);
        if (z3 == null) {
            z3 = context.getPackageName();
        }
        z3.getClass();
        String z4 = com.yandex.plus.core.network.api.utils.a.z(str2);
        if (z4 == null) {
            try {
                str4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z4 = com.yandex.plus.core.network.api.utils.a.z(str4);
        }
        return new a(language, z, z2, z3, z4, com.yandex.plus.core.network.api.utils.a.z(this.d));
    }

    public final Map c(String str, String str2) {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Looper.getMainLooper();
            Looper.myLooper();
        }
        Object B = com.yandex.passport.internal.ui.a.B(new inr(this, str, str2, (Continuation) null, 16));
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        r7o r7oVar = z7o.b;
        if (B instanceof t7o) {
            B = e5bVar;
        }
        return (Map) B;
    }

    public final String d() {
        return this.b.b().a;
    }
}
