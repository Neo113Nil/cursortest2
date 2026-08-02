package com.squareup.cash.moneybot.views.home;

import android.content.Context;
import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.components.api.LocalMoneybotPluginRegistryKt;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.moneybot.views.menu.DropdownItem;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotAnimationsEnabledKt;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotSlotContentAnimationsReadyKt;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import com.squareup.util.Strings;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda2;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class MoneybotHomeViewKt {

    /* renamed from: lambda$-148184632, reason: not valid java name */
    public static final ComposableLambdaImpl f482lambda$148184632 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(20), false, -148184632);

    /* renamed from: lambda$-616870946, reason: not valid java name */
    public static final ComposableLambdaImpl f484lambda$616870946 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(17), false, -616870946);
    public static final ComposableLambdaImpl lambda$1016254494 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(18), false, 1016254494);

    /* renamed from: lambda$-428757732, reason: not valid java name */
    public static final ComposableLambdaImpl f483lambda$428757732 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(21), false, -428757732);

    static {
        new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(22), false, -1414989732);
    }

    public static final void ChatInputWithOverlay(int i, Composer composer, Modifier modifier, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2080797535);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(292681730, new MoneyTabUIKt$$ExternalSyntheticLambda11(5, (Object) modifier, (Object) function1), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotChatViewKt$$ExternalSyntheticLambda24(modifier, function1, i, 3);
        }
    }

    public static final void HomeErrorNotice(int i, Composer composer, Modifier modifier, Function0 function0) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-451839527);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            String stringResource = Room.stringResource(gapComposer, R.string.moneybot_home_error_title);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f));
            coil3.size.SizeKt.ButtonCta(function0, null, ButtonProminence.STANDARD, false, false, null, lambda$1016254494, gapComposer, (i2 & 14) | 1573248, 58);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function0, modifier, i, 7);
        }
    }

    public static final void MoneybotHomeScaffold(Modifier modifier, LazyListState lazyListState, PaddingValuesImpl paddingValuesImpl, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function2 function2, ComposableLambdaImpl composableLambdaImpl3, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-807680447);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(lazyListState) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            OffsetKt.BoxWithConstraints(SizeKt.fillMaxSize(modifier, 1.0f), null, false, Expect_jvmKt.rememberComposableLambda(-106954217, new StripeImageKt$$ExternalSyntheticLambda2(composableLambdaImpl3, composableLambdaImpl, composableLambdaImpl2, function2, paddingValuesImpl, lazyListState, function1), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(modifier, (Object) lazyListState, (Object) paddingValuesImpl, (Function) composableLambdaImpl, (Function) composableLambdaImpl2, (Function) function2, (Function) composableLambdaImpl3, function1, i, 10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r13.length() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MoneybotHomeView(final MoneybotHomeViewModel moneybotHomeViewModel, final RealImageLoader realImageLoader, Function1 function1, final ClientRenderablePluginRegistry clientRenderablePluginRegistry, LazyListState lazyListState, boolean z, Composer composer, int i) {
        int i2;
        Function1 function12;
        final boolean z2;
        GapComposer gapComposer;
        LazyListState lazyListState2;
        final LazyListState rememberLazyListState;
        final ParticleGridRenderer particleGridRenderer;
        String str;
        State state;
        moneybotHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1440555167);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(moneybotHomeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(realImageLoader) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function12 = function1;
            i2 |= gapComposer2.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer2.changed(clientRenderablePluginRegistry) : gapComposer2.changedInstance(clientRenderablePluginRegistry) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= gapComposer2.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            z2 = z;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            } else {
                gapComposer2.skipToGroupEnd();
                rememberLazyListState = lazyListState;
            }
            gapComposer2.endDefaults();
            boolean showCanvasBackground = moneybotHomeViewModel.getShowCanvasBackground();
            long j = MoneybotTheme.getColors(gapComposer2).canvas.glyph.f477default;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (showCanvasBackground) {
                gapComposer2.startReplaceGroup(-265323719);
                GridStyle gridStyle = GridStyle.GLYPH;
                Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                Lifecycle lifecycle = ((LifecycleOwner) gapComposer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                boolean changed = gapComposer2.changed(j);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ParticleGridRenderer(context, gridStyle, j);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                ParticleGridRenderer particleGridRenderer2 = (ParticleGridRenderer) rememberedValue;
                boolean changedInstance = gapComposer2.changedInstance(lifecycle) | gapComposer2.changedInstance(particleGridRenderer2);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new MusicViewKt$$ExternalSyntheticLambda6(12, lifecycle, particleGridRenderer2);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Updater.DisposableEffect(lifecycle, particleGridRenderer2, (Function1) rememberedValue2, gapComposer2);
                gapComposer2.end(false);
                particleGridRenderer = particleGridRenderer2;
            } else {
                gapComposer2.startReplaceGroup(-265217265);
                gapComposer2.end(false);
                particleGridRenderer = null;
            }
            final boolean booleanValue = ((Boolean) gapComposer2.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled)).booleanValue();
            final Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            float f = ((Configuration) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp * 1.5f;
            boolean changed2 = gapComposer2.changed(f);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = AnimatableKt.Animatable(f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            final Animatable animatable = (Animatable) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new LinkedHashSet();
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            final Set set = (Set) rememberedValue4;
            MoneybotHomeViewModel.Content content = moneybotHomeViewModel instanceof MoneybotHomeViewModel.Content ? (MoneybotHomeViewModel.Content) moneybotHomeViewModel : null;
            if (content != null) {
                str = content.homeSessionId;
            }
            str = null;
            boolean changed3 = gapComposer2.changed(showCanvasBackground);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = Updater.derivedStateOf(new MoneybotHomeViewKt$$ExternalSyntheticLambda0(showCanvasBackground, rememberLazyListState, 0));
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            State state2 = (State) rememberedValue5;
            MoneybotColors colors = MoneybotTheme.getColors(gapComposer2);
            Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                state = state2;
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                state = state2;
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            MoneybotColors moneybotColors = new MoneybotColors(new MoneybotColors.Card(colors2.isLight ? MoneybotColorsKt.LightHomeCardBackground : MoneybotColorsKt.DarkCardBackground), colors.composer, colors.pill, colors.suggestion, colors.canvas);
            final Function1 function13 = function12;
            final String str2 = str;
            final State state3 = state;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1492616246, new Function2() { // from class: com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Updater.CompositionLocalProvider(new ProvidedValue[]{LocalMoneybotPluginRegistryKt.LocalMoneybotPluginRegistry.defaultProvidedValue$runtime(ClientRenderablePluginRegistry.this), LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalMoneybotSlotContentAnimationsReadyKt.LocalMoneybotSlotContentAnimationResetKey.defaultProvidedValue$runtime(str2)}, Expect_jvmKt.rememberComposableLambda(925095798, new MoneybotHomeViewKt$$ExternalSyntheticLambda3(function13, z2, moneybotHomeViewModel, particleGridRenderer, rememberLazyListState, booleanValue, density, animatable, set, state3), gapComposer3), gapComposer3, 56);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            gapComposer = gapComposer2;
            MoneybotThemeKt.MoneybotTheme(null, moneybotColors, rememberComposableLambda, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
            lazyListState2 = rememberLazyListState;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            lazyListState2 = lazyListState;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(moneybotHomeViewModel, realImageLoader, function1, clientRenderablePluginRegistry, lazyListState2, z, i, 9);
        }
    }

    public static final void MoneybotParticleGrid(ParticleGridRenderer particleGridRenderer, Modifier modifier, Composer composer, int i) {
        particleGridRenderer.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(368281598);
        int i2 = (gapComposer.changedInstance(particleGridRenderer) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(modifier, 1.0f), 1.0f);
            boolean changedInstance = gapComposer.changedInstance(particleGridRenderer);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Overlay$$ExternalSyntheticLambda0(particleGridRenderer, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AndroidView_androidKt.AndroidView((Function1) rememberedValue, fillMaxHeight, null, gapComposer, 0, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(particleGridRenderer, modifier, i, 5);
        }
    }

    /* renamed from: NextBestAction-DzVHIIc, reason: not valid java name */
    public static final void m3630NextBestActionDzVHIIc(final Loadable loadable, final float f, final Function1 function1, final boolean z, final Function1 function12, Composer composer, final int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1086505190);
        int i2 = i | (gapComposer.changedInstance(loadable) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024) | (gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda24(z, 11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedContent(loadable, null, (Function1) rememberedValue, null, null, null, Expect_jvmKt.rememberComposableLambda(892914529, new Function4() { // from class: com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Loadable loadable2 = (Loadable) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Integer) obj4).getClass();
                    ((AnimatedContentScopeImpl) obj).getClass();
                    loadable2.getClass();
                    boolean z3 = loadable2 instanceof Loadable.Loading;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    float f2 = f;
                    if (z3) {
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        gapComposer2.startReplaceGroup(2084333204);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), f2 - 12.0f));
                        gapComposer2.end(false);
                    } else if (loadable2 instanceof Loadable.Loaded) {
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        gapComposer3.startReplaceGroup(2084481694);
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), f2 - 12.0f);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m277height3ABfNKs);
                        ComposeUiNode.Companion.getClass();
                        Function0 function0 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer3.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(function0);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        MoneybotHomeViewModel.NextBestAction nextBestAction = (MoneybotHomeViewModel.NextBestAction) ((Loadable.Loaded) loadable2).value;
                        if (nextBestAction == null) {
                            gapComposer3.startReplaceGroup(1156384566);
                            gapComposer3.end(false);
                        } else {
                            re$$ExternalSyntheticOutline0.m(gapComposer3, 1156384567, companion, 24.0f, gapComposer3);
                            Function1 function13 = function12;
                            boolean changed = gapComposer3.changed(function13) | gapComposer3.changedInstance(nextBestAction);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            if (changed || rememberedValue2 == Composer.Companion.Empty) {
                                rememberedValue2 = new MoneybotHomeViewKt$$ExternalSyntheticLambda34(function13, nextBestAction, 0);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            MoneybotHomeViewKt.NextBestActionCard(nextBestAction, z, function1, (Function0) rememberedValue2, gapComposer3, 0);
                            SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f, true));
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(true);
                        gapComposer3.end(false);
                    } else {
                        if (!(loadable2 instanceof Loadable.Failed)) {
                            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer2, -902595616, false);
                        }
                        GapComposer gapComposer4 = (GapComposer) composer2;
                        gapComposer4.startReplaceGroup(2084974687);
                        gapComposer4.end(false);
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, (i2 & 14) | 1572864, 58);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(f, function1, z, function12, i) { // from class: com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda28
                public final /* synthetic */ float f$1;
                public final /* synthetic */ Function1 f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ Function1 f$4;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    MoneybotHomeViewKt.m3630NextBestActionDzVHIIc(Loadable.this, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void NextBestActionCard(MoneybotHomeViewModel.NextBestAction nextBestAction, boolean z, Function1 function1, Function0 function0, Composer composer, int i) {
        MoneybotHomeViewModel.NextBestAction nextBestAction2;
        nextBestAction.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1265470182);
        int i2 = i | (gapComposer.changedInstance(nextBestAction) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            MoneybotHomeViewEvent.NbaViewed nbaViewed = nextBestAction.viewedEvent;
            String str = nextBestAction.subtitle;
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(nextBestAction);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            Continuation continuation = null;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new GenieViewKt$GenieView$1$1(nextBestAction, function1, continuation, 20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, nbaViewed, (Function2) rememberedValue);
            boolean z2 = ((Boolean) gapComposer.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled)).booleanValue() && z;
            boolean changed = gapComposer.changed(nextBestAction) | gapComposer.changed(z2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(!z2, gapComposer);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            gapComposer.startReplaceGroup(641113501);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            boolean z3 = z2;
            int pushStyle = builder.pushStyle(new SpanStyle(Strings.getColors(gapComposer).semantic.text.subtle, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
            try {
                builder.append(nextBestAction.title);
                if (str == null || StringsKt.isBlank(str)) {
                    gapComposer.startReplaceGroup(-1051473315);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1051612660);
                    builder.append("\n");
                    pushStyle = builder.pushStyle(new SpanStyle(Strings.getColors(gapComposer).semantic.text.standard, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                    try {
                        builder.append((CharSequence) str);
                        builder.pop(pushStyle);
                        gapComposer.end(false);
                    } finally {
                    }
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer.end(false);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                TextStyle textStyle = Strings.getTypography(gapComposer).headlineSmall;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 0.85f);
                boolean changed2 = gapComposer.changed(mutableState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == obj) {
                    rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda2(25, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                LazyGridDslKt.m314BaselineFlowhkzSW1g(annotatedString, textStyle, fillMaxWidth2, 0L, (TextMeasurer) null, (String) null, z3, 0L, (Function0) rememberedValue3, function0, gapComposer, ((i2 << 18) & 1879048192) | MLKEMEngine.KyberPolyBytes, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                gapComposer = gapComposer;
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 24.0f));
                int mo230roundToPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(12.0f);
                SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 80.0f, null, 4);
                SpringSpec spring$default2 = AnimatableKt.spring$default(1.0f, 80.0f, null, 4);
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(spring$default, 2);
                boolean changed3 = gapComposer.changed(mo230roundToPx0680j_4);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue4 == obj) {
                    rememberedValue4 = new DatePickerKt$$ExternalSyntheticLambda10(mo230roundToPx0680j_4, 2);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                nextBestAction2 = nextBestAction;
                AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, booleanValue, null, fadeIn$default.plus(EnterExitTransitionKt.slideInVertically(spring$default2, (Function1) rememberedValue4)), EnterExitTransitionKt.fadeOut$default(null, 3), null, Expect_jvmKt.rememberComposableLambda(1100236212, new NextBestActionCardKt$$ExternalSyntheticLambda1(function1, nextBestAction2, 0), gapComposer), gapComposer, 1597446, 18);
                gapComposer.end(true);
            } finally {
            }
        } else {
            nextBestAction2 = nextBestAction;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(nextBestAction2, z, function1, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WidgetCard(Modifier modifier, final MoneybotHomeViewModel.WidgetCard widgetCard, final Function1 function1, boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        GapComposer gapComposer;
        final Modifier modifier3;
        final boolean z3;
        RecomposeScopeImpl recomposeScopeImpl;
        Function2 function2;
        List list;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1734498587);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        }
        int i5 = i3 | (gapComposer2.changedInstance(widgetCard) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i5 |= gapComposer2.changed(z2) ? 2048 : 1024;
            if (!gapComposer2.shouldExecute(i5 & 1, (i5 & 1171) == 1170)) {
                Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                boolean z4 = i6 != 0 ? false : z2;
                Unit unit = Unit.INSTANCE;
                int i7 = i5 & 896;
                boolean changedInstance = gapComposer2.changedInstance(widgetCard) | (i7 == 256);
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new GenieViewKt$GenieView$1$1(widgetCard, function1, null, 19);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
                ClientRenderablePluginRegistry clientRenderablePluginRegistry = (ClientRenderablePluginRegistry) gapComposer2.consume(LocalMoneybotPluginRegistryKt.LocalMoneybotPluginRegistry);
                if (clientRenderablePluginRegistry != null) {
                    ClientRenderType clientRenderType = widgetCard.renderType;
                    clientRenderType.getClass();
                    ClientRenderablePlugin clientRenderablePlugin = (ClientRenderablePlugin) clientRenderablePluginRegistry.plugins.get(clientRenderType);
                    if (clientRenderablePlugin != null) {
                        boolean z5 = widgetCard.deleteAction != null;
                        String stringResource = Room.stringResource(gapComposer2, R.string.moneybot_home_widget_context_menu_delete_label);
                        String stringResource2 = Room.stringResource(gapComposer2, R.string.moneybot_home_widget_focus_options_accessibility_label);
                        boolean changed = gapComposer2.changed(widgetCard.lazyColumnKey);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(z4, gapComposer2);
                        }
                        MutableState mutableState = (MutableState) rememberedValue2;
                        if (z5) {
                            gapComposer2.startReplaceGroup(304903025);
                            Icons icons = Icons.Clear16;
                            boolean changedInstance2 = gapComposer2.changedInstance(widgetCard) | (i7 == 256);
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = new MoneybotHomeViewKt$$ExternalSyntheticLambda20(widgetCard, function1, 0);
                                gapComposer2.updateRememberedValue(rememberedValue3);
                            }
                            list = CollectionsKt__CollectionsJVMKt.listOf(new DropdownItem(R.string.moneybot_home_widget_context_menu_delete_label, icons, (Function0) rememberedValue3, 4));
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(305136548);
                            gapComposer2.end(false);
                            list = EmptyList.INSTANCE;
                        }
                        OffsetKt.BoxWithConstraints(SizeKt.fillMaxWidth(modifier4, 1.0f), null, false, Expect_jvmKt.rememberComposableLambda(1822812111, new HomeViewKt$$ExternalSyntheticLambda0(clientRenderablePlugin, z5, mutableState, stringResource2, widgetCard, function1, stringResource, list), gapComposer2), gapComposer2, 3072, 6);
                        gapComposer = gapComposer2;
                        modifier3 = modifier4;
                        z3 = z4;
                    }
                }
                recomposeScopeImpl = gapComposer2.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    final int i8 = 0;
                    final Modifier modifier5 = modifier4;
                    final boolean z6 = z4;
                    function2 = new Function2() { // from class: com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    MoneybotHomeViewKt.WidgetCard(modifier5, widgetCard, function1, z6, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    MoneybotHomeViewKt.WidgetCard(modifier5, widgetCard, function1, z6, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    recomposeScopeImpl.block = function2;
                    return;
                }
                return;
            }
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
            z3 = z2;
            recomposeScopeImpl = gapComposer.endRestartGroup();
            if (recomposeScopeImpl == null) {
                final int i9 = 1;
                function2 = new Function2() { // from class: com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i9) {
                            case 0:
                                ((Integer) obj2).getClass();
                                MoneybotHomeViewKt.WidgetCard(modifier3, widgetCard, function1, z3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                MoneybotHomeViewKt.WidgetCard(modifier3, widgetCard, function1, z3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                recomposeScopeImpl.block = function2;
                return;
            }
            return;
        }
        z2 = z;
        if (!gapComposer2.shouldExecute(i5 & 1, (i5 & 1171) == 1170)) {
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl == null) {
        }
    }
}
