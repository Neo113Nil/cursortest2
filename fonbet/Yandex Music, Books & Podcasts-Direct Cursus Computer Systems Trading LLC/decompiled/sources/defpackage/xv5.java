package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.dto.concert.ConcertDto;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import ru.yandex.music.api.MusicApi;

@hch(key = "ConcertHttpApi")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\tJ$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lxv5;", "Luci;", "", "concertId", "", "force", "Lcom/yandex/music/shared/dto/concert/ConcertDto;", "q", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public interface xv5 extends uci {
    public static final a f = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxv5$a;", "Lxv5;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements xv5 {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @hch(key = "getConcert")
    @hbt(time = 1, unit = TimeUnit.DAYS)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object x(xv5 xv5Var, @eaf String str, @arc boolean z, Continuation<? super ConcertDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        yv5 yv5Var;
        int i;
        if (continuation instanceof yv5) {
            yv5Var = (yv5) continuation;
            int i2 = yv5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yv5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = yv5Var.j;
                Object obj2 = nm6.a;
                i = yv5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(MusicApi.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Call b = ((MusicApi) qdcVar.C(I)).b(str);
                    b.getClass();
                    yv5Var.l = 1;
                    obj = xv5Var.B(b, yv5Var);
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
        yv5Var = new yv5(xv5Var, continuation);
        Object obj3 = yv5Var.j;
        Object obj22 = nm6.a;
        i = yv5Var.l;
        if (i != 0) {
        }
        obj3.getClass();
        return obj3;
    }

    @hch(key = "getConcert")
    @hbt(time = 1, unit = TimeUnit.DAYS)
    default Object q(@eaf @NotNull String str, @arc boolean z, @NotNull Continuation<? super ConcertDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return x(this, str, z, continuation);
    }
}
