package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import android.content.Context;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.g8e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.video.m3.playback.features.DisplayInfo;
import ru.yandex.video.m3.playback.features.PlaybackFeaturesKt;
import ru.yandex.video.m3.player.impl.tracking.TrackingCommonArguments;
import ru.yandex.video.m3.player.impl.utils.AppInfo;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bJ\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\b\u0012\u0004\u0012\u00020\b0\nH\u0002¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultTrackingArgumentsFactory;", "", "()V", "create", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "context", "Landroid/content/Context;", "deviceId", "", "testIds", "", "from", "yandexUid", "listSdkVsid", "toIntTestIds", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultTrackingArgumentsFactory {
    public static final int $stable = 0;
    public static final DefaultTrackingArgumentsFactory INSTANCE = new DefaultTrackingArgumentsFactory();

    private DefaultTrackingArgumentsFactory() {
    }

    private final List<Integer> toIntTestIds(List<String> list) {
        List W;
        if (list.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            W = evu0.W((String) it.next(), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
            String str = (String) a.R(W);
            Integer l = str != null ? bvu0.l(10, str) : null;
            if (l != null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    public final TrackingCommonArguments create(Context context, String deviceId, List<String> testIds, String from, String yandexUid, String listSdkVsid) {
        InfoProviderImpl infoProviderImpl = new InfoProviderImpl(context);
        Set<DisplayInfo> displayInfos = PlaybackFeaturesKt.getDisplayInfos(context);
        AppInfo appInfo = infoProviderImpl.getAppInfo();
        Map z = g8e.z("id", deviceId);
        List<String> list = !testIds.isEmpty() ? testIds : null;
        return new TrackingCommonArguments(DefaultStrmManagerConfig.ANDROID_PLAYER_TELEMETRY_SERVICE, listSdkVsid, appInfo, z, yandexUid, list != null ? a.X(list, ";", null, null, null, 62) : null, toIntTestIds(testIds), null, from, null, -1, displayInfos, infoProviderImpl.getVpuid());
    }
}
