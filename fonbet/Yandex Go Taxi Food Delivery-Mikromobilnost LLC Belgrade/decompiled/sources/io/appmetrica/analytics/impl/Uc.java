package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Uc extends JSONObject {
    public Uc() {
    }

    public final Boolean a(String str) {
        try {
            return Boolean.valueOf(getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Long b(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String c(String str) {
        if (!has(str)) {
            return "";
        }
        try {
            return getString(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public Uc(String str) {
        super(str);
    }
}
