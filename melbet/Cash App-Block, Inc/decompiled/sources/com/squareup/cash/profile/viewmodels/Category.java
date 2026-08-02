package com.squareup.cash.profile.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Category {
    public final String body;
    public final CategoryType categoryType;
    public final Icon icon;
    public final boolean isCategoryTurnedOn;
    public final String title;

    public final class AdjustableThreshold {
        public final int currentValue;
        public final int maxValue;
        public final int minValue;

        public AdjustableThreshold(int i, int i2, int i3) {
            this.currentValue = i;
            this.minValue = i2;
            this.maxValue = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdjustableThreshold)) {
                return false;
            }
            AdjustableThreshold adjustableThreshold = (AdjustableThreshold) obj;
            return this.currentValue == adjustableThreshold.currentValue && this.minValue == adjustableThreshold.minValue && this.maxValue == adjustableThreshold.maxValue;
        }

        public final int hashCode() {
            return Integer.hashCode(this.maxValue) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minValue, Integer.hashCode(this.currentValue) * 31, 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxValue, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.currentValue, this.minValue, "AdjustableThreshold(currentValue=", ", minValue=", ", maxValue="));
        }
    }

    public interface CategoryType {

        public final class CategoryList implements CategoryType {
            public final Category$CategoryListHeader$ToggleHeader categoryListHeader;
            public final CategoryListType categoryListType;
            public final List children;

            public CategoryList(CategoryListType categoryListType, Category$CategoryListHeader$ToggleHeader category$CategoryListHeader$ToggleHeader, List list) {
                categoryListType.getClass();
                this.categoryListType = categoryListType;
                this.categoryListHeader = category$CategoryListHeader$ToggleHeader;
                this.children = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CategoryList)) {
                    return false;
                }
                CategoryList categoryList = (CategoryList) obj;
                return this.categoryListType == categoryList.categoryListType && Intrinsics.areEqual(this.categoryListHeader, categoryList.categoryListHeader) && Intrinsics.areEqual(this.children, categoryList.children);
            }

            public final int hashCode() {
                int hashCode = this.categoryListType.hashCode() * 31;
                Category$CategoryListHeader$ToggleHeader category$CategoryListHeader$ToggleHeader = this.categoryListHeader;
                return this.children.hashCode() + ((hashCode + (category$CategoryListHeader$ToggleHeader == null ? 0 : category$CategoryListHeader$ToggleHeader.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CategoryList(categoryListType=");
                sb.append(this.categoryListType);
                sb.append(", categoryListHeader=");
                sb.append(this.categoryListHeader);
                sb.append(", children=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.children, ")");
            }
        }

        public final class ChannelList implements CategoryType {
            public final AdjustableThreshold adjustableThreshold;
            public final ArrayList channels;
            public final String detailedDescription;
            public final List family;
            public final NotificationCategory notificationCategory;

            public ChannelList(ArrayList arrayList, NotificationCategory notificationCategory, String str, AdjustableThreshold adjustableThreshold, List list) {
                notificationCategory.getClass();
                this.channels = arrayList;
                this.notificationCategory = notificationCategory;
                this.detailedDescription = str;
                this.adjustableThreshold = adjustableThreshold;
                this.family = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChannelList)) {
                    return false;
                }
                ChannelList channelList = (ChannelList) obj;
                return this.channels.equals(channelList.channels) && this.notificationCategory == channelList.notificationCategory && Intrinsics.areEqual(this.detailedDescription, channelList.detailedDescription) && Intrinsics.areEqual(this.adjustableThreshold, channelList.adjustableThreshold) && Intrinsics.areEqual(this.family, channelList.family);
            }

            public final int hashCode() {
                int hashCode = (this.notificationCategory.hashCode() + (this.channels.hashCode() * 31)) * 31;
                String str = this.detailedDescription;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AdjustableThreshold adjustableThreshold = this.adjustableThreshold;
                int hashCode3 = (hashCode2 + (adjustableThreshold == null ? 0 : adjustableThreshold.hashCode())) * 31;
                List list = this.family;
                return hashCode3 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ChannelList(channels=");
                sb.append(this.channels);
                sb.append(", notificationCategory=");
                sb.append(this.notificationCategory);
                sb.append(", detailedDescription=");
                sb.append(this.detailedDescription);
                sb.append(", adjustableThreshold=");
                sb.append(this.adjustableThreshold);
                sb.append(", family=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.family, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Icon {
        public static final /* synthetic */ Icon[] $VALUES;
        public static final Icon ACCOUNT_CHANGES;
        public static final Icon BITCOIN_PRICE_ALERT;
        public static final Icon CASH_APP_NEWS;
        public static final Icon EARNINGS_REPORTS;
        public static final Icon EMAIL;
        public static final Icon EXCLUSIVES;
        public static final Icon FAMILY;
        public static final Icon LOCAL;
        public static final Icon NEWS_AND_EXCLUSIVES;
        public static final Icon NOTICES;
        public static final Icon OFFERS;
        public static final Icon PHONE;
        public static final Icon SECURITY;
        public static final Icon STOCKS;
        public static final Icon STOCK_PRICE_CHANGES;
        public static final Icon TAXES;
        public static final Icon TRANSACTIONS;

        static {
            Icon icon = new Icon("PHONE", 0);
            PHONE = icon;
            Icon icon2 = new Icon("EMAIL", 1);
            EMAIL = icon2;
            Icon icon3 = new Icon("SECURITY", 2);
            SECURITY = icon3;
            Icon icon4 = new Icon("NOTICES", 3);
            NOTICES = icon4;
            Icon icon5 = new Icon("ACCOUNT_CHANGES", 4);
            ACCOUNT_CHANGES = icon5;
            Icon icon6 = new Icon("TRANSACTIONS", 5);
            TRANSACTIONS = icon6;
            Icon icon7 = new Icon("NEWS_AND_EXCLUSIVES", 6);
            NEWS_AND_EXCLUSIVES = icon7;
            Icon icon8 = new Icon("TAXES", 7);
            TAXES = icon8;
            Icon icon9 = new Icon("EXCLUSIVES", 8);
            EXCLUSIVES = icon9;
            Icon icon10 = new Icon("STOCK_PRICE_CHANGES", 9);
            STOCK_PRICE_CHANGES = icon10;
            Icon icon11 = new Icon("STOCKS", 10);
            STOCKS = icon11;
            Icon icon12 = new Icon("EARNINGS_REPORTS", 11);
            EARNINGS_REPORTS = icon12;
            Icon icon13 = new Icon("BITCOIN_PRICE_ALERT", 12);
            BITCOIN_PRICE_ALERT = icon13;
            Icon icon14 = new Icon("OFFERS", 13);
            OFFERS = icon14;
            Icon icon15 = new Icon("CASH_APP_NEWS", 14);
            CASH_APP_NEWS = icon15;
            Icon icon16 = new Icon("FAMILY", 15);
            FAMILY = icon16;
            Icon icon17 = new Icon("BOOST", 16);
            Icon icon18 = new Icon("DISCOUNT", 17);
            Icon icon19 = new Icon("ANNIVERSARY", 18);
            Icon icon20 = new Icon("LOCAL", 19);
            LOCAL = icon20;
            $VALUES = new Icon[]{icon, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10, icon11, icon12, icon13, icon14, icon15, icon16, icon17, icon18, icon19, icon20};
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    public Category(CategoryType categoryType, String str, String str2, Icon icon, boolean z) {
        str.getClass();
        this.categoryType = categoryType;
        this.title = str;
        this.body = str2;
        this.icon = icon;
        this.isCategoryTurnedOn = z;
    }

    public static Category copy$default(Category category, CategoryType categoryType, boolean z) {
        String str = category.title;
        String str2 = category.body;
        Icon icon = category.icon;
        category.getClass();
        categoryType.getClass();
        str.getClass();
        return new Category(categoryType, str, str2, icon, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return this.categoryType.equals(category.categoryType) && Intrinsics.areEqual(this.title, category.title) && Intrinsics.areEqual(this.body, category.body) && this.icon == category.icon && this.isCategoryTurnedOn == category.isCategoryTurnedOn;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.categoryType.hashCode() * 31, 31, this.title);
        String str = this.body;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        return Boolean.hashCode(this.isCategoryTurnedOn) + ((hashCode + (icon != null ? icon.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Category(categoryType=");
        sb.append(this.categoryType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", isCategoryTurnedOn=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isCategoryTurnedOn, ")");
    }
}
