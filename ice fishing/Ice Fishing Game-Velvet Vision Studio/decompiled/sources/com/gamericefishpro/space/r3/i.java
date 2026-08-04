package com.gamericefishpro.space.r3;

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
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i6.w;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public k l;
    public String m;
    public boolean n;
    public Bundle p;
    public String s;
    public final boolean u;
    public Notification v;
    public final ArrayList w;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean o = false;
    public int q = 0;
    public int r = 0;
    public int t = 0;

    public i(Context context, String str) {
        Notification notification = new Notification();
        this.v = notification;
        this.a = context;
        this.s = str;
        notification.when = System.currentTimeMillis();
        this.v.audioStreamType = -1;
        this.j = 0;
        this.w = new ArrayList();
        this.u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i2;
        com.gamericefishpro.space.u6.n nVar = new com.gamericefishpro.space.u6.n();
        new ArrayList();
        nVar.v = new Bundle();
        nVar.i = this;
        Context context = this.a;
        nVar.d = context;
        Notification.Builder builder = new Notification.Builder(context, this.s);
        nVar.e = builder;
        Notification notification = this.v;
        Context context2 = null;
        int i3 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.i).setProgress(0, 0, false);
        IconCompat iconCompat = this.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.e(context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(this.j);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            c cVar = (c) obj;
            int i5 = Build.VERSION.SDK_INT;
            if (cVar.b == null && (i2 = cVar.e) != 0) {
                cVar.b = IconCompat.a(i2);
            }
            IconCompat iconCompat2 = cVar.b;
            boolean z = cVar.c;
            Bundle bundle2 = cVar.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.e(context2) : context2, cVar.f, cVar.g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i5 >= 28) {
                com.gamericefishpro.space.d4.h.p(builder2);
            }
            if (i5 >= 29) {
                w.l(builder2);
            }
            if (i5 >= 31) {
                com.gamericefishpro.space.d4.j.b(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", cVar.d);
            builder2.addExtras(bundle3);
            ((Notification.Builder) nVar.e).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle4 = this.p;
        if (bundle4 != null) {
            ((Bundle) nVar.v).putAll(bundle4);
        }
        int i6 = Build.VERSION.SDK_INT;
        ((Notification.Builder) nVar.e).setShowWhen(this.k);
        ((Notification.Builder) nVar.e).setLocalOnly(this.o);
        ((Notification.Builder) nVar.e).setGroup(this.m);
        ((Notification.Builder) nVar.e).setSortKey(null);
        ((Notification.Builder) nVar.e).setGroupSummary(this.n);
        ((Notification.Builder) nVar.e).setCategory(null);
        ((Notification.Builder) nVar.e).setColor(this.q);
        ((Notification.Builder) nVar.e).setVisibility(this.r);
        ((Notification.Builder) nVar.e).setPublicVersion(null);
        ((Notification.Builder) nVar.e).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.w;
        ArrayList arrayList4 = this.c;
        if (i6 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw com.gamericefishpro.space.m5.a.f(it);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    com.gamericefishpro.space.t.f fVar = new com.gamericefishpro.space.t.f(arrayList3.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                ((Notification.Builder) nVar.e).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5.size() > 0) {
            if (this.p == null) {
                this.p = new Bundle();
            }
            Bundle bundle5 = this.p.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList5.size()) {
                String string = Integer.toString(i8);
                c cVar2 = (c) arrayList5.get(i8);
                Bundle bundle8 = new Bundle();
                if (cVar2.b == null && (i = cVar2.e) != 0) {
                    cVar2.b = IconCompat.a(i);
                }
                IconCompat iconCompat3 = cVar2.b;
                Bundle bundle9 = cVar2.a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : i3);
                bundle8.putCharSequence("title", cVar2.f);
                bundle8.putParcelable("actionIntent", cVar2.g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", cVar2.c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", cVar2.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i8++;
                i3 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.p == null) {
                this.p = new Bundle();
            }
            this.p.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) nVar.v).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i9 = Build.VERSION.SDK_INT;
        ((Notification.Builder) nVar.e).setExtras(this.p);
        ((Notification.Builder) nVar.e).setRemoteInputHistory(null);
        ((Notification.Builder) nVar.e).setBadgeIconType(0);
        ((Notification.Builder) nVar.e).setSettingsText(null);
        ((Notification.Builder) nVar.e).setShortcutId(null);
        ((Notification.Builder) nVar.e).setTimeoutAfter(0L);
        ((Notification.Builder) nVar.e).setGroupAlertBehavior(this.t);
        if (!TextUtils.isEmpty(this.s)) {
            ((Notification.Builder) nVar.e).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i9 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                throw com.gamericefishpro.space.m5.a.f(it2);
            }
        }
        if (i9 >= 29) {
            w.j((Notification.Builder) nVar.e, this.u);
            w.k((Notification.Builder) nVar.e);
        }
        if (i9 >= 36) {
            com.gamericefishpro.space.e4.f.e((Notification.Builder) nVar.e);
        }
        i iVar = (i) nVar.i;
        k kVar = iVar.l;
        if (kVar != null) {
            kVar.a(nVar);
        }
        Notification notificationBuild = ((Notification.Builder) nVar.e).build();
        if (kVar != null) {
            iVar.l.getClass();
        }
        if (kVar != null && (bundle = notificationBuild.extras) != null) {
            if (kVar.d) {
                bundle.putCharSequence("android.summaryText", kVar.c);
            }
            CharSequence charSequence = kVar.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", kVar.b());
        }
        return notificationBuild;
    }

    public final void c(int i) {
        Notification notification = this.v;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i, boolean z) {
        if (z) {
            Notification notification = this.v;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.v;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
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

    public final void f(Uri uri) {
        Notification notification = this.v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder builderD = h.d(h.c(h.b(), 4), 5);
        this.v.audioAttributes = h.a(builderD);
    }

    public final void g(k kVar) {
        if (this.l != kVar) {
            this.l = kVar;
            if (kVar == null || kVar.a == this) {
                return;
            }
            kVar.a = this;
            g(kVar);
        }
    }
}
