package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.CustomWaveParamsApi;
import com.yandex.music.shared.network.repositories.retrofit.CustomWaveParamsDto;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@hch(key = "AnimationsRequestApi")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lby6;", "Luci;", "Lcom/yandex/music/shared/network/repositories/retrofit/CustomWaveParamsApi;", "api", "Lcom/yandex/music/shared/network/repositories/retrofit/CustomWaveParamsDto;", "A", "(Lcom/yandex/music/shared/network/repositories/retrofit/CustomWaveParamsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface by6 extends uci {
    public static final a g = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lby6$a;", "Lby6;", "<init>", "()V", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements by6 {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    @hch(key = "getCollectionAnimations")
    @hbt(time = 1, unit = TimeUnit.DAYS)
    static /* synthetic */ Object H(by6 by6Var, CustomWaveParamsApi customWaveParamsApi, Continuation<? super CustomWaveParamsDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return by6Var.B(customWaveParamsApi.v(), continuation);
    }

    @hch(key = "getCollectionAnimations")
    @hbt(time = 1, unit = TimeUnit.DAYS)
    default Object A(@NotNull CustomWaveParamsApi customWaveParamsApi, @NotNull Continuation<? super CustomWaveParamsDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return H(this, customWaveParamsApi, continuation);
    }
}
