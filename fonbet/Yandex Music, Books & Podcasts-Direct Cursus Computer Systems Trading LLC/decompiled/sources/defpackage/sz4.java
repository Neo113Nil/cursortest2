package defpackage;

import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class sz4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sz4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                jz4 jz4Var = (jz4) this.c;
                tnb.d((tnb) jz4Var.g.c.getValue(), wjb.FeatureOnboardingScreen);
                y supportFragmentManager = jz4Var.b.a.getSupportFragmentManager();
                supportFragmentManager.getClass();
                ghh.G(supportFragmentManager, this.b);
                break;
            default:
                l75 l75Var = (l75) this.c;
                p75 p75Var = (p75) l75Var.d.getValue();
                mmu mmuVar = p75Var instanceof n75 ? ((n75) p75Var).a : null;
                rmb.j(l75Var.b, wjb.BottomsheetScreen, mmuVar != null ? bfg.k(mmuVar.d, 0) : null, null, 12);
                ghh.G(l75Var.a.a.a, this.b);
                break;
        }
        return Unit.a;
    }
}
