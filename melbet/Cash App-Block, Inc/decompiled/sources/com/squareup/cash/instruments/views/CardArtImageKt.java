package com.squareup.cash.instruments.views;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AndroidMenu_androidKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeKt;
import dev.chrisbanes.haze.HazeState;
import dev.chrisbanes.haze.HazeStyle;
import dev.chrisbanes.haze.HazeTint;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class CardArtImageKt {
    public static final long HAZE_FALLBACK_DARK;
    public static final long HAZE_FALLBACK_LIGHT;
    public static final long LOCAL_ICON_PILL_DARK;
    public static final long LOCAL_ICON_PILL_LIGHT;
    public static final long HAZE_DARK_BACKGROUND_COLOR = ColorKt.Color(4288453788L);
    public static final long HAZE_DARK_FOREGROUND_COLOR = ColorKt.Color(4280624421L);
    public static final long HAZE_LIGHT_BACKGROUND_COLOR = ColorKt.Color(4279045389L);
    public static final long HAZE_LIGHT_FOREGROUND_COLOR = ColorKt.Color(4290756543L);

    static {
        long Color = ColorKt.Color(4282992969L);
        HAZE_FALLBACK_DARK = Color;
        HAZE_FALLBACK_LIGHT = ColorKt.Color(4293586156L);
        LOCAL_ICON_PILL_DARK = Color;
        LOCAL_ICON_PILL_LIGHT = Color.m675copywmQWz5c$default(0.08f, Color.Black, 14);
    }

    public static final void BrandCardArt(Modifier modifier, InstrumentIcon.LocalBrand localBrand, boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2018518923);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(localBrand) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.standard, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            ImageKt.Image(Countries.painterResource(z ? localBrand.lightResId : localBrand.darkResId, 0, gapComposer), null, SpacerKt.m298padding3ABfNKs(BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.BottomEnd), 12.0f), null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624, 104);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(modifier, localBrand, z, i, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04bf  */
    /* renamed from: CardArtImage-AFY4PWA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3576CardArtImageAFY4PWA(Modifier modifier, InstrumentIcon instrumentIcon, float f, String str, String str2, CardInfoLabelPosition cardInfoLabelPosition, boolean z, Composer composer, int i, int i2) {
        int i3;
        float f2;
        String str3;
        int i4;
        String str4;
        int i5;
        int i6;
        boolean z2;
        CardInfoLabelPosition cardInfoLabelPosition2;
        String str5;
        String str6;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        boolean booleanValue;
        MutableState mutableState;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        State state;
        BiasAlignment biasAlignment;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        HazeState hazeState;
        boolean z4;
        String str7;
        boolean z5;
        boolean z6;
        String str8;
        boolean z7;
        String str9;
        String str10;
        boolean z8;
        boolean z9;
        BiasAlignment biasAlignment2 = Alignment.Companion.BottomStart;
        instrumentIcon.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(768248154);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i3 | (gapComposer.changed(instrumentIcon) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            f2 = f;
            i7 |= gapComposer.changed(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i7 | 3072;
            str3 = str;
        } else {
            str3 = str;
            i4 = i7 | (gapComposer.changed(str3) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 = i4 | 24576;
            str4 = str2;
        } else {
            str4 = str2;
            i5 = i4 | (gapComposer.changed(str4) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i10 = i2 & 32;
        int i11 = 196608;
        if (i10 == 0) {
            if ((196608 & i) == 0) {
                i11 = gapComposer.changed(cardInfoLabelPosition == null ? -1 : cardInfoLabelPosition.ordinal()) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            i6 = i2 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((1572864 & i) == 0) {
                z2 = z;
                i5 |= gapComposer.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
                    if (i8 != 0) {
                        str3 = null;
                    }
                    String str11 = i9 != 0 ? null : str4;
                    CardInfoLabelPosition cardInfoLabelPosition3 = i10 != 0 ? CardInfoLabelPosition.BOTTOM_LEFT : cardInfoLabelPosition;
                    boolean z10 = i6 != 0 ? false : z2;
                    RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f2);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    Boolean valueOf = colors != null ? Boolean.valueOf(colors.isLight) : null;
                    if (valueOf == null) {
                        gapComposer.startReplaceGroup(-447886192);
                        booleanValue = !ImageKt.isSystemInDarkTheme(gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-447887184);
                        gapComposer.end(false);
                        booleanValue = valueOf.booleanValue();
                    }
                    long j = booleanValue ? Color.Black : Color.White;
                    HazeState rememberHazeState = HazeKt.rememberHazeState(gapComposer);
                    boolean z11 = instrumentIcon instanceof InstrumentIcon.LocalIcon;
                    boolean z12 = z11 || (instrumentIcon instanceof InstrumentIcon.LocalBrand);
                    boolean booleanValue2 = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline1.m(z12 || booleanValue2, gapComposer);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue;
                    int i12 = i5;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState3 = (MutableState) rememberedValue2;
                    long j2 = j;
                    NeverEqualPolicy neverEqualPolicy2 = neverEqualPolicy;
                    boolean z13 = booleanValue;
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(150, 0, null, 6), "pillFadeIn", null, gapComposer, 3120, 20);
                    gapComposer = gapComposer;
                    String str12 = str11;
                    Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(ClipKt.clip(OffsetKt.aspectRatio(1.5873016f, modifier, false), m340RoundedCornerShape0680j_4), 1.0f, Color.m675copywmQWz5c$default(0.06f, j2, 14), m340RoundedCornerShape0680j_4);
                    BiasAlignment biasAlignment3 = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment3, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$16);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    String str13 = str3;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
                    boolean z14 = instrumentIcon instanceof InstrumentIcon.RemoteIcon;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (z14) {
                        gapComposer.startReplaceGroup(-1139282305);
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        InstrumentIcon.RemoteIcon remoteIcon = (InstrumentIcon.RemoteIcon) instrumentIcon;
                        boolean z15 = str13 != null;
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                        if (rememberedValue3 == neverEqualPolicy2) {
                            neverEqualPolicy2 = neverEqualPolicy2;
                            z9 = false;
                            rememberedValue3 = new CardArtImageKt$$ExternalSyntheticLambda0(mutableState3, mutableState2, (int) (0 == true ? 1 : 0));
                            gapComposer.updateRememberedValue(rememberedValue3);
                        } else {
                            neverEqualPolicy2 = neverEqualPolicy2;
                            z9 = false;
                        }
                        state = animateFloatAsState;
                        mutableState = mutableState3;
                        biasAlignment = biasAlignment3;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                        m3577RemoteCardArtFHprtrg(fillMaxSize, remoteIcon, m340RoundedCornerShape0680j_4, rememberHazeState, j2, z15, (Function1) rememberedValue3, gapComposer, (i12 & 112) | 1572870);
                        hazeState = rememberHazeState;
                        gapComposer = gapComposer;
                        gapComposer.end(z9);
                        z4 = z13;
                    } else {
                        mutableState = mutableState3;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                        state = animateFloatAsState;
                        biasAlignment = biasAlignment3;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                        hazeState = rememberHazeState;
                        if (instrumentIcon instanceof InstrumentIcon.LocalBrand) {
                            gapComposer.startReplaceGroup(-1138868393);
                            z4 = z13;
                            BrandCardArt(SizeKt.fillMaxSize(companion, 1.0f), (InstrumentIcon.LocalBrand) instrumentIcon, z4, gapComposer, (i12 & 112) | 6);
                            gapComposer.end(false);
                        } else {
                            z4 = z13;
                            if (z11) {
                                gapComposer.startReplaceGroup(-1138725793);
                                DefaultCardArt(SizeKt.fillMaxSize(companion, 1.0f), gapComposer, 6);
                                gapComposer.end(false);
                            } else {
                                if (!(instrumentIcon instanceof InstrumentIcon.Savings)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1210173385, false);
                                }
                                gapComposer.startReplaceGroup(-1138623617);
                                DefaultCardArt(SizeKt.fillMaxSize(companion, 1.0f), gapComposer, 6);
                                gapComposer.end(false);
                            }
                        }
                    }
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (z12) {
                        gapComposer.startReplaceGroup(-1138473391);
                        int ordinal = cardInfoLabelPosition3.ordinal();
                        if (ordinal != 0) {
                            z6 = true;
                            if (ordinal != 1) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1210201041, false);
                            }
                            gapComposer.startReplaceGroup(-1137600090);
                            if (str12 == null) {
                                gapComposer.startReplaceGroup(-1137587288);
                                z7 = false;
                                gapComposer.end(false);
                                str7 = str12;
                            } else {
                                z7 = false;
                                gapComposer.startReplaceGroup(-1137587287);
                                str7 = str12;
                                CardNameLabel(0, gapComposer, SpacerKt.m299paddingVpY3zN4(boxScopeInstance.align(companion, biasAlignment), 18.0f, 16.0f), str7);
                                gapComposer.end(false);
                            }
                            if (str13 == null) {
                                gapComposer.startReplaceGroup(-1137338048);
                                gapComposer.end(z7);
                                str10 = str13;
                                z8 = z10;
                            } else {
                                gapComposer.startReplaceGroup(-1137338047);
                                boolean z16 = z10;
                                CardInfoPill(str13, true, hazeState, z4, SpacerKt.m299paddingVpY3zN4(boxScopeInstance.align(companion, biasAlignment2), 18.0f, 16.0f), z16, gapComposer, ((i12 >> 3) & 458752) | 48, 0);
                                str10 = str13;
                                z8 = z16;
                                z7 = false;
                                gapComposer.end(false);
                            }
                            gapComposer.end(z7);
                            str9 = str10;
                            z5 = z8;
                        } else {
                            HazeState hazeState2 = hazeState;
                            boolean z17 = z10;
                            z6 = true;
                            gapComposer.startReplaceGroup(-1138432347);
                            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(boxScopeInstance.align(companion, biasAlignment), 1.0f), 18.0f, 16.0f);
                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$1, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$12);
                            if (str12 == null) {
                                gapComposer.startReplaceGroup(1371089);
                                z7 = false;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(1371090);
                                z7 = false;
                                CardNameLabel(0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), str12);
                                gapComposer.end(false);
                            }
                            if (str13 == null) {
                                gapComposer.startReplaceGroup(1526647);
                                gapComposer.end(z7);
                                str9 = str13;
                                str7 = str12;
                                z5 = z17;
                            } else {
                                gapComposer.startReplaceGroup(1526648);
                                str7 = str12;
                                CardInfoPill(str13, true, hazeState2, z4, null, z17, gapComposer, ((i12 >> 3) & 458752) | 48, 16);
                                str9 = str13;
                                z5 = z17;
                                gapComposer.end(z7);
                            }
                            gapComposer.end(true);
                            gapComposer.end(z7);
                        }
                        gapComposer.end(z7);
                        str8 = str9;
                    } else {
                        str7 = str12;
                        z5 = z10;
                        boolean z18 = false;
                        z6 = true;
                        gapComposer.startReplaceGroup(-1136895522);
                        if (str13 == null) {
                            gapComposer.startReplaceGroup(-1136895523);
                            gapComposer.end(false);
                            str8 = str13;
                        } else {
                            gapComposer.startReplaceGroup(-1136895522);
                            int ordinal2 = cardInfoLabelPosition3.ordinal();
                            if (ordinal2 == 0) {
                                biasAlignment2 = Alignment.Companion.TopEnd;
                            } else if (ordinal2 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            boolean z19 = !((Boolean) mutableState.getValue()).booleanValue();
                            Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(boxScopeInstance.align(companion, biasAlignment2), 18.0f, 16.0f);
                            State state2 = state;
                            boolean changed = gapComposer.changed(state2);
                            Object rememberedValue4 = gapComposer.rememberedValue();
                            if (changed || rememberedValue4 == neverEqualPolicy2) {
                                rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda10(state2, 11);
                                gapComposer.updateRememberedValue(rememberedValue4);
                            }
                            str8 = str13;
                            CardInfoPill(str8, false, hazeState, z19, ColorKt.graphicsLayer(m299paddingVpY3zN42, (Function1) rememberedValue4), false, gapComposer, 48, 32);
                            z18 = false;
                            gapComposer.end(false);
                        }
                        gapComposer.end(z18);
                    }
                    gapComposer.end(z6);
                    str6 = str7;
                    z3 = z5;
                    str5 = str8;
                    cardInfoLabelPosition2 = cardInfoLabelPosition3;
                } else {
                    gapComposer.skipToGroupEnd();
                    cardInfoLabelPosition2 = cardInfoLabelPosition;
                    str5 = str3;
                    str6 = str4;
                    z3 = z2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda0(modifier, instrumentIcon, f, str5, str6, cardInfoLabelPosition2, z3, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 |= i11;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardInfoPill(final String str, final boolean z, final HazeState hazeState, final boolean z2, Modifier modifier, boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z4;
        GapComposer gapComposer;
        final Modifier modifier3;
        final boolean z5;
        RecomposeScopeImpl endRestartGroup;
        long j;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-456212056);
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer3.changed(hazeState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer3.changed(z2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer3.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z4 = z3;
                i3 |= gapComposer3.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
                if (gapComposer3.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    Modifier modifier4 = Modifier.Companion.$$INSTANCE;
                    Modifier modifier5 = i5 != 0 ? modifier4 : modifier2;
                    boolean z6 = i4 != 0 ? false : z4;
                    boolean z7 = Build.VERSION.SDK_INT >= 32 && !((Boolean) gapComposer3.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    if (z) {
                        gapComposer3.startReplaceGroup(-1736400417);
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        j = colors.semantic.text.standard;
                        gapComposer3.end(false);
                    } else if (z2) {
                        gapComposer3.startReplaceGroup(-1736280323);
                        gapComposer3.end(false);
                        j = Color.Black;
                    } else {
                        gapComposer3.startReplaceGroup(-1736315043);
                        gapComposer3.end(false);
                        j = Color.White;
                    }
                    long j2 = j;
                    Modifier clip = ClipKt.clip(SizeKt.wrapContentSize$default(modifier5, null, 3), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(100.0f));
                    if (!z || z6) {
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                        if (z && z6) {
                            gapComposer2 = gapComposer3;
                            modifier4 = ImageKt.m177backgroundbw27NRU(modifier4, !z2 ? LOCAL_ICON_PILL_DARK : LOCAL_ICON_PILL_LIGHT, rectangleShapeKt$RectangleShape$1);
                        } else {
                            gapComposer2 = gapComposer3;
                            if (z7) {
                                modifier4 = HazeKt.hazeEffect$default(hazeState, new HazeStyle(0L, CollectionsKt__CollectionsKt.listOf((Object[]) new HazeTint[]{new HazeTint(!z2 ? HAZE_DARK_BACKGROUND_COLOR : HAZE_LIGHT_BACKGROUND_COLOR, !z2 ? 15 : 18, null), new HazeTint(!z2 ? Color.m675copywmQWz5c$default(0.55f, HAZE_DARK_FOREGROUND_COLOR, 14) : Color.m675copywmQWz5c$default(0.44f, HAZE_LIGHT_FOREGROUND_COLOR, 14))}), 25));
                            } else {
                                modifier4 = ImageKt.m177backgroundbw27NRU(modifier4, !z2 ? HAZE_FALLBACK_DARK : HAZE_FALLBACK_LIGHT, rectangleShapeKt$RectangleShape$1);
                            }
                        }
                    } else {
                        gapComposer2 = gapComposer3;
                    }
                    gapComposer = gapComposer2;
                    Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4080, j2, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(clip.then(modifier4), 12.0f, 4.0f), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    modifier3 = modifier5;
                    z5 = z6;
                } else {
                    gapComposer = gapComposer3;
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z4;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.instruments.views.CardArtImageKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            CardArtImageKt.CardInfoPill(str, z, hazeState, z2, modifier3, z5, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            z4 = z3;
            if (gapComposer3.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z4 = z3;
        if (gapComposer3.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CardNameLabel(int i, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(287409291);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(2, 1, 0, 0, (i2 & 14) | 1769472, 0, 3984, colors.semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(modifier, 12.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(str, modifier, i, 7);
        }
    }

    public static final void DefaultCardArt(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1559381419);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.standard, ColorKt.RectangleShape), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 19);
        }
    }

    /* renamed from: RemoteCardArt-FHprtrg, reason: not valid java name */
    public static final void m3577RemoteCardArtFHprtrg(Modifier modifier, InstrumentIcon.RemoteIcon remoteIcon, RoundedCornerShape roundedCornerShape, HazeState hazeState, long j, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(145616919);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(remoteIcon) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(roundedCornerShape) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(hazeState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(j) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Modifier hazeSource$default = HazeKt.hazeSource$default(modifier, hazeState);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, hazeSource$default);
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
            int i3 = i2;
            String str = remoteIcon.iconUrl;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            boolean z2 = ((i3 & 3670016) == 1048576) | ((458752 & i3) == 131072);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SliderKt$$ExternalSyntheticLambda5(z, function1, 5);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            AsyncImageKt.m1442AsyncImagex1rPTaM(str, fillMaxSize, null, null, null, (Function1) rememberedValue, ContentScale.Companion.FillWidth, gapComposer2, 432, 6, 31608);
            gapComposer = gapComposer2;
            BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), roundedCornerShape), new LinearGradient(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14)), new Color(Color.m675copywmQWz5c$default(0.03f, j, 14))}), null, 0L, 9187343241974906880L), null, 6), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AndroidMenu_androidKt$$ExternalSyntheticLambda2(modifier, remoteIcon, roundedCornerShape, hazeState, j, z, function1, i);
        }
    }
}
