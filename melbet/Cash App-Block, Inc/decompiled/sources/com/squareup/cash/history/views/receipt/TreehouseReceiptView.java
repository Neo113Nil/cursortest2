package com.squareup.cash.history.views.receipt;

import android.content.Context;
import android.net.Uri;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.graphics.ColorKt;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.history.treehouse.RealTreehouseActivity;
import com.squareup.cash.history.viewmodels.TreehouseReceiptViewModel;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;

/* loaded from: classes7.dex */
public final class TreehouseReceiptView implements Ui {
    public final CashTreehouseLayout treehouseView;

    public TreehouseReceiptView(Context context, RealTreehouseActivity realTreehouseActivity, CashTreehouseLayout.Factory factory, OnBackPressedDispatcher onBackPressedDispatcher) {
        int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(ThemeHelpersKt.findThemeInfo(context).arcadeColors.semantic.background.f1047app);
        CashTreehouseLayout create$default = CashTreehouseLayout.Factory.create$default(factory, context, realTreehouseActivity.getTreehouseApp(), onBackPressedDispatcher);
        create$default.setBackgroundColor(m694toArgb8_81llA);
        this.treehouseView = create$default;
    }

    public final CashTreehouseLayout getTreehouseView() {
        return this.treehouseView;
    }

    @Override // app.cash.broadway.ui.Ui
    public final void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public final void setModel(Object obj) {
        ActivityTokenType activityTokenType;
        String str;
        ActivityTokenType activityTokenType2;
        String str2;
        TreehouseReceiptViewModel treehouseReceiptViewModel = (TreehouseReceiptViewModel) obj;
        treehouseReceiptViewModel.getClass();
        Uri.Builder builder = new Uri.Builder();
        String str3 = treehouseReceiptViewModel.paymentToken;
        ActivityToken activityToken = treehouseReceiptViewModel.primaryActivityToken;
        Uri.Builder path = builder.path("/treehouse/activity/receipt/".concat(str3));
        ActivityToken activityToken2 = treehouseReceiptViewModel.activityToken;
        if (activityToken2 != null && (str2 = activityToken2.token) != null) {
            path.appendQueryParameter("activity_token", str2);
        }
        if (activityToken2 != null && (activityTokenType2 = activityToken2.activity_token_type) != null) {
            path.appendQueryParameter("activity_token_type", String.valueOf(activityTokenType2.getValue()));
        }
        if (activityToken != null && (str = activityToken.token) != null) {
            path.appendQueryParameter("primary_activity_token", str);
        }
        if (activityToken != null && (activityTokenType = activityToken.activity_token_type) != null) {
            path.appendQueryParameter("primary_activity_token_type", String.valueOf(activityTokenType.getValue()));
        }
        ActivityScope activityScope = treehouseReceiptViewModel.activityScope;
        if (activityScope != null) {
            path.appendQueryParameter("activity_scope", String.valueOf(activityScope.getValue()));
        }
        String str4 = treehouseReceiptViewModel.encodedExitUrl;
        if (str4 != null) {
            path.appendQueryParameter("encoded_exit_url", str4);
        }
        String str5 = treehouseReceiptViewModel.locale;
        if (str5 != null) {
            path.appendQueryParameter("locale", str5);
        }
        String uri = path.build().toString();
        uri.getClass();
        CashTreehouseLayout.setContent$default(this.treehouseView, uri, treehouseReceiptViewModel.navigator, null, 4, null);
        CashTreehouseLayout cashTreehouseLayout = this.treehouseView;
        cashTreehouseLayout.getClass();
        CashTreehouseLayout.updateState$default(cashTreehouseLayout, CashTreehouseLayout.BindState.BoundWhenReady, null, 2);
    }
}
