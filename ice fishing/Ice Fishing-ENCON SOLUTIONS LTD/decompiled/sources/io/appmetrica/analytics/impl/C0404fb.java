package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404fb extends JSONObject {
    public C0404fb() {
    }

    public final Long a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String b(String str) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public C0404fb(String str) {
        super(str);
    }
}
