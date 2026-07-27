package com.anythink.core.common.f;

import android.content.Context;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: c, reason: collision with root package name */
    protected static volatile a f13172c;

    private b(Context context) {
        super(context);
        this.f13171b = 2;
    }

    public static a a(Context context) {
        if (f13172c == null) {
            synchronized (a.class) {
                try {
                    if (f13172c == null) {
                        f13172c = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13172c;
    }
}
