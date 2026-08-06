package io.appmetrica.analytics.impl;

import a.AbstractC0083a;
import i1.AbstractC0252i;
import java.util.Collection;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780u implements InterfaceC0832w {

    /* renamed from: a, reason: collision with root package name */
    public final String f6959a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) AbstractC0252i.N(AbstractC0083a.m(this.f6959a), C0294b4.l().m().f5414d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
