package defpackage;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes10.dex */
public abstract class vj41 {
    public static eg01 a(WebSettings webSettings) {
        try {
            return new eg01((WebSettingsBoundaryInterface) ei6.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) mq41.a.b).convertSettings(webSettings)));
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
            return new wj41();
        }
    }

    public static void b(WebSettings webSettings, boolean z) {
        if (!qp41.D.a()) {
            throw qp41.a();
        }
        a(webSettings).t(z);
    }

    public static void c(WebSettings webSettings, int i) {
        if (!qp41.H.a()) {
            throw qp41.a();
        }
        a(webSettings).v(i);
    }
}
