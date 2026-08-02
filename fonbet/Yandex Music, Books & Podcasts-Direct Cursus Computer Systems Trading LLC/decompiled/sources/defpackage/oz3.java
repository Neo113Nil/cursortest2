package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class oz3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b04 b;
    public final /* synthetic */ dz3 c;
    public final /* synthetic */ int d;

    public /* synthetic */ oz3(b04 b04Var, dz3 dz3Var, int i, int i2) {
        this.a = i2;
        this.b = b04Var;
        this.c = dz3Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = this.d;
                this.b.a(this.c.d(), i);
                break;
            case 1:
                int i2 = this.d;
                this.b.b(this.c.d(), i2);
                break;
            case 2:
                int i3 = this.d;
                this.b.a(this.c.d(), i3);
                break;
            case 3:
                int i4 = this.d;
                this.b.b(this.c.d(), i4);
                break;
            case 4:
                u51 d = this.c.d();
                b04 b04Var = this.b;
                b04Var.getClass();
                d.getClass();
                rmb.j(b04Var.g, wjb.ArtistTrackListScreen, gld.I(d, this.d), null, 12);
                b04Var.b.c(d);
                break;
            default:
                u51 d2 = this.c.d();
                b04 b04Var2 = this.b;
                b04Var2.getClass();
                d2.getClass();
                rmb.j(b04Var2.g, wjb.ArtistFamiliarToYouScreen, gld.I(d2, this.d), null, 12);
                b04Var2.b.l(d2);
                break;
        }
        return Unit.a;
    }
}
