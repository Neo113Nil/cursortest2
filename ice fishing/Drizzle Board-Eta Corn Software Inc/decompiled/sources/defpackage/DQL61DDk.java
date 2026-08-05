package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class DQL61DDk {
    public static final HzhOLUMW NCTxEWno = new HzhOLUMW(new IxsfNS3D());
    public static int MdtA4re8 = -100;
    public static dq wxUZMvaN = null;
    public static dq VgvYg0wo = null;
    public static Boolean P7K7Inc8 = null;
    public static boolean b2ZJblxo = false;
    public static final z0 Qr9iLBAD = new z0();
    public static final Object jb9XjC4I = new Object();
    public static final Object eVhOlqcC = new Object();

    public static boolean NCTxEWno(Context context) {
        if (P7K7Inc8 == null) {
            try {
                int i = h0.NCTxEWno;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) h0.class), g0.qoPGr6Ce() | 128).metaData;
                if (bundle != null) {
                    P7K7Inc8 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                P7K7Inc8 = Boolean.FALSE;
            }
        }
        return P7K7Inc8.booleanValue();
    }

    public static void VgvYg0wo(SJ7tYVsF sJ7tYVsF) {
        synchronized (jb9XjC4I) {
            try {
                z0 z0Var = Qr9iLBAD;
                z0Var.getClass();
                t0 t0Var = new t0(z0Var);
                while (t0Var.hasNext()) {
                    DQL61DDk dQL61DDk = (DQL61DDk) ((WeakReference) t0Var.next()).get();
                    if (dQL61DDk == sJ7tYVsF || dQL61DDk == null) {
                        t0Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void MdtA4re8();

    public abstract boolean P7K7Inc8(int i);

    public abstract void Qr9iLBAD(int i);

    public abstract void eVhOlqcC(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void jb9XjC4I(View view);

    public abstract void k3x7lurq(CharSequence charSequence);

    public abstract void qoPGr6Ce();

    public abstract void wxUZMvaN();
}
