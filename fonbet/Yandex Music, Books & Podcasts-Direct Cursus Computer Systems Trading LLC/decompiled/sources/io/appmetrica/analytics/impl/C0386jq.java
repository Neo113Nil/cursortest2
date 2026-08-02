package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.arf;
import defpackage.btf;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.jq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0386jq implements InterfaceC0677u {
    public final C0735w b;
    public final C0706v a = new C0706v();
    public final arf c = btf.b(new C0357iq(this));

    public C0386jq(@NotNull Context context) {
        this.b = new C0735w(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0677u
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.putAll((Map) this.c.getValue());
        return map;
    }
}
