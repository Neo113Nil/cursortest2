package com.squareup.cash.instruments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.RippleKt;
import androidx.compose.material.RippleNodeFactory;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.x7$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda11;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.support.chat.views.ChatFailedDeliverySheetView$Content$1$1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class InstrumentAvatarUtilsKt {
    public static final ComposableLambdaImpl lambda$2142739538 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(8), false, 2142739538);
    public static final ComposableLambdaImpl lambda$470183401 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(20), false, 470183401);

    /* renamed from: lambda$-151452124, reason: not valid java name */
    public static final ComposableLambdaImpl f442lambda$151452124 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(1), false, -151452124);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CurrencyCode.values().length];
            try {
                iArr[CurrencyCode.AUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyCode.CAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyCode.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CurrencyCode.BTC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CurrencyCode.GBP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CurrencyCode.EUR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InstrumentType.values().length];
            try {
                iArr2[InstrumentType.VISA.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InstrumentType.MASTER_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InstrumentType.AMERICAN_EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InstrumentType.DISCOVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InstrumentType.DISCOVER_DINERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InstrumentType.JCB.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void InfoMessageRow(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2062123345);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Strings.getSizes(gapComposer).getClass();
            Trace.m1191Iconww6aTOc(Icons.InformationOutline16, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, 8.0f, RecyclerView.DECELERATION_RATE, 9), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 0);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i, 28);
        }
    }

    public static final void InstrumentSelection(InstrumentSelectionViewModel instrumentSelectionViewModel, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        instrumentSelectionViewModel.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1030442088);
        int i2 = i | (gapComposer.changedInstance(instrumentSelectionViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function02) ? 2048 : 1024) | 24576;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1833879597, new MoneyUiFactory$$ExternalSyntheticLambda1(instrumentSelectionViewModel, function02, function1, function0), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(instrumentSelectionViewModel, function1, function0, function02, modifier2, i);
        }
    }

    public static final void InstrumentSelectionBlockerView(InstrumentSelectionBlockerViewModel instrumentSelectionBlockerViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        instrumentSelectionBlockerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(154535202);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(instrumentSelectionBlockerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-2050967454, new InstrumentSelectionBlockerViewKt$$ExternalSyntheticLambda0(instrumentSelectionBlockerViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18((Object) instrumentSelectionBlockerViewModel, function1, (Object) realImageLoader, i, 4);
        }
    }

    public static final void InstrumentSelectionContent(InstrumentSelectionBlockerViewModel.Content content, Function1 function1, Composer composer, int i) {
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1135079716);
        Applier applier = gapComposer.applier;
        int i3 = (i & 6) == 0 ? i | (gapComposer.changedInstance(content) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(companion);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            int i4 = i3;
            NavigationType navigationType = NavigationType.CLOSE;
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                rememberedValue = new AppUpgradeViewKt$$ExternalSyntheticLambda7(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            int i6 = i5;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            gapComposer.startReplaceGroup(432360671);
            ArrayList arrayList = content.instrumentSections;
            InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex selectedInstrumentOptionIndex = content.selectedInstrumentOptionIndex;
            int i7 = 0;
            for (Object obj : arrayList) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                InstrumentSelectionBlockerViewModel.Content.InstrumentSection instrumentSection = (InstrumentSelectionBlockerViewModel.Content.InstrumentSection) obj;
                if (i7 > 0) {
                    gapComposer.startReplaceGroup(758505058);
                    i2 = 1;
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    i2 = 1;
                    gapComposer.startReplaceGroup(758559618);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(false);
                }
                GapComposer gapComposer2 = gapComposer;
                Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(1096495192, new CashMapViewKt$$ExternalSyntheticLambda5(instrumentSection, i2), gapComposer), (Modifier) null, (Function2) null, (Function2) null, gapComposer2, 6, 14);
                DBUtil.SpacerWithinSectionMedium(0, i2, gapComposer2, null);
                gapComposer2.startReplaceGroup(432370025);
                int i9 = 0;
                for (Object obj2 : instrumentSection.instrumentOptions) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    InstrumentSelectionBlockerViewModel.Content.InstrumentSection.InstrumentOption instrumentOption = (InstrumentSelectionBlockerViewModel.Content.InstrumentSection.InstrumentOption) obj2;
                    boolean z2 = selectedInstrumentOptionIndex.sectionIndex == i7 && selectedInstrumentOptionIndex.itemIndex == i9;
                    InstrumentCellViewModel instrumentCellViewModel = instrumentOption.instrumentCellViewModel;
                    boolean z3 = z2;
                    AvatarSize avatarSize = AvatarSize.Size48;
                    int i11 = i6;
                    boolean changed = (i11 == 32) | gapComposer2.changed(i7) | gapComposer2.changed(i9);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new x7$$ExternalSyntheticLambda1(function1, i7, i9, 3);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    GapComposer gapComposer3 = gapComposer2;
                    InstrumentCellKt.m3578InstrumentRowjM_yU8I(null, instrumentCellViewModel, avatarSize, z3, null, (Function0) rememberedValue2, gapComposer3, MLKEMEngine.KyberPolyBytes, 17);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                    String str = instrumentOption.infoMessage;
                    if (str == null) {
                        gapComposer3.startReplaceGroup(-85340575);
                    } else {
                        gapComposer3.startReplaceGroup(-85340574);
                        InfoMessageRow(str, gapComposer3, 6);
                    }
                    gapComposer3.end(false);
                    gapComposer2 = gapComposer3;
                    i9 = i10;
                    i6 = i11;
                }
                gapComposer = gapComposer2;
                gapComposer.end(false);
                i7 = i8;
            }
            int i12 = i6;
            gapComposer.end(false);
            gapComposer.end(true);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
            boolean z4 = (selectedInstrumentOptionIndex.sectionIndex == -1 || selectedInstrumentOptionIndex.itemIndex == -1) ? false : true;
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z5 = i12 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z5 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(13, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, m299paddingVpY3zN4, buttonProminence, false, z4, null, Expect_jvmKt.rememberComposableLambda(1027806633, new FormView$$ExternalSyntheticLambda0(content, 11), gapComposer), gapComposer, 1573248, 40);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(content, function1, i, 18);
        }
    }

    public static final void InstrumentSelectionLoadingView(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1771729219);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteContactsBodyKt$$ExternalSyntheticLambda5(i3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, lambda$2142739538, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 21, false);
        }
    }

    public static final void InstrumentSelectionRow(InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, Function0 function0, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        String str;
        boolean z;
        Modifier modifier3;
        instrumentSelectionRowViewModel.getClass();
        boolean z2 = instrumentSelectionRowViewModel.isInstrumentSectionTappable;
        function0.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-101593644);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(instrumentSelectionRowViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier testTag = TestTagKt.testTag(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), "Funding source");
            String str2 = instrumentSelectionRowViewModel.creditCardFee;
            String str3 = instrumentSelectionRowViewModel.balance;
            if (z2) {
                gapComposer.startReplaceGroup(1376119172);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                str = str2;
                RippleNodeFactory m500rippleH2RKhps$default = RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, true);
                boolean z3 = (i2 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda10(21, function0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                modifier3 = ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl, m500rippleH2RKhps$default, false, null, null, (Function0) rememberedValue2, 28);
                z = false;
                gapComposer.end(false);
            } else {
                str = str2;
                z = false;
                gapComposer.startReplaceGroup(1376351052);
                gapComposer.end(false);
                modifier3 = companion;
            }
            Modifier then = testTag.then(modifier3);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(then, 16.0f, 16.0f);
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            boolean z4 = z;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.use_label), (Map) null, (Function1) null, false);
            InstrumentAvatarViewModel instrumentAvatarViewModel = instrumentSelectionRowViewModel.instrumentAvatarViewModel;
            if (instrumentAvatarViewModel == null) {
                gapComposer.startReplaceGroup(296335030);
                gapComposer.end(z4);
            } else {
                gapComposer.startReplaceGroup(296335031);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1893908804, new ReviewPaymentKt$$ExternalSyntheticLambda11(realImageLoader, instrumentAvatarViewModel, 1), gapComposer), gapComposer, 6);
                gapComposer.end(z4);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, vertical, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.Top, gapComposer, z4 ? 1 : 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, weight);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3992, 0L, (Composer) gapComposer, rowScopeInstance.weight(1.0f, companion, false), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, instrumentSelectionRowViewModel.subtitle, (Map) null, (Function1) null, false);
            if (str3 != null && str3.length() > 0) {
                gapComposer.startReplaceGroup(699450703);
                Room.m1164Text25TpFw(0, 1, 0, 0, 1572912, 0, 4024, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, 2), new AnnotatedString(str3), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else if (str == null || str.length() <= 0) {
                gapComposer.startReplaceGroup(700013570);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(699736492);
                Room.m1164Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, 2), new AnnotatedString(str), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            if (z2) {
                gapComposer.startReplaceGroup(-1881243810);
                Trace.m1191Iconww6aTOc(Icons.Expand24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1881174618);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(instrumentSelectionRowViewModel, i, function0, realImageLoader, modifier2, 12);
        }
    }

    public static final void InstrumentSelectionView(InstrumentSelectionViewModel instrumentSelectionViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        instrumentSelectionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-296175124);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(instrumentSelectionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(2027716268, new SkipPaymentView$$ExternalSyntheticLambda1(8, instrumentSelectionViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18((Object) instrumentSelectionViewModel, function1, (Object) realImageLoader, i, 5);
        }
    }

    public static final void TransferOptionPickerView(TransferOptionPickerViewModel transferOptionPickerViewModel, Function1 function1, Composer composer, int i) {
        transferOptionPickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2028829447);
        int i2 = (gapComposer.changedInstance(transferOptionPickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z || rememberedValue == obj) {
                rememberedValue = new AppUpgradeViewKt$$ExternalSyntheticLambda7(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Unit unit = Unit.INSTANCE;
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new ChatFailedDeliverySheetView$Content$1$1(delegatingSoftwareKeyboardController, null, 2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            boolean z2 = i4 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == obj) {
                rememberedValue3 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(17, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-275914018, new TransferOptionPickerViewKt$$ExternalSyntheticLambda2(transferOptionPickerViewModel, function1, i3), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentsUiFactory$$ExternalSyntheticLambda4(transferOptionPickerViewModel, function1, i);
        }
    }

    public static final InstrumentIcon toInstrumentIcon(InstrumentType instrumentType) {
        switch (instrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[instrumentType.ordinal()]) {
            case 1:
                return new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_visa, R.drawable.arcade_instrument_visa, null, null, 12);
            case 2:
                return new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_mastercard_light, R.drawable.arcade_instrument_mastercard_dark, null, null, 12);
            case 3:
                return new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_amex, R.drawable.arcade_instrument_amex, null, null, 12);
            case 4:
                return new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_discover_light, R.drawable.arcade_instrument_discover_dark, null, null, 12);
            case 5:
                return new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_diners_light, R.drawable.arcade_instrument_diners_dark, null, null, 12);
            case 6:
                return new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_jcb_light, R.drawable.arcade_instrument_jcb_dark, null, null, 12);
            default:
                return new InstrumentIcon.LocalIcon(Icons.CardBasic24, InstrumentIcon.LocalIcon.IconTint.STANDARD, InstrumentIcon.LocalIcon.IconBackground.SUBTLE, null, null, 24);
        }
    }
}
