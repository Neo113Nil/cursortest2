package defpackage;

import kotlin.Pair;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes4.dex */
public abstract class sbo {
    public static final Object a;
    public static final Object b;

    static {
        jgb jgbVar = jgb.j;
        Pair pair = new Pair(jgbVar, hld.B(500));
        igb igbVar = igb.j;
        a = uah.e(pair, new Pair(igbVar, hld.B(1000, 1000, 1000)), new Pair(new hgb(NetworkRequestException.TOO_MANY_REQUESTS), hld.B(2000, 5000)), new Pair(new hgb(500), hld.B(1000, 3000)), new Pair(new hgb(502), hld.B(1000, 3000)), new Pair(new hgb(503), hld.B(1000, 3000)), new Pair(new hgb(504), hld.B(2000, 5000)));
        b = uah.e(new Pair(jgbVar, hld.B(500)), new Pair(igbVar, hld.B(1000, 1000, 1000)));
    }
}
