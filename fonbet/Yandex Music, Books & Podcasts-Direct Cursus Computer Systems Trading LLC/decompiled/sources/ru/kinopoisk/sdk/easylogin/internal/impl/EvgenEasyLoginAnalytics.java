package ru.kinopoisk.sdk.easylogin.internal.impl;

import com.appsflyer.internal.k;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eta;
import defpackage.j66;
import defpackage.ouj;
import defpackage.qdb;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\r89:;<=>?@ABCDB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0002J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0013H\u0002J.\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020!J\u001e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bJ&\u0010&\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bJ.\u0010(\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020)J>\u0010*\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020+J\u001e\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001e\u001a\u000200J.\u00101\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001a\u001a\u0002022\u0006\u0010\u001e\u001a\u000203J\u0016\u00104\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001a\u001a\u000205J&\u00106\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001a\u001a\u000207R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics;", "", "eventTracker", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsTracker;", "globalParamsProvider", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParamsProvider;", "platformParamsProvider", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsPlatformParamsProvider;", "(Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsTracker;Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParamsProvider;Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsPlatformParamsProvider;)V", "makeMeta", "", "", "event_version", "", "interfaces", "trackEvent", "", NetcastTVService.UDAP_API_EVENT, "parameters", "", "tvAuthorizationErrorRaised", "errorType", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$ErrorType;", "errorTitle", "errorMessage", "requestId", "windowName", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvAuthorizationErrorRaisedWindowName;", "tvAuthorizationSelected", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvAuthorizationSelectedWindowName;", "buttonName", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvAuthorizationSelectedButtonName;", "tvAuthorizationShowed", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvAuthorizationShowedWindowName;", "tvAuthorizationTVFound", "tvCount", "vendor", CommonUrlParts.MODEL, "tvAuthorizationTVSelected", "position", "tvFoundErrorRaised", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundErrorRaisedWindowName;", "tvFoundErrorRaisedV2", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundErrorRaisedV2WindowName;", "tvFoundSelected", "supportFastLogin", "", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundSelectedWindowName;", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundSelectedButtonName;", "tvFoundSelectedV2", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundSelectedV2WindowName;", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundSelectedV2ButtonName;", "tvFoundShowed", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundShowedWindowName;", "tvFoundShowedV2", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundShowedV2WindowName;", "ErrorType", "TvAuthorizationErrorRaisedWindowName", "TvAuthorizationSelectedButtonName", "TvAuthorizationSelectedWindowName", "TvAuthorizationShowedWindowName", "TvFoundErrorRaisedV2WindowName", "TvFoundErrorRaisedWindowName", "TvFoundSelectedButtonName", "TvFoundSelectedV2ButtonName", "TvFoundSelectedV2WindowName", "TvFoundSelectedWindowName", "TvFoundShowedV2WindowName", "TvFoundShowedWindowName", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class EvgenEasyLoginAnalytics {

    @NotNull
    private final EvgenEasyLoginAnalyticsTracker eventTracker;

    @NotNull
    private final EvgenEasyLoginAnalyticsGlobalParamsProvider globalParamsProvider;

    @NotNull
    private final EvgenEasyLoginAnalyticsPlatformParamsProvider platformParamsProvider;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$ErrorType;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "AppError", "NetworkError", "ParserError", "BackendError", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class ErrorType {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final ErrorType AppError = new ErrorType("AppError", 0, "app_error");
        public static final ErrorType NetworkError = new ErrorType("NetworkError", 1, "network_error");
        public static final ErrorType ParserError = new ErrorType("ParserError", 2, "parser_error");
        public static final ErrorType BackendError = new ErrorType("BackendError", 3, "backend_error");

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{AppError, NetworkError, ParserError, BackendError};
        }

        static {
            ErrorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private ErrorType(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvAuthorizationErrorRaisedWindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "DoYouHaveTv", "NoPermission", "DoYouHaveTvRepeat", "LetsFindIt", "LetsFindItLoading", "CantFind", "LetsFindItList", "SomethingWithWifi", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvAuthorizationErrorRaisedWindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvAuthorizationErrorRaisedWindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvAuthorizationErrorRaisedWindowName DoYouHaveTv = new TvAuthorizationErrorRaisedWindowName("DoYouHaveTv", 0, "do_you_have_tv");
        public static final TvAuthorizationErrorRaisedWindowName NoPermission = new TvAuthorizationErrorRaisedWindowName("NoPermission", 1, "no_permission");
        public static final TvAuthorizationErrorRaisedWindowName DoYouHaveTvRepeat = new TvAuthorizationErrorRaisedWindowName("DoYouHaveTvRepeat", 2, "do_you_have_tv_repeat");
        public static final TvAuthorizationErrorRaisedWindowName LetsFindIt = new TvAuthorizationErrorRaisedWindowName("LetsFindIt", 3, "lets_find_it");
        public static final TvAuthorizationErrorRaisedWindowName LetsFindItLoading = new TvAuthorizationErrorRaisedWindowName("LetsFindItLoading", 4, "lets_find_it_loading");
        public static final TvAuthorizationErrorRaisedWindowName CantFind = new TvAuthorizationErrorRaisedWindowName("CantFind", 5, "cant_find");
        public static final TvAuthorizationErrorRaisedWindowName LetsFindItList = new TvAuthorizationErrorRaisedWindowName("LetsFindItList", 6, "lets_find_it_list");
        public static final TvAuthorizationErrorRaisedWindowName SomethingWithWifi = new TvAuthorizationErrorRaisedWindowName("SomethingWithWifi", 7, "something_with_wifi");

        private static final /* synthetic */ TvAuthorizationErrorRaisedWindowName[] $values() {
            return new TvAuthorizationErrorRaisedWindowName[]{DoYouHaveTv, NoPermission, DoYouHaveTvRepeat, LetsFindIt, LetsFindItLoading, CantFind, LetsFindItList, SomethingWithWifi};
        }

        static {
            TvAuthorizationErrorRaisedWindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvAuthorizationErrorRaisedWindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvAuthorizationErrorRaisedWindowName valueOf(String str) {
            return (TvAuthorizationErrorRaisedWindowName) Enum.valueOf(TvAuthorizationErrorRaisedWindowName.class, str);
        }

        public static TvAuthorizationErrorRaisedWindowName[] values() {
            return (TvAuthorizationErrorRaisedWindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvAuthorizationSelectedButtonName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "Close", "Yes", "No", "RemindLater", "Find", "NotNow", "Allow", "Forbid", "ToSettings", "Ok", "INeedHelp", "TryAgain", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvAuthorizationSelectedButtonName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvAuthorizationSelectedButtonName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvAuthorizationSelectedButtonName Close = new TvAuthorizationSelectedButtonName("Close", 0, "close");
        public static final TvAuthorizationSelectedButtonName Yes = new TvAuthorizationSelectedButtonName("Yes", 1, "yes");
        public static final TvAuthorizationSelectedButtonName No = new TvAuthorizationSelectedButtonName("No", 2, "no");
        public static final TvAuthorizationSelectedButtonName RemindLater = new TvAuthorizationSelectedButtonName("RemindLater", 3, "remind_later");
        public static final TvAuthorizationSelectedButtonName Find = new TvAuthorizationSelectedButtonName("Find", 4, "find");
        public static final TvAuthorizationSelectedButtonName NotNow = new TvAuthorizationSelectedButtonName("NotNow", 5, "not_now");
        public static final TvAuthorizationSelectedButtonName Allow = new TvAuthorizationSelectedButtonName("Allow", 6, "allow");
        public static final TvAuthorizationSelectedButtonName Forbid = new TvAuthorizationSelectedButtonName("Forbid", 7, "forbid");
        public static final TvAuthorizationSelectedButtonName ToSettings = new TvAuthorizationSelectedButtonName("ToSettings", 8, "to_settings");
        public static final TvAuthorizationSelectedButtonName Ok = new TvAuthorizationSelectedButtonName("Ok", 9, "ok");
        public static final TvAuthorizationSelectedButtonName INeedHelp = new TvAuthorizationSelectedButtonName("INeedHelp", 10, "i_need_help");
        public static final TvAuthorizationSelectedButtonName TryAgain = new TvAuthorizationSelectedButtonName("TryAgain", 11, "try_again");

        private static final /* synthetic */ TvAuthorizationSelectedButtonName[] $values() {
            return new TvAuthorizationSelectedButtonName[]{Close, Yes, No, RemindLater, Find, NotNow, Allow, Forbid, ToSettings, Ok, INeedHelp, TryAgain};
        }

        static {
            TvAuthorizationSelectedButtonName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvAuthorizationSelectedButtonName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvAuthorizationSelectedButtonName valueOf(String str) {
            return (TvAuthorizationSelectedButtonName) Enum.valueOf(TvAuthorizationSelectedButtonName.class, str);
        }

        public static TvAuthorizationSelectedButtonName[] values() {
            return (TvAuthorizationSelectedButtonName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvAuthorizationSelectedWindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "DoYouHaveTv", "NoPermission", "DoYouHaveTvRepeat", "LetsFindIt", "LetsFindItLoading", "CantFind", "LetsFindItList", "SomethingWithWifi", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvAuthorizationSelectedWindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvAuthorizationSelectedWindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvAuthorizationSelectedWindowName DoYouHaveTv = new TvAuthorizationSelectedWindowName("DoYouHaveTv", 0, "do_you_have_tv");
        public static final TvAuthorizationSelectedWindowName NoPermission = new TvAuthorizationSelectedWindowName("NoPermission", 1, "no_permission");
        public static final TvAuthorizationSelectedWindowName DoYouHaveTvRepeat = new TvAuthorizationSelectedWindowName("DoYouHaveTvRepeat", 2, "do_you_have_tv_repeat");
        public static final TvAuthorizationSelectedWindowName LetsFindIt = new TvAuthorizationSelectedWindowName("LetsFindIt", 3, "lets_find_it");
        public static final TvAuthorizationSelectedWindowName LetsFindItLoading = new TvAuthorizationSelectedWindowName("LetsFindItLoading", 4, "lets_find_it_loading");
        public static final TvAuthorizationSelectedWindowName CantFind = new TvAuthorizationSelectedWindowName("CantFind", 5, "cant_find");
        public static final TvAuthorizationSelectedWindowName LetsFindItList = new TvAuthorizationSelectedWindowName("LetsFindItList", 6, "lets_find_it_list");
        public static final TvAuthorizationSelectedWindowName SomethingWithWifi = new TvAuthorizationSelectedWindowName("SomethingWithWifi", 7, "something_with_wifi");

        private static final /* synthetic */ TvAuthorizationSelectedWindowName[] $values() {
            return new TvAuthorizationSelectedWindowName[]{DoYouHaveTv, NoPermission, DoYouHaveTvRepeat, LetsFindIt, LetsFindItLoading, CantFind, LetsFindItList, SomethingWithWifi};
        }

        static {
            TvAuthorizationSelectedWindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvAuthorizationSelectedWindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvAuthorizationSelectedWindowName valueOf(String str) {
            return (TvAuthorizationSelectedWindowName) Enum.valueOf(TvAuthorizationSelectedWindowName.class, str);
        }

        public static TvAuthorizationSelectedWindowName[] values() {
            return (TvAuthorizationSelectedWindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvAuthorizationShowedWindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "DoYouHaveTv", "NoPermission", "DoYouHaveTvRepeat", "LetsFindIt", "LetsFindItLoading", "CantFind", "LetsFindItList", "SomethingWithWifi", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvAuthorizationShowedWindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvAuthorizationShowedWindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvAuthorizationShowedWindowName DoYouHaveTv = new TvAuthorizationShowedWindowName("DoYouHaveTv", 0, "do_you_have_tv");
        public static final TvAuthorizationShowedWindowName NoPermission = new TvAuthorizationShowedWindowName("NoPermission", 1, "no_permission");
        public static final TvAuthorizationShowedWindowName DoYouHaveTvRepeat = new TvAuthorizationShowedWindowName("DoYouHaveTvRepeat", 2, "do_you_have_tv_repeat");
        public static final TvAuthorizationShowedWindowName LetsFindIt = new TvAuthorizationShowedWindowName("LetsFindIt", 3, "lets_find_it");
        public static final TvAuthorizationShowedWindowName LetsFindItLoading = new TvAuthorizationShowedWindowName("LetsFindItLoading", 4, "lets_find_it_loading");
        public static final TvAuthorizationShowedWindowName CantFind = new TvAuthorizationShowedWindowName("CantFind", 5, "cant_find");
        public static final TvAuthorizationShowedWindowName LetsFindItList = new TvAuthorizationShowedWindowName("LetsFindItList", 6, "lets_find_it_list");
        public static final TvAuthorizationShowedWindowName SomethingWithWifi = new TvAuthorizationShowedWindowName("SomethingWithWifi", 7, "something_with_wifi");

        private static final /* synthetic */ TvAuthorizationShowedWindowName[] $values() {
            return new TvAuthorizationShowedWindowName[]{DoYouHaveTv, NoPermission, DoYouHaveTvRepeat, LetsFindIt, LetsFindItLoading, CantFind, LetsFindItList, SomethingWithWifi};
        }

        static {
            TvAuthorizationShowedWindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvAuthorizationShowedWindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvAuthorizationShowedWindowName valueOf(String str) {
            return (TvAuthorizationShowedWindowName) Enum.valueOf(TvAuthorizationShowedWindowName.class, str);
        }

        public static TvAuthorizationShowedWindowName[] values() {
            return (TvAuthorizationShowedWindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundErrorRaisedV2WindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "OpenTvApp", "OpenTvAppConnecting", "CantAutoLogin", "Done", "CheckTvCode", "AskNewTvCode", "ClickInstall", "AppInstalled", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvFoundErrorRaisedV2WindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvFoundErrorRaisedV2WindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvFoundErrorRaisedV2WindowName OpenTvApp = new TvFoundErrorRaisedV2WindowName("OpenTvApp", 0, "open_tv_app");
        public static final TvFoundErrorRaisedV2WindowName OpenTvAppConnecting = new TvFoundErrorRaisedV2WindowName("OpenTvAppConnecting", 1, "open_tv_app_connecting");
        public static final TvFoundErrorRaisedV2WindowName CantAutoLogin = new TvFoundErrorRaisedV2WindowName("CantAutoLogin", 2, "cant_auto_login");
        public static final TvFoundErrorRaisedV2WindowName Done = new TvFoundErrorRaisedV2WindowName("Done", 3, "done");
        public static final TvFoundErrorRaisedV2WindowName CheckTvCode = new TvFoundErrorRaisedV2WindowName("CheckTvCode", 4, "check_tv_code");
        public static final TvFoundErrorRaisedV2WindowName AskNewTvCode = new TvFoundErrorRaisedV2WindowName("AskNewTvCode", 5, "ask_new_tv_code");
        public static final TvFoundErrorRaisedV2WindowName ClickInstall = new TvFoundErrorRaisedV2WindowName("ClickInstall", 6, "click_install");
        public static final TvFoundErrorRaisedV2WindowName AppInstalled = new TvFoundErrorRaisedV2WindowName("AppInstalled", 7, "app_installed");

        private static final /* synthetic */ TvFoundErrorRaisedV2WindowName[] $values() {
            return new TvFoundErrorRaisedV2WindowName[]{OpenTvApp, OpenTvAppConnecting, CantAutoLogin, Done, CheckTvCode, AskNewTvCode, ClickInstall, AppInstalled};
        }

        static {
            TvFoundErrorRaisedV2WindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvFoundErrorRaisedV2WindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvFoundErrorRaisedV2WindowName valueOf(String str) {
            return (TvFoundErrorRaisedV2WindowName) Enum.valueOf(TvFoundErrorRaisedV2WindowName.class, str);
        }

        public static TvFoundErrorRaisedV2WindowName[] values() {
            return (TvFoundErrorRaisedV2WindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundErrorRaisedWindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "OpenTvApp", "OpenTvAppConnecting", "CantAutoLogin", "Done", "CheckTvCode", "AskNewTvCode", "ClickInstall", "AppInstalled", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvFoundErrorRaisedWindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvFoundErrorRaisedWindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvFoundErrorRaisedWindowName OpenTvApp = new TvFoundErrorRaisedWindowName("OpenTvApp", 0, "open_tv_app");
        public static final TvFoundErrorRaisedWindowName OpenTvAppConnecting = new TvFoundErrorRaisedWindowName("OpenTvAppConnecting", 1, "open_tv_app_connecting");
        public static final TvFoundErrorRaisedWindowName CantAutoLogin = new TvFoundErrorRaisedWindowName("CantAutoLogin", 2, "cant_auto_login");
        public static final TvFoundErrorRaisedWindowName Done = new TvFoundErrorRaisedWindowName("Done", 3, "done");
        public static final TvFoundErrorRaisedWindowName CheckTvCode = new TvFoundErrorRaisedWindowName("CheckTvCode", 4, "check_tv_code");
        public static final TvFoundErrorRaisedWindowName AskNewTvCode = new TvFoundErrorRaisedWindowName("AskNewTvCode", 5, "ask_new_tv_code");
        public static final TvFoundErrorRaisedWindowName ClickInstall = new TvFoundErrorRaisedWindowName("ClickInstall", 6, "click_install");
        public static final TvFoundErrorRaisedWindowName AppInstalled = new TvFoundErrorRaisedWindowName("AppInstalled", 7, "app_installed");

        private static final /* synthetic */ TvFoundErrorRaisedWindowName[] $values() {
            return new TvFoundErrorRaisedWindowName[]{OpenTvApp, OpenTvAppConnecting, CantAutoLogin, Done, CheckTvCode, AskNewTvCode, ClickInstall, AppInstalled};
        }

        static {
            TvFoundErrorRaisedWindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvFoundErrorRaisedWindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvFoundErrorRaisedWindowName valueOf(String str) {
            return (TvFoundErrorRaisedWindowName) Enum.valueOf(TvFoundErrorRaisedWindowName.class, str);
        }

        public static TvFoundErrorRaisedWindowName[] values() {
            return (TvFoundErrorRaisedWindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundSelectedButtonName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "Back", "Close", "Ok", "INeedHelp", "KpAlreadyOpen", "ApproveEnter", "ChangeAccount", "Great", "AskNewCode", "TryAgain", "NotNow", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvFoundSelectedButtonName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvFoundSelectedButtonName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvFoundSelectedButtonName Back = new TvFoundSelectedButtonName("Back", 0, "back");
        public static final TvFoundSelectedButtonName Close = new TvFoundSelectedButtonName("Close", 1, "close");
        public static final TvFoundSelectedButtonName Ok = new TvFoundSelectedButtonName("Ok", 2, "ok");
        public static final TvFoundSelectedButtonName INeedHelp = new TvFoundSelectedButtonName("INeedHelp", 3, "i_need_help");
        public static final TvFoundSelectedButtonName KpAlreadyOpen = new TvFoundSelectedButtonName("KpAlreadyOpen", 4, "kp_already_open");
        public static final TvFoundSelectedButtonName ApproveEnter = new TvFoundSelectedButtonName("ApproveEnter", 5, "approve_enter");
        public static final TvFoundSelectedButtonName ChangeAccount = new TvFoundSelectedButtonName("ChangeAccount", 6, "change_account");
        public static final TvFoundSelectedButtonName Great = new TvFoundSelectedButtonName("Great", 7, "great");
        public static final TvFoundSelectedButtonName AskNewCode = new TvFoundSelectedButtonName("AskNewCode", 8, "ask_new_code");
        public static final TvFoundSelectedButtonName TryAgain = new TvFoundSelectedButtonName("TryAgain", 9, "try_again");
        public static final TvFoundSelectedButtonName NotNow = new TvFoundSelectedButtonName("NotNow", 10, "not_now");

        private static final /* synthetic */ TvFoundSelectedButtonName[] $values() {
            return new TvFoundSelectedButtonName[]{Back, Close, Ok, INeedHelp, KpAlreadyOpen, ApproveEnter, ChangeAccount, Great, AskNewCode, TryAgain, NotNow};
        }

        static {
            TvFoundSelectedButtonName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvFoundSelectedButtonName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvFoundSelectedButtonName valueOf(String str) {
            return (TvFoundSelectedButtonName) Enum.valueOf(TvFoundSelectedButtonName.class, str);
        }

        public static TvFoundSelectedButtonName[] values() {
            return (TvFoundSelectedButtonName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundSelectedV2ButtonName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "Back", "Close", "Ok", "INeedHelp", "KpAlreadyOpen", "ApproveEnter", "ChangeAccount", "Great", "AskNewCode", "TryAgain", "NotNow", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvFoundSelectedV2ButtonName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvFoundSelectedV2ButtonName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvFoundSelectedV2ButtonName Back = new TvFoundSelectedV2ButtonName("Back", 0, "back");
        public static final TvFoundSelectedV2ButtonName Close = new TvFoundSelectedV2ButtonName("Close", 1, "close");
        public static final TvFoundSelectedV2ButtonName Ok = new TvFoundSelectedV2ButtonName("Ok", 2, "ok");
        public static final TvFoundSelectedV2ButtonName INeedHelp = new TvFoundSelectedV2ButtonName("INeedHelp", 3, "i_need_help");
        public static final TvFoundSelectedV2ButtonName KpAlreadyOpen = new TvFoundSelectedV2ButtonName("KpAlreadyOpen", 4, "kp_already_open");
        public static final TvFoundSelectedV2ButtonName ApproveEnter = new TvFoundSelectedV2ButtonName("ApproveEnter", 5, "approve_enter");
        public static final TvFoundSelectedV2ButtonName ChangeAccount = new TvFoundSelectedV2ButtonName("ChangeAccount", 6, "change_account");
        public static final TvFoundSelectedV2ButtonName Great = new TvFoundSelectedV2ButtonName("Great", 7, "great");
        public static final TvFoundSelectedV2ButtonName AskNewCode = new TvFoundSelectedV2ButtonName("AskNewCode", 8, "ask_new_code");
        public static final TvFoundSelectedV2ButtonName TryAgain = new TvFoundSelectedV2ButtonName("TryAgain", 9, "try_again");
        public static final TvFoundSelectedV2ButtonName NotNow = new TvFoundSelectedV2ButtonName("NotNow", 10, "not_now");

        private static final /* synthetic */ TvFoundSelectedV2ButtonName[] $values() {
            return new TvFoundSelectedV2ButtonName[]{Back, Close, Ok, INeedHelp, KpAlreadyOpen, ApproveEnter, ChangeAccount, Great, AskNewCode, TryAgain, NotNow};
        }

        static {
            TvFoundSelectedV2ButtonName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvFoundSelectedV2ButtonName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvFoundSelectedV2ButtonName valueOf(String str) {
            return (TvFoundSelectedV2ButtonName) Enum.valueOf(TvFoundSelectedV2ButtonName.class, str);
        }

        public static TvFoundSelectedV2ButtonName[] values() {
            return (TvFoundSelectedV2ButtonName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundSelectedV2WindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "OpenTvApp", "OpenTvAppConnecting", "CantAutoLogin", "Done", "CheckTvCode", "AskNewTvCode", "ClickInstall", "AppInstalled", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvFoundSelectedV2WindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvFoundSelectedV2WindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvFoundSelectedV2WindowName OpenTvApp = new TvFoundSelectedV2WindowName("OpenTvApp", 0, "open_tv_app");
        public static final TvFoundSelectedV2WindowName OpenTvAppConnecting = new TvFoundSelectedV2WindowName("OpenTvAppConnecting", 1, "open_tv_app_connecting");
        public static final TvFoundSelectedV2WindowName CantAutoLogin = new TvFoundSelectedV2WindowName("CantAutoLogin", 2, "cant_auto_login");
        public static final TvFoundSelectedV2WindowName Done = new TvFoundSelectedV2WindowName("Done", 3, "done");
        public static final TvFoundSelectedV2WindowName CheckTvCode = new TvFoundSelectedV2WindowName("CheckTvCode", 4, "check_tv_code");
        public static final TvFoundSelectedV2WindowName AskNewTvCode = new TvFoundSelectedV2WindowName("AskNewTvCode", 5, "ask_new_tv_code");
        public static final TvFoundSelectedV2WindowName ClickInstall = new TvFoundSelectedV2WindowName("ClickInstall", 6, "click_install");
        public static final TvFoundSelectedV2WindowName AppInstalled = new TvFoundSelectedV2WindowName("AppInstalled", 7, "app_installed");

        private static final /* synthetic */ TvFoundSelectedV2WindowName[] $values() {
            return new TvFoundSelectedV2WindowName[]{OpenTvApp, OpenTvAppConnecting, CantAutoLogin, Done, CheckTvCode, AskNewTvCode, ClickInstall, AppInstalled};
        }

        static {
            TvFoundSelectedV2WindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvFoundSelectedV2WindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvFoundSelectedV2WindowName valueOf(String str) {
            return (TvFoundSelectedV2WindowName) Enum.valueOf(TvFoundSelectedV2WindowName.class, str);
        }

        public static TvFoundSelectedV2WindowName[] values() {
            return (TvFoundSelectedV2WindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundSelectedWindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "OpenTvApp", "OpenTvAppConnecting", "CantAutoLogin", "Done", "CheckTvCode", "AskNewTvCode", "ClickInstall", "AppInstalled", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvFoundSelectedWindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvFoundSelectedWindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvFoundSelectedWindowName OpenTvApp = new TvFoundSelectedWindowName("OpenTvApp", 0, "open_tv_app");
        public static final TvFoundSelectedWindowName OpenTvAppConnecting = new TvFoundSelectedWindowName("OpenTvAppConnecting", 1, "open_tv_app_connecting");
        public static final TvFoundSelectedWindowName CantAutoLogin = new TvFoundSelectedWindowName("CantAutoLogin", 2, "cant_auto_login");
        public static final TvFoundSelectedWindowName Done = new TvFoundSelectedWindowName("Done", 3, "done");
        public static final TvFoundSelectedWindowName CheckTvCode = new TvFoundSelectedWindowName("CheckTvCode", 4, "check_tv_code");
        public static final TvFoundSelectedWindowName AskNewTvCode = new TvFoundSelectedWindowName("AskNewTvCode", 5, "ask_new_tv_code");
        public static final TvFoundSelectedWindowName ClickInstall = new TvFoundSelectedWindowName("ClickInstall", 6, "click_install");
        public static final TvFoundSelectedWindowName AppInstalled = new TvFoundSelectedWindowName("AppInstalled", 7, "app_installed");

        private static final /* synthetic */ TvFoundSelectedWindowName[] $values() {
            return new TvFoundSelectedWindowName[]{OpenTvApp, OpenTvAppConnecting, CantAutoLogin, Done, CheckTvCode, AskNewTvCode, ClickInstall, AppInstalled};
        }

        static {
            TvFoundSelectedWindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvFoundSelectedWindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvFoundSelectedWindowName valueOf(String str) {
            return (TvFoundSelectedWindowName) Enum.valueOf(TvFoundSelectedWindowName.class, str);
        }

        public static TvFoundSelectedWindowName[] values() {
            return (TvFoundSelectedWindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundShowedV2WindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "OpenTvApp", "OpenTvAppConnecting", "CantAutoLogin", "Done", "CheckTvCode", "AskNewTvCode", "ClickInstall", "AppInstalled", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvFoundShowedV2WindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvFoundShowedV2WindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvFoundShowedV2WindowName OpenTvApp = new TvFoundShowedV2WindowName("OpenTvApp", 0, "open_tv_app");
        public static final TvFoundShowedV2WindowName OpenTvAppConnecting = new TvFoundShowedV2WindowName("OpenTvAppConnecting", 1, "open_tv_app_connecting");
        public static final TvFoundShowedV2WindowName CantAutoLogin = new TvFoundShowedV2WindowName("CantAutoLogin", 2, "cant_auto_login");
        public static final TvFoundShowedV2WindowName Done = new TvFoundShowedV2WindowName("Done", 3, "done");
        public static final TvFoundShowedV2WindowName CheckTvCode = new TvFoundShowedV2WindowName("CheckTvCode", 4, "check_tv_code");
        public static final TvFoundShowedV2WindowName AskNewTvCode = new TvFoundShowedV2WindowName("AskNewTvCode", 5, "ask_new_tv_code");
        public static final TvFoundShowedV2WindowName ClickInstall = new TvFoundShowedV2WindowName("ClickInstall", 6, "click_install");
        public static final TvFoundShowedV2WindowName AppInstalled = new TvFoundShowedV2WindowName("AppInstalled", 7, "app_installed");

        private static final /* synthetic */ TvFoundShowedV2WindowName[] $values() {
            return new TvFoundShowedV2WindowName[]{OpenTvApp, OpenTvAppConnecting, CantAutoLogin, Done, CheckTvCode, AskNewTvCode, ClickInstall, AppInstalled};
        }

        static {
            TvFoundShowedV2WindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvFoundShowedV2WindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvFoundShowedV2WindowName valueOf(String str) {
            return (TvFoundShowedV2WindowName) Enum.valueOf(TvFoundShowedV2WindowName.class, str);
        }

        public static TvFoundShowedV2WindowName[] values() {
            return (TvFoundShowedV2WindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalytics$TvFoundShowedWindowName;", "", "eventValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "OpenTvApp", "OpenTvAppConnecting", "CantAutoLogin", "Done", "CheckTvCode", "AskNewTvCode", "ClickInstall", "AppInstalled", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class TvFoundShowedWindowName {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ TvFoundShowedWindowName[] $VALUES;

        @NotNull
        private final String eventValue;
        public static final TvFoundShowedWindowName OpenTvApp = new TvFoundShowedWindowName("OpenTvApp", 0, "open_tv_app");
        public static final TvFoundShowedWindowName OpenTvAppConnecting = new TvFoundShowedWindowName("OpenTvAppConnecting", 1, "open_tv_app_connecting");
        public static final TvFoundShowedWindowName CantAutoLogin = new TvFoundShowedWindowName("CantAutoLogin", 2, "cant_auto_login");
        public static final TvFoundShowedWindowName Done = new TvFoundShowedWindowName("Done", 3, "done");
        public static final TvFoundShowedWindowName CheckTvCode = new TvFoundShowedWindowName("CheckTvCode", 4, "check_tv_code");
        public static final TvFoundShowedWindowName AskNewTvCode = new TvFoundShowedWindowName("AskNewTvCode", 5, "ask_new_tv_code");
        public static final TvFoundShowedWindowName ClickInstall = new TvFoundShowedWindowName("ClickInstall", 6, "click_install");
        public static final TvFoundShowedWindowName AppInstalled = new TvFoundShowedWindowName("AppInstalled", 7, "app_installed");

        private static final /* synthetic */ TvFoundShowedWindowName[] $values() {
            return new TvFoundShowedWindowName[]{OpenTvApp, OpenTvAppConnecting, CantAutoLogin, Done, CheckTvCode, AskNewTvCode, ClickInstall, AppInstalled};
        }

        static {
            TvFoundShowedWindowName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private TvFoundShowedWindowName(String str, int i, String str2) {
            this.eventValue = str2;
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static TvFoundShowedWindowName valueOf(String str) {
            return (TvFoundShowedWindowName) Enum.valueOf(TvFoundShowedWindowName.class, str);
        }

        public static TvFoundShowedWindowName[] values() {
            return (TvFoundShowedWindowName[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventValue() {
            return this.eventValue;
        }
    }

    public EvgenEasyLoginAnalytics(@NotNull EvgenEasyLoginAnalyticsTracker evgenEasyLoginAnalyticsTracker, @NotNull EvgenEasyLoginAnalyticsGlobalParamsProvider evgenEasyLoginAnalyticsGlobalParamsProvider, @NotNull EvgenEasyLoginAnalyticsPlatformParamsProvider evgenEasyLoginAnalyticsPlatformParamsProvider) {
        evgenEasyLoginAnalyticsTracker.getClass();
        evgenEasyLoginAnalyticsGlobalParamsProvider.getClass();
        evgenEasyLoginAnalyticsPlatformParamsProvider.getClass();
        this.eventTracker = evgenEasyLoginAnalyticsTracker;
        this.globalParamsProvider = evgenEasyLoginAnalyticsGlobalParamsProvider;
        this.platformParamsProvider = evgenEasyLoginAnalyticsPlatformParamsProvider;
    }

    private final Map<String, Object> makeMeta(int event_version, Map<String, ? extends Object> interfaces) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("version", Integer.valueOf(event_version));
        hashMap.put(NetcastTVService.UDAP_API_EVENT, hashMap2);
        hashMap.put("interfaces", interfaces);
        return hashMap;
    }

    private final void trackEvent(String event, Map<String, Object> parameters) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(parameters);
        hashMap.putAll(this.globalParamsProvider.getGlobalParams().getParameters());
        hashMap.putAll(this.platformParamsProvider.getPlatformParams().getParameters());
        this.eventTracker.trackEvent(event, hashMap);
    }

    public final void tvAuthorizationErrorRaised(@NotNull ErrorType errorType, @NotNull String errorTitle, @NotNull String errorMessage, @NotNull String requestId, @NotNull TvAuthorizationErrorRaisedWindowName windowName) {
        errorType.getClass();
        errorTitle.getClass();
        errorMessage.getClass();
        requestId.getClass();
        windowName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("errorType", errorType.getEventValue());
        linkedHashMap.put("errorTitle", errorTitle);
        linkedHashMap.put("errorMessage", errorMessage);
        linkedHashMap.put("requestId", requestId);
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(1, new HashMap()));
        trackEvent("TvAuthorization.ErrorRaised", linkedHashMap);
    }

    public final void tvAuthorizationSelected(@NotNull TvAuthorizationSelectedWindowName windowName, @NotNull TvAuthorizationSelectedButtonName buttonName) {
        windowName.getClass();
        buttonName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("button_name", buttonName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(1, new HashMap()));
        trackEvent("TvAuthorization.Selected", linkedHashMap);
    }

    public final void tvAuthorizationShowed(@NotNull TvAuthorizationShowedWindowName windowName) {
        windowName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(1, new HashMap()));
        trackEvent("TvAuthorization.Showed", linkedHashMap);
    }

    public final void tvAuthorizationTVFound(int tvCount, @NotNull String vendor, @NotNull String model) {
        vendor.getClass();
        model.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k.u(tvCount, "tv_count", "vendor", vendor, linkedHashMap);
        linkedHashMap.put(CommonUrlParts.MODEL, model);
        linkedHashMap.put("_meta", makeMeta(1, new HashMap<>()));
        trackEvent("TvAuthorization.TV.Found", linkedHashMap);
    }

    public final void tvAuthorizationTVSelected(int tvCount, int position, @NotNull String vendor, @NotNull String model) {
        vendor.getClass();
        model.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ouj.y(tvCount, linkedHashMap, "tv_count", position, "position");
        linkedHashMap.put("vendor", vendor);
        linkedHashMap.put(CommonUrlParts.MODEL, model);
        linkedHashMap.put("_meta", makeMeta(1, new HashMap<>()));
        trackEvent("TvAuthorization.TV.Selected", linkedHashMap);
    }

    public final void tvFoundErrorRaised(@NotNull ErrorType errorType, @NotNull String errorTitle, @NotNull String errorMessage, @NotNull String requestId, @NotNull TvFoundErrorRaisedWindowName windowName) {
        errorType.getClass();
        errorTitle.getClass();
        errorMessage.getClass();
        requestId.getClass();
        windowName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("errorType", errorType.getEventValue());
        linkedHashMap.put("errorTitle", errorTitle);
        linkedHashMap.put("errorMessage", errorMessage);
        linkedHashMap.put("requestId", requestId);
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(1, new HashMap()));
        trackEvent("TvFound.ErrorRaised", linkedHashMap);
    }

    public final void tvFoundErrorRaisedV2(@NotNull ErrorType errorType, @NotNull String errorTitle, @NotNull String errorMessage, @NotNull String requestId, @NotNull String vendor, @NotNull String model, @NotNull TvFoundErrorRaisedV2WindowName windowName) {
        errorType.getClass();
        errorTitle.getClass();
        errorMessage.getClass();
        requestId.getClass();
        vendor.getClass();
        model.getClass();
        windowName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("errorType", errorType.getEventValue());
        linkedHashMap.put("errorTitle", errorTitle);
        linkedHashMap.put("errorMessage", errorMessage);
        linkedHashMap.put("requestId", requestId);
        linkedHashMap.put("vendor", vendor);
        linkedHashMap.put(CommonUrlParts.MODEL, model);
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(2, new HashMap()));
        trackEvent("TvFound.ErrorRaised", linkedHashMap);
    }

    public final void tvFoundSelected(boolean supportFastLogin, @NotNull TvFoundSelectedWindowName windowName, @NotNull TvFoundSelectedButtonName buttonName) {
        windowName.getClass();
        buttonName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("support_fast_login", String.valueOf(supportFastLogin));
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("button_name", buttonName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(1, new HashMap()));
        trackEvent("TvFound.Selected", linkedHashMap);
    }

    public final void tvFoundSelectedV2(@NotNull String vendor, @NotNull String model, boolean supportFastLogin, @NotNull TvFoundSelectedV2WindowName windowName, @NotNull TvFoundSelectedV2ButtonName buttonName) {
        vendor.getClass();
        model.getClass();
        windowName.getClass();
        buttonName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("vendor", vendor);
        eta.u(linkedHashMap, CommonUrlParts.MODEL, model, supportFastLogin, "support_fast_login");
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("button_name", buttonName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(2, new HashMap<>()));
        trackEvent("TvFound.Selected", linkedHashMap);
    }

    public final void tvFoundShowed(boolean supportFastLogin, @NotNull TvFoundShowedWindowName windowName) {
        windowName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("support_fast_login", String.valueOf(supportFastLogin));
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(1, new HashMap()));
        trackEvent("TvFound.Showed", linkedHashMap);
    }

    public final void tvFoundShowedV2(@NotNull String vendor, @NotNull String model, boolean supportFastLogin, @NotNull TvFoundShowedV2WindowName windowName) {
        vendor.getClass();
        model.getClass();
        windowName.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("vendor", vendor);
        eta.u(linkedHashMap, CommonUrlParts.MODEL, model, supportFastLogin, "support_fast_login");
        linkedHashMap.put("window_name", windowName.getEventValue());
        linkedHashMap.put("_meta", makeMeta(2, new HashMap<>()));
        trackEvent("TvFound.Showed", linkedHashMap);
    }
}
