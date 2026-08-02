package ru.yandex.video.m3.ott.data.local.impl;

import android.content.SharedPreferences;
import defpackage.evu0;
import defpackage.sls;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.local.ProfileStorage;
import ru.yandex.video.m3.player.utils.FutureExtensions;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/ott/data/local/impl/ProfileStorageImpl;", "Lru/yandex/video/m3/ott/data/local/ProfileStorage;", "Landroid/content/SharedPreferences;", "preference", "<init>", "(Landroid/content/SharedPreferences;)V", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/dto/Ott$Profile;", "getProfile", "()Ljava/util/concurrent/Future;", "profile", "save", "(Lru/yandex/video/m3/ott/data/dto/Ott$Profile;)Ljava/util/concurrent/Future;", "Lzy11;", "clear", "()V", "Landroid/content/SharedPreferences;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileStorageImpl implements ProfileStorage {
    private static final int PREF_EXPIRATION_DATE = 5;
    private static final String PREF_PROFILE_HASHED_ID = "pref_profile_hashed_id";
    private static final String PREF_PROFILE_ID = "pref_profile_id";
    private static final String PREF_SAVED_DATE = "pref_saved_date";
    private final SharedPreferences preference;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ProfileStorageImpl(SharedPreferences sharedPreferences) {
        this.preference = sharedPreferences;
    }

    @Override // ru.yandex.video.m3.ott.data.local.ProfileStorage
    public void clear() {
        this.preference.edit().remove(PREF_PROFILE_ID).remove(PREF_PROFILE_HASHED_ID).remove(PREF_SAVED_DATE).apply();
    }

    @Override // ru.yandex.video.m3.ott.data.local.ProfileStorage
    public Future<Ott.Profile> getProfile() {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.local.impl.ProfileStorageImpl$getProfile$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Ott.Profile invoke() {
                SharedPreferences sharedPreferences;
                SharedPreferences sharedPreferences2;
                SharedPreferences sharedPreferences3;
                sharedPreferences = ProfileStorageImpl.this.preference;
                String string = sharedPreferences.getString("pref_profile_id", null);
                sharedPreferences2 = ProfileStorageImpl.this.preference;
                String string2 = sharedPreferences2.getString("pref_profile_hashed_id", null);
                sharedPreferences3 = ProfileStorageImpl.this.preference;
                long j = sharedPreferences3.getLong("pref_saved_date", -1L);
                if (string == null || evu0.J(string) || string2 == null || evu0.J(string2) || j == -1 || (System.currentTimeMillis() - j) / 86400000 > 5) {
                    return null;
                }
                return new Ott.Profile(string, string2);
            }
        });
    }

    @Override // ru.yandex.video.m3.ott.data.local.ProfileStorage
    public Future<Ott.Profile> save(final Ott.Profile profile) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.local.impl.ProfileStorageImpl$save$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Ott.Profile invoke() {
                SharedPreferences sharedPreferences;
                Ott.Profile profile2 = Ott.Profile.this;
                sharedPreferences = this.preference;
                sharedPreferences.edit().putString("pref_profile_id", profile2.getId()).putString("pref_profile_hashed_id", profile2.getHashedId()).putLong("pref_saved_date", System.currentTimeMillis()).apply();
                return profile2;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/ott/data/local/impl/ProfileStorageImpl$Companion;", "", "()V", "PREF_EXPIRATION_DATE", "", "PREF_PROFILE_HASHED_ID", "", "PREF_PROFILE_ID", "PREF_SAVED_DATE", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
