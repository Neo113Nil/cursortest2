package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class t24 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ t24(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(obj);
                break;
            case 1:
                tlsVar.invoke(new sr5((int) ((Number) obj).floatValue()));
                break;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                if (tlsVar != null) {
                    tlsVar.invoke(new Float(floatValue));
                    break;
                }
                break;
            case 3:
                tlsVar.invoke(new Integer(((Number) obj).intValue()));
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    tlsVar.invoke(qd31.a);
                    break;
                }
                break;
            case 5:
                tlsVar.invoke((dny) obj);
                break;
            case 6:
                if (((dtr0) obj).a == -2) {
                    tlsVar.invoke(p700.a);
                    break;
                }
                break;
            case 7:
                tlsVar.invoke(new qg00(((Number) obj).intValue()));
                break;
            case 8:
                tlsVar.invoke(new sg00(((Number) obj).intValue()));
                break;
            case 9:
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((za31) it.next()).a.e()) {
                            break;
                        }
                    }
                }
                Object invoke = tlsVar.invoke(continuation);
                if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                tlsVar.invoke(obj);
                break;
            case 11:
                tlsVar.invoke(obj);
                break;
            case 12:
                tlsVar.invoke((pv0) obj);
                break;
            case 13:
                tlsVar.invoke((v320) obj);
                break;
            case 14:
                tlsVar.invoke(new Integer((int) ((Number) obj).floatValue()));
                break;
            case 15:
                tlsVar.invoke(obj);
                break;
            case 16:
                tlsVar.invoke(obj);
                break;
            case 17:
                tlsVar.invoke(new odv0(((Number) obj).intValue()));
                break;
            case 18:
                tlsVar.invoke(new pdv0((ch6) obj));
                break;
            case 19:
                tlsVar.invoke(new ycu(((Boolean) obj).booleanValue()));
                break;
            case 20:
                tlsVar.invoke(new udx0(((Boolean) obj).booleanValue()));
                break;
            case 21:
                tlsVar.invoke(new Long(((Number) obj).longValue()));
                break;
            case 22:
                tlsVar.invoke((qnv) obj);
                break;
            case 23:
                tlsVar.invoke((kt11) obj);
                break;
            case 24:
                tlsVar.invoke(new xh31((int) ((Number) obj).floatValue()));
                break;
            default:
                int i2 = ((dtr0) obj).a;
                tlsVar.invoke(h341.a);
                break;
        }
        return zy11Var;
    }
}
