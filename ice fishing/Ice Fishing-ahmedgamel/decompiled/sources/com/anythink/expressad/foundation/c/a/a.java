package com.anythink.expressad.foundation.c.a;

import com.anythink.expressad.foundation.g.a.d;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private d f18525a;

    /* renamed from: com.anythink.expressad.foundation.c.a.a$a, reason: collision with other inner class name */
    public static class C0119a {

        /* renamed from: a, reason: collision with root package name */
        private static a f18526a = new a(0);

        private C0119a() {
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    public static a a() {
        return C0119a.f18526a;
    }

    private JSONArray b() {
        return new JSONArray((Collection) this.f18525a.a());
    }

    private a() {
        this.f18525a = new d();
    }

    public final JSONObject a(String str) {
        JSONObject b9 = this.f18525a.b(str);
        if (b9 != null) {
            return b9;
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f18525a.a(next, jSONObject.optJSONObject(next));
            }
        }
    }
}
