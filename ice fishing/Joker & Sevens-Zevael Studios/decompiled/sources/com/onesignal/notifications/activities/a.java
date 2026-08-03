package com.onesignal.notifications.activities;

import ac.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.threading.b;
import fc.d;
import hc.j;
import oc.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a extends Activity {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.activities.a$a, reason: collision with other inner class name */
    public static final class C0046a extends j implements c {
        int label;

        public C0046a(d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final d create(d dVar) {
            return a.this.new C0046a(dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((C0046a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                ta.a aVar = (ta.a) h8.d.a().getService(ta.a.class);
                a aVar2 = a.this;
                Intent intent = aVar2.getIntent();
                pc.j.d(intent, "intent");
                this.label = 1;
                Object processFromContext = aVar.processFromContext(aVar2, intent, this);
                gc.a aVar3 = gc.a.f2559g;
                if (processFromContext == aVar3) {
                    return aVar3;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            a.this.finish();
            return o.f277a;
        }
    }

    private final void processIntent() {
        Context applicationContext = getApplicationContext();
        pc.j.d(applicationContext, "applicationContext");
        if (h8.d.b(applicationContext)) {
            b.suspendifyOnThread$default(0, new C0046a(null), 1, null);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        pc.j.e(intent, "intent");
        super.onNewIntent(intent);
        processIntent();
    }
}
