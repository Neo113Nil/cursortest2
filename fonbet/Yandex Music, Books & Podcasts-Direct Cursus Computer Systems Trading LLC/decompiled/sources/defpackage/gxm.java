package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import ru.yandex.music.api.MusicApi;
import ru.yandex.music.network.response.eventdata.EventDataDto;

@hch(key = "PromoEventRequestApi")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\nJ$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lgxm;", "Luci;", "", ConnectableDevice.KEY_ID, "", "force", "Lru/yandex/music/network/response/eventdata/EventDataDto;", "j", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/yandex/music/api/MusicApi;", "a", "()Lru/yandex/music/api/MusicApi;", "api", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public interface gxm extends uci {
    public static final a k = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgxm$a;", "Lgxm;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements gxm {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @hch(key = "getFeedEvent")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object N(gxm gxmVar, @eaf String str, @arc boolean z, Continuation<? super EventDataDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        hxm hxmVar;
        int i;
        if (continuation instanceof hxm) {
            hxmVar = (hxm) continuation;
            int i2 = hxmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hxmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hxmVar.j;
                Object obj2 = nm6.a;
                i = hxmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<EventDataDto>> a2 = gxmVar.a().a(str);
                    a2.getClass();
                    hxmVar.l = 1;
                    obj = gxmVar.B(a2, hxmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        hxmVar = new hxm(gxmVar, continuation);
        Object obj3 = hxmVar.j;
        Object obj22 = nm6.a;
        i = hxmVar.l;
        if (i != 0) {
        }
        obj3.getClass();
        return obj3;
    }

    private default MusicApi a() {
        return (MusicApi) l18.b.c(hag.I(MusicApi.class));
    }

    @hch(key = "getFeedEvent")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object j(@eaf @NotNull String str, @arc boolean z, @NotNull Continuation<? super EventDataDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return N(this, str, z, continuation);
    }
}
