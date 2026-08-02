package defpackage;

/* loaded from: classes3.dex */
public final class q4d {
    public final udp a;

    public q4d(udp udpVar) {
        this.a = udpVar;
    }

    public final n5n a() {
        int ordinal = this.a.a().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return n5n.LOW;
            }
            if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                b6e.s();
                return null;
            }
        }
        return n5n.HIGH;
    }
}
