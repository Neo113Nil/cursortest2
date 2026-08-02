package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class an9 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dg0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an9(dg0 dg0Var, int i) {
        super(0);
        this.r = i;
        this.s = dg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s;
            default:
                try {
                    this.s.close();
                } catch (IOException unused) {
                }
                return Unit.a;
        }
    }
}
