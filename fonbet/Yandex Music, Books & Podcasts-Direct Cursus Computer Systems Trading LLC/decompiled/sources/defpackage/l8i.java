package defpackage;

/* loaded from: classes3.dex */
public final class l8i {
    public final k7i a;
    public final n8i b;
    public final fkn c;

    public l8i(k7i k7iVar, n8i n8iVar) {
        this.a = k7iVar;
        this.b = n8iVar;
        this.c = n8iVar.k;
    }

    public static thj a(a8i a8iVar, spd spdVar) {
        pkb pkbVar = pkb.Shortcut;
        String id = a8iVar.getId();
        int i = spdVar.a;
        int i2 = spdVar.b;
        id.getClass();
        return new thj(pkbVar, id, i + 1, i2 + 1, "");
    }

    public final void b(a8i a8iVar, spd spdVar) {
        a8iVar.getClass();
        spdVar.getClass();
        String a = a8iVar.a();
        this.a.a(a);
        rmb.k(this.b.e, a, a(a8iVar, spdVar), null, 4);
    }

    public final void c(boolean z) {
        String a;
        n8i n8iVar = this.b;
        if (z) {
            a = "yandexmusic://mixes";
        } else if (z) {
            b6e.s();
            return;
        } else {
            o43 o43Var = n8iVar.g.d;
            a = o43Var != null ? o43Var.a() : null;
        }
        if (a != null) {
            this.a.a(a);
            rmb.k(n8iVar.e, a, null, null, 6);
        }
    }

    public final void d(a8i a8iVar, spd spdVar, boolean z, String str) {
        a8iVar.getClass();
        spdVar.getClass();
        str.getClass();
        weo.H(this.b.e, a(a8iVar, spdVar), z, str, null);
    }
}
