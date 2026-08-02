package com.squareup.cash.avatar.components;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealWeakMemoryCache;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.themes.Dimen$Sp;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.ui.widget.StackedAvatarView$TextSize;
import com.squareup.cash.ui.widget.StackedAvatarViewKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public abstract class StackedAvatarsKt {
    public static final List previewAvatars = CollectionsKt__CollectionsKt.listOf((Object[]) new StackedAvatarViewModel.Avatar[]{new StackedAvatarViewModel.Avatar(new ColorModel.Accented(ColorsKt.toColor("#33B843")), 'S', null, new Image("fake:///shrek.png", "fake:///shrek.png", 4), null, null, null, null, false, false, null, false, null, null, 131060), new StackedAvatarViewModel.Avatar(new ColorModel.Accented(ColorsKt.toColor("#00B843")), 'S', null, null, null, null, null, null, false, false, null, false, null, null, 131068), new StackedAvatarViewModel.Avatar(new ColorModel.Accented(ColorsKt.toColor("#D3B843")), 'S', null, null, null, null, null, null, false, false, null, false, null, null, 131068)});

    public static final void Duo(StackedAvatarViewModel.Duo duo, Modifier modifier, Function3 function3, StackedAvatarView$TextSize stackedAvatarView$TextSize, Composer composer, int i) {
        int i2;
        StackedAvatarViewModel.Duo duo2 = duo;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1216465431);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(duo2) : gapComposer.changedInstance(duo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(stackedAvatarView$TextSize.ordinal()) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
            gapComposer.startReplaceGroup(408289237);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, StackedAvatarsKt$duoTrioMeasurePolicy$1.INSTANCE, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m1459clippedOutlinewH6b6FI = realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m1459clippedOutlinewH6b6FI);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ToComposable(duo2.backAvatar, null, stackedAvatarView$TextSize, function3, false, gapComposer, 24584, 1);
            gapComposer.end(true);
            Modifier m1459clippedOutlinewH6b6FI2 = realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m1459clippedOutlinewH6b6FI2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            duo2 = duo;
            ToComposable(duo2.frontAvatar, null, stackedAvatarView$TextSize, function3, false, gapComposer, 24584, 1);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(duo2, modifier, function3, stackedAvatarView$TextSize, i, 10);
        }
    }

    public static final void Single(StackedAvatarViewModel.Single single, Modifier modifier, Function3 function3, StackedAvatarView$TextSize stackedAvatarView$TextSize, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1261109501);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(single) : gapComposer.changedInstance(single) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(stackedAvatarView$TextSize.ordinal()) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ToComposable(single.avatar, modifier, stackedAvatarView$TextSize, function3, true, gapComposer, (i2 & 112) | 24584 | ((i2 >> 3) & 896) | ((i2 << 3) & 7168), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(single, modifier, function3, stackedAvatarView$TextSize, i, 8);
        }
    }

    public static final void StackedAvatars(StackedAvatarViewModel stackedAvatarViewModel, Function3 function3, Modifier modifier, StackedAvatarView$TextSize stackedAvatarView$TextSize, Composer composer, int i, int i2) {
        int i3;
        StackedAvatarView$TextSize stackedAvatarView$TextSize2;
        stackedAvatarViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(369136334);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(stackedAvatarViewModel) : gapComposer.changedInstance(stackedAvatarViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function3) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(stackedAvatarView$TextSize == null ? -1 : stackedAvatarView$TextSize.ordinal()) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            StackedAvatarView$TextSize stackedAvatarView$TextSize3 = i4 != 0 ? StackedAvatarView$TextSize.SMALL : stackedAvatarView$TextSize;
            boolean z = stackedAvatarViewModel instanceof StackedAvatarViewModel.Single;
            if (z) {
                throwIfUsingArcadeFeature$throwIfUsingArcadeFeature(((StackedAvatarViewModel.Single) stackedAvatarViewModel).avatar);
            } else if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo) {
                StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel;
                throwIfUsingArcadeFeature$throwIfUsingArcadeFeature(duo.backAvatar);
                throwIfUsingArcadeFeature$throwIfUsingArcadeFeature(duo.frontAvatar);
            } else {
                if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                StackedAvatarViewModel.Trio trio = (StackedAvatarViewModel.Trio) stackedAvatarViewModel;
                throwIfUsingArcadeFeature$throwIfUsingArcadeFeature(trio.backAvatar);
                throwIfUsingArcadeFeature$throwIfUsingArcadeFeature(trio.middleAvatar);
                throwIfUsingArcadeFeature$throwIfUsingArcadeFeature(trio.frontAvatar);
            }
            if (z) {
                gapComposer.startReplaceGroup(-1742260414);
                Single((StackedAvatarViewModel.Single) stackedAvatarViewModel, modifier, function3, stackedAvatarView$TextSize3, gapComposer, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168));
                gapComposer.end(false);
            } else if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo) {
                gapComposer.startReplaceGroup(-1742258273);
                Duo((StackedAvatarViewModel.Duo) stackedAvatarViewModel, modifier, function3, stackedAvatarView$TextSize3, gapComposer, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168));
                gapComposer.end(false);
            } else {
                if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1742261064, false);
                }
                gapComposer.startReplaceGroup(1824639346);
                StackedAvatarViewModel.Trio trio2 = (StackedAvatarViewModel.Trio) stackedAvatarViewModel;
                int i5 = trio2.overflowCount;
                Integer valueOf = Integer.valueOf(i5);
                if (!trio2.showOverflow || i5 <= 0) {
                    valueOf = null;
                }
                String m = valueOf != null ? Boxes$$ExternalSyntheticOutline1.m(valueOf.intValue(), Marker.ANY_NON_NULL_MARKER) : null;
                StackedAvatarViewModel.Avatar avatar = m != null ? new StackedAvatarViewModel.Avatar(null, null, null, null, null, null, null, null, false, false, null, false, null, m, 65535) : null;
                StackedAvatarViewModel.Duo duo2 = avatar != null ? new StackedAvatarViewModel.Duo(avatar, trio2.frontAvatar) : null;
                if (duo2 != null) {
                    gapComposer.startReplaceGroup(1824731044);
                    Duo(duo2, modifier, function3, stackedAvatarView$TextSize3, gapComposer, ((i3 >> 3) & 112) | 8 | ((i3 << 3) & 896) | (i3 & 7168));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1824815984);
                    Trio(trio2, modifier, function3, stackedAvatarView$TextSize3, gapComposer, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168));
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            stackedAvatarView$TextSize2 = stackedAvatarView$TextSize3;
        } else {
            gapComposer.skipToGroupEnd();
            stackedAvatarView$TextSize2 = stackedAvatarView$TextSize;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(stackedAvatarViewModel, function3, modifier, stackedAvatarView$TextSize2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.ui.graphics.ColorFilter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r30v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Number] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ToComposable(StackedAvatarViewModel.Avatar avatar, Modifier modifier, StackedAvatarView$TextSize stackedAvatarView$TextSize, Function3 function3, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        TextThemeInfo textThemeInfo;
        Throwable th;
        Modifier modifier4;
        ColorModel colorModel;
        ?? r3;
        long j;
        ColorModel colorModel2;
        ?? r10;
        int i4;
        long j2;
        ?? r102;
        ColorModel colorModel3;
        boolean z2;
        Object forThemeComposable;
        ?? valueOf;
        Object obj;
        boolean changed;
        Object rememberedValue;
        boolean z3;
        float f;
        RoundedCornerShape m340RoundedCornerShape0680j_4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2018789550);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(avatar) : gapComposer.changedInstance(avatar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(stackedAvatarView$TextSize.ordinal()) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier5 = i5 != 0 ? companion : modifier2;
                int i6 = i3 >> 9;
                stackedAvatarView$TextSize.getClass();
                int ordinal = stackedAvatarView$TextSize.ordinal();
                if (ordinal == 0) {
                    textThemeInfo = z ? TextStyles.smallBody : TextStyles.smallBody;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    textThemeInfo = z ? TextThemeInfo.copy$default(TextStyles.header3, null, new Dimen$Sp(28), null, 29) : TextStyles.header4;
                }
                TextStyle m3638toComposeTextStylePOD2ecY$default = MooncakeTypographyKt.m3638toComposeTextStylePOD2ecY$default(textThemeInfo);
                ThemeInfo themeInfo = ThemeHelpersKt.themeInfo((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
                String themedUrl = ComposeUtilsKt.getThemedUrl(avatar.remoteImage, gapComposer);
                String str = avatar.monogramText;
                if (str == null) {
                    Character ch = avatar.character;
                    if (ch != null) {
                        str = String.valueOf(ch.charValue());
                    } else {
                        th = null;
                        str = null;
                        if (avatar.remoteImage == null || str != null) {
                            modifier4 = modifier5;
                            gapComposer.startReplaceGroup(668115252);
                            colorModel = avatar.backgroundColor;
                            if (colorModel != null) {
                                gapComposer.startReplaceGroup(668130162);
                                gapComposer.end(false);
                                r3 = th;
                            } else {
                                gapComposer.startReplaceGroup(1268478575);
                                Color forThemeComposable2 = PagerMeasureKt.forThemeComposable(colorModel, themeInfo, gapComposer);
                                gapComposer.end(false);
                                r3 = forThemeComposable2;
                            }
                            if (r3 != 0) {
                                gapComposer.startReplaceGroup(1268480295);
                                j = MooncakeTheme.getColors(gapComposer).placeholderBackground;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(1268478094);
                                gapComposer.end(false);
                                j = r3.value;
                            }
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(668044696);
                            modifier4 = modifier5;
                            j = MooncakeTheme.getColors(gapComposer).placeholderBackground;
                            gapComposer.end(false);
                        }
                        colorModel2 = avatar.transformTintColor;
                        if (colorModel2 != null) {
                            gapComposer.startReplaceGroup(668265074);
                            gapComposer.end(false);
                            r10 = th;
                        } else {
                            gapComposer.startReplaceGroup(1268482927);
                            Color forThemeComposable3 = PagerMeasureKt.forThemeComposable(colorModel2, themeInfo, gapComposer);
                            gapComposer.end(false);
                            r10 = forThemeComposable3;
                        }
                        if (r10 == 0) {
                            long j3 = r10.value;
                            i4 = i6;
                            j2 = j;
                            r102 = new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                        } else {
                            i4 = i6;
                            j2 = j;
                            r102 = th;
                        }
                        colorModel3 = avatar.transformFillColor;
                        if (colorModel3 != null) {
                            gapComposer.startReplaceGroup(668368242);
                            z2 = false;
                            gapComposer.end(false);
                            forThemeComposable = th;
                        } else {
                            z2 = false;
                            gapComposer.startReplaceGroup(1268486255);
                            forThemeComposable = PagerMeasureKt.forThemeComposable(colorModel3, themeInfo, gapComposer);
                            gapComposer.end(false);
                        }
                        StackedAvatarViewModel.Avatar.AvatarDrawableRes avatarDrawableRes = avatar.localImage;
                        valueOf = avatarDrawableRes == null ? Integer.valueOf(StackedAvatarViewKt.drawableResForTheme(avatarDrawableRes, themeInfo)) : th;
                        if (valueOf != 0) {
                            gapComposer.startReplaceGroup(668579321);
                            gapComposer.end(z2);
                            obj = th;
                        } else {
                            gapComposer.startReplaceGroup(668579322);
                            Object rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1157434659, new BalanceHomeViewKt$$ExternalSyntheticLambda11(valueOf.intValue(), forThemeComposable, (Object) r102, 4), gapComposer);
                            gapComposer.end(z2);
                            obj = rememberComposableLambda;
                        }
                        String str2 = avatar.contentDescription;
                        changed = gapComposer.changed(str2);
                        rememberedValue = gapComposer.rememberedValue();
                        if (!changed || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(str2, 6);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Modifier modifier6 = modifier4;
                        Modifier then = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue).then(modifier6);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
                        ComposeUiNode.Companion.getClass();
                        ?? r17 = forThemeComposable;
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        ?? r30 = obj;
                        if (gapComposer.applier != null) {
                            Updater.invalidApplier();
                            throw th;
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
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        Character ch2 = avatar.character;
                        StackedAvatarViewModel.Avatar.Shape shape = avatar.shape;
                        if (shape instanceof StackedAvatarViewModel.Avatar.Shape.Circle) {
                            m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.CircleShape;
                            z3 = true;
                        } else {
                            if (!(shape instanceof StackedAvatarViewModel.Avatar.Shape.RoundedRectangle)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            int ordinal2 = ((StackedAvatarViewModel.Avatar.Shape.RoundedRectangle) shape).cornerRadiusSize.ordinal();
                            z3 = true;
                            if (ordinal2 == 0) {
                                f = RecyclerView.DECELERATION_RATE;
                            } else {
                                if (ordinal2 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                f = 16.0f;
                            }
                            m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f);
                        }
                        long j4 = j2;
                        AvatarKt.m3404Avatar8xTau9I(fillMaxSize, themedUrl, r17, r102, j4, ch2, str, m3638toComposeTextStylePOD2ecY$default, m340RoundedCornerShape0680j_4, function3, j4, r30, gapComposer, 24582, i4 & 14);
                        gapComposer.end(z3);
                        modifier3 = modifier6;
                    }
                }
                th = null;
                if (avatar.remoteImage == null) {
                }
                modifier4 = modifier5;
                gapComposer.startReplaceGroup(668115252);
                colorModel = avatar.backgroundColor;
                if (colorModel != null) {
                }
                if (r3 != 0) {
                }
                gapComposer.end(false);
                colorModel2 = avatar.transformTintColor;
                if (colorModel2 != null) {
                }
                if (r10 == 0) {
                }
                colorModel3 = avatar.transformFillColor;
                if (colorModel3 != null) {
                }
                StackedAvatarViewModel.Avatar.AvatarDrawableRes avatarDrawableRes2 = avatar.localImage;
                if (avatarDrawableRes2 == null) {
                }
                if (valueOf != 0) {
                }
                String str22 = avatar.contentDescription;
                changed = gapComposer.changed(str22);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(str22, 6);
                gapComposer.updateRememberedValue(rememberedValue);
                Modifier modifier62 = modifier4;
                Modifier then2 = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue).then(modifier62);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then2);
                ComposeUiNode.Companion.getClass();
                ?? r172 = forThemeComposable;
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                ?? r302 = obj;
                if (gapComposer.applier != null) {
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(avatar, modifier3, stackedAvatarView$TextSize, function3, z, i, i2, 4);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void Trio(StackedAvatarViewModel.Trio trio, Modifier modifier, Function3 function3, StackedAvatarView$TextSize stackedAvatarView$TextSize, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1402110845);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(trio) : gapComposer.changedInstance(trio) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(stackedAvatarView$TextSize.ordinal()) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            StackedAvatarViewModel.Avatar avatar = trio.frontAvatar;
            StackedAvatarViewModel.Avatar avatar2 = trio.middleAvatar;
            StackedAvatarViewModel.Avatar avatar3 = trio.backAvatar;
            avatar.getClass();
            avatar2.getClass();
            avatar3.getClass();
            RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
            gapComposer.startReplaceGroup(2057399335);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, StackedAvatarsKt$duoTrioMeasurePolicy$1.INSTANCE, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m1459clippedOutlinewH6b6FI = realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m1459clippedOutlinewH6b6FI);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ToComposable(avatar3, null, stackedAvatarView$TextSize, function3, false, gapComposer, 24584, 1);
            gapComposer.end(true);
            Modifier layoutId = RulerKt.layoutId(realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f), "middle");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, layoutId);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            ToComposable(avatar2, null, stackedAvatarView$TextSize, function3, false, gapComposer, 24584, 1);
            gapComposer.end(true);
            Modifier layoutId2 = RulerKt.layoutId(realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f), "front");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, layoutId2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            ToComposable(avatar, null, stackedAvatarView$TextSize, function3, false, gapComposer, 24584, 1);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(trio, modifier, function3, stackedAvatarView$TextSize, i, 9);
        }
    }

    public static final void throwIfUsingArcadeFeature$throwIfUsingArcadeFeature(StackedAvatarViewModel.Avatar avatar) {
        if (avatar.localArcadeIcon == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot use localArcadeIcon with a Mooncake view. Migrate view to use arcade component");
    }

    public static final void StackedAvatars(StackedAvatarViewModel.Single single, Modifier modifier, StackedAvatarView$TextSize stackedAvatarView$TextSize, Composer composer, int i) {
        StackedAvatarView$TextSize stackedAvatarView$TextSize2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(556804430);
        int i2 = (gapComposer.changedInstance(single) ? 4 : 2) | i | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StackedAvatarView$TextSize stackedAvatarView$TextSize3 = StackedAvatarView$TextSize.SMALL;
            StackedAvatars(single, new AvatarsKt$$ExternalSyntheticLambda0(7), modifier, stackedAvatarView$TextSize3, gapComposer, (i2 & 14) | 3456, 0);
            stackedAvatarView$TextSize2 = stackedAvatarView$TextSize3;
        } else {
            gapComposer.skipToGroupEnd();
            stackedAvatarView$TextSize2 = stackedAvatarView$TextSize;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(single, modifier, stackedAvatarView$TextSize2, i, 7);
        }
    }
}
