package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s27 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ v27 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s27(v27 v27Var, int i) {
        super(0);
        this.r = i;
        this.s = v27Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                v27 v27Var = this.s;
                t requireActivity = v27Var.requireActivity();
                requireActivity.getClass();
                dt8 dt8Var = v27Var.n;
                if (dt8Var != null) {
                    return new vb8(requireActivity, dt8Var, v27Var.getViewLifecycleOwner());
                }
                Intrinsics.j("divConfiguration");
                throw null;
            case 1:
                return this.s;
            case 2:
                if (this.s.g != null) {
                    return new qds();
                }
                Intrinsics.j("callbacks");
                throw null;
            default:
                d27 d27Var = this.s.l;
                if (d27Var != null) {
                    return d27Var;
                }
                Intrinsics.j("viewModelFactory");
                throw null;
        }
    }
}
