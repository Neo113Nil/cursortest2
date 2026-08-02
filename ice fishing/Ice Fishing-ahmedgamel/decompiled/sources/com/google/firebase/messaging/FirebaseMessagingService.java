package com.google.firebase.messaging;

import N2.b;
import N2.m;
import N2.n;
import N2.o;
import W2.a;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.d;
import com.bumptech.glide.f;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l.C4659e;
import l4.g;
import l4.h;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends h {

    /* renamed from: z, reason: collision with root package name */
    public static final ArrayDeque f36968z = new ArrayDeque(10);

    /* renamed from: y, reason: collision with root package name */
    public b f36969y;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a0  */
    @Override // l4.h
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
            ArrayDeque arrayDeque = f36968z;
            if (arrayDeque.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.f36969y == null) {
                    this.f36969y = new b(getApplicationContext());
                }
                bVar = this.f36969y;
                if (bVar.f1914c.a() >= 233700000) {
                    d.q(new IOException("SERVICE_NOT_AVAILABLE"));
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
                o c9 = o.c(bVar.f1913b);
                synchronized (c9) {
                    i = c9.f1949a;
                    c9.f1949a = 1 + i;
                }
                c9.d(new m(i, 3, bundle, 0));
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
                f.o(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (C4659e.y(extras)) {
                    C4659e c4659e = new C4659e(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io"));
                    try {
                        if (!new g(this, c4659e, newSingleThreadExecutor).o()) {
                            newSingleThreadExecutor.shutdown();
                            if (f.u(intent)) {
                                f.p("_nf", intent.getExtras());
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
                new n(stringExtra4);
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
        if (this.f36969y == null) {
        }
        bVar = this.f36969y;
        if (bVar.f1914c.a() >= 233700000) {
        }
    }
}
