package defpackage;

/* loaded from: classes3.dex */
public final class u5r {
    public final s5r a;
    public final t5r b;
    public final p5r c;
    public final ifs d;
    public final ifs e;

    public u5r(s5r s5rVar, t5r t5rVar, p5r p5rVar, ifs ifsVar, ifs ifsVar2) {
        this.a = s5rVar;
        this.b = t5rVar;
        this.c = p5rVar;
        this.d = ifsVar;
        this.e = ifsVar2;
    }

    public final cvd a(boolean z, wud wudVar) {
        avd avdVar;
        q6k q6kVar;
        bvd bvdVar;
        s5r s5rVar = this.a;
        boolean z2 = s5rVar instanceof q5r;
        ifs ifsVar = this.e;
        xud xudVar = null;
        if (z2) {
            q5r q5rVar = (q5r) s5rVar;
            q6kVar = new yud(z, new ifs(q5rVar.a, q5rVar.b), q5rVar.c, ifsVar != null);
        } else {
            if (!(s5rVar instanceof r5r)) {
                b6e.s();
                return null;
            }
            r5r r5rVar = (r5r) s5rVar;
            o43 o43Var = r5rVar.b;
            hfs hfsVar = r5rVar.a;
            if (hfsVar != null) {
                avdVar = new avd(z, new hfs(hfsVar.a, hfsVar.b), o43Var, ifsVar != null);
            } else {
                String str = o43Var != null ? o43Var.a : null;
                avdVar = new avd(z, null, str != null ? new o43(str, null) : null, ifsVar != null);
            }
            q6kVar = avdVar;
        }
        t5r t5rVar = this.b;
        if (t5rVar != null) {
            String str2 = t5rVar.a;
            hfs hfsVar2 = t5rVar.b;
            bvdVar = new bvd(str2, hfsVar2 != null ? new hfs(hfsVar2.a, hfsVar2.b) : null);
        } else {
            bvdVar = null;
        }
        p5r p5rVar = this.c;
        if (p5rVar != null) {
            String str3 = p5rVar.a;
            hfs hfsVar3 = p5rVar.c;
            hfs hfsVar4 = new hfs(hfsVar3.a, hfsVar3.b);
            hfs hfsVar5 = p5rVar.d;
            xudVar = new xud(hfsVar4, hfsVar5 != null ? new hfs(hfsVar5.a, hfsVar5.b) : null, str3, p5rVar.b);
        }
        return new cvd(q6kVar, bvdVar, xudVar, wudVar);
    }

    public final n5r b() {
        ifs ifsVar = this.d;
        ifs ifsVar2 = ifsVar != null ? new ifs(ifsVar.a, ifsVar.b) : null;
        ifs ifsVar3 = this.e;
        return new n5r(ifsVar3 != null ? new ifs(ifsVar3.a, ifsVar3.b) : null, ifsVar2);
    }
}
