package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public final class z72 implements v7p {
    public final /* synthetic */ int a;
    public final ei00 b;

    public /* synthetic */ z72(ei00 ei00Var, int i) {
        this.a = i;
        this.b = ei00Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        ei00 ei00Var = this.b;
        switch (i) {
            case 0:
                return new y72((Map) ei00Var.get());
            default:
                return new q8x((Map) ei00Var.get());
        }
    }
}
