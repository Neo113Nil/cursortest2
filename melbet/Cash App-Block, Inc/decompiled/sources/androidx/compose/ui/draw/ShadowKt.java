package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.bitcoin.presenters.deposits.RealLightningInvoiceGenerator;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;

/* loaded from: classes3.dex */
public abstract class ShadowKt {
    public static RealLightningInvoiceGenerator provideLightningInvoiceGenerator$real(ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory2, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return (RealLightningInvoiceGenerator) (cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? arcadeModule$ProvideHapticVibratorMetroFactory2.invoke() : arcadeModule$ProvideHapticVibratorMetroFactory.invoke());
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static Modifier m591shadows4CzXII$default(Modifier modifier, float f, Shape shape, boolean z, int i) {
        if ((i & 4) != 0) {
            z = Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0;
        }
        boolean z2 = z;
        long j = GraphicsLayerScopeKt.DefaultShadowColor;
        return (Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0 || z2) ? modifier.then(new ShadowGraphicsLayerElement(f, shape, z2, j, j)) : modifier;
    }

    public static final OffersAnalyticsEventSpec toOffersAnalyticsEventSpec(AnalyticsEvent analyticsEvent) {
        analyticsEvent.getClass();
        String str = analyticsEvent.event_name;
        str.getClass();
        return new OffersAnalyticsEventSpec(str, analyticsEvent.client_generated_params, analyticsEvent.event_attributes);
    }
}
