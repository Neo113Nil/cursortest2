package com.squareup.cash.payments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.content.PermissionChecker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.viewmodels.MainPaymentViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.payments.viewmodels.RecipientsInputViewConfig;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class MainPaymentViewKt {
    public static final StaticProvidableCompositionLocal LocalElementBoundsRegistry = new StaticProvidableCompositionLocal(new MainPaymentViewKt$$ExternalSyntheticLambda0(0));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b9  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainPayment(MainPaymentViewModel mainPaymentViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        GapComposer gapComposer;
        Function1 function12;
        String str;
        Map map;
        String str2;
        Colors colors;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        int i2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        NeverEqualPolicy neverEqualPolicy;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        float f;
        ?? r15;
        ComposableLambdaImpl composableLambdaImpl;
        float f2;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13;
        MutableState mutableState;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17;
        float f3;
        int i3;
        ComposableLambdaImpl composableLambdaImpl2;
        MutableState mutableState2;
        boolean z2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(817148952);
        Applier applier = gapComposer2.applier;
        int i4 = i | (gapComposer2.changedInstance(mainPaymentViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Map map2 = mainPaymentViewModel.selectedRecipients;
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = mainPaymentViewModel.instrumentSelectionRowViewModel;
            boolean z3 = mainPaymentViewModel.isRestoreState;
            boolean z4 = mainPaymentViewModel.contactsPermissionGranted;
            PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel = mainPaymentViewModel.personalizePaymentButtonState;
            String str3 = mainPaymentViewModel.searchQuery;
            Recipient recipient = (Recipient) CollectionsKt.firstOrNull(map2.values());
            if (recipient == null || (str = recipient.displayName) == null) {
                str = "";
            }
            boolean changed = gapComposer2.changed(str3) | gapComposer2.changed(str) | gapComposer2.changed(z3);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy3) {
                String m$1 = z3 ? str3 : Recorder$$ExternalSyntheticOutline2.m$1(str, str3);
                int length = m$1.length();
                map = map2;
                rememberedValue = Updater.mutableStateOf$default(new TextFieldValue(m$1, SizeKt.TextRange(length, length), 4));
                gapComposer2.updateRememberedValue(rememberedValue);
            } else {
                map = map2;
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            boolean changed2 = gapComposer2.changed(personalizePaymentEntrypointButtonViewModel.showTooltip);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy3) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(personalizePaymentEntrypointButtonViewModel.showTooltip, gapComposer2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            Object[] objArr = {mainPaymentViewModel.note};
            boolean changedInstance = gapComposer2.changedInstance(mainPaymentViewModel);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy3) {
                rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda5(mainPaymentViewModel, 29);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState5 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer2, 0);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$14);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$19);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$110);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$111);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$112);
            Modifier fillMaxSize2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                str2 = str;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                str2 = str;
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
                colors = colors2;
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$14;
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$14;
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$19);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$110);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$111, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$112);
            ToolbarViewModel toolbarViewModel = mainPaymentViewModel.toolbarViewModel;
            boolean z5 = mainPaymentViewModel.showLoadingIndicator;
            NavigationType navigationType = NavigationType.BACK;
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = layoutNode$Companion$Constructor$1;
            String str4 = str2;
            Toolbar(toolbarViewModel, z5, instrumentSelectionRowViewModel == null, mainPaymentViewModel.isBitcoin, function1, null, gapComposer2, ((i4 << 12) & 458752) | 24576);
            gapComposer = gapComposer2;
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
            if (mainPaymentViewModel.shouldLockSelectedRecipient) {
                gapComposer.startReplaceGroup(860879850);
                String str5 = ((Recipient) CollectionsKt.first(map.values())).displayName;
                if (str5 == null) {
                    str5 = "";
                }
                ?? r8 = (i4 & 112) == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (r8 != false || rememberedValue4 == neverEqualPolicy3) {
                    rememberedValue4 = new HomeViewKt$$ExternalSyntheticLambda8(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                UtilKt.ToView(0, gapComposer, null, str5, (Function0) rememberedValue4);
                gapComposer.end(false);
                i2 = i4;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$15;
                f = 16.0f;
                f2 = 0.0f;
                composableLambdaImpl = null;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$112;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$19;
                neverEqualPolicy = neverEqualPolicy3;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$110;
                r15 = 0;
            } else {
                gapComposer.startReplaceGroup(861065664);
                String stringResource = Room.stringResource(gapComposer, R.string.send_payment_to_label);
                TextFieldValue textFieldValue = (TextFieldValue) mutableState3.getValue();
                String str6 = mainPaymentViewModel.searchHint;
                RecipientsInputViewConfig recipientsInputViewConfig = mainPaymentViewModel.recipientsInputViewConfig;
                int i5 = recipientsInputViewConfig.maxChars;
                boolean z6 = recipientsInputViewConfig.singleLine;
                boolean z7 = !map.isEmpty();
                int i6 = i4 & 112;
                boolean changedInstance2 = gapComposer.changedInstance(mainPaymentViewModel) | (i6 == 32);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue5 == neverEqualPolicy3) {
                    rememberedValue5 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(27, (Object) mainPaymentViewModel, function1);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Function0 function0 = (Function0) rememberedValue5;
                boolean changed3 = gapComposer.changed(mutableState3) | (i6 == 32) | gapComposer.changed(str4);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue6 == neverEqualPolicy3) {
                    rememberedValue6 = new MainPaymentViewKt$$ExternalSyntheticLambda9(function1, str4, mutableState3);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                i2 = i4;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$15;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$112;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$19;
                neverEqualPolicy = neverEqualPolicy3;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$110;
                f = 16.0f;
                r15 = 0;
                composableLambdaImpl = null;
                QuickPayViewKt.RecipientsInputView(null, stringResource, textFieldValue, str6, i5, z6, false, z7, function0, (Function1) rememberedValue6, gapComposer, 1572864);
                gapComposer = gapComposer;
                gapComposer.end(false);
                f2 = RecyclerView.DECELERATION_RATE;
            }
            ModalKt.HorizontalDivider(6, r15, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, f, f2, 2));
            if (mainPaymentViewModel.isNoteVisible) {
                gapComposer.startReplaceGroup(862153237);
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, f, f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$12;
                    gapComposer.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$12;
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$113 = composeUiNode$Companion$SetModifier$12;
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$113);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$114 = composeUiNode$Companion$SetModifier$13;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$114);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$111, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$115 = composeUiNode$Companion$SetModifier$1;
                LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$115, 1.0f, true);
                boolean z8 = mainPaymentViewModel.isNoteEnabled;
                String str7 = (String) mutableState5.getValue();
                String str8 = mainPaymentViewModel.noteHint;
                Versioned versioned = mainPaymentViewModel.shouldRequestNoteFocus;
                boolean changed4 = gapComposer.changed(mutableState5) | ((i2 & 112) == 32);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changed4) {
                    neverEqualPolicy2 = neverEqualPolicy;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy;
                    if (rememberedValue7 != neverEqualPolicy2) {
                        composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$115;
                        Function1 function13 = (Function1) rememberedValue7;
                        GapComposer gapComposer3 = gapComposer;
                        composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$113;
                        composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$114;
                        composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$111;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$18;
                        f3 = 1.0f;
                        function12 = function1;
                        QuickPayViewKt.NoteInputView(m, str7, str8, 0, z8, function13, versioned, gapComposer3, 0, 8);
                        gapComposer = gapComposer3;
                        if (personalizePaymentEntrypointButtonViewModel.show) {
                            mutableState = mutableState4;
                            delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                            z = false;
                            gapComposer.startReplaceGroup(-1755127140);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1756130424);
                            delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-978332396, new PdfPreviewView$$ExternalSyntheticLambda1(delegatingSoftwareKeyboardController, function12, mainPaymentViewModel, 1), gapComposer);
                            boolean z9 = personalizePaymentEntrypointButtonViewModel.showTooltip;
                            mutableState = mutableState4;
                            boolean changed5 = gapComposer.changed(mutableState);
                            Object rememberedValue8 = gapComposer.rememberedValue();
                            if (changed5 || rememberedValue8 == neverEqualPolicy2) {
                                rememberedValue8 = new OverlayKt$$ExternalSyntheticLambda1(12, mutableState);
                                gapComposer.updateRememberedValue(rememberedValue8);
                            }
                            AlphaKt.Tooltip(null, rememberComposableLambda, z9, (Function0) rememberedValue8, Expect_jvmKt.rememberComposableLambda(1208369943, new PaycheckCirclesKt$$ExternalSyntheticLambda3(23, delegatingSoftwareKeyboardController, function12), gapComposer), gapComposer, 24624);
                            gapComposer = gapComposer;
                            z = false;
                            gapComposer.end(false);
                        }
                        gapComposer.end(true);
                        ModalKt.HorizontalDivider(6, z ? 1 : 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                        gapComposer.end(z);
                    }
                }
                composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$115;
                rememberedValue7 = new CashMapViewKt$$ExternalSyntheticLambda3(function1, mutableState5, 15);
                gapComposer.updateRememberedValue(rememberedValue7);
                Function1 function132 = (Function1) rememberedValue7;
                GapComposer gapComposer32 = gapComposer;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$113;
                composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$114;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$111;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$18;
                f3 = 1.0f;
                function12 = function1;
                QuickPayViewKt.NoteInputView(m, str7, str8, 0, z8, function132, versioned, gapComposer32, 0, 8);
                gapComposer = gapComposer32;
                if (personalizePaymentEntrypointButtonViewModel.show) {
                }
                gapComposer.end(true);
                ModalKt.HorizontalDivider(6, z ? 1 : 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                gapComposer.end(z);
            } else {
                function12 = function1;
                neverEqualPolicy2 = neverEqualPolicy;
                z = r15;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$12;
                layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$12;
                mutableState = mutableState4;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$111;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$13;
                composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$1;
                f3 = 1.0f;
                gapComposer.startReplaceGroup(863799430);
                gapComposer.end(z);
            }
            if (instrumentSelectionRowViewModel == null) {
                gapComposer.startReplaceGroup(863855694);
                gapComposer.end(z);
                i3 = i2;
            } else {
                gapComposer.startReplaceGroup(863855695);
                boolean changed6 = gapComposer.changed(delegatingSoftwareKeyboardController) | ((i2 & 112) == 32);
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (changed6 || rememberedValue9 == neverEqualPolicy2) {
                    rememberedValue9 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function12, 11);
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                i3 = i2;
                GapComposer gapComposer4 = gapComposer;
                InstrumentAvatarUtilsKt.InstrumentSelectionRow(instrumentSelectionRowViewModel, (Function0) rememberedValue9, realImageLoader, null, gapComposer4, i3 & 896);
                gapComposer = gapComposer4;
                ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                gapComposer.end(false);
            }
            if (mainPaymentViewModel.noResults) {
                gapComposer.startReplaceGroup(864196075);
                if (!z4 || str3.length() <= 0) {
                    z2 = false;
                    gapComposer.startReplaceGroup(864349990);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(864266383);
                    GapComposer gapComposer5 = gapComposer;
                    PermissionChecker.NoResults(mainPaymentViewModel.region, null, mainPaymentViewModel.noResultMessage, gapComposer5, 0, 2);
                    gapComposer = gapComposer5;
                    z2 = false;
                    gapComposer.end(false);
                }
                if (z4) {
                    gapComposer.startReplaceGroup(864583110);
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(864403403);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f3, true);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, z2);
                    int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$15, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$17);
                    boolean z10 = (i3 & 112) == 32;
                    Object rememberedValue10 = gapComposer.rememberedValue();
                    if (z10 || rememberedValue10 == neverEqualPolicy2) {
                        rememberedValue10 = new HomeViewKt$$ExternalSyntheticLambda8(23, function12);
                        gapComposer.updateRememberedValue(rememberedValue10);
                    }
                    SyncContactsRowKt.SyncContactsCard(0, 14, gapComposer, null, null, null, (Function0) rememberedValue10);
                    gapComposer.end(true);
                    z2 = false;
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
                mutableState2 = mutableState;
            } else {
                gapComposer.startReplaceGroup(864630509);
                List list = mainPaymentViewModel.sections;
                Map map3 = mainPaymentViewModel.selectedRecipients;
                if (str3.length() != 0 || z4) {
                    gapComposer.startReplaceGroup(865253764);
                    gapComposer.end(false);
                    composableLambdaImpl2 = composableLambdaImpl;
                } else {
                    gapComposer.startReplaceGroup(865145853);
                    composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(-1058556603, new ScoreHomeKt$$ExternalSyntheticLambda8(function12, false, 4), gapComposer);
                    gapComposer.end(false);
                }
                boolean z11 = mainPaymentViewModel.shouldShowBlockedBadge;
                int i7 = i3 & 112;
                boolean changed7 = gapComposer.changed(delegatingSoftwareKeyboardController) | (i7 == 32);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (changed7 || rememberedValue11 == neverEqualPolicy2) {
                    rememberedValue11 = new MainPaymentViewKt$$ExternalSyntheticLambda3(delegatingSoftwareKeyboardController, function12);
                    gapComposer.updateRememberedValue(rememberedValue11);
                }
                Function1 function14 = (Function1) rememberedValue11;
                boolean z12 = i7 == 32;
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (z12 || rememberedValue12 == neverEqualPolicy2) {
                    rememberedValue12 = new UtilKt$$ExternalSyntheticLambda0(13, function12);
                    gapComposer.updateRememberedValue(rememberedValue12);
                }
                Function1 function15 = (Function1) rememberedValue12;
                boolean z13 = i7 == 32;
                Object rememberedValue13 = gapComposer.rememberedValue();
                if (z13 || rememberedValue13 == neverEqualPolicy2) {
                    rememberedValue13 = new UtilKt$$ExternalSyntheticLambda0(14, function12);
                    gapComposer.updateRememberedValue(rememberedValue13);
                }
                mutableState2 = mutableState;
                GapComposer gapComposer6 = gapComposer;
                QuickPayViewKt.RecipientList(null, list, map3, function14, function15, (Function1) rememberedValue13, composableLambdaImpl2, z11, gapComposer6, 0);
                gapComposer = gapComposer6;
                z2 = false;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1066789562);
                AlphaKt.Alpha(androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, f3), gapComposer, 6);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(1066841456);
                gapComposer.end(z2);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) mainPaymentViewModel, function12, (Object) realImageLoader, i, 2);
        }
    }

    public static final void Toolbar(ToolbarViewModel toolbarViewModel, boolean z, boolean z2, boolean z3, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z4;
        Modifier modifier2;
        NavigationType navigationType = NavigationType.CLOSE;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1523664963);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(toolbarViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z3;
            i2 |= gapComposer.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z3;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 131072 : 65536;
        }
        int i4 = 1572864 | i2;
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1085034627, new PdfPreviewViewKt$$ExternalSyntheticLambda2(toolbarViewModel, i3), gapComposer);
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | ((458752 & i4) == 131072);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, companion, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(434144478, new MainPaymentViewKt$$ExternalSyntheticLambda18(z, toolbarViewModel, delegatingSoftwareKeyboardController, function1, z4, z2), gapComposer), gapComposer, ((i4 >> 9) & 112) | 1572870 | ((i4 >> 12) & 896), 40);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentViewKt$$ExternalSyntheticLambda19(toolbarViewModel, z, z2, z3, function1, modifier2, i);
        }
    }
}
