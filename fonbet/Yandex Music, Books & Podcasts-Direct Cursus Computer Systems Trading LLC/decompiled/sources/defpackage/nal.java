package defpackage;

import androidx.fragment.app.y;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class nal implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ nal(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a aVar = this.b;
                return new fle(vke.a, aVar.v.c, wyf.F(aVar.getLifecycle()));
            case 1:
                a aVar2 = this.b;
                return new kvo(new nal(aVar2, 2), new nal(aVar2, 3));
            case 2:
                return this.b.g();
            default:
                a aVar3 = this.b;
                if (aVar3.v.b.getValue() == aal.b) {
                    jnb C = aVar3.C();
                    cvo k = C != null ? C.getK() : null;
                    if (k != null) {
                        return k;
                    }
                }
                y supportFragmentManager = aVar3.getSupportFragmentManager();
                supportFragmentManager.getClass();
                cvo A = a.A(supportFragmentManager, aVar3.C());
                return A == null ? new cvo(wjb.DynamicScreen, hlb.Fullscreen, (glb) null, new dvo(aVar3.getClass().getSimpleName()), (avo) null, 52) : A;
        }
    }
}
