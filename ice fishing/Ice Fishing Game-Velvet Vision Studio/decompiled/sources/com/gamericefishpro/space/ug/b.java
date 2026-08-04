package com.gamericefishpro.space.ug;

import com.gamericefishpro.space.fc.i;
import com.gamericefishpro.space.mh.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b extends d implements com.gamericefishpro.space.mh.b {
    private final com.gamericefishpro.space.dc.b changeHandlersNotifier;
    private g savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.gamericefishpro.space.jh.d model) {
        super(model);
        Intrinsics.checkNotNullParameter(model, "model");
        this.changeHandlersNotifier = new com.gamericefishpro.space.dc.b();
        this.savedState = fetchState();
    }

    private final g fetchState() {
        return new g(getId(), getToken(), getOptedIn());
    }

    @Override // com.gamericefishpro.space.mh.b
    public void addObserver(com.gamericefishpro.space.mh.c observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    public final com.gamericefishpro.space.dc.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // com.gamericefishpro.space.mh.b
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != com.gamericefishpro.space.jh.f.NO_PERMISSION;
    }

    public final g getSavedState() {
        return this.savedState;
    }

    @Override // com.gamericefishpro.space.mh.b
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // com.gamericefishpro.space.mh.b
    public void optIn() {
        i.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // com.gamericefishpro.space.mh.b
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final g refreshState() {
        g gVarFetchState = fetchState();
        this.savedState = gVarFetchState;
        return gVarFetchState;
    }

    @Override // com.gamericefishpro.space.mh.b
    public void removeObserver(com.gamericefishpro.space.mh.c observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }
}
