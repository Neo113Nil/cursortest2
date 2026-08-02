package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzbnr implements zzbng {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdwf zzb;
    private final zzflw zzc;
    private final zzbvq zze;
    private final zzehh zzf;
    private final zzcse zzg;
    private com.google.android.gms.ads.internal.overlay.zzy zzh = null;
    private final zzgey zzi = zzcep.zzf;
    private final zzceh zzd = new zzceh(null);

    public zzbnr(com.google.android.gms.ads.internal.zzb zzbVar, zzbvq zzbvqVar, zzehh zzehhVar, zzdwf zzdwfVar, zzflw zzflwVar, zzcse zzcseVar) {
        this.zza = zzbVar;
        this.zze = zzbvqVar;
        this.zzf = zzehhVar;
        this.zzb = zzdwfVar;
        this.zzc = zzflwVar;
        this.zzg = zzcseVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzavi zzaviVar, Uri uri, View view, Activity activity, zzfhl zzfhlVar) {
        if (zzaviVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzlr)).booleanValue() || zzfhlVar == null) {
                if (zzaviVar.zze(uri)) {
                    uri = zzaviVar.zza(uri, context, view, activity);
                }
            } else if (zzaviVar.zze(uri)) {
                uri = zzfhlVar.zza(uri, context, view, activity);
            }
        } catch (zzavj unused) {
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzcec.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        Object obj;
        Object obj2;
        HashMap hashMap;
        boolean z2;
        zzcjk zzcjkVar = (zzcjk) zzaVar;
        zzfgm zzD = zzcjkVar.zzD();
        zzfgp zzP = zzcjkVar.zzP();
        boolean z3 = false;
        if (zzD == null || zzP == null) {
            str3 = "";
            z = false;
        } else {
            String str4 = zzP.zzb;
            z = zzD.zzaj;
            str3 = str4;
        }
        boolean z4 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkk)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcjkVar.zzaC()) {
                zzcec.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzckq) zzaVar).zzaH(zzf(map), zzb(map), z4);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzlm)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), AppEventsConstants.EVENT_PARAM_VALUE_YES)) {
                z3 = true;
            }
            if (str != null) {
                ((zzckq) zzaVar).zzaJ(zzf(map), zzb(map), str, z4, z3);
                return;
            } else {
                ((zzckq) zzaVar).zzaI(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z4);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            zzcjkVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzew)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzeA)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    z3 = true;
                }
            }
            boolean zzg = zzbhd.zzg(zzcjkVar.getContext());
            if (z3) {
                if (zzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        zzcec.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcjkVar.getContext(), zzcjkVar.zzI(), Uri.parse(str), zzcjkVar.zzF(), zzcjkVar.zzi(), zzcjkVar.zzQ()));
                    if (z && this.zzf != null && zzl(zzaVar, zzcjkVar.getContext(), zzd.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbno(this);
                    ((zzckq) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzh).asBinder(), true), z4);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            map.put("use_running_process", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            zzj(zzaVar, map, z, str3, z4);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z, str3, z4);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzid)).booleanValue()) {
                zzk(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    zzcec.zzj("Package name missing from open app action.");
                    return;
                }
                if (z && this.zzf != null && zzl(zzaVar, zzcjkVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzcjkVar.getContext().getPackageManager();
                if (packageManager == null) {
                    zzcec.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzckq) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z4);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str6 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                intent = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                zzcec.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zzd2 = zzd(zzc(zzcjkVar.getContext(), zzcjkVar.zzI(), data, zzcjkVar.zzF(), zzcjkVar.zzi(), zzcjkVar.zzQ()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzie)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                    }
                }
                intent2.setData(zzd2);
            }
        }
        boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziv)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap hashMap2 = new HashMap();
        if (z5) {
            obj = "event_id";
            obj2 = "p";
            hashMap = hashMap2;
            this.zzh = new zzbnp(this, z4, zzaVar, hashMap2, map);
            z2 = false;
        } else {
            obj = "event_id";
            obj2 = "p";
            hashMap = hashMap2;
            z2 = z4;
        }
        if (intent2 != null) {
            if (!z || this.zzf == null || !zzl(zzaVar, zzcjkVar.getContext(), intent2.getData().toString(), str3)) {
                ((zzckq) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzh), z2);
                return;
            } else {
                if (z5) {
                    hashMap.put((String) map.get(obj), true);
                    ((zzbqa) zzaVar).zzd("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
        }
        String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcjkVar.getContext(), zzcjkVar.zzI(), Uri.parse(str), zzcjkVar.zzF(), zzcjkVar.zzi(), zzcjkVar.zzQ())).toString() : str;
        if (!z || this.zzf == null || !zzl(zzaVar, zzcjkVar.getContext(), uri, str3)) {
            ((zzckq) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri, (String) map.get("m"), (String) map.get(obj2), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzh), z2);
        } else if (z5) {
            hashMap.put((String) map.get(obj), true);
            ((zzbqa) zzaVar).zzd("openIntentAsync", hashMap);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zzf.zzc(str);
        zzdwf zzdwfVar = this.zzb;
        if (zzdwfVar != null) {
            zzehs.zzc(context, zzdwfVar, this.zzc, this.zzf, str, "dialog_not_shown", zzgad.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        if (com.google.android.gms.internal.ads.zzbnq.zzc(r2, r11, r12, r13, r14) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r21 = r6;
        r10 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2) {
        Intent intent;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzc;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z3 = true;
        zzk(true);
        zzcjk zzcjkVar = (zzcjk) zzaVar;
        Context context = zzcjkVar.getContext();
        zzavi zzI = zzcjkVar.zzI();
        View zzF = zzcjkVar.zzF();
        zzfhl zzQ = zzcjkVar.zzQ();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent2 = null;
        Uri build = null;
        try {
            if (!TextUtils.isEmpty(str2)) {
                Uri zzd = zzd(zzc(context, zzI, Uri.parse(str2), zzF, null, zzQ));
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
                boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
                if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzeu)).booleanValue()) {
                        z3 = false;
                    }
                }
                if ("http".equalsIgnoreCase(zzd.getScheme())) {
                    build = zzd.buildUpon().scheme(TournamentShareDialogURIBuilder.scheme).build();
                } else if (TournamentShareDialogURIBuilder.scheme.equalsIgnoreCase(zzd.getScheme())) {
                    build = zzd.buildUpon().scheme("http").build();
                }
                Uri uri = build;
                ArrayList arrayList = new ArrayList();
                Intent zza = zzbnq.zza(zzd, context, zzI, zzF, zzQ);
                Intent zza2 = zzbnq.zza(uri, context, zzI, zzF, zzQ);
                if (z3) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzo(context, zza);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzo(context, zza2);
                }
                ArrayList arrayList2 = arrayList;
                ResolveInfo zzd2 = zzbnq.zzd(zza, arrayList, context, zzI, zzF, zzQ);
                if (zzd2 == null) {
                    if (zza2 != null && (zzc = zzbnq.zzc(zza2, context, zzI, zzF, zzQ)) != null) {
                        intent = zzbnq.zzb(zza, zzc, context, zzI, zzF, zzQ);
                    }
                    if (!arrayList2.isEmpty()) {
                        if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            int size = arrayList2.size();
                            int i = 0;
                            loop0: while (i < size) {
                                ArrayList arrayList3 = arrayList2;
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList3.get(i);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                do {
                                    int i2 = i + 1;
                                    if (it.hasNext()) {
                                    }
                                } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                                intent2 = zzbnq.zzb(zza, resolveInfo, context, zzI, zzF, zzQ);
                                break loop0;
                            }
                        }
                        ArrayList arrayList4 = arrayList2;
                        if (parseBoolean) {
                            intent2 = zzbnq.zzb(zza, (ResolveInfo) arrayList4.get(0), context, zzI, zzF, zzQ);
                        }
                    }
                    intent = zza;
                    if (z || this.zzf == null || intent == null) {
                        zzaVar2 = zzaVar;
                    } else {
                        zzaVar2 = zzaVar;
                        if (zzl(zzaVar2, zzcjkVar.getContext(), intent.getData().toString(), str)) {
                            return;
                        }
                    }
                    ((zzckq) zzaVar2).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z2);
                    return;
                }
                intent2 = zzbnq.zzb(zza, zzd2, context, zzI, zzF, zzQ);
            }
            ((zzckq) zzaVar2).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z2);
            return;
        } catch (ActivityNotFoundException e) {
            zzcec.zzj(e.getMessage());
            return;
        }
        intent = intent2;
        if (z) {
        }
        zzaVar2 = zzaVar;
    }

    private final void zzk(boolean z) {
        zzbvq zzbvqVar = this.zze;
        if (zzbvqVar != null) {
            zzbvqVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzio)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbgc.zzin)).booleanValue()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        zzdwf zzdwfVar = this.zzb;
        if (zzdwfVar != null) {
            zzehs.zzc(context, zzdwfVar, this.zzc, this.zzf, str2, "offline_open", new HashMap());
        }
        if (com.google.android.gms.ads.internal.zzt.zzo().zzz(context)) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbt zzy = com.google.android.gms.ads.internal.util.zzt.zzy(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean areNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
        boolean zzh = com.google.android.gms.ads.internal.zzt.zzq().zzh(context, "offline_notification_channel");
        zzcjk zzcjkVar = (zzcjk) zzaVar;
        boolean z = zzcjkVar.zzO().zzi() && zzcjkVar.zzi() == null;
        if (!areNotificationsEnabled) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            }
            zzi(context, str2, "notifications_disabled");
            return false;
        }
        if (zzh) {
            zzi(context, str2, "notification_channel_disabled");
            return false;
        }
        if (zzy == null) {
            zzi(context, str2, "work_manager_unavailable");
            return false;
        }
        if (z) {
            zzi(context, str2, "ad_no_activity");
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzil)).booleanValue()) {
            zzi(context, str2, "notification_flow_disabled");
            return false;
        }
        if (zzcjkVar.zzL() == null || zzcjkVar.zzi() == null) {
            ((zzckq) zzaVar).zzaG(str2, str, 14);
        } else {
            zzeht zze = zzehu.zze();
            zze.zza(zzcjkVar.zzi());
            zze.zzb(null);
            zze.zzc(str2);
            zze.zzd(str);
            try {
                zzcjkVar.zzL().zzf(zze.zze());
            } catch (Exception e) {
                zzi(context, str2, e.getMessage());
                return false;
            }
        }
        zzaVar.onAdClicked();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        if (this.zzb == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue()) {
            zzdwe zza = this.zzb.zza();
            zza.zzb("action", "cct_action");
            zza.zzb("cct_open_status", zzbhc.zza(i));
            zza.zzg();
            return;
        }
        zzflw zzflwVar = this.zzc;
        String zza2 = zzbhc.zza(i);
        zzflv zzb = zzflv.zzb("cct_action");
        zzb.zza("cct_open_status", zza2);
        zzflwVar.zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String zzc = zzccj.zzc((String) map.get("u"), ((zzcjk) zzaVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzcec.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            zzgen.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjL)).booleanValue() && this.zzg != null && zzcse.zzh(zzc)) ? this.zzg.zzb(zzc, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgen.zzh(zzc), new zzbnn(this, zzaVar, map, str), this.zzi);
        } else {
            zzbVar.zzb(zzc);
        }
    }
}
