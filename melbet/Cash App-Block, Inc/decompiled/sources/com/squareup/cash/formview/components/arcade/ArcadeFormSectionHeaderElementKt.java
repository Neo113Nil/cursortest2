package com.squareup.cash.formview.components.arcade;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda11;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class ArcadeFormSectionHeaderElementKt {
    public static final void ArcadeFormSectionHeaderElement(FormBlocker.Element.SectionHeaderElement sectionHeaderElement, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1445028876);
        int i2 = (gapComposer.changedInstance(sectionHeaderElement) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = sectionHeaderElement.title;
            if (str == null) {
                str = "";
            }
            String str2 = sectionHeaderElement.body;
            BlockerAction blockerAction = sectionHeaderElement.show_more_action;
            Function0 function0 = null;
            String str3 = blockerAction != null ? blockerAction.text : null;
            if (blockerAction == null) {
                gapComposer.startReplaceGroup(398325626);
            } else {
                gapComposer.startReplaceGroup(398325627);
                boolean changedInstance = gapComposer.changedInstance(blockerAction) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda11(function1, blockerAction, 8);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
            }
            gapComposer.end(false);
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, str3, function0, str2, gapComposer, 0, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(sectionHeaderElement, function1, i, 19);
        }
    }
}
