package app.cash.directoryui.viewmodels;

import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewModel;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class DirectoryAnalyticsDataKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowLanding.deepLinkSpecs;
    }

    public static final CardControlDialogViewModel.Button toButton(CardModule.CardElementAction.OpenDialog.OpenDialogButton openDialogButton) {
        LocalizedString localizedString = openDialogButton.text;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
        if (translated == null) {
            translated = "";
        }
        Boolean bool = openDialogButton.is_destructive;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str = openDialogButton.client_route;
        return new CardControlDialogViewModel.Button(translated, booleanValue, str != null ? new CardControlDialogViewModel.Button.Response.OpenUrl(str) : CardControlDialogViewModel.Button.Response.Dismiss.INSTANCE);
    }

    public static final DirectoryAnalyticsData.EntityType toEntityType(Metadata.EntityType entityType) {
        entityType.getClass();
        switch (entityType) {
            case UNKNOWN:
                return null;
            case CUSTOMER:
                return DirectoryAnalyticsData.EntityType.CUSTOMER;
            case AP_STORE:
                return DirectoryAnalyticsData.EntityType.AP_STORE;
            case BOOST_MERCHANT:
                return DirectoryAnalyticsData.EntityType.BOOST_MERCHANT;
            case PRODUCT:
                return DirectoryAnalyticsData.EntityType.PRODUCT;
            case SQ_MERCHANT:
                return DirectoryAnalyticsData.EntityType.SQ_MERCHANT;
            case CAP:
                return DirectoryAnalyticsData.EntityType.CAP;
            case APP_FEATURE:
                return DirectoryAnalyticsData.EntityType.APP_FEATURE;
            case STOCK:
                return DirectoryAnalyticsData.EntityType.STOCK;
            case OFFER:
                return DirectoryAnalyticsData.EntityType.OFFER;
            case BUSINESS:
                return DirectoryAnalyticsData.EntityType.REGULAR_MERCHANT;
            case CASH_AFTERPAY:
                return DirectoryAnalyticsData.EntityType.CASH_AFTERPAY;
            case LOCAL_BRAND:
                return DirectoryAnalyticsData.EntityType.LOCAL_BRAND;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
