package q2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC2564Ga;
import com.google.android.gms.internal.ads.AbstractC2802Ua;
import com.google.android.gms.internal.ads.AbstractC3368ia;

/* renamed from: q2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4905o {

    /* renamed from: a, reason: collision with root package name */
    public static final X f40107a;

    static {
        X x3 = null;
        try {
            Object newInstance = C4903n.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    x3 = queryLocalInterface instanceof X ? (X) queryLocalInterface : new W(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 2);
                }
            } else {
                u2.i.f("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            u2.i.f("Failed to instantiate ClientApi class.");
        }
        f40107a = x3;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(X x3);

    public final Object d(Context context, boolean z8) {
        boolean z9;
        Object obj;
        Object obj2;
        if (!z8) {
            u2.d dVar = C4907p.f40108g.f40109a;
            if (L2.f.f1726b.c(context, 12451000) != 0) {
                u2.i.a("Google Play Services is not available.");
                z8 = true;
            }
        }
        boolean z10 = false;
        boolean z11 = !(W2.c.a(context) <= W2.c.d(context, false));
        AbstractC3368ia.a(context);
        if (((Boolean) AbstractC2564Ga.f25177a.r()).booleanValue()) {
            z9 = false;
        } else {
            boolean z12 = z8 | z11;
            if (((Boolean) AbstractC2564Ga.f25178b.r()).booleanValue()) {
                z9 = true;
                z10 = true;
            } else {
                z10 = z12;
                z9 = false;
            }
        }
        X x3 = f40107a;
        Object obj3 = null;
        if (z10) {
            if (x3 != null) {
                try {
                    obj2 = c(x3);
                } catch (RemoteException e6) {
                    u2.i.g("Cannot invoke local loader using ClientApi class.", e6);
                }
                if (obj2 == null && !z9) {
                    try {
                        obj3 = b();
                    } catch (RemoteException e9) {
                        u2.i.g("Cannot invoke remote loader.", e9);
                    }
                    obj2 = obj3;
                }
            } else {
                u2.i.f("ClientApi class cannot be loaded.");
            }
            obj2 = null;
            if (obj2 == null) {
                obj3 = b();
                obj2 = obj3;
            }
        } else {
            try {
                obj = b();
            } catch (RemoteException e10) {
                u2.i.g("Cannot invoke remote loader.", e10);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) AbstractC2802Ua.f28035a.r()).intValue();
                C4907p c4907p = C4907p.f40108g;
                if (c4907p.f40113e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(NativeAdvancedJsUtils.f18064p, "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = c4907p.f40112d.f41217n;
                    u2.d dVar2 = c4907p.f40109a;
                    dVar2.getClass();
                    u2.d.a(context, str, bundle, new S0.s(18, dVar2, context));
                }
            }
            if (obj == null) {
                if (x3 != null) {
                    try {
                        obj3 = c(x3);
                    } catch (RemoteException e11) {
                        u2.i.g("Cannot invoke local loader using ClientApi class.", e11);
                    }
                } else {
                    u2.i.f("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        return obj2 == null ? a() : obj2;
    }
}
