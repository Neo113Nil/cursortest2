package com.plaid.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: com.plaid.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0099b0 {
    public final Context a;
    public final CrashApiOptions b;
    public final Y c;
    public final H0 d;
    public final P6<Breadcrumb> e;
    public UUID f;
    public final Lazy g;

    public C0099b0(Context context, CrashApiOptions crashApiOptions, Y y) {
        O4 o4 = O4.a;
        context.getClass();
        crashApiOptions.getClass();
        y.getClass();
        o4.getClass();
        this.a = context;
        this.b = crashApiOptions;
        this.c = y;
        this.d = o4;
        this.e = new P6<>();
        this.g = LazyKt.lazy(new C0089a0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Crash a(Crash crash) {
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        crash.getBreadcrumbs$crash_reporting_release().clear();
        crash.getBreadcrumbs$crash_reporting_release().addAll(this.e.a());
        crash.getContexts$crash_reporting_release().clear();
        Map<String, CrashContext> contexts$crash_reporting_release = crash.getContexts$crash_reporting_release();
        UUID uuid = this.f;
        Context context = this.a;
        context.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = String.valueOf(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                str2 = null;
            }
            try {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                str3 = String.valueOf(applicationInfo != null ? applicationInfo.loadLabel(context.getPackageManager()) : null);
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                e.printStackTrace();
                str3 = null;
                if (str != null) {
                }
                if (str2 != null) {
                }
                if (str3 != null) {
                }
                if (linkedHashMap3.isEmpty()) {
                }
                contexts$crash_reporting_release.put("app", new CrashContext(0, uuid, null, null, linkedHashMap3 == null ? new LinkedHashMap(linkedHashMap3) : null, 13, null));
                Map<String, CrashContext> contexts$crash_reporting_release2 = crash.getContexts$crash_reporting_release();
                UUID uuid2 = this.f;
                H0 h0 = this.d;
                h0.getClass();
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", h0.getId());
                linkedHashMap.put("manufacturer", h0.a());
                linkedHashMap.put("model", h0.b());
                linkedHashMap.put("name", h0.g());
                linkedHashMap.put("type", h0.d());
                linkedHashMap.put("version", h0.e());
                if (linkedHashMap.isEmpty()) {
                }
                contexts$crash_reporting_release2.put("device", new CrashContext(0, uuid2, null, null, linkedHashMap == null ? new LinkedHashMap(linkedHashMap) : null, 13, null));
                Map<String, CrashContext> contexts$crash_reporting_release3 = crash.getContexts$crash_reporting_release();
                UUID uuid3 = this.f;
                H0 h02 = this.d;
                h02.getClass();
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("name", h02.c());
                linkedHashMap2.put("version", C0108c.a(h02));
                if (linkedHashMap2.isEmpty()) {
                }
                contexts$crash_reporting_release3.put("os", new CrashContext(0, uuid3, null, null, linkedHashMap2 != null ? new LinkedHashMap(linkedHashMap2) : null, 13, null));
                return crash;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            str = null;
            str2 = null;
        }
        if (str != null) {
            linkedHashMap3.put("version", str);
        }
        if (str2 != null) {
            linkedHashMap3.put("build", str2);
        }
        if (str3 != null) {
            linkedHashMap3.put("name", str3);
        }
        if (linkedHashMap3.isEmpty()) {
            linkedHashMap3 = null;
        }
        contexts$crash_reporting_release.put("app", new CrashContext(0, uuid, null, null, linkedHashMap3 == null ? new LinkedHashMap(linkedHashMap3) : null, 13, null));
        Map<String, CrashContext> contexts$crash_reporting_release22 = crash.getContexts$crash_reporting_release();
        UUID uuid22 = this.f;
        H0 h03 = this.d;
        h03.getClass();
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", h03.getId());
        linkedHashMap.put("manufacturer", h03.a());
        linkedHashMap.put("model", h03.b());
        linkedHashMap.put("name", h03.g());
        linkedHashMap.put("type", h03.d());
        linkedHashMap.put("version", h03.e());
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        contexts$crash_reporting_release22.put("device", new CrashContext(0, uuid22, null, null, linkedHashMap == null ? new LinkedHashMap(linkedHashMap) : null, 13, null));
        Map<String, CrashContext> contexts$crash_reporting_release32 = crash.getContexts$crash_reporting_release();
        UUID uuid32 = this.f;
        H0 h022 = this.d;
        h022.getClass();
        linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("name", h022.c());
        linkedHashMap2.put("version", C0108c.a(h022));
        if (linkedHashMap2.isEmpty()) {
            linkedHashMap2 = null;
        }
        contexts$crash_reporting_release32.put("os", new CrashContext(0, uuid32, null, null, linkedHashMap2 != null ? new LinkedHashMap(linkedHashMap2) : null, 13, null));
        return crash;
    }

    public final Crash a(Throwable th) {
        th.getClass();
        UUID randomUUID = UUID.randomUUID();
        this.f = randomUUID;
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String replace$default = StringsKt__StringsJVMKt.replace$default(uuid, "-", "");
        String format2 = ((SimpleDateFormat) this.g.getValue()).format(new Date());
        format2.getClass();
        String message = th.getMessage();
        CrashLogLevel crashLogLevel = CrashLogLevel.ERROR;
        String release = this.b.getRelease();
        String a = this.c.a();
        ExceptionInterface exceptionInterface = new ExceptionInterface(th);
        DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
        debugMetaInterface.getDebugImages().add(new DebugImage(new String[]{"ad3c3c24-0fa0-504e-84f0-421b8bbfa16a"}[0], null, 2, null));
        return a(new Crash(replace$default, message, format2, crashLogLevel, null, null, null, null, null, null, null, release, null, a, null, null, null, exceptionInterface, debugMetaInterface, 120816, null));
    }
}
