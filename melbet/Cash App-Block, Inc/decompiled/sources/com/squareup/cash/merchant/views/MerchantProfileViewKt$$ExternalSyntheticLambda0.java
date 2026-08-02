package com.squareup.cash.merchant.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MerchantProfileViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ RealImageLoader f$0;
    public final /* synthetic */ MerchantProfileViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ MerchantProfileViewKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, MerchantProfileViewModel merchantProfileViewModel, Function1 function1) {
        this.f$0 = realImageLoader;
        this.f$1 = merchantProfileViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalImageLoaderKt.LocalImageLoader;
                    RealImageLoader realImageLoader = this.f$0;
                    Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1383041250, new MerchantProfileViewKt$$ExternalSyntheticLambda0(this.f$1, this.f$2, realImageLoader), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
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
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(companion);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier height = OffsetKt.height(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f), IntrinsicSize.Max);
                    MerchantProfileViewModel merchantProfileViewModel = this.f$1;
                    Function1 function1 = this.f$2;
                    MerchantProfileViewKt.MerchantProfileContent(height, merchantProfileViewModel, function1, this.f$0, gapComposer2, 0);
                    MerchantProfileViewKt.ProfilePhotoOverlay(null, merchantProfileViewModel.photoOverlay, function1, gapComposer2, 0);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MerchantProfileViewKt$$ExternalSyntheticLambda0(MerchantProfileViewModel merchantProfileViewModel, Function1 function1, RealImageLoader realImageLoader) {
        this.f$1 = merchantProfileViewModel;
        this.f$2 = function1;
        this.f$0 = realImageLoader;
    }
}
