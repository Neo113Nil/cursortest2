package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import r.C0334b;
import r.C0339g;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final n f3223a = new n(new o());

    /* renamed from: b, reason: collision with root package name */
    public static final int f3224b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static K.g f3225c = null;

    /* renamed from: d, reason: collision with root package name */
    public static K.g f3226d = null;
    public static Boolean e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3227f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final C0339g f3228g = new C0339g();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3229h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (e == null) {
            try {
                int i2 = H.f3142a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) H.class), G.a() | 128).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void e(LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B) {
        synchronized (f3229h) {
            try {
                C0339g c0339g = f3228g;
                c0339g.getClass();
                C0334b c0334b = new C0334b(c0339g);
                while (c0334b.hasNext()) {
                    p pVar = (p) ((WeakReference) c0334b.next()).get();
                    if (pVar == layoutInflaterFactory2C0159B || pVar == null) {
                        c0334b.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i2);

    public abstract void g(int i2);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
