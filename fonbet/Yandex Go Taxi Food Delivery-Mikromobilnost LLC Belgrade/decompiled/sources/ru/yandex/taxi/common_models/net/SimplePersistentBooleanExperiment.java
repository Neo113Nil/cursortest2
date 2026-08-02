package ru.yandex.taxi.common_models.net;

import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b:\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006A"}, d2 = {"Lru/yandex/taxi/common_models/net/SimplePersistentBooleanExperiment;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/yandex/go/experiments/api/ExperimentSource;", "source", "Lcom/yandex/go/experiments/api/ExperimentSource;", "b", "()Lcom/yandex/go/experiments/api/ExperimentSource;", "MULTIORDER_ADDRESS_PICKER", "ROUTE_AVOID_TOLLS", "USE_MAPKIT_LOCATION", "SHOW_COMMUNICATIONS_ON_START_AFTER_USER_INTERACTION", "STICK_TO_EATS_ADDRESS", "SKIP_CACHED_LOCATION_ON_START", "SUPPER_APP_WEB_VIEW_USE_HARDWARE_LAYER", "STORAGE_PERFORMANCE_ANALYTICS", "NO_MORE_PHONISH", "LAUNCH_AND_TOTW_METRICS", "DRIVE_FILTERS", "SUPERAPP_PROMOTIONS_REFRESH_ON_COUNRTRY_CHANGE", "METRICA_ANR_MONITOR", "NEW_REFERRAL_SCREEN", "HIDE_YOUR_ADDRESS_ON_MAIN", "DISABLE_AUTOLOGIN", "SUMMARY_HIGH_TARIFF_SELECTOR", "SETUP_INITIAL_GEO_LOCATION", "AUTO_UPDATE_SOURCE_POINT", "PAYMENT_METHODS_NAME_EDITOR", "SCOOTERS_CLIENT_PLUS_PLAQUE", "SCOOTERS_CLIENT_ORDER_SELECTOR", "SCOOTERS_CLIENT_ZONE_WITH_BIKES", "SCOOTERS_CLIENT_MAP_ROTATABLE", "DISABLE_LBS_PROVIDER", "SEND_MONITORING_LBS_ANALYTICS", "SEND_GEO_PROVIDERS_ANALYTICS", "FORCED_PASSPORT_PROCESS_START", "TRUSTED_CONTACTS_V2", "PLACES_ORGANIZATION_SNIPPET_V2", "PLACES_USE_NATIVE_NAVIGATION", "MARKETPLACE_OPEN_ALL_CHATS", "ENABLE_APP_INFO_COPY", "SUPERAPP_COMMUNICATIONS_RESTRICTED_CACHE", "DELIVERY_PUSH_REPLACING", "PRECISE_LOCATION_ENABLED", "ENABLE_FULLSCREEN_ORDERHISTORY", "ENABLE_NATIVE_MESSENGER", "SUPERAPP_BROTLI", "SUPERAPP_ADJUST_LIB", "YANGOPAY_PASSPORT_AUTH_PROXY", "ENABLE_MAP_MODELS_OPTIMIZATION", "SUPERAPP_WEB_VIEW_WARM_UP", "FAVORITE_USERPLACES_LIST_V2", "USE_USER_CONFIG_REQUEST", "ENABLE_NOTIFICATION_RATING_DECORATIONS", "SUPERAPP_POLLING", "SUPERAPP_MAINSCREEN_WARMUP", "OPTIMIZED_SHIMMERING", "OPEN_WALLET_BY_SWIPE", "TAXIROUTE_ENABLE_ROUTE_CACHE", "QUARK_LOCK", "SUPERAPP_DISCOVERY_MAP_TAXI", "go-client-android.features.experiments:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SimplePersistentBooleanExperiment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SimplePersistentBooleanExperiment[] $VALUES;
    public static final SimplePersistentBooleanExperiment AUTO_UPDATE_SOURCE_POINT;
    public static final SimplePersistentBooleanExperiment DELIVERY_PUSH_REPLACING;
    public static final SimplePersistentBooleanExperiment DISABLE_AUTOLOGIN;
    public static final SimplePersistentBooleanExperiment DISABLE_LBS_PROVIDER;
    public static final SimplePersistentBooleanExperiment DRIVE_FILTERS;
    public static final SimplePersistentBooleanExperiment ENABLE_APP_INFO_COPY;
    public static final SimplePersistentBooleanExperiment ENABLE_FULLSCREEN_ORDERHISTORY;
    public static final SimplePersistentBooleanExperiment ENABLE_MAP_MODELS_OPTIMIZATION;
    public static final SimplePersistentBooleanExperiment ENABLE_NATIVE_MESSENGER;
    public static final SimplePersistentBooleanExperiment ENABLE_NOTIFICATION_RATING_DECORATIONS;
    public static final SimplePersistentBooleanExperiment FAVORITE_USERPLACES_LIST_V2;
    public static final SimplePersistentBooleanExperiment FORCED_PASSPORT_PROCESS_START;
    public static final SimplePersistentBooleanExperiment HIDE_YOUR_ADDRESS_ON_MAIN;
    public static final SimplePersistentBooleanExperiment LAUNCH_AND_TOTW_METRICS;
    public static final SimplePersistentBooleanExperiment MARKETPLACE_OPEN_ALL_CHATS;
    public static final SimplePersistentBooleanExperiment METRICA_ANR_MONITOR;
    public static final SimplePersistentBooleanExperiment MULTIORDER_ADDRESS_PICKER;
    public static final SimplePersistentBooleanExperiment NEW_REFERRAL_SCREEN;
    public static final SimplePersistentBooleanExperiment NO_MORE_PHONISH;
    public static final SimplePersistentBooleanExperiment OPEN_WALLET_BY_SWIPE;
    public static final SimplePersistentBooleanExperiment OPTIMIZED_SHIMMERING;
    public static final SimplePersistentBooleanExperiment PAYMENT_METHODS_NAME_EDITOR;
    public static final SimplePersistentBooleanExperiment PLACES_ORGANIZATION_SNIPPET_V2;
    public static final SimplePersistentBooleanExperiment PLACES_USE_NATIVE_NAVIGATION;
    public static final SimplePersistentBooleanExperiment PRECISE_LOCATION_ENABLED;
    public static final SimplePersistentBooleanExperiment QUARK_LOCK;
    public static final SimplePersistentBooleanExperiment ROUTE_AVOID_TOLLS;
    public static final SimplePersistentBooleanExperiment SCOOTERS_CLIENT_MAP_ROTATABLE;
    public static final SimplePersistentBooleanExperiment SCOOTERS_CLIENT_ORDER_SELECTOR;
    public static final SimplePersistentBooleanExperiment SCOOTERS_CLIENT_PLUS_PLAQUE;
    public static final SimplePersistentBooleanExperiment SCOOTERS_CLIENT_ZONE_WITH_BIKES;
    public static final SimplePersistentBooleanExperiment SEND_GEO_PROVIDERS_ANALYTICS;
    public static final SimplePersistentBooleanExperiment SEND_MONITORING_LBS_ANALYTICS;
    public static final SimplePersistentBooleanExperiment SETUP_INITIAL_GEO_LOCATION;
    public static final SimplePersistentBooleanExperiment SHOW_COMMUNICATIONS_ON_START_AFTER_USER_INTERACTION;
    public static final SimplePersistentBooleanExperiment SKIP_CACHED_LOCATION_ON_START;
    public static final SimplePersistentBooleanExperiment STICK_TO_EATS_ADDRESS;
    public static final SimplePersistentBooleanExperiment STORAGE_PERFORMANCE_ANALYTICS;
    public static final SimplePersistentBooleanExperiment SUMMARY_HIGH_TARIFF_SELECTOR;
    public static final SimplePersistentBooleanExperiment SUPERAPP_ADJUST_LIB;
    public static final SimplePersistentBooleanExperiment SUPERAPP_BROTLI;
    public static final SimplePersistentBooleanExperiment SUPERAPP_COMMUNICATIONS_RESTRICTED_CACHE;
    public static final SimplePersistentBooleanExperiment SUPERAPP_DISCOVERY_MAP_TAXI;
    public static final SimplePersistentBooleanExperiment SUPERAPP_MAINSCREEN_WARMUP;
    public static final SimplePersistentBooleanExperiment SUPERAPP_POLLING;
    public static final SimplePersistentBooleanExperiment SUPERAPP_PROMOTIONS_REFRESH_ON_COUNRTRY_CHANGE;
    public static final SimplePersistentBooleanExperiment SUPERAPP_WEB_VIEW_WARM_UP;
    public static final SimplePersistentBooleanExperiment SUPPER_APP_WEB_VIEW_USE_HARDWARE_LAYER;
    public static final SimplePersistentBooleanExperiment TAXIROUTE_ENABLE_ROUTE_CACHE;
    public static final SimplePersistentBooleanExperiment TRUSTED_CONTACTS_V2;
    public static final SimplePersistentBooleanExperiment USE_MAPKIT_LOCATION;
    public static final SimplePersistentBooleanExperiment USE_USER_CONFIG_REQUEST;
    public static final SimplePersistentBooleanExperiment YANGOPAY_PASSPORT_AUTH_PROXY;
    private final String id;
    private final ExperimentSource source;

    static {
        ExperimentSource experimentSource = ExperimentSource.LAUNCH;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment = new SimplePersistentBooleanExperiment("MULTIORDER_ADDRESS_PICKER", 0, "multiorder_address_picker", experimentSource);
        MULTIORDER_ADDRESS_PICKER = simplePersistentBooleanExperiment;
        ExperimentSource experimentSource2 = ExperimentSource.FINAL_SUGGEST;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment2 = new SimplePersistentBooleanExperiment("ROUTE_AVOID_TOLLS", 1, "route_avoid_tolls", experimentSource2);
        ROUTE_AVOID_TOLLS = simplePersistentBooleanExperiment2;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment3 = new SimplePersistentBooleanExperiment("USE_MAPKIT_LOCATION", 2, "use_mapkit_location", experimentSource);
        USE_MAPKIT_LOCATION = simplePersistentBooleanExperiment3;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment4 = new SimplePersistentBooleanExperiment("SHOW_COMMUNICATIONS_ON_START_AFTER_USER_INTERACTION", 3, "show_communications_on_start_after_user_interaction", experimentSource2);
        SHOW_COMMUNICATIONS_ON_START_AFTER_USER_INTERACTION = simplePersistentBooleanExperiment4;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment5 = new SimplePersistentBooleanExperiment("STICK_TO_EATS_ADDRESS", 4, "stick_to_eats_address", experimentSource2);
        STICK_TO_EATS_ADDRESS = simplePersistentBooleanExperiment5;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment6 = new SimplePersistentBooleanExperiment("SKIP_CACHED_LOCATION_ON_START", 5, "skip_first_cached_coordinate_from_location_provider", experimentSource);
        SKIP_CACHED_LOCATION_ON_START = simplePersistentBooleanExperiment6;
        ExperimentSource experimentSource3 = ExperimentSource.PRODUCTS;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment7 = new SimplePersistentBooleanExperiment("SUPPER_APP_WEB_VIEW_USE_HARDWARE_LAYER", 6, "supperapp_webview_use_hardware_layer", experimentSource3);
        SUPPER_APP_WEB_VIEW_USE_HARDWARE_LAYER = simplePersistentBooleanExperiment7;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment8 = new SimplePersistentBooleanExperiment("STORAGE_PERFORMANCE_ANALYTICS", 7, "storage_performance_analytics", experimentSource);
        STORAGE_PERFORMANCE_ANALYTICS = simplePersistentBooleanExperiment8;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment9 = new SimplePersistentBooleanExperiment("NO_MORE_PHONISH", 8, "no_more_phonish", experimentSource);
        NO_MORE_PHONISH = simplePersistentBooleanExperiment9;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment10 = new SimplePersistentBooleanExperiment("LAUNCH_AND_TOTW_METRICS", 9, "launch_processing_and_order_polling_metrics", experimentSource);
        LAUNCH_AND_TOTW_METRICS = simplePersistentBooleanExperiment10;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment11 = new SimplePersistentBooleanExperiment("DRIVE_FILTERS", 10, "drive_filters", experimentSource3);
        DRIVE_FILTERS = simplePersistentBooleanExperiment11;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment12 = new SimplePersistentBooleanExperiment("SUPERAPP_PROMOTIONS_REFRESH_ON_COUNRTRY_CHANGE", 11, "superapp_promotions_refresh_on_counrtry_change", experimentSource2);
        SUPERAPP_PROMOTIONS_REFRESH_ON_COUNRTRY_CHANGE = simplePersistentBooleanExperiment12;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment13 = new SimplePersistentBooleanExperiment("METRICA_ANR_MONITOR", 12, "metrica_anr_monitor", experimentSource);
        METRICA_ANR_MONITOR = simplePersistentBooleanExperiment13;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment14 = new SimplePersistentBooleanExperiment("NEW_REFERRAL_SCREEN", 13, "new_referral_screen", experimentSource);
        NEW_REFERRAL_SCREEN = simplePersistentBooleanExperiment14;
        ExperimentSource experimentSource4 = ExperimentSource.ZONE_INFO;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment15 = new SimplePersistentBooleanExperiment("HIDE_YOUR_ADDRESS_ON_MAIN", 14, "hide_your_address_on_main", experimentSource4);
        HIDE_YOUR_ADDRESS_ON_MAIN = simplePersistentBooleanExperiment15;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment16 = new SimplePersistentBooleanExperiment("DISABLE_AUTOLOGIN", 15, "disable_autologin", experimentSource);
        DISABLE_AUTOLOGIN = simplePersistentBooleanExperiment16;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment17 = new SimplePersistentBooleanExperiment("SUMMARY_HIGH_TARIFF_SELECTOR", 16, "summary_high_tariff_selector", experimentSource4);
        SUMMARY_HIGH_TARIFF_SELECTOR = simplePersistentBooleanExperiment17;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment18 = new SimplePersistentBooleanExperiment("SETUP_INITIAL_GEO_LOCATION", 17, "setup_initial_geo_location", experimentSource);
        SETUP_INITIAL_GEO_LOCATION = simplePersistentBooleanExperiment18;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment19 = new SimplePersistentBooleanExperiment("AUTO_UPDATE_SOURCE_POINT", 18, "auto_update_source_point", experimentSource);
        AUTO_UPDATE_SOURCE_POINT = simplePersistentBooleanExperiment19;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment20 = new SimplePersistentBooleanExperiment("PAYMENT_METHODS_NAME_EDITOR", 19, "payment_method_name_editing_experiment", experimentSource);
        PAYMENT_METHODS_NAME_EDITOR = simplePersistentBooleanExperiment20;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment21 = new SimplePersistentBooleanExperiment("SCOOTERS_CLIENT_PLUS_PLAQUE", 20, "scooters_client_plus_plaque", experimentSource3);
        SCOOTERS_CLIENT_PLUS_PLAQUE = simplePersistentBooleanExperiment21;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment22 = new SimplePersistentBooleanExperiment("SCOOTERS_CLIENT_ORDER_SELECTOR", 21, "scooters_client_order_selector", experimentSource3);
        SCOOTERS_CLIENT_ORDER_SELECTOR = simplePersistentBooleanExperiment22;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment23 = new SimplePersistentBooleanExperiment("SCOOTERS_CLIENT_ZONE_WITH_BIKES", 22, "scooters_client_zone_with_bikes", experimentSource3);
        SCOOTERS_CLIENT_ZONE_WITH_BIKES = simplePersistentBooleanExperiment23;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment24 = new SimplePersistentBooleanExperiment("SCOOTERS_CLIENT_MAP_ROTATABLE", 23, "scooters_client_map_rotatable", experimentSource3);
        SCOOTERS_CLIENT_MAP_ROTATABLE = simplePersistentBooleanExperiment24;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment25 = new SimplePersistentBooleanExperiment("DISABLE_LBS_PROVIDER", 24, "disable_lbs_provider", experimentSource);
        DISABLE_LBS_PROVIDER = simplePersistentBooleanExperiment25;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment26 = new SimplePersistentBooleanExperiment("SEND_MONITORING_LBS_ANALYTICS", 25, "send_monitoring_lbs_analytics", experimentSource4);
        SEND_MONITORING_LBS_ANALYTICS = simplePersistentBooleanExperiment26;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment27 = new SimplePersistentBooleanExperiment("SEND_GEO_PROVIDERS_ANALYTICS", 26, "send_geo_providers_analytics", experimentSource4);
        SEND_GEO_PROVIDERS_ANALYTICS = simplePersistentBooleanExperiment27;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment28 = new SimplePersistentBooleanExperiment("FORCED_PASSPORT_PROCESS_START", 27, "forced_passport_process_start", experimentSource);
        FORCED_PASSPORT_PROCESS_START = simplePersistentBooleanExperiment28;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment29 = new SimplePersistentBooleanExperiment("TRUSTED_CONTACTS_V2", 28, "trusted_contatcs_v2", experimentSource);
        TRUSTED_CONTACTS_V2 = simplePersistentBooleanExperiment29;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment30 = new SimplePersistentBooleanExperiment("PLACES_ORGANIZATION_SNIPPET_V2", 29, "places_organization_snippet_v2", experimentSource4);
        PLACES_ORGANIZATION_SNIPPET_V2 = simplePersistentBooleanExperiment30;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment31 = new SimplePersistentBooleanExperiment("PLACES_USE_NATIVE_NAVIGATION", 30, "places_use_native_navigation", experimentSource);
        PLACES_USE_NATIVE_NAVIGATION = simplePersistentBooleanExperiment31;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment32 = new SimplePersistentBooleanExperiment("MARKETPLACE_OPEN_ALL_CHATS", 31, "marketplace_open_all_chats", experimentSource4);
        MARKETPLACE_OPEN_ALL_CHATS = simplePersistentBooleanExperiment32;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment33 = new SimplePersistentBooleanExperiment("ENABLE_APP_INFO_COPY", 32, "enable_app_info_copy", experimentSource);
        ENABLE_APP_INFO_COPY = simplePersistentBooleanExperiment33;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment34 = new SimplePersistentBooleanExperiment("SUPERAPP_COMMUNICATIONS_RESTRICTED_CACHE", 33, "superapp_communications_restricted_cache", experimentSource2);
        SUPERAPP_COMMUNICATIONS_RESTRICTED_CACHE = simplePersistentBooleanExperiment34;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment35 = new SimplePersistentBooleanExperiment("DELIVERY_PUSH_REPLACING", 34, "delivery_push_replacing", experimentSource4);
        DELIVERY_PUSH_REPLACING = simplePersistentBooleanExperiment35;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment36 = new SimplePersistentBooleanExperiment("PRECISE_LOCATION_ENABLED", 35, "precise_location_enabled", experimentSource);
        PRECISE_LOCATION_ENABLED = simplePersistentBooleanExperiment36;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment37 = new SimplePersistentBooleanExperiment("ENABLE_FULLSCREEN_ORDERHISTORY", 36, "enable_fullscreen_orderhistory", experimentSource);
        ENABLE_FULLSCREEN_ORDERHISTORY = simplePersistentBooleanExperiment37;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment38 = new SimplePersistentBooleanExperiment("ENABLE_NATIVE_MESSENGER", 37, "enable_native_messenger", experimentSource);
        ENABLE_NATIVE_MESSENGER = simplePersistentBooleanExperiment38;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment39 = new SimplePersistentBooleanExperiment("SUPERAPP_BROTLI", 38, "superapp_brotli", experimentSource);
        SUPERAPP_BROTLI = simplePersistentBooleanExperiment39;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment40 = new SimplePersistentBooleanExperiment("SUPERAPP_ADJUST_LIB", 39, "superapp_adjust_lib", experimentSource);
        SUPERAPP_ADJUST_LIB = simplePersistentBooleanExperiment40;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment41 = new SimplePersistentBooleanExperiment("YANGOPAY_PASSPORT_AUTH_PROXY", 40, "yangopay_passport_auth_proxy", experimentSource4);
        YANGOPAY_PASSPORT_AUTH_PROXY = simplePersistentBooleanExperiment41;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment42 = new SimplePersistentBooleanExperiment("ENABLE_MAP_MODELS_OPTIMIZATION", 41, "enable_map_models_optimization", experimentSource);
        ENABLE_MAP_MODELS_OPTIMIZATION = simplePersistentBooleanExperiment42;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment43 = new SimplePersistentBooleanExperiment("SUPERAPP_WEB_VIEW_WARM_UP", 42, "superapp_web_view_warm_up", experimentSource);
        SUPERAPP_WEB_VIEW_WARM_UP = simplePersistentBooleanExperiment43;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment44 = new SimplePersistentBooleanExperiment("FAVORITE_USERPLACES_LIST_V2", 43, "userplaces_v2_list", experimentSource);
        FAVORITE_USERPLACES_LIST_V2 = simplePersistentBooleanExperiment44;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment45 = new SimplePersistentBooleanExperiment("USE_USER_CONFIG_REQUEST", 44, "use_user_config_request", experimentSource);
        USE_USER_CONFIG_REQUEST = simplePersistentBooleanExperiment45;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment46 = new SimplePersistentBooleanExperiment("ENABLE_NOTIFICATION_RATING_DECORATIONS", 45, "enable_notification_rating_decorations", experimentSource4);
        ENABLE_NOTIFICATION_RATING_DECORATIONS = simplePersistentBooleanExperiment46;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment47 = new SimplePersistentBooleanExperiment("SUPERAPP_POLLING", 46, "superapp_polling", experimentSource);
        SUPERAPP_POLLING = simplePersistentBooleanExperiment47;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment48 = new SimplePersistentBooleanExperiment("SUPERAPP_MAINSCREEN_WARMUP", 47, "super_app_main_screen_warmup", experimentSource);
        SUPERAPP_MAINSCREEN_WARMUP = simplePersistentBooleanExperiment48;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment49 = new SimplePersistentBooleanExperiment("OPTIMIZED_SHIMMERING", 48, "optimized_shimmering", experimentSource);
        OPTIMIZED_SHIMMERING = simplePersistentBooleanExperiment49;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment50 = new SimplePersistentBooleanExperiment("OPEN_WALLET_BY_SWIPE", 49, "open_wallet_by_swipe", experimentSource);
        OPEN_WALLET_BY_SWIPE = simplePersistentBooleanExperiment50;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment51 = new SimplePersistentBooleanExperiment("TAXIROUTE_ENABLE_ROUTE_CACHE", 50, "taxiroute_enable_route_cache", ExperimentSource.TOTW);
        TAXIROUTE_ENABLE_ROUTE_CACHE = simplePersistentBooleanExperiment51;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment52 = new SimplePersistentBooleanExperiment("QUARK_LOCK", 51, "quark_lock", experimentSource3);
        QUARK_LOCK = simplePersistentBooleanExperiment52;
        SimplePersistentBooleanExperiment simplePersistentBooleanExperiment53 = new SimplePersistentBooleanExperiment("SUPERAPP_DISCOVERY_MAP_TAXI", 52, "superapp_discovery_map_taxi", experimentSource4);
        SUPERAPP_DISCOVERY_MAP_TAXI = simplePersistentBooleanExperiment53;
        SimplePersistentBooleanExperiment[] simplePersistentBooleanExperimentArr = {simplePersistentBooleanExperiment, simplePersistentBooleanExperiment2, simplePersistentBooleanExperiment3, simplePersistentBooleanExperiment4, simplePersistentBooleanExperiment5, simplePersistentBooleanExperiment6, simplePersistentBooleanExperiment7, simplePersistentBooleanExperiment8, simplePersistentBooleanExperiment9, simplePersistentBooleanExperiment10, simplePersistentBooleanExperiment11, simplePersistentBooleanExperiment12, simplePersistentBooleanExperiment13, simplePersistentBooleanExperiment14, simplePersistentBooleanExperiment15, simplePersistentBooleanExperiment16, simplePersistentBooleanExperiment17, simplePersistentBooleanExperiment18, simplePersistentBooleanExperiment19, simplePersistentBooleanExperiment20, simplePersistentBooleanExperiment21, simplePersistentBooleanExperiment22, simplePersistentBooleanExperiment23, simplePersistentBooleanExperiment24, simplePersistentBooleanExperiment25, simplePersistentBooleanExperiment26, simplePersistentBooleanExperiment27, simplePersistentBooleanExperiment28, simplePersistentBooleanExperiment29, simplePersistentBooleanExperiment30, simplePersistentBooleanExperiment31, simplePersistentBooleanExperiment32, simplePersistentBooleanExperiment33, simplePersistentBooleanExperiment34, simplePersistentBooleanExperiment35, simplePersistentBooleanExperiment36, simplePersistentBooleanExperiment37, simplePersistentBooleanExperiment38, simplePersistentBooleanExperiment39, simplePersistentBooleanExperiment40, simplePersistentBooleanExperiment41, simplePersistentBooleanExperiment42, simplePersistentBooleanExperiment43, simplePersistentBooleanExperiment44, simplePersistentBooleanExperiment45, simplePersistentBooleanExperiment46, simplePersistentBooleanExperiment47, simplePersistentBooleanExperiment48, simplePersistentBooleanExperiment49, simplePersistentBooleanExperiment50, simplePersistentBooleanExperiment51, simplePersistentBooleanExperiment52, simplePersistentBooleanExperiment53};
        $VALUES = simplePersistentBooleanExperimentArr;
        $ENTRIES = kotlin.enums.a.a(simplePersistentBooleanExperimentArr);
    }

    public SimplePersistentBooleanExperiment(String str, int i, String str2, ExperimentSource experimentSource) {
        this.id = str2;
        this.source = experimentSource;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SimplePersistentBooleanExperiment valueOf(String str) {
        return (SimplePersistentBooleanExperiment) Enum.valueOf(SimplePersistentBooleanExperiment.class, str);
    }

    public static SimplePersistentBooleanExperiment[] values() {
        return (SimplePersistentBooleanExperiment[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final ExperimentSource getSource() {
        return this.source;
    }

    public final String getId() {
        return this.id;
    }
}
