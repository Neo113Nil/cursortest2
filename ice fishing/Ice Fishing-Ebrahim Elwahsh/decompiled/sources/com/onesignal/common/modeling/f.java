package com.onesignal.common.modeling;

/* loaded from: classes2.dex */
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
