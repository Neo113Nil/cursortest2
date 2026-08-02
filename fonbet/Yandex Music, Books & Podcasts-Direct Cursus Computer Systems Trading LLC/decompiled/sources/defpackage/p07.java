package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p07 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ u07 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p07(u07 u07Var, int i) {
        super(0);
        this.r = i;
        this.s = u07Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        u8q C;
        switch (this.r) {
            case 0:
                u07 u07Var = this.s;
                l07 l07Var = u07Var.i;
                if (l07Var == null || (C = l07Var.a()) == null) {
                    lom lomVar = u07Var.j;
                    C = lomVar != null ? lomVar.a.C() : null;
                }
                if (C != null) {
                    return C;
                }
                xq0.q("ViewModel is null, callback isn`t provided");
                return null;
            case 1:
                u07 u07Var2 = this.s;
                t requireActivity = u07Var2.requireActivity();
                requireActivity.getClass();
                dt8 dt8Var = u07Var2.p;
                if (dt8Var != null) {
                    return new vb8(requireActivity, dt8Var, u07Var2.getViewLifecycleOwner());
                }
                Intrinsics.j("divConfiguration");
                throw null;
            case 2:
                lom lomVar2 = this.s.j;
                if (lomVar2 != null) {
                    lomVar2.a.r = null;
                }
                if (lomVar2 != null) {
                    lomVar2.n();
                }
                return Unit.a;
            case 3:
                u07 u07Var3 = this.s;
                if (u07Var3.isAdded() && !u07Var3.getParentFragmentManager().Q()) {
                    lom lomVar3 = u07Var3.j;
                    if (lomVar3 != null) {
                        lomVar3.a.r = null;
                    }
                    if (lomVar3 != null) {
                        lomVar3.n();
                    }
                }
                return Unit.a;
            case 4:
                return this.s;
            default:
                u07 u07Var4 = this.s;
                gs4 gs4Var = u07Var4.s;
                if (gs4Var == null) {
                    Intrinsics.j("fitchBindScreenUseCase");
                    throw null;
                }
                g0c z = u07Var4.z();
                sdk sdkVar = u07Var4.r;
                if (sdkVar != null) {
                    return new ci6(gs4Var, z, sdkVar);
                }
                Intrinsics.j("paymentApi");
                throw null;
        }
    }
}
