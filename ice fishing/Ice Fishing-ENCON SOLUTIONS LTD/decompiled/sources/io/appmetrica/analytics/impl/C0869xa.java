package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0869xa {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f7196a;

    static {
        HashSet hashSet = new HashSet();
        f7196a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return AbstractC0430gb.a(optJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
