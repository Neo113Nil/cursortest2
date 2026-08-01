package com.anythink.core.common.n.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f14818a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14820c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14821d;

    private h(String str, boolean z3, boolean z6) {
        this(str, z3, z6, (byte) 0);
    }

    private h(String str, boolean z3, boolean z6, byte b9) {
        this.f14818a = str;
        this.f14819b = z3;
        this.f14821d = z6;
        this.f14820c = 0;
    }

    private h(String str, boolean z3) {
        this(str, z3, false, (byte) 0);
    }

    public h(String str) {
        this(str, false, false, (byte) 0);
    }
}
