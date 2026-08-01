package com.google.android.datatransport;

import android.view.View;
import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDeserializationSystem {
    public static final WinterFlowDatabaseSchemaStructure WinterFlowRouterStructure;

    static {
        long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        WinterFlowRouterStructure = new WinterFlowDatabaseSchemaStructure();
    }

    public static final WinterFlowExceptionScheduler WinterFlowRouterStructure(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof WinterFlowExceptionScheduler) {
            return (WinterFlowExceptionScheduler) tag;
        }
        return null;
    }
}
