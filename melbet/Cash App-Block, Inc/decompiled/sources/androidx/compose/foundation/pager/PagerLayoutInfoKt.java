package androidx.compose.foundation.pager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.gestures.Orientation;
import androidx.lifecycle.LifecycleOwner;
import app.cash.molecule.PlatformKt;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.banking.applets.presenters.LiteBalanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.CardStudioViewKt$ThemedCard$1$4$1;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon$DrawableResource$NonTinted;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon$DrawableResource$Tinted;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class PagerLayoutInfoKt {
    public static Applet balanceApplet(BalanceAppletTilePresenter$Factory$Impl balanceAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner, ElementBoundsRegistry elementBoundsRegistry) {
        return new Applet(AppletId.BALANCE, new StateFlowKt$stateFlowOf$1(AppletAvailabilityState.AVAILABLE), new BankingDialog$$ExternalSyntheticLambda1(new NetworkFetcher$fetch$2(1, balanceAppletTilePresenter$Factory$Impl, BalanceAppletTilePresenter$Factory$Impl.class, "create", "create(Lapp/cash/broadway/navigation/Navigator;)Lcom/squareup/cash/banking/applets/presenters/BalanceAppletTilePresenter;", 0, 28), lifecycleOwner, elementBoundsRegistry, 8));
    }

    public static final int getMainAxisViewportSize(PagerMeasureResult pagerMeasureResult) {
        return (int) (pagerMeasureResult.orientation == Orientation.Vertical ? pagerMeasureResult.m332getViewportSizeYbymL2g() & BodyPartID.bodyIdMax : pagerMeasureResult.m332getViewportSizeYbymL2g() >> 32);
    }

    public static Applet liteBalanceApplet(LiteBalanceAppletTilePresenter$Factory$Impl liteBalanceAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner, ElementBoundsRegistry elementBoundsRegistry) {
        return new Applet(AppletId.BALANCE, new StateFlowKt$stateFlowOf$1(AppletAvailabilityState.AVAILABLE), new BankingDialog$$ExternalSyntheticLambda1(new CardStudioViewKt$ThemedCard$1$4$1(1, liteBalanceAppletTilePresenter$Factory$Impl, LiteBalanceAppletTilePresenter$Factory$Impl.class, "create", "create(Lapp/cash/broadway/navigation/Navigator;)Lcom/squareup/cash/banking/applets/presenters/LiteBalanceAppletTilePresenter;", 0, 1), lifecycleOwner, elementBoundsRegistry, 8));
    }

    public Drawable resolve$components(Context context, ColorPalette colorPalette, int i) {
        context.getClass();
        colorPalette.getClass();
        if (this instanceof MooncakeLargeIcon$DrawableResource$NonTinted) {
            Drawable drawableCompat = PlatformKt.getDrawableCompat(context, ((MooncakeLargeIcon$DrawableResource$NonTinted) this).resId, null);
            drawableCompat.getClass();
            return drawableCompat;
        }
        if (!(this instanceof MooncakeLargeIcon$DrawableResource$Tinted)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        MooncakeLargeIcon$DrawableResource$Tinted mooncakeLargeIcon$DrawableResource$Tinted = (MooncakeLargeIcon$DrawableResource$Tinted) this;
        Function1 function1 = mooncakeLargeIcon$DrawableResource$Tinted.tintOverride;
        if (function1 != null) {
            i = ((Number) function1.invoke(colorPalette)).intValue();
        }
        Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, mooncakeLargeIcon$DrawableResource$Tinted.resId, Integer.valueOf(i));
        drawableCompat2.getClass();
        return drawableCompat2;
    }
}
