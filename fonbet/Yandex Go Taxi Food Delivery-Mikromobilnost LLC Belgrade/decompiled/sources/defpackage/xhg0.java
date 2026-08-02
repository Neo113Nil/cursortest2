package defpackage;

import com.yandex.quark.webchat.js.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class xhg0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ uhg0 c;

    public /* synthetic */ xhg0(d dVar, uhg0 uhg0Var, int i) {
        this.a = i;
        this.b = dVar;
        this.c = uhg0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        LinkedHashMap linkedHashMap;
        Object value2;
        LinkedHashMap linkedHashMap2;
        Object value3;
        LinkedHashMap linkedHashMap3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        uhg0 uhg0Var = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                Set set = (Set) obj;
                r0 r0Var = dVar.D;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    linkedHashMap.put(uhg0Var, set);
                } while (!r0Var.k(value, linkedHashMap));
            case 1:
                List list = (List) obj;
                r0 r0Var2 = dVar.A;
                do {
                    value2 = r0Var2.getValue();
                    linkedHashMap2 = new LinkedHashMap((Map) value2);
                    linkedHashMap2.put(uhg0Var, list);
                } while (!r0Var2.k(value2, linkedHashMap2));
            default:
                Set set2 = (Set) obj;
                r0 r0Var3 = dVar.C;
                do {
                    value3 = r0Var3.getValue();
                    linkedHashMap3 = new LinkedHashMap((Map) value3);
                    linkedHashMap3.put(uhg0Var, set2);
                } while (!r0Var3.k(value3, linkedHashMap3));
        }
        return zy11Var;
    }
}
