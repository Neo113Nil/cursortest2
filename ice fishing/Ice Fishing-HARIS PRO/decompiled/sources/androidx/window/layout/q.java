package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class q implements ComponentCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f2242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f2243b;

    public q(r rVar, Activity activity) {
        this.f2242a = rVar;
        this.f2243b = activity;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        D1.i.e(configuration, "newConfig");
        r rVar = this.f2242a;
        M0.h hVar = rVar.e;
        if (hVar == null) {
            return;
        }
        Activity activity = this.f2243b;
        hVar.j(activity, rVar.e(activity));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
