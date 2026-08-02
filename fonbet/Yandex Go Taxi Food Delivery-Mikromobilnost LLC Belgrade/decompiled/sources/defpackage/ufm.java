package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class ufm implements d170 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ufm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.d170
    public final Object a(Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tfm) obj).d.b(tfm.e);
                break;
            case 1:
                ((x1f0) obj).a(null);
                break;
            default:
                r0 r0Var = ((mt51) obj).a;
                lt51 lt51Var = lt51.d;
                r0Var.getClass();
                r0Var.m(null, lt51Var);
                break;
        }
        return zy11Var;
    }
}
