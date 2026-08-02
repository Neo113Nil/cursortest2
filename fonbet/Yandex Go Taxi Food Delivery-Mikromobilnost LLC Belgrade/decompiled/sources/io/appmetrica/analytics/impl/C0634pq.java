package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.pq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0634pq extends AbstractC0773ul {
    public C0634pq(Context context, String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0773ul
    public final Object a(int i) {
        return this.a.getResources().getStringArray(i);
    }

    public final String[] b(int i) {
        return this.a.getResources().getStringArray(i);
    }
}
