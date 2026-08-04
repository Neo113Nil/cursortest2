package com.gamericefishpro.space.z4;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements s {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public e(j[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.e = generatedAdapters;
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(u source, o event) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                j[] jVarArr = (j[]) this.e;
                if (jVarArr.length > 0) {
                    j jVar = jVarArr[0];
                    throw null;
                }
                if (jVarArr.length <= 0) {
                    return;
                }
                j jVar2 = jVarArr[0];
                throw null;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == o.ON_CREATE) {
                    source.g().f(this);
                    ((n0) this.e).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
        }
    }

    public e(n0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.e = provider;
    }
}
