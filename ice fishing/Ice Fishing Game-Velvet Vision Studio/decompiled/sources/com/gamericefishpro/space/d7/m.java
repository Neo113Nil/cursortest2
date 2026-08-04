package com.gamericefishpro.space.d7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int i;

    public /* synthetic */ m(int i, int i2, boolean z) {
        this.d = i2;
        this.e = z;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean z = this.e;
                int i = this.i;
                com.gamericefishpro.space.c6.a _connection = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                com.gamericefishpro.space.c6.c cVarO = _connection.O("UPDATE ice_startup_params SET notificationPermissionRequested = ?, notificationPermissionRequestCount = ? WHERE id = 1");
                try {
                    cVarO.a(1, z ? 1L : 0L);
                    cVarO.a(2, i);
                    cVarO.H();
                    return Unit.a;
                } finally {
                    cVarO.close();
                }
            default:
                boolean z2 = this.e;
                return com.gamericefishpro.space.n7.g.a((com.gamericefishpro.space.n7.g) obj, null, 0, 0, 0, 0, 0, null, false, 0, false, z2, !z2, com.gamericefishpro.space.n7.a.e, this.i, 0, null, null, null, 246767);
        }
    }
}
