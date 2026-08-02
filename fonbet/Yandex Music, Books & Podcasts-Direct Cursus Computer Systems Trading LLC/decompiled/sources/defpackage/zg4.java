package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.chart.catalog.ChartsHttpApi;
import ru.yandex.music.chart.catalog.data.dto.AlbumsChartDto;

@hch(key = "ChartsRequestApi")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u0010J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0007\u0010\u0006J$\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lzg4;", "Luci;", "", "force", "Lru/yandex/music/chart/catalog/data/dto/AlbumsChartDto;", "w", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "", "categoryId", "u", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/yandex/music/chart/catalog/ChartsHttpApi;", "b", "()Lru/yandex/music/chart/catalog/ChartsHttpApi;", "httpApi", "a", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public interface zg4 extends uci {
    public static final a e = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg4$a;", "Lzg4;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements zg4 {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    @hch(key = "podcastsChart")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object C(zg4 zg4Var, @arc boolean z, Continuation<? super AlbumsChartDto> continuation) {
        return zg4Var.B(zg4Var.b().b(), continuation);
    }

    private default ChartsHttpApi b() {
        return (ChartsHttpApi) l18.b.c(hag.I(ChartsHttpApi.class));
    }

    @hch(key = "albumsChart")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object h(zg4 zg4Var, @arc boolean z, Continuation<? super AlbumsChartDto> continuation) {
        return zg4Var.B(zg4Var.b().a(), continuation);
    }

    @hch(key = "podcastCategoryChart")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object r(zg4 zg4Var, @eaf String str, @arc boolean z, Continuation<? super AlbumsChartDto> continuation) {
        return zg4Var.B(zg4Var.b().c(str), continuation);
    }

    @hch(key = "podcastsChart")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object I(@arc boolean z, @NotNull Continuation<? super AlbumsChartDto> continuation) {
        return C(this, z, continuation);
    }

    @hch(key = "podcastCategoryChart")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object u(@eaf @NotNull String str, @arc boolean z, @NotNull Continuation<? super AlbumsChartDto> continuation) {
        return r(this, str, z, continuation);
    }

    @hch(key = "albumsChart")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object w(@arc boolean z, @NotNull Continuation<? super AlbumsChartDto> continuation) {
        return h(this, z, continuation);
    }
}
