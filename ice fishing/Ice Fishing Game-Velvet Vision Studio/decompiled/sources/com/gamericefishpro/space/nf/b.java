package com.gamericefishpro.space.nf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, com.gamericefishpro.space.th.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, aVar);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i, boolean z, String str, boolean z2, com.gamericefishpro.space.th.a aVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return dVar.markAsConsumed(i, z, str2, z2, aVar);
    }
}
