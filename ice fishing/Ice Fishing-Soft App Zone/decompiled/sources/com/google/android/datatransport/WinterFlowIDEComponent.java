package com.google.android.datatransport;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowIDEComponent {
    public static final /* synthetic */ int WinterFlowRouterStructure = 0;

    static {
        new WeakHashMap();
    }

    public static void WinterFlowHookDataSource(ViewGroup viewGroup, WinterFlowSyntaxCloud winterFlowSyntaxCloud) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(winterFlowSyntaxCloud.WinterFlowTransactionManagerStrategy);
    }

    public static boolean WinterFlowRouterStructure(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = WinterFlowSerializerProvider.WinterFlowArrayNetwork;
            WinterFlowSerializerProvider winterFlowSerializerProvider = (WinterFlowSerializerProvider) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (winterFlowSerializerProvider == null) {
                winterFlowSerializerProvider = new WinterFlowSerializerProvider();
                winterFlowSerializerProvider.WinterFlowRouterStructure = null;
                winterFlowSerializerProvider.WinterFlowHookDataSource = null;
                winterFlowSerializerProvider.WinterFlowCacheManagerAgent = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, winterFlowSerializerProvider);
            }
            WeakReference weakReference2 = winterFlowSerializerProvider.WinterFlowCacheManagerAgent;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                winterFlowSerializerProvider.WinterFlowCacheManagerAgent = new WeakReference(keyEvent);
                SparseArray sparseArray = winterFlowSerializerProvider.WinterFlowHookDataSource;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    winterFlowSerializerProvider.WinterFlowHookDataSource = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                    return false;
                }
            }
        }
        return false;
    }
}
