package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.transform.exception.ValueNodeIsNotArrayException;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.transform.exception.ValueNodeIsNotMapException;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.transform.exception.ValueNodeNotFoundException;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.b;

/* loaded from: classes12.dex */
public final class tum {
    public final void a(sum sumVar, Object obj, fq90 fq90Var, String str) {
        if (sumVar instanceof num) {
            if (obj == null) {
                throw new ValueNodeNotFoundException(str);
            }
            List list = obj instanceof List ? (List) obj : null;
            if (list == null) {
                throw new ValueNodeIsNotArrayException(str);
            }
            int i = 0;
            for (Object obj2 : ((num) sumVar).a) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                sum sumVar2 = (sum) obj2;
                String str2 = str + "[" + i + "]";
                if (i >= list.size()) {
                    throw new ValueNodeNotFoundException(str2);
                }
                a(sumVar2, list.get(i), fq90Var, str2);
                i = i2;
            }
            return;
        }
        if (sumVar instanceof qum) {
            if (obj == null) {
                throw new ValueNodeNotFoundException(str);
            }
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                throw new ValueNodeIsNotMapException(str);
            }
            ((qum) sumVar).a.forEach(new th5(4, new rb0(str, map, this, fq90Var, 26)));
            return;
        }
        if (!(sumVar instanceof n231)) {
            if ((sumVar instanceof jfy0) || (sumVar instanceof rum) || sumVar.equals(pum.a)) {
                return;
            }
            w511.b();
            return;
        }
        if (obj == null) {
            n231 n231Var = (n231) sumVar;
            if (!n231Var.b) {
                throw new ValueNodeNotFoundException(str);
            }
            b bVar = n231Var.c;
            obj = bVar != null ? bia1.i(bVar) : null;
        }
        if (obj == null) {
            return;
        }
        bia1.h(fq90Var.a, ((n231) sumVar).a, obj);
    }
}
