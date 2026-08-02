package com.squareup.cash.card.onboarding;

import com.squareup.protos.franklin.common.Stamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampSheetV2Kt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Stamp f$0;

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda9(Stamp stamp, int i) {
        this.$r8$classId = i;
        this.f$0 = stamp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Stamp stamp = this.f$0;
        SvgView svgView = (SvgView) obj;
        switch (i) {
            case 0:
                svgView.getClass();
                svgView.setStamp(stamp);
                break;
            default:
                svgView.getClass();
                svgView.setStamp(stamp);
                break;
        }
        return Unit.INSTANCE;
    }
}
