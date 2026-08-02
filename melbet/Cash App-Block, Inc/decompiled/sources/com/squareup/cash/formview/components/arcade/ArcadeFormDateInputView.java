package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.input.TextFieldValue;
import app.cash.broadway.ui.compose.ComposeUiViewKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda3;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$23;
import com.squareup.cash.formview.components.IndividualFormRequirementProvider;
import com.squareup.cash.formview.presenters.FormDateInputPresenter;
import com.squareup.cash.formview.viewmodels.FormDateInputViewModel;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.scrubbing.DateScrubber;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.util.compose.SharedViewEventsKt;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.PapaEvent;

/* loaded from: classes6.dex */
public final class ArcadeFormDateInputView extends AbstractComposeView implements IndividualFormRequirementProvider {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean clearFocusWhenOverlayActive;
    public final FormBlocker.Element.DateInputElement element;
    public final SharedFlowImpl focusRequestFlow;
    public final FocusRequester focusRequester;
    public final String formElementId;
    public final StateFlowImpl isValidStream;
    public final FormElementViewBuilder$toView$23 onEvent;
    public final FormDateInputPresenter presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormDateInputView(FormBlocker.Element.DateInputElement dateInputElement, String str, FormElementViewBuilder$toView$23 formElementViewBuilder$toView$23, FormDateInputPresenter.Factory factory, Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.element = dateInputElement;
        this.formElementId = str;
        this.onEvent = formElementViewBuilder$toView$23;
        AndroidClock androidClock = (AndroidClock) ((FormDateInputPresenter.Factory.Impl) factory).delegateFactory.clock.invoke();
        androidClock.getClass();
        this.presenter = new FormDateInputPresenter(androidClock, dateInputElement);
        this.focusRequester = new FocusRequester();
        this.focusRequestFlow = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.isValidStream = FlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        ArcadeFormDateInputView arcadeFormDateInputView;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1899265352);
        int i2 = (gapComposer2.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Continuation continuation = null;
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = PapaEvent.Channel$default(0, null, null, 7);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Channel channel = (Channel) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = FlowKt.consumeAsFlow(channel);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DateTimeFormatter dateTimeFormatter = FormDateInputPresenter.ALL_OFFSET_FORMATTER;
            FormDateInputViewModel models = this.presenter.models((Flow) rememberedValue2, (Composer) gapComposer2, 64);
            SimpleDateFormat simpleDateFormat = models.dateFormat;
            FormDateInputViewModel.Status status = models.status;
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer2, 1);
            if (status == FormDateInputViewModel.Status.OUT_OF_RANGE) {
                gapComposer2.startReplaceGroup(885335477);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(rememberShaker);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue3 == obj) {
                    rememberedValue3 = new RealProfileManager$profileOrNull$2(rememberShaker, continuation, 17);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue3);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(885386410);
                gapComposer2.end(false);
            }
            int i3 = 19;
            if (status == FormDateInputViewModel.Status.VALID) {
                gapComposer2.startReplaceGroup(885451231);
                SubmitFormRequest.ElementResult.DateInputResult dateInputResult = models.dateInputResult;
                if (dateInputResult != null) {
                    gapComposer2.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer2, dateInputResult, new GLSceneScopeProvider$SceneScope$2$1$1(dateInputResult, continuation, this, i3));
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1106436997);
                    gapComposer2.end(false);
                }
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(885554058);
                gapComposer2.end(false);
            }
            boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changedInstance(models);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue4 == obj) {
                rememberedValue4 = new CheckStatusPresenter.AnonymousClass1.C00611(this, models, continuation, 12);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer2, status, (Function2) rememberedValue4);
            Object[] objArr = new Object[0];
            boolean changedInstance3 = gapComposer2.changedInstance(models);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue5 == obj) {
                rememberedValue5 = new ArcadeModal$$ExternalSyntheticLambda2(models, 29);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) TextFieldValue.Saver, (Function0) rememberedValue5, (Composer) gapComposer2, 0);
            Unit unit2 = Unit.INSTANCE;
            boolean changed = gapComposer2.changed(rememberSaveable) | gapComposer2.changedInstance(this);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed || rememberedValue6 == obj) {
                rememberedValue6 = new FormCashtag.AnonymousClass8.AnonymousClass2(this, rememberSaveable, continuation, i3);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue6);
            TextFieldValue textFieldValue = (TextFieldValue) rememberSaveable.getValue();
            boolean changedInstance4 = gapComposer2.changedInstance(channel) | gapComposer2.changed(rememberSaveable);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue7 == obj) {
                rememberedValue7 = new CheckStatusPresenter.AnonymousClass1.C00611(channel, rememberSaveable, continuation, 13);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            Updater.LaunchedEffect(gapComposer2, textFieldValue, (Function2) rememberedValue7);
            boolean changed2 = gapComposer2.changed(simpleDateFormat);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue8 == obj) {
                rememberedValue8 = new DateScrubber(simpleDateFormat, DateScrubber.Type.ANY);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            DateScrubber dateScrubber = (DateScrubber) rememberedValue8;
            boolean changedInstance5 = gapComposer2.changedInstance(rememberShaker);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changedInstance5 || rememberedValue9 == obj) {
                rememberedValue9 = new CheckDepositAmountKt$$ExternalSyntheticLambda3(2, rememberShaker);
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            Function0 function0 = (Function0) rememberedValue9;
            dateScrubber.getClass();
            function0.getClass();
            dateScrubber.onInvalidContentListener = function0;
            Object obj2 = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object obj3 = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            Boolean bool = (Boolean) gapComposer2.consume(ComposeUiViewKt.LocalOverlayActive);
            boolean booleanValue = bool.booleanValue();
            if (this.clearFocusWhenOverlayActive) {
                gapComposer2.startReplaceGroup(886546678);
                boolean changed3 = gapComposer2.changed(booleanValue) | gapComposer2.changedInstance(this) | gapComposer2.changedInstance(obj3) | gapComposer2.changed(obj2);
                Object rememberedValue10 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue10 == obj) {
                    Object arcadeFormDateInputView$Content$7$1 = new ArcadeFormDateInputView$Content$7$1(booleanValue, obj3, obj2, this, (Continuation) null, 0);
                    gapComposer2.updateRememberedValue(arcadeFormDateInputView$Content$7$1);
                    rememberedValue10 = arcadeFormDateInputView$Content$7$1;
                }
                Updater.LaunchedEffect(gapComposer2, bool, (Function2) rememberedValue10);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(886781162);
                gapComposer2.end(false);
            }
            SharedFlowImpl sharedFlowImpl = this.focusRequestFlow;
            Updater.LaunchedEffect(gapComposer2, sharedFlowImpl, new AnimationsKt$takeUntil$1$1(sharedFlowImpl, (Continuation) null, Updater.rememberUpdatedState(bool, gapComposer2), this, obj2, 1));
            arcadeFormDateInputView = this;
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2015203405, new AvatarsKt$$ExternalSyntheticLambda4(rememberShaker, this, models, rememberSaveable, dateScrubber, 27), gapComposer2), gapComposer, 3072, 7);
        } else {
            arcadeFormDateInputView = this;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(arcadeFormDateInputView, i, 18);
        }
    }

    @Override // com.squareup.cash.formview.components.IndividualFormRequirementProvider
    public final Flow isRequirementFulfilled() {
        return this.isValidStream;
    }

    public final void setClearFocusWhenOverlayActive$components(boolean z) {
        this.clearFocusWhenOverlayActive = z;
    }
}
