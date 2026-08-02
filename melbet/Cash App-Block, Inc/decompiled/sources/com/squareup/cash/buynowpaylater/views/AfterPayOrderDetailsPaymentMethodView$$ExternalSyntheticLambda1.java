package com.squareup.cash.buynowpaylater.views;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterPayOrderDetailsPaymentMethodView f$0;

    public /* synthetic */ AfterPayOrderDetailsPaymentMethodView$$ExternalSyntheticLambda1(AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView, int i) {
        this.$r8$classId = i;
        this.f$0 = afterPayOrderDetailsPaymentMethodView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AfterPayOrderDetailsPaymentMethodView afterPayOrderDetailsPaymentMethodView = this.f$0;
        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
        switch (i) {
            case 0:
                layoutSpec.getClass();
                return new XInt(afterPayOrderDetailsPaymentMethodView.m3813getXdipTENr5nQ(12) + afterPayOrderDetailsPaymentMethodView.m3818rightTENr5nQ(afterPayOrderDetailsPaymentMethodView.cardIcon));
            case 1:
                layoutSpec.getClass();
                return new XInt(afterPayOrderDetailsPaymentMethodView.m3813getXdipTENr5nQ(40));
            case 2:
                layoutSpec.getClass();
                return new YInt(afterPayOrderDetailsPaymentMethodView.m3814getYdipdBGyhoQ(40));
            case 3:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - afterPayOrderDetailsPaymentMethodView.getDip(5));
            case 4:
                layoutSpec.getClass();
                return new XInt(afterPayOrderDetailsPaymentMethodView.m3813getXdipTENr5nQ(20));
            case 5:
                layoutSpec.getClass();
                return new YInt(afterPayOrderDetailsPaymentMethodView.m3814getYdipdBGyhoQ(20));
            case 6:
                layoutSpec.getClass();
                return new XInt(afterPayOrderDetailsPaymentMethodView.m3816leftTENr5nQ(afterPayOrderDetailsPaymentMethodView.infoIcon) - afterPayOrderDetailsPaymentMethodView.m3813getXdipTENr5nQ(5));
            case 7:
                layoutSpec.getClass();
                return new XInt(afterPayOrderDetailsPaymentMethodView.getDip(12) + afterPayOrderDetailsPaymentMethodView.m3818rightTENr5nQ(afterPayOrderDetailsPaymentMethodView.cardIcon));
            case 8:
                layoutSpec.getClass();
                return new XInt(afterPayOrderDetailsPaymentMethodView.m3816leftTENr5nQ(afterPayOrderDetailsPaymentMethodView.infoIcon) - afterPayOrderDetailsPaymentMethodView.m3813getXdipTENr5nQ(55));
            case 9:
                layoutSpec.getClass();
                return new XInt(afterPayOrderDetailsPaymentMethodView.m3813getXdipTENr5nQ(12) + afterPayOrderDetailsPaymentMethodView.m3818rightTENr5nQ(afterPayOrderDetailsPaymentMethodView.cardIcon));
            case 10:
                layoutSpec.getClass();
                return new XInt(afterPayOrderDetailsPaymentMethodView.m3816leftTENr5nQ(afterPayOrderDetailsPaymentMethodView.infoIcon) - afterPayOrderDetailsPaymentMethodView.m3813getXdipTENr5nQ(55));
            default:
                layoutSpec.getClass();
                return new YInt(afterPayOrderDetailsPaymentMethodView.m3810bottomdBGyhoQ(afterPayOrderDetailsPaymentMethodView.paymentName));
        }
    }
}
