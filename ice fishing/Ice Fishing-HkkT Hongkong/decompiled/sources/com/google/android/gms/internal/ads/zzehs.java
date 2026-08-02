package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzehs extends zzbwl {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdwf zzc;
    private final zzceh zzd;
    private final zzehh zze;
    private final zzflw zzf;
    private String zzg;
    private String zzh;

    public zzehs(Context context, zzehh zzehhVar, zzceh zzcehVar, zzdwf zzdwfVar, zzflw zzflwVar) {
        this.zzb = context;
        this.zzc = zzdwfVar;
        this.zzd = zzcehVar;
        this.zze = zzehhVar;
        this.zzf = zzflwVar;
    }

    public static void zzc(Context context, zzdwf zzdwfVar, zzflw zzflwVar, zzehh zzehhVar, String str, String str2, Map map) {
        String zza;
        String str3 = true != com.google.android.gms.ads.internal.zzt.zzo().zzz(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue() || zzdwfVar == null) {
            zzflv zzb = zzflv.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", str3);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            zza = zzflwVar.zza(zzb);
        } else {
            zzdwe zza2 = zzdwfVar.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            zza2.zzb("device_connectivity", str3);
            zza2.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza2.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            zza = zza2.zzf();
        }
        zzehhVar.zzd(new zzehj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), str, zza, 2));
    }

    public static final PendingIntent zzq(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra(ShareConstants.MEDIA_URI, str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzfuj.zzb(context, 0, intent, zzfuj.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzfuj.zza(context, 0, intent, 201326592);
    }

    private static String zzr(int i, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzt.zzo().zze();
        return zze == null ? str : zze.getString(i);
    }

    private final void zzs(String str, String str2, Map map) {
        zzc(this.zzb, this.zzc, this.zzf, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzt() {
        boolean z;
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzbt zzy = com.google.android.gms.ads.internal.util.zzt.zzy(this.zzb);
            IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
            String str = this.zzh;
            String str2 = this.zzg;
            zzegz zzegzVar = (zzegz) this.zza.get(str2);
            z = zzy.zzg(wrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzegzVar == null ? "" : zzegzVar.zzc()));
            if (!z) {
                try {
                    z = zzy.zzf(ObjectWrapper.wrap(this.zzb), this.zzh, this.zzg);
                } catch (RemoteException e) {
                    e = e;
                    zzcec.zzh("Failed to schedule offline notification poster.", e);
                    if (z) {
                    }
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            z = false;
        }
        if (z) {
            this.zze.zzc(this.zzg);
            zzs(this.zzg, "offline_notification_worker_not_scheduled", zzgad.zzd());
        }
    }

    private final void zzu(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzt();
            zzv(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzs(this.zzg, "asnpdi", zzgad.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
            zzJ.setTitle(zzr(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzr(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzehl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzehs.this.zzd(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzr(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzehm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzehs.this.zzk(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzehn
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzehs.this.zzl(zzmVar, dialogInterface);
                }
            });
            zzJ.create().show();
            zzs(this.zzg, "rtsdi", zzgad.zzd());
        }
    }

    private final void zzv(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog create;
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzt.zzJ(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        int i = R.layout.offline_ads_dialog;
        Resources zze = com.google.android.gms.ads.internal.zzt.zzo().zze();
        XmlResourceParser layout = zze == null ? null : zze.getLayout(i);
        if (layout == null) {
            onCancelListener.setMessage(zzr(R.string.offline_dialog_text, "You'll get a notification with the link when you're back online"));
            create = onCancelListener.create();
        } else {
            View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(inflate);
            zzegz zzegzVar = (zzegz) this.zza.get(this.zzg);
            String zzb = zzegzVar == null ? "" : zzegzVar.zzb();
            if (!zzb.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzb);
            }
            zzegz zzegzVar2 = (zzegz) this.zza.get(this.zzg);
            Drawable zza = zzegzVar2 != null ? zzegzVar2.zza() : null;
            if (zza != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zza);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzehr(this, create, timer, zzmVar), 3000L);
    }

    final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzs(this.zzg, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzq().zzf(activity));
        zzt();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra(ShareConstants.MEDIA_URI);
            boolean zzz = com.google.android.gms.ads.internal.zzt.zzo().zzz(this.zzb);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzz ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzs(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (r8 == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzehh.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                zzcec.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzehu zzehuVar = (zzehu) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzehuVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzehuVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzt();
                    zzv(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzs(this.zzg, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzehu zzehuVar = (zzehu) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzehuVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzehuVar.zzb();
        this.zzg = zzehuVar.zzc();
        this.zzh = zzehuVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzip)).booleanValue()) {
            zzu(zza, zzb);
            return;
        }
        zzs(this.zzg, "dialog_impression", zzgad.zzd());
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(zza);
        zzJ.setTitle(zzr(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzr(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzr(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeho
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzehs.this.zzm(zza, zzb, dialogInterface, i);
            }
        }).setNegativeButton(zzr(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzehp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzehs.this.zzn(zzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzehs.this.zzo(zzb, dialogInterface);
            }
        });
        zzJ.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh() {
        final zzceh zzcehVar = this.zzd;
        this.zze.zze(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzeha
            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                zzehh.zzb(zzceh.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(9:5|6|(2:18|19)|8|9|10|11|12|13)|24|(0)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c6, code lost:
    
        r8.put("notification_not_shown_reason", r7.getMessage());
        r7 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbwm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmap;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str = zzaVar.zza;
        String str2 = zzaVar.zzb;
        String str3 = zzaVar.zzc;
        com.google.android.gms.ads.internal.zzt.zzq().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(zzr(R.string.offline_notification_title, "View the ad you saved when you were offline")).setAutoCancel(true).setDeleteIntent(zzq(context, "offline_notification_dismissed", str2, str)).setContentIntent(zzq(context, "offline_notification_clicked", str2, str)).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziq)).intValue()).setSmallIcon(context.getApplicationInfo().icon);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzis)).booleanValue() && !str3.isEmpty()) {
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str3).openConnection().getInputStream());
            } catch (IOException unused) {
            }
            if (bitmap != null) {
                try {
                    smallIcon.setLargeIcon(bitmap).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
                } catch (Resources.NotFoundException unused2) {
                }
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            HashMap hashMap = new HashMap();
            notificationManager.notify(str2, 54321, smallIcon.build());
            String str4 = "offline_notification_impression";
            zzs(str2, str4, hashMap);
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str2, 54321, smallIcon.build());
        String str42 = "offline_notification_impression";
        zzs(str2, str42, hashMap2);
    }

    final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzg);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzs(this.zzg, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzg);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzs(this.zzg, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzm(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzs(this.zzg, "dialog_click", hashMap);
        zzu(activity, zzmVar);
    }

    final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzg);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzs(this.zzg, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzg);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzs(this.zzg, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzp(String str, zzdna zzdnaVar) {
        String str2 = "";
        String zzx = !TextUtils.isEmpty(zzdnaVar.zzx()) ? zzdnaVar.zzx() : zzdnaVar.zzB() != null ? zzdnaVar.zzB() : "";
        zzbjm zzm = zzdnaVar.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbjm zzn = zzdnaVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzegv(zzx, str2, drawable));
    }
}
