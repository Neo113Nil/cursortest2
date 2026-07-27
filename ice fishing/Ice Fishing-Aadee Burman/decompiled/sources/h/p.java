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
import k.AbstractC4615b;
import k.InterfaceC4614a;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: n, reason: collision with root package name */
    public static final T0.l f37905n = new T0.l(new N1.f(3));

    /* renamed from: u, reason: collision with root package name */
    public static final int f37906u = -100;

    /* renamed from: v, reason: collision with root package name */
    public static K.l f37907v = null;

    /* renamed from: w, reason: collision with root package name */
    public static K.l f37908w = null;

    /* renamed from: x, reason: collision with root package name */
    public static Boolean f37909x = null;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f37910y = false;

    /* renamed from: z, reason: collision with root package name */
    public static final s.c f37911z = new s.c(0);

    /* renamed from: A, reason: collision with root package name */
    public static final Object f37903A = new Object();

    /* renamed from: B, reason: collision with root package name */
    public static final Object f37904B = new Object();

    public static boolean c(Context context) {
        if (f37909x == null) {
            try {
                int i = AbstractServiceC4538F.f37817n;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC4538F.class), AbstractC4537E.a() | 128).metaData;
                if (bundle != null) {
                    f37909x = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f37909x = Boolean.FALSE;
            }
        }
        return f37909x.booleanValue();
    }

    public static void f(LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A) {
        synchronized (f37903A) {
            try {
                Iterator it = f37911z.iterator();
                while (true) {
                    s.f fVar = (s.f) it;
                    if (fVar.hasNext()) {
                        p pVar = (p) ((WeakReference) fVar.next()).get();
                        if (pVar == layoutInflaterFactory2C4533A || pVar == null) {
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

    public abstract void h(int i);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);

    public abstract AbstractC4615b m(InterfaceC4614a interfaceC4614a);
}
