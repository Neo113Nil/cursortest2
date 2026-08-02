package ru.yandex.video.m3.ott.data.repository.impl;

import defpackage.sls;
import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.local.ProfileStorage;
import ru.yandex.video.m3.ott.data.net.ProfileApi;
import ru.yandex.video.m3.ott.data.repository.ProfileRepository;
import ru.yandex.video.m3.player.utils.FutureExtensions;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/ProfileRepositoryImpl;", "Lru/yandex/video/m3/ott/data/repository/ProfileRepository;", "Lru/yandex/video/m3/ott/data/net/ProfileApi;", "profileApi", "Lru/yandex/video/m3/ott/data/local/ProfileStorage;", "profileStorage", "<init>", "(Lru/yandex/video/m3/ott/data/net/ProfileApi;Lru/yandex/video/m3/ott/data/local/ProfileStorage;)V", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/dto/Ott$Profile;", "getProfile", "()Ljava/util/concurrent/Future;", "Lzy11;", "clear", "()V", "Lru/yandex/video/m3/ott/data/net/ProfileApi;", "Lru/yandex/video/m3/ott/data/local/ProfileStorage;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileRepositoryImpl implements ProfileRepository {
    public static final int $stable = 0;
    private final ProfileApi profileApi;
    private final ProfileStorage profileStorage;

    public ProfileRepositoryImpl(ProfileApi profileApi, ProfileStorage profileStorage) {
        this.profileApi = profileApi;
        this.profileStorage = profileStorage;
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ProfileRepository
    public void clear() {
        this.profileStorage.clear();
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ProfileRepository
    public Future<Ott.Profile> getProfile() {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.repository.impl.ProfileRepositoryImpl$getProfile$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Ott.Profile invoke() {
                ProfileStorage profileStorage;
                ProfileApi profileApi;
                ProfileStorage profileStorage2;
                profileStorage = ProfileRepositoryImpl.this.profileStorage;
                Ott.Profile profile = profileStorage.getProfile().get();
                if (profile != null) {
                    return profile;
                }
                profileApi = ProfileRepositoryImpl.this.profileApi;
                Ott.Profile profile2 = profileApi.getProfile().get();
                if (profile2 == null) {
                    return null;
                }
                profileStorage2 = ProfileRepositoryImpl.this.profileStorage;
                Future<Ott.Profile> save = profileStorage2.save(profile2);
                if (save != null) {
                    return save.get();
                }
                return null;
            }
        });
    }
}
