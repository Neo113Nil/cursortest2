package com.squareup.cash.booklet.ui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.fidesmo.views.ComposableSingletons$FidesmoProvisioningViewKt;
import com.squareup.cash.fidesmo.views.SuccessCardImageState;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* loaded from: classes5.dex */
public final /* synthetic */ class BookletTileKt$$ExternalSyntheticLambda6 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AsyncImagePainter f$0;

    public /* synthetic */ BookletTileKt$$ExternalSyntheticLambda6(AsyncImagePainter asyncImagePainter, int i) {
        this.$r8$classId = i;
        this.f$0 = asyncImagePainter;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                BookletImageState bookletImageState = (BookletImageState) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                bookletImageState.getClass();
                int ordinal = bookletImageState.ordinal();
                if (ordinal == 0) {
                    GapComposer gapComposer = (GapComposer) composer;
                    gapComposer.startReplaceGroup(-150139805);
                    VisibleKt.ShimmerBox(null, false, null, BookletGridKt.f317lambda$1987640807, gapComposer, 3072, 7);
                    gapComposer.end(false);
                } else if (ordinal == 1) {
                    GapComposer gapComposer2 = (GapComposer) composer;
                    gapComposer2.startReplaceGroup(-150131361);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
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
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Icons icons = Icons.Image24;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors.semantic.icon.extraSubtle, gapComposer2, 54, 4);
                    gapComposer2.end(true);
                    gapComposer2.end(false);
                } else {
                    if (ordinal != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -150141177, false);
                    }
                    GapComposer gapComposer3 = (GapComposer) composer;
                    gapComposer3.startReplaceGroup(-358782927);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    ImageKt.Image(this.f$0, null, ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.subtle, ColorKt.RectangleShape), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer3, 24576, 104);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            default:
                SuccessCardImageState successCardImageState = (SuccessCardImageState) obj2;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                successCardImageState.getClass();
                int ordinal2 = successCardImageState.ordinal();
                if (ordinal2 == 0) {
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    gapComposer4.startReplaceGroup(-819107728);
                    VisibleKt.ShimmerBox(null, false, null, ComposableSingletons$FidesmoProvisioningViewKt.lambda$460407635, gapComposer4, 3072, 7);
                    gapComposer4.end(false);
                } else if (ordinal2 == 1) {
                    GapComposer gapComposer5 = (GapComposer) composer2;
                    gapComposer5.startReplaceGroup(-819100289);
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, fillMaxSize3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Icons icons2 = Icons.Image24;
                    Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, colors3.semantic.icon.extraSubtle, gapComposer5, 54, 4);
                    gapComposer5.end(true);
                    gapComposer5.end(false);
                } else {
                    if (ordinal2 != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer2, -819109224, false);
                    }
                    GapComposer gapComposer6 = (GapComposer) composer2;
                    gapComposer6.startReplaceGroup(378000913);
                    ImageKt.Image(this.f$0, null, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer6, 25008, 104);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
        }
    }
}
