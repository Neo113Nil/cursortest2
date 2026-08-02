package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ipc implements u6c, rzb {
    public static final ipc c;
    public static final ipc d;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i = 0;
        c = new ipc("VERTICAL", i);
        d = new ipc("HORIZONTAL", i);
    }

    public /* synthetic */ ipc(hpc hpcVar) {
        this.a = 3;
        this.b = hpcVar.b;
    }

    public static ipc a(d7k d7kVar) {
        String str;
        d7kVar.I(2);
        int v = d7kVar.v();
        int i = v >> 1;
        int v2 = ((d7kVar.v() >> 3) & 31) | ((v & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder k = dfi.k(str);
        k.append(i < 10 ? ".0" : ".");
        k.append(i);
        k.append(v2 < 10 ? ".0" : ".");
        k.append(v2);
        return new ipc(k.toString(), 1);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            try {
                mgb mgbVar = new mgb(this.b);
                if ((mgbVar.b == null || mgbVar.c == null) ? false : true) {
                    zsd.O0(mgbVar.a, mgbVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.rzb
    public jxt d(Map map) {
        throw new mac(hrg.q("Unknown operation '", this.b, "'"), (Throwable) null);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ipc(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
