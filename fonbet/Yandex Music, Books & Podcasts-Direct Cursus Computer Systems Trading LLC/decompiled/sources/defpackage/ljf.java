package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes5.dex */
public final class ljf {
    public final Context a;
    public final y b;
    public final kxi c;
    public final jyr d;
    public final jyr e;

    public ljf(Context context, y yVar, kxi kxiVar) {
        context.getClass();
        yVar.getClass();
        kxiVar.getClass();
        this.a = context;
        this.b = yVar;
        this.c = kxiVar;
        bdt I = hag.I(z5l.class);
        l18 l18Var = l18.b;
        this.d = l18Var.b(I, true);
        this.e = l18Var.b(hag.I(e.class), true);
    }

    public final z5l a() {
        return (z5l) this.d.getValue();
    }

    public final void b(mqs mqsVar, eul eulVar, CardPlaybackScope cardPlaybackScope) {
        mqsVar.getClass();
        int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return;
            } else if (mqsVar.i() != null) {
                return;
            }
        }
        rre.Z(mqsVar, zus.b, new b6v(y5g.x0(eulVar, o3q.b)), new ve(muo.PLAYLIST, zqt.d), this.a, this.b, this.c, cardPlaybackScope, null, null, null, 1792);
    }

    public final void c(mqs mqsVar, eul eulVar, CardPlaybackScope cardPlaybackScope, Function2 function2, Function1 function1) {
        mqsVar.getClass();
        String t = weo.t();
        ((e) this.e.getValue()).getClass();
        c f = cardPlaybackScope.f(eulVar);
        if (a().c(f, mqsVar, false)) {
            if (a().i(false)) {
                function1.invoke(t);
            }
        } else {
            function1.invoke(t);
            a0g.G(this.a, mqsVar, new os(this, function2, eulVar, mqsVar, f, t));
        }
    }
}
