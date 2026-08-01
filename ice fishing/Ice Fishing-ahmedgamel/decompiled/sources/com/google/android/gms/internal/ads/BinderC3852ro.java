package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.JsonReader;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.ro, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3852ro extends AbstractBinderC3336i8 {

    /* renamed from: n, reason: collision with root package name */
    public final C3685oi f33747n;

    /* renamed from: u, reason: collision with root package name */
    public final C3657o7 f33748u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f33749v;

    public BinderC3852ro(C3685oi c3685oi, C3657o7 c3657o7) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        this.f33749v = new HashMap();
        this.f33747n = c3685oi;
        this.f33748u = c3657o7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q2.c1 U3(HashMap hashMap) {
        int i;
        Bundle bundle;
        Bundle bundle2;
        char c9;
        Bundle bundle3 = new Bundle();
        ArrayList arrayList = new ArrayList();
        Bundle bundle4 = new Bundle();
        Bundle bundle5 = new Bundle();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str = (String) hashMap.get("ad_request");
        boolean z3 = false;
        int i6 = -1;
        String str2 = null;
        int i9 = 60000;
        if (str == null) {
            return new q2.c1(8, -1L, bundle3, -1, arrayList, false, -1, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, -1, null, arrayList3, 60000, null, 0, 0L, 0L, -1);
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            i = -1;
            while (jsonReader.hasNext()) {
                try {
                    String nextName = jsonReader.nextName();
                    switch (nextName.hashCode()) {
                        case -1289032093:
                            if (nextName.equals("extras")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -839117230:
                            if (nextName.equals("isTestDevice")) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -733436947:
                            if (nextName.equals("tagForUnderAgeOfConsent")) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -99890337:
                            if (nextName.equals("httpTimeoutMillis")) {
                                c9 = 6;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 523149226:
                            if (nextName.equals("keywords")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 597632527:
                            if (nextName.equals("maxAdContentRating")) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1411582723:
                            if (nextName.equals("tagForChildDirectedTreatment")) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                        case 0:
                            jsonReader.beginObject();
                            Bundle bundle6 = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle6.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            bundle3 = bundle6;
                            break;
                        case 1:
                            jsonReader.beginArray();
                            ArrayList arrayList4 = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList4.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            arrayList = arrayList4;
                            break;
                        case 2:
                            z3 = jsonReader.nextBoolean();
                            break;
                        case 3:
                            if (!jsonReader.nextBoolean()) {
                                i6 = 0;
                                break;
                            } else {
                                i6 = 1;
                                break;
                            }
                        case 4:
                            if (!jsonReader.nextBoolean()) {
                                i = 0;
                                break;
                            } else {
                                i = 1;
                                break;
                            }
                        case 5:
                            String nextString = jsonReader.nextString();
                            if (!k2.r.f38606d.contains(nextString)) {
                                break;
                            } else {
                                str2 = nextString;
                                break;
                            }
                        case 6:
                            i9 = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } catch (IOException unused) {
                    int i10 = u2.z.f41322b;
                    v2.i.a("Ad Request json was malformed, parsing ended early.");
                    int i11 = i;
                    ArrayList arrayList5 = arrayList;
                    String str3 = str2;
                    int i12 = i9;
                    new Bundle();
                    bundle = bundle4.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
                    if (bundle != null) {
                    }
                    return new q2.c1(8, -1L, bundle2, -1, arrayList5, z3, i6, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, i11, str3, arrayList3, i12, null, 0, 0L, 0L, -1);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused2) {
            i = -1;
        }
        int i112 = i;
        ArrayList arrayList52 = arrayList;
        String str32 = str2;
        int i122 = i9;
        new Bundle();
        bundle = bundle4.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle4.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
            bundle2 = bundle3;
        } else {
            bundle2 = bundle;
        }
        return new q2.c1(8, -1L, bundle2, -1, arrayList52, z3, i6, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, i112, str32, arrayList3, i122, null, 0, 0L, 0L, -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c2, code lost:
    
        if (r6.equals("create_interstitial_ad") != false) goto L56;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        boolean z3;
        boolean z6;
        HashMap hashMap = this.f33749v;
        char c9 = 0;
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            C3301ha c3301ha = AbstractC3569ma.qb;
            q2.r rVar = q2.r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                u2.z.k("Received H5 gmsg: ".concat(String.valueOf(readString)));
                Uri parse = Uri.parse(readString);
                u2.D d2 = C4835j.f39733C.f39738c;
                HashMap o6 = u2.D.o(parse);
                String str = (String) o6.get(NativeAdvancedJsUtils.f17906p);
                if (!TextUtils.isEmpty(str)) {
                    int hashCode = str.hashCode();
                    if (hashCode != 579053441) {
                        if (hashCode == 871091088 && str.equals("initialize")) {
                            z3 = false;
                        }
                        z3 = -1;
                    } else {
                        if (str.equals("dispose_all")) {
                            z3 = true;
                        }
                        z3 = -1;
                    }
                    C3657o7 c3657o7 = this.f33748u;
                    if (!z3) {
                        z6 = true;
                        hashMap.clear();
                        c3657o7.getClass();
                        c3657o7.p(new T8("initialize"));
                    } else if (!z3) {
                        String str2 = (String) o6.get("obj_id");
                        try {
                            Objects.requireNonNull(str2);
                            long parseLong = Long.parseLong(str2);
                            switch (str.hashCode()) {
                                case -1790951212:
                                    if (str.equals("show_interstitial_ad")) {
                                        c9 = 2;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1266374734:
                                    if (str.equals("show_rewarded_ad")) {
                                        c9 = 5;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -257098725:
                                    if (str.equals("load_rewarded_ad")) {
                                        c9 = 4;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 393881811:
                                    break;
                                case 585513149:
                                    if (str.equals("load_interstitial_ad")) {
                                        c9 = 1;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 1671767583:
                                    if (str.equals("dispose")) {
                                        c9 = 6;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 2109237041:
                                    if (str.equals("create_rewarded_ad")) {
                                        c9 = 3;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                default:
                                    c9 = 65535;
                                    break;
                            }
                            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
                            z6 = true;
                            C3685oi c3685oi = this.f33747n;
                            switch (c9) {
                                case 0:
                                    if (hashMap.size() < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.rb)).intValue()) {
                                        Long valueOf = Long.valueOf(parseLong);
                                        if (!hashMap.containsKey(valueOf)) {
                                            String str3 = (String) o6.get("ad_unit");
                                            if (!TextUtils.isEmpty(str3)) {
                                                C3685oi c3685oi2 = c3685oi.f32925d;
                                                str3.getClass();
                                                hashMap.put(valueOf, new C4014uo(parseLong, c3685oi2.f32922a, new C3657o7(22, c3685oi2.f32923b), c3685oi.f32924c, str3));
                                                c3657o7.getClass();
                                                T8 t82 = new T8("creation");
                                                t82.f27695n = Long.valueOf(parseLong);
                                                t82.f27697v = "nativeObjectCreated";
                                                c3657o7.p(t82);
                                                StringBuilder sb = new StringBuilder(String.valueOf(parseLong).length() + 39 + str3.length());
                                                D.y.x(sb, "Created H5 interstitial #", parseLong, " with ad unit ");
                                                sb.append(str3);
                                                u2.z.k(sb.toString());
                                                break;
                                            } else {
                                                v2.i.f("Could not create H5 ad, missing ad unit id");
                                                c3657o7.m(parseLong);
                                                break;
                                            }
                                        } else {
                                            v2.i.a("Could not create H5 ad, object ID already exists");
                                            c3657o7.m(parseLong);
                                            break;
                                        }
                                    } else {
                                        v2.i.f("Could not create H5 ad, too many existing objects");
                                        c3657o7.m(parseLong);
                                        break;
                                    }
                                case 1:
                                    InterfaceC3799qo interfaceC3799qo = (InterfaceC3799qo) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3799qo != null) {
                                        interfaceC3799qo.a(U3(o6));
                                        break;
                                    } else {
                                        v2.i.a("Could not load H5 ad, object ID does not exist");
                                        c3657o7.getClass();
                                        T8 t83 = new T8(com.anythink.expressad.foundation.g.a.f.f19122d);
                                        t83.f27695n = Long.valueOf(parseLong);
                                        t83.f27697v = "onNativeAdObjectNotAvailable";
                                        c3657o7.p(t83);
                                        break;
                                    }
                                case 2:
                                    InterfaceC3799qo interfaceC3799qo2 = (InterfaceC3799qo) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3799qo2 != null) {
                                        interfaceC3799qo2.f();
                                        break;
                                    } else {
                                        v2.i.a("Could not show H5 ad, object ID does not exist");
                                        c3657o7.getClass();
                                        T8 t84 = new T8(com.anythink.expressad.foundation.g.a.f.f19122d);
                                        t84.f27695n = Long.valueOf(parseLong);
                                        t84.f27697v = "onNativeAdObjectNotAvailable";
                                        c3657o7.p(t84);
                                        break;
                                    }
                                case 3:
                                    if (hashMap.size() < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.rb)).intValue()) {
                                        Long valueOf2 = Long.valueOf(parseLong);
                                        if (!hashMap.containsKey(valueOf2)) {
                                            String str4 = (String) o6.get("ad_unit");
                                            if (!TextUtils.isEmpty(str4)) {
                                                C3685oi c3685oi3 = c3685oi.f32925d;
                                                str4.getClass();
                                                hashMap.put(valueOf2, new C4176xo(parseLong, c3685oi3.f32922a, new C3657o7(22, c3685oi3.f32923b), c3685oi.f32924c, str4));
                                                c3657o7.getClass();
                                                T8 t85 = new T8("creation");
                                                t85.f27695n = Long.valueOf(parseLong);
                                                t85.f27697v = "nativeObjectCreated";
                                                c3657o7.p(t85);
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(parseLong).length() + 35 + str4.length());
                                                D.y.x(sb2, "Created H5 rewarded #", parseLong, " with ad unit ");
                                                sb2.append(str4);
                                                u2.z.k(sb2.toString());
                                                break;
                                            } else {
                                                v2.i.f("Could not create H5 ad, missing ad unit id");
                                                c3657o7.m(parseLong);
                                                break;
                                            }
                                        } else {
                                            v2.i.a("Could not create H5 ad, object ID already exists");
                                            c3657o7.m(parseLong);
                                            break;
                                        }
                                    } else {
                                        v2.i.f("Could not create H5 ad, too many existing objects");
                                        c3657o7.m(parseLong);
                                        break;
                                    }
                                case 4:
                                    InterfaceC3799qo interfaceC3799qo3 = (InterfaceC3799qo) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3799qo3 != null) {
                                        interfaceC3799qo3.a(U3(o6));
                                        break;
                                    } else {
                                        v2.i.a("Could not load H5 ad, object ID does not exist");
                                        c3657o7.getClass();
                                        T8 t86 = new T8("rewarded");
                                        t86.f27695n = Long.valueOf(parseLong);
                                        t86.f27697v = "onNativeAdObjectNotAvailable";
                                        c3657o7.p(t86);
                                        break;
                                    }
                                case 5:
                                    InterfaceC3799qo interfaceC3799qo4 = (InterfaceC3799qo) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3799qo4 != null) {
                                        interfaceC3799qo4.f();
                                        break;
                                    } else {
                                        v2.i.a("Could not show H5 ad, object ID does not exist");
                                        c3657o7.getClass();
                                        T8 t87 = new T8("rewarded");
                                        t87.f27695n = Long.valueOf(parseLong);
                                        t87.f27697v = "onNativeAdObjectNotAvailable";
                                        c3657o7.p(t87);
                                        break;
                                    }
                                case 6:
                                    Long valueOf3 = Long.valueOf(parseLong);
                                    InterfaceC3799qo interfaceC3799qo5 = (InterfaceC3799qo) hashMap.get(valueOf3);
                                    if (interfaceC3799qo5 != null) {
                                        interfaceC3799qo5.i();
                                        hashMap.remove(valueOf3);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(parseLong).length() + 16);
                                        sb3.append("Disposed H5 ad #");
                                        sb3.append(parseLong);
                                        u2.z.k(sb3.toString());
                                        break;
                                    } else {
                                        v2.i.a("Could not dispose H5 ad, object ID does not exist");
                                        break;
                                    }
                                default:
                                    v2.i.a("H5 gmsg contained invalid action: ".concat(str));
                                    break;
                            }
                        } catch (NullPointerException | NumberFormatException unused) {
                            z6 = true;
                            v2.i.a("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str2)));
                        }
                    } else {
                        z6 = true;
                        Iterator it = hashMap.values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC3799qo) it.next()).i();
                        }
                        hashMap.clear();
                    }
                    parcel2.writeNoException();
                    return z6;
                }
                v2.i.a("H5 gmsg did not contain an action");
            }
        } else {
            if (i != 2) {
                return false;
            }
            hashMap.clear();
        }
        z6 = true;
        parcel2.writeNoException();
        return z6;
    }
}
