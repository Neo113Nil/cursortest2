package com.onesignal.user.internal.migrations;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface a extends d9.b {
    boolean isInBadState();

    void recover();

    String recoveryMessage();

    @Override // d9.b
    /* synthetic */ void start();
}
