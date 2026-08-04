package com.gamericefishpro.space.tb;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements com.gamericefishpro.space.r9.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ FirebaseMessaging e;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, int i) {
        this.d = i;
        this.e = firebaseMessaging;
    }

    @Override // com.gamericefishpro.space.r9.e
    public final void c(Object obj) {
        boolean z;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a0 a0Var = (a0) obj;
                if (!this.e.e.b() || a0Var.h.a() == null) {
                    return;
                }
                synchronized (a0Var) {
                    z = a0Var.g;
                }
                if (z) {
                    return;
                }
                a0Var.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.e;
                com.gamericefishpro.space.r8.a aVar = (com.gamericefishpro.space.r8.a) obj;
                u uVar = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    com.gamericefishpro.space.d9.h.D(aVar.d);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
