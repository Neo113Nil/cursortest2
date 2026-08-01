package com.google.android.datatransport;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerProvider {
    public static final ArrayList WinterFlowArrayNetwork = new ArrayList();
    public WeakReference WinterFlowCacheManagerAgent;
    public SparseArray WinterFlowHookDataSource;
    public WeakHashMap WinterFlowRouterStructure;

    public final View WinterFlowRouterStructure(View view) {
        int size;
        WeakHashMap weakHashMap = this.WinterFlowRouterStructure;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View WinterFlowRouterStructure = WinterFlowRouterStructure(viewGroup.getChildAt(childCount));
                    if (WinterFlowRouterStructure != null) {
                        return WinterFlowRouterStructure;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            }
        }
        return null;
    }
}
