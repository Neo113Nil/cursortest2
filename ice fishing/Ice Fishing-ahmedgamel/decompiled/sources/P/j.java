package P;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f2338a;

    public j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f2338a = collectionItemInfo;
    }

    public static j a(int i, int i4, int i6, int i9, boolean z6) {
        return new j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i4, i6, i9, false, z6));
    }
}
