package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class qk6 {
    public final rxv a;
    public final euf b;
    public final sk6 c;
    public final mm6 d;
    public final HashMap e;
    public wpe f;
    public rk6 g;

    public qk6(rxv rxvVar, euf eufVar, sk6 sk6Var, mm6 mm6Var) {
        eufVar.getClass();
        this.a = rxvVar;
        this.b = eufVar;
        this.c = sk6Var;
        this.d = mm6Var;
        this.e = new HashMap();
        this.g = new rk6(-1, -1, -1, -1);
    }

    public final void a(geh gehVar, long j) {
        HashMap hashMap = this.e;
        if (hashMap.get(gehVar) == null) {
            hashMap.put(gehVar, this.b.a(this.c.a(gehVar), j));
        }
    }
}
