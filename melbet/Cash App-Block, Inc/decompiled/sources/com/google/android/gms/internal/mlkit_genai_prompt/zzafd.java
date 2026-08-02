package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AccessibilityIterators$PageTextSegmentIterator;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewModel;
import com.squareup.cash.onboarding.views.MediaLoadState;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$complete$2;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzafd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    public static final void OnboardingLandingMedia(String str, String str2, RealImageLoader realImageLoader, Function1 function1, Function1 function12, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        int i2;
        boolean z;
        MutableState mutableState;
        Object obj;
        ?? r0;
        GapComposer gapComposer2;
        GapComposer gapComposer3;
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-593882731);
        int i3 = i | (gapComposer4.changed(str) ? 4 : 2) | (gapComposer4.changed(str2) ? 32 : 16) | (gapComposer4.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer4.changedInstance(function1) ? 2048 : 1024) | (gapComposer4.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer4.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            boolean booleanValue = ((Boolean) gapComposer4.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object rememberedValue = gapComposer4.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (z2 || rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(StringsKt.isBlank(str) ? MediaLoadState.Failed : MediaLoadState.Loading);
                gapComposer4.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            int i5 = i3 & 112;
            boolean z3 = i5 == 32;
            Object rememberedValue2 = gapComposer4.rememberedValue();
            if (z3 || rememberedValue2 == obj2) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer4.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            boolean changed = (i5 == 32) | gapComposer4.changed(booleanValue);
            Object rememberedValue3 = gapComposer4.rememberedValue();
            if (changed || rememberedValue3 == obj2) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline1.m(StringsKt.isBlank(str2) || booleanValue, gapComposer4);
            }
            MutableState mutableState4 = (MutableState) rememberedValue3;
            boolean z4 = ((MediaLoadState) mutableState2.getValue()) == MediaLoadState.Failed && ((Boolean) mutableState4.getValue()).booleanValue();
            boolean z5 = ((MediaLoadState) mutableState2.getValue()) == MediaLoadState.Loaded || ((Boolean) mutableState3.getValue()).booleanValue() || z4;
            Boolean valueOf = Boolean.valueOf(z5);
            boolean changed2 = ((i3 & 7168) == 2048) | gapComposer4.changed(z5);
            Object rememberedValue4 = gapComposer4.rememberedValue();
            if (changed2 || rememberedValue4 == obj2) {
                rememberedValue4 = new CardSchemePresenter$complete$2(3, null, function1, z5);
                gapComposer4.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer4, valueOf, (Function2) rememberedValue4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer4.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean isBlank = StringsKt.isBlank(str);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Crop;
            if (isBlank) {
                i2 = i3;
                z = booleanValue;
                GapComposer gapComposer5 = gapComposer4;
                mutableState = mutableState3;
                obj = obj2;
                r0 = 0;
                gapComposer5.startReplaceGroup(2046552999);
                gapComposer5.end(false);
                gapComposer2 = gapComposer5;
            } else {
                gapComposer4.startReplaceGroup(2046223190);
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                boolean changed3 = gapComposer4.changed(mutableState2);
                Object rememberedValue5 = gapComposer4.rememberedValue();
                if (changed3 || rememberedValue5 == obj2) {
                    rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda9(23, mutableState2);
                    gapComposer4.updateRememberedValue(rememberedValue5);
                }
                Function1 function13 = (Function1) rememberedValue5;
                boolean changed4 = gapComposer4.changed(mutableState2);
                Object rememberedValue6 = gapComposer4.rememberedValue();
                if (changed4 || rememberedValue6 == obj2) {
                    rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda9(24, mutableState2);
                    gapComposer4.updateRememberedValue(rememberedValue6);
                }
                Function1 function14 = (Function1) rememberedValue6;
                int i6 = i4 | 3120 | (i3 & 896);
                z = booleanValue;
                GapComposer gapComposer6 = gapComposer4;
                mutableState = mutableState3;
                obj = obj2;
                i2 = i3;
                r0 = 0;
                AsyncImageKt.m1440AsyncImagenc27qi8(str, realImageLoader, fillMaxSize, null, null, null, function13, function14, contentScale$Companion$Fit$1, gapComposer6, i6, 48, 62704);
                gapComposer6.end(false);
                gapComposer2 = gapComposer6;
            }
            if (StringsKt.isBlank(str2) || ((Boolean) mutableState4.getValue()).booleanValue() || z) {
                gapComposer2.startReplaceGroup(2046901191);
                gapComposer2.end(r0);
            } else {
                gapComposer2.startReplaceGroup(2046629228);
                boolean changed5 = gapComposer2.changed(mutableState);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (changed5 || rememberedValue7 == obj) {
                    rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda9(25, mutableState);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                Function1 function15 = (Function1) rememberedValue7;
                boolean changed6 = gapComposer2.changed(mutableState4);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changed6 || rememberedValue8 == obj) {
                    rememberedValue8 = new OverlayKt$$ExternalSyntheticLambda1(5, mutableState4);
                    gapComposer2.updateRememberedValue(rememberedValue8);
                }
                VideoBackground(str2, function15, function12, (Function0) rememberedValue8, AlphaKt.alpha(SizeKt.fillMaxSize(companion, 1.0f), ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE), gapComposer2, ((i2 >> 3) & 14) | ((i2 >> 6) & 896));
                gapComposer2.end(r0);
            }
            if (z4) {
                gapComposer2.startReplaceGroup(2046942390);
                Composer composer2 = gapComposer2;
                ImageKt.Image(Countries.painterResource(R.drawable.onboarding_landing_fallback, r0, gapComposer2), null, SizeKt.fillMaxSize(companion, 1.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, composer2, Painter.$stable | 25008, 104);
                GapComposer gapComposer7 = composer2;
                gapComposer7.end(r0);
                gapComposer3 = gapComposer7;
            } else {
                gapComposer2.startReplaceGroup(2047149191);
                gapComposer2.end(r0);
                gapComposer3 = gapComposer2;
            }
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            GapComposer gapComposer8 = gapComposer4;
            gapComposer8.skipToGroupEnd();
            gapComposer = gapComposer8;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(str, str2, realImageLoader, function1, function12, modifier, i);
        }
    }

    public static final void OnboardingLandingView(OnboardingLandingViewModel onboardingLandingViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        onboardingLandingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1650114804);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(onboardingLandingViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changed = gapComposer2.changed(onboardingLandingViewModel.placeholderImageUrl) | gapComposer2.changed(onboardingLandingViewModel.videoUrl);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Long.valueOf(SystemClock.elapsedRealtime());
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            long longValue = ((Number) rememberedValue2).longValue();
            Colors colors = ColorsDarkKt.colorsDark;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2010435063, new DateFilterChipKt$$ExternalSyntheticLambda0(onboardingLandingViewModel, realImageLoader, mutableState, function1, longValue), gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(colors, null, null, rememberComposableLambda, gapComposer, 3072, 6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(onboardingLandingViewModel, function1, realImageLoader, i, 6);
        }
    }

    public static final void VideoBackground(final String str, final Function1 function1, final Function1 function12, final Function0 function0, final Modifier modifier, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        MutableState mutableState;
        int i3;
        LifecycleOwner lifecycleOwner;
        final String str2 = str;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1421882425);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object obj = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer2);
            Object rememberUpdatedState2 = Updater.rememberUpdatedState(function12, gapComposer2);
            int i4 = i2 >> 9;
            Object rememberUpdatedState3 = Updater.rememberUpdatedState(function0, gapComposer2);
            int i5 = i2 & 14;
            boolean z = i5 == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (z || rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Object obj3 = (MutableState) rememberedValue;
            boolean z2 = i5 == 4;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == obj2) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            boolean changed = gapComposer2.changed(rememberUpdatedState) | gapComposer2.changedInstance(obj) | gapComposer2.changed(rememberUpdatedState3) | gapComposer2.changed(obj3) | gapComposer2.changed(rememberUpdatedState2) | (i5 == 4) | gapComposer2.changed(mutableState2);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == obj2) {
                mutableState = mutableState2;
                i3 = i5;
                lifecycleOwner = null;
                rememberedValue3 = new SliderKt$$ExternalSyntheticLambda4(obj, rememberUpdatedState, rememberUpdatedState3, obj3, rememberUpdatedState2, str2, mutableState, 4);
                str2 = str2;
                gapComposer2.updateRememberedValue(rememberedValue3);
            } else {
                mutableState = mutableState2;
                i3 = i5;
                lifecycleOwner = null;
            }
            DimensionKt.LifecycleStartEffect(str2, lifecycleOwner, (Function1) rememberedValue3, gapComposer2, i3);
            final ExoPlayer exoPlayer = (ExoPlayer) mutableState.getValue();
            if (exoPlayer == null) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i6 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.onboarding.views.OnboardingLandingViewKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i6) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    zzafd.VideoBackground(str2, function1, function12, function0, modifier, (Composer) obj4, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    zzafd.VideoBackground(str2, function1, function12, function0, modifier, (Composer) obj4, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            boolean changedInstance = gapComposer2.changedInstance(exoPlayer);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == obj2) {
                final int i7 = 0;
                rememberedValue4 = new Function1() { // from class: com.squareup.cash.onboarding.views.OnboardingLandingViewKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i8 = i7;
                        ExoPlayer exoPlayer2 = exoPlayer;
                        switch (i8) {
                            case 0:
                                Context context = (Context) obj4;
                                context.getClass();
                                PlayerView playerView = new PlayerView(context);
                                playerView.setPlayer(exoPlayer2);
                                playerView.setUseController(false);
                                playerView.setResizeMode(4);
                                playerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                return playerView;
                            default:
                                PlayerView playerView2 = (PlayerView) obj4;
                                playerView2.getClass();
                                playerView2.setPlayer(exoPlayer2);
                                return Unit.INSTANCE;
                        }
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Function1 function13 = (Function1) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj2) {
                rememberedValue5 = new OffersStyledTextKt$$ExternalSyntheticLambda0(21);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            Function1 function14 = (Function1) rememberedValue5;
            boolean changedInstance2 = gapComposer2.changedInstance(exoPlayer);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue6 == obj2) {
                final int i8 = 1;
                rememberedValue6 = new Function1() { // from class: com.squareup.cash.onboarding.views.OnboardingLandingViewKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i82 = i8;
                        ExoPlayer exoPlayer2 = exoPlayer;
                        switch (i82) {
                            case 0:
                                Context context = (Context) obj4;
                                context.getClass();
                                PlayerView playerView = new PlayerView(context);
                                playerView.setPlayer(exoPlayer2);
                                playerView.setUseController(false);
                                playerView.setResizeMode(4);
                                playerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                return playerView;
                            default:
                                PlayerView playerView2 = (PlayerView) obj4;
                                playerView2.getClass();
                                playerView2.setPlayer(exoPlayer2);
                                return Unit.INSTANCE;
                        }
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            gapComposer = gapComposer2;
            AndroidView_androidKt.AndroidView(function13, modifier, null, function14, (Function1) rememberedValue6, gapComposer, (i4 & 112) | 3072, 4);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i9 = 1;
            function2 = new Function2() { // from class: com.squareup.cash.onboarding.views.OnboardingLandingViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    switch (i9) {
                        case 0:
                            ((Integer) obj5).getClass();
                            zzafd.VideoBackground(str, function1, function12, function0, modifier, (Composer) obj4, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            zzafd.VideoBackground(str, function1, function12, function0, modifier, (Composer) obj4, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static AccessibilityIterators$PageTextSegmentIterator getInstance() {
        if (AccessibilityIterators$PageTextSegmentIterator.pageInstance == null) {
            AccessibilityIterators$PageTextSegmentIterator accessibilityIterators$PageTextSegmentIterator = new AccessibilityIterators$PageTextSegmentIterator(4, false);
            new Rect();
            AccessibilityIterators$PageTextSegmentIterator.pageInstance = accessibilityIterators$PageTextSegmentIterator;
        }
        AccessibilityIterators$PageTextSegmentIterator accessibilityIterators$PageTextSegmentIterator2 = AccessibilityIterators$PageTextSegmentIterator.pageInstance;
        accessibilityIterators$PageTextSegmentIterator2.getClass();
        return accessibilityIterators$PageTextSegmentIterator2;
    }

    public static Money withCurrencyOrDefault(Money money, CurrencyCode currencyCode, long j) {
        if (money == null) {
            return Money.copy$default(Moneys.zero(currencyCode), Long.valueOf(j), null, null, 6);
        }
        Long l = money.amount;
        if (l != null) {
            j = l.longValue();
        }
        return Money.copy$default(money, Long.valueOf(j), currencyCode, null, 4);
    }
}
