package com.squareup.cash.merchant.views.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.maps.views.ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionAvailability;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ActionNoticeKt {

    /* renamed from: lambda$-1766412458, reason: not valid java name */
    public static final ComposableLambdaImpl f467lambda$1766412458 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(10), false, -1766412458);

    public static final void ActionNotice(Modifier modifier, String str, String str2, ButtonConfig buttonConfig, Composer composer, int i, int i2) {
        ButtonConfig buttonConfig2;
        int i3;
        ButtonConfig buttonConfig3;
        boolean z;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1615550557);
        int i4 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            buttonConfig2 = buttonConfig;
        } else {
            buttonConfig2 = buttonConfig;
            i3 = i4 | (gapComposer.changed(buttonConfig2) ? 2048 : 1024);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            if (i5 != 0) {
                buttonConfig2 = null;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ButtonConfig buttonConfig4 = buttonConfig2;
            Room.m1165Text25TpFw(0, 0, 0, 3, (i3 >> 3) & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, (i3 >> 6) & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            if (buttonConfig4 == null) {
                gapComposer.startReplaceGroup(2127174758);
                gapComposer.end(false);
                z = true;
            } else {
                gapComposer.startReplaceGroup(2127174759);
                z = true;
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                SizeKt.ButtonCompact(buttonConfig4.onClick, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(15712496, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(buttonConfig4, 14), gapComposer), gapComposer, 1572864, 62);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(z);
            buttonConfig3 = buttonConfig4;
        } else {
            gapComposer.skipToGroupEnd();
            buttonConfig3 = buttonConfig2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(modifier, str, str2, buttonConfig3, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0337 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoyaltyPromotion(Modifier modifier, LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        List list;
        String str;
        int i3;
        String str2;
        String str3;
        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData locationData;
        LoyaltyPromotionAvailability loyaltyPromotionAvailability;
        zzjj zzjjVar;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1068521798);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(loyaltyPromotionData) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 896;
            boolean changedInstance = gapComposer.changedInstance(loyaltyPromotionData) | (i4 == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SquareLoyaltyDetailsPlaceholderKt$$ExternalSyntheticLambda1(loyaltyPromotionData, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(modifier2, false, null, null, (Function0) rememberedValue, 15);
            boolean changedInstance2 = (i4 == 256) | gapComposer.changedInstance(loyaltyPromotionData);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SquareLoyaltyDetailsPlaceholderKt$$ExternalSyntheticLambda1(function1, loyaltyPromotionData);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(VisibleKt.onVisible$default(m183clickableoSLSa3U$default, (Function0) rememberedValue2), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String str4 = loyaltyPromotionData.title;
            List list2 = loyaltyPromotionData.section;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str4 == null ? "" : str4, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 4.0f));
            String str5 = loyaltyPromotionData.benefit;
            if (str5 == null) {
                gapComposer.startReplaceGroup(2113291297);
                gapComposer.end(false);
                list = list2;
            } else {
                gapComposer.startReplaceGroup(2113291298);
                list = list2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                re$$ExternalSyntheticOutline0.m(companion, 4.0f, gapComposer, false);
            }
            LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section section = (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section) CollectionsKt.firstOrNull(list);
            if (section == null || (zzjjVar = section.content) == null) {
                str = null;
            } else {
                LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text = zzjjVar instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) zzjjVar : null;
                str = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text != null ? loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text.value : null;
            }
            if (str == null) {
                gapComposer.startReplaceGroup(2113556626);
                i3 = 0;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2113556627);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                i3 = 0;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            DBUtil.SpacerWithinSectionMedium(i3, 1, gapComposer, null);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            for (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section section2 : CollectionsKt.drop(list, 1)) {
                zzjj zzjjVar2 = section2.content;
                String str6 = section2.title;
                if (zzjjVar2 != null) {
                    LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text2 = zzjjVar2 instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) zzjjVar2 : null;
                    if (loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text2 != null) {
                        str2 = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text2.value;
                        if (str2 == null) {
                            String str7 = str6 == null ? "" : str6;
                            if (zzjjVar2 != null) {
                                LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text3 = zzjjVar2 instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text) zzjjVar2 : null;
                                str3 = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text3 != null ? loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Text3.value : null;
                            } else {
                                str3 = null;
                            }
                            createListBuilder.add(new ListUnorderedItem(str7, null, str3, null, 10));
                        } else {
                            if (zzjjVar2 != null) {
                                LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations = zzjjVar2 instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) zzjjVar2 : null;
                                if (loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations != null) {
                                    locationData = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations.value;
                                    if (locationData == null) {
                                        String str8 = str6 == null ? "" : str6;
                                        zzjjVar2.getClass();
                                        boolean z = zzjjVar2 instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations;
                                        LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations2 = z ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) zzjjVar2 : null;
                                        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData locationData2 = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations2 != null ? loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations2.value : null;
                                        locationData2.getClass();
                                        createListBuilder.add(new ListUnorderedItem(str8, null, (String) CollectionsKt.first(locationData2.locations), null, 10));
                                        LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations3 = z ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) zzjjVar2 : null;
                                        LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData locationData3 = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations3 != null ? loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations3.value : null;
                                        locationData3.getClass();
                                        Iterator it = CollectionsKt.drop(locationData3.locations, 1).iterator();
                                        while (it.hasNext()) {
                                            createListBuilder.add(new ListUnorderedItem("", null, (String) it.next(), null, 10));
                                        }
                                    } else {
                                        if (zzjjVar2 != null) {
                                            LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime = zzjjVar2 instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) zzjjVar2 : null;
                                            if (loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime != null) {
                                                loyaltyPromotionAvailability = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime.value;
                                                if (loyaltyPromotionAvailability == null) {
                                                    zzjjVar2.getClass();
                                                    boolean z2 = zzjjVar2 instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime;
                                                    LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime2 = z2 ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) zzjjVar2 : null;
                                                    LoyaltyPromotionAvailability loyaltyPromotionAvailability2 = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime2 != null ? loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime2.value : null;
                                                    loyaltyPromotionAvailability2.getClass();
                                                    LoyaltyPromotionAvailability.DayTime dayTime = (LoyaltyPromotionAvailability.DayTime) CollectionsKt.first(loyaltyPromotionAvailability2.day_time);
                                                    createListBuilder.add(new ListUnorderedItem(str6 == null ? "" : str6, null, Recorder$$ExternalSyntheticOutline2.m(dayTime.day, " ", dayTime.time_range), null, 10));
                                                    LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime3 = z2 ? (LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) zzjjVar2 : null;
                                                    LoyaltyPromotionAvailability loyaltyPromotionAvailability3 = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime3 != null ? loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime3.value : null;
                                                    loyaltyPromotionAvailability3.getClass();
                                                    for (LoyaltyPromotionAvailability.DayTime dayTime2 : CollectionsKt.drop(loyaltyPromotionAvailability3.day_time, 1)) {
                                                        createListBuilder.add(new ListUnorderedItem("", null, Recorder$$ExternalSyntheticOutline2.m(dayTime2.day, " ", dayTime2.time_range), null, 10));
                                                    }
                                                }
                                            }
                                        }
                                        loyaltyPromotionAvailability = null;
                                        if (loyaltyPromotionAvailability == null) {
                                        }
                                    }
                                }
                            }
                            locationData = null;
                            if (locationData == null) {
                            }
                        }
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
            }
            ListUnorderedKt.ListUnordered(Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder)), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 3072, 54);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18((Object) modifier, (Object) loyaltyPromotionData, (Object) function1, i, 26);
        }
    }

    public static final void SquareLoyaltyDetailsPlaceholder(Modifier modifier, LoyaltyPromotionDetailsPlaceholder loyaltyPromotionDetailsPlaceholder, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1900424658);
        int i2 = i | 6 | (gapComposer.changedInstance(loyaltyPromotionDetailsPlaceholder) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData loyaltyPromotionData = loyaltyPromotionDetailsPlaceholder.promotion;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (loyaltyPromotionData == null) {
                gapComposer.startReplaceGroup(-707719456);
            } else {
                gapComposer.startReplaceGroup(-707719455);
                LoyaltyPromotion(companion, loyaltyPromotionData, function1, gapComposer, i2 & 910);
            }
            gapComposer.end(false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(modifier2, loyaltyPromotionDetailsPlaceholder, function1, i, 29);
        }
    }

    public static final void SquareLoyaltySheetPlaceholder(Modifier modifier, LoyaltyPromotionSheetPlaceholder loyaltyPromotionSheetPlaceholder, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1700924695);
        int i2 = i | 6 | (gapComposer.changedInstance(loyaltyPromotionSheetPlaceholder) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            LoyaltyPromotionSheetPlaceholder.LocationData locationData = loyaltyPromotionSheetPlaceholder.locations;
            if (locationData != null) {
                List list = locationData.locations;
                String str = locationData.title;
                createListBuilder.add(new ListUnorderedItem(str == null ? "" : str, null, (String) CollectionsKt.first(list), null, 10));
                Iterator it = CollectionsKt.drop(list, 1).iterator();
                while (it.hasNext()) {
                    createListBuilder.add(new ListUnorderedItem("", null, (String) it.next(), null, 10));
                }
            }
            LoyaltyPromotionAvailability loyaltyPromotionAvailability = loyaltyPromotionSheetPlaceholder.available_time;
            if (loyaltyPromotionAvailability != null) {
                List list2 = loyaltyPromotionAvailability.day_time;
                LoyaltyPromotionAvailability.DayTime dayTime = (LoyaltyPromotionAvailability.DayTime) CollectionsKt.first(list2);
                String str2 = loyaltyPromotionAvailability.title;
                createListBuilder.add(new ListUnorderedItem(str2 == null ? "" : str2, null, Recorder$$ExternalSyntheticOutline2.m(dayTime.day, " ", dayTime.time_range), null, 10));
                for (LoyaltyPromotionAvailability.DayTime dayTime2 : CollectionsKt.drop(list2, 1)) {
                    createListBuilder.add(new ListUnorderedItem("", null, Recorder$$ExternalSyntheticOutline2.m(dayTime2.day, " ", dayTime2.time_range), null, 10));
                }
            }
            ListUnorderedKt.ListUnordered(Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder)), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 3072, 54);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-504810383, new MusicViewKt$$ExternalSyntheticLambda7(13, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18((Object) modifier2, (Object) loyaltyPromotionSheetPlaceholder, (Object) function1, i, 27);
        }
    }
}
