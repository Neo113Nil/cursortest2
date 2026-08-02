package com.squareup.cash.pools.views;

import com.squareup.cash.common.composeui.ClusteredAvatarValues;

/* loaded from: classes6.dex */
public enum PoolAvatarSize {
    Size32(32.0f, ClusteredAvatarValues.Size24),
    Size48(48.0f, new ClusteredAvatarValues(36.0f, 2.0f)),
    Size64(64.0f, ClusteredAvatarValues.Size48),
    /* JADX INFO: Fake field, exist only in values array */
    Size96(96.0f, new ClusteredAvatarValues(72.0f, 2.5f)),
    /* JADX INFO: Fake field, exist only in values array */
    SizeApplet(60.0f, new ClusteredAvatarValues(44.0f, 2.5f)),
    SizeServiceApplet(28.0f, new ClusteredAvatarValues(18.0f, 1.0f));

    public final ClusteredAvatarValues cluster;
    public final float size;

    PoolAvatarSize(float f, ClusteredAvatarValues clusteredAvatarValues) {
        this.size = f;
        this.cluster = clusteredAvatarValues;
    }
}
