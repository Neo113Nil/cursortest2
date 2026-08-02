package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes10.dex */
public final class vh implements xbi0 {
    public Object a;

    public /* synthetic */ vh(Object obj) {
        this.a = obj;
    }

    public static vh a(float f, float f2, float f3, int i) {
        return new vh(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return this.a;
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        this.a = obj2;
        ((View) obj).invalidate();
    }
}
