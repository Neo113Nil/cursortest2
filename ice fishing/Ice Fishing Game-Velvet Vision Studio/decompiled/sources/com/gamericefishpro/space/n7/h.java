package com.gamericefishpro.space.n7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int i;

    public /* synthetic */ h(int i, int i2, int i3) {
        this.d = i3;
        this.e = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g it = (g) obj;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(it, "it");
                return g.a(it, null, 0, 0, 0, 0, 0, new Pair(Integer.valueOf(this.e), Integer.valueOf(this.i)), false, 0, false, false, false, null, 0, 0, null, null, null, 262079);
            default:
                return g.a(it, null, 0, 0, 0, 0, 0, new Pair(Integer.valueOf(this.e), Integer.valueOf(this.i)), false, 0, false, false, false, null, 0, 0, null, null, null, 261951);
        }
    }
}
