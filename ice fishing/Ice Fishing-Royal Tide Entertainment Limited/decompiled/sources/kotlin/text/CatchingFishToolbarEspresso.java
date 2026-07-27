package kotlin.text;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishToolbarEspresso {
    public static final ArrayList CatchingFishReduxKtor = new ArrayList();
    public WeakReference CatchingFishCoroutine;
    public WeakHashMap CatchingFishParcelableFAB;
    public SparseArray CatchingFishSnackbar;

    public final View CatchingFishParcelableFAB(View view) {
        int size;
        WeakHashMap weakHashMap = this.CatchingFishParcelableFAB;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View CatchingFishParcelableFAB = CatchingFishParcelableFAB(viewGroup.getChildAt(childCount));
                if (CatchingFishParcelableFAB != null) {
                    return CatchingFishParcelableFAB;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
