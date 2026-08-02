package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class fex {
    public static final fex c = new fex();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final rp7 a = new rp7(2);

    public final iex a(Class cls) {
        iex u;
        Charset charset = xcx.a;
        if (cls == null) {
            jj4.j("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        iex iexVar = (iex) concurrentHashMap.get(cls);
        if (iexVar != null) {
            return iexVar;
        }
        rp7 rp7Var = this.a;
        rp7Var.getClass();
        itk itkVar = jex.a;
        mcx.class.isAssignableFrom(cls);
        hex b = ((hjp) rp7Var.a).b(cls);
        if ((b.d & 2) == 2) {
            itk itkVar2 = jex.a;
            jwl jwlVar = rbx.a;
            u = new cex(itkVar2, b.a);
        } else {
            int i = dex.a;
            int i2 = rdx.a;
            itk itkVar3 = jex.a;
            jwl jwlVar2 = b.a() + (-1) != 1 ? rbx.a : null;
            int i3 = xdx.a;
            u = bex.u(b, itkVar3, jwlVar2);
        }
        iex iexVar2 = (iex) concurrentHashMap.putIfAbsent(cls, u);
        return iexVar2 == null ? u : iexVar2;
    }
}
