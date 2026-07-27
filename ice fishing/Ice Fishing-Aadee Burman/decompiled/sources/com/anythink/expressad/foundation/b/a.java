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
    public static final String f18498a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f18499b;

    /* renamed from: c, reason: collision with root package name */
    private Context f18500c;

    /* renamed from: d, reason: collision with root package name */
    private String f18501d;

    /* renamed from: e, reason: collision with root package name */
    private String f18502e;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f18504g;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<Context> f18506j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<Activity> f18507k;

    /* renamed from: l, reason: collision with root package name */
    private String f18508l;

    /* renamed from: f, reason: collision with root package name */
    private int f18503f = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18505h = false;

    private a() {
    }

    public static a c() {
        if (f18499b == null) {
            synchronized (a.class) {
                try {
                    if (f18499b == null) {
                        f18499b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18499b;
    }

    public final void a(String str) {
        this.f18508l = str;
    }

    public final String b() {
        try {
            Context context = this.f18500c;
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
        if (this.f18505h) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f18504g = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public final Context e() {
        return this.f18500c;
    }

    public final String f() {
        return !TextUtils.isEmpty(this.f18501d) ? this.f18501d : "";
    }

    public final String g() {
        return !TextUtils.isEmpty(this.f18502e) ? this.f18502e : "";
    }

    public final Context h() {
        WeakReference<Context> weakReference = this.f18506j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int i() {
        return this.f18503f;
    }

    public final JSONObject j() {
        return this.f18504g;
    }

    public final String a() {
        return this.f18508l;
    }

    public final void a(Context context) {
        this.f18500c = context;
    }

    private void a(int i) {
        this.f18503f = i;
    }

    public final void b(String str) {
        this.f18501d = str;
    }

    private void a(JSONObject jSONObject) {
        this.f18504g = jSONObject;
    }

    public final void b(Context context) {
        this.f18506j = new WeakReference<>(context);
    }

    public final void c(String str) {
        this.f18502e = str;
    }
}
