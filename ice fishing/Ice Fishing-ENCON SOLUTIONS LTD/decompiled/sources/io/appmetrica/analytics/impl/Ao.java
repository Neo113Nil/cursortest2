package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Ao {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4165a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4166b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final C0857wo f4167c;

    /* renamed from: d, reason: collision with root package name */
    public final C0857wo f4168d;

    public Ao(Context context) {
        this.f4165a = context;
        C0300ba c0300ba = new C0300ba(context, "appmetrica_vital.dat");
        this.f4167c = new C0857wo(C0610na.k().y(), c0300ba);
        this.f4168d = new C0857wo(new Ze(C0610na.k().B().e(context)), c0300ba);
    }

    public final C0857wo a() {
        return this.f4167c;
    }

    public final C0857wo b() {
        return this.f4168d;
    }
}
