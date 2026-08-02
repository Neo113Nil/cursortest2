package com.squareup.cash.advertising.views;

import android.view.View;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class FullscreenAdView$$ExternalSyntheticLambda14 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FullscreenAdView f$0;

    public /* synthetic */ FullscreenAdView$$ExternalSyntheticLambda14(FullscreenAdView fullscreenAdView, int i) {
        this.$r8$classId = i;
        this.f$0 = fullscreenAdView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        FullscreenAdView fullscreenAdView = this.f$0;
        switch (i) {
            case 0:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left + fullscreenAdView.contentPadding);
            case 1:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - fullscreenAdView.contentPadding);
            case 2:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left + fullscreenAdView.contentPadding);
            case 3:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - fullscreenAdView.contentPadding);
            default:
                View view = (View) obj;
                view.getClass();
                return Boolean.valueOf(CollectionsKt.contains(fullscreenAdView.excludedToggleViews, view));
        }
    }
}
