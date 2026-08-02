package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import yads.cv3;
import yads.ku3;
import yads.nu3;
import yads.ou3;
import yads.ut3;

/* loaded from: classes7.dex */
public abstract class x481 {
    public static final kn61 a = new kn61();

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            ny61.g("Application Context cannot be null");
            return;
        }
        kn61 kn61Var = a;
        if (kn61Var.a) {
            return;
        }
        kn61Var.a = true;
        pn61 a2 = pn61.a();
        kg81 kg81Var = a2.b;
        a2.c = new nu3(new Handler(), applicationContext, new tk71(), a2);
        ut3.d.a(applicationContext);
        tga1.a = (UiModeManager) applicationContext.getSystemService("uimode");
        WindowManager windowManager = y471.a;
        y471.c = applicationContext.getResources().getDisplayMetrics().density;
        y471.a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new ou3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        lt81.b.a = applicationContext.getApplicationContext();
        sn71 sn71Var = sn71.e;
        boolean z = sn71Var.b;
        ku3 ku3Var = sn71Var.c;
        if (!z) {
            ku3Var.a(applicationContext);
            ku3Var.c = sn71Var;
            ku3Var.b();
            sn71Var.d = ku3Var.b;
            sn71Var.b = true;
        }
        w171.d.a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new cv3(), intentFilter);
    }
}
