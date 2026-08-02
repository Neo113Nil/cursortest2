package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class WebViewFeatureInternal {
    public static final ApiFeature$M FORCE_DARK;
    public static final ApiFeature$M FORCE_DARK_STRATEGY;
    public static final ApiFeature$M MULTI_PROCESS;
    public static final ApiFeature$M PROXY_OVERRIDE;
    public static final ApiFeature$M PROXY_OVERRIDE_REVERSE_BYPASS;
    public static final ApiFeature$M SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;

    static {
        new ApiFeature$M("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", 0);
        new ApiFeature$M("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", 0);
        new ApiFeature$M("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", 4);
        new ApiFeature$M("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", 1);
        new ApiFeature$M("START_SAFE_BROWSING", "START_SAFE_BROWSING", 5);
        new ApiFeature$M("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", 5);
        new ApiFeature$M("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", 5);
        new ApiFeature$M("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", 5);
        new ApiFeature$M("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", 5);
        new ApiFeature$M("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", 5);
        new ApiFeature$M("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", 1);
        new ApiFeature$M("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", 1);
        new ApiFeature$M("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", 1);
        new ApiFeature$M("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", 1);
        new ApiFeature$M("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", 1);
        new ApiFeature$M("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 1);
        new ApiFeature$M("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", 0);
        new ApiFeature$M("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", 0);
        new ApiFeature$M("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", 1);
        new ApiFeature$M("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", 5);
        new ApiFeature$M("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", 1);
        new ApiFeature$M("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", 0);
        new ApiFeature$M("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", 0);
        new ApiFeature$M("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 5);
        new ApiFeature$M("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", 5);
        SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL = new ApiFeature$M("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 5);
        new ApiFeature$M("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", 0);
        new ApiFeature$M("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", 0);
        new ApiFeature$M("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", 2);
        new ApiFeature$M("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 0);
        new ApiFeature$M("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", 0);
        new ApiFeature$M("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", 0);
        new ApiFeature$M("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", 0);
        new ApiFeature$M("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", 4);
        new ApiFeature$M("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", 4);
        new ApiFeature$M("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", 7);
        new ApiFeature$M("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", 7);
        new ApiFeature$M("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", 6);
        new Object() { // from class: androidx.webkit.internal.StartupApiFeature$P
            public static final HashSet sValues = new HashSet();

            {
                sValues.add(this);
            }
        };
        new Object() { // from class: androidx.webkit.internal.StartupApiFeature$P
            public static final HashSet sValues = new HashSet();

            {
                sValues.add(this);
            }
        };
        new Object() { // from class: androidx.webkit.internal.StartupApiFeature$P
            public static final HashSet sValues = new HashSet();

            {
                sValues.add(this);
            }
        };
        new ApiFeature$M("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 7);
        new ApiFeature$M("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING", 8);
        Pattern.compile("\\A\\d+");
        PROXY_OVERRIDE = new ApiFeature$M("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", 2);
        MULTI_PROCESS = new ApiFeature$M("MULTI_PROCESS", "MULTI_PROCESS_QUERY", 2);
        FORCE_DARK = new ApiFeature$M("FORCE_DARK", "FORCE_DARK", 7);
        FORCE_DARK_STRATEGY = new ApiFeature$M("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", 2);
        new ApiFeature$M("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", 2);
        new ApiFeature$M("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", 2);
        PROXY_OVERRIDE_REVERSE_BYPASS = new ApiFeature$M("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", 2);
        new ApiFeature$M("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", 2);
        new ApiFeature$M("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", 2);
        new ApiFeature$M("GET_COOKIE_INFO", "GET_COOKIE_INFO", 2);
        new ApiFeature$M("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", 2);
        new ApiFeature$M("USER_AGENT_METADATA", "USER_AGENT_METADATA", 2);
        final int i = 0;
        new ApiFeature$M("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA") { // from class: androidx.webkit.internal.WebViewFeatureInternal.2
            @Override // androidx.webkit.internal.ApiFeature$M
            public final boolean isSupportedByWebView() {
                switch (i) {
                    case 0:
                        if (!super.isSupportedByWebView()) {
                            return false;
                        }
                        Uri uri = WebViewCompat.WILDCARD_URI;
                        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                        return currentWebViewPackage != null && currentWebViewPackage.getLongVersionCode() >= 636700000;
                    case 1:
                        if (!super.isSupportedByWebView() || !WebViewFeature.isFeatureSupported("MULTI_PROCESS")) {
                            return false;
                        }
                        Uri uri2 = WebViewCompat.WILDCARD_URI;
                        if (WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
                            return WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE.getStatics().isMultiProcessEnabled();
                        }
                        throw WebViewFeatureInternal.getUnsupportedOperationException();
                    default:
                        if (WebViewFeature.isFeatureSupported("MULTI_PROFILE")) {
                            return super.isSupportedByWebView();
                        }
                        return false;
                }
            }
        };
        final int i2 = 1;
        new ApiFeature$M("MULTI_PROFILE", "MULTI_PROFILE") { // from class: androidx.webkit.internal.WebViewFeatureInternal.2
            @Override // androidx.webkit.internal.ApiFeature$M
            public final boolean isSupportedByWebView() {
                switch (i2) {
                    case 0:
                        if (!super.isSupportedByWebView()) {
                            return false;
                        }
                        Uri uri = WebViewCompat.WILDCARD_URI;
                        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                        return currentWebViewPackage != null && currentWebViewPackage.getLongVersionCode() >= 636700000;
                    case 1:
                        if (!super.isSupportedByWebView() || !WebViewFeature.isFeatureSupported("MULTI_PROCESS")) {
                            return false;
                        }
                        Uri uri2 = WebViewCompat.WILDCARD_URI;
                        if (WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
                            return WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE.getStatics().isMultiProcessEnabled();
                        }
                        throw WebViewFeatureInternal.getUnsupportedOperationException();
                    default:
                        if (WebViewFeature.isFeatureSupported("MULTI_PROFILE")) {
                            return super.isSupportedByWebView();
                        }
                        return false;
                }
            }
        };
        final int i3 = 2;
        new ApiFeature$M("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", 2);
        new ApiFeature$M("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", 2);
        new ApiFeature$M("MUTE_AUDIO", "MUTE_AUDIO", 2);
        new ApiFeature$M("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", 2);
        new ApiFeature$M("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", 2);
        new ApiFeature$M("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", 2);
        new ApiFeature$M("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS", 2);
        new ApiFeature$M("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V3", "BACK_FORWARD_CACHE_SETTINGS_V3", 2);
        new ApiFeature$M("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V4", "BACK_FORWARD_CACHE_SETTINGS_V4", 2);
        new ApiFeature$M("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA", 2);
        new ApiFeature$M("PREFETCH_URL_V5", "PREFETCH_URL_V5") { // from class: androidx.webkit.internal.WebViewFeatureInternal.2
            @Override // androidx.webkit.internal.ApiFeature$M
            public final boolean isSupportedByWebView() {
                switch (i3) {
                    case 0:
                        if (!super.isSupportedByWebView()) {
                            return false;
                        }
                        Uri uri = WebViewCompat.WILDCARD_URI;
                        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                        return currentWebViewPackage != null && currentWebViewPackage.getLongVersionCode() >= 636700000;
                    case 1:
                        if (!super.isSupportedByWebView() || !WebViewFeature.isFeatureSupported("MULTI_PROCESS")) {
                            return false;
                        }
                        Uri uri2 = WebViewCompat.WILDCARD_URI;
                        if (WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
                            return WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE.getStatics().isMultiProcessEnabled();
                        }
                        throw WebViewFeatureInternal.getUnsupportedOperationException();
                    default:
                        if (WebViewFeature.isFeatureSupported("MULTI_PROFILE")) {
                            return super.isSupportedByWebView();
                        }
                        return false;
                }
            }
        };
        new ApiFeature$M("ASYNC_WEBVIEW_STARTUP_V2");
        new ApiFeature$M("ASYNC_WEBVIEW_STARTUP");
        new ApiFeature$M("ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
        new ApiFeature$M("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING", 2);
        new ApiFeature$M("PRERENDER_URL_V2", "PRERENDER_URL_V3", 2);
        new ApiFeature$M("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2", 2);
        new ApiFeature$M("PREFETCH_CACHE_V1", "PREFETCH_CACHE_V1", 2);
        new ApiFeature$M("SET_MAX_PRERENDERS_V1", "SET_MAX_PRERENDERS_V1", 2);
        new ApiFeature$M("SAVE_STATE", "SAVE_STATE", 2);
        new ApiFeature$M("NAVIGATION_GET_WEB_RESOURCE_ERROR", "NAVIGATION_GET_WEB_RESOURCE_ERROR", 2);
        new ApiFeature$M("NAVIGATION_LISTENER", "PAGE_GET_URL", 2);
        new ApiFeature$M("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW", 2);
        new ApiFeature$M("PAYMENT_REQUEST", "PAYMENT_REQUEST", 2);
        new ApiFeature$M("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1", 2);
        new ApiFeature$M("WEBVIEW_BUILDER_EXPERIMENTAL_V2", "WEBVIEW_BUILDER_V2", 2);
        new ApiFeature$M("COOKIE_INTERCEPT", "COOKIE_INTERCEPT", 2);
        new ApiFeature$M("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS", 2);
        new ApiFeature$M("ORIGIN_MATCHED_HEADERS", "EXTRA_HEADER_FOR_ORIGINS", 2);
        new ApiFeature$M("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS", 2);
        new Object() { // from class: androidx.webkit.internal.StartupApiFeature$P
            public static final HashSet sValues = new HashSet();

            {
                sValues.add(this);
            }
        };
        new Object() { // from class: androidx.webkit.internal.StartupApiFeature$P
            public static final HashSet sValues = new HashSet();

            {
                sValues.add(this);
            }
        };
        new Object() { // from class: androidx.webkit.internal.StartupApiFeature$P
            public static final HashSet sValues = new HashSet();

            {
                sValues.add(this);
            }
        };
        new ApiFeature$M("PRECONNECT", "PRECONNECT", 2);
        new ApiFeature$M("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1", 2);
        new ApiFeature$M("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS", 2);
        new ApiFeature$M("JS_INJECTION_IN_FRAME_AND_WORLD", "JS_INJECTION_IN_FRAME_AND_WORLD", 2);
    }

    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
