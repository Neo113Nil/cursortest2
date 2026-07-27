package P;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f2407a;

    public j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f2407a = collectionItemInfo;
    }

    public static j a(int i, int i6, int i9, int i10, boolean z3) {
        return new j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i6, i9, i10, false, z3));
    }
}
