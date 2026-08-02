package com.onesignal.notifications.services;

import B7.h;
import I7.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import p4.g;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class ADMMessageHandler extends ADMMessageHandlerBase {

    public static final class a extends h implements l {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Bundle bundle, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$context = context;
            this.$bundle = bundle;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new a(this.$context, this.$bundle, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                Context context = this.$context;
                kotlin.jvm.internal.h.d(context, "$context");
                this.label = 1;
                obj = g.b(context, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            v vVar = v.f41073a;
            if (!booleanValue) {
                com.onesignal.debug.internal.logging.b.warn$default("onMessage skipped due to failed OneSignal init", null, 2, null);
                return vVar;
            }
            p5.b bVar = (p5.b) g.a().getService(p5.b.class);
            Context context2 = this.$context;
            kotlin.jvm.internal.h.d(context2, "$context");
            bVar.processBundleFromReceiver(context2, this.$bundle);
            return vVar;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ String $newRegistrationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$newRegistrationId = str;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new b(this.$newRegistrationId, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) g.a().getService(com.onesignal.notifications.internal.registration.impl.c.class);
                String str = this.$newRegistrationId;
                this.label = 1;
                if (cVar.fireCallback(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class c extends h implements l {
        int label;

        public c(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new c(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) g.a().getService(com.onesignal.notifications.internal.registration.impl.c.class);
                this.label = 1;
                if (cVar.fireCallback(null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((c) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        com.onesignal.common.threading.c.suspendifyOnIO(new a(applicationContext, extras, null));
    }

    public void onRegistered(String newRegistrationId) {
        kotlin.jvm.internal.h.e(newRegistrationId, "newRegistrationId");
        com.onesignal.debug.internal.logging.b.info$default("ADM registration ID: ".concat(newRegistrationId), null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new b(newRegistrationId, null));
    }

    public void onRegistrationError(String error) {
        kotlin.jvm.internal.h.e(error, "error");
        com.onesignal.debug.internal.logging.b.info$default("ADM:onRegistrationError: ".concat(error), null, 2, null);
        if ("INVALID_SENDER".equals(error)) {
            com.onesignal.debug.internal.logging.b.info$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        com.onesignal.common.threading.c.suspendifyOnIO(new c(null));
    }

    public void onUnregistered(String info) {
        kotlin.jvm.internal.h.e(info, "info");
        com.onesignal.debug.internal.logging.b.info$default("ADM:onUnregistered: ".concat(info), null, 2, null);
    }
}
