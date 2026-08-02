package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class th implements xbi0 {
    public Object a;

    public th(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.a = collectionInfo;
    }

    public static th a(int i, int i2, int i3, boolean z) {
        return new th(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return this.a;
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        View view = (View) obj;
        if (jl40.l(this.a, obj2)) {
            return;
        }
        this.a = obj2;
        view.invalidate();
    }
}
