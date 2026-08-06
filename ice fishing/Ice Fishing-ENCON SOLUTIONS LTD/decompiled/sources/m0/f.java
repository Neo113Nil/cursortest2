package m0;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0979c;
import o.C0996a;
import o0.x;
import p0.AbstractC1014k;
import p0.AbstractC1021r;
import p0.DialogInterfaceOnClickListenerC1015l;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8172c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final f f8173d = new f();

    public static AlertDialog d(Activity activity, int i2, DialogInterfaceOnClickListenerC1015l dialogInterfaceOnClickListenerC1015l, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC1014k.b(activity, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(com.watchfacestudio.spraktum.R.string.common_google_play_services_enable_button) : resources.getString(com.watchfacestudio.spraktum.R.string.common_google_play_services_update_button) : resources.getString(com.watchfacestudio.spraktum.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC1015l);
        }
        String c2 = AbstractC1014k.c(activity, i2);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", C1.a.f(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        AbstractC1021r.d(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f8166a = alertDialog;
        if (onCancelListener != null) {
            cVar.f8167b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i2, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i2, new DialogInterfaceOnClickListenerC1015l(super.a(googleApiActivity, "d", i2), googleApiActivity, 0), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        e(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i2, PendingIntent pendingIntent) {
        NotificationManager notificationManager;
        CharSequence charSequence;
        int i3;
        Bundle bundle;
        int i4;
        ArrayList arrayList;
        int i5;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", C1.a.g(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e2 = i2 == 6 ? AbstractC1014k.e(context, "common_google_play_services_resolution_required_title") : AbstractC1014k.c(context, i2);
        if (e2 == null) {
            e2 = context.getResources().getString(com.watchfacestudio.spraktum.R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i2 == 6 || i2 == 19) ? AbstractC1014k.d(context, "common_google_play_services_resolution_required_text", AbstractC1014k.a(context)) : AbstractC1014k.b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC1021r.c(systemService);
        NotificationManager notificationManager2 = (NotificationManager) systemService;
        o.c cVar = new o.c();
        ArrayList arrayList2 = new ArrayList();
        cVar.f8229b = arrayList2;
        cVar.f8230c = new ArrayList();
        cVar.f8231d = new ArrayList();
        cVar.f8236i = true;
        cVar.f8238k = false;
        Notification notification = new Notification();
        cVar.f8242o = notification;
        cVar.f8228a = context;
        cVar.f8240m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        cVar.f8235h = 0;
        cVar.f8243p = new ArrayList();
        cVar.f8241n = true;
        cVar.f8238k = true;
        notification.flags |= 16;
        cVar.f8232e = o.c.a(e2);
        o.b bVar = new o.b(0);
        bVar.f8227c = o.c.a(d2);
        cVar.b(bVar);
        PackageManager packageManager = context.getPackageManager();
        if (R1.l.f1766e == null) {
            R1.l.f1766e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (R1.l.f1766e.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            cVar.f8235h = 2;
            if (R1.l.s(context)) {
                arrayList2.add(new C0996a(resources.getString(com.watchfacestudio.spraktum.R.string.common_open_on_phone), pendingIntent));
            } else {
                cVar.f8234g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = o.c.a(resources.getString(com.watchfacestudio.spraktum.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            cVar.f8234g = pendingIntent;
            cVar.f8233f = o.c.a(d2);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            if (i6 < 26) {
                throw new IllegalStateException();
            }
            synchronized (f8172c) {
            }
            notificationChannel = notificationManager2.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.watchfacestudio.spraktum.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager2.createNotificationChannel(e.b(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager2.createNotificationChannel(notificationChannel);
                }
            }
            cVar.f8240m = "com.google.android.gms.availability";
        }
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder a2 = Build.VERSION.SDK_INT >= 26 ? o.h.a(cVar.f8228a, cVar.f8240m) : new Notification.Builder(cVar.f8228a);
        Notification notification2 = cVar.f8242o;
        a2.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(cVar.f8232e).setContentText(cVar.f8233f).setContentInfo(null).setContentIntent(cVar.f8234g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        o.f.b(a2, null);
        a2.setSubText(null).setUsesChronometer(false).setPriority(cVar.f8235h);
        Iterator it = cVar.f8229b.iterator();
        while (it.hasNext()) {
            C0996a c0996a = (C0996a) it.next();
            if (c0996a.f8219b == null && (i5 = c0996a.f8222e) != 0) {
                c0996a.f8219b = IconCompat.b(i5);
            }
            IconCompat iconCompat = c0996a.f8219b;
            Notification.Action.Builder a3 = o.f.a(iconCompat != null ? s.b.c(iconCompat, null) : null, c0996a.f8223f, c0996a.f8224g);
            Bundle bundle3 = c0996a.f8218a;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z2 = c0996a.f8220c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z2);
            int i7 = Build.VERSION.SDK_INT;
            o.g.a(a3, z2);
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (i7 >= 28) {
                o.i.b(a3, 0);
            }
            if (i7 >= 29) {
                o.j.c(a3, false);
            }
            if (i7 >= 31) {
                o.k.a(a3, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", c0996a.f8221d);
            o.d.b(a3, bundle4);
            o.d.a(a2, o.d.d(a3));
        }
        Bundle bundle5 = cVar.f8239l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int i8 = Build.VERSION.SDK_INT;
        a2.setShowWhen(cVar.f8236i);
        o.d.i(a2, cVar.f8238k);
        o.d.g(a2, null);
        o.d.j(a2, null);
        o.d.h(a2, false);
        o.e.b(a2, null);
        o.e.c(a2, 0);
        o.e.f(a2, 0);
        o.e.d(a2, null);
        o.e.e(a2, notification2.sound, notification2.audioAttributes);
        ArrayList arrayList3 = cVar.f8243p;
        ArrayList arrayList4 = cVar.f8230c;
        if (i8 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it2 = arrayList4.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    C0979c c0979c = new C0979c(arrayList3.size() + arrayList.size());
                    c0979c.addAll(arrayList);
                    c0979c.addAll(arrayList3);
                    arrayList3 = new ArrayList(c0979c);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                o.e.a(a2, (String) it3.next());
            }
        }
        ArrayList arrayList5 = cVar.f8231d;
        if (arrayList5.size() > 0) {
            if (cVar.f8239l == null) {
                cVar.f8239l = new Bundle();
            }
            Bundle bundle6 = cVar.f8239l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList5.size()) {
                String num = Integer.toString(i9);
                C0996a c0996a2 = (C0996a) arrayList5.get(i9);
                ArrayList arrayList6 = arrayList5;
                Bundle bundle9 = new Bundle();
                NotificationManager notificationManager3 = notificationManager2;
                if (c0996a2.f8219b == null && (i4 = c0996a2.f8222e) != 0) {
                    c0996a2.f8219b = IconCompat.b(i4);
                }
                IconCompat iconCompat2 = c0996a2.f8219b;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle9.putCharSequence("title", c0996a2.f8223f);
                bundle9.putParcelable("actionIntent", c0996a2.f8224g);
                Bundle bundle10 = c0996a2.f8218a;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", c0996a2.f8220c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", c0996a2.f8221d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i9++;
                arrayList5 = arrayList6;
                notificationManager2 = notificationManager3;
            }
            notificationManager = notificationManager2;
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (cVar.f8239l == null) {
                cVar.f8239l = new Bundle();
            }
            cVar.f8239l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        } else {
            notificationManager = notificationManager2;
        }
        int i10 = Build.VERSION.SDK_INT;
        a2.setExtras(cVar.f8239l);
        o.g.e(a2, null);
        if (i10 >= 26) {
            o.h.b(a2, 0);
            o.h.e(a2, null);
            o.h.f(a2, null);
            o.h.g(a2, 0L);
            o.h.d(a2, 0);
            if (!TextUtils.isEmpty(cVar.f8240m)) {
                a2.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it4 = arrayList4.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i10 >= 29) {
            o.j.a(a2, cVar.f8241n);
            charSequence = null;
            o.j.b(a2, null);
        } else {
            charSequence = null;
        }
        o.b bVar2 = cVar.f8237j;
        if (bVar2 != null) {
            new Notification.BigTextStyle(a2).setBigContentTitle(charSequence).bigText((CharSequence) bVar2.f8227c);
        }
        Notification build = i6 >= 26 ? a2.build() : a2.build();
        if (bVar2 != null) {
            cVar.f8237j.getClass();
        }
        if (bVar2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            i.f8176a.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, build);
    }

    public final void g(Activity activity, x xVar, int i2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i2, new DialogInterfaceOnClickListenerC1015l(super.a(activity, "d", i2), xVar, 1), onCancelListener);
        if (d2 == null) {
            return;
        }
        e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
