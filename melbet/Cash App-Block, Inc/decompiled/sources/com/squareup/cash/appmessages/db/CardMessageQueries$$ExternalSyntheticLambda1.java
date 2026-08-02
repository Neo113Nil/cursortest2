package com.squareup.cash.appmessages.db;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SizeTransformImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.agents.applets.viewmodels.AgentCardViewModel;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.protos.franklin.common.ATMPicker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class CardMessageQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CardMessageQueries$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("cardMessage");
                break;
            case 1:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 2:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 3:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 4:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 5:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 6:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 7:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 8:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 9:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 10:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 11:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 12:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 13:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 14:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 15:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 16:
                ((AfterpayAppletHomeViewEvent) obj).getClass();
                break;
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                break;
            case 18:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                Object tween$default = animatedContentTransitionScopeImpl.getTargetState() == AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_ON ? AnimatableKt.tween$default(200, 0, null, 6) : AnimatableKt.spring$default(0.75f, 120.0f, null, 4);
                ContentTransform contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(200, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(200, 0, null, 6), 2));
                contentTransform.sizeTransform = new SizeTransformImpl(false, new ButtonBinding$$ExternalSyntheticLambda2(tween$default, 10));
                break;
            case 19:
                AfterpaySearchViewModel.CategoryTileViewModel categoryTileViewModel = (AfterpaySearchViewModel.CategoryTileViewModel) obj;
                categoryTileViewModel.getClass();
                break;
            case 20:
                AgentsAppletTileViewModel agentsAppletTileViewModel = (AgentsAppletTileViewModel) obj;
                agentsAppletTileViewModel.getClass();
                if (!(agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Loading)) {
                    if (!(agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Installed)) {
                        if (!(agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Uninstalled)) {
                            if (!(agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 21:
                ((AgentCardViewModel) obj).getClass();
                break;
            case 22:
                AgentCardViewModel agentCardViewModel = (AgentCardViewModel) obj;
                agentCardViewModel.getClass();
                break;
            case 23:
                int i = AmountPickerCondensedView.$r8$clinit;
                break;
            case 24:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                ContentTransform contentTransform2 = AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.slideInVertically$default(3, null)), EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.slideOutVertically$default(1, new CardMessageQueries$$ExternalSyntheticLambda1(26))));
                contentTransform2.sizeTransform = AnimatedContentKt.SizeTransform$default(2, null);
                break;
            case 25:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver2, 0);
                break;
            case 26:
                break;
            case 27:
                ATMPicker aTMPicker = (ATMPicker) obj;
                aTMPicker.getClass();
                break;
            case 28:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("cardMessage");
                break;
            default:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("cardMessage");
                break;
        }
        return Unit.INSTANCE;
    }
}
