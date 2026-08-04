package com.gamericefishpro.space.f1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Collection e;

    public /* synthetic */ r(int i, Collection collection) {
        this.d = i;
        this.e = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zRetainAll;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                zRetainAll = ((List) obj).retainAll(this.e);
                break;
            case 1:
                zRetainAll = this.e.contains(obj);
                break;
            default:
                zRetainAll = this.e.contains(obj);
                break;
        }
        return Boolean.valueOf(zRetainAll);
    }
}
