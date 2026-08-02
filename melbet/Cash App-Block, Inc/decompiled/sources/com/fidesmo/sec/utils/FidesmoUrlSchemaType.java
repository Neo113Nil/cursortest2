package com.fidesmo.sec.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType;", "", "()V", "Companion", "PushProvisioningUrl", "ServiceDeliveryUrl", "Unknown", "WebActivationReturnUrl", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$PushProvisioningUrl;", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$ServiceDeliveryUrl;", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$Unknown;", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$WebActivationReturnUrl;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class FidesmoUrlSchemaType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$PushProvisioningUrl;", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType;", "appId", "", "serviceId", "cin", "queryParams", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAppId", "()Ljava/lang/String;", "getCin", "getQueryParams", "()Ljava/util/Map;", "getServiceId", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PushProvisioningUrl extends FidesmoUrlSchemaType {
        private final String appId;
        private final String cin;
        private final Map<String, String> queryParams;
        private final String serviceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushProvisioningUrl(String str, String str2, String str3, Map<String, String> map) {
            super(null);
            str.getClass();
            str2.getClass();
            map.getClass();
            this.appId = str;
            this.serviceId = str2;
            this.cin = str3;
            this.queryParams = map;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getCin() {
            return this.cin;
        }

        public final Map<String, String> getQueryParams() {
            return this.queryParams;
        }

        public final String getServiceId() {
            return this.serviceId;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$ServiceDeliveryUrl;", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType;", "appId", "", "serviceId", "cin", "queryParams", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAppId", "()Ljava/lang/String;", "getCin", "getQueryParams", "()Ljava/util/Map;", "getServiceId", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ServiceDeliveryUrl extends FidesmoUrlSchemaType {
        private final String appId;
        private final String cin;
        private final Map<String, String> queryParams;
        private final String serviceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceDeliveryUrl(String str, String str2, String str3, Map<String, String> map) {
            super(null);
            str.getClass();
            str2.getClass();
            map.getClass();
            this.appId = str;
            this.serviceId = str2;
            this.cin = str3;
            this.queryParams = map;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getCin() {
            return this.cin;
        }

        public final Map<String, String> getQueryParams() {
            return this.queryParams;
        }

        public final String getServiceId() {
            return this.serviceId;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$Unknown;", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType;", "()V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends FidesmoUrlSchemaType {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$WebActivationReturnUrl;", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType;", "()V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WebActivationReturnUrl extends FidesmoUrlSchemaType {
        public static final WebActivationReturnUrl INSTANCE = new WebActivationReturnUrl();

        private WebActivationReturnUrl() {
            super(null);
        }
    }

    public /* synthetic */ FidesmoUrlSchemaType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType$Companion;", "", "()V", "from", "Lcom/fidesmo/sec/utils/FidesmoUrlSchemaType;", "url", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FidesmoUrlSchemaType from(String url) {
            boolean isServiceUrl;
            List list;
            List unmodifiableList;
            url.getClass();
            if (StringsKt.contains((CharSequence) url, (CharSequence) UrlParserKt.fidesmoSchemeQuery, true) || StringsKt__StringsJVMKt.startsWith(url, "fidesmo://", true)) {
                return WebActivationReturnUrl.INSTANCE;
            }
            HttpUrl httpUrl = null;
            try {
                HttpUrl.Builder builder = new HttpUrl.Builder();
                builder.parse$okhttp(null, url);
                httpUrl = builder.build();
            } catch (IllegalArgumentException unused) {
            }
            if (httpUrl != null) {
                String str = httpUrl.host;
                if (Intrinsics.areEqual(str, "apps.fidesmo.com") || Intrinsics.areEqual(str, "apps-staging.fidesmo.com")) {
                    isServiceUrl = UrlParserKt.isServiceUrl(httpUrl.encodedPath());
                    ArrayList arrayList = httpUrl.pathSegments;
                    if (!isServiceUrl) {
                        return Intrinsics.areEqual((String) arrayList.get(0), "webactivation") ? WebActivationReturnUrl.INSTANCE : Unknown.INSTANCE;
                    }
                    String str2 = (String) arrayList.get(0);
                    String str3 = (String) arrayList.get(2);
                    Set<String> queryParameterNames = httpUrl.queryParameterNames();
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(queryParameterNames, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                    for (String str4 : queryParameterNames) {
                        str4.getClass();
                        List list2 = httpUrl.queryNamesAndValues;
                        if (list2 == null) {
                            unmodifiableList = EmptyList.INSTANCE;
                        } else {
                            ArrayList arrayList2 = new ArrayList(4);
                            IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, list2.size()));
                            int i = step.first;
                            int i2 = step.last;
                            int i3 = step.step;
                            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                                while (true) {
                                    if (str4.equals(list2.get(i))) {
                                        arrayList2.add(list2.get(i + 1));
                                    }
                                    if (i == i2) {
                                        break;
                                    }
                                    i += i3;
                                }
                            }
                            unmodifiableList = Collections.unmodifiableList(arrayList2);
                            unmodifiableList.getClass();
                        }
                        linkedHashMap.put(str4, (String) CollectionsKt.first(unmodifiableList));
                    }
                    if (Intrinsics.areEqual(str3, "install-push")) {
                        list = UrlParserKt.pushProvisioningAppIds;
                        if (list.contains(str2)) {
                            return new PushProvisioningUrl(str2, str3, (String) linkedHashMap.get("cin"), linkedHashMap);
                        }
                    }
                    return new ServiceDeliveryUrl(str2, str3, (String) linkedHashMap.get("cin"), linkedHashMap);
                }
            }
            return Unknown.INSTANCE;
        }

        private Companion() {
        }
    }

    private FidesmoUrlSchemaType() {
    }
}
