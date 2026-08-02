package com.squareup.cash.overlays;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FakeOverlayLayer$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ FakeOverlayLayer f$0;

    public /* synthetic */ FakeOverlayLayer$$ExternalSyntheticLambda0(FakeOverlayLayer fakeOverlayLayer) {
        this.f$0 = fakeOverlayLayer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        FakeOverlayLayer fakeOverlayLayer = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                fakeOverlayLayer.Content(composer, Updater.updateChangedFlags(7));
                break;
            default:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    fakeOverlayLayer.Content(gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FakeOverlayLayer$$ExternalSyntheticLambda0(FakeOverlayLayer fakeOverlayLayer, int i) {
        this.f$0 = fakeOverlayLayer;
    }
}
