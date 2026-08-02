package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0809w implements InterfaceC0867y {
    public final String a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) kotlin.collections.a.m0(V4.l().m().a(), Collections.singletonList(this.a))).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
