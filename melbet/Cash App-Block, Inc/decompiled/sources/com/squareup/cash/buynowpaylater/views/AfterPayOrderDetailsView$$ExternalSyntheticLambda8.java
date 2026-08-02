package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterPayOrderDetailsView$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterPayOrderDetailsView f$0;

    public /* synthetic */ AfterPayOrderDetailsView$$ExternalSyntheticLambda8(AfterPayOrderDetailsView afterPayOrderDetailsView, int i) {
        this.$r8$classId = i;
        this.f$0 = afterPayOrderDetailsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AfterPayOrderDetailsView afterPayOrderDetailsView = this.f$0;
        switch (i) {
            case 0:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left + afterPayOrderDetailsView.horizontalPadding);
            case 1:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - afterPayOrderDetailsView.horizontalPadding);
            case 2:
                ((Context) obj).getClass();
                return afterPayOrderDetailsView.scrollView;
            default:
                String str = (String) obj;
                str.getClass();
                afterPayOrderDetailsView.onEventCallback.invoke(new AfterPayOrderDetailsViewEvent.OpenUrl(str));
                return Unit.INSTANCE;
        }
    }
}
