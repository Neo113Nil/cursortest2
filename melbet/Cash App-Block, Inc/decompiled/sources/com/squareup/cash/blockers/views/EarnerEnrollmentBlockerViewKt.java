package com.squareup.cash.blockers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda6;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CheckboxKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.home.SupportHomeViewKt$$ExternalSyntheticLambda33;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class EarnerEnrollmentBlockerViewKt {
    public static final CubicBezierEasing CategorySelectionEnterEasing = new CubicBezierEasing(0.17f, 0.17f, RecyclerView.DECELERATION_RATE, 1.0f);
    public static final CubicBezierEasing CategorySelectionExitEasing = new CubicBezierEasing(0.17f, 0.17f, 0.84f, 1.0f);

    public static final void AgreementRow(boolean z, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-595632101);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
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
            CheckboxKt.UnlabeledCheckbox(z, function1, null, null, false, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 28);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportHomeViewKt$$ExternalSyntheticLambda33(z, function1, composableLambdaImpl, i);
        }
    }

    public static final void EarnerEnrollmentBlocker(EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel, Function1 function1, boolean z, Composer composer, int i) {
        earnerEnrollmentBlockerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1741907506);
        int i2 = (gapComposer.changedInstance(earnerEnrollmentBlockerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(473952839, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda0(earnerEnrollmentBlockerViewModel, z, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda0(earnerEnrollmentBlockerViewModel, function1, z, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EarnerEnrollmentBlockerContent(EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel, Function1 function1, boolean z, PaddingValues paddingValues, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        PaddingValues paddingValues2;
        boolean z3;
        PaddingValues paddingValues3;
        RecomposeScopeImpl endRestartGroup;
        PaddingValues paddingValues4;
        earnerEnrollmentBlockerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-624209818);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(earnerEnrollmentBlockerViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i3 |= gapComposer.changed(paddingValues2) ? 2048 : 1024;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                    boolean z4 = i5 != 0 ? false : z2;
                    PaddingValues m295PaddingValuesYgX7TsA$default = i4 != 0 ? SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3) : paddingValues2;
                    if (earnerEnrollmentBlockerViewModel instanceof EarnerEnrollmentBlockerViewModel.Form) {
                        gapComposer.startReplaceGroup(1429794656);
                        paddingValues4 = m295PaddingValuesYgX7TsA$default;
                        EarnerEnrollmentFormContent((EarnerEnrollmentBlockerViewModel.Form) earnerEnrollmentBlockerViewModel, function1, z4, paddingValues4, gapComposer, i3 & 8190);
                        gapComposer.end(false);
                    } else if (earnerEnrollmentBlockerViewModel instanceof EarnerEnrollmentBlockerViewModel.CategorySelection) {
                        gapComposer.startReplaceGroup(1429800875);
                        int i6 = i3;
                        EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection = (EarnerEnrollmentBlockerViewModel.CategorySelection) earnerEnrollmentBlockerViewModel;
                        int i7 = i6 & 112;
                        boolean z5 = i7 == 32;
                        Object rememberedValue = gapComposer.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (z5 || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(14, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Function0 function0 = (Function0) rememberedValue;
                        boolean z6 = i7 == 32;
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (z6 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new AvatarsKt$$ExternalSyntheticLambda1(29, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        Function1 function12 = (Function1) rememberedValue2;
                        boolean z7 = i7 == 32;
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (z7 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new CashtagViewKt$$ExternalSyntheticLambda6(15, function1);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        int i8 = i6 & 14;
                        int i9 = i6 << 6;
                        boolean z8 = z4;
                        SsnViewKt.EarnerEnrollmentCategorySelectionContent(categorySelection, function0, function12, (Function0) rememberedValue3, z8, m295PaddingValuesYgX7TsA$default, gapComposer, i8 | (57344 & i9) | (i9 & 458752));
                        z4 = z8;
                        paddingValues4 = m295PaddingValuesYgX7TsA$default;
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    } else {
                        int i10 = i3;
                        paddingValues4 = m295PaddingValuesYgX7TsA$default;
                        if (!(earnerEnrollmentBlockerViewModel instanceof EarnerEnrollmentBlockerViewModel.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1429794086, false);
                        }
                        gapComposer.startReplaceGroup(1429811907);
                        EarnerEnrollmentSuccessContent((EarnerEnrollmentBlockerViewModel.Success) earnerEnrollmentBlockerViewModel, function1, z4, paddingValues4, gapComposer, i10 & 8190);
                        gapComposer.end(false);
                    }
                    z3 = z4;
                    paddingValues3 = paddingValues4;
                } else {
                    gapComposer.skipToGroupEnd();
                    z3 = z2;
                    paddingValues3 = paddingValues2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(earnerEnrollmentBlockerViewModel, function1, z3, paddingValues3, i, i2, 14);
                    return;
                }
                return;
            }
            paddingValues2 = paddingValues;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void EarnerEnrollmentContinueButton(EarnerEnrollmentBlockerViewModel.Form form, Function1 function1, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1642103610);
        int i2 = (gapComposer.changedInstance(form) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        boolean z2 = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            if (form.selectedCategory != null && form.individualCertificationChecked && form.legalAgreementChecked) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z3 = (i2 & 112) == 32 ? z : false;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(1464456991, new SsnViewKt$$ExternalSyntheticLambda2(form, 15), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda12(form, function1, i);
        }
    }

    public static final void EarnerEnrollmentDoneButton(EarnerEnrollmentBlockerViewModel.Success success, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(664589668);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(success) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-310972193, new SsnViewKt$$ExternalSyntheticLambda2(success, i2), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda18(success, function1, i, 3);
        }
    }

    public static final void EarnerEnrollmentEarnerCategorySelector(int i, Composer composer, String str, Function0 function0) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(848862269);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth(companion, 1.0f), m340RoundedCornerShape0680j_4);
            long j = Strings.getColors(gapComposer2).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
            Strings.getSizes(gapComposer2).getClass();
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, Strings.getColors(gapComposer2).semantic.border.subtle, m340RoundedCornerShape0680j_4), false, null, new Role(0), function0, 11);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, 16.0f, 16.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Strings.getSizes(gapComposer2).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Strings.getSizes(gapComposer2).getClass();
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 64.0f), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer2).semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Trace.m1191Iconww6aTOc(Icons.Business24, (String) null, (Modifier) null, Strings.getColors(gapComposer2).semantic.icon.standard, gapComposer2, 54, 4);
            gapComposer2.end(true);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4088, 0L, (Composer) gapComposer2, (Modifier) new LayoutWeightElement(1.0f, true), Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            Trace.m1191Iconww6aTOc(Icons.Expand24, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 4);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda0(str, function0, i, 3);
        }
    }

    public static final void EarnerEnrollmentFormContent(final EarnerEnrollmentBlockerViewModel.Form form, final Function1 function1, final boolean z, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        PaddingValues paddingValues2;
        EarnerEnrollmentBlockerViewModel.Form form2;
        Function1 function12;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-766124081);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(form) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            paddingValues2 = paddingValues;
            i2 |= gapComposer.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        byte b = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            form2 = form;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        } else {
            if (z) {
                gapComposer.startReplaceGroup(-146092964);
                NavigationType navigationType = NavigationType.CLOSE;
                r10 = (i2 & 112) != 32 ? 0 : 1;
                Object rememberedValue = gapComposer.rememberedValue();
                if (r10 != 0 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(7, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SsnViewKt.BlockerSheetScaffold(paddingValues2, navigationType, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-547793496, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda12(form, function1, b, b), gapComposer), Expect_jvmKt.rememberComposableLambda(1213667063, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda13(form, function1, b), gapComposer), gapComposer, ((i2 >> 9) & 14) | 221232, 8);
                gapComposer.end(false);
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.blockers.views.EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentFormContent(form, function1, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentFormContent(form, function1, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            form2 = form;
            function12 = function1;
            gapComposer.startReplaceGroup(-145486573);
            gapComposer.end(false);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ScreenScaffoldKt.ScreenScaffoldColumn(m177backgroundbw27NRU, null, SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2), Expect_jvmKt.rememberComposableLambda(-1030614281, new BookletGridKt$$ExternalSyntheticLambda1(6, function12), gapComposer), null, Expect_jvmKt.rememberComposableLambda(44258893, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda13(form2, function12, r10), gapComposer), gapComposer, 199680, 18);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            final EarnerEnrollmentBlockerViewModel.Form form3 = form2;
            final Function1 function13 = function12;
            function2 = new Function2() { // from class: com.squareup.cash.blockers.views.EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            ((Integer) obj2).intValue();
                            EarnerEnrollmentBlockerViewKt.EarnerEnrollmentFormContent(form3, function13, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            EarnerEnrollmentBlockerViewKt.EarnerEnrollmentFormContent(form3, function13, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EarnerEnrollmentFormFields(EarnerEnrollmentBlockerViewModel.Form form, Function1 function1, Modifier modifier, Modifier modifier2, int i, Composer composer, int i2, int i3) {
        Modifier modifier3;
        int i4;
        Modifier modifier4;
        int i5;
        int i6;
        GapComposer gapComposer;
        Modifier modifier5;
        Modifier modifier6;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-249091879);
        int i7 = (gapComposer2.changedInstance(form) ? 4 : 2) | i2 | (gapComposer2.changedInstance(function1) ? 32 : 16);
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 = i7 | MLKEMEngine.KyberPolyBytes;
            modifier3 = modifier;
        } else {
            modifier3 = modifier;
            i4 = i7 | (gapComposer2.changed(modifier3) ? 256 : 128);
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            modifier4 = modifier2;
        } else {
            modifier4 = modifier2;
            i5 = i4 | (gapComposer2.changed(modifier4) ? 2048 : 1024);
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i6 = i;
            i5 |= gapComposer2.changed(i6) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier5 = modifier3;
                modifier6 = modifier4;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier7 = i8 != 0 ? companion : modifier3;
                Modifier modifier8 = i9 != 0 ? companion : modifier4;
                int i11 = i10 != 0 ? 1 : i6;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier7, 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 32.0f, gapComposer2);
                String str = form.title;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
                zzacn.m2012AutoScaleTextZLomxE(i11, 0, 0, ((i5 >> 6) & 112) | (57344 & i5), 424, 0L, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal2)).titleBarPageTitle.spanStyle.fontSize, gapComposer2, modifier8, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal2)).header, str, null);
                i6 = i11;
                gapComposer = gapComposer2;
                Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 32.0f, gapComposer);
                String str2 = form.selectedEarnerCategory;
                int i12 = i5 & 112;
                boolean z = i12 == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(10, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                EarnerEnrollmentEarnerCategorySelector(0, gapComposer, str2, (Function0) rememberedValue);
                Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 32.0f, gapComposer);
                boolean z2 = form.individualCertificationChecked;
                boolean z3 = i12 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AvatarsKt$$ExternalSyntheticLambda1(27, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AgreementRow(z2, (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(429760910, new CashtagViewKt$$ExternalSyntheticLambda10(form, 24), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 32.0f, gapComposer);
                boolean z4 = form.legalAgreementChecked;
                boolean z5 = i12 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z5 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new AvatarsKt$$ExternalSyntheticLambda1(28, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                AgreementRow(z4, (Function1) rememberedValue3, Expect_jvmKt.rememberComposableLambda(2121969669, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda12(form, function1, 2, (byte) 0), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                gapComposer.end(true);
                modifier5 = modifier7;
                modifier6 = modifier8;
            }
            int i13 = i6;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ViewfinderKt$$ExternalSyntheticLambda6(form, function1, modifier5, modifier6, i13, i2, i3);
                return;
            }
            return;
        }
        i6 = i;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
        }
        int i132 = i6;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void EarnerEnrollmentSuccessBanner(String str, Composer composer, int i) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1817606030);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            str2 = str;
            AsyncImageKt.m1438AsyncImage10Xjiaw(str2, null, OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(companion, 0.58f), false), null, ContentScale.Companion.Fit, null, gapComposer, (i2 & 14) | 1573296, 1976);
            gapComposer.end(true);
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str2, i, 11);
        }
    }

    public static final void EarnerEnrollmentSuccessContent(final EarnerEnrollmentBlockerViewModel.Success success, final Function1 function1, final boolean z, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        PaddingValues paddingValues2;
        EarnerEnrollmentBlockerViewModel.Success success2;
        Function1 function12;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1255055959);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            paddingValues2 = paddingValues;
            i2 |= gapComposer.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i3 = 0;
        int i4 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            success2 = success;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        } else {
            if (z) {
                gapComposer.startReplaceGroup(-1681572950);
                SsnViewKt.BlockerSheetScaffold(paddingValues2, null, null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1003402046, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda18(success, function1, i3), gapComposer), Expect_jvmKt.rememberComposableLambda(-1591306543, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda19(success, function1, 0), gapComposer), gapComposer, ((i2 >> 9) & 14) | 221184, 14);
                gapComposer.end(false);
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.blockers.views.EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessContent(success, function1, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessContent(success, function1, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            success2 = success;
            function12 = function1;
            gapComposer.startReplaceGroup(-1681251015);
            gapComposer.end(false);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, AmountBlockerViewKt.f279lambda$1439395119, Expect_jvmKt.rememberComposableLambda(1046685376, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda18(success2, function12, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(-530612825, new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda19(success2, function12, 1), gapComposer), gapComposer, 224256, 6);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 1;
            final EarnerEnrollmentBlockerViewModel.Success success3 = success2;
            final Function1 function13 = function12;
            function2 = new Function2() { // from class: com.squareup.cash.blockers.views.EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).intValue();
                            EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessContent(success3, function13, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            EarnerEnrollmentBlockerViewKt.EarnerEnrollmentSuccessContent(success3, function13, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void EarnerEnrollmentSuccessDetails(EarnerEnrollmentBlockerViewModel.Success success, Function1 function1, Composer composer, int i) {
        Function1 function12 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1061273935);
        int i2 = i | (gapComposer.changedInstance(success) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
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
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 64.0f, gapComposer);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).header, 0L, Room.getSp(48), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(52), null, null, 0, 16646141), (TextLineBalancing) null, success.title, (Map) null, (Function1) null, false);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, success.body, (Map) null, (Function1) null, false);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 32.0f, gapComposer);
            String str = success.manageCustomerListButtonText;
            Role role = new Role(0);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            function12 = function1;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(companion, false, null, role, (Function0) rememberedValue, 11), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 64.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda18(success, function12, i, 2);
        }
    }
}
