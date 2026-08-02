package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class m86 implements xxt {
    public final Map a;

    public m86(cck cckVar) {
        this.a = dfi.n("platform", cckVar.a);
    }

    @Override // defpackage.xxt
    public Object get(String str) {
        return this.a.get(str);
    }

    public m86(Map map) {
        this.a = map;
    }
}
