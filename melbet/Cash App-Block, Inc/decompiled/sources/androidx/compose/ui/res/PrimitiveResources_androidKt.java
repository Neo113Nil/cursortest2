package androidx.compose.ui.res;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import coil3.RealImageLoader;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.buynowpaylater.viewmodels.SUPCardInfo;
import com.squareup.cash.cdf.paychecks.PaychecksShowBenefitsHub;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class PrimitiveResources_androidKt {
    public static final void SingleUsePaymentOverviewCard(Modifier modifier, SUPCardInfo sUPCardInfo, RealImageLoader realImageLoader, Composer composer, int i) {
        sUPCardInfo.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-60211731);
        int i2 = i | 6 | (gapComposer.changedInstance(sUPCardInfo) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1237583150, new BulletinTileKt$$ExternalSyntheticLambda2(sUPCardInfo, realImageLoader), gapComposer), gapComposer, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(modifier, sUPCardInfo, realImageLoader, i);
        }
    }

    public static final PaychecksShowBenefitsHub.BenefitsStatus access$toCdfBenefitsStatus(PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState paychecksBenefitsState) {
        int ordinal = paychecksBenefitsState.ordinal();
        if (ordinal == 0) {
            return PaychecksShowBenefitsHub.BenefitsStatus.NULL;
        }
        if (ordinal == 1) {
            return PaychecksShowBenefitsHub.BenefitsStatus.PENDING;
        }
        if (ordinal == 2) {
            return PaychecksShowBenefitsHub.BenefitsStatus.ACTIVE;
        }
        if (ordinal == 3) {
            return PaychecksShowBenefitsHub.BenefitsStatus.INACTIVE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final float dimensionResource(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        return ((Resources) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalResources)).getDimension(i) / ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getDensity();
    }
}
