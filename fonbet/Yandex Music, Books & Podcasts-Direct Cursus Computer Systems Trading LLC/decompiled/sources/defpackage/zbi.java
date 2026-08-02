package defpackage;

import androidx.compose.material.a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zbi extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jx7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zbi(jx7 jx7Var, int i) {
        super(1);
        this.r = i;
        this.s = jx7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((Number) obj).floatValue();
                return Float.valueOf(this.s.n0(a.a));
            default:
                ((Number) obj).floatValue();
                return Float.valueOf(this.s.n0(56));
        }
    }
}
