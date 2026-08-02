package com.squareup.cash.investing.components.dependent;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewEvent;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class DependentWelcomeNullStateView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DependentWelcomeNullStateView f$0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        final DependentWelcomeNullStateView dependentWelcomeNullStateView = this.f$0;
        final int i2 = 1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i3 = DependentWelcomeNullStateView.$r8$clinit;
                final int i4 = 0;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DependentWelcomeViewModel dependentWelcomeViewModel = (DependentWelcomeViewModel) dependentWelcomeNullStateView.viewModel$delegate.getValue();
                    if (dependentWelcomeViewModel == null) {
                        gapComposer.startReplaceGroup(244476975);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(244476976);
                        boolean changedInstance = gapComposer.changedInstance(dependentWelcomeNullStateView);
                        Object rememberedValue = gapComposer.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new Function0() { // from class: com.squareup.cash.investing.components.dependent.DependentWelcomeNullStateView$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i5 = i4;
                                    DependentWelcomeNullStateView dependentWelcomeNullStateView2 = dependentWelcomeNullStateView;
                                    switch (i5) {
                                        case 0:
                                            dependentWelcomeNullStateView2.eventReceiver.sendEvent(DependentWelcomeViewEvent.Close.INSTANCE);
                                            break;
                                        default:
                                            dependentWelcomeNullStateView2.eventReceiver.sendEvent(DependentWelcomeViewEvent.CtaClicked.INSTANCE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Function0 function0 = (Function0) rememberedValue;
                        boolean changedInstance2 = gapComposer.changedInstance(dependentWelcomeNullStateView);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new Function0() { // from class: com.squareup.cash.investing.components.dependent.DependentWelcomeNullStateView$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i5 = i2;
                                    DependentWelcomeNullStateView dependentWelcomeNullStateView2 = dependentWelcomeNullStateView;
                                    switch (i5) {
                                        case 0:
                                            dependentWelcomeNullStateView2.eventReceiver.sendEvent(DependentWelcomeViewEvent.Close.INSTANCE);
                                            break;
                                        default:
                                            dependentWelcomeNullStateView2.eventReceiver.sendEvent(DependentWelcomeViewEvent.CtaClicked.INSTANCE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        AwaitKt.DependentWelcomeNullStateContent(dependentWelcomeViewModel, function0, (Function0) rememberedValue2, gapComposer, 0);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                int i5 = DependentWelcomeNullStateView.$r8$clinit;
                dependentWelcomeNullStateView.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
