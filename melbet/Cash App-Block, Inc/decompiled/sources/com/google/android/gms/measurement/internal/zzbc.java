package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.fillr.analytics.metrics.AnalyticsMessages;
import com.fillr.analytics.metrics.AnalyticsMessages$Worker$AnalyticsMessageHandler;
import com.fillr.analytics.util.Base64Coder;
import com.fillr.analytics.util.HttpService;
import com.fillr.analytics.util.RemoteService$ServiceUnavailableException;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.fillr.e0;
import com.fillr.n;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.measurement.internal.zzbc;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzbc {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;
    public Object zzb;
    public Object zzc;
    public long zzd;
    public long zze;
    public long zzf;
    public final Object zzg;

    /* renamed from: -$$Nest$mupdateFlushFrequency, reason: not valid java name */
    public static void m2030$$Nest$mupdateFlushFrequency(zzbc zzbcVar) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = zzbcVar.zzd;
        long j2 = 1 + j;
        long j3 = zzbcVar.zzf;
        if (j3 > 0) {
            zzbcVar.zze = ((zzbcVar.zze * j) + (currentTimeMillis - j3)) / j2;
            AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel((AnalyticsMessages) zzbcVar.zzg);
        }
        zzbcVar.zzf = currentTimeMillis;
        zzbcVar.zzd = j2;
    }

    public zzbc(zzic zzicVar, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        zzbf zzbfVar;
        this.$r8$classId = 0;
        zzae.checkNotEmpty(str2);
        zzae.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        if (j3 != 0 && j3 > j) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(zzgu.zzl(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zza("Param name can't be null");
                    it.remove();
                } else {
                    zzpp zzppVar = zzicVar.zzl;
                    zzic.zzN(zzppVar);
                    Object zzG = zzppVar.zzG(bundle2.get(next), next);
                    if (zzG == null) {
                        zzgu zzguVar3 = zzicVar.zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzg.zzb(zzicVar.zzm.zzb(next), "Param value can't be null");
                        it.remove();
                    } else {
                        zzpp zzppVar2 = zzicVar.zzl;
                        zzic.zzN(zzppVar2);
                        zzppVar2.zzO(bundle2, next, zzG);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.zzg = zzbfVar;
    }

    public void runMessage(Message message) {
        synchronized (this.zza) {
            try {
                AnalyticsMessages$Worker$AnalyticsMessageHandler analyticsMessages$Worker$AnalyticsMessageHandler = (AnalyticsMessages$Worker$AnalyticsMessageHandler) this.zzb;
                if (analyticsMessages$Worker$AnalyticsMessageHandler == null) {
                    AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel((AnalyticsMessages) this.zzg);
                } else {
                    analyticsMessages$Worker$AnalyticsMessageHandler.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                String zzbfVar = ((zzbf) this.zzg).toString();
                String str = (String) this.zza;
                int length = String.valueOf(str).length();
                String str2 = (String) this.zzb;
                StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + zzbfVar.length() + 1);
                Boxes$$ExternalSyntheticOutline1.m(sb, "Event{appId='", str, "', name='", str2);
                return Recorder$$ExternalSyntheticOutline2.m(sb, "', params=", zzbfVar, "}");
            default:
                return super.toString();
        }
    }

    public zzbc zza(zzic zzicVar, long j) {
        return new zzbc(zzicVar, (String) this.zzc, (String) this.zza, (String) this.zzb, this.zzd, this.zze, j, (zzbf) this.zzg);
    }

    public zzbc(zzic zzicVar, String str, String str2, String str3, long j, long j2, long j3, zzbf zzbfVar) {
        this.$r8$classId = 0;
        zzae.checkNotEmpty(str2);
        zzae.checkNotEmpty(str3);
        zzae.checkNotNull(zzbfVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        if (j3 != 0 && j3 > j) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzc("Event created with reverse previous/current timestamps. appId, name", zzgu.zzl(str2), zzgu.zzl(str3));
        }
        this.zzg = zzbfVar;
    }

    public zzbc(AnalyticsMessages analyticsMessages) {
        this.$r8$classId = 1;
        this.zzg = analyticsMessages;
        this.zza = new Object();
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = -1L;
        HandlerThread handlerThread = new HandlerThread("com.fillr.analytics.AnalyticsWorker", 1);
        handlerThread.start();
        final Looper looper = handlerThread.getLooper();
        this.zzb = new Handler(looper) { // from class: com.fillr.analytics.metrics.AnalyticsMessages$Worker$AnalyticsMessageHandler
            public n.b mDbAdapter = null;
            public final boolean mDisableFallback;
            public int mFailedRetries;
            public final long mFlushInterval;
            public long mTrackEngageRetryAfter;

            {
                AnalyticsMessages analyticsMessages2 = (AnalyticsMessages) zzbc.this.zzg;
                zzbc.this.zzc = new e0(analyticsMessages2.mContext);
                this.mDisableFallback = analyticsMessages2.mConfig.mDisableFallback;
                this.mFlushInterval = r3.mFlushInterval;
            }

            /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void handleMessage(Message message) {
                int i;
                int i2;
                if (this.mDbAdapter == null) {
                    n.b bVar = new n.b(((AnalyticsMessages) zzbc.this.zzg).mContext);
                    this.mDbAdapter = bVar;
                    bVar.cleanupEvents(1, System.currentTimeMillis() - ((AnalyticsMessages) zzbc.this.zzg).mConfig.mDataExpiration);
                    this.mDbAdapter.cleanupEvents(2, System.currentTimeMillis() - ((AnalyticsMessages) zzbc.this.zzg).mConfig.mDataExpiration);
                }
                try {
                    i = message.what;
                } catch (RuntimeException unused) {
                    synchronized (zzbc.this.zza) {
                    }
                }
                if (i != 0) {
                    if (i == 1) {
                        AnalyticsMessages.EventDescription eventDescription = (AnalyticsMessages.EventDescription) message.obj;
                        try {
                            JSONObject prepareEventObject = prepareEventObject(eventDescription);
                            AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel((AnalyticsMessages) zzbc.this.zzg);
                            AnalyticsMessages analyticsMessages2 = (AnalyticsMessages) zzbc.this.zzg;
                            prepareEventObject.toString();
                            AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel(analyticsMessages2);
                            i2 = this.mDbAdapter.addJSON(prepareEventObject, 1);
                        } catch (JSONException unused2) {
                            String str = eventDescription.eventName;
                        }
                    } else {
                        if (i == 2) {
                            AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel((AnalyticsMessages) zzbc.this.zzg);
                            zzbc.m2030$$Nest$mupdateFlushFrequency(zzbc.this);
                            sendAllData(this.mDbAdapter);
                        } else if (i == 5) {
                            Thread.currentThread().getId();
                            synchronized (zzbc.this.zza) {
                                MPDbAdapter$MPDatabaseHelper mPDbAdapter$MPDatabaseHelper = (MPDbAdapter$MPDatabaseHelper) this.mDbAdapter.b;
                                mPDbAdapter$MPDatabaseHelper.close();
                                mPDbAdapter$MPDatabaseHelper.mDatabaseFile.delete();
                                zzbc.this.zzb = null;
                                Looper.myLooper().quit();
                            }
                        } else {
                            message.toString();
                        }
                        i2 = -3;
                    }
                    synchronized (zzbc.this.zza) {
                        zzbc.this.zzb = null;
                        try {
                            Looper.myLooper().quit();
                        } catch (Exception unused3) {
                        }
                        return;
                    }
                }
                JSONObject jSONObject = (JSONObject) message.obj;
                AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel((AnalyticsMessages) zzbc.this.zzg);
                AnalyticsMessages analyticsMessages3 = (AnalyticsMessages) zzbc.this.zzg;
                jSONObject.toString();
                AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel(analyticsMessages3);
                i2 = this.mDbAdapter.addJSON(jSONObject, 2);
                AnalyticsMessages analyticsMessages4 = (AnalyticsMessages) zzbc.this.zzg;
                if ((i2 >= analyticsMessages4.mConfig.mBulkUploadLimit || i2 == -2) && this.mFailedRetries <= 0) {
                    AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel(analyticsMessages4);
                    zzbc.m2030$$Nest$mupdateFlushFrequency(zzbc.this);
                    sendAllData(this.mDbAdapter);
                } else {
                    if (i2 <= 0 || hasMessages(2)) {
                        return;
                    }
                    AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel((AnalyticsMessages) zzbc.this.zzg);
                    long j = this.mFlushInterval;
                    if (j >= 0) {
                        sendEmptyMessageDelayed(2, j);
                    }
                }
            }

            /* JADX WARN: Can't wrap try/catch for region: R(47:0|1|(1:3)|4|(1:6)|7|(1:9)|10|(1:12)|13|(1:15)|16|(1:18)|19|(1:21)(1:98)|(1:23)|24|(3:26|(1:96)(1:32)|33)(1:97)|(1:35)|36|(2:37|38)|(25:40|(1:42)|43|(1:45)(2:89|(1:91)(1:92))|46|(1:48)|49|(1:51)|52|(1:54)|55|56|57|(3:78|(3:81|(2:83|84)(1:86)|79)|87)|59|(1:61)|62|63|64|(1:66)|67|(2:70|68)|71|72|73)|94|(0)|43|(0)(0)|46|(0)|49|(0)|52|(0)|55|56|57|(0)|59|(0)|62|63|64|(0)|67|(1:68)|71|72|73) */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0239, code lost:
            
                r10 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x023a, code lost:
            
                r10.getMessage();
             */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x017b  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0210  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x023f  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0256 A[LOOP:0: B:68:0x0250->B:70:0x0256, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01d6 A[Catch: Exception -> 0x01d4, TryCatch #1 {Exception -> 0x01d4, blocks: (B:57:0x01b3, B:78:0x01d6, B:79:0x01de, B:81:0x01e4, B:84:0x01fb), top: B:56:0x01b3 }] */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final JSONObject prepareEventObject(AnalyticsMessages.EventDescription eventDescription) {
                Boolean bool;
                Boolean bool2;
                String locale;
                String displayLanguage;
                String country;
                String str;
                Iterator<String> keys;
                Map map;
                BluetoothAdapter defaultAdapter;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = eventDescription.properties;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("mp_lib", "android");
                jSONObject3.put("$lib_version", "11.2.0");
                jSONObject3.put("$os", "Android");
                String str2 = Build.VERSION.RELEASE;
                if (str2 == null) {
                    str2 = "UNKNOWN";
                }
                jSONObject3.put("$os_version", str2);
                String str3 = Build.MANUFACTURER;
                if (str3 == null) {
                    str3 = "UNKNOWN";
                }
                jSONObject3.put("$manufacturer", str3);
                String str4 = Build.BRAND;
                if (str4 == null) {
                    str4 = "UNKNOWN";
                }
                jSONObject3.put("$brand", str4);
                String str5 = Build.MODEL;
                if (str5 == null) {
                    str5 = "UNKNOWN";
                }
                jSONObject3.put("$model", str5);
                jSONObject3.put("$google_play_services", "UNKNOWN");
                zzbc zzbcVar = zzbc.this;
                DisplayMetrics displayMetrics = (DisplayMetrics) ((e0) zzbcVar.zzc).i;
                jSONObject3.put("$screen_dpi", displayMetrics.densityDpi);
                jSONObject3.put("$screen_height", displayMetrics.heightPixels);
                jSONObject3.put("$screen_width", displayMetrics.widthPixels);
                String str6 = (String) ((e0) zzbcVar.zzc).f;
                if (str6 != null) {
                    jSONObject3.put("$app_version", str6);
                    jSONObject3.put("$app_version_string", str6);
                }
                Integer num = (Integer) ((e0) zzbcVar.zzc).h;
                if (num != null) {
                    jSONObject3.put("$app_release", num);
                    jSONObject3.put("$app_build_number", num);
                }
                Boolean bool3 = (Boolean) ((e0) zzbcVar.zzc).b;
                bool3.getClass();
                jSONObject3.put("$has_nfc", bool3.booleanValue());
                Boolean bool4 = (Boolean) ((e0) zzbcVar.zzc).c;
                bool4.getClass();
                jSONObject3.put("$has_telephone", bool4.booleanValue());
                TelephonyManager telephonyManager = (TelephonyManager) ((Context) ((e0) zzbcVar.zzc).a).getSystemService("phone");
                String str7 = null;
                String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
                if (networkOperatorName != null) {
                    jSONObject3.put("$carrier", networkOperatorName);
                }
                Context context = (Context) ((e0) zzbcVar.zzc).a;
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    bool = Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected());
                } else {
                    bool = null;
                }
                if (bool != null) {
                    jSONObject3.put("$wifi", bool.booleanValue());
                }
                ((e0) zzbcVar.zzc).getClass();
                try {
                    defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                } catch (NoClassDefFoundError | SecurityException unused) {
                }
                if (defaultAdapter != null) {
                    bool2 = Boolean.valueOf(defaultAdapter.isEnabled());
                    if (bool2 != null) {
                        jSONObject3.put("$bluetooth_enabled", bool2);
                    }
                    Context context2 = (Context) ((e0) zzbcVar.zzc).a;
                    jSONObject3.put("$bluetooth_version", !context2.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") ? "ble" : context2.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "classic" : "none");
                    ((e0) zzbcVar.zzc).getClass();
                    locale = Locale.getDefault().toString();
                    if (locale != null) {
                        jSONObject3.put("$locale", locale);
                    }
                    ((e0) zzbcVar.zzc).getClass();
                    displayLanguage = Locale.getDefault().getDisplayLanguage();
                    if (displayLanguage != null) {
                        jSONObject3.put("$language", displayLanguage);
                    }
                    ((e0) zzbcVar.zzc).getClass();
                    country = Locale.getDefault().getCountry();
                    if (country != null) {
                        jSONObject3.put("$country", country);
                    }
                    ((e0) zzbcVar.zzc).getClass();
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object invoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
                    Field declaredField = cls.getDeclaredField("mActivities");
                    declaredField.setAccessible(true);
                    map = (Map) declaredField.get(invoke);
                    if (map != null) {
                        for (Object obj : map.values()) {
                            Class<?> cls2 = obj.getClass();
                            Field declaredField2 = cls2.getDeclaredField("paused");
                            declaredField2.setAccessible(true);
                            if (!declaredField2.getBoolean(obj)) {
                                Field declaredField3 = cls2.getDeclaredField("activity");
                                declaredField3.setAccessible(true);
                                str = ((Activity) declaredField3.get(obj)).getLocalClassName();
                                break;
                            }
                        }
                    }
                    str = null;
                    if (str != null) {
                        jSONObject3.put("$activity", str);
                    }
                    ((e0) zzbcVar.zzc).getClass();
                    jSONObject3.put("$debug_build", false);
                    e0 e0Var = (e0) zzbcVar.zzc;
                    Context context3 = ((AnalyticsMessages) zzbcVar.zzg).mContext;
                    e0Var.getClass();
                    str7 = Settings.Secure.getString(context3.getContentResolver(), "android_id");
                    if (str7 != null) {
                        jSONObject3.put("$android_id", str7);
                    }
                    jSONObject3.put("token", eventDescription.token);
                    keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject3.put(next, jSONObject2.get(next));
                    }
                    jSONObject.put(BreadcrumbHelper.Category.EVENT, eventDescription.eventName);
                    jSONObject.put("properties", jSONObject3);
                    return jSONObject;
                }
                bool2 = null;
                if (bool2 != null) {
                }
                Context context22 = (Context) ((e0) zzbcVar.zzc).a;
                jSONObject3.put("$bluetooth_version", !context22.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") ? "ble" : context22.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "classic" : "none");
                ((e0) zzbcVar.zzc).getClass();
                locale = Locale.getDefault().toString();
                if (locale != null) {
                }
                ((e0) zzbcVar.zzc).getClass();
                displayLanguage = Locale.getDefault().getDisplayLanguage();
                if (displayLanguage != null) {
                }
                ((e0) zzbcVar.zzc).getClass();
                country = Locale.getDefault().getCountry();
                if (country != null) {
                }
                ((e0) zzbcVar.zzc).getClass();
                Class<?> cls3 = Class.forName("android.app.ActivityThread");
                Object invoke2 = cls3.getMethod("currentActivityThread", null).invoke(null, null);
                Field declaredField4 = cls3.getDeclaredField("mActivities");
                declaredField4.setAccessible(true);
                map = (Map) declaredField4.get(invoke2);
                if (map != null) {
                }
                str = null;
                if (str != null) {
                }
                ((e0) zzbcVar.zzc).getClass();
                jSONObject3.put("$debug_build", false);
                e0 e0Var2 = (e0) zzbcVar.zzc;
                Context context32 = ((AnalyticsMessages) zzbcVar.zzg).mContext;
                e0Var2.getClass();
                str7 = Settings.Secure.getString(context32.getContentResolver(), "android_id");
                if (str7 != null) {
                }
                jSONObject3.put("token", eventDescription.token);
                keys = jSONObject2.keys();
                while (keys.hasNext()) {
                }
                jSONObject.put(BreadcrumbHelper.Category.EVENT, eventDescription.eventName);
                jSONObject.put("properties", jSONObject3);
                return jSONObject;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
            
                if (r0.isConnectedOrConnecting() != false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void sendAllData(n.b bVar) {
                AnalyticsMessages analyticsMessages2 = (AnalyticsMessages) zzbc.this.zzg;
                Context context = analyticsMessages2.mContext;
                synchronized (analyticsMessages2.mConfig) {
                }
                if (!HttpService.sIsMixpanelBlocked) {
                    try {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                        }
                    } catch (SecurityException unused) {
                    }
                }
                AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel((AnalyticsMessages) zzbc.this.zzg);
                return;
                boolean z = this.mDisableFallback;
                AnalyticsMessages analyticsMessages3 = (AnalyticsMessages) zzbc.this.zzg;
                if (z) {
                    sendData(bVar, 1, new String[]{analyticsMessages3.mConfig.mEventsEndpoint});
                    sendData(bVar, 2, new String[]{((AnalyticsMessages) zzbc.this.zzg).mConfig.mPeopleEndpoint});
                } else {
                    FAConfig fAConfig = analyticsMessages3.mConfig;
                    sendData(bVar, 1, new String[]{fAConfig.mEventsEndpoint, fAConfig.mEventsFallbackEndpoint});
                    FAConfig fAConfig2 = ((AnalyticsMessages) zzbc.this.zzg).mConfig;
                    sendData(bVar, 2, new String[]{fAConfig2.mPeopleEndpoint, fAConfig2.mPeopleFallbackEndpoint});
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void sendData(n.b bVar, int i, String[] strArr) {
                String str;
                boolean z;
                int i2;
                int i3;
                int i4;
                int i5;
                AnalyticsMessages analyticsMessages2 = (AnalyticsMessages) zzbc.this.zzg;
                String[] generateDataString = bVar.generateDataString(i);
                int i6 = 2;
                Integer valueOf = generateDataString != null ? Integer.valueOf(generateDataString[2]) : 0;
                while (generateDataString != null && valueOf.intValue() > 0) {
                    str = generateDataString[0];
                    boolean z2 = true;
                    String str2 = generateDataString[1];
                    char[] cArr = Base64Coder.map1;
                    byte[] bytes = str2.getBytes();
                    int length = bytes.length;
                    char c = 4;
                    int m = Recorder$$ExternalSyntheticOutline1.m(length, 4, i6, 3);
                    char[] cArr2 = new char[((length + 2) / 3) * 4];
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        boolean z3 = z2;
                        int i9 = i7 + 1;
                        char c2 = c;
                        byte b = bytes[i7];
                        int i10 = i6;
                        int i11 = b & 255;
                        if (i9 < length) {
                            i2 = i7 + 2;
                            i3 = bytes[i9] & 255;
                        } else {
                            i2 = i9;
                            i3 = 0;
                        }
                        if (i2 < length) {
                            i4 = i2 + 1;
                            i5 = bytes[i2] & 255;
                        } else {
                            i4 = i2;
                            i5 = 0;
                        }
                        int i12 = ((b & 3) << 4) | (i3 >>> 4);
                        int i13 = ((i3 & 15) << 2) | (i5 >>> 6);
                        int i14 = i5 & 63;
                        char[] cArr3 = Base64Coder.map1;
                        cArr2[i8] = cArr3[i11 >>> 2];
                        int i15 = i8 + 2;
                        cArr2[i8 + 1] = cArr3[i12];
                        char c3 = '=';
                        cArr2[i15] = i15 < m ? cArr3[i13] : '=';
                        int i16 = i8 + 3;
                        if (i16 < m) {
                            c3 = cArr3[i14];
                        }
                        cArr2[i16] = c3;
                        i8 += 4;
                        z2 = z3;
                        c = c2;
                        i6 = i10;
                        i7 = i4;
                    }
                    int i17 = i6;
                    boolean z4 = z2;
                    String str3 = new String(cArr2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", str3);
                    if (FAConfig.DEBUG) {
                        hashMap.put("verbose", "1");
                    }
                    int length2 = strArr.length;
                    int i18 = 0;
                    z = z4;
                    while (true) {
                        if (i18 >= length2) {
                            break;
                        }
                        try {
                            try {
                                byte[] performRequest = HttpService.performRequest(strArr[i18], hashMap, analyticsMessages2.mConfig.getSSLSocketFactory());
                                if (performRequest == null) {
                                    try {
                                        AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel(analyticsMessages2);
                                    } catch (OutOfMemoryError | MalformedURLException unused) {
                                    }
                                    z = false;
                                } else {
                                    try {
                                        try {
                                            new String(performRequest, "UTF-8");
                                            if (this.mFailedRetries > 0) {
                                                this.mFailedRetries = 0;
                                                removeMessages(i17);
                                            }
                                            AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel(analyticsMessages2);
                                            AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel(analyticsMessages2);
                                        } catch (UnsupportedEncodingException e) {
                                            throw new RuntimeException("UTF not supported on this platform?", e);
                                        }
                                    } catch (OutOfMemoryError | MalformedURLException unused2) {
                                    }
                                    z = z4;
                                }
                            } catch (OutOfMemoryError | MalformedURLException unused3) {
                            }
                        } catch (RemoteService$ServiceUnavailableException e2) {
                            HashMap hashMap2 = AnalyticsMessages.sInstances;
                            Thread.currentThread().getId();
                            this.mTrackEngageRetryAfter = e2.mRetryAfter * 1000;
                        } catch (SocketTimeoutException unused4) {
                            HashMap hashMap3 = AnalyticsMessages.sInstances;
                            Thread.currentThread().getId();
                        } catch (IOException unused5) {
                            HashMap hashMap4 = AnalyticsMessages.sInstances;
                            Thread.currentThread().getId();
                        }
                        i18++;
                        z = false;
                        i17 = 2;
                    }
                }
                return;
                generateDataString = bVar.generateDataString(i);
                if (generateDataString == null) {
                    valueOf = Integer.valueOf(generateDataString[2]);
                }
                i6 = 2;
                if (!z) {
                    removeMessages(2);
                    long max = Math.max(((long) Math.pow(2.0d, this.mFailedRetries)) * 60000, this.mTrackEngageRetryAfter);
                    this.mTrackEngageRetryAfter = max;
                    long min = Math.min(max, 600000L);
                    this.mTrackEngageRetryAfter = min;
                    sendEmptyMessageDelayed(2, min);
                    this.mFailedRetries++;
                    AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel(analyticsMessages2);
                    return;
                }
                AnalyticsMessages.m1934$$Nest$mlogAboutMessageToMixpanel(analyticsMessages2);
                MPDbAdapter$MPDatabaseHelper mPDbAdapter$MPDatabaseHelper = (MPDbAdapter$MPDatabaseHelper) bVar.b;
                String mTableName = FillrEnv$EnumUnboxingLocalUtility.getMTableName(i);
                try {
                    try {
                        mPDbAdapter$MPDatabaseHelper.getWritableDatabase().delete(mTableName, "_id <= " + str, null);
                    } catch (SQLiteException unused6) {
                        mPDbAdapter$MPDatabaseHelper.close();
                        mPDbAdapter$MPDatabaseHelper.mDatabaseFile.delete();
                    }
                    generateDataString = bVar.generateDataString(i);
                    if (generateDataString == null) {
                    }
                    i6 = 2;
                } finally {
                    mPDbAdapter$MPDatabaseHelper.close();
                }
            }
        };
    }
}
