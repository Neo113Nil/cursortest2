package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class w0d {
    public final int a;
    public final List b;
    public final boolean c;
    public final cq4 d;
    public final arf e;
    public final ceb f;
    public boolean g;
    public v0d h;
    public rar i;

    public w0d(int i, List list, boolean z, cq4 cq4Var, arf arfVar, ceb cebVar) {
        list.getClass();
        arfVar.getClass();
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = cq4Var;
        this.e = arfVar;
        this.f = cebVar;
        jyr b = btf.b(new u0d(this, 1));
        this.g = ((Boolean) b.getValue()).booleanValue();
        if (!z || ((Boolean) b.getValue()).booleanValue()) {
            return;
        }
        a();
    }

    public final void a() {
        rar rarVar = this.i;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.i = ox6.B(((a0d) this.e.getValue()).a(), this.d, new u58(26, this));
    }
}
