package com.anythink.expressad.video.module.a.a;

import android.app.Activity;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: X, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f21757X;

    /* renamed from: a, reason: collision with root package name */
    private Activity f21758a;

    private a(Activity activity, com.anythink.expressad.foundation.d.d dVar) {
        this.f21758a = activity;
        this.f21757X = dVar;
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        Activity activity;
        super.a(i, obj);
        if (i != 106 || (activity = this.f21758a) == null || this.f21757X == null) {
            return;
        }
        activity.finish();
    }
}
