package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class vxj implements Closeable {
    public final String a;
    public final long b;
    public final ArrayList c;
    public final /* synthetic */ dyj w;

    public vxj(dyj dyjVar, String str, long j, ArrayList arrayList) {
        this.w = dyjVar;
        this.a = str;
        this.b = j;
        this.c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            yf61.b((y9t0) it.next());
        }
    }
}
