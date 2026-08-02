package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class t95 extends oyc {
    public final /* synthetic */ int a = 0;
    public final List b;
    public final mhb c;
    public final boolean d;
    public final oyc e;

    public t95(j85 j85Var, byte b) {
        j85Var.getClass();
        this.e = j85Var;
        this.b = u75.h(new azc(mhb.STRING), new azc(mhb.NUMBER));
        this.c = mhb.COLOR;
        this.d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        switch (this.a) {
            case 0:
                try {
                    return ((j85) this.e).e(g06Var, jhbVar, t75.c(new c85(bow.v((String) ouj.j(list, list)))));
                } catch (IllegalArgumentException e) {
                    ghh.J(c(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e);
                    throw null;
                }
            default:
                try {
                    return ((j85) this.e).e(g06Var, jhbVar, u75.h(new c85(bow.v((String) ouj.i(list, 0))), list.get(1)));
                } catch (IllegalArgumentException e2) {
                    ghh.J(c(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e2);
                    throw null;
                }
        }
    }

    @Override // defpackage.oyc
    public final List b() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.oyc
    public final mhb d() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        switch (this.a) {
        }
        return this.d;
    }

    public t95(j85 j85Var) {
        j85Var.getClass();
        this.e = j85Var;
        this.b = t75.c(new azc(mhb.STRING));
        this.c = mhb.NUMBER;
        this.d = true;
    }
}
