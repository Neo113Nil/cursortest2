package com.onesignal.notifications.receivers;

import ac.o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.common.threading.b;
import fc.d;
import hc.j;
import oc.c;
import pc.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements c {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ s $notificationOpenedProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, Context context, Intent intent, d dVar) {
            super(1, dVar);
            this.$notificationOpenedProcessor = sVar;
            this.$context = context;
            this.$intent = intent;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return new a(this.$notificationOpenedProcessor, this.$context, this.$intent, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                ta.a aVar = (ta.a) this.$notificationOpenedProcessor.f5683g;
                Context context = this.$context;
                Intent intent = this.$intent;
                this.label = 1;
                Object processFromContext = aVar.processFromContext(context, intent, this);
                gc.a aVar2 = gc.a.f2559g;
                if (processFromContext == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        pc.j.e(context, "context");
        pc.j.e(intent, "intent");
        Context applicationContext = context.getApplicationContext();
        pc.j.d(applicationContext, "context.applicationContext");
        if (h8.d.b(applicationContext)) {
            s sVar = new s();
            sVar.f5683g = h8.d.a().getService(ta.a.class);
            b.suspendifyBlocking(new a(sVar, context, intent, null));
        }
    }
}
