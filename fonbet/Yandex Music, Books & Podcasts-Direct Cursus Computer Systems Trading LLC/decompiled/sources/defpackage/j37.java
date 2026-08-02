package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j37 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ l37 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j37(l37 l37Var, int i) {
        super(0);
        this.r = i;
        this.s = l37Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                i37 i37Var = this.s.g;
                if (i37Var != null) {
                    return i37Var.a();
                }
                Intrinsics.j("callbacks");
                throw null;
            default:
                l37 l37Var = this.s;
                t requireActivity = l37Var.requireActivity();
                requireActivity.getClass();
                dt8 dt8Var = l37Var.l;
                if (dt8Var != null) {
                    return new vb8(requireActivity, dt8Var, l37Var.getViewLifecycleOwner());
                }
                Intrinsics.j("divConfiguration");
                throw null;
        }
    }
}
