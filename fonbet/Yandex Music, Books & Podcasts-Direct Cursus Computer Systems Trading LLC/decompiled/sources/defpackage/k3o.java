package defpackage;

/* loaded from: classes5.dex */
public final class k3o {
    public d0o a;
    public izm b;
    public String d;
    public hsd e;
    public o3o g;
    public l3o h;
    public l3o i;
    public l3o j;
    public long k;
    public long l;
    public evj m;
    public int c = -1;
    public pv9 f = new pv9(9);

    public static void b(String str, l3o l3oVar) {
        if (l3oVar != null) {
            if (l3oVar.g != null) {
                xq0.o(str.concat(".body != null"));
                return;
            }
            if (l3oVar.h != null) {
                xq0.o(str.concat(".networkResponse != null"));
            } else if (l3oVar.i != null) {
                xq0.o(str.concat(".cacheResponse != null"));
            } else {
                if (l3oVar.j == null) {
                    return;
                }
                xq0.o(str.concat(".priorResponse != null"));
            }
        }
    }

    public final l3o a() {
        int i = this.c;
        if (i < 0) {
            l1j.i(this.c, "code < 0: ");
            return null;
        }
        d0o d0oVar = this.a;
        if (d0oVar == null) {
            xq0.q("request == null");
            return null;
        }
        izm izmVar = this.b;
        if (izmVar == null) {
            xq0.q("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new l3o(d0oVar, izmVar, str, i, this.e, this.f.r(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        xq0.q("message == null");
        return null;
    }
}
