package s2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC2670La;
import com.google.android.gms.internal.ads.AbstractC2888Ya;
import com.google.android.gms.internal.ads.AbstractC3592ma;

/* renamed from: s2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4947o {

    /* renamed from: a, reason: collision with root package name */
    public static final X f40497a;

    static {
        X x9 = null;
        try {
            Object newInstance = C4945n.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    x9 = queryLocalInterface instanceof X ? (X) queryLocalInterface : new W(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 1);
                }
            } else {
                x2.i.f("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            x2.i.f("Failed to instantiate ClientApi class.");
        }
        f40497a = x9;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(X x9);

    public final Object d(Context context, boolean z6) {
        boolean z9;
        Object obj;
        Object obj2;
        if (!z6) {
            x2.d dVar = C4949p.f40498g.f40499a;
            if (O2.f.f2270b.c(context, 12451000) != 0) {
                x2.i.a("Google Play Services is not available.");
                z6 = true;
            }
        }
        boolean z10 = false;
        boolean z11 = !(Z2.b.a(context) <= Z2.b.d(context, false));
        AbstractC3592ma.a(context);
        if (((Boolean) AbstractC2670La.f26918a.r()).booleanValue()) {
            z9 = false;
        } else {
            boolean z12 = z6 | z11;
            if (((Boolean) AbstractC2670La.f26919b.r()).booleanValue()) {
                z9 = true;
                z10 = true;
            } else {
                z10 = z12;
                z9 = false;
            }
        }
        X x9 = f40497a;
        Object obj3 = null;
        if (z10) {
            if (x9 != null) {
                try {
                    obj2 = c(x9);
                } catch (RemoteException e9) {
                    x2.i.g("Cannot invoke local loader using ClientApi class.", e9);
                }
                if (obj2 == null && !z9) {
                    try {
                        obj3 = b();
                    } catch (RemoteException e10) {
                        x2.i.g("Cannot invoke remote loader.", e10);
                    }
                    obj2 = obj3;
                }
            } else {
                x2.i.f("ClientApi class cannot be loaded.");
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
                x2.i.g("Cannot invoke remote loader.", e11);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) AbstractC2888Ya.f29458a.r()).intValue();
                C4949p c4949p = C4949p.f40498g;
                if (c4949p.f40503e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(NativeAdvancedJsUtils.f18693p, "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = c4949p.f40502d.f41845n;
                    x2.d dVar2 = c4949p.f40499a;
                    dVar2.getClass();
                    x2.d.a(context, str, bundle, new k8.b(dVar2, context));
                }
            }
            if (obj == null) {
                if (x9 != null) {
                    try {
                        obj3 = c(x9);
                    } catch (RemoteException e12) {
                        x2.i.g("Cannot invoke local loader using ClientApi class.", e12);
                    }
                } else {
                    x2.i.f("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        return obj2 == null ? a() : obj2;
    }
}
