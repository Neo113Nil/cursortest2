package bo.app;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class f4 extends c7 {
    public static final String k = BrazeLogger.getBrazeLogTag((Class<?>) f4.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(q5 q5Var) {
        super(c9.f, q5Var);
        q5Var.getClass();
    }

    public final void a(long j, id idVar, List list) {
        l1 l1Var;
        l1 l1Var2;
        id idVar2 = idVar;
        d9 d9Var = idVar2 != null ? idVar2.a : null;
        l4 l4Var = d9Var instanceof l4 ? (l4) d9Var : null;
        if (l4Var == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            id idVar3 = (id) it.next();
            d9 d9Var2 = idVar3.a;
            l4 l4Var2 = d9Var2 instanceof l4 ? (l4) d9Var2 : null;
            if (l4Var2 != null && ((l4Var.n == null || l4Var2.n == null) && (((l1Var = l4Var.o) == null || l1Var.b) && ((l1Var2 = l4Var2.o) == null || l1Var2.b)))) {
                lb lbVar = l4Var2.l;
                Boolean bool = (l4Var.l.b() || lbVar.b()) ? Boolean.TRUE : null;
                lb lbVar2 = l4Var.l;
                jb jbVar = lbVar2.c;
                if (jbVar == null) {
                    jbVar = null;
                }
                jb jbVar2 = lbVar.c;
                if (jbVar2 != null) {
                    jbVar = jbVar2;
                }
                String str = lbVar2.a;
                if (str == null) {
                    str = null;
                }
                String str2 = lbVar.a;
                if (str2 != null) {
                    str = str2;
                }
                l4Var.l = new lb(str, bool, jbVar);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, k, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new q$$ExternalSyntheticLambda1(idVar3, j, idVar2, 1), 14, (Object) null);
                idVar3.a(j, jd.BATCHED);
                idVar2 = idVar;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(13, l4Var2, idVar2), 7, (Object) null);
            }
        }
    }

    @Override // bo.app.c7
    public final void a(long j) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jd jdVar = ((id) obj).d;
            jdVar.getClass();
            if (jdVar == jd.PENDING_START || jdVar == jd.PENDING_RETRY) {
                arrayList2.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new e4());
        int size2 = sortedWith.size();
        if (size2 < 2) {
            return;
        }
        a(j, (id) CollectionsKt.first(sortedWith), sortedWith.subList(1, size2));
    }

    public static final String a(id idVar, long j, id idVar2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Batched request ", idVar.a(j), " and combined into ", idVar2.a(j));
    }

    public static final String a(l4 l4Var, id idVar) {
        return "Could not merge other request: " + l4Var + " into parent: " + idVar;
    }
}
