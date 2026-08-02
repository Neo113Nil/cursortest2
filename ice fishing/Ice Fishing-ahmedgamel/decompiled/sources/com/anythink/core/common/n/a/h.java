package com.anythink.core.common.n.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f15604a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15606c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15607d;

    private h(String str, boolean z6, boolean z9) {
        this(str, z6, z9, (byte) 0);
    }

    private h(String str, boolean z6, boolean z9, byte b9) {
        this.f15604a = str;
        this.f15605b = z6;
        this.f15607d = z9;
        this.f15606c = 0;
    }

    private h(String str, boolean z6) {
        this(str, z6, false, (byte) 0);
    }

    public h(String str) {
        this(str, false, false, (byte) 0);
    }
}
