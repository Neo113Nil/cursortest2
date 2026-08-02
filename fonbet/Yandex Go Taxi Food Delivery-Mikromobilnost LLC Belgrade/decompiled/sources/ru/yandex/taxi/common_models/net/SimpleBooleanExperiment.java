package ru.yandex.taxi.common_models.net;

import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b@\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bF¨\u0006G"}, d2 = {"Lru/yandex/taxi/common_models/net/SimpleBooleanExperiment;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/yandex/go/experiments/api/ExperimentSource;", "source", "Lcom/yandex/go/experiments/api/ExperimentSource;", "b", "()Lcom/yandex/go/experiments/api/ExperimentSource;", "SHOW_CALL_ME_BACK", "SHARED_PAYMENT_PROTECTION", "POINT_A_WAITING", "SHOW_REFERRAL_BANNER", "ROUTE_AVOID_TOLLS", "DISABLE_SAFETY_CENTER", "DELIVERY_DISABLE_CONTACTS_CHOOSER", "DELIVERY_FORM_BUTTONS_BLOCK", "YANDEX_PAY", "DELIVERY_SDD_LONG_SLOTS", "HIDE_CONTACTS_NAME_FIELD", "SUMMARY_PROMOTIONS", "OPTIMISE_CARS_ON_MAP_ANIMATION", "PERSONAL_GOALS", "VERTICALS_MULTICLASS", "USE_USERINFO_MAIN_ENDPOINT", "USE_USERINFO_AUX_ENDPOINT", "MAAS_SUBSCRIPTION", "ALLOW_LETTER_FOR_PORCH", "YB_WALLET_MENU_ITEM", "ORDER_STATUS_NOTIFICATION", "TRAFFIC_LIGHTS_WITH_SIGNAL_ENABLED", "DELIVERY_FORM_ORDER_CREATION_REDESIGN", "DELIVERY_RESTORE_FALSE_COMPLETED_ORDERS", "NEW_COST_BREAKDOWN", "INITIAL_KEYBOARD_HIDING_IN_SUGGESTS", "FORCED_LIVE_LOCATION", "LAYERS_ANDROID_PERF", "EBOKS_PERF", "PLUS_SDK", "ACCESSIBILITY_SETTINGS", "RESET_SUGGEST_GEOCODER", "SUGGEST_SCROLL_KEYBOARD_VISIBILITY", "INAPP_CALLS_DYNAMIC_FEATURE_PREFETCH", "PRESELECT_CASH", "WEB_MESSENGER_PRELOADING", "ETA_SHOULD_USE_FLOOR", "REPORT_FORMATTING_PRICE_FAILURE", "NAVIGATOR_ON_TAXI_SUMMARY_AVAILABILITY", "SHOW_PICKUP_POINT_BUBBLE_ON_SUMMARY", "FINALSUGGEST_ON_SUMMARY_CLARIFY_A_START", "HIDE_ENTRANCE_BUTTON", "SEPARATED_DRIVE", "MULTIPLE_POINT_CHANGE", "MULTICLASS_TARIFF_CARD_ETA", "HIDE_COMMENT_FIELD_IN_CANCELED_RIDE", "DISABLE_ADDRESS_CACHE_USAGE", "AUTHORIZATION_URL_INTERCEPTION", "SUMMARY_TARIFF_CARD_HORIZONTAL_SWIPE_DISABLED", "HIDE_TARIFF_INFO", "RIDE_CARD_OLD_STARS_IN_RATING_SELECTOR", "MULTICLASS_FILTER_TARIFF_REQUIREMENTS", "ALWAYS_SHOW_PIN_WITH_STAN", "INTERCITY_DASHBOARD_NAVIGATION", "SHOULD_ACTIVATE_SHORTCUTS_FOR_UNAVAILABLE_ZONE", "TECHNICAL_CLARIFY_BUBBLE_NAVIGATION_FIX", "SAFETY_USER_VERIFICATION", "UBS_VERIFICATION", "EDA_FRONT_PREWARM_NETWORK_EATS_SDK_SUPERAPP", "go-client-android.features.experiments:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SimpleBooleanExperiment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SimpleBooleanExperiment[] $VALUES;
    public static final SimpleBooleanExperiment ACCESSIBILITY_SETTINGS;
    public static final SimpleBooleanExperiment ALLOW_LETTER_FOR_PORCH;
    public static final SimpleBooleanExperiment ALWAYS_SHOW_PIN_WITH_STAN;
    public static final SimpleBooleanExperiment AUTHORIZATION_URL_INTERCEPTION;
    public static final SimpleBooleanExperiment DELIVERY_DISABLE_CONTACTS_CHOOSER;
    public static final SimpleBooleanExperiment DELIVERY_FORM_BUTTONS_BLOCK;
    public static final SimpleBooleanExperiment DELIVERY_FORM_ORDER_CREATION_REDESIGN;
    public static final SimpleBooleanExperiment DELIVERY_RESTORE_FALSE_COMPLETED_ORDERS;
    public static final SimpleBooleanExperiment DELIVERY_SDD_LONG_SLOTS;
    public static final SimpleBooleanExperiment DISABLE_ADDRESS_CACHE_USAGE;
    public static final SimpleBooleanExperiment DISABLE_SAFETY_CENTER;
    public static final SimpleBooleanExperiment EBOKS_PERF;
    public static final SimpleBooleanExperiment EDA_FRONT_PREWARM_NETWORK_EATS_SDK_SUPERAPP;
    public static final SimpleBooleanExperiment ETA_SHOULD_USE_FLOOR;
    public static final SimpleBooleanExperiment FINALSUGGEST_ON_SUMMARY_CLARIFY_A_START;
    public static final SimpleBooleanExperiment FORCED_LIVE_LOCATION;
    public static final SimpleBooleanExperiment HIDE_COMMENT_FIELD_IN_CANCELED_RIDE;
    public static final SimpleBooleanExperiment HIDE_CONTACTS_NAME_FIELD;
    public static final SimpleBooleanExperiment HIDE_ENTRANCE_BUTTON;
    public static final SimpleBooleanExperiment HIDE_TARIFF_INFO;
    public static final SimpleBooleanExperiment INAPP_CALLS_DYNAMIC_FEATURE_PREFETCH;
    public static final SimpleBooleanExperiment INITIAL_KEYBOARD_HIDING_IN_SUGGESTS;
    public static final SimpleBooleanExperiment INTERCITY_DASHBOARD_NAVIGATION;
    public static final SimpleBooleanExperiment LAYERS_ANDROID_PERF;
    public static final SimpleBooleanExperiment MAAS_SUBSCRIPTION;
    public static final SimpleBooleanExperiment MULTICLASS_FILTER_TARIFF_REQUIREMENTS;
    public static final SimpleBooleanExperiment MULTICLASS_TARIFF_CARD_ETA;
    public static final SimpleBooleanExperiment MULTIPLE_POINT_CHANGE;
    public static final SimpleBooleanExperiment NAVIGATOR_ON_TAXI_SUMMARY_AVAILABILITY;
    public static final SimpleBooleanExperiment NEW_COST_BREAKDOWN;
    public static final SimpleBooleanExperiment OPTIMISE_CARS_ON_MAP_ANIMATION;
    public static final SimpleBooleanExperiment ORDER_STATUS_NOTIFICATION;
    public static final SimpleBooleanExperiment PERSONAL_GOALS;
    public static final SimpleBooleanExperiment PLUS_SDK;
    public static final SimpleBooleanExperiment POINT_A_WAITING;
    public static final SimpleBooleanExperiment PRESELECT_CASH;
    public static final SimpleBooleanExperiment REPORT_FORMATTING_PRICE_FAILURE;
    public static final SimpleBooleanExperiment RESET_SUGGEST_GEOCODER;
    public static final SimpleBooleanExperiment RIDE_CARD_OLD_STARS_IN_RATING_SELECTOR;
    public static final SimpleBooleanExperiment ROUTE_AVOID_TOLLS;
    public static final SimpleBooleanExperiment SAFETY_USER_VERIFICATION;
    public static final SimpleBooleanExperiment SEPARATED_DRIVE;
    public static final SimpleBooleanExperiment SHARED_PAYMENT_PROTECTION;
    public static final SimpleBooleanExperiment SHOULD_ACTIVATE_SHORTCUTS_FOR_UNAVAILABLE_ZONE;
    public static final SimpleBooleanExperiment SHOW_CALL_ME_BACK;
    public static final SimpleBooleanExperiment SHOW_PICKUP_POINT_BUBBLE_ON_SUMMARY;
    public static final SimpleBooleanExperiment SHOW_REFERRAL_BANNER;
    public static final SimpleBooleanExperiment SUGGEST_SCROLL_KEYBOARD_VISIBILITY;
    public static final SimpleBooleanExperiment SUMMARY_PROMOTIONS;
    public static final SimpleBooleanExperiment SUMMARY_TARIFF_CARD_HORIZONTAL_SWIPE_DISABLED;
    public static final SimpleBooleanExperiment TECHNICAL_CLARIFY_BUBBLE_NAVIGATION_FIX;
    public static final SimpleBooleanExperiment TRAFFIC_LIGHTS_WITH_SIGNAL_ENABLED;
    public static final SimpleBooleanExperiment UBS_VERIFICATION;
    public static final SimpleBooleanExperiment USE_USERINFO_AUX_ENDPOINT;
    public static final SimpleBooleanExperiment USE_USERINFO_MAIN_ENDPOINT;
    public static final SimpleBooleanExperiment VERTICALS_MULTICLASS;
    public static final SimpleBooleanExperiment WEB_MESSENGER_PRELOADING;
    public static final SimpleBooleanExperiment YANDEX_PAY;
    public static final SimpleBooleanExperiment YB_WALLET_MENU_ITEM;
    private final String id;
    private final ExperimentSource source;

    static {
        ExperimentSource experimentSource = ExperimentSource.TOTW;
        SimpleBooleanExperiment simpleBooleanExperiment = new SimpleBooleanExperiment("SHOW_CALL_ME_BACK", 0, "show_call_me_back_option", experimentSource);
        SHOW_CALL_ME_BACK = simpleBooleanExperiment;
        ExperimentSource experimentSource2 = ExperimentSource.ZONE_INFO;
        SimpleBooleanExperiment simpleBooleanExperiment2 = new SimpleBooleanExperiment("SHARED_PAYMENT_PROTECTION", 1, "coop_account_protection", experimentSource2);
        SHARED_PAYMENT_PROTECTION = simpleBooleanExperiment2;
        SimpleBooleanExperiment simpleBooleanExperiment3 = new SimpleBooleanExperiment("POINT_A_WAITING", 2, "point_a_waiting", experimentSource);
        POINT_A_WAITING = simpleBooleanExperiment3;
        ExperimentSource experimentSource3 = ExperimentSource.LAUNCH;
        SimpleBooleanExperiment simpleBooleanExperiment4 = new SimpleBooleanExperiment("SHOW_REFERRAL_BANNER", 3, "show_referral_banner", experimentSource3);
        SHOW_REFERRAL_BANNER = simpleBooleanExperiment4;
        ExperimentSource experimentSource4 = ExperimentSource.FINAL_SUGGEST;
        SimpleBooleanExperiment simpleBooleanExperiment5 = new SimpleBooleanExperiment("ROUTE_AVOID_TOLLS", 4, "route_avoid_tolls", experimentSource4);
        ROUTE_AVOID_TOLLS = simpleBooleanExperiment5;
        SimpleBooleanExperiment simpleBooleanExperiment6 = new SimpleBooleanExperiment("DISABLE_SAFETY_CENTER", 5, "disable_safety_center_totw", experimentSource);
        DISABLE_SAFETY_CENTER = simpleBooleanExperiment6;
        SimpleBooleanExperiment simpleBooleanExperiment7 = new SimpleBooleanExperiment("DELIVERY_DISABLE_CONTACTS_CHOOSER", 6, "delivery_disable_contacts_chooser", experimentSource2);
        DELIVERY_DISABLE_CONTACTS_CHOOSER = simpleBooleanExperiment7;
        SimpleBooleanExperiment simpleBooleanExperiment8 = new SimpleBooleanExperiment("DELIVERY_FORM_BUTTONS_BLOCK", 7, "delivery_form_buttons_block", experimentSource2);
        DELIVERY_FORM_BUTTONS_BLOCK = simpleBooleanExperiment8;
        SimpleBooleanExperiment simpleBooleanExperiment9 = new SimpleBooleanExperiment("YANDEX_PAY", 8, "yandex_pay", experimentSource2);
        YANDEX_PAY = simpleBooleanExperiment9;
        SimpleBooleanExperiment simpleBooleanExperiment10 = new SimpleBooleanExperiment("DELIVERY_SDD_LONG_SLOTS", 9, "delivery_sdd_long_slots", experimentSource2);
        DELIVERY_SDD_LONG_SLOTS = simpleBooleanExperiment10;
        SimpleBooleanExperiment simpleBooleanExperiment11 = new SimpleBooleanExperiment("HIDE_CONTACTS_NAME_FIELD", 10, "hide_contacts_name_field", experimentSource3);
        HIDE_CONTACTS_NAME_FIELD = simpleBooleanExperiment11;
        SimpleBooleanExperiment simpleBooleanExperiment12 = new SimpleBooleanExperiment("SUMMARY_PROMOTIONS", 11, "summary_promoblocks", experimentSource3);
        SUMMARY_PROMOTIONS = simpleBooleanExperiment12;
        SimpleBooleanExperiment simpleBooleanExperiment13 = new SimpleBooleanExperiment("OPTIMISE_CARS_ON_MAP_ANIMATION", 12, "optimise_cars_on_map_animation", experimentSource3);
        OPTIMISE_CARS_ON_MAP_ANIMATION = simpleBooleanExperiment13;
        SimpleBooleanExperiment simpleBooleanExperiment14 = new SimpleBooleanExperiment("PERSONAL_GOALS", 13, "personal_goals", experimentSource3);
        PERSONAL_GOALS = simpleBooleanExperiment14;
        SimpleBooleanExperiment simpleBooleanExperiment15 = new SimpleBooleanExperiment("VERTICALS_MULTICLASS", 14, "verticals_multiclass_support", experimentSource2);
        VERTICALS_MULTICLASS = simpleBooleanExperiment15;
        SimpleBooleanExperiment simpleBooleanExperiment16 = new SimpleBooleanExperiment("USE_USERINFO_MAIN_ENDPOINT", 15, "use_userinfo_main_endpoint", experimentSource3);
        USE_USERINFO_MAIN_ENDPOINT = simpleBooleanExperiment16;
        SimpleBooleanExperiment simpleBooleanExperiment17 = new SimpleBooleanExperiment("USE_USERINFO_AUX_ENDPOINT", 16, "use_userinfo_aux_endpoint", experimentSource3);
        USE_USERINFO_AUX_ENDPOINT = simpleBooleanExperiment17;
        SimpleBooleanExperiment simpleBooleanExperiment18 = new SimpleBooleanExperiment("MAAS_SUBSCRIPTION", 17, "maas_subscription", experimentSource2);
        MAAS_SUBSCRIPTION = simpleBooleanExperiment18;
        SimpleBooleanExperiment simpleBooleanExperiment19 = new SimpleBooleanExperiment("ALLOW_LETTER_FOR_PORCH", 18, "allow_letter_for_porch", experimentSource4);
        ALLOW_LETTER_FOR_PORCH = simpleBooleanExperiment19;
        SimpleBooleanExperiment simpleBooleanExperiment20 = new SimpleBooleanExperiment("YB_WALLET_MENU_ITEM", 19, "yandex_wallet_menu_item", experimentSource3);
        YB_WALLET_MENU_ITEM = simpleBooleanExperiment20;
        SimpleBooleanExperiment simpleBooleanExperiment21 = new SimpleBooleanExperiment("ORDER_STATUS_NOTIFICATION", 20, "order_status_notification", experimentSource);
        ORDER_STATUS_NOTIFICATION = simpleBooleanExperiment21;
        SimpleBooleanExperiment simpleBooleanExperiment22 = new SimpleBooleanExperiment("TRAFFIC_LIGHTS_WITH_SIGNAL_ENABLED", 21, "traffic_lights_with_signal_enabled", experimentSource);
        TRAFFIC_LIGHTS_WITH_SIGNAL_ENABLED = simpleBooleanExperiment22;
        SimpleBooleanExperiment simpleBooleanExperiment23 = new SimpleBooleanExperiment("DELIVERY_FORM_ORDER_CREATION_REDESIGN", 22, "delivery_form_order_creation_redesign", experimentSource2);
        DELIVERY_FORM_ORDER_CREATION_REDESIGN = simpleBooleanExperiment23;
        SimpleBooleanExperiment simpleBooleanExperiment24 = new SimpleBooleanExperiment("DELIVERY_RESTORE_FALSE_COMPLETED_ORDERS", 23, "delivery_restore_false_completed_orders", experimentSource3);
        DELIVERY_RESTORE_FALSE_COMPLETED_ORDERS = simpleBooleanExperiment24;
        SimpleBooleanExperiment simpleBooleanExperiment25 = new SimpleBooleanExperiment("NEW_COST_BREAKDOWN", 24, "new_cost_breakdown", experimentSource);
        NEW_COST_BREAKDOWN = simpleBooleanExperiment25;
        SimpleBooleanExperiment simpleBooleanExperiment26 = new SimpleBooleanExperiment("INITIAL_KEYBOARD_HIDING_IN_SUGGESTS", 25, "initial_keyboard_hiding_in_suggests", experimentSource3);
        INITIAL_KEYBOARD_HIDING_IN_SUGGESTS = simpleBooleanExperiment26;
        SimpleBooleanExperiment simpleBooleanExperiment27 = new SimpleBooleanExperiment("FORCED_LIVE_LOCATION", 26, "forced_live_location", experimentSource);
        FORCED_LIVE_LOCATION = simpleBooleanExperiment27;
        SimpleBooleanExperiment simpleBooleanExperiment28 = new SimpleBooleanExperiment("LAYERS_ANDROID_PERF", 27, "layers_android_perf", experimentSource3);
        LAYERS_ANDROID_PERF = simpleBooleanExperiment28;
        SimpleBooleanExperiment simpleBooleanExperiment29 = new SimpleBooleanExperiment("EBOKS_PERF", 28, "eboks_client_perf", experimentSource3);
        EBOKS_PERF = simpleBooleanExperiment29;
        SimpleBooleanExperiment simpleBooleanExperiment30 = new SimpleBooleanExperiment("PLUS_SDK", 29, "plus_sdk", experimentSource2);
        PLUS_SDK = simpleBooleanExperiment30;
        SimpleBooleanExperiment simpleBooleanExperiment31 = new SimpleBooleanExperiment("ACCESSIBILITY_SETTINGS", 30, "accessibility_taxi_analytics", experimentSource3);
        ACCESSIBILITY_SETTINGS = simpleBooleanExperiment31;
        SimpleBooleanExperiment simpleBooleanExperiment32 = new SimpleBooleanExperiment("RESET_SUGGEST_GEOCODER", 31, "reset_suggest_geocoder", experimentSource2);
        RESET_SUGGEST_GEOCODER = simpleBooleanExperiment32;
        SimpleBooleanExperiment simpleBooleanExperiment33 = new SimpleBooleanExperiment("SUGGEST_SCROLL_KEYBOARD_VISIBILITY", 32, "suggest_scroll_keyboard_visibility", experimentSource3);
        SUGGEST_SCROLL_KEYBOARD_VISIBILITY = simpleBooleanExperiment33;
        SimpleBooleanExperiment simpleBooleanExperiment34 = new SimpleBooleanExperiment("INAPP_CALLS_DYNAMIC_FEATURE_PREFETCH", 33, "inapp_calls_dynamic_feature_prefetch", experimentSource2);
        INAPP_CALLS_DYNAMIC_FEATURE_PREFETCH = simpleBooleanExperiment34;
        SimpleBooleanExperiment simpleBooleanExperiment35 = new SimpleBooleanExperiment("PRESELECT_CASH", 34, "preselect_cash", experimentSource2);
        PRESELECT_CASH = simpleBooleanExperiment35;
        SimpleBooleanExperiment simpleBooleanExperiment36 = new SimpleBooleanExperiment("WEB_MESSENGER_PRELOADING", 35, "web_messenger_preloading", experimentSource);
        WEB_MESSENGER_PRELOADING = simpleBooleanExperiment36;
        SimpleBooleanExperiment simpleBooleanExperiment37 = new SimpleBooleanExperiment("ETA_SHOULD_USE_FLOOR", 36, "eta_should_use_floor", experimentSource);
        ETA_SHOULD_USE_FLOOR = simpleBooleanExperiment37;
        SimpleBooleanExperiment simpleBooleanExperiment38 = new SimpleBooleanExperiment("REPORT_FORMATTING_PRICE_FAILURE", 37, "report_formatting_price_failure", ExperimentSource.ROUTESTATS);
        REPORT_FORMATTING_PRICE_FAILURE = simpleBooleanExperiment38;
        SimpleBooleanExperiment simpleBooleanExperiment39 = new SimpleBooleanExperiment("NAVIGATOR_ON_TAXI_SUMMARY_AVAILABILITY", 38, "navigator_on_taxi_summary_availability", experimentSource2);
        NAVIGATOR_ON_TAXI_SUMMARY_AVAILABILITY = simpleBooleanExperiment39;
        SimpleBooleanExperiment simpleBooleanExperiment40 = new SimpleBooleanExperiment("SHOW_PICKUP_POINT_BUBBLE_ON_SUMMARY", 39, "show_pickup_point_bubble_on_summary", experimentSource4);
        SHOW_PICKUP_POINT_BUBBLE_ON_SUMMARY = simpleBooleanExperiment40;
        SimpleBooleanExperiment simpleBooleanExperiment41 = new SimpleBooleanExperiment("FINALSUGGEST_ON_SUMMARY_CLARIFY_A_START", 40, "finalsuggest_on_summary_clarify_a_start", experimentSource4);
        FINALSUGGEST_ON_SUMMARY_CLARIFY_A_START = simpleBooleanExperiment41;
        SimpleBooleanExperiment simpleBooleanExperiment42 = new SimpleBooleanExperiment("HIDE_ENTRANCE_BUTTON", 41, "hide_entrance_button", experimentSource4);
        HIDE_ENTRANCE_BUTTON = simpleBooleanExperiment42;
        SimpleBooleanExperiment simpleBooleanExperiment43 = new SimpleBooleanExperiment("SEPARATED_DRIVE", 42, "summary_drive_vertical_screen", experimentSource2);
        SEPARATED_DRIVE = simpleBooleanExperiment43;
        SimpleBooleanExperiment simpleBooleanExperiment44 = new SimpleBooleanExperiment("MULTIPLE_POINT_CHANGE", 43, "multiple_point_change", experimentSource);
        MULTIPLE_POINT_CHANGE = simpleBooleanExperiment44;
        SimpleBooleanExperiment simpleBooleanExperiment45 = new SimpleBooleanExperiment("MULTICLASS_TARIFF_CARD_ETA", 44, "multiclass_tariff_card_eta", experimentSource2);
        MULTICLASS_TARIFF_CARD_ETA = simpleBooleanExperiment45;
        SimpleBooleanExperiment simpleBooleanExperiment46 = new SimpleBooleanExperiment("HIDE_COMMENT_FIELD_IN_CANCELED_RIDE", 45, "yango_hide_comment_field_in_canceled_ride", experimentSource);
        HIDE_COMMENT_FIELD_IN_CANCELED_RIDE = simpleBooleanExperiment46;
        SimpleBooleanExperiment simpleBooleanExperiment47 = new SimpleBooleanExperiment("DISABLE_ADDRESS_CACHE_USAGE", 46, "android_disable_address_cache_on_summary", experimentSource4);
        DISABLE_ADDRESS_CACHE_USAGE = simpleBooleanExperiment47;
        SimpleBooleanExperiment simpleBooleanExperiment48 = new SimpleBooleanExperiment("AUTHORIZATION_URL_INTERCEPTION", 47, "authorization_url_interception", experimentSource3);
        AUTHORIZATION_URL_INTERCEPTION = simpleBooleanExperiment48;
        SimpleBooleanExperiment simpleBooleanExperiment49 = new SimpleBooleanExperiment("SUMMARY_TARIFF_CARD_HORIZONTAL_SWIPE_DISABLED", 48, "summary_tariff_card_horizontal_swipe_disabled", experimentSource2);
        SUMMARY_TARIFF_CARD_HORIZONTAL_SWIPE_DISABLED = simpleBooleanExperiment49;
        SimpleBooleanExperiment simpleBooleanExperiment50 = new SimpleBooleanExperiment("HIDE_TARIFF_INFO", 49, "hide_tariffs_info", experimentSource2);
        HIDE_TARIFF_INFO = simpleBooleanExperiment50;
        SimpleBooleanExperiment simpleBooleanExperiment51 = new SimpleBooleanExperiment("RIDE_CARD_OLD_STARS_IN_RATING_SELECTOR", 50, "ride_card_old_stars_in_rating_selector", experimentSource);
        RIDE_CARD_OLD_STARS_IN_RATING_SELECTOR = simpleBooleanExperiment51;
        SimpleBooleanExperiment simpleBooleanExperiment52 = new SimpleBooleanExperiment("MULTICLASS_FILTER_TARIFF_REQUIREMENTS", 51, "multiclass_filter_tariff_requirements", experimentSource2);
        MULTICLASS_FILTER_TARIFF_REQUIREMENTS = simpleBooleanExperiment52;
        SimpleBooleanExperiment simpleBooleanExperiment53 = new SimpleBooleanExperiment("ALWAYS_SHOW_PIN_WITH_STAN", 52, "always_show_pin_with_stan", experimentSource3);
        ALWAYS_SHOW_PIN_WITH_STAN = simpleBooleanExperiment53;
        SimpleBooleanExperiment simpleBooleanExperiment54 = new SimpleBooleanExperiment("INTERCITY_DASHBOARD_NAVIGATION", 53, "intercity_dashboard_navigation", experimentSource3);
        INTERCITY_DASHBOARD_NAVIGATION = simpleBooleanExperiment54;
        SimpleBooleanExperiment simpleBooleanExperiment55 = new SimpleBooleanExperiment("SHOULD_ACTIVATE_SHORTCUTS_FOR_UNAVAILABLE_ZONE", 54, "should_activate_shortcuts_for_unavailable_zone", experimentSource4);
        SHOULD_ACTIVATE_SHORTCUTS_FOR_UNAVAILABLE_ZONE = simpleBooleanExperiment55;
        SimpleBooleanExperiment simpleBooleanExperiment56 = new SimpleBooleanExperiment("TECHNICAL_CLARIFY_BUBBLE_NAVIGATION_FIX", 55, "technical_clarify_bubble_navigation_fix", experimentSource4);
        TECHNICAL_CLARIFY_BUBBLE_NAVIGATION_FIX = simpleBooleanExperiment56;
        SimpleBooleanExperiment simpleBooleanExperiment57 = new SimpleBooleanExperiment("SAFETY_USER_VERIFICATION", 56, "safety_user_verification", experimentSource2);
        SAFETY_USER_VERIFICATION = simpleBooleanExperiment57;
        SimpleBooleanExperiment simpleBooleanExperiment58 = new SimpleBooleanExperiment("UBS_VERIFICATION", 57, "ubs_verification", ExperimentSource.PRODUCTS);
        UBS_VERIFICATION = simpleBooleanExperiment58;
        SimpleBooleanExperiment simpleBooleanExperiment59 = new SimpleBooleanExperiment("EDA_FRONT_PREWARM_NETWORK_EATS_SDK_SUPERAPP", 58, "eda_front_prewarm_network_eats_sdk_superapp", experimentSource3);
        EDA_FRONT_PREWARM_NETWORK_EATS_SDK_SUPERAPP = simpleBooleanExperiment59;
        SimpleBooleanExperiment[] simpleBooleanExperimentArr = {simpleBooleanExperiment, simpleBooleanExperiment2, simpleBooleanExperiment3, simpleBooleanExperiment4, simpleBooleanExperiment5, simpleBooleanExperiment6, simpleBooleanExperiment7, simpleBooleanExperiment8, simpleBooleanExperiment9, simpleBooleanExperiment10, simpleBooleanExperiment11, simpleBooleanExperiment12, simpleBooleanExperiment13, simpleBooleanExperiment14, simpleBooleanExperiment15, simpleBooleanExperiment16, simpleBooleanExperiment17, simpleBooleanExperiment18, simpleBooleanExperiment19, simpleBooleanExperiment20, simpleBooleanExperiment21, simpleBooleanExperiment22, simpleBooleanExperiment23, simpleBooleanExperiment24, simpleBooleanExperiment25, simpleBooleanExperiment26, simpleBooleanExperiment27, simpleBooleanExperiment28, simpleBooleanExperiment29, simpleBooleanExperiment30, simpleBooleanExperiment31, simpleBooleanExperiment32, simpleBooleanExperiment33, simpleBooleanExperiment34, simpleBooleanExperiment35, simpleBooleanExperiment36, simpleBooleanExperiment37, simpleBooleanExperiment38, simpleBooleanExperiment39, simpleBooleanExperiment40, simpleBooleanExperiment41, simpleBooleanExperiment42, simpleBooleanExperiment43, simpleBooleanExperiment44, simpleBooleanExperiment45, simpleBooleanExperiment46, simpleBooleanExperiment47, simpleBooleanExperiment48, simpleBooleanExperiment49, simpleBooleanExperiment50, simpleBooleanExperiment51, simpleBooleanExperiment52, simpleBooleanExperiment53, simpleBooleanExperiment54, simpleBooleanExperiment55, simpleBooleanExperiment56, simpleBooleanExperiment57, simpleBooleanExperiment58, simpleBooleanExperiment59};
        $VALUES = simpleBooleanExperimentArr;
        $ENTRIES = kotlin.enums.a.a(simpleBooleanExperimentArr);
    }

    public SimpleBooleanExperiment(String str, int i, String str2, ExperimentSource experimentSource) {
        this.id = str2;
        this.source = experimentSource;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SimpleBooleanExperiment valueOf(String str) {
        return (SimpleBooleanExperiment) Enum.valueOf(SimpleBooleanExperiment.class, str);
    }

    public static SimpleBooleanExperiment[] values() {
        return (SimpleBooleanExperiment[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final ExperimentSource getSource() {
        return this.source;
    }

    public final String getId() {
        return this.id;
    }
}
