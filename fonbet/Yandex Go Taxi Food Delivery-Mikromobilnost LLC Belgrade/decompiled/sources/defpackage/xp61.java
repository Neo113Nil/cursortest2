package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public final class xp61 implements ic81 {
    public final ExecutorService a;
    public final no71 b;
    public final n171 c;
    public final yc7 d;
    public zv71 e;
    public volatile im61 f;
    public volatile boolean g;

    public xp61(op81 op81Var, ly61 ly61Var, ExecutorService executorService) {
        executorService.getClass();
        this.a = executorService;
        d981 d981Var = op81Var.b;
        d981Var.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = d981Var.a;
        String str = d981Var.c;
        cha1.b(uri, "The uri must be set.");
        no71 no71Var = new no71(uri, 0L, null, map, 0L, -1L, str, 4);
        this.b = no71Var;
        hn71 hn71Var = ly61Var.b;
        n171 a = ly61Var.a(hn71Var != null ? hn71Var.a() : null, 1);
        this.c = a;
        this.d = new yc7(a, no71Var, (byte[]) null, new gp51(7, this));
    }

    @Override // defpackage.ic81
    public final void a(zv71 zv71Var) {
        this.e = zv71Var;
        this.f = new im61(this);
        try {
            if (!this.g) {
                this.a.execute(this.f);
                try {
                    im61 im61Var = this.f;
                    im61Var.c.a();
                    im61Var.c();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = rf71.a;
                    throw cause;
                }
            }
        } finally {
            this.f.c.b();
        }
    }

    @Override // defpackage.ic81
    public final void cancel() {
        this.g = true;
        im61 im61Var = this.f;
        if (im61Var != null) {
            im61Var.cancel(true);
        }
    }

    @Override // defpackage.ic81
    public final void remove() {
        n171 n171Var = this.c;
        l291 l291Var = n171Var.a;
        z171 z171Var = (z171) l291Var;
        z171Var.o(((yx61) n171Var.x).b(this.b));
    }
}
