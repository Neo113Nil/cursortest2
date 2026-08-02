package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import defpackage.tiu;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.kq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0415kq {
    public final D0 a;
    public final Rr b;
    public final C0533p c;
    public final Yn d;
    public final C0742w6 e;
    public final C0429lb f;

    public C0415kq(D0 d0, Rr rr) {
        this(d0, rr, R4.l().a(), R4.l().p(), R4.l().h(), R4.l().k());
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new tiu(17));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0415kq(D0 d0, Rr rr, C0533p c0533p, Yn yn, C0742w6 c0742w6, C0429lb c0429lb) {
        this.a = d0;
        this.b = rr;
        this.c = c0533p;
        this.d = yn;
        this.e = c0742w6;
        this.f = c0429lb;
    }
}
