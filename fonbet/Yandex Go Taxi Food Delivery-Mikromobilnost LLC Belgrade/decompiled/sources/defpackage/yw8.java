package defpackage;

import com.yandex.go.summary.ui.model.common.tooltip.TooltipAlignment;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class yw8 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ yw8(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        wwy wwyVar = wwy.a;
        vwy vwyVar = vwy.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                ywy ywyVar = (ywy) obj;
                if (!jl40.l(ywyVar, vwyVar)) {
                    if (!jl40.l(ywyVar, wwyVar)) {
                        if (!(ywyVar instanceof xwy)) {
                            w511.b();
                            break;
                        } else {
                            oz40Var.setValue(((xwy) ywyVar).a);
                        }
                    }
                } else {
                    oz40Var.setValue(null);
                }
                break;
            case 1:
                oz40Var.setValue(Boolean.valueOf(((Number) obj).intValue() == 2));
                break;
            case 2:
                ywy ywyVar2 = (ywy) obj;
                if (!jl40.l(ywyVar2, vwyVar)) {
                    if (!jl40.l(ywyVar2, wwyVar)) {
                        if (!(ywyVar2 instanceof xwy)) {
                            w511.b();
                            break;
                        } else {
                            oz40Var.setValue(((xwy) ywyVar2).a);
                        }
                    }
                } else {
                    oz40Var.setValue(null);
                }
                break;
            case 3:
                ywy ywyVar3 = (ywy) obj;
                if (!jl40.l(ywyVar3, vwyVar) && !(ywyVar3 instanceof xwy)) {
                    if (!jl40.l(ywyVar3, wwyVar)) {
                        w511.b();
                        break;
                    }
                } else {
                    oz40Var.setValue(ywyVar3);
                }
                break;
            case 4:
                oz40Var.setValue((TooltipAlignment) obj);
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                oz40Var.setValue(bool);
                break;
            default:
                ((Boolean) obj).booleanValue();
                oz40Var.setValue(Boolean.TRUE);
                break;
        }
        return zy11Var;
    }
}
