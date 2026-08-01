package com.lumenpath.harispro.hrnavigator;

import B0.j;
import D1.i;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lumenpath.harispro.hrnavigator.databinding.ActivitySplashBinding;
import h.AbstractActivityC0168i;

/* loaded from: classes.dex */
public final class SplashActivity extends AbstractActivityC0168i {

    /* renamed from: x, reason: collision with root package name */
    public ActivitySplashBinding f2779x;

    @Override // h.AbstractActivityC0168i, b.AbstractActivityC0113i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivitySplashBinding inflate = ActivitySplashBinding.inflate(getLayoutInflater());
        this.f2779x = inflate;
        if (inflate == null) {
            i.i("binding");
            throw null;
        }
        setContentView(inflate.getRoot());
        ActivitySplashBinding activitySplashBinding = this.f2779x;
        if (activitySplashBinding == null) {
            i.i("binding");
            throw null;
        }
        ConstraintLayout root = activitySplashBinding.getRoot();
        i.d(root, "getRoot(...)");
        root.postDelayed(new j(4, this), 2000L);
    }
}
