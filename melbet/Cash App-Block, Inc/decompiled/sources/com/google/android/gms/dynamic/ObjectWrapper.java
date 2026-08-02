package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.base.zab;
import java.lang.reflect.Field;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class ObjectWrapper extends zab implements IObjectWrapper {
    public final Object zza;

    public ObjectWrapper(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.zza = obj;
    }

    public static IObjectWrapper asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) queryLocalInterface : new zzb(iBinder);
    }

    public static Object unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).zza;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
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
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        zzae.checkNotNull(field);
        if (field.isAccessible()) {
            a$$ExternalSyntheticBUOutline0.m$3("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            Handlers$$ExternalSyntheticBUOutline0.m("Could not access the field in remoteBinder.", e);
            return null;
        } catch (NullPointerException e2) {
            Handlers$$ExternalSyntheticBUOutline0.m("Binder object is null.", e2);
            return null;
        }
    }
}
