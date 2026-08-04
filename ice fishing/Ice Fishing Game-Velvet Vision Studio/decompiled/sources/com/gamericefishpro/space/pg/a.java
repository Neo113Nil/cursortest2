package com.gamericefishpro.space.pg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final com.gamericefishpro.space.mg.c channel;
    private final String influenceId;

    public a(String influenceId, com.gamericefishpro.space.mg.c channel) {
        Intrinsics.checkNotNullParameter(influenceId, "influenceId");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.influenceId = influenceId;
        this.channel = channel;
    }

    public final com.gamericefishpro.space.mg.c getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
