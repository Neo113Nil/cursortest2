package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.screen.cards.data.CardsDtoOld;
import com.yandex.music.screen.cards.data.CardsHttpApiOld;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@hch(key = "CardsApiOld")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lay3;", "Luci;", "", "promoId", "Lcom/yandex/music/screen/cards/data/CardsDtoOld;", "g", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/music/screen/cards/data/CardsHttpApiOld;", "b", "()Lcom/yandex/music/screen/cards/data/CardsHttpApiOld;", "httpApi", "a", "cards-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public interface ay3 extends uci {
    public static final a c = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lay3$a;", "Lay3;", "<init>", "()V", "cards-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements ay3 {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    private default CardsHttpApiOld b() {
        return (CardsHttpApiOld) l18.b.c(hag.I(CardsHttpApiOld.class));
    }

    @hch(key = "getPromoCardsOld")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object c(ay3 ay3Var, @eaf String str, Continuation<? super CardsDtoOld> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return ay3Var.B(ay3Var.b().a(str), continuation);
    }

    @hch(key = "getPromoCardsOld")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object g(@eaf @NotNull String str, @NotNull Continuation<? super CardsDtoOld> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return c(this, str, continuation);
    }
}
