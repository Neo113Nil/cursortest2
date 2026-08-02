package ru.CryptoPro.JCSP;

import java.security.PrivilegedAction;
import java.util.Map;

/* loaded from: classes4.dex */
class cl_1 implements PrivilegedAction {
    final /* synthetic */ Map a;
    final /* synthetic */ JCSP b;

    public cl_1(JCSP jcsp, Map map) {
        this.b = jcsp;
        this.a = map;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        this.b.putAll(this.a);
        return null;
    }
}
