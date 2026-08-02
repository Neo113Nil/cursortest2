package ru.yandex.taxi.settings.main;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"ru/yandex/taxi/settings/main/MainMenuProcessor$MenuEntry", "", "Lru/yandex/taxi/settings/main/MainMenuProcessor$MenuEntry;", "", "isNeedAuthorization", "Z", "a", "()Z", "ENTER_PHONE", "USER_PHOTO", "PROFILE", "MAIL", "CREATE_SHARED_PAYMENT_GROUP", "CREATE_BUSINESS_ACCOUNT_WITHOUT_ONBORDING", "SHARED_PAYMENT_GROUP", "SHARED_PAYMENT_EXISTS_DIALOG", Card.CARD_TYPE_CREDIT_DEBIT, "ADD_CARD", "MY_ADDRESSES", "PROMOCODE", "REFERRAL", "SETTINGS", "INFO", "SUPPORT", "SUPPORT_MAIL", "PLUS_HOME", "PLUS_BURNS", "SAFETY_CENTER", "WEB_VIEW_ACTIVITY", "CHARITY", "PUSH_SETTINGS", "LANGUAGE_SETTINGS", "MAAS", "FAMILY_GROUP", "BUG_REPORT", "CURRENT_ADDRESS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainMenuProcessor$MenuEntry {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainMenuProcessor$MenuEntry[] $VALUES;
    public static final MainMenuProcessor$MenuEntry ADD_CARD;
    public static final MainMenuProcessor$MenuEntry BUG_REPORT;
    public static final MainMenuProcessor$MenuEntry CHARITY;
    public static final MainMenuProcessor$MenuEntry CREATE_BUSINESS_ACCOUNT_WITHOUT_ONBORDING;
    public static final MainMenuProcessor$MenuEntry CREATE_SHARED_PAYMENT_GROUP;
    public static final MainMenuProcessor$MenuEntry CURRENT_ADDRESS;
    public static final MainMenuProcessor$MenuEntry ENTER_PHONE;
    public static final MainMenuProcessor$MenuEntry FAMILY_GROUP;
    public static final MainMenuProcessor$MenuEntry INFO;
    public static final MainMenuProcessor$MenuEntry LANGUAGE_SETTINGS;
    public static final MainMenuProcessor$MenuEntry MAAS;
    public static final MainMenuProcessor$MenuEntry MAIL;
    public static final MainMenuProcessor$MenuEntry MY_ADDRESSES;
    public static final MainMenuProcessor$MenuEntry PAYMENT;
    public static final MainMenuProcessor$MenuEntry PLUS_BURNS;
    public static final MainMenuProcessor$MenuEntry PLUS_HOME;
    public static final MainMenuProcessor$MenuEntry PROFILE;
    public static final MainMenuProcessor$MenuEntry PROMOCODE;
    public static final MainMenuProcessor$MenuEntry PUSH_SETTINGS;
    public static final MainMenuProcessor$MenuEntry REFERRAL;
    public static final MainMenuProcessor$MenuEntry SAFETY_CENTER;
    public static final MainMenuProcessor$MenuEntry SETTINGS;
    public static final MainMenuProcessor$MenuEntry SHARED_PAYMENT_EXISTS_DIALOG;
    public static final MainMenuProcessor$MenuEntry SHARED_PAYMENT_GROUP;
    public static final MainMenuProcessor$MenuEntry SUPPORT;
    public static final MainMenuProcessor$MenuEntry SUPPORT_MAIL;
    public static final MainMenuProcessor$MenuEntry USER_PHOTO;
    public static final MainMenuProcessor$MenuEntry WEB_VIEW_ACTIVITY;
    private final boolean isNeedAuthorization;

    static {
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry = new MainMenuProcessor$MenuEntry("ENTER_PHONE", 0, true);
        ENTER_PHONE = mainMenuProcessor$MenuEntry;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry2 = new MainMenuProcessor$MenuEntry("USER_PHOTO", 1, true);
        USER_PHOTO = mainMenuProcessor$MenuEntry2;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry3 = new MainMenuProcessor$MenuEntry("PROFILE", 2, true);
        PROFILE = mainMenuProcessor$MenuEntry3;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry4 = new MainMenuProcessor$MenuEntry("MAIL", 3, true);
        MAIL = mainMenuProcessor$MenuEntry4;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry5 = new MainMenuProcessor$MenuEntry("CREATE_SHARED_PAYMENT_GROUP", 4, true);
        CREATE_SHARED_PAYMENT_GROUP = mainMenuProcessor$MenuEntry5;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry6 = new MainMenuProcessor$MenuEntry("CREATE_BUSINESS_ACCOUNT_WITHOUT_ONBORDING", 5, true);
        CREATE_BUSINESS_ACCOUNT_WITHOUT_ONBORDING = mainMenuProcessor$MenuEntry6;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry7 = new MainMenuProcessor$MenuEntry("SHARED_PAYMENT_GROUP", 6, true);
        SHARED_PAYMENT_GROUP = mainMenuProcessor$MenuEntry7;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry8 = new MainMenuProcessor$MenuEntry("SHARED_PAYMENT_EXISTS_DIALOG", 7, true);
        SHARED_PAYMENT_EXISTS_DIALOG = mainMenuProcessor$MenuEntry8;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry9 = new MainMenuProcessor$MenuEntry(Card.CARD_TYPE_CREDIT_DEBIT, 8, true);
        PAYMENT = mainMenuProcessor$MenuEntry9;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry10 = new MainMenuProcessor$MenuEntry("ADD_CARD", 9, true);
        ADD_CARD = mainMenuProcessor$MenuEntry10;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry11 = new MainMenuProcessor$MenuEntry("MY_ADDRESSES", 10, false);
        MY_ADDRESSES = mainMenuProcessor$MenuEntry11;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry12 = new MainMenuProcessor$MenuEntry("PROMOCODE", 11, true);
        PROMOCODE = mainMenuProcessor$MenuEntry12;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry13 = new MainMenuProcessor$MenuEntry("REFERRAL", 12, true);
        REFERRAL = mainMenuProcessor$MenuEntry13;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry14 = new MainMenuProcessor$MenuEntry("SETTINGS", 13, false);
        SETTINGS = mainMenuProcessor$MenuEntry14;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry15 = new MainMenuProcessor$MenuEntry("INFO", 14, false);
        INFO = mainMenuProcessor$MenuEntry15;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry16 = new MainMenuProcessor$MenuEntry("SUPPORT", 15, false);
        SUPPORT = mainMenuProcessor$MenuEntry16;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry17 = new MainMenuProcessor$MenuEntry("SUPPORT_MAIL", 16, false);
        SUPPORT_MAIL = mainMenuProcessor$MenuEntry17;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry18 = new MainMenuProcessor$MenuEntry("PLUS_HOME", 17, false);
        PLUS_HOME = mainMenuProcessor$MenuEntry18;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry19 = new MainMenuProcessor$MenuEntry("PLUS_BURNS", 18, false);
        PLUS_BURNS = mainMenuProcessor$MenuEntry19;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry20 = new MainMenuProcessor$MenuEntry("SAFETY_CENTER", 19, true);
        SAFETY_CENTER = mainMenuProcessor$MenuEntry20;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry21 = new MainMenuProcessor$MenuEntry("WEB_VIEW_ACTIVITY", 20, false);
        WEB_VIEW_ACTIVITY = mainMenuProcessor$MenuEntry21;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry22 = new MainMenuProcessor$MenuEntry("CHARITY", 21, false);
        CHARITY = mainMenuProcessor$MenuEntry22;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry23 = new MainMenuProcessor$MenuEntry("PUSH_SETTINGS", 22, false);
        PUSH_SETTINGS = mainMenuProcessor$MenuEntry23;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry24 = new MainMenuProcessor$MenuEntry("LANGUAGE_SETTINGS", 23, false);
        LANGUAGE_SETTINGS = mainMenuProcessor$MenuEntry24;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry25 = new MainMenuProcessor$MenuEntry("MAAS", 24, false);
        MAAS = mainMenuProcessor$MenuEntry25;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry26 = new MainMenuProcessor$MenuEntry("FAMILY_GROUP", 25, true);
        FAMILY_GROUP = mainMenuProcessor$MenuEntry26;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry27 = new MainMenuProcessor$MenuEntry("BUG_REPORT", 26, true);
        BUG_REPORT = mainMenuProcessor$MenuEntry27;
        MainMenuProcessor$MenuEntry mainMenuProcessor$MenuEntry28 = new MainMenuProcessor$MenuEntry("CURRENT_ADDRESS", 27, true);
        CURRENT_ADDRESS = mainMenuProcessor$MenuEntry28;
        MainMenuProcessor$MenuEntry[] mainMenuProcessor$MenuEntryArr = {mainMenuProcessor$MenuEntry, mainMenuProcessor$MenuEntry2, mainMenuProcessor$MenuEntry3, mainMenuProcessor$MenuEntry4, mainMenuProcessor$MenuEntry5, mainMenuProcessor$MenuEntry6, mainMenuProcessor$MenuEntry7, mainMenuProcessor$MenuEntry8, mainMenuProcessor$MenuEntry9, mainMenuProcessor$MenuEntry10, mainMenuProcessor$MenuEntry11, mainMenuProcessor$MenuEntry12, mainMenuProcessor$MenuEntry13, mainMenuProcessor$MenuEntry14, mainMenuProcessor$MenuEntry15, mainMenuProcessor$MenuEntry16, mainMenuProcessor$MenuEntry17, mainMenuProcessor$MenuEntry18, mainMenuProcessor$MenuEntry19, mainMenuProcessor$MenuEntry20, mainMenuProcessor$MenuEntry21, mainMenuProcessor$MenuEntry22, mainMenuProcessor$MenuEntry23, mainMenuProcessor$MenuEntry24, mainMenuProcessor$MenuEntry25, mainMenuProcessor$MenuEntry26, mainMenuProcessor$MenuEntry27, mainMenuProcessor$MenuEntry28};
        $VALUES = mainMenuProcessor$MenuEntryArr;
        $ENTRIES = kotlin.enums.a.a(mainMenuProcessor$MenuEntryArr);
    }

    public MainMenuProcessor$MenuEntry(String str, int i, boolean z) {
        this.isNeedAuthorization = z;
    }

    public static MainMenuProcessor$MenuEntry valueOf(String str) {
        return (MainMenuProcessor$MenuEntry) Enum.valueOf(MainMenuProcessor$MenuEntry.class, str);
    }

    public static MainMenuProcessor$MenuEntry[] values() {
        return (MainMenuProcessor$MenuEntry[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsNeedAuthorization() {
        return this.isNeedAuthorization;
    }
}
