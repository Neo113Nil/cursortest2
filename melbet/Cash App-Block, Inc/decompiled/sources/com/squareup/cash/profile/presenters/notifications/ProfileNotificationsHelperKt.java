package com.squareup.cash.profile.presenters.notifications;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.squareup.cash.R;
import com.squareup.cash.db.profile.NotificationPreference;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.Category$CategoryListHeader$ToggleHeader;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ChannelType;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.profile.viewmodels.SponsoredAccount;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig$Configuration$Families;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig$Configuration$StockPriceMovement;
import com.squareup.protos.franklin.api.UiAlias;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* loaded from: classes7.dex */
public abstract class ProfileNotificationsHelperKt {
    public static final ArrayList ACCOUNT_BASED_CATEGORIES;
    public static final List ACCOUNT_CATEGORIES = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_SECURITY, NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_NOTICES, NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_CHANGES});
    public static final ArrayList ACTIVITY_CATEGORIES;
    public static final List INVESTING_CATEGORIES;
    public static final List NEWS_CATEGORIES;

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_PRICE_CHANGES, NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_EARNINGS_REPORTS, NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_PRICE_CHANGES, NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_EARNINGS_REPORTS});
        INVESTING_CATEGORIES = listOf;
        ArrayList plus = CollectionsKt.plus((Iterable) listOf, (Collection) CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_ACTIVITY_TRANSACTIONS, NotificationCategory.NOTIFICATION_CATEGORY_BITCOIN_PRICE_ALERTS, NotificationCategory.NOTIFICATION_CATEGORY_FAMILY}));
        ACTIVITY_CATEGORIES = plus;
        NEWS_CATEGORIES = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_CASH_APP_NEWS, NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_OFFERS, NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_EXCLUSIVES});
        ACCOUNT_BASED_CATEGORIES = plus;
    }

    public static final List buildActivityCategories(List list, AndroidStringManager androidStringManager) {
        Object obj;
        Object obj2;
        Object obj3;
        list.getClass();
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((UiCategoryNotificationPreference) obj).category == NotificationCategory.NOTIFICATION_CATEGORY_ACTIVITY_TRANSACTIONS) {
                break;
            }
        }
        UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj;
        Category channelCategory = uiCategoryNotificationPreference != null ? toChannelCategory(uiCategoryNotificationPreference, androidStringManager, false) : null;
        Category buildInvestingCategory = buildInvestingCategory(list, androidStringManager);
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((UiCategoryNotificationPreference) obj2).category == NotificationCategory.NOTIFICATION_CATEGORY_BITCOIN_PRICE_ALERTS) {
                break;
            }
        }
        UiCategoryNotificationPreference uiCategoryNotificationPreference2 = (UiCategoryNotificationPreference) obj2;
        Category channelCategory2 = uiCategoryNotificationPreference2 != null ? toChannelCategory(uiCategoryNotificationPreference2, androidStringManager, false) : null;
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (((UiCategoryNotificationPreference) obj3).category == NotificationCategory.NOTIFICATION_CATEGORY_FAMILY) {
                break;
            }
        }
        UiCategoryNotificationPreference uiCategoryNotificationPreference3 = (UiCategoryNotificationPreference) obj3;
        return ArraysKt___ArraysKt.filterNotNull(new Category[]{channelCategory, buildInvestingCategory, channelCategory2, uiCategoryNotificationPreference3 != null ? toChannelCategory(uiCategoryNotificationPreference3, androidStringManager, false) : null});
    }

    public static final Category buildActivityCategory(List list, AndroidStringManager androidStringManager) {
        list.getClass();
        List buildActivityCategories = buildActivityCategories(list, androidStringManager);
        String str = androidStringManager.get(R.string.activity_category_title);
        Category.CategoryType.CategoryList categoryList = new Category.CategoryType.CategoryList(CategoryListType.ACTIVITY, null, buildActivityCategories);
        boolean z = false;
        if (!buildActivityCategories.isEmpty()) {
            Iterator it = buildActivityCategories.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Category) it.next()).isCategoryTurnedOn) {
                    z = true;
                    break;
                }
            }
        }
        return new Category(categoryList, str, null, null, z);
    }

    public static final Category buildInvestingCategory(List list, AndroidStringManager androidStringManager) {
        boolean z;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (CollectionsKt.contains(INVESTING_CATEGORIES, ((UiCategoryNotificationPreference) obj).category)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Category channelCategory = toChannelCategory((UiCategoryNotificationPreference) it.next(), androidStringManager, false);
            if (channelCategory != null) {
                arrayList2.add(channelCategory);
            }
        }
        String str = androidStringManager.get(R.string.investing_category_title);
        String str2 = androidStringManager.get(R.string.investing_category_body);
        Category.Icon icon = Category.Icon.STOCKS;
        Category.CategoryType.CategoryList categoryList = new Category.CategoryType.CategoryList(CategoryListType.INVESTING, null, arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((Category) it2.next()).isCategoryTurnedOn) {
                    z = true;
                    break;
                }
            }
        }
        return new Category(categoryList, str, str2, icon, z);
    }

    public static final Category buildNewsCategory(List list, AndroidStringManager androidStringManager) {
        boolean z;
        boolean z2;
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (CollectionsKt.contains(NEWS_CATEGORIES, ((UiCategoryNotificationPreference) obj).category)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Category channelCategory = toChannelCategory((UiCategoryNotificationPreference) it.next(), androidStringManager, false);
            if (channelCategory != null) {
                arrayList2.add(channelCategory);
            }
        }
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(SequencesKt___SequencesKt.filter(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(list2, 1), new OpenSourceKt$$ExternalSyntheticLambda8(3)));
        while (true) {
            if (!filteringSequence$iterator$1.hasNext()) {
                z = false;
                break;
            }
            if (isOneOrMoreChannelEnabled((UiCategoryNotificationPreference) filteringSequence$iterator$1.next())) {
                z = true;
                break;
            }
        }
        String str = androidStringManager.get(R.string.news_exclusives_category_title);
        String str2 = androidStringManager.get(R.string.news_exclusives_category_body);
        Category.Icon icon = Category.Icon.NEWS_AND_EXCLUSIVES;
        Category.CategoryType.CategoryList categoryList = new Category.CategoryType.CategoryList(CategoryListType.MARKETING, new Category$CategoryListHeader$ToggleHeader(androidStringManager.get(R.string.news_exclusives_category_detailed_description), z), arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Category) it2.next()).isCategoryTurnedOn) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        return new Category(categoryList, str, str2, icon, z2);
    }

    public static final boolean canToggle(Channel channel, boolean z) {
        channel.getClass();
        Accessory accessory = channel.accessory;
        Accessory.Toggle toggle = accessory instanceof Accessory.Toggle ? (Accessory.Toggle) accessory : null;
        return (toggle == null || toggle.isRequired || !toggle.isEnabled || toggle.isToggledOn == z || toggle.hasNoEnabledAlias) ? false : true;
    }

    public static final ArrayList filterAccountBasedCategories(String str, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj;
            NotificationCategory notificationCategory = uiCategoryNotificationPreference.category;
            ArrayList arrayList2 = ACCOUNT_BASED_CATEGORIES;
            if ((CollectionsKt.contains(arrayList2, notificationCategory) && Intrinsics.areEqual(uiCategoryNotificationPreference.account_token, str)) || !CollectionsKt.contains(arrayList2, uiCategoryNotificationPreference.category)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Accessory getAccessory(ClientChannelState clientChannelState) {
        if (clientChannelState == ClientChannelState.CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ALIASES) {
            return Accessory.AddButton.INSTANCE;
        }
        ClientChannelState clientChannelState2 = ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED;
        return new Accessory.Toggle(clientChannelState == clientChannelState2 || clientChannelState == ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_DISABLED, clientChannelState == clientChannelState2 || clientChannelState == ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_OFF_ENABLED || clientChannelState == ClientChannelState.CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ENABLED_ALIASES, clientChannelState == ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_DISABLED || clientChannelState == ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_OFF_DISABLED, clientChannelState == ClientChannelState.CLIENT_CHANNEL_STATE_UNAVAILABLE_NO_ENABLED_ALIASES);
    }

    public static final ArrayList getAliases(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        EnumEntriesList enumEntriesList = AliasItem.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (m.hasNext()) {
            AliasItem aliasItem = (AliasItem) m.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean z = true;
                if (it.hasNext()) {
                    Object next = it.next();
                    NotificationPreference notificationPreference = (NotificationPreference) next;
                    int ordinal = aliasItem.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            break;
                        }
                        if (notificationPreference.f1120type == UiAlias.Type.EMAIL) {
                            arrayList2.add(next);
                        }
                    } else if (notificationPreference.f1120type == UiAlias.Type.SMS) {
                        arrayList2.add(next);
                    }
                } else if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        NotificationPreference notificationPreference2 = (NotificationPreference) it2.next();
                        arrayList3.add(new Alias(notificationPreference2.canonical_text, notificationPreference2.enabled));
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (((NotificationPreference) it3.next()).enabled) {
                                z = false;
                                break;
                            }
                        }
                    }
                    arrayList.add(new ContactMethodType(aliasItem, arrayList3, z));
                }
            }
        }
        return arrayList;
    }

    public static final boolean isOneOrMoreChannelEnabled(UiCategoryNotificationPreference uiCategoryNotificationPreference) {
        uiCategoryNotificationPreference.getClass();
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ClientChannelState[]{ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED, ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_DISABLED});
        return CollectionsKt.contains(listOf, uiCategoryNotificationPreference.email_channel_state) || CollectionsKt.contains(listOf, uiCategoryNotificationPreference.sms_channel_state) || CollectionsKt.contains(listOf, uiCategoryNotificationPreference.push_channel_state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Category toChannelCategory(UiCategoryNotificationPreference uiCategoryNotificationPreference, AndroidStringManager androidStringManager, boolean z) {
        String str;
        String str2;
        String str3;
        Category.Icon icon;
        Category.Icon icon2;
        String str4;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ClientChannelState clientChannelState;
        ClientChannelState clientChannelState2;
        ClientChannelState clientChannelState3;
        ClientChannelState clientChannelState4;
        Category.AdjustableThreshold adjustableThreshold;
        zzkb zzkbVar;
        NotificationCategoryExtraConfig.FamiliesConfiguration familiesConfiguration;
        List list;
        NotificationCategoryExtraConfig.PriceMovementConfiguration priceMovementConfiguration;
        NotificationCategoryExtraConfig.PriceMovementConfiguration priceMovementConfiguration2;
        int intValue;
        uiCategoryNotificationPreference.getClass();
        NotificationCategory notificationCategory = uiCategoryNotificationPreference.category;
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = uiCategoryNotificationPreference.extra_config;
        if (notificationCategory == null) {
            return null;
        }
        if (z && notificationCategory == NotificationCategory.NOTIFICATION_CATEGORY_BITCOIN_PRICE_ALERTS) {
            str = androidStringManager.get(R.string.bitcoin_price_alerts_channel_screen_title);
        } else {
            switch (notificationCategory.ordinal()) {
                case 3:
                    str = androidStringManager.get(R.string.security_category_title);
                    break;
                case 4:
                    str = androidStringManager.get(R.string.notices_category_title);
                    break;
                case 5:
                    str = androidStringManager.get(R.string.account_changes_category_title);
                    break;
                case 6:
                    str = androidStringManager.get(R.string.transactions_category_title);
                    break;
                case 7:
                case 9:
                    str = androidStringManager.get(R.string.stock_price_changes_category_title);
                    break;
                case 8:
                    str = androidStringManager.get(R.string.earnings_report_category_title);
                    break;
                case 10:
                    str = androidStringManager.get(R.string.earnings_ipo_category_title);
                    break;
                case 11:
                    str = androidStringManager.get(R.string.bitcoin_price_alerts_category_title);
                    break;
                case 12:
                    str = androidStringManager.get(R.string.news_category_title);
                    break;
                case 13:
                    str = androidStringManager.get(R.string.offers_category_title);
                    break;
                case 14:
                    str = androidStringManager.get(R.string.exclusives_category_title);
                    break;
                case 15:
                    str = androidStringManager.get(R.string.local_category_title);
                    break;
                case 16:
                    str = androidStringManager.get(R.string.taxes_category_title);
                    break;
                case 17:
                    str = androidStringManager.get(R.string.family_category_title);
                    break;
                default:
                    str = null;
                    break;
            }
            if (str == null) {
                str = "";
            }
        }
        int ordinal = notificationCategory.ordinal();
        if (ordinal == 3) {
            str2 = androidStringManager.get(R.string.security_category_body);
        } else if (ordinal == 4) {
            str2 = androidStringManager.get(R.string.notices_category_body);
        } else if (ordinal == 5) {
            str2 = androidStringManager.get(R.string.account_changes_category_body);
        } else {
            if (ordinal != 6) {
                switch (ordinal) {
                    case 11:
                        str2 = androidStringManager.get(R.string.bitcoin_category_body);
                        break;
                    case 12:
                        str2 = androidStringManager.get(R.string.news_category_body);
                        break;
                    case 13:
                        str2 = androidStringManager.get(R.string.offers_category_body);
                        break;
                    case 14:
                        str2 = androidStringManager.get(R.string.exclusives_category_body);
                        break;
                    case 15:
                        str2 = androidStringManager.get(R.string.local_category_body);
                        break;
                    case 16:
                        str2 = androidStringManager.get(R.string.taxes_category_body);
                        break;
                    case 17:
                        str2 = androidStringManager.get(R.string.family_category_body);
                        break;
                    default:
                        str3 = null;
                        break;
                }
                switch (notificationCategory.ordinal()) {
                    case 3:
                        icon = Category.Icon.SECURITY;
                        icon2 = icon;
                        break;
                    case 4:
                        icon = Category.Icon.NOTICES;
                        icon2 = icon;
                        break;
                    case 5:
                        icon = Category.Icon.ACCOUNT_CHANGES;
                        icon2 = icon;
                        break;
                    case 6:
                        icon = Category.Icon.TRANSACTIONS;
                        icon2 = icon;
                        break;
                    case 7:
                    case 9:
                        icon = Category.Icon.STOCK_PRICE_CHANGES;
                        icon2 = icon;
                        break;
                    case 8:
                    case 10:
                        icon = Category.Icon.EARNINGS_REPORTS;
                        icon2 = icon;
                        break;
                    case 11:
                        icon = Category.Icon.BITCOIN_PRICE_ALERT;
                        icon2 = icon;
                        break;
                    case 12:
                        icon = Category.Icon.CASH_APP_NEWS;
                        icon2 = icon;
                        break;
                    case 13:
                        icon = Category.Icon.OFFERS;
                        icon2 = icon;
                        break;
                    case 14:
                        icon = Category.Icon.EXCLUSIVES;
                        icon2 = icon;
                        break;
                    case 15:
                        icon = Category.Icon.LOCAL;
                        icon2 = icon;
                        break;
                    case 16:
                        icon = Category.Icon.TAXES;
                        icon2 = icon;
                        break;
                    case 17:
                        icon = Category.Icon.FAMILY;
                        icon2 = icon;
                        break;
                    default:
                        icon2 = null;
                        break;
                }
                switch (notificationCategory.ordinal()) {
                    case 3:
                        str4 = androidStringManager.get(R.string.security_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 4:
                        str4 = androidStringManager.get(R.string.notices_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 5:
                        str4 = androidStringManager.get(R.string.account_changes_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 6:
                        str4 = androidStringManager.get(R.string.transactions_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 7:
                    case 9:
                        str4 = androidStringManager.get(R.string.stock_price_changes_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 8:
                        str4 = androidStringManager.get(R.string.earnings_report_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 10:
                        str4 = androidStringManager.get(R.string.earnings_ipo_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 11:
                        str4 = androidStringManager.get(R.string.bitcoin_price_changes_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 12:
                        str4 = androidStringManager.get(R.string.cash_app_news_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 13:
                        str4 = androidStringManager.get(R.string.offers_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 14:
                        str4 = androidStringManager.get(R.string.exclusives_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 15:
                        str4 = androidStringManager.get(R.string.local_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 16:
                        str4 = androidStringManager.get(R.string.taxes_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    case 17:
                        str4 = androidStringManager.get(R.string.family_category_detailed_description);
                        str5 = str4;
                        arrayList = null;
                        break;
                    default:
                        arrayList = null;
                        str5 = null;
                        break;
                }
                arrayList2 = new ArrayList();
                clientChannelState = uiCategoryNotificationPreference.push_channel_state;
                clientChannelState2 = ClientChannelState.CLIENT_CHANNEL_STATE_CONFIG_DISALLOWED;
                if (clientChannelState != clientChannelState2 && clientChannelState != null) {
                    arrayList2.add(new Channel(ChannelType.PUSH, getAccessory(clientChannelState)));
                }
                clientChannelState3 = uiCategoryNotificationPreference.sms_channel_state;
                if (clientChannelState3 != clientChannelState2 && clientChannelState3 != null) {
                    arrayList2.add(new Channel(ChannelType.SMS, getAccessory(clientChannelState3)));
                }
                clientChannelState4 = uiCategoryNotificationPreference.email_channel_state;
                if (clientChannelState4 != clientChannelState2 && clientChannelState4 != null) {
                    arrayList2.add(new Channel(ChannelType.EMAIL, getAccessory(clientChannelState4)));
                }
                if (notificationCategoryExtraConfig != null) {
                    zzkb zzkbVar2 = notificationCategoryExtraConfig.configuration;
                    if (zzkbVar2 != null) {
                        NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement notificationCategoryExtraConfig$Configuration$BitcoinPriceMovement = zzkbVar2 instanceof NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement ? (NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) zzkbVar2 : arrayList;
                        if (notificationCategoryExtraConfig$Configuration$BitcoinPriceMovement != 0) {
                            priceMovementConfiguration = notificationCategoryExtraConfig$Configuration$BitcoinPriceMovement.value;
                            if (zzkbVar2 != null) {
                                NotificationCategoryExtraConfig$Configuration$StockPriceMovement notificationCategoryExtraConfig$Configuration$StockPriceMovement = zzkbVar2 instanceof NotificationCategoryExtraConfig$Configuration$StockPriceMovement ? (NotificationCategoryExtraConfig$Configuration$StockPriceMovement) zzkbVar2 : arrayList;
                                if (notificationCategoryExtraConfig$Configuration$StockPriceMovement != 0) {
                                    priceMovementConfiguration2 = notificationCategoryExtraConfig$Configuration$StockPriceMovement.value;
                                    if (priceMovementConfiguration != 0) {
                                        Integer num = priceMovementConfiguration.price_movement_percent;
                                        int intValue2 = num != null ? num.intValue() : 5;
                                        Integer num2 = priceMovementConfiguration.price_movement_percent_min;
                                        intValue = num2 != null ? num2.intValue() : 5;
                                        Integer num3 = priceMovementConfiguration.price_movement_percent_max;
                                        adjustableThreshold = new Category.AdjustableThreshold(intValue2, intValue, num3 != null ? num3.intValue() : 20);
                                    } else if (priceMovementConfiguration2 != 0) {
                                        Integer num4 = priceMovementConfiguration2.price_movement_percent;
                                        int intValue3 = num4 != null ? num4.intValue() : 5;
                                        Integer num5 = priceMovementConfiguration2.price_movement_percent_min;
                                        intValue = num5 != null ? num5.intValue() : 5;
                                        Integer num6 = priceMovementConfiguration2.price_movement_percent_max;
                                        adjustableThreshold = new Category.AdjustableThreshold(intValue3, intValue, num6 != null ? num6.intValue() : 20);
                                    }
                                    if (notificationCategoryExtraConfig != null && (zzkbVar = notificationCategoryExtraConfig.configuration) != null) {
                                        NotificationCategoryExtraConfig$Configuration$Families notificationCategoryExtraConfig$Configuration$Families = !(zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$Families) ? (NotificationCategoryExtraConfig$Configuration$Families) zzkbVar : arrayList;
                                        familiesConfiguration = notificationCategoryExtraConfig$Configuration$Families == 0 ? notificationCategoryExtraConfig$Configuration$Families.value : arrayList;
                                        if (familiesConfiguration != 0 && (list = familiesConfiguration.sponsored) != null) {
                                            List<NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus> list2 = list;
                                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                            for (NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus sponseeNotificationStatus : list2) {
                                                sponseeNotificationStatus.getClass();
                                                String str6 = sponseeNotificationStatus.account_token;
                                                NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus notificationStatus = NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_ENABLED_ON;
                                                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus[]{notificationStatus, NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_ENABLED_OFF});
                                                NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus notificationStatus2 = sponseeNotificationStatus.notification_status;
                                                arrayList.add(new SponsoredAccount(str6, CollectionsKt.contains(listOf, notificationStatus2), notificationStatus2 == notificationStatus));
                                            }
                                        }
                                    }
                                    return new Category(new Category.CategoryType.ChannelList(arrayList2, notificationCategory, str5, adjustableThreshold, arrayList), str, str3, icon2, isOneOrMoreChannelEnabled(uiCategoryNotificationPreference));
                                }
                            }
                            priceMovementConfiguration2 = arrayList;
                            if (priceMovementConfiguration != 0) {
                            }
                            if (notificationCategoryExtraConfig != null) {
                                if (!(zzkbVar instanceof NotificationCategoryExtraConfig$Configuration$Families)) {
                                }
                                if (notificationCategoryExtraConfig$Configuration$Families == 0) {
                                }
                                if (familiesConfiguration != 0) {
                                    List<NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus> list22 = list;
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list22, 10));
                                    while (r0.hasNext()) {
                                    }
                                }
                            }
                            return new Category(new Category.CategoryType.ChannelList(arrayList2, notificationCategory, str5, adjustableThreshold, arrayList), str, str3, icon2, isOneOrMoreChannelEnabled(uiCategoryNotificationPreference));
                        }
                    }
                    priceMovementConfiguration = arrayList;
                    if (zzkbVar2 != null) {
                    }
                    priceMovementConfiguration2 = arrayList;
                    if (priceMovementConfiguration != 0) {
                    }
                    if (notificationCategoryExtraConfig != null) {
                    }
                    return new Category(new Category.CategoryType.ChannelList(arrayList2, notificationCategory, str5, adjustableThreshold, arrayList), str, str3, icon2, isOneOrMoreChannelEnabled(uiCategoryNotificationPreference));
                }
                adjustableThreshold = arrayList;
                if (notificationCategoryExtraConfig != null) {
                }
                return new Category(new Category.CategoryType.ChannelList(arrayList2, notificationCategory, str5, adjustableThreshold, arrayList), str, str3, icon2, isOneOrMoreChannelEnabled(uiCategoryNotificationPreference));
            }
            str2 = androidStringManager.get(R.string.transactions_category_body);
        }
        str3 = str2;
        switch (notificationCategory.ordinal()) {
        }
        switch (notificationCategory.ordinal()) {
        }
        arrayList2 = new ArrayList();
        clientChannelState = uiCategoryNotificationPreference.push_channel_state;
        clientChannelState2 = ClientChannelState.CLIENT_CHANNEL_STATE_CONFIG_DISALLOWED;
        if (clientChannelState != clientChannelState2) {
            arrayList2.add(new Channel(ChannelType.PUSH, getAccessory(clientChannelState)));
        }
        clientChannelState3 = uiCategoryNotificationPreference.sms_channel_state;
        if (clientChannelState3 != clientChannelState2) {
            arrayList2.add(new Channel(ChannelType.SMS, getAccessory(clientChannelState3)));
        }
        clientChannelState4 = uiCategoryNotificationPreference.email_channel_state;
        if (clientChannelState4 != clientChannelState2) {
            arrayList2.add(new Channel(ChannelType.EMAIL, getAccessory(clientChannelState4)));
        }
        if (notificationCategoryExtraConfig != null) {
        }
        adjustableThreshold = arrayList;
        if (notificationCategoryExtraConfig != null) {
        }
        return new Category(new Category.CategoryType.ChannelList(arrayList2, notificationCategory, str5, adjustableThreshold, arrayList), str, str3, icon2, isOneOrMoreChannelEnabled(uiCategoryNotificationPreference));
    }

    public static final Category updateChannelToggleState(Category category, ChannelType channelType, boolean z) {
        category.getClass();
        channelType.getClass();
        Category.CategoryType categoryType = category.categoryType;
        Category.CategoryType.ChannelList channelList = categoryType instanceof Category.CategoryType.ChannelList ? (Category.CategoryType.ChannelList) categoryType : null;
        if (channelList == null) {
            return category;
        }
        ArrayList<Channel> arrayList = channelList.channels;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Channel channel : arrayList) {
            Accessory accessory = channel.accessory;
            Accessory.Toggle toggle = accessory instanceof Accessory.Toggle ? (Accessory.Toggle) accessory : null;
            if (channel.channelType == channelType && toggle != null) {
                channel = Channel.copy$default(channel, Accessory.Toggle.copy$default(toggle, z));
            }
            arrayList2.add(channel);
        }
        boolean z2 = false;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Accessory accessory2 = ((Channel) it.next()).accessory;
                Accessory.Toggle toggle2 = accessory2 instanceof Accessory.Toggle ? (Accessory.Toggle) accessory2 : null;
                if (toggle2 != null && toggle2.isToggledOn) {
                    z2 = true;
                    break;
                }
            }
        }
        return Category.copy$default(category, new Category.CategoryType.ChannelList(arrayList2, channelList.notificationCategory, channelList.detailedDescription, channelList.adjustableThreshold, channelList.family), z2);
    }
}
