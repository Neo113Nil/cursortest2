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
import com.icefishing.icefishingbigwin.C5275R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f494a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f498e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f499f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f500g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f501h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f502j;

    /* renamed from: l, reason: collision with root package name */
    public x f504l;

    /* renamed from: m, reason: collision with root package name */
    public String f505m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f506n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f508p;

    /* renamed from: s, reason: collision with root package name */
    public String f511s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f513u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f514v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f515w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f495b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f496c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f497d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f503k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f507o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f509q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f510r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f512t = 0;

    public v(Context context, String str) {
        Notification notification = new Notification();
        this.f514v = notification;
        this.f494a = context;
        this.f511s = str;
        notification.when = System.currentTimeMillis();
        this.f514v.audioStreamType = -1;
        this.f502j = 0;
        this.f515w = new ArrayList();
        this.f513u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        H h9 = new H(this);
        v vVar = (v) h9.f439x;
        x xVar = vVar.f504l;
        if (xVar != null) {
            xVar.a(h9);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) h9.f438w;
        if (i >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            int i6 = h9.f436u;
            if (i6 != 0) {
                if (z.f(build) != null && (build.flags & 512) != 0 && i6 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (z.f(build) != null && (build.flags & 512) == 0 && i6 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
            notification = build;
        }
        if (xVar != null) {
            vVar.f504l.getClass();
        }
        if (xVar != null && (bundle = notification.extras) != null) {
            if (xVar.f519d) {
                bundle.putCharSequence("android.summaryText", xVar.f518c);
            }
            CharSequence charSequence = xVar.f517b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", xVar.b());
        }
        return notification;
    }

    public final void c(int i) {
        Notification notification = this.f514v;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i, boolean z3) {
        if (z3) {
            Notification notification = this.f514v;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.f514v;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f494a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C5275R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C5275R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f4688k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f4690b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f501h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f514v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder e9 = u.e(u.c(u.b(), 4), 5);
        this.f514v.audioAttributes = u.a(e9);
    }

    public final void g(x xVar) {
        if (this.f504l != xVar) {
            this.f504l = xVar;
            if (xVar == null || xVar.f516a == this) {
                return;
            }
            xVar.f516a = this;
            g(xVar);
        }
    }
}
