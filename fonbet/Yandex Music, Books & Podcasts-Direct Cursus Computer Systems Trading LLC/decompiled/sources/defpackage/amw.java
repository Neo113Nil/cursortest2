package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class amw {
    public final oq7 a;
    public final k1l b;
    public final k1l c;
    public final knn d;

    public amw(oq7 oq7Var, k1l k1lVar, k1l k1lVar2) {
        oq7Var.getClass();
        k1lVar.getClass();
        k1lVar2.getClass();
        this.a = oq7Var;
        this.b = k1lVar;
        this.c = k1lVar2;
        this.d = new knn(22, this);
    }

    public static final void a(amw amwVar, PlaybackCommand$QueueBound... playbackCommand$QueueBoundArr) {
        amwVar.getClass();
        int length = playbackCommand$QueueBoundArr.length;
        if (length != 0) {
            a3t a3tVar = a3t.a;
            if (length == 1) {
                amwVar.b.a((dyk) xz0.y(playbackCommand$QueueBoundArr), a3tVar);
                return;
            }
            k1l k1lVar = amwVar.c;
            List asList = Arrays.asList(playbackCommand$QueueBoundArr);
            asList.getClass();
            k1lVar.b(new eyk(asList), a3tVar);
        }
    }

    public final xlw b() {
        oq7 oq7Var = this.a;
        e6l e6lVar = (e6l) oq7Var.a.c.getValue();
        d6l x = p6g.x(e6lVar);
        Continuation continuation = null;
        n7q n7qVar = x != null ? x.a : null;
        g4q g4qVar = (g4q) oq7Var.b.c.getValue();
        mwk b = n7qVar != null ? n7qVar.b() : null;
        d6l x2 = p6g.x(e6lVar);
        boolean C = x2 != null ? p6g.C(x2) : false;
        pbx pbxVar = new pbx(new zlw(this, continuation, 0));
        pbx pbxVar2 = new pbx(new zlw(this, continuation, 1));
        jyr b2 = btf.b(new dxv(23, this));
        yk3 yk3Var = new yk3();
        yk3Var.b = b;
        yk3Var.a = C;
        yk3Var.c = pbxVar;
        yk3Var.d = pbxVar2;
        yk3Var.e = b2;
        return new xlw(g4qVar, n7qVar, yk3Var);
    }

    public final e7v c() {
        return new e7v(this.a.a.c, 29);
    }
}
