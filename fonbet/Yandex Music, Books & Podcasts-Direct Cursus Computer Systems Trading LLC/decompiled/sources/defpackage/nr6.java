package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public abstract class nr6 {
    public static final jyr a;
    public static final jyr b;
    public static final tf6 c;
    public static final jyr d;

    static {
        bdt I = hag.I(e15.class);
        l18 l18Var = l18.b;
        a = l18Var.b(I, true);
        b = l18Var.b(hag.I(frt.class), true);
        c = gld.e(dm6.b);
        d = l18Var.b(hag.I(g3m.class), true);
    }

    public static final void a(Context context, cvl cvlVar) {
        context.getClass();
        cvlVar.getClass();
        if (ivf.I(cvlVar)) {
            x97.y(c, null, null, new mr6(cvlVar, context, (Continuation) null), 3);
        } else {
            Assertions.fail("addTracksToPlaylist(): invalid playlist: " + cvlVar);
        }
    }
}
