package defpackage;

import androidx.media3.session.i;

/* loaded from: classes.dex */
public final /* synthetic */ class nth implements rth {
    public final /* synthetic */ int a;
    public final /* synthetic */ sth b;

    public /* synthetic */ nth(sth sthVar, int i) {
        this.a = i;
        this.b = sthVar;
    }

    @Override // defpackage.rth
    public final void a(wrh wrhVar) {
        switch (this.a) {
            case 0:
                this.b.h.t.K();
                break;
            case 1:
                this.b.h.t.B();
                break;
            case 2:
                this.b.h.t.G0();
                break;
            case 3:
                this.b.h.t.F0();
                break;
            case 4:
                this.b.h.t.q();
                break;
            case 5:
                this.b.h.t.stop();
                break;
            case 6:
                i iVar = this.b.h;
                lrl lrlVar = iVar.t;
                if (!dvt.i0(lrlVar, iVar.p)) {
                    if (lrlVar != null && lrlVar.V0(1)) {
                        lrlVar.b();
                        break;
                    }
                } else {
                    dvt.P(lrlVar);
                    break;
                }
                break;
            case 7:
                this.b.h.t.b0();
                break;
            case 8:
                this.b.h.t.M();
                break;
            case 9:
                this.b.h.h(wrhVar, true);
                break;
            default:
                lrl lrlVar2 = this.b.h.t;
                if (lrlVar2 != null && lrlVar2.V0(1)) {
                    lrlVar2.b();
                    break;
                }
                break;
        }
    }
}
