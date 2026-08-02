package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class ArcadeFormDetailRowKt {
    public static final void ArcadeFormDetailRow(FormBlocker.Element.DetailRowElement detailRowElement, ListUnorderedState listUnorderedState, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        detailRowElement.getClass();
        listUnorderedState.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1777515524);
        int i2 = i | (gapComposer2.changedInstance(detailRowElement) ? 4 : 2) | (gapComposer2.changed(listUnorderedState) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = detailRowElement.title;
            if (str == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Missing title from detail row");
                return;
            }
            String str2 = detailRowElement.detail_text;
            if (str2 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Missing detail_text from detail row");
                return;
            }
            String str3 = detailRowElement.subtitle;
            String str4 = null;
            if (str3 != null) {
                if (StringsKt.isBlank(str3)) {
                    str3 = null;
                }
                str4 = str3;
            }
            BlockerAction blockerAction = detailRowElement.title_action;
            boolean changedInstance = gapComposer2.changedInstance(blockerAction) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorView$$ExternalSyntheticLambda1(3, blockerAction, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(296009415, new BasicShieetKt$$ExternalSyntheticLambda0(str4, blockerAction, listUnorderedState, str2, function1, str, (Function2) rememberedValue, 8), gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, rememberComposableLambda, gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(detailRowElement, listUnorderedState, function1, i, 13);
        }
    }
}
