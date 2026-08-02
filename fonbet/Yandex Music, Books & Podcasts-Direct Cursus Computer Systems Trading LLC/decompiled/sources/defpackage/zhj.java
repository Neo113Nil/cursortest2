package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class zhj extends pww implements l9e {
    public final Object h;

    public zhj(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.h = obj;
    }

    public static l9e S0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof l9e ? (l9e) queryLocalInterface : new x2x(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }

    public static Object T0(l9e l9eVar) {
        if (l9eVar instanceof zhj) {
            return ((zhj) l9eVar).h;
        }
        IBinder asBinder = l9eVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            xq0.x(k5r.i(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
            return null;
        }
        y1g.G(field);
        if (field.isAccessible()) {
            xq0.x("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
