package com.squareup.cash.overlays;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.LifecyclesKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzr;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.thing.Thing;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class RealOverlayLayer extends FrameLayout implements OverlayLayer {
    public final ArrayList current;

    /* loaded from: classes8.dex */
    public final class LifecycleExitCallback {
        public LifecycleExitCallback() {
        }
    }

    /* loaded from: classes6.dex */
    public final class RealSession implements OverlayLayer.Session {
        public final LifecycleExitCallback lifecycleExitCallback;
        public final Overlay overlay;
        public final /* synthetic */ RealOverlayLayer this$0;
        public boolean userDismissed;
        public final View view;

        public RealSession(RealOverlayLayer realOverlayLayer, Overlay overlay, View view, LifecycleExitCallback lifecycleExitCallback) {
            overlay.getClass();
            this.this$0 = realOverlayLayer;
            this.overlay = overlay;
            this.view = view;
            this.lifecycleExitCallback = lifecycleExitCallback;
        }

        @Override // com.squareup.cash.overlays.OverlayLayer.Session
        public final void dismiss() {
            if (this.userDismissed) {
                a$$ExternalSyntheticBUOutline0.m$1("not showing");
                return;
            }
            this.userDismissed = true;
            RealOverlayLayer realOverlayLayer = this.this$0;
            if (realOverlayLayer.current.remove(this)) {
                Animator exitAnimator = this.overlay.exitAnimator();
                exitAnimator.addListener(new RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1(realOverlayLayer, this, 2));
                exitAnimator.start();
            }
        }

        @Override // com.squareup.cash.overlays.OverlayLayer.Session
        public final Overlay getOverlay() {
            return this.overlay;
        }

        public final Animator transitionIn() {
            Animator enterAnimator = this.overlay.enterAnimator();
            RealOverlayLayer realOverlayLayer = this.this$0;
            enterAnimator.addListener(new RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1(realOverlayLayer, this, 1));
            enterAnimator.addListener(new RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1(realOverlayLayer, this, 0));
            return enterAnimator;
        }
    }

    public RealOverlayLayer(Thing.ThingContextThemeWrapper thingContextThemeWrapper) {
        super(thingContextThemeWrapper);
        this.current = new ArrayList();
    }

    public static final void access$updateSiblingAccessibility(RealOverlayLayer realOverlayLayer) {
        ViewParent parent = realOverlayLayer.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        boolean isEmpty = realOverlayLayer.current.isEmpty();
        Iterator it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            }
            View view = (View) viewGroupKt$iterator$1.next();
            if (view != realOverlayLayer) {
                view.setImportantForAccessibility(!isEmpty ? 4 : 0);
            }
        }
    }

    @Override // com.squareup.cash.overlays.OverlayLayer
    public final CoroutineScope getCoroutineScope() {
        LifecycleOwner lifecycleOwner = DBUtil.get(this);
        lifecycleOwner.getClass();
        return ViewModelKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }

    @Override // com.squareup.cash.overlays.OverlayLayer
    public final boolean onBack() {
        ArrayList arrayList = this.current;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OnBackListener backListener = ((RealSession) it.next()).getOverlay().getBackListener();
            if (backListener != null && backListener.onBack()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.squareup.cash.overlays.OverlayLayer
    public final OverlayLayer.Session show(Overlay overlay) {
        overlay.getClass();
        ArrayList arrayList = this.current;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((RealSession) it.next()).getOverlay(), overlay)) {
                    a$$ExternalSyntheticBUOutline0.m$1("already showing");
                    return null;
                }
            }
        }
        View asView = overlay.getAsView();
        LifecycleExitCallback lifecycleExitCallback = new LifecycleExitCallback();
        Context context = asView.getContext();
        context.getClass();
        zzr uiLifecycle = LifecyclesKt.getUiLifecycle(context);
        RealOverlayLayer$show$3 realOverlayLayer$show$3 = new RealOverlayLayer$show$3(lifecycleExitCallback);
        uiLifecycle.getClass();
        ((ArrayList) uiLifecycle.zzb).add(realOverlayLayer$show$3);
        RealSession realSession = new RealSession(this, overlay, asView, lifecycleExitCallback);
        arrayList.add(realSession);
        realSession.transitionIn().start();
        return realSession;
    }
}
