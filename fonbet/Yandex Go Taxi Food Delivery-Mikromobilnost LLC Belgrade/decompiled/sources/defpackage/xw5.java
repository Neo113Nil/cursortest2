package defpackage;

import com.yandex.xplat.common.JSONItemKind;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class xw5 {
    public final bx5 a;

    public xw5(bx5 bx5Var) {
        this.a = bx5Var;
    }

    public static avv a(yuv yuvVar) {
        String str;
        String str2;
        Map map = yuvVar.a.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            y3x y3xVar = (y3x) entry.getValue();
            ktu0 ktu0Var = y3xVar.a == JSONItemKind.string ? (ktu0) y3xVar : null;
            if (ktu0Var != null && (str2 = ktu0Var.b) != null) {
                str = str2;
            }
            linkedHashMap.put(key, str);
        }
        q7w q7wVar = yuvVar.b;
        if (q7wVar != null) {
            String str3 = q7wVar.b;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = q7wVar.a;
            joz0 joz0Var = new joz0(str3, str4 != null ? str4 : "");
            s89 s89Var = yuvVar.d;
            if (s89Var != null) {
                jly jlyVar = new jly(s89Var.d, s89Var.c, s89Var.b, s89Var.a);
                g831 g831Var = yuvVar.c;
                if (g831Var != null) {
                    return new avv(linkedHashMap, joz0Var, jlyVar, new zuv(g831Var.b, g831Var.a, g831Var.c));
                }
            }
        }
        return null;
    }
}
