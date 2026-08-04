package com.gamericefishpro.space.o2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.f0;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Comparator {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Comparator b;

    public y(y yVar) {
        this.b = yVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int iCompare = this.b.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return f0.n0.compare(((o) obj).c, ((o) obj2).c);
            default:
                int iCompare2 = ((y) this.b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : com.gamericefishpro.space.rh.a.a(Integer.valueOf(((o) obj).g), Integer.valueOf(((o) obj2).g));
        }
    }

    public y(Comparator comparator) {
        this.b = comparator;
    }
}
