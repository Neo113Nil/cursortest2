package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.anythink.core.api.ATCustomRuleKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.wu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4151wu implements InterfaceC4097vu {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f35683a;

    public C4151wu(s2.c1 c1Var, String str, int i, String str2, s2.i1 i1Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(c1Var.f40418u));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(c1Var.f40419v));
        } else if (hashSet.contains("npa")) {
            arrayList.add(c1Var.f40419v.getString("npa"));
        }
        if (hashSet.contains(ATCustomRuleKeys.GENDER)) {
            arrayList.add(Integer.valueOf(c1Var.f40420w));
        }
        if (hashSet.contains("keywords")) {
            List list = c1Var.f40421x;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(c1Var.f40422y));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(c1Var.f40423z));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(c1Var.f40396A));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(c1Var.f40397B);
        }
        if (hashSet.contains("location")) {
            Location location = c1Var.f40399D;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(c1Var.f40400E);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(c1Var.f40401F));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(c1Var.f40402G));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = c1Var.f40403H;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(c1Var.f40404I);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(c1Var.J);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(c1Var.f40405K));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(c1Var.f40407M));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(c1Var.f40408N);
        }
        if (hashSet.contains("orientation")) {
            if (i1Var != null) {
                arrayList.add(Integer.valueOf(i1Var.f40476n));
            } else {
                arrayList.add(null);
            }
        }
        this.f35683a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4151wu) {
            return Arrays.equals(this.f35683a, ((C4151wu) obj).f35683a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35683a);
    }

    public final String toString() {
        Object[] objArr = this.f35683a;
        int hashCode = Arrays.hashCode(objArr);
        String arrays = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(hashCode).length() + 10 + String.valueOf(arrays).length() + 1);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
