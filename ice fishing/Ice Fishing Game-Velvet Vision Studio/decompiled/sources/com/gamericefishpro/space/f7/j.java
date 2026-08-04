package com.gamericefishpro.space.f7;

import android.content.Context;
import com.gamericefishpro.space.d7.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final Context a;
    public final n b;
    public final com.gamericefishpro.space.e7.h c;
    public final com.gamericefishpro.space.e7.e d;
    public final com.gamericefishpro.space.e7.g e;
    public final com.gamericefishpro.space.e7.b f;

    public j(Context context, n startupParamsDao, com.gamericefishpro.space.e7.h iceIdFetcher, com.gamericefishpro.space.e7.e fishSourceFetcher, com.gamericefishpro.space.e7.g attributionFetcher, com.gamericefishpro.space.e7.b appsFlyerIdFetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(startupParamsDao, "startupParamsDao");
        Intrinsics.checkNotNullParameter(iceIdFetcher, "iceIdFetcher");
        Intrinsics.checkNotNullParameter(fishSourceFetcher, "fishSourceFetcher");
        Intrinsics.checkNotNullParameter(attributionFetcher, "attributionFetcher");
        Intrinsics.checkNotNullParameter(appsFlyerIdFetcher, "appsFlyerIdFetcher");
        this.a = context;
        this.b = startupParamsDao;
        this.c = iceIdFetcher;
        this.d = fishSourceFetcher;
        this.e = attributionFetcher;
        this.f = appsFlyerIdFetcher;
    }
}
