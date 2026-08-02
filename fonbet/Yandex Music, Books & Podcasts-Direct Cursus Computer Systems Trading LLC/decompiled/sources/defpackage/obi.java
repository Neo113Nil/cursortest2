package defpackage;

import androidx.compose.material.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class obi extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obi(long j, Function0 function0, boolean z, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = j;
        this.t = function0;
        this.u = z;
        this.v = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                sbi.c(this.s, this.t, this.u, (hq5) obj, rvf.R(this.v | 1));
                break;
            default:
                ((Number) obj2).intValue();
                a.b(this.s, this.t, this.u, (hq5) obj, rvf.R(this.v | 1));
                break;
        }
        return Unit.a;
    }
}
