package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class r extends bj {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14039a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14040b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final String f14041c = "return_flag";

    /* renamed from: d, reason: collision with root package name */
    public static final String f14042d = "sdk_native_im_w";

    /* renamed from: e, reason: collision with root package name */
    public static final String f14043e = "sdk_native_im_h";
    private String aD;
    private String aE;
    private int aF = 1;
    private int aG;

    public final void a(String str) {
        this.aE = str;
    }

    public final void b(String str) {
        this.aD = str;
    }

    public final String d() {
        return this.aE;
    }

    public final String e() {
        return this.aD;
    }

    public final int f() {
        return this.aF;
    }

    public final int g() {
        return this.aG;
    }

    public final void a(int i) {
        this.aF = i;
    }

    @Override // com.anythink.core.common.h.w
    public final int b() {
        return this.aF == 1 ? 2 : 4;
    }

    public final void b(int i) {
        this.aG = i;
    }
}
