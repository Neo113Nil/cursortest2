package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class u9m implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ u9m(ArrayList arrayList, oz40 oz40Var, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = oz40Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.c;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                g8w g8wVar = (g8w) obj;
                if (g8wVar instanceof s9m) {
                    arrayList.add(g8wVar);
                } else if (g8wVar instanceof t9m) {
                    arrayList.remove(((t9m) g8wVar).a);
                } else if (g8wVar instanceof r9m) {
                    arrayList.remove(((r9m) g8wVar).a);
                }
                oz40Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                g8w g8wVar2 = (g8w) obj;
                if (g8wVar2 instanceof ztr) {
                    arrayList.add(g8wVar2);
                } else if (g8wVar2 instanceof aur) {
                    arrayList.remove(((aur) g8wVar2).a);
                }
                oz40Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                g8w g8wVar3 = (g8w) obj;
                if (g8wVar3 instanceof jxe0) {
                    arrayList.add(g8wVar3);
                } else if (g8wVar3 instanceof kxe0) {
                    arrayList.remove(((kxe0) g8wVar3).a);
                } else if (g8wVar3 instanceof ixe0) {
                    arrayList.remove(((ixe0) g8wVar3).a);
                }
                oz40Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return zy11Var;
    }
}
