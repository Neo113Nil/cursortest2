package com.squareup.cash.offers.views.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.Strings;
import com.squareup.util.cash.ColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class OfferTileKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ OffersHomeViewModelV2.Loaded.OfferItem f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ OfferTileKt$$ExternalSyntheticLambda0(Modifier modifier, OffersHomeViewModelV2.Loaded.OfferItem offerItem, Function1 function1, int i) {
        this.f$1 = modifier;
        this.f$0 = offerItem;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th;
        long j;
        Color m;
        long j2;
        Color m2;
        int i = this.$r8$classId;
        Modifier modifier = this.f$1;
        Function1 function1 = this.f$2;
        OffersHomeViewModelV2.Loaded.OfferItem offerItem = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    long j3 = Strings.getColors(gapComposer).semantic.background.subtle;
                    OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus itemStatus = offerItem.status;
                    StackedAvatarViewModel.Single single = offerItem.avatar;
                    if (itemStatus == OffersHomeViewModelV2.Loaded.OfferItem.ItemStatus.SELECTED) {
                        gapComposer.startReplaceGroup(-249251176);
                        ColorModel colorModel = single.avatar.backgroundColor;
                        if (colorModel == null) {
                            gapComposer.startReplaceGroup(-249223494);
                            gapComposer.end(false);
                            m = null;
                        } else {
                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1532060121, colorModel, gapComposer, false);
                        }
                        if (m == null) {
                            gapComposer.startReplaceGroup(-249204894);
                            gapComposer.end(false);
                            j2 = j3;
                            th = null;
                            m2 = null;
                        } else {
                            gapComposer.startReplaceGroup(-249204893);
                            th = null;
                            j2 = j3;
                            m2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, ColorsKt.m3988contrastAdjustedColorysEtTa8(m.value, j2, Strings.getColors(gapComposer).semantic.background.f1047app));
                        }
                        long j4 = m2 != null ? m2.value : j2;
                        gapComposer.end(false);
                        j = j4;
                    } else {
                        th = null;
                        gapComposer.startReplaceGroup(-248948895);
                        gapComposer.end(false);
                        j = j3;
                    }
                    long m3988contrastAdjustedColorysEtTa8 = ColorsKt.m3988contrastAdjustedColorysEtTa8(Strings.getColors(gapComposer).semantic.text.standard, Strings.getColors(gapComposer).semantic.text.inverse, j);
                    long j5 = j;
                    Strings.getSizes(gapComposer).getClass();
                    Object obj3 = DefaultSizes.border.entries;
                    Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(offerItem);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new OfferTileKt$$ExternalSyntheticLambda2(function1, offerItem, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15), 200.0f), j5, ColorKt.RectangleShape);
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, horizontal, gapComposer, 54);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw th;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    OfferTileKt.TileAccessory(0, gapComposer, SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(new HorizontalAlignElement(Alignment.Companion.End), RecyclerView.DECELERATION_RATE, 12.0f, 12.0f, RecyclerView.DECELERATION_RATE, 9), 24.0f), offerItem, function1);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    TextViewKt.Avatar(AvatarSize.Size96, AvatarsKt.toAvatarEntry(single.avatar, null, null, gapComposer, 8, 3), Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SizeKt.m285size3ABfNKs(companion, 85.0f)), false, gapComposer, 6, 24);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 6);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                    zzacn.m2012AutoScaleTextZLomxE(0, 0, 0, 0, 498, m3988contrastAdjustedColorysEtTa8, 0L, gapComposer, null, Strings.getTypography(gapComposer).labelSmall, offerItem.title, null);
                    GapComposer gapComposer2 = gapComposer;
                    String str = offerItem.subtitle;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(1369435190);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1369435191);
                        zzacn.m2012AutoScaleTextZLomxE(0, 0, 0, 0, 498, m3988contrastAdjustedColorysEtTa8, 0L, gapComposer2, null, Strings.getTypography(gapComposer2).bodySmall, str, null);
                        gapComposer2 = gapComposer2;
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                OfferTileKt.OfferTile(Updater.updateChangedFlags(1), (Composer) obj, modifier, offerItem, function1);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                OfferTileKt.TileAccessory(Updater.updateChangedFlags(1), (Composer) obj, modifier, offerItem, function1);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OfferTileKt$$ExternalSyntheticLambda0(OffersHomeViewModelV2.Loaded.OfferItem offerItem, Modifier modifier, Function1 function1) {
        this.f$0 = offerItem;
        this.f$1 = modifier;
        this.f$2 = function1;
    }

    public /* synthetic */ OfferTileKt$$ExternalSyntheticLambda0(OffersHomeViewModelV2.Loaded.OfferItem offerItem, Function1 function1, Modifier modifier, int i) {
        this.f$0 = offerItem;
        this.f$2 = function1;
        this.f$1 = modifier;
    }
}
