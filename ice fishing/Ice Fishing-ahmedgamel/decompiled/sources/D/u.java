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
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f389a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f393e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f394f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f395g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f396h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f397j;

    /* renamed from: l, reason: collision with root package name */
    public w f399l;

    /* renamed from: m, reason: collision with root package name */
    public String f400m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f401n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f403p;

    /* renamed from: s, reason: collision with root package name */
    public String f406s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f408u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f409v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f410w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f390b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f391c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f392d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f398k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f402o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f404q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f405r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f407t = 0;

    public u(Context context, String str) {
        Notification notification = new Notification();
        this.f409v = notification;
        this.f389a = context;
        this.f406s = str;
        notification.when = System.currentTimeMillis();
        this.f409v.audioStreamType = -1;
        this.f397j = 0;
        this.f410w = new ArrayList();
        this.f408u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        G g9 = new G(this);
        u uVar = (u) g9.f336x;
        w wVar = uVar.f399l;
        if (wVar != null) {
            wVar.a(g9);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) g9.f335w;
        if (i >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            int i4 = g9.f333u;
            if (i4 != 0) {
                if (y.f(build) != null && (build.flags & 512) != 0 && i4 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (y.f(build) != null && (build.flags & 512) == 0 && i4 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
            notification = build;
        }
        if (wVar != null) {
            uVar.f399l.getClass();
        }
        if (wVar != null && (bundle = notification.extras) != null) {
            if (wVar.f414d) {
                bundle.putCharSequence("android.summaryText", wVar.f413c);
            }
            CharSequence charSequence = wVar.f412b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", wVar.b());
        }
        return notification;
    }

    public final void c(int i) {
        Notification notification = this.f409v;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i, boolean z6) {
        if (z6) {
            Notification notification = this.f409v;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.f409v;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f389a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C5248R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C5248R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f4656k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f4658b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f396h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f409v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder e9 = t.e(t.c(t.b(), 4), 5);
        this.f409v.audioAttributes = t.a(e9);
    }

    public final void g(w wVar) {
        if (this.f399l != wVar) {
            this.f399l = wVar;
            if (wVar == null || wVar.f411a == this) {
                return;
            }
            wVar.f411a = this;
            g(wVar);
        }
    }
}
