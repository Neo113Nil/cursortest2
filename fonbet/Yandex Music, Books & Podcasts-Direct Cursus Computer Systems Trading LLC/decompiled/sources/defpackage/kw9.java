package defpackage;

import com.yandex.passport.internal.ui.l;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class kw9 extends j8t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public kw9(k8t k8tVar, xy0 xy0Var) {
        this.a = 1;
        this.c = k8tVar;
        this.b = xy0Var;
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // defpackage.j8t, defpackage.a8t
    public final void e(b8t b8tVar) {
        switch (this.a) {
            case 0:
                ((lw9) this.c).c.clear();
                ((n8t) this.b).H(this);
                break;
            case 1:
                ((ArrayList) ((xy0) this.b).get(((k8t) this.c).b)).remove(b8tVar);
                b8tVar.H(this);
                break;
            default:
                b8tVar.getClass();
                a aVar = (a) this.b;
                if (!aVar.d().canScrollVertically(1)) {
                    aVar.b.invoke();
                    break;
                } else {
                    aVar.j = new l(12, (vqn) this.c, aVar);
                    aVar.d().setOnScrollChangeListener(aVar.j);
                    break;
                }
        }
    }

    public /* synthetic */ kw9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
