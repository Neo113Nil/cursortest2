package defpackage;

import com.ybsdk.rconfig.d;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final /* synthetic */ class sui0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ sui0(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        String str = (String) obj;
        String str2 = (String) obj2;
        Exception exc = (Exception) obj3;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = dVar.d.c;
                if (!linkedHashMap.containsKey(str) || !jl40.l(linkedHashMap.get(str), str2)) {
                    linkedHashMap.put(str, str2);
                    trp0 trp0Var = trp0.a;
                    trp0.e(new sqp0(exc, str, false));
                    break;
                }
                break;
            default:
                LinkedHashMap linkedHashMap2 = dVar.d.b;
                if (!linkedHashMap2.containsKey(str) || !jl40.l(linkedHashMap2.get(str), str2)) {
                    linkedHashMap2.put(str, str2);
                    trp0 trp0Var2 = trp0.a;
                    trp0.e(new sqp0(exc, str, true));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
