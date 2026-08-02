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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.so, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3929so extends AbstractBinderC3359i8 {

    /* renamed from: n, reason: collision with root package name */
    public final C3708oi f34929n;

    /* renamed from: u, reason: collision with root package name */
    public final C3680o7 f34930u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f34931v;

    public BinderC3929so(C3708oi c3708oi, C3680o7 c3680o7) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        this.f34931v = new HashMap();
        this.f34929n = c3708oi;
        this.f34930u = c3680o7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s2.c1 U3(HashMap hashMap) {
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
        boolean z6 = false;
        int i4 = -1;
        String str2 = null;
        int i6 = 60000;
        if (str == null) {
            return new s2.c1(8, -1L, bundle3, -1, arrayList, false, -1, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, -1, null, arrayList3, 60000, null, 0, 0L, 0L, -1);
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
                            z6 = jsonReader.nextBoolean();
                            break;
                        case 3:
                            if (!jsonReader.nextBoolean()) {
                                i4 = 0;
                                break;
                            } else {
                                i4 = 1;
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
                            if (!m2.r.f39395d.contains(nextString)) {
                                break;
                            } else {
                                str2 = nextString;
                                break;
                            }
                        case 6:
                            i6 = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } catch (IOException unused) {
                    int i9 = w2.z.f41712b;
                    x2.i.a("Ad Request json was malformed, parsing ended early.");
                    int i10 = i;
                    ArrayList arrayList5 = arrayList;
                    String str3 = str2;
                    int i11 = i6;
                    new Bundle();
                    bundle = bundle4.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
                    if (bundle != null) {
                    }
                    return new s2.c1(8, -1L, bundle2, -1, arrayList5, z6, i4, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, i10, str3, arrayList3, i11, null, 0, 0L, 0L, -1);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused2) {
            i = -1;
        }
        int i102 = i;
        ArrayList arrayList52 = arrayList;
        String str32 = str2;
        int i112 = i6;
        new Bundle();
        bundle = bundle4.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle4.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
            bundle2 = bundle3;
        } else {
            bundle2 = bundle;
        }
        return new s2.c1(8, -1L, bundle2, -1, arrayList52, z6, i4, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, i102, str32, arrayList3, i112, null, 0, 0L, 0L, -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c2, code lost:
    
        if (r6.equals("create_interstitial_ad") != false) goto L56;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        boolean z6;
        boolean z9;
        HashMap hashMap = this.f34931v;
        char c9 = 0;
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            C3324ha c3324ha = AbstractC3592ma.qb;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                w2.z.k("Received H5 gmsg: ".concat(String.valueOf(readString)));
                Uri parse = Uri.parse(readString);
                w2.D d9 = C4906k.f40186C.f40191c;
                HashMap o4 = w2.D.o(parse);
                String str = (String) o4.get(NativeAdvancedJsUtils.f18693p);
                if (!TextUtils.isEmpty(str)) {
                    int hashCode = str.hashCode();
                    if (hashCode != 579053441) {
                        if (hashCode == 871091088 && str.equals("initialize")) {
                            z6 = false;
                        }
                        z6 = -1;
                    } else {
                        if (str.equals("dispose_all")) {
                            z6 = true;
                        }
                        z6 = -1;
                    }
                    C3680o7 c3680o7 = this.f34930u;
                    if (!z6) {
                        z9 = true;
                        hashMap.clear();
                        c3680o7.getClass();
                        c3680o7.q(new T8("initialize"));
                    } else if (!z6) {
                        String str2 = (String) o4.get("obj_id");
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
                            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                            z9 = true;
                            C3708oi c3708oi = this.f34929n;
                            switch (c9) {
                                case 0:
                                    if (hashMap.size() < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.rb)).intValue()) {
                                        Long valueOf = Long.valueOf(parseLong);
                                        if (!hashMap.containsKey(valueOf)) {
                                            String str3 = (String) o4.get("ad_unit");
                                            if (!TextUtils.isEmpty(str3)) {
                                                C3708oi c3708oi2 = c3708oi.f33711d;
                                                str3.getClass();
                                                hashMap.put(valueOf, new C4091vo(parseLong, c3708oi2.f33708a, new C3680o7(22, c3708oi2.f33709b), c3708oi.f33710c, str3));
                                                c3680o7.getClass();
                                                T8 t82 = new T8("creation");
                                                t82.f28478n = Long.valueOf(parseLong);
                                                t82.f28480v = "nativeObjectCreated";
                                                c3680o7.q(t82);
                                                StringBuilder sb = new StringBuilder(String.valueOf(parseLong).length() + 39 + str3.length());
                                                com.IceFishing.LiveIceFishing.k.z(sb, "Created H5 interstitial #", parseLong, " with ad unit ");
                                                sb.append(str3);
                                                w2.z.k(sb.toString());
                                                break;
                                            } else {
                                                x2.i.f("Could not create H5 ad, missing ad unit id");
                                                c3680o7.p(parseLong);
                                                break;
                                            }
                                        } else {
                                            x2.i.a("Could not create H5 ad, object ID already exists");
                                            c3680o7.p(parseLong);
                                            break;
                                        }
                                    } else {
                                        x2.i.f("Could not create H5 ad, too many existing objects");
                                        c3680o7.p(parseLong);
                                        break;
                                    }
                                case 1:
                                    InterfaceC3875ro interfaceC3875ro = (InterfaceC3875ro) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3875ro != null) {
                                        interfaceC3875ro.a(U3(o4));
                                        break;
                                    } else {
                                        x2.i.a("Could not load H5 ad, object ID does not exist");
                                        c3680o7.getClass();
                                        T8 t83 = new T8(com.anythink.expressad.foundation.g.a.f.f19909d);
                                        t83.f28478n = Long.valueOf(parseLong);
                                        t83.f28480v = "onNativeAdObjectNotAvailable";
                                        c3680o7.q(t83);
                                        break;
                                    }
                                case 2:
                                    InterfaceC3875ro interfaceC3875ro2 = (InterfaceC3875ro) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3875ro2 != null) {
                                        interfaceC3875ro2.f();
                                        break;
                                    } else {
                                        x2.i.a("Could not show H5 ad, object ID does not exist");
                                        c3680o7.getClass();
                                        T8 t84 = new T8(com.anythink.expressad.foundation.g.a.f.f19909d);
                                        t84.f28478n = Long.valueOf(parseLong);
                                        t84.f28480v = "onNativeAdObjectNotAvailable";
                                        c3680o7.q(t84);
                                        break;
                                    }
                                case 3:
                                    if (hashMap.size() < ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.rb)).intValue()) {
                                        Long valueOf2 = Long.valueOf(parseLong);
                                        if (!hashMap.containsKey(valueOf2)) {
                                            String str4 = (String) o4.get("ad_unit");
                                            if (!TextUtils.isEmpty(str4)) {
                                                C3708oi c3708oi3 = c3708oi.f33711d;
                                                str4.getClass();
                                                hashMap.put(valueOf2, new C4253yo(parseLong, c3708oi3.f33708a, new C3680o7(22, c3708oi3.f33709b), c3708oi.f33710c, str4));
                                                c3680o7.getClass();
                                                T8 t85 = new T8("creation");
                                                t85.f28478n = Long.valueOf(parseLong);
                                                t85.f28480v = "nativeObjectCreated";
                                                c3680o7.q(t85);
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(parseLong).length() + 35 + str4.length());
                                                com.IceFishing.LiveIceFishing.k.z(sb2, "Created H5 rewarded #", parseLong, " with ad unit ");
                                                sb2.append(str4);
                                                w2.z.k(sb2.toString());
                                                break;
                                            } else {
                                                x2.i.f("Could not create H5 ad, missing ad unit id");
                                                c3680o7.p(parseLong);
                                                break;
                                            }
                                        } else {
                                            x2.i.a("Could not create H5 ad, object ID already exists");
                                            c3680o7.p(parseLong);
                                            break;
                                        }
                                    } else {
                                        x2.i.f("Could not create H5 ad, too many existing objects");
                                        c3680o7.p(parseLong);
                                        break;
                                    }
                                case 4:
                                    InterfaceC3875ro interfaceC3875ro3 = (InterfaceC3875ro) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3875ro3 != null) {
                                        interfaceC3875ro3.a(U3(o4));
                                        break;
                                    } else {
                                        x2.i.a("Could not load H5 ad, object ID does not exist");
                                        c3680o7.getClass();
                                        T8 t86 = new T8("rewarded");
                                        t86.f28478n = Long.valueOf(parseLong);
                                        t86.f28480v = "onNativeAdObjectNotAvailable";
                                        c3680o7.q(t86);
                                        break;
                                    }
                                case 5:
                                    InterfaceC3875ro interfaceC3875ro4 = (InterfaceC3875ro) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC3875ro4 != null) {
                                        interfaceC3875ro4.f();
                                        break;
                                    } else {
                                        x2.i.a("Could not show H5 ad, object ID does not exist");
                                        c3680o7.getClass();
                                        T8 t87 = new T8("rewarded");
                                        t87.f28478n = Long.valueOf(parseLong);
                                        t87.f28480v = "onNativeAdObjectNotAvailable";
                                        c3680o7.q(t87);
                                        break;
                                    }
                                case 6:
                                    Long valueOf3 = Long.valueOf(parseLong);
                                    InterfaceC3875ro interfaceC3875ro5 = (InterfaceC3875ro) hashMap.get(valueOf3);
                                    if (interfaceC3875ro5 != null) {
                                        interfaceC3875ro5.i();
                                        hashMap.remove(valueOf3);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(parseLong).length() + 16);
                                        sb3.append("Disposed H5 ad #");
                                        sb3.append(parseLong);
                                        w2.z.k(sb3.toString());
                                        break;
                                    } else {
                                        x2.i.a("Could not dispose H5 ad, object ID does not exist");
                                        break;
                                    }
                                default:
                                    x2.i.a("H5 gmsg contained invalid action: ".concat(str));
                                    break;
                            }
                        } catch (NullPointerException | NumberFormatException unused) {
                            z9 = true;
                            x2.i.a("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str2)));
                        }
                    } else {
                        z9 = true;
                        Iterator it = hashMap.values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC3875ro) it.next()).i();
                        }
                        hashMap.clear();
                    }
                    parcel2.writeNoException();
                    return z9;
                }
                x2.i.a("H5 gmsg did not contain an action");
            }
        } else {
            if (i != 2) {
                return false;
            }
            hashMap.clear();
        }
        z9 = true;
        parcel2.writeNoException();
        return z9;
    }
}
