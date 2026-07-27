package com.anythink.expressad.videocommon.c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f22346a;

    /* renamed from: b, reason: collision with root package name */
    private int f22347b;

    /* renamed from: c, reason: collision with root package name */
    private a f22348c;

    public b(int i, int i6, a aVar) {
        this.f22346a = i;
        this.f22347b = i6;
        this.f22348c = aVar;
    }

    private a c() {
        return this.f22348c;
    }

    public final int a() {
        return this.f22346a;
    }

    public final int b() {
        return this.f22347b;
    }

    private void a(int i) {
        this.f22346a = i;
    }

    private void b(int i) {
        this.f22347b = i;
    }

    private void a(a aVar) {
        this.f22348c = aVar;
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
