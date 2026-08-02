package com.squareup.cash.moneybot.views.menu;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.viewmodels.TokenUsageViewModel;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class TokenUsageSheetContentKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ TokenUsageViewModel f$1;

    public /* synthetic */ TokenUsageSheetContentKt$$ExternalSyntheticLambda0(Modifier modifier, TokenUsageViewModel tokenUsageViewModel) {
        this.f$0 = modifier;
        this.f$1 = tokenUsageViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        TokenUsageViewModel tokenUsageViewModel = this.f$1;
        switch (i) {
            case 0:
                float f = tokenUsageViewModel.usagePercentage;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 32.0f);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
                    DefaultSizes sizes = Strings.getSizes(gapComposer);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Request$Priority$EnumUnboxingLocalUtility.m(sizes, companion, 8.0f, gapComposer);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.moneybot_token_usage_sheet_title), (Map) null, (Function1) null, false);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 32.0f, gapComposer);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
                    BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 6);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.moneybot_token_usage_model_name_label), (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, tokenUsageViewModel.modelName, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 6);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.moneybot_token_usage_usage_label), (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, tokenUsageViewModel.tokenUsage, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 6);
                    int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth3);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.moneybot_token_usage_limit_label), (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, tokenUsageViewModel.tokenLimit, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth4);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.moneybot_token_usage_progress_label), (Map) null, (Function1) null, false);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 4.0f, gapComposer);
                    ExpandableContentKt.m3635TokenUsageProgressBar6a0pyJM(f, 390, gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 8.0f));
                    Strings.getSizes(gapComposer).getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.brand, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(R.string.moneybot_token_usage_progress_text, new Object[]{Integer.valueOf((int) (f * 100.0f))}, gapComposer), (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    Strings.getSizes(gapComposer).getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ExpandableContentKt.TokenUsageSheetContent(tokenUsageViewModel, modifier, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TokenUsageSheetContentKt$$ExternalSyntheticLambda0(TokenUsageViewModel tokenUsageViewModel, Modifier modifier, int i) {
        this.f$1 = tokenUsageViewModel;
        this.f$0 = modifier;
    }
}
