package com.onesignal.notifications.receivers;

import B7.h;
import D5.c;
import I7.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bumptech.glide.d;
import com.onesignal.debug.internal.logging.b;
import p4.g;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class UpgradeReceiver extends BroadcastReceiver {

    public static final class a extends h implements l {
        final /* synthetic */ Context $context;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$context = context;
            this.$pendingResult = pendingResult;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return new a(this.$context, this.$pendingResult, interfaceC5267d);
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
            if (booleanValue) {
                ((c) g.a().getService(c.class)).beginEnqueueingWork(this.$context, true);
                this.$pendingResult.finish();
                return vVar;
            }
            b.warn$default("UpgradeReceiver skipped due to failed OneSignal init", null, 2, null);
            this.$pendingResult.finish();
            return vVar;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(intent, "intent");
        if (Build.VERSION.SDK_INT == 24) {
            return;
        }
        com.onesignal.common.threading.c.suspendifyOnIO(new a(context, goAsync(), null));
    }
}
