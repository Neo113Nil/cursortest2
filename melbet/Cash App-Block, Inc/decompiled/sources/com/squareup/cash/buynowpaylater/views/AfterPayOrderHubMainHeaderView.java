package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.view.View;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubRowModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.InfoTileCardViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextWithIcon;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterPayOrderHubMainHeaderView extends ContourLayout implements Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final AfterPayTextWithInfoView balanceTextWithInfoView;
    public Ui.EventReceiver eventReceiver;
    public final AfterPayOrderHubInfoTileView infoTileView;
    public final View spacerView;
    public final FigmaTextView titleView;
    public final AfterPayTotalOwedRow totalOwedRow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AfterPayOrderHubMainHeaderView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        final int i = 2;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, i, 0 == true ? 1 : 0);
        figmaTextView.setGravity(17);
        Strings.applyStyle(figmaTextView, TextStyles.bigMoney);
        figmaTextView.setTextColor(colorPalette.label);
        this.titleView = figmaTextView;
        AfterPayTextWithInfoView afterPayTextWithInfoView = new AfterPayTextWithInfoView(context);
        this.balanceTextWithInfoView = afterPayTextWithInfoView;
        View view = new View(context);
        view.setBackgroundColor(colorPalette.background);
        this.spacerView = view;
        AfterPayTotalOwedRow afterPayTotalOwedRow = new AfterPayTotalOwedRow(context);
        afterPayTotalOwedRow.setVisibility(8);
        this.totalOwedRow = afterPayTotalOwedRow;
        final int i2 = 0;
        AfterPayOrderHubInfoTileView afterPayOrderHubInfoTileView = new AfterPayOrderHubInfoTileView(context, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayOrderHubMainHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = this.f$0;
                switch (i3) {
                    case 0:
                        String str = (String) obj;
                        int i4 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderHubMainHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderHubViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        int i5 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i6 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(afterPayOrderHubMainHeaderView.m3811centerXTENr5nQ(afterPayOrderHubMainHeaderView.titleView));
                    case 3:
                        int i7 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3814getYdipdBGyhoQ(4) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.titleView));
                    case 4:
                        int i8 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 48) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.balanceTextWithInfoView));
                    case 5:
                        int i9 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.spacerView));
                    default:
                        int i10 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.infoTileView));
                }
            }
        });
        afterPayOrderHubInfoTileView.setVisibility(8);
        this.infoTileView = afterPayOrderHubInfoTileView;
        contourWidthMatchParent();
        contourHeightWrapContent();
        setWillNotDraw(false);
        final int i3 = 1;
        ContourLayout.layoutBy$default(this, figmaTextView, ContourLayout.centerHorizontallyTo(new CalendarRowKt$$ExternalSyntheticLambda10(i3)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayOrderHubMainHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = this.f$0;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i4 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderHubMainHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderHubViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        int i5 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i6 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(afterPayOrderHubMainHeaderView.m3811centerXTENr5nQ(afterPayOrderHubMainHeaderView.titleView));
                    case 3:
                        int i7 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3814getYdipdBGyhoQ(4) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.titleView));
                    case 4:
                        int i8 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 48) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.balanceTextWithInfoView));
                    case 5:
                        int i9 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.spacerView));
                    default:
                        int i10 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.infoTileView));
                }
            }
        }));
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayOrderHubMainHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i;
                AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = this.f$0;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i4 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderHubMainHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderHubViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        int i5 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i6 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(afterPayOrderHubMainHeaderView.m3811centerXTENr5nQ(afterPayOrderHubMainHeaderView.titleView));
                    case 3:
                        int i7 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3814getYdipdBGyhoQ(4) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.titleView));
                    case 4:
                        int i8 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 48) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.balanceTextWithInfoView));
                    case 5:
                        int i9 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.spacerView));
                    default:
                        int i10 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.infoTileView));
                }
            }
        });
        final int i4 = 3;
        ContourLayout.layoutBy$default(this, afterPayTextWithInfoView, centerHorizontallyTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayOrderHubMainHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i4;
                AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = this.f$0;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i42 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderHubMainHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderHubViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        int i5 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i6 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(afterPayOrderHubMainHeaderView.m3811centerXTENr5nQ(afterPayOrderHubMainHeaderView.titleView));
                    case 3:
                        int i7 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3814getYdipdBGyhoQ(4) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.titleView));
                    case 4:
                        int i8 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 48) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.balanceTextWithInfoView));
                    case 5:
                        int i9 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.spacerView));
                    default:
                        int i10 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.infoTileView));
                }
            }
        }));
        final int i5 = 4;
        ContourLayout.layoutBy$default(this, view, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayOrderHubMainHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i5;
                AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = this.f$0;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i42 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderHubMainHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderHubViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        int i52 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i6 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(afterPayOrderHubMainHeaderView.m3811centerXTENr5nQ(afterPayOrderHubMainHeaderView.titleView));
                    case 3:
                        int i7 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3814getYdipdBGyhoQ(4) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.titleView));
                    case 4:
                        int i8 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 48) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.balanceTextWithInfoView));
                    case 5:
                        int i9 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.spacerView));
                    default:
                        int i10 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.infoTileView));
                }
            }
        }));
        final int i6 = 5;
        ContourLayout.layoutBy$default(this, afterPayOrderHubInfoTileView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayOrderHubMainHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i6;
                AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = this.f$0;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i42 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderHubMainHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderHubViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        int i52 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i62 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(afterPayOrderHubMainHeaderView.m3811centerXTENr5nQ(afterPayOrderHubMainHeaderView.titleView));
                    case 3:
                        int i7 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3814getYdipdBGyhoQ(4) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.titleView));
                    case 4:
                        int i8 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 48) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.balanceTextWithInfoView));
                    case 5:
                        int i9 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.spacerView));
                    default:
                        int i10 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.infoTileView));
                }
            }
        }));
        final int i7 = 6;
        ContourLayout.layoutBy$default(this, afterPayTotalOwedRow, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubMainHeaderView$$ExternalSyntheticLambda1
            public final /* synthetic */ AfterPayOrderHubMainHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i7;
                AfterPayOrderHubMainHeaderView afterPayOrderHubMainHeaderView = this.f$0;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i42 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        str.getClass();
                        Ui.EventReceiver eventReceiver = afterPayOrderHubMainHeaderView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AfterPayOrderHubViewEvent.OpenUrl(str));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        int i52 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i62 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(afterPayOrderHubMainHeaderView.m3811centerXTENr5nQ(afterPayOrderHubMainHeaderView.titleView));
                    case 3:
                        int i72 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3814getYdipdBGyhoQ(4) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.titleView));
                    case 4:
                        int i8 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) afterPayOrderHubMainHeaderView, 48) + afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.balanceTextWithInfoView));
                    case 5:
                        int i9 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.spacerView));
                    default:
                        int i10 = AfterPayOrderHubMainHeaderView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(afterPayOrderHubMainHeaderView.m3810bottomdBGyhoQ(afterPayOrderHubMainHeaderView.infoTileView));
                }
            }
        }));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
        this.totalOwedRow.setEventReceiver(eventReceiver);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AfterPayOrderHubRowModel.HeaderModel headerModel) {
        headerModel.getClass();
        this.totalOwedRow.setModel(headerModel);
        ImageUtilsKt.applyTextModel(this.titleView, headerModel.title, new CalendarRowKt$$ExternalSyntheticLambda10(14));
        TextWithIcon textWithIcon = headerModel.subtitle;
        if (textWithIcon != null) {
            AfterPayTextWithInfoView afterPayTextWithInfoView = this.balanceTextWithInfoView;
            afterPayTextWithInfoView.setModel(textWithIcon);
            afterPayTextWithInfoView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(15, this, headerModel));
        }
        InfoTileCardViewModel infoTileCardViewModel = headerModel.infoTileCard;
        AfterPayOrderHubInfoTileView afterPayOrderHubInfoTileView = this.infoTileView;
        if (infoTileCardViewModel == null) {
            afterPayOrderHubInfoTileView.setVisibility(8);
        } else {
            afterPayOrderHubInfoTileView.setModel(infoTileCardViewModel);
            afterPayOrderHubInfoTileView.setVisibility(0);
        }
    }
}
