package defpackage;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes11.dex */
public abstract class toi0 {
    public static final toi0 a;

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    static {
        toi0 roi0Var;
        if (k7x.a >= 9) {
            try {
                roi0Var = new roi0(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
            if (roi0Var == null) {
                roi0Var = new soi0();
            }
            a = roi0Var;
        }
        roi0Var = null;
        if (roi0Var == null) {
        }
        a = roi0Var;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
