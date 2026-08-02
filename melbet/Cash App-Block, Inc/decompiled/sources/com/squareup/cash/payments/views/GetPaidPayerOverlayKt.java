package com.squareup.cash.payments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda8;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public abstract class GetPaidPayerOverlayKt {
    static {
        new Color(new Color.ModeVariant("#6C47FF", null, null, null, null, 30, null), (Color.ModeVariant) null, 6);
    }

    public static final void GetPaidPayerOverlay(List list, String str, boolean z, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        boolean z2;
        boolean z3;
        long j;
        String m;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1328260211);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | 24576;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            AvatarSize avatarSize = AvatarSize.Size48;
            gapComposer.startReplaceGroup(1302152941);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                NearbyAvatarInfo nearbyAvatarInfo = ((NearbyPayer) it.next()).avatar;
                Character ch = nearbyAvatarInfo.monogram;
                String valueOf2 = ch != null ? String.valueOf(ch.charValue()) : null;
                if (valueOf2 == null) {
                    valueOf2 = "";
                }
                String str2 = valueOf2;
                androidx.compose.ui.graphics.Color forTheme = ThemablesKt.forTheme(nearbyAvatarInfo.accentColor, gapComposer);
                if (forTheme == null) {
                    gapComposer.startReplaceGroup(1577994347);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    z3 = false;
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.background.subtle;
                    gapComposer.end(false);
                } else {
                    z3 = false;
                    gapComposer.startReplaceGroup(1577991309);
                    gapComposer.end(false);
                    j = forTheme.value;
                }
                long j2 = j;
                Image image = nearbyAvatarInfo.image;
                if (image == null) {
                    gapComposer.startReplaceGroup(1673260111);
                    gapComposer.end(z3);
                    m = null;
                } else {
                    m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, 1577996786, image, gapComposer, z3);
                }
                arrayList.add(new AvatarEntry(str2, j2, null, m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(m, 29), 62) : null, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE));
            }
            gapComposer.end(false);
            zzabw.HorizontalStackedAvatars(avatarSize, Tags.toImmutableList(arrayList), null, gapComposer, 6, 4);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (str != null) {
                gapComposer.startReplaceGroup(1712799504);
                if (z) {
                    gapComposer.startReplaceGroup(1712898456);
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j3 = colors2.semantic.text.standard;
                    boolean z4 = (i2 & 7168) == 2048;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z4 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ShiftListViewKt$$ExternalSyntheticLambda8(6, function0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    z2 = false;
                    LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, textStyle, j3, null, null, null, 0, 0, 0, gapComposer, (i2 >> 3) & 14, 2020);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(1713153865);
                    TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle2, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(1713348235);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(list, str, z, function0, modifier2, i, 11);
        }
    }
}
