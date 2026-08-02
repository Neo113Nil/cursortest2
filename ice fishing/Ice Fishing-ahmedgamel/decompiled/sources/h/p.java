package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import k.AbstractC4625b;
import k.InterfaceC4624a;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: n, reason: collision with root package name */
    public static final T0.l f37931n = new T0.l(new P1.f(3));

    /* renamed from: u, reason: collision with root package name */
    public static final int f37932u = -100;

    /* renamed from: v, reason: collision with root package name */
    public static K.l f37933v = null;

    /* renamed from: w, reason: collision with root package name */
    public static K.l f37934w = null;

    /* renamed from: x, reason: collision with root package name */
    public static Boolean f37935x = null;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f37936y = false;

    /* renamed from: z, reason: collision with root package name */
    public static final s.c f37937z = new s.c(0);

    /* renamed from: A, reason: collision with root package name */
    public static final Object f37929A = new Object();

    /* renamed from: B, reason: collision with root package name */
    public static final Object f37930B = new Object();

    public static boolean c(Context context) {
        if (f37935x == null) {
            try {
                int i = AbstractServiceC4542F.f37842n;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC4542F.class), AbstractC4541E.a() | 128).metaData;
                if (bundle != null) {
                    f37935x = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f37935x = Boolean.FALSE;
            }
        }
        return f37935x.booleanValue();
    }

    public static void f(LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A) {
        synchronized (f37929A) {
            try {
                Iterator it = f37937z.iterator();
                while (true) {
                    s.f fVar = (s.f) it;
                    if (fVar.hasNext()) {
                        p pVar = (p) ((WeakReference) fVar.next()).get();
                        if (pVar == layoutInflaterFactory2C4537A || pVar == null) {
                            fVar.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i);

    public abstract void i(int i);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);

    public abstract AbstractC4625b n(InterfaceC4624a interfaceC4624a);
}
