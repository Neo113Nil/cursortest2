package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import android.content.Context;
import defpackage.tls;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestApiKt;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestArgumentsKt;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository;
import ru.yandex.video.m3.ott.ott.DeviceProvider;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactoryImpl;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateKt;
import ru.yandex.video.m3.ott.ott.OttParamsDrmServiceConfig;
import ru.yandex.video.m3.ott.vh.VhPlayerStrategyFactoryKt;
import ru.yandex.video.m3.player.PlayerStrategyFactory;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultPlayerStrategyFactory;", "", "()V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPlayerStrategyFactory {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultPlayerStrategyFactory$Companion;", "", "()V", "create", "Lru/yandex/video/m3/player/PlayerStrategyFactory;", "context", "Landroid/content/Context;", "okHttpClient", "Lokhttp3/OkHttpClient;", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "yandexUid", "", "manifestRepository", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlayerStrategyFactory create(Context context, OkHttpClient okHttpClient, JsonConverter jsonConverter, final String yandexUid) {
            return create(context, new VhManifestRepository(VhManifestApiKt.VhManifestApi$default(okHttpClient, jsonConverter, new AccountProvider() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerStrategyFactory$Companion$create$accountProvider$1
                @Override // ru.yandex.video.m3.config.AccountProvider
                public String getAuthToken() {
                    return "";
                }

                @Override // ru.yandex.video.m3.config.AccountProvider
                public String getYandexUid() {
                    String str = yandexUid;
                    return str == null ? "" : str;
                }
            }, VhManifestArgumentsKt.VhManifestArguments$default("", (tls) null, 2, (Object) null), null, 16, null)));
        }

        private Companion() {
        }

        public final PlayerStrategyFactory create(Context context, ManifestRepository<VhVideoData> manifestRepository) {
            return VhPlayerStrategyFactoryKt.VhPlayerStrategyFactory$default(context, manifestRepository, new OttMediaDrmCallbackDelegateFactoryImpl(OttMediaDrmCallbackDelegateKt.DrmServiceConfig$default(OttParamsDrmServiceConfig.ORIGIN, OttParamsDrmServiceConfig.REFERER, null, 4, null)), new DeviceProvider() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerStrategyFactory$Companion$create$1
                @Override // ru.yandex.video.m3.ott.ott.DeviceProvider
                public UUID getDeviceId() {
                    return new UUID(0L, 0L);
                }

                @Override // ru.yandex.video.m3.ott.ott.DeviceProvider
                public boolean getWidevineAvailable() {
                    return false;
                }
            }, null, 16, null);
        }
    }
}
