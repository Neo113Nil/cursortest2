package com.onesignal.user.internal;

import com.onesignal.common.modeling.i;
import pc.j;
import qb.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class b extends d implements qb.b {
    private final com.onesignal.common.events.b changeHandlersNotifier;
    private g savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ob.d dVar) {
        super(dVar);
        j.e(dVar, "model");
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        this.savedState = fetchState();
    }

    private final g fetchState() {
        return new g(getId(), getToken(), getOptedIn());
    }

    @Override // qb.b
    public void addObserver(qb.c cVar) {
        j.e(cVar, "observer");
        this.changeHandlersNotifier.subscribe(cVar);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // qb.b
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != ob.f.NO_PERMISSION;
    }

    public final g getSavedState() {
        return this.savedState;
    }

    @Override // qb.b
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // qb.b
    public void optIn() {
        i.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // qb.b
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final g refreshState() {
        g fetchState = fetchState();
        this.savedState = fetchState;
        return fetchState;
    }

    @Override // qb.b
    public void removeObserver(qb.c cVar) {
        j.e(cVar, "observer");
        this.changeHandlersNotifier.unsubscribe(cVar);
    }
}
