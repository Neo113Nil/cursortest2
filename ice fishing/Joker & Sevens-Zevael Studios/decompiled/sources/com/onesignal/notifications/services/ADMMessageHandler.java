package com.onesignal.notifications.services;

import ac.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import fc.d;
import hc.j;
import oc.c;
import pc.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class ADMMessageHandler extends ADMMessageHandlerBase {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements c {
        final /* synthetic */ String $newRegistrationId;
        final /* synthetic */ s $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, String str, d dVar) {
            super(1, dVar);
            this.$registerer = sVar;
            this.$newRegistrationId = str;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return new a(this.$registerer, this.$newRegistrationId, dVar);
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
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) this.$registerer.f5683g;
                String str = this.$newRegistrationId;
                this.label = 1;
                Object fireCallback = cVar.fireCallback(str, this);
                gc.a aVar = gc.a.f2559g;
                if (fireCallback == aVar) {
                    return aVar;
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

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements c {
        final /* synthetic */ s $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, d dVar) {
            super(1, dVar);
            this.$registerer = sVar;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return new b(this.$registerer, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) this.$registerer.f5683g;
                this.label = 1;
                Object fireCallback = cVar.fireCallback(null, this);
                gc.a aVar = gc.a.f2559g;
                if (fireCallback == aVar) {
                    return aVar;
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

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        pc.j.e(intent, "intent");
        Context applicationContext = getApplicationContext();
        pc.j.d(applicationContext, "context");
        if (h8.d.b(applicationContext)) {
            Bundle extras = intent.getExtras();
            ja.b bVar = (ja.b) h8.d.a().getService(ja.b.class);
            pc.j.b(extras);
            bVar.processBundleFromReceiver(applicationContext, extras);
        }
    }

    public void onRegistered(String str) {
        pc.j.e(str, "newRegistrationId");
        com.onesignal.debug.internal.logging.b.info$default("ADM registration ID: ".concat(str), null, 2, null);
        s sVar = new s();
        sVar.f5683g = h8.d.a().getService(com.onesignal.notifications.internal.registration.impl.c.class);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(sVar, str, null), 1, null);
    }

    public void onRegistrationError(String str) {
        pc.j.e(str, "error");
        com.onesignal.debug.internal.logging.b.error$default("ADM:onRegistrationError: ".concat(str), null, 2, null);
        if ("INVALID_SENDER".equals(str)) {
            com.onesignal.debug.internal.logging.b.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        s sVar = new s();
        sVar.f5683g = h8.d.a().getService(com.onesignal.notifications.internal.registration.impl.c.class);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(sVar, null), 1, null);
    }

    public void onUnregistered(String str) {
        pc.j.e(str, "info");
        com.onesignal.debug.internal.logging.b.info$default("ADM:onUnregistered: ".concat(str), null, 2, null);
    }
}
