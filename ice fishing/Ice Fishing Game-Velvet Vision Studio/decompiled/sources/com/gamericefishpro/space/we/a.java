package com.gamericefishpro.space.we;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.xb.c;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Activity {

    /* JADX INFO: renamed from: com.gamericefishpro.space.we.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0068a extends i implements Function1 {
        int label;

        public C0068a(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new C0068a(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((C0068a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.xf.a aVar2 = (com.gamericefishpro.space.xf.a) c.a().getService(com.gamericefishpro.space.xf.a.class);
                a aVar3 = a.this;
                Intent intent = aVar3.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                this.label = 1;
                if (aVar2.processFromContext(aVar3, intent, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function0 {
        public b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(a this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            AndroidUtils.INSTANCE.finishSafely(this$0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m25invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m25invoke() {
            a aVar = a.this;
            aVar.runOnUiThread(new com.appsflyer.a(22, aVar));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent$com_onesignal_notifications();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        processIntent$com_onesignal_notifications();
    }

    public void processIntent$com_onesignal_notifications() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (c.b(applicationContext)) {
            com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new C0068a(null), new b(), 1, (Object) null);
        }
    }
}
