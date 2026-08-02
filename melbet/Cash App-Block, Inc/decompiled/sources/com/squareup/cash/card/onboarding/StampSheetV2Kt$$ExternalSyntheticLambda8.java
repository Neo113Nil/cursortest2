package com.squareup.cash.card.onboarding;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampSheetV2Kt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda8(float f, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        float f = this.f$1;
        int i2 = this.f$0;
        Context context = (Context) obj;
        switch (i) {
            case 0:
                context.getClass();
                SvgView svgView = new SvgView(context, null);
                svgView.setColor(i2);
                svgView.setStrokeWidth(f);
                return svgView;
            default:
                context.getClass();
                SvgView svgView2 = new SvgView(context, null);
                svgView2.setColor(i2);
                svgView2.setStrokeWidth(f);
                return svgView2;
        }
    }
}
