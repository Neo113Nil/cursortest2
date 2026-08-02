package com.squareup.cash.formview.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.formview.components.arcade.ArcadeFormFixedElementSpacerKt;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormBlocker.Element.FixedSpacerElement f$0;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda4(FormBlocker.Element.FixedSpacerElement fixedSpacerElement) {
        this.$r8$classId = 0;
        this.f$0 = fixedSpacerElement;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        FormBlocker.Element.FixedSpacerElement fixedSpacerElement = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeFormFixedElementSpacerKt.ArcadeFormFixedElementSpacer(fixedSpacerElement, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                ArcadeFormFixedElementSpacerKt.ArcadeFormFixedElementSpacer(fixedSpacerElement, composer, Updater.updateChangedFlags(1));
                break;
            case 2:
                num.getClass();
                ArcadeFormFixedElementSpacerKt.ArcadeFormFixedElementSpacer(fixedSpacerElement, composer, Updater.updateChangedFlags(1));
                break;
            default:
                num.getClass();
                ArcadeFormFixedElementSpacerKt.ArcadeFormFixedElementSpacer(fixedSpacerElement, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda4(FormBlocker.Element.FixedSpacerElement fixedSpacerElement, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = fixedSpacerElement;
    }
}
