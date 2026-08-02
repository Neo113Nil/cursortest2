package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nl6 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ axf s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl6(axf axfVar, int i) {
        super(1);
        this.r = i;
        this.s = axfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Unit unit;
        c3r c3rVar;
        switch (this.r) {
            case 0:
                wof wofVar = (wof) obj;
                dds d = this.s.d();
                if (d != null) {
                    d.c = wofVar;
                }
                return Unit.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.s.q.setValue(bool);
                return Unit.a;
            case 2:
                int i = ((hde) obj).a;
                obf obfVar = this.s.r;
                obfVar.getClass();
                if (i == 7) {
                    function1 = obfVar.a().a;
                } else {
                    if (i == 2) {
                        obfVar.a();
                    } else if (i == 6) {
                        obfVar.a();
                    } else if (i == 5) {
                        obfVar.a();
                    } else if (i == 3) {
                        obfVar.a();
                    } else if (i == 4) {
                        obfVar.a();
                    } else if (i != 1 && i != 0) {
                        xq0.q("invalid ImeAction");
                        return null;
                    }
                    function1 = null;
                }
                if (function1 != null) {
                    function1.invoke(obfVar);
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    if (i == 6) {
                        toc tocVar = obfVar.c;
                        if (tocVar == null) {
                            Intrinsics.j("focusManager");
                            throw null;
                        }
                        ((uoc) tocVar).e(1);
                    } else if (i == 5) {
                        toc tocVar2 = obfVar.c;
                        if (tocVar2 == null) {
                            Intrinsics.j("focusManager");
                            throw null;
                        }
                        ((uoc) tocVar2).e(2);
                    } else if (i == 7 && (c3rVar = obfVar.a) != null) {
                        ((nw7) c3rVar).a();
                    }
                }
                return Unit.a;
            default:
                ybs ybsVar = (ybs) obj;
                String str = ybsVar.a.b;
                axf axfVar = this.s;
                x6k x6kVar = axfVar.t;
                mn0 mn0Var = axfVar.j;
                if (!Intrinsics.d(str, mn0Var != null ? mn0Var.b : null)) {
                    axfVar.k.setValue(zrd.a);
                    if (((Boolean) x6kVar.getValue()).booleanValue()) {
                        x6kVar.setValue(Boolean.FALSE);
                    } else {
                        axfVar.s.setValue(Boolean.FALSE);
                    }
                }
                long j = rds.b;
                axfVar.f(j);
                axfVar.e(j);
                axfVar.u.invoke(ybsVar);
                xmn xmnVar = axfVar.b;
                ymn ymnVar = xmnVar.b;
                if (ymnVar != null) {
                    ymnVar.b(xmnVar, null);
                }
                return Unit.a;
        }
    }
}
