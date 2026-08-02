package com.yandex.passport.internal.push;

import android.content.Intent;
import android.os.Build;
import com.yandex.passport.api.v2;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.a4g;
import defpackage.b43;
import defpackage.ca8;
import defpackage.gld;
import defpackage.r1w;
import defpackage.rb;
import defpackage.rre;
import defpackage.saf;
import defpackage.tf6;
import defpackage.vq1;
import defpackage.x97;
import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class PassportPushRegistrationService extends androidx.core.app.y0 {
    public static final /* synthetic */ int j = 0;
    public final tf6 i = gld.e(kotlin.coroutines.e.c(a4g.n(), ca8.a).plus(new b43(rre.f, 15)));

    @Override // androidx.core.app.y0
    public final void e(Intent intent) {
        s nVar;
        Serializable serializableExtra;
        s sVar = t.a;
        intent.getClass();
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        Continuation continuation = null;
        try {
            String stringExtra = intent.getStringExtra("intent_type");
            if (stringExtra != null) {
                int hashCode = stringExtra.hashCode();
                if (hashCode != -934610812) {
                    if (hashCode != 1085444827) {
                        if (hashCode == 1945680494 && stringExtra.equals("token_changed")) {
                            g pushSubscriptionManager = a.getPushSubscriptionManager();
                            com.yandex.passport.internal.storage.m preferenceStorage = a.getPreferenceStorage();
                            if (Build.VERSION.SDK_INT >= 34) {
                                serializableExtra = rb.A(intent);
                            } else {
                                serializableExtra = intent.getSerializableExtra("platform");
                                if (!v2.class.isInstance(serializableExtra)) {
                                    serializableExtra = null;
                                }
                            }
                            v2 v2Var = (v2) serializableExtra;
                            if (v2Var == null) {
                                throw new IllegalStateException("missing required parameter pushPlatform");
                            }
                            nVar = new z0(pushSubscriptionManager, preferenceStorage, v2Var, (String) vq1.W(intent, "new_token", String.class));
                        }
                    } else if (stringExtra.equals("refresh")) {
                        nVar = new com.yandex.passport.internal.flags.experiments.p(a.getPushSubscriptionManager(), a.getPreferenceStorage(), (com.yandex.passport.common.core.f) vq1.W(intent, "uid", com.yandex.passport.common.core.f.class));
                    }
                } else if (stringExtra.equals("remove")) {
                    g pushSubscriptionManager2 = a.getPushSubscriptionManager();
                    com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) vq1.W(intent, "uid", com.yandex.passport.common.core.f.class);
                    if (fVar == null) {
                        throw new IllegalStateException("missing required parameter uid");
                    }
                    nVar = new com.yandex.passport.common.network.n(pushSubscriptionManager2, fVar);
                }
                sVar = nVar;
            }
        } catch (Exception unused) {
        }
        x97.D(kotlin.coroutines.g.a, new r1w(x97.y(this.i, null, null, new r1w(sVar, continuation, 17), 3), continuation, 16));
    }

    @Override // androidx.core.app.y0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        saf.B(this.i.a, null);
    }
}
