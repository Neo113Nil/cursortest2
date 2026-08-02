package ru.yandex.video.m3.player.abr.impl;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.abr.UserQualityRepository;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/abr/impl/UserQualityRepositoryImpl;", "Lru/yandex/video/m3/player/abr/UserQualityRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "lastUserSelectedVideoHeightPx", "getLastUserSelectedVideoHeightPx", "()Ljava/lang/Integer;", "setLastUserSelectedVideoHeightPx", "(Ljava/lang/Integer;)V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserQualityRepositoryImpl implements UserQualityRepository {
    private static final String KEY = "USER_CAPPING";
    private static final int UNDEFINED = -1;
    private final SharedPreferences sharedPreferences;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public UserQualityRepositoryImpl(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.yandex.video.m3.player.abr.UserQualityRepository
    public synchronized Integer getLastUserSelectedVideoHeightPx() {
        int i;
        i = this.sharedPreferences.getInt(KEY, -1);
        return i == -1 ? null : Integer.valueOf(i);
    }

    @Override // ru.yandex.video.m3.player.abr.UserQualityRepository
    public synchronized void setLastUserSelectedVideoHeightPx(Integer num) {
        try {
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putInt(KEY, num != null ? num.intValue() : -1);
            edit.apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/abr/impl/UserQualityRepositoryImpl$Companion;", "", "()V", "KEY", "", "UNDEFINED", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
