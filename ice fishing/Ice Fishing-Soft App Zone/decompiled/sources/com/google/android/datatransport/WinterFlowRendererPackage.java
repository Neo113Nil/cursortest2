package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererPackage extends WinterFlowHookProcessor implements Iterator {
    public final /* synthetic */ WinterFlowJSONSystem WinterFlowRouterRouter;
    public boolean WinterFlowUnitTestResponse = true;

    public WinterFlowRendererPackage(WinterFlowJSONSystem winterFlowJSONSystem) {
        this.WinterFlowRouterRouter = winterFlowJSONSystem;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.WinterFlowUnitTestResponse) {
            this.WinterFlowRouterRouter.getClass();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.WinterFlowUnitTestResponse) {
            return null;
        }
        this.WinterFlowUnitTestResponse = false;
        this.WinterFlowRouterRouter.getClass();
        return null;
    }
}
