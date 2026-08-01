package com.anythink.core.common.f;

import android.content.Context;

/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f13173c;

    private c(Context context) {
        super(context);
        this.f13171b = 1;
    }

    public static c a(Context context) {
        if (f13173c == null) {
            synchronized (c.class) {
                try {
                    if (f13173c == null) {
                        f13173c = new c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13173c;
    }
}
