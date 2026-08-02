package com.anythink.core.common.f;

import android.content.Context;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: c, reason: collision with root package name */
    protected static volatile a f13958c;

    private b(Context context) {
        super(context);
        this.f13957b = 2;
    }

    public static a a(Context context) {
        if (f13958c == null) {
            synchronized (a.class) {
                try {
                    if (f13958c == null) {
                        f13958c = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13958c;
    }
}
