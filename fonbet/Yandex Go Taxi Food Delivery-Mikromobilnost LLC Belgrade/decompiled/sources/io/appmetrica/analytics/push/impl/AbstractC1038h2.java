package io.appmetrica.analytics.push.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.push.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1038h2 {
    public static final int a(Context context) {
        M1 c = r.a(context).f.c();
        int i = c.a.getSharedPreferences(c.b, 0).getInt("pending_intent_id", 0);
        if (i < 1512312345 || i > 1512322343) {
            i = 1512312345;
        }
        int i2 = i + 1;
        c.a(i2);
        return i2;
    }
}
