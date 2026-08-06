package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yt1 {
    public static final java.util.ArrayList JhCgjQRTAOCT = new java.util.ArrayList();
    public java.util.WeakHashMap ZpBGe2uQfcn8;
    public java.lang.ref.WeakReference fWTAfUmVKrZq;
    public android.util.SparseArray giKS3J6vZuNy;

    public final android.view.View ZpBGe2uQfcn8(android.view.View view) {
        int size;
        java.util.WeakHashMap weakHashMap = this.ZpBGe2uQfcn8;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    android.view.View ZpBGe2uQfcn8 = ZpBGe2uQfcn8(viewGroup.getChildAt(childCount));
                    if (ZpBGe2uQfcn8 != null) {
                        return ZpBGe2uQfcn8;
                    }
                }
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(com.ice.fishing.wolberta.R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                defpackage.p81.ZpBGe2uQfcn8();
            }
        }
        return null;
    }
}
