package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class sq5 extends gw3 {
    public final /* synthetic */ int a;
    public final Object b;

    public sq5(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new q7w();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    @Override // defpackage.gw3
    public final yx3 b(c3x c3xVar) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    yx3 b = ((gw3) it.next()).b(c3xVar);
                    if (b != null) {
                        break;
                    }
                }
                break;
            case 1:
                if (!((ArrayList) this.b).contains(Integer.valueOf(((bx3) c3xVar).j.length()))) {
                    break;
                }
                break;
            default:
                ew3 ew3Var = (ew3) c3xVar;
                q7w q7wVar = (q7w) this.b;
                q7wVar.getClass();
                Calendar calendar = Calendar.getInstance();
                long j = q7wVar.a;
                calendar.setTime(new Date(j));
                int i = calendar.get(1) % 100;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(new Date(j));
                int i2 = calendar2.get(2) + 1;
                Integer q0 = StringsKt.q0(ew3Var.k);
                int intValue = q0 != null ? q0.intValue() : 0;
                if (intValue >= i && intValue <= i + 50) {
                    Integer q02 = StringsKt.q0(ew3Var.j);
                    int intValue2 = q02 != null ? q02.intValue() : 0;
                    if (intValue2 <= 12 && intValue2 >= 1 && (intValue != i || intValue2 >= i2)) {
                    }
                }
                break;
        }
        return yx3.b;
    }

    public sq5(ArrayList arrayList) {
        this.a = 1;
        this.b = arrayList;
    }
}
