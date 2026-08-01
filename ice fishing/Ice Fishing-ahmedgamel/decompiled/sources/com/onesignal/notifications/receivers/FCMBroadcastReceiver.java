package com.onesignal.notifications.receivers;

import B7.h;
import I7.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bumptech.glide.d;
import com.onesignal.common.threading.c;
import kotlin.jvm.internal.e;
import p4.g;
import p5.C4839a;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class FCMBroadcastReceiver extends BroadcastReceiver {
    public static final a Companion = new a(null);
    private static final String FCM_RECEIVE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String FCM_TYPE = "gcm";
    private static final String MESSAGE_TYPE_EXTRA_KEY = "message_type";

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isFCMMessage(Intent intent) {
            if (!FCMBroadcastReceiver.FCM_RECEIVE_ACTION.equals(intent.getAction())) {
                return false;
            }
            String stringExtra = intent.getStringExtra(FCMBroadcastReceiver.MESSAGE_TYPE_EXTRA_KEY);
            return stringExtra == null || FCMBroadcastReceiver.FCM_TYPE.equals(stringExtra);
        }

        private a() {
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;
        final /* synthetic */ FCMBroadcastReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, FCMBroadcastReceiver fCMBroadcastReceiver, Bundle bundle, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$context = context;
            this.$pendingResult = pendingResult;
            this.$intent = intent;
            this.this$0 = fCMBroadcastReceiver;
            this.$bundle = bundle;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return new b(this.$context, this.$pendingResult, this.$intent, this.this$0, this.$bundle, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                d.k(obj);
                Context applicationContext = this.$context.getApplicationContext();
                kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = g.b(applicationContext, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.k(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            v vVar = v.f41353a;
            if (!booleanValue) {
                com.onesignal.debug.internal.logging.b.warn$default("FCMBroadcastReceiver skipped due to failed OneSignal init", null, 2, null);
                this.$pendingResult.finish();
                return vVar;
            }
            p5.b bVar = (p5.b) g.a().getService(p5.b.class);
            if (!FCMBroadcastReceiver.Companion.isFCMMessage(this.$intent)) {
                this.this$0.setSuccessfulResultCode();
                this.$pendingResult.finish();
                return vVar;
            }
            C4839a processBundleFromReceiver = bVar.processBundleFromReceiver(this.$context, this.$bundle);
            if (processBundleFromReceiver == null || !processBundleFromReceiver.isWorkManagerProcessing()) {
                this.this$0.setSuccessfulResultCode();
                this.$pendingResult.finish();
                return vVar;
            }
            this.this$0.setAbort();
            this.$pendingResult.finish();
            return vVar;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((b) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAbort() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSuccessfulResultCode() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        c.suspendifyOnIO(new b(context, goAsync(), intent, this, extras, null));
    }
}
