package com.anythink.basead.exoplayer.d;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class o extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7666a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7667b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f7668c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private o(int i) {
        this.f7668c = i;
    }

    public o(Exception exc) {
        super(exc);
        this.f7668c = 2;
    }
}
