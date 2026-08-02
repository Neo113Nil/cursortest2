package defpackage;

import androidx.compose.material.a;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class aci extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jx7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aci(jx7 jx7Var, int i) {
        super(0);
        this.r = i;
        this.s = jx7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return Float.valueOf(this.s.n0(a.b));
            default:
                return Float.valueOf(this.s.n0(125));
        }
    }
}
