package w5;

import android.content.Context;
import d8.s;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f7703e;

    /* renamed from: a, reason: collision with root package name */
    public final f6.a f7704a;

    /* renamed from: b, reason: collision with root package name */
    public final f6.a f7705b;

    /* renamed from: c, reason: collision with root package name */
    public final b6.e f7706c;

    /* renamed from: d, reason: collision with root package name */
    public final c6.l f7707d;

    public o(f6.a aVar, f6.a aVar2, b6.e eVar, c6.l lVar, s sVar) {
        this.f7704a = aVar;
        this.f7705b = aVar2;
        this.f7706c = eVar;
        this.f7707d = lVar;
        ((Executor) sVar.f1812g).execute(new a1.a(3, sVar));
    }

    public static o a() {
        j jVar = f7703e;
        if (jVar != null) {
            return (o) jVar.f7695l.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f7703e == null) {
            synchronized (o.class) {
                try {
                    if (f7703e == null) {
                        q3.l lVar = new q3.l();
                        context.getClass();
                        lVar.f5771a = context;
                        f7703e = lVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
