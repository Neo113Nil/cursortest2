package ru.yandex.video.m3.ott.data.repository;

import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.Ott;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/ProfileRepository;", "", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/dto/Ott$Profile;", "getProfile", "()Ljava/util/concurrent/Future;", "Lzy11;", "clear", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProfileRepository {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void clear(ProfileRepository profileRepository) {
            ProfileRepository.super.clear();
        }
    }

    default void clear() {
    }

    Future<Ott.Profile> getProfile();
}
