package com.anythink.basead.exoplayer.d;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class o extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6880a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6881b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f6882c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private o(int i) {
        this.f6882c = i;
    }

    public o(Exception exc) {
        super(exc);
        this.f6882c = 2;
    }
}
