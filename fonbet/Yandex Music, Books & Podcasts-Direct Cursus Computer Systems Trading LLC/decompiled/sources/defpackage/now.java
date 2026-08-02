package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class now extends oow {
    public final String a;
    public final v80 b;
    public final List c;
    public final boolean d;
    public final int e;
    public final long f;
    public final y1u g;
    public final h4q h;

    public now(String str, v80 v80Var, List list, boolean z, int i, long j) {
        str.getClass();
        this.a = str;
        this.b = v80Var;
        this.c = list;
        this.d = z;
        this.e = i;
        this.f = j;
        this.g = (y1u) list.get(i);
        this.h = h4q.b;
    }

    @Override // defpackage.oow
    public final boolean a() {
        throw null;
    }

    @Override // defpackage.oow
    public final long b() {
        throw null;
    }

    @Override // defpackage.oow
    public final h4q c() {
        throw null;
    }

    @Override // defpackage.oow
    public final long d() {
        return this.f;
    }

    public final String toString() {
        return "Launch.VideoClip()";
    }
}
