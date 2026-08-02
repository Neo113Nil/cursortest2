package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lka7;", "", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public abstract class ka7 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0081 -> B:13:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0084 -> B:13:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, mme mmeVar, cg6 cg6Var) {
        ha7 ha7Var;
        int i;
        List list2;
        xqn xqnVar;
        Iterator it;
        Throwable th;
        if (cg6Var instanceof ha7) {
            ha7Var = (ha7) cg6Var;
            int i2 = ha7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ha7Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ha7Var.l;
                nm6 nm6Var = nm6.a;
                i = ha7Var.m;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    ja7 ja7Var = new ja7(list, q, null);
                    ha7Var.j = q;
                    ha7Var.m = 1;
                    if (((blq) mmeVar).a(ja7Var, ha7Var) == nm6Var) {
                        return nm6Var;
                    }
                    list2 = q;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = ha7Var.k;
                        xqnVar = (xqn) ha7Var.j;
                        try {
                            qgg.h0(obj);
                        } catch (Throwable th2) {
                            Object obj2 = xqnVar.a;
                            if (obj2 == null) {
                                xqnVar.a = th2;
                            } else {
                                fob.a((Throwable) obj2, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            ha7Var.j = xqnVar;
                            ha7Var.k = it;
                            ha7Var.m = 2;
                            if (function1.invoke(ha7Var) == nm6Var) {
                                return nm6Var;
                            }
                        }
                        th = (Throwable) xqnVar.a;
                        if (th == null) {
                            return Unit.a;
                        }
                        throw th;
                    }
                    list2 = (List) ha7Var.j;
                    qgg.h0(obj);
                }
                xqnVar = new xqn();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) xqnVar.a;
                if (th == null) {
                }
            }
        }
        ha7Var = new ha7(cg6Var);
        Object obj3 = ha7Var.l;
        nm6 nm6Var2 = nm6.a;
        i = ha7Var.m;
        if (i != 0) {
        }
        xqnVar = new xqn();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) xqnVar.a;
        if (th == null) {
        }
    }
}
