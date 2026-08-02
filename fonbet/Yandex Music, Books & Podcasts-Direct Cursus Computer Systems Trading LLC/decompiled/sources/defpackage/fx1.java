package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import android.webkit.WebView;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class fx1 {
    public static AudioManager a;

    public static void a(AudioManager audioManager, tw1 tw1Var) {
        if (dvt.a < 26) {
            audioManager.abandonAudioFocus(tw1Var.b);
            return;
        }
        Object obj = tw1Var.f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static final Bitmap b(yg0 yg0Var) {
        if (yg0Var instanceof yg0) {
            return yg0Var.a;
        }
        qq6.d("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static void c(NotificationManager notificationManager, Resources resources, bfj bfjVar, boolean z) {
        NotificationChannel notificationChannel = new NotificationChannel(bfjVar.a, resources.getString(bfjVar.b), bfjVar.c);
        notificationChannel.setShowBadge(z);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static Icon d(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static final int e(Bitmap bitmap) {
        int i;
        Bitmap.Config config;
        if (bitmap.isRecycled()) {
            StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
            sb.append(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap.Config config2 = bitmap.getConfig();
            sb.append(" [");
            sb.append(width);
            sb.append(" x ");
            sb.append(height);
            sb.append("] + ");
            sb.append(config2);
            throw new IllegalStateException(sb.toString().toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height2 = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config3 = bitmap.getConfig();
            if (config3 == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (config3 == Bitmap.Config.RGB_565 || config3 == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    config = Bitmap.Config.RGBA_F16;
                    if (config3 == config) {
                        i = 8;
                    }
                }
                i = 4;
            }
            return height2 * i;
        }
    }

    public static synchronized AudioManager f(Context context) {
        synchronized (fx1.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    n20 n20Var = new n20();
                    sj2.u().execute(new qf0(3, applicationContext, n20Var));
                    n20Var.c();
                    AudioManager audioManager2 = a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(CameraProperty.AUDIO);
                a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AutofillId g(View view) {
        return view.getAutofillId();
    }

    public static PackageInfo h(Context context) {
        PackageInfo i;
        if (Build.VERSION.SDK_INT >= 26) {
            return WebView.getCurrentWebViewPackage();
        }
        try {
            i = i();
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (i != null) {
            return i;
        }
        String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
        if (str != null) {
            return context.getPackageManager().getPackageInfo(str, 0);
        }
        return null;
    }

    public static PackageInfo i() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static final boolean j(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    public static Intent k(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static final void l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.getClass();
        broadcastReceiver.getClass();
        intentFilter.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static int m(AudioManager audioManager, tw1 tw1Var) {
        if (dvt.a >= 26) {
            Object obj = tw1Var.f;
            obj.getClass();
            return audioManager.requestAudioFocus(xq0.e(obj));
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = tw1Var.b;
        dv1 dv1Var = tw1Var.d;
        int i = 1;
        if ((dv1Var.b & 1) != 1) {
            switch (dv1Var.c) {
                case 2:
                    i = 0;
                    break;
                case 3:
                    i = 8;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i = 5;
                    break;
                case 6:
                    i = 2;
                    break;
                case 11:
                    i = 10;
                    break;
                case 12:
                default:
                    i = 3;
                    break;
                case 13:
                    break;
            }
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, i, tw1Var.a);
    }

    public static void n(TextView textView) {
        textView.setAutoSizeTextTypeWithDefaults(1);
    }

    public static void o(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static final Bitmap.Config p(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final int q(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return 3;
            }
        }
        if (i < 26) {
            return 0;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2 ? 4 : 0;
    }

    public static final void r(Context context, BroadcastReceiver broadcastReceiver) {
        context.getClass();
        broadcastReceiver.getClass();
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            ssg.a(5, null, "Failed to unregister connectivity receiver", e);
        }
    }
}
