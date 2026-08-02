package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* loaded from: classes5.dex */
public final class lwe {
    public List a;
    public int b;
    public int c;

    public SocketAddress a() {
        return (SocketAddress) ((reb) this.a.get(this.b)).a.get(this.c);
    }

    public void b() {
        reb rebVar = (reb) this.a.get(this.b);
        int i = this.c + 1;
        this.c = i;
        if (i >= rebVar.a.size()) {
            this.b++;
            this.c = 0;
        }
    }

    public boolean c() {
        return this.b < this.a.size();
    }

    public void d() {
        this.b = 0;
        this.c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i = 0; i < this.a.size(); i++) {
            int indexOf = ((reb) this.a.get(i)).a.indexOf(socketAddress);
            if (indexOf != -1) {
                this.b = i;
                this.c = indexOf;
                return true;
            }
        }
        return false;
    }
}
