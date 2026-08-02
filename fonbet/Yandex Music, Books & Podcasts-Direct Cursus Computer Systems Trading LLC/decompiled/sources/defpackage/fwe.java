package defpackage;

/* loaded from: classes5.dex */
public final class fwe extends p9 {
    public final /* synthetic */ int b;
    public final /* synthetic */ pue c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwe(pue pueVar, int i) {
        super(8);
        this.b = i;
        this.c = pueVar;
    }

    @Override // defpackage.p9
    public final void v() {
        switch (this.b) {
            case 0:
                owe oweVar = (owe) this.c;
                ((i8h) oweVar.d.c).k.Y.F(oweVar, true);
                break;
            case 1:
                ((j8h) this.c).s();
                break;
            default:
                ((noj) this.c).h.e(true);
                break;
        }
    }

    @Override // defpackage.p9
    public final void w() {
        switch (this.b) {
            case 0:
                owe oweVar = (owe) this.c;
                ((i8h) oweVar.d.c).k.Y.F(oweVar, false);
                break;
            case 1:
                j8h j8hVar = (j8h) this.c;
                if (!j8hVar.F.get()) {
                    j8hVar.u();
                    break;
                }
                break;
            default:
                ((noj) this.c).h.e(false);
                break;
        }
    }
}
