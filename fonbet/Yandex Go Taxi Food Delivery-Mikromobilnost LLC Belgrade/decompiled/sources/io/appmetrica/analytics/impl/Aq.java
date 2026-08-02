package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.i3y;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Aq implements InterfaceC0780v {
    public final C0838x b;
    public final C0809w a = new C0809w();
    public final i3y c = kotlin.a.a(new C0923zq(this));

    public Aq(Context context) {
        this.b = new C0838x(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0780v
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) this.c.getValue());
        return map;
    }
}
