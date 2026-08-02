package defpackage;

import kotlin.jvm.functions.Function0;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final /* synthetic */ class u4p implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cvo b;
    public final /* synthetic */ int c;
    public final /* synthetic */ StationId d;

    public /* synthetic */ u4p(cvo cvoVar, int i, StationId stationId, int i2) {
        this.a = i2;
        this.b = cvoVar;
        this.c = i;
        this.d = stationId;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new u5l(this.b, new jab(qkb.Q2vWave, 1, this.c + 1, 1), new thj(pkb.Wave, this.d.h(), 1, 1, ""), null);
            default:
                return new w5l(this.b, new jab(qkb.MyWave, 1, this.c + 1, 1), new thj(pkb.Wave, this.d.h(), 1, 1, ""), null);
        }
    }
}
