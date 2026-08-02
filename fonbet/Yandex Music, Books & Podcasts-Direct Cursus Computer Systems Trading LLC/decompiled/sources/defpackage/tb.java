package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class tb implements xjn {
    public Object a;

    public /* synthetic */ tb(Object obj) {
        this.a = obj;
    }

    public static tb b(int i, int i2, int i3) {
        return new tb(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public oq a() {
        Object obj = this.a;
        if (obj instanceof oq) {
            return (oq) obj;
        }
        return null;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        s9fVar.getClass();
        Object obj2 = this.a;
        if (obj2 != imp.k) {
            return obj2;
        }
        rj7.n(s9fVar, " is not yet initialized.", "Property ");
        return null;
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        s9fVar.getClass();
        if (this.a == imp.k) {
            this.a = obj2;
            return;
        }
        throw new IllegalStateException("Property " + s9fVar + " already initialized with " + obj2 + ".");
    }
}
