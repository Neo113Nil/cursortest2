package com.squareup.cash.p2pblocking.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.text.InlineIconPosition;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class AllowlistSelectionKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AllowlistSelectionViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AllowlistSelectionKt$$ExternalSyntheticLambda6(AllowlistSelectionViewModel allowlistSelectionViewModel, Function1 function1, int i) {
        this.$r8$classId = 0;
        this.f$0 = allowlistSelectionViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        AllowlistSelectionViewModel allowlistSelectionViewModel = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                P2PListRowKt.AllowListSelection(allowlistSelectionViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
                    String str = allowlistSelectionViewModel.limitDescription;
                    if (str == null) {
                        gapComposer.startReplaceGroup(-17016421);
                        gapComposer.end(false);
                        modifier = null;
                    } else {
                        gapComposer.startReplaceGroup(-17016420);
                        modifier = null;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        String str2 = allowlistSelectionViewModel.safetyResources;
                        TextStyle textStyle = Strings.getTypography(gapComposer).linkSmall;
                        long j = Strings.getColors(gapComposer).semantic.text.standard;
                        Painter painter = Icons.SecurityLockOutline16.painter(gapComposer);
                        InlineIconPosition inlineIconPosition = InlineIconPosition.START;
                        long j2 = Strings.getColors(gapComposer).semantic.text.standard;
                        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, 3);
                        Object rememberedValue = gapComposer.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
                        Role role = new Role(0);
                        boolean changed = gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda0(20, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        zzacp.m2014InlineIconTextQqsJerU(str2, painter, ImageKt.m182clickableO2vRcR0$default(wrapContentSize$default, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, role, (Function0) rememberedValue2, 12), j2, inlineIconPosition, textStyle, j, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, (Painter.$stable << 3) | 24576, 0, 32640);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, modifier);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    P2PListRowKt.AllowListSelection(allowlistSelectionViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    P2PListRowKt.AllowListSelection(allowlistSelectionViewModel, function1, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AllowlistSelectionKt$$ExternalSyntheticLambda6(AllowlistSelectionViewModel allowlistSelectionViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = allowlistSelectionViewModel;
        this.f$1 = function1;
    }
}
