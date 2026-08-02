package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.family.familyhub.views.FamilyHomeSectionsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class ArcadeFormEmojiPickerKt {

    /* renamed from: lambda$-1317523209, reason: not valid java name */
    public static final ComposableLambdaImpl f423lambda$1317523209 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(28), false, -1317523209);

    public static final void DisabledClickWrapper(boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1707694913);
        int i2 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(51688615);
            } else {
                gapComposer.startReplaceGroup(51726063);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda1(11);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
            }
            gapComposer.end(false);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            if (z) {
                gapComposer.startReplaceGroup(521053019);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(520706098);
                Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                BoxKt.Box(ImageKt.m182clickableO2vRcR0$default(matchParentSize, (MutableInteractionSourceImpl) rememberedValue2, null, false, null, null, function0, 28), gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(i, 18, function0, composableLambdaImpl, z);
        }
    }

    public static final void Grid(Modifier modifier, List list, Arrangement$SpacedAligned arrangement$SpacedAligned, Arrangement$SpacedAligned arrangement$SpacedAligned2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(403904253);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(list) ? 256 : 128) | (gapComposer.changed(arrangement$SpacedAligned) ? 2048 : 1024) | (gapComposer.changed(arrangement$SpacedAligned2) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = 3;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Start, gapComposer, (((i2 & 14) | ((i2 >> 6) & 112)) >> 3) & 14);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ArrayList windowed = CollectionsKt.windowed(list, 3, 3, true);
            gapComposer.startReplaceGroup(451312046);
            Iterator it = windowed.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                List list2 = (List) next;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned2, Alignment.Companion.Top, gapComposer, ((((i2 >> 9) & 112) | 6) >> i3) & 14);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(-544002335);
                int i6 = 0;
                for (Object obj : list2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    composableLambdaImpl.invoke(RowScopeInstance.INSTANCE, Integer.valueOf((i4 * 3) + i6), obj, (Object) gapComposer, (Object) 3078);
                    i6 = i7;
                }
                gapComposer.end(false);
                gapComposer.end(true);
                i4 = i5;
                i3 = 3;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(modifier, (Object) list, (Object) arrangement$SpacedAligned, (Object) arrangement$SpacedAligned2, (Object) composableLambdaImpl, i, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AvatarEntry access$toAvatarEntry(UiAvatar uiAvatar, RealImageLoader realImageLoader, Composer composer) {
        AvatarImage avatarImage;
        Color m;
        long j;
        AvatarOverlay avatarOverlay;
        AvatarOverlay avatarOverlay2;
        String str;
        AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(Icons.AvatarFill32, 0L, 6);
        Image image = uiAvatar.image;
        AvatarOverlay avatarOverlay3 = null;
        if (image == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1601305814);
            gapComposer.end(false);
            String str2 = uiAvatar.monogram_text;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                localIcon = null;
            }
            avatarImage = localIcon;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-1601166531);
            AvatarImage image2 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image, gapComposer2), false, localIcon, 0L, new UtilsKt$$ExternalSyntheticLambda0(realImageLoader, 2), 58);
            gapComposer2.end(false);
            avatarImage = image2;
        }
        String str3 = uiAvatar.monogram_text;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        com.squareup.protos.cash.ui.Color color = uiAvatar.background_color;
        if (color == null) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(-1600835111);
            gapComposer3.end(false);
            m = null;
        } else {
            GapComposer gapComposer4 = (GapComposer) composer;
            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, -1852755160, color, gapComposer4, false);
        }
        if (m == null) {
            GapComposer gapComposer5 = (GapComposer) composer;
            gapComposer5.startReplaceGroup(-1852753658);
            Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
            } else {
                gapComposer5.startReplaceGroup(-1762997739);
                gapComposer5.end(false);
            }
            j = colors.semantic.icon.standard;
            gapComposer5.end(false);
        } else {
            GapComposer gapComposer6 = (GapComposer) composer;
            gapComposer6.startReplaceGroup(-1852755673);
            gapComposer6.end(false);
            j = m.value;
        }
        long j2 = j;
        String str5 = uiAvatar.accessibility_value;
        Icon icon = uiAvatar.badge_icon;
        if (icon != null && (str = icon.arcade_id) != null) {
            Icons.Companion.getClass();
            Icons icons = zzd.get(str);
            if (icons != null) {
                avatarOverlay = new AvatarOverlay.LocalIcon(14, 0L, 0L, icons);
                if (avatarOverlay != null) {
                    GapComposer gapComposer7 = (GapComposer) composer;
                    gapComposer7.startReplaceGroup(-1600580693);
                    Image image3 = uiAvatar.badge_image;
                    if (image3 == null) {
                        gapComposer7.startReplaceGroup(-1600580694);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-1600580693);
                        AvatarOverlay remoteImage = new AvatarOverlay.RemoteImage(ThemablesKt.urlForTheme(image3, gapComposer7), false, 0L, 0L, null, new UtilsKt$$ExternalSyntheticLambda0(realImageLoader, 3), 28);
                        gapComposer7.end(false);
                        avatarOverlay3 = remoteImage;
                    }
                    gapComposer7.end(false);
                    avatarOverlay2 = avatarOverlay3;
                } else {
                    GapComposer gapComposer8 = (GapComposer) composer;
                    gapComposer8.startReplaceGroup(-1852750115);
                    gapComposer8.end(false);
                    avatarOverlay2 = avatarOverlay;
                }
                return new AvatarEntry(str4, j2, null, avatarImage, str5, avatarOverlay2, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
            }
        }
        avatarOverlay = null;
        if (avatarOverlay != null) {
        }
        return new AvatarEntry(str4, j2, null, avatarImage, str5, avatarOverlay2, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
    }

    public static final TemplateConfig findConfigFor(String str, ArrayList arrayList) {
        arrayList.getClass();
        str.getClass();
        Object obj = null;
        if (str.length() == 0) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            TemplateConfig templateConfig = (TemplateConfig) obj2;
            String filterFormattingChars = templateConfig.filterFormattingChars(str);
            if (filterFormattingChars.length() != 0) {
                Matcher matcher = templateConfig.pattern.matcher(filterFormattingChars);
                if (matcher.matches() || matcher.hitEnd()) {
                    obj = obj2;
                    break;
                }
            }
        }
        return (TemplateConfig) obj;
    }
}
