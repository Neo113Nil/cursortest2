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

/* renamed from: com.google.android.gms.internal.ads.yu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4249yu implements InterfaceC4195xu {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f35423a;

    public C4249yu(q2.d1 d1Var, String str, int i, String str2, q2.j1 j1Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(d1Var.f40030u));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(d1Var.f40031v));
        } else if (hashSet.contains("npa")) {
            arrayList.add(d1Var.f40031v.getString("npa"));
        }
        if (hashSet.contains(ATCustomRuleKeys.GENDER)) {
            arrayList.add(Integer.valueOf(d1Var.f40032w));
        }
        if (hashSet.contains("keywords")) {
            List list = d1Var.f40033x;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(d1Var.f40034y));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(d1Var.f40035z));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(d1Var.f40008A));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(d1Var.f40009B);
        }
        if (hashSet.contains("location")) {
            Location location = d1Var.f40011D;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(d1Var.f40012E);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(d1Var.f40013F));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(d1Var.f40014G));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = d1Var.f40015H;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(d1Var.f40016I);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(d1Var.J);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(d1Var.f40017K));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(d1Var.f40019M));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(d1Var.f40020N);
        }
        if (hashSet.contains("orientation")) {
            if (j1Var != null) {
                arrayList.add(Integer.valueOf(j1Var.f40090n));
            } else {
                arrayList.add(null);
            }
        }
        this.f35423a = arrayList.toArray();
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
        if (obj instanceof C4249yu) {
            return Arrays.equals(this.f35423a, ((C4249yu) obj).f35423a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35423a);
    }

    public final String toString() {
        Object[] objArr = this.f35423a;
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
