package defpackage;

import coil3.disk.a;

/* loaded from: classes.dex */
public final class qci0 implements AutoCloseable {
    public final txj a;

    public qci0(txj txjVar) {
        this.a = txjVar;
    }

    public final pci0 a() {
        lxj c;
        txj txjVar = this.a;
        a aVar = txjVar.c;
        synchronized (aVar.A) {
            txjVar.close();
            c = aVar.c(txjVar.a.a);
        }
        if (c != null) {
            return new pci0(c);
        }
        return null;
    }

    public final oq90 c() {
        txj txjVar = this.a;
        if (!txjVar.b) {
            return (oq90) txjVar.a.c.get(1);
        }
        ny61.r("snapshot is closed");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
