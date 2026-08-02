package ru.yandex.video.m3.ott.ott;

import defpackage.i3y;
import defpackage.sls;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.video.m3.player.utils.DRMInfo;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0003\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ott/ott/DefaultDeviceProviderImpl;", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "", "deviceId", "<init>", "(Ljava/lang/String;)V", "Ljava/util/UUID;", "deviceId$delegate", "Li3y;", "getDeviceId", "()Ljava/util/UUID;", "", "widevineAvailable$delegate", "getWidevineAvailable", "()Z", "widevineAvailable", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultDeviceProviderImpl implements DeviceProvider {

    /* renamed from: deviceId$delegate, reason: from kotlin metadata */
    private final i3y deviceId;

    /* renamed from: widevineAvailable$delegate, reason: from kotlin metadata */
    private final i3y widevineAvailable = a.a(new sls() { // from class: ru.yandex.video.m3.ott.ott.DefaultDeviceProviderImpl$widevineAvailable$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Boolean invoke() {
            Object failure;
            try {
                failure = DRMInfoProvider.INSTANCE.getDRMInfo();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            DRMInfo dRMInfo = (DRMInfo) failure;
            return Boolean.valueOf((dRMInfo instanceof DRMInfo.Supported) || (dRMInfo instanceof DRMInfo.SchemeSupported));
        }
    });
    public static final int $stable = 8;
    private static final UUID NULL_UUID = new UUID(0, 0);

    public DefaultDeviceProviderImpl(final String str) {
        this.deviceId = a.a(new sls() { // from class: ru.yandex.video.m3.ott.ott.DefaultDeviceProviderImpl$deviceId$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final UUID invoke() {
                Object failure;
                UUID uuid;
                String str2 = str;
                if (str2 != null) {
                    try {
                        failure = UUID.fromString(new StringBuilder(str2).insert(20, LicenseUtility.SEPARATOR).insert(16, LicenseUtility.SEPARATOR).insert(12, LicenseUtility.SEPARATOR).insert(8, LicenseUtility.SEPARATOR).toString());
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    UUID uuid2 = (UUID) failure;
                    if (uuid2 != null) {
                        return uuid2;
                    }
                }
                uuid = DefaultDeviceProviderImpl.NULL_UUID;
                return uuid;
            }
        });
    }

    @Override // ru.yandex.video.m3.ott.ott.DeviceProvider
    public UUID getDeviceId() {
        return (UUID) this.deviceId.getValue();
    }

    @Override // ru.yandex.video.m3.ott.ott.DeviceProvider
    public boolean getWidevineAvailable() {
        return ((Boolean) this.widevineAvailable.getValue()).booleanValue();
    }
}
