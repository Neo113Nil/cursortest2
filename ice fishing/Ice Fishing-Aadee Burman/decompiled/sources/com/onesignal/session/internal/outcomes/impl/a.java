package com.onesignal.session.internal.outcomes.impl;

/* loaded from: classes2.dex */
public final class a {
    private final K5.c channel;
    private final String influenceId;

    public a(String influenceId, K5.c channel) {
        kotlin.jvm.internal.h.e(influenceId, "influenceId");
        kotlin.jvm.internal.h.e(channel, "channel");
        this.influenceId = influenceId;
        this.channel = channel;
    }

    public final K5.c getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
