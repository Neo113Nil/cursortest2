package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class bhd extends mch {
    public final /* synthetic */ int g = 0;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhd(chd chdVar, int i) {
        super(null, 2, 10, i);
        this.h = chdVar;
    }

    @Override // defpackage.mch
    public final void b(int i) {
        switch (this.g) {
            case 0:
                if (((chd) this.h).c && i != 0) {
                    zgd zgdVar = (zgd) ((chd) this.h).d.get();
                    int i2 = zgdVar.a;
                    if (i > 0) {
                        zgdVar = new zgd(yhn.d(i2 + 1, 0, 10));
                    } else if (i < 0) {
                        zgdVar = new zgd(yhn.d(i2 - 1, 0, 10));
                    }
                    Continuation continuation = null;
                    v3w.k("Setted ", zgdVar.a, 3, "GlagolVolume", null);
                    ((chd) this.h).d.set(zgdVar);
                    chd chdVar = (chd) this.h;
                    int i3 = zgdVar.a;
                    bhd bhdVar = chdVar.l;
                    if (i3 == 0) {
                        i3 = -1;
                    }
                    bhdVar.e(i3);
                    chd chdVar2 = (chd) this.h;
                    x97.y(chdVar2.g, null, null, new ahd(chdVar2, zgdVar, continuation, 0), 3);
                    break;
                }
                break;
            case 1:
                ((yld) ((vx6) this.h).d).a.post(new wld(this, i, 1));
                break;
            default:
                if (((ltw) this.h).d) {
                    ltw ltwVar = (ltw) this.h;
                    itw itwVar = i > 0 ? htw.a : i < 0 ? ftw.a : null;
                    if (itwVar != null) {
                        ltw.a(ltwVar, itwVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.mch
    public final void d(int i) {
        switch (this.g) {
            case 0:
                if (((chd) this.h).c) {
                    zgd zgdVar = new zgd(yhn.d(i, 0, 10));
                    ((chd) this.h).d.set(zgdVar);
                    chd chdVar = (chd) this.h;
                    x97.y(chdVar.g, null, null, new ahd(chdVar, zgdVar, null, 1), 3);
                    break;
                }
                break;
            case 1:
                ((yld) ((vx6) this.h).d).a.post(new wld(this, i, 0));
                break;
            default:
                if (((ltw) this.h).d) {
                    ltw.a((ltw) this.h, new gtw(i));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhd(ltw ltwVar, int i, int i2) {
        super(null, 2, i, i2);
        this.h = ltwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhd(vx6 vx6Var, int i, int i2, int i3, String str) {
        super(str, i, i2, i3);
        this.h = vx6Var;
    }
}
