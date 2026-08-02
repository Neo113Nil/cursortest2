package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h32 b;

    public /* synthetic */ g32(h32 h32Var, int i) {
        this.a = i;
        this.b = h32Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                h32 h32Var = this.b;
                return new e32(h32Var.g.m(), h32Var.j);
            case 1:
                h32 h32Var2 = this.b;
                return new a32(h32Var2.g.m(), h32Var2.l);
            case 2:
                h32 h32Var3 = this.b;
                return new t32((b32) h32Var3.n.getValue(), (e32) h32Var3.k.getValue(), (a32) h32Var3.m.getValue());
            default:
                h32 h32Var4 = this.b;
                b32 b32Var = (b32) h32Var4.n.getValue();
                t requireActivity = h32Var4.requireActivity();
                requireActivity.getClass();
                b32Var.getClass();
                return new d32(requireActivity);
        }
    }
}
