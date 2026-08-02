package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/* loaded from: classes10.dex */
public final class yyq0 implements bre0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(String str, Supplier supplier) {
        return this.a.computeIfAbsent(str, new dxd(10, new ate0(12, supplier)));
    }

    @Override // defpackage.bre0
    public final void b() {
        this.a.clear();
    }
}
