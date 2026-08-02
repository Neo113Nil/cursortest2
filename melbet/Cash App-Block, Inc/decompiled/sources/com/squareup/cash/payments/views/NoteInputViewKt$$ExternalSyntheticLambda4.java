package com.squareup.cash.payments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class NoteInputViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ NoteInputViewKt$$ExternalSyntheticLambda4(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        String str = this.f$0;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                function2.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changedInstance(function2) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    if (str.length() == 0) {
                        gapComposer.startReplaceGroup(405745676);
                        TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).input;
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.input.text.placeholder, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, this.f$1, (Map) null, (Function1) null, false);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(405925383);
                        gapComposer.end(false);
                    }
                    function2.invoke(gapComposer, Integer.valueOf(intValue & 14));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                    String str2 = this.f$1;
                    if (str2 == null) {
                        gapComposer2.startReplaceGroup(-1070467755);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1070467754);
                        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 8.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    SpacerKt.Spacer(gapComposer3, SizeKt.m290width3ABfNKs(companion, 8.0f));
                    Trace.m1191Iconww6aTOc(Icons.AlertFill16, (String) null, (Modifier) null, Strings.getColors(gapComposer3).semantic.icon.inverse, gapComposer3, 54, 4);
                    SpacerKt.Spacer(gapComposer3, SizeKt.m290width3ABfNKs(companion, 8.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, companion);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 8.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs2);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.inverse, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).labelMedium, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.inverse, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodyMedium, (TextLineBalancing) null, this.f$1, (Map) null, (Function1) null, false);
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer3, true, true, true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Countries.PageHeader(this.f$0, (Modifier) null, DirectDepositFormErrorKt.lambda$1955273881, this.f$1, gapComposer4, MLKEMEngine.KyberPolyBytes, 2);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    QuickPayViewKt.SectionHeader(0, gapComposer5, null, str, this.f$1);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
