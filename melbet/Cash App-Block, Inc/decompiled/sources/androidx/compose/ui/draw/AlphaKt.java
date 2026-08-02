package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.rum.RumActionType;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.BitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.CashAppLiteBitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.DefaultBitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider;
import com.squareup.cash.bitcoin.presenters.featureavailability.DefaultBitcoinFeatureAvailabilityProvider;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.backend.api.Action;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class AlphaKt {
    public static final Modifier alpha(Modifier modifier, float f) {
        return f == 1.0f ? modifier : ColorKt.m687graphicsLayer_6ThJ44$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, null, 520187);
    }

    public static BitcoinFeatureAvailabilityProvider provideBitcoinFeatureAvailabilityProvider(ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? (BitcoinFeatureAvailabilityProvider) arcadeModule$ProvideHapticVibratorMetroFactory.invoke() : new DefaultBitcoinFeatureAvailabilityProvider();
    }

    public static BitcoinWidgetAllowlistProvider provideBitcoinWidgetAllowlistProvider(DefaultBitcoinWidgetAllowlistProvider defaultBitcoinWidgetAllowlistProvider, CashAppLiteBitcoinWidgetAllowlistProvider cashAppLiteBitcoinWidgetAllowlistProvider, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? cashAppLiteBitcoinWidgetAllowlistProvider : defaultBitcoinWidgetAllowlistProvider;
    }

    public static final RumActionType toDatadogType(Action.Type type2) {
        type2.getClass();
        int ordinal = type2.ordinal();
        if (ordinal == 0) {
            return RumActionType.TAP;
        }
        if (ordinal == 1) {
            return RumActionType.SCROLL;
        }
        if (ordinal == 2) {
            return RumActionType.SWIPE;
        }
        if (ordinal == 3) {
            return RumActionType.BACK;
        }
        if (ordinal == 4) {
            return RumActionType.CUSTOM;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
