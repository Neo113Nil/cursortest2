package com.squareup.cash.card.onboarding;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class DisclosureView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(DisclosureViewModel disclosureViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(838151580);
        int i2 = (gapComposer.changedInstance(disclosureViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (disclosureViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda1(19, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            boolean z2 = !disclosureViewModel.isLoading;
            boolean z3 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DisclosureView$$ExternalSyntheticLambda1(0, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(z2, (Function0) rememberedValue2, gapComposer, 0, 0);
            DisclosureViewKt.Disclosure(disclosureViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(this, disclosureViewModel, function1, i, 10);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((DisclosureViewModel) obj, function1, gapComposer, 0);
    }
}
