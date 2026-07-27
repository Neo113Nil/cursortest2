package com.onesignal.core.internal.application.impl;

import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.h;
import v7.C5135p;
import x4.f;

/* loaded from: classes2.dex */
public final class ActivityLifecycleInitializer implements B0.b {
    @Override // B0.b
    public List<Class<? extends B0.b>> dependencies() {
        return C5135p.f41439n;
    }

    @Override // B0.b
    public f create(Context context) {
        h.e(context, "context");
        a c0181a = a.Companion.getInstance();
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c0181a.attachToApplication(application);
        }
        return c0181a;
    }
}
