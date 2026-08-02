package com.squareup.cash.arcade.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.ScaleToBoundsImpl;
import androidx.compose.animation.SharedBoundsNode$$ExternalSyntheticLambda0;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DateInputKt$DateInputTextField$4$1;
import androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.emoji2.text.MetadataRepo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class SearchBarKt {
    public static final PaddingValuesImpl DefaultInternalPadding = new PaddingValuesImpl(16.0f, 8.0f, 16.0f, 8.0f);

    public static final void InternalSearchBar(ComposableLambdaImpl composableLambdaImpl, final Function0 function0, final Function0 function02, String str, final SearchBarKeyboardState searchBarKeyboardState, Modifier modifier, PaddingValues paddingValues, final ShowNavigationBack showNavigationBack, final Function0 function03, final Function0 function04, final String str2, final Function0 function05, boolean z, final MetadataRepo metadataRepo, Composer composer, int i, int i2) {
        ComposableLambdaImpl composableLambdaImpl2;
        int i3;
        String str3;
        int i4;
        boolean z2;
        GapComposer gapComposer;
        boolean z3;
        boolean z4;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(16423194);
        if ((i & 6) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i3 = (gapComposer2.changedInstance(composableLambdaImpl2) ? 4 : 2) | i;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str3 = str;
            i3 |= gapComposer2.changed(str3) ? 2048 : 1024;
        } else {
            str3 = str;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changed(searchBarKeyboardState) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer2.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer2.changed(paddingValues) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changed(showNavigationBack == null ? -1 : showNavigationBack.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer2.changedInstance(function03) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changedInstance(function04) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(str2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function05) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i4 |= gapComposer2.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changedInstance(metadataRepo) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalSoftwareKeyboardController;
            final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(staticProvidableCompositionLocal);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            final FocusRequester focusRequester = (FocusRequester) rememberedValue;
            final FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            LayoutDirection layoutDirection = (LayoutDirection) gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection);
            final float calculateStartPadding = SpacerKt.calculateStartPadding(paddingValues, layoutDirection);
            final boolean z5 = function04 == null;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(SizeKt.m276defaultMinSizeVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 52.0f, 1), 1.0f), RecyclerView.DECELERATION_RATE, paddingValues.mo267calculateTopPaddingD9Ej5fM(), SpacerKt.calculateEndPadding(paddingValues, layoutDirection), paddingValues.mo264calculateBottomPaddingD9Ej5fM(), 1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
            int ordinal = showNavigationBack.ordinal();
            if (ordinal == 0) {
                z3 = false;
            } else if (ordinal == 1) {
                z3 = ((Boolean) searchBarKeyboardState.open$delegate.getValue()).booleanValue();
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                z3 = true;
            }
            final boolean z6 = z2;
            AnimatedContentKt.AnimatedVisibility(z3, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-340457476, new Function3() { // from class: com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ((AnimatedVisibilityScope) obj).getClass();
                    GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer3, 432, 9);
                    String stringResource = Room.stringResource(gapComposer3, R.string.search_bar_cancel_description);
                    Role role = new Role(0);
                    FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                    boolean changedInstance = gapComposer3.changedInstance(focusOwnerImpl2);
                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
                    boolean changed = changedInstance | gapComposer3.changed(delegatingSoftwareKeyboardController2);
                    Function0 function06 = function03;
                    boolean changed2 = changed | gapComposer3.changed(function06);
                    boolean z7 = z6;
                    boolean changed3 = changed2 | gapComposer3.changed(z7);
                    Function0 function07 = function0;
                    boolean changed4 = changed3 | gapComposer3.changed(function07);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue3 == neverEqualPolicy2) {
                        rememberedValue3 = new ModalBottomSheetKt$$ExternalSyntheticLambda1(focusOwnerImpl2, delegatingSoftwareKeyboardController2, function06, z7, function07);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Trace.m1191Iconww6aTOc(Icons.NavigationPopBack, (String) null, SpacerKt.m302paddingqDBjuR0$default(ImageKt.m181clickableO2vRcR0(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl, m3400rippleYJYuY3k, z5, stringResource, role, (Function0) rememberedValue3), calculateStartPadding, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 10), 0L, gapComposer3, 54, 8);
                    return Unit.INSTANCE;
                }
            }, gapComposer2), (Composer) gapComposer2, 200064, 18);
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            final RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            final MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            final float f = calculateStartPadding + 32.0f;
            ProvidedValue[] providedValueArr = {ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer2).input), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer2).component.searchField.text, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer2).component.searchField.icon.f215default, ArcadeThemeKt.LocalIconColor), RippleKt.LocalRippleConfiguration.defaultProvidedValue$runtime(UtilsKt.inputRippleConfiguration(((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer2, 6).getValue()).booleanValue(), gapComposer2))};
            final String str4 = str3;
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            gapComposer = gapComposer2;
            Updater.CompositionLocalProvider(providedValueArr, Expect_jvmKt.rememberComposableLambda(-950835436, new Function2() { // from class: com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda5
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0042, code lost:
                
                    if (((java.lang.Boolean) r2.open$delegate.getValue()).booleanValue() != false) goto L17;
                 */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj2, Object obj3) {
                    float f2;
                    Modifier modifier2;
                    MetadataRepo metadataRepo2;
                    Colors colors;
                    boolean changed;
                    Object rememberedValue3;
                    boolean changed2;
                    Object rememberedValue4;
                    SharedTransitionScope sharedTransitionScope;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        int ordinal2 = ShowNavigationBack.this.ordinal();
                        SearchBarKeyboardState searchBarKeyboardState2 = searchBarKeyboardState;
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                            }
                            f2 = f;
                            State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(f2, null, "search bar padding", null, gapComposer3, MLKEMEngine.KyberPolyBytes, 10);
                            modifier2 = Modifier.Companion.$$INSTANCE;
                            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(modifier2, 1.0f), 36.0f, RecyclerView.DECELERATION_RATE, 2), ((Dp) m155animateDpAsStateAjpBEmI.getValue()).value, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                            gapComposer3.startReplaceGroup(1580002080);
                            metadataRepo2 = metadataRepo;
                            Shape shape = m340RoundedCornerShape0680j_4;
                            Object obj4 = Composer.Companion.Empty;
                            if (metadataRepo2 != null) {
                                gapComposer3.end(false);
                            } else {
                                Modifier modifier3 = m302paddingqDBjuR0$default2;
                                for (Object obj5 : (ArrayList) metadataRepo2.mRootNode) {
                                    gapComposer3.startReplaceGroup(-2036416545);
                                    SharedTransitionScope sharedTransitionScope2 = (SharedTransitionScope) metadataRepo2.mEmojiCharArray;
                                    SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope2.rememberSharedContentState(obj5, gapComposer3, 0);
                                    AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) metadataRepo2.mMetadataList;
                                    ScaleToBoundsImpl scaleToBounds$default = RemeasureImpl.scaleToBounds$default(SharedTransitionScope.ResizeMode.Companion, ContentScale.Companion.Crop);
                                    SharedTransitionScope.OverlayClip OverlayClip = sharedTransitionScope2.OverlayClip(shape);
                                    Object rememberedValue5 = gapComposer3.rememberedValue();
                                    if (rememberedValue5 == obj4) {
                                        rememberedValue5 = new SharedBoundsNode$$ExternalSyntheticLambda0(4);
                                        gapComposer3.updateRememberedValue(rememberedValue5);
                                    }
                                    modifier3 = SharedTransitionScope.sharedBounds$default(sharedTransitionScope2, modifier3, rememberSharedContentState, animatedVisibilityScope, null, null, (BoundsTransform) rememberedValue5, scaleToBounds$default, OverlayClip, 460);
                                    gapComposer3.end(false);
                                }
                                gapComposer3.end(false);
                                m302paddingqDBjuR0$default2 = modifier3;
                            }
                            colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors != null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(m302paddingqDBjuR0$default2, colors.component.searchField.background.f214default, shape), shape);
                            if (metadataRepo2 != null && (sharedTransitionScope = (SharedTransitionScope) metadataRepo2.mEmojiCharArray) != null && sharedTransitionScope.isTransitionActive()) {
                                modifier2 = AnimatedVisibilityScope.animateEnterExit$default((AnimatedVisibilityScope) metadataRepo2.mMetadataList, modifier2, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(0, 360, null, 5), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.snap$default(), 2), 4);
                            }
                            Modifier then = clip.then(modifier2);
                            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer3, 0, 15);
                            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                            Modifier focusRequester2 = FocusTraversalKt.focusRequester(IndicationKt.indication(then, mutableInteractionSourceImpl2, m3400rippleYJYuY3k), focusRequester);
                            changed = gapComposer3.changed(searchBarKeyboardState2);
                            rememberedValue3 = gapComposer3.rememberedValue();
                            if (!changed || rememberedValue3 == obj4) {
                                rememberedValue3 = new ContextKt$$ExternalSyntheticLambda1(searchBarKeyboardState2, 26);
                                gapComposer3.updateRememberedValue(rememberedValue3);
                            }
                            Modifier onFocusChanged = FocusOwnerImplKt.onFocusChanged(focusRequester2, (Function1) rememberedValue3);
                            Function0 function06 = function04;
                            changed2 = gapComposer3.changed(function06);
                            rememberedValue4 = gapComposer3.rememberedValue();
                            if (!changed2 || rememberedValue4 == obj4) {
                                rememberedValue4 = new LocalMapKt$$ExternalSyntheticLambda10(14, function06);
                                gapComposer3.updateRememberedValue(rememberedValue4);
                            }
                            composableLambdaImpl3.invoke((Object) mutableInteractionSourceImpl2, new SearchBarKt$InternalSearchBar$1$2$decorator$1(function06, str2, metadataRepo2, function02, str4, function0, function05), SemanticsModifierKt.semantics(onFocusChanged, false, (Function1) rememberedValue4), (Object) gapComposer3, (Object) 6);
                        }
                        f2 = calculateStartPadding;
                        State m155animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(f2, null, "search bar padding", null, gapComposer3, MLKEMEngine.KyberPolyBytes, 10);
                        modifier2 = Modifier.Companion.$$INSTANCE;
                        Modifier m302paddingqDBjuR0$default22 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(modifier2, 1.0f), 36.0f, RecyclerView.DECELERATION_RATE, 2), ((Dp) m155animateDpAsStateAjpBEmI2.getValue()).value, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                        gapComposer3.startReplaceGroup(1580002080);
                        metadataRepo2 = metadataRepo;
                        Shape shape2 = m340RoundedCornerShape0680j_4;
                        Object obj42 = Composer.Companion.Empty;
                        if (metadataRepo2 != null) {
                        }
                        colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors != null) {
                        }
                        Modifier clip2 = ClipKt.clip(ImageKt.m177backgroundbw27NRU(m302paddingqDBjuR0$default22, colors.component.searchField.background.f214default, shape2), shape2);
                        if (metadataRepo2 != null) {
                            modifier2 = AnimatedVisibilityScope.animateEnterExit$default((AnimatedVisibilityScope) metadataRepo2.mMetadataList, modifier2, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(0, 360, null, 5), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.snap$default(), 2), 4);
                        }
                        Modifier then2 = clip2.then(modifier2);
                        RippleNodeFactory m3400rippleYJYuY3k2 = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer3, 0, 15);
                        MutableInteractionSourceImpl mutableInteractionSourceImpl22 = mutableInteractionSourceImpl;
                        Modifier focusRequester22 = FocusTraversalKt.focusRequester(IndicationKt.indication(then2, mutableInteractionSourceImpl22, m3400rippleYJYuY3k2), focusRequester);
                        changed = gapComposer3.changed(searchBarKeyboardState2);
                        rememberedValue3 = gapComposer3.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue3 = new ContextKt$$ExternalSyntheticLambda1(searchBarKeyboardState2, 26);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                        Modifier onFocusChanged2 = FocusOwnerImplKt.onFocusChanged(focusRequester22, (Function1) rememberedValue3);
                        Function0 function062 = function04;
                        changed2 = gapComposer3.changed(function062);
                        rememberedValue4 = gapComposer3.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue4 = new LocalMapKt$$ExternalSyntheticLambda10(14, function062);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                        composableLambdaImpl3.invoke((Object) mutableInteractionSourceImpl22, new SearchBarKt$InternalSearchBar$1$2$decorator$1(function062, str2, metadataRepo2, function02, str4, function0, function05), SemanticsModifierKt.semantics(onFocusChanged2, false, (Function1) rememberedValue4), (Object) gapComposer3, (Object) 6);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
            if (((Boolean) searchBarKeyboardState.open$delegate.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1564311286);
                Unit unit = Unit.INSTANCE;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    z4 = true;
                    rememberedValue3 = new DateInputKt$DateInputTextField$4$1(focusRequester, null, 1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    z4 = true;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                gapComposer.end(false);
            } else {
                z4 = true;
                gapComposer.startReplaceGroup(1564573608);
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) gapComposer.consume(staticProvidableCompositionLocal);
                if (delegatingSoftwareKeyboardController2 != null) {
                    delegatingSoftwareKeyboardController2.hide();
                }
                gapComposer.end(false);
            }
            gapComposer.end(z4);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda3(composableLambdaImpl, function0, function02, str, searchBarKeyboardState, modifier, paddingValues, showNavigationBack, function03, function04, str2, function05, z, metadataRepo, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchBar(final TextFieldState textFieldState, final String str, final SearchBarKeyboardState searchBarKeyboardState, Modifier modifier, PaddingValues paddingValues, ShowNavigationBack showNavigationBack, Function0 function0, Function0 function02, String str2, Function0 function03, boolean z, MetadataRepo metadataRepo, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        SearchBarKeyboardState searchBarKeyboardState2;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        Function0 function04;
        int i8;
        Function0 function05;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        GapComposer gapComposer;
        final PaddingValues paddingValues2;
        final String str3;
        final boolean z2;
        final MetadataRepo metadataRepo2;
        final Function0 function06;
        final Modifier modifier3;
        final Function0 function07;
        final ShowNavigationBack showNavigationBack2;
        final Function0 function08;
        RecomposeScopeImpl endRestartGroup;
        int i19;
        Modifier modifier4;
        int i20;
        ShowNavigationBack showNavigationBack3;
        textFieldState.getClass();
        str.getClass();
        searchBarKeyboardState.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(785193570);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            searchBarKeyboardState2 = searchBarKeyboardState;
            i4 |= gapComposer2.changed(searchBarKeyboardState2) ? 256 : 128;
        } else {
            searchBarKeyboardState2 = searchBarKeyboardState;
        }
        int i21 = i3 & 8;
        if (i21 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
            i5 = i4 | 24576;
            i6 = i3 & 32;
            if (i6 == 0) {
                i5 = 221184 | i4;
            } else if ((196608 & i) == 0) {
                i5 |= gapComposer2.changed(showNavigationBack == null ? -1 : showNavigationBack.ordinal()) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i5 |= 1572864;
            } else if ((1572864 & i) == 0) {
                function04 = function0;
                i5 |= gapComposer2.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                i8 = i3 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                    function05 = function02;
                } else {
                    function05 = function02;
                    if ((i & 12582912) == 0) {
                        i5 |= gapComposer2.changedInstance(function05) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i5 |= gapComposer2.changed(str2) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                    i5 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i11 = i10;
                    i5 |= gapComposer2.changedInstance(function03) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i14 = i2 | 6;
                        i13 = i12;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (gapComposer2.changed(z) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i17 = i14 | 48;
                        i16 = i15;
                    } else {
                        i16 = i15;
                        i17 = i14 | (gapComposer2.changedInstance(metadataRepo) ? 32 : 16);
                    }
                    i18 = i17 | MLKEMEngine.KyberPolyBytes;
                    if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 147) != 146)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        paddingValues2 = paddingValues;
                        str3 = str2;
                        z2 = z;
                        metadataRepo2 = metadataRepo;
                        function06 = function05;
                        modifier3 = modifier2;
                        function07 = function04;
                        showNavigationBack2 = showNavigationBack;
                        function08 = function03;
                    } else {
                        if (i21 != 0) {
                            int i22 = i13;
                            modifier4 = Modifier.Companion.$$INSTANCE;
                            i19 = i22;
                        } else {
                            i19 = i13;
                            modifier4 = modifier2;
                        }
                        if (i6 != 0) {
                            int i23 = i16;
                            showNavigationBack3 = ShowNavigationBack.WhenKeyboardOpen;
                            i20 = i23;
                        } else {
                            i20 = i16;
                            showNavigationBack3 = showNavigationBack;
                        }
                        Function0 function09 = i7 != 0 ? null : function04;
                        Function0 function010 = i8 != 0 ? null : function05;
                        String str4 = i9 != 0 ? null : str2;
                        Function0 function011 = i11 != 0 ? null : function03;
                        boolean z3 = i19 != 0 ? false : z;
                        MetadataRepo metadataRepo3 = i20 != 0 ? null : metadataRepo;
                        final boolean z4 = function010 == null;
                        final FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(116983573, new Function5() { // from class: com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function5
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj;
                                TextFieldDecorator textFieldDecorator = (TextFieldDecorator) obj2;
                                Modifier modifier5 = (Modifier) obj3;
                                Composer composer2 = (Composer) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                mutableInteractionSourceImpl.getClass();
                                textFieldDecorator.getClass();
                                modifier5.getClass();
                                boolean z5 = z4;
                                boolean z6 = !z5;
                                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getCurrentTextStyle(composer2), Strings.getCurrentTextColor(composer2), 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 3, (Boolean) null, 119);
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                                boolean changedInstance = gapComposer3.changedInstance(focusOwnerImpl2);
                                Object rememberedValue = gapComposer3.rememberedValue();
                                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new SearchBarKt$$ExternalSyntheticLambda7(focusOwnerImpl2, 0);
                                    gapComposer3.updateRememberedValue(rememberedValue);
                                }
                                BasicTextFieldKt.BasicTextField(textFieldState, modifier5, z5, z6, null, m994copyp1EtxEg$default, keyboardOptions, (KeyboardActionHandler) rememberedValue, TextFieldLineLimits.SingleLine.INSTANCE, mutableInteractionSourceImpl, new SolidColor(Strings.getColors(gapComposer3).component.input.cursor), null, textFieldDecorator, null, gapComposer3, ((intValue >> 3) & 112) | 102236160, (intValue & 14) | ((intValue << 6) & 7168), 20992);
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2);
                        int i24 = i5 & 14;
                        boolean z5 = i24 == 4;
                        Object rememberedValue = gapComposer2.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (z5 || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new SearchBarKt$$ExternalSyntheticLambda1(0, textFieldState);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        Function0 function012 = (Function0) rememberedValue;
                        boolean z6 = i24 == 4;
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (z6 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new SearchBarKt$$ExternalSyntheticLambda1(7, textFieldState);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        Function0 function013 = (Function0) rememberedValue2;
                        int i25 = i5 << 6;
                        int i26 = i18 << 6;
                        int i27 = ((i5 >> 24) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i26 & 896) | (i26 & 7168);
                        PaddingValuesImpl paddingValuesImpl = DefaultInternalPadding;
                        gapComposer = gapComposer2;
                        InternalSearchBar(rememberComposableLambda, function012, function013, str, searchBarKeyboardState2, modifier4, paddingValuesImpl, showNavigationBack3, function09, function010, str4, function011, z3, metadataRepo3, gapComposer, (i25 & 7168) | 6 | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25) | (234881024 & i25) | (i25 & 1879048192), i27);
                        modifier3 = modifier4;
                        paddingValues2 = paddingValuesImpl;
                        showNavigationBack2 = showNavigationBack3;
                        function07 = function09;
                        function06 = function010;
                        str3 = str4;
                        function08 = function011;
                        z2 = z3;
                        metadataRepo2 = metadataRepo3;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                SearchBarKt.SearchBar(TextFieldState.this, str, searchBarKeyboardState, modifier3, paddingValues2, showNavigationBack2, function07, function06, str3, function08, z2, metadataRepo2, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                i18 = i17 | MLKEMEngine.KyberPolyBytes;
                if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 147) != 146)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function04 = function0;
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            i18 = i17 | MLKEMEngine.KyberPolyBytes;
            if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 147) != 146)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i4 | 24576;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        function04 = function0;
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        i18 = i17 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 147) != 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final SearchBarKeyboardState rememberSearchBarKeyboardState(boolean z, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new SearchBarKeyboardState(z);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (SearchBarKeyboardState) rememberedValue;
    }
}
