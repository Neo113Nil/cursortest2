package com.squareup.cash.appmessages.views;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.media3.extractor.mkv.Sniffer;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.appmessages.Action;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.Actions$Two;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.PopupAppMessageViewModel;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.ui.widget.text.BalancedLineTextView;
import com.squareup.cash.util.BackHandlerKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public final class PopupAppMessageView extends ContourLayout implements Ui {
    public final View actionsMiddleDivider;
    public final View actionsTopDivider;
    public int availableHeight;
    public AppMessageViewEvent.AppMessageActionTaken backPressEvent;
    public final AppCompatTextView bottomActionButton;
    public Ui.EventReceiver eventReceiver;
    public final AppMessageImageView image;
    public final Sniffer layoutHelper;
    public final BalancedLineTextView messageSubtitle;
    public final BalancedLineTextView messageTitle;
    public final int padding;
    public final ScrollView scrollView;
    public final ContourLayout scrollableContent;
    public final RealAppMessageImageLoader staticImageLoader;
    public final int statusBarHeight;
    public final ThemeInfo themeInfo;
    public final AppCompatTextView topActionButton;

    public PopupAppMessageView(Context context, RealAppMessageImageLoader realAppMessageImageLoader) {
        super(context);
        this.staticImageLoader = realAppMessageImageLoader;
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        Sniffer sniffer = new Sniffer(context, getDip(48), 25);
        this.layoutHelper = sniffer;
        AppMessageImageView appMessageImageView = new AppMessageImageView(context, sniffer);
        this.image = appMessageImageView;
        BalancedLineTextView balancedLineTextView = new BalancedLineTextView(context, null, 2, null);
        GenieForEachViewKt.styledAsTitle(balancedLineTextView);
        this.messageTitle = balancedLineTextView;
        BalancedLineTextView balancedLineTextView2 = new BalancedLineTextView(context, null, 2, null);
        balancedLineTextView2.setGravity(1);
        balancedLineTextView2.setPadding(Views.dip((View) balancedLineTextView2, 16), balancedLineTextView2.getPaddingTop(), Views.dip((View) balancedLineTextView2, 16), balancedLineTextView2.getPaddingBottom());
        this.messageSubtitle = balancedLineTextView2;
        View view = new View(context);
        ColorPalette colorPalette = themeInfo.colorPalette;
        view.setBackgroundColor(colorPalette.hairline);
        this.actionsTopDivider = view;
        View view2 = new View(context);
        view2.setBackgroundColor(colorPalette.hairline);
        this.actionsMiddleDivider = view2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        int i = colorPalette.elevatedBackground;
        GenieForEachViewKt.styledAsActionButton(appCompatTextView, i);
        this.topActionButton = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        GenieForEachViewKt.styledAsActionButton(appCompatTextView2, i);
        this.bottomActionButton = appCompatTextView2;
        this.statusBarHeight = getDip(24);
        this.padding = getDip(24);
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        ContourLayout contourLayout = new ContourLayout(context);
        contourLayout.contourHeightWrapContent();
        MatrixExt.layoutImage(contourLayout, appMessageImageView);
        MatrixExt.layoutTitle(contourLayout, balancedLineTextView);
        MatrixExt.layoutSubtitle(contourLayout, balancedLineTextView2);
        this.scrollableContent = contourLayout;
        contourHeightOf(new PopupAppMessageView$$ExternalSyntheticLambda0(this, 0));
        setBackgroundColor(i);
        ByteArrayProtoReader32 matchParentX = ContourLayout.matchParentX(0, 0);
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new CopyCodeKt$$ExternalSyntheticLambda5(20));
        byteArrayProtoReader32.heightOf(2, new PopupAppMessageView$$ExternalSyntheticLambda0(this, 1));
        ContourLayout.layoutBy$default(this, scrollView, matchParentX, byteArrayProtoReader32);
        scrollView.addView(contourLayout);
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new CopyCodeKt$$ExternalSyntheticLambda5(11));
        leftTo.rightTo(1, new CopyCodeKt$$ExternalSyntheticLambda5(12));
        ByteArrayProtoReader32 byteArrayProtoReader322 = ContourLayout.topTo(new PopupAppMessageView$$ExternalSyntheticLambda0(this, 2));
        byteArrayProtoReader322.heightOf(1, new PopupAppMessageView$$ExternalSyntheticLambda0(this, 3));
        ContourLayout.layoutBy$default(this, view, leftTo, byteArrayProtoReader322);
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new CopyCodeKt$$ExternalSyntheticLambda5(13));
        leftTo2.rightTo(1, new CopyCodeKt$$ExternalSyntheticLambda5(14));
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo2, ContourLayout.topTo(new PopupAppMessageView$$ExternalSyntheticLambda0(this, 4)));
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new CopyCodeKt$$ExternalSyntheticLambda5(15));
        leftTo3.rightTo(1, new CopyCodeKt$$ExternalSyntheticLambda5(17));
        ByteArrayProtoReader32 byteArrayProtoReader323 = ContourLayout.topTo(new PopupAppMessageView$$ExternalSyntheticLambda0(this, 6));
        byteArrayProtoReader323.heightOf(1, new PopupAppMessageView$$ExternalSyntheticLambda0(this, 7));
        ContourLayout.layoutBy$default(this, view2, leftTo3, byteArrayProtoReader323);
        ByteArrayProtoReader32 leftTo4 = ContourLayout.leftTo(new CopyCodeKt$$ExternalSyntheticLambda5(18));
        leftTo4.rightTo(1, new CopyCodeKt$$ExternalSyntheticLambda5(19));
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo4, ContourLayout.topTo(new PopupAppMessageView$$ExternalSyntheticLambda0(this, 8)));
        BackHandlerKt.setBackHandler(this, new ErrorView$$ExternalSyntheticLambda0(this, 5));
    }

    @Override // com.squareup.contour.ContourLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.availableHeight = View.MeasureSpec.getSize(i2);
    }

    public final void render$1(Action action, AppCompatTextView appCompatTextView) {
        Integer forTheme;
        appCompatTextView.setText(action.text);
        Color color = action.color;
        ThemeInfo themeInfo = this.themeInfo;
        appCompatTextView.setTextColor((color == null || (forTheme = ThemablesKt.forTheme(color, themeInfo)) == null) ? themeInfo.colorPalette.label : forTheme.intValue());
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(final PopupAppMessageViewModel popupAppMessageViewModel) {
        popupAppMessageViewModel.getClass();
        if ((popupAppMessageViewModel instanceof PopupAppMessageViewModel.Loaded ? (PopupAppMessageViewModel.Loaded) popupAppMessageViewModel : null) != null) {
            PopupAppMessageViewModel.Loaded loaded = (PopupAppMessageViewModel.Loaded) popupAppMessageViewModel;
            AppMessageImage appMessageImage = loaded.image;
            String str = loaded.subtitle;
            String str2 = loaded.title;
            BalancedLineTextView balancedLineTextView = this.messageTitle;
            balancedLineTextView.setText(str2);
            BalancedLineTextView balancedLineTextView2 = this.messageSubtitle;
            balancedLineTextView2.setText(str);
            final int i = 0;
            balancedLineTextView.setVisibility(str2 != null ? 0 : 8);
            balancedLineTextView2.setVisibility(str != null ? 0 : 8);
            final ContourLayout contourLayout = this.scrollableContent;
            Function1 function1 = new Function1() { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int dip;
                    int i2 = i;
                    PopupAppMessageViewModel popupAppMessageViewModel2 = popupAppMessageViewModel;
                    PopupAppMessageView popupAppMessageView = this;
                    ContourLayout contourLayout2 = contourLayout;
                    ((ContourLayout.LayoutSpec) obj).getClass();
                    switch (i2) {
                        case 0:
                            PopupAppMessageViewModel.Loaded loaded2 = (PopupAppMessageViewModel.Loaded) popupAppMessageViewModel2;
                            return new YInt(popupAppMessageView.layoutHelper.titleTopMargin(loaded2.image, loaded2.title) + contourLayout2.m3810bottomdBGyhoQ(popupAppMessageView.image));
                        default:
                            int m3810bottomdBGyhoQ = contourLayout2.m3810bottomdBGyhoQ(popupAppMessageView.messageTitle);
                            Sniffer sniffer = popupAppMessageView.layoutHelper;
                            PopupAppMessageViewModel.Loaded loaded3 = (PopupAppMessageViewModel.Loaded) popupAppMessageViewModel2;
                            AppMessageImage appMessageImage2 = loaded3.image;
                            String str3 = loaded3.title;
                            String str4 = loaded3.subtitle;
                            if (str4 == null) {
                                sniffer.getClass();
                                dip = 0;
                            } else {
                                dip = str3 != null ? Views.dip((Context) sniffer.scratch, 16) : sniffer.titleTopMargin(appMessageImage2, str4);
                            }
                            return new YInt(dip + m3810bottomdBGyhoQ);
                    }
                }
            };
            contourLayout.getClass();
            final int i2 = 1;
            ContourLayout.updateLayoutBy$default(contourLayout, balancedLineTextView, null, ContourLayout.topTo(function1), 1);
            ContourLayout.updateLayoutBy$default(contourLayout, balancedLineTextView2, null, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int dip;
                    int i22 = i2;
                    PopupAppMessageViewModel popupAppMessageViewModel2 = popupAppMessageViewModel;
                    PopupAppMessageView popupAppMessageView = this;
                    ContourLayout contourLayout2 = contourLayout;
                    ((ContourLayout.LayoutSpec) obj).getClass();
                    switch (i22) {
                        case 0:
                            PopupAppMessageViewModel.Loaded loaded2 = (PopupAppMessageViewModel.Loaded) popupAppMessageViewModel2;
                            return new YInt(popupAppMessageView.layoutHelper.titleTopMargin(loaded2.image, loaded2.title) + contourLayout2.m3810bottomdBGyhoQ(popupAppMessageView.image));
                        default:
                            int m3810bottomdBGyhoQ = contourLayout2.m3810bottomdBGyhoQ(popupAppMessageView.messageTitle);
                            Sniffer sniffer = popupAppMessageView.layoutHelper;
                            PopupAppMessageViewModel.Loaded loaded3 = (PopupAppMessageViewModel.Loaded) popupAppMessageViewModel2;
                            AppMessageImage appMessageImage2 = loaded3.image;
                            String str3 = loaded3.title;
                            String str4 = loaded3.subtitle;
                            if (str4 == null) {
                                sniffer.getClass();
                                dip = 0;
                            } else {
                                dip = str3 != null ? Views.dip((Context) sniffer.scratch, 16) : sniffer.titleTopMargin(appMessageImage2, str4);
                            }
                            return new YInt(dip + m3810bottomdBGyhoQ);
                    }
                }
            }), 1);
            final int actionsTopMargin = this.layoutHelper.actionsTopMargin((str2 == null && str == null) ? false : true, appMessageImage);
            ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda20
                public final /* synthetic */ PopupAppMessageView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i;
                    int i4 = actionsTopMargin;
                    PopupAppMessageView popupAppMessageView = this.f$0;
                    ((ContourLayout.LayoutSpec) obj).getClass();
                    switch (i3) {
                        case 0:
                            return new YInt(popupAppMessageView.m3810bottomdBGyhoQ(popupAppMessageView.scrollView) + i4);
                        default:
                            return new YInt(popupAppMessageView.availableHeight - ((popupAppMessageView.m3814getYdipdBGyhoQ(2) + ((popupAppMessageView.padding * 2) + ((popupAppMessageView.topActionButton.getHeight() + (popupAppMessageView.bottomActionButton.getHeight() + popupAppMessageView.m3819topdBGyhoQ(popupAppMessageView.scrollView))) + popupAppMessageView.statusBarHeight))) + i4));
                    }
                }
            });
            byteArrayProtoReader32.heightOf(1, new PopupAppMessageView$$ExternalSyntheticLambda0(this, 5));
            ContourLayout.updateLayoutBy$default(this, this.actionsTopDivider, null, byteArrayProtoReader32, 1);
            ByteArrayProtoReader32 matchParentX = ContourLayout.matchParentX(0, 0);
            ByteArrayProtoReader32 byteArrayProtoReader322 = ContourLayout.topTo(new CopyCodeKt$$ExternalSyntheticLambda5(16));
            Function1 function12 = new Function1(this) { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda20
                public final /* synthetic */ PopupAppMessageView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    int i4 = actionsTopMargin;
                    PopupAppMessageView popupAppMessageView = this.f$0;
                    ((ContourLayout.LayoutSpec) obj).getClass();
                    switch (i3) {
                        case 0:
                            return new YInt(popupAppMessageView.m3810bottomdBGyhoQ(popupAppMessageView.scrollView) + i4);
                        default:
                            return new YInt(popupAppMessageView.availableHeight - ((popupAppMessageView.m3814getYdipdBGyhoQ(2) + ((popupAppMessageView.padding * 2) + ((popupAppMessageView.topActionButton.getHeight() + (popupAppMessageView.bottomActionButton.getHeight() + popupAppMessageView.m3819topdBGyhoQ(popupAppMessageView.scrollView))) + popupAppMessageView.statusBarHeight))) + i4));
                    }
                }
            };
            final int i3 = 2;
            byteArrayProtoReader322.heightOf(2, function12);
            updateLayoutBy(this.scrollView, matchParentX, byteArrayProtoReader322);
            GenieForEachViewKt.styleSubtitleGivenTitle(balancedLineTextView2, str2);
            boolean z = appMessageImage instanceof AppMessageImage.Static;
            AppMessageImageView appMessageImageView = this.image;
            if (z) {
                appMessageImageView.setImageMetadata(appMessageImage);
                UseCaseAdditionSimulator.render(appMessageImageView, this.staticImageLoader, (AppMessageImage.Static) appMessageImage, new Function1(this) { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda24
                    public final /* synthetic */ PopupAppMessageView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i4 = i;
                        AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
                        PopupAppMessageViewModel popupAppMessageViewModel2 = popupAppMessageViewModel;
                        PopupAppMessageView popupAppMessageView = this.f$0;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        switch (i4) {
                            case 0:
                                Ui.EventReceiver eventReceiver = popupAppMessageView.eventReceiver;
                                if (booleanValue) {
                                    if (eventReceiver == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                        throw null;
                                    }
                                    eventReceiver.sendEvent(new AppMessageViewEvent.AppMessageViewed(((PopupAppMessageViewModel.Loaded) popupAppMessageViewModel2).messageToken));
                                } else {
                                    if (eventReceiver == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                        throw null;
                                    }
                                    eventReceiver.sendEvent(appMessageImageFailedToRender);
                                }
                                return Unit.INSTANCE;
                            default:
                                Ui.EventReceiver eventReceiver2 = popupAppMessageView.eventReceiver;
                                if (booleanValue) {
                                    if (eventReceiver2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                        throw null;
                                    }
                                    eventReceiver2.sendEvent(new AppMessageViewEvent.AppMessageViewed(((PopupAppMessageViewModel.Loaded) popupAppMessageViewModel2).messageToken));
                                } else {
                                    if (eventReceiver2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                        throw null;
                                    }
                                    eventReceiver2.sendEvent(appMessageImageFailedToRender);
                                }
                                return Unit.INSTANCE;
                        }
                    }
                });
            } else if (appMessageImage instanceof AppMessageImage.Animated) {
                appMessageImageView.setImageMetadata(appMessageImage);
                UseCaseAdditionSimulator.render(appMessageImageView, (AppMessageImage.Animated) appMessageImage, new Function1(this) { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda24
                    public final /* synthetic */ PopupAppMessageView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
                        PopupAppMessageViewModel popupAppMessageViewModel2 = popupAppMessageViewModel;
                        PopupAppMessageView popupAppMessageView = this.f$0;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        switch (i4) {
                            case 0:
                                Ui.EventReceiver eventReceiver = popupAppMessageView.eventReceiver;
                                if (booleanValue) {
                                    if (eventReceiver == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                        throw null;
                                    }
                                    eventReceiver.sendEvent(new AppMessageViewEvent.AppMessageViewed(((PopupAppMessageViewModel.Loaded) popupAppMessageViewModel2).messageToken));
                                } else {
                                    if (eventReceiver == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                        throw null;
                                    }
                                    eventReceiver.sendEvent(appMessageImageFailedToRender);
                                }
                                return Unit.INSTANCE;
                            default:
                                Ui.EventReceiver eventReceiver2 = popupAppMessageView.eventReceiver;
                                if (booleanValue) {
                                    if (eventReceiver2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                        throw null;
                                    }
                                    eventReceiver2.sendEvent(new AppMessageViewEvent.AppMessageViewed(((PopupAppMessageViewModel.Loaded) popupAppMessageViewModel2).messageToken));
                                } else {
                                    if (eventReceiver2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                        throw null;
                                    }
                                    eventReceiver2.sendEvent(appMessageImageFailedToRender);
                                }
                                return Unit.INSTANCE;
                        }
                    }
                });
            } else if (appMessageImage != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            final StringUtilsKt stringUtilsKt = loaded.actions;
            boolean z2 = stringUtilsKt instanceof Actions$One;
            View view = this.actionsMiddleDivider;
            AppCompatTextView appCompatTextView = this.topActionButton;
            AppCompatTextView appCompatTextView2 = this.bottomActionButton;
            if (z2) {
                view.setVisibility(8);
                appCompatTextView2.setVisibility(8);
                appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda26
                    public final /* synthetic */ PopupAppMessageView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i4 = i;
                        StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                        PopupAppMessageView popupAppMessageView = this.f$0;
                        switch (i4) {
                            case 0:
                                Ui.EventReceiver eventReceiver = popupAppMessageView.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(((Actions$One) stringUtilsKt2).action.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                            case 1:
                                Ui.EventReceiver eventReceiver2 = popupAppMessageView.eventReceiver;
                                if (eventReceiver2 != null) {
                                    eventReceiver2.sendEvent(((Actions$Two) stringUtilsKt2).primary.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                            default:
                                Ui.EventReceiver eventReceiver3 = popupAppMessageView.eventReceiver;
                                if (eventReceiver3 != null) {
                                    eventReceiver3.sendEvent(((Actions$Two) stringUtilsKt2).secondary.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                        }
                    }
                });
                appCompatTextView2.setOnClickListener(null);
                appCompatTextView2.setClickable(false);
                render$1(((Actions$One) stringUtilsKt).action, appCompatTextView);
            } else {
                if (!(stringUtilsKt instanceof Actions$Two)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                view.setVisibility(0);
                appCompatTextView2.setVisibility(0);
                appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda26
                    public final /* synthetic */ PopupAppMessageView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i4 = i2;
                        StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                        PopupAppMessageView popupAppMessageView = this.f$0;
                        switch (i4) {
                            case 0:
                                Ui.EventReceiver eventReceiver = popupAppMessageView.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(((Actions$One) stringUtilsKt2).action.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                            case 1:
                                Ui.EventReceiver eventReceiver2 = popupAppMessageView.eventReceiver;
                                if (eventReceiver2 != null) {
                                    eventReceiver2.sendEvent(((Actions$Two) stringUtilsKt2).primary.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                            default:
                                Ui.EventReceiver eventReceiver3 = popupAppMessageView.eventReceiver;
                                if (eventReceiver3 != null) {
                                    eventReceiver3.sendEvent(((Actions$Two) stringUtilsKt2).secondary.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                        }
                    }
                });
                appCompatTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.appmessages.views.PopupAppMessageView$$ExternalSyntheticLambda26
                    public final /* synthetic */ PopupAppMessageView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i4 = i3;
                        StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                        PopupAppMessageView popupAppMessageView = this.f$0;
                        switch (i4) {
                            case 0:
                                Ui.EventReceiver eventReceiver = popupAppMessageView.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(((Actions$One) stringUtilsKt2).action.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                            case 1:
                                Ui.EventReceiver eventReceiver2 = popupAppMessageView.eventReceiver;
                                if (eventReceiver2 != null) {
                                    eventReceiver2.sendEvent(((Actions$Two) stringUtilsKt2).primary.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                            default:
                                Ui.EventReceiver eventReceiver3 = popupAppMessageView.eventReceiver;
                                if (eventReceiver3 != null) {
                                    eventReceiver3.sendEvent(((Actions$Two) stringUtilsKt2).secondary.eventToTrigger);
                                    return;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                        }
                    }
                });
                Actions$Two actions$Two = (Actions$Two) stringUtilsKt;
                render$1(actions$Two.primary, appCompatTextView);
                render$1(actions$Two.secondary, appCompatTextView2);
            }
            this.backPressEvent = loaded.backEvent;
        }
    }
}
