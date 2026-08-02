package defpackage;

import ru.yandex.taxi.masstransit.api.model.OpenReason;

/* loaded from: classes6.dex */
public final class r240 {
    public final e4l0 a;
    public final ih01 b;
    public volatile boolean c;

    public r240(e4l0 e4l0Var, ih01 ih01Var) {
        this.a = e4l0Var;
        this.b = ih01Var;
    }

    public static OpenReason a(e4l0 e4l0Var) {
        if (e4l0Var instanceof c4l0) {
            return OpenReason.STOP_CARD;
        }
        if (e4l0Var instanceof d4l0) {
            return OpenReason.REASON_MAP;
        }
        if (e4l0Var instanceof b4l0) {
            return OpenReason.ROUTE_CARD;
        }
        w511.b();
        return null;
    }
}
