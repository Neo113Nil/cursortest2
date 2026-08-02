package defpackage;

/* loaded from: classes6.dex */
public final class urx0 implements rb5 {
    public final /* synthetic */ vrx0 b;
    public final /* synthetic */ sb5 c;

    public urx0(vrx0 vrx0Var, sb5 sb5Var) {
        this.b = vrx0Var;
        this.c = sb5Var;
    }

    @Override // defpackage.rb5
    public final void a() {
        this.b.x.d.a = false;
    }

    @Override // defpackage.rb5
    public final void b() {
        gsx0 gsx0Var = this.b.B;
        if (gsx0Var != null) {
            gsx0Var.a.onViewHolderClicked(this.c);
        }
    }
}
