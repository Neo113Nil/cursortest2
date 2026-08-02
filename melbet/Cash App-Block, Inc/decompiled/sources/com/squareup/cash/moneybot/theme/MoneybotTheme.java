package com.squareup.cash.moneybot.theme;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public abstract class MoneybotTheme {
    /* JADX WARN: Removed duplicated region for block: B:108:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: Card-jb-40ds, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3623Cardjb40ds(final Modifier modifier, boolean z, long j, float f, Function0 function0, Function3 function3, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        long j2;
        float f2;
        int i4;
        Function0 function02;
        int i5;
        Function3 function32;
        final boolean z3;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        int i6;
        Function0 function03;
        int i7;
        int i8;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(258561462);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (gapComposer.changed(j2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    j2 = j;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                j2 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    f2 = f;
                    if (gapComposer.changed(f2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    f2 = f;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                f2 = f;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    Function3 function34 = function3;
                    i3 |= gapComposer.changedInstance(function34) ? PKIFailureInfo.unsupportedVersion : 65536;
                    function32 = function34;
                    if ((1572864 & i) == 0) {
                        i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                        gapComposer.skipToGroupEnd();
                        z3 = z2;
                        function33 = function32;
                    } else {
                        gapComposer.startDefaults();
                        if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 4) != 0) {
                                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j2 = colors.semantic.background.f1047app;
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                Object obj = DefaultSizes.border.entries;
                                i3 &= -7169;
                                f2 = 24.0f;
                            }
                            if (i4 != 0) {
                                function02 = null;
                            }
                            if (i5 != 0) {
                                function32 = null;
                            }
                        } else {
                            gapComposer.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                        }
                        gapComposer.endDefaults();
                        RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f2);
                        gapComposer.startReplaceGroup(-630523121);
                        Modifier clip = ClipKt.clip(modifier, m340RoundedCornerShape0680j_4);
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (z2) {
                            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            Object obj2 = DefaultSizes.border.annotationsMap;
                            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            Colors.Semantic.Border border = colors2.semantic.border;
                            i6 = i3;
                            clip = clip.then(ImageKt.m178borderxT4_qwU(companion, 1.0f, border.subtle, m340RoundedCornerShape0680j_4));
                        } else {
                            i6 = i3;
                        }
                        gapComposer.end(false);
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j2, m340RoundedCornerShape0680j_4);
                        if (function02 == null) {
                            gapComposer.startReplaceGroup(1928905054);
                            gapComposer.end(false);
                            function03 = null;
                        } else {
                            gapComposer.startReplaceGroup(-630513917);
                            Function0 withHaptics = PlatformKt.withHaptics(function02, null, gapComposer, (i6 >> 12) & 14, 1);
                            gapComposer.end(false);
                            function03 = withHaptics;
                        }
                        if (function03 != null) {
                            m177backgroundbw27NRU = m177backgroundbw27NRU.then(ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, function03, 15));
                        }
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        boolean z4 = z2;
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
                        if (function32 != null) {
                            gapComposer.startReplaceGroup(-750314843);
                            function32.invoke(BoxScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i6 >> 12) & 112) | 6));
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-750283130);
                            gapComposer.end(false);
                        }
                        Updater.CompositionLocalProvider(ArcadeThemeKt.LocalScreenMargin.defaultProvidedValue$runtime(new Dp(RecyclerView.DECELERATION_RATE)), Expect_jvmKt.rememberComposableLambda(-942763012, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 24), gapComposer), gapComposer, 56);
                        gapComposer.end(true);
                        z3 = z4;
                        function33 = function32;
                    }
                    final long j3 = j2;
                    final float f3 = f2;
                    final Function0 function04 = function02;
                    final Function3 function35 = function33;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.card.CardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                MoneybotTheme.m3623Cardjb40ds(Modifier.this, z3, j3, f3, function04, function35, composableLambdaImpl, (Composer) obj3, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                function32 = function3;
                if ((1572864 & i) == 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                }
                final long j32 = j2;
                final float f32 = f2;
                final Function0 function042 = function02;
                final Function3 function352 = function33;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((1572864 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
            }
            final long j322 = j2;
            final float f322 = f2;
            final Function0 function0422 = function02;
            final Function3 function3522 = function33;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z2 = z;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((1572864 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        final long j3222 = j2;
        final float f3222 = f2;
        final Function0 function04222 = function02;
        final Function3 function35222 = function33;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static VideoEncoderInfo from(VideoEncoderInfo videoEncoderInfo, Size size) {
        if (!(videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
            if (DeviceQuirks.sQuirks.get(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(size.getWidth(), size.getHeight())) {
                    StringUtilsKt.w("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + videoEncoderInfo.getSupportedWidths() + '/' + videoEncoderInfo.getSupportedHeights());
                }
            }
            videoEncoderInfo = new VideoEncoderInfoWrapper(videoEncoderInfo);
        }
        if (size != null && (videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
            ((VideoEncoderInfoWrapper) videoEncoderInfo).extraSupportedSizes.add(size);
        }
        return videoEncoderInfo;
    }

    public static MoneybotColors getColors(Composer composer) {
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
        return moneybotColors;
    }
}
