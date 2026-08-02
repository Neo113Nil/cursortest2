package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MotionEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.ui.FullScreen;
import com.squareup.cash.ui.LandscapeOrientation;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes6.dex */
public final class CardStudioView extends ComposeUiView implements LandscapeOrientation, FullScreen {
    public final ErrorReporter errorReporter;
    public CoroutineScope scope;
    public final SharedFlowImpl screenTouchPoints;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStudioView(Context context, ErrorReporter errorReporter) {
        super(context);
        context.getClass();
        this.errorReporter = errorReporter;
        this.screenTouchPoints = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    }

    public final void Content(CardStudioViewModel cardStudioViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(293505091);
        int i2 = (gapComposer.changedInstance(cardStudioViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            CardStudioViewModel.Content content = cardStudioViewModel instanceof CardStudioViewModel.Content ? (CardStudioViewModel.Content) cardStudioViewModel : null;
            if (content == null) {
                gapComposer.startReplaceGroup(-743130905);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-743130904);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                this.scope = (CoroutineScope) rememberedValue;
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-940150332, new CashCardKt$$ExternalSyntheticLambda1(4, this, content, function1), gapComposer), gapComposer, 3072, 7);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(this, cardStudioViewModel, function1, i, 5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        CoroutineScope coroutineScope = this.scope;
        if (coroutineScope != null) {
            JobKt.launch$default(coroutineScope, null, null, new PlaidLinkView.AnonymousClass2(this, motionEvent, (Continuation) null, 17), 3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        setVisibility(configuration.orientation != 2 ? 8 : 0);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((CardStudioViewModel) obj, function1, gapComposer, 0);
    }
}
