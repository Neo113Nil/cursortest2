package com.squareup.cash.securityhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.LocalEditorialContent;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionViewModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewModel;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class RecoveryGuideViewKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ RecoveryGuideViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        float f;
        float f2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Modifier.Companion companion;
        GapComposer gapComposer;
        long j;
        int i = this.$r8$classId;
        Color color = null;
        Object obj4 = Composer.Companion.Empty;
        Function1 function1 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                RecoveryGuideViewModel recoveryGuideViewModel = (RecoveryGuideViewModel) obj6;
                RecoveryGuideSectionViewModel recoveryGuideSectionViewModel = (RecoveryGuideSectionViewModel) obj5;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
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
                    if (i2 > 0) {
                        gapComposer2.startReplaceGroup(270272277);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                        if (((RecoveryGuideSectionViewModel) recoveryGuideViewModel.sections.get(i2 - 1)).content instanceof RecoveryGuideSectionViewModel.Content.Booklets) {
                            gapComposer2.startReplaceGroup(270382203);
                            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(270448667);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(270521176);
                        gapComposer2.end(false);
                    }
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(7, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Function1 function12 = (Function1) rememberedValue;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(8, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    RecoveryGuideViewKt.RecoveryGuideSection(recoveryGuideSectionViewModel, function12, (Function1) rememberedValue2, gapComposer2, 0);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LocalEditorialContent.BrandCarousel.CarouselImage carouselImage = (LocalEditorialContent.BrandCarousel.CarouselImage) obj6;
                LocalEditorialContent.BrandCarousel brandCarousel = (LocalEditorialContent.BrandCarousel) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                ?? r10 = (GapComposer) composer2;
                boolean shouldExecute = r10.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16);
                Applier applier = r10.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (i2 == 0) {
                        r10.startReplaceGroup(932654720);
                        r10.startReplaceGroup(2108315004);
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion2, 143.0f), 168.0f);
                        LocalImage localImage = carouselImage.image;
                        LocalColor localColor = localImage.placeholder_color;
                        if (localColor == null) {
                            r10.startReplaceGroup(932883127);
                            r10.end(false);
                        } else {
                            r10.startReplaceGroup(2108302986);
                            color = Recorder$$ExternalSyntheticOutline1.m((GapComposer) r10, false, LocalViewsKt.toComposeColor(localColor, r10, 0));
                        }
                        if (color == null) {
                            r10.startReplaceGroup(2108305632);
                            Colors colors = (Colors) r10.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m((GapComposer) r10, -1762997026, (GapComposer) r10, false);
                            } else {
                                r10.startReplaceGroup(-1762997739);
                                r10.end(false);
                            }
                            j = colors.semantic.background.subtle;
                            r10.end(false);
                        } else {
                            r10.startReplaceGroup(2108301850);
                            r10.end(false);
                            j = color.value;
                        }
                        ((DefaultSizes) r10.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        Object obj7 = DefaultSizes.border.entries;
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 16.0f, 32.0f);
                        Float ratio = LocalViewsKt.getRatio(localImage);
                        if (ratio != null) {
                            m299paddingVpY3zN4 = m299paddingVpY3zN4.then(OffsetKt.aspectRatio(ratio.floatValue(), companion2, false));
                        }
                        String str2 = carouselImage.url;
                        if (str2 != null) {
                            boolean changed3 = r10.changed(function1) | r10.changed(str2);
                            Object rememberedValue3 = r10.rememberedValue();
                            if (changed3 || rememberedValue3 == obj4) {
                                rememberedValue3 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str2, 3);
                                r10.updateRememberedValue(rememberedValue3);
                            }
                            m299paddingVpY3zN4 = m299paddingVpY3zN4.then(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue3, 15));
                        }
                        r10.end(false);
                        LocalMapKt.LocalAsyncImage(m299paddingVpY3zN4, null, LocalViewsKt.getThemedUrl(localImage, r10), ContentScale.Companion.Fit, null, null, LocalAddBrandsViewKt.lambda$704267959, r10, 1575936, 50);
                        r10.end(false);
                    } else {
                        r10.startReplaceGroup(933666343);
                        boolean z = i2 == 1;
                        boolean z2 = i2 == brandCarousel.carouselImages.size() - 1;
                        Strings.getSizes(r10).getClass();
                        Object obj8 = DefaultSizes.border.entries;
                        Strings.getSizes(r10).getClass();
                        r10.startReplaceGroup(2108353468);
                        Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion2, 143.0f), 168.0f), RoundedCornerShapeKt.m341RoundedCornerShapea9UjIt4(z ? 16.0f : 6.0f, z2 ? 16.0f : 6.0f, z2 ? 16.0f : 6.0f, z ? 16.0f : 6.0f));
                        String str3 = carouselImage.url;
                        String str4 = carouselImage.overlayText;
                        if (str3 != null) {
                            boolean changed4 = r10.changed(function1) | r10.changed(str3);
                            Object rememberedValue4 = r10.rememberedValue();
                            if (changed4 || rememberedValue4 == obj4) {
                                rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str3, 4);
                                r10.updateRememberedValue(rememberedValue4);
                            }
                            str = str4;
                            f = 143.0f;
                            f2 = 168.0f;
                            clip = clip.then(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue4, 15));
                        } else {
                            str = str4;
                            f = 143.0f;
                            f2 = 168.0f;
                        }
                        r10.end(false);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode2 = Long.hashCode(r10.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r10.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(r10, clip);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        r10.startReusableNode();
                        if (r10.inserting) {
                            r10.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            r10.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(r10, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(r10, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(r10, valueOf, composeUiNode$Companion$SetModifier$14);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(r10, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(r10, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                        Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion2, f), f2);
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                        if (str != null) {
                            companion = BlurKt.m586blurF8QBwvs(companion2, 8.0f, rectangleShapeKt$RectangleShape$1);
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                        } else {
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                            companion = companion2;
                        }
                        LocalMapKt.LocalAsyncImage(m277height3ABfNKs2, companion, LocalViewsKt.getThemedUrl(carouselImage.image, r10), ContentScale.Companion.Crop, null, null, null, r10, 3078, 112);
                        if (str == null) {
                            r10.startReplaceGroup(1658154417);
                            r10.end(false);
                            gapComposer = r10;
                        } else {
                            r10.startReplaceGroup(1658154418);
                            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion2, 1.0f), Color.m675copywmQWz5c$default(0.5f, Strings.getColors(r10).base.constantBlack, 14), rectangleShapeKt$RectangleShape$1);
                            Strings.getSizes(r10).getClass();
                            DefaultSizes.spacing.getClass();
                            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            int hashCode3 = Long.hashCode(r10.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r10.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(r10, m298padding3ABfNKs);
                            r10.startReusableNode();
                            if (r10.inserting) {
                                r10.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                r10.useNode();
                            }
                            Updater.m576setimpl(r10, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                            Updater.m576setimpl(r10, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode3, (GapComposer) r10, composeUiNode$Companion$SetModifier$1, (GapComposer) r10, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(r10, materializeModifier3, composeUiNode$Companion$SetModifier$15);
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(r10).base.constantWhite, (Composer) r10, (Modifier) null, Strings.getTypography(r10).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            gapComposer = r10;
                            gapComposer.end(true);
                            gapComposer.end(false);
                        }
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                } else {
                    r10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
