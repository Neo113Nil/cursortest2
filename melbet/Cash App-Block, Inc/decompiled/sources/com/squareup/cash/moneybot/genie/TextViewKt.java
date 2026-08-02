package com.squareup.cash.moneybot.genie;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1;
import androidx.compose.material3.Typography;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.memory.RealWeakMemoryCache;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.components.avatar.AvatarKt$Avatar$5$1$1;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.AvatarSizeImpl;
import com.squareup.cash.arcade.components.avatar.AvatarSizeOverride;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.pools.views.PoolAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import com.squareup.util.compose.ModifierKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt___StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieViewState;

/* loaded from: classes5.dex */
public abstract class TextViewKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Avatar(AvatarSize avatarSize, AvatarEntry avatarEntry, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        int i4;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        boolean z4;
        boolean z5;
        int i5;
        avatarSize.getClass();
        avatarEntry.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1023986719);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(avatarSize.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(avatarEntry) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    z2 = z;
                    if (gapComposer.changed(z2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    z2 = z;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                z2 = z;
            }
            i4 = i3 | 24576;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Modifier modifier3 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        z4 = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        i4 &= -7169;
                    } else {
                        z4 = z2;
                    }
                    z5 = z4;
                    modifier2 = modifier3;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    z5 = z2;
                }
                gapComposer.endDefaults();
                String str = avatarEntry.monogram;
                int i7 = i4;
                long j = avatarEntry.backgroundColor;
                AvatarOverlay avatarOverlay = avatarEntry.badge;
                AvatarImage avatarImage = avatarEntry.avatarImage;
                ComposableLambdaImpl avatarOverrideContentFor = avatarOverrideContentFor(avatarEntry, new AvatarSizeImpl(avatarSize.size, avatarSize.iconSize, avatarSize.textSize, avatarSize.badgeOffset, 24.0f, 4.0f), gapComposer);
                String str2 = avatarEntry.contentDescription;
                Color color = avatarEntry.borderColor;
                m3613AvatarB_rZmmc(avatarSize, str, j, str2, modifier2, avatarImage, avatarOverrideContentFor, avatarOverlay, z5, color != null ? color.value : Color.Unspecified, gapComposer, (i7 & 14) | (57344 & (i7 << 6)) | ((i7 << 15) & 234881024), (i7 >> 12) & 14, 0);
                z3 = z5;
            }
            Modifier modifier4 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0((Serializable) avatarSize, (Object) avatarEntry, modifier4, z3, i, i2, 12);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i3 | 24576;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        Modifier modifier42 = modifier2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: Avatar-B_rZmmc, reason: not valid java name */
    public static final void m3614AvatarB_rZmmc(AvatarSizeImpl avatarSizeImpl, final String str, final long j, final String str2, final Modifier modifier, final AvatarImage avatarImage, Function2 function2, final AvatarOverlay avatarOverlay, final boolean z, final long j2, final boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        AvatarSizeImpl avatarSizeImpl2;
        final Function2 function22;
        int i5;
        boolean z3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Modifier m1458clippedOutlinewH6b6FI$default;
        boolean z4;
        float f;
        boolean z5;
        float f2 = avatarSizeImpl.size;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1203767334);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(avatarSizeImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changed(avatarImage) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer.changed(avatarOverlay) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer.changed(z) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= gapComposer.changed(j2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer.changed(z2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (gapComposer.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                i5 = 1;
                rememberedValue = new ArrayMap(1);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                i5 = 1;
            }
            ArrayMap arrayMap = (ArrayMap) rememberedValue;
            RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(i5);
            gapComposer.startReplaceGroup(-471038051);
            BiasAlignment biasAlignment = Alignment.Companion.BottomEnd;
            boolean changed = gapComposer.changed(str2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                z3 = false;
                rememberedValue2 = new AvatarKt$Avatar$5$1$1(str2, 0);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                z3 = false;
            }
            Modifier recordVerticalCenter = AlignmentLinesKt.recordVerticalCenter(SemanticsModifierKt.semantics(modifier, z3, (Function1) rememberedValue2), AlignmentLinesKt.InteractiveCenter, arrayMap);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, recordVerticalCenter);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            float f3 = z ? 1.0f : 0.4f;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier alpha = AlphaKt.alpha(companion, f3);
            if (j2 != 16) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                m1458clippedOutlinewH6b6FI$default = ImageKt.m178borderxT4_qwU(companion, 1.0f, j2, RoundedCornerShapeKt.CircleShape);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                m1458clippedOutlinewH6b6FI$default = RealWeakMemoryCache.m1458clippedOutlinewH6b6FI$default(realWeakMemoryCache, companion, RoundedCornerShapeKt.CircleShape, 2);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ModifierKt.clipOffscreen(SizeKt.m285size3ABfNKs(alpha.then(m1458clippedOutlinewH6b6FI$default), f2), RoundedCornerShapeKt.CircleShape), j, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
            if (function2 != null) {
                gapComposer.startReplaceGroup(-238142185);
                function22 = function2;
                Updater.CompositionLocalProvider(LocalEnabledStateKt.LocalEnabledState.defaultProvidedValue$runtime(Boolean.valueOf(z)), Expect_jvmKt.rememberComposableLambda(460446368, new DatePickerKt$DatePickerHeader$1$1(7, function22), gapComposer), gapComposer, 56);
                gapComposer.end(false);
                z5 = true;
                avatarSizeImpl2 = avatarSizeImpl;
                z4 = false;
                f = f2;
            } else {
                function22 = function2;
                if (avatarImage != null) {
                    gapComposer.startReplaceGroup(-238010032);
                    z4 = false;
                    f = f2;
                    z5 = true;
                    m3617Imageww6aTOc(avatarImage, avatarSizeImpl, str, j, z2, gapComposer, 0);
                    gapComposer.end(false);
                    avatarSizeImpl2 = avatarSizeImpl;
                } else {
                    z4 = false;
                    f = f2;
                    z5 = true;
                    gapComposer.startReplaceGroup(-237897192);
                    m3619MonogramXOJAsU(str, avatarSizeImpl, j, gapComposer, 0);
                    avatarSizeImpl2 = avatarSizeImpl;
                    gapComposer.end(false);
                }
            }
            gapComposer.end(z5);
            if (avatarOverlay != null) {
                gapComposer.startReplaceGroup(-2073306070);
                if (Dp.m1037equalsimpl0(avatarSizeImpl2.badgeOffset, Float.NaN)) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Avatar size ", Dp.m1038toStringimpl(f), " does not support badges."));
                    return;
                } else {
                    m3616BadgemkeQTyY(realWeakMemoryCache, avatarOverlay, avatarSizeImpl2.badgeOffset, avatarSizeImpl2.badgeSize, avatarSizeImpl2.badgePadding, z, gapComposer, 0);
                    gapComposer.end(z4);
                }
            } else {
                gapComposer.startReplaceGroup(-2073066781);
                gapComposer.end(z4);
            }
            gapComposer.end(z5);
            gapComposer.end(z4);
        } else {
            avatarSizeImpl2 = avatarSizeImpl;
            function22 = function2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final AvatarSizeImpl avatarSizeImpl3 = avatarSizeImpl2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    TextViewKt.m3614AvatarB_rZmmc(AvatarSizeImpl.this, str, j, str2, modifier, avatarImage, function22, avatarOverlay, z, j2, z2, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: Badge-mkeQTyY, reason: not valid java name */
    public static final void m3616BadgemkeQTyY(final RealWeakMemoryCache realWeakMemoryCache, final AvatarOverlay avatarOverlay, final float f, final float f2, final float f3, final boolean z, Composer composer, final int i) {
        GapComposer gapComposer;
        Color color;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1061780607);
        int i2 = 2;
        int i3 = i | (gapComposer2.changedInstance(realWeakMemoryCache) ? 4 : 2) | (gapComposer2.changed(avatarOverlay) ? 32 : 16) | (gapComposer2.changed(f) ? 256 : 128) | (gapComposer2.changed(f2) ? 2048 : 1024) | (gapComposer2.changed(f3) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = avatarOverlay instanceof AvatarOverlay.RemoteImage;
            String str = null;
            AvatarOverlay.RemoteImage remoteImage = z2 ? (AvatarOverlay.RemoteImage) avatarOverlay : null;
            AvatarOverlay.Local local = remoteImage != null ? remoteImage.placeholder : null;
            if (local == null) {
                gapComposer2.startReplaceGroup(-927874959);
                gapComposer2.end(false);
                color = null;
            } else {
                gapComposer2.startReplaceGroup(-1831046768);
                long m3384backgroundColorWaAFU9c = local.m3384backgroundColorWaAFU9c(gapComposer2);
                gapComposer2.end(false);
                color = new Color(m3384backgroundColorWaAFU9c);
            }
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(SizeKt.m285size3ABfNKs(modifier, f2), f, f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Modifier clipOffscreen = ModifierKt.clipOffscreen(AlphaKt.alpha(realWeakMemoryCache.m1459clippedOutlinewH6b6FI(m272offsetVpY3zN4, roundedCornerShape, 2.0f), z ? 1.0f : 0.4f), roundedCornerShape);
            if (color != null) {
                modifier = ImageKt.m177backgroundbw27NRU(modifier, color.value, ColorKt.RectangleShape);
            }
            Modifier then = clipOffscreen.then(modifier);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f3, f3, f3, f3);
            long m3384backgroundColorWaAFU9c2 = avatarOverlay.m3384backgroundColorWaAFU9c(gapComposer2);
            if (!(avatarOverlay instanceof AvatarOverlay.Local)) {
                if (!z2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str = ((AvatarOverlay.RemoteImage) avatarOverlay).imageUrl;
            }
            gapComposer = gapComposer2;
            zzmn.m2026FoundationRemoteImageNXws8ko(new BankingDialogKt$$ExternalSyntheticLambda8(avatarOverlay, i2), str, then, null, null, null, null, avatarOverlay.colorFilter(gapComposer2), new Color(m3384backgroundColorWaAFU9c2), paddingValuesImpl, null, Expect_jvmKt.rememberComposableLambda(-160672514, new ButtonBinding$$ExternalSyntheticLambda2(avatarOverlay, 14), gapComposer2), gapComposer, 196608, 48, 1112);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(avatarOverlay, f, f2, f3, z, i) { // from class: com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda14
                public final /* synthetic */ AvatarOverlay f$1;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ boolean f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    TextViewKt.m3616BadgemkeQTyY(RealWeakMemoryCache.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void CounterAvatar(int i, AvatarSizeImpl avatarSizeImpl, Composer composer, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-610674468);
        int i3 = 4;
        int i4 = (gapComposer.changed(i) ? 4 : 2) | i2 | (gapComposer.changed(avatarSizeImpl) ? 32 : 16);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, Marker.ANY_NON_NULL_MARKER);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), 1.0f), (avatarSizeImpl.size - avatarSizeImpl.iconSize) / 2.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            TextStyle textStyle = avatarSizeImpl.textStyle(gapComposer);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            zzacn.m2012AutoScaleTextZLomxE(0, 0, 0, 1572864, 434, colors.semantic.text.inverse, Room.getSp(7), gapComposer, null, textStyle, m, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda3(i, avatarSizeImpl, i2);
        }
    }

    /* renamed from: Image-ww6aTOc, reason: not valid java name */
    public static final void m3617Imageww6aTOc(AvatarImage avatarImage, AvatarSizeImpl avatarSizeImpl, String str, long j, boolean z, Composer composer, int i) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(459093219);
        int i2 = i | (gapComposer.changed(avatarImage) ? 4 : 2) | (gapComposer.changed(avatarSizeImpl) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changed(j) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked);
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else if (z && (avatarImage instanceof AvatarImage.Remote)) {
            gapComposer.startReplaceGroup(1670619674);
            m3618ImageWithSubcomposeBx497Mc((AvatarImage.Remote) avatarImage, avatarSizeImpl, str, j, gapComposer, i2 & 8190);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1670716828);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, remoteImageSize(avatarImage, avatarSizeImpl));
            if (avatarImage instanceof AvatarImage.Remote) {
                str2 = ((AvatarImage.Remote) avatarImage).getImageUrl();
            } else {
                if (!(avatarImage instanceof AvatarImage.Local)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str2 = null;
            }
            zzmn.m2026FoundationRemoteImageNXws8ko(new AvatarKt$$ExternalSyntheticLambda9(avatarImage, i3), str2, m285size3ABfNKs, Alignment.Companion.Center, avatarImage.getContentScale(), null, null, avatarImage.colorFilter(gapComposer), null, null, null, Expect_jvmKt.rememberComposableLambda(1849892512, new AvatarKt$$ExternalSyntheticLambda10(avatarImage, str, avatarSizeImpl, j), gapComposer), gapComposer, 199680, 48, 1856);
            gapComposer = gapComposer;
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda11(avatarImage, avatarSizeImpl, str, j, z, i);
        }
    }

    /* renamed from: ImageWithSubcompose-Bx497Mc, reason: not valid java name */
    public static final void m3618ImageWithSubcomposeBx497Mc(AvatarImage.Remote remote, AvatarSizeImpl avatarSizeImpl, String str, long j, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(195343421);
        int i2 = i | (gapComposer.changed(remote) ? 4 : 2) | (gapComposer.changed(avatarSizeImpl) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changed(j) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            AsyncImageKt.m1443SubcomposeAsyncImageQgsmV_s(remote.getImageUrl(), null, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, remoteImageSize(remote, avatarSizeImpl)), Alignment.Companion.Center, remote.getContentScale(), Expect_jvmKt.rememberComposableLambda(-347451041, new PoolAvatarKt$$ExternalSyntheticLambda0(remote, str, avatarSizeImpl, j, 1), gapComposer), gapComposer, 1572912, 3888);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(remote, avatarSizeImpl, str, j, i);
        }
    }

    /* renamed from: Monogram-XO-JAsU, reason: not valid java name */
    public static final void m3619MonogramXOJAsU(String str, AvatarSizeImpl avatarSizeImpl, long j, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        String str2;
        long j2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1601037096);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(avatarSizeImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(j) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Character firstOrNull = StringsKt___StringsKt.firstOrNull(str);
            if (firstOrNull != null) {
                String valueOf = String.valueOf(firstOrNull.charValue());
                valueOf.getClass();
                str2 = valueOf.toUpperCase(Locale.ROOT);
                str2.getClass();
            } else {
                str2 = "";
            }
            String str3 = str2;
            if (j != 16) {
                gapComposer2.startReplaceGroup(884496872);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                long j3 = colors.semantic.text.inverse;
                Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = m3622contrastAdjustedMonogramColorysEtTa8(j3, colors2.semantic.text.standard, j);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(884737060);
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors3.semantic.text.inverse;
                gapComposer2.end(false);
            }
            long j4 = j2;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(3);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            zzacn.m2012AutoScaleTextZLomxE(0, 0, 0, 1572864, 432, j4, Room.getSp(7), gapComposer, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), 1.0f), (avatarSizeImpl.size - avatarSizeImpl.iconSize) / 2.0f), avatarSizeImpl.textStyle(gapComposer2), str3, null);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(i, 4, j, str, avatarSizeImpl);
        }
    }

    /* renamed from: OverflowCountAvatar-XO-JAsU, reason: not valid java name */
    public static final void m3620OverflowCountAvatarXOJAsU(int i, AvatarSizeImpl avatarSizeImpl, long j, Composer composer, int i2) {
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1384002730);
        int i3 = i2 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(avatarSizeImpl) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            TextStyle textStyle = avatarSizeImpl.textStyle(gapComposer);
            float f = avatarSizeImpl.size;
            long j3 = avatarSizeImpl.textSize;
            Room.m1167checkArithmeticR2X_6o(j3);
            long j4 = 1095216660480L & j3;
            long pack = Room.pack(j4, TextUnit.m1059getValueimpl(j3) * 0.65f);
            Room.m1167checkArithmeticR2X_6o(j3);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, pack, null, null, 0L, null, 0L, null, null, null, 0, Room.pack(j4, TextUnit.m1059getValueimpl(j3) * 0.65f), null, null, 0, 16646141);
            if (j != 16) {
                gapComposer.startReplaceGroup(861056954);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j5 = colors.semantic.text.inverse;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = m3622contrastAdjustedMonogramColorysEtTa8(j5, colors2.semantic.text.standard, j);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(861297142);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors3.semantic.text.inverse;
                gapComposer.end(false);
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), 1.0f), (f - avatarSizeImpl.iconSize) / 2.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(f * 0.04f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1)), Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            long j6 = j2;
            zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 1597440, 418, j6, Room.getSp(7), gapComposer, null, m994copyp1EtxEg$default, String.valueOf(i <= 99 ? i : 99), null);
            zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 1597446, 418, j6, Room.getSp(7), gapComposer, null, m994copyp1EtxEg$default, Marker.ANY_NON_NULL_MARKER, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda7(i, avatarSizeImpl, j, i2);
        }
    }

    /* renamed from: PlaceholderOrMonogram-Bx497Mc, reason: not valid java name */
    public static final void m3621PlaceholderOrMonogramBx497Mc(AvatarImage avatarImage, String str, AvatarSizeImpl avatarSizeImpl, long j, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(921349176);
        int i2 = i | (gapComposer.changed(avatarImage) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(avatarSizeImpl) ? 256 : 128) | (gapComposer.changed(j) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Painter painter = null;
            if (avatarImage == null) {
                gapComposer.startReplaceGroup(-1222527334);
            } else {
                gapComposer.startReplaceGroup(653300295);
                painter = avatarImage.painter(null, gapComposer);
            }
            gapComposer.end(false);
            if (painter != null) {
                gapComposer.startReplaceGroup(-1222445710);
                ImageKt.Image(painter, null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, remoteImageSize(avatarImage, avatarSizeImpl)), null, null, RecyclerView.DECELERATION_RATE, avatarImage.colorFilter(gapComposer), gapComposer, Painter.$stable | 48, 56);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1222257385);
                m3619MonogramXOJAsU(str, avatarSizeImpl, j, gapComposer, (i2 >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda10(avatarImage, str, avatarSizeImpl, j, i);
        }
    }

    public static final void TextView(ComposePlatform.Text text, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        int i2;
        long j;
        text.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-308921560);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String evalString = EvalHelpersKt.evalString((ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator), text.text, (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState), "");
            TextStyle textStyle = resolvedStyle.textStyle;
            if (textStyle == null) {
                gapComposer.startReplaceGroup(-520865646);
                textStyle = ((Typography) gapComposer.consume(TypographyKt.LocalTypography)).bodyMedium;
            } else {
                gapComposer.startReplaceGroup(-520867010);
            }
            gapComposer.end(false);
            TextStyle textStyle2 = textStyle;
            Color color = resolvedStyle.contentColor;
            long j2 = color != null ? color.value : Color.Unspecified;
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.LocalContentColor;
            if (color == null) {
                gapComposer.startReplaceGroup(-520855057);
                j = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal)).value;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-520856297);
                gapComposer.end(false);
                j = color.value;
            }
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-672186392, new TextViewKt$$ExternalSyntheticLambda0(evalString, modifier, j2, textStyle2), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(text, resolvedStyle, modifier, i, 10);
        }
    }

    public static final ComposableLambdaImpl avatarOverrideContentFor(AvatarEntry avatarEntry, AvatarSizeImpl avatarSizeImpl, Composer composer) {
        ComposableLambdaImpl rememberComposableLambda;
        int intValue;
        Integer num = avatarEntry.overflowCount;
        ComposableLambdaImpl composableLambdaImpl = null;
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        if (num == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1016079515);
            gapComposer.end(false);
            rememberComposableLambda = null;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1016079516);
            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1668770331, new BalanceHomeViewKt$$ExternalSyntheticLambda11(num.intValue(), avatarSizeImpl, avatarEntry, 2), gapComposer2);
            gapComposer2.end(false);
        }
        if (rememberComposableLambda != null) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(-521414027);
            gapComposer3.end(false);
            return rememberComposableLambda;
        }
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startReplaceGroup(1016312078);
        Integer num2 = avatarEntry.counterValue;
        if (num2 == null || 1 > (intValue = num2.intValue()) || intValue >= 100) {
            num2 = null;
        }
        if (num2 == null) {
            gapComposer4.startReplaceGroup(1016312077);
        } else {
            gapComposer4.startReplaceGroup(1016312078);
            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-745682883, new AvatarKt$$ExternalSyntheticLambda3(num2.intValue(), avatarSizeImpl), gapComposer4);
        }
        gapComposer4.end(false);
        gapComposer4.end(false);
        return composableLambdaImpl;
    }

    /* renamed from: contrastAdjustedMonogramColor-ysEtTa8, reason: not valid java name */
    public static final long m3622contrastAdjustedMonogramColorysEtTa8(long j, long j2, long j3) {
        if (android.graphics.Color.alpha(ColorKt.m694toArgb8_81llA(j3)) == 255) {
            double calculateContrast = ColorUtils.calculateContrast(ColorKt.m694toArgb8_81llA(j), ColorKt.m694toArgb8_81llA(j3));
            double calculateContrast2 = ColorUtils.calculateContrast(ColorKt.m694toArgb8_81llA(j2), ColorKt.m694toArgb8_81llA(j3));
            if (calculateContrast <= 3.0d && calculateContrast <= calculateContrast2) {
                return j2;
            }
        }
        return j;
    }

    public static long frameCountToDurationNs(int i, long j) {
        long j2 = i;
        TransactorKt.checkArgument("sampleRate must be greater than 0.", j2 > 0);
        return (1000000000 * j) / j2;
    }

    public static final float remoteImageSize(AvatarImage avatarImage, AvatarSizeImpl avatarSizeImpl) {
        float f = avatarSizeImpl.size;
        float f2 = avatarSizeImpl.iconSize;
        if (!(avatarImage instanceof AvatarImage.Remote)) {
            if (avatarImage instanceof AvatarImage.LocalIcon) {
                return f2;
            }
            if (avatarImage instanceof AvatarImage.LocalResource) {
                return f;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return RecyclerView.DECELERATION_RATE;
        }
        AvatarImage.Remote remote = (AvatarImage.Remote) avatarImage;
        if (remote instanceof AvatarImage.Remote.Icon) {
            return f2;
        }
        if (remote instanceof AvatarImage.Remote.Image) {
            return f;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return RecyclerView.DECELERATION_RATE;
    }

    public static long sizeToFrameCount(int i, long j) {
        long j2 = i;
        TransactorKt.checkArgument("bytesPerFrame must be greater than 0.", j2 > 0);
        return j / j2;
    }

    public static final AvatarSizeImpl toImpl(AvatarSizeOverride avatarSizeOverride) {
        return new AvatarSizeImpl(avatarSizeOverride.size, avatarSizeOverride.iconSize, avatarSizeOverride.textSize, avatarSizeOverride.badgeOffset, avatarSizeOverride.badgeSize, avatarSizeOverride.badgePadding);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Avatar(AvatarSizeOverride avatarSizeOverride, AvatarEntry avatarEntry, Modifier modifier, boolean z, boolean z2, Composer composer, int i, int i2) {
        AvatarSizeOverride avatarSizeOverride2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        GapComposer gapComposer;
        boolean z4;
        Modifier modifier3;
        boolean z5;
        RecomposeScopeImpl endRestartGroup;
        int i5;
        Modifier modifier4;
        boolean booleanValue;
        boolean z6;
        Color color;
        long j;
        avatarSizeOverride.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1174442803);
        if ((i & 6) == 0) {
            avatarSizeOverride2 = avatarSizeOverride;
            i3 = (gapComposer2.changed(avatarSizeOverride2) ? 4 : 2) | i;
        } else {
            avatarSizeOverride2 = avatarSizeOverride;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(avatarEntry) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= gapComposer2.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                        gapComposer2.skipToGroupEnd();
                        i5 = i3 & (-7169);
                        booleanValue = z;
                        modifier4 = modifier2;
                    } else {
                        i5 = i3 & (-7169);
                        modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        booleanValue = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        if (i4 != 0) {
                            z6 = false;
                            gapComposer2.endDefaults();
                            AvatarSizeImpl impl = toImpl(avatarSizeOverride2);
                            String str = avatarEntry.monogram;
                            long j2 = avatarEntry.backgroundColor;
                            AvatarOverlay avatarOverlay = avatarEntry.badge;
                            AvatarImage avatarImage = avatarEntry.avatarImage;
                            ComposableLambdaImpl avatarOverrideContentFor = avatarOverrideContentFor(avatarEntry, toImpl(avatarSizeOverride2), gapComposer2);
                            String str2 = avatarEntry.contentDescription;
                            color = avatarEntry.borderColor;
                            if (color == null) {
                                j = color.value;
                            } else {
                                j = Color.Unspecified;
                            }
                            gapComposer = gapComposer2;
                            m3614AvatarB_rZmmc(impl, str, j2, str2, modifier4, avatarImage, avatarOverrideContentFor, avatarOverlay, booleanValue, j, z6, gapComposer, (i5 << 6) & 57344, (i5 >> 12) & 14);
                            modifier3 = modifier4;
                            z4 = booleanValue;
                            z5 = z6;
                        }
                    }
                    z6 = z3;
                    gapComposer2.endDefaults();
                    AvatarSizeImpl impl2 = toImpl(avatarSizeOverride2);
                    String str3 = avatarEntry.monogram;
                    long j22 = avatarEntry.backgroundColor;
                    AvatarOverlay avatarOverlay2 = avatarEntry.badge;
                    AvatarImage avatarImage2 = avatarEntry.avatarImage;
                    ComposableLambdaImpl avatarOverrideContentFor2 = avatarOverrideContentFor(avatarEntry, toImpl(avatarSizeOverride2), gapComposer2);
                    String str22 = avatarEntry.contentDescription;
                    color = avatarEntry.borderColor;
                    if (color == null) {
                    }
                    gapComposer = gapComposer2;
                    m3614AvatarB_rZmmc(impl2, str3, j22, str22, modifier4, avatarImage2, avatarOverrideContentFor2, avatarOverlay2, booleanValue, j, z6, gapComposer, (i5 << 6) & 57344, (i5 >> 12) & 14);
                    modifier3 = modifier4;
                    z4 = booleanValue;
                    z5 = z6;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    z4 = z;
                    modifier3 = modifier2;
                    z5 = z3;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(avatarSizeOverride2, avatarEntry, modifier3, z4, z5, i, i2);
                    return;
                }
                return;
            }
            z3 = z2;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00bf  */
    /* renamed from: Avatar-B_rZmmc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3615AvatarB_rZmmc(final AvatarSizeOverride avatarSizeOverride, final String str, final long j, final String str2, final Modifier modifier, final AvatarImage avatarImage, AvatarOverlay avatarOverlay, boolean z, long j2, boolean z2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str3;
        long j3;
        String str4;
        Modifier modifier2;
        AvatarImage avatarImage2;
        AvatarOverlay avatarOverlay2;
        int i5;
        int i6;
        int i7;
        int i8;
        GapComposer gapComposer;
        final boolean z3;
        final long j4;
        final boolean z4;
        final AvatarOverlay avatarOverlay3;
        RecomposeScopeImpl endRestartGroup;
        boolean z5;
        AvatarOverlay avatarOverlay4;
        int i9;
        boolean z6;
        long j5;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1046092206);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(avatarSizeOverride) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i4 |= gapComposer2.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            j3 = j;
            i4 |= gapComposer2.changed(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i4 |= gapComposer2.changed(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            modifier2 = modifier;
        }
        if ((196608 & i) == 0) {
            avatarImage2 = avatarImage;
            i4 |= gapComposer2.changed(avatarImage2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            avatarImage2 = avatarImage;
        }
        int i10 = 1572864 | i4;
        int i11 = i3 & 128;
        if (i11 != 0) {
            i10 = 14155776 | i4;
        } else if ((12582912 & i) == 0) {
            avatarOverlay2 = avatarOverlay;
            i10 |= gapComposer2.changed(avatarOverlay2) ? 8388608 : 4194304;
            if ((100663296 & i) == 0) {
                i10 |= 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i10 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i10 |= gapComposer2.changed(j2) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            i6 = i3 & 1024;
            if (i6 == 0) {
                i8 = 6;
                i7 = i6;
            } else if ((i2 & 6) == 0) {
                i7 = i6;
                i8 = i2 | (gapComposer2.changed(z2) ? 4 : 2);
            } else {
                i7 = i6;
                i8 = i2;
            }
            if (!gapComposer2.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378 || (i8 & 3) != 2)) {
                gapComposer2.startDefaults();
                if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                    gapComposer2.skipToGroupEnd();
                    i9 = i10 & (-234881025);
                    z6 = z;
                    j5 = j2;
                    z5 = z2;
                    avatarOverlay4 = avatarOverlay2;
                } else {
                    AvatarOverlay avatarOverlay5 = i11 != 0 ? null : avatarOverlay2;
                    boolean booleanValue = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                    int i12 = (-234881025) & i10;
                    long j6 = i5 != 0 ? Color.Unspecified : j2;
                    if (i7 != 0) {
                        avatarOverlay4 = avatarOverlay5;
                        i9 = i12;
                        z5 = false;
                    } else {
                        z5 = z2;
                        avatarOverlay4 = avatarOverlay5;
                        i9 = i12;
                    }
                    z6 = booleanValue;
                    j5 = j6;
                }
                gapComposer2.endDefaults();
                gapComposer = gapComposer2;
                m3614AvatarB_rZmmc(toImpl(avatarSizeOverride), str3, j3, str4, modifier2, avatarImage2, (Function2) null, avatarOverlay4, z6, j5, z5, gapComposer, i9 & 2147483632, i8 & 14);
                avatarOverlay3 = avatarOverlay4;
                z3 = z6;
                j4 = j5;
                z4 = z5;
            } else {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                z3 = z;
                j4 = j2;
                z4 = z2;
                avatarOverlay3 = avatarOverlay2;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                        int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                        TextViewKt.m3615AvatarB_rZmmc(AvatarSizeOverride.this, str, j, str2, modifier, avatarImage, avatarOverlay3, z3, j4, z4, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        avatarOverlay2 = avatarOverlay;
        if ((100663296 & i) == 0) {
        }
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        if (!gapComposer2.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378 || (i8 & 3) != 2)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    /* renamed from: Avatar-B_rZmmc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3613AvatarB_rZmmc(final AvatarSize avatarSize, final String str, final long j, final String str2, Modifier modifier, AvatarImage avatarImage, Function2 function2, AvatarOverlay avatarOverlay, boolean z, long j2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str3;
        long j3;
        String str4;
        Modifier modifier2;
        int i5;
        AvatarImage avatarImage2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        GapComposer gapComposer;
        final Function2 function22;
        final AvatarOverlay avatarOverlay2;
        final Modifier modifier3;
        final AvatarImage avatarImage3;
        final boolean z2;
        final long j4;
        RecomposeScopeImpl endRestartGroup;
        boolean z3;
        boolean z4;
        AvatarOverlay avatarOverlay3;
        Function2 function23;
        AvatarImage avatarImage4;
        long j5;
        Modifier modifier4;
        int i13;
        avatarSize.getClass();
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1492011162);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(avatarSize.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i4 |= gapComposer2.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            j3 = j;
            i4 |= gapComposer2.changed(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i4 |= gapComposer2.changed(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i) == 0) {
                avatarImage2 = avatarImage;
                i4 |= gapComposer2.changed(avatarImage2) ? PKIFailureInfo.unsupportedVersion : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= gapComposer2.changedInstance(function2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i8 = i4 | (gapComposer2.changed(avatarOverlay) ? 8388608 : 4194304);
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && gapComposer2.changed(z)) {
                            i13 = 67108864;
                            i8 |= i13;
                        }
                        i13 = 33554432;
                        i8 |= i13;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i8 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i10 = i9;
                        i8 |= gapComposer2.changed(j2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i2 | (gapComposer2.changed(false) ? 4 : 2);
                        } else {
                            i11 = i2;
                        }
                        i12 = i11;
                        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                            gapComposer2.startDefaults();
                            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                                gapComposer2.skipToGroupEnd();
                                if ((i3 & 256) != 0) {
                                    i8 &= -234881025;
                                }
                                function23 = function2;
                                avatarOverlay3 = avatarOverlay;
                                z4 = z;
                                j5 = j2;
                                modifier4 = modifier2;
                                avatarImage4 = avatarImage2;
                            } else {
                                Modifier modifier5 = i14 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                if (i5 != 0) {
                                    avatarImage2 = null;
                                }
                                Function2 function24 = i6 != 0 ? null : function2;
                                AvatarOverlay avatarOverlay4 = i7 == 0 ? avatarOverlay : null;
                                if ((i3 & 256) != 0) {
                                    z3 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                                    i8 &= -234881025;
                                } else {
                                    z3 = z;
                                }
                                z4 = z3;
                                avatarOverlay3 = avatarOverlay4;
                                function23 = function24;
                                avatarImage4 = avatarImage2;
                                j5 = i10 != 0 ? Color.Unspecified : j2;
                                modifier4 = modifier5;
                            }
                            gapComposer2.endDefaults();
                            gapComposer = gapComposer2;
                            m3614AvatarB_rZmmc(new AvatarSizeImpl(avatarSize.size, avatarSize.iconSize, avatarSize.textSize, avatarSize.badgeOffset, 24.0f, 4.0f), str3, j3, str4, modifier4, avatarImage4, function23, avatarOverlay3, z4, j5, false, (Composer) gapComposer, i8 & 2147483632, i12 & 14);
                            modifier3 = modifier4;
                            avatarImage3 = avatarImage4;
                            function22 = function23;
                            avatarOverlay2 = avatarOverlay3;
                            z2 = z4;
                            j4 = j5;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            function22 = function2;
                            avatarOverlay2 = avatarOverlay;
                            modifier3 = modifier2;
                            avatarImage3 = avatarImage2;
                            z2 = z;
                            j4 = j2;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                    TextViewKt.m3613AvatarB_rZmmc(AvatarSize.this, str, j, str2, modifier3, avatarImage3, function22, avatarOverlay2, z2, j4, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    if ((i3 & 1024) != 0) {
                    }
                    i12 = i11;
                    if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4;
                if ((i & 100663296) == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & 1024) != 0) {
                }
                i12 = i11;
                if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            avatarImage2 = avatarImage;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i4;
            if ((i & 100663296) == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & 1024) != 0) {
            }
            i12 = i11;
            if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (i12 & 3) != 2)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        avatarImage2 = avatarImage;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i4;
        if ((i & 100663296) == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & 1024) != 0) {
        }
        i12 = i11;
        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378 || (i12 & 3) != 2)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
