package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class niq {
    public static final Object e = new Object();
    public final Context a;
    public final uhr b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public niq(Context context, uhr uhrVar) {
        this.a = context;
        this.b = uhrVar;
    }

    public final liq a(File file, thr thrVar, String str) {
        liq liqVar;
        String str2;
        kc7 kc7Var;
        synchronized (e) {
            liqVar = (liq) this.c.get(file);
            if (liqVar == null) {
                j7j j7jVar = new j7j();
                int ordinal = thrVar.ordinal();
                if (ordinal == 0) {
                    str2 = "";
                } else if (ordinal == 1) {
                    str2 = "_sd";
                } else {
                    b6e.s();
                    kc7Var = null;
                    liqVar = new liq(file, j7jVar, kc7Var, false);
                    this.c.put(file, liqVar);
                    this.d.put(file, new d3i(liqVar));
                }
                kc7Var = new kc7(this.a.getApplicationContext(), hrg.r("exo_music_user", str, str2, ".db"), null, 2, 1);
                liqVar = new liq(file, j7jVar, kc7Var, false);
                this.c.put(file, liqVar);
                this.d.put(file, new d3i(liqVar));
            }
        }
        return liqVar;
    }
}
