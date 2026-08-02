package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.compose.CopyCheckIconState;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public abstract class BlurKt {
    public static final void CopyCheckIcon(Modifier modifier, CopyCheckIconState copyCheckIconState, String str, Composer composer, int i) {
        copyCheckIconState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1599965901);
        int i2 = 16;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(copyCheckIconState) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = copyCheckIconState._showCheckMark;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Boolean bool = (Boolean) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1).getValue();
            bool.getClass();
            CrossfadeKt.Crossfade(bool, modifier, AnimatableKt.tween$default(500, 0, null, 6), "copy_check_crossfade", Expect_jvmKt.rememberComposableLambda(1026060364, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, i2), gapComposer), gapComposer, ((i3 << 3) & 112) | 28032, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, copyCheckIconState, str, i, 15);
        }
    }

    /* renamed from: configureShadow-FoewPVk$default, reason: not valid java name */
    public static AndroidPaint m763configureShadowFoewPVk$default(Paint paint, BlurMaskFilter blurMaskFilter, int i) {
        long j = Color.Black;
        int i2 = (i & 8) != 0 ? 0 : 1;
        AndroidPaint androidPaint = (AndroidPaint) paint;
        androidPaint.m659setColor8_81llA(j);
        androidPaint.m658setBlendModes9anfk8(3);
        androidPaint.m663setStylek9PVt8s(i2);
        ColorKt.getNativePaint(androidPaint).setMaskFilter(blurMaskFilter);
        return androidPaint;
    }
}
