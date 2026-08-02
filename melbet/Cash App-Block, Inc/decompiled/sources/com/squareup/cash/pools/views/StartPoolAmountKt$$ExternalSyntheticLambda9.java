package com.squareup.cash.pools.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import coil3.size.SizeKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class StartPoolAmountKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ StartPoolAmountKt$$ExternalSyntheticLambda9(Function0 function0, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        final Function0 function0 = this.f$0;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        final boolean z = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, this.f$1, null, PoolToastKt.lambda$1454470104, gapComposer, 1573296, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(-196777734);
                final long j = ((TextSelectionColors) gapComposer2.consume(TextSelectionColorsKt.LocalTextSelectionColors)).handleColor;
                boolean changed = gapComposer2.changed(j) | gapComposer2.changed(function0) | gapComposer2.changed(z);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new Function1() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            CacheDrawScope cacheDrawScope = (CacheDrawScope) obj4;
                            AndroidImageBitmap createHandleImage = SimpleLayoutKt.createHandleImage(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.cacheParams.mo587getSizeNHjbRc() >> 32)) / 2.0f);
                            long j2 = j;
                            return cacheDrawScope.onDrawWithContent(new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(function0, z, createHandleImage, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), 3));
                        }
                    };
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Modifier drawWithCache = ClipKt.drawWithCache(modifier, (Function1) rememberedValue);
                gapComposer2.end(false);
                break;
            case 2:
                RowScope rowScope = (RowScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                rowScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(rowScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    gapComposer3.startReplaceGroup(-1460069558);
                    gapComposer3.end(false);
                    KeypadKt.ClearSearchButton(z, function0, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, !z, null, Expect_jvmKt.rememberComposableLambda(-1445511340, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 11), gapComposer4), gapComposer4, 1573296, 40);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StartPoolAmountKt$$ExternalSyntheticLambda9(boolean z, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = function0;
    }
}
