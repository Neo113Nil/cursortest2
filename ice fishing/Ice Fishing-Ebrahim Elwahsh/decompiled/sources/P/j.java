package P;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f2673a;

    public j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f2673a = collectionItemInfo;
    }

    public static j a(int i, int i4, int i9, int i10, boolean z8) {
        return new j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i4, i9, i10, false, z8));
    }
}
