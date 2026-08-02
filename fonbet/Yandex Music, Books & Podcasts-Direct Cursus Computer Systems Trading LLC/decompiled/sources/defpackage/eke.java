package defpackage;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class eke {
    public static String c = "";
    public final hke a;
    public final gke b;

    public eke(hke hkeVar, gke gkeVar) {
        hkeVar.getClass();
        this.a = hkeVar;
        this.b = gkeVar;
    }

    public final void a() {
        if (c.equals("")) {
            return;
        }
        this.a.b(this.b, c);
        c = "";
    }

    public final void b() {
        if (c.equals("")) {
            String valueOf = String.valueOf(UUID.randomUUID());
            c = valueOf;
            this.a.d(this.b, valueOf);
        }
    }
}
