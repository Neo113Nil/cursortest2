package com.gamericefishpro.space.nf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final int androidId;
    private final long createdAt;
    private final String fullData;
    private final String id;
    private final String message;
    private final String title;

    public c(int i, String id, String fullData, long j, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fullData, "fullData");
        this.androidId = i;
        this.id = id;
        this.fullData = fullData;
        this.createdAt = j;
        this.title = str;
        this.message = str2;
    }

    public final int getAndroidId() {
        return this.androidId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getFullData() {
        return this.fullData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }
}
