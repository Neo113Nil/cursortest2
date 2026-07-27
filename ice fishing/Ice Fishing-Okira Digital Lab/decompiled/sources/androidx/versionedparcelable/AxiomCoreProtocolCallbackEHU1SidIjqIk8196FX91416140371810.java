package androidx.versionedparcelable;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class AxiomCoreProtocolCallbackEHU1SidIjqIk8196FX91416140371810 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewTreeObserver LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final View RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final Runnable YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public AxiomCoreProtocolCallbackEHU1SidIjqIk8196FX91416140371810(View view, Runnable runnable) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = view;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = view.getViewTreeObserver();
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.isAlive();
        View view = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (isAlive) {
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.isAlive();
        View view2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (isAlive) {
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
