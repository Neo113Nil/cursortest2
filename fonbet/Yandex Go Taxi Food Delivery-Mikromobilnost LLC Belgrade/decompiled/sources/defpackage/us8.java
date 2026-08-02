package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.care.camera.b;

/* loaded from: classes4.dex */
public final class us8 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ us8(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                if (!(((rs8) obj) instanceof ms8)) {
                    pzt0 pzt0Var = bVar.C;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    bVar.C = null;
                    r0 r0Var = bVar.F;
                    Integer num = new Integer(-1);
                    r0Var.getClass();
                    r0Var.m(null, num);
                    break;
                }
                break;
            default:
                if (((qs8) obj) != null) {
                    fzd fzdVar = (fzd) bVar.b.b.get(bVar.y - 1);
                    bVar.w.n(new jo7(bVar.y, fzdVar.c, fzdVar.g));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
