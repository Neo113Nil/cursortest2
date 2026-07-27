package com.google.android.play.core.hsdp.service;

import L3.A;
import L3.D;
import L3.InterfaceC0316b;
import L3.h;
import L3.i;
import L3.p;
import S0.f;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    @Keep
    public static InterfaceC0316b create(Activity activity) {
        return create(activity, false);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z3) {
        return z3 ? new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    public static Intent createHsdpServiceIntent() {
        return new Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r0 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static InterfaceC0316b createInternal(Context context, boolean z3, boolean z6) {
        boolean z9;
        boolean isRunningInUserTestHarness;
        if (!z6 && !(context instanceof Activity)) {
            throw new IllegalArgumentException("Context must be an Activity when using activity-based HSDP.");
        }
        if (z3 && !(context instanceof Activity)) {
            throw new IllegalArgumentException("Context must be an Activity when enabling loading panel.");
        }
        if (!ActivityManager.isRunningInTestHarness()) {
            if (Build.VERSION.SDK_INT >= 29) {
                isRunningInUserTestHarness = ActivityManager.isRunningInUserTestHarness();
            }
            z9 = false;
            return new p(context, f.w(new h(context, z9)), f.w(new i(context, 0)), z9, z6, z3);
        }
        z9 = true;
        return new p(context, f.w(new h(context, z9)), f.w(new i(context, 0)), z9, z6, z3);
    }

    public static /* synthetic */ A lambda$createInternal$0(Context context, boolean z3) {
        return new D(createHpoaServiceIntent(context, z3), (Activity) context);
    }

    @Keep
    public static InterfaceC0316b create(Activity activity, boolean z3) {
        return create(activity, z3, false);
    }

    @Keep
    public static InterfaceC0316b create(Activity activity, boolean z3, boolean z6) {
        return createInternal(activity, z3, z6);
    }

    @Keep
    public static InterfaceC0316b create(Context context) {
        return createInternal(context, false, true);
    }
}
