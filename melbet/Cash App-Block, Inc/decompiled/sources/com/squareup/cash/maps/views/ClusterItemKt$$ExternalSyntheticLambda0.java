package com.squareup.cash.maps.views;

import android.graphics.Bitmap;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import com.squareup.cash.integration.analytics.AnalyticsEventReceiver;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class ClusterItemKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ClusterItemKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a1, code lost:
    
        if (android.graphics.Bitmap.createBitmap(1, 1, r2).getConfig() == r2) goto L66;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                try {
                    Bitmap.Config config = Bitmap.Config.HARDWARE;
                    z = true;
                    break;
                } catch (IllegalArgumentException unused) {
                    break;
                }
            case 9:
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                break;
            case 11:
                int i = AnalyticsEventReceiver.$r8$clinit;
                break;
            case 13:
                InvestingGraphContentModel.Loaded loaded = CustomOrderGraphKt.GRAPH_MODEL_720;
                break;
            case 27:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = MapMarkerPropertiesKt.LocalMapMarkerProperties;
                break;
        }
        return Unit.INSTANCE;
        z = false;
        return Boolean.valueOf(z);
    }
}
