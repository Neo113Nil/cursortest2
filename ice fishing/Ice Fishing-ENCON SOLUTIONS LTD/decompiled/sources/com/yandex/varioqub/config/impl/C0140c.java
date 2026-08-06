package com.yandex.varioqub.config.impl;

import android.content.Context;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.yandex.varioqub.config.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140c {

    /* renamed from: a, reason: collision with root package name */
    public final i f2754a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2755b;

    /* renamed from: c, reason: collision with root package name */
    public final t f2756c;

    /* renamed from: d, reason: collision with root package name */
    public final C0138a f2757d;

    /* renamed from: e, reason: collision with root package name */
    public final u f2758e;

    /* renamed from: f, reason: collision with root package name */
    public long f2759f;

    /* renamed from: g, reason: collision with root package name */
    public long f2760g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f2761h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public String f2762i = "";

    /* renamed from: j, reason: collision with root package name */
    public String f2763j = "";

    /* renamed from: k, reason: collision with root package name */
    public String f2764k = "";

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f2765l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public boolean f2766m;

    public C0140c(i iVar, long j2, t tVar, C0138a c0138a, u uVar) {
        this.f2754a = iVar;
        this.f2755b = j2;
        this.f2756c = tVar;
        this.f2757d = c0138a;
        this.f2758e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v7, types: [i1.s] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map] */
    public final void a() {
        ?? r12;
        ConfigValue configValue;
        if (this.f2765l.compareAndSet(false, true)) {
            this.f2759f = m.a().getLong("last_fetched_time_ms_key", 0L);
            this.f2760g = m.a().getLong("last_successful_fetched_time_ms_key", 0L);
            String string = m.a().getString("experiments", "");
            if (string == null) {
                string = "";
            }
            this.f2763j = string;
            String string2 = m.a().getString("identifier", "");
            if (string2 == null) {
                string2 = "";
            }
            this.f2762i = string2;
            String string3 = m.a().getString("fetched_config_key", "");
            if (string3 == null || string3.length() == 0) {
                r12 = i1.s.f3417a;
            } else {
                JSONObject jSONObject = new JSONObject(string3);
                r12 = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string4 = jSONObject.getString(next);
                    if (string4 == null || string4.length() == 0) {
                        configValue = null;
                    } else {
                        JSONObject jSONObject2 = new JSONObject(string4);
                        configValue = new ConfigValue(jSONObject2.getString("value"), jSONObject2.getInt("sourceType"), jSONObject2.getLong("testId"));
                    }
                    if (configValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
                    }
                    r12.put(next, configValue);
                }
            }
            this.f2761h = new HashMap((Map) r12);
            Context context = AbstractC0141d.f2767a;
            if (context == null) {
                kotlin.jvm.internal.i.i("appContext");
                throw null;
            }
            this.f2766m = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getBoolean("should_notify_adapter", false);
        }
    }
}
