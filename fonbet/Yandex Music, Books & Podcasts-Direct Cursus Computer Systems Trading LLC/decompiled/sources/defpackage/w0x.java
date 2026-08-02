package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class w0x {
    public static final msg a = new msg("CastDynamiteModule", null);

    public static e1x a(Context context, k74 k74Var, l3x l3xVar, HashMap hashMap) {
        e1x x0xVar;
        d1x b = b(context);
        zhj zhjVar = new zhj(context.getApplicationContext());
        Parcel M0 = b.M0();
        y4x.d(M0, zhjVar);
        y4x.c(M0, k74Var);
        y4x.d(M0, l3xVar);
        M0.writeMap(hashMap);
        Parcel N0 = b.N0(M0, 1);
        IBinder readStrongBinder = N0.readStrongBinder();
        int i = c1x.h;
        if (readStrongBinder == null) {
            x0xVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            x0xVar = queryLocalInterface instanceof e1x ? (e1x) queryLocalInterface : new x0x(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 2);
        }
        N0.recycle();
        return x0xVar;
    }

    public static d1x b(Context context) {
        try {
            try {
                IBinder iBinder = (IBinder) cya.b(context, cya.b).a.getClassLoader().loadClass("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl").newInstance();
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                return queryLocalInterface instanceof d1x ? (d1x) queryLocalInterface : new d1x(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 2);
            } catch (ClassNotFoundException e) {
                e = e;
                throw new aya("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            } catch (IllegalAccessException e2) {
                e = e2;
                throw new aya("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            } catch (InstantiationException e3) {
                e = e3;
                throw new aya("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            }
        } catch (aya e4) {
            throw new odi(e4);
        }
    }
}
