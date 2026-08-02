package com.anythink.expressad.video.module.a.a;

import android.app.Activity;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: X, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f22544X;

    /* renamed from: a, reason: collision with root package name */
    private Activity f22545a;

    private a(Activity activity, com.anythink.expressad.foundation.d.d dVar) {
        this.f22545a = activity;
        this.f22544X = dVar;
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        Activity activity;
        super.a(i, obj);
        if (i != 106 || (activity = this.f22545a) == null || this.f22544X == null) {
            return;
        }
        activity.finish();
    }
}
