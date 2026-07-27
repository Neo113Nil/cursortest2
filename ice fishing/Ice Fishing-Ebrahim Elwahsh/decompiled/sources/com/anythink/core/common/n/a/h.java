package com.anythink.core.common.n.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f14975a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14977c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14978d;

    private h(String str, boolean z8, boolean z9) {
        this(str, z8, z9, (byte) 0);
    }

    private h(String str, boolean z8, boolean z9, byte b9) {
        this.f14975a = str;
        this.f14976b = z8;
        this.f14978d = z9;
        this.f14977c = 0;
    }

    private h(String str, boolean z8) {
        this(str, z8, false, (byte) 0);
    }

    public h(String str) {
        this(str, false, false, (byte) 0);
    }
}
