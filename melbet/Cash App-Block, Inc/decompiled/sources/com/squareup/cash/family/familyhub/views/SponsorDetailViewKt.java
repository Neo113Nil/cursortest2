package com.squareup.cash.family.familyhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentGraduationViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetail;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesRowViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesViewModel;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.favorites.components.AddFavoritesViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.formview.components.FormCashtag$8$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SponsorDetailViewKt {
    public static final void AllowanceSection(AllowanceSectionViewModel allowanceSectionViewModel, Composer composer, int i) {
        List<AllowanceViewModel> list;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-77100785);
        int i2 = (gapComposer.changedInstance(allowanceSectionViewModel) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (allowanceSectionViewModel == null) {
            gapComposer.startReplaceGroup(898103513);
            gapComposer.end(false);
        } else {
            List list2 = allowanceSectionViewModel.allowanceViewModels;
            gapComposer.startReplaceGroup(898103514);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            if (list2.isEmpty()) {
                list = list2;
                z = false;
                gapComposer.startReplaceGroup(1035989211);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1035559396);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 8.0f);
                String stringResource = Room.stringResource(gapComposer, R.string.family_account_dependent_allowance_title);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                list = list2;
                z = false;
                Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, colors.semantic.text.standard, (Composer) gapComposer, m299paddingVpY3zN4, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(310514822);
            for (AllowanceViewModel allowanceViewModel : list) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new FamilyActivityFixtures$$ExternalSyntheticLambda0(9);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                AllowanceViewKt.AllowanceView(allowanceViewModel, (Function1) rememberedValue, gapComposer, 48);
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, z, true, z);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(allowanceSectionViewModel, i, 12);
        }
    }

    public static final void FamilyPendingRequests(FamilyPendingRequestsViewModel familyPendingRequestsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        FamilyPendingRequestsViewModel familyPendingRequestsViewModel2 = familyPendingRequestsViewModel;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1367607869);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(familyPendingRequestsViewModel2) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            long j = Strings.getColors(gapComposer2).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, j, rectangleShapeKt$RectangleShape$1));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
            String str = familyPendingRequestsViewModel2.toolbarTitle;
            List list = familyPendingRequestsViewModel2.pendingRequestRows;
            NavigationType navigationType = NavigationType.BACK;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer2).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(25, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            Modifier.Companion companion2 = companion;
            int i4 = i3;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
            DBUtil.TitleBarSub(str, navigationType, m177backgroundbw27NRU, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 104);
            if (list.isEmpty()) {
                gapComposer.startReplaceGroup(-1400700341);
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.CenterHorizontally;
                Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal2, gapComposer, 54);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                familyPendingRequestsViewModel2 = familyPendingRequestsViewModel;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, familyPendingRequestsViewModel2.emptyStateTitle, (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, familyPendingRequestsViewModel2.emptyStateSubtitle, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                z = true;
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1401396167);
                Modifier fillMaxSize3 = SizeKt.fillMaxSize(modifier, 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxSize3);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                gapComposer.startReplaceGroup(1509388407);
                List<FamilyPendingRequestRowModel> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (FamilyPendingRequestRowModel familyPendingRequestRowModel : list2) {
                    Modifier.Companion companion3 = companion2;
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, 20.0f, 1);
                    int i5 = i4;
                    boolean changedInstance = gapComposer.changedInstance(familyPendingRequestRowModel) | (i5 == 32);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance) {
                        neverEqualPolicy = neverEqualPolicy3;
                    } else {
                        neverEqualPolicy = neverEqualPolicy3;
                        if (rememberedValue2 != neverEqualPolicy) {
                            neverEqualPolicy3 = neverEqualPolicy;
                            AllowanceViewKt.FamilyPendingRequestRow(familyPendingRequestRowModel, m300paddingVpY3zN4$default, (Function0) rememberedValue2, gapComposer, 48, 0);
                            arrayList.add(Unit.INSTANCE);
                            companion2 = companion3;
                            i4 = i5;
                        }
                    }
                    rememberedValue2 = new FamilyHomeViewKt$$ExternalSyntheticLambda17(familyPendingRequestRowModel, function1, 2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                    neverEqualPolicy3 = neverEqualPolicy;
                    AllowanceViewKt.FamilyPendingRequestRow(familyPendingRequestRowModel, m300paddingVpY3zN4$default, (Function0) rememberedValue2, gapComposer, 48, 0);
                    arrayList.add(Unit.INSTANCE);
                    companion2 = companion3;
                    i4 = i5;
                }
                z = true;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
                familyPendingRequestsViewModel2 = familyPendingRequestsViewModel;
            }
            gapComposer.end(z);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(modifier, (Object) familyPendingRequestsViewModel2, function1, i, 29);
        }
    }

    public static final void FamilyPendingRequestsView(RealImageLoader realImageLoader, FamilyPendingRequestsViewModel familyPendingRequestsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1517192075);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(familyPendingRequestsViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1067533984, new EarningsHomeKt$$ExternalSyntheticLambda2(realImageLoader, familyPendingRequestsViewModel, function1, 28), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(realImageLoader, familyPendingRequestsViewModel, function1, i, 19);
        }
    }

    public static final void GraduationSection(DependentGraduationViewModel dependentGraduationViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-275210392);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(dependentGraduationViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        } else if (dependentGraduationViewModel == null) {
            gapComposer.startReplaceGroup(299928855);
            gapComposer.end(false);
            function12 = function1;
        } else {
            gapComposer.startReplaceGroup(299928856);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, dependentGraduationViewModel.title, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, dependentGraduationViewModel.subtitle, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                function12 = function1;
                rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(29, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(602822235, new ArcadeModal$$ExternalSyntheticLambda3(dependentGraduationViewModel, 17), gapComposer), gapComposer, 1573296, 56);
            gapComposer = gapComposer;
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(dependentGraduationViewModel, function12, i, 7);
        }
    }

    public static final void InviteFriendsSection(SponsorDetailViewModel sponsorDetailViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        String m;
        String str;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1896719212);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(sponsorDetailViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            ModalKt.HorizontalDivider(6, 0, gapComposer, SizeKt.fillMaxWidth(companion, 1.0f));
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Image image = sponsorDetailViewModel != null ? sponsorDetailViewModel.inviteFriendsImage : null;
            if (image == null) {
                gapComposer.startReplaceGroup(194565010);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, 421918287, image, gapComposer, false);
            }
            AsyncImageKt.m1438AsyncImage10Xjiaw(m, null, SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 142.0f), 120.0f), null, null, null, gapComposer, 432, 2040);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, (sponsorDetailViewModel == null || (str2 = sponsorDetailViewModel.inviteFriendsTitle) == null) ? "" : str2, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, (sponsorDetailViewModel == null || (str = sponsorDetailViewModel.inviteFriendsSubtitle) == null) ? "" : str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                function12 = function1;
                rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(3, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1455469071, new ArcadeModal$$ExternalSyntheticLambda3(sponsorDetailViewModel, 18), gapComposer), gapComposer, 1573248, 58);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(sponsorDetailViewModel, function12, i, 6);
        }
    }

    public static final void ManagedAccountLoginQrCodeProviderView(Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(453083396);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(null) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            NavigationType navigationType = NavigationType.BACK;
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            z = false;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader("", (Modifier) null, AllowanceViewKt.f406lambda$144963357, (String) null, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SizeKt.fillMaxWidth(OffsetKt.aspectRatio(1.0f, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false), 1.0f));
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(m, 2.0f, Strings.getColors(gapComposer).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer).semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Strings.getSizes(gapComposer).getClass();
            OffsetKt.BoxWithConstraints(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f), true), null, false, Expect_jvmKt.rememberComposableLambda(-50309448, new ErrorView$$ExternalSyntheticLambda3(13, function1), gapComposer), gapComposer, 3072, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(416223242);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            z = false;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 16, z);
        }
    }

    public static final void SetDependentCustomLimitErrorView(SetDependentCustomLimitErrorViewModel setDependentCustomLimitErrorViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-784184835);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(setDependentCustomLimitErrorViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1898392632, new AllowanceViewKt$$ExternalSyntheticLambda0(29, setDependentCustomLimitErrorViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(setDependentCustomLimitErrorViewModel, function1, i, 5);
        }
    }

    public static final void SponsorDetail(Modifier modifier, SponsorDetailViewModel sponsorDetailViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1179924565);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(sponsorDetailViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(modifier), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 438, 104);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            int i3 = i2 >> 3;
            int i4 = i3 & 112;
            GraduationSection(sponsorDetailViewModel != null ? sponsorDetailViewModel.graduationViewModel : null, function1, gapComposer, i4);
            SponsorSection(sponsorDetailViewModel != null ? sponsorDetailViewModel.sponsorDetail : null, function1, gapComposer, i4);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            AllowanceSection(sponsorDetailViewModel != null ? sponsorDetailViewModel.allowanceSectionViewModel : null, gapComposer, 0);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            InviteFriendsSection(sponsorDetailViewModel, function1, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(i, 3, modifier, sponsorDetailViewModel, function1);
        }
    }

    public static final void SponsorDetailView(RealImageLoader realImageLoader, SponsorDetailViewModel sponsorDetailViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-257279921);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(sponsorDetailViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1818862300, new FormRemoteImageKt$$ExternalSyntheticLambda0(realImageLoader, sponsorDetailViewModel, function1, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(realImageLoader, sponsorDetailViewModel, function1, i, 20);
        }
    }

    public static final void SponsorLedInviteContent(SponsorLedInviteViewModel sponsorLedInviteViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-459652358);
        int i2 = (gapComposer.changedInstance(sponsorLedInviteViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (sponsorLedInviteViewModel instanceof SponsorLedInviteViewModel.Loaded) {
            gapComposer.startReplaceGroup(655720359);
            SponsorLedInviteContentLoaded((SponsorLedInviteViewModel.Loaded) sponsorLedInviteViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            if (!Intrinsics.areEqual(sponsorLedInviteViewModel, SponsorLedInviteViewModel.Loading.INSTANCE) && sponsorLedInviteViewModel != null) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 655719455, false);
            }
            gapComposer.startReplaceGroup(655723450);
            SponsorLedInviteContentLoading(gapComposer, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SponsorLedInviteViewKt$$ExternalSyntheticLambda2(sponsorLedInviteViewModel, function1, i);
        }
    }

    public static final void SponsorLedInviteContentLoaded(SponsorLedInviteViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        SponsorLedInviteViewModel.Loaded loaded2 = loaded;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1181140950);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(loaded2) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            NavigationType navigationType = NavigationType.BACK;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(4, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 438, 104);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            loaded2 = loaded;
            AvatarsKt.HorizontalStackedAvatars(AvatarSize.Size64, loaded2.avatarViewModel, null, new AddFavoritesViewKt$$ExternalSyntheticLambda15(15), gapComposer2, 6, 20);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer2), companion, 16.0f, gapComposer2);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, loaded2.title, (Map) null, (Function1) null, false);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer2), companion, 4.0f, gapComposer2);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).titleBarPageTitle, (TextLineBalancing) null, loaded2.body, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
            ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new SafetyHubViewKt$$ExternalSyntheticLambda9(5, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue2, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1276690449, new ArcadeModal$$ExternalSyntheticLambda3(loaded2, 19), gapComposer), gapComposer, 1573248, 58);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormCashtag$8$$ExternalSyntheticLambda0(loaded2, function12, i, 2);
        }
    }

    public static final void SponsorLedInviteContentLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2094831683);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, EnterExitTransitionKt.fadeIn(0.2f, AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, null, 6)), ExitTransitionImpl.None, (String) null, (Function3) AllowanceViewKt.lambda$437005797, (Composer) gapComposer, 196614, 18);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, 15);
        }
    }

    public static final void SponsorLedInviteView(RealImageLoader realImageLoader, SponsorLedInviteViewModel sponsorLedInviteViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1309554820);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(sponsorLedInviteViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(763970119, new FormRemoteImageKt$$ExternalSyntheticLambda0(realImageLoader, sponsorLedInviteViewModel, function1, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(realImageLoader, sponsorLedInviteViewModel, function1, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void SponsorResourcesSection(SponsorResourcesSectionViewModel sponsorResourcesSectionViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-321795978);
        char c = 4;
        int i2 = 32;
        int i3 = (gapComposer2.changedInstance(sponsorResourcesSectionViewModel) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            GapComposer gapComposer3 = gapComposer2;
            ViewfinderDefaults.SectionHeader(sponsorResourcesSectionViewModel.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer3, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
            gapComposer3.startReplaceGroup(1201426577);
            GapComposer gapComposer4 = gapComposer3;
            for (final SponsorResourcesRowViewModel sponsorResourcesRowViewModel : sponsorResourcesSectionViewModel.rows) {
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-932226350, new Function2() { // from class: com.squareup.cash.family.familyhub.views.SponsorResourcesViewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        SponsorResourcesRowViewModel sponsorResourcesRowViewModel2 = sponsorResourcesRowViewModel;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    zzd zzdVar = Icons.Companion;
                                    String str = sponsorResourcesRowViewModel2.icon.arcade_id;
                                    str.getClass();
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str);
                                    if (icons == null) {
                                        gapComposer5.startReplaceGroup(-696614381);
                                    } else {
                                        gapComposer5.startReplaceGroup(-696614380);
                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer3;
                                if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sponsorResourcesRowViewModel2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer4);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1718792177, new Function2() { // from class: com.squareup.cash.family.familyhub.views.SponsorResourcesViewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        SponsorResourcesRowViewModel sponsorResourcesRowViewModel2 = sponsorResourcesRowViewModel;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    zzd zzdVar = Icons.Companion;
                                    String str = sponsorResourcesRowViewModel2.icon.arcade_id;
                                    str.getClass();
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str);
                                    if (icons == null) {
                                        gapComposer5.startReplaceGroup(-696614381);
                                    } else {
                                        gapComposer5.startReplaceGroup(-696614380);
                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer3;
                                if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sponsorResourcesRowViewModel2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer4);
                int i6 = ((i3 & 112) == i2 ? i5 : i4) | (gapComposer4.changedInstance(sponsorResourcesRowViewModel) ? 1 : 0);
                Object rememberedValue = gapComposer4.rememberedValue();
                if (i6 != 0 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(5, function1, sponsorResourcesRowViewModel);
                    gapComposer4.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer5 = gapComposer4;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, null, null, push, 0L, gapComposer5, 805306422, 3572);
                c = 4;
                i5 = 1;
                i4 = i4;
                gapComposer4 = gapComposer5;
                i2 = i2;
            }
            gapComposer4.end(i4);
            gapComposer4.end(true);
            gapComposer = gapComposer4;
        } else {
            GapComposer gapComposer6 = gapComposer2;
            gapComposer6.skipToGroupEnd();
            gapComposer = gapComposer6;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormCashtag$8$$ExternalSyntheticLambda0(sponsorResourcesSectionViewModel, function1, i, 4);
        }
    }

    public static final void SponsorResourcesView(SponsorResourcesViewModel sponsorResourcesViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1018068237);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sponsorResourcesViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(736596056, new FormCashtag$8$$ExternalSyntheticLambda0(3, sponsorResourcesViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(sponsorResourcesViewModel, function1, i, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    public static final void SponsorSection(SponsorDetail sponsorDetail, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        boolean z;
        Modifier.Companion companion;
        ?? r1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-510742514);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(sponsorDetail) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(sponsorDetail == null ? SpacerKt.Center : SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Unit unit = null;
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
            if (sponsorDetail == null) {
                gapComposer.startReplaceGroup(599039764);
                gapComposer.end(false);
                r1 = 0;
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(599039765);
                zzabw.HorizontalStackedAvatars(AvatarSize.Size64, Tags.persistentListOf(AvatarsKt.toAvatarEntry(sponsorDetail.avatarViewModel.avatar, null, new AddFavoritesViewKt$$ExternalSyntheticLambda15(14), gapComposer, 8, 1)), null, gapComposer, 6, 4);
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, sponsorDetail.sponsorIntroductionText, (Map) null, (Function1) null, false);
                String str = sponsorDetail.badgeName.fullName;
                if (str == null) {
                    str = "";
                }
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                if (sponsorDetail.shouldShowRequestCashButton) {
                    gapComposer.startReplaceGroup(-164151574);
                    String str2 = sponsorDetail.requestCashButtonText;
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).linkMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119);
                    long j = Strings.getColors(gapComposer).semantic.text.standard;
                    boolean z2 = (i3 & 112) == 32;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z2 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(2, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    companion = companion2;
                    z = false;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15), m994copyp1EtxEg$default, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                } else {
                    z = false;
                    companion = companion2;
                    gapComposer.startReplaceGroup(-163802483);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
                unit = Unit.INSTANCE;
                r1 = z;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(600191694);
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 64.0f));
                Strings.getSizes(gapComposer).getClass();
                ProgressCircularKt.ProgressCircular(r1, r1, gapComposer, SizeKt.m285size3ABfNKs(companion, 32.0f));
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 64.0f));
                gapComposer.end(r1);
            } else {
                gapComposer.startReplaceGroup(1820439233);
                gapComposer.end(r1);
            }
            gapComposer.end(true);
            function12 = function1;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(sponsorDetail, function12, i, 8);
        }
    }
}
