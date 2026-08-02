package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class f0 {
    public Notification C;
    public RemoteViews D;
    public String E;
    public String F;
    public long G;
    public final boolean J;
    public final Notification K;
    public boolean L;
    public final ArrayList M;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public CharSequence i;
    public int j;
    public int k;
    public boolean m;
    public n0 n;
    public CharSequence o;
    public int p;
    public int q;
    public boolean r;
    public String s;
    public boolean t;
    public String u;
    public boolean w;
    public boolean x;
    public String y;
    public Bundle z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean l = true;
    public boolean v = false;
    public int A = 0;
    public int B = 0;
    public int H = 0;
    public int I = 0;

    public f0(Context context, String str) {
        Notification notification = new Notification();
        this.K = notification;
        this.a = context;
        this.E = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.M = new ArrayList();
        this.J = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i, String str, PendingIntent pendingIntent) {
        this.b.add(new z(i != 0 ? IconCompat.c(null, "", i) : null, str, pendingIntent));
    }

    public final Notification b() {
        Notification notification;
        Bundle bundle;
        p0 p0Var = new p0(this);
        f0 f0Var = p0Var.c;
        n0 n0Var = f0Var.n;
        if (n0Var != null) {
            n0Var.b(p0Var);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = p0Var.b;
        if (i >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            int i2 = p0Var.e;
            if (i2 != 0) {
                if (build.getGroup() != null && (build.flags & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && i2 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (build.getGroup() != null && (build.flags & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 && i2 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
            notification = build;
        }
        if (n0Var != null) {
            f0Var.n.getClass();
        }
        if (n0Var != null && (bundle = notification.extras) != null) {
            n0Var.a(bundle);
        }
        return notification;
    }

    public final void d(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void e(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void f(int i) {
        Notification notification = this.K;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void g(int i, boolean z) {
        Notification notification = this.K;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void h(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void i(int i, int i2, int i3) {
        Notification notification = this.K;
        notification.ledARGB = i;
        notification.ledOnMS = i2;
        notification.ledOffMS = i3;
        notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
    }

    public final void j(Uri uri) {
        Notification notification = this.K;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = e0.a(e0.d(e0.c(e0.b(), 4), 5));
    }

    public final void k(n0 n0Var) {
        if (this.n != n0Var) {
            this.n = n0Var;
            if (((f0) n0Var.a) != this) {
                n0Var.a = this;
                k(n0Var);
            }
        }
    }
}
