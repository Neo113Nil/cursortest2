package Z1;

import D.RunnableC0282a;
import android.content.Context;
import i2.InterfaceC4581a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import t7.InterfaceC5044a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static volatile A6.d f4160e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4581a f4161a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4581a f4162b;

    /* renamed from: c, reason: collision with root package name */
    public final e2.c f4163c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.i f4164d;

    public o(InterfaceC4581a interfaceC4581a, InterfaceC4581a interfaceC4581a2, e2.c cVar, f2.i iVar, f2.j jVar) {
        this.f4161a = interfaceC4581a;
        this.f4162b = interfaceC4581a2;
        this.f4163c = cVar;
        this.f4164d = iVar;
        jVar.getClass();
        jVar.f37490a.execute(new RunnableC0282a(22, jVar));
    }

    public static o a() {
        A6.d dVar = f4160e;
        if (dVar != null) {
            return (o) ((InterfaceC5044a) dVar.f52z).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f4160e == null) {
            synchronized (o.class) {
                try {
                    if (f4160e == null) {
                        j jVar = new j();
                        context.getClass();
                        jVar.f4152u = context;
                        f4160e = jVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final n c(X1.a aVar) {
        byte[] bytes;
        Set unmodifiableSet = aVar != null ? Collections.unmodifiableSet(X1.a.f3755d) : Collections.singleton(new W1.c("proto"));
        Z2.e a9 = i.a();
        aVar.getClass();
        a9.f4170u = "cct";
        String str = aVar.f3758a;
        String str2 = aVar.f3759b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a9.f4171v = bytes;
        return new n(unmodifiableSet, a9.n(), this);
    }
}
