package com.google.android.datatransport;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
@WinterFlowJavaHelper("activity")
/* loaded from: classes.dex */
public class WinterFlowBatchConfiguration extends WinterFlowRendererRenderer {
    public final Activity WinterFlowCacheManagerAgent;

    public WinterFlowBatchConfiguration(Context context) {
        Object obj;
        context.getClass();
        Iterator it = WinterFlowFrontendSubsystem.WinterFlowServiceUtility(context, new WinterFlowInterfaceSoftware(2)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.WinterFlowCacheManagerAgent = (Activity) obj;
    }

    @Override // com.google.android.datatransport.WinterFlowRendererRenderer
    public final WinterFlowServerLayer WinterFlowCacheManagerAgent(WinterFlowServerLayer winterFlowServerLayer) {
        throw new IllegalStateException(("Destination " + ((WinterFlowUINode) winterFlowServerLayer).WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure + " does not have an Intent set.").toString());
    }

    @Override // com.google.android.datatransport.WinterFlowRendererRenderer
    public final WinterFlowServerLayer WinterFlowRouterStructure() {
        return new WinterFlowUINode(this);
    }

    @Override // com.google.android.datatransport.WinterFlowRendererRenderer
    public final boolean WinterFlowTransactionManagerStrategy() {
        Activity activity = this.WinterFlowCacheManagerAgent;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
