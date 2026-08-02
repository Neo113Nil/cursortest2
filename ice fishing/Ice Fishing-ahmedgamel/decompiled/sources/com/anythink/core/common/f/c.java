package com.anythink.core.common.f;

import android.content.Context;

/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f13959c;

    private c(Context context) {
        super(context);
        this.f13957b = 1;
    }

    public static c a(Context context) {
        if (f13959c == null) {
            synchronized (c.class) {
                try {
                    if (f13959c == null) {
                        f13959c = new c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13959c;
    }
}
