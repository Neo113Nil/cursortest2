package com.onesignal.session.internal.outcomes.impl;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    private final ab.c channel;
    private final String influenceId;

    public a(String str, ab.c cVar) {
        pc.j.e(str, "influenceId");
        pc.j.e(cVar, "channel");
        this.influenceId = str;
        this.channel = cVar;
    }

    public final ab.c getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
