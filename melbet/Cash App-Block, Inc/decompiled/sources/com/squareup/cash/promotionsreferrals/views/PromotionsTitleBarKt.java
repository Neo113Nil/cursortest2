package com.squareup.cash.promotionsreferrals.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.PendingIntentCompat;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.util.Strings;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class PromotionsTitleBarKt {

    /* renamed from: lambda$-477590420, reason: not valid java name */
    public static final ComposableLambdaImpl f635lambda$477590420 = new ComposableLambdaImpl(new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(9), false, -477590420);

    public static final void PromotionHomeLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-715037590);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            ProgressCircularKt.ProgressCircular(0, 0, gapComposer, BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromotionsReferralsContent(PromotionsReferralsHomeViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        Object obj;
        ?? r2;
        boolean z;
        boolean z2;
        boolean z3;
        Modifier modifier;
        boolean z4;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(150144583);
        int i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            PromotionsReferralsHomeViewModel.Loaded.PromotionCode promotionCode = loaded.promotionCode;
            Object obj2 = Composer.Companion.Empty;
            if (promotionCode == null) {
                gapComposer.startReplaceGroup(1472270256);
                gapComposer.end(false);
                obj = obj2;
                r2 = 0;
                z = true;
            } else {
                gapComposer.startReplaceGroup(1472270257);
                gapComposer.startReplaceGroup(1416358782);
                Icons icons = Icons.Gift24;
                String str = promotionCode.title;
                long j = Strings.getColors(gapComposer).semantic.icon.standard;
                long j2 = Strings.getColors(gapComposer).semantic.border.subtle;
                boolean z5 = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z5 || rememberedValue == obj2) {
                    rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(14, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                obj = obj2;
                r2 = 0;
                z = true;
                PendingIntentCompat.m1088PromotionItemnBX6wN0(48, 9, j, j2, gapComposer, null, icons, str, null, (Function0) rememberedValue);
                gapComposer.end(false);
                gapComposer.end(false);
            }
            PromotionsReferralsHomeViewModel.Loaded.InvitePromotion invitePromotion = loaded.invitePromotion;
            gapComposer.startReplaceGroup(1472617457);
            if (invitePromotion.enabled) {
                gapComposer.startReplaceGroup(470136127);
                Icons icons2 = Icons.Add24;
                String str2 = invitePromotion.title;
                String str3 = invitePromotion.subtitle;
                long j3 = Strings.getColors(gapComposer).semantic.icon.standard;
                long j4 = Strings.getColors(gapComposer).semantic.border.subtle;
                boolean z6 = (i2 & 112) == 32 ? z : r2;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z6 || rememberedValue2 == obj) {
                    rememberedValue2 = new CashtagQrScanView$$ExternalSyntheticLambda0(15, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                PendingIntentCompat.m1088PromotionItemnBX6wN0(48, 1, j3, j4, gapComposer, null, icons2, str2, str3, (Function0) rememberedValue2);
                gapComposer.end(r2);
            } else {
                gapComposer.startReplaceGroup(470441725);
                gapComposer.end(r2);
            }
            gapComposer.end(r2);
            PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel promotionsListViewModel = loaded.promotionsListViewModel;
            if (promotionsListViewModel == null) {
                gapComposer.startReplaceGroup(1473020456);
                gapComposer.end(r2);
                z4 = z;
            } else {
                PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel availablePromotionsSectionViewModel = promotionsListViewModel.availablePromotionsSection;
                PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel activePromotionsSectionViewModel = promotionsListViewModel.activePromotionsSection;
                gapComposer.startReplaceGroup(1473020457);
                if (activePromotionsSectionViewModel == null || (immutableList2 = activePromotionsSectionViewModel.promotions) == null) {
                    z2 = z;
                } else {
                    z2 = z;
                    if ((!immutableList2.isEmpty()) == z2) {
                        z3 = z2;
                        boolean z7 = (availablePromotionsSectionViewModel == null && (immutableList = availablePromotionsSectionViewModel.promotions) != null && (immutableList.isEmpty() ^ z2) == z2) ? true : r2;
                        if (!z3 || z7) {
                            gapComposer.startReplaceGroup(-868348276);
                            modifier = null;
                            DBUtil.SpacerBetweenSectionXLarge(r2, 1, gapComposer, null);
                            gapComposer.end(r2);
                        } else {
                            gapComposer.startReplaceGroup(-868304070);
                            gapComposer.end(r2);
                            modifier = null;
                        }
                        if (activePromotionsSectionViewModel != null) {
                            gapComposer.startReplaceGroup(-868249294);
                            gapComposer.end(r2);
                        } else {
                            gapComposer.startReplaceGroup(-868249293);
                            if (activePromotionsSectionViewModel.promotions.isEmpty()) {
                                gapComposer.startReplaceGroup(-609971520);
                                gapComposer.end(r2);
                            } else {
                                gapComposer.startReplaceGroup(-610147383);
                                NotificationManagerCompat.Api23Impl.ActivePromotionSectionList(activePromotionsSectionViewModel, function1, modifier, gapComposer, i2 & 112);
                                if (z7) {
                                    gapComposer.startReplaceGroup(-610033334);
                                    DBUtil.SpacerBetweenSectionXLarge(r2, 1, gapComposer, modifier);
                                    gapComposer.end(r2);
                                } else {
                                    gapComposer.startReplaceGroup(-609981440);
                                    gapComposer.end(r2);
                                }
                                gapComposer.end(r2);
                            }
                            gapComposer.end(r2);
                        }
                        if (availablePromotionsSectionViewModel != null) {
                            gapComposer.startReplaceGroup(-867941340);
                            gapComposer.end(r2);
                        } else {
                            gapComposer.startReplaceGroup(-867941339);
                            if (availablePromotionsSectionViewModel.promotions.isEmpty()) {
                                gapComposer.startReplaceGroup(-460136028);
                                gapComposer.end(r2);
                            } else {
                                gapComposer.startReplaceGroup(-460227323);
                                NotificationManagerCompat.Api26Impl.AvailablePromotionSectionList(availablePromotionsSectionViewModel, function1, modifier, gapComposer, i2 & 112);
                                gapComposer.end(r2);
                            }
                            gapComposer.end(r2);
                        }
                        gapComposer.end(r2);
                        z4 = true;
                    }
                }
                z3 = r2;
                if (availablePromotionsSectionViewModel == null) {
                }
                if (z3) {
                }
                gapComposer.startReplaceGroup(-868348276);
                modifier = null;
                DBUtil.SpacerBetweenSectionXLarge(r2, 1, gapComposer, null);
                gapComposer.end(r2);
                if (activePromotionsSectionViewModel != null) {
                }
                if (availablePromotionsSectionViewModel != null) {
                }
                gapComposer.end(r2);
                z4 = true;
            }
            gapComposer.end(z4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(loaded, function1, i, 2);
        }
    }

    public static final void PromotionsReferralsHomeView(PromotionsReferralsHomeViewModel promotionsReferralsHomeViewModel, RealImageLoader realImageLoader, Function1 function1, Composer composer, int i) {
        int i2;
        promotionsReferralsHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1181576326);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(promotionsReferralsHomeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(67368529, new RetroUiFactory$$ExternalSyntheticLambda3(function1, promotionsReferralsHomeViewModel, realImageLoader), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9((Object) promotionsReferralsHomeViewModel, (Object) realImageLoader, function1, i, 19);
        }
    }

    public static final void PromotionsTitleBar(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(852293724);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PromotionsTitleBarKt$$ExternalSyntheticLambda0(str, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Lazy lazy = LazyKt.lazy((Function0) rememberedValue);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            DBUtil.TitleBarSub((Function2) lazy.getValue(), NavigationType.BACK, SizeKt.fillMaxWidth(companion, 1.0f), (DynamicColorConfiguration) null, function0, (Modifier) null, (Function3) null, gapComposer, ((i2 << 6) & 57344) | 48, 104);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda1(modifier2, str, function0, i, 5);
        }
    }
}
