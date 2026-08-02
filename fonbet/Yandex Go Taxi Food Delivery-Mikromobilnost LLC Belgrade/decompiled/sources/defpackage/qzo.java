package defpackage;

import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.timer.api.TimerType;

/* loaded from: classes14.dex */
public abstract class qzo {
    public static final TimerType a(RideCardTimerDto.TimerType timerType) {
        int i = mzo.a[timerType.ordinal()];
        if (i == 1) {
            return TimerType.Until;
        }
        if (i == 2) {
            return TimerType.From;
        }
        w511.b();
        return null;
    }
}
