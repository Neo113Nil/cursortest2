package com.squareup.cash.filament.engine;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.camera.viewfinder.core.impl.CloseGuardApi30Impl;
import androidx.camera.viewfinder.core.impl.CloseGuardImpl;
import com.bumptech.glide.GlideBuilder$1;
import com.google.android.filament.Renderer;
import com.squareup.cash.graphics.views.GraphicsError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;

/* loaded from: classes6.dex */
public final class FilamentDisplayHelper implements AutoCloseable {
    public final /* synthetic */ int $r8$classId;
    public Object display;
    public final Object mDisplayManager;
    public Object mListener;
    public Object mRenderer;

    public FilamentDisplayHelper(Surface surface, ViewfinderSurfaceRequest viewfinderSurfaceRequest, Threads$$ExternalSyntheticLambda1 threads$$ExternalSyntheticLambda1) {
        this.$r8$classId = 1;
        this.mDisplayManager = surface;
        this.display = threads$$ExternalSyntheticLambda1;
        this.mRenderer = AtomicFU.atomic(false);
        Toolbar.AnonymousClass1 anonymousClass1 = Build.VERSION.SDK_INT >= 30 ? new Toolbar.AnonymousClass1(new CloseGuardApi30Impl(0)) : new Toolbar.AnonymousClass1(new GlideBuilder$1());
        ((CloseGuardImpl) anonymousClass1.this$0).open();
        this.mListener = anonymousClass1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.$r8$classId) {
            case 0:
                detach();
                break;
            default:
                ((CloseGuardImpl) ((Toolbar.AnonymousClass1) this.mListener).this$0).close();
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.mRenderer;
                atomicBoolean.getClass();
                if (AtomicBoolean.FU.getAndSet(atomicBoolean, 1) != 1) {
                    ((Threads$$ExternalSyntheticLambda1) this.display).invoke();
                    break;
                }
                break;
        }
    }

    public void detach() {
        FilamentDisplayHelper$attach$1 filamentDisplayHelper$attach$1 = (FilamentDisplayHelper$attach$1) this.mListener;
        if (filamentDisplayHelper$attach$1 != null) {
            ((DisplayManager) this.mDisplayManager).unregisterDisplayListener(filamentDisplayHelper$attach$1);
            this.mListener = null;
            this.display = null;
            this.mRenderer = null;
        }
    }

    public void finalize() {
        switch (this.$r8$classId) {
            case 1:
                ((CloseGuardImpl) ((Toolbar.AnonymousClass1) this.mListener).this$0).warnIfOpen();
                close();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public void updateDisplayInfo() {
        try {
            Renderer renderer = (Renderer) this.mRenderer;
            renderer.getClass();
            Display display = (Display) this.display;
            display.getClass();
            Renderer renderer2 = (Renderer) this.mRenderer;
            renderer2.getClass();
            if (renderer2.mDisplayInfo == null) {
                renderer2.mDisplayInfo = new Renderer.DisplayInfo(0);
            }
            Renderer.DisplayInfo displayInfo = renderer2.mDisplayInfo;
            if (displayInfo == null) {
                displayInfo = new Renderer.DisplayInfo(0);
            }
            displayInfo.refreshRate = display.getRefreshRate();
            renderer.setDisplayInfo(displayInfo);
        } catch (NullPointerException e) {
            GraphicsError graphicsError = new GraphicsError(e);
            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
            if (errorReporter != null) {
                errorReporter.report(graphicsError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            } else {
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
            }
        }
    }

    public FilamentDisplayHelper(Context context) {
        this.$r8$classId = 0;
        context.getClass();
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        this.mDisplayManager = (DisplayManager) systemService;
    }
}
