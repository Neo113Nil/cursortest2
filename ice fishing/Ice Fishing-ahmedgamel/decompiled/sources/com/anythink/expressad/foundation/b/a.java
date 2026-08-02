package com.anythink.expressad.foundation.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19285a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f19286b;

    /* renamed from: c, reason: collision with root package name */
    private Context f19287c;

    /* renamed from: d, reason: collision with root package name */
    private String f19288d;

    /* renamed from: e, reason: collision with root package name */
    private String f19289e;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f19291g;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<Context> f19293j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<Activity> f19294k;

    /* renamed from: l, reason: collision with root package name */
    private String f19295l;

    /* renamed from: f, reason: collision with root package name */
    private int f19290f = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19292h = false;

    private a() {
    }

    public static a c() {
        if (f19286b == null) {
            synchronized (a.class) {
                try {
                    if (f19286b == null) {
                        f19286b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19286b;
    }

    public final void a(String str) {
        this.f19295l = str;
    }

    public final String b() {
        try {
            Context context = this.f19287c;
            if (context != null) {
                return context.getPackageName();
            }
            return null;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public final void d() {
        if (this.f19292h) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f19291g = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public final Context e() {
        return this.f19287c;
    }

    public final String f() {
        return !TextUtils.isEmpty(this.f19288d) ? this.f19288d : "";
    }

    public final String g() {
        return !TextUtils.isEmpty(this.f19289e) ? this.f19289e : "";
    }

    public final Context h() {
        WeakReference<Context> weakReference = this.f19293j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int i() {
        return this.f19290f;
    }

    public final JSONObject j() {
        return this.f19291g;
    }

    public final String a() {
        return this.f19295l;
    }

    public final void a(Context context) {
        this.f19287c = context;
    }

    private void a(int i) {
        this.f19290f = i;
    }

    public final void b(String str) {
        this.f19288d = str;
    }

    private void a(JSONObject jSONObject) {
        this.f19291g = jSONObject;
    }

    public final void b(Context context) {
        this.f19293j = new WeakReference<>(context);
    }

    public final void c(String str) {
        this.f19289e = str;
    }
}
