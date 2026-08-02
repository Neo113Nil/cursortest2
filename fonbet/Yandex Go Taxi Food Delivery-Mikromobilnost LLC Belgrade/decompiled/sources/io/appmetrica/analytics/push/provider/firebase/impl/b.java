package io.appmetrica.analytics.push.provider.firebase.impl;

import defpackage.i3y;

/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public final Throwable b;
    public final i3y c;

    public b(String str, Throwable th) {
        this.a = str;
        this.b = th;
        this.c = kotlin.a.a(new a(this));
    }

    public /* synthetic */ b(String str, Throwable th, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }
}
