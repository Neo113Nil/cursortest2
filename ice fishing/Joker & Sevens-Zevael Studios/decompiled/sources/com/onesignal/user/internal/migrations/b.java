package com.onesignal.user.internal.migrations;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b implements a {
    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ boolean isInBadState();

    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ void recover();

    @Override // com.onesignal.user.internal.migrations.a
    public abstract /* synthetic */ String recoveryMessage();

    @Override // com.onesignal.user.internal.migrations.a, d9.b
    public void start() {
        if (isInBadState()) {
            com.onesignal.debug.internal.logging.b.warn$default(recoveryMessage(), null, 2, null);
            recover();
        }
    }
}
