package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.list_player_manager.impl.data.ListVideoDataRepository;
import ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestApiKt;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestArguments;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestArgumentsKt;
import ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultVideoDataRepositoryFactory;", "Lru/yandex/video/m3/list_player_manager/impl/ypfactories/VideoDataRepositoryFactory;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "accountProvider", "Lru/yandex/video/m3/config/AccountProvider;", "infoProvider", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "okHttpClient", "Lokhttp3/OkHttpClient;", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "from", "", "vhBackendService", "(Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Ljava/lang/String;Ljava/lang/String;)V", "create", "Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "createManifestRepository", "Lru/yandex/video/m3/ott/data/repository/impl/VhManifestRepository;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultVideoDataRepositoryFactory implements VideoDataRepositoryFactory<VhVideoData> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final String from;
    private final InfoProvider infoProvider;
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private final String vhBackendService;

    public DefaultVideoDataRepositoryFactory(AccountProvider accountProvider, InfoProvider infoProvider, OkHttpClient okHttpClient, JsonConverter jsonConverter, String str, String str2) {
        this.accountProvider = accountProvider;
        this.infoProvider = infoProvider;
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.from = str;
        this.vhBackendService = str2;
    }

    private final VhManifestRepository createManifestRepository() {
        return new VhManifestRepository(VhManifestApiKt.VhManifestApi$default(this.okHttpClient, this.jsonConverter, this.accountProvider, VhManifestArgumentsKt.VhManifestArguments(this.infoProvider.getUserAgent(), new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultVideoDataRepositoryFactory$createManifestRepository$manifestArguments$1
            {
                super(1);
            }

            public final void invoke(VhManifestArguments.Builder builder) {
                String str;
                builder.setFrom(builder.getFrom());
                str = DefaultVideoDataRepositoryFactory.this.vhBackendService;
                builder.setService(str);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VhManifestArguments.Builder) obj);
                return zy11.a;
            }
        }), null, 16, null));
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ypfactories.VideoDataRepositoryFactory
    public VideoDataRepository<VhVideoData> create() {
        return new ListVideoDataRepository(createManifestRepository(), this.infoProvider);
    }
}
