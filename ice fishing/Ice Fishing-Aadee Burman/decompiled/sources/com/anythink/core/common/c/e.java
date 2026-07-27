package com.anythink.core.common.c;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class e implements f {

    /* renamed from: a, reason: collision with root package name */
    static final int f12287a = 1;

    /* renamed from: b, reason: collision with root package name */
    static final int f12288b = 2;

    /* renamed from: c, reason: collision with root package name */
    static final int f12289c = 3;

    /* renamed from: d, reason: collision with root package name */
    protected final long f12290d = 86400000;

    /* renamed from: e, reason: collision with root package name */
    protected String f12291e;

    /* renamed from: f, reason: collision with root package name */
    protected Context f12292f;

    /* renamed from: g, reason: collision with root package name */
    protected String f12293g;

    /* renamed from: h, reason: collision with root package name */
    protected long f12294h;

    public e(Context context, String str, String str2, long j6) {
        this.f12291e = str;
        this.f12292f = context;
        this.f12293g = str2;
        this.f12294h = j6;
    }

    private String c() {
        return this.f12291e;
    }

    private String d() {
        return this.f12293g;
    }

    private long e() {
        return this.f12294h;
    }
}
