package defpackage;

import ru.yandex.music.common.media.context.PlaybackContextName;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public abstract class oyk {
    public static final nyk a = new nyk(PlaybackContextName.COMMON, null, null);

    public static nyk a(String str, String str2) {
        return new nyk(PlaybackContextName.ALBUM, str, str2);
    }

    public static nyk b(c01 c01Var) {
        return new nyk(PlaybackContextName.ARTIST, c01Var.a, c01Var.b);
    }

    public static nyk c(cvl cvlVar) {
        return new nyk(PlaybackContextName.PLAYLIST, cvlVar.e(), cvlVar.b);
    }

    public static nyk d(dgr dgrVar) {
        StationId stationId = dgrVar.a;
        String str = dgrVar.c;
        return stationId.g() ? new nyk(PlaybackContextName.GENERATIVE, stationId.h(), str) : new nyk(PlaybackContextName.RADIO, stationId.h(), str);
    }
}
