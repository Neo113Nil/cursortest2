package com.anythink.basead.l;

import com.icefishing.icefishingbigwin.AbstractC4404f;

/* loaded from: classes.dex */
public final class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static final int f9168a = -1;

    /* renamed from: b, reason: collision with root package name */
    protected static final int f9169b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9170c = -3;

    /* renamed from: d, reason: collision with root package name */
    private String f9171d;

    private b(String str) {
        this.f9171d = "-1: ".concat(String.valueOf(str));
    }

    private void a(String str) {
        this.f9171d = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f9171d;
    }

    public b(String str, String str2) {
        this.f9171d = AbstractC4404f.g(str, ": ", str2);
    }
}
