package b2;

import A1.C0266h;
import A3.p;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import k2.InterfaceC4642a;
import t7.InterfaceC5045a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static volatile A6.d f5547e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4642a f5548a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4642a f5549b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.c f5550c;

    /* renamed from: d, reason: collision with root package name */
    public final h2.i f5551d;

    public n(InterfaceC4642a interfaceC4642a, InterfaceC4642a interfaceC4642a2, g2.c cVar, h2.i iVar, h2.j jVar) {
        this.f5548a = interfaceC4642a;
        this.f5549b = interfaceC4642a2;
        this.f5550c = cVar;
        this.f5551d = iVar;
        jVar.getClass();
        jVar.f38114a.execute(new p(23, jVar));
    }

    public static n a() {
        A6.d dVar = f5547e;
        if (dVar != null) {
            return (n) ((InterfaceC5045a) dVar.f209z).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f5547e == null) {
            synchronized (n.class) {
                try {
                    if (f5547e == null) {
                        C0266h c0266h = new C0266h();
                        context.getClass();
                        c0266h.f60u = context;
                        f5547e = c0266h.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final m c(Z1.a aVar) {
        byte[] bytes;
        Set unmodifiableSet = aVar != null ? Collections.unmodifiableSet(Z1.a.f4106d) : Collections.singleton(new Y1.c("proto"));
        b3.e a9 = i.a();
        aVar.getClass();
        a9.f5557u = "cct";
        String str = aVar.f4109a;
        String str2 = aVar.f4110b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a9.f5558v = bytes;
        return new m(unmodifiableSet, a9.o(), this);
    }
}
