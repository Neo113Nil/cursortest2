package app.cash.local.views.internal.menus;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SwitchKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuHoursKt;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class LocalMenuSelectorKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalMenuSelector(Modifier modifier, MenuSelectorOption menuSelectorOption, List list, boolean z, Function0 function0, boolean z2, Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        RecomposeScopeImpl endRestartGroup;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        BiasAlignment.Horizontal horizontal;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Modifier modifier2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        boolean z7;
        MenuSelectorOption menuSelectorOption2;
        boolean z8;
        MenuHours menuHours;
        list.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1697014514);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(menuSelectorOption) ? 32 : 16) | (gapComposer.changedInstance(list) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            z3 = z;
        } else {
            z3 = z;
            i3 = i4 | (gapComposer.changed(z3) ? 2048 : 1024);
        }
        int i6 = i3 | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        int i7 = i2 & 32;
        if (i7 != 0) {
            i6 |= 196608;
        } else if ((i & 196608) == 0) {
            z4 = z2;
            i6 |= gapComposer.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
            if (gapComposer.shouldExecute(i6 & 1, (74899 & i6) == 74898)) {
                gapComposer.skipToGroupEnd();
                z5 = z3;
                z6 = z4;
            } else {
                boolean z9 = i5 != 0 ? true : z3;
                boolean z10 = i7 != 0 ? false : z4;
                MenuSelectorOption menuSelectorOption3 = menuSelectorOption == null ? (MenuSelectorOption) CollectionsKt.firstOrNull(list) : menuSelectorOption;
                boolean z11 = list.size() > 1;
                boolean z12 = z11 && z9;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal2, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                boolean z13 = z12;
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
                gapComposer.startReplaceGroup(-145919375);
                Modifier modifier3 = Modifier.Companion.$$INSTANCE;
                if (z13) {
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj = DefaultSizes.border.entries;
                    Modifier clip = ClipKt.clip(modifier3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    modifier2 = modifier3;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    horizontal = horizontal2;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    menuSelectorOption2 = menuSelectorOption3;
                    z7 = true;
                    z8 = false;
                    modifier3 = ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13), z11, null, null, function0, 24);
                } else {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                    horizontal = horizontal2;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    modifier2 = modifier3;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    z7 = true;
                    menuSelectorOption2 = menuSelectorOption3;
                    z8 = false;
                }
                boolean z14 = z11;
                gapComposer.end(z8);
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(modifier3, z14 ? 8.0f : 4.0f, 4.0f);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer, 54);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$13;
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$18, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$1;
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$19);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, z7, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier modifier4 = modifier2;
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, modifier4);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$18, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$19);
                String str = menuSelectorOption2 != null ? menuSelectorOption2.name : null;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                MenuSelectorOption menuSelectorOption4 = menuSelectorOption2;
                boolean z15 = z8;
                Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, Room.getSp(20), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(20), null, null, 0, 16646141), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                if (MenuHoursKt.isNullOrAvailableNow(menuSelectorOption4 != null ? menuSelectorOption4.hours : null)) {
                    gapComposer.startReplaceGroup(1631401636);
                    gapComposer.end(z15);
                } else {
                    gapComposer.startReplaceGroup(1631242761);
                    Trace.m1191Iconww6aTOc(Icons.Time16, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.extraSubtle, gapComposer, 54, 4);
                    gapComposer.end(z15);
                }
                if (z14) {
                    gapComposer.startReplaceGroup(1631450802);
                    Trace.m1191Iconww6aTOc(Icons.ExpandCentered24, (String) null, SizeKt.m285size3ABfNKs(modifier4, 16.0f), Strings.getColors(gapComposer).semantic.icon.extraSubtle, gapComposer, 438, 0);
                    gapComposer.end(z15);
                } else {
                    gapComposer.startReplaceGroup(1631662532);
                    gapComposer.end(z15);
                }
                gapComposer.end(true);
                MenuHours menuHours2 = (menuSelectorOption4 == null || (menuHours = menuSelectorOption4.hours) == null || !z10) ? null : menuHours;
                if (menuHours2 == null) {
                    gapComposer.startReplaceGroup(-1865705608);
                    gapComposer.end(z15);
                } else {
                    gapComposer.startReplaceGroup(-1865705607);
                    LocalMenuHoursViewKt.LocalMenuHoursView(SpacerKt.m302paddingqDBjuR0$default(modifier4, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), menuHours2, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyXSmall, 0L, Room.getSp(12), null, Fonts.CashSans, Room.getSp(0.12d), null, 0L, null, null, null, 0, Room.getSp(12), null, null, 0, 16645981), gapComposer, 6, 0);
                    gapComposer = gapComposer;
                    gapComposer.end(z15);
                }
                gapComposer.end(true);
                gapComposer.end(true);
                z5 = z9;
                z6 = z10;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda0(modifier, menuSelectorOption, list, z5, function0, z6, i, i2);
                return;
            }
            return;
        }
        z4 = z2;
        if (gapComposer.shouldExecute(i6 & 1, (74899 & i6) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentCategory.deepLinkSpecs;
    }
}
