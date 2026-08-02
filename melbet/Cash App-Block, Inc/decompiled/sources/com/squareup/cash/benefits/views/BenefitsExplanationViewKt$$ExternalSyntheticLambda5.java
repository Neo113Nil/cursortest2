package com.squareup.cash.benefits.views;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawlInfoArcadeKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubSubsectionKt;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.KCallablesJvm;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsExplanationViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ BenefitsExplanationViewKt$$ExternalSyntheticLambda5(ArrayList arrayList) {
        this.$r8$classId = 0;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    int i2 = 0;
                    for (Object obj3 : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        BenefitsExplanationViewModel.BenefitsExplanationContent benefitsExplanationContent = (BenefitsExplanationViewModel.BenefitsExplanationContent) obj3;
                        GapComposer gapComposer2 = gapComposer;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsExplanationContent.text, (Map) null, (Function1) null, false);
                        GapComposer gapComposer3 = gapComposer2;
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                        gapComposer3.startReplaceGroup(656686081);
                        for (String str : benefitsExplanationContent.listItems) {
                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, Modifier.Companion.$$INSTANCE);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer3.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            GapComposer gapComposer4 = gapComposer3;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "\t•\t\t", (Map) null, (Function1) null, false);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            gapComposer3 = gapComposer4;
                            gapComposer3.end(true);
                        }
                        gapComposer3.end(false);
                        if (i2 != arrayList.size() - 1) {
                            gapComposer3.startReplaceGroup(-679168800);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-679121711);
                            gapComposer3.end(false);
                        }
                        gapComposer = gapComposer3;
                        i2 = i3;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AtmWithdrawlInfoArcadeKt.AtmExplainerLimits(arrayList, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                SafetyHubSubsectionKt.BulletPoints(arrayList, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                KCallablesJvm.StatsHeader(arrayList, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                LocaleToggleKt.OverviewList(arrayList, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BenefitsExplanationViewKt$$ExternalSyntheticLambda5(ArrayList arrayList, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arrayList;
    }
}
