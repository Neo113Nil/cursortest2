package Z1;

import D.RunnableC0281a;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import p7.InterfaceC4864a;
import w6.C5177d;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C5177d f4237e;

    /* renamed from: a, reason: collision with root package name */
    public final i2.a f4238a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.a f4239b;

    /* renamed from: c, reason: collision with root package name */
    public final e2.c f4240c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.i f4241d;

    public o(i2.a aVar, i2.a aVar2, e2.c cVar, f2.i iVar, f2.j jVar) {
        this.f4238a = aVar;
        this.f4239b = aVar2;
        this.f4240c = cVar;
        this.f4241d = iVar;
        jVar.getClass();
        jVar.f37694a.execute(new RunnableC0281a(22, jVar));
    }

    public static o a() {
        C5177d c5177d = f4237e;
        if (c5177d != null) {
            return (o) ((InterfaceC4864a) c5177d.f41698z).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f4237e == null) {
            synchronized (o.class) {
                try {
                    if (f4237e == null) {
                        j jVar = new j();
                        context.getClass();
                        jVar.f4229u = context;
                        f4237e = jVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final n c(X1.a aVar) {
        byte[] bytes;
        Set unmodifiableSet = aVar != null ? Collections.unmodifiableSet(X1.a.f3811d) : Collections.singleton(new W1.c("proto"));
        Y2.e a9 = i.a();
        aVar.getClass();
        a9.f3963u = "cct";
        String str = aVar.f3814a;
        String str2 = aVar.f3815b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a9.f3964v = bytes;
        return new n(unmodifiableSet, a9.p(), this);
    }
}
