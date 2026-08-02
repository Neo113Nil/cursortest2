package androidx.core.content;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material.RippleKt;
import androidx.compose.material.RippleNodeFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt$$ExternalSyntheticLambda13;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda33;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class ContextCompat$Api28Impl {
    public static final void Emoji(int i, Composer composer, Modifier modifier, String str, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(573446024);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i | (gapComposer.changed(str) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            RippleNodeFactory m500rippleH2RKhps$default = RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, false);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 22);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 3, (i2 >> 6) & 14, 6, 2808, 0L, (Composer) gapComposer, ImageKt.m182clickableO2vRcR0$default(modifier, mutableInteractionSourceImpl, m500rippleH2RKhps$default, false, null, null, (Function0) rememberedValue2, 28), TextStyle.m994copyp1EtxEg$default(MooncakeTheme.getCurrentTextStyle(gapComposer, 0), 0L, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo238toSp0xMU5do(32.0f), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckoutTipSectionKt$$ExternalSyntheticLambda13(modifier, function1, str, i);
        }
    }

    public static final void ReactionsBottomSheet(int i, Composer composer, Modifier modifier, ArrayList arrayList, Function1 function1) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-263355237);
        int i2 = i | 6 | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(arrayList) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1295749056, new CalloutKt$$ExternalSyntheticLambda0(arrayList, function1), gapComposer), gapComposer, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda33(modifier, function1, arrayList, i);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewLocalBrandCollection.deepLinkSpecs;
    }
}
