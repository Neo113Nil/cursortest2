package com.onesignal.common.modeling;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface f extends com.onesignal.common.events.d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    i getModel();

    void replace(i iVar, String str);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
