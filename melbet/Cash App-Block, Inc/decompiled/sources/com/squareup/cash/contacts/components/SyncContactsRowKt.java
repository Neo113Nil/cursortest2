package com.squareup.cash.contacts.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class SyncContactsRowKt {
    public static final ComposableLambdaImpl lambda$418096613 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(18), false, 418096613);
    public static final ComposableLambdaImpl lambda$171581655 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(19), false, 171581655);
    public static final ComposableLambdaImpl lambda$1065981753 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(20), false, 1065981753);

    /* renamed from: lambda$-1626487923, reason: not valid java name */
    public static final ComposableLambdaImpl f363lambda$1626487923 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(21), false, -1626487923);

    public static final void NoContactsFoundCard(int i, Composer composer, Modifier modifier, String str, String str2) {
        Modifier modifier2;
        String str3;
        String str4;
        String stringResource;
        String str5;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1411109208);
        int i2 = i | 150;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            int i3 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i3 == 0 || gapComposer.getDefaultsInvalid()) {
                String stringResource2 = Room.stringResource(gapComposer, R.string.no_contacts_found_title);
                stringResource = Room.stringResource(gapComposer, R.string.no_contacts_found_body);
                str5 = stringResource2;
                modifier3 = companion;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                str5 = str;
                stringResource = str2;
            }
            gapComposer.endDefaults();
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f, Strings.getColors(gapComposer).component.card.border.f170default, m340RoundedCornerShape0680j_4), Strings.getColors(gapComposer).component.card.background.f169default, m340RoundedCornerShape0680j_4), 16.0f, 24.0f, 16.0f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
            String str6 = str5;
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
            String str7 = stringResource;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = modifier3;
            str4 = str7;
            str3 = str6;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            str3 = str;
            str4 = str2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(modifier2, str3, str4, i, 3);
        }
    }

    public static final void SyncContactsCard(int i, int i2, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        Modifier modifier2;
        int i3;
        String str3;
        Modifier modifier3;
        String str4;
        int i4;
        String stringResource;
        String stringResource2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-405126078);
        int i5 = i | (gapComposer.changedInstance(function0) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (gapComposer.changed(modifier2) ? 32 : 16);
        }
        int i7 = i3 | 1152;
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 1171) != 1170)) {
            gapComposer.startDefaults();
            int i8 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i8 == 0 || gapComposer.getDefaultsInvalid()) {
                if (i6 != 0) {
                    modifier2 = companion;
                }
                i4 = i7 & (-8065);
                stringResource = Room.stringResource(gapComposer, R.string.sync_contacts_upsell_card_title);
                stringResource2 = Room.stringResource(gapComposer, R.string.sync_contacts_upsell_card_body);
            } else {
                gapComposer.skipToGroupEnd();
                i4 = i7 & (-8065);
                stringResource = str;
                stringResource2 = str2;
            }
            int i9 = i4;
            Modifier modifier4 = modifier2;
            gapComposer.endDefaults();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 1.0f, Strings.getColors(gapComposer).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m178borderxT4_qwU, 32.0f, 16.0f, 32.0f, 12.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            String str5 = stringResource;
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
            String str6 = stringResource2;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
            coil3.size.SizeKt.Button(function0, SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.SUBTLE, false, false, null, lambda$418096613, gapComposer, (i9 & 14) | 1573296, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
            str4 = str6;
            str3 = str5;
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            str3 = str;
            modifier3 = modifier2;
            str4 = str2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SyncContactsCardKt$$ExternalSyntheticLambda0(function0, modifier3, str3, str4, i, i2);
        }
    }

    public static final void SyncContactsRow(int i, Composer composer, Modifier modifier, Function0 function0) {
        GapComposer gapComposer;
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1253039724);
        int i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i | 48;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Icons icons = Icons.Avatar24;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.inverse;
            Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j2 = colors2.semantic.icon.inverse;
            CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(function0, null, false, lambda$171581655, 14);
            ComposableLambdaImpl composableLambdaImpl = lambda$1065981753;
            modifier2 = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, composableLambdaImpl, modifier2, j2, null, null, false, true, f363lambda$1626487923, null, buttonCompact, 0L, null, gapComposer, 805334070, 6, 27072);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function0, modifier2, i, 4);
        }
    }
}
