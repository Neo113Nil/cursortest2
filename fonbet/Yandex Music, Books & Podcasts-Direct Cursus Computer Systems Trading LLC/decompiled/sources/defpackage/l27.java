package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l27 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ o27 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l27(o27 o27Var, int i) {
        super(0);
        this.r = i;
        this.s = o27Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                xxf xxfVar = this.s.j;
                if (xxfVar != null) {
                    return xxfVar.a();
                }
                Intrinsics.j("callbacks");
                throw null;
            case 1:
                o27 o27Var = this.s;
                t requireActivity = o27Var.requireActivity();
                requireActivity.getClass();
                dt8 dt8Var = o27Var.o;
                if (dt8Var != null) {
                    return new vb8(requireActivity, dt8Var, o27Var.getViewLifecycleOwner());
                }
                Intrinsics.j("divConfiguration");
                throw null;
            case 2:
                return this.s;
            default:
                j27 j27Var = this.s.m;
                if (j27Var != null) {
                    return j27Var;
                }
                Intrinsics.j("viewModelFactory");
                throw null;
        }
    }
}
