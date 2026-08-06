package com.yandex.varioqub.config;

import android.util.Log;
import com.yandex.varioqub.config.impl.C;
import i1.u;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class VarioqubSettings {

    /* renamed from: a, reason: collision with root package name */
    private final String f2725a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2726b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2727c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2728d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2729e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f2730f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2731g;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f2732a;

        /* renamed from: b, reason: collision with root package name */
        private String f2733b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2736e;

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f2734c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        private long f2735d = 43200;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2737f = true;

        public Builder(String str) {
            this.f2732a = str;
            if (str.length() <= 0) {
                throw new IllegalArgumentException("ClientId must not be empty");
            }
        }

        public final VarioqubSettings build() {
            return new VarioqubSettings(this.f2732a, this.f2733b, this.f2735d, this.f2736e, this.f2737f, u.N(this.f2734c), null);
        }

        public final Builder withActivateEvent(boolean z2) {
            this.f2737f = z2;
            return this;
        }

        public final Builder withClientFeature(String str, String str2) {
            this.f2734c.put(str, str2);
            return this;
        }

        public final Builder withLogs() {
            this.f2736e = true;
            return this;
        }

        public final Builder withThrottleInterval(long j2) {
            if (j2 <= 0) {
                throw new IllegalArgumentException("Fetch timeout must be a positive number");
            }
            this.f2735d = j2;
            return this;
        }

        public final Builder withUrl(String str) {
            this.f2733b = str;
            return this;
        }
    }

    public /* synthetic */ VarioqubSettings(String str, String str2, long j2, boolean z2, boolean z3, Map map, e eVar) {
        this(str, str2, j2, z2, z3, map);
    }

    public final void clearClientFeatures$config_release() {
        this.f2730f.clear();
        String str = this.f2731g;
        if (C.f2746a) {
            Log.d("Varioqub/" + str, "Client features was cleaned");
        }
    }

    public final boolean getActivateEvent$config_release() {
        return this.f2729e;
    }

    public final Map<String, String> getClientFeatures$config_release() {
        return u.M(this.f2730f);
    }

    public final String getClientId$config_release() {
        return this.f2725a;
    }

    public final long getFetchThrottleIntervalSec$config_release() {
        return this.f2727c;
    }

    public final boolean getLogs$config_release() {
        return this.f2728d;
    }

    public final String getUrl$config_release() {
        return this.f2726b;
    }

    public final void putClientFeature$config_release(String str, String str2) {
        String str3 = (String) this.f2730f.put(str, str2);
        if (str3 != null) {
            String str4 = this.f2731g;
            String str5 = "Client feature with key - " + str + " and value - " + str3 + " was replaced with new value - " + str2;
            if (C.f2746a) {
                Log.d("Varioqub/" + str4, str5);
            }
        }
    }

    private VarioqubSettings(String str, String str2, long j2, boolean z2, boolean z3, Map map) {
        this.f2725a = str;
        this.f2726b = str2;
        this.f2727c = j2;
        this.f2728d = z2;
        this.f2729e = z3;
        this.f2730f = map;
        this.f2731g = "VarioqubSettings";
    }
}
