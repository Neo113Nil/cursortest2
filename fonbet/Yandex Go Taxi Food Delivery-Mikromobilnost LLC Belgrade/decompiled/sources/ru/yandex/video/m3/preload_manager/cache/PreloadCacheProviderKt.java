package ru.yandex.video.m3.preload_manager.cache;

import android.content.Context;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "context", "", "cacheSizeKb", "Lkotlin/Function1;", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider$Builder;", "Lzy11;", "buildAction", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "PreloadCacheProvider", "(Landroid/content/Context;JLtls;)Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadCacheProviderKt {
    public static final PreloadCacheProvider PreloadCacheProvider(Context context, long j, tls tlsVar) {
        PreloadCacheProvider.Builder builder = new PreloadCacheProvider.Builder(context, j);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ PreloadCacheProvider PreloadCacheProvider$default(Context context, long j, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.preload_manager.cache.PreloadCacheProviderKt$PreloadCacheProvider$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PreloadCacheProvider.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PreloadCacheProvider.Builder builder) {
                }
            };
        }
        return PreloadCacheProvider(context, j, tlsVar);
    }
}
