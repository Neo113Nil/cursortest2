package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public class g extends i implements X5.b {
    private final com.onesignal.common.events.b changeHandlersNotifier;
    private X5.g savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(V5.d model) {
        super(model);
        kotlin.jvm.internal.h.e(model, "model");
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        this.savedState = fetchState();
    }

    private final X5.g fetchState() {
        return new X5.g(getId(), getToken(), getOptedIn());
    }

    @Override // X5.b
    public void addObserver(X5.c observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // X5.b
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != V5.f.NO_PERMISSION;
    }

    public final X5.g getSavedState() {
        return this.savedState;
    }

    @Override // X5.b
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // X5.b
    public void optIn() {
        com.onesignal.common.modeling.i.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // X5.b
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final X5.g refreshState() {
        X5.g fetchState = fetchState();
        this.savedState = fetchState;
        return fetchState;
    }

    @Override // X5.b
    public void removeObserver(X5.c observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }
}
