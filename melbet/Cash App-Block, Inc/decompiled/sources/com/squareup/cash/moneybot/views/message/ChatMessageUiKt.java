package com.squareup.cash.moneybot.views.message;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MemoryTooltip;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.moneybot.views.card.InsightBarChartSelectionState;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda3;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class ChatMessageUiKt {
    public static final CubicBezierEasing USER_MESSAGE_ANIMATION_EASING = EasingFunctionsKt.EaseOut;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ChatMessageUi(Modifier modifier, final MessageViewModel messageViewModel, boolean z, boolean z2, final Function1 function1, InsightBarChartSelectionState insightBarChartSelectionState, Composer composer, int i) {
        Modifier modifier2;
        Modifier modifier3;
        Modifier modifier4;
        boolean z3;
        boolean z4;
        messageViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1758549109);
        Applier applier = gapComposer.applier;
        int i2 = i | 6 | (gapComposer.changedInstance(messageViewModel) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(insightBarChartSelectionState) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            gapComposer.startDefaults();
            int i3 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i3 == 0 || gapComposer.getDefaultsInvalid()) {
                modifier3 = companion;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            boolean z5 = messageViewModel instanceof MessageViewModel.MoneybotMessageViewModel;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z5) {
                gapComposer.startReplaceGroup(-2084636175);
                MessageViewModel.MoneybotMessageViewModel moneybotMessageViewModel = (MessageViewModel.MoneybotMessageViewModel) messageViewModel;
                Modifier modifier5 = modifier3;
                String str = moneybotMessageViewModel.id;
                String str2 = moneybotMessageViewModel.text;
                boolean z6 = moneybotMessageViewModel.showQuickActions;
                MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState = moneybotMessageViewModel.thumbState;
                String str3 = moneybotMessageViewModel.memoryLabel;
                MemoryTooltip memoryTooltip = moneybotMessageViewModel.memoryTooltip;
                boolean z7 = moneybotMessageViewModel.streamText;
                boolean changedInstance = ((i2 & 57344) == 16384) | gapComposer.changedInstance(messageViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    z4 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    rememberedValue = new Function0() { // from class: com.squareup.cash.moneybot.views.message.ChatMessageUiKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (objArr) {
                                case 0:
                                    function1.invoke(new MoneybotChatViewEvent.MessageTextStreamingFinished(((MessageViewModel.MoneybotMessageViewModel) messageViewModel).text));
                                    break;
                                default:
                                    function1.invoke(new MoneybotChatViewEvent.PinMessage(((MessageViewModel.UserMessageViewModel) messageViewModel).text));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    z4 = false;
                }
                Function0 function0 = (Function0) rememberedValue;
                int i4 = (i2 << 12) & 29360128;
                int i5 = (i2 >> 12) & 14;
                modifier4 = modifier5;
                boolean z8 = z4;
                z3 = true;
                LazyDslKt.MoneybotMessageUi(null, str, str2, z6, thumbState, str3, memoryTooltip, z2, z7, function0, function1, gapComposer, i4, i5);
                gapComposer = gapComposer;
                gapComposer.end(z8);
            } else {
                modifier4 = modifier3;
                if (messageViewModel instanceof MessageViewModel.ToolRequestMessageViewModel) {
                    gapComposer.startReplaceGroup(1318245228);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "help", (Map) null, (Function1) null, false);
                    gapComposer = gapComposer;
                    gapComposer.end(true);
                    gapComposer.end(false);
                    z3 = true;
                } else {
                    if (messageViewModel instanceof MessageViewModel.UserMessageViewModel) {
                        gapComposer.startReplaceGroup(-2083974170);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(!z, gapComposer);
                        }
                        MutableState mutableState = (MutableState) rememberedValue2;
                        float f = ((Boolean) mutableState.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : 100.0f;
                        CubicBezierEasing cubicBezierEasing = USER_MESSAGE_ANIMATION_EASING;
                        TweenSpec tween$default = AnimatableKt.tween$default(200, 0, cubicBezierEasing, 2);
                        int i6 = i2 & 57344;
                        boolean z9 = i6 == 16384;
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (z9 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda0(22, function1);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(f, tween$default, "y", (Function1) rememberedValue3, gapComposer, 432, 0);
                        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(200, 0, cubicBezierEasing, 2), "alpha", null, gapComposer, 3120, 20);
                        Unit unit = Unit.INSTANCE;
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new ToastKt$Toast$7$1(mutableState, null, 14);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
                        Modifier alpha = AlphaKt.alpha(OffsetKt.m273offsetVpY3zN4$default(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopEnd), RecyclerView.DECELERATION_RATE, ((Dp) m155animateDpAsStateAjpBEmI.getValue()).value, 1), ((Number) animateFloatAsState.getValue()).floatValue());
                        MessageViewModel.UserMessageViewModel userMessageViewModel = (MessageViewModel.UserMessageViewModel) messageViewModel;
                        String str4 = userMessageViewModel.text;
                        boolean z10 = userMessageViewModel.showPinOption;
                        boolean changedInstance2 = gapComposer.changedInstance(messageViewModel) | (i6 == 16384);
                        Object rememberedValue5 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                            final int i7 = 1;
                            rememberedValue5 = new Function0() { // from class: com.squareup.cash.moneybot.views.message.ChatMessageUiKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            function1.invoke(new MoneybotChatViewEvent.MessageTextStreamingFinished(((MessageViewModel.MoneybotMessageViewModel) messageViewModel).text));
                                            break;
                                        default:
                                            function1.invoke(new MoneybotChatViewEvent.PinMessage(((MessageViewModel.UserMessageViewModel) messageViewModel).text));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer.updateRememberedValue(rememberedValue5);
                        }
                        LazyListKt.m306UserMessageUiAGcomas(alpha, str4, z10, (Function0) rememberedValue5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer, 0);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    } else if (messageViewModel instanceof MessageViewModel.CardMessageViewModel) {
                        gapComposer.startReplaceGroup(-2082793876);
                        ChatCardViewModel chatCardViewModel = ((MessageViewModel.CardMessageViewModel) messageViewModel).card;
                        boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | ((i2 & 57344) == 16384);
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        if (changed || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new MainPaymentViewKt$$ExternalSyntheticLambda3(function1, delegatingSoftwareKeyboardController);
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        CardUiKt.CardUi(chatCardViewModel, null, (Function1) rememberedValue6, insightBarChartSelectionState, gapComposer, (i2 >> 6) & 7168);
                        gapComposer.end(false);
                    } else if (messageViewModel instanceof MessageViewModel.ImageMessageViewModel) {
                        gapComposer.startReplaceGroup(-2082396766);
                        zzacp.ImageMessageUi(null, (MessageViewModel.ImageMessageViewModel) messageViewModel, gapComposer, i2 & 112);
                        gapComposer.end(false);
                    } else {
                        if (!(messageViewModel instanceof MessageViewModel.QuickActionsBarViewModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1318227417, false);
                        }
                        gapComposer.startReplaceGroup(-2082289909);
                        MessageViewModel.QuickActionsBarViewModel quickActionsBarViewModel = (MessageViewModel.QuickActionsBarViewModel) messageViewModel;
                        LazyDslKt.MoneybotQuickActionsBar(quickActionsBarViewModel.messageId, quickActionsBarViewModel.copyText, quickActionsBarViewModel.thumbState, function1, null, gapComposer, (i2 >> 3) & 7168);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    z3 = true;
                }
            }
            gapComposer.end(z3);
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentViewKt$$ExternalSyntheticLambda24(modifier2, messageViewModel, z, z2, function1, insightBarChartSelectionState, i);
        }
    }
}
