package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m17 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ o17 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m17(o17 o17Var, int i) {
        super(0);
        this.r = i;
        this.s = o17Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                sbp sbpVar = this.s.g;
                if (sbpVar != null) {
                    return sbpVar.a();
                }
                Intrinsics.j("callbacks");
                throw null;
            case 1:
                o17 o17Var = this.s;
                t requireActivity = o17Var.requireActivity();
                requireActivity.getClass();
                dt8 dt8Var = o17Var.o;
                if (dt8Var != null) {
                    return new vb8(requireActivity, dt8Var, o17Var.getViewLifecycleOwner());
                }
                Intrinsics.j("divConfiguration");
                throw null;
            case 2:
                return this.s;
            default:
                d27 d27Var = this.s.m;
                if (d27Var != null) {
                    return d27Var;
                }
                Intrinsics.j("viewModelFactory");
                throw null;
        }
    }
}
