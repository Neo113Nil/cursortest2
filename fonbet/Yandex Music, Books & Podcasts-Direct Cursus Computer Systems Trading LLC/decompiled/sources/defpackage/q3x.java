package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class q3x implements tqj, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q3x(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        p84.f((p84) ((p3x) this.b).i, "launchApplication", task);
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        zix zixVar;
        rgx b;
        switch (this.a) {
            case 0:
                b4x b4xVar = (b4x) this.b;
                b4xVar.h = (xmp) obj;
                vs3 vs3Var = b4xVar.g;
                if (vs3Var != null) {
                    vs3Var.a(null);
                    return;
                }
                return;
            default:
                o64 o64Var = (o64) this.b;
                Bundle bundle = (Bundle) obj;
                if (sbx.k) {
                    Context context = o64Var.a;
                    w8c w8cVar = o64Var.e;
                    sbx sbxVar = new sbx(context, w8cVar, o64Var.b, o64Var.h, o64Var.f);
                    int i = 0;
                    int i2 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
                    boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
                    boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
                    sbx.k = z2;
                    if (i2 == 0) {
                        if (!z && !z2) {
                            return;
                        } else {
                            i2 = 0;
                        }
                    }
                    sbxVar.h = new m4x(context, bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L));
                    String packageName = context.getPackageName();
                    Locale locale = Locale.ROOT;
                    String n = ouj.n(packageName, ".client_cast_analytics_data");
                    sbxVar.i = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") != 0 ? 2 : 1;
                    t9t.b(context);
                    sbxVar.g = t9t.a().c(vn3.e).a("CAST_SENDER_SDK", new p6b("proto"), new jml());
                    if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                        sbxVar.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
                    }
                    SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(n, 0);
                    if (i2 != 0) {
                        q5i a = h8s.a();
                        a.c = new q8x(w8cVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                        a.d = new i6c[]{vwb.m};
                        a.a = false;
                        a.b = 8426;
                        onx c = w8cVar.c(0, a.c());
                        anx anxVar = new anx();
                        anxVar.b = sbxVar;
                        anxVar.c = packageName;
                        anxVar.a = i2;
                        anxVar.d = sharedPreferences;
                        c.o(anxVar);
                    }
                    if (z) {
                        y1g.G(sharedPreferences);
                        msg msgVar = zix.i;
                        synchronized (zix.class) {
                            try {
                                if (zix.k == null) {
                                    zix.k = new zix(sharedPreferences, sbxVar, packageName);
                                }
                                zixVar = zix.k;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        String str = zixVar.c;
                        SharedPreferences sharedPreferences2 = zixVar.b;
                        HashSet hashSet = zixVar.f;
                        String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                        String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                        hashSet.clear();
                        HashSet hashSet2 = zixVar.g;
                        hashSet2.clear();
                        zixVar.h = 0L;
                        String str2 = zix.j;
                        if (str2.equals(string) && str.equals(string2)) {
                            zixVar.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                            long currentTimeMillis = System.currentTimeMillis();
                            HashSet hashSet3 = new HashSet();
                            for (String str3 : sharedPreferences2.getAll().keySet()) {
                                if (str3.startsWith("feature_usage_timestamp_")) {
                                    long j = sharedPreferences2.getLong(str3, 0L);
                                    if (j != 0 && currentTimeMillis - j > 1209600000) {
                                        hashSet3.add(str3);
                                    } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                        rgx b2 = zix.b(str3.substring(41));
                                        if (b2 != null) {
                                            hashSet2.add(b2);
                                            hashSet.add(b2);
                                        }
                                    } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b = zix.b(str3.substring(41))) != null) {
                                        hashSet.add(b);
                                    }
                                }
                            }
                            zixVar.c(hashSet3);
                            y1g.G(zixVar.e);
                            y1g.G(zixVar.d);
                            zixVar.e.post(zixVar.d);
                        } else {
                            HashSet hashSet4 = new HashSet();
                            for (String str4 : sharedPreferences2.getAll().keySet()) {
                                if (str4.startsWith("feature_usage_timestamp_")) {
                                    hashSet4.add(str4);
                                }
                            }
                            hashSet4.add("feature_usage_last_report_time");
                            zixVar.c(hashSet4);
                            sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                        }
                        zix.a(rgx.CAST_CONTEXT);
                    }
                    if (sbx.k) {
                        synchronized (klx.class) {
                            if (klx.b == null) {
                                klx klxVar = new klx(i);
                                new ConcurrentHashMap();
                                klx.b = klxVar;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
