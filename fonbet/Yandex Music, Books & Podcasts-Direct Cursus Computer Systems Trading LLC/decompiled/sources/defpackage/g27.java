package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g27 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ i27 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g27(i27 i27Var, int i) {
        super(0);
        this.r = i;
        this.s = i27Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                ppb ppbVar = this.s.i;
                if (ppbVar != null) {
                    return ppbVar.a();
                }
                Intrinsics.j("callbacks");
                throw null;
            case 1:
                i27 i27Var = this.s;
                t requireActivity = i27Var.requireActivity();
                requireActivity.getClass();
                dt8 dt8Var = i27Var.q;
                if (dt8Var != null) {
                    return new vb8(requireActivity, dt8Var, i27Var.getViewLifecycleOwner());
                }
                Intrinsics.j("divConfiguration");
                throw null;
            case 2:
                return this.s;
            default:
                j27 j27Var = this.s.o;
                if (j27Var != null) {
                    return j27Var;
                }
                Intrinsics.j("viewModelFactory");
                throw null;
        }
    }
}
