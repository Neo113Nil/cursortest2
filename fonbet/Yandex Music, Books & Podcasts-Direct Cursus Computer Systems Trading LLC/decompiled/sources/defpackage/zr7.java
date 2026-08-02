package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class zr7 extends tyf {
    public final Context a;
    public final OkHttpClient b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final cr e;
    public final List f;
    public final String g;
    public final Map h;
    public final imp i;
    public final g06 j;

    public zr7(Context context, OkHttpClient okHttpClient, Executor executor, ScheduledExecutorService scheduledExecutorService, cr crVar, List list, String str, Map map, imp impVar, g06 g06Var) {
        this.a = context;
        this.b = okHttpClient;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = crVar;
        this.f = list;
        this.g = str;
        this.h = map;
        this.i = impVar;
        this.j = g06Var;
    }
}
