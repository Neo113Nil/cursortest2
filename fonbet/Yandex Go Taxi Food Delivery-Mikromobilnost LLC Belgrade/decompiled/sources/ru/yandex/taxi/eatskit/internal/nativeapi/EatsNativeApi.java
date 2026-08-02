package ru.yandex.taxi.eatskit.internal.nativeapi;

import android.webkit.JavascriptInterface;
import defpackage.bj7;
import defpackage.cj7;
import defpackage.dr0;
import defpackage.dzm;
import defpackage.ex0;
import defpackage.f8o;
import defpackage.iti0;
import defpackage.jen;
import defpackage.k4o;
import defpackage.ken;
import defpackage.l0t;
import defpackage.ljo;
import defpackage.nen;
import defpackage.p32;
import defpackage.qke;
import defpackage.qq90;
import defpackage.r7b;
import defpackage.rme;
import defpackage.rnc;
import defpackage.rzd;
import defpackage.s250;
import defpackage.vmx;
import defpackage.w511;
import defpackage.w6a0;
import defpackage.x3;
import defpackage.xby;
import defpackage.z5;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.enums.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.eatskit.dto.ServicePromo;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001:\u0003\u0002*0B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0013J\u001b\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u0013J\u0019\u0010\u001b\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001b\u0010\u0019J!\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u0019J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020%H\u0004¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/¨\u00061"}, d2 = {"Lru/yandex/taxi/eatskit/internal/nativeapi/EatsNativeApi;", "Lru/yandex/taxi/eatskit/internal/nativeapi/NativeApi;", "Lken;", "callback", "", "Lcj7;", "methods", "<init>", "(Lken;Ljava/util/List;)V", "", "json", "", "requestGeoPoint", "(Ljava/lang/String;)Ljava/lang/Object;", "requestPaymentMethodUpdate", "requestPaymentMethods", "confirmGeoPoint", "Lzy11;", "requestHideAddress", "()V", "requestShowAddress", "disableSwipe", "enableSwipe", "onWebViewReady", "onWebViewLoadError", "(Ljava/lang/String;)V", "requestHideWebView", "requestReload", "url", "", "shouldOpenInSystemBrowser", "requestOpenUri", "(Ljava/lang/String;Z)V", "sendAnalyticsEvent", "requestAuthorization", "openMessengerChat", "upgradePhonishAccount", "Lrzd;", ConfigConstants.CONFIG, "Ls250;", "handleConfig", "(Lrzd;)Ls250;", "Lnen;", "eatsConfig", "(Lrzd;)Lnen;", "supportNativeAddressPicker", "()Z", "Lken;", "EatsCallMethod", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class EatsNativeApi extends NativeApi {
    private final ken callback;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\bJ\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bL¨\u0006M"}, d2 = {"Lru/yandex/taxi/eatskit/internal/nativeapi/EatsNativeApi$EatsCallMethod;", "Lbj7;", "", "", "methodName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "REQUEST_STORIES", "OPEN_STORIES", "SEND_ADJUST_EVENT", "OPEN_SUPPORT", "OPEN_TRACKING_ON_MAP", "SAVE_CONTEXT", "GET_CONTEXT", "REQUEST_CURRENT_POSITION", "OPEN_APPLICATION_MENU", "REQUEST_REVIEW", "REQUEST_CONTACT", "ADD_CARD", "REQUEST_GOOGLE_PAY_TOKEN", "IS_GOOGLE_PAY_SUPPORTED", "ON_SUCCESS_ORDER", "OPEN_PLUS", "SET_ORDER_CLOSED", "OPEN_CHARITY", "OPEN_KEYBOARD", "ON_CART_UPDATED", "OPEN_ORDER_DETAILS", "OPEN_CARD_SCANNER", "OPEN_3DS", "SHARE_TEXT", "SHARE_IMAGE_LIST", "SET_STATUS_BAR_SETTINGS", "INSTALLED_APPLICATIONS", "REQUEST_GOOGLE_PAY_TOKEN_V2", "HAS_BOUND_CARDS_IN_GOOGLE_PAY", "CHECK_LOCATION_AVAILABILITY", "REQUEST_LOCATION_AVAILABILITY", "OPEN_APPLICATION_SETTINGS", "TRIGGER_HAPTIC", "OPEN_BANK", "GET_BANK_STATE", "CHECK_PAYMENT", "OPEN_CHECKOUT_FOR_SHOP_IN_SHOP", "OPEN_MARKET_CHECKOUT_OFFER", "SET_SCREEN_CAPTURE_AVAILABILITY", "WEB_VIEW_READY_FROM_CACHE", "OPEN_MESSENGER_CHAT", "CLOSE_MESSENGER_CHAT", "OBSERVE_CHAT_UNSEEN_MESSAGES_COUNT", "REFRESH_AUTH_TOKEN_AND_LOAD_URL", "OPEN_EXTERNAL_WEB_VIEW", "CLOSE_EXTERNAL_WEB_VIEW", "GET_PAY_LATER_ACCOUNT", "OPEN_PAY_LATER", "GET_PAY_LATER_PAYMENT_INFO", "IS_USER_ACCOUNT_PHONISH", "REQUEST_INSETS", "OPEN_IN_APP_CALLS", "REQUEST_LOGOUT", "REQUEST_OAUTH_TOKEN", "ENDPOINT_DESCRIPTION", "SET_THEME", "REQUEST_CONTEXT", "REQUEST_KEY_POINTS_TIMESTAMP", "TOGGLE_ITEM_LIKE", "REQUEST_NAVIGATE_TO", "REQUEST_NAVIGATE_BACK", "GET_PERMISSIONS", "REQUEST_PERMISSIONS", "CHECK_BLUETOOTH_STATE", "REQUEST_BLUETOOTH_ENABLE", "CONNECT_TO_COURIER", "START_ORDER_VERIFICATION", "START_COURIER_VERIFICATION", "SEND_VERIFICATION_RESULT_TO_COURIER", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class EatsCallMethod implements bj7 {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EatsCallMethod[] $VALUES;
        public static final EatsCallMethod ADD_CARD;
        public static final EatsCallMethod CHECK_BLUETOOTH_STATE;
        public static final EatsCallMethod CHECK_LOCATION_AVAILABILITY;
        public static final EatsCallMethod CHECK_PAYMENT;
        public static final EatsCallMethod CLOSE_EXTERNAL_WEB_VIEW;
        public static final EatsCallMethod CLOSE_MESSENGER_CHAT;
        public static final EatsCallMethod CONNECT_TO_COURIER;
        public static final EatsCallMethod ENDPOINT_DESCRIPTION;
        public static final EatsCallMethod GET_BANK_STATE;
        public static final EatsCallMethod GET_CONTEXT;
        public static final EatsCallMethod GET_PAY_LATER_ACCOUNT;
        public static final EatsCallMethod GET_PAY_LATER_PAYMENT_INFO;
        public static final EatsCallMethod GET_PERMISSIONS;
        public static final EatsCallMethod HAS_BOUND_CARDS_IN_GOOGLE_PAY;
        public static final EatsCallMethod INSTALLED_APPLICATIONS;
        public static final EatsCallMethod IS_GOOGLE_PAY_SUPPORTED;
        public static final EatsCallMethod IS_USER_ACCOUNT_PHONISH;
        public static final EatsCallMethod OBSERVE_CHAT_UNSEEN_MESSAGES_COUNT;
        public static final EatsCallMethod ON_CART_UPDATED;
        public static final EatsCallMethod ON_SUCCESS_ORDER;
        public static final EatsCallMethod OPEN_3DS;
        public static final EatsCallMethod OPEN_APPLICATION_MENU;
        public static final EatsCallMethod OPEN_APPLICATION_SETTINGS;
        public static final EatsCallMethod OPEN_BANK;
        public static final EatsCallMethod OPEN_CARD_SCANNER;
        public static final EatsCallMethod OPEN_CHARITY;
        public static final EatsCallMethod OPEN_CHECKOUT_FOR_SHOP_IN_SHOP;
        public static final EatsCallMethod OPEN_EXTERNAL_WEB_VIEW;
        public static final EatsCallMethod OPEN_IN_APP_CALLS;
        public static final EatsCallMethod OPEN_KEYBOARD;
        public static final EatsCallMethod OPEN_MARKET_CHECKOUT_OFFER;
        public static final EatsCallMethod OPEN_MESSENGER_CHAT;
        public static final EatsCallMethod OPEN_ORDER_DETAILS;
        public static final EatsCallMethod OPEN_PAY_LATER;
        public static final EatsCallMethod OPEN_PLUS;
        public static final EatsCallMethod OPEN_STORIES;
        public static final EatsCallMethod OPEN_SUPPORT;
        public static final EatsCallMethod OPEN_TRACKING_ON_MAP;
        public static final EatsCallMethod REFRESH_AUTH_TOKEN_AND_LOAD_URL;
        public static final EatsCallMethod REQUEST_BLUETOOTH_ENABLE;
        public static final EatsCallMethod REQUEST_CONTACT;
        public static final EatsCallMethod REQUEST_CONTEXT;
        public static final EatsCallMethod REQUEST_CURRENT_POSITION;
        public static final EatsCallMethod REQUEST_GOOGLE_PAY_TOKEN;
        public static final EatsCallMethod REQUEST_GOOGLE_PAY_TOKEN_V2;
        public static final EatsCallMethod REQUEST_INSETS;
        public static final EatsCallMethod REQUEST_KEY_POINTS_TIMESTAMP;
        public static final EatsCallMethod REQUEST_LOCATION_AVAILABILITY;
        public static final EatsCallMethod REQUEST_LOGOUT;
        public static final EatsCallMethod REQUEST_NAVIGATE_BACK;
        public static final EatsCallMethod REQUEST_NAVIGATE_TO;
        public static final EatsCallMethod REQUEST_OAUTH_TOKEN;
        public static final EatsCallMethod REQUEST_PERMISSIONS;
        public static final EatsCallMethod REQUEST_REVIEW;
        public static final EatsCallMethod REQUEST_STORIES;
        public static final EatsCallMethod SAVE_CONTEXT;
        public static final EatsCallMethod SEND_ADJUST_EVENT;
        public static final EatsCallMethod SEND_VERIFICATION_RESULT_TO_COURIER;
        public static final EatsCallMethod SET_ORDER_CLOSED;
        public static final EatsCallMethod SET_SCREEN_CAPTURE_AVAILABILITY;
        public static final EatsCallMethod SET_STATUS_BAR_SETTINGS;
        public static final EatsCallMethod SET_THEME;
        public static final EatsCallMethod SHARE_IMAGE_LIST;
        public static final EatsCallMethod SHARE_TEXT;
        public static final EatsCallMethod START_COURIER_VERIFICATION;
        public static final EatsCallMethod START_ORDER_VERIFICATION;
        public static final EatsCallMethod TOGGLE_ITEM_LIKE;
        public static final EatsCallMethod TRIGGER_HAPTIC;
        public static final EatsCallMethod WEB_VIEW_READY_FROM_CACHE;
        private final String methodName;

        static {
            EatsCallMethod eatsCallMethod = new EatsCallMethod("REQUEST_STORIES", 0, "requestStoriesV2");
            REQUEST_STORIES = eatsCallMethod;
            EatsCallMethod eatsCallMethod2 = new EatsCallMethod("OPEN_STORIES", 1, "openStoriesV2");
            OPEN_STORIES = eatsCallMethod2;
            EatsCallMethod eatsCallMethod3 = new EatsCallMethod("SEND_ADJUST_EVENT", 2, "sendAdjustEvent");
            SEND_ADJUST_EVENT = eatsCallMethod3;
            EatsCallMethod eatsCallMethod4 = new EatsCallMethod("OPEN_SUPPORT", 3, "openSupport");
            OPEN_SUPPORT = eatsCallMethod4;
            EatsCallMethod eatsCallMethod5 = new EatsCallMethod("OPEN_TRACKING_ON_MAP", 4, "openTrackingOnMap");
            OPEN_TRACKING_ON_MAP = eatsCallMethod5;
            EatsCallMethod eatsCallMethod6 = new EatsCallMethod("SAVE_CONTEXT", 5, "saveContext");
            SAVE_CONTEXT = eatsCallMethod6;
            EatsCallMethod eatsCallMethod7 = new EatsCallMethod("GET_CONTEXT", 6, "getContext");
            GET_CONTEXT = eatsCallMethod7;
            EatsCallMethod eatsCallMethod8 = new EatsCallMethod("REQUEST_CURRENT_POSITION", 7, "requestCurrentPosition");
            REQUEST_CURRENT_POSITION = eatsCallMethod8;
            EatsCallMethod eatsCallMethod9 = new EatsCallMethod("OPEN_APPLICATION_MENU", 8, "openApplicationMenu");
            OPEN_APPLICATION_MENU = eatsCallMethod9;
            EatsCallMethod eatsCallMethod10 = new EatsCallMethod("REQUEST_REVIEW", 9, "requestReview");
            REQUEST_REVIEW = eatsCallMethod10;
            EatsCallMethod eatsCallMethod11 = new EatsCallMethod("REQUEST_CONTACT", 10, "requestContact");
            REQUEST_CONTACT = eatsCallMethod11;
            EatsCallMethod eatsCallMethod12 = new EatsCallMethod("ADD_CARD", 11, "addCard");
            ADD_CARD = eatsCallMethod12;
            EatsCallMethod eatsCallMethod13 = new EatsCallMethod("REQUEST_GOOGLE_PAY_TOKEN", 12, "requestGooglePayToken");
            REQUEST_GOOGLE_PAY_TOKEN = eatsCallMethod13;
            EatsCallMethod eatsCallMethod14 = new EatsCallMethod("IS_GOOGLE_PAY_SUPPORTED", 13, "isGooglePaySupported");
            IS_GOOGLE_PAY_SUPPORTED = eatsCallMethod14;
            EatsCallMethod eatsCallMethod15 = new EatsCallMethod("ON_SUCCESS_ORDER", 14, "onSuccessOrder");
            ON_SUCCESS_ORDER = eatsCallMethod15;
            EatsCallMethod eatsCallMethod16 = new EatsCallMethod("OPEN_PLUS", 15, "openPlusHome");
            OPEN_PLUS = eatsCallMethod16;
            EatsCallMethod eatsCallMethod17 = new EatsCallMethod("SET_ORDER_CLOSED", 16, "setOrderClosed");
            SET_ORDER_CLOSED = eatsCallMethod17;
            EatsCallMethod eatsCallMethod18 = new EatsCallMethod("OPEN_CHARITY", 17, "openCharity");
            OPEN_CHARITY = eatsCallMethod18;
            EatsCallMethod eatsCallMethod19 = new EatsCallMethod("OPEN_KEYBOARD", 18, "requestOpenKeyboard");
            OPEN_KEYBOARD = eatsCallMethod19;
            EatsCallMethod eatsCallMethod20 = new EatsCallMethod("ON_CART_UPDATED", 19, "onCartUpdated");
            ON_CART_UPDATED = eatsCallMethod20;
            EatsCallMethod eatsCallMethod21 = new EatsCallMethod("OPEN_ORDER_DETAILS", 20, "openOrderDetails");
            OPEN_ORDER_DETAILS = eatsCallMethod21;
            EatsCallMethod eatsCallMethod22 = new EatsCallMethod("OPEN_CARD_SCANNER", 21, "requestCardScanner");
            OPEN_CARD_SCANNER = eatsCallMethod22;
            EatsCallMethod eatsCallMethod23 = new EatsCallMethod("OPEN_3DS", 22, "requestOpen3ds");
            OPEN_3DS = eatsCallMethod23;
            EatsCallMethod eatsCallMethod24 = new EatsCallMethod("SHARE_TEXT", 23, "shareText");
            SHARE_TEXT = eatsCallMethod24;
            EatsCallMethod eatsCallMethod25 = new EatsCallMethod("SHARE_IMAGE_LIST", 24, "shareImageList");
            SHARE_IMAGE_LIST = eatsCallMethod25;
            EatsCallMethod eatsCallMethod26 = new EatsCallMethod("SET_STATUS_BAR_SETTINGS", 25, "setStatusBarSettings");
            SET_STATUS_BAR_SETTINGS = eatsCallMethod26;
            EatsCallMethod eatsCallMethod27 = new EatsCallMethod("INSTALLED_APPLICATIONS", 26, "installedApplications");
            INSTALLED_APPLICATIONS = eatsCallMethod27;
            EatsCallMethod eatsCallMethod28 = new EatsCallMethod("REQUEST_GOOGLE_PAY_TOKEN_V2", 27, "requestGooglePayToken_V2");
            REQUEST_GOOGLE_PAY_TOKEN_V2 = eatsCallMethod28;
            EatsCallMethod eatsCallMethod29 = new EatsCallMethod("HAS_BOUND_CARDS_IN_GOOGLE_PAY", 28, "hasBoundCardsInGooglePay");
            HAS_BOUND_CARDS_IN_GOOGLE_PAY = eatsCallMethod29;
            EatsCallMethod eatsCallMethod30 = new EatsCallMethod("CHECK_LOCATION_AVAILABILITY", 29, "checkLocationAvailability");
            CHECK_LOCATION_AVAILABILITY = eatsCallMethod30;
            EatsCallMethod eatsCallMethod31 = new EatsCallMethod("REQUEST_LOCATION_AVAILABILITY", 30, "requestLocationAvailability");
            REQUEST_LOCATION_AVAILABILITY = eatsCallMethod31;
            EatsCallMethod eatsCallMethod32 = new EatsCallMethod("OPEN_APPLICATION_SETTINGS", 31, "openApplicationSettings");
            OPEN_APPLICATION_SETTINGS = eatsCallMethod32;
            EatsCallMethod eatsCallMethod33 = new EatsCallMethod("TRIGGER_HAPTIC", 32, "triggerHaptic");
            TRIGGER_HAPTIC = eatsCallMethod33;
            EatsCallMethod eatsCallMethod34 = new EatsCallMethod("OPEN_BANK", 33, "openBank");
            OPEN_BANK = eatsCallMethod34;
            EatsCallMethod eatsCallMethod35 = new EatsCallMethod("GET_BANK_STATE", 34, "getBankState");
            GET_BANK_STATE = eatsCallMethod35;
            EatsCallMethod eatsCallMethod36 = new EatsCallMethod("CHECK_PAYMENT", 35, "checkPayment");
            CHECK_PAYMENT = eatsCallMethod36;
            EatsCallMethod eatsCallMethod37 = new EatsCallMethod("OPEN_CHECKOUT_FOR_SHOP_IN_SHOP", 36, "openCheckoutForShopInShop");
            OPEN_CHECKOUT_FOR_SHOP_IN_SHOP = eatsCallMethod37;
            EatsCallMethod eatsCallMethod38 = new EatsCallMethod("OPEN_MARKET_CHECKOUT_OFFER", 37, "openCheckoutOffer");
            OPEN_MARKET_CHECKOUT_OFFER = eatsCallMethod38;
            EatsCallMethod eatsCallMethod39 = new EatsCallMethod("SET_SCREEN_CAPTURE_AVAILABILITY", 38, "setScreenCaptureAvailability");
            SET_SCREEN_CAPTURE_AVAILABILITY = eatsCallMethod39;
            EatsCallMethod eatsCallMethod40 = new EatsCallMethod("WEB_VIEW_READY_FROM_CACHE", 39, "onWebViewReadyFromCache");
            WEB_VIEW_READY_FROM_CACHE = eatsCallMethod40;
            EatsCallMethod eatsCallMethod41 = new EatsCallMethod("OPEN_MESSENGER_CHAT", 40, "openMessengerChat");
            OPEN_MESSENGER_CHAT = eatsCallMethod41;
            EatsCallMethod eatsCallMethod42 = new EatsCallMethod("CLOSE_MESSENGER_CHAT", 41, "closeMessengerChat");
            CLOSE_MESSENGER_CHAT = eatsCallMethod42;
            EatsCallMethod eatsCallMethod43 = new EatsCallMethod("OBSERVE_CHAT_UNSEEN_MESSAGES_COUNT", 42, "beginObservingChatUnseenCount");
            OBSERVE_CHAT_UNSEEN_MESSAGES_COUNT = eatsCallMethod43;
            EatsCallMethod eatsCallMethod44 = new EatsCallMethod("REFRESH_AUTH_TOKEN_AND_LOAD_URL", 43, "refreshAuthTokenAndLoadUrl");
            REFRESH_AUTH_TOKEN_AND_LOAD_URL = eatsCallMethod44;
            EatsCallMethod eatsCallMethod45 = new EatsCallMethod("OPEN_EXTERNAL_WEB_VIEW", 44, "openExternalWebView");
            OPEN_EXTERNAL_WEB_VIEW = eatsCallMethod45;
            EatsCallMethod eatsCallMethod46 = new EatsCallMethod("CLOSE_EXTERNAL_WEB_VIEW", 45, "closeExternalWebView");
            CLOSE_EXTERNAL_WEB_VIEW = eatsCallMethod46;
            EatsCallMethod eatsCallMethod47 = new EatsCallMethod("GET_PAY_LATER_ACCOUNT", 46, "getPayLaterAccount");
            GET_PAY_LATER_ACCOUNT = eatsCallMethod47;
            EatsCallMethod eatsCallMethod48 = new EatsCallMethod("OPEN_PAY_LATER", 47, "openPayLater");
            OPEN_PAY_LATER = eatsCallMethod48;
            EatsCallMethod eatsCallMethod49 = new EatsCallMethod("GET_PAY_LATER_PAYMENT_INFO", 48, "getPayLaterPaymentInfo");
            GET_PAY_LATER_PAYMENT_INFO = eatsCallMethod49;
            EatsCallMethod eatsCallMethod50 = new EatsCallMethod("IS_USER_ACCOUNT_PHONISH", 49, "isUserAccountPhonish");
            IS_USER_ACCOUNT_PHONISH = eatsCallMethod50;
            EatsCallMethod eatsCallMethod51 = new EatsCallMethod("REQUEST_INSETS", 50, "requestInsets");
            REQUEST_INSETS = eatsCallMethod51;
            EatsCallMethod eatsCallMethod52 = new EatsCallMethod("OPEN_IN_APP_CALLS", 51, "openOutgoingPhoneCall");
            OPEN_IN_APP_CALLS = eatsCallMethod52;
            EatsCallMethod eatsCallMethod53 = new EatsCallMethod("REQUEST_LOGOUT", 52, "logout");
            REQUEST_LOGOUT = eatsCallMethod53;
            EatsCallMethod eatsCallMethod54 = new EatsCallMethod("REQUEST_OAUTH_TOKEN", 53, "requestOAuthToken");
            REQUEST_OAUTH_TOKEN = eatsCallMethod54;
            EatsCallMethod eatsCallMethod55 = new EatsCallMethod("ENDPOINT_DESCRIPTION", 54, "getEndpointDescription");
            ENDPOINT_DESCRIPTION = eatsCallMethod55;
            EatsCallMethod eatsCallMethod56 = new EatsCallMethod("SET_THEME", 55, "setTheme");
            SET_THEME = eatsCallMethod56;
            EatsCallMethod eatsCallMethod57 = new EatsCallMethod("REQUEST_CONTEXT", 56, "requestContext");
            REQUEST_CONTEXT = eatsCallMethod57;
            EatsCallMethod eatsCallMethod58 = new EatsCallMethod("REQUEST_KEY_POINTS_TIMESTAMP", 57, "requestKeyPointsTimestamp");
            REQUEST_KEY_POINTS_TIMESTAMP = eatsCallMethod58;
            EatsCallMethod eatsCallMethod59 = new EatsCallMethod("TOGGLE_ITEM_LIKE", 58, "toggleItemLike");
            TOGGLE_ITEM_LIKE = eatsCallMethod59;
            EatsCallMethod eatsCallMethod60 = new EatsCallMethod("REQUEST_NAVIGATE_TO", 59, "requestNavigateTo");
            REQUEST_NAVIGATE_TO = eatsCallMethod60;
            EatsCallMethod eatsCallMethod61 = new EatsCallMethod("REQUEST_NAVIGATE_BACK", 60, "requestNavigateBack");
            REQUEST_NAVIGATE_BACK = eatsCallMethod61;
            EatsCallMethod eatsCallMethod62 = new EatsCallMethod("GET_PERMISSIONS", 61, "getPermissions");
            GET_PERMISSIONS = eatsCallMethod62;
            EatsCallMethod eatsCallMethod63 = new EatsCallMethod("REQUEST_PERMISSIONS", 62, "requestPermissions");
            REQUEST_PERMISSIONS = eatsCallMethod63;
            EatsCallMethod eatsCallMethod64 = new EatsCallMethod("CHECK_BLUETOOTH_STATE", 63, "checkBluetoothState");
            CHECK_BLUETOOTH_STATE = eatsCallMethod64;
            EatsCallMethod eatsCallMethod65 = new EatsCallMethod("REQUEST_BLUETOOTH_ENABLE", 64, "requestBluetoothEnable");
            REQUEST_BLUETOOTH_ENABLE = eatsCallMethod65;
            EatsCallMethod eatsCallMethod66 = new EatsCallMethod("CONNECT_TO_COURIER", 65, "connectToCourier");
            CONNECT_TO_COURIER = eatsCallMethod66;
            EatsCallMethod eatsCallMethod67 = new EatsCallMethod("START_ORDER_VERIFICATION", 66, "startOrderVerification");
            START_ORDER_VERIFICATION = eatsCallMethod67;
            EatsCallMethod eatsCallMethod68 = new EatsCallMethod("START_COURIER_VERIFICATION", 67, "startCourierVerification");
            START_COURIER_VERIFICATION = eatsCallMethod68;
            EatsCallMethod eatsCallMethod69 = new EatsCallMethod("SEND_VERIFICATION_RESULT_TO_COURIER", 68, "sendVerificationResultToCourier");
            SEND_VERIFICATION_RESULT_TO_COURIER = eatsCallMethod69;
            EatsCallMethod[] eatsCallMethodArr = {eatsCallMethod, eatsCallMethod2, eatsCallMethod3, eatsCallMethod4, eatsCallMethod5, eatsCallMethod6, eatsCallMethod7, eatsCallMethod8, eatsCallMethod9, eatsCallMethod10, eatsCallMethod11, eatsCallMethod12, eatsCallMethod13, eatsCallMethod14, eatsCallMethod15, eatsCallMethod16, eatsCallMethod17, eatsCallMethod18, eatsCallMethod19, eatsCallMethod20, eatsCallMethod21, eatsCallMethod22, eatsCallMethod23, eatsCallMethod24, eatsCallMethod25, eatsCallMethod26, eatsCallMethod27, eatsCallMethod28, eatsCallMethod29, eatsCallMethod30, eatsCallMethod31, eatsCallMethod32, eatsCallMethod33, eatsCallMethod34, eatsCallMethod35, eatsCallMethod36, eatsCallMethod37, eatsCallMethod38, eatsCallMethod39, eatsCallMethod40, eatsCallMethod41, eatsCallMethod42, eatsCallMethod43, eatsCallMethod44, eatsCallMethod45, eatsCallMethod46, eatsCallMethod47, eatsCallMethod48, eatsCallMethod49, eatsCallMethod50, eatsCallMethod51, eatsCallMethod52, eatsCallMethod53, eatsCallMethod54, eatsCallMethod55, eatsCallMethod56, eatsCallMethod57, eatsCallMethod58, eatsCallMethod59, eatsCallMethod60, eatsCallMethod61, eatsCallMethod62, eatsCallMethod63, eatsCallMethod64, eatsCallMethod65, eatsCallMethod66, eatsCallMethod67, eatsCallMethod68, eatsCallMethod69};
            $VALUES = eatsCallMethodArr;
            $ENTRIES = a.a(eatsCallMethodArr);
        }

        public EatsCallMethod(String str, int i, String str2) {
            this.methodName = str2;
        }

        public static EatsCallMethod valueOf(String str) {
            return (EatsCallMethod) Enum.valueOf(EatsCallMethod.class, str);
        }

        public static EatsCallMethod[] values() {
            return (EatsCallMethod[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getMethodName() {
            return this.methodName;
        }
    }

    public EatsNativeApi(ken kenVar, List<cj7> list) {
        super(kenVar, list);
        this.callback = kenVar;
    }

    public static /* synthetic */ void onWebViewLoadError$default(EatsNativeApi eatsNativeApi, String str, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: onWebViewLoadError");
            return;
        }
        if ((i & 1) != 0) {
            str = "{}";
        }
        eatsNativeApi.onWebViewLoadError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onWebViewLoadError$lambda$0(EatsNativeApi eatsNativeApi, f8o f8oVar) {
        eatsNativeApi.handleOnWebViewLoadError(f8oVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 requestHideAddress$lambda$0(EatsNativeApi eatsNativeApi) {
        return zy11.a;
    }

    public static /* synthetic */ void requestOpenUri$default(EatsNativeApi eatsNativeApi, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: requestOpenUri");
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        eatsNativeApi.requestOpenUri(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 requestOpenUri$lambda$0(EatsNativeApi eatsNativeApi, String str, boolean z) {
        ((rnc) ((rme) ((x3) eatsNativeApi.callback).b).b.a).k(str, z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 requestReload$lambda$0(EatsNativeApi eatsNativeApi) {
        rme rmeVar = (rme) ((x3) eatsNativeApi.callback).b;
        rmeVar.e = null;
        rmeVar.r(null, false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 requestShowAddress$lambda$0(EatsNativeApi eatsNativeApi) {
        return zy11.a;
    }

    private final boolean supportNativeAddressPicker() {
        return ((dr0) ((ru.yandex.taxi.eatskit.a) this.callback).c.o.w.get(dr0.class)) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmGeoPoint(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        EatsNativeApi$confirmGeoPoint$1 eatsNativeApi$confirmGeoPoint$1 = new EatsNativeApi$confirmGeoPoint$1(1, this.callback, ken.class, "confirmGeoPoint", "confirmGeoPoint(Lru/yandex/taxi/eatskit/dto/GeoPositionWithSource;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(l0t.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method confirmGeoPoint");
                return ljo.b(a);
            }
            if (!(obj instanceof Result.Failure)) {
                executeMethodOnMainThread("confirmGeoPoint", new z5(17, eatsNativeApi$confirmGeoPoint$1, obj));
            }
            return zy11.a;
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    @JavascriptInterface
    public final void disableSwipe() {
        handleDisableSwipe();
    }

    public final nen eatsConfig(rzd config) {
        List a = super.handleConfig(config).a();
        ServicePromo servicePromo = ((ru.yandex.taxi.eatskit.a) this.callback).c.g().e;
        boolean supportNativeAddressPicker = supportNativeAddressPicker();
        ((ru.yandex.taxi.eatskit.a) this.callback).c.g();
        return new nen(a, servicePromo, supportNativeAddressPicker);
    }

    @JavascriptInterface
    public final void enableSwipe() {
        handleEnableSwipe();
    }

    @Override // ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi
    public s250 handleConfig(rzd config) {
        super.handleConfig(config);
        return eatsConfig(config);
    }

    @JavascriptInterface
    public final void onWebViewLoadError(String json2) {
        Object failure;
        if (json2 == null || json2.length() == 0) {
            handleOnWebViewLoadError(null);
            return;
        }
        dzm dzmVar = new dzm(5, this);
        xby.d.getClass();
        if (json2.length() == 0) {
            failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        } else {
            try {
                failure = vmx.a.a().b(f8o.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method onWebViewLoadError");
            ljo.b(a);
        } else {
            if (failure instanceof Result.Failure) {
                return;
            }
            executeMethodOnMainThread("onWebViewLoadError", new z5(17, dzmVar, failure));
        }
    }

    @JavascriptInterface
    public final void onWebViewReady() {
        handleOnWebViewReady();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void openMessengerChat(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        EatsNativeApi$openMessengerChat$1 eatsNativeApi$openMessengerChat$1 = new EatsNativeApi$openMessengerChat$1(1, this.callback, ken.class, "requestOpenChat", "requestOpenChat(Lru/yandex/taxi/eatskit/dto/ChatParams;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(r7b.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method openMessengerChat");
                ljo.b(a);
                return;
            } else {
                if (obj instanceof Result.Failure) {
                    return;
                }
                executeMethodOnMainThread("openMessengerChat", new z5(17, eatsNativeApi$openMessengerChat$1, obj));
                return;
            }
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void requestAuthorization(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        EatsNativeApi$requestAuthorization$1 eatsNativeApi$requestAuthorization$1 = new EatsNativeApi$requestAuthorization$1(1, this.callback, ken.class, "requestAuthorization", "requestAuthorization(Lru/yandex/taxi/eatskit/dto/Path;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(qq90.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method requestAuthorization");
                ljo.b(a);
                return;
            } else {
                if (obj instanceof Result.Failure) {
                    return;
                }
                executeMethodOnMainThread("requestAuthorization", new z5(17, eatsNativeApi$requestAuthorization$1, obj));
                return;
            }
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestGeoPoint(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        EatsNativeApi$requestGeoPoint$1 eatsNativeApi$requestGeoPoint$1 = new EatsNativeApi$requestGeoPoint$1(1, this.callback, ken.class, "providePosition", "providePosition(Lru/yandex/taxi/eatskit/dto/GeoPositionWithSource;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(l0t.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method requestGeoPoint");
                return ljo.b(a);
            }
            if (!(obj instanceof Result.Failure)) {
                executeMethodOnMainThread("requestGeoPoint", new z5(17, eatsNativeApi$requestGeoPoint$1, obj));
            }
            return zy11.a;
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    @JavascriptInterface
    public final void requestHideAddress() {
        runMethod("requestHideAddress", new jen(this, 1));
    }

    @JavascriptInterface
    public final void requestHideWebView() {
        handleRequestHideWebView();
    }

    @JavascriptInterface
    public final void requestOpenUri(String url, boolean shouldOpenInSystemBrowser) {
        runMethod("requestOpenUri", new ex0(this, url, shouldOpenInSystemBrowser, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPaymentMethodUpdate(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        EatsNativeApi$requestPaymentMethodUpdate$1 eatsNativeApi$requestPaymentMethodUpdate$1 = new EatsNativeApi$requestPaymentMethodUpdate$1(1, this.callback, ken.class, "requestPaymentMethodUpdate", "requestPaymentMethodUpdate(Lru/yandex/taxi/eatskit/dto/PaymentMethodRequest;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(w6a0.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method requestPaymentMethodUpdate");
                return ljo.b(a);
            }
            if (!(obj instanceof Result.Failure)) {
                executeMethodOnMainThread("requestPaymentMethodUpdate", new z5(17, eatsNativeApi$requestPaymentMethodUpdate$1, obj));
            }
            return zy11.a;
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPaymentMethods(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        EatsNativeApi$requestPaymentMethods$1 eatsNativeApi$requestPaymentMethods$1 = new EatsNativeApi$requestPaymentMethods$1(1, this.callback, ken.class, "requestPaymentMethods", "requestPaymentMethods(Lru/yandex/taxi/eatskit/dto/PaymentMethodRequest;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(w6a0.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method requestPaymentMethods");
                return ljo.b(a);
            }
            if (!(obj instanceof Result.Failure)) {
                executeMethodOnMainThread("requestPaymentMethods", new z5(17, eatsNativeApi$requestPaymentMethods$1, obj));
            }
            return zy11.a;
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void requestReload(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        if (json2 == null || json2.length() == 0) {
            requestReload();
            return;
        }
        EatsNativeApi$requestReload$2 eatsNativeApi$requestReload$2 = new EatsNativeApi$requestReload$2(1, this.callback, ken.class, "requestReload", "requestReload(Lru/yandex/taxi/eatskit/dto/ReloadParams;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(qke.n(iti0.Companion.serializer()), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method requestReload");
                ljo.b(a);
                return;
            } else {
                if (obj instanceof Result.Failure) {
                    return;
                }
                executeMethodOnMainThread("requestReload", new z5(17, eatsNativeApi$requestReload$2, obj));
                return;
            }
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    @JavascriptInterface
    public final void requestShowAddress() {
        runMethod("requestShowAddress", new jen(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendAnalyticsEvent(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        EatsNativeApi$sendAnalyticsEvent$1 eatsNativeApi$sendAnalyticsEvent$1 = new EatsNativeApi$sendAnalyticsEvent$1(1, this.callback, ken.class, "onAnalyticsEvent", "onAnalyticsEvent(Lru/yandex/taxi/eatskit/dto/AnalyticsEvent;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(p32.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method sendAnalyticsEvent");
                ljo.b(a);
                return;
            } else {
                if (obj instanceof Result.Failure) {
                    return;
                }
                executeMethodOnMainThread("sendAnalyticsEvent", new z5(17, eatsNativeApi$sendAnalyticsEvent$1, obj));
                return;
            }
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void upgradePhonishAccount(String json2) {
        Result.Failure failure;
        Object obj;
        Throwable a;
        EatsNativeApi$upgradePhonishAccount$1 eatsNativeApi$upgradePhonishAccount$1 = new EatsNativeApi$upgradePhonishAccount$1(1, this.callback, ken.class, "upgradePhonishAccount", "upgradePhonishAccount(Lru/yandex/taxi/eatskit/dto/Path;)V", 0);
        xby.d.getClass();
        if (json2 != null && json2.length() != 0) {
            try {
                obj = vmx.a.a().b(qq90.Companion.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            a = Result.a(obj);
            if (a == null) {
                xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method upgradePhonishAccount");
                ljo.b(a);
                return;
            } else {
                if (obj instanceof Result.Failure) {
                    return;
                }
                executeMethodOnMainThread("upgradePhonishAccount", new z5(17, eatsNativeApi$upgradePhonishAccount$1, obj));
                return;
            }
        }
        failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        obj = failure;
        a = Result.a(obj);
        if (a == null) {
        }
    }

    @JavascriptInterface
    public final void requestOpenUri(String str) {
        requestOpenUri$default(this, str, false, 2, null);
    }

    @JavascriptInterface
    public final void onWebViewLoadError() {
        onWebViewLoadError$default(this, null, 1, null);
    }

    @JavascriptInterface
    public final void requestReload() {
        runMethod("requestReload", new jen(this, 0));
    }
}
