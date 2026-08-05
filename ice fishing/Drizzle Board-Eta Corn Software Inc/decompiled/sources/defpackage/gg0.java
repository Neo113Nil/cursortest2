package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.kolosta.rejin.jilosa.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gg0 {
    public static final ArrayList wxUZMvaN = new ArrayList();
    public WeakReference MdtA4re8;
    public SparseArray NCTxEWno;
    public WeakHashMap qoPGr6Ce;

    public final View qoPGr6Ce(View view) {
        int size;
        WeakHashMap weakHashMap = this.qoPGr6Ce;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View qoPGr6Ce = qoPGr6Ce(viewGroup.getChildAt(childCount));
                    if (qoPGr6Ce != null) {
                        return qoPGr6Ce;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                m1.qoPGr6Ce();
            }
        }
        return null;
    }
}
