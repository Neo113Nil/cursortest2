package com.squareup.cash.appmessages.views;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.media3.extractor.mkv.Sniffer;
import app.cash.broadway.ui.Ui;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.appmessages.Action;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.Actions$Two;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.ui.widget.text.BalancedLineTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.ContourLayout$emptyX$1;
import com.squareup.contour.HasTop$DefaultImpls;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public final class InlineAppMessageView extends ContourLayout implements Ui, Widget {
    public final View actionsMiddleDivider;
    public final View actionsTopDivider;
    public Ui.EventReceiver eventReceiver;
    public final AppMessageImageView image;
    public final Sniffer layoutHelper;
    public final AppCompatTextView leftActionButton;
    public final BalancedLineTextView messageSubtitle;
    public final BalancedLineTextView messageTitle;
    public Modifier modifier;
    public final AppCompatTextView rightActionButton;
    public final RealAppMessageImageLoader staticImageLoader;
    public final ThemeInfo themeInfo;
    public final InlineAppMessageView value;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider staticImageLoader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InlineAppMessageView(Context context, RealAppMessageImageLoader realAppMessageImageLoader) {
        super(context, null);
        this.staticImageLoader = realAppMessageImageLoader;
        this.value = this;
        this.modifier = Modifier.Companion.$$INSTANCE;
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        Sniffer sniffer = new Sniffer(context, getDip(24), 25);
        this.layoutHelper = sniffer;
        AppMessageImageView appMessageImageView = new AppMessageImageView(context, sniffer);
        this.image = appMessageImageView;
        int i = 2;
        BalancedLineTextView balancedLineTextView = new BalancedLineTextView(context, null, i, 0 == true ? 1 : 0);
        GenieForEachViewKt.styledAsTitle(balancedLineTextView);
        this.messageTitle = balancedLineTextView;
        BalancedLineTextView balancedLineTextView2 = new BalancedLineTextView(context, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
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
        int i2 = colorPalette.background;
        GenieForEachViewKt.styledAsActionButton(appCompatTextView, i2);
        this.leftActionButton = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        GenieForEachViewKt.styledAsActionButton(appCompatTextView2, i2);
        this.rightActionButton = appCompatTextView2;
        int i3 = 6;
        contourHeightOf(new InlineAppMessageView$$ExternalSyntheticLambda3(this, i3));
        setBackgroundColor(i2);
        MatrixExt.layoutImage(this, appMessageImageView);
        MatrixExt.layoutTitle(this, balancedLineTextView);
        MatrixExt.layoutSubtitle(this, balancedLineTextView2);
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new CopyCodeKt$$ExternalSyntheticLambda5(4));
        leftTo.rightTo(1, new CopyCodeKt$$ExternalSyntheticLambda5(i));
        ContourLayout.layoutBy$default(this, view, leftTo, emptyY());
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new CopyCodeKt$$ExternalSyntheticLambda5(10));
        leftTo2.widthOf(1, new InlineAppMessageView$$ExternalSyntheticLambda3(this, 7));
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new InlineAppMessageView$$ExternalSyntheticLambda3(this, 8));
        HasTop$DefaultImpls.bottomTo$default(byteArrayProtoReader32, new CopyCodeKt$$ExternalSyntheticLambda5(5));
        ContourLayout.layoutBy$default(this, view2, leftTo2, byteArrayProtoReader32);
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new InlineAppMessageView$$ExternalSyntheticLambda3(this, 1));
        leftTo3.rightTo(1, new CopyCodeKt$$ExternalSyntheticLambda5(i3));
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo3, ContourLayout.topTo(new InlineAppMessageView$$ExternalSyntheticLambda3(this, i)));
        ByteArrayProtoReader32 leftTo4 = ContourLayout.leftTo(ContourLayout$emptyX$1.INSTANCE);
        leftTo4.widthOf(1, new ContourLayout$emptyX$1(this, i));
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo4, emptyY());
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(4);
        setLayoutTransition(layoutTransition);
    }

    public final void render(Action action, AppCompatTextView appCompatTextView) {
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
    public void setModel(InlineAppMessageViewModel inlineAppMessageViewModel) {
        inlineAppMessageViewModel.getClass();
        final InlineAppMessageViewModel.Ready ready = inlineAppMessageViewModel instanceof InlineAppMessageViewModel.Ready ? (InlineAppMessageViewModel.Ready) inlineAppMessageViewModel : null;
        if (ready == null) {
            return;
        }
        String str = ready.subtitle;
        String str2 = ready.title;
        BalancedLineTextView balancedLineTextView = this.messageTitle;
        balancedLineTextView.setText(str2);
        BalancedLineTextView balancedLineTextView2 = this.messageSubtitle;
        balancedLineTextView2.setText(str);
        int i = 8;
        final int i2 = 0;
        balancedLineTextView.setVisibility(str2 != null ? 0 : 8);
        balancedLineTextView2.setVisibility(str != null ? 0 : 8);
        final StringUtilsKt stringUtilsKt = ready.actions;
        boolean z = stringUtilsKt instanceof Actions$One;
        final int i3 = 4;
        final int i4 = 3;
        final int i5 = 1;
        View view = this.actionsMiddleDivider;
        AppCompatTextView appCompatTextView = this.rightActionButton;
        AppCompatTextView appCompatTextView2 = this.leftActionButton;
        if (z) {
            view.setVisibility(8);
            appCompatTextView.setVisibility(8);
            ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new CopyCodeKt$$ExternalSyntheticLambda5(7));
            leftTo.rightTo(1, new CopyCodeKt$$ExternalSyntheticLambda5(i));
            updateLayoutBy(appCompatTextView2, leftTo, ContourLayout.topTo(new InlineAppMessageView$$ExternalSyntheticLambda3(this, i4)));
            appCompatTextView.setOnClickListener(null);
            appCompatTextView.setClickable(false);
            appCompatTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.appmessages.views.InlineAppMessageView$$ExternalSyntheticLambda17
                public final /* synthetic */ InlineAppMessageView f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = i2;
                    StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                    InlineAppMessageView inlineAppMessageView = this.f$0;
                    switch (i6) {
                        case 0:
                            Ui.EventReceiver eventReceiver = inlineAppMessageView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(((Actions$One) stringUtilsKt2).action.eventToTrigger);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                        case 1:
                            Ui.EventReceiver eventReceiver2 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(((Actions$Two) stringUtilsKt2).primary.eventToTrigger);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                        default:
                            Ui.EventReceiver eventReceiver3 = inlineAppMessageView.eventReceiver;
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
            render(((Actions$One) stringUtilsKt).action, appCompatTextView2);
        } else {
            if (!(stringUtilsKt instanceof Actions$Two)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            view.setVisibility(0);
            appCompatTextView.setVisibility(0);
            ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new CopyCodeKt$$ExternalSyntheticLambda5(9));
            leftTo2.rightTo(1, new InlineAppMessageView$$ExternalSyntheticLambda3(this, i3));
            updateLayoutBy(appCompatTextView2, leftTo2, ContourLayout.topTo(new InlineAppMessageView$$ExternalSyntheticLambda3(this, 5)));
            appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.appmessages.views.InlineAppMessageView$$ExternalSyntheticLambda17
                public final /* synthetic */ InlineAppMessageView f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = i5;
                    StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                    InlineAppMessageView inlineAppMessageView = this.f$0;
                    switch (i6) {
                        case 0:
                            Ui.EventReceiver eventReceiver = inlineAppMessageView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(((Actions$One) stringUtilsKt2).action.eventToTrigger);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                        case 1:
                            Ui.EventReceiver eventReceiver2 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(((Actions$Two) stringUtilsKt2).primary.eventToTrigger);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                        default:
                            Ui.EventReceiver eventReceiver3 = inlineAppMessageView.eventReceiver;
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
            final int i6 = 2;
            appCompatTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.appmessages.views.InlineAppMessageView$$ExternalSyntheticLambda17
                public final /* synthetic */ InlineAppMessageView f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i62 = i6;
                    StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                    InlineAppMessageView inlineAppMessageView = this.f$0;
                    switch (i62) {
                        case 0:
                            Ui.EventReceiver eventReceiver = inlineAppMessageView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(((Actions$One) stringUtilsKt2).action.eventToTrigger);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                        case 1:
                            Ui.EventReceiver eventReceiver2 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(((Actions$Two) stringUtilsKt2).primary.eventToTrigger);
                                return;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                        default:
                            Ui.EventReceiver eventReceiver3 = inlineAppMessageView.eventReceiver;
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
            render(actions$Two.primary, appCompatTextView);
            render(actions$Two.secondary, appCompatTextView2);
        }
        ContourLayout.updateLayoutBy$default(this, balancedLineTextView, null, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.InlineAppMessageView$$ExternalSyntheticLambda0
            public final /* synthetic */ InlineAppMessageView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i2;
                AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
                int i8 = 0;
                InlineAppMessageViewModel.Ready ready2 = ready;
                InlineAppMessageView inlineAppMessageView = this.f$0;
                switch (i7) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(inlineAppMessageView.layoutHelper.titleTopMargin(ready2.image, ready2.title) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.image));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        int m3810bottomdBGyhoQ = inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageTitle);
                        Sniffer sniffer = inlineAppMessageView.layoutHelper;
                        AppMessageImage appMessageImage = ready2.image;
                        String str3 = ready2.title;
                        String str4 = ready2.subtitle;
                        if (str4 == null) {
                            sniffer.getClass();
                        } else {
                            i8 = str3 != null ? Views.dip((Context) sniffer.scratch, 16) : sniffer.titleTopMargin(appMessageImage, str4);
                        }
                        return new YInt(i8 + m3810bottomdBGyhoQ);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(inlineAppMessageView.layoutHelper.actionsTopMargin((ready2.title == null && ready2.subtitle == null) ? false : true, ready2.image) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageSubtitle));
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        Ui.EventReceiver eventReceiver = inlineAppMessageView.eventReceiver;
                        if (booleanValue) {
                            if (eventReceiver == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                        } else {
                            if (eventReceiver == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver.sendEvent(appMessageImageFailedToRender);
                        }
                        return Unit.INSTANCE;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            inlineAppMessageView.setVisibility(0);
                            Ui.EventReceiver eventReceiver2 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver2.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                        } else {
                            inlineAppMessageView.setVisibility(8);
                            Ui.EventReceiver eventReceiver3 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver3.sendEvent(appMessageImageFailedToRender);
                        }
                        return Unit.INSTANCE;
                }
            }
        }), 1);
        ContourLayout.updateLayoutBy$default(this, balancedLineTextView2, null, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.InlineAppMessageView$$ExternalSyntheticLambda0
            public final /* synthetic */ InlineAppMessageView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i5;
                AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
                int i8 = 0;
                InlineAppMessageViewModel.Ready ready2 = ready;
                InlineAppMessageView inlineAppMessageView = this.f$0;
                switch (i7) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(inlineAppMessageView.layoutHelper.titleTopMargin(ready2.image, ready2.title) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.image));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        int m3810bottomdBGyhoQ = inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageTitle);
                        Sniffer sniffer = inlineAppMessageView.layoutHelper;
                        AppMessageImage appMessageImage = ready2.image;
                        String str3 = ready2.title;
                        String str4 = ready2.subtitle;
                        if (str4 == null) {
                            sniffer.getClass();
                        } else {
                            i8 = str3 != null ? Views.dip((Context) sniffer.scratch, 16) : sniffer.titleTopMargin(appMessageImage, str4);
                        }
                        return new YInt(i8 + m3810bottomdBGyhoQ);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(inlineAppMessageView.layoutHelper.actionsTopMargin((ready2.title == null && ready2.subtitle == null) ? false : true, ready2.image) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageSubtitle));
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        Ui.EventReceiver eventReceiver = inlineAppMessageView.eventReceiver;
                        if (booleanValue) {
                            if (eventReceiver == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                        } else {
                            if (eventReceiver == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver.sendEvent(appMessageImageFailedToRender);
                        }
                        return Unit.INSTANCE;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            inlineAppMessageView.setVisibility(0);
                            Ui.EventReceiver eventReceiver2 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver2.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                        } else {
                            inlineAppMessageView.setVisibility(8);
                            Ui.EventReceiver eventReceiver3 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver3.sendEvent(appMessageImageFailedToRender);
                        }
                        return Unit.INSTANCE;
                }
            }
        }), 1);
        final int i7 = 2;
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.InlineAppMessageView$$ExternalSyntheticLambda0
            public final /* synthetic */ InlineAppMessageView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i7;
                AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
                int i8 = 0;
                InlineAppMessageViewModel.Ready ready2 = ready;
                InlineAppMessageView inlineAppMessageView = this.f$0;
                switch (i72) {
                    case 0:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(inlineAppMessageView.layoutHelper.titleTopMargin(ready2.image, ready2.title) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.image));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        int m3810bottomdBGyhoQ = inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageTitle);
                        Sniffer sniffer = inlineAppMessageView.layoutHelper;
                        AppMessageImage appMessageImage = ready2.image;
                        String str3 = ready2.title;
                        String str4 = ready2.subtitle;
                        if (str4 == null) {
                            sniffer.getClass();
                        } else {
                            i8 = str3 != null ? Views.dip((Context) sniffer.scratch, 16) : sniffer.titleTopMargin(appMessageImage, str4);
                        }
                        return new YInt(i8 + m3810bottomdBGyhoQ);
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(inlineAppMessageView.layoutHelper.actionsTopMargin((ready2.title == null && ready2.subtitle == null) ? false : true, ready2.image) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageSubtitle));
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        Ui.EventReceiver eventReceiver = inlineAppMessageView.eventReceiver;
                        if (booleanValue) {
                            if (eventReceiver == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                        } else {
                            if (eventReceiver == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver.sendEvent(appMessageImageFailedToRender);
                        }
                        return Unit.INSTANCE;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            inlineAppMessageView.setVisibility(0);
                            Ui.EventReceiver eventReceiver2 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver2.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                        } else {
                            inlineAppMessageView.setVisibility(8);
                            Ui.EventReceiver eventReceiver3 = inlineAppMessageView.eventReceiver;
                            if (eventReceiver3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            }
                            eventReceiver3.sendEvent(appMessageImageFailedToRender);
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        byteArrayProtoReader32.heightOf(1, new InlineAppMessageView$$ExternalSyntheticLambda3(this, i2));
        ContourLayout.updateLayoutBy$default(this, this.actionsTopDivider, null, byteArrayProtoReader32, 1);
        GenieForEachViewKt.styleSubtitleGivenTitle(balancedLineTextView2, str2);
        AppMessageImage appMessageImage = ready.image;
        boolean z2 = appMessageImage instanceof AppMessageImage.Static;
        AppMessageImageView appMessageImageView = this.image;
        if (z2) {
            appMessageImageView.setImageMetadata(appMessageImage);
            UseCaseAdditionSimulator.render(appMessageImageView, this.staticImageLoader, (AppMessageImage.Static) appMessageImage, new Function1(this) { // from class: com.squareup.cash.appmessages.views.InlineAppMessageView$$ExternalSyntheticLambda0
                public final /* synthetic */ InlineAppMessageView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i4;
                    AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
                    int i8 = 0;
                    InlineAppMessageViewModel.Ready ready2 = ready;
                    InlineAppMessageView inlineAppMessageView = this.f$0;
                    switch (i72) {
                        case 0:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(inlineAppMessageView.layoutHelper.titleTopMargin(ready2.image, ready2.title) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.image));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int m3810bottomdBGyhoQ = inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageTitle);
                            Sniffer sniffer = inlineAppMessageView.layoutHelper;
                            AppMessageImage appMessageImage2 = ready2.image;
                            String str3 = ready2.title;
                            String str4 = ready2.subtitle;
                            if (str4 == null) {
                                sniffer.getClass();
                            } else {
                                i8 = str3 != null ? Views.dip((Context) sniffer.scratch, 16) : sniffer.titleTopMargin(appMessageImage2, str4);
                            }
                            return new YInt(i8 + m3810bottomdBGyhoQ);
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(inlineAppMessageView.layoutHelper.actionsTopMargin((ready2.title == null && ready2.subtitle == null) ? false : true, ready2.image) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageSubtitle));
                        case 3:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            Ui.EventReceiver eventReceiver = inlineAppMessageView.eventReceiver;
                            if (booleanValue) {
                                if (eventReceiver == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                eventReceiver.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                            } else {
                                if (eventReceiver == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                eventReceiver.sendEvent(appMessageImageFailedToRender);
                            }
                            return Unit.INSTANCE;
                        default:
                            if (((Boolean) obj).booleanValue()) {
                                inlineAppMessageView.setVisibility(0);
                                Ui.EventReceiver eventReceiver2 = inlineAppMessageView.eventReceiver;
                                if (eventReceiver2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                eventReceiver2.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                            } else {
                                inlineAppMessageView.setVisibility(8);
                                Ui.EventReceiver eventReceiver3 = inlineAppMessageView.eventReceiver;
                                if (eventReceiver3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                eventReceiver3.sendEvent(appMessageImageFailedToRender);
                            }
                            return Unit.INSTANCE;
                    }
                }
            });
        } else if (appMessageImage instanceof AppMessageImage.Animated) {
            appMessageImageView.setImageMetadata(appMessageImage);
            UseCaseAdditionSimulator.render(appMessageImageView, (AppMessageImage.Animated) appMessageImage, new Function1(this) { // from class: com.squareup.cash.appmessages.views.InlineAppMessageView$$ExternalSyntheticLambda0
                public final /* synthetic */ InlineAppMessageView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i3;
                    AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
                    int i8 = 0;
                    InlineAppMessageViewModel.Ready ready2 = ready;
                    InlineAppMessageView inlineAppMessageView = this.f$0;
                    switch (i72) {
                        case 0:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(inlineAppMessageView.layoutHelper.titleTopMargin(ready2.image, ready2.title) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.image));
                        case 1:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            int m3810bottomdBGyhoQ = inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageTitle);
                            Sniffer sniffer = inlineAppMessageView.layoutHelper;
                            AppMessageImage appMessageImage2 = ready2.image;
                            String str3 = ready2.title;
                            String str4 = ready2.subtitle;
                            if (str4 == null) {
                                sniffer.getClass();
                            } else {
                                i8 = str3 != null ? Views.dip((Context) sniffer.scratch, 16) : sniffer.titleTopMargin(appMessageImage2, str4);
                            }
                            return new YInt(i8 + m3810bottomdBGyhoQ);
                        case 2:
                            ((ContourLayout.LayoutSpec) obj).getClass();
                            return new YInt(inlineAppMessageView.layoutHelper.actionsTopMargin((ready2.title == null && ready2.subtitle == null) ? false : true, ready2.image) + inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.messageSubtitle));
                        case 3:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            Ui.EventReceiver eventReceiver = inlineAppMessageView.eventReceiver;
                            if (booleanValue) {
                                if (eventReceiver == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                eventReceiver.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                            } else {
                                if (eventReceiver == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                eventReceiver.sendEvent(appMessageImageFailedToRender);
                            }
                            return Unit.INSTANCE;
                        default:
                            if (((Boolean) obj).booleanValue()) {
                                inlineAppMessageView.setVisibility(0);
                                Ui.EventReceiver eventReceiver2 = inlineAppMessageView.eventReceiver;
                                if (eventReceiver2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                eventReceiver2.sendEvent(new AppMessageViewEvent.AppMessageViewed(ready2.messageToken));
                            } else {
                                inlineAppMessageView.setVisibility(8);
                                Ui.EventReceiver eventReceiver3 = inlineAppMessageView.eventReceiver;
                                if (eventReceiver3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                    throw null;
                                }
                                eventReceiver3.sendEvent(appMessageImageFailedToRender);
                            }
                            return Unit.INSTANCE;
                    }
                }
            });
        } else {
            if (appMessageImage == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
