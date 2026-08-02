package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import androidx.viewpager.widget.ViewPager;
import app.cash.trifle.Trifle;
import coil3.memory.MemoryCacheService;
import com.bugsnag.android.Client;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.maps.zzac;
import com.google.android.gms.signin.internal.zab;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.SingletonImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.common.sdkinternal.zzb;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public final class zzlj extends zzg {
    public zzky zza;
    public final zzx zzb;
    public boolean zzc;
    public zbc zzd;
    public final CopyOnWriteArraySet zze;
    public boolean zzf;
    public final AtomicReference zzg;
    public final Object zzh;
    public boolean zzi;
    public int zzj;
    public zzju zzk;
    public zzju zzl;
    public PriorityQueue zzm;
    public zzjl zzn;
    public final AtomicLong zzo;
    public long zzp;
    public zzju zzq;
    public zzle zzr;
    public zzkb zzs;
    public final MemoryCacheService zzt;

    public zzlj(zzic zzicVar) {
        super(zzicVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzt = new MemoryCacheService(this, 28);
        this.zzg = new AtomicReference();
        this.zzn = zzjl.zza;
        this.zzp = -1L;
        this.zzo = new AtomicLong(0L);
        this.zzb = new zzx(zzicVar);
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long j;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzicVar.zzn.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzicVar.zzg.zzp(null, zzfy.zzbe)) {
            zzicVar.zzn.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        zzB(str, str2, bundle, true, true, currentTimeMillis, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r5 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzB(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.zzd == null || zzpp.zzac(str2);
            String str3 = str == null ? "app" : str;
            long j3 = true != ((zzic) this.$$delegate_0).zzg.zzp(null, zzfy.zzbe) ? 0L : j2;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            zzhz zzhzVar = ((zzic) this.$$delegate_0).zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new zzkc(this, str3, str2, j, j3, bundle3, z2, z3, z));
            return;
        }
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzmb zzmbVar = zzicVar.zzo;
        zzic.zzO(zzmbVar);
        long j4 = true != zzicVar.zzg.zzp(null, zzfy.zzbe) ? 0L : j2;
        synchronized (zzmbVar.zzj) {
            try {
                if (!zzmbVar.zzi) {
                    zzgu zzguVar = ((zzic) zzmbVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzi.zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string2 = bundle2.getString("screen_name");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length = string2.length();
                        ((zzic) zzmbVar.$$delegate_0).zzg.getClass();
                    }
                    zzgu zzguVar2 = ((zzic) zzmbVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzi.zzb(Integer.valueOf(string2.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string3 = bundle2.getString("screen_class");
                if (string3 != null) {
                    if (string3.length() > 0) {
                        int length2 = string3.length();
                        ((zzic) zzmbVar.$$delegate_0).zzg.getClass();
                    }
                    zzgu zzguVar3 = ((zzic) zzmbVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zzi.zzb(Integer.valueOf(string3.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string3 == null) {
                    zzdd zzddVar = zzmbVar.zze;
                    string3 = zzddVar != null ? zzmbVar.zzi(zzddVar.zzb) : "Activity";
                }
                String str5 = string3;
                zzlu zzluVar = zzmbVar.zzb;
                if (zzmbVar.zzf && zzluVar != null) {
                    zzmbVar.zzf = false;
                    boolean equals = Objects.equals(zzluVar.zzb, str5);
                    boolean equals2 = Objects.equals(zzluVar.zza, string2);
                    if (equals && equals2) {
                        zzgu zzguVar4 = ((zzic) zzmbVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar4);
                        zzguVar4.zzi.zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzic zzicVar2 = (zzic) zzmbVar.$$delegate_0;
                zzgu zzguVar5 = zzicVar2.zzi;
                zzic.zzP(zzguVar5);
                zzguVar5.zzl.zzc("Logging screen view with name, class", string2 == null ? "null" : string2, str5);
                zzlu zzluVar2 = zzmbVar.zzb == null ? zzmbVar.zzc : zzmbVar.zzb;
                zzpp zzppVar = zzicVar2.zzl;
                zzic.zzN(zzppVar);
                zzlu zzluVar3 = new zzlu(string2, str5, zzppVar.zzd(), true, j, j4);
                zzmbVar.zzb = zzluVar3;
                zzmbVar.zzc = zzluVar2;
                zzmbVar.zzg = zzluVar3;
                zzicVar2.zzn.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzhz zzhzVar2 = zzicVar2.zzj;
                zzic.zzP(zzhzVar2);
                zzhzVar2.zzj(new zzkd(zzmbVar, bundle2, zzluVar3, zzluVar2, elapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzC() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        zzabx zzabxVar;
        zzic zzicVar;
        boolean z;
        Object obj;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        Object obj4;
        RegularImmutableMap build;
        String string2;
        int i6;
        zzod zzodVar;
        String string3;
        String zza;
        zzlj zzljVar;
        int i7;
        int zzf;
        boolean equals;
        String str3;
        zzabx zzabxVar2;
        zzg();
        zzic zzicVar2 = (zzic) this.$$delegate_0;
        zzgu zzguVar = zzicVar2.zzi;
        zzgu zzguVar2 = zzicVar2.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzk.zza("Handle tcf update.");
        zzhh zzhhVar = zzicVar2.zzh;
        zzic.zzN(zzhhVar);
        SharedPreferences zze = zzhhVar.zze();
        RegularImmutableList regularImmutableList = zzof.zza;
        zzabw zzabwVar = zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzoe zzoeVar = zzoe.zza;
        zzabw zzabwVar2 = zzabw.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        zzoe zzoeVar2 = zzoe.zzd;
        zzabw zzabwVar3 = zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzabw zzabwVar4 = zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzabw zzabwVar5 = zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        RegularImmutableMap create = RegularImmutableMap.create(7, new Object[]{zzabwVar, zzoeVar, zzabwVar2, zzoeVar2, zzabwVar3, zzoeVar, zzabwVar4, zzoeVar, zzabwVar5, zzoeVar2, zzabw.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzoeVar2, zzabw.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzoeVar2}, null);
        int i8 = ImmutableSet.$r8$clinit;
        SingletonImmutableSet singletonImmutableSet = new SingletonImmutableSet("CH");
        char[] cArr = new char[5];
        boolean contains = zze.contains("IABTCF_TCString");
        try {
            i = zze.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            i2 = zze.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused2) {
            i2 = -1;
        }
        try {
            i3 = zze.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            i3 = -1;
        }
        try {
            i4 = zze.getInt("IABTCF_PurposeOneTreatment", -1);
        } catch (ClassCastException unused4) {
            i4 = -1;
        }
        int i9 = i2;
        try {
            i5 = zze.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused5) {
            i5 = -1;
        }
        String zza2 = zzof.zza(zze, "IABTCF_PublisherCC");
        StatusLine builder = RegularImmutableMap.builder();
        UnmodifiableIterator it = create.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zzabxVar = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
            if (!hasNext) {
                break;
            }
            zzabw zzabwVar6 = (zzabw) it.next();
            boolean z2 = contains;
            int zza3 = zzabwVar6.zza();
            int i10 = i;
            SingletonImmutableSet singletonImmutableSet2 = singletonImmutableSet;
            StringBuilder sb = new StringBuilder(String.valueOf(zza3).length() + 28);
            sb.append("IABTCF_PublisherRestrictions");
            sb.append(zza3);
            String zza4 = zzof.zza(zze, sb.toString());
            if (!TextUtils.isEmpty(zza4) && zza4.length() >= 755) {
                int digit = Character.digit(zza4.charAt(754), 10);
                zzabxVar2 = zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED;
                if (digit >= 0 && digit <= zzabx.values().length && digit != 0) {
                    if (digit == 1) {
                        zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    } else if (digit == 2) {
                        zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    }
                }
                builder.put(zzabwVar6, zzabxVar2);
                contains = z2;
                i = i10;
                singletonImmutableSet = singletonImmutableSet2;
            }
            zzabxVar2 = zzabxVar;
            builder.put(zzabwVar6, zzabxVar2);
            contains = z2;
            i = i10;
            singletonImmutableSet = singletonImmutableSet2;
        }
        boolean z3 = contains;
        int i11 = i;
        SingletonImmutableSet singletonImmutableSet3 = singletonImmutableSet;
        RegularImmutableMap build2 = builder.build(true);
        String zza5 = zzof.zza(zze, "IABTCF_PurposeConsents");
        String zza6 = zzof.zza(zze, "IABTCF_VendorConsents");
        boolean z4 = !TextUtils.isEmpty(zza6) && zza6.length() >= 755 && zza6.charAt(754) == '1';
        String zza7 = zzof.zza(zze, "IABTCF_PurposeLegitimateInterests");
        String zza8 = zzof.zza(zze, "IABTCF_VendorLegitimateInterests");
        if (TextUtils.isEmpty(zza8)) {
            zzicVar = zzicVar2;
        } else {
            zzicVar = zzicVar2;
            if (zza8.length() >= 755 && zza8.charAt(754) == '1') {
                z = true;
                cArr[0] = '2';
                if (z3) {
                    build = RegularImmutableMap.EMPTY;
                    obj = "EnableAdvertiserConsentMode";
                    obj2 = "gdprApplies";
                    obj4 = "Version";
                    obj3 = "CmpSdkID";
                    str2 = "1";
                    str = "0";
                } else {
                    zzabx zzabxVar3 = (zzabx) build2.get(zzabwVar);
                    zzabx zzabxVar4 = (zzabx) build2.get(zzabwVar3);
                    zzabx zzabxVar5 = (zzabx) build2.get(zzabwVar4);
                    zzabx zzabxVar6 = (zzabx) build2.get(zzabwVar5);
                    StatusLine builder2 = RegularImmutableMap.builder();
                    builder2.put("Version", "2");
                    boolean z5 = z4;
                    builder2.put("VendorConsent", true != z4 ? "0" : "1");
                    boolean z6 = z;
                    builder2.put("VendorLegitimateInterest", true != z ? "0" : "1");
                    builder2.put("gdprApplies", i3 != 1 ? "0" : "1");
                    builder2.put("EnableAdvertiserConsentMode", i5 != 1 ? "0" : "1");
                    builder2.put("PolicyVersion", String.valueOf(i9));
                    builder2.put("CmpSdkID", String.valueOf(i11));
                    builder2.put("PurposeOneTreatment", i4 != 1 ? "0" : "1");
                    builder2.put("PublisherCC", zza2);
                    builder2.put("PublisherRestrictions1", String.valueOf(zzabxVar3 != null ? zzabxVar3.zza() : zzabxVar.zza()));
                    builder2.put("PublisherRestrictions3", String.valueOf(zzabxVar4 != null ? zzabxVar4.zza() : zzabxVar.zza()));
                    builder2.put("PublisherRestrictions4", String.valueOf(zzabxVar5 != null ? zzabxVar5.zza() : zzabxVar.zza()));
                    builder2.put("PublisherRestrictions7", String.valueOf(zzabxVar6 != null ? zzabxVar6.zza() : zzabxVar.zza()));
                    int i12 = i3;
                    builder2.putAll(RegularImmutableMap.create(4, new Object[]{"Purpose1", zzof.zzf(zzabwVar, zza5, zza7), "Purpose3", zzof.zzf(zzabwVar3, zza5, zza7), "Purpose4", zzof.zzf(zzabwVar4, zza5, zza7), "Purpose7", zzof.zzf(zzabwVar5, zza5, zza7)}, null).entrySet());
                    obj = "EnableAdvertiserConsentMode";
                    str = "0";
                    str2 = "1";
                    obj2 = "gdprApplies";
                    obj3 = "CmpSdkID";
                    obj4 = "Version";
                    int i13 = i4;
                    String str4 = true != zzof.zzc(zzabwVar, create, build2, singletonImmutableSet3, cArr, i5, i12, i13, zza2, zza5, zza7, z5, z6) ? str : str2;
                    int i14 = i5;
                    builder2.putAll(RegularImmutableMap.create(5, new Object[]{"AuthorizePurpose1", str4, "AuthorizePurpose3", true != zzof.zzc(zzabwVar3, create, build2, singletonImmutableSet3, cArr, i14, i12, i13, zza2, zza5, zza7, z5, z6) ? str : str2, "AuthorizePurpose4", true != zzof.zzc(zzabwVar4, create, build2, singletonImmutableSet3, cArr, i14, i12, i13, zza2, zza5, zza7, z5, z6) ? str : str2, "AuthorizePurpose7", true != zzof.zzc(zzabwVar5, create, build2, singletonImmutableSet3, cArr, i14, i12, i13, zza2, zza5, zza7, z5, z6) ? str : str2, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                    build = builder2.build(true);
                }
                zzod zzodVar2 = new zzod(build);
                zzic.zzP(zzguVar2);
                zzguVar2.zzl.zzb(zzodVar2, "Tcf preferences read");
                zzhhVar.zzg();
                string2 = zzhhVar.zzd().getString("stored_tcf_param", "");
                HashMap hashMap = new HashMap();
                if (TextUtils.isEmpty(string2)) {
                    for (String str5 : string2.split(";")) {
                        String[] split = str5.split("=");
                        if (split.length >= 2 && zzof.zza.contains(split[0])) {
                            hashMap.put(split[0], split[1]);
                        }
                    }
                    i6 = 2;
                    zzodVar = new zzod(hashMap);
                } else {
                    zzodVar = new zzod(hashMap);
                    i6 = 2;
                }
                zzhhVar.zzg();
                string3 = zzhhVar.zzd().getString("stored_tcf_param", "");
                zza = zzodVar2.zza();
                if (zza.equals(string3)) {
                    SharedPreferences.Editor edit = zzhhVar.zzd().edit();
                    edit.putString("stored_tcf_param", zza);
                    edit.apply();
                    Bundle zzb = zzodVar2.zzb();
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzl.zzb(zzb, "Consent generated from Tcf");
                    if (zzb != Bundle.EMPTY) {
                        zzicVar.zzn.getClass();
                        zzljVar = this;
                        zzljVar.zzp(zzb, -30, System.currentTimeMillis());
                    } else {
                        zzljVar = this;
                    }
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = zzodVar.zza;
                    String str6 = (hashMap2.isEmpty() || ((String) hashMap2.get(obj4)) != null) ? str : str2;
                    Bundle zzb2 = zzodVar2.zzb();
                    Bundle zzb3 = zzodVar.zzb();
                    bundle.putString("_tcfm", str6.concat((zzb2.size() == zzb3.size() && Objects.equals(zzb2.getString("ad_storage"), zzb3.getString("ad_storage")) && Objects.equals(zzb2.getString("ad_personalization"), zzb3.getString("ad_personalization")) && Objects.equals(zzb2.getString("ad_user_data"), zzb3.getString("ad_user_data"))) ? str : str2));
                    HashMap hashMap3 = zzodVar2.zza;
                    String str7 = (String) hashMap3.get("PurposeDiagnostics");
                    if (TextUtils.isEmpty(str7)) {
                        str7 = "200000";
                    }
                    bundle.putString("_tcfd2", str7);
                    StringBuilder sb2 = new StringBuilder(str2);
                    try {
                        str3 = (String) hashMap3.get(obj3);
                    } catch (NumberFormatException unused6) {
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        i7 = Integer.parseInt(str3);
                        if (i7 >= 0 || i7 > 4095) {
                            sb2.append("00");
                        } else {
                            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 >> 6));
                            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 & 63));
                        }
                        zzf = zzodVar2.zzf();
                        if (zzf >= 0 || zzf > 63) {
                            sb2.append(str);
                        } else {
                            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(zzf));
                        }
                        int i15 = true == str2.equals(hashMap3.get(obj2)) ? 0 : i6;
                        equals = str2.equals(hashMap3.get(obj));
                        int i16 = i15 | 4;
                        if (equals) {
                            i16 = i15 | 12;
                        }
                        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16));
                        bundle.putString("_tcfd", sb2.toString());
                        zzljVar.zzE("auto", "_tcf", bundle);
                        return;
                    }
                    i7 = -1;
                    if (i7 >= 0) {
                    }
                    sb2.append("00");
                    zzf = zzodVar2.zzf();
                    if (zzf >= 0) {
                    }
                    sb2.append(str);
                    if (true == str2.equals(hashMap3.get(obj2))) {
                    }
                    equals = str2.equals(hashMap3.get(obj));
                    int i162 = i15 | 4;
                    if (equals) {
                    }
                    sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i162));
                    bundle.putString("_tcfd", sb2.toString());
                    zzljVar.zzE("auto", "_tcf", bundle);
                    return;
                }
                return;
            }
        }
        z = false;
        cArr[0] = '2';
        if (z3) {
        }
        zzod zzodVar22 = new zzod(build);
        zzic.zzP(zzguVar2);
        zzguVar2.zzl.zzb(zzodVar22, "Tcf preferences read");
        zzhhVar.zzg();
        string2 = zzhhVar.zzd().getString("stored_tcf_param", "");
        HashMap hashMap4 = new HashMap();
        if (TextUtils.isEmpty(string2)) {
        }
        zzhhVar.zzg();
        string3 = zzhhVar.zzd().getString("stored_tcf_param", "");
        zza = zzodVar22.zza();
        if (zza.equals(string3)) {
        }
    }

    public final void zzE(String str, String str2, Bundle bundle) {
        long j;
        zzg();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzicVar.zzn.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzicVar.zzg.zzp(null, zzfy.zzbe)) {
            zzicVar.zzn.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        zzF(currentTimeMillis, j, bundle, str, str2);
    }

    public final void zzF(long j, long j2, Bundle bundle, String str, String str2) {
        zzg();
        boolean z = true;
        if (this.zzd != null && !zzpp.zzac(str2)) {
            z = false;
        }
        zzG(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzG(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        zzhh zzhhVar;
        DefaultClock defaultClock;
        zzal zzalVar;
        String str3;
        zzhh zzhhVar2;
        MemoryCacheService memoryCacheService;
        boolean z4;
        zzmb zzmbVar;
        long j3;
        boolean zza;
        boolean z5;
        int i;
        zzmb zzmbVar2;
        zzoc zzocVar;
        long j4;
        int i2;
        long j5;
        zzoc zzocVar2;
        boolean zzs;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i3;
        String str4 = str;
        zzae.checkNotEmpty(str4);
        zzae.checkNotNull(bundle);
        zzg();
        zzb$1();
        zzic zzicVar = (zzic) this.$$delegate_0;
        boolean zzB = zzicVar.zzB();
        zzoc zzocVar3 = zzicVar.zzk;
        zzal zzalVar2 = zzicVar.zzg;
        Context context = zzicVar.zzd;
        zzpp zzppVar = zzicVar.zzl;
        zzgu zzguVar = zzicVar.zzi;
        if (!zzB) {
            zzic.zzP(zzguVar);
            zzguVar.zzk.zza("Event not sent since app measurement is disabled");
            return;
        }
        List list = zzicVar.zzv().zzi;
        if (list != null && !list.contains(str2)) {
            zzic.zzP(zzguVar);
            zzguVar.zzk.zzc("Dropping non-safelisted event. event name, origin", str2, str4);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzicVar.zze ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    zzic.zzP(zzguVar);
                    zzguVar.zzg.zzb(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                zzic.zzP(zzguVar);
                zzguVar.zzj.zza("Tag Manager is not found and thus will not be used");
            }
        }
        zzgn zzgnVar = zzicVar.zzm;
        zzhh zzhhVar3 = zzicVar.zzh;
        DefaultClock defaultClock2 = zzicVar.zzn;
        if (!zzalVar2.zzp(null, zzfy.zzaZ) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string2 = bundle.getString("gclid");
            defaultClock2.getClass();
            zzhhVar = zzhhVar3;
            defaultClock = defaultClock2;
            zzalVar = zzalVar2;
            str3 = null;
            zzM(System.currentTimeMillis(), string2, "auto", "_lgclid");
        } else {
            zzhhVar = zzhhVar3;
            defaultClock = defaultClock2;
            zzalVar = zzalVar2;
            str3 = null;
        }
        if (!z || zzpp.zzc[0].equals(str2)) {
            zzhhVar2 = zzhhVar;
        } else {
            zzic.zzN(zzppVar);
            zzic.zzN(zzhhVar);
            zzhhVar2 = zzhhVar;
            zzppVar.zzK(bundle, zzhhVar2.zzt.zza());
        }
        MemoryCacheService memoryCacheService2 = this.zzt;
        if (z3 || "_iap".equals(str2)) {
            memoryCacheService = memoryCacheService2;
        } else {
            zzic.zzN(zzppVar);
            int i4 = 2;
            if (zzppVar.zzk(BreadcrumbHelper.Category.EVENT, str2)) {
                memoryCacheService = memoryCacheService2;
                if (zzppVar.zzm(BreadcrumbHelper.Category.EVENT, zzjm.zza, ((zzic) zzppVar.$$delegate_0).zzg.zzp(str3, zzfy.zzbf) ? zzjm.zzc : zzjm.zzb, str2)) {
                    i3 = 40;
                    if (zzppVar.zzn(40, BreadcrumbHelper.Category.EVENT, str2)) {
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        zzic.zzP(zzguVar);
                        zzguVar.zzf.zzb(zzgnVar.zza(str2), "Invalid public event name. Event will not be logged (FE)");
                        zzic.zzN(zzppVar);
                        zzpp.zzP(memoryCacheService, null, i4, "_ev", zzpp.zzE(str2, i3, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                } else {
                    i4 = 13;
                }
            } else {
                memoryCacheService = memoryCacheService2;
            }
            i3 = 40;
            if (i4 != 0) {
            }
        }
        zzmb zzmbVar3 = zzicVar.zzo;
        zzic.zzO(zzmbVar3);
        zzlu zzh = zzmbVar3.zzh(false);
        if (zzh != null && !bundle.containsKey("_sc")) {
            zzh.zzd = true;
        }
        zzpp.zzay(zzh, bundle, z && !z3);
        boolean equals = "am".equals(str4);
        boolean zzac = zzpp.zzac(str2);
        if (!z || this.zzd == null || zzac) {
            z4 = equals;
        } else {
            if (!equals) {
                zzic.zzP(zzguVar);
                zzguVar.zzk.zzc("Passing event to registered event handler (FE)", zzgnVar.zza(str2), zzgnVar.zze(bundle));
                zzae.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str4, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        if (zzicVar.zzH()) {
            zzic.zzN(zzppVar);
            zzic zzicVar2 = (zzic) zzppVar.$$delegate_0;
            int zzp = zzppVar.zzp(str2);
            if (zzp != 0) {
                zzic.zzP(zzguVar);
                zzguVar.zzf.zzb(zzgnVar.zza(str2), "Invalid event name. Event will not be logged (FE)");
                String zzE = zzpp.zzE(str2, 40, true);
                int length = str2 != null ? str2.length() : 0;
                zzic.zzN(zzppVar);
                zzpp.zzP(memoryCacheService, null, zzp, "_ev", zzE, length);
                return;
            }
            Bundle zzH = zzppVar.zzH(str2, bundle, Hex.listOf("_o", "_sn", "_sc", "_si"), z3);
            zzae.checkNotNull(zzH);
            zzic.zzO(zzmbVar3);
            String str5 = "_o";
            if (zzmbVar3.zzh(false) == null || !"_ae".equals(str2)) {
                zzmbVar = zzmbVar3;
                j3 = 0;
            } else {
                zzic.zzO(zzocVar3);
                zzoa zzoaVar = zzocVar3.zzb;
                ((zzic) zzoaVar.zzc.$$delegate_0).zzn.getClass();
                j3 = 0;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzmbVar = zzmbVar3;
                long j6 = elapsedRealtime - zzoaVar.zzb;
                zzoaVar.zzb = elapsedRealtime;
                if (j6 > 0) {
                    zzppVar.zzan(zzH, j6);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                String string3 = zzH.getString("_ffr");
                int i5 = Strings.$r8$clinit;
                if (string3 == null || string3.trim().isEmpty()) {
                    string3 = null;
                } else if (string3 != null) {
                    string3 = string3.trim();
                }
                zzhh zzhhVar4 = zzicVar2.zzh;
                zzic.zzN(zzhhVar4);
                if (Objects.equals(string3, zzhhVar4.zzq.zza())) {
                    zzgu zzguVar2 = zzicVar2.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzk.zza("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    zzhh zzhhVar5 = zzicVar2.zzh;
                    zzic.zzN(zzhhVar5);
                    zzhhVar5.zzq.zzb(string3);
                }
            } else if ("_ae".equals(str2)) {
                zzhh zzhhVar6 = zzicVar2.zzh;
                zzic.zzN(zzhhVar6);
                String zza2 = zzhhVar6.zzq.zza();
                if (!TextUtils.isEmpty(zza2)) {
                    zzH.putString("_ffr", zza2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zzH);
            if (zzalVar.zzp(null, zzfy.zzaS)) {
                zzic.zzO(zzocVar3);
                zzocVar3.zzg();
                zza = zzocVar3.zze;
            } else {
                zzic.zzN(zzhhVar2);
                zza = zzhhVar2.zzn.zza();
            }
            zzic.zzN(zzhhVar2);
            if (zzhhVar2.zzk.zza() > j3) {
                zzocVar = zzocVar3;
                j5 = j;
                if (zzhhVar2.zzo(j5) && zza) {
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zza("Current session is expired, remove the session number, ID, and engagement time");
                    defaultClock.getClass();
                    zzmbVar2 = zzmbVar;
                    z5 = z4;
                    i = 1;
                    i2 = 0;
                    zzM(System.currentTimeMillis(), null, "auto", "_sid");
                    zzM(System.currentTimeMillis(), null, "auto", "_sno");
                    zzM(System.currentTimeMillis(), null, "auto", "_se");
                    j4 = j3;
                    zzhhVar2.zzl.zzb(j4);
                } else {
                    z5 = z4;
                    i = 1;
                    zzmbVar2 = zzmbVar;
                    j4 = j3;
                    i2 = 0;
                }
            } else {
                z5 = z4;
                i = 1;
                zzmbVar2 = zzmbVar;
                zzocVar = zzocVar3;
                j4 = j3;
                i2 = 0;
                j5 = j;
            }
            if (zzH.getLong("extend_session", j4) == 1) {
                zzic.zzP(zzguVar);
                zzguVar.zzl.zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzic.zzO(zzocVar);
                zzocVar2 = zzocVar;
                zzocVar2.zza.zzb(j5, j2);
            } else {
                zzocVar2 = zzocVar;
            }
            ArrayList arrayList3 = new ArrayList(zzH.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i6 = i2;
            while (i6 < size) {
                String str6 = (String) arrayList3.get(i6);
                if (str6 != null) {
                    zzic.zzN(zzppVar);
                    Object obj = zzH.get(str6);
                    arrayList = arrayList3;
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[i];
                        bundleArr[i2] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzH.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i6++;
                arrayList3 = arrayList;
                i = 1;
            }
            int i7 = i2;
            while (i7 < arrayList2.size()) {
                Bundle bundle2 = (Bundle) arrayList2.get(i7);
                String str7 = i7 != 0 ? "_ep" : str2;
                String str8 = str5;
                bundle2.putString(str8, str4);
                if (z2) {
                    bundle2 = zzppVar.zzae(bundle2);
                }
                Bundle bundle3 = bundle2;
                zzbh zzbhVar = new zzbh(str7, new zzbf(bundle2), str4, j5, j2);
                zznl zzt = zzicVar.zzt();
                zzt.getClass();
                zzt.zzg();
                zzt.zzb$1();
                zzt.zzad$1();
                zzgl zzm = ((zzic) zzt.$$delegate_0).zzm();
                zzm.getClass();
                Parcel obtain = Parcel.obtain();
                zzac.zza(zzbhVar, obtain, i2);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                if (marshall.length > 131072) {
                    zzgu zzguVar3 = ((zzic) zzm.$$delegate_0).zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zze.zza("Event is too long for local database. Sending event directly to service");
                    zzs = false;
                } else {
                    zzs = zzm.zzs(0, marshall);
                }
                zzt.zzaf(new com.google.android.gms.cloudmessaging.zzh(zzt, zzt.zzah(true), zzs, zzbhVar, 2));
                if (!z5) {
                    Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((zzq) it.next()).onEvent(str, str2, new Bundle(bundle3), j);
                    }
                }
                i7++;
                str4 = str;
                j5 = j;
                str5 = str8;
                i2 = 0;
            }
            zzic.zzO(zzmbVar2);
            if (zzmbVar2.zzh(false) == null || !"_ae".equals(str2)) {
                return;
            }
            zzic.zzO(zzocVar2);
            defaultClock.getClass();
            zzocVar2.zzb.zzd(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void zzK(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (z) {
            zzpp zzppVar = zzicVar.zzl;
            zzic.zzN(zzppVar);
            i = zzppVar.zzs(str2);
        } else {
            zzpp zzppVar2 = zzicVar.zzl;
            zzic.zzN(zzppVar2);
            if (zzppVar2.zzk("user property", str2)) {
                if (zzppVar2.zzm("user property", zzjm.zza$2, null, str2)) {
                    ((zzic) zzppVar2.$$delegate_0).getClass();
                    if (zzppVar2.zzn(24, "user property", str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        MemoryCacheService memoryCacheService = this.zzt;
        if (i != 0) {
            zzic.zzN(zzicVar.zzl);
            String zzE = zzpp.zzE(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            zzic.zzN(zzicVar.zzl);
            zzpp.zzP(memoryCacheService, null, i, "_ev", zzE, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            zzhz zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new zzkd(this, str3, str2, (Object) null, j));
            return;
        }
        zzpp zzppVar3 = zzicVar.zzl;
        zzpp zzppVar4 = zzicVar.zzl;
        zzic.zzN(zzppVar3);
        int zzM = zzppVar3.zzM(obj, str2);
        if (zzM != 0) {
            zzic.zzN(zzppVar4);
            String zzE2 = zzpp.zzE(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            zzic.zzN(zzppVar4);
            zzpp.zzP(memoryCacheService, null, zzM, "_ev", zzE2, length);
            return;
        }
        zzic.zzN(zzppVar4);
        Object zzN = zzppVar4.zzN(obj, str2);
        if (zzN != null) {
            zzhz zzhzVar2 = zzicVar.zzj;
            zzic.zzP(zzhzVar2);
            zzhzVar2.zzj(new zzkd(this, str3, str2, zzN, j));
        }
    }

    public final void zzM(long j, Object obj, String str, String str2) {
        String str3;
        boolean zzs;
        Object obj2 = obj;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotEmpty(str);
        zzae.checkNotEmpty(str2);
        zzg();
        zzb$1();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj2 = Long.valueOf(j2);
                    zzhh zzhhVar = zzicVar.zzh;
                    zzic.zzN(zzhhVar);
                    zzhhVar.zzh.zzb(j2 == 1 ? "true" : "false");
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj2);
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                zzhh zzhhVar2 = zzicVar.zzh;
                zzic.zzN(zzhhVar2);
                zzhhVar2.zzh.zzb("unset");
            } else {
                str4 = str2;
            }
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzl.zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj2);
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!zzicVar.zzB()) {
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzl.zza("User property not set since app measurement is disabled");
            return;
        }
        if (zzicVar.zzH()) {
            zzpl zzplVar = new zzpl(j, obj3, str3, str);
            zznl zzt = zzicVar.zzt();
            zzt.zzg();
            zzt.zzb$1();
            zzt.zzad$1();
            zzgl zzm = ((zzic) zzt.$$delegate_0).zzm();
            zzm.getClass();
            Parcel obtain = Parcel.obtain();
            zab.zza(zzplVar, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                zzgu zzguVar4 = ((zzic) zzm.$$delegate_0).zzi;
                zzic.zzP(zzguVar4);
                zzguVar4.zze.zza("User property too long for local database. Sending directly to service");
                zzs = false;
            } else {
                zzs = zzm.zzs(1, marshall);
            }
            zzt.zzaf(new com.google.android.gms.cloudmessaging.zzh(zzt, zzt.zzah(true), zzs, zzplVar, 1));
        }
    }

    public final void zzT() {
        zzg();
        zzb$1();
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (zzicVar.zzH()) {
            zzal zzalVar = zzicVar.zzg;
            ((zzic) zzalVar.$$delegate_0).getClass();
            Boolean zzr = zzalVar.zzr("google_analytics_deferred_deep_link_enabled");
            int i = 3;
            if (zzr != null && zzr.booleanValue()) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzk.zza("Deferred Deep Link feature enabled.");
                zzhz zzhzVar = zzicVar.zzj;
                zzic.zzP(zzhzVar);
                zzhzVar.zzj(new zzv(this, i));
            }
            zznl zzt = zzicVar.zzt();
            zzt.zzg();
            zzt.zzb$1();
            zzr zzah = zzt.zzah(true);
            zzt.zzad$1();
            zzic zzicVar2 = (zzic) zzt.$$delegate_0;
            zzicVar2.zzg.zzp(null, zzfy.zzaW);
            zzicVar2.zzm().zzs(3, new byte[0]);
            zzt.zzaf(new zzmh(zzt, zzah, 1));
            this.zzc = false;
            zzhh zzhhVar = zzicVar.zzh;
            zzic.zzN(zzhhVar);
            zzhhVar.zzg();
            String string2 = zzhhVar.zzd().getString("previous_os_version", null);
            ((zzic) zzhhVar.$$delegate_0).zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string2)) {
                SharedPreferences.Editor edit = zzhhVar.zzd().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            zzicVar.zzu().zzw();
            if (string2.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string2);
            zzE("auto", "_ou", bundle);
        }
    }

    public final void zzZ(Bundle bundle, long j) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzae.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzjm.zzb(bundle2, "app_id", String.class, null);
        zzjm.zzb(bundle2, "origin", String.class, null);
        zzjm.zzb(bundle2, "name", String.class, null);
        zzjm.zzb(bundle2, "value", Object.class, null);
        zzjm.zzb(bundle2, "trigger_event_name", String.class, null);
        zzjm.zzb(bundle2, "trigger_timeout", Long.class, 0L);
        zzjm.zzb(bundle2, "timed_out_event_name", String.class, null);
        zzjm.zzb(bundle2, "timed_out_event_params", Bundle.class, null);
        zzjm.zzb(bundle2, "triggered_event_name", String.class, null);
        zzjm.zzb(bundle2, "triggered_event_params", Bundle.class, null);
        zzjm.zzb(bundle2, "time_to_live", Long.class, 0L);
        zzjm.zzb(bundle2, "expired_event_name", String.class, null);
        zzjm.zzb(bundle2, "expired_event_params", Bundle.class, null);
        zzae.checkNotEmpty(bundle2.getString("name"));
        zzae.checkNotEmpty(bundle2.getString("origin"));
        zzae.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string2 = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzpp zzppVar = zzicVar.zzl;
        zzgn zzgnVar = zzicVar.zzm;
        zzgu zzguVar2 = zzicVar.zzi;
        zzic.zzN(zzppVar);
        if (zzppVar.zzs(string2) != 0) {
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(zzgnVar.zzc(string2), "Invalid conditional user property name");
            return;
        }
        zzic.zzN(zzppVar);
        if (zzppVar.zzM(obj, string2) != 0) {
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Invalid conditional user property value", zzgnVar.zzc(string2), obj);
            return;
        }
        Object zzN = zzppVar.zzN(obj, string2);
        if (zzN == null) {
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Unable to normalize conditional user property value", zzgnVar.zzc(string2), obj);
            return;
        }
        zzjm.zza(bundle2, zzN);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Invalid conditional user property timeout", zzgnVar.zzc(string2), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzc("Invalid conditional user property time to live", zzgnVar.zzc(string2), Long.valueOf(j3));
        } else {
            zzhz zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new zzki(this, bundle2, 0));
        }
    }

    public final void zzaa(String str, String str2, Bundle bundle) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzicVar.zzn.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        zzae.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzki(this, bundle2, 1));
    }

    public final String zzae() {
        zzic zzicVar = (zzic) this.$$delegate_0;
        try {
            return Countries.zza(zzicVar.zzd, zzicVar.zzs);
        } catch (IllegalStateException e) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void zzaj(zzjl zzjlVar, long j, boolean z) {
        int i = zzjlVar.zzc;
        zzg();
        zzb$1();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzhh zzhhVar = zzicVar.zzh;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzN(zzhhVar);
        zzjl zzl = zzhhVar.zzl();
        if (j <= this.zzp && zzjl.zzu(zzl.zzc, i)) {
            zzic.zzP(zzguVar);
            zzguVar.zzj.zzb(zzjlVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        zzhh zzhhVar2 = zzicVar.zzh;
        zzic.zzN(zzhhVar2);
        zzhhVar2.zzg();
        if (!zzjl.zzu(i, zzhhVar2.zzd().getInt("consent_source", 100))) {
            zzic.zzP(zzguVar);
            zzguVar.zzj.zzb(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = zzhhVar2.zzd().edit();
        edit.putString("consent_settings", zzjlVar.zzl());
        edit.putInt("consent_source", i);
        edit.apply();
        zzic.zzP(zzguVar);
        zzguVar.zzl.zzb(zzjlVar, "Setting storage consent(FE)");
        this.zzp = j;
        if (zzicVar.zzt().zzP()) {
            zznl zzt = zzicVar.zzt();
            zzt.zzg();
            zzt.zzb$1();
            zzt.zzaf(new zznd(zzt, 2));
        } else {
            zznl zzt2 = zzicVar.zzt();
            zzt2.zzg();
            zzt2.zzb$1();
            if (zzt2.zzO()) {
                zzt2.zzaf(new zzmh(zzt2, zzt2.zzah(false)));
            }
        }
        if (z) {
            zzicVar.zzt().zzC(new AtomicReference());
        }
    }

    public final void zzaq(Boolean bool, boolean z) {
        zzg();
        zzb$1();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzk.zzb(bool, "Setting app measurement enabled (FE)");
        zzhh zzhhVar = zzicVar.zzh;
        zzic.zzN(zzhhVar);
        zzhhVar.zzg();
        SharedPreferences.Editor edit = zzhhVar.zzd().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z) {
            zzhhVar.zzg();
            SharedPreferences.Editor edit2 = zzhhVar.zzd().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        if (zzicVar.zzC || !(bool == null || bool.booleanValue())) {
            zzar();
        }
    }

    public final void zzar() {
        zzg();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzhh zzhhVar = zzicVar.zzh;
        zzgu zzguVar = zzicVar.zzi;
        DefaultClock defaultClock = zzicVar.zzn;
        zzic.zzN(zzhhVar);
        String zza = zzhhVar.zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                defaultClock.getClass();
                zzM(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(zza) ? 0L : 1L);
                defaultClock.getClass();
                zzM(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!zzicVar.zzB() || !this.zzc) {
            zzic.zzP(zzguVar);
            zzguVar.zzk.zza("Updating Scion state (FE)");
            zznl zzt = zzicVar.zzt();
            zzt.zzg();
            zzt.zzb$1();
            zzt.zzaf(new zzmh(zzt, zzt.zzah(true), 3));
            return;
        }
        zzic.zzP(zzguVar);
        zzguVar.zzk.zza("Recording app launch after enabling measurement for the first time (FE)");
        zzT();
        zzoc zzocVar = zzicVar.zzk;
        zzic.zzO(zzocVar);
        zzocVar.zza.zza();
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzv(this, 2));
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (!(zzicVar.zzd.getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzicVar.zzd.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final void zzp(Bundle bundle, int i, long j) {
        Boolean bool;
        String str;
        zzji zzjiVar;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzb$1();
        zzjl zzjlVar = zzjl.zza;
        zzjk[] zzjkVarArr = zzjj.STORAGE.zzc;
        int length = zzjkVarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                str = null;
                break;
            }
            String str2 = zzjkVarArr[i2].zze;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals("granted") ? Boolean.TRUE : str.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i2++;
        }
        if (str != null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzi.zzb(str, "Ignoring invalid consent setting");
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzi.zza("Valid consent values are 'granted', 'denied'");
        }
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        boolean zze = zzhzVar.zze();
        zzjl zze2 = zzjl.zze(i, bundle);
        Iterator it = zze2.zzb.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zzjiVar = zzji.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((zzji) it.next()) != zzjiVar) {
                zzs(zze2, zze);
                break;
            }
        }
        zzba zzh = zzba.zzh(i, bundle);
        Iterator it2 = zzh.zzf.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((zzji) it2.next()) != zzjiVar) {
                zzq(zzh, zze);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = zzjl.zzg(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str3 = i == -30 ? "tcf" : "app";
            if (zze) {
                zzM(j, bool.toString(), str3, "allow_personalized_ads");
            } else {
                zzK(str3, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void zzq(zzba zzbaVar, boolean z) {
        Client.AnonymousClass4 anonymousClass4 = new Client.AnonymousClass4(this, zzbaVar, false, 27);
        if (z) {
            zzg();
            anonymousClass4.run();
        } else {
            zzhz zzhzVar = ((zzic) this.$$delegate_0).zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(anonymousClass4);
        }
    }

    public final void zzs(zzjl zzjlVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        zzjl zzjlVar2;
        zzb$1();
        int i = zzjlVar.zzc;
        if (i != -10) {
            zzji zzjiVar = (zzji) zzjlVar.zzb.get(zzjk.AD_STORAGE);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            zzji zzjiVar2 = zzji.UNINITIALIZED;
            if (zzjiVar == zzjiVar2) {
                zzji zzjiVar3 = (zzji) zzjlVar.zzb.get(zzjk.ANALYTICS_STORAGE);
                if (zzjiVar3 == null) {
                    zzjiVar3 = zzjiVar2;
                }
                if (zzjiVar3 == zzjiVar2) {
                    zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzi.zza("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.zzh) {
            try {
                z2 = false;
                if (zzjl.zzu(i, this.zzn.zzc)) {
                    zzjl zzjlVar3 = this.zzn;
                    EnumMap enumMap = zzjlVar.zzb;
                    zzjk[] zzjkVarArr = (zzjk[]) enumMap.keySet().toArray(new zzjk[0]);
                    int length = zzjkVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        zzjk zzjkVar = zzjkVarArr[i2];
                        zzji zzjiVar4 = (zzji) enumMap.get(zzjkVar);
                        zzji zzjiVar5 = (zzji) zzjlVar3.zzb.get(zzjkVar);
                        zzji zzjiVar6 = zzji.DENIED;
                        if (zzjiVar4 == zzjiVar6 && zzjiVar5 != zzjiVar6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
                    if (zzjlVar.zzo(zzjkVar2) && !this.zzn.zzo(zzjkVar2)) {
                        z2 = true;
                    }
                    zzjlVar = zzjlVar.zzt(this.zzn);
                    this.zzn = zzjlVar;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                zzjlVar2 = zzjlVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            zzgu zzguVar2 = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzj.zzb(zzjlVar2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.zzo.getAndIncrement();
        if (z3) {
            this.zzg.set(null);
            zzku zzkuVar = new zzku(this, zzjlVar2, andIncrement, z4, 0);
            if (z) {
                zzg();
                zzkuVar.run();
                return;
            } else {
                zzhz zzhzVar = ((zzic) this.$$delegate_0).zzj;
                zzic.zzP(zzhzVar);
                zzhzVar.zzl(zzkuVar);
                return;
            }
        }
        zzku zzkuVar2 = new zzku(this, zzjlVar2, andIncrement, z4, 1);
        if (z) {
            zzg();
            zzkuVar2.run();
        } else if (i == 30 || i == -10) {
            zzhz zzhzVar2 = ((zzic) this.$$delegate_0).zzj;
            zzic.zzP(zzhzVar2);
            zzhzVar2.zzl(zzkuVar2);
        } else {
            zzhz zzhzVar3 = ((zzic) this.$$delegate_0).zzj;
            zzic.zzP(zzhzVar3);
            zzhzVar3.zzj(zzkuVar2);
        }
    }

    public final void zzw() {
        zzaif.zza();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzal zzalVar = zzicVar.zzg;
        zzhz zzhzVar = zzicVar.zzj;
        zzgu zzguVar = zzicVar.zzi;
        if (zzalVar.zzp(null, zzfy.zzaP)) {
            zzic.zzP(zzhzVar);
            if (zzhzVar.zze()) {
                zzic.zzP(zzguVar);
                zzguVar.zzd.zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (Trifle.zza()) {
                zzic.zzP(zzguVar);
                zzguVar.zzd.zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzb$1();
            zzic.zzP(zzguVar);
            zzguVar.zzl.zza("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            zzic.zzP(zzhzVar);
            zzhzVar.zzk(atomicReference, 10000L, "get trigger URIs", new zzke(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzic.zzP(zzguVar);
                zzguVar.zzf.zza("Timed out waiting for get trigger URIs");
            } else {
                zzic.zzP(zzhzVar);
                zzhzVar.zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzlj zzljVar = zzlj.this;
                        zzljVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        zzhh zzhhVar = ((zzic) zzljVar.$$delegate_0).zzh;
                        zzic.zzN(zzhhVar);
                        SparseArray zzf = zzhhVar.zzf();
                        for (zzoh zzohVar : list) {
                            int i = zzohVar.zzc;
                            if (!zzf.contains(i) || ((Long) zzf.get(i)).longValue() < zzohVar.zzb) {
                                zzljVar.zzx().add(zzohVar);
                            }
                        }
                        zzljVar.zzy$1();
                    }
                });
            }
        }
    }

    public final PriorityQueue zzx() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, ViewPager.AnonymousClass1.zza));
        }
        return this.zzm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzy$1() {
        zzoh zzohVar;
        zzg();
        if (zzx().isEmpty() || this.zzi || (zzohVar = (zzoh) zzx().poll()) == null) {
            return;
        }
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzpp zzppVar = zzicVar.zzl;
        zzic.zzN(zzppVar);
        if (zzppVar.zzg == null) {
            zzppVar.zzg = MeasurementManagerFutures$Api33Ext5JavaImpl.from(((zzic) zzppVar.$$delegate_0).zzd);
        }
        MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl = zzppVar.zzg;
        if (measurementManagerFutures$Api33Ext5JavaImpl != null) {
            this.zzi = true;
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzgs zzgsVar = zzguVar.zzl;
            String str = zzohVar.zza;
            zzgsVar.zzb(str, "Registering trigger URI");
            ListenableFuture registerTriggerAsync = measurementManagerFutures$Api33Ext5JavaImpl.registerTriggerAsync(Uri.parse(str));
            int i = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (registerTriggerAsync == null) {
                this.zzi = false;
                zzx().add(zzohVar);
            } else {
                registerTriggerAsync.addListener(new zzb(registerTriggerAsync, new Box(this, zzohVar, objArr2 == true ? 1 : 0, 20), objArr == true ? 1 : 0, 15), new zzjv(this, i));
            }
        }
    }

    public final void zzz(zzjl zzjlVar) {
        zzg();
        boolean z = (zzjlVar.zzo(zzjk.ANALYTICS_STORAGE) && zzjlVar.zzo(zzjk.AD_STORAGE)) || ((zzic) this.$$delegate_0).zzt().zzO();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        if (z != zzicVar.zzC) {
            zzhz zzhzVar2 = zzicVar.zzj;
            zzic.zzP(zzhzVar2);
            zzhzVar2.zzg();
            zzicVar.zzC = z;
            zzhh zzhhVar = ((zzic) this.$$delegate_0).zzh;
            zzic.zzN(zzhhVar);
            zzhhVar.zzg();
            Boolean valueOf = zzhhVar.zzd().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhhVar.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                zzaq(Boolean.valueOf(z), false);
            }
        }
    }
}
