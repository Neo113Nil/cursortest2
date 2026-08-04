package com.gamericefishpro.space.r2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return com.gamericefishpro.space.rh.a.a(Integer.valueOf(((c) obj).b), Integer.valueOf(((c) obj2).b));
    }
}
