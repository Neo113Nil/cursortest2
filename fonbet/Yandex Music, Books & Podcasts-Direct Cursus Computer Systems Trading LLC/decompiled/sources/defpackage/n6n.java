package defpackage;

/* loaded from: classes3.dex */
public final class n6n extends bfu {
    public final vtm k;
    public final boolean l;
    public final ail m;

    public n6n(vtm vtmVar, boolean z) {
        this.k = vtmVar;
        this.l = z;
        this.m = new ail(13, new h0m(((a6n) vtmVar.a).a.e, 15), this);
    }

    public final void a(uft uftVar) {
        i7q i7qVar;
        uftVar.getClass();
        vtm vtmVar = this.k;
        vtmVar.getClass();
        j7q j7qVar = ((a6n) vtmVar.a).a;
        int ordinal = uftVar.ordinal();
        if (ordinal == 0) {
            i7qVar = i7q.e;
        } else if (ordinal == 1) {
            i7qVar = i7q.d;
        } else if (ordinal == 2) {
            i7qVar = i7q.c;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return;
            }
            i7qVar = i7q.f;
        }
        x97.y(j7qVar.c, null, null, new kun(j7qVar, i7qVar, null, 26), 3);
    }
}
