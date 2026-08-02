package com.anythink.expressad.videocommon.c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f23133a;

    /* renamed from: b, reason: collision with root package name */
    private int f23134b;

    /* renamed from: c, reason: collision with root package name */
    private a f23135c;

    public b(int i, int i4, a aVar) {
        this.f23133a = i;
        this.f23134b = i4;
        this.f23135c = aVar;
    }

    private a c() {
        return this.f23135c;
    }

    public final int a() {
        return this.f23133a;
    }

    public final int b() {
        return this.f23134b;
    }

    private void a(int i) {
        this.f23133a = i;
    }

    private void b(int i) {
        this.f23134b = i;
    }

    private void a(a aVar) {
        this.f23135c = aVar;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new b(optInt, optInt2, optJSONObject2 != null ? a.a(optJSONObject2) : null));
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
