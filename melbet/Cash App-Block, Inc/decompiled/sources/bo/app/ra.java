package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class ra implements ReadWriteProperty {
    public Object a;

    public static final String a(Object obj, KProperty kProperty) {
        return "Cannot assign " + obj + " to only-set-once property " + kProperty.getName();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty kProperty) {
        obj.getClass();
        kProperty.getClass();
        return this.a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        obj.getClass();
        kProperty.getClass();
        Object obj3 = this.a;
        if (obj3 == null) {
            this.a = obj2;
        } else {
            if (obj3.equals(obj2)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(27, obj2, kProperty), 7, (Object) null);
        }
    }
}
