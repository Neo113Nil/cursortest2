package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.combinations.level.experts.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class me1 {
    public static final ArrayList xqGvceK5x = new ArrayList();
    public WeakHashMap GWasM1elztuh;
    public WeakReference X1lG3V04pd;
    public SparseArray Yi7zF1RB1;

    public final View GWasM1elztuh(View view) {
        int size;
        WeakHashMap weakHashMap = this.GWasM1elztuh;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View GWasM1elztuh = GWasM1elztuh(viewGroup.getChildAt(childCount));
                    if (GWasM1elztuh != null) {
                        return GWasM1elztuh;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                o4.YmKjaVtbfp5Z();
            }
        }
        return null;
    }
}
