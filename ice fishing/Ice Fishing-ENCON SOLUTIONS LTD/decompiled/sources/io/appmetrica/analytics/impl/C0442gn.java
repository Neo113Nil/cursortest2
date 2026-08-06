package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442gn {

    /* renamed from: a, reason: collision with root package name */
    public final C0911z0 f6099a;

    /* renamed from: b, reason: collision with root package name */
    public final Ho f6100b;

    /* renamed from: c, reason: collision with root package name */
    public final C0625o f6101c;

    /* renamed from: d, reason: collision with root package name */
    public final Wk f6102d;

    /* renamed from: e, reason: collision with root package name */
    public final E5 f6103e;

    /* renamed from: f, reason: collision with root package name */
    public final C0326ca f6104f;

    public C0442gn(C0911z0 c0911z0, Ho ho, C0625o c0625o, Wk wk, E5 e5, C0326ca c0326ca) {
        this.f6099a = c0911z0;
        this.f6100b = ho;
        this.f6101c = c0625o;
        this.f6102d = wk;
        this.f6103e = e5;
        this.f6104f = c0326ca;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new H0.b(16));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0442gn(C0911z0 c0911z0, Ho ho) {
        this(c0911z0, ho, C0294b4.l().a(), C0294b4.l().o(), C0294b4.l().h(), C0294b4.l().k());
    }
}
