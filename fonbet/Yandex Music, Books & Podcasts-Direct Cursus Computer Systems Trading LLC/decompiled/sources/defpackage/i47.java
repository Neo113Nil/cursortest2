package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i47 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ l47 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i47(l47 l47Var, int i) {
        super(0);
        this.r = i;
        this.s = l47Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                sbp sbpVar = this.s.h;
                if (sbpVar != null) {
                    return sbpVar.a();
                }
                Intrinsics.j("callbacks");
                throw null;
            case 1:
                l47 l47Var = this.s;
                t requireActivity = l47Var.requireActivity();
                requireActivity.getClass();
                dt8 dt8Var = l47Var.n;
                if (dt8Var != null) {
                    return new vb8(requireActivity, dt8Var, l47Var.getViewLifecycleOwner());
                }
                Intrinsics.j("divConfiguration");
                throw null;
            case 2:
                return this.s;
            case 3:
                if (this.s.h != null) {
                    return new qds();
                }
                Intrinsics.j("callbacks");
                throw null;
            default:
                z57 z57Var = this.s.l;
                if (z57Var != null) {
                    return z57Var;
                }
                Intrinsics.j("viewModelFactory");
                throw null;
        }
    }
}
