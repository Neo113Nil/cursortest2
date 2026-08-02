package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class upq {
    public final kpm a;
    public final spq b;
    public final i0j c;
    public final uyt d;
    public final z66 e;
    public final t70 f;
    public final jyr g = btf.b(new z26(this, 4));
    public final jyr h = btf.b(new z26(this, 5));
    public final x0q i = y0q.b(0, 10, oi3.b, 1);
    public final to3 j;

    public upq(kpm kpmVar, spq spqVar, i0j i0jVar, uyt uytVar, z66 z66Var, t70 t70Var) {
        this.a = kpmVar;
        this.b = spqVar;
        this.c = i0jVar;
        this.d = uytVar;
        this.e = z66Var;
        this.f = t70Var;
        this.j = new to3(new File((File) kpmVar.b, "skeleton_network_cache"), 10485760L);
    }

    public static /* synthetic */ e0j b(upq upqVar, spq spqVar, Function1 function1, int i) {
        if ((i & 1) != 0) {
            spqVar = upqVar.b;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return upqVar.a(spqVar, function1);
    }

    public final e0j a(spq spqVar, Function1 function1) {
        return i0j.a(this.c, new ooj(null, new xum(22, this, spqVar), 31), function1, new h2q(29), null, 49);
    }

    public final e0j c() {
        return (e0j) this.h.getValue();
    }
}
