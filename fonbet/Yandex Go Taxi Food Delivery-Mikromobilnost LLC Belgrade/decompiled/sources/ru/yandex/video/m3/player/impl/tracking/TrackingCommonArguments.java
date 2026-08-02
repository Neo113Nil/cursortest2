package ru.yandex.video.m3.player.impl.tracking;

import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.playback.features.DisplayInfo;
import ru.yandex.video.m3.player.impl.utils.AppInfo;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0019J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\u001b\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u001d\u0010=\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003JË\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u000eHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R%\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR.\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001bR#\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(¨\u0006E"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "", Constants.KEY_SERVICE, "", "vsid", "appInfo", "Lru/yandex/video/m3/player/impl/utils/AppInfo;", "deviceInfo", "", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoDto;", "puid", "slots", "testIds", "", "", "additionalParameters", "Lru/yandex/video/m3/data/AdditionalParameters;", "from", "drmType", "Lru/yandex/video/m3/data/DrmType;", "playerIndex", "displayInfo", "", "Lru/yandex/video/m3/playback/features/DisplayInfo;", "vpuid", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/impl/utils/AppInfo;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lru/yandex/video/m3/data/DrmType;ILjava/util/Set;Ljava/lang/String;)V", "getAdditionalParameters", "()Ljava/util/Map;", "getAppInfo", "()Lru/yandex/video/m3/player/impl/utils/AppInfo;", "getDeviceInfo$annotations", "()V", "getDeviceInfo", "deviceWithDisplayInfo", "getDeviceWithDisplayInfo", "getDisplayInfo", "()Ljava/util/Set;", "getDrmType", "()Lru/yandex/video/m3/data/DrmType;", "getFrom", "()Ljava/lang/String;", "getPlayerIndex", "()I", "getPuid", "getService", "getSlots", "getTestIds", "()Ljava/util/List;", "getVpuid", "getVsid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TrackingCommonArguments {
    public static final int $stable = 8;
    private final Map<String, Object> additionalParameters;
    private final AppInfo appInfo;
    private final Map<String, Object> deviceInfo;
    private final Map<String, Object> deviceWithDisplayInfo;
    private final Set<DisplayInfo> displayInfo;
    private final DrmType drmType;
    private final String from;
    private final int playerIndex;
    private final String puid;
    private final String service;
    private final String slots;
    private final List<Integer> testIds;
    private final String vpuid;
    private final String vsid;

    public TrackingCommonArguments(String str, String str2, AppInfo appInfo, Map<String, ? extends Object> map, String str3, String str4, List<Integer> list, Map<String, ? extends Object> map2, String str5, DrmType drmType, int i, Set<DisplayInfo> set, String str6) {
        this.service = str;
        this.vsid = str2;
        this.appInfo = appInfo;
        this.deviceInfo = map;
        this.puid = str3;
        this.slots = str4;
        this.testIds = list;
        this.additionalParameters = map2;
        this.from = str5;
        this.drmType = drmType;
        this.playerIndex = i;
        this.displayInfo = set;
        this.vpuid = str6;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("displays", set);
        this.deviceWithDisplayInfo = linkedHashMap;
    }

    public static /* synthetic */ TrackingCommonArguments copy$default(TrackingCommonArguments trackingCommonArguments, String str, String str2, AppInfo appInfo, Map map, String str3, String str4, List list, Map map2, String str5, DrmType drmType, int i, Set set, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = trackingCommonArguments.service;
        }
        return trackingCommonArguments.copy(str, (i2 & 2) != 0 ? trackingCommonArguments.vsid : str2, (i2 & 4) != 0 ? trackingCommonArguments.appInfo : appInfo, (i2 & 8) != 0 ? trackingCommonArguments.deviceInfo : map, (i2 & 16) != 0 ? trackingCommonArguments.puid : str3, (i2 & 32) != 0 ? trackingCommonArguments.slots : str4, (i2 & 64) != 0 ? trackingCommonArguments.testIds : list, (i2 & 128) != 0 ? trackingCommonArguments.additionalParameters : map2, (i2 & 256) != 0 ? trackingCommonArguments.from : str5, (i2 & 512) != 0 ? trackingCommonArguments.drmType : drmType, (i2 & 1024) != 0 ? trackingCommonArguments.playerIndex : i, (i2 & 2048) != 0 ? trackingCommonArguments.displayInfo : set, (i2 & 4096) != 0 ? trackingCommonArguments.vpuid : str6);
    }

    @jxi
    public static /* synthetic */ void getDeviceInfo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* renamed from: component10, reason: from getter */
    public final DrmType getDrmType() {
        return this.drmType;
    }

    /* renamed from: component11, reason: from getter */
    public final int getPlayerIndex() {
        return this.playerIndex;
    }

    public final Set<DisplayInfo> component12() {
        return this.displayInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final String getVpuid() {
        return this.vpuid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVsid() {
        return this.vsid;
    }

    /* renamed from: component3, reason: from getter */
    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final Map<String, Object> component4() {
        return this.deviceInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPuid() {
        return this.puid;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSlots() {
        return this.slots;
    }

    public final List<Integer> component7() {
        return this.testIds;
    }

    public final Map<String, Object> component8() {
        return this.additionalParameters;
    }

    /* renamed from: component9, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    public final TrackingCommonArguments copy(String service, String vsid, AppInfo appInfo, Map<String, ? extends Object> deviceInfo, String puid, String slots, List<Integer> testIds, Map<String, ? extends Object> additionalParameters, String from, DrmType drmType, int playerIndex, Set<DisplayInfo> displayInfo, String vpuid) {
        return new TrackingCommonArguments(service, vsid, appInfo, deviceInfo, puid, slots, testIds, additionalParameters, from, drmType, playerIndex, displayInfo, vpuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingCommonArguments)) {
            return false;
        }
        TrackingCommonArguments trackingCommonArguments = (TrackingCommonArguments) other;
        return jl40.l(this.service, trackingCommonArguments.service) && jl40.l(this.vsid, trackingCommonArguments.vsid) && jl40.l(this.appInfo, trackingCommonArguments.appInfo) && jl40.l(this.deviceInfo, trackingCommonArguments.deviceInfo) && jl40.l(this.puid, trackingCommonArguments.puid) && jl40.l(this.slots, trackingCommonArguments.slots) && jl40.l(this.testIds, trackingCommonArguments.testIds) && jl40.l(this.additionalParameters, trackingCommonArguments.additionalParameters) && jl40.l(this.from, trackingCommonArguments.from) && this.drmType == trackingCommonArguments.drmType && this.playerIndex == trackingCommonArguments.playerIndex && jl40.l(this.displayInfo, trackingCommonArguments.displayInfo) && jl40.l(this.vpuid, trackingCommonArguments.vpuid);
    }

    public final Map<String, Object> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final Map<String, Object> getDeviceInfo() {
        return this.deviceInfo;
    }

    public final Map<String, Object> getDeviceWithDisplayInfo() {
        return this.deviceWithDisplayInfo;
    }

    public final Set<DisplayInfo> getDisplayInfo() {
        return this.displayInfo;
    }

    public final DrmType getDrmType() {
        return this.drmType;
    }

    public final String getFrom() {
        return this.from;
    }

    public final int getPlayerIndex() {
        return this.playerIndex;
    }

    public final String getPuid() {
        return this.puid;
    }

    public final String getService() {
        return this.service;
    }

    public final String getSlots() {
        return this.slots;
    }

    public final List<Integer> getTestIds() {
        return this.testIds;
    }

    public final String getVpuid() {
        return this.vpuid;
    }

    public final String getVsid() {
        return this.vsid;
    }

    public int hashCode() {
        int d = unr0.d((this.appInfo.hashCode() + unr0.b(this.service.hashCode() * 31, 31, this.vsid)) * 31, 31, this.deviceInfo);
        String str = this.puid;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.slots;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.testIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.additionalParameters;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.from;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DrmType drmType = this.drmType;
        int b = oyr.b(this.playerIndex, (hashCode5 + (drmType == null ? 0 : drmType.hashCode())) * 31, 31);
        Set<DisplayInfo> set = this.displayInfo;
        int hashCode6 = (b + (set == null ? 0 : set.hashCode())) * 31;
        String str4 = this.vpuid;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackingCommonArguments(service=");
        sb.append(this.service);
        sb.append(", vsid=");
        sb.append(this.vsid);
        sb.append(", appInfo=");
        sb.append(this.appInfo);
        sb.append(", deviceInfo=");
        sb.append(this.deviceInfo);
        sb.append(", puid=");
        sb.append(this.puid);
        sb.append(", slots=");
        sb.append(this.slots);
        sb.append(", testIds=");
        sb.append(this.testIds);
        sb.append(", additionalParameters=");
        sb.append(this.additionalParameters);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", drmType=");
        sb.append(this.drmType);
        sb.append(", playerIndex=");
        sb.append(this.playerIndex);
        sb.append(", displayInfo=");
        sb.append(this.displayInfo);
        sb.append(", vpuid=");
        return b64.p(sb, this.vpuid, ')');
    }
}
