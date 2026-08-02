package com.squareup.cash.history.views;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorKt;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.history.viewmodels.ReportAbuseEvent;
import com.squareup.cash.history.viewmodels.ReportAbuseViewModel;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class LegacyReportAbuseView extends LinearLayout implements Ui, OutsideTapCloses {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(LegacyReportAbuseView.class, "titleLayout", "getTitleLayout()Landroid/widget/LinearLayout;", 0), new PropertyReference1Impl(LegacyReportAbuseView.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(LegacyReportAbuseView.class, "subTitleView", "getSubTitleView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(LegacyReportAbuseView.class, "actionsLayout", "getActionsLayout()Landroid/widget/LinearLayout;", 0), new PropertyReference1Impl(LegacyReportAbuseView.class, "cancelView", "getCancelView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(LegacyReportAbuseView.class, "actionView", "getActionView()Landroid/widget/TextView;", 0)};
    public final Lazy actionView$delegate;
    public final Lazy actionsLayout$delegate;
    public final Colors arcadeColors;
    public final Lazy cancelView$delegate;
    public Ui.EventReceiver events;
    public final ProgressBar loadingView;
    public final Lazy subTitleView$delegate;
    public final Lazy titleLayout$delegate;
    public final Lazy titleView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyReportAbuseView(Context context) {
        super(context);
        context.getClass();
        Colors colors = ThemeHelpersKt.themeInfo(this).arcadeColors;
        this.arcadeColors = colors;
        this.titleLayout$delegate = KotterKnifeKt.bindView(this, R.id.title_layout);
        Lazy bindView = KotterKnifeKt.bindView(this, R.id.title);
        this.titleView$delegate = bindView;
        Lazy bindView2 = KotterKnifeKt.bindView(this, R.id.subtitle);
        this.subTitleView$delegate = bindView2;
        Lazy bindView3 = KotterKnifeKt.bindView(this, R.id.actions_layout);
        this.actionsLayout$delegate = bindView3;
        this.cancelView$delegate = KotterKnifeKt.bindView(this, R.id.cancel);
        this.actionView$delegate = KotterKnifeKt.bindView(this, R.id.action);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        final int i = 1;
        layoutParams.gravity = 1;
        progressBar.setLayoutParams(layoutParams);
        this.loadingView = progressBar;
        View.inflate(context, R.layout.report_abuse_view, this);
        setOrientation(1);
        setBackgroundColor(ColorKt.m694toArgb8_81llA(colors.semantic.background.f1047app));
        addView(progressBar);
        KProperty[] kPropertyArr = $$delegatedProperties;
        TextView textView = (TextView) bindView.getValue(this, kPropertyArr[1]);
        Colors.Semantic semantic = colors.semantic;
        textView.setTextColor(ColorKt.m694toArgb8_81llA(semantic.text.prominent));
        ((TextView) bindView2.getValue(this, kPropertyArr[2])).setTextColor(ColorKt.m694toArgb8_81llA(semantic.text.standard));
        int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(semantic.border.subtle);
        setDividerDrawable(new DividerDrawable(m694toArgb8_81llA));
        setShowDividers(2);
        ((LinearLayout) bindView3.getValue(this, kPropertyArr[3])).setDividerDrawable(new DividerDrawable(m694toArgb8_81llA));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        getCancelView().setTextColor(ColorKt.m694toArgb8_81llA(semantic.text.prominent));
        getCancelView().setBackgroundResource(typedValue.resourceId);
        getActionView().setTextColor(ColorKt.m694toArgb8_81llA(semantic.text.prominent));
        getActionView().setBackgroundResource(typedValue.resourceId);
        final int i2 = 0;
        getActionView().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.history.views.LegacyReportAbuseView$$ExternalSyntheticLambda0
            public final /* synthetic */ LegacyReportAbuseView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                LegacyReportAbuseView legacyReportAbuseView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = legacyReportAbuseView.events;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ReportAbuseEvent.ActionClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("events");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = legacyReportAbuseView.events;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(ReportAbuseEvent.CancelClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("events");
                            throw null;
                        }
                }
            }
        });
        getCancelView().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.history.views.LegacyReportAbuseView$$ExternalSyntheticLambda0
            public final /* synthetic */ LegacyReportAbuseView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                LegacyReportAbuseView legacyReportAbuseView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = legacyReportAbuseView.events;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ReportAbuseEvent.ActionClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("events");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = legacyReportAbuseView.events;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(ReportAbuseEvent.CancelClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("events");
                            throw null;
                        }
                }
            }
        });
    }

    public final TextView getActionView() {
        return (TextView) this.actionView$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final TextView getCancelView() {
        return (TextView) this.cancelView$delegate.getValue(this, $$delegatedProperties[4]);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.events = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(ReportAbuseViewModel reportAbuseViewModel) {
        int m694toArgb8_81llA;
        reportAbuseViewModel.getClass();
        KProperty[] kPropertyArr = $$delegatedProperties;
        TextView textView = (TextView) this.titleView$delegate.getValue(this, kPropertyArr[1]);
        String str = reportAbuseViewModel.title;
        boolean z = reportAbuseViewModel.actionInProgress;
        textView.setText(str);
        ((TextView) this.subTitleView$delegate.getValue(this, kPropertyArr[2])).setText(reportAbuseViewModel.subtitle);
        getActionView().setText(reportAbuseViewModel.actionButtonText);
        getCancelView().setText(reportAbuseViewModel.cancelButtonText);
        TextView actionView = getActionView();
        int ordinal = reportAbuseViewModel.action.ordinal();
        Colors colors = this.arcadeColors;
        if (ordinal == 0) {
            m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.text.danger);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.semantic.text.prominent);
        }
        actionView.setTextColor(m694toArgb8_81llA);
        ((LinearLayout) this.titleLayout$delegate.getValue(this, kPropertyArr[0])).setVisibility(z ? 8 : 0);
        ((LinearLayout) this.actionsLayout$delegate.getValue(this, kPropertyArr[3])).setVisibility(z ? 8 : 0);
        setShowDividers(z ? 0 : 2);
        this.loadingView.setVisibility(z ? 0 : 8);
        boolean z2 = !z;
        getCancelView().setEnabled(z2);
        getActionView().setEnabled(z2);
    }
}
