package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aq {

    /* renamed from: h, reason: collision with root package name */
    public static final String f13536h = "business_type";
    public static final int i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public static final int f13537j = 1001;

    /* renamed from: a, reason: collision with root package name */
    public String f13538a;

    /* renamed from: b, reason: collision with root package name */
    public int f13539b;

    /* renamed from: c, reason: collision with root package name */
    public String f13540c;

    /* renamed from: d, reason: collision with root package name */
    public String f13541d;

    /* renamed from: e, reason: collision with root package name */
    public String f13542e;

    /* renamed from: f, reason: collision with root package name */
    public long f13543f;

    /* renamed from: g, reason: collision with root package name */
    public String f13544g;

    public static String a(int i6) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f13536h, i6);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String a() {
        return this.f13541d + "--extra: " + this.f13544g + "--requestType: " + this.f13539b + "--content:" + this.f13542e;
    }
}
