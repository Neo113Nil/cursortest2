package com.squareup.cash.arcade.treehouse;

import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ChildrenList$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContourLayout f$0;

    public /* synthetic */ ChildrenList$$ExternalSyntheticLambda0(ContourLayout contourLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = contourLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ContourLayout contourLayout = this.f$0;
        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
        switch (i) {
            case 0:
                layoutSpec.getClass();
                return new XInt(contourLayout.m3813getXdipTENr5nQ(0));
            case 1:
                layoutSpec.getClass();
                return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w() - contourLayout.getResources().getDimensionPixelSize(R.dimen.blockers_padding));
            case 2:
                return new XInt(contourLayout.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
            case 3:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - contourLayout.m3813getXdipTENr5nQ(32));
            case 4:
                return new XInt(contourLayout.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
            case 5:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - contourLayout.m3813getXdipTENr5nQ(32));
            case 6:
                layoutSpec.getClass();
                return new YInt(contourLayout.m3814getYdipdBGyhoQ(0));
            case 7:
                return new YInt(contourLayout.getDip(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top);
            case 8:
                layoutSpec.getClass();
                return new XInt(contourLayout.m3813getXdipTENr5nQ(20));
            case 9:
                layoutSpec.getClass();
                return new XInt(contourLayout.m3813getXdipTENr5nQ(24));
            default:
                layoutSpec.getClass();
                return new YInt(contourLayout.m3814getYdipdBGyhoQ(24));
        }
    }
}
