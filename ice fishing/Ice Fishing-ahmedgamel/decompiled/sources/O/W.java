package O;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.icefishing.icefishingbigwin.C5275R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f2050d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2051a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f2052b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2053c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f2051a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a9 = a(viewGroup.getChildAt(childCount));
                if (a9 != null) {
                    return a9;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(C5275R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
