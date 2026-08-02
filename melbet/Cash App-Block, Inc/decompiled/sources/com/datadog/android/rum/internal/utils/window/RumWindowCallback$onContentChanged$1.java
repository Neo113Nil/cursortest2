package com.datadog.android.rum.internal.utils.window;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.emoji2.text.MetadataRepo;
import coil3.request.OneShotDisposable;
import com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1;
import com.fillr.m1;
import com.google.android.filament.Box;
import com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$2;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RumWindowCallback$onContentChanged$1 extends Lambda implements Function1 {
    public static final RumWindowCallback$onContentChanged$1 INSTANCE = new RumWindowCallback$onContentChanged$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1 rumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1 = (RumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1) obj;
        rumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1.getClass();
        MetadataRepo metadataRepo = rumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1.this$0;
        m1 m1Var = (m1) metadataRepo.mRootNode;
        Activity activity = rumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1.$activity;
        WeakHashMap weakHashMap = (WeakHashMap) m1Var.a;
        RumWindowCallback rumWindowCallback = (RumWindowCallback) weakHashMap.get(activity);
        if (rumWindowCallback != null) {
            OneShotDisposable oneShotDisposable = rumWindowCallback.subscription;
            oneShotDisposable.getClass();
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) oneShotDisposable.job;
            copyOnWriteArraySet.remove(rumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1);
            if (copyOnWriteArraySet.size() == 0) {
                Window window = activity.getWindow();
                window.getClass();
                Window.Callback callback = window.getCallback();
                if ((callback instanceof RumWindowCallback) && weakHashMap.values().contains(callback)) {
                    window.setCallback(((RumWindowCallback) callback).wrapped);
                }
                weakHashMap.remove(activity);
            }
        }
        Box box = rumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1.$callback;
        View decorView = activity.getWindow().getDecorView();
        decorView.getClass();
        if (decorView.isAttachedToWindow()) {
            metadataRepo.registerOnDrawListener(decorView, box);
        } else {
            decorView.addOnAttachStateChangeListener(new ModalContainer$update$2$1$2(1, metadataRepo, decorView, box));
        }
        return Unit.INSTANCE;
    }
}
