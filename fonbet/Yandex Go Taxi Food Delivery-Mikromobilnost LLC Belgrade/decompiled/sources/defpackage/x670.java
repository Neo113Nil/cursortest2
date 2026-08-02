package defpackage;

import kotlinx.coroutines.a;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j;

/* loaded from: classes5.dex */
public final class x670 implements s030 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ x670(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.s030
    public final void onDismiss() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                qhw0 qhw0Var = jVar.j;
                if (qhw0Var != null) {
                    a.h(qhw0Var);
                }
                String str = jVar.l;
                if (str != null) {
                    jVar.h.c.b.a(str);
                    jVar.l = null;
                }
                jVar.e.c();
                break;
            default:
                qhw0 qhw0Var2 = jVar.j;
                if (qhw0Var2 != null) {
                    qhw0Var2.a(null);
                }
                jVar.e.c();
                break;
        }
    }
}
