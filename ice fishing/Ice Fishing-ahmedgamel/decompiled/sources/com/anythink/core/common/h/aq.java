package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aq {

    /* renamed from: h, reason: collision with root package name */
    public static final String f14322h = "business_type";
    public static final int i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14323j = 1001;

    /* renamed from: a, reason: collision with root package name */
    public String f14324a;

    /* renamed from: b, reason: collision with root package name */
    public int f14325b;

    /* renamed from: c, reason: collision with root package name */
    public String f14326c;

    /* renamed from: d, reason: collision with root package name */
    public String f14327d;

    /* renamed from: e, reason: collision with root package name */
    public String f14328e;

    /* renamed from: f, reason: collision with root package name */
    public long f14329f;

    /* renamed from: g, reason: collision with root package name */
    public String f14330g;

    public static String a(int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f14322h, i4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String a() {
        return this.f14327d + "--extra: " + this.f14330g + "--requestType: " + this.f14325b + "--content:" + this.f14328e;
    }
}
