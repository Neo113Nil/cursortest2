package com.squareup.cash.moneybot.widgets;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda3;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.blockers.views.CashtagViewKt$Cashtag$1$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ComposerKt {
    public static final RoundedCornerShape ComposerShape = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f);

    public static final void CancelButton(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-59333913);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = modifier;
            function02 = function0;
            CircleButtonContainer(modifier2, false, function02, Room.stringResource(gapComposer, R.string.composer_cancel_button_content_description), "composer-cancel-button", UtilsKt.lambda$533797784, gapComposer, (i2 & 14) | 221184 | ((i2 << 3) & 896), 2);
        } else {
            modifier2 = modifier;
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(modifier2, function02, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CircleButtonContainer(Modifier modifier, boolean z, Function0 function0, String str, String str2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        Function0 function02;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1902237405);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                function02 = function0;
                i3 |= gapComposer.changedInstance(function02) ? 256 : 128;
            } else {
                function02 = function0;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changed(str) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= gapComposer.changed(str2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z4 = i4 != 0 ? true : z2;
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(TestTagKt.testTag(modifier, str2), 44.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                int i5 = i3;
                Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(m285size3ABfNKs, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), z4, str, new Role(0), function02);
                if (z4) {
                    gapComposer.startReplaceGroup(1605945066);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.background.inverse;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1605947691);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.component.button.prominent.background.disabled;
                    gapComposer.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m181clickableO2vRcR0, j, RoundedCornerShapeKt.CircleShape);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Recorder$$ExternalSyntheticOutline2.m((i5 >> 15) & 14, composableLambdaImpl, gapComposer, true);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier, z3, function0, str, str2, composableLambdaImpl, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Composer(final Modifier modifier, ComposerState composerState, ComposerInputStatus composerInputStatus, boolean z, boolean z2, boolean z3, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, String str, SharedTransitionScope sharedTransitionScope, AnimatedVisibilityScope animatedVisibilityScope, ComposerSharedElementKeys composerSharedElementKeys, final Function1 function1, Function0 function0, Function1 function12, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z4;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2;
        int i6;
        String str2;
        final ComposerSharedElementKeys composerSharedElementKeys2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        GapComposer gapComposer;
        SharedTransitionScope sharedTransitionScope2;
        final ComposerState composerState2;
        final ComposerInputStatus composerInputStatus2;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        final String str3;
        final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController3;
        final Function0 function02;
        final Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        ComposerState composerState3;
        Function0 function03;
        boolean z8;
        boolean z9;
        ComposerSharedElementKeys composerSharedElementKeys3;
        int i13;
        int i14;
        int i15;
        boolean z10;
        ComposerInputStatus composerInputStatus3;
        int i16;
        Function1 function14;
        Object rememberedValue;
        int i17;
        MutableState mutableState;
        boolean changedInstance;
        Object rememberedValue2;
        boolean z11;
        Object rememberedValue3;
        boolean z12;
        Object rememberedValue4;
        Object obj;
        boolean changed;
        Object obj2;
        int ordinal;
        Function0 function04;
        final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1203076145);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i18 = i3 & 2;
        if (i18 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= gapComposer2.changed(composerState == null ? -1 : composerState.ordinal()) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(composerInputStatus != null ? composerInputStatus.ordinal() : -1) ? 256 : 128;
        }
        int i20 = i4 | 3072;
        int i21 = i3 & 16;
        if (i21 != 0) {
            i20 = i4 | 27648;
        } else if ((i & 24576) == 0) {
            i20 |= gapComposer2.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            i5 = i3 & 32;
            if (i5 == 0) {
                i20 |= 196608;
                z4 = z3;
            } else {
                z4 = z3;
                if ((i & 196608) == 0) {
                    i20 |= gapComposer2.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
            }
            if ((i & 1572864) != 0) {
                delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
                i20 |= ((i3 & 64) == 0 && gapComposer2.changed(delegatingSoftwareKeyboardController2)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i20 |= 12582912;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 12582912) == 0) {
                    i20 |= gapComposer2.changed(str2) ? 8388608 : 4194304;
                }
            }
            if ((i & 100663296) == 0) {
                i20 |= gapComposer2.changed(sharedTransitionScope) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i20 |= gapComposer2.changedInstance(animatedVisibilityScope2) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            if ((i3 & 1024) != 0) {
                composerSharedElementKeys2 = composerSharedElementKeys;
                if (gapComposer2.changedInstance(composerSharedElementKeys2)) {
                    i7 = 4;
                    int i22 = i2 | i7;
                    if ((i2 & 48) == 0) {
                        i22 |= gapComposer2.changedInstance(function1) ? 32 : 16;
                    }
                    int i23 = i22;
                    i8 = i3 & 4096;
                    if (i8 != 0) {
                        i9 = i23 | MLKEMEngine.KyberPolyBytes;
                    } else {
                        i9 = i23 | (gapComposer2.changedInstance(function0) ? 256 : 128);
                    }
                    i10 = i3 & PKIFailureInfo.certRevoked;
                    if (i10 != 0) {
                        i11 = i9 | 3072;
                    } else {
                        i11 = i9 | (gapComposer2.changedInstance(function12) ? 2048 : 1024);
                    }
                    i12 = i20;
                    if (gapComposer2.shouldExecute(i12 & 1, (i20 & 306783379) == 306783378 || (i11 & 1171) != 1170)) {
                        gapComposer2.startDefaults();
                        int i24 = i & 1;
                        Object obj3 = Composer.Companion.Empty;
                        if (i24 == 0 || gapComposer2.getDefaultsInvalid()) {
                            composerState3 = i18 != 0 ? ComposerState.COLLAPSED : composerState;
                            ComposerInputStatus composerInputStatus4 = i19 != 0 ? ComposerInputStatus.READY : composerInputStatus;
                            boolean z13 = i21 != 0 ? false : z2;
                            if (i5 != 0) {
                                z4 = true;
                            }
                            if ((i3 & 64) != 0) {
                                i12 &= -3670017;
                                delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
                            }
                            if (i6 != 0) {
                                str2 = null;
                            }
                            if ((i3 & 1024) != 0) {
                                composerSharedElementKeys2 = ComposerSharedElementKeys.Default;
                                i11 &= -15;
                            }
                            if (i8 != 0) {
                                Object rememberedValue5 = gapComposer2.rememberedValue();
                                if (rememberedValue5 == obj3) {
                                    rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda6(28);
                                    gapComposer2.updateRememberedValue(rememberedValue5);
                                }
                                function03 = (Function0) rememberedValue5;
                            } else {
                                function03 = function0;
                            }
                            z8 = z13;
                            z9 = z4;
                            composerSharedElementKeys3 = composerSharedElementKeys2;
                            i13 = 1572864;
                            i14 = i12;
                            i15 = 32;
                            z10 = true;
                            composerInputStatus3 = composerInputStatus4;
                            i16 = i11;
                            if (i10 != 0) {
                                function14 = null;
                                gapComposer2.endDefaults();
                                rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue != obj3) {
                                    i17 = i13;
                                    rememberedValue = Updater.mutableStateOf$default(new TextFieldValue("", 0L, 6));
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                } else {
                                    i17 = i13;
                                }
                                mutableState = (MutableState) rememberedValue;
                                Object obj4 = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
                                Object obj5 = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
                                changedInstance = ((i16 & 112) != i15) | gapComposer2.changedInstance(obj4) | gapComposer2.changedInstance(obj5) | ((((i14 & 3670016) ^ i17) <= 1048576 && gapComposer2.changed(delegatingSoftwareKeyboardController2)) || (i14 & i17) == 1048576);
                                rememberedValue2 = gapComposer2.rememberedValue();
                                if (!changedInstance || rememberedValue2 == obj3) {
                                    rememberedValue2 = new ta$$ExternalSyntheticLambda1(obj4, function1, obj5, delegatingSoftwareKeyboardController2, mutableState, 16);
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                Function0 function05 = (Function0) rememberedValue2;
                                TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
                                z11 = (i16 & 7168) != 2048;
                                rememberedValue3 = gapComposer2.rememberedValue();
                                if (!z11 || rememberedValue3 == obj3) {
                                    rememberedValue3 = new CashtagViewKt$Cashtag$1$1(function14, mutableState, null, 4);
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                Updater.LaunchedEffect(gapComposer2, textFieldValue, (Function2) rememberedValue3);
                                z12 = (29360128 & i14) != 8388608;
                                rememberedValue4 = gapComposer2.rememberedValue();
                                if (!z12 || rememberedValue4 == obj3) {
                                    obj = null;
                                    rememberedValue4 = new ComposerKt$Composer$3$1(str2, mutableState, null, 0);
                                    gapComposer2.updateRememberedValue(rememberedValue4);
                                } else {
                                    obj = null;
                                }
                                Updater.LaunchedEffect(gapComposer2, str2, (Function2) rememberedValue4);
                                animatedVisibilityScope2 = animatedVisibilityScope;
                                changed = ((i14 & 234881024) != 67108864) | gapComposer2.changed(animatedVisibilityScope2);
                                Object rememberedValue6 = gapComposer2.rememberedValue();
                                if (!changed || rememberedValue6 == obj3) {
                                    if (sharedTransitionScope != null || animatedVisibilityScope2 == null) {
                                        sharedTransitionScope2 = sharedTransitionScope;
                                        obj2 = obj;
                                    } else {
                                        sharedTransitionScope2 = sharedTransitionScope;
                                        obj2 = new ComposerSharedTransitionScope(animatedVisibilityScope2, sharedTransitionScope2);
                                    }
                                    gapComposer2.updateRememberedValue(obj2);
                                } else {
                                    obj2 = rememberedValue6;
                                    sharedTransitionScope2 = sharedTransitionScope;
                                }
                                ComposerSharedTransitionScope composerSharedTransitionScope = (ComposerSharedTransitionScope) obj2;
                                String stringResource = Room.stringResource(gapComposer2, R.string.floating_chat_start_input_hint);
                                ordinal = composerState3.ordinal();
                                if (ordinal != 0) {
                                    gapComposer = gapComposer2;
                                    function04 = function03;
                                    gapComposer.startReplaceGroup(-658805481);
                                    ComposerCollapsed(modifier, stringResource, composerSharedTransitionScope, composerSharedElementKeys3, z9, gapComposer, (i14 & 14) | ((i16 << 9) & 7168) | (57344 & (i14 >> 3)));
                                    gapComposer.end(false);
                                } else {
                                    if (ordinal != 1) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 810031359, false);
                                    }
                                    gapComposer2.startReplaceGroup(-658509059);
                                    TextFieldValue textFieldValue2 = (TextFieldValue) mutableState.getValue();
                                    boolean z14 = !(str2 == null || str2.length() == 0);
                                    Object rememberedValue7 = gapComposer2.rememberedValue();
                                    if (rememberedValue7 == obj3) {
                                        rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda9(19, mutableState);
                                        gapComposer2.updateRememberedValue(rememberedValue7);
                                    }
                                    function04 = function03;
                                    ComposerExpanded(modifier, textFieldValue2, composerInputStatus3, z8, z14, stringResource, z10, composerSharedTransitionScope, composerSharedElementKeys3, z9, (Function1) rememberedValue7, function05, function04, gapComposer2, (234881024 & (i16 << 24)) | (i14 & 910) | ((i14 >> 3) & 7168) | ((i14 << 9) & 3670016) | ((i14 << 12) & 1879048192), (i16 & 896) | 6);
                                    gapComposer = gapComposer2;
                                    gapComposer.end(false);
                                }
                                str3 = str2;
                                delegatingSoftwareKeyboardController3 = delegatingSoftwareKeyboardController2;
                                z6 = z8;
                                z5 = z10;
                                composerSharedElementKeys2 = composerSharedElementKeys3;
                                z7 = z9;
                                function02 = function04;
                                function13 = function14;
                                composerState2 = composerState3;
                                composerInputStatus2 = composerInputStatus3;
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                            int i25 = (i3 & 64) != 0 ? i12 & (-3670017) : i12;
                            if ((i3 & 1024) != 0) {
                                i11 &= -15;
                            }
                            z10 = z;
                            z8 = z2;
                            function03 = function0;
                            i16 = i11;
                            i14 = i25;
                            z9 = z4;
                            composerSharedElementKeys3 = composerSharedElementKeys2;
                            i13 = 1572864;
                            i15 = 32;
                            composerState3 = composerState;
                            composerInputStatus3 = composerInputStatus;
                        }
                        function14 = function12;
                        gapComposer2.endDefaults();
                        rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue != obj3) {
                        }
                        mutableState = (MutableState) rememberedValue;
                        Object obj42 = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
                        Object obj52 = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
                        changedInstance = ((i16 & 112) != i15) | gapComposer2.changedInstance(obj42) | gapComposer2.changedInstance(obj52) | ((((i14 & 3670016) ^ i17) <= 1048576 && gapComposer2.changed(delegatingSoftwareKeyboardController2)) || (i14 & i17) == 1048576);
                        rememberedValue2 = gapComposer2.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue2 = new ta$$ExternalSyntheticLambda1(obj42, function1, obj52, delegatingSoftwareKeyboardController2, mutableState, 16);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                        Function0 function052 = (Function0) rememberedValue2;
                        TextFieldValue textFieldValue3 = (TextFieldValue) mutableState.getValue();
                        if ((i16 & 7168) != 2048) {
                        }
                        rememberedValue3 = gapComposer2.rememberedValue();
                        if (!z11) {
                        }
                        rememberedValue3 = new CashtagViewKt$Cashtag$1$1(function14, mutableState, null, 4);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                        Updater.LaunchedEffect(gapComposer2, textFieldValue3, (Function2) rememberedValue3);
                        if ((29360128 & i14) != 8388608) {
                        }
                        rememberedValue4 = gapComposer2.rememberedValue();
                        if (z12) {
                        }
                        obj = null;
                        rememberedValue4 = new ComposerKt$Composer$3$1(str2, mutableState, null, 0);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                        Updater.LaunchedEffect(gapComposer2, str2, (Function2) rememberedValue4);
                        animatedVisibilityScope2 = animatedVisibilityScope;
                        changed = ((i14 & 234881024) != 67108864) | gapComposer2.changed(animatedVisibilityScope2);
                        Object rememberedValue62 = gapComposer2.rememberedValue();
                        if (changed) {
                        }
                        if (sharedTransitionScope != null) {
                        }
                        sharedTransitionScope2 = sharedTransitionScope;
                        obj2 = obj;
                        gapComposer2.updateRememberedValue(obj2);
                        ComposerSharedTransitionScope composerSharedTransitionScope2 = (ComposerSharedTransitionScope) obj2;
                        String stringResource2 = Room.stringResource(gapComposer2, R.string.floating_chat_start_input_hint);
                        ordinal = composerState3.ordinal();
                        if (ordinal != 0) {
                        }
                        str3 = str2;
                        delegatingSoftwareKeyboardController3 = delegatingSoftwareKeyboardController2;
                        z6 = z8;
                        z5 = z10;
                        composerSharedElementKeys2 = composerSharedElementKeys3;
                        z7 = z9;
                        function02 = function04;
                        function13 = function14;
                        composerState2 = composerState3;
                        composerInputStatus2 = composerInputStatus3;
                    } else {
                        gapComposer = gapComposer2;
                        sharedTransitionScope2 = sharedTransitionScope;
                        gapComposer.skipToGroupEnd();
                        composerState2 = composerState;
                        composerInputStatus2 = composerInputStatus;
                        z5 = z;
                        z6 = z2;
                        z7 = z4;
                        str3 = str2;
                        delegatingSoftwareKeyboardController3 = delegatingSoftwareKeyboardController2;
                        function02 = function0;
                        function13 = function12;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        final SharedTransitionScope sharedTransitionScope3 = sharedTransitionScope2;
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                ComposerKt.Composer(Modifier.this, composerState2, composerInputStatus2, z5, z6, z7, delegatingSoftwareKeyboardController3, str3, sharedTransitionScope3, animatedVisibilityScope2, composerSharedElementKeys2, function1, function02, function13, (Composer) obj6, updateChangedFlags, updateChangedFlags2, i3);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
            } else {
                composerSharedElementKeys2 = composerSharedElementKeys;
            }
            i7 = 2;
            int i222 = i2 | i7;
            if ((i2 & 48) == 0) {
            }
            int i232 = i222;
            i8 = i3 & 4096;
            if (i8 != 0) {
            }
            i10 = i3 & PKIFailureInfo.certRevoked;
            if (i10 != 0) {
            }
            i12 = i20;
            if (gapComposer2.shouldExecute(i12 & 1, (i20 & 306783379) == 306783378 || (i11 & 1171) != 1170)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        i7 = 2;
        int i2222 = i2 | i7;
        if ((i2 & 48) == 0) {
        }
        int i2322 = i2222;
        i8 = i3 & 4096;
        if (i8 != 0) {
        }
        i10 = i3 & PKIFailureInfo.certRevoked;
        if (i10 != 0) {
        }
        i12 = i20;
        if (gapComposer2.shouldExecute(i12 & 1, (i20 & 306783379) == 306783378 || (i11 & 1171) != 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    public static final void ComposerCollapsed(Modifier modifier, String str, ComposerSharedTransitionScope composerSharedTransitionScope, ComposerSharedElementKeys composerSharedElementKeys, boolean z, Composer composer, int i) {
        int i2;
        ComposerSharedTransitionScope composerSharedTransitionScope2;
        GapComposer gapComposer;
        Modifier.Companion companion;
        int i3;
        ?? r15;
        boolean z2;
        float f;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(242241128);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(composerSharedTransitionScope) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(composerSharedElementKeys) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i4 = i2;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            gapComposer2.startReplaceGroup(865501083);
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(modifier, 1.0f), 60.0f, RecyclerView.DECELERATION_RATE, 2);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (composerSharedTransitionScope != 0) {
                gapComposer2.startReplaceGroup(865503119);
                Modifier sharedElement$default = SharedTransitionScope.sharedElement$default(composerSharedTransitionScope, companion2, composerSharedTransitionScope.rememberSharedContentState(composerSharedElementKeys.background, gapComposer2, 0), composerSharedTransitionScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                companion = companion2;
                SharedTransitionScope.SharedContentState rememberSharedContentState = composerSharedTransitionScope.rememberSharedContentState(composerSharedElementKeys.bounds, gapComposer2, 0);
                SharedTransitionScope.ResizeMode.Companion.getClass();
                r15 = 0;
                i3 = i4;
                Modifier sharedBounds$default = SharedTransitionScope.sharedBounds$default(composerSharedTransitionScope, sharedElement$default, rememberSharedContentState, composerSharedTransitionScope, null, null, null, RemeasureImpl.INSTANCE, null, 988);
                gapComposer2.end(false);
                m279heightInVpY3zN4$default = m279heightInVpY3zN4$default.then(sharedBounds$default);
            } else {
                companion = companion2;
                i3 = i4;
                r15 = 0;
            }
            gapComposer2.end(r15);
            Modifier composerBackground = composerBackground(gapComposer2, m279heightInVpY3zN4$default);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(composerBackground, 8.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(-764079754);
            if (!(((double) 1.0f) > 0.0d ? true : r15)) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 12.0f, RecyclerView.DECELERATION_RATE, 2);
            if (composerSharedTransitionScope != 0) {
                gapComposer2.startReplaceGroup(-764077098);
                Object obj = composerSharedElementKeys.textInput;
                if (obj == null) {
                    obj = ComposerSharedElementKey.TextInput;
                }
                f = 0.0f;
                z2 = true;
                Modifier sharedBounds$default2 = SharedTransitionScope.sharedBounds$default(composerSharedTransitionScope, companion, composerSharedTransitionScope.rememberSharedContentState(obj, gapComposer2, r15), composerSharedTransitionScope, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                composerSharedTransitionScope2 = composerSharedTransitionScope;
                gapComposer2.end(r15);
                modifier2 = m300paddingVpY3zN4$default.then(sharedBounds$default2);
            } else {
                composerSharedTransitionScope2 = composerSharedTransitionScope;
                z2 = true;
                f = 0.0f;
                modifier2 = m300paddingVpY3zN4$default;
            }
            gapComposer2.end(r15);
            float f2 = f;
            Room.m1165Text25TpFw(0, 0, 0, 5, (i3 >> 3) & 14, 0, 3824, composerHintColor(gapComposer2), (Composer) gapComposer2, modifier2, TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, 0L, Room.getSp(20), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(26), null, null, 0, 16646141), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            AnimatedContentKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.m147scaleInL8ZKhE$default(null, f2, 7), EnterExitTransitionKt.m148scaleOutL8ZKhE$default(null, f2, 7), (String) null, Expect_jvmKt.rememberComposableLambda(-774576468, new MoneyTabUIKt$$ExternalSyntheticLambda11(11, composerSharedTransitionScope2, composerSharedElementKeys), gapComposer), (Composer) gapComposer, 1600518 | ((i3 >> 9) & 112), 18);
            gapComposer.end(z2);
        } else {
            composerSharedTransitionScope2 = composerSharedTransitionScope;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier, str, composerSharedTransitionScope2, composerSharedElementKeys, z, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    public static final void ComposerExpanded(final Modifier modifier, final TextFieldValue textFieldValue, final ComposerInputStatus composerInputStatus, final boolean z, final boolean z2, final String str, final boolean z3, final ComposerSharedTransitionScope composerSharedTransitionScope, final ComposerSharedElementKeys composerSharedElementKeys, final boolean z4, final Function1 function1, final Function0 function0, final Function0 function02, Composer composer, final int i, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        int i4;
        GapComposer gapComposer;
        Modifier.Companion companion;
        int i5;
        int i6;
        int i7;
        Applier applier;
        ?? r13;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-538093679);
        Applier applier2 = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(textFieldValue) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(composerInputStatus.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z5 = z;
            i3 |= gapComposer2.changed(z5) ? 2048 : 1024;
        } else {
            z5 = z;
        }
        if ((i & 24576) == 0) {
            z6 = z2;
            i3 |= gapComposer2.changed(z6) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            z6 = z2;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changed(str) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changed(composerSharedTransitionScope) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changedInstance(composerSharedElementKeys) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changed(z4) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changedInstance(function1) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(function02) ? 256 : 128;
        }
        int i8 = i4;
        if (gapComposer2.shouldExecute(i3 & 1, ((306783379 & i3) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Boolean valueOf = Boolean.valueOf(z5);
            boolean changed = ((i3 & 7168) == 2048) | gapComposer2.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new ComposerKt$ComposerExpanded$1$1(z5, focusRequester, delegatingSoftwareKeyboardController, null, 0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue2);
            Boolean valueOf2 = Boolean.valueOf(z6);
            boolean changed2 = ((i3 & 57344) == 16384) | gapComposer2.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue3 == obj) {
                rememberedValue3 = new ComposerKt$ComposerExpanded$1$1(z6, focusRequester, delegatingSoftwareKeyboardController, null, 1);
                focusRequester = focusRequester;
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            int i9 = i3 >> 12;
            Updater.LaunchedEffect(gapComposer2, valueOf2, (Function2) rememberedValue3);
            gapComposer2.startReplaceGroup(-1711917372);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(TestTagKt.testTag(modifier, "composer"), 1.0f);
            int i10 = i3;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (composerSharedTransitionScope != null) {
                gapComposer2.startReplaceGroup(-1711915336);
                SharedTransitionScope.SharedContentState rememberSharedContentState = composerSharedTransitionScope.rememberSharedContentState(composerSharedElementKeys.bounds, gapComposer2, 0);
                SharedTransitionScope.ResizeMode.Companion.getClass();
                i6 = i10;
                i7 = i8;
                i5 = i9;
                applier = applier2;
                r13 = 0;
                companion = companion2;
                Modifier sharedElement$default = SharedTransitionScope.sharedElement$default(composerSharedTransitionScope, SharedTransitionScope.sharedBounds$default(composerSharedTransitionScope, companion2, rememberSharedContentState, composerSharedTransitionScope, null, null, null, RemeasureImpl.INSTANCE, null, 988), composerSharedTransitionScope.rememberSharedContentState(composerSharedElementKeys.background, gapComposer2, 0), composerSharedTransitionScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                gapComposer2.end(false);
                fillMaxWidth = fillMaxWidth.then(sharedElement$default);
            } else {
                companion = companion2;
                i5 = i9;
                i6 = i10;
                i7 = i8;
                applier = applier2;
                r13 = 0;
            }
            gapComposer2.end(r13);
            Modifier composerBackground = composerBackground(gapComposer2, fillMaxWidth);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(composerBackground, 8.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, r13);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf3 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf3, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            int i11 = i6 >> 3;
            int i12 = i5;
            int i13 = (i11 & 458752) | (i11 & 14) | 1573248 | (i12 & 112) | (i12 & 7168) | (i12 & 57344);
            int i14 = i7 << 21;
            gapComposer = gapComposer2;
            ComposerTextField(textFieldValue, str, SizeKt.fillMaxWidth(companion, 1.0f), composerSharedTransitionScope, composerSharedElementKeys, z3, focusRequester, function1, function0, gapComposer, i13 | (29360128 & i14) | (i14 & 234881024));
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (!(((double) 1.0f) > 0.0d)) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            AnimatedContentKt.AnimatedVisibility(z4, (Modifier) null, EnterExitTransitionKt.m147scaleInL8ZKhE$default(null, RecyclerView.DECELERATION_RATE, 7), EnterExitTransitionKt.m148scaleOutL8ZKhE$default(null, RecyclerView.DECELERATION_RATE, 7), (String) null, Expect_jvmKt.rememberComposableLambda(-1421818081, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(composerInputStatus, composerSharedTransitionScope, textFieldValue, function0, function02, composerSharedElementKeys, 8), gapComposer), (Composer) gapComposer, 1600518 | ((i6 >> 24) & 112), 18);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    ComposerKt.ComposerExpanded(Modifier.this, textFieldValue, composerInputStatus, z, z2, str, z3, composerSharedTransitionScope, composerSharedElementKeys, z4, function1, function0, function02, (Composer) obj2, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void ComposerTextField(TextFieldValue textFieldValue, String str, Modifier modifier, ComposerSharedTransitionScope composerSharedTransitionScope, ComposerSharedElementKeys composerSharedElementKeys, boolean z, FocusRequester focusRequester, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Function0 function02;
        GapComposer gapComposer2;
        boolean z2;
        ?? r0;
        TextFieldValue textFieldValue2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(452949963);
        if ((i & 6) == 0) {
            i2 = (gapComposer3.changed(textFieldValue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer3.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer3.changed(composerSharedTransitionScope) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer3.changedInstance(composerSharedElementKeys) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer3.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer3.changed(focusRequester) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer3.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= gapComposer3.changedInstance(function0) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer3).bodyMedium, 0L, Room.getSp(24), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(26), null, null, 0, 16646141);
            gapComposer3.startReplaceGroup(1493265321);
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.m279heightInVpY3zN4$default(TestTagKt.testTag(modifier, "composer-text-field"), RecyclerView.DECELERATION_RATE, 292.0f, 1), 10.0f, 12.0f);
            if (composerSharedTransitionScope != null) {
                gapComposer3.startReplaceGroup(1493267357);
                Object obj = composerSharedElementKeys.textInput;
                if (obj == null) {
                    obj = ComposerSharedElementKey.TextInput;
                }
                z2 = true;
                function02 = function0;
                r0 = 0;
                GapComposer gapComposer4 = gapComposer3;
                Modifier sharedBounds$default = SharedTransitionScope.sharedBounds$default(composerSharedTransitionScope, Modifier.Companion.$$INSTANCE, composerSharedTransitionScope.rememberSharedContentState(obj, gapComposer3, 0), composerSharedTransitionScope, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
                gapComposer4.end(false);
                m299paddingVpY3zN4 = m299paddingVpY3zN4.then(sharedBounds$default);
                gapComposer2 = gapComposer4;
            } else {
                function02 = function0;
                gapComposer2 = gapComposer3;
                z2 = true;
                r0 = 0;
            }
            gapComposer2.end(r0);
            Modifier focusRequester2 = FocusTraversalKt.focusRequester(m299paddingVpY3zN4, focusRequester);
            TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(m994copyp1EtxEg$default, Strings.getColors(gapComposer2).semantic.text.standard, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
            SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer2).semantic.text.standard);
            KeyboardOptions keyboardOptions = KeyboardOptions.Default;
            KeyboardOptions m359copyINvB4aQ$default = KeyboardOptions.m359copyINvB4aQ$default(r0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            boolean z3 = (i3 & 234881024) == 67108864 ? z2 : r0;
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (z3 || rememberedValue == obj2) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(24, function02);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) rememberedValue, null, null, 62);
            int i4 = i3 & 14;
            boolean z4 = i4 == 4 ? z2 : r0;
            if ((i3 & 29360128) != 8388608) {
                z2 = r0;
            }
            boolean z5 = z4 | z2;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z5 || rememberedValue2 == obj2) {
                textFieldValue2 = textFieldValue;
                rememberedValue2 = new ComposerKt$$ExternalSyntheticLambda9(textFieldValue2, function1, r0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                textFieldValue2 = textFieldValue;
            }
            gapComposer = gapComposer2;
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1) rememberedValue2, focusRequester2, z, m994copyp1EtxEg$default2, m359copyINvB4aQ$default, keyboardActions, false, 0, 0, null, null, null, solidColor, Expect_jvmKt.rememberComposableLambda(-1431888850, new PoolToastKt$$ExternalSyntheticLambda0(17, textFieldValue2, str, m994copyp1EtxEg$default), gapComposer2), gapComposer, i4 | ((i3 >> 6) & 7168), 196608, 16144);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldDefaults$$ExternalSyntheticLambda3(textFieldValue, str, modifier, composerSharedTransitionScope, composerSharedElementKeys, z, focusRequester, function1, function0, i);
        }
    }

    public static final void SendButton(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1426459111);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            CircleButtonContainer(modifier, z, function0, Room.stringResource(gapComposer, R.string.floating_chat_send_button_content_description), "composer-send-button", UtilsKt.f505lambda$506894838, gapComposer, (i2 & 14) | 221184 | (i2 & 112) | (i2 & 896), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda12(modifier, z, function0, i, 0);
        }
    }

    public static final Modifier composerBackground(Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
        if (moneybotColors == null) {
            gapComposer.startReplaceGroup(-973090538);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            moneybotColors = MoneybotColorsKt.fromArcade(colors);
        } else {
            gapComposer.startReplaceGroup(-973091964);
        }
        gapComposer.end(false);
        long j = moneybotColors.composer.background;
        RoundedCornerShape roundedCornerShape = ComposerShape;
        return ClipKt.clip(ImageKt.m177backgroundbw27NRU(modifier, j, roundedCornerShape), roundedCornerShape);
    }

    public static final long composerHintColor(Composer composer) {
        long j;
        if (Strings.getColors(composer).isLight) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(198385354);
            j = Strings.getColors(gapComposer).semantic.text.placeholder;
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(198387175);
            j = Strings.getColors(gapComposer2).semantic.text.standard;
            gapComposer2.end(false);
        }
        return Color.m675copywmQWz5c$default(0.4f, j, 14);
    }
}
