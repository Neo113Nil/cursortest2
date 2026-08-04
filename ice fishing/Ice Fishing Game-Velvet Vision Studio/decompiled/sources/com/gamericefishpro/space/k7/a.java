package com.gamericefishpro.space.k7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;

    public /* synthetic */ a(int i, List list) {
        this.d = i;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.get(((Number) obj).intValue());
                break;
            case 1:
                this.e.get(((Number) obj).intValue());
                break;
            default:
                this.e.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
