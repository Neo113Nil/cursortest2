package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.CoreConstants;
import defpackage.anx;
import defpackage.es6;
import defpackage.h4b;
import defpackage.kkp;
import defpackage.lkx;
import defpackage.m8b;
import defpackage.my1;
import defpackage.rho;
import defpackage.swi;
import defpackage.v5g;
import defpackage.ywf;
import defpackage.zun;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class FirebaseMessagingService extends m8b {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private rho rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // defpackage.m8b
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) kkp.v().e).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c5  */
    @Override // defpackage.m8b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        String stringExtra;
        rho rhoVar;
        int i;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            Queue<String> queue = recentlyReceivedMessageIds;
            if (queue.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.rpc == null) {
                    this.rpc = new rho(getApplicationContext());
                }
                rhoVar = this.rpc;
                if (rhoVar.c.w() >= 233700000) {
                    ywf.v(new IOException("SERVICE_NOT_AVAILABLE"));
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
                anx J = anx.J(rhoVar.b);
                synchronized (J) {
                    i = J.a;
                    J.a = i + 1;
                }
                J.K(new lkx(i, 3, bundle, 0));
                return;
            }
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = CoreConstants.Transport.GCM;
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                v5g.I(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (h4b.I(extras)) {
                    h4b h4bVar = new h4b();
                    h4bVar.a = new Bundle(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new swi("Firebase-Messaging-Network-Io"));
                    es6 es6Var = new es6();
                    es6Var.a = newSingleThreadExecutor;
                    es6Var.b = this;
                    es6Var.c = h4bVar;
                    try {
                        if (es6Var.R()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (v5g.N(intent)) {
                                v5g.J(intent.getExtras(), "_nf");
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                onMessageReceived(new zun(extras));
                break;
            case "send_error":
                String stringExtra4 = intent.getStringExtra("google.message_id");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("message_id");
                }
                String stringExtra5 = intent.getStringExtra("error");
                my1 my1Var = new my1(stringExtra5);
                if (stringExtra5 != null) {
                    stringExtra5.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra4, my1Var);
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        if (this.rpc == null) {
        }
        rhoVar = this.rpc;
        if (rhoVar.c.w() >= 233700000) {
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageSent(@NonNull String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }

    public void setRpcForTesting(rho rhoVar) {
        this.rpc = rhoVar;
    }

    public void onMessageReceived(@NonNull zun zunVar) {
    }
}
