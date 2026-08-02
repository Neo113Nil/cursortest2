package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class uh {
    public final Object a;

    public /* synthetic */ uh(Object obj) {
        this.a = obj;
    }

    public static uh a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new uh(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }
}
