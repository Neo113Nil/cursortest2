package com.squareup.cash.core.navigationcontainer;

import android.view.View;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/MissingPresenter;", "Lcom/squareup/cash/observability/types/ReportedError;", "navigation-container"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MissingPresenter extends ReportedError {
    public final Set features;
    public final Map metadata;
    public final View view;

    public MissingPresenter(Screen screen, View view) {
        screen.getClass();
        view.getClass();
        this.view = view;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Navigation.INSTANCE);
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Navigation", MapsKt__MapsKt.mapOf(new Pair("Screen Fqcn", screen.getClass().getName()), new Pair("View Fqcn", view.getClass().getName())));
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }
}
