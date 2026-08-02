package com.squareup.cash.blockers.views;

import android.graphics.drawable.GradientDrawable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class SelectedInstrumentView$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelectedInstrumentView f$0;

    public /* synthetic */ SelectedInstrumentView$$ExternalSyntheticLambda1(SelectedInstrumentView selectedInstrumentView, int i) {
        this.$r8$classId = i;
        this.f$0 = selectedInstrumentView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SelectedInstrumentView selectedInstrumentView = this.f$0;
        switch (i) {
            case 0:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((selectedInstrumentView.m3815heightdBGyhoQ(selectedInstrumentView.subtitleView) + selectedInstrumentView.m3815heightdBGyhoQ(selectedInstrumentView.titleView)) / 2));
            case 1:
                return new XInt(selectedInstrumentView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 2:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(selectedInstrumentView.m3813getXdipTENr5nQ(24));
            case 3:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(selectedInstrumentView.m3814getYdipdBGyhoQ(24));
            case 4:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(selectedInstrumentView.getDip(16) + selectedInstrumentView.m3818rightTENr5nQ(selectedInstrumentView.avatarView));
            case 5:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(selectedInstrumentView.m3816leftTENr5nQ(selectedInstrumentView.chevronIcon) - selectedInstrumentView.m3813getXdipTENr5nQ(8));
            case 6:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((selectedInstrumentView.m3815heightdBGyhoQ(selectedInstrumentView.subtitleView) + selectedInstrumentView.m3815heightdBGyhoQ(selectedInstrumentView.titleView)) / 2));
            case 7:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(selectedInstrumentView.m3816leftTENr5nQ(selectedInstrumentView.titleView));
            case 8:
                ((ContourLayout.LayoutSpec) obj).getClass();
                FigmaTextView figmaTextView = selectedInstrumentView.titleView;
                return new XInt((selectedInstrumentView.m3818rightTENr5nQ(figmaTextView) - selectedInstrumentView.m3816leftTENr5nQ(figmaTextView)) - selectedInstrumentView.m3820widthTENr5nQ(selectedInstrumentView.subtitleSuffixView));
            case 9:
                int intValue = ((Integer) obj).intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(selectedInstrumentView.density * 24.0f);
                gradientDrawable.setColor(intValue);
                gradientDrawable.setStroke(selectedInstrumentView.getDip(2), selectedInstrumentView.colorPalette.secondaryButtonBackground);
                return gradientDrawable;
            case 10:
                return new YInt(Math.max(selectedInstrumentView.m3814getYdipdBGyhoQ(32) + selectedInstrumentView.m3815heightdBGyhoQ(selectedInstrumentView.subtitleView) + selectedInstrumentView.m3815heightdBGyhoQ(selectedInstrumentView.titleView), selectedInstrumentView.m3814getYdipdBGyhoQ(56) + selectedInstrumentView.m3815heightdBGyhoQ(selectedInstrumentView.avatarView)));
            case 11:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(selectedInstrumentView.m3810bottomdBGyhoQ(selectedInstrumentView.titleView));
            case 12:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(selectedInstrumentView.m3818rightTENr5nQ(selectedInstrumentView.subtitleView));
            case 13:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(selectedInstrumentView.m3810bottomdBGyhoQ(selectedInstrumentView.titleView));
            case 14:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - selectedInstrumentView.m3813getXdipTENr5nQ(24));
            default:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(selectedInstrumentView.m3813getXdipTENr5nQ(24));
        }
    }
}
