package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class l5c extends jno {
    public final HashMap e = new HashMap();

    @Override // defpackage.jno
    public final gno a(Object obj) {
        return (gno) this.e.get(obj);
    }

    @Override // defpackage.jno
    public final Object g(Object obj) {
        Object g = super.g(obj);
        this.e.remove(obj);
        return g;
    }
}
