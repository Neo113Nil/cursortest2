package ru.yandex.video.m3.player.tracking.config;

import android.content.Context;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.collections.a;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001aY\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u0011*\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "Ljava/util/concurrent/Executor;", "executorService", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "providers", "", "", "testIds", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;", "DefaultStrmManagerConfig", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;Ljava/util/List;Ltls;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;", "", "newTestIds", "mergeTestIds", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;Ljava/util/List;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultStrmManagerConfigKt {
    public static final /* synthetic */ DefaultStrmManagerConfig DefaultStrmManagerConfig(Context context, OkHttpClient okHttpClient, Executor executor, ScheduledExecutorService scheduledExecutorService, DefaultStrmManagerConfig.InfoProviders infoProviders, List list, tls tlsVar) {
        DefaultStrmManagerConfig.Builder builder = new DefaultStrmManagerConfig.Builder(context, okHttpClient, executor, scheduledExecutorService, infoProviders, list);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DefaultStrmManagerConfig DefaultStrmManagerConfig$default(Context context, OkHttpClient okHttpClient, Executor executor, ScheduledExecutorService scheduledExecutorService, DefaultStrmManagerConfig.InfoProviders infoProviders, List list, tls tlsVar, int i, Object obj) {
        if ((i & 64) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfigKt$DefaultStrmManagerConfig$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DefaultStrmManagerConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DefaultStrmManagerConfig.Builder builder) {
                }
            };
        }
        return DefaultStrmManagerConfig(context, okHttpClient, executor, scheduledExecutorService, infoProviders, list, tlsVar);
    }

    public static final DefaultStrmManagerConfig mergeTestIds(DefaultStrmManagerConfig defaultStrmManagerConfig, final List<Integer> list) {
        return defaultStrmManagerConfig.copy(new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfigKt$mergeTestIds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(DefaultStrmManagerConfig.Builder builder) {
                List<String> testIds = builder.getTestIds();
                List<Integer> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).intValue()));
                }
                builder.setTestIds(a.I(a.m0(arrayList, testIds)));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DefaultStrmManagerConfig.Builder) obj);
                return zy11.a;
            }
        });
    }
}
