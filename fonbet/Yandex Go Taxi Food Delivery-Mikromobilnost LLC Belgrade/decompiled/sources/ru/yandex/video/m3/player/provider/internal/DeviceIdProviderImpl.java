package ru.yandex.video.m3.player.provider.internal;

import android.content.Context;
import defpackage.h5z0;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IParamsCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.internal.DeviceIdProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/DeviceIdProviderImpl;", "Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider;", "<init>", "()V", "", "deviceId", "Lzy11;", "onObtainedDeviceId", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "provideContext", "(Landroid/content/Context;)V", "Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider$Listener;", "listener", "addListener", "(Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider$Listener;)V", "get", "()Ljava/lang/String;", "Ljava/lang/String;", "", "listeners", "Ljava/util/List;", "Lio/appmetrica/analytics/IParamsCallback;", "paramsCallback", "Lio/appmetrica/analytics/IParamsCallback;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceIdProviderImpl implements DeviceIdProvider {
    private static String deviceId;
    public static final DeviceIdProviderImpl INSTANCE = new DeviceIdProviderImpl();
    private static final List<DeviceIdProvider.Listener> listeners = new ArrayList();
    private static IParamsCallback paramsCallback = new IParamsCallback() { // from class: ru.yandex.video.m3.player.provider.internal.DeviceIdProviderImpl$paramsCallback$1
        @Override // io.appmetrica.analytics.IParamsCallback
        public void onReceive(IParamsCallback.Result result) {
            String deviceId2;
            String str;
            if (result == null || (deviceId2 = result.getDeviceId()) == null) {
                return;
            }
            str = DeviceIdProviderImpl.deviceId;
            if (str == null) {
                DeviceIdProviderImpl.INSTANCE.onObtainedDeviceId(deviceId2);
            }
        }

        @Override // io.appmetrica.analytics.IParamsCallback
        public void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
            String deviceId2;
            String str;
            h5z0.a.m("Request error. Reason: \n" + reason, new Object[0]);
            if (result == null || (deviceId2 = result.getDeviceId()) == null) {
                return;
            }
            str = DeviceIdProviderImpl.deviceId;
            if (str == null) {
                DeviceIdProviderImpl.INSTANCE.onObtainedDeviceId(deviceId2);
            }
        }
    };
    public static final int $stable = 8;

    private DeviceIdProviderImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onObtainedDeviceId(String deviceId2) {
        deviceId = deviceId2;
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((DeviceIdProvider.Listener) it.next()).onDeviceIdObtained(deviceId2);
        }
        listeners.clear();
        paramsCallback = null;
    }

    @Override // ru.yandex.video.m3.player.provider.internal.DeviceIdProvider
    public void addListener(DeviceIdProvider.Listener listener) {
        String str = deviceId;
        if (str != null) {
            listener.onDeviceIdObtained(str);
        } else {
            listeners.add(listener);
        }
    }

    @Override // ru.yandex.video.m3.player.provider.internal.DeviceIdProvider
    public String get() {
        return deviceId;
    }

    public final void provideContext(Context context) {
        IParamsCallback iParamsCallback;
        if (deviceId != null || (iParamsCallback = paramsCallback) == null) {
            return;
        }
        AppMetricaYandex.requestStartupParams(context, iParamsCallback, "appmetrica_device_id");
    }
}
