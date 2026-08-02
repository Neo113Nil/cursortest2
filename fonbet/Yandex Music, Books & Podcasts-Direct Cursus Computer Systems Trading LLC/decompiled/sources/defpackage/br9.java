package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class br9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ d89 s;
    public final /* synthetic */ xq9 t;
    public final /* synthetic */ xzb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br9(er9 er9Var, d89 d89Var, xq9 xq9Var, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.s = d89Var;
        this.t = xq9Var;
        this.u = xzbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                er9.H(this.s, this.t, this.u);
                break;
            case 1:
                szb szbVar = this.t.u;
                String str = null;
                String str2 = szbVar != null ? (String) szbVar.a(this.u) : null;
                if (str2 != null && (!StringsKt.U(str2))) {
                    str = str2;
                }
                this.s.setFontFeatureSettings(str);
                break;
            case 2:
                xq9 xq9Var = this.t;
                szb szbVar2 = xq9Var.X;
                xzb xzbVar = this.u;
                er9.Q(this.s, (om8) szbVar2.a(xzbVar), (pm8) xq9Var.Y.a(xzbVar));
                break;
            default:
                xq9 xq9Var2 = this.t;
                szb szbVar3 = xq9Var2.Z;
                xzb xzbVar2 = this.u;
                int intValue = ((Number) szbVar3.a(xzbVar2)).intValue();
                szb szbVar4 = xq9Var2.s;
                er9.R(this.s, intValue, szbVar4 != null ? (Integer) szbVar4.a(xzbVar2) : null);
                break;
        }
        return Unit.a;
    }
}
