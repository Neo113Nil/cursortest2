package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import d8.g;
import d8.r;
import g7.o;
import i7.b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l6.a;
import l6.k;
import l6.l;
import t5.c;
import t5.e;
import w5.i;
import w5.n;
import x4.f;
import x7.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends g {

    /* renamed from: m, reason: collision with root package name */
    public static final ArrayDeque f1469m = new ArrayDeque(10);

    /* renamed from: l, reason: collision with root package name */
    public a f1470l;

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02de A[Catch: RuntimeException -> 0x02fb, TryCatch #11 {RuntimeException -> 0x02fb, blocks: (B:134:0x02ba, B:136:0x02de, B:137:0x02fd, B:138:0x030c), top: B:133:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fd A[Catch: RuntimeException -> 0x02fb, TryCatch #11 {RuntimeException -> 0x02fb, blocks: (B:134:0x02ba, B:136:0x02de, B:137:0x02fd, B:138:0x030c), top: B:133:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    @Override // d8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        String stringExtra;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z10;
        Bundle extras;
        int parseInt;
        int i10;
        String string;
        String string2;
        String string3;
        long parseLong;
        c cVar;
        Set set;
        String str;
        String str2;
        a aVar;
        int i11;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                intent.getStringExtra("token");
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            ArrayDeque arrayDeque = f1469m;
            if (arrayDeque.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.f1470l == null) {
                    this.f1470l = new a(getApplicationContext());
                }
                aVar = this.f1470l;
                if (aVar.f4169c.q() >= 233700000) {
                    new o().k(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle2 = new Bundle();
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                bundle2.putString("google.message_id", stringExtra3);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle2.putInt("google.product_id", valueOf.intValue());
                }
                l m10 = l.m(aVar.f4168b);
                synchronized (m10) {
                    i11 = m10.f4198a;
                    m10.f4198a = i11 + 1;
                }
                m10.n(new k(i11, 3, bundle2, 0));
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                break;
            case "gcm":
                if (f.X(intent)) {
                    f.O("_nr", intent.getExtras());
                }
                if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                    try {
                        i7.g.b();
                        i7.g b2 = i7.g.b();
                        b2.a();
                        Context context = b2.f3231a;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                        if (sharedPreferences.contains("export_to_big_query")) {
                            z10 = sharedPreferences.getBoolean("export_to_big_query", false);
                        } else {
                            try {
                                PackageManager packageManager = context.getPackageManager();
                                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                    z10 = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                    } catch (IllegalStateException unused2) {
                        Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
                    }
                    if (z10) {
                        e eVar = FirebaseMessaging.f1458l;
                        if (eVar == null) {
                            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                        } else {
                            Bundle extras2 = intent.getExtras();
                            if (extras2 == null) {
                                extras2 = Bundle.EMPTY;
                            }
                            Object obj = extras2.get("google.ttl");
                            try {
                                if (obj instanceof Integer) {
                                    parseInt = ((Integer) obj).intValue();
                                } else {
                                    if (obj instanceof String) {
                                        try {
                                            parseInt = Integer.parseInt((String) obj);
                                        } catch (NumberFormatException unused3) {
                                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                                        }
                                    }
                                    i10 = 0;
                                    string = extras2.getString("google.to");
                                    if (TextUtils.isEmpty(string)) {
                                        try {
                                            i7.g b10 = i7.g.b();
                                            Object obj2 = x7.c.f8377m;
                                            b10.a();
                                            string = (String) b.l(((x7.c) b10.f3234d.a(d.class)).c());
                                        } catch (InterruptedException | ExecutionException e10) {
                                            throw new RuntimeException(e10);
                                        }
                                    }
                                    String str3 = string;
                                    i7.g b11 = i7.g.b();
                                    b11.a();
                                    String packageName = b11.f3231a.getPackageName();
                                    e8.b bVar = !d8.o.f(extras2) ? e8.b.DISPLAY_NOTIFICATION : e8.b.DATA_MESSAGE;
                                    string2 = extras2.getString("google.message_id");
                                    if (string2 == null) {
                                        string2 = extras2.getString("message_id");
                                    }
                                    String str4 = string2 == null ? string2 : "";
                                    string3 = extras2.getString("from");
                                    if (string3 != null || !string3.startsWith("/topics/")) {
                                        string3 = null;
                                    }
                                    String str5 = string3 == null ? string3 : "";
                                    String string4 = extras2.getString("collapse_key");
                                    String str6 = string4 == null ? string4 : "";
                                    String string5 = extras2.getString("google.c.a.m_l");
                                    String str7 = string5 == null ? string5 : "";
                                    String string6 = extras2.getString("google.c.a.c_l");
                                    String str8 = string6 == null ? string6 : "";
                                    if (extras2.containsKey("google.c.sender.id")) {
                                        try {
                                            parseLong = Long.parseLong(extras2.getString("google.c.sender.id"));
                                        } catch (NumberFormatException e11) {
                                            Log.w("FirebaseMessaging", "error parsing project number", e11);
                                        }
                                        e8.d dVar = new e8.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8);
                                        t5.b bVar2 = new t5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                        cVar = new c("proto");
                                        new d6.f(6);
                                        n nVar = (n) eVar;
                                        set = nVar.f7700a;
                                        if (set.contains(cVar)) {
                                            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
                                        }
                                        i iVar = nVar.f7701b;
                                        w5.o oVar = nVar.f7702c;
                                        a5.c cVar2 = new a5.c();
                                        cVar2.f262h = iVar;
                                        cVar2.f261g = cVar;
                                        cVar2.f263i = oVar;
                                        cVar2.J(new t5.a(new e8.e(dVar), bVar2));
                                    }
                                    i7.g b12 = i7.g.b();
                                    i7.i iVar2 = b12.f3233c;
                                    b12.a();
                                    str = iVar2.f3249e;
                                    if (str != null) {
                                        try {
                                            parseLong = Long.parseLong(str);
                                        } catch (NumberFormatException e12) {
                                            Log.w("FirebaseMessaging", "error parsing sender ID", e12);
                                        }
                                        e8.d dVar2 = new e8.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8);
                                        t5.b bVar22 = new t5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                        cVar = new c("proto");
                                        new d6.f(6);
                                        n nVar2 = (n) eVar;
                                        set = nVar2.f7700a;
                                        if (set.contains(cVar)) {
                                        }
                                    }
                                    b12.a();
                                    str2 = iVar2.f3246b;
                                    if (str2.startsWith("1:")) {
                                        try {
                                            parseLong = Long.parseLong(str2);
                                        } catch (NumberFormatException e13) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e13);
                                        }
                                    } else {
                                        String[] split = str2.split(":");
                                        if (split.length >= 2) {
                                            String str9 = split[1];
                                            if (!str9.isEmpty()) {
                                                try {
                                                    parseLong = Long.parseLong(str9);
                                                } catch (NumberFormatException e14) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                                }
                                            }
                                        }
                                        parseLong = 0;
                                    }
                                    e8.d dVar22 = new e8.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8);
                                    t5.b bVar222 = new t5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                    cVar = new c("proto");
                                    new d6.f(6);
                                    n nVar22 = (n) eVar;
                                    set = nVar22.f7700a;
                                    if (set.contains(cVar)) {
                                    }
                                }
                                t5.b bVar2222 = new t5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                cVar = new c("proto");
                                new d6.f(6);
                                n nVar222 = (n) eVar;
                                set = nVar222.f7700a;
                                if (set.contains(cVar)) {
                                }
                            } catch (RuntimeException e15) {
                                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e15);
                            }
                            i10 = parseInt;
                            string = extras2.getString("google.to");
                            if (TextUtils.isEmpty(string)) {
                            }
                            String str32 = string;
                            i7.g b112 = i7.g.b();
                            b112.a();
                            String packageName2 = b112.f3231a.getPackageName();
                            e8.b bVar3 = !d8.o.f(extras2) ? e8.b.DISPLAY_NOTIFICATION : e8.b.DATA_MESSAGE;
                            string2 = extras2.getString("google.message_id");
                            if (string2 == null) {
                            }
                            if (string2 == null) {
                            }
                            string3 = extras2.getString("from");
                            if (string3 != null) {
                            }
                            string3 = null;
                            if (string3 == null) {
                            }
                            String string42 = extras2.getString("collapse_key");
                            if (string42 == null) {
                            }
                            String string52 = extras2.getString("google.c.a.m_l");
                            if (string52 == null) {
                            }
                            String string62 = extras2.getString("google.c.a.c_l");
                            if (string62 == null) {
                            }
                            if (extras2.containsKey("google.c.sender.id")) {
                            }
                            i7.g b122 = i7.g.b();
                            i7.i iVar22 = b122.f3233c;
                            b122.a();
                            str = iVar22.f3249e;
                            if (str != null) {
                            }
                            b122.a();
                            str2 = iVar22.f3246b;
                            if (str2.startsWith("1:")) {
                            }
                            e8.d dVar222 = new e8.d(parseLong <= 0 ? parseLong : 0L, str4, str32, bVar3, packageName2, str6, i10, str5, str7, str8);
                        }
                    }
                    extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    extras.remove("androidx.content.wakelockid");
                    if (d8.o.f(extras)) {
                        d8.o oVar2 = new d8.o(extras, 0);
                        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new u6.a("Firebase-Messaging-Network-Io"));
                        a5.c cVar3 = new a5.c();
                        cVar3.f262h = newSingleThreadExecutor;
                        cVar3.f261g = this;
                        cVar3.f263i = oVar2;
                        try {
                            if (!cVar3.y()) {
                                newSingleThreadExecutor.shutdown();
                                if (f.X(intent)) {
                                    f.O("_nf", intent.getExtras());
                                    break;
                                }
                            } else {
                                break;
                            }
                        } finally {
                            newSingleThreadExecutor.shutdown();
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
                extras = intent.getExtras();
                if (extras == null) {
                }
                extras.remove("androidx.content.wakelockid");
                if (d8.o.f(extras)) {
                }
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new r(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        if (this.f1470l == null) {
        }
        aVar = this.f1470l;
        if (aVar.f4169c.q() >= 233700000) {
        }
    }
}
