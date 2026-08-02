package com.squareup.cash.directory_ui.views;

import android.view.View;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.treehouse.QrCodeScannerBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.investing.components.news.NewsArticleAdapter;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardItemView$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CardItemView$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Ui.EventReceiver eventReceiver = (Ui.EventReceiver) obj2;
                DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) obj;
                String str2 = itemViewModel.itemActionUrl;
                if (str2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Item has a null action_url");
                    return;
                }
                DirectoryAnalyticsData directoryAnalyticsData = itemViewModel.analyticsData;
                eventReceiver.sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.ActionClick(str2, DirectoryAnalyticsData.copy$default(directoryAnalyticsData, DirectoryAnalyticsData.ItemAnalyticsData.copy$default(directoryAnalyticsData.item, Integer.valueOf(i2)), DirectoryAnalyticsData.TapSurface.ITEM, DirectoryAnalyticsData.EventType.TAP_PROFILE_DIRECTORY_ITEM, HttpStatusCode.TOO_MANY_REQUESTS_429), itemViewModel.recipient));
                return;
            case 1:
                Ui.EventReceiver eventReceiver2 = (Ui.EventReceiver) obj2;
                DirectoryListItem.ItemViewModel itemViewModel2 = (DirectoryListItem.ItemViewModel) obj;
                AvatarViewModel avatarViewModel = itemViewModel2.avatar;
                if (avatarViewModel == null || (str = avatarViewModel.actionUrl) == null) {
                    str = itemViewModel2.itemActionUrl;
                }
                if (str == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Item has a null action_url");
                    return;
                }
                DirectoryAnalyticsData directoryAnalyticsData2 = itemViewModel2.analyticsData;
                eventReceiver2.sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.ActionClick(str, DirectoryAnalyticsData.copy$default(directoryAnalyticsData2, DirectoryAnalyticsData.ItemAnalyticsData.copy$default(directoryAnalyticsData2.item, Integer.valueOf(i2)), DirectoryAnalyticsData.TapSurface.ITEM, DirectoryAnalyticsData.EventType.TAP_PROFILE_DIRECTORY_ITEM, HttpStatusCode.TOO_MANY_REQUESTS_429), itemViewModel2.recipient));
                return;
            default:
                InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel = (InvestingCryptoNewsArticleViewModel) obj;
                QrCodeScannerBinding$$ExternalSyntheticLambda0 qrCodeScannerBinding$$ExternalSyntheticLambda0 = ((NewsArticleAdapter) obj2).eventReceiver;
                if (qrCodeScannerBinding$$ExternalSyntheticLambda0 != null) {
                    qrCodeScannerBinding$$ExternalSyntheticLambda0.sendEvent(new InvestingCryptoNewsViewEvent.ArticleClicked(investingCryptoNewsArticleViewModel, i2));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
        }
    }
}
