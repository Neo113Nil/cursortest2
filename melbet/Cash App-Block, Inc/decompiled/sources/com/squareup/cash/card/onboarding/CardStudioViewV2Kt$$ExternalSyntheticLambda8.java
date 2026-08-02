package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.cash.wallet.views.WalletCardSchemeViewKt$$ExternalSyntheticLambda38;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewV2Kt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda8(float f, SignatureState signatureState, StampState stampState, Function1 function1) {
        this.f$0 = f;
        this.f$1 = signatureState;
        this.f$2 = stampState;
        this.f$3 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier m276defaultMinSizeVpY3zN4$default;
        int i = this.$r8$classId;
        Function1 function1 = this.f$3;
        Object obj4 = this.f$2;
        float f = this.f$0;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                SignatureState signatureState = (SignatureState) obj5;
                StampState stampState = (StampState) obj4;
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(colors.component.button.prominent.icon.f161default, ArcadeThemeKt.LocalIconColor), Expect_jvmKt.rememberComposableLambda(-2019658996, new TrackRowKt$$ExternalSyntheticLambda5(f, signatureState, stampState, function1), composer), composer, 56);
                return Unit.INSTANCE;
            default:
                CardSchemeViewModel.Module.HeroCard heroCard = (CardSchemeViewModel.Module.HeroCard) obj5;
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    PrepurchaseCardData prepurchaseCardData = heroCard.prepurchaseCardData;
                    boolean z = (prepurchaseCardData != null ? prepurchaseCardData.toggle.position : null) instanceof PrepurchaseCardData.Toggle.Position.Standalone;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (z) {
                        gapComposer2.startReplaceGroup(1607696277);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        m276defaultMinSizeVpY3zN4$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1607805831);
                        gapComposer2.end(false);
                        m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, ((Dp) ComparisonsKt___ComparisonsJvmKt.minOf(new Dp(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM()), new Dp(f))).value / 1.0f, 1);
                    }
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m276defaultMinSizeVpY3zN4$default);
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
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-933485076, new WalletCardSchemeViewKt$$ExternalSyntheticLambda38(heroCard, function1, 0), gapComposer2), gapComposer2, 56);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda8(CardSchemeViewModel.Module.HeroCard heroCard, float f, RealImageLoader realImageLoader, Function1 function1) {
        this.f$1 = heroCard;
        this.f$0 = f;
        this.f$2 = realImageLoader;
        this.f$3 = function1;
    }
}
