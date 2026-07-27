package com.anythink.basead.exoplayer;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class g extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7266a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7267b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7268c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final int f7269d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7270e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private g(int i, String str, Throwable th, int i6) {
        super(str, th);
        this.f7269d = i;
        this.f7270e = i6;
    }

    public static g a(Exception exc, int i) {
        return new g(1, null, exc, i);
    }

    private Exception b() {
        com.anythink.basead.exoplayer.k.a.b(this.f7269d == 1);
        return (Exception) getCause();
    }

    private RuntimeException c() {
        com.anythink.basead.exoplayer.k.a.b(this.f7269d == 2);
        return (RuntimeException) getCause();
    }

    public static g a(IOException iOException) {
        return new g(0, null, iOException, -1);
    }

    public static g a(RuntimeException runtimeException) {
        return new g(2, null, runtimeException, -1);
    }

    private IOException a() {
        com.anythink.basead.exoplayer.k.a.b(this.f7269d == 0);
        return (IOException) getCause();
    }
}
