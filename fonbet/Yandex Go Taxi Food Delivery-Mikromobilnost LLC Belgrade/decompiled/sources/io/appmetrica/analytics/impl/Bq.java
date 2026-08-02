package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import defpackage.quz;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* loaded from: classes9.dex */
public final class Bq {
    public final F0 a;
    public final ls b;
    public final C0607p c;
    public final C0747to d;
    public final C0903z6 e;
    public final C0792vb f;

    public Bq(F0 f0, ls lsVar) {
        this(f0, lsVar, V4.l().a(), V4.l().p(), V4.l().h(), V4.l().k());
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new quz(26));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public Bq(F0 f0, ls lsVar, C0607p c0607p, C0747to c0747to, C0903z6 c0903z6, C0792vb c0792vb) {
        this.a = f0;
        this.b = lsVar;
        this.c = c0607p;
        this.d = c0747to;
        this.e = c0903z6;
        this.f = c0792vb;
    }
}
