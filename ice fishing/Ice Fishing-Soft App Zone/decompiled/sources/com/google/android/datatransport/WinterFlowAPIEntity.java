package com.google.android.datatransport;

import android.view.ViewParent;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowAPIEntity extends WinterFlowDatabaseSchemaPipeline implements WinterFlowObjectSession {
    public static final WinterFlowAPIEntity WinterFlowServerProtocol = new WinterFlowAPIEntity(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        viewParent.getClass();
        return viewParent.getParent();
    }
}
