package com.yandex.varioqub.config.impl;

import android.content.Context;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public Map f2814a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map f2815b = i1.s.f3417a;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f2816c = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [i1.s] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap] */
    public final void a() {
        ?? r02;
        ConfigValue configValue;
        if (this.f2816c.compareAndSet(false, true)) {
            Context context = AbstractC0141d.f2767a;
            if (context == null) {
                kotlin.jvm.internal.i.i("appContext");
                throw null;
            }
            String string = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getString("activated_config_key", "");
            if (string == null || string.length() == 0) {
                r02 = i1.s.f3417a;
            } else {
                JSONObject jSONObject = new JSONObject(string);
                r02 = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string2 = jSONObject.getString(next);
                    if (string2 == null || string2.length() == 0) {
                        configValue = null;
                    } else {
                        JSONObject jSONObject2 = new JSONObject(string2);
                        configValue = new ConfigValue(jSONObject2.getString("value"), jSONObject2.getInt("sourceType"), jSONObject2.getLong("testId"));
                    }
                    if (configValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
                    }
                    r02.put(next, configValue);
                }
            }
            this.f2815b = r02;
        }
    }
}
