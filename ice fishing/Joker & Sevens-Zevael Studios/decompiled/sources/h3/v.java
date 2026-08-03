package h3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f2825d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2826a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f2827b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2828c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f2826a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a6 = a(viewGroup.getChildAt(childCount));
                if (a6 != null) {
                    return a6;
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
