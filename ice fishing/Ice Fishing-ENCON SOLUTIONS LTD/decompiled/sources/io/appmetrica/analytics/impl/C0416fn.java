package io.appmetrica.analytics.impl;

import android.content.Context;
import h1.C0237g;
import h1.InterfaceC0233c;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416fn implements InterfaceC0754t {

    /* renamed from: b, reason: collision with root package name */
    public final C0806v f6028b;

    /* renamed from: a, reason: collision with root package name */
    public final C0780u f6027a = new C0780u();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0233c f6029c = R1.d.y(new C0390en(this));

    public C0416fn(Context context) {
        this.f6028b = new C0806v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0754t
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) ((C0237g) this.f6029c).a());
        return map;
    }
}
