package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.consent_sdk.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4320g {

    /* renamed from: d, reason: collision with root package name */
    public static final K f35675d = K.g(new Object[]{"IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String"}, 4);

    /* renamed from: a, reason: collision with root package name */
    public final Application f35676a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f35677b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f35678c;

    public C4320g(Application application) {
        this.f35676a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f35677b = sharedPreferences;
        this.f35678c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap a() {
        String str;
        Set<String> stringSet = this.f35677b.getStringSet("stored_info", N.f35572B);
        if (stringSet.isEmpty()) {
            stringSet = f35675d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.f35676a;
            C4344m a9 = E.a(application, str2);
            if (a9 == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str2)));
            } else {
                Object obj = application.getSharedPreferences((String) a9.f35716n, 0).getAll().get((String) a9.f35717u);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str2)));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str2)));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }
}
