package androidx.versionedparcelable;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.icecatchpuzzle.puzzleicecatch.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class FrostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432 {
    public static final ArrayList RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new ArrayList();
    public WeakReference ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public SparseArray AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public WeakHashMap ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public final View ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(View view) {
        int size;
        WeakHashMap weakHashMap = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(viewGroup.getChildAt(childCount));
                    if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != null) {
                        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
            }
        }
        return null;
    }
}
