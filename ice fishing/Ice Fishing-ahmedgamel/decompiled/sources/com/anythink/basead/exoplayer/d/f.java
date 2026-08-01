package com.anythink.basead.exoplayer.d;

import com.anythink.basead.exoplayer.d.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* loaded from: classes.dex */
public interface f<T extends i> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6854d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6855e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6856f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6857g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6858h = 4;

    public static class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int e();

    a f();

    T g();

    Map<String, String> h();

    byte[] i();
}
