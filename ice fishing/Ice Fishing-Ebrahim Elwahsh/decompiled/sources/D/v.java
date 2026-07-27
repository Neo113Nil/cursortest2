package D;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f549a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f553e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f554f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f555g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f556h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f557j;

    /* renamed from: l, reason: collision with root package name */
    public x f559l;

    /* renamed from: m, reason: collision with root package name */
    public String f560m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f561n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f563p;

    /* renamed from: s, reason: collision with root package name */
    public String f566s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f568u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f569v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f570w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f550b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f551c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f552d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f558k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f562o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f564q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f565r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f567t = 0;

    public v(Context context, String str) {
        Notification notification = new Notification();
        this.f569v = notification;
        this.f549a = context;
        this.f566s = str;
        notification.when = System.currentTimeMillis();
        this.f569v.audioStreamType = -1;
        this.f557j = 0;
        this.f570w = new ArrayList();
        this.f568u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        H h9 = new H(this);
        v vVar = (v) h9.f494x;
        x xVar = vVar.f559l;
        if (xVar != null) {
            xVar.a(h9);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) h9.f493w;
        if (i >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            int i4 = h9.f491u;
            if (i4 != 0) {
                if (z.f(build) != null && (build.flags & 512) != 0 && i4 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (z.f(build) != null && (build.flags & 512) == 0 && i4 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
            notification = build;
        }
        if (xVar != null) {
            vVar.f559l.getClass();
        }
        if (xVar != null && (bundle = notification.extras) != null) {
            if (xVar.f574d) {
                bundle.putCharSequence("android.summaryText", xVar.f573c);
            }
            CharSequence charSequence = xVar.f572b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", xVar.b());
        }
        return notification;
    }

    public final void c(int i) {
        Notification notification = this.f569v;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i, boolean z8) {
        if (z8) {
            Notification notification = this.f569v;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.f569v;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f549a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C5284R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C5284R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f4803k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f4805b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f556h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f569v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder e6 = u.e(u.c(u.b(), 4), 5);
        this.f569v.audioAttributes = u.a(e6);
    }

    public final void g(x xVar) {
        if (this.f559l != xVar) {
            this.f559l = xVar;
            if (xVar == null || xVar.f571a == this) {
                return;
            }
            xVar.f571a = this;
            g(xVar);
        }
    }
}
