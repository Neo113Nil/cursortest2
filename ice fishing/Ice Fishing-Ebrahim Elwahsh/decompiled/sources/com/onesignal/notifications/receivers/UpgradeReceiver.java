package com.onesignal.notifications.receivers;

import E7.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bumptech.glide.f;
import com.onesignal.common.threading.c;
import com.onesignal.debug.internal.logging.b;
import l4.g;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;
import z5.InterfaceC5281c;

/* loaded from: classes2.dex */
public final class UpgradeReceiver extends BroadcastReceiver {

    public static final class a extends h implements l {
        final /* synthetic */ Context $context;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$context = context;
            this.$pendingResult = pendingResult;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new a(this.$context, this.$pendingResult, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                Context applicationContext = this.$context.getApplicationContext();
                kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = g.b(applicationContext, this);
                if (obj == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            v vVar = v.f40183a;
            if (booleanValue) {
                ((InterfaceC5281c) g.a().getService(InterfaceC5281c.class)).beginEnqueueingWork(this.$context, true);
                this.$pendingResult.finish();
                return vVar;
            }
            b.warn$default("UpgradeReceiver skipped due to failed OneSignal init", null, 2, null);
            this.$pendingResult.finish();
            return vVar;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(intent, "intent");
        if (Build.VERSION.SDK_INT == 24) {
            return;
        }
        c.suspendifyOnIO(new a(context, goAsync(), null));
    }
}
