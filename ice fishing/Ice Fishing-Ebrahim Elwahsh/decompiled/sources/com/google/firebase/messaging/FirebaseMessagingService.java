package com.google.firebase.messaging;

import I0.j;
import K2.b;
import K2.l;
import K2.m;
import K2.n;
import T2.a;
import Y2.e;
import a.AbstractC0415a;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g;
import f4.f;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends f {

    /* renamed from: z, reason: collision with root package name */
    public static final ArrayDeque f36363z = new ArrayDeque(10);

    /* renamed from: y, reason: collision with root package name */
    public b f36364y;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a2  */
    @Override // f4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        String stringExtra;
        b bVar;
        int i;
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
            ArrayDeque arrayDeque = f36363z;
            if (arrayDeque.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.f36364y == null) {
                    this.f36364y = new b(getApplicationContext());
                }
                bVar = this.f36364y;
                if (bVar.f1570c.a() >= 233700000) {
                    AbstractC0415a.q(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle = new Bundle();
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                bundle.putString("google.message_id", stringExtra3);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle.putInt("google.product_id", valueOf.intValue());
                }
                n c4 = n.c(bVar.f1569b);
                synchronized (c4) {
                    i = c4.f1604a;
                    c4.f1604a = 1 + i;
                }
                c4.d(new l(i, 3, bundle, 0));
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
                g.P(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (j.u(extras)) {
                    j jVar = new j(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io", 0));
                    try {
                        if (!new e(this, jVar, newSingleThreadExecutor, 26).A()) {
                            newSingleThreadExecutor.shutdown();
                            if (g.T(intent)) {
                                g.Q("_nf", intent.getExtras());
                                break;
                            }
                        } else {
                            break;
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new m(stringExtra4);
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
        if (this.f36364y == null) {
        }
        bVar = this.f36364y;
        if (bVar.f1570c.a() >= 233700000) {
        }
    }
}
