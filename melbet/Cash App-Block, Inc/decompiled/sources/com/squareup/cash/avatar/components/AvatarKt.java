package com.squareup.cash.avatar.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.image.ImageLoadingStatus;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AvatarKt {
    /* renamed from: Avatar-8xTau9I, reason: not valid java name */
    public static final void m3404Avatar8xTau9I(final Modifier modifier, final String str, final Color color, final ColorFilter colorFilter, final long j, final Character ch, final String str2, final TextStyle textStyle, final Shape shape, final Function3 function3, final long j2, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        final String str3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-591766187);
        int i4 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(color) ? 256 : 128) | (gapComposer.changed(colorFilter) ? 2048 : 1024) | (gapComposer.changed(j) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(ch) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(str2) ? 8388608 : 4194304) | (gapComposer.changed(textStyle) ? 67108864 : 33554432) | (gapComposer.changed(shape) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (gapComposer.changedInstance(function3) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(j2) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(ImageLoadingStatus.Unloaded.INSTANCE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            if (str2 == null) {
                str3 = ch != null ? String.valueOf(ch.charValue()) : null;
            } else {
                str3 = str2;
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-944527856, new Function2() { // from class: com.squareup.cash.avatar.components.AvatarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2);
                    Applier applier = gapComposer2.applier;
                    if (shouldExecute) {
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.this);
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
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier clip = ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), shape);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, clip);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        String str4 = str;
                        String str5 = str3;
                        Function2 function22 = function2;
                        long j3 = j2;
                        TextStyle textStyle2 = textStyle;
                        long j4 = j;
                        if (str4 != null) {
                            gapComposer2.startReplaceGroup(50791471);
                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.Empty) {
                                rememberedValue2 = new CashCardKt$$ExternalSyntheticLambda0(4, mutableState);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            }
                            zzmn.m2026FoundationRemoteImageNXws8ko(function3, str4, fillMaxSize, null, ContentScale.Companion.Crop, null, (Function1) rememberedValue2, colorFilter, color, null, null, Expect_jvmKt.rememberComposableLambda(1261655059, new AvatarKt$$ExternalSyntheticLambda3(str5, function22, j3, textStyle2, j4), gapComposer2), gapComposer2, 1597824, 48, 1576);
                            gapComposer2 = gapComposer2;
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(51530728);
                            AvatarKt.m3406MonogramOrPlaceholderXxnsNlY(str5, function22, j3, textStyle2, j4, gapComposer2, 0);
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(true);
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, color, colorFilter, j, ch, str2, textStyle, shape, function3, j2, function2, i, i2) { // from class: com.squareup.cash.avatar.components.AvatarKt$$ExternalSyntheticLambda1
                public final /* synthetic */ String f$1;
                public final /* synthetic */ Function3 f$10;
                public final /* synthetic */ long f$11;
                public final /* synthetic */ Function2 f$12;
                public final /* synthetic */ int f$14;
                public final /* synthetic */ Color f$2;
                public final /* synthetic */ ColorFilter f$3;
                public final /* synthetic */ long f$5;
                public final /* synthetic */ Character f$6;
                public final /* synthetic */ String f$7;
                public final /* synthetic */ TextStyle f$8;
                public final /* synthetic */ Shape f$9;

                {
                    this.f$14 = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(24583);
                    int updateChangedFlags2 = Updater.updateChangedFlags(this.f$14);
                    AvatarKt.m3404Avatar8xTau9I(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: Monogram-sW7UJKQ, reason: not valid java name */
    public static final void m3405MonogramsW7UJKQ(Modifier modifier, long j, String str, TextStyle textStyle, Composer composer, int i) {
        int i2;
        String str2;
        GapComposer gapComposer;
        Modifier wrapContentHeight;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(738390733);
        if ((i & 48) == 0) {
            i2 = (gapComposer2.changed(j) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            str2 = str;
            i2 |= gapComposer2.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        int i3 = i2 | (gapComposer2.changed(textStyle) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            wrapContentHeight = SizeKt.wrapContentHeight(ImageKt.m177backgroundbw27NRU(modifier, j, ColorKt.RectangleShape), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            gapComposer = gapComposer2;
            KeypadKt.m3639AutoScaleTextgQjefEo(str2, wrapContentHeight, textStyle, MooncakeTheme.getColors(gapComposer2).primaryButtonTint, 0, 3, Room.getSp(12), 0, gapComposer, ((i3 >> 6) & 14) | 1572864 | ((i3 >> 3) & 896), 144);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda6(modifier, j, str, textStyle, i);
        }
    }

    /* renamed from: MonogramOrPlaceholder-XxnsNlY, reason: not valid java name */
    public static final void m3406MonogramOrPlaceholderXxnsNlY(String str, Function2 function2, long j, TextStyle textStyle, long j2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1853183531);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function2) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(textStyle) ? 2048 : 1024) | (gapComposer.changed((Object) null) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(j2) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (!gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            gapComposer.skipToGroupEnd();
        } else if (str != null) {
            gapComposer.startReplaceGroup(681225480);
            m3405MonogramsW7UJKQ(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), j, str, textStyle, gapComposer, ((i2 >> 3) & 112) | 6 | ((i2 << 6) & 896) | (i2 & 7168));
            gapComposer.end(false);
        } else if (function2 == null) {
            gapComposer.startReplaceGroup(681434916);
            m3407PlaceholderAvatarFNF3uiM((i2 >> 9) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, j2, gapComposer, null);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(681583034);
            Recorder$$ExternalSyntheticOutline1.m((i2 >> 3) & 14, function2, gapComposer, false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda3(str, function2, j, textStyle, j2, i);
        }
    }

    /* renamed from: PlaceholderAvatar-FNF3uiM, reason: not valid java name */
    public static final void m3407PlaceholderAvatarFNF3uiM(int i, long j, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2132378733);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed((Object) null) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            int i3 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i3 == 0 || gapComposer.getDefaultsInvalid()) {
                modifier = companion;
            } else {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(modifier, 1.0f), j, ColorKt.RectangleShape);
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
            Modifier fillMaxSize = SizeKt.fillMaxSize(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), 0.6f);
            Painter painterResource = Countries.painterResource(R.drawable.mooncake_person, 0, gapComposer);
            long Color = ColorKt.Color(BodyPartID.bodyIdMax);
            ImageKt.Image(painterResource, null, fillMaxSize, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(Color, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda5(modifier, j, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r15.changed(r9) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r15.changed(r26) == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc A[LOOP:0: B:54:0x01ca->B:55:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e8 A[LOOP:1: B:58:0x01e6->B:59:0x01e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0060  */
    /* renamed from: rememberMoneybotSpotlightBrush-cbhI11c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Brush m3408rememberMoneybotSpotlightBrushcbhI11c(String str, TextStyle textStyle, float f, long j, float f2, float f3, Composer composer, int i, int i2) {
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        char c;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z4;
        float f4;
        Colors colors;
        boolean z5;
        Object rememberedValue2;
        float f5;
        float f6;
        str.getClass();
        textStyle.getClass();
        float f7 = (i2 & 16) != 0 ? 1.0f : f2;
        float f8 = (i2 & 32) != 0 ? 300.0f : f3;
        TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(composer);
        GapComposer gapComposer = (GapComposer) composer;
        float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f8);
        boolean z6 = true;
        if (((i & 14) ^ 6) > 4) {
            str2 = str;
        } else {
            str2 = str;
        }
        if ((i & 6) != 4) {
            z = false;
            if (((i & 112) ^ 48) <= 32) {
            }
            if ((i & 48) != 32) {
                z2 = false;
                z3 = z | z2;
                rememberedValue = gapComposer.rememberedValue();
                neverEqualPolicy = Composer.Companion.Empty;
                if (!z3 || rememberedValue == neverEqualPolicy) {
                    c = ' ';
                    neverEqualPolicy2 = neverEqualPolicy;
                    z4 = false;
                    f4 = 1.0f;
                    rememberedValue = Float.valueOf((int) (TextMeasurer.m979measurewNUYSr0$default(rememberTextMeasurer, str2, textStyle, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size >> 32));
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    c = ' ';
                    z4 = false;
                    neverEqualPolicy2 = neverEqualPolicy;
                    f4 = 1.0f;
                }
                float floatValue = ((Number) rememberedValue).floatValue();
                colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z4);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z4);
                }
                long Color = ColorKt.Color(colors.isLight ? 4293454056L : 4294967295L);
                boolean changed = ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && gapComposer.changed(f)) || (i & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer.changed(floatValue) | gapComposer.changed(mo236toPx0680j_4) | ((((i & 7168) ^ 3072) <= 2048 && gapComposer.changed(j)) || (i & 3072) == 2048) | gapComposer.changed(Color);
                if ((((57344 & i) ^ 24576) > 16384 || !gapComposer.changed(f7)) && (i & 24576) != 16384) {
                    z6 = false;
                }
                z5 = changed | z6;
                rememberedValue2 = gapComposer.rememberedValue();
                if (!z5 || rememberedValue2 == neverEqualPolicy2) {
                    long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(f7, j, 14);
                    long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(f7, Color, 14);
                    float f9 = (mo236toPx0680j_4 / ((mo236toPx0680j_4 * 2.0f) + floatValue)) / 2.0f;
                    Pair pair = new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new Color(m675copywmQWz5c$default));
                    f5 = f - f9;
                    if (f5 < RecyclerView.DECELERATION_RATE) {
                        f5 = 0.0f;
                    }
                    Pair pair2 = new Pair(Float.valueOf(f5), new Color(m675copywmQWz5c$default));
                    Pair pair3 = new Pair(Float.valueOf(f), new Color(m675copywmQWz5c$default2));
                    f6 = f + f9;
                    if (f6 > f4) {
                        f6 = f4;
                    }
                    Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{pair, pair2, pair3, new Pair(Float.valueOf(f6), new Color(m675copywmQWz5c$default)), new Pair(Float.valueOf(f4), new Color(m675copywmQWz5c$default))}, 5);
                    long floatToRawIntBits = (Float.floatToRawIntBits(-mo236toPx0680j_4) << c) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(floatValue + mo236toPx0680j_4) << c) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
                    ArrayList arrayList = new ArrayList(pairArr.length);
                    for (Pair pair4 : pairArr) {
                        arrayList.add(new Color(((Color) pair4.second).value));
                    }
                    ArrayList arrayList2 = new ArrayList(pairArr.length);
                    for (Pair pair5 : pairArr) {
                        arrayList2.add(Float.valueOf(((Number) pair5.first).floatValue()));
                    }
                    rememberedValue2 = new LinearGradient(arrayList, arrayList2, floatToRawIntBits, floatToRawIntBits2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                return (Brush) rememberedValue2;
            }
            z2 = true;
            z3 = z | z2;
            rememberedValue = gapComposer.rememberedValue();
            neverEqualPolicy = Composer.Companion.Empty;
            if (z3) {
            }
            c = ' ';
            neverEqualPolicy2 = neverEqualPolicy;
            z4 = false;
            f4 = 1.0f;
            rememberedValue = Float.valueOf((int) (TextMeasurer.m979measurewNUYSr0$default(rememberTextMeasurer, str2, textStyle, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size >> 32));
            gapComposer.updateRememberedValue(rememberedValue);
            float floatValue2 = ((Number) rememberedValue).floatValue();
            colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
            }
            long Color2 = ColorKt.Color(colors.isLight ? 4293454056L : 4294967295L);
            boolean changed2 = ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && gapComposer.changed(f)) || (i & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer.changed(floatValue2) | gapComposer.changed(mo236toPx0680j_4) | ((((i & 7168) ^ 3072) <= 2048 && gapComposer.changed(j)) || (i & 3072) == 2048) | gapComposer.changed(Color2);
            if (((57344 & i) ^ 24576) > 16384) {
            }
            z6 = false;
            z5 = changed2 | z6;
            rememberedValue2 = gapComposer.rememberedValue();
            if (!z5) {
            }
            long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(f7, j, 14);
            long m675copywmQWz5c$default22 = Color.m675copywmQWz5c$default(f7, Color2, 14);
            float f92 = (mo236toPx0680j_4 / ((mo236toPx0680j_4 * 2.0f) + floatValue2)) / 2.0f;
            Pair pair6 = new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new Color(m675copywmQWz5c$default3));
            f5 = f - f92;
            if (f5 < RecyclerView.DECELERATION_RATE) {
            }
            Pair pair22 = new Pair(Float.valueOf(f5), new Color(m675copywmQWz5c$default3));
            Pair pair32 = new Pair(Float.valueOf(f), new Color(m675copywmQWz5c$default22));
            f6 = f + f92;
            if (f6 > f4) {
            }
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(new Pair[]{pair6, pair22, pair32, new Pair(Float.valueOf(f6), new Color(m675copywmQWz5c$default3)), new Pair(Float.valueOf(f4), new Color(m675copywmQWz5c$default3))}, 5);
            long floatToRawIntBits3 = (Float.floatToRawIntBits(-mo236toPx0680j_4) << c) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
            long floatToRawIntBits22 = (Float.floatToRawIntBits(floatValue2 + mo236toPx0680j_4) << c) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
            ArrayList arrayList3 = new ArrayList(pairArr2.length);
            while (r11 < r1) {
            }
            ArrayList arrayList22 = new ArrayList(pairArr2.length);
            while (r11 < r1) {
            }
            rememberedValue2 = new LinearGradient(arrayList3, arrayList22, floatToRawIntBits3, floatToRawIntBits22);
            gapComposer.updateRememberedValue(rememberedValue2);
            return (Brush) rememberedValue2;
        }
        z = true;
        if (((i & 112) ^ 48) <= 32) {
        }
        if ((i & 48) != 32) {
        }
        z2 = true;
        z3 = z | z2;
        rememberedValue = gapComposer.rememberedValue();
        neverEqualPolicy = Composer.Companion.Empty;
        if (z3) {
        }
        c = ' ';
        neverEqualPolicy2 = neverEqualPolicy;
        z4 = false;
        f4 = 1.0f;
        rememberedValue = Float.valueOf((int) (TextMeasurer.m979measurewNUYSr0$default(rememberTextMeasurer, str2, textStyle, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size >> 32));
        gapComposer.updateRememberedValue(rememberedValue);
        float floatValue22 = ((Number) rememberedValue).floatValue();
        colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
        }
        long Color22 = ColorKt.Color(colors.isLight ? 4293454056L : 4294967295L);
        boolean changed22 = ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && gapComposer.changed(f)) || (i & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer.changed(floatValue22) | gapComposer.changed(mo236toPx0680j_4) | ((((i & 7168) ^ 3072) <= 2048 && gapComposer.changed(j)) || (i & 3072) == 2048) | gapComposer.changed(Color22);
        if (((57344 & i) ^ 24576) > 16384) {
        }
        z6 = false;
        z5 = changed22 | z6;
        rememberedValue2 = gapComposer.rememberedValue();
        if (!z5) {
        }
        long m675copywmQWz5c$default32 = Color.m675copywmQWz5c$default(f7, j, 14);
        long m675copywmQWz5c$default222 = Color.m675copywmQWz5c$default(f7, Color22, 14);
        float f922 = (mo236toPx0680j_4 / ((mo236toPx0680j_4 * 2.0f) + floatValue22)) / 2.0f;
        Pair pair62 = new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new Color(m675copywmQWz5c$default32));
        f5 = f - f922;
        if (f5 < RecyclerView.DECELERATION_RATE) {
        }
        Pair pair222 = new Pair(Float.valueOf(f5), new Color(m675copywmQWz5c$default32));
        Pair pair322 = new Pair(Float.valueOf(f), new Color(m675copywmQWz5c$default222));
        f6 = f + f922;
        if (f6 > f4) {
        }
        Pair[] pairArr22 = (Pair[]) Arrays.copyOf(new Pair[]{pair62, pair222, pair322, new Pair(Float.valueOf(f6), new Color(m675copywmQWz5c$default32)), new Pair(Float.valueOf(f4), new Color(m675copywmQWz5c$default32))}, 5);
        long floatToRawIntBits32 = (Float.floatToRawIntBits(-mo236toPx0680j_4) << c) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
        long floatToRawIntBits222 = (Float.floatToRawIntBits(floatValue22 + mo236toPx0680j_4) << c) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
        ArrayList arrayList32 = new ArrayList(pairArr22.length);
        while (r11 < r1) {
        }
        ArrayList arrayList222 = new ArrayList(pairArr22.length);
        while (r11 < r1) {
        }
        rememberedValue2 = new LinearGradient(arrayList32, arrayList222, floatToRawIntBits32, floatToRawIntBits222);
        gapComposer.updateRememberedValue(rememberedValue2);
        return (Brush) rememberedValue2;
    }

    public static final int visibleLinesAverageMainAxisSize(LazyGridMeasureResult lazyGridMeasureResult) {
        Orientation orientation = lazyGridMeasureResult.orientation;
        List list = lazyGridMeasureResult.visibleItemsInfo;
        boolean z = orientation == Orientation.Vertical;
        if (list.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) list.get(i);
            int i4 = z ? lazyGridMeasuredItem.row : lazyGridMeasuredItem.column;
            if (i4 == -1) {
                i++;
            } else {
                int i5 = 0;
                while (i < list.size()) {
                    LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) list.get(i);
                    if ((z ? lazyGridMeasuredItem2.row : lazyGridMeasuredItem2.column) != i4) {
                        break;
                    }
                    i5 = Math.max(i5, (int) (z ? ((LazyGridMeasuredItem) list.get(i)).size & BodyPartID.bodyIdMax : ((LazyGridMeasuredItem) list.get(i)).size >> 32));
                    i++;
                }
                i2 += i5;
                i3++;
            }
        }
        return (i2 / i3) + lazyGridMeasureResult.mainAxisItemSpacing;
    }
}
