package com.onesignal.notifications.receivers;

import B7.h;
import I7.l;
import I7.p;
import Q3.b;
import S7.F;
import S7.InterfaceC0408w;
import X7.o;
import Z7.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.common.threading.c;
import p4.g;
import u7.v;
import z5.InterfaceC5235a;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {

    public static final class a extends h implements l {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* renamed from: com.onesignal.notifications.receivers.NotificationDismissReceiver$a$a, reason: collision with other inner class name */
        public static final class C0242a extends h implements p {
            final /* synthetic */ Context $context;
            final /* synthetic */ Intent $intent;
            final /* synthetic */ InterfaceC5235a $notificationOpenedProcessor;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0242a(InterfaceC5235a interfaceC5235a, Context context, Intent intent, InterfaceC5240d interfaceC5240d) {
                super(2, interfaceC5240d);
                this.$notificationOpenedProcessor = interfaceC5235a;
                this.$context = context;
                this.$intent = intent;
            }

            @Override // B7.a
            public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
                return new C0242a(this.$notificationOpenedProcessor, this.$context, this.$intent, interfaceC5240d);
            }

            @Override // I7.p
            public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
                return ((C0242a) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                A7.a aVar = A7.a.f215n;
                int i = this.label;
                if (i == 0) {
                    b.s(obj);
                    InterfaceC5235a interfaceC5235a = this.$notificationOpenedProcessor;
                    Context context = this.$context;
                    Intent intent = this.$intent;
                    this.label = 1;
                    if (interfaceC5235a.processFromContext(context, intent, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.s(obj);
                }
                return v.f41073a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$context = context;
            this.$pendingResult = pendingResult;
            this.$intent = intent;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new a(this.$context, this.$pendingResult, this.$intent, interfaceC5240d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        
            if (S7.AbstractC0410y.y(r3, r5, r8) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
        
            if (r9 == r0) goto L19;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            v vVar = v.f41073a;
            if (i == 0) {
                b.s(obj);
                Context applicationContext = this.$context.getApplicationContext();
                kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = g.b(applicationContext, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.s(obj);
                    this.$pendingResult.finish();
                    return vVar;
                }
                b.s(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                com.onesignal.debug.internal.logging.b.warn$default("NotificationOpenedReceiver skipped due to failed OneSignal init", null, 2, null);
                this.$pendingResult.finish();
                return vVar;
            }
            InterfaceC5235a interfaceC5235a = (InterfaceC5235a) g.a().getService(InterfaceC5235a.class);
            e eVar = F.f2998a;
            T7.e eVar2 = o.f3811a;
            C0242a c0242a = new C0242a(interfaceC5235a, this.$context, this.$intent, null);
            this.label = 2;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(intent, "intent");
        c.suspendifyOnIO(new a(context, goAsync(), intent, null));
    }
}
