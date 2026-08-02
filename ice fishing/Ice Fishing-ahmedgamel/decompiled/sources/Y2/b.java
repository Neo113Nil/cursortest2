package Y2;

import D.x;
import R2.w;
import android.os.IBinder;
import android.os.IInterface;
import e3.g;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b extends g implements a {

    /* renamed from: u, reason: collision with root package name */
    public final Object f3908u;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 0);
        this.f3908u = obj;
    }

    public static Object D0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f3908u;
        }
        IBinder asBinder = aVar.asBinder();
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
            int length = declaredFields.length;
            throw new IllegalArgumentException(x.k(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        }
        w.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e9) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e9);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }

    public static a t0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new d(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }
}
