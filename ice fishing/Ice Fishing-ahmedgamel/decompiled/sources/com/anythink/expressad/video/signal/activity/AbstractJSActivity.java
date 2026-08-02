package com.anythink.expressad.video.signal.activity;

import android.content.res.Configuration;
import com.anythink.expressad.activity.ATBaseActivity;
import com.anythink.expressad.video.signal.b;
import com.anythink.expressad.video.signal.c;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.anythink.expressad.video.signal.factory.a;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import com.anythink.expressad.video.signal.j;

/* loaded from: classes.dex */
public abstract class AbstractJSActivity extends ATBaseActivity implements IJSFactory {

    /* renamed from: x, reason: collision with root package name */
    protected static final String f22626x = "AbstractJSActivity";

    /* renamed from: y, reason: collision with root package name */
    protected IJSFactory f22627y = new a();

    private static boolean b() {
        return false;
    }

    public final void a(IJSFactory iJSFactory) {
        this.f22627y = iJSFactory;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        return this.f22627y.getActivityProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f22627y.getIJSRewardVideoV1();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public b getJSBTModule() {
        return this.f22627y.getJSBTModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        return this.f22627y.getJSCommon();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        return this.f22627y.getJSContainerModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f22627y.getJSNotifyProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f22627y.getJSVideoModule();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (getJSCommon().g()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().g();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getJSCommon().g()) {
            getActivityProxy().a(configuration);
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (getJSCommon().g()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.anythink.expressad.foundation.f.b.f19836c) {
            return;
        }
        if (getJSCommon().g()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }
}
