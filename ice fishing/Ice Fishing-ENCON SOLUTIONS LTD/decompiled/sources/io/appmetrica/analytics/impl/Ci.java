package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class Ci {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f4267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4268b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4269c;

    public Ci(Context context, String str, String str2) {
        this.f4267a = context;
        this.f4268b = str;
        this.f4269c = str2;
    }

    public final Object a() {
        int identifier = this.f4267a.getResources().getIdentifier(this.f4268b, this.f4269c, this.f4267a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i2);
}
