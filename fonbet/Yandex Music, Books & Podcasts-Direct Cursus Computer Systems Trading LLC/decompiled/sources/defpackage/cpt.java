package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class cpt {
    public final qku d;
    public long e;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public final LinkedHashMap f = new LinkedHashMap();

    public cpt(qku qkuVar) {
        this.d = qkuVar;
    }

    public final void a() {
        ihs ihsVar = this.d.b;
        int min = Math.min(this.a, Math.min(this.b, this.c));
        int i = this.a;
        if (i == -1 || min <= i) {
            return;
        }
        this.f.put(Long.valueOf(ihsVar.a() - this.e), Double.valueOf((min - r3) / this.a));
        this.e = ihsVar.a();
    }
}
