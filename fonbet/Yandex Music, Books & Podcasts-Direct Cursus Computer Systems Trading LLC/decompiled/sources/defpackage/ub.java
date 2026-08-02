package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class ub implements xjn {
    public Object a = tlm.g(bwf.c);

    public static ub d(boolean z, int i, int i2, int i3, int i4) {
        AccessibilityNodeInfo.CollectionItemInfo obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z);
        ub ubVar = new ub();
        ubVar.a = obtain;
        return ubVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public void a(Object obj, String str) {
        str.getClass();
        ((Map) this.a.getValue()).put(str, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public Map b() {
        ?? r0 = this.a;
        if (r0.isInitialized()) {
            return (Map) r0.getValue();
        }
        return null;
    }

    public void c(String[] strArr, Object obj) {
        int length = (strArr.length / 2) - 1;
        int i = 0;
        if (length >= 0) {
            int length2 = strArr.length - 1;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    String str = strArr[i2];
                    strArr[i2] = strArr[length2];
                    strArr[length2] = str;
                    length2--;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        int length3 = strArr.length;
        while (i < length3) {
            String str2 = strArr[i];
            ub ubVar = i == strArr.length + (-1) ? this : new ub();
            ubVar.a(obj, str2);
            obj = ubVar.b();
            i++;
        }
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        return this.a;
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        View view = (View) obj;
        if (Intrinsics.d(this.a, obj2)) {
            return;
        }
        this.a = obj2;
        view.invalidate();
    }
}
