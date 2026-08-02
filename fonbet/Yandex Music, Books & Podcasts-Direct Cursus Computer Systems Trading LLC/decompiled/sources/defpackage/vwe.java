package defpackage;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.list_player_manager.model.InternalVideo;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.c;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

/* loaded from: classes6.dex */
public final class vwe extends uif implements Function1 {
    public final /* synthetic */ InternalVideo.Content r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwe(InternalVideo.Content content) {
        super(1);
        this.r = content;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrmRequestParams drmRequestParams;
        c cVar = (c) obj;
        cVar.getClass();
        InternalVideo.Content content = this.r;
        cVar.h = content.getFirstFrameUrl();
        cVar.j = content.getFirstFrameHash();
        Boolean isUgcLive = content.isUgcLive();
        if (isUgcLive == null) {
            isUgcLive = Boolean.FALSE;
        }
        cVar.i = isUgcLive;
        if (content.getOttParams() != null) {
            DrmProxy drmProxy = cVar.d;
            String watchSessionId = (drmProxy == null || (drmRequestParams = drmProxy.getDrmRequestParams()) == null) ? null : drmRequestParams.getWatchSessionId();
            Map<String, Object> ottParams = content.getOttParams();
            ottParams.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(ottParams);
            linkedHashMap.remove("licenses");
            Object obj2 = linkedHashMap.get("fromBlock");
            String str = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = linkedHashMap.get("kpId");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = linkedHashMap.get(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE);
            Ott.DeviceType deviceType = obj4 instanceof Ott.DeviceType ? (Ott.DeviceType) obj4 : null;
            if (deviceType == null) {
                deviceType = Ott.DeviceType.App;
            }
            cVar.m = new Ott.TrackingData(linkedHashMap, false, str, watchSessionId, str2, deviceType);
        }
        return Unit.a;
    }
}
