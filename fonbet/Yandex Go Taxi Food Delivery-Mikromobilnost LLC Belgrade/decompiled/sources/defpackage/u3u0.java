package defpackage;

import ru.yandex.taxi.statebar.StateBarViewModel$Type;

/* loaded from: classes10.dex */
public final class u3u0 {
    public final StateBarViewModel$Type a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final kdc h;
    public final kdc i;
    public final kdc j;
    public final bdc k;
    public final Runnable l;
    public final boolean m;

    public u3u0(t3u0 t3u0Var) {
        this.a = t3u0Var.a;
        this.b = t3u0Var.b;
        this.c = t3u0Var.c;
        this.d = t3u0Var.d;
        this.e = t3u0Var.e;
        this.f = t3u0Var.f;
        this.g = t3u0Var.g;
        this.h = t3u0Var.h;
        this.i = t3u0Var.k;
        this.j = t3u0Var.l;
        this.k = t3u0Var.m;
        this.l = t3u0Var.i;
        this.m = t3u0Var.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && u3u0.class.equals(obj.getClass()) && this.a == ((u3u0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
