package com.gamericefishpro.space.i9;

import android.database.ContentObserver;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        k4.i.incrementAndGet();
    }
}
