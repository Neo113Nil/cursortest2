package com.squareup.cash.prepurchasecashcard.views;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.credentials.Credential;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class PrepurchasePlanningSheetHomeKt {
    public static final List listItemLengths = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{16, 8, 20});

    public static final void PrepurchaseCardLoadableListItem(ListUnorderedScope listUnorderedScope, PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow infoRow, int i, Function1 function1, Modifier modifier, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Modifier modifier4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1272413138);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(listUnorderedScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changedInstance(infoRow) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        int i5 = 1;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            Credential credential = infoRow.action;
            Modifier modifier5 = Modifier.Companion.$$INSTANCE;
            if (credential != null) {
                gapComposer.startReplaceGroup(-921261341);
                boolean changedInstance = ((i4 & 7168) == 2048) | gapComposer.changedInstance(credential);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(11, function1, credential);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(modifier5, false, null, null, (Function0) rememberedValue, 15);
                modifier3 = modifier5;
                gapComposer.end(false);
                modifier4 = m183clickableoSLSa3U$default;
            } else {
                modifier3 = modifier5;
                gapComposer.startReplaceGroup(-921149710);
                gapComposer.end(false);
                modifier4 = modifier3;
            }
            listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(-2125932400, new PdfPreviewViewKt$$ExternalSyntheticLambda2(infoRow, 15), gapComposer), modifier4, (Function2) null, Expect_jvmKt.rememberComposableLambda(341976877, new WorkYouViewKt$$ExternalSyntheticLambda1(infoRow, i, i5), gapComposer), (Function2) null, gapComposer, ((i4 << 15) & 458752) | 3078, 20);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(listUnorderedScope, infoRow, i, function1, modifier2, i2);
        }
    }

    public static final void PrepurchasePlanningSheetHome(final PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet prepurchaseCardHomeSheet, final Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ComposableLambdaImpl composableLambdaImpl;
        prepurchaseCardHomeSheet.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1436394963);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(prepurchaseCardHomeSheet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i4 == 0) {
            i2 |= gapComposer2.changed(companion) ? 256 : 128;
        }
        final int i5 = 1;
        final int i6 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i7 = 14;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer2), false, 14);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(verticalScroll$default, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl2 = null;
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
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1968899036, new PdfPreviewViewKt$$ExternalSyntheticLambda2(prepurchaseCardHomeSheet, i7), gapComposer2);
            PrepurchaseCashCardPlanningViewModel.LoadableText loadableText = prepurchaseCardHomeSheet.subtitle;
            String str = prepurchaseCardHomeSheet.footerText;
            String str2 = prepurchaseCardHomeSheet.infoRowsHeader;
            if (loadableText == null) {
                gapComposer2.startReplaceGroup(-2138634603);
                gapComposer2.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer2.startReplaceGroup(-2138634602);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1908626072, new ErrorView$$ExternalSyntheticLambda0(i3, (Object) loadableText, (Object) function1), gapComposer2);
                gapComposer2.end(false);
                composableLambdaImpl = rememberComposableLambda2;
            }
            GapComposer gapComposer3 = gapComposer2;
            Transformations.SheetHeader(rememberComposableLambda, (Modifier) null, (Function2) null, composableLambdaImpl, gapComposer3, 6, 6);
            if (str2 == null && prepurchaseCardHomeSheet.infoRows.isEmpty()) {
                gapComposer3.startReplaceGroup(-2137918843);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-2137958244);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                gapComposer3.end(false);
            }
            if (str2 == null) {
                gapComposer3.startReplaceGroup(-2137889270);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-2137889269);
                ViewfinderDefaults.SectionHeader(str2, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer3, 0, 30);
                gapComposer3 = gapComposer3;
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                gapComposer3.end(false);
            }
            GapComposer gapComposer4 = gapComposer3;
            ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-199434813, new Function3() { // from class: com.squareup.cash.prepurchasecashcard.views.PrepurchasePlanningSheetHomeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i6;
                    PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet prepurchaseCardHomeSheet2 = prepurchaseCardHomeSheet;
                    switch (i8) {
                        case 0:
                            ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            listUnorderedScope.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(listUnorderedScope) ? 4 : 2;
                            }
                            GapComposer gapComposer5 = (GapComposer) composer2;
                            if (gapComposer5.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                int i9 = 0;
                                for (Object obj4 : prepurchaseCardHomeSheet2.infoRows) {
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    PrepurchasePlanningSheetHomeKt.PrepurchaseCardLoadableListItem(listUnorderedScope, (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow) obj4, i9, function1, null, gapComposer5, intValue & 14);
                                    i9 = i10;
                                }
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((AdaptiveStackScope) obj).getClass();
                            GapComposer gapComposer6 = (GapComposer) composer3;
                            if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                PrepurchaseCashCardPlanningViewModel.LoadableButton loadableButton = prepurchaseCardHomeSheet2.primaryFooterButton;
                                Function1 function12 = function1;
                                if (loadableButton == null) {
                                    gapComposer6.startReplaceGroup(574442151);
                                    gapComposer6.end(false);
                                } else {
                                    gapComposer6.startReplaceGroup(574442152);
                                    LocaleToggleKt.LoadableButton(loadableButton, function12, ButtonProminence.PROMINENT, null, gapComposer6, MLKEMEngine.KyberPolyBytes);
                                    gapComposer6.end(false);
                                }
                                PrepurchaseCashCardPlanningViewModel.LoadableButton loadableButton2 = prepurchaseCardHomeSheet2.secondaryFooterButton;
                                if (loadableButton2 == null) {
                                    gapComposer6.startReplaceGroup(574591850);
                                    gapComposer6.end(false);
                                } else {
                                    gapComposer6.startReplaceGroup(574591851);
                                    LocaleToggleKt.LoadableButton(loadableButton2, function12, ButtonProminence.SUBTLE, null, gapComposer6, MLKEMEngine.KyberPolyBytes);
                                    gapComposer6.end(false);
                                }
                            } else {
                                gapComposer6.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer3), gapComposer4, 196608, 31);
            gapComposer = gapComposer4;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            if (str == null && prepurchaseCardHomeSheet.primaryFooterButton == null && prepurchaseCardHomeSheet.secondaryFooterButton == null) {
                gapComposer.startReplaceGroup(-2136754235);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2137420208);
                if (str == null) {
                    gapComposer.startReplaceGroup(-2137360007);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-2137360006);
                    composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(-1787674858, new TabContentViewKt$$ExternalSyntheticLambda11(str, function1, 28), gapComposer);
                    gapComposer.end(false);
                }
                DimensionKt.ButtonCtaGroup(null, false, null, composableLambdaImpl2, Expect_jvmKt.rememberComposableLambda(1866011081, new Function3() { // from class: com.squareup.cash.prepurchasecashcard.views.PrepurchasePlanningSheetHomeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i8 = i5;
                        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet prepurchaseCardHomeSheet2 = prepurchaseCardHomeSheet;
                        switch (i8) {
                            case 0:
                                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                listUnorderedScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(listUnorderedScope) ? 4 : 2;
                                }
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    int i9 = 0;
                                    for (Object obj4 : prepurchaseCardHomeSheet2.infoRows) {
                                        int i10 = i9 + 1;
                                        if (i9 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                            throw null;
                                        }
                                        PrepurchasePlanningSheetHomeKt.PrepurchaseCardLoadableListItem(listUnorderedScope, (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow) obj4, i9, function1, null, gapComposer5, intValue & 14);
                                        i9 = i10;
                                    }
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((AdaptiveStackScope) obj).getClass();
                                GapComposer gapComposer6 = (GapComposer) composer3;
                                if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    PrepurchaseCashCardPlanningViewModel.LoadableButton loadableButton = prepurchaseCardHomeSheet2.primaryFooterButton;
                                    Function1 function12 = function1;
                                    if (loadableButton == null) {
                                        gapComposer6.startReplaceGroup(574442151);
                                        gapComposer6.end(false);
                                    } else {
                                        gapComposer6.startReplaceGroup(574442152);
                                        LocaleToggleKt.LoadableButton(loadableButton, function12, ButtonProminence.PROMINENT, null, gapComposer6, MLKEMEngine.KyberPolyBytes);
                                        gapComposer6.end(false);
                                    }
                                    PrepurchaseCashCardPlanningViewModel.LoadableButton loadableButton2 = prepurchaseCardHomeSheet2.secondaryFooterButton;
                                    if (loadableButton2 == null) {
                                        gapComposer6.startReplaceGroup(574591850);
                                        gapComposer6.end(false);
                                    } else {
                                        gapComposer6.startReplaceGroup(574591851);
                                        LocaleToggleKt.LoadableButton(loadableButton2, function12, ButtonProminence.SUBTLE, null, gapComposer6, MLKEMEngine.KyberPolyBytes);
                                        gapComposer6.end(false);
                                    }
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer), gapComposer, 24576, 7);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(prepurchaseCardHomeSheet, function1, i);
        }
    }
}
