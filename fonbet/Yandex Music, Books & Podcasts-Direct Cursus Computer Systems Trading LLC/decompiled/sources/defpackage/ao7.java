package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ao7 implements uyf {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ao7(czf czfVar) {
        this.a = 4;
        this.b = czfVar;
        rm4 rm4Var = rm4.c;
        Class<?> cls = czfVar.getClass();
        pm4 pm4Var = (pm4) rm4Var.a.get(cls);
        this.c = pm4Var == null ? rm4Var.a(cls, null) : pm4Var;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        switch (this.a) {
            case 0:
                yn7 yn7Var = (yn7) this.b;
                switch (zn7.a[kyfVar.ordinal()]) {
                    case 1:
                        yn7Var.onCreate(dzfVar);
                        break;
                    case 2:
                        yn7Var.onStart(dzfVar);
                        break;
                    case 3:
                        yn7Var.onResume(dzfVar);
                        break;
                    case 4:
                        yn7Var.onPause(dzfVar);
                        break;
                    case 5:
                        yn7Var.onStop(dzfVar);
                        break;
                    case 6:
                        yn7Var.onDestroy(dzfVar);
                        break;
                    case 7:
                        xq0.x("ON_ANY must not been send by anybody");
                        break;
                    default:
                        b6e.s();
                        break;
                }
                uyf uyfVar = (uyf) this.c;
                if (uyfVar != null) {
                    uyfVar.Q(dzfVar, kyfVar);
                    break;
                }
                break;
            case 1:
                x1e x1eVar = (x1e) this.c;
                if (kyfVar == ((kyf) this.b)) {
                    qvk qvkVar = x1eVar.l;
                    if (qvkVar != null) {
                        qvkVar.b();
                    }
                    x1eVar.l = null;
                    break;
                }
                break;
            case 2:
                a2e a2eVar = (a2e) this.c;
                if (kyfVar == ((kyf) this.b)) {
                    qvk qvkVar2 = a2eVar.h;
                    if (qvkVar2 != null) {
                        qvkVar2.b();
                    }
                    a2eVar.h = null;
                    break;
                }
                break;
            case 3:
                if (kyfVar == kyf.ON_START) {
                    ((nyf) this.b).d(this);
                    ((uoo) this.c).d();
                    break;
                }
                break;
            case 4:
                HashMap hashMap = ((pm4) this.c).a;
                List list = (List) hashMap.get(kyfVar);
                Object obj = this.b;
                pm4.a(list, dzfVar, kyfVar, obj);
                pm4.a((List) hashMap.get(kyf.ON_ANY), dzfVar, kyfVar, obj);
                break;
            case 5:
                if (kyfVar == ((kyf) this.b)) {
                    bsr bsrVar = (bsr) ((bx5) this.c).a.getValue();
                    bsrVar.getClass();
                    ssg.a(4, "ChatCenter", "invalidateUnreadCount", null);
                    bsrVar.d.a(Unit.a);
                    break;
                }
                break;
            default:
                c0v c0vVar = (c0v) this.c;
                if (kyfVar == ((kyf) this.b)) {
                    qvk qvkVar3 = c0vVar.g;
                    if (qvkVar3 != null) {
                        qvkVar3.b();
                    }
                    c0vVar.g = null;
                    break;
                }
                break;
        }
    }

    public ao7(yn7 yn7Var, uyf uyfVar) {
        this.a = 0;
        yn7Var.getClass();
        this.b = yn7Var;
        this.c = uyfVar;
    }

    public /* synthetic */ ao7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
