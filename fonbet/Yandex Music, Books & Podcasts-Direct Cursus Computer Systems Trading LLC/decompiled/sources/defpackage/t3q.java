package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes5.dex */
public abstract class t3q {
    public static final r3q a(c cVar, String str, pyt pytVar, Function0 function0) {
        cVar.getClass();
        jyr b = btf.b(new g1j(20, function0));
        nyk nykVar = cVar.b;
        PlaybackScope playbackScope = cVar.a;
        String str2 = nykVar.b;
        String str3 = nykVar.c;
        if (str3 == null) {
            str3 = "";
        }
        r3q r3qVar = null;
        switch (s3q.a[nykVar.a.ordinal()]) {
            case 1:
                if (str2 == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                yc5 yc5Var = new yc5(str2);
                n3q n3qVar = new n3q(str3);
                playbackScope.getClass();
                r3qVar = new l3q(yc5Var, n3qVar, b(playbackScope));
                break;
            case 2:
                if (str2 == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                xc5 xc5Var = new xc5(str2);
                n3q n3qVar2 = new n3q(str3);
                playbackScope.getClass();
                r3qVar = new j3q(xc5Var, n3qVar2, s3q.b[playbackScope.k().ordinal()] == 3 ? i3q.b : i3q.a);
                break;
            case 3:
                bd5 A = str2 != null ? i9w.A(str2, str) : playbackScope.l() == PlaybackScope.Type.CHART ? i9w.A("414787002:1076", null) : null;
                if (A != null) {
                    playbackScope.getClass();
                    r3qVar = new p3q(A, c(playbackScope), new n3q(str3));
                    break;
                }
                break;
            case 4:
                r3qVar = new m3q(new cd5((List) b.getValue()), new qyt(str3, pytVar));
                break;
            case 5:
                r3qVar = new m3q(new cd5((List) b.getValue()), d.y(cVar));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            case 10:
            case 11:
            case 12:
                su4.s(2, null, "Type " + nykVar.a + " is not supported in common queue", null);
                break;
            default:
                b6e.s();
                return null;
        }
        return r3qVar == null ? new m3q(new cd5((List) b.getValue()), ryt.a) : r3qVar;
    }

    public static final k3q b(PlaybackScope playbackScope) {
        playbackScope.getClass();
        int i = s3q.b[playbackScope.k().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? k3q.a : k3q.d : k3q.c : k3q.b;
    }

    public static final o3q c(PlaybackScope playbackScope) {
        playbackScope.getClass();
        if (s3q.c[playbackScope.l().ordinal()] == 1) {
            return s3q.b[playbackScope.k().ordinal()] == 3 ? o3q.a : o3q.b;
        }
        return o3q.b;
    }
}
