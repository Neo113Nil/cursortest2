package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes4.dex */
public final class w61 {
    public final t a;
    public final y b;
    public final u51 c;
    public final kxi d;
    public final jyr e;

    public w61(t tVar, y yVar, u51 u51Var, kxi kxiVar) {
        u51Var.getClass();
        this.a = tVar;
        this.b = yVar;
        this.c = u51Var;
        this.d = kxiVar;
        this.e = l18.b.b(hag.I(e.class), true);
    }

    public final PlaybackScope a(kf1 kf1Var) {
        int ordinal = kf1Var.ordinal();
        if (ordinal == 0) {
            return d.e(this.c);
        }
        if (ordinal == 1) {
            return d.o();
        }
        if (ordinal == 2) {
            return d.n();
        }
        b6e.s();
        return null;
    }
}
