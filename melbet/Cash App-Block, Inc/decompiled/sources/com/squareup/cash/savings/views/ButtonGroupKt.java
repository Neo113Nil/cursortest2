package com.squareup.cash.savings.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.tracing.Trace;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.views.BorrowAmountPickerKt$$ExternalSyntheticLambda10;
import com.squareup.cash.borrow.views.BorrowAmountPickerKt$$ExternalSyntheticLambda11;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackLayoutWeightElement;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.savings.viewmodels.CelebrationViewModel;
import com.squareup.cash.savings.viewmodels.CellDefaultViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.bespoke_elements.CardImage;
import string.TrimMode;

/* loaded from: classes7.dex */
public abstract class ButtonGroupKt {
    public static final ComposableLambdaImpl lambda$893613846 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(26), false, 893613846);

    /* renamed from: lambda$-597025206, reason: not valid java name */
    public static final ComposableLambdaImpl f648lambda$597025206 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(27), false, -597025206);

    /* renamed from: lambda$-943036653, reason: not valid java name */
    public static final ComposableLambdaImpl f649lambda$943036653 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(15), false, -943036653);
    public static final ComposableLambdaImpl lambda$1405979449 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(28), false, 1405979449);

    /* renamed from: lambda$-109950412, reason: not valid java name */
    public static final ComposableLambdaImpl f647lambda$109950412 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(29), false, -109950412);

    public static final void ButtonGroup(final SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup buttonGroup, Modifier modifier, final Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1106013628);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(buttonGroup) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            final ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-239565536, new Function2() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    Object obj3 = Composer.Companion.Empty;
                    final Function1 function12 = function1;
                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup buttonGroup2 = buttonGroup;
                    final int i7 = 1;
                    final int i8 = 0;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                ButtonProminence.Id id = buttonGroup2.primaryButton.prominence;
                                if (1.0f <= 0.0d) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                    break;
                                } else {
                                    AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement = new AdaptiveStackLayoutWeightElement(1.0f);
                                    boolean changedInstance = gapComposer2.changedInstance(buttonGroup2) | gapComposer2.changed(function12);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changedInstance || rememberedValue == obj3) {
                                        rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(9, (Object) buttonGroup2, function12);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    ViewKt.ArcadeButtonDefault(id, adaptiveStackLayoutWeightElement, false, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(12621128, new ButtonGroupKt$$ExternalSyntheticLambda11(buttonGroup2, 0), gapComposer2), gapComposer2, 24624, 4);
                                }
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                final SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button = buttonGroup2.secondaryButton;
                                if (button != null) {
                                    gapComposer3.startReplaceGroup(1126370255);
                                    ButtonProminence.Id id2 = button.prominence;
                                    if (1.0f <= 0.0d) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                        break;
                                    } else {
                                        AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement2 = new AdaptiveStackLayoutWeightElement(1.0f);
                                        boolean changedInstance2 = gapComposer3.changedInstance(button) | gapComposer3.changed(function12);
                                        Object rememberedValue2 = gapComposer3.rememberedValue();
                                        if (changedInstance2 || rememberedValue2 == obj3) {
                                            rememberedValue2 = new Function0() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i9 = i8;
                                                    Function1 function13 = function12;
                                                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button2 = button;
                                                    switch (i9) {
                                                        case 0:
                                                            SavingsScreenViewEvent savingsScreenViewEvent = button2.action;
                                                            if (savingsScreenViewEvent != null) {
                                                                function13.invoke(savingsScreenViewEvent);
                                                            }
                                                            break;
                                                        default:
                                                            SavingsScreenViewEvent savingsScreenViewEvent2 = button2.action;
                                                            if (savingsScreenViewEvent2 != null) {
                                                                function13.invoke(savingsScreenViewEvent2);
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer3.updateRememberedValue(rememberedValue2);
                                        }
                                        ViewKt.ArcadeButtonDefault(id2, adaptiveStackLayoutWeightElement2, false, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(338061773, new Function3() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                int i9 = i8;
                                                SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button2 = button;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer4 = (Composer) obj5;
                                                        int intValue3 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                                        if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button2.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer4.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer5 = (Composer) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button2.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, 24624, 4);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.startReplaceGroup(1126370254);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                final SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button2 = buttonGroup2.tertiaryButton;
                                if (button2 != null) {
                                    gapComposer4.startReplaceGroup(1540568863);
                                    ButtonProminence.Id id3 = button2.prominence;
                                    if (1.0f <= 0.0d) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                        break;
                                    } else {
                                        AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement3 = new AdaptiveStackLayoutWeightElement(1.0f);
                                        boolean changedInstance3 = gapComposer4.changedInstance(button2) | gapComposer4.changed(function12);
                                        Object rememberedValue3 = gapComposer4.rememberedValue();
                                        if (changedInstance3 || rememberedValue3 == obj3) {
                                            rememberedValue3 = new Function0() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i9 = i7;
                                                    Function1 function13 = function12;
                                                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button2;
                                                    switch (i9) {
                                                        case 0:
                                                            SavingsScreenViewEvent savingsScreenViewEvent = button22.action;
                                                            if (savingsScreenViewEvent != null) {
                                                                function13.invoke(savingsScreenViewEvent);
                                                            }
                                                            break;
                                                        default:
                                                            SavingsScreenViewEvent savingsScreenViewEvent2 = button22.action;
                                                            if (savingsScreenViewEvent2 != null) {
                                                                function13.invoke(savingsScreenViewEvent2);
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer4.updateRememberedValue(rememberedValue3);
                                        }
                                        ViewKt.ArcadeButtonDefault(id3, adaptiveStackLayoutWeightElement3, false, (Function0) rememberedValue3, Expect_jvmKt.rememberComposableLambda(-992709049, new Function3() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                int i9 = i7;
                                                SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer42 = (Composer) obj5;
                                                        int intValue32 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer5 = (Composer) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, 24624, 4);
                                        gapComposer4.end(false);
                                    }
                                } else {
                                    gapComposer4.startReplaceGroup(1540568862);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            final ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(123735634, new Function2() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Object obj3 = Composer.Companion.Empty;
                    final Function1 function12 = function1;
                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup buttonGroup2 = buttonGroup;
                    final int i7 = 1;
                    final int i8 = 0;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                ButtonProminence.Id id = buttonGroup2.primaryButton.prominence;
                                if (1.0f <= 0.0d) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                    break;
                                } else {
                                    AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement = new AdaptiveStackLayoutWeightElement(1.0f);
                                    boolean changedInstance = gapComposer2.changedInstance(buttonGroup2) | gapComposer2.changed(function12);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changedInstance || rememberedValue == obj3) {
                                        rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(9, (Object) buttonGroup2, function12);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    ViewKt.ArcadeButtonDefault(id, adaptiveStackLayoutWeightElement, false, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(12621128, new ButtonGroupKt$$ExternalSyntheticLambda11(buttonGroup2, 0), gapComposer2), gapComposer2, 24624, 4);
                                }
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                final SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button = buttonGroup2.secondaryButton;
                                if (button != null) {
                                    gapComposer3.startReplaceGroup(1126370255);
                                    ButtonProminence.Id id2 = button.prominence;
                                    if (1.0f <= 0.0d) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                        break;
                                    } else {
                                        AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement2 = new AdaptiveStackLayoutWeightElement(1.0f);
                                        boolean changedInstance2 = gapComposer3.changedInstance(button) | gapComposer3.changed(function12);
                                        Object rememberedValue2 = gapComposer3.rememberedValue();
                                        if (changedInstance2 || rememberedValue2 == obj3) {
                                            rememberedValue2 = new Function0() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i9 = i8;
                                                    Function1 function13 = function12;
                                                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button;
                                                    switch (i9) {
                                                        case 0:
                                                            SavingsScreenViewEvent savingsScreenViewEvent = button22.action;
                                                            if (savingsScreenViewEvent != null) {
                                                                function13.invoke(savingsScreenViewEvent);
                                                            }
                                                            break;
                                                        default:
                                                            SavingsScreenViewEvent savingsScreenViewEvent2 = button22.action;
                                                            if (savingsScreenViewEvent2 != null) {
                                                                function13.invoke(savingsScreenViewEvent2);
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer3.updateRememberedValue(rememberedValue2);
                                        }
                                        ViewKt.ArcadeButtonDefault(id2, adaptiveStackLayoutWeightElement2, false, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(338061773, new Function3() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                int i9 = i8;
                                                SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer42 = (Composer) obj5;
                                                        int intValue32 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer5 = (Composer) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, 24624, 4);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.startReplaceGroup(1126370254);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                final SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button2 = buttonGroup2.tertiaryButton;
                                if (button2 != null) {
                                    gapComposer4.startReplaceGroup(1540568863);
                                    ButtonProminence.Id id3 = button2.prominence;
                                    if (1.0f <= 0.0d) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                        break;
                                    } else {
                                        AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement3 = new AdaptiveStackLayoutWeightElement(1.0f);
                                        boolean changedInstance3 = gapComposer4.changedInstance(button2) | gapComposer4.changed(function12);
                                        Object rememberedValue3 = gapComposer4.rememberedValue();
                                        if (changedInstance3 || rememberedValue3 == obj3) {
                                            rememberedValue3 = new Function0() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i9 = i7;
                                                    Function1 function13 = function12;
                                                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button2;
                                                    switch (i9) {
                                                        case 0:
                                                            SavingsScreenViewEvent savingsScreenViewEvent = button22.action;
                                                            if (savingsScreenViewEvent != null) {
                                                                function13.invoke(savingsScreenViewEvent);
                                                            }
                                                            break;
                                                        default:
                                                            SavingsScreenViewEvent savingsScreenViewEvent2 = button22.action;
                                                            if (savingsScreenViewEvent2 != null) {
                                                                function13.invoke(savingsScreenViewEvent2);
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer4.updateRememberedValue(rememberedValue3);
                                        }
                                        ViewKt.ArcadeButtonDefault(id3, adaptiveStackLayoutWeightElement3, false, (Function0) rememberedValue3, Expect_jvmKt.rememberComposableLambda(-992709049, new Function3() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                int i9 = i7;
                                                SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer42 = (Composer) obj5;
                                                        int intValue32 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer5 = (Composer) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, 24624, 4);
                                        gapComposer4.end(false);
                                    }
                                } else {
                                    gapComposer4.startReplaceGroup(1540568862);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            final ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(524397858, new Function2() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i2;
                    Object obj3 = Composer.Companion.Empty;
                    final Function1 function12 = function1;
                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup buttonGroup2 = buttonGroup;
                    final int i7 = 1;
                    final int i8 = 0;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                ButtonProminence.Id id = buttonGroup2.primaryButton.prominence;
                                if (1.0f <= 0.0d) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                    break;
                                } else {
                                    AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement = new AdaptiveStackLayoutWeightElement(1.0f);
                                    boolean changedInstance = gapComposer2.changedInstance(buttonGroup2) | gapComposer2.changed(function12);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changedInstance || rememberedValue == obj3) {
                                        rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(9, (Object) buttonGroup2, function12);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    ViewKt.ArcadeButtonDefault(id, adaptiveStackLayoutWeightElement, false, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(12621128, new ButtonGroupKt$$ExternalSyntheticLambda11(buttonGroup2, 0), gapComposer2), gapComposer2, 24624, 4);
                                }
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                final SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button = buttonGroup2.secondaryButton;
                                if (button != null) {
                                    gapComposer3.startReplaceGroup(1126370255);
                                    ButtonProminence.Id id2 = button.prominence;
                                    if (1.0f <= 0.0d) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                        break;
                                    } else {
                                        AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement2 = new AdaptiveStackLayoutWeightElement(1.0f);
                                        boolean changedInstance2 = gapComposer3.changedInstance(button) | gapComposer3.changed(function12);
                                        Object rememberedValue2 = gapComposer3.rememberedValue();
                                        if (changedInstance2 || rememberedValue2 == obj3) {
                                            rememberedValue2 = new Function0() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i9 = i8;
                                                    Function1 function13 = function12;
                                                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button;
                                                    switch (i9) {
                                                        case 0:
                                                            SavingsScreenViewEvent savingsScreenViewEvent = button22.action;
                                                            if (savingsScreenViewEvent != null) {
                                                                function13.invoke(savingsScreenViewEvent);
                                                            }
                                                            break;
                                                        default:
                                                            SavingsScreenViewEvent savingsScreenViewEvent2 = button22.action;
                                                            if (savingsScreenViewEvent2 != null) {
                                                                function13.invoke(savingsScreenViewEvent2);
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer3.updateRememberedValue(rememberedValue2);
                                        }
                                        ViewKt.ArcadeButtonDefault(id2, adaptiveStackLayoutWeightElement2, false, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(338061773, new Function3() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                int i9 = i8;
                                                SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer42 = (Composer) obj5;
                                                        int intValue32 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer5 = (Composer) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, 24624, 4);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.startReplaceGroup(1126370254);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                final SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button2 = buttonGroup2.tertiaryButton;
                                if (button2 != null) {
                                    gapComposer4.startReplaceGroup(1540568863);
                                    ButtonProminence.Id id3 = button2.prominence;
                                    if (1.0f <= 0.0d) {
                                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                                        break;
                                    } else {
                                        AdaptiveStackLayoutWeightElement adaptiveStackLayoutWeightElement3 = new AdaptiveStackLayoutWeightElement(1.0f);
                                        boolean changedInstance3 = gapComposer4.changedInstance(button2) | gapComposer4.changed(function12);
                                        Object rememberedValue3 = gapComposer4.rememberedValue();
                                        if (changedInstance3 || rememberedValue3 == obj3) {
                                            rememberedValue3 = new Function0() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i9 = i7;
                                                    Function1 function13 = function12;
                                                    SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button2;
                                                    switch (i9) {
                                                        case 0:
                                                            SavingsScreenViewEvent savingsScreenViewEvent = button22.action;
                                                            if (savingsScreenViewEvent != null) {
                                                                function13.invoke(savingsScreenViewEvent);
                                                            }
                                                            break;
                                                        default:
                                                            SavingsScreenViewEvent savingsScreenViewEvent2 = button22.action;
                                                            if (savingsScreenViewEvent2 != null) {
                                                                function13.invoke(savingsScreenViewEvent2);
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            gapComposer4.updateRememberedValue(rememberedValue3);
                                        }
                                        ViewKt.ArcadeButtonDefault(id3, adaptiveStackLayoutWeightElement3, false, (Function0) rememberedValue3, Expect_jvmKt.rememberComposableLambda(-992709049, new Function3() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                int i9 = i7;
                                                SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup.Button button22 = button2;
                                                switch (i9) {
                                                    case 0:
                                                        Composer composer42 = (Composer) obj5;
                                                        int intValue32 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                                        if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer42.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer5 = (Composer) obj5;
                                                        int intValue4 = ((Integer) obj6).intValue();
                                                        ((RowScope) obj4).getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer5.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer4), gapComposer4, 24624, 4);
                                        gapComposer4.end(false);
                                    }
                                } else {
                                    gapComposer4.startReplaceGroup(1540568862);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            int ordinal = buttonGroup.direction.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-2022138102);
                zzabx.ButtonDefaultGroupHorizontal(modifier, Expect_jvmKt.rememberComposableLambda(574180782, new Function3() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i4;
                        ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda3;
                        ComposableLambdaImpl composableLambdaImpl2 = rememberComposableLambda2;
                        ComposableLambdaImpl composableLambdaImpl3 = rememberComposableLambda;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((AdaptiveStackScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    composableLambdaImpl3.invoke((Object) gapComposer2, (Object) 6);
                                    composableLambdaImpl2.invoke((Object) gapComposer2, (Object) 6);
                                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 6);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    composableLambdaImpl3.invoke((Object) gapComposer3, (Object) 6);
                                    composableLambdaImpl2.invoke((Object) gapComposer3, (Object) 6);
                                    composableLambdaImpl.invoke((Object) gapComposer3, (Object) 6);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i3 >> 3) & 14) | 48, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2022140154, false);
                }
                gapComposer.startReplaceGroup(-2022132408);
                zzabx.ButtonDefaultGroupVertical(modifier, Expect_jvmKt.rememberComposableLambda(-1306291799, new Function3() { // from class: com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i5;
                        ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda3;
                        ComposableLambdaImpl composableLambdaImpl2 = rememberComposableLambda2;
                        ComposableLambdaImpl composableLambdaImpl3 = rememberComposableLambda;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((AdaptiveStackScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    composableLambdaImpl3.invoke((Object) gapComposer2, (Object) 6);
                                    composableLambdaImpl2.invoke((Object) gapComposer2, (Object) 6);
                                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 6);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    composableLambdaImpl3.invoke((Object) gapComposer3, (Object) 6);
                                    composableLambdaImpl2.invoke((Object) gapComposer3, (Object) 6);
                                    composableLambdaImpl.invoke((Object) gapComposer3, (Object) 6);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i3 >> 3) & 14) | 48, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(buttonGroup, modifier, function1, i, 23);
        }
    }

    public static final void Celebration(final CelebrationViewModel celebrationViewModel, final Modifier modifier, final boolean z, final Function1 function1, Composer composer, final int i) {
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        String str;
        modifier.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-303667155);
        int i2 = i | (gapComposer.changedInstance(celebrationViewModel) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        } else {
            if (celebrationViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2(celebrationViewModel, modifier, z, function1, i, i3) { // from class: com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ CelebrationViewModel f$0;
                        public final /* synthetic */ Modifier f$1;
                        public final /* synthetic */ boolean f$2;
                        public final /* synthetic */ Function1 f$3;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(1);
                                    ButtonGroupKt.Celebration(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(1);
                                    ButtonGroupKt.Celebration(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            modifier2 = modifier;
            Animation animation = celebrationViewModel.animation;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            if (colors.isLight) {
                str = animation.light_url;
                str.getClass();
            } else {
                String str2 = animation.dark_url;
                if (str2 != null) {
                    if (StringsKt.isBlank(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                }
                str = animation.light_url;
                str.getClass();
            }
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier2, Color.Transparent, ColorKt.RectangleShape);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CelebrationKt$$ExternalSyntheticLambda1(0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(celebrationViewModel) | gapComposer.changed(str) | ((i2 & 7168) == 2048);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MenuKt$$ExternalSyntheticLambda0((Object) celebrationViewModel, z, (Object) str, mutableState, function1, 6);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView(function12, m177backgroundbw27NRU, (Function1) rememberedValue3, gapComposer, 6, 0);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            final Modifier modifier3 = modifier2;
            function2 = new Function2(celebrationViewModel, modifier3, z, function1, i, i4) { // from class: com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ CelebrationViewModel f$0;
                public final /* synthetic */ Modifier f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ Function1 f$3;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(1);
                            ButtonGroupKt.Celebration(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(1);
                            ButtonGroupKt.Celebration(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void CondensedTransferInView(AmountPickerViewModel amountPickerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(335324624);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(amountPickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (amountPickerViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1011621659, new FullTransferInViewKt$$ExternalSyntheticLambda1(function1, amountPickerViewModel, 6), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FullTransferInViewKt$$ExternalSyntheticLambda0(amountPickerViewModel, function1, i, 2);
        }
    }

    public static final void Error(TransferringViewModel.Error error, Function1 function1, Composer composer, int i) {
        Function1 function12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        TransferringViewModel.Error error2 = error;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1484350568);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(error2) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            NavigationType navigationType = NavigationType.CLOSE;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, horizontal, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$16);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$16);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$15);
            TextViewKt.Avatar(AvatarSize.Size64, new AvatarEntry("", Strings.getColors(gapComposer).semantic.icon.danger, null, new AvatarImage.LocalIcon(Icons.Failed32, Color.White, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer, 6, 28);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            error2 = error;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).header, (TextLineBalancing) null, error2.description, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
            boolean changedInstance = gapComposer.changedInstance(error2) | (i3 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new ShareSheetViewKt$$ExternalSyntheticLambda5(15, function12, error2);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, m302paddingqDBjuR0$default, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1799939561, new ButtonGroupKt$$ExternalSyntheticLambda11(error2, 18), gapComposer), gapComposer, 1573248, 56);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(error2, function12, i, 16);
        }
    }

    public static final void FolderRow(SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder folder, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Float f;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-166456342);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(folder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(folder);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(10, (Object) folder, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(modifier, false, null, null, (Function0) rememberedValue, 15);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, 16.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon folderIcon = folder.icon;
            float f2 = folderIcon instanceof SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon.Default ? 2.0f : 4.0f;
            long j = Strings.getColors(gapComposer).data.portion.full;
            float f3 = f2;
            String iconId = folderIcon.getIconId();
            SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon.ProgressIcon progressIcon = folderIcon instanceof SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon.ProgressIcon ? (SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon.ProgressIcon) folderIcon : null;
            if (progressIcon != null) {
                f = Float.valueOf(progressIcon.progress);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                f = null;
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 48.0f);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CelebrationKt$$ExternalSyntheticLambda1(27);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            VisibleKt.m3496ProgressEmojiIconLzaahlw(iconId, f, SemanticsModifierKt.clearAndSetSemantics(m285size3ABfNKs, (Function1) rememberedValue2), f3, 2.0f, j, 0L, 0L, gapComposer, 0, 960);
            gapComposer = gapComposer;
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, folder.title, (Map) null, (Function1) null, false);
            String str = folder.subtitle;
            if (str == null) {
                gapComposer.startReplaceGroup(1571598676);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1571598677);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, folder.amount, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9((Object) folder, (Object) modifier, function1, i, 23);
        }
    }

    public static final void FullTransferInView(AmountPickerViewModel amountPickerViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(455907131);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(amountPickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        int i4 = 0;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (amountPickerViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new FullTransferInViewKt$$ExternalSyntheticLambda0(amountPickerViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-557374074, new FullTransferInViewKt$$ExternalSyntheticLambda1(function1, amountPickerViewModel, i4), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new FullTransferInViewKt$$ExternalSyntheticLambda2(amountPickerViewModel, function1, modifier2, i, 0);
        }
    }

    public static final void FullTransferOutView(AmountPickerViewModel amountPickerViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-326383313);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(amountPickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            AmountPickerViewModel.Ready ready = amountPickerViewModel instanceof AmountPickerViewModel.Ready ? (AmountPickerViewModel.Ready) amountPickerViewModel : null;
            if (ready == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new FullTransferInViewKt$$ExternalSyntheticLambda0(amountPickerViewModel, function1, i, 3);
                    return;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(867954874, new BorrowAmountPickerKt$$ExternalSyntheticLambda11(function1, ready), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new FullTransferInViewKt$$ExternalSyntheticLambda2(amountPickerViewModel, function1, modifier2, i, 2);
        }
    }

    public static final void GoalFolderList(SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList goalFolderList, Modifier modifier, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1123541384);
        int i2 = (gapComposer.changedInstance(goalFolderList) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(2015876290);
            Iterator it = goalFolderList.folders.iterator();
            while (it.hasNext()) {
                FolderRow((SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder) it.next(), SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), function1, gapComposer, (i2 & 896) | 48);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(goalFolderList, modifier, function1, i, 25);
        }
    }

    public static final void LabeledPushWithColors(String str, ColorModel colorModel, Composer composer, int i) {
        GapComposer gapComposer;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1288682553);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(colorModel) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Color color = null;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle textStyle = Strings.getTypography(gapComposer2).bodyMedium;
            if (colorModel == null) {
                gapComposer2.startReplaceGroup(-1077562022);
                gapComposer2.end(false);
            } else {
                color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, 242334599, colorModel, gapComposer2, false);
            }
            if (color == null) {
                gapComposer2.startReplaceGroup(242336101);
                j = Strings.getColors(gapComposer2).semantic.text.standard;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(242334303);
                gapComposer2.end(false);
                j = color.value;
            }
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 6, i2 & 14, 0, 3826, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, (Modifier) null, Strings.getColors(gapComposer).component.cell.controls.icon.f174default, gapComposer, 54, 4);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(str, colorModel, i, 11);
        }
    }

    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v23 */
    public static final void ReadyContent(AmountPickerViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        Object fullTransferInViewKt$$ExternalSyntheticLambda7;
        Long l;
        ?? r15;
        RealCashVibrator realCashVibrator;
        MutableState mutableState;
        Shaker shaker;
        int i2;
        Object fullTransferInViewKt$ReadyContent$2$1;
        String str;
        Boolean bool;
        Modifier.Companion companion;
        boolean z;
        float f;
        GapComposer gapComposer;
        Money money;
        Money money2;
        AmountPickerViewModel.Ready ready2 = ready;
        Function1 function12 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1824757593);
        Applier applier = gapComposer2.applier;
        int i3 = (gapComposer2.changedInstance(ready2) ? 4 : 2) | i | (gapComposer2.changedInstance(function12) ? 32 : 16);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            RealCashVibrator realCashVibrator2 = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer2, 0);
            AmountPickerViewModel.Ready.Amount amount = ready2.maxAmount;
            AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = amount instanceof AmountPickerViewModel.Ready.Amount.MoneyAmount ? (AmountPickerViewModel.Ready.Amount.MoneyAmount) amount : null;
            CurrencyCode currencyCode = (moneyAmount == null || (money2 = moneyAmount.money) == null) ? null : money2.currency_code;
            Long l2 = (moneyAmount == null || (money = moneyAmount.money) == null) ? null : money.amount;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode == null ? CurrencyCode.USD : currencyCode, null, false, 0, 14);
            int i4 = i3 & 112;
            boolean changed = gapComposer2.changed(currencyCode == null ? -1 : currencyCode.ordinal()) | (i4 == 32) | gapComposer2.changedInstance(realCashVibrator2) | gapComposer2.changedInstance(rememberShaker);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                l = l2;
                CurrencyCode currencyCode2 = currencyCode;
                r15 = 0;
                fullTransferInViewKt$$ExternalSyntheticLambda7 = new FullTransferInViewKt$$ExternalSyntheticLambda7(currencyCode2, realCashVibrator2, rememberShaker, mutableState2, function1, 0);
                currencyCode = currencyCode2;
                realCashVibrator = realCashVibrator2;
                mutableState = mutableState2;
                shaker = rememberShaker;
                gapComposer2.updateRememberedValue(fullTransferInViewKt$$ExternalSyntheticLambda7);
            } else {
                realCashVibrator = realCashVibrator2;
                shaker = rememberShaker;
                fullTransferInViewKt$$ExternalSyntheticLambda7 = rememberedValue2;
                r15 = 0;
                l = l2;
                mutableState = mutableState2;
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, r15, (Function1) fullTransferInViewKt$$ExternalSyntheticLambda7, gapComposer2, 2);
            boolean changed2 = gapComposer2.changed(currencyCode == null ? -1 : currencyCode.ordinal()) | gapComposer2.changed(rememberAmountDisplayState);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new FullTransferInViewKt$ReadyContent$1$1(currencyCode, rememberAmountDisplayState, r15, 0);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer2, currencyCode, (Function2) rememberedValue3);
            String str2 = ready2.presetAmount;
            Boolean bool2 = (Boolean) mutableState.getValue();
            bool2.booleanValue();
            boolean changedInstance = gapComposer2.changedInstance(ready2) | gapComposer2.changed(rememberAmountDisplayState);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                i2 = i4;
                str = str2;
                bool = bool2;
                fullTransferInViewKt$ReadyContent$2$1 = new FullTransferInViewKt$ReadyContent$2$1(ready2, rememberAmountDisplayState, mutableState, null, 0);
                gapComposer2.updateRememberedValue(fullTransferInViewKt$ReadyContent$2$1);
            } else {
                i2 = i4;
                fullTransferInViewKt$ReadyContent$2$1 = rememberedValue4;
                str = str2;
                bool = bool2;
            }
            Updater.LaunchedEffect(str, bool, (Function2) fullTransferInViewKt$ReadyContent$2$1, gapComposer2);
            boolean changed3 = gapComposer2.changed(rememberAmountDisplayState) | gapComposer2.changed(l);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new MaxCentsCappedKeypadListener(new AmountDisplayKeypadListener(rememberAmountDisplayState), rememberAmountDisplayState, l, new PoolDescriptionKt$$ExternalSyntheticLambda4(realCashVibrator, shaker, 5));
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MaxCentsCappedKeypadListener maxCentsCappedKeypadListener = (MaxCentsCappedKeypadListener) rememberedValue5;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 54);
            Shaker shaker2 = shaker;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            CurrencyCode currencyCode3 = currencyCode;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            int i5 = i2;
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getTypography(gapComposer2).titleBarPageTitle, (TextLineBalancing) null, ready2.title, (Map) null, (Function1) null, false);
            GapComposer gapComposer3 = gapComposer2;
            String str3 = ready2.subtitle;
            if (str3 == null) {
                gapComposer3.startReplaceGroup(-128271827);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-128271826);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getTypography(gapComposer3).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer3 = gapComposer3;
                gapComposer3.end(false);
            }
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion2, 1.0f), true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer3, 54);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion2, 1.0f), shaker2);
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new CelebrationKt$$ExternalSyntheticLambda1(25);
                gapComposer3.updateRememberedValue(rememberedValue6);
            }
            GapComposer gapComposer4 = gapComposer3;
            ConnectionPoolKt.m1177AmountDisplaykNX22eY(rememberAmountDisplayState, SemanticsModifierKt.semantics(shakeWith, false, (Function1) rememberedValue6), Strings.getColors(gapComposer3).semantic.text.prominent, Room.getSp(96), 0, 0, gapComposer4, 3072, 48);
            GapComposer gapComposer5 = gapComposer4;
            String str4 = ready2.amountCaption;
            if (str4 == null) {
                gapComposer5.startReplaceGroup(644984222);
                gapComposer5.end(false);
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer5, 644984223, companion2, 12.0f, gapComposer5);
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer5).semantic.text.prominent, (Composer) gapComposer5, SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getTypography(gapComposer5).labelMedium, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                gapComposer5 = gapComposer5;
                gapComposer5.end(false);
            }
            gapComposer5.end(true);
            boolean changedInstance2 = gapComposer5.changedInstance(maxCentsCappedKeypadListener);
            Object rememberedValue7 = gapComposer5.rememberedValue();
            if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new FullTransferInViewKt$$ExternalSyntheticLambda10(maxCentsCappedKeypadListener, 0);
                gapComposer5.updateRememberedValue(rememberedValue7);
            }
            Function0 function0 = (Function0) rememberedValue7;
            boolean changedInstance3 = gapComposer5.changedInstance(maxCentsCappedKeypadListener);
            Object rememberedValue8 = gapComposer5.rememberedValue();
            if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = new FullTransferInViewKt$$ExternalSyntheticLambda11(maxCentsCappedKeypadListener, 0);
                gapComposer5.updateRememberedValue(rememberedValue8);
            }
            GapComposer gapComposer6 = gapComposer5;
            RelationUtil.m1189KeypadViewww6aTOc(null, new KeypadViewModel(null, false, function0, (Function1) rememberedValue8, 3), null, Strings.getColors(gapComposer5).semantic.text.standard, gapComposer6, 0, 5);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer6), companion2, 32.0f, gapComposer6);
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
            boolean z2 = ready2.buttonEnabled;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            boolean changed4 = gapComposer6.changed(rememberAmountDisplayState) | gapComposer6.changed(currencyCode3 != null ? currencyCode3.ordinal() : -1) | gapComposer6.changedInstance(ready2) | gapComposer6.changedInstance(realCashVibrator) | gapComposer6.changedInstance(shaker2) | (i5 == 32);
            Object rememberedValue9 = gapComposer6.rememberedValue();
            if (changed4 || rememberedValue9 == neverEqualPolicy) {
                function12 = function1;
                RealCashVibrator realCashVibrator3 = realCashVibrator;
                companion = companion2;
                z = z2;
                f = 32.0f;
                gapComposer = gapComposer6;
                FullTransferInViewKt$$ExternalSyntheticLambda12 fullTransferInViewKt$$ExternalSyntheticLambda12 = new FullTransferInViewKt$$ExternalSyntheticLambda12(rememberAmountDisplayState, currencyCode3, ready2, realCashVibrator3, shaker2, function12, 0);
                ready2 = ready2;
                gapComposer.updateRememberedValue(fullTransferInViewKt$$ExternalSyntheticLambda12);
                rememberedValue9 = fullTransferInViewKt$$ExternalSyntheticLambda12;
            } else {
                function12 = function1;
                f = 32.0f;
                companion = companion2;
                z = z2;
                ready2 = ready2;
                gapComposer = gapComposer6;
            }
            GapComposer gapComposer7 = gapComposer;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-47575074, new BorrowAmountPickerKt$$ExternalSyntheticLambda10(ready2, 4), gapComposer), gapComposer7, 1573296, 40);
            gapComposer2 = gapComposer7;
            Strings.getSizes(gapComposer2).getClass();
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, f));
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BorrowAmountPickerKt$$ExternalSyntheticLambda11(ready2, function12, i, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v22 */
    public static final void ReadyContent$1(AmountPickerViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        Object fullTransferInViewKt$$ExternalSyntheticLambda7;
        Long l;
        ?? r14;
        CurrencyCode currencyCode;
        RealCashVibrator realCashVibrator;
        MutableState mutableState;
        Shaker shaker;
        Object fullTransferInViewKt$ReadyContent$2$1;
        int i2;
        Boolean bool;
        boolean z;
        boolean z2;
        float f;
        GapComposer gapComposer;
        Money money;
        Money money2;
        AmountPickerViewModel.Ready ready2 = ready;
        Function1 function12 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(948561080);
        Applier applier = gapComposer2.applier;
        int i3 = (gapComposer2.changedInstance(ready2) ? 4 : 2) | i | (gapComposer2.changedInstance(function12) ? 32 : 16);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            RealCashVibrator realCashVibrator2 = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer2, 0);
            AmountPickerViewModel.Ready.Amount amount = ready2.maxAmount;
            AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = amount instanceof AmountPickerViewModel.Ready.Amount.MoneyAmount ? (AmountPickerViewModel.Ready.Amount.MoneyAmount) amount : null;
            CurrencyCode currencyCode2 = (moneyAmount == null || (money2 = moneyAmount.money) == null) ? null : money2.currency_code;
            Long l2 = (moneyAmount == null || (money = moneyAmount.money) == null) ? null : money.amount;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode2 == null ? CurrencyCode.USD : currencyCode2, null, false, 0, 14);
            int i4 = i3 & 112;
            boolean changed = gapComposer2.changed(currencyCode2 == null ? -1 : currencyCode2.ordinal()) | (i4 == 32) | gapComposer2.changedInstance(realCashVibrator2) | gapComposer2.changedInstance(rememberShaker);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                l = l2;
                r14 = 0;
                fullTransferInViewKt$$ExternalSyntheticLambda7 = new FullTransferInViewKt$$ExternalSyntheticLambda7(currencyCode2, realCashVibrator2, rememberShaker, mutableState2, function1, 1);
                currencyCode = currencyCode2;
                realCashVibrator = realCashVibrator2;
                mutableState = mutableState2;
                shaker = rememberShaker;
                gapComposer2.updateRememberedValue(fullTransferInViewKt$$ExternalSyntheticLambda7);
            } else {
                l = l2;
                fullTransferInViewKt$$ExternalSyntheticLambda7 = rememberedValue2;
                currencyCode = currencyCode2;
                shaker = rememberShaker;
                mutableState = mutableState2;
                r14 = 0;
                realCashVibrator = realCashVibrator2;
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, r14, (Function1) fullTransferInViewKt$$ExternalSyntheticLambda7, gapComposer2, 2);
            boolean changed2 = gapComposer2.changed(currencyCode == null ? -1 : currencyCode.ordinal()) | gapComposer2.changed(rememberAmountDisplayState);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new FullTransferInViewKt$ReadyContent$1$1(currencyCode, rememberAmountDisplayState, r14, 1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer2, currencyCode, (Function2) rememberedValue3);
            String str = ready2.presetAmount;
            Boolean bool2 = (Boolean) mutableState.getValue();
            bool2.booleanValue();
            boolean changedInstance = gapComposer2.changedInstance(ready2) | gapComposer2.changed(rememberAmountDisplayState);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                i2 = i4;
                bool = bool2;
                fullTransferInViewKt$ReadyContent$2$1 = new FullTransferInViewKt$ReadyContent$2$1(ready2, rememberAmountDisplayState, mutableState, null, 3);
                gapComposer2.updateRememberedValue(fullTransferInViewKt$ReadyContent$2$1);
            } else {
                i2 = i4;
                fullTransferInViewKt$ReadyContent$2$1 = rememberedValue4;
                bool = bool2;
            }
            Updater.LaunchedEffect(str, bool, (Function2) fullTransferInViewKt$ReadyContent$2$1, gapComposer2);
            boolean changed3 = gapComposer2.changed(rememberAmountDisplayState) | gapComposer2.changed(l);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new MaxCentsCappedKeypadListener(new AmountDisplayKeypadListener(rememberAmountDisplayState), rememberAmountDisplayState, l, new PoolDescriptionKt$$ExternalSyntheticLambda4(realCashVibrator, shaker, 6));
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MaxCentsCappedKeypadListener maxCentsCappedKeypadListener = (MaxCentsCappedKeypadListener) rememberedValue5;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            CurrencyCode currencyCode3 = currencyCode;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            int i5 = i2;
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer2).titleBarPageTitle, (TextLineBalancing) null, ready2.title, (Map) null, (Function1) null, false);
            GapComposer gapComposer3 = gapComposer2;
            String str2 = ready2.subtitle;
            if (str2 == null) {
                gapComposer3.startReplaceGroup(-515943102);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-515943101);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer3).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer3 = gapComposer3;
                gapComposer3.end(false);
            }
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer3, 54);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, 1.0f), shaker);
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new CelebrationKt$$ExternalSyntheticLambda1(26);
                gapComposer3.updateRememberedValue(rememberedValue6);
            }
            GapComposer gapComposer4 = gapComposer3;
            ConnectionPoolKt.m1177AmountDisplaykNX22eY(rememberAmountDisplayState, SemanticsModifierKt.semantics(shakeWith, false, (Function1) rememberedValue6), Strings.getColors(gapComposer3).semantic.text.prominent, Room.getSp(96), 0, 0, gapComposer4, 3072, 48);
            GapComposer gapComposer5 = gapComposer4;
            String str3 = ready2.amountCaption;
            if (str3 == null) {
                gapComposer5.startReplaceGroup(1978933127);
                gapComposer5.end(false);
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer5, 1978933128, companion, 12.0f, gapComposer5);
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer5).semantic.text.prominent, (Composer) gapComposer5, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer5).labelMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer5 = gapComposer5;
                gapComposer5.end(false);
            }
            gapComposer5.end(true);
            boolean changedInstance2 = gapComposer5.changedInstance(maxCentsCappedKeypadListener);
            Object rememberedValue7 = gapComposer5.rememberedValue();
            if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new FullTransferInViewKt$$ExternalSyntheticLambda10(maxCentsCappedKeypadListener, 1);
                gapComposer5.updateRememberedValue(rememberedValue7);
            }
            Function0 function0 = (Function0) rememberedValue7;
            boolean changedInstance3 = gapComposer5.changedInstance(maxCentsCappedKeypadListener);
            Object rememberedValue8 = gapComposer5.rememberedValue();
            if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                z = true;
                rememberedValue8 = new FullTransferInViewKt$$ExternalSyntheticLambda11(maxCentsCappedKeypadListener, 1);
                gapComposer5.updateRememberedValue(rememberedValue8);
            } else {
                z = true;
            }
            Shaker shaker2 = shaker;
            boolean z3 = false;
            boolean z4 = z;
            GapComposer gapComposer6 = gapComposer5;
            RelationUtil.m1189KeypadViewww6aTOc(null, new KeypadViewModel(null, false, function0, (Function1) rememberedValue8, 3), null, Strings.getColors(gapComposer5).semantic.text.standard, gapComposer6, 0, 5);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer6), companion, 32.0f, gapComposer6);
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
            boolean z5 = ready2.buttonEnabled;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed4 = gapComposer6.changed(rememberAmountDisplayState) | gapComposer6.changed(currencyCode3 != null ? currencyCode3.ordinal() : -1) | gapComposer6.changedInstance(ready2) | gapComposer6.changedInstance(realCashVibrator) | gapComposer6.changedInstance(shaker2);
            if (i5 == 32) {
                z3 = z4;
            }
            boolean z6 = changed4 | z3;
            Object rememberedValue9 = gapComposer6.rememberedValue();
            if (z6 || rememberedValue9 == neverEqualPolicy) {
                function12 = function1;
                z2 = z5;
                RealCashVibrator realCashVibrator3 = realCashVibrator;
                f = 32.0f;
                gapComposer = gapComposer6;
                FullTransferInViewKt$$ExternalSyntheticLambda12 fullTransferInViewKt$$ExternalSyntheticLambda12 = new FullTransferInViewKt$$ExternalSyntheticLambda12(rememberAmountDisplayState, currencyCode3, ready2, realCashVibrator3, shaker2, function12, 1);
                ready2 = ready2;
                gapComposer.updateRememberedValue(fullTransferInViewKt$$ExternalSyntheticLambda12);
                rememberedValue9 = fullTransferInViewKt$$ExternalSyntheticLambda12;
            } else {
                function12 = function1;
                z2 = z5;
                f = 32.0f;
                ready2 = ready2;
                gapComposer = gapComposer6;
            }
            GapComposer gapComposer7 = gapComposer;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(-1259176749, new BorrowAmountPickerKt$$ExternalSyntheticLambda10(ready2, 5), gapComposer), gapComposer7, 1573296, 40);
            gapComposer2 = gapComposer7;
            Strings.getSizes(gapComposer2).getClass();
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, f));
            gapComposer2.end(z4);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BorrowAmountPickerKt$$ExternalSyntheticLambda11(ready2, function12, i, 3);
        }
    }

    public static final void SavingsCellDefault(CellDefaultViewModel cellDefaultViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl;
        Icons icons;
        boolean z;
        Color m;
        long j;
        Icon icon;
        String str;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1567540734);
        int i2 = i | (gapComposer.changedInstance(cellDefaultViewModel) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1151020422, new SheetKt$$ExternalSyntheticLambda6(cellDefaultViewModel, 2), gapComposer);
            String str2 = cellDefaultViewModel.body;
            CellDefaultViewModel.Icon icon2 = cellDefaultViewModel.icon;
            CellDefaultViewModel.Accessory accessory = cellDefaultViewModel.accessory;
            if (str2 == null) {
                gapComposer.startReplaceGroup(573650443);
                gapComposer.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer.startReplaceGroup(573650444);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1155961125, new InfoSectionKt$$ExternalSyntheticLambda7(str2, 19), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda2;
            }
            if (icon2 == null || (icon = icon2.getIcon()) == null || (str = icon.arcade_id) == null) {
                icons = null;
            } else {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            }
            boolean changedInstance = gapComposer.changedInstance(cellDefaultViewModel) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(11, (Object) cellDefaultViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            if (icons != null) {
                gapComposer.startReplaceGroup(573861430);
                if (icon2 instanceof CellDefaultViewModel.Icon.TintedIcon) {
                    gapComposer.startReplaceGroup(573916734);
                    CellDefaultViewModel.Icon.TintedIcon tintedIcon = (CellDefaultViewModel.Icon.TintedIcon) icon2;
                    ColorModel colorModel = tintedIcon.tint;
                    if (colorModel == null) {
                        gapComposer.startReplaceGroup(574024117);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1126895564, colorModel, gapComposer, false);
                    }
                    if (m == null) {
                        gapComposer.startReplaceGroup(1126897065);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.icon.inverse;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1126895112);
                        gapComposer.end(false);
                        j = m.value;
                    }
                    Color forTheme = ThemablesKt.forTheme(tintedIcon.backgroundTint, gapComposer);
                    Icons icons2 = icons;
                    z = false;
                    CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons2, null, forTheme != null ? forTheme.value : Color.Unspecified, rememberComposableLambda, modifier, j, function0, null, false, true, composableLambdaImpl, null, accessory != null ? toAccessory(accessory) : null, 0L, null, gapComposer, ((i2 << 9) & 57344) | 805309488, 0, 27008);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    Icons icons3 = icons;
                    z = false;
                    gapComposer.startReplaceGroup(574423181);
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(343370552, new InfoSectionKt$$ExternalSyntheticLambda6(icons3, 26), gapComposer), rememberComposableLambda, modifier, function0, false, true, composableLambdaImpl, null, accessory != null ? toAccessory(accessory) : null, 0L, gapComposer, ((i2 << 3) & 896) | 1572918, 3376);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(574753269);
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, modifier, function0, false, false, composableLambdaImpl, null, 0L, accessory != null ? toAccessory(accessory) : null, null, gapComposer, (i2 & 112) | 6, 1464);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(cellDefaultViewModel, modifier, function1, i, 26);
        }
    }

    public static final void SavingsRouteInterstitial(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(655133678);
        int i2 = 1;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, lambda$1405979449, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetPresenter$$ExternalSyntheticLambda0(i, i2);
        }
    }

    public static final void SavingsUpsellCard(int i, Composer composer, Modifier modifier, UpsellCardModel$Loaded upsellCardModel$Loaded, Function1 function1) {
        int i2;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-925384032);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(upsellCardModel$Loaded) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i4 = 0;
        int i5 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.border.subtle;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            modifier.getClass();
            Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(modifier, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            UpsellCardModel$Loaded.Button button = upsellCardModel$Loaded.secondaryButton;
            if (button == null) {
                gapComposer.startReplaceGroup(1280401503);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1280401504);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1368779001, new ShareSheetViewKt$$ExternalSyntheticLambda1(20, (Object) button, (Object) function1), gapComposer);
                gapComposer.end(false);
            }
            ModalKt.InlineMessage(clip, Expect_jvmKt.rememberComposableLambda(-1934164082, new SavingsUpsellCardKt$$ExternalSyntheticLambda1(upsellCardModel$Loaded, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(912796367, new SavingsUpsellCardKt$$ExternalSyntheticLambda1(upsellCardModel$Loaded, i5), gapComposer), Expect_jvmKt.rememberComposableLambda(1828248642, new SavingsUpsellCardKt$$ExternalSyntheticLambda3(upsellCardModel$Loaded, function1, i4), gapComposer), rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(863743122, new SavingsUpsellCardKt$$ExternalSyntheticLambda1(upsellCardModel$Loaded, i3), gapComposer), gapComposer, 200112, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SavingsUpsellCardKt$$ExternalSyntheticLambda5(modifier, upsellCardModel$Loaded, function1, i);
        }
    }

    public static final void SavingsUpsellSheet(int i, Composer composer, Modifier modifier, UpsellCardModel$Loaded upsellCardModel$Loaded, Function1 function1) {
        int i2;
        UpsellCardModel$Loaded upsellCardModel$Loaded2;
        Function1 function12;
        Modifier modifier2;
        Integer arcadeResource;
        Modifier.Companion companion;
        int i3;
        Modifier modifier3;
        upsellCardModel$Loaded.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1231392652);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(upsellCardModel$Loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            CardImage cardImage = upsellCardModel$Loaded.image;
            if (cardImage == null) {
                gapComposer.startReplaceGroup(-174373003);
                gapComposer.end(false);
                arcadeResource = null;
            } else {
                gapComposer.startReplaceGroup(-421266932);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                arcadeResource = ViewKt.arcadeResource(cardImage, colors.isLight);
                gapComposer.end(false);
            }
            if (arcadeResource == null) {
                gapComposer.startReplaceGroup(-174325914);
                gapComposer.end(false);
                i3 = 0;
                companion = companion2;
                modifier3 = null;
            } else {
                gapComposer.startReplaceGroup(-174325913);
                companion = companion2;
                i3 = 0;
                ImageKt.Image(Countries.painterResource(arcadeResource.intValue(), 0, gapComposer), null, SizeKt.wrapContentSize$default(companion2, null, 3), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
                gapComposer = gapComposer;
                gapComposer.end(false);
                modifier3 = null;
            }
            DBUtil.SpacerBetweenSectionLarge(i3, 1, gapComposer, modifier3);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier modifier4 = modifier3;
            int i5 = i3;
            Modifier.Companion companion3 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).header, (TextLineBalancing) null, upsellCardModel$Loaded.title, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(i5, 1, gapComposer, modifier4);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, upsellCardModel$Loaded.body, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(i5, 1, gapComposer, modifier4);
            Strings.getSizes(gapComposer).getClass();
            modifier2 = companion3;
            upsellCardModel$Loaded2 = upsellCardModel$Loaded;
            function12 = function1;
            zzabx.ButtonDefaultGroupVertical(SpacerKt.m300paddingVpY3zN4$default(modifier2, RecyclerView.DECELERATION_RATE, 16.0f, 1), Expect_jvmKt.rememberComposableLambda(-638415930, new SavingsUpsellCardKt$$ExternalSyntheticLambda3(upsellCardModel$Loaded2, function12, 2), gapComposer), gapComposer, 48, i5);
            gapComposer.end(true);
        } else {
            upsellCardModel$Loaded2 = upsellCardModel$Loaded;
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SavingsUpsellCardKt$$ExternalSyntheticLambda5(upsellCardModel$Loaded2, modifier2, function12, i);
        }
    }

    public static final void SavingsUpsellSheetView(UpsellCardModel$Loaded upsellCardModel$Loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(183208601);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(upsellCardModel$Loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (upsellCardModel$Loaded == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-909481308, new CalloutKt$$ExternalSyntheticLambda0(17, function1, upsellCardModel$Loaded), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(upsellCardModel$Loaded, function1, i, 4);
        }
    }

    public static final void TransferInPicker(AmountPickerViewModel.Ready ready, Modifier modifier, Function1 function1, Composer composer, int i) {
        Function1 function12;
        ready.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1813007384);
        int i2 = i | (gapComposer.changedInstance(ready) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String str = ready.title;
            TextStyle textStyle = Strings.getTypography(gapComposer).header;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(24);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            boolean z = false;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = ready.subtitle;
            if (str2 == null) {
                gapComposer.startReplaceGroup(1149576801);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1149576802);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            List list = ready.amountSelections.items;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new InfoSectionKt$$ExternalSyntheticLambda1(25, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            TrimMode.AtmPickerGrid(6, 0, gapComposer, fillMaxWidth, list, (Function1) rememberedValue2);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            boolean z3 = ready.buttonEnabled;
            if (i3 == 256) {
                z = true;
            }
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(20, function12);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue3, m300paddingVpY3zN4$default2, buttonProminence, false, z3, null, Expect_jvmKt.rememberComposableLambda(-587977771, new BorrowAmountPickerKt$$ExternalSyntheticLambda10(ready, 3), gapComposer), gapComposer, 1573248, 40);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(ready, modifier, function12, i, 24);
        }
    }

    public static final void TransferringView(TransferringViewModel transferringViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(549916845);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(transferringViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (transferringViewModel == null) {
            gapComposer.startReplaceGroup(1567572905);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1567572906);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1856875330, new CalloutKt$$ExternalSyntheticLambda0(15, transferringViewModel, function1), gapComposer), gapComposer, 3072, 7);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(transferringViewModel, function1, i, 3);
        }
    }

    public static final long getAmountInCents(String str) {
        return MathKt__MathJVMKt.roundToLong(Double.parseDouble(str) * 100.0d);
    }

    public static final CellDefaultAccessory toAccessory(CellDefaultViewModel.Accessory accessory) {
        if (accessory instanceof CellDefaultViewModel.Accessory.Push) {
            return CellDefaultAccessory.Push.INSTANCE;
        }
        if (accessory instanceof CellDefaultViewModel.Accessory.LabeledPush) {
            return new CellDefaultAccessory.Label(new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda6(accessory, 3), true, -935467720), 1);
        }
        if (accessory instanceof CellDefaultViewModel.Accessory.CompactButton) {
            ButtonProminence.Id id = ((CellDefaultViewModel.Accessory.CompactButton) accessory).prominence;
            Pair pair = Intrinsics.areEqual(id, ArcadeButtonProminences.destructiveProminent) ? new Pair(com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT, Boolean.TRUE) : Intrinsics.areEqual(id, ArcadeButtonProminences.prominent) ? new Pair(com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT, Boolean.FALSE) : Intrinsics.areEqual(id, ArcadeButtonProminences.destructiveSubtle) ? new Pair(com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE, Boolean.TRUE) : Intrinsics.areEqual(id, ArcadeButtonProminences.subtle) ? new Pair(com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE, Boolean.FALSE) : Intrinsics.areEqual(id, ArcadeButtonProminences.destructiveStandard) ? new Pair(com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD, Boolean.TRUE) : new Pair(com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD, Boolean.FALSE);
            return new CellDefaultAccessory.ButtonCompact(null, (com.squareup.cash.arcade.components.button.ButtonProminence) pair.first, ((Boolean) pair.second).booleanValue(), new ComposableLambdaImpl(new ButtonGroupKt$$ExternalSyntheticLambda11(accessory, 15), true, 1941368817), 9);
        }
        if (accessory instanceof CellDefaultViewModel.Accessory.Label) {
            return new CellDefaultAccessory.Label(((CellDefaultViewModel.Accessory.Label) accessory).text, 0);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
