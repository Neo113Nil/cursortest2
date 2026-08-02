package ru.yandex.video.m3.player;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PreparingParams;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "isFirstEverStart", "autoPlay", "", "sourceIndex", "Lru/yandex/video/m3/player/AbrPreferences;", "abrPreferences", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/PreparingParams$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/PreparingParams;", "PreparingParams", "(ZZILru/yandex/video/m3/player/AbrPreferences;Ltls;)Lru/yandex/video/m3/player/PreparingParams;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreparingParamsKt {
    public static final /* synthetic */ PreparingParams PreparingParams(boolean z, boolean z2, int i, AbrPreferences abrPreferences, tls tlsVar) {
        PreparingParams.Builder builder = new PreparingParams.Builder(z, z2, i, abrPreferences);
        tlsVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PreparingParams PreparingParams$default(boolean z, boolean z2, int i, AbrPreferences abrPreferences, tls tlsVar, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.PreparingParamsKt$PreparingParams$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PreparingParams.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PreparingParams.Builder builder) {
                }
            };
        }
        return PreparingParams(z, z2, i, abrPreferences, tlsVar);
    }
}
