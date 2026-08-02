package com.squareup.cash.blockers.actions.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionDialogActionViewModel;
import com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.BirthdayView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class BlockerActionDialogActionViewKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockerAction.DialogAction.Button.Style.values().length];
            try {
                iArr[BlockerAction.DialogAction.Button.Style.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockerAction.DialogAction.Button.Style.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockerAction.DialogAction.Button.Style.DESTRUCTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void BlockerActionDialog(final BlockerActionDialogActionViewModel blockerActionDialogActionViewModel, final Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(824404389);
        int i2 = i | (gapComposer.changedInstance(blockerActionDialogActionViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = blockerActionDialogActionViewModel.title;
            String str2 = blockerActionDialogActionViewModel.message;
            final String str3 = blockerActionDialogActionViewModel.primaryButtonText;
            final String str4 = blockerActionDialogActionViewModel.secondaryButtonText;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1160298186, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 28), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2143291563, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str2, 29), gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1164411905, new Function3() { // from class: com.squareup.cash.blockers.actions.views.BlockerActionDialogActionViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    BlockerActionDialogActionViewModel blockerActionDialogActionViewModel2 = blockerActionDialogActionViewModel;
                    Function1 function12 = function1;
                    switch (i5) {
                        case 0:
                            ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            modalButtonScope.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(20, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                Function0 function0 = (Function0) rememberedValue;
                                BlockerAction.DialogAction.Button.Style style = blockerActionDialogActionViewModel2.primaryButtonStyle;
                                if (style == null) {
                                    style = BlockerAction.DialogAction.Button.Style.DEFAULT;
                                }
                                BlockerActionDialogActionViewKt.ModalButton(modalButtonScope, str3, function0, style, null, gapComposer2, intValue & 14);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            modalButtonScope2.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                int i6 = intValue2;
                                String str5 = str3;
                                if (str5 != null) {
                                    gapComposer3.startReplaceGroup(1570549520);
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(21, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    Function0 function02 = (Function0) rememberedValue2;
                                    BlockerAction.DialogAction.Button.Style style2 = blockerActionDialogActionViewModel2.secondaryButtonStyle;
                                    if (style2 == null) {
                                        style2 = BlockerAction.DialogAction.Button.Style.CANCEL;
                                    }
                                    BlockerActionDialogActionViewKt.ModalButton(modalButtonScope2, str5, function02, style2, null, gapComposer3, i6 & 14);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(1570720578);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(181418528, new Function3() { // from class: com.squareup.cash.blockers.actions.views.BlockerActionDialogActionViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    BlockerActionDialogActionViewModel blockerActionDialogActionViewModel2 = blockerActionDialogActionViewModel;
                    Function1 function12 = function1;
                    switch (i5) {
                        case 0:
                            ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            modalButtonScope.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(20, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                Function0 function0 = (Function0) rememberedValue;
                                BlockerAction.DialogAction.Button.Style style = blockerActionDialogActionViewModel2.primaryButtonStyle;
                                if (style == null) {
                                    style = BlockerAction.DialogAction.Button.Style.DEFAULT;
                                }
                                BlockerActionDialogActionViewKt.ModalButton(modalButtonScope, str4, function0, style, null, gapComposer2, intValue & 14);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            modalButtonScope2.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                int i6 = intValue2;
                                String str5 = str4;
                                if (str5 != null) {
                                    gapComposer3.startReplaceGroup(1570549520);
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(21, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    Function0 function02 = (Function0) rememberedValue2;
                                    BlockerAction.DialogAction.Button.Style style2 = blockerActionDialogActionViewModel2.secondaryButtonStyle;
                                    if (style2 == null) {
                                        style2 = BlockerAction.DialogAction.Button.Style.CANCEL;
                                    }
                                    BlockerActionDialogActionViewKt.ModalButton(modalButtonScope2, str5, function02, style2, null, gapComposer3, i6 & 14);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(1570720578);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.Modal(companion, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, rememberComposableLambda4, (Function3) null, gapComposer, 28086, 32);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(modifier2, blockerActionDialogActionViewModel, function1, i, 1);
        }
    }

    public static final void ModalButton(ModalButtonScope modalButtonScope, String str, Function0 function0, BlockerAction.DialogAction.Button.Style style, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1399443952);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modalButtonScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(style.ordinal()) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            Modifier modifier3 = Modifier.Companion.$$INSTANCE;
            if (i4 == 1) {
                gapComposer2.startReplaceGroup(412947515);
                modalButtonScope.PrimaryModalButton(function0, modifier3, false, Expect_jvmKt.rememberComposableLambda(1867846819, new SetPinViewKt$$ExternalSyntheticLambda7(str, 1), gapComposer2), gapComposer2, ((i3 >> 6) & 14) | 3072 | ((i3 >> 9) & 112) | ((i3 << 12) & 57344), 4);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else if (i4 == 2) {
                gapComposer2.startReplaceGroup(413048761);
                modalButtonScope.SecondaryModalButton(function0, modifier3, false, Expect_jvmKt.rememberComposableLambda(1734232844, new SetPinViewKt$$ExternalSyntheticLambda7(str, 2), gapComposer2), gapComposer2, ((i3 >> 6) & 14) | 3072 | ((i3 >> 9) & 112) | ((i3 << 12) & 57344), 4);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                if (i4 != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -540869145, false);
                }
                gapComposer2.startReplaceGroup(413157168);
                gapComposer = gapComposer2;
                modalButtonScope.PrimaryModalButtonDestructive(((i3 << 12) & 57344) | ((i3 >> 6) & 14) | 3072 | ((i3 >> 9) & 112), 4, gapComposer, Expect_jvmKt.rememberComposableLambda(651550401, new SetPinViewKt$$ExternalSyntheticLambda7(str, 3), gapComposer2), modifier3, function0, false);
                modifier3 = modifier3;
                gapComposer.end(false);
            }
            modifier2 = modifier3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(modalButtonScope, str, function0, style, modifier2, i, 20);
        }
    }
}
