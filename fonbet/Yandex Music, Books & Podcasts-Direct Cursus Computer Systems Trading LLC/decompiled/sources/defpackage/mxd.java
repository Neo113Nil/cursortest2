package defpackage;

/* loaded from: classes5.dex */
public final class mxd {
    public static final mxd d;
    public final boolean a;
    public final kxd b;
    public final lxd c;

    static {
        kxd kxdVar = kxd.c;
        lxd lxdVar = lxd.c;
        d = new mxd(false, kxdVar, lxdVar);
        new mxd(true, kxdVar, lxdVar);
    }

    public mxd(boolean z, kxd kxdVar, lxd lxdVar) {
        kxdVar.getClass();
        lxdVar.getClass();
        this.a = z;
        this.b = kxdVar;
        this.c = lxdVar;
    }

    public final String toString() {
        StringBuilder k = dfi.k("HexFormat(\n    upperCase = ");
        k.append(this.a);
        k.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a("        ", k);
        k.append('\n');
        k.append("    ),");
        k.append('\n');
        k.append("    number = NumberHexFormat(");
        k.append('\n');
        this.c.a("        ", k);
        k.append('\n');
        k.append("    )");
        k.append('\n');
        k.append(")");
        return k.toString();
    }
}
