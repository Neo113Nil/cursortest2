package com.onesignal.notifications.receivers;

import E7.l;
import E7.p;
import O7.F;
import O7.InterfaceC0397w;
import T7.o;
import V7.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bumptech.glide.f;
import com.onesignal.common.threading.c;
import com.onesignal.debug.internal.logging.b;
import l4.g;
import q7.v;
import v5.InterfaceC5128a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {

    public static final class a extends h implements l {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* renamed from: com.onesignal.notifications.receivers.NotificationDismissReceiver$a$a, reason: collision with other inner class name */
        public static final class C0241a extends h implements p {
            final /* synthetic */ Context $context;
            final /* synthetic */ Intent $intent;
            final /* synthetic */ InterfaceC5128a $notificationOpenedProcessor;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0241a(InterfaceC5128a interfaceC5128a, Context context, Intent intent, InterfaceC5133d interfaceC5133d) {
                super(2, interfaceC5133d);
                this.$notificationOpenedProcessor = interfaceC5128a;
                this.$context = context;
                this.$intent = intent;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
                return new C0241a(this.$notificationOpenedProcessor, this.$context, this.$intent, interfaceC5133d);
            }

            @Override // E7.p
            public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
                return ((C0241a) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                int i = this.label;
                if (i == 0) {
                    f.r(obj);
                    InterfaceC5128a interfaceC5128a = this.$notificationOpenedProcessor;
                    Context context = this.$context;
                    Intent intent = this.$intent;
                    this.label = 1;
                    if (interfaceC5128a.processFromContext(context, intent, this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                return v.f40183a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$context = context;
            this.$pendingResult = pendingResult;
            this.$intent = intent;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new a(this.$context, this.$pendingResult, this.$intent, interfaceC5133d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        
            if (O7.AbstractC0399y.y(r3, r5, r8) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
        
            if (r9 == r0) goto L19;
         */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            v vVar = v.f40183a;
            if (i == 0) {
                f.r(obj);
                Context applicationContext = this.$context.getApplicationContext();
                kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = g.b(applicationContext, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                    this.$pendingResult.finish();
                    return vVar;
                }
                f.r(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                b.warn$default("NotificationOpenedReceiver skipped due to failed OneSignal init", null, 2, null);
                this.$pendingResult.finish();
                return vVar;
            }
            InterfaceC5128a interfaceC5128a = (InterfaceC5128a) g.a().getService(InterfaceC5128a.class);
            e eVar = F.f2551a;
            P7.e eVar2 = o.f3162a;
            C0241a c0241a = new C0241a(interfaceC5128a, this.$context, this.$intent, null);
            this.label = 2;
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
        c.suspendifyOnIO(new a(context, goAsync(), intent, null));
    }
}
