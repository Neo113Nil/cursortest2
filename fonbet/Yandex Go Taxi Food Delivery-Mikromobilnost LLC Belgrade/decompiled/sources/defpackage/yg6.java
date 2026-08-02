package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class yg6 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ yg6(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                if (((dtr0) obj).a == -1 && slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            default:
                slsVar.invoke();
                break;
        }
        return zy11Var;
    }
}
