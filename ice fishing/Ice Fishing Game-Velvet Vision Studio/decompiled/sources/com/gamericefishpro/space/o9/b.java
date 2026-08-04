package com.gamericefishpro.space.o9;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.b8.k;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.t8.f;
import com.gamericefishpro.space.t8.g;
import com.gamericefishpro.space.v8.o;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d5 {
    public final /* synthetic */ int c;

    public /* synthetic */ b(int i) {
        this.c = i;
    }

    @Override // com.gamericefishpro.space.i9.d5
    public com.gamericefishpro.space.t8.a m(Context context, Looper looper, k kVar, Object obj, f fVar, g gVar) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                kVar.getClass();
                Integer num = (Integer) kVar.v;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new com.gamericefishpro.space.p9.a(context, looper, kVar, bundle, fVar, gVar);
            case 1:
                throw y0.e(obj);
            default:
                return super.m(context, looper, kVar, obj, fVar, gVar);
        }
    }

    @Override // com.gamericefishpro.space.i9.d5
    public /* synthetic */ com.gamericefishpro.space.t8.a n(Context context, Looper looper, k kVar, Object obj, f fVar, g gVar) {
        switch (this.c) {
            case 2:
                return new com.gamericefishpro.space.x8.c(context, looper, kVar, (o) obj, fVar, gVar);
            default:
                return super.n(context, looper, kVar, obj, fVar, gVar);
        }
    }
}
