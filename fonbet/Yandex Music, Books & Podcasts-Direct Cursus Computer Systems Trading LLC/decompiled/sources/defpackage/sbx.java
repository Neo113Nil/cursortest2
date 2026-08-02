package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class sbx {
    public static final msg j = new msg("ClientCastAnalytics", null);
    public static boolean k = true;
    public final jmp a;
    public final b4x b;
    public final s0x c;
    public Long e;
    public n3m g;
    public m4x h;
    public int i = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public sbx(Context context, w8c w8cVar, jmp jmpVar, b4x b4xVar, s0x s0xVar) {
        this.a = jmpVar;
        this.b = b4xVar;
        this.c = s0xVar;
    }

    public final void a(ohx ohxVar, int i) {
        this.f.execute(new hs0(this, ohxVar, i, 3));
    }
}
