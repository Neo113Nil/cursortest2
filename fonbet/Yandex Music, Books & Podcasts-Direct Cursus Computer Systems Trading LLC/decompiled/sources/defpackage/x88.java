package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class x88 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z88 b;

    public /* synthetic */ x88(z88 z88Var, int i) {
        this.a = i;
        this.b = z88Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        z88 z88Var = this.b;
        switch (i) {
            case 0:
                c01 c01Var = (c01) obj;
                c01Var.getClass();
                z88Var.getClass();
                v88 v88Var = z88Var.b;
                v88Var.getClass();
                int i2 = ArtistScreenActivity.w0;
                t tVar = v88Var.a;
                tVar.startActivity(l48.o(tVar, c01Var, v88Var.c, 24));
                break;
            case 1:
                c01 c01Var2 = (c01) obj;
                c01Var2.getClass();
                z88Var.getClass();
                v88 v88Var2 = z88Var.b;
                v88Var2.getClass();
                lwg E = g0g.E(c01Var2);
                y supportFragmentManager = v88Var2.a.getSupportFragmentManager();
                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, E), v88Var2.c);
                break;
            default:
                ((Boolean) obj).booleanValue();
                z88Var.a();
                break;
        }
        return Unit.a;
    }
}
