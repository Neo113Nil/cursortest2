package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class qi {
    public final Method a;
    public final Method b;
    public final Field c;
    public final Method d;

    public qi() {
        Method method;
        Method method2;
        Method method3;
        Field field = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused2) {
            method2 = null;
        }
        try {
            Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
            declaredField.setAccessible(true);
            field = declaredField;
            method3 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
            method3 = null;
        }
        this.a = method;
        this.b = method2;
        this.c = field;
        this.d = method3;
    }

    public static boolean a(int i, long j) {
        return (j & (1 << i)) != 0;
    }
}
