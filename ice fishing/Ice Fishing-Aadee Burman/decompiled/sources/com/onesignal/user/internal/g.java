package com.onesignal.user.internal;

import b6.InterfaceC0520b;

/* loaded from: classes2.dex */
public class g extends i implements InterfaceC0520b {
    private final com.onesignal.common.events.b changeHandlersNotifier;
    private b6.g savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z5.d model) {
        super(model);
        kotlin.jvm.internal.h.e(model, "model");
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        this.savedState = fetchState();
    }

    private final b6.g fetchState() {
        return new b6.g(getId(), getToken(), getOptedIn());
    }

    @Override // b6.InterfaceC0520b
    public void addObserver(b6.c observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // b6.InterfaceC0520b
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != Z5.f.NO_PERMISSION;
    }

    public final b6.g getSavedState() {
        return this.savedState;
    }

    @Override // b6.InterfaceC0520b
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // b6.InterfaceC0520b
    public void optIn() {
        com.onesignal.common.modeling.i.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // b6.InterfaceC0520b
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final b6.g refreshState() {
        b6.g fetchState = fetchState();
        this.savedState = fetchState;
        return fetchState;
    }

    @Override // b6.InterfaceC0520b
    public void removeObserver(b6.c observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }
}
