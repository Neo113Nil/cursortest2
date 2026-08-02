package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class uqd0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ vqd0 b;

    public /* synthetic */ uqd0(vqd0 vqd0Var, int i) {
        this.a = i;
        this.b = vqd0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vqd0 vqd0Var = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                vqd0Var.getClass();
                vqd0Var.b(new u131("superapp.profile.plus_availability", booleanValue));
                break;
            default:
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                vqd0Var.getClass();
                vqd0Var.b(new z131("superapp.profile.plus_balance", str));
                break;
        }
        return zy11Var;
    }
}
