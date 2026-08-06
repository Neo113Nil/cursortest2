package defpackage;

/* loaded from: classes.dex */
public final class lm1 {
    public static final java.util.ArrayList F7NU4MC0GW = new java.util.ArrayList();
    public java.util.WeakHashMap IHQe1A4L2xu;
    public android.util.SparseArray oh6vYeIP;
    public java.lang.ref.WeakReference r1MBDhnF;

    public final android.view.View IHQe1A4L2xu(android.view.View view) {
        int size;
        java.util.WeakHashMap weakHashMap = this.IHQe1A4L2xu;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    android.view.View IHQe1A4L2xu = IHQe1A4L2xu(viewGroup.getChildAt(childCount));
                    if (IHQe1A4L2xu != null) {
                        return IHQe1A4L2xu;
                    }
                }
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(com.combinations.spin.balbi.R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                defpackage.db.kd6TUFXn();
            }
        }
        return null;
    }
}
