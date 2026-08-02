package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class py6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ty6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py6(ty6 ty6Var, int i) {
        super(0);
        this.r = i;
        this.s = ty6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                iz6 iz6Var = this.s.l;
                if (iz6Var != null) {
                    return iz6Var;
                }
                Intrinsics.j("viewModelFactory");
                throw null;
            case 1:
                ty6 ty6Var = this.s;
                t requireActivity = ty6Var.requireActivity();
                requireActivity.getClass();
                dt8 dt8Var = ty6Var.i;
                if (dt8Var != null) {
                    return new vb8(requireActivity, dt8Var, ty6Var.getViewLifecycleOwner());
                }
                Intrinsics.j("divConfiguration");
                throw null;
            default:
                return this.s;
        }
    }
}
