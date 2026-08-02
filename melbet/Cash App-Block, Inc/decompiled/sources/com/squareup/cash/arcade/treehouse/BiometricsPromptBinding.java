package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.View;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.util.android.coroutines.ViewKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes5.dex */
public final class BiometricsPromptBinding implements Widget {
    public final AndroidBiometricsStore biometricsStore;
    public final StateFlowImpl description;
    public final StateFlowImpl key;
    public Modifier modifier;
    public final StateFlowImpl negativeButton;
    public final StateFlowImpl onResult;
    public final StateFlowImpl subtitle;
    public final StateFlowImpl title;
    public final BiometricsPromptBreadcrumb value;

    public final class BiometricsPromptBreadcrumb extends View {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BiometricsPromptBreadcrumb(Context context) {
            super(context);
            context.getClass();
            setVisibility(8);
        }
    }

    public BiometricsPromptBinding(Context context, AndroidBiometricsStore androidBiometricsStore) {
        androidBiometricsStore.getClass();
        this.biometricsStore = androidBiometricsStore;
        this.key = FlowKt.MutableStateFlow(null);
        this.title = FlowKt.MutableStateFlow(null);
        this.subtitle = FlowKt.MutableStateFlow(null);
        this.description = FlowKt.MutableStateFlow(null);
        this.negativeButton = FlowKt.MutableStateFlow(null);
        this.onResult = FlowKt.MutableStateFlow(null);
        this.modifier = Modifier.Companion.$$INSTANCE;
        BiometricsPromptBreadcrumb biometricsPromptBreadcrumb = new BiometricsPromptBreadcrumb(context);
        ViewKt.whileEachAttached(biometricsPromptBreadcrumb, EmptyCoroutineContext.INSTANCE, new ZiplineLoader$load$2(this, biometricsPromptBreadcrumb, null));
        this.value = biometricsPromptBreadcrumb;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
