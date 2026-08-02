package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes3.dex */
public final class xef implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aff b;
    public final /* synthetic */ rvl c;

    public /* synthetic */ xef(aff affVar, rvl rvlVar, int i) {
        this.a = i;
        this.b = affVar;
        this.c = rvlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                cvl cvlVar = this.c.b;
                aff affVar = this.b;
                affVar.getClass();
                sy4 sy4Var = affVar.c;
                sy4Var.getClass();
                t tVar = sy4Var.a;
                tVar.startActivity(ixf.E(tVar, cvlVar, d.t()));
                break;
            default:
                cvl cvlVar2 = this.c.b;
                aff affVar2 = this.b;
                affVar2.getClass();
                sy4 sy4Var2 = affVar2.c;
                sy4Var2.getClass();
                t tVar2 = sy4Var2.a;
                lwg G = g0g.G(cvlVar2);
                y supportFragmentManager = tVar2.getSupportFragmentManager();
                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), d.t());
                break;
        }
        return Unit.a;
    }
}
