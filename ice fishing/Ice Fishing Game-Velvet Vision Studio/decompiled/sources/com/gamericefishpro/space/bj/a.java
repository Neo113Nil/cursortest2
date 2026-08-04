package com.gamericefishpro.space.bj;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.g1.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(com.gamericefishpro.space.ij.a aVar, int i) {
        super(aVar);
        this.e = i;
    }

    @Override // com.gamericefishpro.space.g1.b
    public final void j(com.gamericefishpro.space.ij.a level, String msg) {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(level, "level");
                Intrinsics.checkNotNullParameter(msg, "msg");
                int iOrdinal = level.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        Log.w("[Koin]", msg);
                    } else if (iOrdinal == 3) {
                        Log.e("[Koin]", msg);
                    } else {
                        Log.e("[Koin]", msg);
                    }
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(level, "level");
                Intrinsics.checkNotNullParameter(msg, "msg");
                break;
        }
    }
}
