package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcs;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class zzpp extends zzjf {
    public static final String[] zzb = {"firebase_", "google_", "ga_"};
    public static final String[] zzc = {"_err"};
    public SecureRandom zzd;
    public final AtomicLong zze;
    public int zzf;
    public MeasurementManagerFutures$Api33Ext5JavaImpl zzg;
    public Boolean zzh;
    public Integer zzi;

    public zzpp(zzic zzicVar) {
        super(zzicVar);
        this.zzi = null;
        this.zze = new AtomicLong(0L);
    }

    public static String zzE(String str, int i, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
            }
        }
        return null;
    }

    public static void zzP(zzpo zzpoVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zzaA(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        zzpoVar.zza(str, "_err", bundle);
    }

    public static MessageDigest zzQ() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long zzR(byte[] bArr) {
        zzae.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        zzae.checkState(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean zzT(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static int zzW() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static final boolean zzaA(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean zzaD(String str, String[] strArr) {
        zzae.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzaE(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(Marker.ANY_MARKER) || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean zzac(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] zzah(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList zzav(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.zza);
            bundle.putString("origin", zzahVar.zzb);
            bundle.putLong("creation_timestamp", zzahVar.zzd);
            bundle.putString("name", zzahVar.zzc.zzb);
            Object zza = zzahVar.zzc.zza();
            zzae.checkNotNull(zza);
            zzjm.zza(bundle, zza);
            bundle.putBoolean("active", zzahVar.zze);
            String str = zzahVar.zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbhVar = zzahVar.zzg;
            if (zzbhVar != null) {
                bundle.putString("timed_out_event_name", zzbhVar.zza);
                zzbf zzbfVar = zzbhVar.zzb;
                if (zzbfVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbfVar.zzf());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.zzh);
            zzbh zzbhVar2 = zzahVar.zzi;
            if (zzbhVar2 != null) {
                bundle.putString("triggered_event_name", zzbhVar2.zza);
                zzbf zzbfVar2 = zzbhVar2.zzb;
                if (zzbfVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbfVar2.zzf());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.zzc.zzc);
            bundle.putLong("time_to_live", zzahVar.zzj);
            zzbh zzbhVar3 = zzahVar.zzk;
            if (zzbhVar3 != null) {
                bundle.putString("expired_event_name", zzbhVar3.zza);
                zzbf zzbfVar3 = zzbhVar3.zzb;
                if (zzbfVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbfVar3.zzf());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean zzax(Context context) {
        ActivityInfo receiverInfo;
        zzae.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void zzay(zzlu zzluVar, Bundle bundle, boolean z) {
        if (bundle != null && zzluVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzluVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzluVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzluVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzluVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzh(String str) {
        zzae.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzj(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static boolean zzz(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean zzA(String str, int i, String str2, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) <= i) {
            return true;
        }
        zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzi.zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
        return false;
    }

    public final void zzB(String str, String str2, Bundle bundle, List list, boolean z) {
        int zzt;
        int zzF;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzal zzalVar = zzicVar.zzg;
        zzgu zzguVar = zzicVar.zzi;
        zzgn zzgnVar = zzicVar.zzm;
        zzpp zzppVar = ((zzic) zzalVar.$$delegate_0).zzl;
        zzic.zzN(zzppVar);
        int i = true != zzppVar.zzaj(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list2 == null || !list2.contains(str3)) {
                zzt = !z ? zzt(str3) : 0;
                if (zzt == 0) {
                    zzt = zzu(str3);
                }
            } else {
                zzt = 0;
            }
            if (zzt != 0) {
                zzL(bundle, zzt, str3, zzt == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (zzz(bundle.get(str3))) {
                    zzic.zzP(zzguVar);
                    zzguVar.zzi.zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    zzF = 22;
                } else {
                    zzF = zzF(str, str3, bundle.get(str3), bundle, list2, z, false);
                }
                if (zzF != 0 && !"_ev".equals(str3)) {
                    zzL(bundle, zzF, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (zzh(str3) && !zzaD(str3, zzjm.zzd$1)) {
                    i2++;
                    if (!zzaj(231100000)) {
                        zzic.zzP(zzguVar);
                        zzguVar.zzf.zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzgnVar.zza(str), zzgnVar.zze(bundle));
                        zzaA(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            zzic.zzP(zzguVar);
                            zzguVar.zzf.zzc(re$$ExternalSyntheticOutline0.m(i, "Item can't contain more than ", " item-scoped custom params", new StringBuilder(String.valueOf(i).length() + 55)), zzgnVar.zza(str), zzgnVar.zze(bundle));
                        }
                        zzaA(28, bundle);
                        bundle.remove(str3);
                        list2 = list;
                        z2 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean zzC(String str) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (TextUtils.isEmpty(str)) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzf.zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        zzae.checkNotNull(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        zzgu zzguVar2 = zzicVar.zzi;
        zzic.zzP(zzguVar2);
        zzguVar2.zzf.zzb(zzgu.zzl(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzF(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        int i3 = 0;
        if (zzz(obj)) {
            if (!z2) {
                return 21;
            }
            if (!zzaD(str2, zzjm.zzc$1)) {
                return 20;
            }
            zznl zzt = zzicVar.zzt();
            zzt.zzg();
            zzt.zzb$1();
            if (zzt.zzK()) {
                zzpp zzppVar = ((zzic) zzt.$$delegate_0).zzl;
                zzic.zzN(zzppVar);
                if (zzppVar.zzak() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzi.zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i2 = 500;
                if (!zzac(str) || zzac(str2)) {
                    zzicVar.zzg.getClass();
                    i2 = Math.max(500, 256);
                } else {
                    zzicVar.zzg.getClass();
                }
                if (!zzA("param", i2, str2, obj)) {
                    if (!z2) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        zzB(str, str2, (Bundle) obj, list, z);
                        return i;
                    }
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i3 < length) {
                            Parcelable parcelable = parcelableArr2[i3];
                            if (!(parcelable instanceof Bundle)) {
                                zzgu zzguVar2 = zzicVar.zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzi.zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                                return 4;
                            }
                            zzB(str, str2, (Bundle) parcelable, list, z);
                            i3++;
                        }
                    } else {
                        if (!(obj instanceof ArrayList)) {
                            return 4;
                        }
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            if (!(obj2 instanceof Bundle)) {
                                zzgu zzguVar3 = zzicVar.zzi;
                                zzic.zzP(zzguVar3);
                                zzguVar3.zzi.zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                                return 4;
                            }
                            zzB(str, str2, (Bundle) obj2, list, z);
                            i3++;
                        }
                    }
                }
                return i;
            }
        }
        i = 0;
        i2 = 500;
        if (zzac(str)) {
        }
        zzicVar.zzg.getClass();
        i2 = Math.max(500, 256);
        if (!zzA("param", i2, str2, obj)) {
        }
        return i;
    }

    public final Object zzG(Object obj, String str) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        int i = 500;
        if ("_ev".equals(str)) {
            zzicVar.zzg.getClass();
            return zzaB(Math.max(500, 256), obj, true, true);
        }
        if (zzac(str)) {
            zzicVar.zzg.getClass();
            i = Math.max(500, 256);
        } else {
            zzicVar.zzg.getClass();
        }
        return zzaB(i, obj, false, true);
    }

    public final Bundle zzH(String str, Bundle bundle, List list, boolean z) {
        int zzt;
        List list2 = list;
        boolean zzaD = zzaD(str, zzjm.zzg);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzal zzalVar = zzicVar.zzg;
        zzgn zzgnVar = zzicVar.zzm;
        zzpp zzppVar = ((zzic) zzalVar.$$delegate_0).zzl;
        zzic.zzN(zzppVar);
        int i = zzppVar.zzaj(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                zzt = !z ? zzt(str2) : 0;
                if (zzt == 0) {
                    zzt = zzu(str2);
                }
            } else {
                zzt = 0;
            }
            if (zzt != 0) {
                zzL(bundle2, zzt, str2, zzt == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int zzF = zzF(str, str2, bundle.get(str2), bundle2, list2, z, zzaD);
                if (zzF == 17) {
                    zzL(bundle2, 17, str2, Boolean.FALSE);
                } else if (zzF != 0 && !"_ev".equals(str2)) {
                    zzL(bundle2, zzF, zzF == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (zzh(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            String m = re$$ExternalSyntheticOutline0.m(i, "Event can't contain more than ", " params", new StringBuilder(String.valueOf(i).length() + 37));
                            zzgu zzguVar = zzicVar.zzi;
                            zzic.zzP(zzguVar);
                            zzguVar.zzf.zzc(m, zzgnVar.zza(str), zzgnVar.zze(bundle));
                        }
                        zzaA(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                    list2 = list;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final void zzI(zzgv zzgvVar, int i) {
        Bundle bundle = zzgvVar.zze;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (zzh(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    String m = re$$ExternalSyntheticOutline0.m(i, "Event can't contain more than ", " params", new StringBuilder(String.valueOf(i).length() + 37));
                    zzic zzicVar = (zzic) this.$$delegate_0;
                    zzgu zzguVar = zzicVar.zzi;
                    zzgn zzgnVar = zzicVar.zzm;
                    zzic.zzP(zzguVar);
                    zzguVar.zzf.zzc(m, zzgnVar.zza(zzgvVar.zza), zzgnVar.zze(bundle));
                    zzaA(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void zzJ(Parcelable[] parcelableArr, int i) {
        zzae.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (zzh(str) && !zzaD(str, zzjm.zzd$1) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        zzic zzicVar = (zzic) this.$$delegate_0;
                        zzgu zzguVar = zzicVar.zzi;
                        zzgn zzgnVar = zzicVar.zzm;
                        zzic.zzP(zzguVar);
                        zzguVar.zzf.zzc(re$$ExternalSyntheticOutline0.m(i, "Param can't contain more than ", " item-scoped custom parameters", new StringBuilder(String.valueOf(i).length() + 60)), zzgnVar.zzb(str), zzgnVar.zze(bundle));
                    }
                    zzaA(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void zzK(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                zzpp zzppVar = ((zzic) this.$$delegate_0).zzl;
                zzic.zzN(zzppVar);
                zzppVar.zzO(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzL(Bundle bundle, int i, String str, Object obj) {
        if (zzaA(i, bundle)) {
            ((zzic) this.$$delegate_0).getClass();
            bundle.putString("_ev", zzE(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int zzM(Object obj, String str) {
        return "_ldl".equals(str) ? zzA("user property referrer", zzaC(str), str, obj) : zzA("user property", zzaC(str), str, obj) ? 0 : 7;
    }

    public final Object zzN(Object obj, String str) {
        return "_ldl".equals(str) ? zzaB(zzaC(str), obj, true, false) : zzaB(zzaC(str), obj, false, false);
    }

    public final void zzO(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzic zzicVar = (zzic) this.$$delegate_0;
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzi.zzc("Not putting event parameter. Invalid value type. name, type", zzicVar.zzm.zzb(str), simpleName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzX() {
        boolean booleanValue;
        Object e;
        Integer num;
        zzg();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzgi zzv = zzicVar.zzv();
        zzgu zzguVar = zzicVar.zzi;
        Integer num2 = null;
        if (!zzaE((String) zzfy.zzaq.zzb(null), zzv.zzj())) {
            return 0L;
        }
        long j = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : zzW() < ((Integer) zzfy.zzak.zzb(null)).intValue() ? 16L : 0L;
        if (!zzab("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.zzh == null) {
                if (this.zzg == null) {
                    this.zzg = MeasurementManagerFutures$Api33Ext5JavaImpl.from(zzicVar.zzd);
                }
                MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl = this.zzg;
                booleanValue = false;
                if (measurementManagerFutures$Api33Ext5JavaImpl != null) {
                    try {
                        num = (Integer) measurementManagerFutures$Api33Ext5JavaImpl.getMeasurementApiStatusAsync().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    booleanValue = true;
                                }
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                                e = e2;
                                num2 = num;
                                zzic.zzP(zzguVar);
                                zzguVar.zzg.zzb(e, "Measurement manager api exception");
                                this.zzh = Boolean.FALSE;
                                num = num2;
                                zzic.zzP(zzguVar);
                                zzguVar.zzl.zzb(num, "Measurement manager api status result");
                                booleanValue = this.zzh.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j != 0) {
                                }
                            }
                        }
                        this.zzh = Boolean.valueOf(booleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e3) {
                        e = e3;
                    }
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zzb(num, "Measurement manager api status result");
                }
                if (!booleanValue) {
                    j = 64;
                }
            }
            booleanValue = this.zzh.booleanValue();
            if (!booleanValue) {
            }
        }
        if (j != 0) {
            return 1L;
        }
        return j;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return true;
    }

    public final Object zzaB(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzE(obj.toString(), i, z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle zzae = zzae((Bundle) parcelable);
                if (!zzae.isEmpty()) {
                    arrayList.add(zzae);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int zzaC(String str) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if ("_ldl".equals(str)) {
            zzicVar.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            zzicVar.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            zzicVar.getClass();
            return 100;
        }
        zzicVar.getClass();
        return 36;
    }

    public final boolean zzab(String str) {
        zzg();
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (Wrappers.packageManager(zzicVar.zzd).ctx.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzk.zzb(str, "Permission not granted");
        return false;
    }

    public final boolean zzad(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((zzic) this.$$delegate_0).zzg.zzK("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle zzae(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzG = zzG(bundle.get(str), str);
                if (zzG == null) {
                    zzic zzicVar = (zzic) this.$$delegate_0;
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzi.zzb(zzicVar.zzm.zzb(str), "Param value can't be null");
                } else {
                    zzO(bundle2, str, zzG);
                }
            }
        }
        return bundle2;
    }

    public final zzbh zzaf(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (zzp(str) != 0) {
            zzic zzicVar = (zzic) this.$$delegate_0;
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(zzicVar.zzm.zzc(str), "Invalid conditional property event name");
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle zzH = zzH(str, bundle2, Hex.listOf(), true);
        if (z) {
            zzH = zzae(zzH);
        }
        zzae.checkNotNull(zzH);
        return new zzbh(str, new zzbf(zzH), str2, j, j2);
    }

    public final boolean zzag(Context context, String str) {
        Signature[] signatureArr;
        zzic zzicVar = (zzic) this.$$delegate_0;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(64, str);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean zzaj(int i) {
        Boolean bool = ((zzic) this.$$delegate_0).zzt().zzc;
        if (zzak() < i / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int zzak() {
        if (this.zzi == null) {
            zzic zzicVar = (zzic) this.$$delegate_0;
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.zza;
            Context context = zzicVar.zzd;
            googleApiAvailabilityLight.getClass();
            this.zzi = Integer.valueOf(GoogleApiAvailabilityLight.getApkVersion(context) / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
        }
        return this.zzi.intValue();
    }

    public final void zzan(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void zzao(String str, zzcs zzcsVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error returning string value to wrapper");
        }
    }

    public final void zzap(zzcs zzcsVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error returning long value to wrapper");
        }
    }

    public final void zzaq(zzcs zzcsVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error returning int value to wrapper");
        }
    }

    public final void zzar(zzcs zzcsVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error returning byte array to wrapper");
        }
    }

    public final void zzas(zzcs zzcsVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error returning boolean value to wrapper");
        }
    }

    public final void zzat(zzcs zzcsVar, Bundle bundle) {
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error returning bundle value to wrapper");
        }
    }

    public final void zzau(zzcs zzcsVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(e, "Error returning bundle list to wrapper");
        }
    }

    public final String zzaz() {
        byte[] bArr = new byte[16];
        zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long zzd() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.zze;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.zze;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((zzic) this.$$delegate_0).zzn.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.zzf + 1;
            this.zzf = i;
            j = nextLong + i;
        }
        return j;
    }

    public final SecureRandom zzf() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new SecureRandom();
        }
        return this.zzd;
    }

    public final Bundle zzi(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        zzic zzicVar;
        zzic zzicVar2 = (zzic) this.$$delegate_0;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str2 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str4 = uri.getQueryParameter("utm_medium");
                    str5 = uri.getQueryParameter("gclid");
                    str6 = uri.getQueryParameter("gbraid");
                    str7 = uri.getQueryParameter("utm_id");
                    str8 = uri.getQueryParameter("dclid");
                    str9 = uri.getQueryParameter("srsltid");
                    str = uri.getQueryParameter("sfmc_id");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    str9 = null;
                }
                if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    if (TextUtils.isEmpty(str2)) {
                        zzicVar = zzicVar2;
                    } else {
                        zzicVar = zzicVar2;
                        bundle.putString("campaign", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("source", str3);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("medium", str4);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        bundle.putString("gclid", str5);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("gbraid", str6);
                    }
                    String queryParameter = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("gad_source", queryParameter);
                    }
                    String queryParameter2 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("term", queryParameter2);
                    }
                    String queryParameter3 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("content", queryParameter3);
                    }
                    String queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("cp1", queryParameter5);
                    }
                    String queryParameter6 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("anid", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        bundle.putString("campaign_id", str7);
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        bundle.putString("dclid", str8);
                    }
                    String queryParameter7 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("source_platform", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("creative_format", queryParameter8);
                    }
                    String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("marketing_tactic", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(str9)) {
                        bundle.putString("srsltid", str9);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("sfmc_id", str);
                    }
                    for (String str10 : uri.getQueryParameterNames()) {
                        if (str10.startsWith("gad_")) {
                            String queryParameter10 = uri.getQueryParameter(str10);
                            if (!TextUtils.isEmpty(queryParameter10)) {
                                bundle.putString(str10, queryParameter10);
                            }
                        }
                    }
                    zzic zzicVar3 = zzicVar;
                    if (zzicVar3.zzg.zzp(null, zzfy.zzba)) {
                        String uri2 = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        zzicVar3.zzg.getClass();
                        int max = Math.max(500, 256);
                        if (uri2.length() > max) {
                            uri2 = zzE(uri2, max - 3, true);
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            bundle.putString("deep_link_url", uri2);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                zzgu zzguVar = zzicVar2.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zzb(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean zzk(String str, String str2) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzf.zzb(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzf.zzb(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzf.zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzgu zzguVar4 = zzicVar.zzi;
                zzic.zzP(zzguVar4);
                zzguVar4.zzf.zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean zzl(String str, String str2) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzf.zzb(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzf.zzb(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                zzgu zzguVar3 = zzicVar.zzi;
                zzic.zzP(zzguVar3);
                zzguVar3.zzf.zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzgu zzguVar4 = zzicVar.zzi;
                zzic.zzP(zzguVar4);
                zzguVar4.zzf.zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean zzm(String str, String[] strArr, String[] strArr2, String str2) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzf.zzb(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(zzb[i])) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzf.zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzaD(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzaD(str2, strArr2)) {
            return true;
        }
        zzgu zzguVar3 = zzicVar.zzi;
        zzic.zzP(zzguVar3);
        zzguVar3.zzf.zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzn(int i, String str, String str2) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzf.zzb(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        zzgu zzguVar2 = zzicVar.zzi;
        zzic.zzP(zzguVar2);
        zzguVar2.zzf.zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int zzp(String str) {
        if (!zzl(BreadcrumbHelper.Category.EVENT, str)) {
            return 2;
        }
        if (zzm(BreadcrumbHelper.Category.EVENT, zzjm.zza, ((zzic) this.$$delegate_0).zzg.zzp(null, zzfy.zzbf) ? zzjm.zzc : zzjm.zzb, str)) {
            return !zzn(40, BreadcrumbHelper.Category.EVENT, str) ? 2 : 0;
        }
        return 13;
    }

    public final boolean zzq(String str) {
        return ((zzic) this.$$delegate_0).zzg.zzp(null, zzfy.zzbf) ? zzaD(str, zzjm.zze) : zzaD(str, zzjm.zzd);
    }

    public final int zzs(String str) {
        if (!zzl("user property", str)) {
            return 6;
        }
        if (!zzm("user property", zzjm.zza$2, null, str)) {
            return 15;
        }
        ((zzic) this.$$delegate_0).getClass();
        return !zzn(24, "user property", str) ? 6 : 0;
    }

    public final int zzt(String str) {
        if (!zzk("event param", str)) {
            return 3;
        }
        if (!zzm("event param", null, null, str)) {
            return 14;
        }
        ((zzic) this.$$delegate_0).getClass();
        return !zzn(40, "event param", str) ? 3 : 0;
    }

    public final int zzu(String str) {
        if (!zzl("event param", str)) {
            return 3;
        }
        if (!zzm("event param", null, null, str)) {
            return 14;
        }
        ((zzic) this.$$delegate_0).getClass();
        return !zzn(40, "event param", str) ? 3 : 0;
    }
}
