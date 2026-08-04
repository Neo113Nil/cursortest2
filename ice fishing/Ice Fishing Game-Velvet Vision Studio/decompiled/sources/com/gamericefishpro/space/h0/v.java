package com.gamericefishpro.space.h0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.gamericefishpro.space.f1.z b;

    public /* synthetic */ v(com.gamericefishpro.space.f1.z zVar, int i) {
        this.a = i;
        this.b = zVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object key = ((e0) obj).getKey();
                com.gamericefishpro.space.f1.z zVar = this.b;
                return com.gamericefishpro.space.rh.a.a(Integer.valueOf(zVar.e(key)), Integer.valueOf(zVar.e(((e0) obj2).getKey())));
            case 1:
                Object key2 = ((e0) obj).getKey();
                com.gamericefishpro.space.f1.z zVar2 = this.b;
                return com.gamericefishpro.space.rh.a.a(Integer.valueOf(zVar2.e(key2)), Integer.valueOf(zVar2.e(((e0) obj2).getKey())));
            case 2:
                Object key3 = ((e0) obj2).getKey();
                com.gamericefishpro.space.f1.z zVar3 = this.b;
                return com.gamericefishpro.space.rh.a.a(Integer.valueOf(zVar3.e(key3)), Integer.valueOf(zVar3.e(((e0) obj).getKey())));
            default:
                Object key4 = ((e0) obj2).getKey();
                com.gamericefishpro.space.f1.z zVar4 = this.b;
                return com.gamericefishpro.space.rh.a.a(Integer.valueOf(zVar4.e(key4)), Integer.valueOf(zVar4.e(((e0) obj).getKey())));
        }
    }
}
