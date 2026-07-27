package q2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC2650La;
import com.google.android.gms.internal.ads.AbstractC2865Ya;
import com.google.android.gms.internal.ads.AbstractC3569ma;

/* renamed from: q2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4898o {

    /* renamed from: a, reason: collision with root package name */
    public static final X f40195a;

    static {
        X x9 = null;
        try {
            Object newInstance = C4896n.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    x9 = queryLocalInterface instanceof X ? (X) queryLocalInterface : new W(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 2);
                }
            } else {
                v2.i.f("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            v2.i.f("Failed to instantiate ClientApi class.");
        }
        f40195a = x9;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(X x9);

    public final Object d(Context context, boolean z3) {
        boolean z6;
        Object obj;
        Object obj2;
        if (!z3) {
            v2.d dVar = C4900p.f40196g.f40197a;
            if (M2.f.f1844b.c(context, 12451000) != 0) {
                v2.i.a("Google Play Services is not available.");
                z3 = true;
            }
        }
        boolean z9 = false;
        boolean z10 = !(X2.c.a(context) <= X2.c.d(context, false));
        AbstractC3569ma.a(context);
        if (((Boolean) AbstractC2650La.f26121a.r()).booleanValue()) {
            z6 = false;
        } else {
            boolean z11 = z3 | z10;
            if (((Boolean) AbstractC2650La.f26122b.r()).booleanValue()) {
                z6 = true;
                z9 = true;
            } else {
                z9 = z11;
                z6 = false;
            }
        }
        X x9 = f40195a;
        Object obj3 = null;
        if (z9) {
            if (x9 != null) {
                try {
                    obj2 = c(x9);
                } catch (RemoteException e9) {
                    v2.i.g("Cannot invoke local loader using ClientApi class.", e9);
                }
                if (obj2 == null && !z6) {
                    try {
                        obj3 = b();
                    } catch (RemoteException e10) {
                        v2.i.g("Cannot invoke remote loader.", e10);
                    }
                    obj2 = obj3;
                }
            } else {
                v2.i.f("ClientApi class cannot be loaded.");
            }
            obj2 = null;
            if (obj2 == null) {
                obj3 = b();
                obj2 = obj3;
            }
        } else {
            try {
                obj = b();
            } catch (RemoteException e11) {
                v2.i.g("Cannot invoke remote loader.", e11);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) AbstractC2865Ya.f28683a.r()).intValue();
                C4900p c4900p = C4900p.f40196g;
                if (c4900p.f40201e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(NativeAdvancedJsUtils.f17906p, "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = c4900p.f40200d.f41388n;
                    v2.d dVar2 = c4900p.f40197a;
                    dVar2.getClass();
                    v2.d.a(context, str, bundle, new m1.e(dVar2, context));
                }
            }
            if (obj == null) {
                if (x9 != null) {
                    try {
                        obj3 = c(x9);
                    } catch (RemoteException e12) {
                        v2.i.g("Cannot invoke local loader using ClientApi class.", e12);
                    }
                } else {
                    v2.i.f("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        return obj2 == null ? a() : obj2;
    }
}
