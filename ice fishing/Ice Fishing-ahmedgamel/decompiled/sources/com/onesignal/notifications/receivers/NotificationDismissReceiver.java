package com.onesignal.notifications.receivers;

import B7.h;
import I7.l;
import I7.p;
import S7.F;
import S7.InterfaceC0404w;
import X7.o;
import Z7.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bumptech.glide.d;
import com.onesignal.common.threading.c;
import com.onesignal.debug.internal.logging.b;
import p4.g;
import u7.v;
import z5.InterfaceC5262a;
import z7.InterfaceC5267d;

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
            final /* synthetic */ InterfaceC5262a $notificationOpenedProcessor;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0242a(InterfaceC5262a interfaceC5262a, Context context, Intent intent, InterfaceC5267d interfaceC5267d) {
                super(2, interfaceC5267d);
                this.$notificationOpenedProcessor = interfaceC5262a;
                this.$context = context;
                this.$intent = intent;
            }

            @Override // B7.a
            public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
                return new C0242a(this.$notificationOpenedProcessor, this.$context, this.$intent, interfaceC5267d);
            }

            @Override // I7.p
            public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
                return ((C0242a) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                A7.a aVar = A7.a.f58n;
                int i = this.label;
                if (i == 0) {
                    d.k(obj);
                    InterfaceC5262a interfaceC5262a = this.$notificationOpenedProcessor;
                    Context context = this.$context;
                    Intent intent = this.$intent;
                    this.label = 1;
                    if (interfaceC5262a.processFromContext(context, intent, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.k(obj);
                }
                return v.f41353a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$context = context;
            this.$pendingResult = pendingResult;
            this.$intent = intent;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return new a(this.$context, this.$pendingResult, this.$intent, interfaceC5267d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        
            if (S7.AbstractC0406y.y(r3, r5, r8) == r0) goto L19;
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
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            v vVar = v.f41353a;
            if (i == 0) {
                d.k(obj);
                Context applicationContext = this.$context.getApplicationContext();
                kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = g.b(applicationContext, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.k(obj);
                    this.$pendingResult.finish();
                    return vVar;
                }
                d.k(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                b.warn$default("NotificationOpenedReceiver skipped due to failed OneSignal init", null, 2, null);
                this.$pendingResult.finish();
                return vVar;
            }
            InterfaceC5262a interfaceC5262a = (InterfaceC5262a) g.a().getService(InterfaceC5262a.class);
            e eVar = F.f2915a;
            T7.e eVar2 = o.f3856a;
            C0242a c0242a = new C0242a(interfaceC5262a, this.$context, this.$intent, null);
            this.label = 2;
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
        c.suspendifyOnIO(new a(context, goAsync(), intent, null));
    }
}
