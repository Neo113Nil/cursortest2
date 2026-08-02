package ru.yandex.video.m3.ott.data.dto;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/EndpointsData;", "", "streamsUrl", "", "metadataUrl", "timingsUrl", "contentIdTemplate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentIdTemplate", "()Ljava/lang/String;", "getMetadataUrl", "getStreamsUrl", "getTimingsUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EndpointsData {
    public static final int $stable = 0;
    private static final String DEFAULT_CONTENT_ID_TEMPLATE = "{contentId}";
    private static final String OTT_METADATA_INFO = "https://api.ott.yandex.net/v10/hd/content/{contentId}/metadata";
    private static final String OTT_STREAMS = "https://api.ott.yandex.net/v10/hd/content/{contentId}/streams";
    private static final String OTT_TIMINGS = "https://api.ott.yandex.net/v10/hd/timings";
    private final String contentIdTemplate;
    private final String metadataUrl;
    private final String streamsUrl;
    private final String timingsUrl;

    public /* synthetic */ EndpointsData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OTT_STREAMS : str, (i & 2) != 0 ? OTT_METADATA_INFO : str2, (i & 4) != 0 ? OTT_TIMINGS : str3, (i & 8) != 0 ? DEFAULT_CONTENT_ID_TEMPLATE : str4);
    }

    public static /* synthetic */ EndpointsData copy$default(EndpointsData endpointsData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endpointsData.streamsUrl;
        }
        if ((i & 2) != 0) {
            str2 = endpointsData.metadataUrl;
        }
        if ((i & 4) != 0) {
            str3 = endpointsData.timingsUrl;
        }
        if ((i & 8) != 0) {
            str4 = endpointsData.contentIdTemplate;
        }
        return endpointsData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStreamsUrl() {
        return this.streamsUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMetadataUrl() {
        return this.metadataUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTimingsUrl() {
        return this.timingsUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContentIdTemplate() {
        return this.contentIdTemplate;
    }

    public final EndpointsData copy(String streamsUrl, String metadataUrl, String timingsUrl, String contentIdTemplate) {
        return new EndpointsData(streamsUrl, metadataUrl, timingsUrl, contentIdTemplate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndpointsData)) {
            return false;
        }
        EndpointsData endpointsData = (EndpointsData) other;
        return jl40.l(this.streamsUrl, endpointsData.streamsUrl) && jl40.l(this.metadataUrl, endpointsData.metadataUrl) && jl40.l(this.timingsUrl, endpointsData.timingsUrl) && jl40.l(this.contentIdTemplate, endpointsData.contentIdTemplate);
    }

    public final String getContentIdTemplate() {
        return this.contentIdTemplate;
    }

    public final String getMetadataUrl() {
        return this.metadataUrl;
    }

    public final String getStreamsUrl() {
        return this.streamsUrl;
    }

    public final String getTimingsUrl() {
        return this.timingsUrl;
    }

    public int hashCode() {
        return this.contentIdTemplate.hashCode() + unr0.b(unr0.b(this.streamsUrl.hashCode() * 31, 31, this.metadataUrl), 31, this.timingsUrl);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EndpointsData(streamsUrl=");
        sb.append(this.streamsUrl);
        sb.append(", metadataUrl=");
        sb.append(this.metadataUrl);
        sb.append(", timingsUrl=");
        sb.append(this.timingsUrl);
        sb.append(", contentIdTemplate=");
        return b64.p(sb, this.contentIdTemplate, ')');
    }

    public EndpointsData(String str, String str2, String str3, String str4) {
        this.streamsUrl = str;
        this.metadataUrl = str2;
        this.timingsUrl = str3;
        this.contentIdTemplate = str4;
    }

    public EndpointsData() {
        this(null, null, null, null, 15, null);
    }
}
