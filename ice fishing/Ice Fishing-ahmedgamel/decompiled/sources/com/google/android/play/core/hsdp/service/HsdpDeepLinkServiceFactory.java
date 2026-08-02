package com.google.android.play.core.hsdp.service;

import A1.C0265g;
import M.h;
import N3.A;
import N3.InterfaceC0324b;
import N3.m;
import N3.x;
import a.AbstractC0426a;
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
    public static InterfaceC0324b create(Activity activity) {
        return create(activity, false);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z6) {
        return z6 ? new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
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
    private static InterfaceC0324b createInternal(Context context, boolean z6, boolean z9) {
        boolean z10;
        boolean isRunningInUserTestHarness;
        if (!z9 && !(context instanceof Activity)) {
            throw new IllegalArgumentException("Context must be an Activity when using activity-based HSDP.");
        }
        if (z6 && !(context instanceof Activity)) {
            throw new IllegalArgumentException("Context must be an Activity when enabling loading panel.");
        }
        if (!ActivityManager.isRunningInTestHarness()) {
            if (Build.VERSION.SDK_INT >= 29) {
                isRunningInUserTestHarness = ActivityManager.isRunningInUserTestHarness();
            }
            z10 = false;
            return new m(context, AbstractC0426a.r(new h(context, z10)), AbstractC0426a.r(new C0265g(context, 2)), z10, z9, z6);
        }
        z10 = true;
        return new m(context, AbstractC0426a.r(new h(context, z10)), AbstractC0426a.r(new C0265g(context, 2)), z10, z9, z6);
    }

    public static /* synthetic */ x lambda$createInternal$0(Context context, boolean z6) {
        return new A(createHpoaServiceIntent(context, z6), (Activity) context);
    }

    @Keep
    public static InterfaceC0324b create(Activity activity, boolean z6) {
        return create(activity, z6, false);
    }

    @Keep
    public static InterfaceC0324b create(Activity activity, boolean z6, boolean z9) {
        return createInternal(activity, z6, z9);
    }

    @Keep
    public static InterfaceC0324b create(Context context) {
        return createInternal(context, false, true);
    }
}
