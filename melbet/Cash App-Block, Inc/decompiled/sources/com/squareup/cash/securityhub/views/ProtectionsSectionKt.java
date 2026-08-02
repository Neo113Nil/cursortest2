package com.squareup.cash.securityhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionUiModel;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSettingsRowId;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public abstract class ProtectionsSectionKt {
    public static final List SETTINGS_ROWS = CollectionsKt__CollectionsKt.listOf((Object[]) new SettingsRowDefinition[]{new SettingsRowDefinition(ProtectionsSettingsRowId.SECURITY, Icons.LockLocked24, R.string.security_hub_protections_security), new SettingsRowDefinition(ProtectionsSettingsRowId.PRIVACY, Icons.SensitiveHidden24, R.string.security_hub_protections_privacy), new SettingsRowDefinition(ProtectionsSettingsRowId.NOTIFICATIONS, Icons.Notifications24, R.string.security_hub_protections_notifications), new SettingsRowDefinition(ProtectionsSettingsRowId.PERSONAL_INFO, Icons.Avatar24, R.string.security_hub_protections_personal_info)});

    /* JADX WARN: Code restructure failed: missing block: B:69:0x028e, code lost:
    
        if (r6 == r23) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProtectionsSection(Function1 function1, Modifier modifier, ProtectionsSectionUiModel protectionsSectionUiModel, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier modifier3;
        Function1 function13;
        int i2;
        Object obj;
        Modifier modifier4;
        GapComposer gapComposer2;
        Object obj2;
        Object obj3;
        ProtectionsSectionUiModel protectionsSectionUiModel2 = protectionsSectionUiModel;
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1420185825);
        Applier applier = gapComposer3.applier;
        int i3 = i | (gapComposer3.changedInstance(function1) ? 4 : 2) | 48 | (gapComposer3.changedInstance(protectionsSectionUiModel2) ? 256 : 128);
        final int i4 = 1;
        final int i5 = 0;
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer3.startDefaults();
            int i6 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i6 == 0 || gapComposer3.getDefaultsInvalid()) {
                modifier3 = companion;
            } else {
                gapComposer3.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer3.endDefaults();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier3);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            boolean isEmpty = protectionsSectionUiModel2.educationCards.isEmpty();
            Object obj4 = Composer.Companion.Empty;
            if (isEmpty) {
                function13 = function1;
                i2 = i3;
                modifier2 = modifier3;
                obj = obj4;
                modifier4 = null;
                gapComposer3.startReplaceGroup(956973707);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(956392302);
                i2 = i3;
                modifier2 = modifier3;
                Object obj5 = obj4;
                ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer3, R.string.security_hub_education_header), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer3, 0, 30);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                Modifier scroll$default = ImageKt.scroll$default(companion, ImageKt.rememberScrollState(gapComposer3), true, false);
                ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer3.consume(providableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(scroll$default, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ((DefaultSizes) gapComposer3.consume(providableCompositionLocal)).getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer3, 0);
                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(function0);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                gapComposer3.startReplaceGroup(410294956);
                protectionsSectionUiModel2 = protectionsSectionUiModel;
                for (EducationCardUiModel educationCardUiModel : protectionsSectionUiModel2.educationCards) {
                    boolean changedInstance = ((i2 & 14) == 4) | gapComposer3.changedInstance(educationCardUiModel);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changedInstance) {
                        obj3 = obj5;
                    } else {
                        obj3 = obj5;
                        if (rememberedValue != obj3) {
                            EducationCardKt.EducationCard(educationCardUiModel, (Function0) rememberedValue, null, gapComposer3, 0);
                            obj5 = obj3;
                        }
                    }
                    rememberedValue = new ProtectionsSectionKt$$ExternalSyntheticLambda0(function1, educationCardUiModel, 0);
                    gapComposer3.updateRememberedValue(rememberedValue);
                    EducationCardKt.EducationCard(educationCardUiModel, (Function0) rememberedValue, null, gapComposer3, 0);
                    obj5 = obj3;
                }
                modifier4 = null;
                function13 = function1;
                obj = obj5;
                gapComposer3.end(false);
                gapComposer3.end(true);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                gapComposer3.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, modifier4);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer3, R.string.security_hub_protections_header), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer3, 0, 30);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, modifier4);
            gapComposer3.startReplaceGroup(-523313530);
            GapComposer gapComposer4 = gapComposer3;
            for (Iterator it = SETTINGS_ROWS.iterator(); it.hasNext(); it = it) {
                final SettingsRowDefinition settingsRowDefinition = (SettingsRowDefinition) it.next();
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(664160408, new Function2() { // from class: com.squareup.cash.securityhub.views.ProtectionsSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        int i7 = i5;
                        SettingsRowDefinition settingsRowDefinition2 = settingsRowDefinition;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Trace.m1191Iconww6aTOc(settingsRowDefinition2.icon, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer3;
                                if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, settingsRowDefinition2.labelRes), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer4);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1889826201, new Function2() { // from class: com.squareup.cash.securityhub.views.ProtectionsSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        int i7 = i4;
                        SettingsRowDefinition settingsRowDefinition2 = settingsRowDefinition;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Trace.m1191Iconww6aTOc(settingsRowDefinition2.icon, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                GapComposer gapComposer6 = (GapComposer) composer3;
                                if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, settingsRowDefinition2.labelRes), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer4);
                int i7 = ((i2 & 14) == 4 ? i4 : i5) | (gapComposer4.changed(settingsRowDefinition) ? 1 : 0);
                Object rememberedValue2 = gapComposer4.rememberedValue();
                if (i7 != 0 || rememberedValue2 == obj) {
                    rememberedValue2 = new ShareSheetViewKt$$ExternalSyntheticLambda5(18, function13, settingsRowDefinition);
                    gapComposer4.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                int i8 = i5;
                GapComposer gapComposer5 = gapComposer4;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, function02, false, true, null, null, push, 0L, gapComposer5, 806879286, 3508);
                i4 = i4;
                function13 = function1;
                gapComposer4 = gapComposer5;
                obj = obj;
                modifier4 = null;
                i5 = i8;
            }
            Object obj6 = obj;
            function12 = function13;
            boolean z = i4;
            boolean z2 = i5;
            gapComposer4.end(z2);
            if (protectionsSectionUiModel2.supportRows.isEmpty()) {
                gapComposer4.startReplaceGroup(957773259);
                gapComposer4.end(z2);
                gapComposer2 = gapComposer4;
            } else {
                gapComposer4.startReplaceGroup(957521477);
                DBUtil.SpacerBetweenSectionLarge(z2 ? 1 : 0, z ? 1 : 0, gapComposer4, null);
                DBUtil.SpacerWithinSectionMedium(z2 ? 1 : 0, z ? 1 : 0, gapComposer4, null);
                String str = protectionsSectionUiModel2.supportSectionTitle;
                List list = protectionsSectionUiModel2.supportRows;
                boolean z3 = (i2 & 14) == 4 ? z ? 1 : 0 : z2 ? 1 : 0;
                Object rememberedValue3 = gapComposer4.rememberedValue();
                if (!z3) {
                    obj2 = rememberedValue3;
                }
                Object scoreHomeKt$$ExternalSyntheticLambda5 = new ScoreHomeKt$$ExternalSyntheticLambda5(6, function12);
                gapComposer4.updateRememberedValue(scoreHomeKt$$ExternalSyntheticLambda5);
                obj2 = scoreHomeKt$$ExternalSyntheticLambda5;
                GapComposer gapComposer6 = gapComposer4;
                EducationCardKt.SecurityEducationSupportSection(str, list, (Function1) obj2, null, gapComposer6, 0);
                GapComposer gapComposer7 = gapComposer6;
                gapComposer7.end(z2);
                gapComposer2 = gapComposer7;
            }
            gapComposer2.end(z);
            gapComposer = gapComposer2;
        } else {
            function12 = function1;
            gapComposer3.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(function12, modifier2, protectionsSectionUiModel2, i, 6);
        }
    }
}
