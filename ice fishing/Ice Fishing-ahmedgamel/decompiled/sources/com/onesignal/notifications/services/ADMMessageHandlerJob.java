package com.onesignal.notifications.services;

import B7.h;
import I7.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import p4.g;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    public static final class a extends h implements l {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ Context $safeContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Bundle bundle, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$safeContext = context;
            this.$bundle = bundle;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new a(this.$safeContext, this.$bundle, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                Context safeContext = this.$safeContext;
                kotlin.jvm.internal.h.d(safeContext, "$safeContext");
                this.label = 1;
                obj = g.b(safeContext, this);
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
            Context safeContext2 = this.$safeContext;
            kotlin.jvm.internal.h.d(safeContext2, "$safeContext");
            bVar.processBundleFromReceiver(safeContext2, this.$bundle);
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

    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (context == null || extras == null) {
            return;
        }
        com.onesignal.common.threading.c.suspendifyOnIO(new a(context.getApplicationContext(), extras, null));
    }

    public void onRegistered(Context context, String str) {
        com.onesignal.debug.internal.logging.b.info$default("ADM registration ID: " + str, null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new b(str, null));
    }

    public void onRegistrationError(Context context, String str) {
        com.onesignal.debug.internal.logging.b.info$default("ADM:onRegistrationError: " + str, null, 2, null);
        if ("INVALID_SENDER".equals(str)) {
            com.onesignal.debug.internal.logging.b.info$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        com.onesignal.common.threading.c.suspendifyOnIO(new c(null));
    }

    public void onUnregistered(Context context, String str) {
        com.onesignal.debug.internal.logging.b.info$default("ADM:onUnregistered: " + str, null, 2, null);
    }
}
