package defpackage;

/* loaded from: classes.dex */
public final class g1m extends atc {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public g1m(sis sisVar) {
        super(sisVar);
        this.g = new ris();
    }

    @Override // defpackage.atc, defpackage.sis
    public ois f(int i, ois oisVar, boolean z) {
        switch (this.f) {
            case 0:
                sis sisVar = this.e;
                ois f = sisVar.f(i, oisVar, z);
                if (sisVar.m(f.c, (ris) this.g, 0L).a()) {
                    f.j(oisVar.a, oisVar.b, oisVar.c, oisVar.d, oisVar.e, lj.f, true);
                } else {
                    f.f = true;
                }
                return f;
            default:
                return super.f(i, oisVar, z);
        }
    }

    @Override // defpackage.atc, defpackage.sis
    public ris m(int i, ris risVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, risVar, j);
                onh onhVar = (onh) this.g;
                risVar.c = onhVar;
                gnh gnhVar = onhVar.b;
                risVar.getClass();
                return risVar;
            default:
                return super.m(i, risVar, j);
        }
    }

    public g1m(sis sisVar, onh onhVar) {
        super(sisVar);
        this.g = onhVar;
    }
}
