package defpackage;

import defpackage.tje;
import defpackage.zf21;
import java.util.LinkedHashSet;
import kotlin.a;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes7.dex */
public final class zf21 {
    public static final i3y f = a.a(new z121(20));
    public final com.yandex.go.feed_video.domain.manager.a a;
    public ListYandexPlayerView d;
    public final LinkedHashSet b = new LinkedHashSet();
    public final wty c = new wty(1, this);
    public final i3y e = a.a(new sls() { // from class: com.yandex.go.urbanads.d
        @Override // defpackage.sls
        public final Object invoke() {
            return (ListYandexPlayer) tje.Y(EmptyCoroutineContext.a, new UrbanAdsVideoPlayerImpl$player$2$1(zf21.this, null));
        }
    });

    public zf21(com.yandex.go.feed_video.domain.manager.a aVar) {
        this.a = aVar;
    }

    public final ListYandexPlayer a() {
        return (ListYandexPlayer) this.e.getValue();
    }
}
