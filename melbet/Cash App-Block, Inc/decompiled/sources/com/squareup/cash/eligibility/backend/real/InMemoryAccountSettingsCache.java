package com.squareup.cash.eligibility.backend.real;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountCreationSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountDowngradeSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountLinkingSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountUpgradeSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$FamilySettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$FavoritesSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$IdvSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$LinkedBanksSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$NotificationSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$PersonalSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$PromotionsAndReferralsSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$SecurityHubSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$SecuritySettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$ShoppingSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$ThemeSettings;
import com.squareup.cash.eligibility.backend.utils.SettingsUtilKt$WhenMappings;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InMemoryAccountSettingsCache {
    public final AccountSettingType$AccountCreationSettings accountCreation;
    public final AccountSettingType$AccountDowngradeSettings accountDowngrade;
    public final AccountSettingType$AccountLinkingSettings accountLinking;
    public final AccountSettingType$AccountUpgradeSettings accountUpgrade;
    public final AccountSettingType$FamilySettings family;
    public final AccountSettingType$FavoritesSettings favorites;
    public final AccountSettingType$IdvSettings idv;
    public final AccountSettingType$LinkedBanksSettings linkedBanks;
    public final AccountSettingType$NotificationSettings notification;
    public final AccountSettingType$PersonalSettings personal;
    public final AccountSettingType$PromotionsAndReferralsSettings promotionsAndReferrals;
    public final AccountSettingType$SecuritySettings security;
    public final AccountSettingType$SecurityHubSettings securityHub;
    public final List settingsResponse;
    public final AccountSettingType$ShoppingSettings shopping;
    public final AccountSettingType$ThemeSettings theme;

    /* JADX WARN: Removed duplicated region for block: B:150:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x052a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InMemoryAccountSettingsCache(List list) {
        Object obj;
        Map map;
        Object obj2;
        Map map2;
        Object obj3;
        Map map3;
        Object obj4;
        Map map4;
        Object obj5;
        Map map5;
        Object obj6;
        Map map6;
        Object obj7;
        Map map7;
        Object obj8;
        Map map8;
        Object obj9;
        Map map9;
        Object obj10;
        Map map10;
        Object obj11;
        Map map11;
        Object obj12;
        Map map12;
        Object obj13;
        Map map13;
        Object obj14;
        Map map14;
        Object obj15;
        Map map15;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list2;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list3;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list4;
        AccountSettingType$PromotionsAndReferralsSettings.PromotionsAndReferralsSubSetting promotionsAndReferralsSubSetting;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list5;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list6;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list7;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list8;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list9;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list10;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list11;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list12;
        AccountSettingType$AccountCreationSettings.AccountCreationSubSetting accountCreationSubSetting;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list13;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list14;
        AccountSettingType$SecuritySettings.SecuritySubSetting securitySubSetting;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list15;
        AccountSettingType$PersonalSettings.PersonalSubSetting personalSubSetting;
        List<GetAccountSettingsResponse.SettingCollection.Setting> list16;
        AccountSettingType$NotificationSettings.NotificationSubSetting notificationSubSetting;
        list.getClass();
        this.settingsResponse = list;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj).f1282type == GetAccountSettingsResponse.SettingType.NOTIFICATION) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection = (GetAccountSettingsResponse.SettingCollection) obj;
        if (settingCollection == null || (list16 = settingCollection.settings) == null) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        } else {
            map = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting : list16) {
                GetAccountSettingsResponse.SettingName settingName = setting.key;
                if (settingName != null) {
                    int ordinal = settingName.ordinal();
                    if (ordinal == 9) {
                        notificationSubSetting = AccountSettingType$NotificationSettings.NotificationSubSetting.NOTIFICATIONS_AND_RECEIPTS;
                    } else if (ordinal == 10) {
                        notificationSubSetting = AccountSettingType$NotificationSettings.NotificationSubSetting.MESSAGES;
                    }
                    if (notificationSubSetting == null) {
                        map.put(notificationSubSetting, setting);
                    }
                }
                notificationSubSetting = null;
                if (notificationSubSetting == null) {
                }
            }
        }
        this.notification = new AccountSettingType$NotificationSettings(map);
        Iterator it2 = this.settingsResponse.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj2).f1282type == GetAccountSettingsResponse.SettingType.PERSONAL) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection2 = (GetAccountSettingsResponse.SettingCollection) obj2;
        if (settingCollection2 == null || (list15 = settingCollection2.settings) == null) {
            map2 = EmptyMap.INSTANCE;
            map2.getClass();
        } else {
            map2 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting2 : list15) {
                GetAccountSettingsResponse.SettingName settingName2 = setting2.key;
                if (settingName2 != null) {
                    int ordinal2 = settingName2.ordinal();
                    if (ordinal2 == 11) {
                        personalSubSetting = AccountSettingType$PersonalSettings.PersonalSubSetting.YOUR_INFO;
                    } else if (ordinal2 == 12) {
                        personalSubSetting = AccountSettingType$PersonalSettings.PersonalSubSetting.ADDRESS;
                    }
                    if (personalSubSetting == null) {
                        map2.put(personalSubSetting, setting2);
                    }
                }
                personalSubSetting = null;
                if (personalSubSetting == null) {
                }
            }
        }
        this.personal = new AccountSettingType$PersonalSettings(map2);
        Iterator it3 = this.settingsResponse.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj3).f1282type == GetAccountSettingsResponse.SettingType.SECURITY) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection3 = (GetAccountSettingsResponse.SettingCollection) obj3;
        if (settingCollection3 == null || (list14 = settingCollection3.settings) == null) {
            map3 = EmptyMap.INSTANCE;
            map3.getClass();
        } else {
            map3 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting3 : list14) {
                GetAccountSettingsResponse.SettingName settingName3 = setting3.key;
                if (settingName3 != null) {
                    int ordinal3 = settingName3.ordinal();
                    if (ordinal3 == 0) {
                        securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.SECURITY_LOCK;
                    } else if (ordinal3 == 1) {
                        securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.SECURITY_DEVICES;
                    } else if (ordinal3 == 13) {
                        securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.SECURITY_PIN;
                    } else if (ordinal3 == 14) {
                        securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.SECURITY_PASSKEYS;
                    } else if (ordinal3 != 20) {
                        switch (ordinal3) {
                            case 3:
                                securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.CASHTAG;
                                break;
                            case 4:
                                securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.REQUESTS_INCOMING_REQUESTS;
                                break;
                            case 5:
                                securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.CONTACTS_SYNC_CONTACTS;
                                break;
                            case 6:
                                securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.INVESTING_TRUSTED_CONTACT;
                                break;
                            case 7:
                                securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.TAXES_PASSWORD;
                                break;
                            case 8:
                                securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.TAXES_AUTH_APP;
                                break;
                        }
                    } else {
                        securitySubSetting = AccountSettingType$SecuritySettings.SecuritySubSetting.SEARCH_PRIVACY;
                    }
                    if (securitySubSetting == null) {
                        map3.put(securitySubSetting, setting3);
                    }
                }
                securitySubSetting = null;
                if (securitySubSetting == null) {
                }
            }
        }
        this.security = new AccountSettingType$SecuritySettings(map3);
        Iterator it4 = this.settingsResponse.iterator();
        while (true) {
            if (it4.hasNext()) {
                obj4 = it4.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj4).f1282type == GetAccountSettingsResponse.SettingType.SECURITY) {
                }
            } else {
                obj4 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection4 = (GetAccountSettingsResponse.SettingCollection) obj4;
        if (settingCollection4 == null || (list13 = settingCollection4.settings) == null) {
            map4 = EmptyMap.INSTANCE;
            map4.getClass();
        } else {
            map4 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting4 : list13) {
                GetAccountSettingsResponse.SettingName settingName4 = setting4.key;
                AccountSettingType$IdvSettings.IdvSubSetting idvSubSetting = (settingName4 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName4.ordinal()] != 16) ? null : AccountSettingType$IdvSettings.IdvSubSetting.IDENTITIY_VERIFICATION_IDV;
                if (idvSubSetting != null) {
                    map4.put(idvSubSetting, setting4);
                }
            }
        }
        this.idv = new AccountSettingType$IdvSettings(map4);
        Iterator it5 = this.settingsResponse.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj5 = it5.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj5).f1282type == GetAccountSettingsResponse.SettingType.ACCOUNT_CREATION) {
                }
            } else {
                obj5 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection5 = (GetAccountSettingsResponse.SettingCollection) obj5;
        if (settingCollection5 == null || (list12 = settingCollection5.settings) == null) {
            map5 = EmptyMap.INSTANCE;
            map5.getClass();
        } else {
            map5 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting5 : list12) {
                GetAccountSettingsResponse.SettingName settingName5 = setting5.key;
                if (settingName5 != null) {
                    int ordinal4 = settingName5.ordinal();
                    if (ordinal4 == 15) {
                        accountCreationSubSetting = AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_BUSINESS_ACCOUNT;
                    } else if (ordinal4 == 18) {
                        accountCreationSubSetting = AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_PERSONAL_ACCOUNT;
                    }
                    if (accountCreationSubSetting == null) {
                        map5.put(accountCreationSubSetting, setting5);
                    }
                }
                accountCreationSubSetting = null;
                if (accountCreationSubSetting == null) {
                }
            }
        }
        this.accountCreation = new AccountSettingType$AccountCreationSettings(map5);
        Iterator it6 = this.settingsResponse.iterator();
        while (true) {
            if (it6.hasNext()) {
                obj6 = it6.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj6).f1282type == GetAccountSettingsResponse.SettingType.ACCOUNT_LINKING) {
                }
            } else {
                obj6 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection6 = (GetAccountSettingsResponse.SettingCollection) obj6;
        if (settingCollection6 == null || (list11 = settingCollection6.settings) == null) {
            map6 = EmptyMap.INSTANCE;
            map6.getClass();
        } else {
            map6 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting6 : list11) {
                GetAccountSettingsResponse.SettingName settingName6 = setting6.key;
                AccountSettingType$AccountLinkingSettings.AccountLinkSubSetting accountLinkSubSetting = (settingName6 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName6.ordinal()] != 19) ? null : AccountSettingType$AccountLinkingSettings.AccountLinkSubSetting.ACCOUNT_LINK;
                if (accountLinkSubSetting != null) {
                    map6.put(accountLinkSubSetting, setting6);
                }
            }
        }
        this.accountLinking = new AccountSettingType$AccountLinkingSettings(map6);
        Iterator it7 = this.settingsResponse.iterator();
        while (true) {
            if (it7.hasNext()) {
                obj7 = it7.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj7).f1282type == GetAccountSettingsResponse.SettingType.FAMILY) {
                }
            } else {
                obj7 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection7 = (GetAccountSettingsResponse.SettingCollection) obj7;
        if (settingCollection7 == null || (list10 = settingCollection7.settings) == null) {
            map7 = EmptyMap.INSTANCE;
            map7.getClass();
        } else {
            map7 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting7 : list10) {
                GetAccountSettingsResponse.SettingName settingName7 = setting7.key;
                AccountSettingType$FamilySettings.FamilySubSetting familySubSetting = (settingName7 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName7.ordinal()] != 27) ? null : AccountSettingType$FamilySettings.FamilySubSetting.INVITE_TEEN;
                if (familySubSetting != null) {
                    map7.put(familySubSetting, setting7);
                }
            }
        }
        this.family = new AccountSettingType$FamilySettings(map7);
        Iterator it8 = this.settingsResponse.iterator();
        while (true) {
            if (it8.hasNext()) {
                obj8 = it8.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj8).f1282type == GetAccountSettingsResponse.SettingType.ACCOUNT_DOWNGRADE) {
                }
            } else {
                obj8 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection8 = (GetAccountSettingsResponse.SettingCollection) obj8;
        if (settingCollection8 == null || (list9 = settingCollection8.settings) == null) {
            map8 = EmptyMap.INSTANCE;
            map8.getClass();
        } else {
            map8 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting8 : list9) {
                GetAccountSettingsResponse.SettingName settingName8 = setting8.key;
                AccountSettingType$AccountDowngradeSettings.AccountDowngradeSubSetting accountDowngradeSubSetting = (settingName8 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName8.ordinal()] != 28) ? null : AccountSettingType$AccountDowngradeSettings.AccountDowngradeSubSetting.DOWNGRADE_TO_P2P;
                if (accountDowngradeSubSetting != null) {
                    map8.put(accountDowngradeSubSetting, setting8);
                }
            }
        }
        this.accountDowngrade = new AccountSettingType$AccountDowngradeSettings(map8);
        Iterator it9 = this.settingsResponse.iterator();
        while (true) {
            if (it9.hasNext()) {
                obj9 = it9.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj9).f1282type == GetAccountSettingsResponse.SettingType.ACCOUNT_UPGRADE) {
                }
            } else {
                obj9 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection9 = (GetAccountSettingsResponse.SettingCollection) obj9;
        if (settingCollection9 == null || (list8 = settingCollection9.settings) == null) {
            map9 = EmptyMap.INSTANCE;
            map9.getClass();
        } else {
            map9 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting9 : list8) {
                GetAccountSettingsResponse.SettingName settingName9 = setting9.key;
                AccountSettingType$AccountUpgradeSettings.AccountUpgradeSubSetting accountUpgradeSubSetting = (settingName9 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName9.ordinal()] != 29) ? null : AccountSettingType$AccountUpgradeSettings.AccountUpgradeSubSetting.UPGRADE_TO_BUSINESS;
                if (accountUpgradeSubSetting != null) {
                    map9.put(accountUpgradeSubSetting, setting9);
                }
            }
        }
        this.accountUpgrade = new AccountSettingType$AccountUpgradeSettings(map9);
        Iterator it10 = this.settingsResponse.iterator();
        while (true) {
            if (it10.hasNext()) {
                obj10 = it10.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj10).f1282type == GetAccountSettingsResponse.SettingType.BANK_LINKING) {
                }
            } else {
                obj10 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection10 = (GetAccountSettingsResponse.SettingCollection) obj10;
        if (settingCollection10 == null || (list7 = settingCollection10.settings) == null) {
            map10 = EmptyMap.INSTANCE;
            map10.getClass();
        } else {
            map10 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting10 : list7) {
                GetAccountSettingsResponse.SettingName settingName10 = setting10.key;
                AccountSettingType$LinkedBanksSettings.LinkedBanksSubSetting linkedBanksSubSetting = (settingName10 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName10.ordinal()] != 20) ? null : AccountSettingType$LinkedBanksSettings.LinkedBanksSubSetting.LINK_BANKS;
                if (linkedBanksSubSetting != null) {
                    map10.put(linkedBanksSubSetting, setting10);
                }
            }
        }
        this.linkedBanks = new AccountSettingType$LinkedBanksSettings(map10);
        Iterator it11 = this.settingsResponse.iterator();
        while (true) {
            if (it11.hasNext()) {
                obj11 = it11.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj11).f1282type == GetAccountSettingsResponse.SettingType.FAVORITES) {
                }
            } else {
                obj11 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection11 = (GetAccountSettingsResponse.SettingCollection) obj11;
        if (settingCollection11 == null || (list6 = settingCollection11.settings) == null) {
            map11 = EmptyMap.INSTANCE;
            map11.getClass();
        } else {
            map11 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting11 : list6) {
                GetAccountSettingsResponse.SettingName settingName11 = setting11.key;
                AccountSettingType$FavoritesSettings.FavoritesSubSetting favoritesSubSetting = (settingName11 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName11.ordinal()] != 21) ? null : AccountSettingType$FavoritesSettings.FavoritesSubSetting.MANAGE_FAVORITES;
                if (favoritesSubSetting != null) {
                    map11.put(favoritesSubSetting, setting11);
                }
            }
        }
        this.favorites = new AccountSettingType$FavoritesSettings(map11);
        Iterator it12 = this.settingsResponse.iterator();
        while (true) {
            if (it12.hasNext()) {
                obj12 = it12.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj12).f1282type == GetAccountSettingsResponse.SettingType.THEME) {
                }
            } else {
                obj12 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection12 = (GetAccountSettingsResponse.SettingCollection) obj12;
        if (settingCollection12 == null || (list5 = settingCollection12.settings) == null) {
            map12 = EmptyMap.INSTANCE;
            map12.getClass();
        } else {
            map12 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting12 : list5) {
                GetAccountSettingsResponse.SettingName settingName12 = setting12.key;
                AccountSettingType$ThemeSettings.ThemeSubSetting themeSubSetting = (settingName12 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName12.ordinal()] != 24) ? null : AccountSettingType$ThemeSettings.ThemeSubSetting.MANAGE_THEME;
                if (themeSubSetting != null) {
                    map12.put(themeSubSetting, setting12);
                }
            }
        }
        this.theme = new AccountSettingType$ThemeSettings(map12);
        Iterator it13 = this.settingsResponse.iterator();
        while (true) {
            if (it13.hasNext()) {
                obj13 = it13.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj13).f1282type == GetAccountSettingsResponse.SettingType.PROMOTIONS) {
                }
            } else {
                obj13 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection13 = (GetAccountSettingsResponse.SettingCollection) obj13;
        if (settingCollection13 == null || (list4 = settingCollection13.settings) == null) {
            map13 = EmptyMap.INSTANCE;
            map13.getClass();
        } else {
            map13 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting13 : list4) {
                GetAccountSettingsResponse.SettingName settingName13 = setting13.key;
                if (settingName13 != null) {
                    int ordinal5 = settingName13.ordinal();
                    if (ordinal5 == 25) {
                        promotionsAndReferralsSubSetting = AccountSettingType$PromotionsAndReferralsSettings.PromotionsAndReferralsSubSetting.INVITE_FRIENDS;
                    } else if (ordinal5 == 26) {
                        promotionsAndReferralsSubSetting = AccountSettingType$PromotionsAndReferralsSettings.PromotionsAndReferralsSubSetting.ENTER_CODE;
                    }
                    if (promotionsAndReferralsSubSetting == null) {
                        map13.put(promotionsAndReferralsSubSetting, setting13);
                    }
                }
                promotionsAndReferralsSubSetting = null;
                if (promotionsAndReferralsSubSetting == null) {
                }
            }
        }
        this.promotionsAndReferrals = new AccountSettingType$PromotionsAndReferralsSettings(map13);
        Iterator it14 = this.settingsResponse.iterator();
        while (true) {
            if (it14.hasNext()) {
                obj14 = it14.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj14).f1282type == GetAccountSettingsResponse.SettingType.SHOPPING) {
                }
            } else {
                obj14 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection14 = (GetAccountSettingsResponse.SettingCollection) obj14;
        if (settingCollection14 == null || (list3 = settingCollection14.settings) == null) {
            map14 = EmptyMap.INSTANCE;
            map14.getClass();
        } else {
            map14 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting14 : list3) {
                GetAccountSettingsResponse.SettingName settingName14 = setting14.key;
                AccountSettingType$ShoppingSettings.ShoppingSubSetting shoppingSubSetting = (settingName14 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName14.ordinal()] != 22) ? null : AccountSettingType$ShoppingSettings.ShoppingSubSetting.VIEW_SHOPPING;
                if (shoppingSubSetting != null) {
                    map14.put(shoppingSubSetting, setting14);
                }
            }
        }
        this.shopping = new AccountSettingType$ShoppingSettings(map14);
        Iterator it15 = this.settingsResponse.iterator();
        while (true) {
            if (it15.hasNext()) {
                obj15 = it15.next();
                if (((GetAccountSettingsResponse.SettingCollection) obj15).f1282type == GetAccountSettingsResponse.SettingType.SECURITY_HUB) {
                }
            } else {
                obj15 = null;
            }
        }
        GetAccountSettingsResponse.SettingCollection settingCollection15 = (GetAccountSettingsResponse.SettingCollection) obj15;
        if (settingCollection15 == null || (list2 = settingCollection15.settings) == null) {
            map15 = EmptyMap.INSTANCE;
            map15.getClass();
        } else {
            map15 = new LinkedHashMap();
            for (GetAccountSettingsResponse.SettingCollection.Setting setting15 : list2) {
                GetAccountSettingsResponse.SettingName settingName15 = setting15.key;
                AccountSettingType$SecurityHubSettings.SecurityHubSubSetting securityHubSubSetting = (settingName15 == null || SettingsUtilKt$WhenMappings.$EnumSwitchMapping$0[settingName15.ordinal()] != 23) ? null : AccountSettingType$SecurityHubSettings.SecurityHubSubSetting.VIEW_SECURITY_HUB;
                if (securityHubSubSetting != null) {
                    map15.put(securityHubSubSetting, setting15);
                }
            }
        }
        this.securityHub = new AccountSettingType$SecurityHubSettings(map15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InMemoryAccountSettingsCache) && Intrinsics.areEqual(this.settingsResponse, ((InMemoryAccountSettingsCache) obj).settingsResponse);
    }

    public final int hashCode() {
        return this.settingsResponse.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("InMemoryAccountSettingsCache(settingsResponse=", ")", this.settingsResponse);
    }
}
