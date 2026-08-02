package defpackage;

import android.content.Context;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class j84 {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final Context e;

    public j84() {
        l18 l18Var = l18.b;
        this.a = l18Var.b(hag.I(k1l.class), true);
        this.b = l18Var.b(hag.I(k1l.class), true);
        this.c = l18Var.b(hag.I(oq7.class), true);
        this.d = l18Var.b(hag.I(q7l.class), true);
        bdt I = hag.I(Context.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.e = (Context) qdcVar.C(I);
    }

    public final void a() {
        n7q n7qVar;
        ssg.a(3, "CastPlayerErrorHandlerImpl", "handleError()", null);
        d6l x = p6g.x((e6l) ((oq7) this.c.getValue()).a.c.getValue());
        if (x != null && (n7qVar = x.a) != null) {
            wdg.A(n7qVar, new i84(this));
        }
        Context context = this.e;
        context.getClass();
        hag.x(context, R.string.playback_impossible, 0);
    }
}
