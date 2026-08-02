package com.anythink.core.common.c;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class e implements f {

    /* renamed from: a, reason: collision with root package name */
    static final int f13073a = 1;

    /* renamed from: b, reason: collision with root package name */
    static final int f13074b = 2;

    /* renamed from: c, reason: collision with root package name */
    static final int f13075c = 3;

    /* renamed from: d, reason: collision with root package name */
    protected final long f13076d = 86400000;

    /* renamed from: e, reason: collision with root package name */
    protected String f13077e;

    /* renamed from: f, reason: collision with root package name */
    protected Context f13078f;

    /* renamed from: g, reason: collision with root package name */
    protected String f13079g;

    /* renamed from: h, reason: collision with root package name */
    protected long f13080h;

    public e(Context context, String str, String str2, long j6) {
        this.f13077e = str;
        this.f13078f = context;
        this.f13079g = str2;
        this.f13080h = j6;
    }

    private String c() {
        return this.f13077e;
    }

    private String d() {
        return this.f13079g;
    }

    private long e() {
        return this.f13080h;
    }
}
