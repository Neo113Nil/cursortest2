package com.anythink.basead.l;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static final int f9954a = -1;

    /* renamed from: b, reason: collision with root package name */
    protected static final int f9955b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9956c = -3;

    /* renamed from: d, reason: collision with root package name */
    private String f9957d;

    private b(String str) {
        this.f9957d = "-1: ".concat(String.valueOf(str));
    }

    private void a(String str) {
        this.f9957d = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f9957d;
    }

    public b(String str, String str2) {
        this.f9957d = Wv.h(str, ": ", str2);
    }
}
