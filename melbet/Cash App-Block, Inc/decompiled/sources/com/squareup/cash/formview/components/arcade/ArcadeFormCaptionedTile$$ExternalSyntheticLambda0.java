package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.R;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormCaptionedTile$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ArcadeFormCaptionedTile f$0;

    public /* synthetic */ ArcadeFormCaptionedTile$$ExternalSyntheticLambda0(ArcadeFormCaptionedTile arcadeFormCaptionedTile) {
        this.f$0 = arcadeFormCaptionedTile;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ArcadeFormCaptionedTile arcadeFormCaptionedTile = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    FormBlocker.Element.CaptionedTileElement captionedTileElement = arcadeFormCaptionedTile.element;
                    Color color = captionedTileElement.background_color;
                    color.getClass();
                    androidx.compose.ui.graphics.Color forTheme = ThemablesKt.forTheme(color, gapComposer);
                    forTheme.getClass();
                    long j = forTheme.value;
                    long Color = ColorKt.Color(com.squareup.cash.mooncake.theming.ThemablesKt.contrastAdjustedColor(ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer).base.constantWhite), ColorKt.m694toArgb8_81llA(j), ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer).base.grey20)));
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(companion, 120.0f, 180.0f), j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    boolean changedInstance = gapComposer.changedInstance(arcadeFormCaptionedTile);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda2(arcadeFormCaptionedTile, 3);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m177backgroundbw27NRU, true, (Function1) rememberedValue);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
                    ImageKt.Image(Countries.painterResource(R.drawable.captioned_tile_background_stock, 0, gapComposer), null, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 72.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(Color, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 432, 56);
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m298padding3ABfNKs(SizeKt.wrapContentWidth$default(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterHorizontally, 2), 16.0f), 64.0f), RoundedCornerShapeKt.CircleShape);
                    RealImageLoader realImageLoader = arcadeFormCaptionedTile.imageLoader;
                    Image image = captionedTileElement.icon;
                    image.getClass();
                    AsyncImageKt.m1441AsyncImagesKDTAoQ(ThemablesKt.urlForTheme(image, gapComposer), null, realImageLoader, clip, null, null, null, gapComposer, 48, 0, 4080);
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), 1.0f), 16.0f);
                    String str = captionedTileElement.caption;
                    str.getClass();
                    zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, 24576, 448, Color, 0L, gapComposer, m298padding3ABfNKs, LazyGridKt.getLegacyTabTitle(Strings.getTypography(gapComposer)), str, null);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                arcadeFormCaptionedTile.Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeFormCaptionedTile$$ExternalSyntheticLambda0(ArcadeFormCaptionedTile arcadeFormCaptionedTile, int i) {
        this.f$0 = arcadeFormCaptionedTile;
    }
}
