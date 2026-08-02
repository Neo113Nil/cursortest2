package com.squareup.cash.profile.views.notifications;

import com.squareup.cash.arcade.Icons;
import com.squareup.cash.profile.viewmodels.Category;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes7.dex */
public abstract class ProfileNotificationsUiMapperKt {
    public static final List ORDERED_CATEGORY_TYPES = CollectionsKt__CollectionsKt.listOf((Object[]) new CATEGORIES[]{CATEGORIES.STOCK_I_OWN, CATEGORIES.STOCK_I_FOLLOW, CATEGORIES.OTHER});

    public static final Icons getNotificationIcon(Category.Icon icon) {
        icon.getClass();
        switch (icon.ordinal()) {
            case 0:
                return Icons.CommPhoneFill24;
            case 1:
                return Icons.CommEmail24;
            case 2:
                return Icons.SecurityLockOutline24;
            case 3:
            case 11:
                return Icons.Document24;
            case 4:
                return Icons.Edit24;
            case 5:
                return Icons.TransferP2P24;
            case 6:
                return Icons.Fast24;
            case 7:
                return Icons.Taxes24;
            case 8:
                return Icons.Anniversary24;
            case 9:
                return Icons.InvestingCustomBuy24;
            case 10:
                return Icons.Investing24;
            case 12:
                return Icons.CurrencyBtc24;
            case 13:
            case 17:
                return Icons.DiscountTag24;
            case 14:
                return Icons.CategoryIpo24;
            case 15:
                return Icons.Family24;
            case 16:
                return Icons.Fast24;
            case 18:
                return Icons.Anniversary24;
            case 19:
                return Icons.Local24;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
