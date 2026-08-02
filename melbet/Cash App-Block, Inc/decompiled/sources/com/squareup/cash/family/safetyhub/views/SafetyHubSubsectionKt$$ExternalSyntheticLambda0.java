package com.squareup.cash.family.safetyhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.local.primitives.BrandCardDetailsKt;
import app.cash.molecule.PlatformKt;
import com.squareup.protos.cash.aegis.core.Subsection;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.cash.aegis.core.SubsectionBlock$Type$BulletPoints;
import com.squareup.protos.cash.aegis.core.SubsectionBlock$Type$Paragraph;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.util.cash.StringsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SafetyHubSubsectionKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Subsection f$0;

    public /* synthetic */ SafetyHubSubsectionKt$$ExternalSyntheticLambda0(Subsection subsection) {
        this.f$0 = subsection;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Subsection subsection = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
                    LocalizedString localizedString = subsection.pill_text;
                    if (localizedString == null) {
                        gapComposer.startReplaceGroup(726295206);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(726295207);
                        SafetyHubSubsectionKt.PillTitle(StringsKt.translated(localizedString), gapComposer, 0);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    }
                    gapComposer.startReplaceGroup(1547453673);
                    int i2 = 0;
                    for (Object obj3 : subsection.blocks) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        SubsectionBlock subsectionBlock = (SubsectionBlock) obj3;
                        if (i2 > 0) {
                            gapComposer.startReplaceGroup(1675074581);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(1675121670);
                            gapComposer.end(false);
                        }
                        BrandCardDetailsKt brandCardDetailsKt = subsectionBlock.f1244type;
                        if (brandCardDetailsKt instanceof SubsectionBlock$Type$Paragraph) {
                            gapComposer.startReplaceGroup(1300964990);
                            SafetyHubSubsectionKt.Paragraph(StringsKt.translated(((SubsectionBlock$Type$Paragraph) brandCardDetailsKt).value), gapComposer, 0);
                            gapComposer.end(false);
                        } else if (brandCardDetailsKt instanceof SubsectionBlock$Type$BulletPoints) {
                            gapComposer.startReplaceGroup(1675293751);
                            List list = ((SubsectionBlock$Type$BulletPoints) brandCardDetailsKt).value.text;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(StringsKt.translated((LocalizedString) it.next()));
                            }
                            SafetyHubSubsectionKt.BulletPoints(arrayList, gapComposer, 0);
                            gapComposer.end(false);
                        } else {
                            if (brandCardDetailsKt != null) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1300962765, false);
                            }
                            gapComposer.startReplaceGroup(1300970784);
                            gapComposer.end(false);
                        }
                        i2 = i3;
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                SafetyHubSubsectionKt.SafetyHubSubsection(subsection, composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SafetyHubSubsectionKt$$ExternalSyntheticLambda0(Subsection subsection, int i) {
        this.f$0 = subsection;
    }
}
