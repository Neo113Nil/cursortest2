package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewEvents;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.StackableRow;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.cashapproxy.api.ScheduledPaymentStatus;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* loaded from: classes5.dex */
public final class AfterPayStackableInfoSheetView extends LinearLayout implements OnBackListener, OutsideTapCloses, Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final FigmaTextView closeButton;
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScheduledPaymentStatus.values().length];
            try {
                Error.Code.Companion companion = ScheduledPaymentStatus.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Error.Code.Companion companion2 = ScheduledPaymentStatus.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Error.Code.Companion companion3 = ScheduledPaymentStatus.Companion;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Error.Code.Companion companion4 = ScheduledPaymentStatus.Companion;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Error.Code.Companion companion5 = ScheduledPaymentStatus.Companion;
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Error.Code.Companion companion6 = ScheduledPaymentStatus.Companion;
                iArr[2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Error.Code.Companion companion7 = ScheduledPaymentStatus.Companion;
                iArr[9] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Error.Code.Companion companion8 = ScheduledPaymentStatus.Companion;
                iArr[3] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Error.Code.Companion companion9 = ScheduledPaymentStatus.Companion;
                iArr[4] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Error.Code.Companion companion10 = ScheduledPaymentStatus.Companion;
                iArr[8] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayStackableInfoSheetView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setGravity(17);
        figmaTextView.setText(R.string.close);
        Strings.applyStyle(figmaTextView, TextStyles.mainTitle);
        figmaTextView.setTextColor(colorPalette.label);
        figmaTextView.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 1));
        figmaTextView.setPadding(Views.dip((View) figmaTextView, 16), Views.dip((View) figmaTextView, 16), Views.dip((View) figmaTextView, 16), Views.dip((View) figmaTextView, 16));
        this.closeButton = figmaTextView;
        setOrientation(1);
        setPadding(getPaddingLeft(), Views.dip((View) this, 32), getPaddingRight(), getPaddingBottom());
        int dip = Views.dip((View) this, 24);
        setPadding(dip, dip, dip, dip);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        performAccessibilityAction(64, null);
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(InfoSheetViewEvents.CloseSheet.INSTANCE);
            return true;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
        throw null;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // app.cash.broadway.ui.Ui
    public void setModel(InfoSheetViewModel infoSheetViewModel) {
        infoSheetViewModel.getClass();
        removeAllViews();
        for (StackableRow stackableRow : infoSheetViewModel.stackableContent) {
            boolean z = stackableRow instanceof StackableRow.PaymentStatusIcon;
            final int i = 1;
            Drawable drawable = null;
            final int i2 = 0;
            ColorPalette colorPalette = this.colorPalette;
            if (z) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                ScheduledPaymentStatus scheduledPaymentStatus = ((StackableRow.PaymentStatusIcon) stackableRow).paymentStatus;
                switch (scheduledPaymentStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scheduledPaymentStatus.ordinal()]) {
                    case -1:
                    case 1:
                        appCompatImageView.setImageDrawable(drawable);
                        appCompatImageView.setPadding(0, 0, 0, Views.dip((View) appCompatImageView, 6));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Views.dip((View) appCompatImageView, 32), Views.dip((View) appCompatImageView, 32));
                        layoutParams.gravity = 1;
                        addView(appCompatImageView, layoutParams);
                        break;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        Context context = getContext();
                        context.getClass();
                        drawable = PlatformKt.getDrawableCompat(context, R.drawable.ic_clock, Integer.valueOf(colorPalette.label));
                        appCompatImageView.setImageDrawable(drawable);
                        appCompatImageView.setPadding(0, 0, 0, Views.dip((View) appCompatImageView, 6));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(Views.dip((View) appCompatImageView, 32), Views.dip((View) appCompatImageView, 32));
                        layoutParams2.gravity = 1;
                        addView(appCompatImageView, layoutParams2);
                        break;
                    case 6:
                        Context context2 = getContext();
                        context2.getClass();
                        drawable = PlatformKt.getDrawableCompat(context2, R.drawable.mooncake_checked, Integer.valueOf(colorPalette.green));
                        appCompatImageView.setImageDrawable(drawable);
                        appCompatImageView.setPadding(0, 0, 0, Views.dip((View) appCompatImageView, 6));
                        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(Views.dip((View) appCompatImageView, 32), Views.dip((View) appCompatImageView, 32));
                        layoutParams22.gravity = 1;
                        addView(appCompatImageView, layoutParams22);
                        break;
                    case 7:
                        Context context3 = getContext();
                        context3.getClass();
                        drawable = PlatformKt.getDrawableCompat(context3, R.drawable.ic_red_circle_exclamation, null);
                        appCompatImageView.setImageDrawable(drawable);
                        appCompatImageView.setPadding(0, 0, 0, Views.dip((View) appCompatImageView, 6));
                        LinearLayout.LayoutParams layoutParams222 = new LinearLayout.LayoutParams(Views.dip((View) appCompatImageView, 32), Views.dip((View) appCompatImageView, 32));
                        layoutParams222.gravity = 1;
                        addView(appCompatImageView, layoutParams222);
                        break;
                    case 8:
                        Context context4 = getContext();
                        context4.getClass();
                        drawable = PlatformKt.getDrawableCompat(context4, R.drawable.ic_red_shield_exclamation, null);
                        appCompatImageView.setImageDrawable(drawable);
                        appCompatImageView.setPadding(0, 0, 0, Views.dip((View) appCompatImageView, 6));
                        LinearLayout.LayoutParams layoutParams2222 = new LinearLayout.LayoutParams(Views.dip((View) appCompatImageView, 32), Views.dip((View) appCompatImageView, 32));
                        layoutParams2222.gravity = 1;
                        addView(appCompatImageView, layoutParams2222);
                        break;
                    case 9:
                        Context context5 = getContext();
                        context5.getClass();
                        drawable = PlatformKt.getDrawableCompat(context5, R.drawable.ic_back_arrow, null);
                        appCompatImageView.setImageDrawable(drawable);
                        appCompatImageView.setPadding(0, 0, 0, Views.dip((View) appCompatImageView, 6));
                        LinearLayout.LayoutParams layoutParams22222 = new LinearLayout.LayoutParams(Views.dip((View) appCompatImageView, 32), Views.dip((View) appCompatImageView, 32));
                        layoutParams22222.gravity = 1;
                        addView(appCompatImageView, layoutParams22222);
                        break;
                    case 10:
                        Context context6 = getContext();
                        context6.getClass();
                        drawable = PlatformKt.getDrawableCompat(context6, R.drawable.ic_minus, null);
                        appCompatImageView.setImageDrawable(drawable);
                        appCompatImageView.setPadding(0, 0, 0, Views.dip((View) appCompatImageView, 6));
                        LinearLayout.LayoutParams layoutParams222222 = new LinearLayout.LayoutParams(Views.dip((View) appCompatImageView, 32), Views.dip((View) appCompatImageView, 32));
                        layoutParams222222.gravity = 1;
                        addView(appCompatImageView, layoutParams222222);
                        break;
                }
                return;
            }
            if (stackableRow instanceof StackableRow.Text) {
                TextModel textModel = ((StackableRow.Text) stackableRow).text;
                Context context7 = getContext();
                context7.getClass();
                Function1 function1 = new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayStackableInfoSheetView$$ExternalSyntheticLambda1
                    public final /* synthetic */ AfterPayStackableInfoSheetView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        AfterPayStackableInfoSheetView afterPayStackableInfoSheetView = this.f$0;
                        String str = (String) obj;
                        switch (i3) {
                            case 0:
                                int i4 = AfterPayStackableInfoSheetView.$r8$clinit;
                                str.getClass();
                                Ui.EventReceiver eventReceiver = afterPayStackableInfoSheetView.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(new InfoSheetViewEvents.OpenUrl(str));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            default:
                                int i5 = AfterPayStackableInfoSheetView.$r8$clinit;
                                str.getClass();
                                Ui.EventReceiver eventReceiver2 = afterPayStackableInfoSheetView.eventReceiver;
                                if (eventReceiver2 != null) {
                                    eventReceiver2.sendEvent(new InfoSheetViewEvents.OpenUrl(str));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                        }
                    }
                };
                textModel.getClass();
                FigmaTextView figmaTextView = new FigmaTextView(context7, null, 2, null);
                ImageUtilsKt.applyTextModel(figmaTextView, textModel, function1);
                figmaTextView.setLinkTextColor(colorPalette.secondaryLabel);
                figmaTextView.setMovementMethod(BetterLinkMovementMethod.getInstance());
                figmaTextView.setHighlightColor(colorPalette.tertiaryLabel);
                figmaTextView.setClickable(true);
                figmaTextView.setPadding(figmaTextView.getPaddingLeft(), figmaTextView.getPaddingTop(), figmaTextView.getPaddingRight(), Views.dip((View) figmaTextView, 16));
                addView(figmaTextView);
            } else {
                if (!(stackableRow instanceof StackableRow.RowItem)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                Context context8 = getContext();
                context8.getClass();
                AfterPaySectionRowView afterPaySectionRowView = new AfterPaySectionRowView(context8);
                StackableRow.RowItem rowItem = (StackableRow.RowItem) stackableRow;
                TextModel textModel2 = rowItem.title;
                TextModel textModel3 = rowItem.detail;
                Function1 function12 = new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayStackableInfoSheetView$$ExternalSyntheticLambda1
                    public final /* synthetic */ AfterPayStackableInfoSheetView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = i;
                        AfterPayStackableInfoSheetView afterPayStackableInfoSheetView = this.f$0;
                        String str = (String) obj;
                        switch (i3) {
                            case 0:
                                int i4 = AfterPayStackableInfoSheetView.$r8$clinit;
                                str.getClass();
                                Ui.EventReceiver eventReceiver = afterPayStackableInfoSheetView.eventReceiver;
                                if (eventReceiver != null) {
                                    eventReceiver.sendEvent(new InfoSheetViewEvents.OpenUrl(str));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                            default:
                                int i5 = AfterPayStackableInfoSheetView.$r8$clinit;
                                str.getClass();
                                Ui.EventReceiver eventReceiver2 = afterPayStackableInfoSheetView.eventReceiver;
                                if (eventReceiver2 != null) {
                                    eventReceiver2.sendEvent(new InfoSheetViewEvents.OpenUrl(str));
                                    return Unit.INSTANCE;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                                throw null;
                        }
                    }
                };
                FigmaTextView figmaTextView2 = afterPaySectionRowView.title;
                if (textModel2 != null) {
                    ImageUtilsKt.applyTextModel(figmaTextView2, textModel2, function12);
                } else {
                    figmaTextView2.setText((CharSequence) null);
                }
                FigmaTextView figmaTextView3 = afterPaySectionRowView.detail;
                if (textModel3 != null) {
                    ImageUtilsKt.applyTextModel(figmaTextView3, textModel3, function12);
                } else {
                    figmaTextView3.setText((CharSequence) null);
                }
                afterPaySectionRowView.setPadding(afterPaySectionRowView.getPaddingLeft(), afterPaySectionRowView.getPaddingTop(), afterPaySectionRowView.getPaddingRight(), Views.dip((View) afterPaySectionRowView, 6));
                addView(afterPaySectionRowView);
            }
        }
        addView(this.closeButton);
    }
}
