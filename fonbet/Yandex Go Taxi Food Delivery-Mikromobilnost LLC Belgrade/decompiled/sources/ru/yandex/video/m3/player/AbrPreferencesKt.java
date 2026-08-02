package ru.yandex.video.m3.player;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.AbrPreferences;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "defaultQuality", "", "preferHD", "lastUserSelectedVideoHeightPx", "shouldConsiderSelectedUserQuality", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/AbrPreferences$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/AbrPreferences;", "AbrPreferences", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;ZLtls;)Lru/yandex/video/m3/player/AbrPreferences;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbrPreferencesKt {
    public static final /* synthetic */ AbrPreferences AbrPreferences(Integer num, Boolean bool, Integer num2, boolean z, tls tlsVar) {
        AbrPreferences.Builder builder = new AbrPreferences.Builder(num, bool, num2, z);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ AbrPreferences AbrPreferences$default(Integer num, Boolean bool, Integer num2, boolean z, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.AbrPreferencesKt$AbrPreferences$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AbrPreferences.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AbrPreferences.Builder builder) {
                }
            };
        }
        return AbrPreferences(num, bool, num2, z, tlsVar);
    }
}
