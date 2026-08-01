package com.google.firebase.messaging;

import L2.b;
import L2.l;
import L2.m;
import L2.n;
import S0.f;
import U2.a;
import X2.e;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import g1.C4522b;
import j4.g;
import j4.h;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends h {

    /* renamed from: z, reason: collision with root package name */
    public static final ArrayDeque f36201z = new ArrayDeque(10);

    /* renamed from: y, reason: collision with root package name */
    public b f36202y;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a0  */
    @Override // j4.h
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
            ArrayDeque arrayDeque = f36201z;
            if (arrayDeque.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.f36202y == null) {
                    this.f36202y = new b(getApplicationContext());
                }
                bVar = this.f36202y;
                if (bVar.f1625c.a() >= 233700000) {
                    f.h(new IOException("SERVICE_NOT_AVAILABLE"));
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
                n c9 = n.c(bVar.f1624b);
                synchronized (c9) {
                    i = c9.f1659a;
                    c9.f1659a = 1 + i;
                }
                c9.d(new l(i, 3, bundle, 0));
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
                e.K(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (C4522b.K(extras)) {
                    C4522b c4522b = new C4522b(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io"));
                    try {
                        if (!new g(this, c4522b, newSingleThreadExecutor).o()) {
                            newSingleThreadExecutor.shutdown();
                            if (e.O(intent)) {
                                e.L("_nf", intent.getExtras());
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
        if (this.f36202y == null) {
        }
        bVar = this.f36202y;
        if (bVar.f1625c.a() >= 233700000) {
        }
    }
}
