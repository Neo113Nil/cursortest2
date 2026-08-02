package defpackage;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class afp extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jx7 s;
    public final /* synthetic */ aqi t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afp(jx7 jx7Var, aqi aqiVar, int i) {
        super(1);
        this.r = i;
        this.s = jx7Var;
        this.t = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                float c = fma.c(((fma) obj).a);
                jx7 jx7Var = this.s;
                this.t.setValue(new hqe((jx7Var.L(c) << 32) | (jx7Var.L(fma.b(r0)) & 4294967295L)));
                return Unit.a;
            case 1:
                lna lnaVar = new lna(6, (Function0) obj);
                afp afpVar = new afp(this.s, this.t, 0);
                if (x4h.a()) {
                    return x4h.b(lnaVar, afpVar, Build.VERSION.SDK_INT == 28 ? og3.d : og3.e);
                }
                qq6.d("Magnifier is only supported on API level 28 and higher.");
                return null;
            case 2:
                float c2 = fma.c(((fma) obj).a);
                jx7 jx7Var2 = this.s;
                this.t.setValue(new hqe((jx7Var2.L(c2) << 32) | (jx7Var2.L(fma.b(r0)) & 4294967295L)));
                return Unit.a;
            default:
                lna lnaVar2 = new lna(8, (Function0) obj);
                afp afpVar2 = new afp(this.s, this.t, 2);
                if (x4h.a()) {
                    return x4h.b(lnaVar2, afpVar2, Build.VERSION.SDK_INT == 28 ? og3.d : og3.e);
                }
                qq6.d("Magnifier is only supported on API level 28 and higher.");
                return null;
        }
    }
}
