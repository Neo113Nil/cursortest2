package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.dto.playlist.ChartResultDto;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.ChartApi;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@hch(key = "ChartRequestApi")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\tJ\"\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lqf4;", "Luci;", "", "force", "Lcom/yandex/music/shared/network/repositories/retrofit/ChartApi;", "api", "Lcom/yandex/music/shared/dto/playlist/ChartResultDto;", "O", "(ZLcom/yandex/music/shared/network/repositories/retrofit/ChartApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface qf4 extends uci {
    public static final a d = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqf4$a;", "Lqf4;", "<init>", "()V", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements qf4 {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    @hch(key = "chart")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object z(qf4 qf4Var, @arc boolean z, ChartApi chartApi, Continuation<? super ChartResultDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return qf4Var.B(chartApi.a(), continuation);
    }

    @hch(key = "chart")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object O(@arc boolean z, @NotNull ChartApi chartApi, @NotNull Continuation<? super ChartResultDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return z(this, z, chartApi, continuation);
    }
}
