package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class hnx {
    public static final hnx c = new hnx();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final jzi a = new jzi(3);

    public final knx a(Class cls) {
        knx j;
        Charset charset = smx.a;
        if (cls == null) {
            jj4.j("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        knx knxVar = (knx) concurrentHashMap.get(cls);
        if (knxVar != null) {
            return knxVar;
        }
        jzi jziVar = this.a;
        jziVar.getClass();
        l3l l3lVar = lnx.a;
        jmx.class.isAssignableFrom(cls);
        jnx b = ((c5p) jziVar.a).b(cls);
        if ((b.d & 2) == 2) {
            l3l l3lVar2 = lnx.a;
            euk eukVar = fmx.a;
            j = new fnx(l3lVar2, b.a);
        } else {
            int i = gnx.a;
            int i2 = vmx.a;
            l3l l3lVar3 = lnx.a;
            euk eukVar2 = b.a() + (-1) != 1 ? fmx.a : null;
            int i3 = xmx.a;
            j = enx.j(b, l3lVar3, eukVar2);
        }
        knx knxVar2 = (knx) concurrentHashMap.putIfAbsent(cls, j);
        return knxVar2 == null ? j : knxVar2;
    }
}
