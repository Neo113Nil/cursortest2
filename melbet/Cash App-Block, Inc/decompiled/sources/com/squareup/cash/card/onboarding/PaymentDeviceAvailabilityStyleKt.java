package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.LabelsSection;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class PaymentDeviceAvailabilityStyleKt {
    public static final List PREVIEW_ITEMS;

    static {
        List list = TestData.STROKES;
        List list2 = TestData.PAYMENT_DEVICE_CUSTOMIZATION.items;
        PREVIEW_ITEMS = list2;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((PaymentDeviceItemViewModel) it.next()).availability == PaymentDeviceAvailability.AVAILABLE) {
                Iterator it2 = PREVIEW_ITEMS.iterator();
                while (it2.hasNext()) {
                    if (((PaymentDeviceItemViewModel) it2.next()).availability == PaymentDeviceAvailability.NEW) {
                        Iterator it3 = PREVIEW_ITEMS.iterator();
                        while (it3.hasNext()) {
                            if (((PaymentDeviceItemViewModel) it3.next()).availability == PaymentDeviceAvailability.SOLD_OUT) {
                                Iterator it4 = PREVIEW_ITEMS.iterator();
                                while (it4.hasNext()) {
                                    if (((PaymentDeviceItemViewModel) it4.next()).availability == PaymentDeviceAvailability.TEASER) {
                                        Iterator it5 = PREVIEW_ITEMS.iterator();
                                        while (it5.hasNext()) {
                                            if (((PaymentDeviceItemViewModel) it5.next()).availability == PaymentDeviceAvailability.COMING_SOON) {
                                                return;
                                            }
                                        }
                                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                        return;
                                    }
                                }
                                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                return;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return;
                    }
                }
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0411  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardOverlayContent(PaymentDeviceItemViewModel paymentDeviceItemViewModel, ZoomLevel zoomLevel, Composer composer, int i) {
        Color color;
        int ordinal;
        long j;
        String str;
        boolean z;
        Color m;
        long j2;
        Color m2;
        BadgeStyle badgeStyle;
        boolean z2;
        boolean z3;
        paymentDeviceItemViewModel.getClass();
        String str2 = paymentDeviceItemViewModel.priceLabel;
        AvailabilityPill availabilityPill = paymentDeviceItemViewModel.availabilityPill;
        zoomLevel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1243153262);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? i | (gapComposer.changedInstance(paymentDeviceItemViewModel) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(zoomLevel.ordinal()) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal2 = zoomLevel.ordinal();
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            Color color2 = null;
            if (ordinal2 == 0) {
                gapComposer.startReplaceGroup(724310527);
                PaymentDeviceAvailability paymentDeviceAvailability = paymentDeviceItemViewModel.availability;
                if (paymentDeviceAvailability == PaymentDeviceAvailability.SOLD_OUT && availabilityPill != null && (str = availabilityPill.text) != null) {
                    str2 = str;
                }
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                paymentDeviceAvailability.getClass();
                int ordinal3 = paymentDeviceAvailability.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        gapComposer.startReplaceGroup(1489621958);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        color2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, colors.semantic.text.brand);
                    } else if (ordinal3 == 2 || ordinal3 == 3) {
                        gapComposer.startReplaceGroup(1489625863);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        color2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, colors2.semantic.text.subtle);
                    } else if (ordinal3 != 4) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1489619569, false);
                    }
                    color = color2;
                    if (color != null) {
                        gapComposer.startReplaceGroup(1946152632);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1946152633);
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(modifier, 6.0f), color.value, RoundedCornerShapeKt.CircleShape), gapComposer, 0);
                        gapComposer.end(false);
                    }
                    TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
                    ordinal = paymentDeviceAvailability.ordinal();
                    if (ordinal != 0 || ordinal == 1) {
                        gapComposer.startReplaceGroup(-75755370);
                        j = Strings.getColors(gapComposer).semantic.text.standard;
                        gapComposer.end(false);
                    } else {
                        if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -75760061, false);
                        }
                        gapComposer.startReplaceGroup(-75749132);
                        j = Strings.getColors(gapComposer).semantic.text.subtle;
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    gapComposer.end(false);
                }
                gapComposer.startReplaceGroup(-1066149284);
                gapComposer.end(false);
                color = color2;
                if (color != null) {
                }
                TextStyle textStyle2 = Strings.getTypography(gapComposer).bodyXSmall;
                ordinal = paymentDeviceAvailability.ordinal();
                if (ordinal != 0) {
                }
                gapComposer.startReplaceGroup(-75755370);
                j = Strings.getColors(gapComposer).semantic.text.standard;
                gapComposer.end(false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                gapComposer.end(false);
            } else if (ordinal2 == 1) {
                gapComposer.startReplaceGroup(725424698);
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(modifier, 1.0f), RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode2);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CalendarRowKt$$ExternalSyntheticLambda10(18);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(10.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 54);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, semantics);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                gapComposer.startReplaceGroup(-1197696964);
                if (availabilityPill == null) {
                    z = false;
                    gapComposer.end(false);
                    badgeStyle = null;
                } else {
                    z = false;
                    LabelsSection.LabelTreatment labelTreatment = availabilityPill.treatment;
                    String str3 = availabilityPill.text;
                    com.squareup.protos.cash.ui.Color color3 = labelTreatment.textColor;
                    if (color3 == null) {
                        gapComposer.startReplaceGroup(1998256219);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 64459878, color3, gapComposer, false);
                    }
                    if (m == null) {
                        gapComposer.startReplaceGroup(64461380);
                        Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j2 = colors3.semantic.text.standard;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(64459272);
                        gapComposer.end(false);
                        j2 = m.value;
                    }
                    long j3 = j2;
                    com.squareup.protos.cash.ui.Color color4 = labelTreatment.backgroundColor;
                    if (color4 == null) {
                        gapComposer.startReplaceGroup(1998361371);
                        gapComposer.end(false);
                        m2 = null;
                    } else {
                        m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 64463270, color4, gapComposer, false);
                    }
                    com.squareup.protos.cash.ui.Color color5 = labelTreatment.borderColor;
                    if (color5 == null) {
                        gapComposer.startReplaceGroup(1998413947);
                        gapComposer.end(false);
                    } else {
                        color2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 64464966, color5, gapComposer, false);
                    }
                    BadgeStyle badgeStyle2 = new BadgeStyle(str3, j3, m2, color2);
                    gapComposer.end(false);
                    badgeStyle = badgeStyle2;
                }
                if (badgeStyle == null) {
                    gapComposer.startReplaceGroup(-2044471231);
                    gapComposer.end(z);
                    z3 = true;
                    z2 = false;
                } else {
                    gapComposer.startReplaceGroup(-2044471230);
                    RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f);
                    Color color6 = badgeStyle.backgroundColor;
                    if (color6 != null) {
                        modifier = ImageKt.m177backgroundbw27NRU(modifier, color6.value, m340RoundedCornerShape0680j_4);
                    }
                    Color color7 = badgeStyle.borderColor;
                    if (color7 != null) {
                        modifier = ImageKt.m178borderxT4_qwU(modifier, 1.0f, color7.value, m340RoundedCornerShape0680j_4);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(modifier, 8.0f, 4.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    String str4 = badgeStyle.text;
                    TextStyle textStyle3 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
                    long j4 = badgeStyle.textColor;
                    z2 = false;
                    z3 = true;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j4, (Composer) gapComposer, (Modifier) null, textStyle3, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    gapComposer.end(false);
                }
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{paymentDeviceItemViewModel.name, str2});
                ArrayList arrayList = new ArrayList();
                for (Object obj : listOf) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                String joinToString$default = CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62);
                if (joinToString$default.length() > 0) {
                    gapComposer.startReplaceGroup(-2043584072);
                    TextStyle textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z2);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle4, (TextLineBalancing) null, joinToString$default, (Map) null, (Function1) null, false);
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(-2043388989);
                    gapComposer.end(z2);
                }
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, z3, z3, z2);
            } else {
                if (ordinal2 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -669370956, false);
                }
                gapComposer.startReplaceGroup(-669276906);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(paymentDeviceItemViewModel, zoomLevel, i, 15);
        }
    }
}
