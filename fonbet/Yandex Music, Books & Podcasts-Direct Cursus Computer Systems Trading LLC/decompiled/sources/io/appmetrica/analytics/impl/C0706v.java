package io.appmetrica.analytics.impl;

import defpackage.t75;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0706v implements InterfaceC0764x {
    public final String a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) CollectionsKt.g0(t75.c(this.a), R4.l().m().d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
