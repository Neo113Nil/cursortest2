package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class x46 {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public List f;

    public final void a() {
        this.a = true;
    }

    public final boolean b() {
        return this.a;
    }

    public final void c() {
        this.c = false;
        this.b = true;
    }

    public final void d(List list) {
        this.f = list;
    }

    public final void e(int i, int i2) {
        this.c = true;
        this.d = i;
        this.e = i2;
    }
}
