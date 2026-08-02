package ru.yandex.video.m3.list_player_manager.impl.pool;

import android.content.Context;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.network.UrlParams;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003Je\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006*"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/pool/Config;", "", "context", "Landroid/content/Context;", "listSdkVsid", "", "from", "deviceId", "testIds", "", "yandexUid", "strmTrackingUrl", "Lru/yandex/video/m3/data/network/UrlParams;", "perfTrackingUrl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/yandex/video/m3/data/network/UrlParams;Lru/yandex/video/m3/data/network/UrlParams;)V", "getContext", "()Landroid/content/Context;", "getDeviceId", "()Ljava/lang/String;", "getFrom", "getListSdkVsid", "getPerfTrackingUrl", "()Lru/yandex/video/m3/data/network/UrlParams;", "getStrmTrackingUrl", "getTestIds", "()Ljava/util/List;", "getYandexUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Config {
    public static final int $stable = 8;
    private final Context context;
    private final String deviceId;
    private final String from;
    private final String listSdkVsid;
    private final UrlParams perfTrackingUrl;
    private final UrlParams strmTrackingUrl;
    private final List<String> testIds;
    private final String yandexUid;

    public Config(Context context, String str, String str2, String str3, List<String> list, String str4, UrlParams urlParams, UrlParams urlParams2) {
        this.context = context;
        this.listSdkVsid = str;
        this.from = str2;
        this.deviceId = str3;
        this.testIds = list;
        this.yandexUid = str4;
        this.strmTrackingUrl = urlParams;
        this.perfTrackingUrl = urlParams2;
    }

    public static /* synthetic */ Config copy$default(Config config, Context context, String str, String str2, String str3, List list, String str4, UrlParams urlParams, UrlParams urlParams2, int i, Object obj) {
        if ((i & 1) != 0) {
            context = config.context;
        }
        if ((i & 2) != 0) {
            str = config.listSdkVsid;
        }
        if ((i & 4) != 0) {
            str2 = config.from;
        }
        if ((i & 8) != 0) {
            str3 = config.deviceId;
        }
        if ((i & 16) != 0) {
            list = config.testIds;
        }
        if ((i & 32) != 0) {
            str4 = config.yandexUid;
        }
        if ((i & 64) != 0) {
            urlParams = config.strmTrackingUrl;
        }
        if ((i & 128) != 0) {
            urlParams2 = config.perfTrackingUrl;
        }
        UrlParams urlParams3 = urlParams;
        UrlParams urlParams4 = urlParams2;
        List list2 = list;
        String str5 = str4;
        return config.copy(context, str, str2, str3, list2, str5, urlParams3, urlParams4);
    }

    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final String getListSdkVsid() {
        return this.listSdkVsid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final List<String> component5() {
        return this.testIds;
    }

    /* renamed from: component6, reason: from getter */
    public final String getYandexUid() {
        return this.yandexUid;
    }

    /* renamed from: component7, reason: from getter */
    public final UrlParams getStrmTrackingUrl() {
        return this.strmTrackingUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final UrlParams getPerfTrackingUrl() {
        return this.perfTrackingUrl;
    }

    public final Config copy(Context context, String listSdkVsid, String from, String deviceId, List<String> testIds, String yandexUid, UrlParams strmTrackingUrl, UrlParams perfTrackingUrl) {
        return new Config(context, listSdkVsid, from, deviceId, testIds, yandexUid, strmTrackingUrl, perfTrackingUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return jl40.l(this.context, config.context) && jl40.l(this.listSdkVsid, config.listSdkVsid) && jl40.l(this.from, config.from) && jl40.l(this.deviceId, config.deviceId) && jl40.l(this.testIds, config.testIds) && jl40.l(this.yandexUid, config.yandexUid) && jl40.l(this.strmTrackingUrl, config.strmTrackingUrl) && jl40.l(this.perfTrackingUrl, config.perfTrackingUrl);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getListSdkVsid() {
        return this.listSdkVsid;
    }

    public final UrlParams getPerfTrackingUrl() {
        return this.perfTrackingUrl;
    }

    public final UrlParams getStrmTrackingUrl() {
        return this.strmTrackingUrl;
    }

    public final List<String> getTestIds() {
        return this.testIds;
    }

    public final String getYandexUid() {
        return this.yandexUid;
    }

    public int hashCode() {
        int c = unr0.c(unr0.b(unr0.b(unr0.b(this.context.hashCode() * 31, 31, this.listSdkVsid), 31, this.from), 31, this.deviceId), 31, this.testIds);
        String str = this.yandexUid;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        UrlParams urlParams = this.strmTrackingUrl;
        int hashCode2 = (hashCode + (urlParams == null ? 0 : urlParams.hashCode())) * 31;
        UrlParams urlParams2 = this.perfTrackingUrl;
        return hashCode2 + (urlParams2 != null ? urlParams2.hashCode() : 0);
    }

    public String toString() {
        return "Config(context=" + this.context + ", listSdkVsid=" + this.listSdkVsid + ", from=" + this.from + ", deviceId=" + this.deviceId + ", testIds=" + this.testIds + ", yandexUid=" + this.yandexUid + ", strmTrackingUrl=" + this.strmTrackingUrl + ", perfTrackingUrl=" + this.perfTrackingUrl + ')';
    }
}
