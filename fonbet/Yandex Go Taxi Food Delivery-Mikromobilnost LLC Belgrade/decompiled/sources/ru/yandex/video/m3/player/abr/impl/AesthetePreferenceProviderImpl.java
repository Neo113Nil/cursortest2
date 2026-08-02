package ru.yandex.video.m3.player.abr.impl;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.abr.AesthetePreferenceProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/abr/impl/AesthetePreferenceProviderImpl;", "Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "preferHD", "getPreferHD", "()Z", "setPreferHD", "(Z)V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AesthetePreferenceProviderImpl implements AesthetePreferenceProvider {
    private static final String KEY = "AESTHETE_CAPPING";
    private final SharedPreferences sharedPreferences;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public AesthetePreferenceProviderImpl(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.yandex.video.m3.player.abr.AesthetePreferenceProvider
    public synchronized boolean getPreferHD() {
        return this.sharedPreferences.getBoolean(KEY, false);
    }

    @Override // ru.yandex.video.m3.player.abr.AesthetePreferenceProvider
    public synchronized void setPreferHD(boolean z) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(KEY, z);
        edit.apply();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/abr/impl/AesthetePreferenceProviderImpl$Companion;", "", "()V", "KEY", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
