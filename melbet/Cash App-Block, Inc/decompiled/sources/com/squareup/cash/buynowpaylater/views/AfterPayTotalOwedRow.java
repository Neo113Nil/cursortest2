package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.view.View;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubRowModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextWithIcon;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YFloat;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class AfterPayTotalOwedRow extends ContourLayout implements Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final View bottomHairlineView;
    public Ui.EventReceiver eventReceiver;
    public final View topHairlineView;
    public final FigmaTextView totalOwedLabelTextView;
    public final AfterPayTextWithInfoView totalOwedTextWithInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayTotalOwedRow(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        View view = new View(context);
        view.setBackgroundColor(colorPalette.disabledIcon);
        this.topHairlineView = view;
        View view2 = new View(context);
        view2.setBackgroundColor(colorPalette.disabledIcon);
        this.bottomHairlineView = view2;
        final int i = 2;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView, TextStyles.mainTitle);
        figmaTextView.setTextColor(colorPalette.label);
        final int i2 = 0;
        figmaTextView.setPadding(0, Views.dip((View) figmaTextView, 20), 0, Views.dip((View) figmaTextView, 20));
        this.totalOwedLabelTextView = figmaTextView;
        AfterPayTextWithInfoView afterPayTextWithInfoView = new AfterPayTextWithInfoView(context);
        afterPayTextWithInfoView.setVerticalGravity(16);
        afterPayTextWithInfoView.setHorizontalGravity(8388613);
        this.totalOwedTextWithInfo = afterPayTextWithInfoView;
        contourWidthMatchParent();
        contourHeightWrapContent();
        ByteArrayProtoReader32 matchParentX = ContourLayout.matchParentX(0, 0);
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new CalendarRowKt$$ExternalSyntheticLambda10(13));
        PlatformKt.heightOfFloat$default(byteArrayProtoReader32, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayTotalOwedRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                AfterPayTotalOwedRow afterPayTotalOwedRow = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i3) {
                    case 0:
                        int i4 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                    case 1:
                        int i5 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(Views.dip((View) afterPayTotalOwedRow, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 2:
                        int i6 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.topHairlineView));
                    case 3:
                        int i7 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(afterPayTotalOwedRow.m3818rightTENr5nQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 4:
                        int i8 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - Views.dip((View) afterPayTotalOwedRow, 24));
                    case 5:
                        int i9 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3812centerYdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 6:
                        int i10 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    default:
                        int i11 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                }
            }
        });
        ContourLayout.layoutBy$default(this, view, matchParentX, byteArrayProtoReader32);
        final int i3 = 1;
        ContourLayout.layoutBy$default(this, figmaTextView, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayTotalOwedRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                AfterPayTotalOwedRow afterPayTotalOwedRow = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        int i4 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                    case 1:
                        int i5 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(Views.dip((View) afterPayTotalOwedRow, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 2:
                        int i6 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.topHairlineView));
                    case 3:
                        int i7 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(afterPayTotalOwedRow.m3818rightTENr5nQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 4:
                        int i8 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - Views.dip((View) afterPayTotalOwedRow, 24));
                    case 5:
                        int i9 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3812centerYdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 6:
                        int i10 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    default:
                        int i11 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                }
            }
        }), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayTotalOwedRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i;
                AfterPayTotalOwedRow afterPayTotalOwedRow = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        int i4 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                    case 1:
                        int i5 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(Views.dip((View) afterPayTotalOwedRow, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 2:
                        int i6 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.topHairlineView));
                    case 3:
                        int i7 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(afterPayTotalOwedRow.m3818rightTENr5nQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 4:
                        int i8 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - Views.dip((View) afterPayTotalOwedRow, 24));
                    case 5:
                        int i9 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3812centerYdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 6:
                        int i10 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    default:
                        int i11 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                }
            }
        }));
        final int i4 = 3;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayTotalOwedRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i4;
                AfterPayTotalOwedRow afterPayTotalOwedRow = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        int i42 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                    case 1:
                        int i5 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(Views.dip((View) afterPayTotalOwedRow, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 2:
                        int i6 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.topHairlineView));
                    case 3:
                        int i7 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(afterPayTotalOwedRow.m3818rightTENr5nQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 4:
                        int i8 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - Views.dip((View) afterPayTotalOwedRow, 24));
                    case 5:
                        int i9 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3812centerYdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 6:
                        int i10 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    default:
                        int i11 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                }
            }
        });
        final int i5 = 4;
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayTotalOwedRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i5;
                AfterPayTotalOwedRow afterPayTotalOwedRow = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        int i42 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                    case 1:
                        int i52 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(Views.dip((View) afterPayTotalOwedRow, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 2:
                        int i6 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.topHairlineView));
                    case 3:
                        int i7 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(afterPayTotalOwedRow.m3818rightTENr5nQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 4:
                        int i8 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - Views.dip((View) afterPayTotalOwedRow, 24));
                    case 5:
                        int i9 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3812centerYdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 6:
                        int i10 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    default:
                        int i11 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                }
            }
        });
        final int i6 = 5;
        ContourLayout.layoutBy$default(this, afterPayTextWithInfoView, leftTo, ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayTotalOwedRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i6;
                AfterPayTotalOwedRow afterPayTotalOwedRow = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        int i42 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                    case 1:
                        int i52 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(Views.dip((View) afterPayTotalOwedRow, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 2:
                        int i62 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.topHairlineView));
                    case 3:
                        int i7 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(afterPayTotalOwedRow.m3818rightTENr5nQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 4:
                        int i8 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - Views.dip((View) afterPayTotalOwedRow, 24));
                    case 5:
                        int i9 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3812centerYdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 6:
                        int i10 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    default:
                        int i11 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                }
            }
        }));
        ByteArrayProtoReader32 matchParentX2 = ContourLayout.matchParentX(0, 0);
        final int i7 = 6;
        ByteArrayProtoReader32 byteArrayProtoReader322 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayTotalOwedRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i7;
                AfterPayTotalOwedRow afterPayTotalOwedRow = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        int i42 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                    case 1:
                        int i52 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(Views.dip((View) afterPayTotalOwedRow, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 2:
                        int i62 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.topHairlineView));
                    case 3:
                        int i72 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(afterPayTotalOwedRow.m3818rightTENr5nQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 4:
                        int i8 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - Views.dip((View) afterPayTotalOwedRow, 24));
                    case 5:
                        int i9 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3812centerYdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 6:
                        int i10 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    default:
                        int i11 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                }
            }
        });
        final int i8 = 7;
        PlatformKt.heightOfFloat$default(byteArrayProtoReader322, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayTotalOwedRow$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayTotalOwedRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i8;
                AfterPayTotalOwedRow afterPayTotalOwedRow = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        int i42 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                    case 1:
                        int i52 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(Views.dip((View) afterPayTotalOwedRow, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 2:
                        int i62 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.topHairlineView));
                    case 3:
                        int i72 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(afterPayTotalOwedRow.m3818rightTENr5nQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 4:
                        int i82 = AfterPayTotalOwedRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - Views.dip((View) afterPayTotalOwedRow, 24));
                    case 5:
                        int i9 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3812centerYdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    case 6:
                        int i10 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(afterPayTotalOwedRow.m3810bottomdBGyhoQ(afterPayTotalOwedRow.totalOwedLabelTextView));
                    default:
                        int i11 = AfterPayTotalOwedRow.$r8$clinit;
                        layoutSpec.getClass();
                        return new YFloat(afterPayTotalOwedRow.density * 0.5f);
                }
            }
        });
        ContourLayout.layoutBy$default(this, view2, matchParentX2, byteArrayProtoReader322);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AfterPayOrderHubRowModel.HeaderModel headerModel) {
        headerModel.getClass();
        TextModel textModel = headerModel.totalOwedTitle;
        TextWithIcon textWithIcon = headerModel.totalOwedDetail;
        if (textModel != null) {
            ImageUtilsKt.applyTextModel(this.totalOwedLabelTextView, textModel, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        }
        if (textWithIcon != null) {
            AfterPayTextWithInfoView afterPayTextWithInfoView = this.totalOwedTextWithInfo;
            afterPayTextWithInfoView.setModel(textWithIcon);
            afterPayTextWithInfoView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(19, this, headerModel));
        }
        setVisibility((textModel == null || textWithIcon == null) ? 8 : 0);
    }
}
