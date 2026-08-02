package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class roi0 extends toi0 {
    public final /* synthetic */ Method b;

    public roi0(Method method) {
        this.b = method;
    }

    @Override // defpackage.toi0
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            ny61.n("Failed invoking canAccess", e);
            return false;
        }
    }
}
