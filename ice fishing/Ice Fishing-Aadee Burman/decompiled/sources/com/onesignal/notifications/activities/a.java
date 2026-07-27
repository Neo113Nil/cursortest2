package com.onesignal.notifications.activities;

import B7.h;
import D.RunnableC0282a;
import I7.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bumptech.glide.d;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.threading.b;
import com.onesignal.common.threading.c;
import u7.v;
import x4.g;
import z5.InterfaceC5262a;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public abstract class a extends Activity implements g {

    /* renamed from: com.onesignal.notifications.activities.a$a, reason: collision with other inner class name */
    public static final class C0225a extends h implements l {
        int label;

        public C0225a(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(a aVar) {
            AndroidUtils.INSTANCE.finishSafely(aVar);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return a.this.new C0225a(interfaceC5267d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            if (r7.processFromContext(r1, r4, r6) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        
            if (r7 == r0) goto L18;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            v vVar = v.f41350a;
            if (i == 0) {
                d.k(obj);
                Context applicationContext = a.this.getApplicationContext();
                kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = p4.g.b(applicationContext, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.k(obj);
                    a aVar2 = a.this;
                    aVar2.runOnUiThread(new RunnableC0282a(21, aVar2));
                    return vVar;
                }
                d.k(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return vVar;
            }
            InterfaceC5262a interfaceC5262a = (InterfaceC5262a) p4.g.a().getService(InterfaceC5262a.class);
            a aVar3 = a.this;
            Intent intent = aVar3.getIntent();
            kotlin.jvm.internal.h.d(intent, "getIntent(...)");
            this.label = 2;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((C0225a) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent$com_onesignal_notifications();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.onNewIntent(intent);
        processIntent$com_onesignal_notifications();
    }

    public void processIntent$com_onesignal_notifications() {
        b.INSTANCE.prewarm();
        c.suspendifyOnDefault(new C0225a(null));
    }
}
