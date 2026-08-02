package com.squareup.cash;

import android.app.Application;
import app.cash.util.leakdetector.api.LeakDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.featureflags.ContainerMode;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.ui.gcm.SandboxedCashWorkerFactoryProvider;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public abstract class BaseApplication extends Application {
    public static final int $stable = 8;
    private VariantAppComponent appComponent;
    protected Deferred sandboxedComponentFlow;

    public static /* synthetic */ void getSandboxedComponentFlow$annotations() {
    }

    public final VariantAppComponent appComponent() {
        VariantAppComponent variantAppComponent = this.appComponent;
        if (variantAppComponent != null) {
            return variantAppComponent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appComponent");
        throw null;
    }

    public final VariantSandboxedComponent buildSandboxedComponent(CoroutineScope coroutineScope, StorageLink storageLink, Application application) {
        coroutineScope.getClass();
        storageLink.getClass();
        application.getClass();
        VariantAppComponent appComponent = appComponent();
        appComponent.getClass();
        VariantSandboxedComponent.Impl impl = new VariantSandboxedComponent.Impl(appComponent, storageLink, coroutineScope);
        JobKt.launch$default(coroutineScope, null, null, new RealGcmRegistrar$unregister$2(impl, application, null, 8), 3);
        return impl;
    }

    public final Deferred getSandboxedComponentFlow() {
        Deferred deferred = this.sandboxedComponentFlow;
        if (deferred != null) {
            return deferred;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sandboxedComponentFlow");
        throw null;
    }

    public final void initializeAppComponent(Application application, SandboxedCashWorkerFactoryProvider sandboxedCashWorkerFactoryProvider, Flow flow, BugsnagClient bugsnagClient, LeakDetector leakDetector) {
        application.getClass();
        sandboxedCashWorkerFactoryProvider.getClass();
        flow.getClass();
        bugsnagClient.getClass();
        leakDetector.getClass();
        if (this.appComponent != null) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        } else {
            ContainerMode[] containerModeArr = ContainerMode.$VALUES;
            this.appComponent = new VariantAppComponent.Impl(application, sandboxedCashWorkerFactoryProvider, flow, bugsnagClient, leakDetector);
        }
    }

    public final boolean isRunningInTestMode() {
        return false;
    }

    public final void setSandboxedComponentFlow(Deferred deferred) {
        deferred.getClass();
        this.sandboxedComponentFlow = deferred;
    }

    public final boolean shouldReportToRealBugsnag(Application application) {
        application.getClass();
        return true;
    }
}
