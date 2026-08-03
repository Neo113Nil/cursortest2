package x2;

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
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import d8.s;
import java.util.ArrayList;
import java.util.Iterator;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8236a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f8240e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f8241f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f8242g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f8243h;

    /* renamed from: i, reason: collision with root package name */
    public int f8244i;

    /* renamed from: j, reason: collision with root package name */
    public int f8245j;

    /* renamed from: l, reason: collision with root package name */
    public k f8247l;

    /* renamed from: m, reason: collision with root package name */
    public String f8248m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8249n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f8251p;

    /* renamed from: s, reason: collision with root package name */
    public String f8254s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8256u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f8257v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f8258w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8237b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8238c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8239d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f8246k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8250o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f8252q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f8253r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f8255t = 0;

    public i(Context context, String str) {
        Notification notification = new Notification();
        this.f8257v = notification;
        this.f8236a = context;
        this.f8254s = str;
        notification.when = System.currentTimeMillis();
        this.f8257v.audioStreamType = -1;
        this.f8245j = 0;
        this.f8258w = new ArrayList();
        this.f8256u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        Bundle bundle;
        int i10;
        ArrayList arrayList;
        int i11;
        s sVar = new s();
        new ArrayList();
        sVar.f1815j = new Bundle();
        sVar.f1814i = this;
        Context context = this.f8236a;
        sVar.f1812g = context;
        Notification.Builder builder = new Notification.Builder(context, this.f8254s);
        sVar.f1813h = builder;
        Notification notification = this.f8257v;
        Context context2 = null;
        int i12 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f8240e).setContentText(this.f8241f).setContentInfo(null).setContentIntent(this.f8242g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.f8244i).setProgress(0, 0, false);
        IconCompat iconCompat = this.f8243h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.e(context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(this.f8245j);
        ArrayList arrayList2 = this.f8237b;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            c cVar = (c) obj;
            int i14 = Build.VERSION.SDK_INT;
            if (cVar.f8225b == null && (i11 = cVar.f8228e) != 0) {
                cVar.f8225b = IconCompat.a(i11);
            }
            IconCompat iconCompat2 = cVar.f8225b;
            boolean z10 = cVar.f8226c;
            Bundle bundle2 = cVar.f8224a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.e(context2) : context2, cVar.f8229f, cVar.f8230g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z10);
            builder2.setAllowGeneratedReplies(z10);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i14 >= 28) {
                b3.a.o(builder2);
            }
            if (i14 >= 29) {
                a2.b.k(builder2);
            }
            if (i14 >= 31) {
                l.a(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", cVar.f8227d);
            builder2.addExtras(bundle3);
            ((Notification.Builder) sVar.f1813h).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle4 = this.f8251p;
        if (bundle4 != null) {
            ((Bundle) sVar.f1815j).putAll(bundle4);
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) sVar.f1813h).setShowWhen(this.f8246k);
        ((Notification.Builder) sVar.f1813h).setLocalOnly(this.f8250o);
        ((Notification.Builder) sVar.f1813h).setGroup(this.f8248m);
        ((Notification.Builder) sVar.f1813h).setSortKey(null);
        ((Notification.Builder) sVar.f1813h).setGroupSummary(this.f8249n);
        ((Notification.Builder) sVar.f1813h).setCategory(null);
        ((Notification.Builder) sVar.f1813h).setColor(this.f8252q);
        ((Notification.Builder) sVar.f1813h).setVisibility(this.f8253r);
        ((Notification.Builder) sVar.f1813h).setPublicVersion(null);
        ((Notification.Builder) sVar.f1813h).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.f8258w;
        ArrayList arrayList4 = this.f8238c;
        if (i15 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    s.g gVar = new s.g(arrayList3.size() + arrayList.size());
                    gVar.addAll(arrayList);
                    gVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList3.get(i16);
                i16++;
                ((Notification.Builder) sVar.f1813h).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = this.f8239d;
        if (arrayList5.size() > 0) {
            if (this.f8251p == null) {
                this.f8251p = new Bundle();
            }
            Bundle bundle5 = this.f8251p.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i17 = 0;
            while (i17 < arrayList5.size()) {
                String num = Integer.toString(i17);
                c cVar2 = (c) arrayList5.get(i17);
                Bundle bundle8 = new Bundle();
                if (cVar2.f8225b == null && (i10 = cVar2.f8228e) != 0) {
                    cVar2.f8225b = IconCompat.a(i10);
                }
                IconCompat iconCompat3 = cVar2.f8225b;
                Bundle bundle9 = cVar2.f8224a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : i12);
                bundle8.putCharSequence("title", cVar2.f8229f);
                bundle8.putParcelable("actionIntent", cVar2.f8230g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", cVar2.f8226c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", cVar2.f8227d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i17++;
                i12 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f8251p == null) {
                this.f8251p = new Bundle();
            }
            this.f8251p.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) sVar.f1815j).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i18 = Build.VERSION.SDK_INT;
        ((Notification.Builder) sVar.f1813h).setExtras(this.f8251p);
        ((Notification.Builder) sVar.f1813h).setRemoteInputHistory(null);
        ((Notification.Builder) sVar.f1813h).setBadgeIconType(0);
        ((Notification.Builder) sVar.f1813h).setSettingsText(null);
        ((Notification.Builder) sVar.f1813h).setShortcutId(null);
        ((Notification.Builder) sVar.f1813h).setTimeoutAfter(0L);
        ((Notification.Builder) sVar.f1813h).setGroupAlertBehavior(this.f8255t);
        if (!TextUtils.isEmpty(this.f8254s)) {
            ((Notification.Builder) sVar.f1813h).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i18 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i18 >= 29) {
            a2.b.i((Notification.Builder) sVar.f1813h, this.f8256u);
            a2.b.j((Notification.Builder) sVar.f1813h);
        }
        if (i18 >= 36) {
            d.b.f((Notification.Builder) sVar.f1813h);
        }
        i iVar = (i) sVar.f1814i;
        k kVar = iVar.f8247l;
        if (kVar != null) {
            kVar.a(sVar);
        }
        Notification build = ((Notification.Builder) sVar.f1813h).build();
        if (kVar != null) {
            iVar.f8247l.getClass();
        }
        if (kVar != null && (bundle = build.extras) != null) {
            if (kVar.f8262d) {
                bundle.putCharSequence("android.summaryText", kVar.f8261c);
            }
            CharSequence charSequence = kVar.f8260b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", kVar.b());
        }
        return build;
    }

    public final void c(int i10) {
        Notification notification = this.f8257v;
        notification.defaults = i10;
        if ((i10 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i10, boolean z10) {
        if (z10) {
            Notification notification = this.f8257v;
            notification.flags = i10 | notification.flags;
        } else {
            Notification notification2 = this.f8257v;
            notification2.flags = (~i10) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f8236a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f617k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f619b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f8243h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f8257v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder d10 = h.d(h.c(h.b(), 4), 5);
        this.f8257v.audioAttributes = h.a(d10);
    }

    public final void g(k kVar) {
        if (this.f8247l != kVar) {
            this.f8247l = kVar;
            if (kVar == null || kVar.f8259a == this) {
                return;
            }
            kVar.f8259a = this;
            g(kVar);
        }
    }
}
